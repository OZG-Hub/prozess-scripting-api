package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import static de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1.MULTIPLE_FILE;

import java.io.IOException;
import java.io.Serial;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldValueV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.content.BinaryContentV1;
import jakarta.ws.rs.ext.Provider;

@Provider
public class FormFieldV1Deserializer extends StdDeserializer<FormFieldV1>
{
  @Serial
  private static final long serialVersionUID = 1L;

  private static final ObjectMapper OBJECT_MAPPER;
  private static final DateTimeFormatter LOCAL_DATE_FORMATTER = DateTimeFormatter.ofPattern("dd.MM.yyyy");
  private static final DateTimeFormatter LOCAL_TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm");

  static
  {
    OBJECT_MAPPER = new ObjectMapper();
    OBJECT_MAPPER.disable(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES);
    OBJECT_MAPPER.registerModule(new JavaTimeModule());
  }

  public FormFieldV1Deserializer()
  {
    super(FormFieldV1.class);
  }

  @Override
  public FormFieldV1 deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException
  {
    ObjectMapper mapper = (ObjectMapper) jp.getCodec();
    ObjectNode obj = mapper.readTree(jp);
    JsonNode valueNode = obj.remove("value");

    JsonParser parser = mapper.treeAsTokens(obj);
    parser.nextToken();
    FormFieldV1 result = ctxt.readValue(parser, FormFieldV1Deser.class);

    if (valueNode == null || valueNode.isNull())
    {
      return result;
    }

    FormFieldValueV1 formFieldValue = tryDeserializeFormFieldValue(mapper, valueNode);
    if (formFieldValue != null)
    {
      result.setValue(formFieldValue);
      return result;
    }

    Object value = mapValueToType(valueNode, result.getType());
    result.setValue(value);
    return result;
  }

  private FormFieldValueV1 tryDeserializeFormFieldValue(ObjectMapper mapper, JsonNode valueNode)
  {
    if (!(valueNode instanceof ObjectNode node))
    {
      return null;
    }

    if (!node.has(FormFieldValueSerializerV1.KEY_TYPE))
    {
      return null;
    }

    try
    {
      return mapper.treeToValue(node, FormFieldValueV1.class);
    }
    catch (JsonProcessingException e)
    {
      return null;
    }
  }

  private Object mapValueToType(JsonNode valueNode, FieldTypeV1 fieldType)
  {
    if (fieldType == MULTIPLE_FILE && valueNode.isArray())
    {
      return deserializeMultipleFiles(valueNode);
    }

    for (Class<?> valueClass : fieldType.getValueClasses())
    {
      Object result = tryMapToType(valueNode, valueClass);
      if (result != null)
      {
        return result;
      }
    }

    return toObject(valueNode);
  }

  private Object tryMapToType(JsonNode valueNode, Class<?> valueClass)
  {
    try
    {
      if (valueClass == LocalDate.class)
      {
        return tryDeserializeLocalDate(valueNode);
      }
      if (valueClass == LocalDateTime.class)
      {
        return tryDeserializeLocalTime(valueNode);
      }
      if (valueClass == BigDecimal.class)
      {
        return tryDeserializeBigDecimal(valueNode);
      }

      return OBJECT_MAPPER.treeToValue(valueNode, valueClass);
    }
    catch (JsonProcessingException e)
    {
      return null;
    }
  }

  private LocalDate tryDeserializeLocalDate(JsonNode valueNode) throws JsonProcessingException
  {
    if (valueNode.isLong())
    {
      return Instant.ofEpochMilli(valueNode.asLong()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    if (valueNode.isInt())
    {
      return Instant.ofEpochMilli(valueNode.asInt()).atZone(ZoneId.systemDefault()).toLocalDate();
    }

    if (valueNode.isTextual())
    {
      return parseLocalDate(valueNode.textValue());
    }

    return OBJECT_MAPPER.treeToValue(valueNode, LocalDate.class);
  }

  private static LocalDate parseLocalDate(String str)
  {
    try
    {
      return LocalDate.parse(str, LOCAL_DATE_FORMATTER);
    }
    catch (DateTimeParseException e)
    {
      return null;
    }
  }

  private LocalTime tryDeserializeLocalTime(JsonNode valueNode) throws JsonProcessingException
  {
    if (valueNode.isLong())
    {
      return Instant.ofEpochMilli(valueNode.asLong()).atZone(ZoneId.systemDefault()).toLocalTime();
    }

    if (valueNode.isInt())
    {
      return Instant.ofEpochMilli(valueNode.asInt()).atZone(ZoneId.systemDefault()).toLocalTime();
    }

    if (valueNode.isTextual())
    {
      return parseLocalTime(valueNode.textValue());
    }

    return OBJECT_MAPPER.treeToValue(valueNode, LocalTime.class);
  }

  private static LocalTime parseLocalTime(String str)
  {
    try
    {
      return LocalTime.parse(str, LOCAL_TIME_FORMATTER);
    }
    catch (DateTimeParseException e)
    {
      return null;
    }
  }

  private BigDecimal tryDeserializeBigDecimal(JsonNode valueNode) throws JsonProcessingException
  {
    try
    {
      return OBJECT_MAPPER.treeToValue(valueNode, BigDecimal.class).setScale(2, RoundingMode.HALF_UP);
    }
    catch (Exception ignored)
    {
      return null;
    }
  }

  private Object toObject(JsonNode valueNode)
  {
    try
    {
      return OBJECT_MAPPER.treeToValue(valueNode, Object.class);
    }
    catch (JsonProcessingException e)
    {
      return null;
    }
  }

  private Object tryDeserializeBinaryContent(JsonNode valueNode)
  {
    if (valueNode == null)
    {
      return null;
    }

    if (valueNode instanceof ObjectNode obj)
    {
      return deserializeBinaryContent(obj);
    }

    return null;
  }

  private List<BinaryContentV1> deserializeMultipleFiles(JsonNode valueNode)
  {
    ArrayNode arrayNode = (ArrayNode) valueNode;
    List<BinaryContentV1> result = new ArrayList<>();

    for (int i = 0; i < arrayNode.size(); i++)
    {
      JsonNode node = arrayNode.get(i);
      Object item = tryDeserializeBinaryContent(node);
      if (item != null)
      {
        result.add((BinaryContentV1) item);
      }
    }

    return result;
  }

  private BinaryContentV1 deserializeBinaryContent(ObjectNode obj)
  {
    try
    {
      return OBJECT_MAPPER.convertValue(obj, BinaryContentV1.class);
    }
    catch (Exception e)
    {
      return null;
    }
  }

  @JsonDeserialize
  public static class FormFieldV1Deser extends FormFieldV1
  {
  }
}

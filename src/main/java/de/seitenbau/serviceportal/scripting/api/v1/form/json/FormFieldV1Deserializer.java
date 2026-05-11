package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import static de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1.FILE;
import static de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1.GDIK_MAP;
import static de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1.GEO_MAP;
import static de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1.MULTIPLE_FILE;

import java.io.IOException;
import java.io.Serial;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Date;
import java.util.List;
import java.util.Set;

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
  private static final Set<FieldTypeV1>
      BINARY_CONTENT_VALUE_TYPES = Set.of(FILE, GEO_MAP, GDIK_MAP, MULTIPLE_FILE);

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

    if (valueNode == null)
    {
      return result;
    }

    if (BINARY_CONTENT_VALUE_TYPES.contains(result.getType()))
    {
      FormFieldValueV1 formFieldValue = tryDeserializeFormFieldValue(mapper, valueNode);
      if (formFieldValue != null)
      {
        result.setValue(formFieldValue);
        return result;
      }
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

    if (!node.has("type"))
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
    if (valueNode == null)
    {
      return null;
    }

    if (fieldType == MULTIPLE_FILE && valueNode.isArray())
    {
      return deserializeMultipleFiles(valueNode);
    }

    if (fieldType == null || fieldType.getValueClasses().isEmpty())
    {
      return toObject(valueNode);
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
    if (valueClass == Date.class)
    {
      return tryDeserializeDate(valueNode);
    }
    if (valueClass == BinaryContentV1.class)
    {
      return tryDeserializeBinaryContent(valueNode);
    }
    if (valueClass == BigDecimal.class)
    {
      return tryDeserializeBigDecimal(valueNode);
    }
    if (valueClass == String.class)
    {
      return toString(valueNode);
    }

    try
    {
      return OBJECT_MAPPER.treeToValue(valueNode, valueClass);
    }
    catch (JsonProcessingException e)
    {
      return null;
    }
  }

  private BigDecimal tryDeserializeBigDecimal(JsonNode valueNode)
  {
    if (valueNode.isNumber())
    {
      return valueNode.decimalValue().setScale(2);
    }

    if (valueNode.isTextual())
    {
      try
      {
        return new BigDecimal(valueNode.asText()).setScale(2);
      }
      catch (NumberFormatException e)
      {
        return null;
      }
    }

    return null;
  }

  private Date tryDeserializeDate(JsonNode valueNode)
  {
    if (valueNode.isLong())
    {
      return new Date(valueNode.asLong());
    }

    if (valueNode.isInt())
    {
      return new Date(valueNode.asInt() & 0xFFFFFFFFL);
    }

    if (!valueNode.isTextual())
    {
      return null;
    }

    String text = valueNode.asText();
    Long epochMilli = parseDateTime(text);
    if (epochMilli != null)
    {
      return new Date(epochMilli);
    }

    return parseDate(text);
  }

  private Long parseDateTime(String text)
  {
    try
    {
      return LocalDateTime.parse(text)
          .atZone(ZoneId.systemDefault())
          .toInstant()
          .toEpochMilli();
    }
    catch (Exception e)
    {
      return null;
    }
  }

  private Date parseDate(String text)
  {
    try
    {
      long epochMilli = LocalDate.parse(text)
          .atStartOfDay(ZoneId.systemDefault())
          .toInstant()
          .toEpochMilli();
      return new Date(epochMilli);
    }
    catch (Exception e)
    {
      return null;
    }
  }

  private String toString(JsonNode valueNode)
  {
    if (valueNode == null || valueNode.isNull())
    {
      return null;
    }
    return valueNode.asText();
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

    if (valueNode.isArray())
    {
      return deserializeMultipleFiles(valueNode);
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
    String key = getTextOrNull(obj, "key");
    String uploadedFilename = getTextOrNull(obj, "uploadedFilename");
    String label = getTextOrNull(obj, "label");
    String mimetype = getTextOrNull(obj, "mimetype");
    byte[] data = getBinaryData(obj, "data");

    return BinaryContentV1.builder()
        .key(key)
        .uploadedFilename(uploadedFilename)
        .label(label)
        .mimetype(mimetype)
        .data(data)
        .build();
  }

  private String getTextOrNull(ObjectNode obj, String fieldName)
  {
    JsonNode node = obj.get(fieldName);
    return node != null ? node.asText() : null;
  }

  private byte[] getBinaryData(ObjectNode obj, String fieldName)
  {
    JsonNode dataNode = obj.get(fieldName);
    if (dataNode == null)
    {
      return null;
    }

    if (dataNode.isTextual())
    {
      return decodeBase64OrFallback(dataNode);
    }

    if (dataNode.isBinary())
    {
      try
      {
        return dataNode.binaryValue();
      }
      catch (IOException e)
      {
        return null;
      }
    }

    return null;
  }

  private byte[] decodeBase64OrFallback(JsonNode dataNode)
  {
    try
    {
      return Base64.getDecoder().decode(dataNode.asText());
    }
    catch (IllegalArgumentException e)
    {
      return dataNode.asText().getBytes(StandardCharsets.UTF_8);
    }
  }

  @JsonDeserialize
  public static class FormFieldV1Deser extends FormFieldV1
  {
  }
}

package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import jakarta.ws.rs.ext.Provider;

/**
 * Jackson Serializer, der den Typ des Werts explizit ins JSON serialisiert.
 *
 * @see DeserializerWithTypeInfo
 */
@Provider
public class SerializerWithTypeInfo extends JsonSerializer<Object>
{
  @Override
  public void serialize(
      Object bean,
      JsonGenerator jgen,
      SerializerProvider provider)
      throws IOException
  {
    if (bean instanceof UnknownTypeValue)
    {
      jgen.writeObject(bean);
      return;
    }
    jgen.writeStartObject();
    if (bean != null)
    {
      String className = bean.getClass().getName();
      jgen.writeStringField("type", className);
    }
    else
    {
      jgen.writeStringField("type", null);
    }
    jgen.writeObjectField("value", bean);
    jgen.writeEndObject();
  }
}

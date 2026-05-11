package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldValueV1;
import jakarta.ws.rs.ext.Provider;

@Provider
public class FormFieldValueSerializerV1 extends JsonSerializer<FormFieldValueV1>
{
  public static final String KEY_VALUE = "value";
  public static final String KEY_ADDITIONAL_INFO = "additionalInfo";

  @Override
  public void serialize(
      FormFieldValueV1 value,
      JsonGenerator jgen,
      SerializerProvider provider)
      throws IOException
  {
    jgen.writeObject(value);
  }

  @Override
  public void serializeWithType(
      FormFieldValueV1 value,
      JsonGenerator jgen,
      SerializerProvider provider,
      TypeSerializer typeSer)
      throws IOException
  {
    typeSer.writeTypePrefix(jgen, typeSer.typeId(value, JsonToken.START_OBJECT));
    jgen.writeObjectField(KEY_VALUE, value.getValue());
    jgen.writeObjectField(KEY_ADDITIONAL_INFO, value.getAdditionalInfo());
    typeSer.writeTypeSuffix(jgen, typeSer.typeId(value, JsonToken.START_OBJECT));
  }
}

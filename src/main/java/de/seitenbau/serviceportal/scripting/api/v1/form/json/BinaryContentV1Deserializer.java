package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import de.seitenbau.serviceportal.scripting.api.v1.form.content.BinaryContentV1;
import jakarta.ws.rs.ext.Provider;

@Provider
public class BinaryContentV1Deserializer extends StdDeserializer<BinaryContentV1>
{
  private static StdDeserializer<BinaryContentV1> delegate;

  public BinaryContentV1Deserializer()
  {
    super(BinaryContentV1.class);
  }

  public static void setDelegate(StdDeserializer<BinaryContentV1> delegate)
  {
    BinaryContentV1Deserializer.delegate = delegate;
  }

  @Override
  public BinaryContentV1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException
  {
    if (delegate != null)
    {
      return delegate.deserialize(jsonParser, deserializationContext);
    }

    ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
    JsonNode node = mapper.readTree(jsonParser);

    return mapper.treeToValue(node, BinaryContentV1.class);
  }
}

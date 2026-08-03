package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import de.seitenbau.serviceportal.scripting.api.v1.form.content.BinaryContentV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.content.NextcloudBinaryContentV1;
import jakarta.ws.rs.ext.Provider;

@Provider
public class BinaryContentV1DeserializerDelegate extends StdDeserializer<BinaryContentV1>
{
  public BinaryContentV1DeserializerDelegate()
  {
    super(BinaryContentV1.class);
  }

  @Override
  public BinaryContentV1 deserialize(JsonParser jsonParser, DeserializationContext deserializationContext)
      throws IOException
  {
    ObjectMapper mapper = (ObjectMapper) jsonParser.getCodec();
    JsonNode node = mapper.readTree(jsonParser);
    return node.has("infix") && node.has("endpointFolder") && node.has("authentication")
        ? mapper.treeToValue(node, NextcloudBinaryContentV1.class)
        : mapper.treeToValue(node, BinaryContentV1.class);
  }
}

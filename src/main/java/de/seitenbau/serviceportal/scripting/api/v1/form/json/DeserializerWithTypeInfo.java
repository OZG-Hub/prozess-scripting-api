package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.core.ObjectCodec;
import com.fasterxml.jackson.core.TreeNode;
import com.fasterxml.jackson.core.io.SerializedString;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.jsontype.TypeDeserializer;

import jakarta.ws.rs.ext.Provider;

/**
 * Jackson Deserializer, der den Typ und den Wert ausliest und auswertet.
 *
 * @see SerializerWithTypeInfo
 */
@Provider
public class DeserializerWithTypeInfo extends JsonDeserializer<Object>
{
  protected static final SerializedString TYPE_STRING = new SerializedString("type");

  protected static final SerializedString VALUE_STRING = new SerializedString("value");

  private static final List<String> TYPE_DENY_LIST = Arrays.asList(
      "org.apache.commons.collections.functors.InvokerTransformer",
      "org.apache.commons.collections.functors.InstantiateTransformer",
      "org.apache.commons.collections4.functors.InvokerTransformer",
      "org.apache.commons.collections4.functors.InstantiateTransformer",
      "org.codehaus.groovy.runtime.ConvertedClosure",
      "org.codehaus.groovy.runtime.MethodClosure",
      "org.springframework.beans.factory.ObjectFactory",
      "com.sun.org.apache.xalan.internal.xsltc.trax.TemplatesImpl",
      "org.apache.xalan.xsltc.trax.TemplatesImpl",
      "com.sun.rowset.JdbcRowSetImpl",
      "java.util.logging.FileHandler",
      "java.rmi.server.UnicastRemoteObject",
      "org.springframework.beans.factory.config.PropertyPathFactoryBean",
      "org.apache.tomcat.dbcp.dbcp2.BasicDataSource",
      "com.sun.org.apache.bcel.internal.util.ClassLoader",
      "org.hibernate.jmx.StatisticsService",
      "org.apache.ibatis.datasource.jndi.JndiDataSourceFactory",
      "org.apache.ibatis.parsing.XPathParser",
      "oracle.jdbc.connector.OracleManagedConnectionFactory",
      "jodd.db.connection.DataSourceConnectionProvider",
      "oracle.jdbc.rowset.OracleJDBCRowSet"
  );

  @Override
  public Object deserializeWithType(
      JsonParser jp,
      DeserializationContext ctxt,
      TypeDeserializer typeDeserializer)
  {
    throw new UnsupportedOperationException();
  }

  @Override
  public Object deserialize(
      JsonParser jp,
      DeserializationContext ctxt)
      throws IOException
  {
    if (!jp.nextFieldName(TYPE_STRING))
    {
      throw new IllegalArgumentException(
          "Erwarteter Name war %s, war: %s".formatted(TYPE_STRING, jp.currentName()));
    }
    String type = jp.nextTextValue();

    validateType(type);

    if (!jp.nextFieldName(VALUE_STRING))
    {
      throw new IllegalArgumentException(
          "Erwarteter Name war %s, war: %s".formatted(VALUE_STRING, jp.currentName()));
    }

    jp.nextToken();
    Class<?> typeAsClass = getClassForType(type);

    if (typeAsClass == null)
    {
      ObjectCodec objectCodec = jp.getCodec();
      TreeNode treeNode = objectCodec.readTree(jp);
      if (JsonToken.END_OBJECT.equals(jp.nextToken()))
      {
        throw new IllegalStateException("End Object expected");
      }
      return new UnknownTypeValue(type, treeNode);
    }

    Object value = ctxt.readValue(jp, typeAsClass);
    if (JsonToken.END_OBJECT.equals(jp.nextToken()))
    {
      throw new IllegalStateException("End Object expected");
    }

    return value;
  }

  private void validateType(String type)
  {
    if (TYPE_DENY_LIST.contains(type))
    {
      throw new IllegalArgumentException("Cannot deserialize deny-listed type.");
    }
  }

  public Class<?> getClassForType(String type)
  {
    if (type == null)
    {
      return null;
    }

    try
    {
      return Class.forName(type);
    }
    catch (ClassNotFoundException | RuntimeException e)
    {
      return null;
    }
  }
}

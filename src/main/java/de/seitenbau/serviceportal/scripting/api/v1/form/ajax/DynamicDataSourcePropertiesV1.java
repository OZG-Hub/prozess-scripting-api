package de.seitenbau.serviceportal.scripting.api.v1.form.ajax;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    property = "@type",
    defaultImpl = ExternalDataSourcePropertiesV1.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value = ExternalDataSourcePropertiesV1.class),
    @JsonSubTypes.Type(value = ScriptSourcePropertiesV1.class)
})
public interface DynamicDataSourcePropertiesV1 extends Cloneable
{
  /**
   * Erstellt eine Kopie des aktuellen Objekts.
   *
   * @return Das geklonte Objekt
   */
  DynamicDataSourcePropertiesV1 clone();
}

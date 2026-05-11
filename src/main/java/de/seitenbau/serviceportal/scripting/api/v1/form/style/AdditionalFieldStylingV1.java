package de.seitenbau.serviceportal.scripting.api.v1.form.style;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Informationen zum Styling von Feldern.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = KfzKennzeichenStylingV1.class, name = "KfzKennzeichenStyling")
})
public interface AdditionalFieldStylingV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AdditionalFieldStylingV1 clone();
}

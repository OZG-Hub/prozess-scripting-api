package de.seitenbau.serviceportal.scripting.api.v1.form.auth;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface für alle Authentifizierungsmöglichkeiten bei der Kommunikation mit externen Servern.
 * Zum Beispiel für die externe Dateiablage (Speichern von hochgeladenen Dateien außerhalb des Portals).
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicAuthAuthenticationConfigV1.class, name = "BasicAuth"),
    @JsonSubTypes.Type(value = KeystoreAuthenticationConfigV1.class, name = "Keystore"),
    @JsonSubTypes.Type(value = OAuthAuthenticationConfigV1.class, name = "OAuth")
})
public interface AuthenticationConfigV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AuthenticationConfigV1 clone();
}

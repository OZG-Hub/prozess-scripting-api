package de.seitenbau.serviceportal.scripting.api.v1.form.auth;

/**
 * Interface für alle Authentifizierungsmöglichkeiten bei der Kommunikation mit externen Servern.
 * Zum Beispiel für die externe Dateiablage (Speichern von hochgeladenen Dateien außerhalb des Portals).
 */
public interface AuthenticationConfigV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AuthenticationConfigV1 clone();
}

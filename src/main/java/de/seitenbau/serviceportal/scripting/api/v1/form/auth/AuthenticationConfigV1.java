package de.seitenbau.serviceportal.scripting.api.v1.form.auth;

/**
 * Interface für alle Authentifizierungsmöglichkeiten bei der Kommunikation mit externen Servern.
 * Zum Beispiel für die externe Dateiablage (Speichern von hochgeladenen Dateien außerhalb des Portals).
 */
public interface AuthenticationConfigV1 extends Cloneable
{
  AuthenticationConfigV1 clone();
}

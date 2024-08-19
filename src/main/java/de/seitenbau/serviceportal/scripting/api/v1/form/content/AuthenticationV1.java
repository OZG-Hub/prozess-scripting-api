package de.seitenbau.serviceportal.scripting.api.v1.form.content;

/**
 * Objekt mit Informationen zur Authentifizierung an einem externen Server
 **/
public interface AuthenticationV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AuthenticationV1 clone();
}

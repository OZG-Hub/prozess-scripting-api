package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Die unterstützten Autorisierungsmethoden.
 */
public enum PaymentConfigAuthorizationTypeV1
{
  /**
   * Autorisierung über einen Keystore.
   */
  KEYSTORE,
  /**
   * Autorisierung über OAuth2.
   */
  OAUTH2,
  /**
   * Autorisierung über Username/E-Mail und Passwort.
   */
  BASICAUTH
}

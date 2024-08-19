package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Ein Interface, das gemeinsame Methoden für die verschiedenen Authorization Klassen definiert.
 *
 * @see PaymentConfigAuthorizationBasicAuthV1
 * @see PaymentConfigAuthorizationKeystoreV1
 * @see PaymentConfigAuthorizationOAuth2V1
 */
public interface PaymentConfigAuthorizationV1
{
  /**
   * Gibt zurück um welche der Autorisierung es sich handelt.
   * Die verschiedenen Ausprägungen sind in {@link PaymentConfigAuthorizationTypeV1} definiert.
   *
   * @return Eine der Ausprägungen von {@link PaymentConfigAuthorizationTypeV1}.
   */
  PaymentConfigAuthorizationTypeV1 getType();
}

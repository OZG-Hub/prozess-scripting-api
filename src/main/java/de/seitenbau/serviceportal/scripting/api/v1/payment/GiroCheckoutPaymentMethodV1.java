package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Enum mit den unterstützten Bezahlmethoden beim Bezahlen über girocheckout.
 */
public enum GiroCheckoutPaymentMethodV1
{
  /** Anstragsssteller wählt Bezahlverfahren auf externer Payment-Page aus. */
  PAYMENTPAGE,

  /** Paydirekt. */
  PAYDIREKT,

  /** giropay. */
  GIROPAY,

  /** Kreditkarte. */
  KREDITKARTE,

  /** PayPal. */
  PAYPAL
}
package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Enum mit den unterstützten Bezahlmethoden beim Bezahlen über girocheckout.
 */
public enum GiroCheckoutPaymentMethodV1
{
  /** Antragssteller wählt Bezahlverfahren auf externer Payment-Page aus. */
  PAYMENTPAGE,

  /**
   * paydirekt. Wurde zum 01.01.2024 mit giropay zusammengelegt und wird nicht mehr unterstützt.
   */
  @Deprecated(since = "1.171")
  PAYDIREKT,

  /** giropay. Wurde zum 01.01.2025 eingestellt und wird nicht mehr unterstützt */
  @Deprecated(since = "1.187")
  GIROPAY,

  /** Kreditkarte. */
  KREDITKARTE,

  /** PayPal. */
  PAYPAL
}
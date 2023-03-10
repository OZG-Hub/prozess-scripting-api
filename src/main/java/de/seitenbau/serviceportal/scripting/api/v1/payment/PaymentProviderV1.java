package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Die unterstützten Provider für den generischen Bezahltask.
 */
public enum PaymentProviderV1
{
  /**
   * ePayBL.
   * Payment-Config ist {@link EpayBlPaymentConfigV1}.
   */
  EPAYBL("epaybl"),

  /**
   * Standardbezahlen v0.0.8.
   * Payment-Config ist {@link Standard008PaymentConfigV1}.
   */
  STANDARD_PAYMENT_008("standardbezahlschnittstellev0.0.8"),

  /**
   * OSI-Payment.
   * Payment-Config ist {@link OsiPaymentConfigV1}.
   */
  OSI_PAYMENT("osipayment"),

  /**
   * girocheckout.
   * Payment-Config ist {@link GiroCheckoutPaymentConfigV1}.
   */
  GIRO_CHECKOUT("girocheckout");

  private final String name;

  PaymentProviderV1(String name)
  {
    this.name = name;
  }

  public String toString()
  {
    return name;
  }
}
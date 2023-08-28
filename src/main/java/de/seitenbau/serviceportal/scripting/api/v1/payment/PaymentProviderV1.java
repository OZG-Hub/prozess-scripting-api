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
   * <br />
   * Deprecated. Stattdessen {@link #X_BEZAHLDIENSTE_V1} verwenden.
   */
  @Deprecated(since = "1.164")
  STANDARD_PAYMENT_008("standardbezahlschnittstellev0.0.8"),

  /**
   * XBezahldienste v1.0.0.
   * Payment-Config für {@link XBezahldienste1PaymentConfigV1}.
   */
  X_BEZAHLDIENSTE_V1("xbezahldienstev1"),

  /**
   * OSI-Payment.
   * Payment-Config ist {@link OsiPaymentConfigV1}.
   */
  OSI_PAYMENT("osipayment"),

  /**
   * girocheckout.
   * Payment-Config ist {@link GiroCheckoutPaymentConfigV1}.
   */
  GIRO_CHECKOUT("girocheckout"),

  /**
   * Berlin.de-Payment.
   * Payment-Config ist {@link BerlinPaymentConfigV1}.
   */
  BERLIN_PAYMENT("berlinpayment"),

  /**
   * EPay21.
   * Payment-Config ist {@link Epay21PaymentConfigV1}.
   */
  EPAY21("epay21");

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
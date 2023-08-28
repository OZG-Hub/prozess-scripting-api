// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.Map;

/**
 * Payment-Config für den generischen Bezahltask über die Standardbezahlschnittstelle v0.0.8.
 * <br />
 * Deprecated. Stattdessen {@link XBezahldienste1PaymentConfigV1} nutzen.
 */
@Deprecated(since = "1.164")
public class Standard008PaymentConfigV1 implements PaymentConfigV1 {
  /**
   * Provider. Hat den Wert "standardbezahlschnittstellev0.0.8".
   */
  private final String provider = PaymentProviderV1.STANDARD_PAYMENT_008.toString();
  /**
   * BaseUrl des implementierten Endpunkts der Standardbezahlschnittstelle.
   */
  private String baseUrl;
  /**
   * Kennung des auslösenden Online-Dienstes.
   */
  private String originatorId;
  /**
   * Ordnungskriterium für die Identifikation der zuständigen Behörde.
   */
  private String endPointId;
  /**
   * Autorisierungsdaten zur Nutzung der angegebenen Schnittstelle enthält.
   */
  private PaymentConfigAuthorizationV1 authorization;
  /**
   * Zusätzliche Buchungsdaten.
   */
  private Map<String, String> additionalBookingData;


  @SuppressWarnings("all")
  public static class Standard008PaymentConfigV1Builder {
    @SuppressWarnings("all")
    private String baseUrl;
    @SuppressWarnings("all")
    private String originatorId;
    @SuppressWarnings("all")
    private String endPointId;
    @SuppressWarnings("all")
    private PaymentConfigAuthorizationV1 authorization;
    @SuppressWarnings("all")
    private Map<String, String> additionalBookingData;

    @SuppressWarnings("all")
    Standard008PaymentConfigV1Builder() {
    }

    /**
     * BaseUrl des implementierten Endpunkts der Standardbezahlschnittstelle.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder baseUrl(final String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    /**
     * Kennung des auslösenden Online-Dienstes.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder originatorId(final String originatorId) {
      this.originatorId = originatorId;
      return this;
    }

    /**
     * Ordnungskriterium für die Identifikation der zuständigen Behörde.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder endPointId(final String endPointId) {
      this.endPointId = endPointId;
      return this;
    }

    /**
     * Autorisierungsdaten zur Nutzung der angegebenen Schnittstelle enthält.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder authorization(final PaymentConfigAuthorizationV1 authorization) {
      this.authorization = authorization;
      return this;
    }

    /**
     * Zusätzliche Buchungsdaten.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder additionalBookingData(final Map<String, String> additionalBookingData) {
      this.additionalBookingData = additionalBookingData;
      return this;
    }

    @SuppressWarnings("all")
    public Standard008PaymentConfigV1 build() {
      return new Standard008PaymentConfigV1(this.baseUrl, this.originatorId, this.endPointId, this.authorization, this.additionalBookingData);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder(baseUrl=" + this.baseUrl + ", originatorId=" + this.originatorId + ", endPointId=" + this.endPointId + ", authorization=" + this.authorization + ", additionalBookingData=" + this.additionalBookingData + ")";
    }
  }

  @SuppressWarnings("all")
  public static Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder builder() {
    return new Standard008PaymentConfigV1.Standard008PaymentConfigV1Builder();
  }

  /**
   * Provider. Hat den Wert "standardbezahlschnittstellev0.0.8".
   */
  @SuppressWarnings("all")
  public String getProvider() {
    return this.provider;
  }

  /**
   * BaseUrl des implementierten Endpunkts der Standardbezahlschnittstelle.
   */
  @SuppressWarnings("all")
  public String getBaseUrl() {
    return this.baseUrl;
  }

  /**
   * Kennung des auslösenden Online-Dienstes.
   */
  @SuppressWarnings("all")
  public String getOriginatorId() {
    return this.originatorId;
  }

  /**
   * Ordnungskriterium für die Identifikation der zuständigen Behörde.
   */
  @SuppressWarnings("all")
  public String getEndPointId() {
    return this.endPointId;
  }

  /**
   * Autorisierungsdaten zur Nutzung der angegebenen Schnittstelle enthält.
   */
  @SuppressWarnings("all")
  public PaymentConfigAuthorizationV1 getAuthorization() {
    return this.authorization;
  }

  /**
   * Zusätzliche Buchungsdaten.
   */
  @SuppressWarnings("all")
  public Map<String, String> getAdditionalBookingData() {
    return this.additionalBookingData;
  }

  /**
   * BaseUrl des implementierten Endpunkts der Standardbezahlschnittstelle.
   */
  @SuppressWarnings("all")
  public void setBaseUrl(final String baseUrl) {
    this.baseUrl = baseUrl;
  }

  /**
   * Kennung des auslösenden Online-Dienstes.
   */
  @SuppressWarnings("all")
  public void setOriginatorId(final String originatorId) {
    this.originatorId = originatorId;
  }

  /**
   * Ordnungskriterium für die Identifikation der zuständigen Behörde.
   */
  @SuppressWarnings("all")
  public void setEndPointId(final String endPointId) {
    this.endPointId = endPointId;
  }

  /**
   * Autorisierungsdaten zur Nutzung der angegebenen Schnittstelle enthält.
   */
  @SuppressWarnings("all")
  public void setAuthorization(final PaymentConfigAuthorizationV1 authorization) {
    this.authorization = authorization;
  }

  /**
   * Zusätzliche Buchungsdaten.
   */
  @SuppressWarnings("all")
  public void setAdditionalBookingData(final Map<String, String> additionalBookingData) {
    this.additionalBookingData = additionalBookingData;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Standard008PaymentConfigV1)) return false;
    final Standard008PaymentConfigV1 other = (Standard008PaymentConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$provider = this.getProvider();
    final Object other$provider = other.getProvider();
    if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) return false;
    final Object this$baseUrl = this.getBaseUrl();
    final Object other$baseUrl = other.getBaseUrl();
    if (this$baseUrl == null ? other$baseUrl != null : !this$baseUrl.equals(other$baseUrl)) return false;
    final Object this$originatorId = this.getOriginatorId();
    final Object other$originatorId = other.getOriginatorId();
    if (this$originatorId == null ? other$originatorId != null : !this$originatorId.equals(other$originatorId)) return false;
    final Object this$endPointId = this.getEndPointId();
    final Object other$endPointId = other.getEndPointId();
    if (this$endPointId == null ? other$endPointId != null : !this$endPointId.equals(other$endPointId)) return false;
    final Object this$authorization = this.getAuthorization();
    final Object other$authorization = other.getAuthorization();
    if (this$authorization == null ? other$authorization != null : !this$authorization.equals(other$authorization)) return false;
    final Object this$additionalBookingData = this.getAdditionalBookingData();
    final Object other$additionalBookingData = other.getAdditionalBookingData();
    if (this$additionalBookingData == null ? other$additionalBookingData != null : !this$additionalBookingData.equals(other$additionalBookingData)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof Standard008PaymentConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $provider = this.getProvider();
    result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
    final Object $baseUrl = this.getBaseUrl();
    result = result * PRIME + ($baseUrl == null ? 43 : $baseUrl.hashCode());
    final Object $originatorId = this.getOriginatorId();
    result = result * PRIME + ($originatorId == null ? 43 : $originatorId.hashCode());
    final Object $endPointId = this.getEndPointId();
    result = result * PRIME + ($endPointId == null ? 43 : $endPointId.hashCode());
    final Object $authorization = this.getAuthorization();
    result = result * PRIME + ($authorization == null ? 43 : $authorization.hashCode());
    final Object $additionalBookingData = this.getAdditionalBookingData();
    result = result * PRIME + ($additionalBookingData == null ? 43 : $additionalBookingData.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "Standard008PaymentConfigV1(provider=" + this.getProvider() + ", baseUrl=" + this.getBaseUrl() + ", originatorId=" + this.getOriginatorId() + ", endPointId=" + this.getEndPointId() + ", authorization=" + this.getAuthorization() + ", additionalBookingData=" + this.getAdditionalBookingData() + ")";
  }

  @SuppressWarnings("all")
  public Standard008PaymentConfigV1() {
  }

  @SuppressWarnings("all")
  public Standard008PaymentConfigV1(final String baseUrl, final String originatorId, final String endPointId, final PaymentConfigAuthorizationV1 authorization, final Map<String, String> additionalBookingData) {
    this.baseUrl = baseUrl;
    this.originatorId = originatorId;
    this.endPointId = endPointId;
    this.authorization = authorization;
    this.additionalBookingData = additionalBookingData;
  }
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.List;

/**
 * Payment-Config für den generischen Bezahltask über Berlin.de-Payment.
 */
public class BerlinPaymentConfigV1 implements PaymentConfigV1 {
  /**
   * Provider. Hat den Wert "berlinpayment".
   */
  private final String provider = PaymentProviderV1.BERLIN_PAYMENT.toString();
  /**
   * Optionale 2-stellige Kennung des Supermandanten eines Händlers mit 2-stelliger Kennung (Kürzel).
   * Bei einem Merchant mit 3-stelliger Kennung wird der Parameter nicht verwendet.
   */
  private String transPrefix;
  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  private String username;
  /**
   * Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  private String password;
  /**
   * ID für die Authentifizierung in den Parametern der Requests.
   */
  private String authId;
  /**
   * Passwort für die Authentifizierung in den Parametern der Requests.
   */
  private String authPassword;
  /**
   * Optionale Liste der Bezahlmethoden, die zur Auswahl gestellt werden sollen.
   *
   * @since Release 1.174
   */
  private List<BerlinPaymentPaymentMethodV1> paymentMethods;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class BerlinPaymentConfigV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String transPrefix;
    @SuppressWarnings("all")
    @lombok.Generated
    private String username;
    @SuppressWarnings("all")
    @lombok.Generated
    private String password;
    @SuppressWarnings("all")
    @lombok.Generated
    private String authId;
    @SuppressWarnings("all")
    @lombok.Generated
    private String authPassword;
    @SuppressWarnings("all")
    @lombok.Generated
    private List<BerlinPaymentPaymentMethodV1> paymentMethods;

    @SuppressWarnings("all")
    @lombok.Generated
    BerlinPaymentConfigV1Builder() {
    }

    /**
     * Optionale 2-stellige Kennung des Supermandanten eines Händlers mit 2-stelliger Kennung (Kürzel).
     * Bei einem Merchant mit 3-stelliger Kennung wird der Parameter nicht verwendet.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder transPrefix(final String transPrefix) {
      this.transPrefix = transPrefix;
      return this;
    }

    /**
     * Benutzername für die HTTP-Authentifizierung per BasicAuth.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder username(final String username) {
      this.username = username;
      return this;
    }

    /**
     * Passwort für die HTTP-Authentifizierung per BasicAuth.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder password(final String password) {
      this.password = password;
      return this;
    }

    /**
     * ID für die Authentifizierung in den Parametern der Requests.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder authId(final String authId) {
      this.authId = authId;
      return this;
    }

    /**
     * Passwort für die Authentifizierung in den Parametern der Requests.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder authPassword(final String authPassword) {
      this.authPassword = authPassword;
      return this;
    }

    /**
     * Optionale Liste der Bezahlmethoden, die zur Auswahl gestellt werden sollen.
     *
     * @since Release 1.174
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder paymentMethods(final List<BerlinPaymentPaymentMethodV1> paymentMethods) {
      this.paymentMethods = paymentMethods;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public BerlinPaymentConfigV1 build() {
      return new BerlinPaymentConfigV1(this.transPrefix, this.username, this.password, this.authId, this.authPassword, this.paymentMethods);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder(transPrefix=" + this.transPrefix + ", username=" + this.username + ", password=" + this.password + ", authId=" + this.authId + ", authPassword=" + this.authPassword + ", paymentMethods=" + this.paymentMethods + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder builder() {
    return new BerlinPaymentConfigV1.BerlinPaymentConfigV1Builder();
  }

  /**
   * Provider. Hat den Wert "berlinpayment".
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getProvider() {
    return this.provider;
  }

  /**
   * Optionale 2-stellige Kennung des Supermandanten eines Händlers mit 2-stelliger Kennung (Kürzel).
   * Bei einem Merchant mit 3-stelliger Kennung wird der Parameter nicht verwendet.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getTransPrefix() {
    return this.transPrefix;
  }

  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getUsername() {
    return this.username;
  }

  /**
   * Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getPassword() {
    return this.password;
  }

  /**
   * ID für die Authentifizierung in den Parametern der Requests.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getAuthId() {
    return this.authId;
  }

  /**
   * Passwort für die Authentifizierung in den Parametern der Requests.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getAuthPassword() {
    return this.authPassword;
  }

  /**
   * Optionale Liste der Bezahlmethoden, die zur Auswahl gestellt werden sollen.
   *
   * @since Release 1.174
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public List<BerlinPaymentPaymentMethodV1> getPaymentMethods() {
    return this.paymentMethods;
  }

  /**
   * Optionale 2-stellige Kennung des Supermandanten eines Händlers mit 2-stelliger Kennung (Kürzel).
   * Bei einem Merchant mit 3-stelliger Kennung wird der Parameter nicht verwendet.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setTransPrefix(final String transPrefix) {
    this.transPrefix = transPrefix;
  }

  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setUsername(final String username) {
    this.username = username;
  }

  /**
   * Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setPassword(final String password) {
    this.password = password;
  }

  /**
   * ID für die Authentifizierung in den Parametern der Requests.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setAuthId(final String authId) {
    this.authId = authId;
  }

  /**
   * Passwort für die Authentifizierung in den Parametern der Requests.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setAuthPassword(final String authPassword) {
    this.authPassword = authPassword;
  }

  /**
   * Optionale Liste der Bezahlmethoden, die zur Auswahl gestellt werden sollen.
   *
   * @since Release 1.174
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setPaymentMethods(final List<BerlinPaymentPaymentMethodV1> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof BerlinPaymentConfigV1)) return false;
    final BerlinPaymentConfigV1 other = (BerlinPaymentConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$provider = this.getProvider();
    final Object other$provider = other.getProvider();
    if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) return false;
    final Object this$transPrefix = this.getTransPrefix();
    final Object other$transPrefix = other.getTransPrefix();
    if (this$transPrefix == null ? other$transPrefix != null : !this$transPrefix.equals(other$transPrefix)) return false;
    final Object this$username = this.getUsername();
    final Object other$username = other.getUsername();
    if (this$username == null ? other$username != null : !this$username.equals(other$username)) return false;
    final Object this$password = this.getPassword();
    final Object other$password = other.getPassword();
    if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
    final Object this$authId = this.getAuthId();
    final Object other$authId = other.getAuthId();
    if (this$authId == null ? other$authId != null : !this$authId.equals(other$authId)) return false;
    final Object this$authPassword = this.getAuthPassword();
    final Object other$authPassword = other.getAuthPassword();
    if (this$authPassword == null ? other$authPassword != null : !this$authPassword.equals(other$authPassword)) return false;
    final Object this$paymentMethods = this.getPaymentMethods();
    final Object other$paymentMethods = other.getPaymentMethods();
    if (this$paymentMethods == null ? other$paymentMethods != null : !this$paymentMethods.equals(other$paymentMethods)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof BerlinPaymentConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $provider = this.getProvider();
    result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
    final Object $transPrefix = this.getTransPrefix();
    result = result * PRIME + ($transPrefix == null ? 43 : $transPrefix.hashCode());
    final Object $username = this.getUsername();
    result = result * PRIME + ($username == null ? 43 : $username.hashCode());
    final Object $password = this.getPassword();
    result = result * PRIME + ($password == null ? 43 : $password.hashCode());
    final Object $authId = this.getAuthId();
    result = result * PRIME + ($authId == null ? 43 : $authId.hashCode());
    final Object $authPassword = this.getAuthPassword();
    result = result * PRIME + ($authPassword == null ? 43 : $authPassword.hashCode());
    final Object $paymentMethods = this.getPaymentMethods();
    result = result * PRIME + ($paymentMethods == null ? 43 : $paymentMethods.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "BerlinPaymentConfigV1(provider=" + this.getProvider() + ", transPrefix=" + this.getTransPrefix() + ", username=" + this.getUsername() + ", password=" + this.getPassword() + ", authId=" + this.getAuthId() + ", authPassword=" + this.getAuthPassword() + ", paymentMethods=" + this.getPaymentMethods() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public BerlinPaymentConfigV1() {
  }

  /**
   * Creates a new {@code BerlinPaymentConfigV1} instance.
   *
   * @param transPrefix Optionale 2-stellige Kennung des Supermandanten eines Händlers mit 2-stelliger Kennung (Kürzel).
   * Bei einem Merchant mit 3-stelliger Kennung wird der Parameter nicht verwendet.
   * @param username Benutzername für die HTTP-Authentifizierung per BasicAuth.
   * @param password Passwort für die HTTP-Authentifizierung per BasicAuth.
   * @param authId ID für die Authentifizierung in den Parametern der Requests.
   * @param authPassword Passwort für die Authentifizierung in den Parametern der Requests.
   * @param paymentMethods Optionale Liste der Bezahlmethoden, die zur Auswahl gestellt werden sollen.
   *
   * @since Release 1.174
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public BerlinPaymentConfigV1(final String transPrefix, final String username, final String password, final String authId, final String authPassword, final List<BerlinPaymentPaymentMethodV1> paymentMethods) {
    this.transPrefix = transPrefix;
    this.username = username;
    this.password = password;
    this.authId = authId;
    this.authPassword = authPassword;
    this.paymentMethods = paymentMethods;
  }
}

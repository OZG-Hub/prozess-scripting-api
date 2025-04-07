// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Payment-Config für Epay21.
 */
public class Epay21PaymentConfigV1 implements PaymentConfigV1 {
  /**
   * Provider. Hat den Wert "epay21".
   */
  private final String provider = PaymentProviderV1.EPAY21.toString();
  /**
   * Optionale URL des implementierten Endpunkts. Ist dieses Attribut nicht gesetzt, wird die von der
   * Plattform hinterlegte URL verwendet.
   *
   * @since Release 1.187
   */
  private String serviceUrl;
  /**
   * Mandant-Identifier.
   */
  private String mandant;
  /**
   * Mandant-Beschreibung; der Text dient der Anzeige auf der PayPage.
   */
  private String mandantDesc;
  /**
   * Fachverfahrens-Identifier.
   */
  private String app;
  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  private String user;
  /**
   * Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  private String password;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class Epay21PaymentConfigV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String serviceUrl;
    @SuppressWarnings("all")
    @lombok.Generated
    private String mandant;
    @SuppressWarnings("all")
    @lombok.Generated
    private String mandantDesc;
    @SuppressWarnings("all")
    @lombok.Generated
    private String app;
    @SuppressWarnings("all")
    @lombok.Generated
    private String user;
    @SuppressWarnings("all")
    @lombok.Generated
    private String password;

    @SuppressWarnings("all")
    @lombok.Generated
    Epay21PaymentConfigV1Builder() {
    }

    /**
     * Optionale URL des implementierten Endpunkts. Ist dieses Attribut nicht gesetzt, wird die von der
     * Plattform hinterlegte URL verwendet.
     *
     * @since Release 1.187
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder serviceUrl(final String serviceUrl) {
      this.serviceUrl = serviceUrl;
      return this;
    }

    /**
     * Mandant-Identifier.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder mandant(final String mandant) {
      this.mandant = mandant;
      return this;
    }

    /**
     * Mandant-Beschreibung; der Text dient der Anzeige auf der PayPage.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder mandantDesc(final String mandantDesc) {
      this.mandantDesc = mandantDesc;
      return this;
    }

    /**
     * Fachverfahrens-Identifier.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder app(final String app) {
      this.app = app;
      return this;
    }

    /**
     * Benutzername für die HTTP-Authentifizierung per BasicAuth.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder user(final String user) {
      this.user = user;
      return this;
    }

    /**
     * Passwort für die HTTP-Authentifizierung per BasicAuth.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder password(final String password) {
      this.password = password;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public Epay21PaymentConfigV1 build() {
      return new Epay21PaymentConfigV1(this.serviceUrl, this.mandant, this.mandantDesc, this.app, this.user, this.password);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder(serviceUrl=" + this.serviceUrl + ", mandant=" + this.mandant + ", mandantDesc=" + this.mandantDesc + ", app=" + this.app + ", user=" + this.user + ", password=" + this.password + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder builder() {
    return new Epay21PaymentConfigV1.Epay21PaymentConfigV1Builder();
  }

  /**
   * Provider. Hat den Wert "epay21".
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getProvider() {
    return this.provider;
  }

  /**
   * Optionale URL des implementierten Endpunkts. Ist dieses Attribut nicht gesetzt, wird die von der
   * Plattform hinterlegte URL verwendet.
   *
   * @since Release 1.187
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getServiceUrl() {
    return this.serviceUrl;
  }

  /**
   * Mandant-Identifier.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getMandant() {
    return this.mandant;
  }

  /**
   * Mandant-Beschreibung; der Text dient der Anzeige auf der PayPage.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getMandantDesc() {
    return this.mandantDesc;
  }

  /**
   * Fachverfahrens-Identifier.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getApp() {
    return this.app;
  }

  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getUser() {
    return this.user;
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
   * Optionale URL des implementierten Endpunkts. Ist dieses Attribut nicht gesetzt, wird die von der
   * Plattform hinterlegte URL verwendet.
   *
   * @since Release 1.187
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setServiceUrl(final String serviceUrl) {
    this.serviceUrl = serviceUrl;
  }

  /**
   * Mandant-Identifier.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setMandant(final String mandant) {
    this.mandant = mandant;
  }

  /**
   * Mandant-Beschreibung; der Text dient der Anzeige auf der PayPage.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setMandantDesc(final String mandantDesc) {
    this.mandantDesc = mandantDesc;
  }

  /**
   * Fachverfahrens-Identifier.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setApp(final String app) {
    this.app = app;
  }

  /**
   * Benutzername für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setUser(final String user) {
    this.user = user;
  }

  /**
   * Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setPassword(final String password) {
    this.password = password;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof Epay21PaymentConfigV1)) return false;
    final Epay21PaymentConfigV1 other = (Epay21PaymentConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$provider = this.getProvider();
    final Object other$provider = other.getProvider();
    if (this$provider == null ? other$provider != null : !this$provider.equals(other$provider)) return false;
    final Object this$serviceUrl = this.getServiceUrl();
    final Object other$serviceUrl = other.getServiceUrl();
    if (this$serviceUrl == null ? other$serviceUrl != null : !this$serviceUrl.equals(other$serviceUrl)) return false;
    final Object this$mandant = this.getMandant();
    final Object other$mandant = other.getMandant();
    if (this$mandant == null ? other$mandant != null : !this$mandant.equals(other$mandant)) return false;
    final Object this$mandantDesc = this.getMandantDesc();
    final Object other$mandantDesc = other.getMandantDesc();
    if (this$mandantDesc == null ? other$mandantDesc != null : !this$mandantDesc.equals(other$mandantDesc)) return false;
    final Object this$app = this.getApp();
    final Object other$app = other.getApp();
    if (this$app == null ? other$app != null : !this$app.equals(other$app)) return false;
    final Object this$user = this.getUser();
    final Object other$user = other.getUser();
    if (this$user == null ? other$user != null : !this$user.equals(other$user)) return false;
    final Object this$password = this.getPassword();
    final Object other$password = other.getPassword();
    if (this$password == null ? other$password != null : !this$password.equals(other$password)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof Epay21PaymentConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $provider = this.getProvider();
    result = result * PRIME + ($provider == null ? 43 : $provider.hashCode());
    final Object $serviceUrl = this.getServiceUrl();
    result = result * PRIME + ($serviceUrl == null ? 43 : $serviceUrl.hashCode());
    final Object $mandant = this.getMandant();
    result = result * PRIME + ($mandant == null ? 43 : $mandant.hashCode());
    final Object $mandantDesc = this.getMandantDesc();
    result = result * PRIME + ($mandantDesc == null ? 43 : $mandantDesc.hashCode());
    final Object $app = this.getApp();
    result = result * PRIME + ($app == null ? 43 : $app.hashCode());
    final Object $user = this.getUser();
    result = result * PRIME + ($user == null ? 43 : $user.hashCode());
    final Object $password = this.getPassword();
    result = result * PRIME + ($password == null ? 43 : $password.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "Epay21PaymentConfigV1(provider=" + this.getProvider() + ", serviceUrl=" + this.getServiceUrl() + ", mandant=" + this.getMandant() + ", mandantDesc=" + this.getMandantDesc() + ", app=" + this.getApp() + ", user=" + this.getUser() + ", password=" + this.getPassword() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public Epay21PaymentConfigV1() {
  }

  /**
   * Creates a new {@code Epay21PaymentConfigV1} instance.
   *
   * @param serviceUrl Optionale URL des implementierten Endpunkts. Ist dieses Attribut nicht gesetzt, wird die von der
   * Plattform hinterlegte URL verwendet.
   *
   * @since Release 1.187
   * @param mandant Mandant-Identifier.
   * @param mandantDesc Mandant-Beschreibung; der Text dient der Anzeige auf der PayPage.
   * @param app Fachverfahrens-Identifier.
   * @param user Benutzername für die HTTP-Authentifizierung per BasicAuth.
   * @param password Passwort für die HTTP-Authentifizierung per BasicAuth.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Epay21PaymentConfigV1(final String serviceUrl, final String mandant, final String mandantDesc, final String app, final String user, final String password) {
    this.serviceUrl = serviceUrl;
    this.mandant = mandant;
    this.mandantDesc = mandantDesc;
    this.app = app;
    this.user = user;
    this.password = password;
  }
}

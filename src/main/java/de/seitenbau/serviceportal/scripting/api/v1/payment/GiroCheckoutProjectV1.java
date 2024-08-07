// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.List;

/**
 * Informationen über die Projekte der möglichen Bezahlmethoden bei GiroCheckout.
 */
public class GiroCheckoutProjectV1 {
  /**
   * project-Id des Bezahlverfahrens.
   */
  private int id;
  /**
   * project-secret zur Erzeugung des Hashes.
   */
  private String secret;
  /**
   * Bezahlart des Projekts.
   */
  private GiroCheckoutPaymentMethodV1 paymentMethod;
  /**
   * Liste von Bezahlmethoden, auf die die vom Handler unterstützen Bezahlmethoden, bei Verwendung der
   * PaymentPage eingeschränkt werden sollen.
   */
  private List<GiroCheckoutPaymentMethodV1> selectablePaymentMethods;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class GiroCheckoutProjectV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private int id;
    @SuppressWarnings("all")
    @lombok.Generated
    private String secret;
    @SuppressWarnings("all")
    @lombok.Generated
    private GiroCheckoutPaymentMethodV1 paymentMethod;
    @SuppressWarnings("all")
    @lombok.Generated
    private List<GiroCheckoutPaymentMethodV1> selectablePaymentMethods;

    @SuppressWarnings("all")
    @lombok.Generated
    GiroCheckoutProjectV1Builder() {
    }

    /**
     * project-Id des Bezahlverfahrens.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder id(final int id) {
      this.id = id;
      return this;
    }

    /**
     * project-secret zur Erzeugung des Hashes.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder secret(final String secret) {
      this.secret = secret;
      return this;
    }

    /**
     * Bezahlart des Projekts.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder paymentMethod(final GiroCheckoutPaymentMethodV1 paymentMethod) {
      this.paymentMethod = paymentMethod;
      return this;
    }

    /**
     * Liste von Bezahlmethoden, auf die die vom Handler unterstützen Bezahlmethoden, bei Verwendung der
     * PaymentPage eingeschränkt werden sollen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder selectablePaymentMethods(final List<GiroCheckoutPaymentMethodV1> selectablePaymentMethods) {
      this.selectablePaymentMethods = selectablePaymentMethods;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public GiroCheckoutProjectV1 build() {
      return new GiroCheckoutProjectV1(this.id, this.secret, this.paymentMethod, this.selectablePaymentMethods);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder(id=" + this.id + ", secret=" + this.secret + ", paymentMethod=" + this.paymentMethod + ", selectablePaymentMethods=" + this.selectablePaymentMethods + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder builder() {
    return new GiroCheckoutProjectV1.GiroCheckoutProjectV1Builder();
  }

  /**
   * project-Id des Bezahlverfahrens.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public int getId() {
    return this.id;
  }

  /**
   * project-secret zur Erzeugung des Hashes.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSecret() {
    return this.secret;
  }

  /**
   * Bezahlart des Projekts.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public GiroCheckoutPaymentMethodV1 getPaymentMethod() {
    return this.paymentMethod;
  }

  /**
   * Liste von Bezahlmethoden, auf die die vom Handler unterstützen Bezahlmethoden, bei Verwendung der
   * PaymentPage eingeschränkt werden sollen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public List<GiroCheckoutPaymentMethodV1> getSelectablePaymentMethods() {
    return this.selectablePaymentMethods;
  }

  /**
   * project-Id des Bezahlverfahrens.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setId(final int id) {
    this.id = id;
  }

  /**
   * project-secret zur Erzeugung des Hashes.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSecret(final String secret) {
    this.secret = secret;
  }

  /**
   * Bezahlart des Projekts.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setPaymentMethod(final GiroCheckoutPaymentMethodV1 paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  /**
   * Liste von Bezahlmethoden, auf die die vom Handler unterstützen Bezahlmethoden, bei Verwendung der
   * PaymentPage eingeschränkt werden sollen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSelectablePaymentMethods(final List<GiroCheckoutPaymentMethodV1> selectablePaymentMethods) {
    this.selectablePaymentMethods = selectablePaymentMethods;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof GiroCheckoutProjectV1)) return false;
    final GiroCheckoutProjectV1 other = (GiroCheckoutProjectV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getId() != other.getId()) return false;
    final Object this$secret = this.getSecret();
    final Object other$secret = other.getSecret();
    if (this$secret == null ? other$secret != null : !this$secret.equals(other$secret)) return false;
    final Object this$paymentMethod = this.getPaymentMethod();
    final Object other$paymentMethod = other.getPaymentMethod();
    if (this$paymentMethod == null ? other$paymentMethod != null : !this$paymentMethod.equals(other$paymentMethod)) return false;
    final Object this$selectablePaymentMethods = this.getSelectablePaymentMethods();
    final Object other$selectablePaymentMethods = other.getSelectablePaymentMethods();
    if (this$selectablePaymentMethods == null ? other$selectablePaymentMethods != null : !this$selectablePaymentMethods.equals(other$selectablePaymentMethods)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof GiroCheckoutProjectV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getId();
    final Object $secret = this.getSecret();
    result = result * PRIME + ($secret == null ? 43 : $secret.hashCode());
    final Object $paymentMethod = this.getPaymentMethod();
    result = result * PRIME + ($paymentMethod == null ? 43 : $paymentMethod.hashCode());
    final Object $selectablePaymentMethods = this.getSelectablePaymentMethods();
    result = result * PRIME + ($selectablePaymentMethods == null ? 43 : $selectablePaymentMethods.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "GiroCheckoutProjectV1(id=" + this.getId() + ", secret=" + this.getSecret() + ", paymentMethod=" + this.getPaymentMethod() + ", selectablePaymentMethods=" + this.getSelectablePaymentMethods() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public GiroCheckoutProjectV1() {
  }

  /**
   * Creates a new {@code GiroCheckoutProjectV1} instance.
   *
   * @param id project-Id des Bezahlverfahrens.
   * @param secret project-secret zur Erzeugung des Hashes.
   * @param paymentMethod Bezahlart des Projekts.
   * @param selectablePaymentMethods Liste von Bezahlmethoden, auf die die vom Handler unterstützen Bezahlmethoden, bei Verwendung der
   * PaymentPage eingeschränkt werden sollen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public GiroCheckoutProjectV1(final int id, final String secret, final GiroCheckoutPaymentMethodV1 paymentMethod, final List<GiroCheckoutPaymentMethodV1> selectablePaymentMethods) {
    this.id = id;
    this.secret = secret;
    this.paymentMethod = paymentMethod;
    this.selectablePaymentMethods = selectablePaymentMethods;
  }
}

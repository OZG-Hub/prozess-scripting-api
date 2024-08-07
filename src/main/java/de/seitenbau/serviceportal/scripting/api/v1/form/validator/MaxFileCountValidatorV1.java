// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.validator;

/**
 * Validierungsregel, die prüft, dass die Anzahl an hochgeladenen Dateien an einem Multiupload-Feld nicht die
 * definierte maximale Anzahl überschreitet.
 */
public class MaxFileCountValidatorV1 extends ValidationRuleV1 {
  /**
   * Maximale Anzahl an Dateien.
   */
  private int maxFileCount;


  @SuppressWarnings("all")
  @lombok.Generated
  public static abstract class MaxFileCountValidatorV1Builder<C extends MaxFileCountValidatorV1, B extends MaxFileCountValidatorV1.MaxFileCountValidatorV1Builder<C, B>> extends ValidationRuleV1.ValidationRuleV1Builder<C, B> {
    @SuppressWarnings("all")
    @lombok.Generated
    private int maxFileCount;

    /**
     * Maximale Anzahl an Dateien.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public B maxFileCount(final int maxFileCount) {
      this.maxFileCount = maxFileCount;
      return self();
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    protected abstract B self();

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "MaxFileCountValidatorV1.MaxFileCountValidatorV1Builder(super=" + super.toString() + ", maxFileCount=" + this.maxFileCount + ")";
    }
  }


  @SuppressWarnings("all")
  @lombok.Generated
  private static final class MaxFileCountValidatorV1BuilderImpl extends MaxFileCountValidatorV1.MaxFileCountValidatorV1Builder<MaxFileCountValidatorV1, MaxFileCountValidatorV1.MaxFileCountValidatorV1BuilderImpl> {
    @SuppressWarnings("all")
    @lombok.Generated
    private MaxFileCountValidatorV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    protected MaxFileCountValidatorV1.MaxFileCountValidatorV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public MaxFileCountValidatorV1 build() {
      return new MaxFileCountValidatorV1(this);
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected MaxFileCountValidatorV1(final MaxFileCountValidatorV1.MaxFileCountValidatorV1Builder<?, ?> b) {
    super(b);
    this.maxFileCount = b.maxFileCount;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static MaxFileCountValidatorV1.MaxFileCountValidatorV1Builder<?, ?> builder() {
    return new MaxFileCountValidatorV1.MaxFileCountValidatorV1BuilderImpl();
  }

  /**
   * Maximale Anzahl an Dateien.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public int getMaxFileCount() {
    return this.maxFileCount;
  }

  /**
   * Maximale Anzahl an Dateien.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setMaxFileCount(final int maxFileCount) {
    this.maxFileCount = maxFileCount;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "MaxFileCountValidatorV1(maxFileCount=" + this.getMaxFileCount() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof MaxFileCountValidatorV1)) return false;
    final MaxFileCountValidatorV1 other = (MaxFileCountValidatorV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getMaxFileCount() != other.getMaxFileCount()) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof MaxFileCountValidatorV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getMaxFileCount();
    return result;
  }
}

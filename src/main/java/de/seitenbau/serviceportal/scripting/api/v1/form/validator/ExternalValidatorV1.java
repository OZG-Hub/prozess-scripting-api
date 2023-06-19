// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.validator;

import de.seitenbau.serviceportal.scripting.api.v1.form.ajax.ExternalDataSourcePropertiesV1;

/**
 * Validierungsregel, die ein externes System zum Prüfen nutzt.
 */
public class ExternalValidatorV1 extends ValidationRuleV1 {
  /**
   * Daten für die externe Validierung. Das hier hinterlegte externe System führt die Validierung durch.
   */
  private ExternalDataSourcePropertiesV1 settings;


  @SuppressWarnings("all")
  public static abstract class ExternalValidatorV1Builder<C extends ExternalValidatorV1, B extends ExternalValidatorV1.ExternalValidatorV1Builder<C, B>> extends ValidationRuleV1.ValidationRuleV1Builder<C, B> {
    @SuppressWarnings("all")
    private ExternalDataSourcePropertiesV1 settings;

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public B settings(final ExternalDataSourcePropertiesV1 settings) {
      this.settings = settings;
      return self();
    }

    @Override
    @SuppressWarnings("all")
    protected abstract B self();

    @Override
    @SuppressWarnings("all")
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "ExternalValidatorV1.ExternalValidatorV1Builder(super=" + super.toString() + ", settings=" + this.settings + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class ExternalValidatorV1BuilderImpl extends ExternalValidatorV1.ExternalValidatorV1Builder<ExternalValidatorV1, ExternalValidatorV1.ExternalValidatorV1BuilderImpl> {
    @SuppressWarnings("all")
    private ExternalValidatorV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected ExternalValidatorV1.ExternalValidatorV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public ExternalValidatorV1 build() {
      return new ExternalValidatorV1(this);
    }
  }

  @SuppressWarnings("all")
  protected ExternalValidatorV1(final ExternalValidatorV1.ExternalValidatorV1Builder<?, ?> b) {
    super(b);
    this.settings = b.settings;
  }

  @SuppressWarnings("all")
  public static ExternalValidatorV1.ExternalValidatorV1Builder<?, ?> builder() {
    return new ExternalValidatorV1.ExternalValidatorV1BuilderImpl();
  }

  /**
   * Daten für die externe Validierung. Das hier hinterlegte externe System führt die Validierung durch.
   */
  @SuppressWarnings("all")
  public ExternalDataSourcePropertiesV1 getSettings() {
    return this.settings;
  }

  /**
   * Daten für die externe Validierung. Das hier hinterlegte externe System führt die Validierung durch.
   */
  @SuppressWarnings("all")
  public void setSettings(final ExternalDataSourcePropertiesV1 settings) {
    this.settings = settings;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "ExternalValidatorV1(settings=" + this.getSettings() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ExternalValidatorV1)) return false;
    final ExternalValidatorV1 other = (ExternalValidatorV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$settings = this.getSettings();
    final Object other$settings = other.getSettings();
    if (this$settings == null ? other$settings != null : !this$settings.equals(other$settings)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof ExternalValidatorV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $settings = this.getSettings();
    result = result * PRIME + ($settings == null ? 43 : $settings.hashCode());
    return result;
  }
}
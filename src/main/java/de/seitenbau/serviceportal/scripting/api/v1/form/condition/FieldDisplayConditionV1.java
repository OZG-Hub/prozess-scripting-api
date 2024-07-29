// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.condition;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldGroupInstanceV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldKeyV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;

/**
 * Abstrakte Elternklasse für Sichtbarkeitsbedingungen, deren Sichtbarkeiten von einem Feldwert abhängen.
 */
public abstract class FieldDisplayConditionV1 extends DisplayConditionV1 {
  /**
   * Schlüssel des Feldes, das auf die enthaltene Bedingung geprüft wird.
   */
  private FormFieldKeyV1 conditionFieldKey;

  public final FormFieldKeyV1 getReferencedFieldKey(FieldGroupInstanceV1 instance) {
    return instance.resolveSameInstancePointers(conditionFieldKey);
  }

  protected final FormFieldV1 getReferencedField(FieldGroupInstanceV1 instance, FormV1 form) {
    FormFieldKeyV1 resolvedKey = getReferencedFieldKey(instance);
    return form.getFieldInInstance(resolvedKey);
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static abstract class FieldDisplayConditionV1Builder<C extends FieldDisplayConditionV1, B extends FieldDisplayConditionV1.FieldDisplayConditionV1Builder<C, B>> extends DisplayConditionV1.DisplayConditionV1Builder<C, B> {
    @SuppressWarnings("all")
    @lombok.Generated
    private FormFieldKeyV1 conditionFieldKey;

    /**
     * Schlüssel des Feldes, das auf die enthaltene Bedingung geprüft wird.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public B conditionFieldKey(final FormFieldKeyV1 conditionFieldKey) {
      this.conditionFieldKey = conditionFieldKey;
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
      return "FieldDisplayConditionV1.FieldDisplayConditionV1Builder(super=" + super.toString() + ", conditionFieldKey=" + this.conditionFieldKey + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected FieldDisplayConditionV1(final FieldDisplayConditionV1.FieldDisplayConditionV1Builder<?, ?> b) {
    super(b);
    this.conditionFieldKey = b.conditionFieldKey;
  }

  /**
   * Schlüssel des Feldes, das auf die enthaltene Bedingung geprüft wird.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public FormFieldKeyV1 getConditionFieldKey() {
    return this.conditionFieldKey;
  }

  /**
   * Schlüssel des Feldes, das auf die enthaltene Bedingung geprüft wird.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setConditionFieldKey(final FormFieldKeyV1 conditionFieldKey) {
    this.conditionFieldKey = conditionFieldKey;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "FieldDisplayConditionV1(conditionFieldKey=" + this.getConditionFieldKey() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FieldDisplayConditionV1)) return false;
    final FieldDisplayConditionV1 other = (FieldDisplayConditionV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (!super.equals(o)) return false;
    final Object this$conditionFieldKey = this.getConditionFieldKey();
    final Object other$conditionFieldKey = other.getConditionFieldKey();
    if (this$conditionFieldKey == null ? other$conditionFieldKey != null : !this$conditionFieldKey.equals(other$conditionFieldKey)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof FieldDisplayConditionV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = super.hashCode();
    final Object $conditionFieldKey = this.getConditionFieldKey();
    result = result * PRIME + ($conditionFieldKey == null ? 43 : $conditionFieldKey.hashCode());
    return result;
  }
}

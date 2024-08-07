// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.condition;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import de.seitenbau.serviceportal.scripting.api.v1.form.FieldGroupInstanceV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;

/**
 * Sichtbarkeitsbedingung, die erfüllt ist, wenn der Wert des referenzierten Feldes nicht Teil einer
 * definierten Menge an Werten ist.
 */
public class ShowOnFieldValueNotInValuesConditionV1 extends FieldDisplayConditionV1 {
  /**
   * Werte, für die das Zielfeld nicht angezeigt wird.
   */
  private Set<String> values;

  @Override
  public boolean isShown(FieldGroupInstanceV1 instance, FormV1 form) {
    FormFieldV1 field = getReferencedField(instance, form);
    if (field == null) {
      return false;
    }
    Object fieldValue = field.getValue();
    if (fieldValue == null) {
      return !(values == null || values.contains(null));
    }
    if (values == null) {
      return true;
    }
    if (fieldValue instanceof List) {
      return ((List<?>) fieldValue).stream().anyMatch(value -> !values.contains(value == null ? null : value.toString()));
    }
    return !values.contains(fieldValue.toString());
  }

  @SuppressWarnings("all")
  @lombok.Generated
  private static Set<String> $default$values() {
    return new HashSet<>();
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static abstract class ShowOnFieldValueNotInValuesConditionV1Builder<C extends ShowOnFieldValueNotInValuesConditionV1, B extends ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1Builder<C, B>> extends FieldDisplayConditionV1.FieldDisplayConditionV1Builder<C, B> {
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean values$set;
    @SuppressWarnings("all")
    @lombok.Generated
    private Set<String> values$value;

    /**
     * Werte, für die das Zielfeld nicht angezeigt wird.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public B values(final Set<String> values) {
      this.values$value = values;
      values$set = true;
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
      return "ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1Builder(super=" + super.toString() + ", values$value=" + this.values$value + ")";
    }
  }


  @SuppressWarnings("all")
  @lombok.Generated
  private static final class ShowOnFieldValueNotInValuesConditionV1BuilderImpl extends ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1Builder<ShowOnFieldValueNotInValuesConditionV1, ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1BuilderImpl> {
    @SuppressWarnings("all")
    @lombok.Generated
    private ShowOnFieldValueNotInValuesConditionV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    protected ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public ShowOnFieldValueNotInValuesConditionV1 build() {
      return new ShowOnFieldValueNotInValuesConditionV1(this);
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected ShowOnFieldValueNotInValuesConditionV1(final ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1Builder<?, ?> b) {
    super(b);
    if (b.values$set) this.values = b.values$value;
     else this.values = ShowOnFieldValueNotInValuesConditionV1.$default$values();
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1Builder<?, ?> builder() {
    return new ShowOnFieldValueNotInValuesConditionV1.ShowOnFieldValueNotInValuesConditionV1BuilderImpl();
  }

  /**
   * Werte, für die das Zielfeld nicht angezeigt wird.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Set<String> getValues() {
    return this.values;
  }

  /**
   * Werte, für die das Zielfeld nicht angezeigt wird.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setValues(final Set<String> values) {
    this.values = values;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "ShowOnFieldValueNotInValuesConditionV1(values=" + this.getValues() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ShowOnFieldValueNotInValuesConditionV1)) return false;
    final ShowOnFieldValueNotInValuesConditionV1 other = (ShowOnFieldValueNotInValuesConditionV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (!super.equals(o)) return false;
    final Object this$values = this.getValues();
    final Object other$values = other.getValues();
    if (this$values == null ? other$values != null : !this$values.equals(other$values)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof ShowOnFieldValueNotInValuesConditionV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = super.hashCode();
    final Object $values = this.getValues();
    result = result * PRIME + ($values == null ? 43 : $values.hashCode());
    return result;
  }
}

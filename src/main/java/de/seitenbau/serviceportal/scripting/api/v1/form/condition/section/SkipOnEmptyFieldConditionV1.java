// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.condition.section;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldGroupInstanceV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;

/**
 * Eine Bedingung zum Überspringen von Elementen.
 * Die Bedingung ist erfüllt, wenn das referenzierte Feld leer ist.
 */
public class SkipOnEmptyFieldConditionV1 extends ReferencedFieldSkipConditionV1 {
  @Override
  public boolean isSkipped(FieldGroupInstanceV1 instance, FormV1 form) {
    FormFieldV1 field = getReferencedField(instance, form);
    return field != null && !field.isFilled();
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static abstract class SkipOnEmptyFieldConditionV1Builder<C extends SkipOnEmptyFieldConditionV1, B extends SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1Builder<C, B>> extends ReferencedFieldSkipConditionV1.ReferencedFieldSkipConditionV1Builder<C, B> {
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
      return "SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1Builder(super=" + super.toString() + ")";
    }
  }


  @SuppressWarnings("all")
  @lombok.Generated
  private static final class SkipOnEmptyFieldConditionV1BuilderImpl extends SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1Builder<SkipOnEmptyFieldConditionV1, SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1BuilderImpl> {
    @SuppressWarnings("all")
    @lombok.Generated
    private SkipOnEmptyFieldConditionV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    protected SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public SkipOnEmptyFieldConditionV1 build() {
      return new SkipOnEmptyFieldConditionV1(this);
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected SkipOnEmptyFieldConditionV1(final SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1Builder<?, ?> b) {
    super(b);
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1Builder<?, ?> builder() {
    return new SkipOnEmptyFieldConditionV1.SkipOnEmptyFieldConditionV1BuilderImpl();
  }
}

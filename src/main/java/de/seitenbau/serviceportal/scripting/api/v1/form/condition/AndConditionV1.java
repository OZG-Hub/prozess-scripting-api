// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.condition;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldGroupInstanceV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;

/**
 * Komplexe Sichtbarkeitsbedingung, bei der alle enthaltenen Sichtbarkeitsbedingungen erfüllt sein müssen,
 * damit diese Sichtbarkeitsbedingung erfüllt ist.
 */
public class AndConditionV1 extends AggregatorDisplayConditionV1 {
  @Override
  public boolean isShown(FieldGroupInstanceV1 instance, FormV1 form) {
    return getConditions().isEmpty() || getConditions().stream().allMatch(condition -> condition.isShown(instance, form));
  }


  @SuppressWarnings("all")
  public static abstract class AndConditionV1Builder<C extends AndConditionV1, B extends AndConditionV1.AndConditionV1Builder<C, B>> extends AggregatorDisplayConditionV1.AggregatorDisplayConditionV1Builder<C, B> {
    @Override
    @SuppressWarnings("all")
    protected abstract B self();

    @Override
    @SuppressWarnings("all")
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "AndConditionV1.AndConditionV1Builder(super=" + super.toString() + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class AndConditionV1BuilderImpl extends AndConditionV1.AndConditionV1Builder<AndConditionV1, AndConditionV1.AndConditionV1BuilderImpl> {
    @SuppressWarnings("all")
    private AndConditionV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected AndConditionV1.AndConditionV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public AndConditionV1 build() {
      return new AndConditionV1(this);
    }
  }

  @SuppressWarnings("all")
  protected AndConditionV1(final AndConditionV1.AndConditionV1Builder<?, ?> b) {
    super(b);
  }

  @SuppressWarnings("all")
  public static AndConditionV1.AndConditionV1Builder<?, ?> builder() {
    return new AndConditionV1.AndConditionV1BuilderImpl();
  }
}

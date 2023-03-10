// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.condition;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldGroupInstanceV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;

/**
 * Komplexe Sichtbarkeitsbedingung, bei der mindestens eine der enthaltenen Sichtbarkeitsbedingungen erfüllt
 * sein muss, damit diese Sichtbarkeitsbedingung erfüllt ist.
 */
public class OrConditionV1 extends AggregatorDisplayConditionV1 {
  @Override
  public boolean isShown(FieldGroupInstanceV1 instance, FormV1 form) {
    return getConditions().isEmpty() || getConditions().stream().anyMatch(condition -> condition.isShown(instance, form));
  }


  @SuppressWarnings("all")
  public static abstract class OrConditionV1Builder<C extends OrConditionV1, B extends OrConditionV1.OrConditionV1Builder<C, B>> extends AggregatorDisplayConditionV1.AggregatorDisplayConditionV1Builder<C, B> {
    @Override
    @SuppressWarnings("all")
    protected abstract B self();

    @Override
    @SuppressWarnings("all")
    public abstract C build();

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "OrConditionV1.OrConditionV1Builder(super=" + super.toString() + ")";
    }
  }


  @SuppressWarnings("all")
  private static final class OrConditionV1BuilderImpl extends OrConditionV1.OrConditionV1Builder<OrConditionV1, OrConditionV1.OrConditionV1BuilderImpl> {
    @SuppressWarnings("all")
    private OrConditionV1BuilderImpl() {
    }

    @Override
    @SuppressWarnings("all")
    protected OrConditionV1.OrConditionV1BuilderImpl self() {
      return this;
    }

    @Override
    @SuppressWarnings("all")
    public OrConditionV1 build() {
      return new OrConditionV1(this);
    }
  }

  @SuppressWarnings("all")
  protected OrConditionV1(final OrConditionV1.OrConditionV1Builder<?, ?> b) {
    super(b);
  }

  @SuppressWarnings("all")
  public static OrConditionV1.OrConditionV1Builder<?, ?> builder() {
    return new OrConditionV1.OrConditionV1BuilderImpl();
  }
}

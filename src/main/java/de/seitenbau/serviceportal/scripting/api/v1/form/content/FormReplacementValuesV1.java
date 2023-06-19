// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

import java.util.HashMap;
import java.util.Map;

/**
 * Menge aller ersetzten Platzhalter in einem Formular.
 */
public class FormReplacementValuesV1 {
  /**
   * Map der ersetzten Platzhalter im Formular.
   * Key ist der Typ der Ersetzung. Value ist Map aus Namen und Wert des Platzhalters.
   */
  private Map<FormReplacementV1.ReturnType, HashMap<String, Object>> store = new HashMap<>();

  @SuppressWarnings("all")
  public FormReplacementValuesV1() {
  }

  /**
   * Map der ersetzten Platzhalter im Formular.
   * Key ist der Typ der Ersetzung. Value ist Map aus Namen und Wert des Platzhalters.
   */
  @SuppressWarnings("all")
  public Map<FormReplacementV1.ReturnType, HashMap<String, Object>> getStore() {
    return this.store;
  }

  /**
   * Map der ersetzten Platzhalter im Formular.
   * Key ist der Typ der Ersetzung. Value ist Map aus Namen und Wert des Platzhalters.
   */
  @SuppressWarnings("all")
  public void setStore(final Map<FormReplacementV1.ReturnType, HashMap<String, Object>> store) {
    this.store = store;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FormReplacementValuesV1)) return false;
    final FormReplacementValuesV1 other = (FormReplacementValuesV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$store = this.getStore();
    final Object other$store = other.getStore();
    if (this$store == null ? other$store != null : !this$store.equals(other$store)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof FormReplacementValuesV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $store = this.getStore();
    result = result * PRIME + ($store == null ? 43 : $store.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "FormReplacementValuesV1(store=" + this.getStore() + ")";
  }
}
// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.config;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;

/**
 * Konfiguration für Felder mit Vorschlagsliste
 * ({@link FieldTypeV1#STRING_AJAX_AUTOCOMPLETE STRING_AJAX_AUTOCOMPLETE}).
 */
public class AdditionalStringAjaxAutocompleteConfigV1 implements AdditionalFieldConfigV1 {
  /**
   * Anzahl an Zeichen, aber der Vorschlagsliste geladen werden soll. Wenn nicht gesetzt wird die
   * Vorschlagsliste ab dem dritten Zeichen geladen.
   */
  private Integer autocompleteMinCharCount;

  @Override
  public AdditionalStringAjaxAutocompleteConfigV1 clone() {
    try {
      return (AdditionalStringAjaxAutocompleteConfigV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  /**
   * Creates a new {@code AdditionalStringAjaxAutocompleteConfigV1} instance.
   *
   * @param autocompleteMinCharCount Anzahl an Zeichen, aber der Vorschlagsliste geladen werden soll. Wenn nicht gesetzt wird die
   * Vorschlagsliste ab dem dritten Zeichen geladen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  AdditionalStringAjaxAutocompleteConfigV1(final Integer autocompleteMinCharCount) {
    this.autocompleteMinCharCount = autocompleteMinCharCount;
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static class AdditionalStringAjaxAutocompleteConfigV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private Integer autocompleteMinCharCount;

    @SuppressWarnings("all")
    @lombok.Generated
    AdditionalStringAjaxAutocompleteConfigV1Builder() {
    }

    /**
     * Anzahl an Zeichen, aber der Vorschlagsliste geladen werden soll. Wenn nicht gesetzt wird die
     * Vorschlagsliste ab dem dritten Zeichen geladen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public AdditionalStringAjaxAutocompleteConfigV1.AdditionalStringAjaxAutocompleteConfigV1Builder autocompleteMinCharCount(final Integer autocompleteMinCharCount) {
      this.autocompleteMinCharCount = autocompleteMinCharCount;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public AdditionalStringAjaxAutocompleteConfigV1 build() {
      return new AdditionalStringAjaxAutocompleteConfigV1(this.autocompleteMinCharCount);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "AdditionalStringAjaxAutocompleteConfigV1.AdditionalStringAjaxAutocompleteConfigV1Builder(autocompleteMinCharCount=" + this.autocompleteMinCharCount + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static AdditionalStringAjaxAutocompleteConfigV1.AdditionalStringAjaxAutocompleteConfigV1Builder builder() {
    return new AdditionalStringAjaxAutocompleteConfigV1.AdditionalStringAjaxAutocompleteConfigV1Builder();
  }

  /**
   * Anzahl an Zeichen, aber der Vorschlagsliste geladen werden soll. Wenn nicht gesetzt wird die
   * Vorschlagsliste ab dem dritten Zeichen geladen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Integer getAutocompleteMinCharCount() {
    return this.autocompleteMinCharCount;
  }

  /**
   * Anzahl an Zeichen, aber der Vorschlagsliste geladen werden soll. Wenn nicht gesetzt wird die
   * Vorschlagsliste ab dem dritten Zeichen geladen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setAutocompleteMinCharCount(final Integer autocompleteMinCharCount) {
    this.autocompleteMinCharCount = autocompleteMinCharCount;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof AdditionalStringAjaxAutocompleteConfigV1)) return false;
    final AdditionalStringAjaxAutocompleteConfigV1 other = (AdditionalStringAjaxAutocompleteConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$autocompleteMinCharCount = this.getAutocompleteMinCharCount();
    final Object other$autocompleteMinCharCount = other.getAutocompleteMinCharCount();
    if (this$autocompleteMinCharCount == null ? other$autocompleteMinCharCount != null : !this$autocompleteMinCharCount.equals(other$autocompleteMinCharCount)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof AdditionalStringAjaxAutocompleteConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $autocompleteMinCharCount = this.getAutocompleteMinCharCount();
    result = result * PRIME + ($autocompleteMinCharCount == null ? 43 : $autocompleteMinCharCount.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "AdditionalStringAjaxAutocompleteConfigV1(autocompleteMinCharCount=" + this.getAutocompleteMinCharCount() + ")";
  }
}

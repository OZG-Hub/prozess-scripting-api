// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form;

import java.util.ArrayList;
import java.util.List;
import de.seitenbau.serviceportal.scripting.api.v1.form.condition.section.SkipConditionV1;
import lombok.NonNull;

/**
 * Abschnitt in einem Formular.
 */
public class FormSectionV1 {
  /**
   * Überschrift des Abschnitts.
   */
  private String title;
  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @NonNull
  private List<FieldGroupInterfaceV1> fieldGroups;
  /**
   * Bedingungen zum Überspringen des Abschnitts.
   * Werden alle Bedingungen zu {@code true} ausgewertet, wird der Abschnitt übersprungen.
   * Ansonsten wie gewohnt angezeigt.
   */
  @NonNull
  private List<SkipConditionV1> skipConditions;

  @SuppressWarnings("all")
  @lombok.Generated
  private static List<FieldGroupInterfaceV1> $default$fieldGroups() {
    return new ArrayList<>();
  }

  @SuppressWarnings("all")
  @lombok.Generated
  private static List<SkipConditionV1> $default$skipConditions() {
    return new ArrayList<>();
  }

  /**
   * Creates a new {@code FormSectionV1} instance.
   *
   * @param title Überschrift des Abschnitts.
   * @param fieldGroups Feldgruppen dieses Abschnitts. Default ist leere Liste.
   * @param skipConditions Bedingungen zum Überspringen des Abschnitts.
   * Werden alle Bedingungen zu {@code true} ausgewertet, wird der Abschnitt übersprungen.
   * Ansonsten wie gewohnt angezeigt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  FormSectionV1(final String title, @NonNull final List<FieldGroupInterfaceV1> fieldGroups, @NonNull final List<SkipConditionV1> skipConditions) {
    if (fieldGroups == null) {
      throw new NullPointerException("fieldGroups is marked non-null but is null");
    }
    if (skipConditions == null) {
      throw new NullPointerException("skipConditions is marked non-null but is null");
    }
    this.title = title;
    this.fieldGroups = fieldGroups;
    this.skipConditions = skipConditions;
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static class FormSectionV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String title;
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean fieldGroups$set;
    @SuppressWarnings("all")
    @lombok.Generated
    private List<FieldGroupInterfaceV1> fieldGroups$value;
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean skipConditions$set;
    @SuppressWarnings("all")
    @lombok.Generated
    private List<SkipConditionV1> skipConditions$value;

    @SuppressWarnings("all")
    @lombok.Generated
    FormSectionV1Builder() {
    }

    /**
     * Überschrift des Abschnitts.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormSectionV1.FormSectionV1Builder title(final String title) {
      this.title = title;
      return this;
    }

    /**
     * Feldgruppen dieses Abschnitts. Default ist leere Liste.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormSectionV1.FormSectionV1Builder fieldGroups(@NonNull final List<FieldGroupInterfaceV1> fieldGroups) {
      if (fieldGroups == null) {
        throw new NullPointerException("fieldGroups is marked non-null but is null");
      }
      this.fieldGroups$value = fieldGroups;
      fieldGroups$set = true;
      return this;
    }

    /**
     * Bedingungen zum Überspringen des Abschnitts.
     * Werden alle Bedingungen zu {@code true} ausgewertet, wird der Abschnitt übersprungen.
     * Ansonsten wie gewohnt angezeigt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormSectionV1.FormSectionV1Builder skipConditions(@NonNull final List<SkipConditionV1> skipConditions) {
      if (skipConditions == null) {
        throw new NullPointerException("skipConditions is marked non-null but is null");
      }
      this.skipConditions$value = skipConditions;
      skipConditions$set = true;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public FormSectionV1 build() {
      List<FieldGroupInterfaceV1> fieldGroups$value = this.fieldGroups$value;
      if (!this.fieldGroups$set) fieldGroups$value = FormSectionV1.$default$fieldGroups();
      List<SkipConditionV1> skipConditions$value = this.skipConditions$value;
      if (!this.skipConditions$set) skipConditions$value = FormSectionV1.$default$skipConditions();
      return new FormSectionV1(this.title, fieldGroups$value, skipConditions$value);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "FormSectionV1.FormSectionV1Builder(title=" + this.title + ", fieldGroups$value=" + this.fieldGroups$value + ", skipConditions$value=" + this.skipConditions$value + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static FormSectionV1.FormSectionV1Builder builder() {
    return new FormSectionV1.FormSectionV1Builder();
  }

  /**
   * Überschrift des Abschnitts.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getTitle() {
    return this.title;
  }

  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @NonNull
  @SuppressWarnings("all")
  @lombok.Generated
  public List<FieldGroupInterfaceV1> getFieldGroups() {
    return this.fieldGroups;
  }

  /**
   * Bedingungen zum Überspringen des Abschnitts.
   * Werden alle Bedingungen zu {@code true} ausgewertet, wird der Abschnitt übersprungen.
   * Ansonsten wie gewohnt angezeigt.
   */
  @NonNull
  @SuppressWarnings("all")
  @lombok.Generated
  public List<SkipConditionV1> getSkipConditions() {
    return this.skipConditions;
  }

  /**
   * Überschrift des Abschnitts.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setTitle(final String title) {
    this.title = title;
  }

  /**
   * Feldgruppen dieses Abschnitts. Default ist leere Liste.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setFieldGroups(@NonNull final List<FieldGroupInterfaceV1> fieldGroups) {
    if (fieldGroups == null) {
      throw new NullPointerException("fieldGroups is marked non-null but is null");
    }
    this.fieldGroups = fieldGroups;
  }

  /**
   * Bedingungen zum Überspringen des Abschnitts.
   * Werden alle Bedingungen zu {@code true} ausgewertet, wird der Abschnitt übersprungen.
   * Ansonsten wie gewohnt angezeigt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSkipConditions(@NonNull final List<SkipConditionV1> skipConditions) {
    if (skipConditions == null) {
      throw new NullPointerException("skipConditions is marked non-null but is null");
    }
    this.skipConditions = skipConditions;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FormSectionV1)) return false;
    final FormSectionV1 other = (FormSectionV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$title = this.getTitle();
    final Object other$title = other.getTitle();
    if (this$title == null ? other$title != null : !this$title.equals(other$title)) return false;
    final Object this$fieldGroups = this.getFieldGroups();
    final Object other$fieldGroups = other.getFieldGroups();
    if (this$fieldGroups == null ? other$fieldGroups != null : !this$fieldGroups.equals(other$fieldGroups)) return false;
    final Object this$skipConditions = this.getSkipConditions();
    final Object other$skipConditions = other.getSkipConditions();
    if (this$skipConditions == null ? other$skipConditions != null : !this$skipConditions.equals(other$skipConditions)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof FormSectionV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $title = this.getTitle();
    result = result * PRIME + ($title == null ? 43 : $title.hashCode());
    final Object $fieldGroups = this.getFieldGroups();
    result = result * PRIME + ($fieldGroups == null ? 43 : $fieldGroups.hashCode());
    final Object $skipConditions = this.getSkipConditions();
    result = result * PRIME + ($skipConditions == null ? 43 : $skipConditions.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "FormSectionV1(title=" + this.getTitle() + ", fieldGroups=" + this.getFieldGroups() + ", skipConditions=" + this.getSkipConditions() + ")";
  }
}

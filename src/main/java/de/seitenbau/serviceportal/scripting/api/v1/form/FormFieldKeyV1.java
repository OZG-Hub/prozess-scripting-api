// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form;

import lombok.NonNull;

/**
 * Ein eindeutiger Key einer Feldinstanz.
 * Die Klasse ist immutable, d.h. die Attribute können nach dem Erzeugen nicht mehr geändert werden.
 */
public class FormFieldKeyV1 {
  /**
   * Trennzeichen für String-Darstellung.
   */
  private static final String SEPARATOR = ":";
  /**
   * ID der Feldgruppen-Instanz.
   */
  @NonNull
  private final String groupId;
  /**
   * Index der Feldgruppen-Instanz.
   */
  private final int groupIndex;
  /**
   * ID des Feldes innerhalb der Feldgruppen-Instanz.
   */
  @NonNull
  private final String fieldId;

  /**
   * Erzeugt eine neue FormFieldKey-Instanz basierend auf dem gegebenen String, der eine String-Repräsentation
   * eines FormFieldKeys sein muss.
   *
   * @param key String-Repräsentation eines FormFieldKey, nicht {@code null}
   *
   * @throws NullPointerException Wenn der gegebene String {@code null} oder leer ist
   * @throws IllegalArgumentException Wenn der gegebene String nicht aus genau drei Teilen getrennt durch
   * {@link #SEPARATOR} besteht oder wenn der Gruppenindex nicht als Zahl interpretiert werden konnte
   */
  public FormFieldKeyV1(String key) {
    if (key == null || key.isEmpty()) {
      throw new NullPointerException(String.format("Parameter %s darf nicht null oder leer sein.", key));
    }
    String[] parts = key.split(SEPARATOR);
    if (parts.length != 3) {
      throw new IllegalArgumentException(String.format("Parameter %s muss den Separator %s zweimal enthalten.", key, SEPARATOR));
    }
    groupId = parts[0];
    try {
      groupIndex = Integer.parseInt(parts[1]);
    } catch (NumberFormatException e) {
      throw new IllegalArgumentException(String.format("GroupIndex %s muss vom Typ int sein.", parts[1]));
    }
    fieldId = parts[2];
  }

  /**
   * Erzeugt eine neue FormFieldKey-Instanz aus einer Feldgruppeninstanz und einem Feld.
   * Der FormFieldKey zeigt dann auf das Feld in der Feldgruppe.
   * Es wird durch die Methode nicht geprüft, ob sich das Feld tatsächlich in der Feldgruppe befindet,
   * ist dies nicht der Fall, so könnte der erzeugte FormFieldKey ins Leere zeigen.
   *
   * @param group die Feldgruppeninstanz des Feldes, nicht {@code null}
   * @param field das Feld, nicht {@code null}
   */
  public FormFieldKeyV1(FieldGroupInstanceV1 group, FormFieldV1 field) {
    groupId = group.getId();
    groupIndex = group.getIndex();
    fieldId = field.getId();
  }

  /**
   * Erzeugt eine String-Repräsentation des Keys.
   * Diese besteht aus Gruppen-ID, Gruppeninstanzindex und Feld-ID, jeweils getrennt durch {@link #SEPARATOR}.
   *
   * @return eine String-Repräsentation des Keys, niemals {@code null}.
   */
  @Override
  public String toString() {
    return groupId + SEPARATOR + groupIndex + SEPARATOR + fieldId;
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static class FormFieldKeyV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String groupId;
    @SuppressWarnings("all")
    @lombok.Generated
    private int groupIndex;
    @SuppressWarnings("all")
    @lombok.Generated
    private String fieldId;

    @SuppressWarnings("all")
    @lombok.Generated
    FormFieldKeyV1Builder() {
    }

    /**
     * ID der Feldgruppen-Instanz.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormFieldKeyV1.FormFieldKeyV1Builder groupId(@NonNull final String groupId) {
      if (groupId == null) {
        throw new NullPointerException("groupId is marked non-null but is null");
      }
      this.groupId = groupId;
      return this;
    }

    /**
     * Index der Feldgruppen-Instanz.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormFieldKeyV1.FormFieldKeyV1Builder groupIndex(final int groupIndex) {
      this.groupIndex = groupIndex;
      return this;
    }

    /**
     * ID des Feldes innerhalb der Feldgruppen-Instanz.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FormFieldKeyV1.FormFieldKeyV1Builder fieldId(@NonNull final String fieldId) {
      if (fieldId == null) {
        throw new NullPointerException("fieldId is marked non-null but is null");
      }
      this.fieldId = fieldId;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public FormFieldKeyV1 build() {
      return new FormFieldKeyV1(this.groupId, this.groupIndex, this.fieldId);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "FormFieldKeyV1.FormFieldKeyV1Builder(groupId=" + this.groupId + ", groupIndex=" + this.groupIndex + ", fieldId=" + this.fieldId + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static FormFieldKeyV1.FormFieldKeyV1Builder builder() {
    return new FormFieldKeyV1.FormFieldKeyV1Builder();
  }

  /**
   * ID der Feldgruppen-Instanz.
   */
  @NonNull
  @SuppressWarnings("all")
  @lombok.Generated
  public String getGroupId() {
    return this.groupId;
  }

  /**
   * Index der Feldgruppen-Instanz.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public int getGroupIndex() {
    return this.groupIndex;
  }

  /**
   * ID des Feldes innerhalb der Feldgruppen-Instanz.
   */
  @NonNull
  @SuppressWarnings("all")
  @lombok.Generated
  public String getFieldId() {
    return this.fieldId;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FormFieldKeyV1)) return false;
    final FormFieldKeyV1 other = (FormFieldKeyV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.getGroupIndex() != other.getGroupIndex()) return false;
    final Object this$groupId = this.getGroupId();
    final Object other$groupId = other.getGroupId();
    if (this$groupId == null ? other$groupId != null : !this$groupId.equals(other$groupId)) return false;
    final Object this$fieldId = this.getFieldId();
    final Object other$fieldId = other.getFieldId();
    if (this$fieldId == null ? other$fieldId != null : !this$fieldId.equals(other$fieldId)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof FormFieldKeyV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + this.getGroupIndex();
    final Object $groupId = this.getGroupId();
    result = result * PRIME + ($groupId == null ? 43 : $groupId.hashCode());
    final Object $fieldId = this.getFieldId();
    result = result * PRIME + ($fieldId == null ? 43 : $fieldId.hashCode());
    return result;
  }

  /**
   * Creates a new {@code FormFieldKeyV1} instance.
   *
   * @param groupId ID der Feldgruppen-Instanz.
   * @param groupIndex Index der Feldgruppen-Instanz.
   * @param fieldId ID des Feldes innerhalb der Feldgruppen-Instanz.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public FormFieldKeyV1(@NonNull final String groupId, final int groupIndex, @NonNull final String fieldId) {
    if (groupId == null) {
      throw new NullPointerException("groupId is marked non-null but is null");
    }
    if (fieldId == null) {
      throw new NullPointerException("fieldId is marked non-null but is null");
    }
    this.groupId = groupId;
    this.groupIndex = groupIndex;
    this.fieldId = fieldId;
  }
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;

/**
 * Feldwert für GDIK Geokarten-Felder ({@link FieldTypeV1#GDIK_MAP GDIK_MAP}).
 *
 * @see BinaryGDIKMapContentV1
 */
public class GDIKMapContentV1 {
  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  private String json;
  /**
   * JSON der selektierten Objekte auf der Karte. {@code null} wenn keine Elemente ausgewählt wurden.
   */
  private String selectionJson;

  /**
   * Creates a new {@code GDIKMapContentV1} instance.
   *
   * @param json JSON der Nutzereingaben auf der Karte.
   * @param selectionJson JSON der selektierten Objekte auf der Karte. {@code null} wenn keine Elemente ausgewählt wurden.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  GDIKMapContentV1(final String json, final String selectionJson) {
    this.json = json;
    this.selectionJson = selectionJson;
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static class GDIKMapContentV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String json;
    @SuppressWarnings("all")
    @lombok.Generated
    private String selectionJson;

    @SuppressWarnings("all")
    @lombok.Generated
    GDIKMapContentV1Builder() {
    }

    /**
     * JSON der Nutzereingaben auf der Karte.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GDIKMapContentV1.GDIKMapContentV1Builder json(final String json) {
      this.json = json;
      return this;
    }

    /**
     * JSON der selektierten Objekte auf der Karte. {@code null} wenn keine Elemente ausgewählt wurden.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public GDIKMapContentV1.GDIKMapContentV1Builder selectionJson(final String selectionJson) {
      this.selectionJson = selectionJson;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public GDIKMapContentV1 build() {
      return new GDIKMapContentV1(this.json, this.selectionJson);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "GDIKMapContentV1.GDIKMapContentV1Builder(json=" + this.json + ", selectionJson=" + this.selectionJson + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static GDIKMapContentV1.GDIKMapContentV1Builder builder() {
    return new GDIKMapContentV1.GDIKMapContentV1Builder();
  }

  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getJson() {
    return this.json;
  }

  /**
   * JSON der selektierten Objekte auf der Karte. {@code null} wenn keine Elemente ausgewählt wurden.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSelectionJson() {
    return this.selectionJson;
  }

  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setJson(final String json) {
    this.json = json;
  }

  /**
   * JSON der selektierten Objekte auf der Karte. {@code null} wenn keine Elemente ausgewählt wurden.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSelectionJson(final String selectionJson) {
    this.selectionJson = selectionJson;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof GDIKMapContentV1)) return false;
    final GDIKMapContentV1 other = (GDIKMapContentV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$json = this.getJson();
    final Object other$json = other.getJson();
    if (this$json == null ? other$json != null : !this$json.equals(other$json)) return false;
    final Object this$selectionJson = this.getSelectionJson();
    final Object other$selectionJson = other.getSelectionJson();
    if (this$selectionJson == null ? other$selectionJson != null : !this$selectionJson.equals(other$selectionJson)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof GDIKMapContentV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $json = this.getJson();
    result = result * PRIME + ($json == null ? 43 : $json.hashCode());
    final Object $selectionJson = this.getSelectionJson();
    result = result * PRIME + ($selectionJson == null ? 43 : $selectionJson.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "GDIKMapContentV1(json=" + this.getJson() + ", selectionJson=" + this.getSelectionJson() + ")";
  }
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;

/**
 * Submitteter Feldwert eines Geokarten-Feldes ({@link FieldTypeV1#GEO_MAP GEO_MAP}).
 *
 * @see GeoMapContentV1
 */
public class BinaryGeoMapContentV1 {
  /**
   * Datei, welches die Karte mit Nutzereingaben darstellt.
   */
  private BinaryContentV1 file;
  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  private String json;


  @SuppressWarnings("all")
  public static class BinaryGeoMapContentV1Builder {
    @SuppressWarnings("all")
    private BinaryContentV1 file;
    @SuppressWarnings("all")
    private String json;

    @SuppressWarnings("all")
    BinaryGeoMapContentV1Builder() {
    }

    /**
     * Datei, welches die Karte mit Nutzereingaben darstellt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public BinaryGeoMapContentV1.BinaryGeoMapContentV1Builder file(final BinaryContentV1 file) {
      this.file = file;
      return this;
    }

    /**
     * JSON der Nutzereingaben auf der Karte.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public BinaryGeoMapContentV1.BinaryGeoMapContentV1Builder json(final String json) {
      this.json = json;
      return this;
    }

    @SuppressWarnings("all")
    public BinaryGeoMapContentV1 build() {
      return new BinaryGeoMapContentV1(this.file, this.json);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "BinaryGeoMapContentV1.BinaryGeoMapContentV1Builder(file=" + this.file + ", json=" + this.json + ")";
    }
  }

  @SuppressWarnings("all")
  public static BinaryGeoMapContentV1.BinaryGeoMapContentV1Builder builder() {
    return new BinaryGeoMapContentV1.BinaryGeoMapContentV1Builder();
  }

  /**
   * Datei, welches die Karte mit Nutzereingaben darstellt.
   */
  @SuppressWarnings("all")
  public BinaryContentV1 getFile() {
    return this.file;
  }

  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  @SuppressWarnings("all")
  public String getJson() {
    return this.json;
  }

  /**
   * Datei, welches die Karte mit Nutzereingaben darstellt.
   */
  @SuppressWarnings("all")
  public void setFile(final BinaryContentV1 file) {
    this.file = file;
  }

  /**
   * JSON der Nutzereingaben auf der Karte.
   */
  @SuppressWarnings("all")
  public void setJson(final String json) {
    this.json = json;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof BinaryGeoMapContentV1)) return false;
    final BinaryGeoMapContentV1 other = (BinaryGeoMapContentV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$file = this.getFile();
    final Object other$file = other.getFile();
    if (this$file == null ? other$file != null : !this$file.equals(other$file)) return false;
    final Object this$json = this.getJson();
    final Object other$json = other.getJson();
    if (this$json == null ? other$json != null : !this$json.equals(other$json)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof BinaryGeoMapContentV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $file = this.getFile();
    result = result * PRIME + ($file == null ? 43 : $file.hashCode());
    final Object $json = this.getJson();
    result = result * PRIME + ($json == null ? 43 : $json.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "BinaryGeoMapContentV1(file=" + this.getFile() + ", json=" + this.getJson() + ")";
  }

  @SuppressWarnings("all")
  public BinaryGeoMapContentV1() {
  }

  @SuppressWarnings("all")
  public BinaryGeoMapContentV1(final BinaryContentV1 file, final String json) {
    this.file = file;
    this.json = json;
  }
}

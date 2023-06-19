// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.config;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.storage.StorageConfigV1;

/**
 * Konfiguration für Datei-Felder ({@link FieldTypeV1#FILE FILE} und
 * {@link FieldTypeV1#MULTIPLE_FILE MULTIPLE_FILE}).
 */
public class AdditionalFileConfigV1 implements AdditionalFieldConfigV1 {
  /**
   * {@code true}, wenn Bilddateien beim Upload komprimiert werden sollen. Sonst {@code false}.
   */
  private boolean compress;
  /**
   * Konfiguration, wenn hochgeladene Dateien auf einer externen Dateiablage gespeichert werden sollen.
   * Nur für Multiupload-Felder ({@link FieldTypeV1#MULTIPLE_FILE MULTIPLE_FILE}).
   */
  private StorageConfigV1 storage;

  @Override
  public AdditionalFileConfigV1 clone() {
    try {
      return (AdditionalFileConfigV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  AdditionalFileConfigV1(final boolean compress, final StorageConfigV1 storage) {
    this.compress = compress;
    this.storage = storage;
  }


  @SuppressWarnings("all")
  public static class AdditionalFileConfigV1Builder {
    @SuppressWarnings("all")
    private boolean compress;
    @SuppressWarnings("all")
    private StorageConfigV1 storage;

    @SuppressWarnings("all")
    AdditionalFileConfigV1Builder() {
    }

    /**
     * {@code true}, wenn Bilddateien beim Upload komprimiert werden sollen. Sonst {@code false}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalFileConfigV1.AdditionalFileConfigV1Builder compress(final boolean compress) {
      this.compress = compress;
      return this;
    }

    /**
     * Konfiguration, wenn hochgeladene Dateien auf einer externen Dateiablage gespeichert werden sollen.
     * Nur für Multiupload-Felder ({@link FieldTypeV1#MULTIPLE_FILE MULTIPLE_FILE}).
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public AdditionalFileConfigV1.AdditionalFileConfigV1Builder storage(final StorageConfigV1 storage) {
      this.storage = storage;
      return this;
    }

    @SuppressWarnings("all")
    public AdditionalFileConfigV1 build() {
      return new AdditionalFileConfigV1(this.compress, this.storage);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "AdditionalFileConfigV1.AdditionalFileConfigV1Builder(compress=" + this.compress + ", storage=" + this.storage + ")";
    }
  }

  @SuppressWarnings("all")
  public static AdditionalFileConfigV1.AdditionalFileConfigV1Builder builder() {
    return new AdditionalFileConfigV1.AdditionalFileConfigV1Builder();
  }

  /**
   * {@code true}, wenn Bilddateien beim Upload komprimiert werden sollen. Sonst {@code false}.
   */
  @SuppressWarnings("all")
  public boolean isCompress() {
    return this.compress;
  }

  /**
   * Konfiguration, wenn hochgeladene Dateien auf einer externen Dateiablage gespeichert werden sollen.
   * Nur für Multiupload-Felder ({@link FieldTypeV1#MULTIPLE_FILE MULTIPLE_FILE}).
   */
  @SuppressWarnings("all")
  public StorageConfigV1 getStorage() {
    return this.storage;
  }

  /**
   * {@code true}, wenn Bilddateien beim Upload komprimiert werden sollen. Sonst {@code false}.
   */
  @SuppressWarnings("all")
  public void setCompress(final boolean compress) {
    this.compress = compress;
  }

  /**
   * Konfiguration, wenn hochgeladene Dateien auf einer externen Dateiablage gespeichert werden sollen.
   * Nur für Multiupload-Felder ({@link FieldTypeV1#MULTIPLE_FILE MULTIPLE_FILE}).
   */
  @SuppressWarnings("all")
  public void setStorage(final StorageConfigV1 storage) {
    this.storage = storage;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof AdditionalFileConfigV1)) return false;
    final AdditionalFileConfigV1 other = (AdditionalFileConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.isCompress() != other.isCompress()) return false;
    final Object this$storage = this.getStorage();
    final Object other$storage = other.getStorage();
    if (this$storage == null ? other$storage != null : !this$storage.equals(other$storage)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof AdditionalFileConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isCompress() ? 79 : 97);
    final Object $storage = this.getStorage();
    result = result * PRIME + ($storage == null ? 43 : $storage.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "AdditionalFileConfigV1(compress=" + this.isCompress() + ", storage=" + this.getStorage() + ")";
  }
}
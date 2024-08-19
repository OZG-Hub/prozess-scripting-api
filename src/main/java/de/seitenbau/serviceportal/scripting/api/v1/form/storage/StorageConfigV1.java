package de.seitenbau.serviceportal.scripting.api.v1.form.storage;

/**
 * Interface für die externen Dateiablagen für den Multidatei-Upload.
 */
public interface StorageConfigV1 extends Cloneable
{
  /**
   * Erstellt eine Kopie des aktuellen {@link StorageConfigV1} Objekts.
   *
   * @return Eine Kopie des aktuellen Objekts.
   */
  StorageConfigV1 clone();
}

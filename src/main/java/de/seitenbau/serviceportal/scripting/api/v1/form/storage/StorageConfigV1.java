package de.seitenbau.serviceportal.scripting.api.v1.form.storage;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface für die externen Dateiablagen für den Multidatei-Upload.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = NextcloudStorageConfigV1.class, name = "NextcloudStorageConfig")
})
public interface StorageConfigV1 extends Cloneable
{
  /**
   * Erstellt eine Kopie des aktuellen {@link StorageConfigV1} Objekts.
   *
   * @return Eine Kopie des aktuellen Objekts.
   */
  StorageConfigV1 clone();
}

package de.seitenbau.serviceportal.scripting.api.v1;

import de.seitenbau.serviceportal.scripting.api.v1.form.content.BinaryContentV1;

/**
 * Scripting API Version 1 Schnittstelle für das Speichern von Daten im Dateisystem.
 * Mit der globalen Variable {@code apiV1.dataStorage} kann die DataStorage-API in einem Groovy-Scripttask
 * eingebunden und die hier dokumentierten Methoden verwendet werden.
 *
 * @since Release 1.174
 */
public interface DataStorageApiV1
{
  /**
   * Ermöglicht es, Daten im Dateisystem abzulegen und mit einer Referenz auf diese Daten zu arbeiten.
   * Auf diese Weise werden große Datenmengen nicht in der Datenbank abgelegt.
   *
   * @param data die zu speichernden Daten als Byte-Array
   *
   * @return Referenz auf die gespeicherten Daten; das Attribut label ist nicht gesetzt, mimetype ist
   * application/octet-stream, uploadedFilename ist eine UUID
   *
   * @throws IllegalArgumentException falls der Parameter {@code data} den Wert {@code null} hat
   */
  BinaryContentV1 toBinaryContent(byte[] data);
}

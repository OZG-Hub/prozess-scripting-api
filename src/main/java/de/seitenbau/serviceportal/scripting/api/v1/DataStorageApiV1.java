package de.seitenbau.serviceportal.scripting.api.v1;

import java.util.List;

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
   * <p>
   * Nach dem Ende der Hauptprozessinstanz, im Rahmen derer die Daten gespeichert wurde, bleiben die Daten
   * noch für bis zu 182 Tage erhalten und werden anschließend automatisch gelöscht.
   *
   * @param data die zu speichernden Daten als Byte-Array
   *
   * @return Referenz auf die gespeicherten Daten; das Attribut label ist nicht gesetzt, mimetype ist
   * application/octet-stream, uploadedFilename ist eine UUID
   *
   * @throws IllegalArgumentException falls der Parameter {@code data} den Wert {@code null} hat
   */
  BinaryContentV1 toBinaryContent(byte[] data);

  /**
   * Speichert Daten im Dateisystem und gibt ein verschlüsseltes Zugriffstoken zurück.
   * Diese Methode wird nur auf der Prozess-Engine V2 unterstützt.
   * <p>
   * Die Methode kann genutzt werden, um Daten zwischen Prozessen zu teilen. Eine Prozessinstanz, der
   * gegebenen ProzessKeys, kann die Daten über die Methode
   * {@link #readFromFileAccessor(String) readFromFileAccessor} abrufen.
   * <p>
   * Nach dem Ende der Hauptprozessinstanz, im Rahmen derer die Daten gespeichert wurde, bleiben die Daten
   * noch für bis zu 182 Tage erhalten und werden anschließend automatisch gelöscht.
   *
   * @param data die zu speichernden Daten als Byte-Array
   * @param targetProcessDefinitionKeys ProzessKeys, die Zugriff auf die Daten erhalten sollen
   *
   * @return verschlüsseltes Token zum Lesen der Daten
   *
   * @throws IllegalArgumentException falls {@code data} oder {@code targetProcessDefinitionKeys} den Wert
   * {@code null} haben
   *
   * @since Release 1.208
   */
  String saveAndReturnFileAccessor(byte[] data, List<String> targetProcessDefinitionKeys);

  /**
   * Liest die Daten aus dem durch den File-Accessor referenzierten Speicher.
   * Diese Methode wird nur auf der Prozess-Engine V2 unterstützt.
   * <p>
   * Nach dem Ende der Hauptprozessinstanz, im Rahmen derer die Daten gespeichert wurden, bleiben die Daten
   * noch für bis zu 182 Tage erhalten und werden anschließend automatisch gelöscht.
   *
   * @param fileAccessor das verschlüsselte Token, das den Speicherort und die Zugriffsberechtigung definiert
   *
   * @return die gelesenen Daten als Byte-Array
   *
   * @throws IllegalArgumentException falls der Parameter {@code fileAccessor} den Wert {@code null} hat
   *
   * @since Release 1.208
   */
  byte[] readFromFileAccessor(String fileAccessor);
}

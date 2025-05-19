package de.seitenbau.serviceportal.scripting.api.v1;

/**
 * Scripting API Version 1 Schnittstelle für die Fortschrittsanzeige.
 * <p>
 * Mit der globalen Variable {@code apiV1.progress} kann die Fortschritts-API in einen Groovy-Scripttask
 * eingebunden werden und die hier dokumentierten Methoden verwenden.
 */
public interface ProgressApiV1
{
  /**
   * Setzt die Punkte der Fortschrittsanzeige.<br>
   * z.B. {@code apiV1.progress.items = ['One', 'Two', 'Three'] }<br>
   * Der erste Punkt wird als aktiv gesetzt. Weitere Punkte sind im Zustand ausstehend.
   * Keine #items übergeben, um die Fortschrittsanzeige zu entfernen<br>
   * z.B. {@code apiV1.progress.items = null }
   * oder {@code apiV1.progress.setItems() }.
   *
   * @param items die Punkte der Fortschrittsanzeige
   *
   * @throws NullPointerException Falls eine der #items {@code null} ist
   */
  void setItems(String... items);

  /**
   * Setzt den aktiven Punkt in der Fortschrittsanzeige. <br>
   * Punkte vor dem aktiven Punkt werden in den Zustand abgeschlossen gesetzt.<br>
   * Die Punkte nach dem aktiven Punkt werden in den Status ausstehend gesetzt.<br>
   *
   * @param item aktiven Punkt
   *
   * @throws IllegalStateException Falls die Fortschrittspunkte mit {@link #setItems(String...)} noch nicht
   * gesetzt worden sind.
   * @throws IllegalArgumentException Falls der Punkt {@code item} nicht in der Liste der Fortschrittspunkte
   * enthalten ist.
   */
  void setActiveItem(String item);

  /**
   * Setzt, dass der gegebene Punkt in der Fortschrittsanzeige übersprungen werden soll.
   * Wird dieser Punkt auf {@link #setActiveItem(String) aktiv} gesetzt, werden folgende Formular-Tasks
   * im Prozess übersprungen. Die Formular-Tasks werden durch die Plattform abgeschlossen und die nächsten
   * User-Tasks werden dem Antragssteller als aktuelle Aufgabe im Prozess angezeigt.
   *
   * @param item zu überspringender Punkt
   *
   * @throws IllegalStateException Falls die Fortschrittspunkte mit {@link #setItems(String...)} noch nicht
   * gesetzt worden sind.
   * @throws IllegalArgumentException Falls der Punkt {@code item} nicht in der Liste der Fortschrittspunkte
   * enthalten ist oder der gegebene Punkt der aktive Punkt, ein bereits abgeschlossener Punkt ist oder
   * direkt auf den aktuell aktiven Punkt folgt.
   * @since Release 1.193
   */
  void setSkippedItem(String item);
}
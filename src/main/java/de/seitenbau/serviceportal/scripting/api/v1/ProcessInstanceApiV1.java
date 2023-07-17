package de.seitenbau.serviceportal.scripting.api.v1;

/**
 * Scripting API Version 1 Schnittstelle für die Prozessinstanz.
 * <p>
 * Mit der globalen Variable {@code apiV1.processInstance} kann die Prozessinstanz-API in einen
 * Groovy-Scripttask eingebunden und die hier dokumentierten Methoden verwendet werden.
 */
public interface ProcessInstanceApiV1
{
  /**
   * Gibt die ID der Hauptprozessinstanz zurück.
   *
   * @return ID der Hauptprozessinstanz
   */
  String getRootId();

  /**
   * Gibt die ID der aktiven Prozessinstanz zurück.
   *
   * @return ID der aktiven Prozessinstanz
   */
  String getId();

  /**
   * Gibt die Definition-ID der Hauptprozessinstanz zurück.
   *
   * @return Definition-ID der Hauptprozessinstanz
   */
  String getRootDefinitionId();

  /**
   * Gibt den Definition-Key der Hauptprozessinstanz zurück.
   *
   * @return Definition-Key der Hauptprozessinstanz
   */
  String getRootDefinitionKey();

  /**
   * Gibt die Definition-ID der aktiven Prozessinstanz zurück.
   *
   * @return Definition-ID der aktiven Prozessinstanz
   */
  String getDefinitionId();

  /**
   * Gibt den Definition-Key der aktiven Prozessinstanz zurück.
   *
   * @return Definition-Key der aktiven Prozessinstanz
   */
  String getDefinitionKey();
}

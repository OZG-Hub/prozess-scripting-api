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
}

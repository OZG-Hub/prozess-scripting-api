package de.seitenbau.serviceportal.scripting.api.v1.register;

/**
 * Status des Registertasks.
 */
public enum RegisterTaskResultStatusV1
{
  /**
   * Erfolgreich.
   * Die Registerdaten wurden erfolgreich abgerufen.
   */
  SUCCESSFUL,

  /**
   * Übersprungen.
   * Der Antragssteller hat ausgewählt, dass die Registerdaten anderweitig bereitgestellt werden sollen.
   */
  ABORT,

  /**
   * Fehlerhaft.
   * Die Registerdaten konnten nicht erfolgreich abgerufen werden.
   */
  ERROR
}

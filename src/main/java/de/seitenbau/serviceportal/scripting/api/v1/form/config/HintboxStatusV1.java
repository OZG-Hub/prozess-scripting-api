package de.seitenbau.serviceportal.scripting.api.v1.form.config;

/**
 * Enum zum Status der Hinweisbox.
 * Der Status beeinflusst die Darstellung (Farbgebung) der Hinweisbox.
 */
public enum HintboxStatusV1
{
  /** Erfolgreich. */
  SUCCESS,

  /** Fehler. */
  ERROR,

  /** Frage. */
  QUESTION,

  /** Information. */
  INFO
}
package de.seitenbau.serviceportal.scripting.api.v1.start;

/**
 * Kontotyp des Benutzers, der den Prozess gestartet hat.
 */
public enum ServicekontoContextTypeV1
{
  /** Persönliches Servicekonto **/
  STANDARD,

  /** Organisationskonto **/
  ORGANISATIONSKONTO,

  /** Behördenkonto **/
  BEHOERDENKONTO,

  /** Nutzerkonto Bund **/
  BUND,

  /** ELSTER-Unternehmenskonto **/
  NEZO_STNR
}

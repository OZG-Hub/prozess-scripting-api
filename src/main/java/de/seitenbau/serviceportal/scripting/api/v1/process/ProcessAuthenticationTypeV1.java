package de.seitenbau.serviceportal.scripting.api.v1.process;

/**
 * Arten von Authentifizierungsmechanismen die ein Prozess nutzen kann.
 */
public enum ProcessAuthenticationTypeV1
{
  /**
   * Authentifizierung über das Servicekonto
   */
  SERVICEKONTO,
  /**
   * Authentifizierung über BundID
   */
  BUND_ID,
  /**
   * Authentifizierung über MUK/Elster
   */
  MUK
}

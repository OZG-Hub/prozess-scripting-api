package de.seitenbau.serviceportal.scripting.api.v1.exception;

/**
 * Exception, die geworfen wird, wenn versucht wurde Daten von Jesaja abzufragen und dies aus technischen
 * Gründen nicht möglich war.
 */
public class JesajaException extends RuntimeException
{
  /**
   * Erstellt eine neue {@link JesajaException}.
   *
   * @param message Die Nachricht der Exception, beschreibt was fehlgeschlagen ist.
   * @param cause Die Ursache der Exception.
   */
  public JesajaException(String message, Throwable cause)
  {
    super(message, cause);
  }
}

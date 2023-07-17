package de.seitenbau.serviceportal.scripting.api.v1;

/**
 * Scripting API Version 1 Schnittstelle für den Logger.
 * <p>
 * Mit der globalen Variable {@code apiV1.logger} kann die Logger-API in einen
 * Groovy-Scripttask eingebunden und die hier dokumentierten Methoden verwendet werden.
 * Der Logger verwendet die Definition-ID des Hauptprozesses als Namen.
 */
public interface LoggerApiV1
{
  /**
   * Schreibt einen log-Eintrag mit Level {@code INFO}.
   *
   * @param msg Nachricht des log-Eintrags
   */
  void info(String msg);

  /**
   * Schreibt einen log-Eintrag mit Level {@code INFO}.
   *
   * @param msg Nachricht des log-Eintrags
   * @param t zu loggende Fehlermeldung
   */
  void info(String msg, Throwable t);

  /**
   * Schreibt einen log-Eintrag mit Level {@code WARN}.
   *
   * @param msg Nachricht des log-Eintrags
   */
  void warn(String msg);

  /**
   * Schreibt einen log-Eintrag mit Level {@code WARN}.
   *
   * @param msg Nachricht des log-Eintrags
   * @param t zu loggende Fehlermeldung
   */
  void warn(String msg, Throwable t);
}

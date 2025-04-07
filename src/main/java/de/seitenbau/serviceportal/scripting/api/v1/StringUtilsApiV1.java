package de.seitenbau.serviceportal.scripting.api.v1;

/**
 * Scripting API Version 1 Schnittstelle mit Methoden zur Arbeit mit Strings.
 * <p>
 * Mit der globalen Variable {@code apiV1.stringUtils} kann die StringUtils-API in einen Groovy-Scripttask
 * eingebunden werden und die hier dokumentierten Methoden verwendet werden.
 *
 * @since Release 1.191
 */
public interface StringUtilsApiV1
{
  /**
   * HTML-escaped den gegebenen String. Dabei werden Zeichen, die in HTML eine spezielle Bedeutung haben,
   * durch HTML-Elemente ersetzt, um so zu verhindern, dass die Zeichen fälschlicherweise als HTML
   * interpretiert werden könnten. So wird z.B. {@code <} durch {@code &lt;} ersetzt.
   *
   * @param str Der zu escapende String
   *
   * @return Der maskierte String. {@code null} wenn der String {@code null} war
   * @since Release 1.191
   */
  String escapeHtml(String str);

  /**
   * Bereinigt den gegeben HTML-String. Der String wird als HTML geparst. Ungültige oder nicht
   * vertrauenswürdige HTML-Elemente werden entfernt. Die Liste der vertrauenswürdigen HTML-Elemente kann
   * <a href="https://jsoup.org/apidocs/org/jsoup/safety/Safelist.html#relaxed()">hier</a>, in
   * der Dokumentation von {@code Safelist#relaxed} von jsoup gefunden werden.
   *
   * @param str Der zu bereinigende String
   *
   * @return Der bereinigte String. {@code null} wenn der String {@code null} war
   * @since Release 1.191
   */
  String cleanHtml(String str);
}

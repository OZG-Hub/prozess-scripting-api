package de.seitenbau.serviceportal.scripting.api.v1;

import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;
import de.seitenbau.serviceportal.scripting.api.v1.start.StartParameterV1;

/**
 * Interface der Scripting-API Version 1.
 * <p>
 * Über die globale Variable {@code apiV1} kann die Scripting-API in einen Groovy-Scripttask eingebunden und
 * die hier dokumentierten Methoden verwendet werden.
 */
public interface ScriptingApiV1
{
  /**
   * Gibt den Wert einer Prozessinstanzvariable des Prozesses vom Typ {@code <T>} zurück.
   * <p>
   * Interne Klassen (Klassen aus formular-api, prozess-api und api-common) werden in die entsprechenden
   * Scripting-API-Objekte umgewandelt. Für Standard-Datentypen ist der Typ der Prozessinstanzvariable ggf.
   * nicht mehr exakt der Typ, der als Wert geschrieben wurde. Mehr Informationen zur Typ-Umwandlung können in
   * der JavaDoc der Methode {@link #setVariable(String, Object) setVariable} gefunden werden.
   *
   * @param name Name der Prozessinstanzvariable, nicht {@code null}
   * @param clazz Typ der Prozessinstanzvariable, oder {@code null}, falls kein expliziter Typ bekannt ist
   * @param <T> Typ der Prozessinstanzvariable
   *
   * @return Wert der Prozessinstanzvariablen, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls {@code name} gleich {@code null} ist
   * @throws ClassCastException Falls die Prozessinstanzvariable nicht vom Typ {@code <T>} ist
   * @see #getVariable(String)
   */
  <T> T getVariable(String name, Class<T> clazz);

  /**
   * Gibt den Wert einer Prozessinstanzvariable des Prozesses zurück.
   * <p>
   * Interne Klassen (Klassen aus formular-api, prozess-api und api-common) werden in die entsprechenden
   * Scripting-API-Objekte umgewandelt. Für Standard-Datentypen ist der Typ der Prozessinstanzvariable ggf.
   * nicht mehr exakt der Typ, der als Wert geschrieben wurde. Mehr Informationen zur Typ-Umwandlung können in
   * der JavaDoc der Methode {@link #setVariable(String, Object) setVariable} gefunden werden.
   *
   * @param name Name der Prozessinstanzvariable, nicht {@code null}
   *
   * @return Die Prozessinstanzvariable, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls {@code name} gleich {@code null} ist
   * @see #getVariable(String, Class)
   */
  default Object getVariable(String name)
  {
    return getVariable(name, null);
  }

  /**
   * Schreibt den gegebenen Wert in eine Prozessinstanzvariable des Prozesses.
   * <p>
   * <b>Hinweis zu unterstützten Typen:</b>
   * <br>
   * Nicht alle Typen von Werten können gespeichert werden. So können unter anderem keine mehrdimensionalen
   * Arrays und beispielsweise auch keine Daten vom Typ {@link java.time.Instant} gespeichert werden.
   * Primitive Datentypen, Klassen der Scripting-API, Klassen der Datentypen von Feldwerten, sowie
   * eindimensionale Arrays, Listen, Sets und Maps dieser Typen können geschrieben werden. Klassen der
   * formular-api oder api-common (z.B. FormAndMapping oder BinaryContent) können nicht gespeichert werden.
   * <p>
   * <b>Hinweis zu Typumwandlungen:</b>
   * <br>
   * Nicht alle Typen von Werten werden in exakt ihrem Wert gespeichert. Entsprechend ist der exakte Typ der
   * Variable beim Auslesen ein anderer als beim Speichern. Dies gilt für die folgenden Typen:
   * <ul>
   * <li>
   * Für Werte vom Typ {@link java.util.Map Map} werden
   * {@link java.util.LinkedHashMap LinkedHashMap}, {@link java.util.WeakHashMap WeakHashMap} und
   * {@link java.util.concurrent.ConcurrentHashMap ConcurrentHashMap} in genau diesem Typ gespeichert. Alle
   * anderen Maps werden als {@link java.util.HashMap HashMap} gespeichert.</li>
   * <li>
   * Für Werte vom Typ {@link java.util.List List} wird nur {@link java.util.LinkedList LinkedList} in
   * ihrem Typ gespeichert. Alle anderen Listen werden als {@link java.util.ArrayList ArrayList}
   * gespeichert.</li>
   * <li>
   * Für Werte vom Typ {@link java.util.Set Set} wird nur {@link java.util.LinkedHashSet LinkedHashSet} in
   * ihrem Typ gespeichert. Alle anderen Sets werden als {@link java.util.HashSet HashSet} gespeichert.</li>
   * </ul>
   *
   * @param name Name der Prozessinstanzvariable, nicht {@code null}
   * @param value Wert der Prozessinstanzvariable
   *
   * @throws NullPointerException Falls {@code name} gleich {@code null} ist
   * @throws IllegalArgumentException Falls der übergebene Wert nicht geschrieben werden kann, weil der Typ
   * nicht unterstützt wird
   */
  void setVariable(String name, Object value);

  /**
   * Entfernt eine Prozessinstanzvariable des Prozesses.
   *
   * @param name Name der Prozessinstanzvariable, nicht {@code null}
   */
  void removeVariable(String name);

  /**
   * Gibt die Formulardefinition des Formulars mit der übergebenen ID zurück.
   * Das Formular muss in der Sprache deutsch deployt sein.
   *
   * @param id Die ID des Formulars, nicht {@code null}
   *
   * @return Das Formular, oder {@code null} falls nicht vorhanden oder falls {@code id} gleich {@code null}
   * oder der leere String ist
   */
  FormV1 getForm(String id);

  /**
   * Gibt den beim Start eines Prozesses / Erzeugen einer Prozessinstanz zur Verfügung gestellt StartParameter
   * zurück.
   *
   * @return Der StartParameter, nicht {@code null}.
   * @throws IllegalStateException Falls der StartParameter nicht aufgerufen werden konnte
   */
  StartParameterV1 getStartParameter();

  /**
   * Gibt die Prozessinstanz-API zurück.
   *
   * @return die Prozessinstanz-API, nie {@code null}
   */
  ProcessInstanceApiV1 getProcessInstance();

  /**
   * Gibt die Parameter-API zurück.
   *
   * @return die Parameter-API, nie {@code null}
   */
  ParameterApiV1 getParameter();

  /**
   * Gibt die API der Fortschrittsanzeige zurück.
   *
   * @return die API der Fortschrittsanzeige, nie {@code null}
   */
  ProgressApiV1 getProgress();

  /**
   * Gibt die Jesaja-API zurück.
   *
   * @return die Jesaja-API, nie {@code null}
   * @throws IllegalStateException Falls die Methode auf anderen Plattformen als dem OZG-Hub verwendet wird
   */
  JesajaApiV1 getJesaja();

  /**
   * Gibt einen Logger zurück. Der Name des Loggers enthält den Definition-Key der Hauptprozessinstanz.
   *
   * @return ein Logger, nie {@code null}
   */
  LoggerApiV1 getLogger();

  /**
   * Gibt die Verschlüsselungs-API zurück.
   *
   * @return die Verschlüsselungs-API, nie {@code null}
   * @since Release 1.169
   */
  CryptoApiV1 getCrypto();

  /**
   * Gibt die Mapper-API zurück.
   *
   * @return die Mapper-API, nie {@code null}
   * @since Release 1.169
   */
  MapperApiV1 getMapper();

  /**
   * Gibt die DataStorage-API zurück.
   *
   * @return die DataStorage-API, nie {@code null}
   * @since Release 1.174
   */
  DataStorageApiV1 getDataStorage();
}
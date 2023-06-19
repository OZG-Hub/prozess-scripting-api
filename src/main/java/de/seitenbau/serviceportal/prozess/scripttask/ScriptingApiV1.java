package de.seitenbau.serviceportal.prozess.scripttask;

import de.seitenbau.serviceportal.scripting.api.v1.exception.InvalidParameterTypeException;
import de.seitenbau.serviceportal.scripting.api.v1.form.FormV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.PossibleValueListV1;

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
   * Gibt die ID der Hauptprozessinstanz zurück.
   *
   * @return ID der Hauptprozessinstanz
   */
  String getRootProcessInstanceId();

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
   * Gibt den Wert eines Prozessparameters einer Organisationseinheit (OE) oder des Prozesses vom Typ
   * {@code <T>} zurück.
   * <p>
   * Auf service-bw und Amt24 werden die folgenden Typen unterstützt:
   * <ul>
   *   <li>{@code Object.class} für Parameter vom Typ {@code JSON_OBJECT}</li>
   *   <li>{@code String.class} für Parameter vom Typ {@code STRING}</li>
   *   <li>{@code byte[].class} für Parameter vom Typ {@code BINARY}</li>
   *   <li>{@code Map.class} für Parameter vom Typ {@code JSON_STRING_MAP}</li>
   *   <li>{@link PossibleValueListV1} für spezielle Parameter vom Typ {@code JSON_STRING_MAP}</li>
   * </ul>
   * Auf OZG-Hub darf nur {@code String.class} als Typ verwendet werden.
   *
   * @param oeId ID der Organisationseinheit
   * @param name Name des Prozessparameters, nicht {@code null}
   * @param clazz Typ des Prozessparameters, nicht {@code null}
   * @param <T> Typ des Prozessparameters
   *
   * @return Wert des Prozessparameters, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls {@code name} oder {@code clazz} gleich {@code null} sind
   * @throws IllegalArgumentException Falls der Typ {@code <T>} nicht unterstützt wird
   * @throws InvalidParameterTypeException Falls der tatsächliche Typ des Parameters nicht zum übergebenen
   * Typ des Parameters passt
   */
  <T> T getParameter(String oeId, String name, Class<T> clazz);

  /**
   * Gibt den Wert eines String-Prozessparameters des Prozesses vom Typ {@code <T>} zurück.
   * Wird diese Methode auf OZG-Hub aufgerufen, wird immer eine NullPointerException geworfen, da die ID einer
   * Organisationseinheit fehlt.
   *
   * @param name Name des Prozessparameters, nicht {@code null}
   *
   * @return Wert des Prozessparameters, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls diese Methode auf OZG-Hub verwendet wird oder falls {@code name}
   * gleich {@code null} ist
   * @throws IllegalArgumentException Falls der Typ {@code <T>} nicht unterstützt wird
   * @throws InvalidParameterTypeException Falls der tatsächliche Typ des Parameters nicht zum übergebenen
   * Typ des Parameters passt
   */
  default String getParameter(String name)
  {
    return getParameter(null, name, String.class);
  }

  /**
   * Gibt den Wert eines Prozessparameters des Prozesses vom Typ {@code <T>} zurück.
   * <p>
   * Wird diese Methode auf OZG-Hub aufgerufen, wird immer eine NullPointerException geworfen, da die ID einer
   * Organisationseinheit fehlt.
   * Auf service-bw und Amt24 werden die folgenden Typen unterstützt:
   * <ul>
   *  <li>{@code Object.class} für Parameter vom Typ {@code JSON_OBJECT}</li>
   *   <li>{@code String.class} für Parameter vom Typ {@code STRING}</li>
   *   <li>{@code byte[].class} für Parameter vom Typ {@code BINARY}</li>
   *   <li>{@code Map.class} für Parameter vom Typ {@code JSON_STRING_MAP}</li>
   *   <li>{@link PossibleValueListV1} für spezielle Parameter vom Typ {@code JSON_STRING_MAP}</li>
   * </ul>
   *
   * @param name Name des Prozessparameters, nicht {@code null}
   * @param clazz Typ des Prozessparameters, nicht {@code null}
   * @param <T> Typ des Prozessparameters
   *
   * @return Wert des Prozessparameters, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls diese Methode auf OZG-Hub verwendet wird oder falls {@code name} oder
   * {@code clazz} gleich {@code null} sind
   * @throws IllegalArgumentException Falls der Typ {@code <T>} nicht unterstützt wird
   * @throws InvalidParameterTypeException Falls der tatsächliche Typ des Parameters nicht zum übergebenen
   * Typ des Parameters passt
   */
  default <T> T getParameter(String name, Class<T> clazz)
  {
    return getParameter(null, name, clazz);
  }

  /**
   * Gibt den Wert eines String-Prozessparameters einer Organisationseinheit (OE) oder des Prozesses zurück.
   *
   * @param oeId ID der Organisationseinheit
   * @param name Name des Prozessparameters, nicht {@code null}
   *
   * @return Wert des Prozessparameters, oder {@code null} falls nicht vorhanden
   * @throws NullPointerException Falls {@code name} gleich {@code null} ist
   * @throws InvalidParameterTypeException Falls der tatsächliche Typ des Parameters nicht zum übergebenen
   * Typ des Parameters passt
   */
  default String getParameter(String oeId, String name)
  {
    return getParameter(oeId, name, String.class);
  }

  /**
   * Gibt den Wert eines Prozessparameters einer Organisationseinheit (OE) und Leistung vom Typ {@code String}
   * zurück. Der Parameter wird anhand der Parameter bei Jesaja abgerufen.
   * <p>
   * Diese Methode wird nur auf dem OZG-Hub unterstützt.
   *
   * @param oeId ID der Organisationseinheit
   * @param leistungId ID der Leistung
   * @param name Name des Prozessparameters, nicht {@code null}
   *
   * @return Wert des Prozessparameters, oder {@code null} falls nicht vorhanden
   * @throws IllegalStateException Falls die Methode auf anderen Plattform als dem OZG-Hub verwendet wird
   * @throws NullPointerException Falls {@code oeId} oder {@code name} gleich {@code null} sind
   * @throws IllegalArgumentException Falls {@code oeId} oder {@code name} der leere String sind
   * @throws RuntimeException Falls beim Abrufen des Parameters ein Fehler aufgetreten ist
   */
  String getParameter(String oeId, String leistungId, String name);

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
}
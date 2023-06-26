package de.seitenbau.serviceportal.scripting.api.v1;

import de.seitenbau.serviceportal.scripting.api.v1.exception.InvalidParameterTypeException;
import de.seitenbau.serviceportal.scripting.api.v1.form.PossibleValueListV1;

/**
 * Scripting API Version 1 Schnittstelle für Prozessparameter.
 * <p>
 * Mit der globalen Variable {@code apiV1.parameter} kann die Parameter-API in einen Groovy-Scripttask
 * eingebunden und die hier dokumentierten Methoden verwendet werden.
 */
public interface ParameterApiV1
{
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
  <T> T get(String oeId, String name, Class<T> clazz);

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
  default String get(String name)
  {
    return get(null, name, String.class);
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
  default <T> T get(String name, Class<T> clazz)
  {
    return get(null, name, clazz);
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
  default String get(String oeId, String name)
  {
    return get(oeId, name, String.class);
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
  String get(String oeId, String leistungId, String name);
}

package de.seitenbau.serviceportal.scripting.api.v1;

import java.util.Map;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.ajax.ScriptSourcePropertiesV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.validator.ExternalValidatorV1;

/**
 * Interface der Scripting-API Version 1 für Skripte in Formularen.
 * <p>
 * Über die globale Variable {@code formApiV1} kann diese API in einen Groovy-Script eingebunden und
 * die hier dokumentierten Methoden verwendet werden.
 */
public interface FormScriptingApiV1
{
  /**
   * Gibt die Id des Formulars zurück in dem sich das auszuführende Skript befindet
   *
   * @return Id des Formulars
   */
  String getFormId();

  /**
   * Gibt den Key des Feldes zurück, an dem das auszuführende Skript definiert ist.
   *
   * @return Key des Feldes
   */
  String getFieldKey();

  /**
   * Gib die Klasse des erwarteten Returntypes zurück.
   *
   * @return Klasse des Returntypes.
   * <ul>
   *   <li> Für das Attribut {@code externalDataSourceProperties} und
   *        {@link FieldTypeV1#DROPDOWN_SINGLE_SELECT_AJAX}-Felder gleich {@code PossibleValueListV1.class}
   *   <li> Für das Attribut {@code externalDataSourceProperties} und
   *        {@link FieldTypeV1#STRING_AJAX_AUTOCOMPLETE}-Felder gleich {@code PossibleValueListV1.class}
   *   <li> Für das Attribut {@code externalValue} die Klasse des Werts des Feldes
   *   <li> Für das Attribut {@code settings} im {@link ExternalValidatorV1} gleich {@code List.class}
   * </ul>
   *
   */
  Class<?> getReturnType();

  /**
   * Gibt die im {@link ScriptSourcePropertiesV1#scope} definierten Felder und deren Werte als Map zurück
   *
   * @return Map von Key zu Wert der definierten Felder
   */
  Map<String, Object> getReferenceFieldValues();
}

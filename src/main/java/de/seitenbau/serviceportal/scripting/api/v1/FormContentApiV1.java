package de.seitenbau.serviceportal.scripting.api.v1;

import java.util.List;

import de.seitenbau.serviceportal.scripting.api.v1.form.FormFieldKeyV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.MessageTypeV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.content.FormContentV1;
import de.seitenbau.serviceportal.scripting.api.v1.form.content.FormFieldContentV1;

/**
 * Scripting API Version 1 Schnittstelle mit Methoden zur Arbeit mit {@link FormContentV1}.
 * <p>
 * Mit der globalen Variable {@code apiV1.formContent} kann die FormContent-API in einen
 * Groovy-Scripttask eingebunden und die hier dokumentierten Methoden verwendet werden.
 *
 * @since Release 1.191
 */
public interface FormContentApiV1
{
  /**
   * Setzt den Wert des gegebenen Feldes im {@link FormContentV1} in der gegebenen Prozessinstanzvariable.
   *
   * @param variableName Name der Prozessinstanzvariable in der ein FormContentV1-Objekt steht
   * @param fieldKey {@link FormFieldKeyV1 FormFieldKey} des Feldes
   * @param value Wert der gesetzt wird
   *
   * @throws NullPointerException Falls {@code variableName} oder {@code fieldKey} {@code null} ist
   * @throws IllegalArgumentException Falls die Prozessinstanzvariable {@code variableName} oder
   * das Feld im FormContent nicht existiert
   * @throws ClassCastException Falls der Wert der Prozessinstanzvariable kein {@link FormContentV1} ist
   * @see FormContentV1#setFieldValue(String, Object)
   * @since Release 1.191
   */
  void setFieldValue(String variableName, FormFieldKeyV1 fieldKey, Object value);

  /**
   * Setzt die Validierungsmeldungen des gegebenen Feldes im {@link FormContentV1} in der gegebenen
   * Prozessinstanzvariable. Die gegebenen Strings werden als Validierungsmeldungen vom Typ
   * {@link MessageTypeV1#INTERNAL INTERNAL} gesetzt. Existierende Validierungsmeldung werden überschrieben.
   *
   * @param variableName Name der Prozessinstanzvariable in der ein FormContentV1-Objekt steht
   * @param fieldKey {@link FormFieldKeyV1 FormFieldKey} des Feldes
   * @param messages Validierungsmeldungen die gesetzt werden
   *
   * @throws NullPointerException Falls {@code variableName} oder {@code fieldKey} {@code null} ist
   * @throws IllegalArgumentException Falls die Prozessinstanzvariable {@code variableName} oder
   * das Feld im FormContent nicht existiert
   * @throws ClassCastException Falls der Wert der Prozessinstanzvariable kein {@link FormContentV1} ist
   * @see FormFieldContentV1#addValidationMessage(String)
   * @since Release 1.191
   */
  void setFieldValidationMessages(String variableName, FormFieldKeyV1 fieldKey, List<String> messages);

  /**
   * Ergänzt eine Validierungsmeldung am gegebenen Feld im {@link FormContentV1} in der gegebenen
   * Prozessinstanzvariable. Der gegebene String wird als Validierungsmeldung vom Typ
   * {@link MessageTypeV1#INTERNAL INTERNAL} hinzugefügt.
   *
   * @param variableName Name der Prozessinstanzvariable in der ein FormContentV1-Objekt steht
   * @param fieldKey {@link FormFieldKeyV1 FormFieldKey} des Feldes
   * @param message Validierungsmeldung, die hinzugefügt wird
   *
   * @throws NullPointerException Falls {@code variableName} oder {@code fieldKey} {@code null} ist
   * @throws IllegalArgumentException Falls die Prozessinstanzvariable {@code variableName} oder
   * das Feld im FormContent nicht existiert
   * @throws ClassCastException Falls der Wert der Prozessinstanzvariable kein {@link FormContentV1} ist
   * @see FormFieldContentV1#addValidationMessage(String)
   * @since Release 1.191
   */
  void addFieldValidationMessage(String variableName, FormFieldKeyV1 fieldKey, String message);

  /**
   * Setzt die Validierungsmeldungen des {@link FormContentV1} in der gegebenen
   * Prozessinstanzvariable. Die gegebenen Strings werden als Validierungsmeldungen vom Typ
   * {@link MessageTypeV1#INTERNAL INTERNAL} gesetzt. Existierende Validierungsmeldung werden überschrieben.
   *
   * @param variableName Name der Prozessinstanzvariable in der ein FormContentV1-Objekt steht
   * @param messages Validierungsmeldungen die gesetzt werden
   *
   * @throws NullPointerException Falls {@code variableName} {@code null} ist
   * @throws IllegalArgumentException Falls die Prozessinstanzvariable {@code variableName} nicht vorhanden
   * ist
   * @throws ClassCastException Falls der Wert der Prozessinstanzvariable kein {@link FormContentV1} ist
   * @see FormContentV1#addValidationMessage(String)
   * @since Release 1.191
   */
  void setValidationMessages(String variableName, List<String> messages);

  /**
   * Ergänzt eine Validierungsmeldungen am {@link FormContentV1} in der gegebenen
   * Prozessinstanzvariable. Der gegebene String wird als Validierungsmeldungen vom Typ
   * {@link MessageTypeV1#INTERNAL INTERNAL} hinzugefügt.
   *
   * @param variableName Name der Prozessinstanzvariable in der ein FormContentV1-Objekt steht
   * @param message Validierungsmeldung, die hinzugefügt wird
   *
   * @throws NullPointerException Falls {@code variableName} {@code null} ist
   * @throws IllegalArgumentException Falls die Prozessinstanzvariable {@code variableName} nicht vorhanden
   * ist
   * @throws ClassCastException Falls der Wert der Prozessinstanzvariable kein {@link FormContentV1} ist
   * @see FormContentV1#addValidationMessage(String)
   * @since Release 1.191
   */
  void addValidationMessage(String variableName, String message);
}

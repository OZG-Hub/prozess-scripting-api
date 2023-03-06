package de.seitenbau.serviceportal.scripting.api.v1.form.ajax;

/**
 * Enum zur Bestimmung wie die Felder, deren Daten bei einem Ajax-Aufruf mitgeschickt werden sollen, bestimmt
 * werden sollen.
 *
 * @see ExternalDataSourcePropertiesV1
 */
public enum AjaxRequestIncludedFieldsScopeV1
{
  /** Es werden keine Feldwerte mitgeschickt. */
  EMPTY,

  /** Es wird nur der Wert des aktuellen Feldes mitgeschickt. */
  CURRENT_FIELD,

  /** Es werten die Werte aller Felder der Feldgruppeninstanz des aktuellen Feldes mitgeschickt. */
  CURRENT_INSTANCE,

  /** Es werden die Werte der definierten Felder mitgeschickt. */
  DEFINED
}
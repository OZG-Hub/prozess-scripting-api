package de.seitenbau.serviceportal.scripting.api.v1.form;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;

/**
 * Enum der Typen von Feldwerten von verifizierten Feldwerten.
 *
 * @see VerifiedFormFieldValueV1
 */
public enum ValueTypeV1
{
  /** Feldwert ist {@code null}. */
  NULL,

  /**
   * Feldwert ist ein String.
   */
  STRING,

  /**
   * Feldwert ist ein Datum vom Typ LocalDate.
   * Nur verfügbar für Formularen in Engine-Version 2.
   */
  LOCAL_DATE,

  /**
   * Feldwert ist ein Datum.
   */
  DATE,

  /**
   * Feldwert ist eine Uhrzeit.
   * Nur verfügbar für Formulare in Engine-Version 2.
   */
  TIME;

  /**
   * Ermittelt den Typen eines Wertes.
   *
   * @param value Der Wert, für den der Typ ermittelt werden soll.
   *
   * @return Der ermittelte Typ des Wertes.
   */
  public static ValueTypeV1 getTypeOfValue(Object value)
  {
    if (value == null)
    {
      return NULL;
    }
    if (String.class.equals(value.getClass()))
    {
      return STRING;
    }
    if (LocalDate.class.equals(value.getClass()))
    {
      return LOCAL_DATE;
    }
    if (LocalTime.class.equals(value.getClass()))
    {
      return TIME;
    }
    if (Date.class.equals(value.getClass()))
    {
      return DATE;
    }
    if (value instanceof VerifiedFormFieldValueV1)
    {
      return getTypeOfValue(((VerifiedFormFieldValueV1) value).getValue());
    }

    throw new IllegalArgumentException(
        String.format("Value hat keinen bekannten Typ: %s.", value.getClass().getName()));
  }
}

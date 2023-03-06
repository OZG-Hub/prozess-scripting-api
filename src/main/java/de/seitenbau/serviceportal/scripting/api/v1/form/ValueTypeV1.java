package de.seitenbau.serviceportal.scripting.api.v1.form;

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

  /** Feldwert ist ein String. */
  STRING,

  /** Feldwert ist ein Datum. */
  DATE;

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
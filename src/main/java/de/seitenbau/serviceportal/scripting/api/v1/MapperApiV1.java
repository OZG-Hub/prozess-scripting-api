package de.seitenbau.serviceportal.scripting.api.v1;

/**
 * Scripting API Version 1 Schnittstelle zur Abbildung von Objekten nach JSON oder Byte-Arrays und umgekehrt.
 * <p>
 * Mit der globalen Variable {@code apiV1.mapper} kann die Mapper-API in einen Groovy-Scripttask
 * eingebunden werden und die hier dokumentierten Methoden verwendet werden.
 *
 * @since Release 1.169
 */
public interface MapperApiV1
{
  /**
   * Konvertiert ein Objekt in seine JSON Repräsentation.
   *
   * @param value Das zu konvertierende Objekt
   *
   * @return JSON als String
   */
  String toJson(Object value);

  /**
   * Konvertiert ein Objekt in seine JSON Repräsentation mit Einrückung.
   *
   * @param value Das zu konvertierende Objekt
   *
   * @return JSON als String
   */
  String toJsonFormatted(Object value);

  /**
   * Konvertiert ein Objekt in seine JSON Repräsentation.
   *
   * @param value Das zu konvertierende Objekt
   *
   * @return JSON als Byte-Array. Entspricht funktionell dem Aufruf von toJson(value).getBytes(UTF-8),
   * ist aber effizienter.
   */
  byte[] toJsonBytes(Object value);

  /**
   * Konvertiert die JSON Repräsentation eines Objekts in das Java-Objekt.
   *
   * @param json Die JSON Repräsentation eines Objekts
   * @param clazz Die Klasse des zurückzugebenden Java-Objekts
   * @param <T> Der Typ des zurückzugebenden Java-Objekts
   *
   * @return das Java-Objekt
   */
  <T> T toObject(String json, Class<T> clazz);

  /**
   * Konvertiert die JSON Repräsentation eines Objekts in das Java-Objekt.
   *
   * @param jsonBytes Die JSON Repräsentation eines Objekts
   * @param clazz Die Klasse des zurückzugebenden Java-Objekts
   * @param <T> Der Typ des zurückzugebenden Java-Objekts
   *
   * @return das Java-Objekt
   */
  <T> T toObject(byte[] jsonBytes, Class<T> clazz);

  /**
   * Konvertiert eine String in Bytes mittels UTF-8-Kodierung.
   *
   * @param string Die in Bytes zu konvertierende Strings
   *
   * @return Das resultierende Byte-Array
   */
  byte[] toBytes(String string);

  /**
   * Konvertiert ein Byte-Array in einen String durch Dekodierung der Bytes mit UFT-8.
   *
   * @param utf8StringBytes Das zu konvertierende Byte-Array
   *
   * @return Das String-Objekt
   */
  String toString(byte[] utf8StringBytes);
}


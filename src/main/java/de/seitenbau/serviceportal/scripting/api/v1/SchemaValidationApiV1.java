package de.seitenbau.serviceportal.scripting.api.v1;

import java.util.List;

import de.seitenbau.serviceportal.scripting.api.v1.form.ajax.ProxyTypeV1;

/**
 * Interface der Schema-Validation-API Version 1.
 * <p>
 * Hierüber können JSON- und XML-Daten gegen Schemas validiert werden.
 */
public interface SchemaValidationApiV1
{
  /**
   * Validiert das gegebene JSON gegen das gegebene Schema.
   * <p>
   * Enthält das JSON-Schema keine Version wird "Draft 2020-12" verwendet. Externe Schema-Referenzen werden
   * nicht unterstützt.
   *
   * @param json JSON das validiert werden soll
   * @param schemaUrl URL zum JSON-Schema
   * @param proxy Proxy der zum Laden des Schemas benötigt wird, sonst {@code null}
   *
   * @return Liste der Validierungsfehler. Wenn das JSON gültig ist, wird eine leere Liste zurückgegeben.
   * @throws NullPointerException Wenn {@code json} oder {@code schemaUrl} {@code null} ist
   * @throws IllegalArgumentException Wenn {@code json} kein gültiges JSON ist oder {@code schemaUrl} keine
   * gültige URL ist
   * @throws RuntimeException Wenn das Schema nicht von der URL geladen werden konnte
   */
  List<String> validateJson(String json, String schemaUrl, ProxyTypeV1 proxy);

  /**
   * Validiert das gegebene XML gegen das gegebene Schema.
   * <p>
   * Externe Schema-Referenzen ({@code http://javax.xml.XMLConstants/property/accessExternalSchema}) und
   * externe DTDs ({@code http://javax.xml.XMLConstants/property/accessExternalDTD}) werden nicht unterstützt.
   *
   * @param xml XML das validiert werden soll
   * @param schemaUrl URL zum XML-Schema
   * @param proxy Proxy der zum Laden des Schemas benötigt wird, sonst {@code null}
   *
   * @return Liste der Validierungsfehler. Wenn das XML gültig ist, wird eine leere Liste zurückgegeben.
   * @throws NullPointerException Wenn {@code xml} oder {@code schemaUrl} {@code null} ist
   * @throws IllegalArgumentException Wenn {@code xml} kein gültiges XML ist oder {@code schemaUrl} keine
   * gültige URL ist
   * @throws RuntimeException Wenn das Schema nicht von der URL geladen werden konnte
   */
  List<String> validateXml(String xml, String schemaUrl, ProxyTypeV1 proxy);
}

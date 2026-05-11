package de.seitenbau.serviceportal.scripting.api.v1.form.config;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface für alle ergänzenden Feldtyp-spezifischen Konfigurationen.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type")
@JsonSubTypes({
    @JsonSubTypes.Type(
        value = AdditionalVideoConfigV1.class,
        name = "AdditionalVideoConfig"),
    @JsonSubTypes.Type(
        value = AdditionalCheckboxConfigV1.class,
        name = "AdditionalCheckboxConfig"),
    @JsonSubTypes.Type(
        value = AdditionalDateConfigV1.class,
        name = "AdditionalDateConfig"),
    @JsonSubTypes.Type(
        value = AdditionalDropdownSingleSelectConfigV1.class,
        name = "AdditionalDropdownSingleSelectConfig"),
    @JsonSubTypes.Type(
        value = AdditionalDropdownSingleSelectAjaxConfigV1.class,
        name = "AdditionalDropdownSingleSelectAjaxConfig"),
    @JsonSubTypes.Type(
        value = AdditionalImageConfigV1.class,
        name = "AdditionalImageConfig"),
    @JsonSubTypes.Type(
        value = AdditionalHintboxConfigV1.class,
        name = "AdditionalHintboxConfig"),
    @JsonSubTypes.Type(
        value = AdditionalFileConfigV1.class,
        name = "AdditionalFileConfig"),
    @JsonSubTypes.Type(
        value = AdditionalKfzKennzeichenConfigV1.class,
        name = "AdditionalKfzKennzeichenConfig"),
    @JsonSubTypes.Type(
        value = AdditionalRadioButtonConfigV1.class,
        name = "AdditionalRadioButtonConfig"),
    @JsonSubTypes.Type(
        value = AdditionalBooleanConfigV1.class,
        name = "AdditionalBooleanConfig"),
    @JsonSubTypes.Type(
        value = AdditionalPdfConfigV1.class,
        name = "AdditionalPdfConfig"),
    @JsonSubTypes.Type(
        value = AdditionalStringAjaxAutocompleteConfigV1.class,
        name = "AdditionalStringAjaxAutocompleteConfig"),
    @JsonSubTypes.Type(
        value = AdditionalKfzUeberfuehrungsKennzeichenConfigV1.class,
        name = "AdditionalKfzUeberfuehrungsKennzeichenConfig"),
    @JsonSubTypes.Type(
        value = AdditionalKfzKurzzeitKennzeichenConfigV1.class,
        names = {"AdditionalKfzKurzzeitKennzeichenConfig", "AdditionalKfzKurzzeitkennzeichenConfig"}),
    @JsonSubTypes.Type(
        value = AdditionalKfzRotesKennzeichenConfigV1.class,
        name = "AdditionalKfzRotesKennzeichenConfig"),
    @JsonSubTypes.Type(
        value = AdditionalGeoMapConfigV1.class,
        name = "AdditionalGeoMapConfig"),
    @JsonSubTypes.Type(
        value = AdditionalMonthYearFormatConfigV1.class,
        name = "AdditionalMonthYearFormatConfig"),
    @JsonSubTypes.Type(
        value = AdditionalGDIKMapConfigV1.class,
        name = "AdditionalGDIKMapConfig"),
    @JsonSubTypes.Type(
        value = AdditionalElterngeldBezugszeitraumConfigV1.class,
        name = "AdditionalElterngeldBezugszeitraumConfig"),
})
public interface AdditionalFieldConfigV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AdditionalFieldConfigV1 clone();
}

package de.seitenbau.serviceportal.scripting.api.v1.form;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

/**
 * Interface für die Feldgruppen im Formular.
 * <p>
 * Zwei Typen von Feldgruppen werden unterstützt: die reguläre Feldgruppe und das Medien-Akkordeon.
 * Reguläre Feldgruppen werden durch die Klasse {@link FieldGroupV1} und ihre Instanzen durch
 * {@link FieldGroupInstanceV1} repräsentiert. Das Medien-Akkordeon durch {@link MediaAccordionV1}.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "@type", defaultImpl = FieldGroupV1.class)
@JsonSubTypes({
    @JsonSubTypes.Type(value = FieldGroupV1.class),
    @JsonSubTypes.Type(value = MediaAccordionV1.class)
})
public interface FieldGroupInterfaceV1
{
}

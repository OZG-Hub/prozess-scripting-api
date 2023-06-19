package de.seitenbau.serviceportal.scripting.api.v1.form;

import de.seitenbau.serviceportal.scripting.api.v1.form.validator.ExternalValidatorV1;

/**
 * Typen von Validierungsmeldungen.
 */
public enum MessageTypeV1
{
  /**
   * Typ für eine Validierungsmeldung, die von einem "normalen" Validator (d.h. nicht ExternalValidator)
   * erzeugt wird. Entspricht den untypisierten Fehlermeldungen im Formular.
   */
  INTERNAL,

  /**
   * Typ für eine Validierungsmeldung, die von {@link ExternalValidatorV1 ExternalValidator} erzeugt wird.
   */
  EXTERNAL,

  /**
   * Typ für eine Meldung, die von {@link ExternalValidatorV1 ExternalValidator} erzeugt wird,
   * wenn der externe Server nicht erreicht werden kann.
   */
  EXTERNAL_SERVER_ERROR
}
package de.seitenbau.serviceportal.scripting.api.v1.form.config;

/**
 * Interface für alle ergänzenden Feldtyp-spezifischen Konfigurationen.
 */
public interface AdditionalFieldConfigV1 extends Cloneable
{
  /**
   * Erstellt ein neues Objekt mit denselben Werten, des Objektes an dem diese Methode aufgerufen wurde.
   *
   * @return Ein Duplikat des Objekts an dem diese Methode aufgerufen wurde.
   */
  AdditionalFieldConfigV1 clone();
}

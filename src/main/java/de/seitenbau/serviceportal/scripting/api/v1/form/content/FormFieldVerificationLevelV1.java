package de.seitenbau.serviceportal.scripting.api.v1.form.content;

/**
 * Enum, das beschreibt, woher ein verifizierter Feldwert stammt.
 */
public enum FormFieldVerificationLevelV1
{
  /** Wert wurde aus dem NPA gelesen. */
  NPA_READOUT,

  /** Wert wurde auf Vertrauensniveau 'Basis' ausgelesen. */
  VN_BASIS_READOUT,

  /** Wert wurde auf Vertrauensniveau 'Substanziell' ausgelesen. */
  VN_SUBSTANZIELL_READOUT,

  /** Wert wurde auf Vertrauensniveau 'Hoch' ausgelesen. */
  VN_HOCH_READOUT
}
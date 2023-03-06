package de.seitenbau.serviceportal.scripting.api.v1.form;

/**
 * Möglichkeiten zur Anordnung von mehrfach ausfüllbaren Feldgruppen.
 */
public enum FieldGroupLayoutV1
{
  /** Standard Darstellung für mehrfach ausfüllbare Feldgruppe. */
  MULTIPLE,

  /** Feldgruppe wird als Tabelle dargestellt. */
  TABLE,

  /** Feldgruppe wird als Akkordeon dargestellt. */
  ACCORDION,

  /** Feldgruppe wird mit Tabs dargestellt. */
  @Deprecated
  TABS
}
package de.seitenbau.serviceportal.scripting.api.v1.form.geomap;

import de.seitenbau.serviceportal.scripting.api.v1.form.FieldTypeV1;

/**
 * Modus eines GDIK Geokarten-Feldes ({@link FieldTypeV1#GDIK_MAP GDIK_MAP}).
 */
public enum GDIKModeV1
{
  /**
   * Input. Bei diesem Modus kann der Antragssteller Elemente in die Karte einzeichnen.
   */
  INPUT,

  /**
   * Select. In diesem Modus kann der Antragssteller keine Elemente in die Karte einzeichnen. Es können
   * allerdings Elemente in der Karte ausgewählt werden.
   */
  SELECT
}

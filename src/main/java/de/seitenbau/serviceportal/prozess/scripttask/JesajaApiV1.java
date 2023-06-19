package de.seitenbau.serviceportal.prozess.scripttask;

import java.util.List;

import de.seitenbau.serviceportal.scripting.api.v1.exception.JesajaException;
import de.seitenbau.serviceportal.scripting.api.v1.jesaja.JesajaOrganisationseinheitV1;

/**
 * Scripting API Version 1 Schnittstelle für Jesaja.
 * <p>
 * Mit der globalen Variable {@code apiV1.jesaja} kann die Jesaja-API in einen Groovy-Scripttask
 * eingebunden und die hier dokumentierten Methoden verwendet werden.
 */
public interface JesajaApiV1
{
  /**
   * Gibt eine Liste an Organisationseinheiten (OE) zu einer Leistung und einem Regionalschlüssel zurück
   *
   * @param leikaId ID der Leistung
   * @param ars amtlicher Regionalschlüssel
   *
   * @return Liste von Organisationseinheiten. Leer, falls keine Organisationseinheiten gefunden.
   * @throws IllegalArgumentException Falls {@code leikaId} und {@code ars} der leere String oder {@code null}
   * sind. Oder {@code leikaId} oder {@code ars} ungültig sind.
   * @throws JesajaException Falls beim Abrufen der Organisationseinheiten ein Fehler aufgetreten ist
   */
  List<JesajaOrganisationseinheitV1> getOrganisationseinheiten(String leikaId, String ars);
}

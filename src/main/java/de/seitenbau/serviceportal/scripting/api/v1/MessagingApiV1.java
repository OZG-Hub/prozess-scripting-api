package de.seitenbau.serviceportal.scripting.api.v1;

import java.util.List;

/**
 * Interface der Messaging-API Version 1.
 * <p>
 * Hierüber können Nachrichten an Prozesse verschickt werden.
 */
public interface MessagingApiV1
{
  /**
   * Erzeugt ein Token, das für den Versand von Nachrichten an andere Prozesse nötig ist.
   *
   * @param allowedMessageNames Liste der erlaubten Message-Ids oder null, falls alle Messages erlaubt sind.
   *
   * @return Das Token zum Senden von Nachrichten.
   */
  String createMessageToken(List<String> allowedMessageNames);

  /**
   * Schickt eine BPMN-Message mit der übergebenen messageId an den Prozess, der das Token erstellt hat.
   *
   * @param token Ein Token das für den Versand nötig ist.
   * Kann mit {@link MessagingApiV1#createMessageToken(List)} erzeugt werden.
   * @param messageName Der Name der Prozessinstanzvariable in die, die Nachricht geschrieben werden soll.
   * @param payload Der Inhalt der Nachricht wird als Wert für die Prozessinstanzvariable gesetzt.
   *
   * @return Die Prozessinstanz-IDs der Prozesse, die die Nachricht empfangen haben.
   */
  List<String> sendMessage(String token, String messageName, Object payload);
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form;

/**
 * Validierungsmeldung am Formular oder Feld.
 */
public class ValidationMessageV1 {
  /**
   * Typ der Validierungsmeldung.
   */
  private MessageTypeV1 type;
  /**
   * Text der Validierungsmeldung.
   */
  private String messageText;

  public ValidationMessageV1(ValidationMessageV1 toCopy) {
    this.type = toCopy.getType();
    this.messageText = toCopy.getMessageText();
  }

  /**
   * Typ der Validierungsmeldung.
   */
  @SuppressWarnings("all")
  public MessageTypeV1 getType() {
    return this.type;
  }

  /**
   * Text der Validierungsmeldung.
   */
  @SuppressWarnings("all")
  public String getMessageText() {
    return this.messageText;
  }

  /**
   * Typ der Validierungsmeldung.
   */
  @SuppressWarnings("all")
  public void setType(final MessageTypeV1 type) {
    this.type = type;
  }

  /**
   * Text der Validierungsmeldung.
   */
  @SuppressWarnings("all")
  public void setMessageText(final String messageText) {
    this.messageText = messageText;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ValidationMessageV1)) return false;
    final ValidationMessageV1 other = (ValidationMessageV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$type = this.getType();
    final Object other$type = other.getType();
    if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
    final Object this$messageText = this.getMessageText();
    final Object other$messageText = other.getMessageText();
    if (this$messageText == null ? other$messageText != null : !this$messageText.equals(other$messageText)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof ValidationMessageV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $type = this.getType();
    result = result * PRIME + ($type == null ? 43 : $type.hashCode());
    final Object $messageText = this.getMessageText();
    result = result * PRIME + ($messageText == null ? 43 : $messageText.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "ValidationMessageV1(type=" + this.getType() + ", messageText=" + this.getMessageText() + ")";
  }

  @SuppressWarnings("all")
  public ValidationMessageV1() {
  }

  @SuppressWarnings("all")
  public ValidationMessageV1(final MessageTypeV1 type, final String messageText) {
    this.type = type;
    this.messageText = messageText;
  }
}
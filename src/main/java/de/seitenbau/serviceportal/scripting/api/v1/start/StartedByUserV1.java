// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.start;

/**
 * Informationen über den Account / Benutzer, der einen Prozess gestartet hat.
 */
public class StartedByUserV1 {
  /**
   * ID des Benutzers, der den Prozess gestartet hat. Das ist die mit Präfix "userId:" versehene
   * Organisationskonto-ID, falls diese nicht vorhanden ist, die mit Präfix "userId:" versehene
   * User-ID oder, falls diese nicht vorhanden ist, die mit Präfix "sessionId:" versehene
   * Session-ID.
   */
  private String userId;
  /**
   * Lesbarer Name des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  private String displayName;
  /**
   * Nachname des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  private String primaryName;
  /**
   * Vorname des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht oder im Kontext eines Behörden- oder Organisationskontos
   * eingeloggt war. Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  private String secondaryName;
  /**
   * Postfach-Handle des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  private String postfachHandle;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class StartedByUserV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String userId;
    @SuppressWarnings("all")
    @lombok.Generated
    private String displayName;
    @SuppressWarnings("all")
    @lombok.Generated
    private String primaryName;
    @SuppressWarnings("all")
    @lombok.Generated
    private String secondaryName;
    @SuppressWarnings("all")
    @lombok.Generated
    private String postfachHandle;

    @SuppressWarnings("all")
    @lombok.Generated
    StartedByUserV1Builder() {
    }

    /**
     * ID des Benutzers, der den Prozess gestartet hat. Das ist die mit Präfix "userId:" versehene
     * Organisationskonto-ID, falls diese nicht vorhanden ist, die mit Präfix "userId:" versehene
     * User-ID oder, falls diese nicht vorhanden ist, die mit Präfix "sessionId:" versehene
     * Session-ID.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1.StartedByUserV1Builder userId(final String userId) {
      this.userId = userId;
      return this;
    }

    /**
     * Lesbarer Name des Benutzers, der den Prozess gestartet hat.
     * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
     * Name dieses Behörden- bzw. Organisationskontos.
     * {@code null}, falls der Benutzer nicht eingeloggt war.
     * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1.StartedByUserV1Builder displayName(final String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Nachname des Benutzers, der den Prozess gestartet hat.
     * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
     * Name dieses Behörden- bzw. Organisationskontos.
     * {@code null}, falls der Benutzer nicht eingeloggt war.
     * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1.StartedByUserV1Builder primaryName(final String primaryName) {
      this.primaryName = primaryName;
      return this;
    }

    /**
     * Vorname des Benutzers, der den Prozess gestartet hat.
     * {@code null}, falls der Benutzer nicht oder im Kontext eines Behörden- oder Organisationskontos
     * eingeloggt war. Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1.StartedByUserV1Builder secondaryName(final String secondaryName) {
      this.secondaryName = secondaryName;
      return this;
    }

    /**
     * Postfach-Handle des Benutzers, der den Prozess gestartet hat.
     * {@code null}, falls der Benutzer nicht eingeloggt war.
     * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1.StartedByUserV1Builder postfachHandle(final String postfachHandle) {
      this.postfachHandle = postfachHandle;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public StartedByUserV1 build() {
      return new StartedByUserV1(this.userId, this.displayName, this.primaryName, this.secondaryName, this.postfachHandle);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "StartedByUserV1.StartedByUserV1Builder(userId=" + this.userId + ", displayName=" + this.displayName + ", primaryName=" + this.primaryName + ", secondaryName=" + this.secondaryName + ", postfachHandle=" + this.postfachHandle + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static StartedByUserV1.StartedByUserV1Builder builder() {
    return new StartedByUserV1.StartedByUserV1Builder();
  }

  /**
   * ID des Benutzers, der den Prozess gestartet hat. Das ist die mit Präfix "userId:" versehene
   * Organisationskonto-ID, falls diese nicht vorhanden ist, die mit Präfix "userId:" versehene
   * User-ID oder, falls diese nicht vorhanden ist, die mit Präfix "sessionId:" versehene
   * Session-ID.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getUserId() {
    return this.userId;
  }

  /**
   * Lesbarer Name des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getDisplayName() {
    return this.displayName;
  }

  /**
   * Nachname des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getPrimaryName() {
    return this.primaryName;
  }

  /**
   * Vorname des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht oder im Kontext eines Behörden- oder Organisationskontos
   * eingeloggt war. Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSecondaryName() {
    return this.secondaryName;
  }

  /**
   * Postfach-Handle des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getPostfachHandle() {
    return this.postfachHandle;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "StartedByUserV1(userId=" + this.getUserId() + ", displayName=" + this.getDisplayName() + ", primaryName=" + this.getPrimaryName() + ", secondaryName=" + this.getSecondaryName() + ", postfachHandle=" + this.getPostfachHandle() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof StartedByUserV1)) return false;
    final StartedByUserV1 other = (StartedByUserV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$userId = this.getUserId();
    final Object other$userId = other.getUserId();
    if (this$userId == null ? other$userId != null : !this$userId.equals(other$userId)) return false;
    final Object this$displayName = this.getDisplayName();
    final Object other$displayName = other.getDisplayName();
    if (this$displayName == null ? other$displayName != null : !this$displayName.equals(other$displayName)) return false;
    final Object this$primaryName = this.getPrimaryName();
    final Object other$primaryName = other.getPrimaryName();
    if (this$primaryName == null ? other$primaryName != null : !this$primaryName.equals(other$primaryName)) return false;
    final Object this$secondaryName = this.getSecondaryName();
    final Object other$secondaryName = other.getSecondaryName();
    if (this$secondaryName == null ? other$secondaryName != null : !this$secondaryName.equals(other$secondaryName)) return false;
    final Object this$postfachHandle = this.getPostfachHandle();
    final Object other$postfachHandle = other.getPostfachHandle();
    if (this$postfachHandle == null ? other$postfachHandle != null : !this$postfachHandle.equals(other$postfachHandle)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof StartedByUserV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $userId = this.getUserId();
    result = result * PRIME + ($userId == null ? 43 : $userId.hashCode());
    final Object $displayName = this.getDisplayName();
    result = result * PRIME + ($displayName == null ? 43 : $displayName.hashCode());
    final Object $primaryName = this.getPrimaryName();
    result = result * PRIME + ($primaryName == null ? 43 : $primaryName.hashCode());
    final Object $secondaryName = this.getSecondaryName();
    result = result * PRIME + ($secondaryName == null ? 43 : $secondaryName.hashCode());
    final Object $postfachHandle = this.getPostfachHandle();
    result = result * PRIME + ($postfachHandle == null ? 43 : $postfachHandle.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public StartedByUserV1() {
  }

  /**
   * Creates a new {@code StartedByUserV1} instance.
   *
   * @param userId ID des Benutzers, der den Prozess gestartet hat. Das ist die mit Präfix "userId:" versehene
   * Organisationskonto-ID, falls diese nicht vorhanden ist, die mit Präfix "userId:" versehene
   * User-ID oder, falls diese nicht vorhanden ist, die mit Präfix "sessionId:" versehene
   * Session-ID.
   * @param displayName Lesbarer Name des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   * @param primaryName Nachname des Benutzers, der den Prozess gestartet hat.
   * War der Nutzer im Kontext eines Behörden- oder Organisationskontos eingeloggt, ist dieses Attribut der
   * Name dieses Behörden- bzw. Organisationskontos.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   * @param secondaryName Vorname des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht oder im Kontext eines Behörden- oder Organisationskontos
   * eingeloggt war. Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   * @param postfachHandle Postfach-Handle des Benutzers, der den Prozess gestartet hat.
   * {@code null}, falls der Benutzer nicht eingeloggt war.
   * Auf OZG-Hub auch {@code null}, falls es sich um einen servicekontolosen Prozess handelt.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public StartedByUserV1(final String userId, final String displayName, final String primaryName, final String secondaryName, final String postfachHandle) {
    this.userId = userId;
    this.displayName = displayName;
    this.primaryName = primaryName;
    this.secondaryName = secondaryName;
    this.postfachHandle = postfachHandle;
  }
}

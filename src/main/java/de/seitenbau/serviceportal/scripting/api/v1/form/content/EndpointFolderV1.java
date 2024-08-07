// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.content;

/**
 * Informationen über den anzusprechenden Endpunkt und Ordner auf einer externen Dateiablage.
 */
public class EndpointFolderV1 implements Cloneable {
  /**
   * URL zur externen Dateiablage. Nicht {@code null}.
   */
  private String baseUrl;
  /**
   * Ordner oder über "/" geschachtelter Pfad von Ordnern auf der externen Dateiablage, in dem eine Datei
   * gespeichert werden soll. Nicht {@code null}.
   */
  private String folder;

  @Override
  public EndpointFolderV1 clone() {
    try {
      return (EndpointFolderV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }


  @SuppressWarnings("all")
  @lombok.Generated
  public static class EndpointFolderV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String baseUrl;
    @SuppressWarnings("all")
    @lombok.Generated
    private String folder;

    @SuppressWarnings("all")
    @lombok.Generated
    EndpointFolderV1Builder() {
    }

    /**
     * URL zur externen Dateiablage. Nicht {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public EndpointFolderV1.EndpointFolderV1Builder baseUrl(final String baseUrl) {
      this.baseUrl = baseUrl;
      return this;
    }

    /**
     * Ordner oder über "/" geschachtelter Pfad von Ordnern auf der externen Dateiablage, in dem eine Datei
     * gespeichert werden soll. Nicht {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public EndpointFolderV1.EndpointFolderV1Builder folder(final String folder) {
      this.folder = folder;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public EndpointFolderV1 build() {
      return new EndpointFolderV1(this.baseUrl, this.folder);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "EndpointFolderV1.EndpointFolderV1Builder(baseUrl=" + this.baseUrl + ", folder=" + this.folder + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static EndpointFolderV1.EndpointFolderV1Builder builder() {
    return new EndpointFolderV1.EndpointFolderV1Builder();
  }

  /**
   * URL zur externen Dateiablage. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getBaseUrl() {
    return this.baseUrl;
  }

  /**
   * Ordner oder über "/" geschachtelter Pfad von Ordnern auf der externen Dateiablage, in dem eine Datei
   * gespeichert werden soll. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getFolder() {
    return this.folder;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "EndpointFolderV1(baseUrl=" + this.getBaseUrl() + ", folder=" + this.getFolder() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof EndpointFolderV1)) return false;
    final EndpointFolderV1 other = (EndpointFolderV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$baseUrl = this.getBaseUrl();
    final Object other$baseUrl = other.getBaseUrl();
    if (this$baseUrl == null ? other$baseUrl != null : !this$baseUrl.equals(other$baseUrl)) return false;
    final Object this$folder = this.getFolder();
    final Object other$folder = other.getFolder();
    if (this$folder == null ? other$folder != null : !this$folder.equals(other$folder)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof EndpointFolderV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $baseUrl = this.getBaseUrl();
    result = result * PRIME + ($baseUrl == null ? 43 : $baseUrl.hashCode());
    final Object $folder = this.getFolder();
    result = result * PRIME + ($folder == null ? 43 : $folder.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public EndpointFolderV1() {
  }

  /**
   * Creates a new {@code EndpointFolderV1} instance.
   *
   * @param baseUrl URL zur externen Dateiablage. Nicht {@code null}.
   * @param folder Ordner oder über "/" geschachtelter Pfad von Ordnern auf der externen Dateiablage, in dem eine Datei
   * gespeichert werden soll. Nicht {@code null}.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public EndpointFolderV1(final String baseUrl, final String folder) {
    this.baseUrl = baseUrl;
    this.folder = folder;
  }
}

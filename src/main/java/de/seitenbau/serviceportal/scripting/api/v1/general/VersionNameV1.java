// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.general;

/**
 * Ein Objekt das einen Versionsnamen darstellt.
 */
public class VersionNameV1 {
  /**
   * Der Name einer Version.
   */
  private String name;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class VersionNameV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String name;

    @SuppressWarnings("all")
    @lombok.Generated
    VersionNameV1Builder() {
    }

    /**
     * Der Name einer Version.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public VersionNameV1.VersionNameV1Builder name(final String name) {
      this.name = name;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public VersionNameV1 build() {
      return new VersionNameV1(this.name);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "VersionNameV1.VersionNameV1Builder(name=" + this.name + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static VersionNameV1.VersionNameV1Builder builder() {
    return new VersionNameV1.VersionNameV1Builder();
  }

  /**
   * Der Name einer Version.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * Der Name einer Version.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setName(final String name) {
    this.name = name;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof VersionNameV1)) return false;
    final VersionNameV1 other = (VersionNameV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof VersionNameV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "VersionNameV1(name=" + this.getName() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public VersionNameV1() {
  }

  /**
   * Creates a new {@code VersionNameV1} instance.
   *
   * @param name Der Name einer Version.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public VersionNameV1(final String name) {
    this.name = name;
  }
}

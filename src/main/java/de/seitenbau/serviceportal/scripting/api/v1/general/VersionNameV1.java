// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.general;

public class VersionNameV1 {
  private String name;


  @SuppressWarnings("all")
  public static class VersionNameV1Builder {
    @SuppressWarnings("all")
    private String name;

    @SuppressWarnings("all")
    VersionNameV1Builder() {
    }

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public VersionNameV1.VersionNameV1Builder name(final String name) {
      this.name = name;
      return this;
    }

    @SuppressWarnings("all")
    public VersionNameV1 build() {
      return new VersionNameV1(this.name);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "VersionNameV1.VersionNameV1Builder(name=" + this.name + ")";
    }
  }

  @SuppressWarnings("all")
  public static VersionNameV1.VersionNameV1Builder builder() {
    return new VersionNameV1.VersionNameV1Builder();
  }

  @SuppressWarnings("all")
  public String getName() {
    return this.name;
  }

  @SuppressWarnings("all")
  public void setName(final String name) {
    this.name = name;
  }

  @Override
  @SuppressWarnings("all")
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
  protected boolean canEqual(final Object other) {
    return other instanceof VersionNameV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "VersionNameV1(name=" + this.getName() + ")";
  }

  @SuppressWarnings("all")
  public VersionNameV1() {
  }

  @SuppressWarnings("all")
  public VersionNameV1(final String name) {
    this.name = name;
  }
}

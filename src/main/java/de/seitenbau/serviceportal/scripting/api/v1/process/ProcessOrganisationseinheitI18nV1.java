// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.process;

/**
 * Internationalisierter Teil des OE-Objekts.
 */
public class ProcessOrganisationseinheitI18nV1 {
  /**
   * Sprache.
   */
  private String sprache;
  /**
   * Name der Organisationseinheit.
   */
  private String name;
  /**
   * Beschreibung der Organisationseinheit.
   */
  private String kurzbeschreibung;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class ProcessOrganisationseinheitI18nV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String sprache;
    @SuppressWarnings("all")
    @lombok.Generated
    private String name;
    @SuppressWarnings("all")
    @lombok.Generated
    private String kurzbeschreibung;

    @SuppressWarnings("all")
    @lombok.Generated
    ProcessOrganisationseinheitI18nV1Builder() {
    }

    /**
     * Sprache.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder sprache(final String sprache) {
      this.sprache = sprache;
      return this;
    }

    /**
     * Name der Organisationseinheit.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder name(final String name) {
      this.name = name;
      return this;
    }

    /**
     * Beschreibung der Organisationseinheit.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder kurzbeschreibung(final String kurzbeschreibung) {
      this.kurzbeschreibung = kurzbeschreibung;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitI18nV1 build() {
      return new ProcessOrganisationseinheitI18nV1(this.sprache, this.name, this.kurzbeschreibung);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder(sprache=" + this.sprache + ", name=" + this.name + ", kurzbeschreibung=" + this.kurzbeschreibung + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder builder() {
    return new ProcessOrganisationseinheitI18nV1.ProcessOrganisationseinheitI18nV1Builder();
  }

  /**
   * Sprache.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSprache() {
    return this.sprache;
  }

  /**
   * Name der Organisationseinheit.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * Beschreibung der Organisationseinheit.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getKurzbeschreibung() {
    return this.kurzbeschreibung;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "ProcessOrganisationseinheitI18nV1(sprache=" + this.getSprache() + ", name=" + this.getName() + ", kurzbeschreibung=" + this.getKurzbeschreibung() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ProcessOrganisationseinheitI18nV1)) return false;
    final ProcessOrganisationseinheitI18nV1 other = (ProcessOrganisationseinheitI18nV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$sprache = this.getSprache();
    final Object other$sprache = other.getSprache();
    if (this$sprache == null ? other$sprache != null : !this$sprache.equals(other$sprache)) return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final Object this$kurzbeschreibung = this.getKurzbeschreibung();
    final Object other$kurzbeschreibung = other.getKurzbeschreibung();
    if (this$kurzbeschreibung == null ? other$kurzbeschreibung != null : !this$kurzbeschreibung.equals(other$kurzbeschreibung)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof ProcessOrganisationseinheitI18nV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $sprache = this.getSprache();
    result = result * PRIME + ($sprache == null ? 43 : $sprache.hashCode());
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $kurzbeschreibung = this.getKurzbeschreibung();
    result = result * PRIME + ($kurzbeschreibung == null ? 43 : $kurzbeschreibung.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessOrganisationseinheitI18nV1() {
  }

  /**
   * Creates a new {@code ProcessOrganisationseinheitI18nV1} instance.
   *
   * @param sprache Sprache.
   * @param name Name der Organisationseinheit.
   * @param kurzbeschreibung Beschreibung der Organisationseinheit.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessOrganisationseinheitI18nV1(final String sprache, final String name, final String kurzbeschreibung) {
    this.sprache = sprache;
    this.name = name;
    this.kurzbeschreibung = kurzbeschreibung;
  }
}

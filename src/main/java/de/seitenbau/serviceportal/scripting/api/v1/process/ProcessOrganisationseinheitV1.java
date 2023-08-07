// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.process;

import java.util.Set;

/**
 * Eine Organisationseinheit (OE).
 */
public class ProcessOrganisationseinheitV1 {
  /**
   * ID der OE.
   */
  private Long id;
  /**
   * ID des Mandanten, dem diese OE zugeordnet ist.
   */
  private String mandant;
  /**
   * ID der übergeordneten OE.
   */
  private Long parentId;
  /**
   * {@code true}, falls diese OE eine Behörde ist.
   */
  private Boolean behoerde;
  /**
   * Anschriften der OE, z.B. Besuchsanschrift oder Postanschrift.
   */
  private Set<ProcessOrganisationseinheitAnschriftV1> anschrift;
  /**
   * Internationalisierter Teil des OE-Objekts. Die OE hat genau einen deutschen Namen.
   */
  private Set<ProcessOrganisationseinheitI18nV1> i18n;
  /**
   * Zur OE zugehörige Behörden.
   */
  private Set<ProcessOrganisationseinheitAnschriftV1> zugehoerigeBehoerdeAnschrift;
  /**
   * Internationalisierter Teil der zur OE zugehörigen Behörden.
   */
  private Set<ProcessOrganisationseinheitZugehoerigeBehoerdeI18nV1> zugehoerigeBehoerde;
  /**
   * Zu dieser OE zugeordnete Kommunikationskanäle.
   * In der Regel verbirgt sich hinter jedem Kommunikationskanal eine Person.
   */
  private Set<ProcessOrganisationseinheitKommunikationV1> kommunikation;


  @SuppressWarnings("all")
  public static class ProcessOrganisationseinheitV1Builder {
    @SuppressWarnings("all")
    private Long id;
    @SuppressWarnings("all")
    private String mandant;
    @SuppressWarnings("all")
    private Long parentId;
    @SuppressWarnings("all")
    private Boolean behoerde;
    @SuppressWarnings("all")
    private Set<ProcessOrganisationseinheitAnschriftV1> anschrift;
    @SuppressWarnings("all")
    private Set<ProcessOrganisationseinheitI18nV1> i18n;
    @SuppressWarnings("all")
    private Set<ProcessOrganisationseinheitAnschriftV1> zugehoerigeBehoerdeAnschrift;
    @SuppressWarnings("all")
    private Set<ProcessOrganisationseinheitZugehoerigeBehoerdeI18nV1> zugehoerigeBehoerde;
    @SuppressWarnings("all")
    private Set<ProcessOrganisationseinheitKommunikationV1> kommunikation;

    @SuppressWarnings("all")
    ProcessOrganisationseinheitV1Builder() {
    }

    /**
     * ID der OE.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder id(final Long id) {
      this.id = id;
      return this;
    }

    /**
     * ID des Mandanten, dem diese OE zugeordnet ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder mandant(final String mandant) {
      this.mandant = mandant;
      return this;
    }

    /**
     * ID der übergeordneten OE.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder parentId(final Long parentId) {
      this.parentId = parentId;
      return this;
    }

    /**
     * {@code true}, falls diese OE eine Behörde ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder behoerde(final Boolean behoerde) {
      this.behoerde = behoerde;
      return this;
    }

    /**
     * Anschriften der OE, z.B. Besuchsanschrift oder Postanschrift.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder anschrift(final Set<ProcessOrganisationseinheitAnschriftV1> anschrift) {
      this.anschrift = anschrift;
      return this;
    }

    /**
     * Internationalisierter Teil des OE-Objekts. Die OE hat genau einen deutschen Namen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder i18n(final Set<ProcessOrganisationseinheitI18nV1> i18n) {
      this.i18n = i18n;
      return this;
    }

    /**
     * Zur OE zugehörige Behörden.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder zugehoerigeBehoerdeAnschrift(final Set<ProcessOrganisationseinheitAnschriftV1> zugehoerigeBehoerdeAnschrift) {
      this.zugehoerigeBehoerdeAnschrift = zugehoerigeBehoerdeAnschrift;
      return this;
    }

    /**
     * Internationalisierter Teil der zur OE zugehörigen Behörden.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder zugehoerigeBehoerde(final Set<ProcessOrganisationseinheitZugehoerigeBehoerdeI18nV1> zugehoerigeBehoerde) {
      this.zugehoerigeBehoerde = zugehoerigeBehoerde;
      return this;
    }

    /**
     * Zu dieser OE zugeordnete Kommunikationskanäle.
     * In der Regel verbirgt sich hinter jedem Kommunikationskanal eine Person.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder kommunikation(final Set<ProcessOrganisationseinheitKommunikationV1> kommunikation) {
      this.kommunikation = kommunikation;
      return this;
    }

    @SuppressWarnings("all")
    public ProcessOrganisationseinheitV1 build() {
      return new ProcessOrganisationseinheitV1(this.id, this.mandant, this.parentId, this.behoerde, this.anschrift, this.i18n, this.zugehoerigeBehoerdeAnschrift, this.zugehoerigeBehoerde, this.kommunikation);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder(id=" + this.id + ", mandant=" + this.mandant + ", parentId=" + this.parentId + ", behoerde=" + this.behoerde + ", anschrift=" + this.anschrift + ", i18n=" + this.i18n + ", zugehoerigeBehoerdeAnschrift=" + this.zugehoerigeBehoerdeAnschrift + ", zugehoerigeBehoerde=" + this.zugehoerigeBehoerde + ", kommunikation=" + this.kommunikation + ")";
    }
  }

  @SuppressWarnings("all")
  public static ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder builder() {
    return new ProcessOrganisationseinheitV1.ProcessOrganisationseinheitV1Builder();
  }

  /**
   * ID der OE.
   */
  @SuppressWarnings("all")
  public Long getId() {
    return this.id;
  }

  /**
   * ID des Mandanten, dem diese OE zugeordnet ist.
   */
  @SuppressWarnings("all")
  public String getMandant() {
    return this.mandant;
  }

  /**
   * ID der übergeordneten OE.
   */
  @SuppressWarnings("all")
  public Long getParentId() {
    return this.parentId;
  }

  /**
   * {@code true}, falls diese OE eine Behörde ist.
   */
  @SuppressWarnings("all")
  public Boolean getBehoerde() {
    return this.behoerde;
  }

  /**
   * Anschriften der OE, z.B. Besuchsanschrift oder Postanschrift.
   */
  @SuppressWarnings("all")
  public Set<ProcessOrganisationseinheitAnschriftV1> getAnschrift() {
    return this.anschrift;
  }

  /**
   * Internationalisierter Teil des OE-Objekts. Die OE hat genau einen deutschen Namen.
   */
  @SuppressWarnings("all")
  public Set<ProcessOrganisationseinheitI18nV1> getI18n() {
    return this.i18n;
  }

  /**
   * Zur OE zugehörige Behörden.
   */
  @SuppressWarnings("all")
  public Set<ProcessOrganisationseinheitAnschriftV1> getZugehoerigeBehoerdeAnschrift() {
    return this.zugehoerigeBehoerdeAnschrift;
  }

  /**
   * Internationalisierter Teil der zur OE zugehörigen Behörden.
   */
  @SuppressWarnings("all")
  public Set<ProcessOrganisationseinheitZugehoerigeBehoerdeI18nV1> getZugehoerigeBehoerde() {
    return this.zugehoerigeBehoerde;
  }

  /**
   * Zu dieser OE zugeordnete Kommunikationskanäle.
   * In der Regel verbirgt sich hinter jedem Kommunikationskanal eine Person.
   */
  @SuppressWarnings("all")
  public Set<ProcessOrganisationseinheitKommunikationV1> getKommunikation() {
    return this.kommunikation;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "ProcessOrganisationseinheitV1(id=" + this.getId() + ", mandant=" + this.getMandant() + ", parentId=" + this.getParentId() + ", behoerde=" + this.getBehoerde() + ", anschrift=" + this.getAnschrift() + ", i18n=" + this.getI18n() + ", zugehoerigeBehoerdeAnschrift=" + this.getZugehoerigeBehoerdeAnschrift() + ", zugehoerigeBehoerde=" + this.getZugehoerigeBehoerde() + ", kommunikation=" + this.getKommunikation() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ProcessOrganisationseinheitV1)) return false;
    final ProcessOrganisationseinheitV1 other = (ProcessOrganisationseinheitV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$parentId = this.getParentId();
    final Object other$parentId = other.getParentId();
    if (this$parentId == null ? other$parentId != null : !this$parentId.equals(other$parentId)) return false;
    final Object this$behoerde = this.getBehoerde();
    final Object other$behoerde = other.getBehoerde();
    if (this$behoerde == null ? other$behoerde != null : !this$behoerde.equals(other$behoerde)) return false;
    final Object this$mandant = this.getMandant();
    final Object other$mandant = other.getMandant();
    if (this$mandant == null ? other$mandant != null : !this$mandant.equals(other$mandant)) return false;
    final Object this$anschrift = this.getAnschrift();
    final Object other$anschrift = other.getAnschrift();
    if (this$anschrift == null ? other$anschrift != null : !this$anschrift.equals(other$anschrift)) return false;
    final Object this$i18n = this.getI18n();
    final Object other$i18n = other.getI18n();
    if (this$i18n == null ? other$i18n != null : !this$i18n.equals(other$i18n)) return false;
    final Object this$zugehoerigeBehoerdeAnschrift = this.getZugehoerigeBehoerdeAnschrift();
    final Object other$zugehoerigeBehoerdeAnschrift = other.getZugehoerigeBehoerdeAnschrift();
    if (this$zugehoerigeBehoerdeAnschrift == null ? other$zugehoerigeBehoerdeAnschrift != null : !this$zugehoerigeBehoerdeAnschrift.equals(other$zugehoerigeBehoerdeAnschrift)) return false;
    final Object this$zugehoerigeBehoerde = this.getZugehoerigeBehoerde();
    final Object other$zugehoerigeBehoerde = other.getZugehoerigeBehoerde();
    if (this$zugehoerigeBehoerde == null ? other$zugehoerigeBehoerde != null : !this$zugehoerigeBehoerde.equals(other$zugehoerigeBehoerde)) return false;
    final Object this$kommunikation = this.getKommunikation();
    final Object other$kommunikation = other.getKommunikation();
    if (this$kommunikation == null ? other$kommunikation != null : !this$kommunikation.equals(other$kommunikation)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof ProcessOrganisationseinheitV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $parentId = this.getParentId();
    result = result * PRIME + ($parentId == null ? 43 : $parentId.hashCode());
    final Object $behoerde = this.getBehoerde();
    result = result * PRIME + ($behoerde == null ? 43 : $behoerde.hashCode());
    final Object $mandant = this.getMandant();
    result = result * PRIME + ($mandant == null ? 43 : $mandant.hashCode());
    final Object $anschrift = this.getAnschrift();
    result = result * PRIME + ($anschrift == null ? 43 : $anschrift.hashCode());
    final Object $i18n = this.getI18n();
    result = result * PRIME + ($i18n == null ? 43 : $i18n.hashCode());
    final Object $zugehoerigeBehoerdeAnschrift = this.getZugehoerigeBehoerdeAnschrift();
    result = result * PRIME + ($zugehoerigeBehoerdeAnschrift == null ? 43 : $zugehoerigeBehoerdeAnschrift.hashCode());
    final Object $zugehoerigeBehoerde = this.getZugehoerigeBehoerde();
    result = result * PRIME + ($zugehoerigeBehoerde == null ? 43 : $zugehoerigeBehoerde.hashCode());
    final Object $kommunikation = this.getKommunikation();
    result = result * PRIME + ($kommunikation == null ? 43 : $kommunikation.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  public ProcessOrganisationseinheitV1() {
  }

  @SuppressWarnings("all")
  public ProcessOrganisationseinheitV1(final Long id, final String mandant, final Long parentId, final Boolean behoerde, final Set<ProcessOrganisationseinheitAnschriftV1> anschrift, final Set<ProcessOrganisationseinheitI18nV1> i18n, final Set<ProcessOrganisationseinheitAnschriftV1> zugehoerigeBehoerdeAnschrift, final Set<ProcessOrganisationseinheitZugehoerigeBehoerdeI18nV1> zugehoerigeBehoerde, final Set<ProcessOrganisationseinheitKommunikationV1> kommunikation) {
    this.id = id;
    this.mandant = mandant;
    this.parentId = parentId;
    this.behoerde = behoerde;
    this.anschrift = anschrift;
    this.i18n = i18n;
    this.zugehoerigeBehoerdeAnschrift = zugehoerigeBehoerdeAnschrift;
    this.zugehoerigeBehoerde = zugehoerigeBehoerde;
    this.kommunikation = kommunikation;
  }
}
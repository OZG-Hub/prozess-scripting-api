// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.process;

/**
 * Organisationseinheit-Objekt (OE), das nur grundlegende Informationen enthält.
 */
public class ProcessOrganisationseinheitMinimalV1 {
  /**
   * Name der OE.
   */
  private String name;
  /**
   * ID der OE.
   */
  private Long id;
  /**
   * ID des Mandanten, dem diese OE zugeordnet ist.
   */
  private String mandantId;
  /**
   * {@code true}, falls diese OE eine Behörde ist.
   */
  private boolean behoerde;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class ProcessOrganisationseinheitMinimalV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String name;
    @SuppressWarnings("all")
    @lombok.Generated
    private Long id;
    @SuppressWarnings("all")
    @lombok.Generated
    private String mandantId;
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean behoerde;

    @SuppressWarnings("all")
    @lombok.Generated
    ProcessOrganisationseinheitMinimalV1Builder() {
    }

    /**
     * Name der OE.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder name(final String name) {
      this.name = name;
      return this;
    }

    /**
     * ID der OE.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder id(final Long id) {
      this.id = id;
      return this;
    }

    /**
     * ID des Mandanten, dem diese OE zugeordnet ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder mandantId(final String mandantId) {
      this.mandantId = mandantId;
      return this;
    }

    /**
     * {@code true}, falls diese OE eine Behörde ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder behoerde(final boolean behoerde) {
      this.behoerde = behoerde;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessOrganisationseinheitMinimalV1 build() {
      return new ProcessOrganisationseinheitMinimalV1(this.name, this.id, this.mandantId, this.behoerde);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder(name=" + this.name + ", id=" + this.id + ", mandantId=" + this.mandantId + ", behoerde=" + this.behoerde + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder builder() {
    return new ProcessOrganisationseinheitMinimalV1.ProcessOrganisationseinheitMinimalV1Builder();
  }

  /**
   * Name der OE.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * ID der OE.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Long getId() {
    return this.id;
  }

  /**
   * ID des Mandanten, dem diese OE zugeordnet ist.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getMandantId() {
    return this.mandantId;
  }

  /**
   * {@code true}, falls diese OE eine Behörde ist.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean isBehoerde() {
    return this.behoerde;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "ProcessOrganisationseinheitMinimalV1(name=" + this.getName() + ", id=" + this.getId() + ", mandantId=" + this.getMandantId() + ", behoerde=" + this.isBehoerde() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ProcessOrganisationseinheitMinimalV1)) return false;
    final ProcessOrganisationseinheitMinimalV1 other = (ProcessOrganisationseinheitMinimalV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.isBehoerde() != other.isBehoerde()) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final Object this$mandantId = this.getMandantId();
    final Object other$mandantId = other.getMandantId();
    if (this$mandantId == null ? other$mandantId != null : !this$mandantId.equals(other$mandantId)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof ProcessOrganisationseinheitMinimalV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isBehoerde() ? 79 : 97);
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $mandantId = this.getMandantId();
    result = result * PRIME + ($mandantId == null ? 43 : $mandantId.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessOrganisationseinheitMinimalV1() {
  }

  /**
   * Creates a new {@code ProcessOrganisationseinheitMinimalV1} instance.
   *
   * @param name Name der OE.
   * @param id ID der OE.
   * @param mandantId ID des Mandanten, dem diese OE zugeordnet ist.
   * @param behoerde {@code true}, falls diese OE eine Behörde ist.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessOrganisationseinheitMinimalV1(final String name, final Long id, final String mandantId, final boolean behoerde) {
    this.name = name;
    this.id = id;
    this.mandantId = mandantId;
    this.behoerde = behoerde;
  }
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.Map;

/**
 * Zu bezahlender Artikel / Position beim Bezahlen über den generischen Bezahltask.
 */
public class TransactionArtikelV1 {
  /**
   * ID des Artikels.
   */
  private String id;
  /**
   * Fachliche Referenz.
   */
  private String referenz;
  /**
   * Beschreibung.
   */
  private String beschreibung;
  /**
   * Steuersatz als Prozentbetrag.
   */
  private Double steuersatz;
  /**
   * Anzahl.
   */
  private Integer anzahl;
  /**
   * Bruttobetrag des einzelnen Artikels in Cents.
   */
  private Long betrag;
  /**
   * Zusatzinformationen für die Verbuchung im Bezahldienst oder nachgelagerten Systemen.
   */
  private Map<String, String> zusatzinfo;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class TransactionArtikelV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String id;
    @SuppressWarnings("all")
    @lombok.Generated
    private String referenz;
    @SuppressWarnings("all")
    @lombok.Generated
    private String beschreibung;
    @SuppressWarnings("all")
    @lombok.Generated
    private Double steuersatz;
    @SuppressWarnings("all")
    @lombok.Generated
    private Integer anzahl;
    @SuppressWarnings("all")
    @lombok.Generated
    private Long betrag;
    @SuppressWarnings("all")
    @lombok.Generated
    private Map<String, String> zusatzinfo;

    @SuppressWarnings("all")
    @lombok.Generated
    TransactionArtikelV1Builder() {
    }

    /**
     * ID des Artikels.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder id(final String id) {
      this.id = id;
      return this;
    }

    /**
     * Fachliche Referenz.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder referenz(final String referenz) {
      this.referenz = referenz;
      return this;
    }

    /**
     * Beschreibung.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder beschreibung(final String beschreibung) {
      this.beschreibung = beschreibung;
      return this;
    }

    /**
     * Steuersatz als Prozentbetrag.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder steuersatz(final Double steuersatz) {
      this.steuersatz = steuersatz;
      return this;
    }

    /**
     * Anzahl.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder anzahl(final Integer anzahl) {
      this.anzahl = anzahl;
      return this;
    }

    /**
     * Bruttobetrag des einzelnen Artikels in Cents.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder betrag(final Long betrag) {
      this.betrag = betrag;
      return this;
    }

    /**
     * Zusatzinformationen für die Verbuchung im Bezahldienst oder nachgelagerten Systemen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1.TransactionArtikelV1Builder zusatzinfo(final Map<String, String> zusatzinfo) {
      this.zusatzinfo = zusatzinfo;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public TransactionArtikelV1 build() {
      return new TransactionArtikelV1(this.id, this.referenz, this.beschreibung, this.steuersatz, this.anzahl, this.betrag, this.zusatzinfo);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "TransactionArtikelV1.TransactionArtikelV1Builder(id=" + this.id + ", referenz=" + this.referenz + ", beschreibung=" + this.beschreibung + ", steuersatz=" + this.steuersatz + ", anzahl=" + this.anzahl + ", betrag=" + this.betrag + ", zusatzinfo=" + this.zusatzinfo + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static TransactionArtikelV1.TransactionArtikelV1Builder builder() {
    return new TransactionArtikelV1.TransactionArtikelV1Builder();
  }

  /**
   * ID des Artikels.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getId() {
    return this.id;
  }

  /**
   * Fachliche Referenz.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getReferenz() {
    return this.referenz;
  }

  /**
   * Beschreibung.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getBeschreibung() {
    return this.beschreibung;
  }

  /**
   * Steuersatz als Prozentbetrag.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Double getSteuersatz() {
    return this.steuersatz;
  }

  /**
   * Anzahl.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Integer getAnzahl() {
    return this.anzahl;
  }

  /**
   * Bruttobetrag des einzelnen Artikels in Cents.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Long getBetrag() {
    return this.betrag;
  }

  /**
   * Zusatzinformationen für die Verbuchung im Bezahldienst oder nachgelagerten Systemen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Map<String, String> getZusatzinfo() {
    return this.zusatzinfo;
  }

  /**
   * ID des Artikels.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setId(final String id) {
    this.id = id;
  }

  /**
   * Fachliche Referenz.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setReferenz(final String referenz) {
    this.referenz = referenz;
  }

  /**
   * Beschreibung.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setBeschreibung(final String beschreibung) {
    this.beschreibung = beschreibung;
  }

  /**
   * Steuersatz als Prozentbetrag.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSteuersatz(final Double steuersatz) {
    this.steuersatz = steuersatz;
  }

  /**
   * Anzahl.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setAnzahl(final Integer anzahl) {
    this.anzahl = anzahl;
  }

  /**
   * Bruttobetrag des einzelnen Artikels in Cents.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setBetrag(final Long betrag) {
    this.betrag = betrag;
  }

  /**
   * Zusatzinformationen für die Verbuchung im Bezahldienst oder nachgelagerten Systemen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setZusatzinfo(final Map<String, String> zusatzinfo) {
    this.zusatzinfo = zusatzinfo;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof TransactionArtikelV1)) return false;
    final TransactionArtikelV1 other = (TransactionArtikelV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$steuersatz = this.getSteuersatz();
    final Object other$steuersatz = other.getSteuersatz();
    if (this$steuersatz == null ? other$steuersatz != null : !this$steuersatz.equals(other$steuersatz)) return false;
    final Object this$anzahl = this.getAnzahl();
    final Object other$anzahl = other.getAnzahl();
    if (this$anzahl == null ? other$anzahl != null : !this$anzahl.equals(other$anzahl)) return false;
    final Object this$betrag = this.getBetrag();
    final Object other$betrag = other.getBetrag();
    if (this$betrag == null ? other$betrag != null : !this$betrag.equals(other$betrag)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    final Object this$referenz = this.getReferenz();
    final Object other$referenz = other.getReferenz();
    if (this$referenz == null ? other$referenz != null : !this$referenz.equals(other$referenz)) return false;
    final Object this$beschreibung = this.getBeschreibung();
    final Object other$beschreibung = other.getBeschreibung();
    if (this$beschreibung == null ? other$beschreibung != null : !this$beschreibung.equals(other$beschreibung)) return false;
    final Object this$zusatzinfo = this.getZusatzinfo();
    final Object other$zusatzinfo = other.getZusatzinfo();
    if (this$zusatzinfo == null ? other$zusatzinfo != null : !this$zusatzinfo.equals(other$zusatzinfo)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof TransactionArtikelV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $steuersatz = this.getSteuersatz();
    result = result * PRIME + ($steuersatz == null ? 43 : $steuersatz.hashCode());
    final Object $anzahl = this.getAnzahl();
    result = result * PRIME + ($anzahl == null ? 43 : $anzahl.hashCode());
    final Object $betrag = this.getBetrag();
    result = result * PRIME + ($betrag == null ? 43 : $betrag.hashCode());
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    final Object $referenz = this.getReferenz();
    result = result * PRIME + ($referenz == null ? 43 : $referenz.hashCode());
    final Object $beschreibung = this.getBeschreibung();
    result = result * PRIME + ($beschreibung == null ? 43 : $beschreibung.hashCode());
    final Object $zusatzinfo = this.getZusatzinfo();
    result = result * PRIME + ($zusatzinfo == null ? 43 : $zusatzinfo.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "TransactionArtikelV1(id=" + this.getId() + ", referenz=" + this.getReferenz() + ", beschreibung=" + this.getBeschreibung() + ", steuersatz=" + this.getSteuersatz() + ", anzahl=" + this.getAnzahl() + ", betrag=" + this.getBetrag() + ", zusatzinfo=" + this.getZusatzinfo() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public TransactionArtikelV1() {
  }

  /**
   * Creates a new {@code TransactionArtikelV1} instance.
   *
   * @param id ID des Artikels.
   * @param referenz Fachliche Referenz.
   * @param beschreibung Beschreibung.
   * @param steuersatz Steuersatz als Prozentbetrag.
   * @param anzahl Anzahl.
   * @param betrag Bruttobetrag des einzelnen Artikels in Cents.
   * @param zusatzinfo Zusatzinformationen für die Verbuchung im Bezahldienst oder nachgelagerten Systemen.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public TransactionArtikelV1(final String id, final String referenz, final String beschreibung, final Double steuersatz, final Integer anzahl, final Long betrag, final Map<String, String> zusatzinfo) {
    this.id = id;
    this.referenz = referenz;
    this.beschreibung = beschreibung;
    this.steuersatz = steuersatz;
    this.anzahl = anzahl;
    this.betrag = betrag;
    this.zusatzinfo = zusatzinfo;
  }
}

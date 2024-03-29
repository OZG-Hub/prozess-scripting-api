// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.util.List;

/**
 * Transaction-Config für den generischen Bezahltask.
 * Allgemeine Konfiguration, unabhängig vom Bezahlprovider.
 */
public class TransactionConfigV1 {
  /**
   * Bruttobetrag in Cents.
   */
  private Long betrag;
  /**
   * Verwendungszweck. Für pmPayment wird der Verwendungszweck ignoriert.
   */
  private String verwendungszweck;
  /**
   * Beschreibung.
   */
  private String beschreibung;
  /**
   * Artikel.
   */
  private List<TransactionArtikelV1> artikel;
  /**
   * Auslöser der Bezahlung.
   */
  private TransactionBezahlerinfoV1 bezahlerinfo;


  @SuppressWarnings("all")
  public static class TransactionConfigV1Builder {
    @SuppressWarnings("all")
    private Long betrag;
    @SuppressWarnings("all")
    private String verwendungszweck;
    @SuppressWarnings("all")
    private String beschreibung;
    @SuppressWarnings("all")
    private List<TransactionArtikelV1> artikel;
    @SuppressWarnings("all")
    private TransactionBezahlerinfoV1 bezahlerinfo;

    @SuppressWarnings("all")
    TransactionConfigV1Builder() {
    }

    /**
     * Bruttobetrag in Cents.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public TransactionConfigV1.TransactionConfigV1Builder betrag(final Long betrag) {
      this.betrag = betrag;
      return this;
    }

    /**
     * Verwendungszweck. Für pmPayment wird der Verwendungszweck ignoriert.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public TransactionConfigV1.TransactionConfigV1Builder verwendungszweck(final String verwendungszweck) {
      this.verwendungszweck = verwendungszweck;
      return this;
    }

    /**
     * Beschreibung.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public TransactionConfigV1.TransactionConfigV1Builder beschreibung(final String beschreibung) {
      this.beschreibung = beschreibung;
      return this;
    }

    /**
     * Artikel.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public TransactionConfigV1.TransactionConfigV1Builder artikel(final List<TransactionArtikelV1> artikel) {
      this.artikel = artikel;
      return this;
    }

    /**
     * Auslöser der Bezahlung.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public TransactionConfigV1.TransactionConfigV1Builder bezahlerinfo(final TransactionBezahlerinfoV1 bezahlerinfo) {
      this.bezahlerinfo = bezahlerinfo;
      return this;
    }

    @SuppressWarnings("all")
    public TransactionConfigV1 build() {
      return new TransactionConfigV1(this.betrag, this.verwendungszweck, this.beschreibung, this.artikel, this.bezahlerinfo);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "TransactionConfigV1.TransactionConfigV1Builder(betrag=" + this.betrag + ", verwendungszweck=" + this.verwendungszweck + ", beschreibung=" + this.beschreibung + ", artikel=" + this.artikel + ", bezahlerinfo=" + this.bezahlerinfo + ")";
    }
  }

  @SuppressWarnings("all")
  public static TransactionConfigV1.TransactionConfigV1Builder builder() {
    return new TransactionConfigV1.TransactionConfigV1Builder();
  }

  /**
   * Bruttobetrag in Cents.
   */
  @SuppressWarnings("all")
  public Long getBetrag() {
    return this.betrag;
  }

  /**
   * Verwendungszweck. Für pmPayment wird der Verwendungszweck ignoriert.
   */
  @SuppressWarnings("all")
  public String getVerwendungszweck() {
    return this.verwendungszweck;
  }

  /**
   * Beschreibung.
   */
  @SuppressWarnings("all")
  public String getBeschreibung() {
    return this.beschreibung;
  }

  /**
   * Artikel.
   */
  @SuppressWarnings("all")
  public List<TransactionArtikelV1> getArtikel() {
    return this.artikel;
  }

  /**
   * Auslöser der Bezahlung.
   */
  @SuppressWarnings("all")
  public TransactionBezahlerinfoV1 getBezahlerinfo() {
    return this.bezahlerinfo;
  }

  /**
   * Bruttobetrag in Cents.
   */
  @SuppressWarnings("all")
  public void setBetrag(final Long betrag) {
    this.betrag = betrag;
  }

  /**
   * Verwendungszweck. Für pmPayment wird der Verwendungszweck ignoriert.
   */
  @SuppressWarnings("all")
  public void setVerwendungszweck(final String verwendungszweck) {
    this.verwendungszweck = verwendungszweck;
  }

  /**
   * Beschreibung.
   */
  @SuppressWarnings("all")
  public void setBeschreibung(final String beschreibung) {
    this.beschreibung = beschreibung;
  }

  /**
   * Artikel.
   */
  @SuppressWarnings("all")
  public void setArtikel(final List<TransactionArtikelV1> artikel) {
    this.artikel = artikel;
  }

  /**
   * Auslöser der Bezahlung.
   */
  @SuppressWarnings("all")
  public void setBezahlerinfo(final TransactionBezahlerinfoV1 bezahlerinfo) {
    this.bezahlerinfo = bezahlerinfo;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof TransactionConfigV1)) return false;
    final TransactionConfigV1 other = (TransactionConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$betrag = this.getBetrag();
    final Object other$betrag = other.getBetrag();
    if (this$betrag == null ? other$betrag != null : !this$betrag.equals(other$betrag)) return false;
    final Object this$verwendungszweck = this.getVerwendungszweck();
    final Object other$verwendungszweck = other.getVerwendungszweck();
    if (this$verwendungszweck == null ? other$verwendungszweck != null : !this$verwendungszweck.equals(other$verwendungszweck)) return false;
    final Object this$beschreibung = this.getBeschreibung();
    final Object other$beschreibung = other.getBeschreibung();
    if (this$beschreibung == null ? other$beschreibung != null : !this$beschreibung.equals(other$beschreibung)) return false;
    final Object this$artikel = this.getArtikel();
    final Object other$artikel = other.getArtikel();
    if (this$artikel == null ? other$artikel != null : !this$artikel.equals(other$artikel)) return false;
    final Object this$bezahlerinfo = this.getBezahlerinfo();
    final Object other$bezahlerinfo = other.getBezahlerinfo();
    if (this$bezahlerinfo == null ? other$bezahlerinfo != null : !this$bezahlerinfo.equals(other$bezahlerinfo)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof TransactionConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $betrag = this.getBetrag();
    result = result * PRIME + ($betrag == null ? 43 : $betrag.hashCode());
    final Object $verwendungszweck = this.getVerwendungszweck();
    result = result * PRIME + ($verwendungszweck == null ? 43 : $verwendungszweck.hashCode());
    final Object $beschreibung = this.getBeschreibung();
    result = result * PRIME + ($beschreibung == null ? 43 : $beschreibung.hashCode());
    final Object $artikel = this.getArtikel();
    result = result * PRIME + ($artikel == null ? 43 : $artikel.hashCode());
    final Object $bezahlerinfo = this.getBezahlerinfo();
    result = result * PRIME + ($bezahlerinfo == null ? 43 : $bezahlerinfo.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "TransactionConfigV1(betrag=" + this.getBetrag() + ", verwendungszweck=" + this.getVerwendungszweck() + ", beschreibung=" + this.getBeschreibung() + ", artikel=" + this.getArtikel() + ", bezahlerinfo=" + this.getBezahlerinfo() + ")";
  }

  @SuppressWarnings("all")
  public TransactionConfigV1() {
  }

  @SuppressWarnings("all")
  public TransactionConfigV1(final Long betrag, final String verwendungszweck, final String beschreibung, final List<TransactionArtikelV1> artikel, final TransactionBezahlerinfoV1 bezahlerinfo) {
    this.betrag = betrag;
    this.verwendungszweck = verwendungszweck;
    this.beschreibung = beschreibung;
    this.artikel = artikel;
    this.bezahlerinfo = bezahlerinfo;
  }
}

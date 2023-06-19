// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.form.style;

/**
 * Informationen zum Styling der Radiobuttons für die Darstellung im Zusammenhang mit Kennzeichen.
 */
public class KfzKennzeichenStylingV1 implements AdditionalFieldStylingV1 {
  /**
   * {@code true}, wenn es ein Kennzeichen für ein Elektrofahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  private Boolean electric;
  /**
   * {@code true}, wenn es ein Kennzeichen für ein historisches Fahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  private Boolean historic;
  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  private String saisonStart;
  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  private String saisonEnd;

  @Override
  public KfzKennzeichenStylingV1 clone() {
    try {
      return (KfzKennzeichenStylingV1) super.clone();
    } catch (CloneNotSupportedException e) {
      throw new RuntimeException(e);
    }
  }

  @SuppressWarnings("all")
  KfzKennzeichenStylingV1(final Boolean electric, final Boolean historic, final String saisonStart, final String saisonEnd) {
    this.electric = electric;
    this.historic = historic;
    this.saisonStart = saisonStart;
    this.saisonEnd = saisonEnd;
  }


  @SuppressWarnings("all")
  public static class KfzKennzeichenStylingV1Builder {
    @SuppressWarnings("all")
    private Boolean electric;
    @SuppressWarnings("all")
    private Boolean historic;
    @SuppressWarnings("all")
    private String saisonStart;
    @SuppressWarnings("all")
    private String saisonEnd;

    @SuppressWarnings("all")
    KfzKennzeichenStylingV1Builder() {
    }

    /**
     * {@code true}, wenn es ein Kennzeichen für ein Elektrofahrzeug ist.
     * Sonst {@code false} oder {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder electric(final Boolean electric) {
      this.electric = electric;
      return this;
    }

    /**
     * {@code true}, wenn es ein Kennzeichen für ein historisches Fahrzeug ist.
     * Sonst {@code false} oder {@code null}.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder historic(final Boolean historic) {
      this.historic = historic;
      return this;
    }

    /**
     * Numerischer Wert des Startmonats eines Saisonkennzeichens.
     * {@code null}, wenn kein Sainsonkennzeichen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder saisonStart(final String saisonStart) {
      this.saisonStart = saisonStart;
      return this;
    }

    /**
     * Numerischer Wert des Endmonats eines Saisonkennzeichens.
     * {@code null}, wenn kein Sainsonkennzeichen.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder saisonEnd(final String saisonEnd) {
      this.saisonEnd = saisonEnd;
      return this;
    }

    @SuppressWarnings("all")
    public KfzKennzeichenStylingV1 build() {
      return new KfzKennzeichenStylingV1(this.electric, this.historic, this.saisonStart, this.saisonEnd);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder(electric=" + this.electric + ", historic=" + this.historic + ", saisonStart=" + this.saisonStart + ", saisonEnd=" + this.saisonEnd + ")";
    }
  }

  @SuppressWarnings("all")
  public static KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder builder() {
    return new KfzKennzeichenStylingV1.KfzKennzeichenStylingV1Builder();
  }

  /**
   * {@code true}, wenn es ein Kennzeichen für ein Elektrofahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public Boolean getElectric() {
    return this.electric;
  }

  /**
   * {@code true}, wenn es ein Kennzeichen für ein historisches Fahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public Boolean getHistoric() {
    return this.historic;
  }

  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  @SuppressWarnings("all")
  public String getSaisonStart() {
    return this.saisonStart;
  }

  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  @SuppressWarnings("all")
  public String getSaisonEnd() {
    return this.saisonEnd;
  }

  /**
   * {@code true}, wenn es ein Kennzeichen für ein Elektrofahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public void setElectric(final Boolean electric) {
    this.electric = electric;
  }

  /**
   * {@code true}, wenn es ein Kennzeichen für ein historisches Fahrzeug ist.
   * Sonst {@code false} oder {@code null}.
   */
  @SuppressWarnings("all")
  public void setHistoric(final Boolean historic) {
    this.historic = historic;
  }

  /**
   * Numerischer Wert des Startmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  @SuppressWarnings("all")
  public void setSaisonStart(final String saisonStart) {
    this.saisonStart = saisonStart;
  }

  /**
   * Numerischer Wert des Endmonats eines Saisonkennzeichens.
   * {@code null}, wenn kein Sainsonkennzeichen.
   */
  @SuppressWarnings("all")
  public void setSaisonEnd(final String saisonEnd) {
    this.saisonEnd = saisonEnd;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof KfzKennzeichenStylingV1)) return false;
    final KfzKennzeichenStylingV1 other = (KfzKennzeichenStylingV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$electric = this.getElectric();
    final Object other$electric = other.getElectric();
    if (this$electric == null ? other$electric != null : !this$electric.equals(other$electric)) return false;
    final Object this$historic = this.getHistoric();
    final Object other$historic = other.getHistoric();
    if (this$historic == null ? other$historic != null : !this$historic.equals(other$historic)) return false;
    final Object this$saisonStart = this.getSaisonStart();
    final Object other$saisonStart = other.getSaisonStart();
    if (this$saisonStart == null ? other$saisonStart != null : !this$saisonStart.equals(other$saisonStart)) return false;
    final Object this$saisonEnd = this.getSaisonEnd();
    final Object other$saisonEnd = other.getSaisonEnd();
    if (this$saisonEnd == null ? other$saisonEnd != null : !this$saisonEnd.equals(other$saisonEnd)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof KfzKennzeichenStylingV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $electric = this.getElectric();
    result = result * PRIME + ($electric == null ? 43 : $electric.hashCode());
    final Object $historic = this.getHistoric();
    result = result * PRIME + ($historic == null ? 43 : $historic.hashCode());
    final Object $saisonStart = this.getSaisonStart();
    result = result * PRIME + ($saisonStart == null ? 43 : $saisonStart.hashCode());
    final Object $saisonEnd = this.getSaisonEnd();
    result = result * PRIME + ($saisonEnd == null ? 43 : $saisonEnd.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "KfzKennzeichenStylingV1(electric=" + this.getElectric() + ", historic=" + this.getHistoric() + ", saisonStart=" + this.getSaisonStart() + ", saisonEnd=" + this.getSaisonEnd() + ")";
  }
}
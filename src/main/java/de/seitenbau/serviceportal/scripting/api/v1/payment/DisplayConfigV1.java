// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.payment;

/**
 * Display-Config für den generischen Bezahltask.
 * Konfiguration für die Erfolgsseite.
 */
public class DisplayConfigV1 {
  /**
   * Überschrift auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  private String successHeadline;
  /**
   * Text oberhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt
   * werden soll.
   */
  private String successTextPre;
  /**
   * Text unterhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite
   * angezeigt werden soll.
   */
  private String successTextPost;
  /**
   * {@code true}, wenn der OK-Button auf der Erfolgsseite angezeigt werden soll.
   * Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  private boolean showOkButton;
  /**
   * Text des OK-Buttons auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite und der Button darauf
   * angezeigt werden soll. Über den Button kommt der Nutzer auf den nächsten Task.
   */
  private String okButton;
  /**
   * {@code true}, wenn die Erfolgsseite übersprungen werden soll.
   */
  private boolean skipSuccessPage;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class DisplayConfigV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String successHeadline;
    @SuppressWarnings("all")
    @lombok.Generated
    private String successTextPre;
    @SuppressWarnings("all")
    @lombok.Generated
    private String successTextPost;
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean showOkButton;
    @SuppressWarnings("all")
    @lombok.Generated
    private String okButton;
    @SuppressWarnings("all")
    @lombok.Generated
    private boolean skipSuccessPage;

    @SuppressWarnings("all")
    @lombok.Generated
    DisplayConfigV1Builder() {
    }

    /**
     * Überschrift auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder successHeadline(final String successHeadline) {
      this.successHeadline = successHeadline;
      return this;
    }

    /**
     * Text oberhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt
     * werden soll.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder successTextPre(final String successTextPre) {
      this.successTextPre = successTextPre;
      return this;
    }

    /**
     * Text unterhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite
     * angezeigt werden soll.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder successTextPost(final String successTextPost) {
      this.successTextPost = successTextPost;
      return this;
    }

    /**
     * {@code true}, wenn der OK-Button auf der Erfolgsseite angezeigt werden soll.
     * Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder showOkButton(final boolean showOkButton) {
      this.showOkButton = showOkButton;
      return this;
    }

    /**
     * Text des OK-Buttons auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite und der Button darauf
     * angezeigt werden soll. Über den Button kommt der Nutzer auf den nächsten Task.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder okButton(final String okButton) {
      this.okButton = okButton;
      return this;
    }

    /**
     * {@code true}, wenn die Erfolgsseite übersprungen werden soll.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1.DisplayConfigV1Builder skipSuccessPage(final boolean skipSuccessPage) {
      this.skipSuccessPage = skipSuccessPage;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public DisplayConfigV1 build() {
      return new DisplayConfigV1(this.successHeadline, this.successTextPre, this.successTextPost, this.showOkButton, this.okButton, this.skipSuccessPage);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "DisplayConfigV1.DisplayConfigV1Builder(successHeadline=" + this.successHeadline + ", successTextPre=" + this.successTextPre + ", successTextPost=" + this.successTextPost + ", showOkButton=" + this.showOkButton + ", okButton=" + this.okButton + ", skipSuccessPage=" + this.skipSuccessPage + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static DisplayConfigV1.DisplayConfigV1Builder builder() {
    return new DisplayConfigV1.DisplayConfigV1Builder();
  }

  /**
   * Überschrift auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSuccessHeadline() {
    return this.successHeadline;
  }

  /**
   * Text oberhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt
   * werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSuccessTextPre() {
    return this.successTextPre;
  }

  /**
   * Text unterhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite
   * angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSuccessTextPost() {
    return this.successTextPost;
  }

  /**
   * {@code true}, wenn der OK-Button auf der Erfolgsseite angezeigt werden soll.
   * Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean isShowOkButton() {
    return this.showOkButton;
  }

  /**
   * Text des OK-Buttons auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite und der Button darauf
   * angezeigt werden soll. Über den Button kommt der Nutzer auf den nächsten Task.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getOkButton() {
    return this.okButton;
  }

  /**
   * {@code true}, wenn die Erfolgsseite übersprungen werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean isSkipSuccessPage() {
    return this.skipSuccessPage;
  }

  /**
   * Überschrift auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSuccessHeadline(final String successHeadline) {
    this.successHeadline = successHeadline;
  }

  /**
   * Text oberhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt
   * werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSuccessTextPre(final String successTextPre) {
    this.successTextPre = successTextPre;
  }

  /**
   * Text unterhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite
   * angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSuccessTextPost(final String successTextPost) {
    this.successTextPost = successTextPost;
  }

  /**
   * {@code true}, wenn der OK-Button auf der Erfolgsseite angezeigt werden soll.
   * Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setShowOkButton(final boolean showOkButton) {
    this.showOkButton = showOkButton;
  }

  /**
   * Text des OK-Buttons auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite und der Button darauf
   * angezeigt werden soll. Über den Button kommt der Nutzer auf den nächsten Task.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setOkButton(final String okButton) {
    this.okButton = okButton;
  }

  /**
   * {@code true}, wenn die Erfolgsseite übersprungen werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setSkipSuccessPage(final boolean skipSuccessPage) {
    this.skipSuccessPage = skipSuccessPage;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof DisplayConfigV1)) return false;
    final DisplayConfigV1 other = (DisplayConfigV1) o;
    if (!other.canEqual((Object) this)) return false;
    if (this.isShowOkButton() != other.isShowOkButton()) return false;
    if (this.isSkipSuccessPage() != other.isSkipSuccessPage()) return false;
    final Object this$successHeadline = this.getSuccessHeadline();
    final Object other$successHeadline = other.getSuccessHeadline();
    if (this$successHeadline == null ? other$successHeadline != null : !this$successHeadline.equals(other$successHeadline)) return false;
    final Object this$successTextPre = this.getSuccessTextPre();
    final Object other$successTextPre = other.getSuccessTextPre();
    if (this$successTextPre == null ? other$successTextPre != null : !this$successTextPre.equals(other$successTextPre)) return false;
    final Object this$successTextPost = this.getSuccessTextPost();
    final Object other$successTextPost = other.getSuccessTextPost();
    if (this$successTextPost == null ? other$successTextPost != null : !this$successTextPost.equals(other$successTextPost)) return false;
    final Object this$okButton = this.getOkButton();
    final Object other$okButton = other.getOkButton();
    if (this$okButton == null ? other$okButton != null : !this$okButton.equals(other$okButton)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof DisplayConfigV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    result = result * PRIME + (this.isShowOkButton() ? 79 : 97);
    result = result * PRIME + (this.isSkipSuccessPage() ? 79 : 97);
    final Object $successHeadline = this.getSuccessHeadline();
    result = result * PRIME + ($successHeadline == null ? 43 : $successHeadline.hashCode());
    final Object $successTextPre = this.getSuccessTextPre();
    result = result * PRIME + ($successTextPre == null ? 43 : $successTextPre.hashCode());
    final Object $successTextPost = this.getSuccessTextPost();
    result = result * PRIME + ($successTextPost == null ? 43 : $successTextPost.hashCode());
    final Object $okButton = this.getOkButton();
    result = result * PRIME + ($okButton == null ? 43 : $okButton.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "DisplayConfigV1(successHeadline=" + this.getSuccessHeadline() + ", successTextPre=" + this.getSuccessTextPre() + ", successTextPost=" + this.getSuccessTextPost() + ", showOkButton=" + this.isShowOkButton() + ", okButton=" + this.getOkButton() + ", skipSuccessPage=" + this.isSkipSuccessPage() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public DisplayConfigV1() {
  }

  /**
   * Creates a new {@code DisplayConfigV1} instance.
   *
   * @param successHeadline Überschrift auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   * @param successTextPre Text oberhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite angezeigt
   * werden soll.
   * @param successTextPost Text unterhalb der Bezahlinformationen auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite
   * angezeigt werden soll.
   * @param showOkButton {@code true}, wenn der OK-Button auf der Erfolgsseite angezeigt werden soll.
   * Nur sinnvoll, wenn die Erfolgsseite angezeigt werden soll.
   * @param okButton Text des OK-Buttons auf der Erfolgsseite. Nur sinnvoll, wenn die Erfolgsseite und der Button darauf
   * angezeigt werden soll. Über den Button kommt der Nutzer auf den nächsten Task.
   * @param skipSuccessPage {@code true}, wenn die Erfolgsseite übersprungen werden soll.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public DisplayConfigV1(final String successHeadline, final String successTextPre, final String successTextPost, final boolean showOkButton, final String okButton, final boolean skipSuccessPage) {
    this.successHeadline = successHeadline;
    this.successTextPre = successTextPre;
    this.successTextPost = successTextPost;
    this.showOkButton = showOkButton;
    this.okButton = okButton;
    this.skipSuccessPage = skipSuccessPage;
  }
}

// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

/**
 * Informationen zu einem Callback von FIT-Connect.
 */
public class FitConnectSubmissionCallbackV1 {
  /**
   * ID der Einreichung.
   */
  private String submissionId;
  /**
   * ID des Vorgangs zu dem die Einreichung gehört.
   */
  private String caseId;
  /**
   * Typ des Events des Callbacks.
   * Mögliche Typen:
   * - https://schema.fitko.de/fit-connect/events/accept-submission
   * - https://schema.fitko.de/fit-connect/events/reject-submission
   * - https://schema.fitko.de/fit-connect/events/forward-submission
   */
  private String eventType;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class FitConnectSubmissionCallbackV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String submissionId;
    @SuppressWarnings("all")
    @lombok.Generated
    private String caseId;
    @SuppressWarnings("all")
    @lombok.Generated
    private String eventType;

    @SuppressWarnings("all")
    @lombok.Generated
    FitConnectSubmissionCallbackV1Builder() {
    }

    /**
     * ID der Einreichung.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder submissionId(final String submissionId) {
      this.submissionId = submissionId;
      return this;
    }

    /**
     * ID des Vorgangs zu dem die Einreichung gehört.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder caseId(final String caseId) {
      this.caseId = caseId;
      return this;
    }

    /**
     * Typ des Events des Callbacks.
     * Mögliche Typen:
     * - https://schema.fitko.de/fit-connect/events/accept-submission
     * - https://schema.fitko.de/fit-connect/events/reject-submission
     * - https://schema.fitko.de/fit-connect/events/forward-submission
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder eventType(final String eventType) {
      this.eventType = eventType;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public FitConnectSubmissionCallbackV1 build() {
      return new FitConnectSubmissionCallbackV1(this.submissionId, this.caseId, this.eventType);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder(submissionId=" + this.submissionId + ", caseId=" + this.caseId + ", eventType=" + this.eventType + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder builder() {
    return new FitConnectSubmissionCallbackV1.FitConnectSubmissionCallbackV1Builder();
  }

  /**
   * ID der Einreichung.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getSubmissionId() {
    return this.submissionId;
  }

  /**
   * ID des Vorgangs zu dem die Einreichung gehört.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getCaseId() {
    return this.caseId;
  }

  /**
   * Typ des Events des Callbacks.
   * Mögliche Typen:
   * - https://schema.fitko.de/fit-connect/events/accept-submission
   * - https://schema.fitko.de/fit-connect/events/reject-submission
   * - https://schema.fitko.de/fit-connect/events/forward-submission
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getEventType() {
    return this.eventType;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "FitConnectSubmissionCallbackV1(submissionId=" + this.getSubmissionId() + ", caseId=" + this.getCaseId() + ", eventType=" + this.getEventType() + ")";
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FitConnectSubmissionCallbackV1)) return false;
    final FitConnectSubmissionCallbackV1 other = (FitConnectSubmissionCallbackV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$submissionId = this.getSubmissionId();
    final Object other$submissionId = other.getSubmissionId();
    if (this$submissionId == null ? other$submissionId != null : !this$submissionId.equals(other$submissionId)) return false;
    final Object this$caseId = this.getCaseId();
    final Object other$caseId = other.getCaseId();
    if (this$caseId == null ? other$caseId != null : !this$caseId.equals(other$caseId)) return false;
    final Object this$eventType = this.getEventType();
    final Object other$eventType = other.getEventType();
    if (this$eventType == null ? other$eventType != null : !this$eventType.equals(other$eventType)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof FitConnectSubmissionCallbackV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $submissionId = this.getSubmissionId();
    result = result * PRIME + ($submissionId == null ? 43 : $submissionId.hashCode());
    final Object $caseId = this.getCaseId();
    result = result * PRIME + ($caseId == null ? 43 : $caseId.hashCode());
    final Object $eventType = this.getEventType();
    result = result * PRIME + ($eventType == null ? 43 : $eventType.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public FitConnectSubmissionCallbackV1() {
  }

  /**
   * Creates a new {@code FitConnectSubmissionCallbackV1} instance.
   *
   * @param submissionId ID der Einreichung.
   * @param caseId ID des Vorgangs zu dem die Einreichung gehört.
   * @param eventType Typ des Events des Callbacks.
   * Mögliche Typen:
   * - https://schema.fitko.de/fit-connect/events/accept-submission
   * - https://schema.fitko.de/fit-connect/events/reject-submission
   * - https://schema.fitko.de/fit-connect/events/forward-submission
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public FitConnectSubmissionCallbackV1(final String submissionId, final String caseId, final String eventType) {
    this.submissionId = submissionId;
    this.caseId = caseId;
    this.eventType = eventType;
  }
}

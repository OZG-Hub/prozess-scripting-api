// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

/**
 * Ergebnisobjekt einer Einreichung bei FIT-Connect.
 */
public class FitConnectSubmissionServiceResultV1 {
  /**
   * ID der Einreichung. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
   */
  private String submissionId;
  /**
   * ID des Vorgangs zu dem die Einreichung gehört. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
   */
  private String caseId;


  @SuppressWarnings("all")
  public static class FitConnectSubmissionServiceResultV1Builder {
    @SuppressWarnings("all")
    private String submissionId;
    @SuppressWarnings("all")
    private String caseId;

    @SuppressWarnings("all")
    FitConnectSubmissionServiceResultV1Builder() {
    }

    /**
     * ID der Einreichung. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FitConnectSubmissionServiceResultV1.FitConnectSubmissionServiceResultV1Builder submissionId(final String submissionId) {
      this.submissionId = submissionId;
      return this;
    }

    /**
     * ID des Vorgangs zu dem die Einreichung gehört. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public FitConnectSubmissionServiceResultV1.FitConnectSubmissionServiceResultV1Builder caseId(final String caseId) {
      this.caseId = caseId;
      return this;
    }

    @SuppressWarnings("all")
    public FitConnectSubmissionServiceResultV1 build() {
      return new FitConnectSubmissionServiceResultV1(this.submissionId, this.caseId);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "FitConnectSubmissionServiceResultV1.FitConnectSubmissionServiceResultV1Builder(submissionId=" + this.submissionId + ", caseId=" + this.caseId + ")";
    }
  }

  @SuppressWarnings("all")
  public static FitConnectSubmissionServiceResultV1.FitConnectSubmissionServiceResultV1Builder builder() {
    return new FitConnectSubmissionServiceResultV1.FitConnectSubmissionServiceResultV1Builder();
  }

  /**
   * ID der Einreichung. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
   */
  @SuppressWarnings("all")
  public String getSubmissionId() {
    return this.submissionId;
  }

  /**
   * ID des Vorgangs zu dem die Einreichung gehört. {@code null}, wenn zuvor ein Fehler aufgetreten ist.
   */
  @SuppressWarnings("all")
  public String getCaseId() {
    return this.caseId;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "FitConnectSubmissionServiceResultV1(submissionId=" + this.getSubmissionId() + ", caseId=" + this.getCaseId() + ")";
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof FitConnectSubmissionServiceResultV1)) return false;
    final FitConnectSubmissionServiceResultV1 other = (FitConnectSubmissionServiceResultV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$submissionId = this.getSubmissionId();
    final Object other$submissionId = other.getSubmissionId();
    if (this$submissionId == null ? other$submissionId != null : !this$submissionId.equals(other$submissionId)) return false;
    final Object this$caseId = this.getCaseId();
    final Object other$caseId = other.getCaseId();
    if (this$caseId == null ? other$caseId != null : !this$caseId.equals(other$caseId)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof FitConnectSubmissionServiceResultV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $submissionId = this.getSubmissionId();
    result = result * PRIME + ($submissionId == null ? 43 : $submissionId.hashCode());
    final Object $caseId = this.getCaseId();
    result = result * PRIME + ($caseId == null ? 43 : $caseId.hashCode());
    return result;
  }

  @SuppressWarnings("all")
  public FitConnectSubmissionServiceResultV1() {
  }

  @SuppressWarnings("all")
  public FitConnectSubmissionServiceResultV1(final String submissionId, final String caseId) {
    this.submissionId = submissionId;
    this.caseId = caseId;
  }
}

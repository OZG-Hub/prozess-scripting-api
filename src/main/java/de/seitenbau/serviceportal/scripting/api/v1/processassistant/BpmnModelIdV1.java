// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.processassistant;

public class BpmnModelIdV1 {
  private String id;


  @SuppressWarnings("all")
  public static class BpmnModelIdV1Builder {
    @SuppressWarnings("all")
    private String id;

    @SuppressWarnings("all")
    BpmnModelIdV1Builder() {
    }

    /**
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    public BpmnModelIdV1.BpmnModelIdV1Builder id(final String id) {
      this.id = id;
      return this;
    }

    @SuppressWarnings("all")
    public BpmnModelIdV1 build() {
      return new BpmnModelIdV1(this.id);
    }

    @Override
    @SuppressWarnings("all")
    public String toString() {
      return "BpmnModelIdV1.BpmnModelIdV1Builder(id=" + this.id + ")";
    }
  }

  @SuppressWarnings("all")
  public static BpmnModelIdV1.BpmnModelIdV1Builder builder() {
    return new BpmnModelIdV1.BpmnModelIdV1Builder();
  }

  @SuppressWarnings("all")
  public String getId() {
    return this.id;
  }

  @SuppressWarnings("all")
  public void setId(final String id) {
    this.id = id;
  }

  @Override
  @SuppressWarnings("all")
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof BpmnModelIdV1)) return false;
    final BpmnModelIdV1 other = (BpmnModelIdV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$id = this.getId();
    final Object other$id = other.getId();
    if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
    return true;
  }

  @SuppressWarnings("all")
  protected boolean canEqual(final Object other) {
    return other instanceof BpmnModelIdV1;
  }

  @Override
  @SuppressWarnings("all")
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $id = this.getId();
    result = result * PRIME + ($id == null ? 43 : $id.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  public String toString() {
    return "BpmnModelIdV1(id=" + this.getId() + ")";
  }

  @SuppressWarnings("all")
  public BpmnModelIdV1() {
  }

  @SuppressWarnings("all")
  public BpmnModelIdV1(final String id) {
    this.id = id;
  }
}

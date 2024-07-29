// Generated by delombok
package de.seitenbau.serviceportal.scripting.api.v1.processassistant;

import java.util.List;
import java.util.Map;
import de.seitenbau.serviceportal.scripting.api.v1.general.VersionNameV1;

/**
 * Enthält Informationen über den Namen, die verfügbaren Versionsnamen und die IDs der BPMN Dateien
 * eines Prozessmodels. Wird verwendet als Eintrag in einer Liste von Prozessmodellen.
 *
 * @see ProcessModelListV1
 */
public class ProcessModelV1 {
  /**
   * Der Name des Prozessmodels.
   */
  private String name;
  /**
   * Eine Map mit den verfügbaren Versionen dieses Prozessmodels als Key
   * und den Id's der dazugehörigen BPMN Dateien als Value.
   */
  private Map<VersionNameV1, List<BpmnModelIdV1>> versions;


  @SuppressWarnings("all")
  @lombok.Generated
  public static class ProcessModelV1Builder {
    @SuppressWarnings("all")
    @lombok.Generated
    private String name;
    @SuppressWarnings("all")
    @lombok.Generated
    private Map<VersionNameV1, List<BpmnModelIdV1>> versions;

    @SuppressWarnings("all")
    @lombok.Generated
    ProcessModelV1Builder() {
    }

    /**
     * Der Name des Prozessmodels.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessModelV1.ProcessModelV1Builder name(final String name) {
      this.name = name;
      return this;
    }

    /**
     * Eine Map mit den verfügbaren Versionen dieses Prozessmodels als Key
     * und den Id's der dazugehörigen BPMN Dateien als Value.
     * @return {@code this}.
     */
    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessModelV1.ProcessModelV1Builder versions(final Map<VersionNameV1, List<BpmnModelIdV1>> versions) {
      this.versions = versions;
      return this;
    }

    @SuppressWarnings("all")
    @lombok.Generated
    public ProcessModelV1 build() {
      return new ProcessModelV1(this.name, this.versions);
    }

    @Override
    @SuppressWarnings("all")
    @lombok.Generated
    public String toString() {
      return "ProcessModelV1.ProcessModelV1Builder(name=" + this.name + ", versions=" + this.versions + ")";
    }
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public static ProcessModelV1.ProcessModelV1Builder builder() {
    return new ProcessModelV1.ProcessModelV1Builder();
  }

  /**
   * Der Name des Prozessmodels.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public String getName() {
    return this.name;
  }

  /**
   * Eine Map mit den verfügbaren Versionen dieses Prozessmodels als Key
   * und den Id's der dazugehörigen BPMN Dateien als Value.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public Map<VersionNameV1, List<BpmnModelIdV1>> getVersions() {
    return this.versions;
  }

  /**
   * Der Name des Prozessmodels.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setName(final String name) {
    this.name = name;
  }

  /**
   * Eine Map mit den verfügbaren Versionen dieses Prozessmodels als Key
   * und den Id's der dazugehörigen BPMN Dateien als Value.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public void setVersions(final Map<VersionNameV1, List<BpmnModelIdV1>> versions) {
    this.versions = versions;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public boolean equals(final Object o) {
    if (o == this) return true;
    if (!(o instanceof ProcessModelV1)) return false;
    final ProcessModelV1 other = (ProcessModelV1) o;
    if (!other.canEqual((Object) this)) return false;
    final Object this$name = this.getName();
    final Object other$name = other.getName();
    if (this$name == null ? other$name != null : !this$name.equals(other$name)) return false;
    final Object this$versions = this.getVersions();
    final Object other$versions = other.getVersions();
    if (this$versions == null ? other$versions != null : !this$versions.equals(other$versions)) return false;
    return true;
  }

  @SuppressWarnings("all")
  @lombok.Generated
  protected boolean canEqual(final Object other) {
    return other instanceof ProcessModelV1;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public int hashCode() {
    final int PRIME = 59;
    int result = 1;
    final Object $name = this.getName();
    result = result * PRIME + ($name == null ? 43 : $name.hashCode());
    final Object $versions = this.getVersions();
    result = result * PRIME + ($versions == null ? 43 : $versions.hashCode());
    return result;
  }

  @Override
  @SuppressWarnings("all")
  @lombok.Generated
  public String toString() {
    return "ProcessModelV1(name=" + this.getName() + ", versions=" + this.getVersions() + ")";
  }

  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessModelV1() {
  }

  /**
   * Creates a new {@code ProcessModelV1} instance.
   *
   * @param name Der Name des Prozessmodels.
   * @param versions Eine Map mit den verfügbaren Versionen dieses Prozessmodels als Key
   * und den Id's der dazugehörigen BPMN Dateien als Value.
   */
  @SuppressWarnings("all")
  @lombok.Generated
  public ProcessModelV1(final String name, final Map<VersionNameV1, List<BpmnModelIdV1>> versions) {
    this.name = name;
    this.versions = versions;
  }
}

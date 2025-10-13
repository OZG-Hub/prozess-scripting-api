package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

import java.util.Arrays;

public enum FitConnectEidasAdesProfileV1
{
  HTTP_URI_ETSI_ORG_ADES_191_X_2_LEVEL_BASELINE_B_B("http://uri.etsi.org/ades/191x2/level/baseline/B-B#"),
  HTTP_URI_ETSI_ORG_ADES_191_X_2_LEVEL_BASELINE_B_T("http://uri.etsi.org/ades/191x2/level/baseline/B-T#"),
  HTTP_URI_ETSI_ORG_ADES_191_X_2_LEVEL_BASELINE_B_LT("http://uri.etsi.org/ades/191x2/level/baseline/B-LT#"),
  HTTP_URI_ETSI_ORG_ADES_191_X_2_LEVEL_BASELINE_B_LTA("http://uri.etsi.org/ades/191x2/level/baseline/B-LTA#");

  private final String value;

  FitConnectEidasAdesProfileV1(final String value)
  {
    this.value = value;
  }

  @Override
  public String toString()
  {
    return value;
  }

  public String value()
  {
    return value;
  }

  public static FitConnectEidasAdesProfileV1 fromValue(final String value)
  {
    return Arrays.stream(values()).findFirst().orElseThrow(
        () -> new IllegalArgumentException("Unexpected value '" + value + "'"));
  }
}

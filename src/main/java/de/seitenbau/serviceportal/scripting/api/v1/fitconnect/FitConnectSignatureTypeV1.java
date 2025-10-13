package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

import java.util.Arrays;

public enum FitConnectSignatureTypeV1
{
  SHA_512("sha512");

  private final String value;

  FitConnectSignatureTypeV1(final String value)
  {
    this.value = value;
  }

  @Override
  public String toString()
  {
    return this.value;
  }

  public String value()
  {
    return this.value;
  }

  public static FitConnectSignatureTypeV1 fromValue(final String value)
  {
    return Arrays.stream(values()).findFirst().orElseThrow(
        () -> new IllegalArgumentException("Unexpected value '" + value + "'"));
  }
}

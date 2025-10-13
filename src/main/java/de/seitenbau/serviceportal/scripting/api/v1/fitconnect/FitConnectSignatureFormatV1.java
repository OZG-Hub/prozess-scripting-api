package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;


import java.util.Arrays;

public enum FitConnectSignatureFormatV1
{
  CMS("cms"),
  XML("xml"),
  PDF("pdf"),
  ASIC("asic"),
  JSON("json");

  private final String value;

  FitConnectSignatureFormatV1(final String value)
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

  public static FitConnectSignatureFormatV1 fromValue(final String value)
  {
    return Arrays.stream(values()).findFirst().orElseThrow(
        () -> new IllegalArgumentException("Unexpected value '" + value + "'"));
  }
}

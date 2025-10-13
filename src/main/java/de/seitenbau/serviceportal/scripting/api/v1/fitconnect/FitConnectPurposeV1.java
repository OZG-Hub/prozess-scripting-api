package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

import java.util.Arrays;

public enum FitConnectPurposeV1
{
  FORM("form"),
  ATTACHMENT("attachment"),
  REPORT("report"),
  DATA("data");

  private final String value;

  FitConnectPurposeV1(final String value)
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

  public static FitConnectPurposeV1 fromValue(final String value)
  {
    return Arrays.stream(values()).findFirst().orElseThrow(
        () -> new IllegalArgumentException("Unexpected value '" + value + "'"));
  }
}


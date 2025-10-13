package de.seitenbau.serviceportal.scripting.api.v1.fitconnect;

import java.util.Arrays;

public enum FitConnectMimeTypeV1
{
  APPLICATION_JSON("application/json"),
  APPLICATION_XML("application/xml"),
  PLAIN_TEXT("text/plain"),
  APPLICATION_OCTET_STREAM("application/octet-stream"),
  APPLICATION_PDF("application/pdf");

  private final String value;

  FitConnectMimeTypeV1(final String value)
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

  public static FitConnectMimeTypeV1 fromValue(final String value)
  {
    return Arrays.stream(values()).findFirst().orElseThrow(
        () -> new IllegalArgumentException("Unexpected value '" + value + "'"));
  }
}

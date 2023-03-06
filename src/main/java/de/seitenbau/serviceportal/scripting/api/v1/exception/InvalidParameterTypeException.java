package de.seitenbau.serviceportal.scripting.api.v1.exception;

/**
 * Exception, die geworfen wird, wenn versucht wurde, einen Prozessparamter abzurufen und dieser einen
 * anderen Typ hatte als den erwarteten.
 */
public class InvalidParameterTypeException extends RuntimeException
{
  public InvalidParameterTypeException(String message, Throwable cause)
  {
    super(message, cause);
  }
}

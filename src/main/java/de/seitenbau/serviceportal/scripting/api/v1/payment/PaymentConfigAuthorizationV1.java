package de.seitenbau.serviceportal.scripting.api.v1.payment;

import java.io.Serializable;

public interface PaymentConfigAuthorizationV1 extends Serializable
{
  PaymentConfigAuthorizationTypeV1 getType();
}

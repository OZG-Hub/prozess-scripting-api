package de.seitenbau.serviceportal.scripting.api.v1.form.json;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface OverwriteJsonClassName
{
  String value();
}

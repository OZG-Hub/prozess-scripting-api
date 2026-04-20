package de.seitenbau.serviceportal.scripting.api.v1.form.ajax;

/**
 * Proxy für HTTP-Requests im Rahmen von Ajax-Funktionalitäten.
 *
 * @since Release 1.208
 */
public enum ProxyTypeV1
{
  /** Proxy zum Zugriff auf das Internet. */
  INTERNET,

  /** Proxy zum Zugriff auf das kommunale Datennetz / kommunale Verwaltungsnetz. */
  KVN
}

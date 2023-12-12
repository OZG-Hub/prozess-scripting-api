package de.seitenbau.serviceportal.scripting.api.v1;

import de.seitenbau.serviceportal.scripting.api.v1.crypto.CryptoConfigurationV1;
import de.seitenbau.serviceportal.scripting.api.v1.crypto.EncryptedValueV1;
import de.seitenbau.serviceportal.scripting.api.v1.crypto.PBKDConfigurationV1;

/**
 * Scripting API Version 1 Schnittstelle für die Ver- und Entschlüsselung.
 * Mit der globalen Variable {@code apiV1.crypto} kann die Verschlüsselungs-API in einen Groovy-Scripttask
 * eingebunden werden und die hier dokumentierten Methoden verwendet werden.
 *
 * @since Release 1.169
 */
public interface CryptoApiV1
{
  /**
   * Gibt die Standardkonfiguration für die Ver- und Entschlüsselung mittels AES-256 zurück.
   * <pre>
   *     CryptoConfigurationV1.builder()
   *         .cipherTransformation("AES/CBC/PKCS5Padding")
   *         .initialisationVectorLengthInBits(128)
   *         .pbkdConfiguration(PBKDConfigurationV1.builder()
   *             .secretKeyFactoryAlgorithm("PBKDF2WithHmacSHA256")
   *             .secretKeySpecAlgorithm("AES")
   *             .pbeKeySpecIterationCount(65_536)
   *             .pbeKeySpecKeyLengthInBits(256)
   *             .build())
   *         .build();
   * </pre>
   *
   * @return Die Standardkonfiguration für die Ver- und Entschlüsselung mittels AES-256.
   */
  default CryptoConfigurationV1 getAES256CryptoConfiguration()
  {
    return CryptoConfigurationV1.builder()
        .cipherTransformation("AES/CBC/PKCS5Padding")
        .initialisationVectorLengthInBits(128)
        .pbkdConfiguration(PBKDConfigurationV1.builder()
            .secretKeyFactoryAlgorithm("PBKDF2WithHmacSHA256")
            .secretKeySpecAlgorithm("AES")
            .pbeKeySpecIterationCount(65_536)
            .pbeKeySpecKeyLengthInBits(256)
            .build())
        .build();
  }

  /**
   * Verschlüsselt die Input-Daten mit AES-256 symmetrischer Verschlüsselung und
   * ist identisch zu encrypt(input, password, getAES256CryptoConfiguration()).
   * Der Schlüssel wird aus dem Passwort mit der <a
   * href="https://de.wikipedia.org/wiki/PBKDF2">Password-Based Key Derivation Function 2</a> abgeleitet.
   * Die {@link #getAES256CryptoConfiguration()} Konfiguration wird angewendet.
   *
   * @param input Die zu verschlüsselnden Daten.
   * @param password Das Passwort, das zur Erzeugung des Verschlüsselungsschlüssels verwendet wird.
   *
   * @return Die verschlüsselten Daten, das Passwortsalz und der Initialisierungsvektor der Verschlüsselung.
   * @see #getAES256CryptoConfiguration()
   * @see #encrypt(byte[], String, CryptoConfigurationV1)
   */
  default EncryptedValueV1 encryptAES256(byte[] input, String password)
  {
    return encrypt(input, password, getAES256CryptoConfiguration());
  }

  /**
   * Entschlüsselt die Input-Daten mit AES-256 symmetrischer Verschlüsselung und
   * ist identisch zu decrypt(encryptedValue, password, getAES256CryptoConfiguration());
   * {@link #decrypt(EncryptedValueV1, String, CryptoConfigurationV1)}
   * Der Schlüssel wird aus dem Passwort mit der <a
   * href="https://de.wikipedia.org/wiki/PBKDF2">Password-Based Key Derivation Function 2</a> abgeleitet.
   * Die {@link #getAES256CryptoConfiguration()} Konfiguration wird angewendet.
   *
   * @param encryptedValue Die zu entschlüsselnden Daten.
   * @param password Das Passwort, das zur Erzeugung des Entschlüsselungsschlüssels verwendet wird.
   *
   * @return Die entschlüsselten Daten.
   * @see #getAES256CryptoConfiguration()
   * @see #decrypt(EncryptedValueV1, String, CryptoConfigurationV1)
   */
  default byte[] decryptAES256(EncryptedValueV1 encryptedValue, String password)
  {
    return decrypt(encryptedValue, password, getAES256CryptoConfiguration());
  }

  /**
   * Verschlüsselt die Input-Daten.
   * Der Schlüssel wird aus dem Passwort mit der vom Benutzer konfigurierten
   * Password-Based Key Derivation Funktion abgeleitet.
   *
   * @param input Die zu verschlüsselnden Daten.
   * @param password Das Passwort, das zur Erzeugung des Verschlüsselungsschlüssels verwendet wird.
   * @param cryptoConfiguration Die Konfiguration der PBKD- und Verschlüsselungsfunktionen
   *
   * @return Die verschlüsselten Daten, das Passwortsalz und der Initialisierungsvektor der Verschlüsselung.
   */
  EncryptedValueV1 encrypt(byte[] input, String password, CryptoConfigurationV1 cryptoConfiguration);

  /**
   * Entschlüsselt die Input-Daten.
   * Der Schlüssel wird aus dem Passwort mit der vom Benutzer konfigurierten
   * Password-Based Key Derivation Funktion abgeleitet.
   *
   * @param encryptedValue Die zu entschlüsselnden Daten.
   * @param password Das Passwort, das zur Erzeugung des Entschlüsselungsschlüssels verwendet wird.
   * @param cryptoConfiguration Die Konfiguration der PBKD- und Entschlüsselungsfunktionen.
   *
   * @return Die entschlüsselten Daten.
   */
  byte[] decrypt(EncryptedValueV1 encryptedValue, String password, CryptoConfigurationV1 cryptoConfiguration);
}


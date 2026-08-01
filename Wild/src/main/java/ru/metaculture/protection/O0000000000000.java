package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import java.util.UUID;
import javax.crypto.Cipher;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource.PSpecified;

public final class O0000000000000 {
   public static final String O00000000 = "server-key-1";
   static final int O000000000 = 446;
   private static final String O00000000000 = "-----BEGIN PUBLIC KEY-----\nMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA0QoLnE+hVCxsFnkwpKOD\nDOho6OoakoXkVlWMTSBRFzPJJkeFdiw++SfdW0YJtQIZuekmf5eZGqZTLXKBI8Jq\ngk/pX6qGmNeARjF2V5W1isT2xTxAAS5LefbWTDTuT2vLtdL5lcG3KZa3PnAoiaA3\n2E8gyE/ME/7LEI6lZXhmVIPMLBWyOdB4O9QBks1iX8tDbwQNTG30UIjYWAq9ZoeF\nkGe0amY9snhTEnhI+NvqCT486uOhVLsSQeggDgjj5jEAwJicUxVwALnJRDRn+rfJ\n4vPUpaYik12tIIbu4jEH5KVieWtMvY4or0Q9RxlMzBhbf0s6nElcAXY2cmocl8LK\niPCHhiaKyG1wEcbTFA+YqW/f6iEzi3Me5eSb/WAhpcFLRJi0H17cgBbINr4S3+DF\nLCEXVNEr33WKncrauNvsa0nwBQIfjJBS3DfKODRg11cvT1NWJxFP1MoVJzxxXoHk\nJGLMEuKPGYbC5IdidWV5+iGfxOoUzhKppDauntDRCqqS4F9eS0DsuQ1Z04x8Z/YG\nUq+2eFbrA/k3H8SLz4me8D9XH6fQJlGcpzZnhP7/2jKOuptfxWpnukL8Ysi7xF5+\n7htZciGCZpZ1DXxYpnNjxIYGzD9aKNpXWAUeZqXtvzvBjDcl/UGdMyPWeJlCfXZg\noJwlnWSm4E/mdVe0DS8V/PkCAwEAAQ==\n-----END PUBLIC KEY-----";
   public static final boolean O0000000000 = O0000000000();
   private static volatile PublicKey O000000000000;

   private O0000000000000() {
   }

   public static O0000000000000.W0 O00000000(String string) {
      byte[] var1 = string.getBytes(StandardCharsets.UTF_8);
      if (var1.length > 446) {
         throw new O0000000000000.W3(var1.length, 446);
      } else {
         byte[] var2 = O00000000(var1, O000000000());
         String var3 = Base64.getUrlEncoder().withoutPadding().encodeToString(var2);
         return new O0000000000000.W0(1, "server-key-1", var3, System.currentTimeMillis() / 1000L, UUID.randomUUID().toString());
      }
   }

   public static void O00000000() {
      if (O0000000000) {
         String var0 = "FAKE-SMBIOS|FAKE-DISK|FAKE-BOARD|FAKE-CPU|FAKE-DEVICE";
         System.out.println("[FingerprintCrypto] ── self-test ──────────────────────────");

         boolean var6;
         try {
            O000000000();
            var6 = true;
         } catch (Exception var5) {
            var6 = false;
            System.out.println("[FingerprintCrypto] RSA public key loaded: false — " + var5.getMessage());
            System.out.println("[FingerprintCrypto] ── self-test FAILED ──────────────────");
            return;
         }

         System.out.println("[FingerprintCrypto] RSA public key loaded: " + var6);
         System.out.println("[FingerprintCrypto] RSA algorithm: RSA-OAEP-SHA256");

         O0000000000000.W0 var2;
         try {
            var2 = O00000000(var0);
         } catch (Exception var4) {
            System.out.println("[FingerprintCrypto] encrypt() FAILED — " + var4.getMessage());
            System.out.println("[FingerprintCrypto] ── self-test FAILED ──────────────────");
            return;
         }

         System.out.println("[FingerprintCrypto] encryptedPayload length: " + var2.encryptedPayload().length());
         System.out.println("[FingerprintCrypto] requestId:               " + var2.requestId());
         System.out.println("[FingerprintCrypto] timestamp:               " + var2.timestamp());
         System.out
            .printf(
               "[FingerprintCrypto] DTO preview: {\"v\":%d,\"kid\":\"%s\",\"encryptedPayload\":\"%s...\",\"timestamp\":%d,\"requestId\":\"%s\"}%n",
               var2.v(),
               var2.kid(),
               var2.encryptedPayload().substring(0, Math.min(24, var2.encryptedPayload().length())),
               var2.timestamp(),
               var2.requestId()
            );
         System.out.println("[FingerprintCrypto] ── self-test OK ─────────────────────────");
      }
   }

   static PublicKey O000000000() {
      PublicKey var0 = O000000000000;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (O0000000000000.class) {
            var0 = O000000000000;
            if (var0 != null) {
               return var0;
            } else {
               O000000000000 = O000000000(
                  "-----BEGIN PUBLIC KEY-----\nMIICIjANBgkqhkiG9w0BAQEFAAOCAg8AMIICCgKCAgEA0QoLnE+hVCxsFnkwpKOD\nDOho6OoakoXkVlWMTSBRFzPJJkeFdiw++SfdW0YJtQIZuekmf5eZGqZTLXKBI8Jq\ngk/pX6qGmNeARjF2V5W1isT2xTxAAS5LefbWTDTuT2vLtdL5lcG3KZa3PnAoiaA3\n2E8gyE/ME/7LEI6lZXhmVIPMLBWyOdB4O9QBks1iX8tDbwQNTG30UIjYWAq9ZoeF\nkGe0amY9snhTEnhI+NvqCT486uOhVLsSQeggDgjj5jEAwJicUxVwALnJRDRn+rfJ\n4vPUpaYik12tIIbu4jEH5KVieWtMvY4or0Q9RxlMzBhbf0s6nElcAXY2cmocl8LK\niPCHhiaKyG1wEcbTFA+YqW/f6iEzi3Me5eSb/WAhpcFLRJi0H17cgBbINr4S3+DF\nLCEXVNEr33WKncrauNvsa0nwBQIfjJBS3DfKODRg11cvT1NWJxFP1MoVJzxxXoHk\nJGLMEuKPGYbC5IdidWV5+iGfxOoUzhKppDauntDRCqqS4F9eS0DsuQ1Z04x8Z/YG\nUq+2eFbrA/k3H8SLz4me8D9XH6fQJlGcpzZnhP7/2jKOuptfxWpnukL8Ysi7xF5+\n7htZciGCZpZ1DXxYpnNjxIYGzD9aKNpXWAUeZqXtvzvBjDcl/UGdMyPWeJlCfXZg\noJwlnWSm4E/mdVe0DS8V/PkCAwEAAQ==\n-----END PUBLIC KEY-----"
               );
               return O000000000000;
            }
         }
      }
   }

   private static PublicKey O000000000(String string) {
      String var1 = string.replace("-----BEGIN PUBLIC KEY-----", "").replace("-----END PUBLIC KEY-----", "").replaceAll("\\s+", "");

      byte[] var2;
      try {
         var2 = Base64.getDecoder().decode(var1);
      } catch (IllegalArgumentException var5) {
         throw new O0000000000000.W2("PEM contains invalid Base64", var5);
      }

      try {
         return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(var2));
      } catch (Exception var4) {
         throw new O0000000000000.W2("Cannot parse RSA-4096 public key: " + var4.getMessage(), var4);
      }
   }

   private static byte[] O00000000(byte[] bs, PublicKey publicKey) {
      try {
         Cipher var2 = Cipher.getInstance("RSA/ECB/OAEPPadding");
         OAEPParameterSpec var3 = new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSpecified.DEFAULT);
         var2.init(1, publicKey, var3);
         return var2.doFinal(bs);
      } catch (Exception var4) {
         throw new O0000000000000.W1("RSA-OAEP-SHA256 encryption failed: " + var4.getMessage(), var4);
      }
   }

   private static boolean O0000000000() {
      String var0 = System.getProperty("wild.crypto.selftest");
      return var0 != null ? Boolean.parseBoolean(var0.trim()) : "true".equalsIgnoreCase(System.getenv("WILD_CRYPTO_SELFTEST"));
   }

   public record W0(int v, String kid, String encryptedPayload, long timestamp, String requestId) {
   }

   public static final class W1 extends RuntimeException {
      public W1(String string, Throwable throwable) {
         super(string, throwable);
      }
   }

   public static final class W2 extends RuntimeException {
      public W2(String string, Throwable throwable) {
         super(string, throwable);
      }
   }

   public static final class W3 extends RuntimeException {
      public W3(int i, int j) {
         super("Payload too large for RSA-4096-OAEP-SHA256: " + i + " bytes (max " + j + ")");
      }
   }
}

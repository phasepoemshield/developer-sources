package ru.metaculture.protection;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.Map;

public final class O00000000000OO {
   private O00000000000OO() {
   }

   public static boolean O00000000() {
      return true;
   }

   public static Map<String, String> O000000000() {
      LinkedHashMap var0 = new LinkedHashMap();
      String[] var1 = new String[]{
         "org.wild.auth.BuildInfo",
         "org.wild.auth.LocalAccessGuard",
         "org.wild.auth.LocalLicenseService",
         "org.wild.auth.DelayedFuse",
         "org.wild.auth.FingerprintCrypto",
         "org.wild.auth.HeartbeatService",
         "org.wild.auth.HwidUtils"
      };

      for (String var5 : var1) {
         String var6 = O00000000(var5);
         if (var6 != null) {
            var0.put(var5, var6);
         }
      }

      return var0;
   }

   public static void O0000000000() {
   }

   private static Map<String, String> O00000000000() {
      LinkedHashMap var0 = new LinkedHashMap();

      for (String var4 : O0000000000.O00000000000OO) {
         int var5 = var4.indexOf(58);
         if (var5 > 0 && var5 < var4.length() - 1) {
            var0.put(var4.substring(0, var5).trim(), var4.substring(var5 + 1).trim());
         }
      }

      return var0;
   }

   private static String O00000000(String string) {
      String var1 = string.replace('.', '/') + ".class";

      try {
         String var6;
         try (InputStream var2 = Thread.currentThread().getContextClassLoader().getResourceAsStream(var1)) {
            if (var2 == null) {
               return null;
            }

            MessageDigest var3 = MessageDigest.getInstance("SHA-256");
            byte[] var4 = new byte[8192];

            int var5;
            while ((var5 = var2.read(var4)) >= 0) {
               if (var5 > 0) {
                  var3.update(var4, 0, var5);
               }
            }

            var6 = HexFormat.of().formatHex(var3.digest());
         }

         return var6;
      } catch (Throwable var9) {
         return null;
      }
   }

   private static boolean O00000000(String string, String string2) {
      if (string != null && string2 != null) {
         byte[] var2 = string.getBytes(StandardCharsets.UTF_8);
         byte[] var3 = string2.getBytes(StandardCharsets.UTF_8);
         if (var2.length != var3.length) {
            return false;
         } else {
            int var4 = 0;

            for (int var5 = 0; var5 < var2.length; var5++) {
               var4 |= var2[var5] ^ var3[var5];
            }

            return var4 == 0;
         }
      } else {
         return false;
      }
   }
}

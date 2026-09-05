package ru.metaculture.protection;

import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public final class VUVvVuvuN {
   private VUVvVuvuN() {
   }

   public static boolean UuUVuuUu() {
      if (VvunVVUvUNnv.vuuuNvNuv.length == 0) {
         return true;
      } else {
         Map var0 = vVvUvVVuuNvV();

         for (Entry var2 : var0.entrySet()) {
            String var3 = UuUVuuUu((String)var2.getKey());
            if (var3 == null) {
               return false;
            }

            if (!UuUVuuUu(var3.toLowerCase(), ((String)var2.getValue()).toLowerCase())) {
               return false;
            }
         }

         return true;
      }
   }

   public static Map<String, String> C00OOC00oO() {
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
         String var6 = UuUVuuUu(var5);
         if (var6 != null) {
            var0.put(var5, var6);
         }
      }

      return var0;
   }

   public static void uUnuvNvvNU() {
      if (Boolean.getBoolean("wild.integrity.print")) {
         for (Entry var1 : C00OOC00oO().entrySet()) {
            System.out.println((String)var1.getKey() + ":" + (String)var1.getValue());
         }
      }
   }

   private static Map<String, String> vVvUvVVuuNvV() {
      LinkedHashMap var0 = new LinkedHashMap();

      for (String var4 : VvunVVUvUNnv.vuuuNvNuv) {
         int var5 = var4.indexOf(58);
         if (var5 > 0 && var5 < var4.length() - 1) {
            var0.put(var4.substring(0, var5).trim(), var4.substring(var5 + 1).trim());
         }
      }

      return var0;
   }

   private static String UuUVuuUu(String var0) {
      String var1 = var0.replace('.', '/') + ".class";

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

   private static boolean UuUVuuUu(String var0, String var1) {
      if (var0 != null && var1 != null) {
         byte[] var2 = var0.getBytes(StandardCharsets.UTF_8);
         byte[] var3 = var1.getBytes(StandardCharsets.UTF_8);
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

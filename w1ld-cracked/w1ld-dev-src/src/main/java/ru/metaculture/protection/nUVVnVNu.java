package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class nUVVnVNu {
   private static final String UuUVuuUu = "UNKNOWN";
   private static final boolean C00OOC00oO = System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");
   private static final long uUnuvNvvNU = Long.getLong("wild.hwid.processTimeoutMs", 1500L);
   private static volatile String vVvUvVVuuNvV;
   private static volatile String uNNnnnuuuN;
   private static volatile String nuUnNvnuUu;
   private static volatile String VVuuUN;

   private nUVVnVNu() {
   }

   public static String UuUVuuUu() {
      String var0 = vVvUvVVuuNvV;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (nUVVnVNu.class) {
            var0 = vVvUvVVuuNvV;
            if (var0 == null) {
               vVvUvVVuuNvV = var0 = uNNnnnuuuN() + "|" + uVUuuVnNVU();
            }

            return var0;
         }
      }
   }

   private static String vVvUvVVuuNvV() {
      String var0 = uNNnnnuuuN;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (nUVVnVNu.class) {
            var0 = uNNnnnuuuN;
            if (var0 == null) {
               uNNnnnuuuN = var0 = uNNnnnuuuN() + "|" + nuUnNvnuUu() + "|" + VVuuUN() + "|" + vNUvnnVnUvu() + "|" + uVUuuVnNVU();
            }

            return var0;
         }
      }
   }

   public static String C00OOC00oO() {
      String var0 = nuUnNvnuUu;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (nUVVnVNu.class) {
            var0 = nuUnNvnuUu;
            if (var0 == null) {
               nuUnNvnuUu = var0 = C00OOC00oO(UuUVuuUu());
            }

            return var0;
         }
      }
   }

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static String uUnuvNvvNU() {
      String var0 = VVuuUN;
      if (var0 != null) {
         return var0;
      } else {
         Class<nUVVnVNu> var1 = nUVVnVNu.class;
         synchronized (nUVVnVNu.class){} // $VF: monitorenter 

         try {
            var0 = VVuuUN;
            if (var0 == null) {
               VVuuUN = var0 = C00OOC00oO(vVvUvVVuuNvV());
            }

            // $VF: monitorexit
            return var0;
         } finally {
            // $VF: monitorexit
         }
      }
   }

   public static boolean UuUVuuUu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         return C00OOC00oO(var1, C00OOC00oO().toLowerCase(Locale.ROOT)) ? true : C00OOC00oO(var1, uUnuvNvvNU().toLowerCase(Locale.ROOT));
      } else {
         return false;
      }
   }

   private static String uNNnnnuuuN() {
      return UuUVuuUu("csproduct", "UUID");
   }

   private static String nuUnNvnuUu() {
      return UuUVuuUu("diskdrive", "SerialNumber");
   }

   private static String VVuuUN() {
      return UuUVuuUu("baseboard", "SerialNumber");
   }

   private static String vNUvnnVnUvu() {
      return UuUVuuUu("cpu", "ProcessorId");
   }

   private static String uVUuuVnNVU() {
      String var0 = C00OOC00oO ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
      if (var0 != null && !var0.isBlank()) {
         return var0.trim();
      } else {
         return C00OOC00oO ? UuUVuuUu("computersystem", "Name") : UuUVuuUu("hostname");
      }
   }

   private static String UuUVuuUu(String var0, String var1) {
      if (!C00OOC00oO) {
         return "UNKNOWN";
      } else {
         List var2 = C00OOC00oO("wmic", var0, "get", var1);
         boolean var3 = false;

         for (String var5 : var2) {
            String var6 = var5.trim();
            if (!var6.isEmpty()) {
               if (var3) {
                  return var6;
               }

               var3 = true;
            }
         }

         return "UNKNOWN";
      }
   }

   private static String UuUVuuUu(String... var0) {
      for (String var2 : C00OOC00oO(var0)) {
         if (var2 != null && !var2.isBlank()) {
            return var2.trim();
         }
      }

      return "UNKNOWN";
   }

   private static List<String> C00OOC00oO(String... var0) {
      Process var1 = null;

      try {
         var1 = new ProcessBuilder(var0).redirectErrorStream(true).start();
         if (!var1.waitFor(uUnuvNvvNU, TimeUnit.MILLISECONDS)) {
            var1.destroyForcibly();
            return List.of();
         } else {
            String var2 = new String(var1.getInputStream().readAllBytes(), StandardCharsets.UTF_8);
            return var2.lines().toList();
         }
      } catch (Throwable var3) {
         if (var1 != null) {
            var1.destroyForcibly();
         }

         return List.of();
      }
   }

   private static String C00OOC00oO(String var0) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(var0.getBytes(StandardCharsets.UTF_8));
         return HexFormat.of().formatHex(var2);
      } catch (Throwable var3) {
         throw new IllegalStateException("                                   ", var3);
      }
   }

   private static boolean C00OOC00oO(String var0, String var1) {
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

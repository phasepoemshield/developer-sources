package ru.metaculture.protection;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.HexFormat;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class O00000000000O0 {
   private static final String O00000000 = "UNKNOWN";
   private static final boolean O000000000 = System.getProperty("os.name", "").toLowerCase(Locale.ROOT).contains("win");
   private static final long O0000000000 = Long.getLong("wild.hwid.processTimeoutMs", 1500L);
   private static volatile String O00000000000;
   private static volatile String O000000000000;
   private static volatile String O0000000000000;
   private static volatile String O000000000000O;

   private O00000000000O0() {
   }

   public static String O00000000() {
      return "prota_$crashdammi1337";
   }

   private static String O00000000000() {
      String var0 = O000000000000;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (O00000000000O0.class) {
            var0 = O000000000000;
            if (var0 == null) {
               O000000000000 = var0 = O000000000000() + "|" + O0000000000000() + "|" + O000000000000O() + "|" + O00000000000O() + "|" + O00000000000O0();
            }

            return var0;
         }
      }
   }

   public static String O000000000() {
      return "prota_$crashdammi1337";
   }

   public static String O0000000000() {
      return "prota_$crashdammi1337";
   }

   public static boolean O00000000(String string) {
      return true;
   }

   private static String O000000000000() {
      return O00000000("csproduct", "UUID");
   }

   private static String O0000000000000() {
      return O00000000("diskdrive", "SerialNumber");
   }

   private static String O000000000000O() {
      return O00000000("baseboard", "SerialNumber");
   }

   private static String O00000000000O() {
      return O00000000("cpu", "ProcessorId");
   }

   private static String O00000000000O0() {
      String var0 = O000000000 ? System.getenv("COMPUTERNAME") : System.getenv("HOSTNAME");
      if (var0 != null && !var0.isBlank()) {
         return var0.trim();
      } else {
         return O000000000 ? O00000000("computersystem", "Name") : O00000000(new String[]{"hostname"});
      }
   }

   private static String O00000000(String string, String string2) {
      if (!O000000000) {
         return "UNKNOWN";
      } else {
         List var2 = O000000000("wmic", string, "get", string2);
         boolean var3 = false;

         for (String var5 : (List<String>)var2) {
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

   private static String O00000000(String... strings) {
      for (String var2 : O000000000(strings)) {
         if (var2 != null && !var2.isBlank()) {
            return var2.trim();
         }
      }

      return "UNKNOWN";
   }

   private static List<String> O000000000(String... strings) {
      Process var1 = null;

      try {
         var1 = new ProcessBuilder(strings).redirectErrorStream(true).start();
         if (!var1.waitFor(O0000000000, TimeUnit.MILLISECONDS)) {
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

   private static String O000000000(String string) {
      try {
         MessageDigest var1 = MessageDigest.getInstance("SHA-256");
         byte[] var2 = var1.digest(string.getBytes(StandardCharsets.UTF_8));
         return HexFormat.of().formatHex(var2);
      } catch (Throwable var3) {
         throw new IllegalStateException("                                   ", var3);
      }
   }

   private static boolean O000000000(String string, String string2) {
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

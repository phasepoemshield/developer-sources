package ru.metaculture.protection;

import java.util.Locale;

public final class vUvNUVuNUvUu {
   public static final String UuUVuuUu = "";
   private static final int C00OOC00oO = 64;

   private vUvNUVuNUvUu() {
   }

   public static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.trim().toLowerCase(Locale.ROOT);
         if (var1.endsWith(".")) {
            var1 = var1.substring(0, var1.length() - 1);
         }

         if (!var1.isEmpty() && var1.length() <= 64 && var1.indexOf(46) >= 0) {
            return C00OOC00oO(var1) ? var1 : "";
         } else {
            return "";
         }
      }
   }

   private static boolean C00OOC00oO(String var0) {
      for (int var1 = 0; var1 < var0.length(); var1++) {
         if (!UuUVuuUu(var0.charAt(var1))) {
            return false;
         }
      }

      return true;
   }

   private static boolean UuUVuuUu(char var0) {
      return var0 >= 'a' && var0 <= 'z' || var0 >= '0' && var0 <= '9' || var0 == '.' || var0 == '-' || var0 == ':' || var0 == '_';
   }
}

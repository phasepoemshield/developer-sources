package ru.metaculture.protection;

import java.security.SecureRandom;

public final class UVNvnnvuNv {
   private static final SecureRandom UuUVuuUu = new SecureRandom();

   private UVNvnnvuNv() {
   }

   public static String UuUVuuUu() {
      byte[] var0 = new byte[8];
      UuUVuuUu.nextBytes(var0);
      StringBuilder var1 = new StringBuilder(8);

      for (byte var5 : var0) {
         var1.append("0123456789ABCDEFGHJKMNPQRSTVWXYZ".charAt((var5 & 255) % "0123456789ABCDEFGHJKMNPQRSTVWXYZ".length()));
      }

      return var1.toString();
   }

   public static String UuUVuuUu(String var0) {
      if (var0 == null) {
         return "";
      } else {
         StringBuilder var1 = new StringBuilder(8);

         for (char var5 : var0.toCharArray()) {
            if (var5 != '-' && !Character.isWhitespace(var5)) {
               var1.append(UuUVuuUu(Character.toUpperCase(var5)));
            }
         }

         return var1.toString();
      }
   }

   public static boolean C00OOC00oO(String var0) {
      if (var0 != null && var0.length() == 8) {
         for (char var4 : var0.toCharArray()) {
            if ("0123456789ABCDEFGHJKMNPQRSTVWXYZ".indexOf(var4) < 0) {
               return false;
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private static char UuUVuuUu(char var0) {
      return switch (var0) {
         case 'I', 'L' -> '1';
         case 'O' -> '0';
         default -> var0;
      };
   }
}

package ru.metaculture.protection;

import java.util.Locale;

public final class O00000OOO00O0 {
   private O00000OOO00O0() {
   }

   public static O00000OOO00O0.W300 O00000000(O00000OOO0O00O o00000OOO0O00O, String string) {
      String var2 = o00000OOO0O00O.O000000000().toLowerCase(Locale.ROOT);
      int var3 = 0;
      int[] var4 = O00000000(var2, string);
      if (var4 != null) {
         var3 += 30;
         if (var2.startsWith(string)) {
            var3 += 90;
         } else if (var2.contains(string)) {
            var3 += 48;
         }

         int var5 = -2;

         for (int var9 : var4) {
            if (var9 == var5 + 1) {
               var3 += 10;
            } else if (var9 > var5 + 1 && var5 >= 0) {
               var3 -= Math.min(var9 - var5 - 1, 6);
            }

            if (var9 == 0 || O00000000(var2.charAt(var9 - 1))) {
               var3 += 14;
            }

            var5 = var9;
         }
      }

      String var10 = o00000OOO0O00O.O00000000().toLowerCase(Locale.ROOT);
      String var11 = o00000OOO0O00O.O0000000000().toLowerCase(Locale.ROOT);
      if (var10.contains(string)) {
         var3 += 22;
      }

      if (var11.contains(string)) {
         var3 += 10;
      }

      return var3 <= 0 ? null : new O00000OOO00O0.W300(o00000OOO0O00O, var3, var4 == null ? new int[0] : var4);
   }

   public static int[] O00000000(String string, String string2) {
      int[] var2 = new int[string2.length()];
      int var3 = 0;

      for (int var4 = 0; var4 < string2.length(); var4++) {
         int var5 = string.indexOf(string2.charAt(var4), var3);
         if (var5 < 0) {
            return null;
         }

         var2[var4] = var5;
         var3 = var5 + 1;
      }

      return var2;
   }

   public static boolean O00000000(char c) {
      return c == ' ' || c == '_' || c == '.' || c == '-' || c == '(' || c == '/';
   }

   public record W300(O00000OOO0O00O def, int score, int[] titlePositions) {
   }
}

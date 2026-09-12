package Nursultan;

final class class10067 {
   static boolean L(String var0, int var1, int var2) {
      return N(var0, var1, var2) != y(var0, var1, var2);
   }

   static int L(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = N(var0, var1);
         return var2 >= var0.length() ? var0.length() : var0.offsetByCodePoints(var2, 1);
      } else {
         return 0;
      }
   }

   private class10067() {
   }

   static int y(String var0, int var1) {
      if (var0 != null && !var0.isEmpty()) {
         int var2 = N(var0, var1);
         return var2 <= 0 ? 0 : var0.offsetByCodePoints(var2, -1);
      } else {
         return 0;
      }
   }

   static int y(String var0, int var1, int var2) {
      return Math.max(N(var0, var1), N(var0, var2));
   }

   static int N(String var0, int var1) {
      String var2 = var0 == null ? "" : var0;
      int var3 = class09693.N(var1, 0, var2.length());
      return var3 > 0 && var3 < var2.length() && Character.isLowSurrogate(var2.charAt(var3)) && Character.isHighSurrogate(var2.charAt(var3 - 1))
         ? var3 - 1
         : var3;
   }

   static int N(String var0, int var1, int var2) {
      return Math.min(N(var0, var1), N(var0, var2));
   }
}

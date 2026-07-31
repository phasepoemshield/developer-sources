package ru.metaculture.protection;

public final class O00000OOO000O {
   private O00000OOO000O() {
   }

   public static O00000OOO000O0 O00000000(O00000OOOOOOOO o00000OOOOOOOO, O0000O00000 o0000O00000) {
      if (o00000OOOOOOOO != null && o0000O00000 != null) {
         String var2 = O00000000();
         float var3 = O0000O00000OO.O00000000(FontRegistry.O00000000000, var2, 12.0F);
         float var4 = O0000O00000OO.O00000000(FontRegistry.O000000000000, "g", 12.0F);
         float var5 = o00000OOOOOOOO.O000000000000O() + o00000OOOOOOOO.O00000000000O0() - o0000O00000.O00000000(16.0F) - var4;
         float var6 = var5 - o0000O00000.O00000000(8.0F) - var3;
         float var7 = o0000O00000.O00000000(86.0F);
         float var8 = o0000O00000.O00000000(24.0F);
         float var9 = var6 - o0000O00000.O00000000(12.0F) - var7;
         float var10 = o00000OOOOOOOO.O00000000000O() + (o0000O00000.O0000000000O() - var8) * 0.5F;
         return new O00000OOO000O0(var9, var10, var7, var8);
      } else {
         return new O00000OOO000O0(0.0F, 0.0F, 0.0F, 0.0F);
      }
   }

   private static String O00000000() {
      MenuModule var0 = MenuModule.O0000000000OO();
      int var1 = var0 != null && var0.O000000000000 != -1 ? var0.O000000000000 : 344;
      return O0000O000OO0O0.O00000000(var1);
   }
}

package ru.metaculture.protection;

public final class O0000O000O {
   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O000O0OOO o0000O000O0OOO, int i, int j) {
      float var6 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000OO0());
      if (!(var6 < 0.01F) && o0000O000O0O0.O000000OO0() != null && !o0000O000O0O0.O000000OO0().isEmpty()) {
         O0000O00000 var7 = o0000O000O0OOO.O000000000000();
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         String var9 = o0000O000O0O0.O000000OO0();
         float var10 = O0000O00000OO.O00000000(FontRegistry.O00000000, var9, 9.0F);
         float var11 = var7.O00000000(8.0F);
         float var12 = var7.O00000000(4.0F);
         float var13 = var10 + var11 * 2.0F;
         float var14 = var7.O00000000(18.0F);
         float var15 = var7.O00000000(5.0F);
         float var16 = o0000O000O0O0.O000000OO00() + var7.O00000000(12.0F);
         float var17 = o0000O000O0O0.O000000OO000() - var14 - var7.O00000000(4.0F);
         if (var16 + var13 > i - var7.O00000000(4.0F)) {
            var16 = i - var13 - var7.O00000000(4.0F);
         }

         if (var16 < var7.O00000000(4.0F)) {
            var16 = var7.O00000000(4.0F);
         }

         if (var17 < var7.O00000000(4.0F)) {
            var17 = o0000O000O0O0.O000000OO000() + var7.O00000000(16.0F);
         }

         o0000O00OO0O0.O000000000000(var6);

         try {
            o0000O00OO0O0.O00000000(
               var16,
               var17,
               var13,
               var14,
               var15,
               var7.O00000000(var8.O000000000O000() ? 10.0F : 6.0F),
               var7.O00000000(var8.O000000000O000() ? 2.0F : 1.0F),
               ColorScheme.O00000000(0, 0, 0, var8.O000000000O000() ? 34 : 40)
            );
            o0000O00OO0O0.O00000000(
               var16, var17, var13, var14, var15, var8.O000000000O000() ? ColorScheme.O00000000(255, 255, 255, 232) : ColorScheme.O00000000(18, 19, 23, 240)
            );
            o0000O00OO0O0.O00000000(var16, var17, var13, var14, var15, var8.O0000000000O0(), 0.5F);
            O0000O00000OO.O00000000(o0000O00OO0O0, var7, FontRegistry.O00000000, var16 + var11, var17, var14, 9.0F, var9, var8.O000000000O());
         } finally {
            o0000O00OO0O0.O00000000000OO();
         }
      }
   }
}

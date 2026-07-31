package ru.metaculture.protection;

import java.util.List;

public final class O0000O0000OOOO {
   private static final float O00000000 = 1.5F;
   private static final float O000000000 = 2.0F;
   private static final float O0000000000 = 3.5F;

   public void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO, float f) {
      float var6 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O0());
      if (!(var6 <= 0.005F)) {
         O0000O00000 var7 = O00000000(o0000O000O0OOO);
         ColorScheme var8 = o0000O000O0OOO.O0000000000000();
         float var9 = o00000OOOOOOOO.O000000000O00O();
         float var10 = o00000OOOOOOOO.O000000000O0O();
         float var11 = var7.O000000000O0();
         float var12 = var7.O000000000O00();
         float var13 = var7.O00000000(14.0F);
         float var14 = this.O000000000(var6);
         RenderManager.W384 var15 = !o0000O000O0O0.O00000000OOOOO() && !o0000O000O0O0.O0000000OO000O()
            ? o0000O00OO0O0.O000000000(var9, var10, var11, var12)
            : null;
         if (var15 != null) {
            try {
               this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, f, var9, var10, var11, var12, var13);
            } finally {
               o0000O00OO0O0.O00000000(var15);
            }

            int var16 = O0000O00000OO.O000000000000O(var8);
            int var17 = var8.O000000000O000()
               ? O0000O00000OO.O000000000(var8, 0.95F)
               : ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 64), var8.O000000000O0(), 0.3F);
            int var18 = var8.O000000000O00();
            int var19 = var8.O000000000O0();
            float var20 = this.O00000000();
            o0000O00OO0O0.O00000000(var15, var9, var10, var11, var12, var13, var16, var17, var18, var19, var14, var20);
         } else {
            this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, f, var9, var10, var11, var12, var13);
         }
      }
   }

   private static O0000O00000 O00000000(O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var1 = o0000O000O0OOO.O000000000000();
      return var1.O0000000000(var1.O0000000000());
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O000O0O0 o0000O000O0O0,
      O00000OOOOOOOO o00000OOOOOOOO,
      O0000O000O0OOO o0000O000O0OOO,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k
   ) {
      O0000O00000 var11 = O00000000(o0000O000O0OOO);
      ColorScheme var12 = o0000O000O0OOO.O0000000000000();
      float var13 = var11.O00000000(8.0F);
      float var14 = var11.O00000000(44.0F);
      float var15 = var11.O00000000(8.0F);
      o0000O00OO0O0.O00000000(
         g - 1.0F,
         h - 1.0F,
         i + 2.0F,
         j + 2.0F,
         k + 1.0F,
         var12.O000000000O000() ? ColorScheme.O00000000(255, 255, 255, 194) : ColorScheme.O00000000(15, 16, 19, 255)
      );
      o0000O00OO0O0.O00000000(g, h, i, j, k, 0.88F);
      o0000O00OO0O0.O00000000(g, h, i, j, k, O0000O00000OO.O000000000000O(var12));
      if (var12.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            g + var11.O00000000(0.8F),
            h + var11.O00000000(0.8F),
            i - var11.O00000000(1.6F),
            j - var11.O00000000(1.6F),
            Math.max(0.0F, k - var11.O00000000(0.8F)),
            O0000O00000OO.O000000000(var12, 0.95F),
            var11.O00000000(0.85F)
         );
      }

      this.O00000000(o0000O00OO0O0, g, h, i, j, k, var12, f);
      this.O00000000(o0000O00OO0O0, g, h, i, j, k, f);
      O0000O0000000O var16 = O0000O0000000O.O00000000(o00000OOOOOOOO, var11);
      float var17 = var16.O0000000000();
      float var18 = var16.O000000000();
      float var19 = var16.O00000000000();
      o0000O00OO0O0.O00000000(
         g + var13, h + var13, var17, var14, var15, var15, var11.O00000000(4.0F), var11.O00000000(4.0F), O0000O00000OO.O00000000000O(var12)
      );
      o0000O00OO0O0.O00000000(g + var13, var18, var17, var19, var11.O00000000(4.0F), var11.O00000000(4.0F), var15, var15, O0000O00000OO.O00000000000O(var12));
      if (var12.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            g + var13 + var11.O00000000(0.7F),
            h + var13 + var11.O00000000(0.7F),
            var17 - var11.O00000000(1.4F),
            var14 - var11.O00000000(1.4F),
            Math.max(0.0F, var15 - var11.O00000000(0.7F)),
            Math.max(0.0F, var15 - var11.O00000000(0.7F)),
            Math.max(0.0F, var11.O00000000(4.0F) - var11.O00000000(0.7F)),
            Math.max(0.0F, var11.O00000000(4.0F) - var11.O00000000(0.7F)),
            O0000O00000OO.O000000000(var12, 0.72F),
            var11.O00000000(0.75F)
         );
         o0000O00OO0O0.O00000000(
            g + var13 + var11.O00000000(0.7F),
            var18 + var11.O00000000(0.7F),
            var17 - var11.O00000000(1.4F),
            var19 - var11.O00000000(1.4F),
            Math.max(0.0F, var11.O00000000(4.0F) - var11.O00000000(0.7F)),
            Math.max(0.0F, var11.O00000000(4.0F) - var11.O00000000(0.7F)),
            Math.max(0.0F, var15 - var11.O00000000(0.7F)),
            Math.max(0.0F, var15 - var11.O00000000(0.7F)),
            O0000O00000OO.O000000000(var12, 0.72F),
            var11.O00000000(0.75F)
         );
      }

      this.O00000000(o0000O00OO0O0, var11, var12, g, h, i, var13, var14, o0000O000O0OOO);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, var16, var11, var12);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, var16, o0000O000O0OOO);
      this.O00000000(o0000O00OO0O0, o0000O000O0O0, o00000OOOOOOOO, o0000O000O0OOO, var18, var19);
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O0000000O o0000O0000000O, O0000O00000 o0000O00000, ColorScheme o0000O000O0OO
   ) {
      float var6 = o0000O0000000O.O000000000000();
      float var7 = o0000O0000000O.O0000000000000();
      float var8 = o0000O0000000O.O000000000000O();
      float var9 = o0000O0000000O.O00000000000O();
      float var10 = o0000O00000.O00000000(8.0F);
      float var11 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O00());
      float var12 = o0000O000O0O0.O00000000(O0000O000O00O0.O0000000000O0O());
      String var13 = o0000O000O0O0.O00000000OOO0();
      boolean var14 = !o0000O000O0O0.O00000000OOOOO() && o0000O000O0O0.O00000000OOO00();
      o0000O00OO0O0.O00000000(var6, var7, var8, var9, var10, O0000O00000OO.O00000000000O(o0000O000O0OO));
      o0000O00OO0O0.O00000000(var6, var7, var8, var9, var10, ColorScheme.O00000000(o0000O000O0OO.O00000000000O0(), o0000O000O0OO.O0000000000O(), var11));
      if (o0000O000O0OO.O000000000O000()) {
         o0000O00OO0O0.O00000000(
            var6 + o0000O00000.O00000000(0.7F),
            var7 + o0000O00000.O00000000(0.7F),
            var8 - o0000O00000.O00000000(1.4F),
            var9 - o0000O00000.O00000000(1.4F),
            Math.max(0.0F, var10 - o0000O00000.O00000000(0.7F)),
            O0000O00000OO.O000000000(o0000O000O0OO, 0.78F),
            o0000O00000.O00000000(0.75F)
         );
      }

      if (var11 > 0.01F) {
         o0000O00OO0O0.O00000000(
            var6 - o0000O00000.O00000000(0.5F),
            var7 - o0000O00000.O00000000(0.5F),
            var8 + o0000O00000.O00000000(1.0F),
            var9 + o0000O00000.O00000000(1.0F),
            var10 + o0000O00000.O00000000(0.5F),
            ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(50.0F * var11)),
            1.0F
         );
      }

      float var15 = o0000O00000.O00000000(10.0F);
      float var16 = o0000O0000000O.O00000000000OO();
      float var17 = var8 - var15 * 2.0F - var16;
      int var18 = ColorScheme.O00000000(o0000O000O0OO.O0000000000OOO(), o0000O000O0OO.O000000000O(), var11);
      float var19 = var13.isEmpty() ? 0.0F : O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, var13, 10.0F);
      float var20 = var19 > var17 ? var17 - var19 : 0.0F;
      o0000O00OO0O0.O00000000((int)var6, (int)var7, (int)(var8 - var16), (int)var9);
      if (!var13.isEmpty()) {
         O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var6 + var15 + var20, var7, var9, 10.0F, var13, var18);
      } else if (!var14) {
         O0000O00000OO.O00000000(
            o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var6 + var15, var7, var9, 10.0F, "Поиск тем...", o0000O000O0OO.O0000000000OO0()
         );
      }

      if (var14) {
         float var21 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
         float var22 = o0000O00000.O00000000(11.0F);
         o0000O00OO0O0.O00000000(
            var6 + var15 + var20 + var19 + o0000O00000.O00000000(1.0F),
            var7 + (var9 - var22) * 0.5F,
            Math.max(1.0F, o0000O00000.O00000000(1.0F)),
            var22,
            0.0F,
            ColorScheme.O00000000(o0000O000O0OO.O00000000000(), Math.round(255.0F * var21))
         );
      }

      o0000O00OO0O0.O0000000000000();
      float var23 = Math.max(var11 * 0.3F, var12);
      if (var23 > 0.01F) {
         float var24 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O000000000000, "l", 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            o0000O00000,
            FontRegistry.O000000000000,
            o0000O0000000O.O00000000000O0() + (var16 - var24) * 0.5F,
            var7,
            var9,
            10.0F,
            "l",
            ColorScheme.O00000000(o0000O000O0OO.O00000000000(), Math.round(255.0F * var23))
         );
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, ColorScheme o0000O000O0OO, float k) {
      if (!o0000O000O0OO.O000000000O000()) {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

         try {
            float var9 = k * (float) (Math.PI * 2);
            float var10 = 0.8F + 0.2F * (float)Math.sin(var9 * 0.3);
            float var11 = h * 0.75F;
            float var12 = i * 0.55F;
            float var13 = Math.min(var11, var12) * 0.5F;
            float var14 = f + h * 0.05F + (float)Math.cos(var9 * 0.1) * h * 0.04F;
            float var15 = g + i * 0.06F + (float)Math.sin(var9 * 0.08) * i * 0.03F;
            o0000O00OO0O0.O00000000(
               var14, var15, var11, var12, var13, var11 * 0.45F, var11 * 0.12F, ColorScheme.O00000000(o0000O000O0OO.O000000000O0(), Math.round(3.0F * var10))
            );
            float var16 = 0.75F + 0.25F * (float)Math.sin(var9 * 0.22 + 2.094F);
            float var17 = h * 0.65F;
            float var18 = i * 0.5F;
            float var19 = Math.min(var17, var18) * 0.5F;
            float var20 = f + h * 0.35F + (float)Math.cos(var9 * 0.14 + 1.2F) * h * 0.05F;
            float var21 = g + i * 0.5F + (float)Math.sin(var9 * 0.1 + 0.7F) * i * 0.04F;
            o0000O00OO0O0.O00000000(
               var20, var21, var17, var18, var19, var17 * 0.4F, var17 * 0.1F, ColorScheme.O00000000(o0000O000O0OO.O000000000O00(), Math.round(2.0F * var16))
            );
         } finally {
            o0000O00OO0O0.O0000000000();
            o0000O00OO0O0.O0000000000000();
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, float k) {
      o0000O00OO0O0.O0000000000();
      o0000O00OO0O0.O00000000(f, g, h, i, j, j, j, j);

      try {
         long var8 = (long)(k * 10000.0F) + 9999L;
         float var10 = 36.0F;
         float var11 = 36.0F;
         int var12 = (int)Math.ceil(h / var10) + 1;
         int var13 = (int)Math.ceil(i / var11) + 1;

         for (int var14 = 0; var14 < var13; var14++) {
            for (int var15 = 0; var15 < var12; var15++) {
               long var16 = var8 + var15 * 73856093L + var14 * 19349663L ^ 25214903917L;
               var16 = var16 * 6364136223846793005L + 1442695040888963407L;
               int var18 = (int)(var16 >>> 48 & 15L);
               if (var18 <= 5) {
                  int var19 = 3 + (var18 & 3);
                  float var20 = Math.round(f + var15 * var10 + (float)(var16 >>> 32 & 15L) - 8.0F);
                  float var21 = Math.round(g + var14 * var11 + (float)(var16 >>> 16 & 15L) - 8.0F);
                  float var22 = 1.0F + (var18 & 1);
                  int var23 = (var18 & 1) == 0 ? ColorScheme.O00000000(255, 255, 255, var19) : ColorScheme.O00000000(0, 0, 0, var19 + 1);
                  o0000O00OO0O0.O00000000(var20, var21, var22, var22, 0.0F, var23);
               }
            }
         }
      } finally {
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0,
      O0000O00000 o0000O00000,
      ColorScheme o0000O000O0OO,
      float f,
      float g,
      float h,
      float i,
      float j,
      O0000O000O0OOO o0000O000O0OOO
   ) {
      float var10 = o0000O00000.O00000000(30.0F);
      float var11 = f + i + o0000O00000.O00000000(8.0F);
      float var12 = g + i + (j - var10) * 0.5F;
      o0000O00OO0O0.O00000000(
         var11,
         var12,
         var10,
         var10,
         o0000O00000.O00000000(7.0F),
         o0000O000O0OO.O000000000O000() ? O0000O00000OO.O00000000(o0000O000O0OO, 0.0F) : o0000O000O0OO.O00000000000O0()
      );
      o0000O00OO0O0.O00000000(
         var11,
         var12,
         var10,
         var10,
         o0000O00000.O00000000(7.0F),
         o0000O000O0OO.O000000000O000() ? O0000O00000OO.O000000000(o0000O000O0OO, 0.82F) : o0000O000O0OO.O0000000000O(),
         o0000O000O0OO.O000000000O000() ? o0000O00000.O00000000(0.85F) : 1.5F
      );
      O0000O00000OO.O00000000(
         o0000O00OO0O0,
         o0000O00000,
         o0000O000O0OO,
         var11 + o0000O00000.O00000000(5.0F),
         var12 + o0000O00000.O00000000(5.0F),
         o0000O00000.O00000000(9.0F),
         o0000O00000.O00000000(2.0F)
      );
      float var13 = o0000O00000.O00000000(5.0F);
      float var14 = g + i;
      float var15 = var11 + var10 + var13;
      O0000O00000OO.O00000000(
         o0000O00OO0O0, o0000O00000, FontRegistry.O00000000, var15, var14, j, 11.0F, "mintmegaantileak.xyz", o0000O000O0OO.O0000000000OOO()
      );
      var15 += O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000, "mintmegaantileak.xyz", 11.0F) + var13;
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000O, var15, var14, j, 8.0F, "k", o0000O000O0OO.O0000000000OO0());
      var15 += O0000O00000OO.O00000000(o0000O00000, FontRegistry.O00000000000O, "k", 8.0F) + var13;
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O000000000000, var15, var14, j, 11.0F, "p", o0000O000O0OO.O00000000000());
      var15 += O0000O00000OO.O00000000(o0000O00000, FontRegistry.O000000000000, "p", 11.0F) + var13;
      O0000O00000OO.O00000000(o0000O00OO0O0, o0000O00000, FontRegistry.O00000000000, var15, var14, j, 11.0F, "Themes", o0000O000O0OO.O000000000O());
      float var16 = o0000O00000.O00000000(20.0F);
      float var17 = f + h - o0000O00000.O00000000(15.0F) - var16;
      float var18 = g + o0000O00000.O00000000(20.0F);
      o0000O00OO0O0.O00000000(
         var17,
         var18,
         var16,
         var16,
         o0000O00000.O00000000(5.0F),
         o0000O000O0OO.O000000000O000() ? O0000O00000OO.O00000000(o0000O000O0OO, 0.2F) : o0000O000O0OO.O00000000000OO()
      );
      o0000O00OO0O0.O00000000(
         var17,
         var18,
         var16,
         var16,
         o0000O00000.O00000000(5.0F),
         o0000O000O0OO.O000000000O000() ? O0000O00000OO.O000000000(o0000O000O0OO, 0.86F) : o0000O000O0OO.O0000000000O0(),
         o0000O00000.O00000000(0.8F)
      );
      float var19 = O0000O00000OO.O00000000(o0000O00000, FontRegistry.O000000000000, "l", 14.0F);
      O0000O00000OO.O00000000(
         o0000O00OO0O0, o0000O00000, FontRegistry.O000000000000, var17 + (var16 - var19) * 0.5F, var18, var16, 14.0F, "l", o0000O000O0OO.O0000000000OOO()
      );
   }

   private void O00000000(RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O0000O0000000O o0000O0000000O, O0000O000O0OOO o0000O000O0OOO) {
      O0000O00000 var5 = O00000000(o0000O000O0OOO);
      ColorScheme var6 = o0000O000O0OOO.O0000000000000();
      float var7 = o0000O0000000O.O0000000000();
      float var8 = o0000O0000000O.O0000000000O();
      float var9 = o0000O0000000O.O0000000000O0();
      float var10 = var5.O00000000(8.0F);
      float var11 = var5.O00000000(8.0F);
      float var12 = (float)(System.currentTimeMillis() % 4000L) / 4000.0F;
      float var13 = o0000O0000000O.O000000000();
      float var14 = o0000O0000000O.O00000000000();
      float var15 = o0000O000O0O0.O0000000000OOO();
      float var16 = O0000O00000OO.O0000000000(var5);
      List var17 = o0000O000O0OOO.O000000000000O().O000000000();
      List var18 = o0000O000O0O0.O00000000(o0000O000O0OOO.O000000000000O());
      if (var18 == null || var18.isEmpty()) {
         String var19 = "Ничего не найдено";
         float var20 = O0000O00000OO.O00000000(var5, FontRegistry.O00000000, var19, 10.0F);
         O0000O00000OO.O00000000(
            o0000O00OO0O0, var5, FontRegistry.O00000000, o0000O0000000O.O00000000() + (var7 - var20) * 0.5F, var13, var14, 10.0F, var19, var6.O0000000000OO0()
         );
      } else {
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var5,
            var6,
            o0000O0000000O.O00000000(),
            var13,
            var7,
            var14,
            var5.O00000000(4.0F),
            var5.O00000000(4.0F),
            var11,
            var11,
            o0000O000O0O0.O00000000O0OO().O0000000000(),
            () -> {
               for (int var17x = 0; var17x < var18.size(); var17x++) {
                  int var18x = (Integer)var18.get(var17x);
                  O0000O000OO.W351 var19x = (O0000O000OO.W351)var17.get(var18x);
                  O0000O0000000O.W330 var20x = o0000O0000000O.O00000000(var17x, var15);
                  if (o0000O0000000O.O00000000(var20x, var16)) {
                     float var21 = var20x.x();
                     float var22 = var20x.y();
                     float var23 = o0000O000O0O0.O00000000(O0000O000O00O0.O00000000(var18x));
                     float var24 = o0000O000O0O0.O00000000(O0000O000O00O0.O000000000(var18x));
                     float var25 = Math.max(var23, var24);
                     if (var24 > 0.01F) {
                        float var26 = 0.72F + 0.28F * (float)Math.sin(var12 * Math.PI * 2.0 + var18x * 0.5);
                        int var27 = var6.O000000000O000()
                           ? ColorScheme.O00000000(0, 0, 0, Math.round(34.0F * var24 * var26))
                           : ColorScheme.O00000000(var19x.O0000000000(), Math.round(62.0F * var24 * var26));
                        o0000O00OO0O0.O00000000(var21, var22, var8, var9, var10, var5.O00000000(18.0F) * var24 * var26, var5.O00000000(4.0F), var27);
                     }

                     o0000O00OO0O0.O00000000(
                        var21,
                        var22,
                        var8,
                        var9,
                        var10,
                        var6.O000000000O000()
                           ? O0000O00000OO.O00000000(var6, var23 * 0.7F)
                           : ColorScheme.O00000000(var6.O00000000000O(), var6.O0000000000O(), var23 * 0.7F)
                     );
                     if (var24 < 0.5F) {
                        float var39 = 1.0F - var24 * 2.0F;
                        int var41 = var6.O000000000O000()
                           ? ColorScheme.O00000000(O0000O00000OO.O000000000(var6, 0.85F), ColorScheme.O00000000(var19x.O0000000000(), 90), var23 * 0.22F)
                           : ColorScheme.O00000000(var6.O00000000000OO(), ColorScheme.O00000000(var19x.O0000000000(), 110), var23 * 0.6F);
                        int var28 = var41 >>> 24 & 0xFF;
                        o0000O00OO0O0.O00000000(
                           var21,
                           var22,
                           var8,
                           var9,
                           var10,
                           ColorScheme.O00000000(var41, Math.round(var28 * var39)),
                           var6.O000000000O000() ? var5.O00000000(0.85F) : 1.5F
                        );
                     }

                     float var40 = O0000O00000OO.O00000000000(var12 + var18x * 0.071F);
                     if (var23 > 0.01F || var24 > 0.01F) {
                        float var42 = var5.O00000000(5.0F);
                        float var44 = var5.O00000000(18.0F);
                        float var29 = Math.max(0.0F, var8 - var42 * 2.0F - var44);
                        float var30 = var21 + var42 + var29 * var40;
                        o0000O00OO0O0.O0000000000();
                        o0000O00OO0O0.O00000000(
                           var21 + var5.O00000000(1.0F),
                           var22 + var5.O00000000(1.0F),
                           var8 - var5.O00000000(2.0F),
                           var9 - var5.O00000000(2.0F),
                           Math.max(0.0F, var10 - var5.O00000000(1.0F)),
                           Math.max(0.0F, var10 - var5.O00000000(1.0F)),
                           Math.max(0.0F, var10 - var5.O00000000(1.0F)),
                           Math.max(0.0F, var10 - var5.O00000000(1.0F))
                        );

                        try {
                           o0000O00OO0O0.O00000000(
                              var30,
                              var22 + var5.O00000000(2.0F),
                              var44,
                              var9 - var5.O00000000(4.0F),
                              var5.O00000000(7.0F),
                              ColorScheme.O00000000(255, 255, 255, 0),
                              ColorScheme.O00000000(255, 255, 255, Math.round((16.0F + var24 * 20.0F) * var25))
                           );
                           o0000O00OO0O0.O00000000(
                              var30 + var44 * 0.42F,
                              var22 + var5.O00000000(3.0F),
                              var44 * 0.42F,
                              var9 - var5.O00000000(6.0F),
                              var5.O00000000(6.0F),
                              ColorScheme.O00000000(255, 255, 255, Math.round((10.0F + var24 * 14.0F) * var25)),
                              ColorScheme.O00000000(255, 255, 255, 0)
                           );
                        } finally {
                           o0000O00OO0O0.O0000000000();
                           o0000O00OO0O0.O0000000000000();
                        }
                     }

                     float var43 = var5.O00000000(28.0F);
                     float var45 = var5.O00000000(14.0F);
                     float var46 = Math.round((var21 + var8 - var43 - var5.O00000000(10.0F)) * 2.0F) * 0.5F;
                     float var47 = Math.round((var22 + (var9 - var45) * 0.5F) * 2.0F) * 0.5F;
                     float var31 = 3.5F;
                     float var32 = var21 + var5.O00000000(10.0F);
                     float var33 = Math.max(var5.O00000000(34.0F), var46 - var32 - var5.O00000000(10.0F));
                     String var34 = var19x.O00000000();
                     String var35 = O0000O00000OO.O00000000(var5, FontRegistry.O00000000000, var34, 10.0F, var33);
                     O0000O00000OO.O00000000(
                        o0000O00OO0O0,
                        var5,
                        FontRegistry.O00000000000,
                        var32,
                        var22,
                        var9,
                        10.0F,
                        var35,
                        ColorScheme.O00000000(var6.O0000000000OOO(), var6.O000000000O(), var25)
                     );
                     if (!var35.equals(var34)
                        && !o0000O000O0O0.O00000000OOOOO()
                        && O0000O00000OO.O00000000(o0000O000O0O0, o0000O0000000O.O00000000(), var13, var7, var14)
                        && O0000O00000OO.O00000000(o0000O000O0O0, var21, var22, var8, var9)) {
                        o0000O000O0O0.O00000000("theme:" + var18x, var34, var32, var22 + var9 + var5.O00000000(8.0F));
                     }

                     if (var24 > 0.01F) {
                        int var36 = var6.O000000000O000()
                           ? ColorScheme.O00000000(0, 0, 0, Math.round(22.0F * var24))
                           : ColorScheme.O00000000(var19x.O0000000000(), Math.round(68.0F * var24));
                        o0000O00OO0O0.O00000000(
                           var46 - var5.O00000000(1.5F),
                           var47 - var5.O00000000(1.5F),
                           var43 + var5.O00000000(3.0F),
                           var45 + var5.O00000000(3.0F),
                           var31 + var5.O00000000(1.5F),
                           var5.O00000000(8.0F) * var24,
                           var5.O00000000(1.3F),
                           var36
                        );
                     }

                     this.O00000000(o0000O00OO0O0, var19x, var46, var47, var43, var45, var31);
                     if (var24 > 0.01F) {
                        o0000O00OO0O0.O00000000(
                           var46, var47, var43, var45, var31, ColorScheme.O00000000(ColorScheme.O00000000(255, 255, 255, 255), Math.round(36.0F * var24)), 1.0F
                        );
                     }
                  }
               }

               this.O00000000(o0000O00OO0O0, o0000O000O0O0, var17, var6, var10, var5);
            }
         );
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, List<O0000O000OO.W351> list, ColorScheme o0000O000O0OO, float f, O0000O00000 o0000O00000
   ) {
      if (o0000O000O0O0.O000000O0O0OOO() && o0000O000O0O0.O000000O0OO()) {
         int var7 = o0000O000O0O0.O000000O0OO0();
         int var8 = var7 >= 0 && var7 < list.size() ? var7 : -1;
         O0000O000OO.W351 var9 = var8 >= 0 ? (O0000O000OO.W351)list.get(var8) : null;
         int var10 = var9 != null ? var9.O0000000000() : o0000O000O0OO.O000000000O0();
         float var11 = o0000O000O0O0.O000000O0OOO0O();
         float var12 = o0000O000O0O0.O000000O0OOOO();
         float var13 = o0000O000O0O0.O000000O0OOOO0();
         float var14 = o0000O000O0O0.O000000O0OOOOO();
         if (!(var13 < 1.0F) && !(var14 < 1.0F)) {
            float var15 = Math.max(0.0F, Math.min(1.0F, o0000O000O0O0.O000000OO()));
            float var16 = this.O00000000(var15);
            float var17 = 1.0F - var16;
            float var18 = (float)Math.sin(var15 * Math.PI);
            if (var17 > 0.01F && o0000O000O0O0.O000000O0OOO0() > 1.0F && o0000O000O0O0.O000000O0OOO00() > 1.0F) {
               int var19 = o0000O000O0O0.O000000O0OO00();
               O0000O000OO.W351 var20 = var19 >= 0 && var19 < list.size() ? (O0000O000OO.W351)list.get(var19) : var9;
               int var21 = var20 != null ? var20.O0000000000() : var10;
               this.O00000000(
                  o0000O00OO0O0,
                  o0000O000O0O0.O000000O0OO0OO(),
                  o0000O000O0O0.O000000O0OOO(),
                  o0000O000O0O0.O000000O0OOO0(),
                  o0000O000O0O0.O000000O0OOO00(),
                  f,
                  var21,
                  var17 * 0.82F,
                  true,
                  o0000O00000,
                  o0000O000O0OO.O000000000O000()
               );
            }

            if (var18 > 0.01F) {
               float var27 = o0000O00000.O00000000(3.0F);
               float var28 = f + o0000O00000.O00000000(4.0F);
               float var29 = Math.round((this.O00000000(o0000O000O0O0.O000000O0OO0OO(), var11, var16) - var27) * 2.0F) * 0.5F;
               float var22 = Math.round((this.O00000000(o0000O000O0O0.O000000O0OOO(), var12, var16) - var27) * 2.0F) * 0.5F;
               float var23 = Math.round((this.O00000000(o0000O000O0O0.O000000O0OOO0(), var13, var16) + var27 * 2.0F) * 2.0F) * 0.5F;
               float var24 = Math.round((this.O00000000(o0000O000O0O0.O000000O0OOO00(), var14, var16) + var27 * 2.0F) * 2.0F) * 0.5F;
               int var25 = var9 != null ? ColorScheme.O00000000(var10, var9.O00000000000(), 0.28F) : var10;
               int var26 = o0000O000O0OO.O000000000O000()
                  ? ColorScheme.O00000000(0, 0, 0, Math.round(30.0F * var18))
                  : ColorScheme.O00000000(var25, Math.round(70.0F * var18));
               o0000O00OO0O0.O00000000(var29, var22, var23, var24, var28, o0000O00000.O00000000(10.0F) * var18, o0000O00000.O00000000(2.2F) * var18, var26);
               o0000O00OO0O0.O00000000(
                  var29, var22, var23, var24, var28, ColorScheme.O00000000(var25, Math.round(82.0F * var18)), o0000O00000.O00000000(2.0F + var18 * 1.1F)
               );
            }

            this.O00000000(o0000O00OO0O0, var11, var12, var13, var14, f, var10, 0.06F + var16 * 0.94F, false, o0000O00000, o0000O000O0OO.O000000000O000());
         }
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j, int k, float l, boolean bl, O0000O00000 o0000O00000, boolean bl2
   ) {
      float var12 = Math.max(0.0F, Math.min(1.0F, l));
      if (!(var12 <= 0.005F)) {
         float var13 = bl ? (float)Math.pow(var12, 0.5) : var12;
         float var14 = o0000O00000.O00000000(3.0F);
         f -= var14;
         g -= var14;
         h += var14 * 2.0F;
         i += var14 * 2.0F;
         j += o0000O00000.O00000000(4.0F);
         f = Math.round(f * 2.0F) * 0.5F;
         g = Math.round(g * 2.0F) * 0.5F;
         h = Math.round(h * 2.0F) * 0.5F;
         i = Math.round(i * 2.0F) * 0.5F;
         j = Math.round(j * 2.0F) * 0.5F;
         float var15 = 1.0F - var13;
         float var16 = o0000O00000.O00000000(bl ? 2.4F + var15 * var15 * 3.6F : 1.4F);
         float var17 = o0000O00000.O00000000(bl ? 13.0F + var15 * var15 * 8.0F : 8.0F);
         float var18 = bl ? 44.0F * var13 * var13 : 58.0F * var12;
         o0000O00OO0O0.O00000000(
            f,
            g,
            h,
            i,
            j,
            var17 * var13,
            var16 * var13,
            bl2 ? ColorScheme.O00000000(0, 0, 0, Math.round(Math.min(38.0F, var18 * 0.55F))) : ColorScheme.O00000000(k, Math.round(var18))
         );
         float var19 = bl ? 120.0F * var13 * var13 : 220.0F * var12;
         float var20 = o0000O00000.O00000000(bl ? 2.0F * var13 : 2.0F);
         o0000O00OO0O0.O00000000(f, g, h, i, j, ColorScheme.O00000000(k, Math.round(var19)), var20);
      }
   }

   private float O00000000(float f) {
      float var2 = Math.max(0.0F, Math.min(1.0F, f));
      return var2 * var2 * var2 * (var2 * (var2 * 6.0F - 15.0F) + 10.0F);
   }

   private float O00000000(float f, float g, float h) {
      float var4 = Math.max(0.0F, Math.min(1.0F, h));
      return f + (g - f) * var4;
   }

   private float O000000000(float f) {
      float var2 = Math.max(0.0F, Math.min(1.0F, f));
      return (float)Math.pow(var2, 1.42F);
   }

   private float O00000000() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(RenderManager o0000O00OO0O0, O0000O000OO.W351 o000000000, float f, float g, float h, float i, float j) {
      float var8 = Math.round(f * 2.0F) * 0.5F;
      float var9 = Math.round(g * 2.0F) * 0.5F;
      float var10 = Math.round((f + h) * 2.0F) * 0.5F - var8;
      float var11 = Math.round((g + i) * 2.0F) * 0.5F - var9;
      float var12 = Math.min(j, Math.min(var10, var11) * 0.5F);
      int[] var13 = o000000000.O0000000000000();
      if (var13 != null && var13.length >= 2) {
         float var14 = var10 / (var13.length - 1);
         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O00000000(var8, var9, var10, var11, var12, var12, var12, var12);
         boolean var20 = false /* VF: Semaphore variable */;

         try {
            var20 = true;

            for (int var15 = 0; var15 < var13.length - 1; var15++) {
               float var16 = var8 + var14 * var15;
               float var17 = var15 == var13.length - 2 ? var10 - var14 * var15 : var14 + 0.5F;
               o0000O00OO0O0.O00000000(var16, var9, var17, var11, 0.0F, var13[var15], var13[var15 + 1]);
            }

            var20 = false;
         } finally {
            if (var20) {
               o0000O00OO0O0.O0000000000();
               o0000O00OO0O0.O0000000000000();
            }
         }

         o0000O00OO0O0.O0000000000();
         o0000O00OO0O0.O0000000000000();
      } else {
         o0000O00OO0O0.O00000000(var8, var9, var10, var11, var12, o000000000.O0000000000(), o000000000.O00000000000());
      }
   }

   private void O00000000(
      RenderManager o0000O00OO0O0, O0000O000O0O0 o0000O000O0O0, O00000OOOOOOOO o00000OOOOOOOO, O0000O000O0OOO o0000O000O0OOO, float f, float g
   ) {
      O0000O00000 var7 = O00000000(o0000O000O0OOO);
      ColorScheme var8 = o0000O000O0OOO.O0000000000000();
      if (!(o0000O000O0O0.O0000000O0O000() <= 0.5F)) {
         float var9 = var7.O00000000(7.0F);
         float var10 = Math.max(var7.O00000000(3.2F), var7.O000000000O() - var7.O00000000(0.2F));
         float var11 = o00000OOOOOOOO.O000000000O00O() + var7.O000000000O0() - var9 - var10 - var7.O00000000(0.8F);
         float var12 = g - var7.O00000000(10.0F);
         float var13 = f + var7.O00000000(5.0F);
         float var14 = Math.max(var7.O00000000(28.0F), var12 * (var12 / (var12 + o0000O000O0O0.O0000000O0O000())));
         float var15 = Math.min(1.0F, Math.max(0.0F, -o0000O000O0O0.O0000000000OOO() / o0000O000O0O0.O0000000O0O000()));
         float var16 = var13 + (var12 - var14) * var15;
         O0000O00000OO.O00000000(
            o0000O00OO0O0,
            var7,
            var8,
            var11,
            var13,
            var10,
            var12,
            var16,
            var14,
            o0000O000O0O0.O00000000O0OO().O0000000000(),
            0.0F,
            2L,
            o0000O000O0O0.O0000000O(),
            o0000O000O0O0.O0000000O0(),
            o0000O000O0O0::O00000000000
         );
      }
   }
}

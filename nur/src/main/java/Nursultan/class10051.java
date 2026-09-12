package Nursultan;

final class class10051 {
   private final class10052 N;

   class10051(class10052 var1) {
      this.N = var1;
   }

   private class10063 y(class10021 var1, class09980 var2) {
      class09962 var3 = var2.Q();
      class09962 var4 = var2.O();
      boolean var5 = class10048.N(var3);
      boolean var6 = class10048.N(var4) && var5;
      if (!var5) {
         return new class10063(0.0F, 0.0F, 0.0F, 0.0F);
      } else {
         class10056 var7 = this.N.N(var1, var2);
         float var8 = class10048.N(var4) ? var7.y() : 0.0F;
         float var9 = var2.a() == class09964.WORDS ? var7.L() : var7.N();
         return new class10063(var7.N(), var6 ? var7.y() : 0.0F, var9, var8);
      }
   }

   private static float N(class09980 var0, class10036 var1, float var2) {
      return class10048.M(var0, var1, var2);
   }

   private class10063 N(class10021 var1, class09980 var2) {
      return var1.y() == class10049.TEXT ? this.y(var1, var2) : new class10063(0.0F, 0.0F, 0.0F, 0.0F);
   }

   void N(class10021 var1) {
      this.N.i().y++;

      for (int var2 = 0; var2 < var1.u(); var2++) {
         class10021 var3 = var1.N(var2);
         this.N(var3);
      }

      class09980 var15 = var1.o();
      boolean var16 = var15.y();
      boolean var4 = var15.M() == class09975.ROW;
      int var11 = 0;
      float var5;
      float var6;
      float var7;
      float var8;
      float var9;
      float var10;
      if (var4) {
         var5 = class10048.u(var15, class10036.WIDTH);
         var6 = class10048.u(var15, class10036.HEIGHT);
         var7 = class10048.u(var15, class10036.WIDTH);
         var8 = class10048.u(var15, class10036.HEIGHT);
         var9 = class10048.u(var15, class10036.WIDTH);
         var10 = class10048.u(var15, class10036.HEIGHT);

         for (int var12 = 0; var12 < var1.u(); var12++) {
            class10021 var13 = var1.N(var12);
            if (class10048.N(var13)) {
               var11++;
               class10061 var14 = this.N.N(var13);
               var5 += N(var14, class10036.WIDTH);
               var6 = Math.max(var6, var14.y + class10048.u(var15, class10036.HEIGHT));
               if (!var16) {
                  var7 += var14.i;
                  var8 = Math.max(var8, var14.R + class10048.u(var15, class10036.HEIGHT));
                  var9 += var14.y(class10036.WIDTH);
                  var10 = Math.max(var10, var14.y(class10036.HEIGHT) + class10048.u(var15, class10036.HEIGHT));
               }
            }
         }
      } else {
         var5 = class10048.u(var15, class10036.WIDTH);
         var6 = class10048.u(var15, class10036.HEIGHT);
         var7 = class10048.u(var15, class10036.WIDTH);
         var8 = class10048.u(var15, class10036.HEIGHT);
         var9 = class10048.u(var15, class10036.WIDTH);
         var10 = class10048.u(var15, class10036.HEIGHT);

         for (int var21 = 0; var21 < var1.u(); var21++) {
            class10021 var26 = var1.N(var21);
            if (class10048.N(var26)) {
               var11++;
               class10061 var27 = this.N.N(var26);
               var6 += var27.y;
               var5 = Math.max(var5, N(var27, class10036.WIDTH) + class10048.u(var15, class10036.WIDTH));
               if (!var16) {
                  var8 += var27.R;
                  var7 = Math.max(var7, var27.i + class10048.u(var15, class10036.WIDTH));
                  var10 += var27.y(class10036.HEIGHT);
                  var9 = Math.max(var9, var27.y(class10036.WIDTH) + class10048.u(var15, class10036.WIDTH));
               }
            }
         }
      }

      if (var11 == 0) {
         class10063 var22 = this.N(var1, var15);
         var5 = class10048.u(var15, class10036.WIDTH) + var22.N();
         var6 = class10048.u(var15, class10036.HEIGHT) + var22.y();
         var7 = class10048.u(var15, class10036.WIDTH) + var22.L();
         var8 = class10048.u(var15, class10036.HEIGHT) + var22.u();
         var9 = var7;
         var10 = var8;
      } else if (var4) {
         float var23 = class10048.N(var11, var15.E());
         var5 += var23;
         var7 = var16 ? class10048.u(var15, class10036.WIDTH) : var7 + var23;
         var8 = var16 ? class10048.u(var15, class10036.HEIGHT) : var8;
         var9 = var16 ? class10048.u(var15, class10036.WIDTH) : var9 + var23;
         var10 = var16 ? class10048.u(var15, class10036.HEIGHT) : var10;
      } else {
         float var24 = class10048.N(var11, var15.E());
         var6 += var24;
         var7 = var16 ? class10048.u(var15, class10036.WIDTH) : var7;
         var8 = var16 ? class10048.u(var15, class10036.HEIGHT) : var8 + var24;
         var9 = var16 ? class10048.u(var15, class10036.WIDTH) : var9;
         var10 = var16 ? class10048.u(var15, class10036.HEIGHT) : var10 + var24;
      }

      class10061 var25 = this.N.N(var1);
      var25.N = class10048.R(var15, class10036.WIDTH, var5);
      var25.y = class10048.R(var15, class10036.HEIGHT, var6);
      var25.y(class10036.WIDTH, var25.N);
      var25.y(class10036.HEIGHT, var25.y);
      var25.i = class10048.M(var15, class10036.WIDTH, var7);
      var25.R = class10048.M(var15, class10036.HEIGHT, var8);
      var25.u(class10036.WIDTH, N(var15, class10036.WIDTH, var9));
      var25.u(class10036.HEIGHT, N(var15, class10036.HEIGHT, var10));
      if (var15.Q().L()) {
         var25.i = Math.max(var25.i, var7);
         var25.u(class10036.WIDTH, Math.max(var25.y(class10036.WIDTH), var7));
      }

      var25.N = this.N.N(var1, class10036.WIDTH, var25.N);
      if (!var15.Q().L()) {
         var25.i(class10036.WIDTH);
      }
   }

   private static float N(class10061 var0, class10036 var1) {
      return Math.max(var0.u(var1), var0.N(var1));
   }
}

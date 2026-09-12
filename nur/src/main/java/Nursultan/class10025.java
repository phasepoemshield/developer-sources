package Nursultan;

final class class10025 {
   private final class10052 N;

   class10025(class10052 var1) {
      this.N = var1;
   }

   void y(class10021 var1) {
      this.N.i().R++;

      for (int var2 = 0; var2 < var1.u(); var2++) {
         class10021 var3 = var1.N(var2);
         this.y(var3);
      }

      class09980 var12 = var1.o();
      class10061 var13 = this.N.N(var1);
      boolean var4 = var12.y();
      if (var12.M() == class09975.ROW) {
         float var14 = class10048.u(var12, class10036.HEIGHT);
         float var15 = class10048.u(var12, class10036.HEIGHT);
         float var16 = class10048.u(var12, class10036.HEIGHT);
         int var17 = 0;

         for (int var19 = 0; var19 < var1.u(); var19++) {
            class10021 var20 = var1.N(var19);
            if (class10048.N(var20)) {
               var17++;
               class10061 var21 = this.N.N(var20);
               var14 = Math.max(var14, var21.y + class10048.u(var12, class10036.HEIGHT));
               if (!var4) {
                  var15 = Math.max(var15, var21.R + class10048.u(var12, class10036.HEIGHT));
                  var16 = Math.max(var16, var21.y(class10036.HEIGHT) + class10048.u(var12, class10036.HEIGHT));
               }
            }
         }

         if (var17 == 0) {
            this.N(var1, var13);
         } else {
            var13.y = class10048.R(var12, class10036.HEIGHT, var14);
            var13.R = class10048.M(var12, class10036.HEIGHT, var4 ? class10048.u(var12, class10036.HEIGHT) : var15);
            var13.u(class10036.HEIGHT, class10048.M(var12, class10036.HEIGHT, var4 ? class10048.u(var12, class10036.HEIGHT) : var16));
            this.N(var1, var13);
         }
      } else {
         float var5 = class10048.u(var12, class10036.HEIGHT);
         float var6 = class10048.u(var12, class10036.HEIGHT);
         float var7 = class10048.u(var12, class10036.HEIGHT);
         int var8 = 0;

         for (int var9 = 0; var9 < var1.u(); var9++) {
            class10021 var10 = var1.N(var9);
            if (class10048.N(var10)) {
               var8++;
               class10061 var11 = this.N.N(var10);
               var5 += var11.y;
               if (!var4) {
                  var6 += var11.R;
                  var7 += var11.y(class10036.HEIGHT);
               }
            }
         }

         if (var8 == 0) {
            this.N(var1, var13);
         } else {
            float var18 = class10048.N(var8, var12.E());
            var13.y = class10048.R(var12, class10036.HEIGHT, var5 + var18);
            var13.R = class10048.M(var12, class10036.HEIGHT, var4 ? class10048.u(var12, class10036.HEIGHT) : var6 + var18);
            var13.u(class10036.HEIGHT, class10048.M(var12, class10036.HEIGHT, var4 ? class10048.u(var12, class10036.HEIGHT) : var7 + var18));
            this.N(var1, var13);
         }
      }
   }

   void N(class10021 var1) {
      this.N.i().i++;

      for (int var2 = 0; var2 < var1.u(); var2++) {
         class10021 var3 = var1.N(var2);
         this.N(var3);
      }

      if (var1.y() == class10049.TEXT) {
         class09980 var9 = var1.o();
         class10061 var10 = this.N.N(var1);
         var10.Z = var1.B();
         boolean var4 = class10048.N(var9.O());
         boolean var5 = var9.a() == class09964.WORDS;
         if (!var4 && !var5) {
            this.N(var1, var10);
         } else {
            float var6 = Float.POSITIVE_INFINITY;
            if (var5) {
               var6 = Math.max(0.0F, var10.N - class10048.u(var9, class10036.WIDTH) - class10048.N(var9));
            }

            class10026 var7 = this.N.N(var1, var9, var6);
            var10.Z = var7.N();
            if (!var4) {
               this.N(var1, var10);
            } else {
               float var8 = class10048.u(var9, class10036.HEIGHT) + var7.L();
               var10.y = class10048.R(var9, class10036.HEIGHT, var8);
               var10.R = class10048.M(var9, class10036.HEIGHT, var8);
               var10.u(class10036.HEIGHT, var10.R);
               this.N(var1, var10);
            }
         }
      }
   }

   private void N(class10021 var1, class10061 var2) {
      var2.y(class10036.HEIGHT, var2.y);
      var2.y = this.N.N(var1, class10036.HEIGHT, var2.y);
      var2.i(class10036.HEIGHT);
   }
}

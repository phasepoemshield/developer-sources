package Nursultan;

final class class10022 {
   private final class10030 N;
   private final class10053 y;
   private final float L;
   private final boolean u;

   class10022(class10030 var1, class10053 var2, float var3, boolean var4) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   private void y(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6) {
      class10009 var7 = var2.E();
      boolean var8 = class10048.N(var7);
      if (var2.M() == class09975.ROW) {
         this.N(var1, var2, var3, var4, var5, var6, var7, var8);
      } else {
         this.y(var1, var2, var3, var4, var5, var6, var7, var8);
      }
   }

   private void y(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6, class10009 var7, boolean var8) {
      int var9 = 0;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var1.u(); var11++) {
         class10021 var12 = var1.N(var11);
         if (class10048.N(var12)) {
            var9++;
            var10 += this.y.y(var12);
         }
      }

      if (var9 != 0) {
         float var17 = class10048.N(var9, var7, var6 - var10);
         var10 += class10048.N(var9, var17);
         float var18 = var4;
         if (!var8) {
            var18 = var4 + class10048.y(var2.Z(), var6 - var10);
         }

         for (int var13 = 0; var13 < var1.u(); var13++) {
            class10021 var14 = var1.N(var13);
            if (class10048.N(var14)) {
               float var15 = var3 + class10048.N(var2.B(), var5 - this.y.N(var14));
               this.N(var14, var15, var18);
               var18 += this.y.y(var14) + var17;
            }
         }
      }
   }

   private float y(class10021 var1) {
      int var2 = 0;
      float var3 = 0.0F;

      for (int var4 = 0; var4 < var1.u(); var4++) {
         class10021 var5 = var1.N(var4);
         if (class10048.N(var5)) {
            var2++;
            var3 += this.y.y(var5);
         }
      }

      return var3 + class10048.N(var2, var1.o().E());
   }

   private void N(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6, class10009 var7, boolean var8) {
      int var9 = 0;
      float var10 = 0.0F;

      for (int var11 = 0; var11 < var1.u(); var11++) {
         class10021 var12 = var1.N(var11);
         if (class10048.N(var12)) {
            var9++;
            var10 += this.y.N(var12);
         }
      }

      if (var9 != 0) {
         float var17 = class10048.N(var9, var7, var5 - var10);
         var10 += class10048.N(var9, var17);
         float var18 = var3;
         if (!var8) {
            var18 = var3 + class10048.y(var2.B(), var5 - var10);
         }

         for (int var13 = 0; var13 < var1.u(); var13++) {
            class10021 var14 = var1.N(var13);
            if (class10048.N(var14)) {
               float var15 = var4 + class10048.N(var2.Z(), var6 - this.y.y(var14));
               this.N(var14, var18, var15);
               var18 += this.y.N(var14) + var17;
            }
         }
      }
   }

   private float N(float var1) {
      return class10048.L(var1, this.L);
   }

   void N(class10021 var1) {
      this.N(var1, 0.0F, 0.0F);
   }

   private void N(class10021 var1, float var2, float var3) {
      this.N.M++;
      class09980 var4 = var1.o();
      class09937 var5 = var1.c();
      float var6 = this.y.N(var1);
      float var7 = this.y.y(var1);
      var5.N(var6, var7);
      float var8 = this.N(var2);
      float var9 = this.N(var3);
      var5.L(var8, var9);
      var5.u(var8, var9);
      var5.y(this.N(var2 + var6) - var8, this.N(var3 + var7) - var9);
      float var10 = var2 + class10048.i(var4, class10036.WIDTH);
      float var11 = var3 + class10048.i(var4, class10036.HEIGHT);
      float var12 = Math.max(0.0F, var6 - class10048.u(var4, class10036.WIDTH) - class10048.N(var4));
      float var13 = Math.max(0.0F, var7 - class10048.u(var4, class10036.HEIGHT));
      float var14 = this.N(var10);
      float var15 = this.N(var11);
      var5.N(var14, var15, this.N(var10 + var12) - var14, this.N(var11 + var13) - var15);
      if (this.u) {
         this.N(var1, var5);
         this.N(var1, var5, var4, var13);
      }

      this.N(var1, var4, var10, var11, var12, var13);
   }

   private void N(class10021 var1, class09937 var2) {
      if (var1.y() == class10049.TEXT) {
         var2.N(Math.max(0.0F, var2.Z()));
         String var3 = this.y.L(var1);
         var2.N(var3 == null ? var1.B() : var3);
      } else {
         var2.N(0.0F);
         var2.N("");
      }
   }

   private void N(class10021 var1, class09937 var2, class09980 var3, float var4) {
      float var5 = 0.0F;
      if (var3.y()) {
         var5 = Math.max(0.0F, this.y(var1) - var4);
      }

      var2.i(var5, this.L);
   }

   private void N(class10021 var1, class09980 var2, float var3, float var4, float var5, float var6) {
      this.y(var1, var2, var3, var4, var5, var6);

      for (int var7 = 0; var7 < var1.u(); var7++) {
         class10021 var8 = var1.N(var7);
         if (!class10048.N(var8)) {
            class09980 var9 = var8.o();
            if (class10019.N(var8)) {
               this.N(var8, var9.j(), var9.v());
            } else {
               this.N(var8, var3 + var9.j(), var4 + var9.v());
            }
         }
      }
   }
}

package Nursultan;

import java.util.ArrayList;
import java.util.List;

final class class10040 {
   private final class10052 N;
   private final ArrayList<class10021> y = new ArrayList<>();
   private float[] L = new float[0];

   class10040(class10052 var1) {
      this.N = var1;
   }

   void y(List<class10021> var1, class10036 var2, float var3) {
      ArrayList<class10021> var4 = this.y;
      var4.clear();
      var4.addAll(var1);

      while (var3 > 0.01F && !var4.isEmpty()) {
         float var5 = Float.MAX_VALUE;
         float var6 = Float.MAX_VALUE;
         float var7 = var3;

         for (class10021 var9 : var4) {
            float var10 = this.N.N(var9).L(var2);
            if (!class10048.N(var10, var5)) {
               if (var10 < var5) {
                  var6 = var5;
                  var5 = var10;
               }

               if (var10 > var5) {
                  var6 = Math.min(var6, var10);
                  var7 = var6 - var5;
               }
            }
         }

         var7 = Math.min(var7, var3 / (float)var4.size());

         for (int var16 = 0; var16 < var4.size(); var16++) {
            class10021 var17 = var4.get(var16);
            class10061 var18 = this.N.N(var17);
            float var11 = var18.L(var2);
            if (class10048.N(var11, var5)) {
               float var13 = class10048.u(var17.o(), var2, var18.N(var2));
               float var14 = var11 + var7;
               if (var14 >= var13) {
                  var14 = var13;
                  var4.remove(var16--);
               }

               var18.N(var2, var14);
               var3 -= var14 - var11;
            }
         }
      }
   }

   void N(List<class10021> var1, class10036 var2, float var3) {
      ArrayList<class10021> var4 = this.y;
      var4.clear();
      var4.addAll(var1);
      if (this.L.length < var4.size()) {
         this.L = new float[var4.size()];
      }

      while (var3 < -0.01F && !var4.isEmpty()) {
         float var5 = 0.0F;

         for (class10021 var7 : var4) {
            var5 += this.N.N(var7).L(var2);
         }

         if (var5 <= 0.01F) {
            break;
         }

         float var17 = -var3;
         float var18 = 0.0F;
         boolean var8 = false;
         float[] var9 = this.L;

         for (int var10 = 0; var10 < var4.size(); var10++) {
            class10021 var11 = var4.get(var10);
            class10061 var12 = this.N.N(var11);
            float var13 = var12.L(var2);
            float var14 = var12.y(var2);
            float var15 = var17 * (var13 / var5);
            float var16 = Math.max(var14, var13 - var15);
            if (var16 <= var14 + 0.01F) {
               var8 = true;
            }

            var9[var10] = var16;
            var18 += var13 - var16;
         }

         for (int var19 = 0; var19 < var4.size(); var19++) {
            this.N.N(var4.get(var19)).N(var2, var9[var19]);
         }

         var3 += var18;
         if (var18 <= 0.01F || !var8) {
            break;
         }

         for (int var20 = 0; var20 < var4.size(); var20++) {
            class10021 var21 = var4.get(var20);
            class10061 var22 = this.N.N(var21);
            if (class10048.N(var22.L(var2), var22.y(var2))) {
               var4.remove(var20--);
            }
         }
      }
   }
}

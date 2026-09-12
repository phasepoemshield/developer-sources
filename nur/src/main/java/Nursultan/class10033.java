package Nursultan;

import java.util.Objects;

final class class10033 {
   private static final float N = 1.0F;
   private final class09781 y;

   class10033(class09781 var1) {
      this.y = Objects.requireNonNull(var1, "context");
   }

   private float N(String var1, float var2, class09838 var3) {
      return this.y.y().N(var1, var2, var3);
   }

   private float N(class09980 var1, String var2, float var3, float var4) {
      float var5 = this.N(var2, var1.c(), var1.X());
      float var6 = Math.max(0.0F, var4 - var5);
      class09973 var7 = var1.B();

      return var3 + switch (var7) {
         case START -> 0.0F;
         case CENTER -> var6 * 0.5F;
         case END -> var6;
      };
   }

   float N(class10021 var1, int var2, float var3) {
      String var4 = var1.B();
      class09980 var5 = var1.o();
      float var6 = Math.max(0.0F, var1.c().B());
      if (!(var6 <= 0.0F) && !var4.isEmpty()) {
         float var7 = this.N(var4, var5.c(), var5.X());
         float var8 = Math.max(0.0F, var7 - var6);
         int var9 = class10067.N(var4, var2);
         float var10 = this.N(var4.substring(0, var9), var5.c(), var5.X());
         float var11 = Math.max(0.0F, var3);
         float var12 = var11 + Math.max(0.0F, var6 - 1.0F);
         if (var10 < var11) {
            var11 = var10;
         } else if (var10 > var12) {
            var11 = var10 - Math.max(0.0F, var6 - 1.0F);
         }

         return class09693.N(var11, 0.0F, var8);
      } else {
         return 0.0F;
      }
   }

   int N(class10021 var1, float var2, float var3) {
      String var4 = var1.B();
      class09980 var5 = var1.o();
      float var6 = this.N(var5, var4, var1.c().R(), var1.c().B());
      float var7 = var2 - var6 + Math.max(0.0F, var3);
      if (!(var7 <= 0.0F) && !var4.isEmpty()) {
         class09868 var8 = this.y.y();
         float var9 = var5.c();
         class09838 var10 = var5.X();
         float var11 = 0.0F;
         int var12 = -1;
         int var13 = 0;

         while (var13 < var4.length()) {
            int var14 = var4.codePointAt(var13);
            int var15 = var13 + Character.charCount(var14);
            if (var12 >= 0) {
               var11 += var8.N(var12, var14, var9, var10);
            }

            float var16 = var8.N(var14, var9, var10);
            if (var7 < var11 + var16 * 0.5F) {
               return var13;
            }

            var11 += var16;
            if (var7 < var11) {
               return var15;
            }

            var12 = var14;
            var13 = var15;
         }

         return var4.length();
      } else {
         return 0;
      }
   }
}

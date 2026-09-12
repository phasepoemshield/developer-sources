package Nursultan;

import java.util.List;

final class class09917 {
   private static final class09916 N = new class09916(0.0F, 0.0F, 0.0F, 0.0F);
   private final class09781 y;
   private final class10066 L;
   private final class10062 u;

   class09917(class09781 var1) {
      this.y = var1;
      this.L = class10066.N(var1);
      this.u = class10062.N(var1);
   }

   private void N(class09915 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (var1.y()) {
         class10041 var11 = var1.N();
         float var12 = class09693.N(var6, 0.0F, var8);
         if (!(var12 <= 0.0F)) {
            float var13 = this.N(var11, var2, var11.i(), var9);
            float var14 = var4 + Math.max(0.0F, var5 - 1.0F);
            float var15 = class09693.N(var13, var4, var14);
            float var16 = var10 > 0.0F ? 1.0F / var10 : 1.0F;
            float var17 = class09693.N(var15, var10);
            float var18 = class09693.N(var15 + 1.0F, var10);
            if (var18 - var17 < var16) {
               var18 = var17 + var16;
            }

            float var19 = class09693.N(var7, var10);
            float var20 = class09693.N(var7 + var12, var10);
            if (!(var20 <= var19)) {
               var3.add(new class09925(var17, var19, var18 - var17, var20 - var19, class09889.N, var2.H(), 0, 0.0F, 0, 0.0F));
            }
         }
      }
   }

   private float N(class10041 var1, class09980 var2, int var3, float var4) {
      String var5 = var1.y();
      int var6 = class09693.N(var3, 0, var5.length());
      float var7 = this.y.y().N(var5.substring(0, var6), var2.c(), var2.X());
      return var4 + var7;
   }

   private static class09924 N(String var0, float var1, float var2, int var3, class09980 var4) {
      float var5 = var4.F();
      int var6 = var4.p();
      return (class09924)(var5 > 0.0F && class09662.R(var6)
         ? new class09931(var0, var1, var2, var3, var4.c(), var4.X(), var6, var5)
         : new class09902(var0, var1, var2, var3, var4.c(), var4.X()));
   }

   private static int N(class10041 var0, class09980 var1) {
      int var2 = var1.H();
      if (!var0.u()) {
         return var2;
      } else {
         int var3 = Math.max(1, Math.round((float)class09662.N(var2) * 0.55F));
         return class09662.N(var2, class09677.ALPHA, var3);
      }
   }

   private static int N(class09980 var0) {
      int var1 = var0.H();
      int var2 = Math.max(1, Math.round((float)class09662.N(var1) * 0.28F));
      return class09662.N(var1, class09677.ALPHA, var2);
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float N(class09980 var1, float var2, float var3, float var4) {
      float var5 = Math.max(0.0F, var3 - var4);

      return var2 + switch (class09894.N[var1.Z().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var5 * 0.5F;
         case 3 -> var5;
         default -> throw new MatchException(null, null);
      };
   }

   void N(class09915 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7) {
      class10041 var8 = var1.N();
      float var9 = this.y.u().N();
      float var10 = this.y.y().N(var2.c(), var2.X());
      float var11 = this.N(var2, var5, var7, var10);
      float var12 = this.N(var2, var8.y(), var4, var6) - var8.B();
      this.N(var8, var2, var3, var4, var6, var7, var11, var10, var12, var9);
      if (!var8.L().isEmpty()) {
         float var13 = var8.u() ? this.N(var2, var8.L(), var4, var6) - var8.B() : var12;
         var3.add(N(var8.L(), class09693.N(var13, var9), class09693.N(var11, var9), N(var8, var2), var2));
      }

      this.N(var1, var2, var3, var4, var6, var7, var11, var10, var12, var9);
   }

   class09916 N(class10021 var1, class09980 var2) {
      if (var1.y() != class10049.INPUT) {
         return N;
      } else {
         class10041 var3 = this.u.i(var1);
         String var4 = var3.L();
         if (var4.isEmpty()) {
            return N;
         } else {
            float var5 = var1.c().R();
            float var6 = var1.c().M();
            float var7 = var1.c().B();
            float var8 = var1.c().Z();
            float var9 = this.y.y().N(var2.c(), var2.X());
            float var10 = this.N(var2, var6, var8, var9);
            float var11 = this.N(var2, var4, var5, var7) - var3.B();
            float var12 = this.y.y().N(var4, var2.c(), var2.X());
            return new class09916(var11, var10, var12, var9);
         }
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private float N(class09980 var1, String var2, float var3, float var4) {
      float var5 = this.y.y().N(var2, var1.c(), var1.X());
      float var6 = Math.max(0.0F, var4 - var5);

      return var3 + switch (class09894.N[var1.B().ordinal()]) {
         case 1 -> 0.0F;
         case 2 -> var6 * 0.5F;
         case 3 -> var6;
         default -> throw new MatchException(null, null);
      };
   }

   private void N(class10041 var1, class09980 var2, List<class09924> var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10) {
      if (!var1.u() && var1.N()) {
         float var11 = this.N(var1, var2, var1.R(), var9);
         float var12 = this.N(var1, var2, var1.M(), var9);
         float var13 = class09693.N(var11, var4, var4 + var5);
         float var14 = class09693.N(var12, var4, var4 + var5);
         if (!(var14 <= var13)) {
            float var15 = class09693.N(var6, 0.0F, var8);
            if (!(var15 <= 0.0F)) {
               float var16 = class09693.N(var13, var10);
               float var17 = class09693.N(var14, var10);
               float var18 = class09693.N(var7, var10);
               float var19 = class09693.N(var7 + var15, var10);
               if (!(var17 <= var16) && !(var19 <= var18)) {
                  var3.add(new class09925(var16, var18, var17 - var16, var19 - var18, class09889.N, N(var2), 0, 0.0F, 0, 0.0F));
               }
            }
         }
      }
   }

   class09915 N(class10021 var1) {
      if (var1.y() != class10049.INPUT) {
         return class09915.N;
      } else {
         class10041 var2 = this.u.i(var1);
         boolean var3 = this.L.y(var1) && var1.c().B() > 0.0F && var1.c().Z() > 0.0F;
         return new class09915(var2, var3);
      }
   }
}

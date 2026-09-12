package Nursultan;

public final class class09835 {
   private static class09858 L(class10021 var0) {
      float var1 = var0.c().y();
      float var2 = var0.c().L();
      float var3 = var1 + Math.max(0.0F, var0.c().u());
      float var4 = var2 + Math.max(0.0F, var0.c().i());
      return new class09858(var1, var2, var3, var4);
   }

   private class09835() {
   }

   private static class09858 i(class10021 var0) {
      class10021 var1 = var0.X();
      if (var1 == null) {
         return null;
      } else {
         float var2 = class10019.y(var0) ? N(var1) : 0.0F;
         float var3 = var1.c().y();
         float var4 = var1.c().L() + var2;
         float var5 = var3 + Math.max(0.0F, var1.c().u());
         float var6 = var4 + Math.max(0.0F, var1.c().i());
         return new class09858(var3, var4, var5, var6);
      }
   }

   private static class09858 u(class10021 var0) {
      float var1 = var0.c().R();
      float var2 = var0.c().M();
      float var3 = var1 + Math.max(0.0F, var0.c().B());
      float var4 = var2 + Math.max(0.0F, var0.c().Z());
      return new class09858(var1, var2, var3, var4);
   }

   private static boolean y(class10021 var0) {
      class09937 var1 = var0.c();
      int var2 = var0.O();
      if (var1.s() == var2) {
         return var1.T();
      } else {
         float var3 = var1.y();
         float var4 = var1.L();
         float var5 = var3 + Math.max(0.0F, var1.u());
         float var6 = var4 + Math.max(0.0F, var1.i());
         class09980 var8 = var0.o();
         boolean var7;
         if (var8.d() != class09976.NONE) {
            var7 = true;
         } else if (var8.y()) {
            var7 = false;
         } else {
            var7 = true;
            int var9 = 0;

            for (int var10 = var0.u(); var9 < var10; var9++) {
               class10021 var11 = var0.N(var9);
               if (!class10019.N(var11)) {
                  var7 &= y(var11);
                  class09937 var12 = var11.c();
                  var3 = Math.min(var3, var12.b());
                  var4 = Math.min(var4, var12.j());
                  var5 = Math.max(var5, var12.v());
                  var6 = Math.max(var6, var12.n());
               }
            }
         }

         var1.N(var3, var4, var5, var6, var2, var7);
         return var7;
      }
   }

   public static boolean y(class10021 var0, float var1, float var2, float var3) {
      if (!y(var0)) {
         return false;
      } else {
         class09937 var4 = var0.c();
         return var2 < var4.b() || var2 > var4.v() || var3 < var4.j() + var1 || var3 > var4.n() + var1;
      }
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static class09858 N(class10021 var0, class09980 var1) {
      return switch (class09856.N[var1.d().ordinal()]) {
         case 1 -> var0.y() == class10049.INPUT ? u(var0) : L(var0);
         case 2 -> i(var0);
         default -> null;
      };
   }

   public static boolean N(class10021 var0, float var1, float var2, float var3) {
      float var4 = Math.max(0.0F, var0.c().u());
      float var5 = Math.max(0.0F, var0.c().i());
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         float var6 = var0.c().y();
         float var7 = var0.c().L() + var1;
         return var2 >= var6 && var2 <= var6 + var4 && var3 >= var7 && var3 <= var7 + var5;
      } else {
         return false;
      }
   }

   public static float N(float var0, class10021 var1, float var2) {
      return class10019.y(var1) ? var0 - var2 : var0;
   }

   public static class09858 N(class10021 var0, float var1) {
      float var2 = var0.c().y();
      float var3 = var0.c().L() + var1;
      float var4 = var2 + Math.max(0.0F, var0.c().u());
      float var5 = var3 + Math.max(0.0F, var0.c().i());
      return new class09858(var2, var3, var4, var5);
   }

   public static class09858 N(class09858 var0, float var1, class09858 var2) {
      if (var0 == null) {
         return var2;
      } else {
         float var3 = var0.L() + var1;
         float var4 = var0.i() + var1;
         return var2 == null
            ? new class09858(var0.y(), var3, var0.u(), var4)
            : new class09858(Math.max(var2.y(), var0.y()), Math.max(var2.L(), var3), Math.min(var2.u(), var0.u()), Math.min(var2.i(), var4));
      }
   }

   public static float N(class10021 var0) {
      return !var0.o().y() ? 0.0F : Math.max(0.0F, var0.c().m());
   }
}

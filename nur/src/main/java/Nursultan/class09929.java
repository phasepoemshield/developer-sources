package Nursultan;

import java.util.ArrayList;
import java.util.List;
import org.joml.Vector4f;

final class class09929 {
   private final class09917 N;
   private final class10007 y;

   class09929(class09917 var1, class10007 var2) {
      this.N = var1;
      this.y = var2;
   }

   private static class09924 N(class10021 var0, class09980 var1) {
      if (!class09897.N(var1)) {
         return null;
      } else {
         float var2 = var0.c().u();
         float var3 = var0.c().i();
         if (!(var2 <= 0.0F) && !(var3 <= 0.0F)) {
            float var4 = Math.max(0.0F, var1.m());
            return new class09907(
               var0.c().y(),
               var0.c().L(),
               var2,
               var3,
               var1.q(),
               -1,
               new Vector4f(var1.W().u() + var4, var1.W().i() + var4, var1.W().R() + var4, var1.W().M() + var4)
            );
         } else {
            return null;
         }
      }
   }

   private static void N(class10021 var0, class09980 var1, List<class09924> var2, List<class09924> var3, List<class09924> var4) {
      class09924 var5 = N(var0, var1);
      if (var5 != null) {
         var2.add(var5);
      }

      if (var0.y() != class10049.CANVAS) {
         int var6 = var1.o();
         boolean var7 = class09662.R(var6);
         float var8 = var1.m();
         int var9 = var1.e();
         boolean var10 = var8 > 0.0F && class09662.R(var9);
         float var11 = var1.K();
         int var12 = var11 > 0.01F ? var1.V() : 0;
         boolean var13 = var11 > 0.01F && class09662.R(var12);
         if (var7 || var10 || var13) {
            class09981 var14 = var1.P();
            float var15 = var10 && var14 == class09981.OUTSIDE ? var8 : 0.0F;
            float var16 = var0.c().y() + var15;
            float var17 = var0.c().L() + var15;
            float var18 = Math.max(0.0F, var0.c().u() - var15 * 2.0F);
            float var19 = Math.max(0.0F, var0.c().i() - var15 * 2.0F);
            float var20 = var10 && var14 == class09981.INSIDE ? var8 : 0.0F;
            Vector4f var21 = new Vector4f(var1.W().u() + var20, var1.W().i() + var20, var1.W().R() + var20, var1.W().M() + var20);
            var2.add(
               new class09925(var16, var17, var18, var19, var21, var7 ? var6 : 0, var10 ? var9 : 0, var10 ? var8 : 0.0F, var14, var12, var13 ? var11 : 0.0F)
            );
            if (var10 && var14 == class09981.INSIDE) {
               if (var5 != null) {
                  var3.add(var5);
               }

               if (var7 || var13) {
                  var3.add(new class09925(var16, var17, var18, var19, var21, var7 ? var6 : 0, 0, 0.0F, var14, var12, var13 ? var11 : 0.0F));
               }

               var4.add(new class09925(var16, var17, var18, var19, var21, 0, var9, var8, var14, 0, 0.0F));
            }
         }
      }
   }

   private void N(class10021 var1, class09915 var2, List<class09924> var3) {
      if (var1.y() == class10049.CANVAS) {
         if (var1.U() != null && var1.c().u() > 0.0F && var1.c().i() > 0.0F) {
            var3.add(new class09891(var1.U(), var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i()));
         }
      } else {
         class09980 var4 = var1.o();
         float var5 = var1.c().R();
         float var6 = var1.c().M();
         float var7 = var1.c().B();
         float var8 = var1.c().Z();
         if (var1.y() == class10049.TEXT && !var1.B().isEmpty()) {
            String var9 = var1.c().E().isEmpty() ? var1.B() : var1.c().E();
            var3.add(N(var9, var5, var6, var4.H(), var4));
         } else if (var1.y() == class10049.INPUT) {
            this.N.N(var2, var4, var3, var5, var6, var7, var8);
         } else {
            if (var1.y() == class10049.TEXTURE && !var1.z().isEmpty()) {
               var3.add(new class09906(var1.z(), var5, var6, var7, var8, var4.H(), var4.S()));
            }
         }
      }
   }

   private static class09924 N(String var0, float var1, float var2, int var3, class09980 var4) {
      float var5 = var4.F();
      int var6 = var4.p();
      return (class09924)(var5 > 0.0F && class09662.R(var6)
         ? new class09931(var0, var1, var2, var3, var4.c(), var4.X(), var6, var5)
         : new class09902(var0, var1, var2, var3, var4.c(), var4.X()));
   }

   void N(class10021 var1, class09980 var2, class09830 var3, class09915 var4, class09887 var5, int var6, int var7, int var8, int var9, int var10) {
      ArrayList var11 = new ArrayList(2);
      ArrayList var12 = new ArrayList(2);
      ArrayList var13 = new ArrayList(1);
      N(var1, var2, var11, var12, var13);
      ArrayList var14 = new ArrayList(4);
      this.N(var1, var4, var14);
      ArrayList var15 = new ArrayList(2);
      this.y.N(var1, var2, var3, var15);
      class09926 var16 = N(var2, var5);
      var1.q().N(N(var11), N(var12), N(var13), N(var14), N(var15), var16, var6, var7, var8, var9, var10);
   }

   private static class09926 N(class09980 var0, class09887 var1) {
      if (var0.d() != class09976.SELF || !var0.W().y()) {
         return null;
      } else if (var1 != null && var1.N()) {
         float var2 = N(var0);
         Vector4f var3 = new Vector4f(var0.W().u() + var2, var0.W().i() + var2, var0.W().R() + var2, var0.W().M() + var2);
         return new class09893(var1.y(), var1.L(), var1.u() - var1.y(), var1.i() - var1.L(), var3);
      } else {
         return null;
      }
   }

   static float N(class09980 var0) {
      return var0.m() > 0.0F && class09662.R(var0.e()) && var0.P() == class09981.INSIDE ? var0.m() : 0.0F;
   }

   private static List<class09935> N(List<class09924> var0) {
      if (var0.isEmpty()) {
         return List.of();
      } else {
         ArrayList var1 = new ArrayList(var0.size());

         for (int var2 = 0; var2 < var0.size(); var2++) {
            var1.add(new class09909((class09924)var0.get(var2)));
         }

         return var1;
      }
   }
}

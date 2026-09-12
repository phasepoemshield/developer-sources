package Nursultan;

import java.util.Objects;

final class class09846 {
   private final class09794 N;

   class09846(class09794 var1) {
      this.N = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private class09830 y(class10021 var1) {
      if (!var1.o().y()) {
         return null;
      } else if (var1.o().k() == class09970.HIDDEN) {
         return null;
      } else {
         float var2 = var1.c().P();
         if (var2 <= 0.0F) {
            return null;
         } else {
            class10001 var3 = var1.o().Y();
            float var4 = var1.c().B();
            float var5 = var1.c().Z();
            float var6 = class09693.N(var3.N(), 0.0F, Math.max(0.0F, var4));
            if (!(var6 <= 0.0F) && !(var5 <= 0.0F)) {
               float var7 = switch (class09877.N[var1.o().k().ordinal()]) {
                  case 1 -> var1.c().R() + var4;
                  case 2 -> var1.c().R() + Math.max(0.0F, var4 - var6);
                  case 3 -> var1.c().R();
                  default -> throw new MatchException(null, null);
               };
               float var8 = this.N.N();
               float var9 = class09693.N(var3.y(), 0.0F, var6 * 0.5F);
               float var10 = class09693.N(var3.L(), 0.0F, var5 * 0.5F);
               float var11 = class09693.N(var1.c().M() + var10, var8);
               float var12 = class09693.N(Math.max(0.0F, var5 - var10 * 2.0F), var8);
               if (var12 <= 0.0F) {
                  return null;
               } else {
                  float var13 = class09693.N(var7 + var9, var8);
                  float var15 = class09693.N(Math.max(0.0F, var6 - var9 * 2.0F), var8);
                  float var17 = var5 + var2;
                  float var18 = var17 <= 0.0F ? 1.0F : var5 / var17;
                  float var19 = var12 * var18;
                  var19 = class09693.N(class09693.N(var19, var3.u(), var12), var8);
                  float var20 = Math.max(0.0F, var12 - var19);
                  float var22 = class09693.N(var1.c().m() / var2 * var20, 0.0F, var20);
                  float var24 = class09693.N(var11 + var22, var8);
                  return new class09830(var7, var11, var6, var12, var13, var11, var15, var12, var13, var24, var15, var19, var20);
               }
            } else {
               return null;
            }
         }
      }
   }

   class09830 N(class10021 var1) {
      if (var1 == null) {
         return null;
      } else {
         int var2 = var1.c().W();
         int var3 = var1.d();
         int var4 = this.N.y();
         if (var1.q().y(var2, var3, var4)) {
            return var1.q().z();
         } else {
            class09830 var5 = this.y(var1);
            var1.q().N(var5, var2, var3, var4);
            return var5;
         }
      }
   }
}

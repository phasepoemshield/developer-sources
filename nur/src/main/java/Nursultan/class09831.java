package Nursultan;

import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

final class class09831 {
   private static final float N = 28.0F;
   private final class09794 y;
   private final Map<class10021, class09861> L = new IdentityHashMap<>();
   private class09833 u = class09833.N();

   private static boolean L(class10021 var0, float var1) {
      if (var0 != null && var0.o().y() && !(var0.c().P() <= 0.0F)) {
         float var2 = var0.c().m();
         float var3 = var0.c().P();
         return var1 > 0.0F && var2 > 0.0F || var1 < 0.0F && var2 < var3;
      } else {
         return false;
      }
   }

   class09831(class09794 var1) {
      this.y = Objects.requireNonNull(var1, "uiScalePolicy");
   }

   void y() {
      this.L.clear();
   }

   void y(class10021 var1) {
      if (!this.L.isEmpty()) {
         this.L.keySet().removeIf(var1x -> !N(var1, var1x));
      }
   }

   private boolean y(class10021 var1, float var2) {
      float var3 = var1.c().m() - var2 * 28.0F;
      if (!var1.c().R(var3, this.y.N())) {
         return false;
      } else {
         var1.i(8);
         return true;
      }
   }

   private static boolean N(class10021 var0, class10021 var1) {
      return var0 != null && var1 != null ? class09828.N(var0, var1) && var1.o().y() && var1.c().P() > 0.0F : false;
   }

   private static float N(float var0, float var1, float var2) {
      return !(var1 <= 0.0F) && !(var2 <= 0.0F) ? var0 * (float)Math.exp((double)(-var1 * var2)) : var0;
   }

   void N(class09833 var1) {
      this.u = Objects.requireNonNull(var1, "nextOptions");
      if (!this.u.L()) {
         this.y();
      }
   }

   class09833 N() {
      return this.u;
   }

   void N(class10021 var1) {
      if (var1 != null) {
         this.L.remove(var1);
      }
   }

   private void N(class10021 var1, float var2, float var3) {
      this.L.computeIfAbsent(var1, var0 -> new class09861()).y(-var2 * var3);
   }

   boolean N(class10021 var1, float var2) {
      if (var1 != null && !this.L.isEmpty()) {
         if (!this.u.L()) {
            this.y();
            return false;
         } else {
            boolean var3 = false;
            float var4 = Math.max(0.0F, var2);
            Iterator<Entry<class10021, class09861>> var5 = this.L.entrySet().iterator();

            while (var5.hasNext()) {
               Entry var6 = var5.next();
               class10021 var7 = (class10021)var6.getKey();
               class09861 var8 = (class09861)var6.getValue();
               if (!N(var1, var7)) {
                  var5.remove();
               } else if (!(var4 <= 0.0F)) {
                  float var9 = var7.c().P();
                  float var10 = var7.c().m() + var8.N() * var4;
                  if (var7.c().R(var10, this.y.N())) {
                     var7.i(8);
                     var3 = true;
                  }

                  float var11 = var7.c().m();
                  if ((!(var11 <= 0.0F) || !(var8.N() < 0.0F)) && (!(var11 >= var9) || !(var8.N() > 0.0F))) {
                     float var12 = N(var8.N(), this.u.i(), var4);
                     if (Math.abs(var12) <= this.u.R()) {
                        var5.remove();
                     } else {
                        var8.N(var12);
                     }
                  } else {
                     var5.remove();
                  }
               }
            }

            return var3;
         }
      } else {
         return false;
      }
   }

   boolean N(class10021 var1, class10021 var2, float var3) {
      if (var1 == null || var3 == 0.0F) {
         return false;
      } else if (var2 != null && !class09828.N(var2, var1)) {
         return false;
      } else {
         for (class10021 var4 = var1; var4 != null; var4 = var4.X()) {
            if (L(var4, var3)) {
               if (!this.u.L()) {
                  return this.y(var4, var3);
               }

               this.N(var4, var3, this.u.u());
               return true;
            }

            if (var4 == var2 || class10019.N(var4)) {
               break;
            }
         }

         return false;
      }
   }
}

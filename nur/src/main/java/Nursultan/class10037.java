package Nursultan;

import java.util.ArrayDeque;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;

public final class class10037 {
   private static final float N = 0.001F;
   private final class09715 y;
   private final Map<class10021, class10044> L = new IdentityHashMap<>();

   private class10037(class09715 var1) {
      this.y = Objects.requireNonNull(var1, "animationManager");
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean y(class09962 var0, class09962 var1) {
      if (var0 != null && var1 != null && var0.u() == var1.u()) {
         return switch (var0.u()) {
            case FIT, GROW -> Float.isFinite(var0.i()) && Float.isFinite(var0.R()) && Float.isFinite(var1.i()) && Float.isFinite(var1.R());
            case FIXED, PERCENT -> Float.isFinite(var0.M()) && Float.isFinite(var1.M());
         };
      } else {
         return false;
      }
   }

   private float y(class10021 var1, class10036 var2, float var3) {
      return this.N(var1, var2, var3, false);
   }

   private static class09743 y(class09980 var0, class10036 var1) {
      return var0.A().N(N(var1));
   }

   private static class10023 N(class10044 var0, class10036 var1) {
      return var1 == class10036.WIDTH ? var0.N : var0.y;
   }

   private static boolean N(class09743 var0) {
      if (var0 == null || !var0.u()) {
         return false;
      } else if (var0 instanceof class09728) {
         return true;
      } else {
         return var0 instanceof class09815 ? ((class09815)var0).N(class09782.FLOAT) : false;
      }
   }

   private static class09736 N(class10036 var0) {
      return var0 == class10036.WIDTH ? class09736.WIDTH : class09736.HEIGHT;
   }

   public boolean N(float var1) {
      if (!(var1 <= 0.0F) && !this.L.isEmpty()) {
         boolean var2 = false;

         for (Entry var4 : this.L.entrySet()) {
            class10021 var5 = (class10021)var4.getKey();
            class10044 var6 = (class10044)var4.getValue();
            var2 |= this.N(var5, var6.N, var1);
            var2 |= this.N(var5, var6.y, var1);
         }

         return var2;
      } else {
         return false;
      }
   }

   private static boolean N(float var0, float var1) {
      return Math.abs(var0 - var1) <= 0.001F;
   }

   public static class10037 N(class09781 var0) {
      class09781 var1 = Objects.requireNonNull(var0, "context");
      return var1.N(class10037.class).orElseGet(() -> {
         class10037 var1x = new class10037(class09715.N(var1));
         var1.N(class10037.class, var1x);
         return var1x;
      });
   }

   // $VF: Unable to simplify switch on enum
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private static boolean N(class09962 var0, class09962 var1) {
      if (var0 != null && var1 != null && var0.u() == var1.u() && !Objects.equals(var0, var1)) {
         return switch (var1.u()) {
            case FIT, GROW -> !y(var0, var1);
            default -> false;
         };
      } else {
         return false;
      }
   }

   private boolean N(class10021 var1, class10023 var2, float var3) {
      if (var2.i == null) {
         return false;
      } else {
         boolean var4 = var2.i.N(var3);
         var2.L = var2.i.y();
         if (var2.i.N()) {
            var2.L = var2.u;
            var2.i = null;
            var4 = true;
         }

         if (var4) {
            var1.i(2);
         }

         return var4;
      }
   }

   private float N(class10021 var1, class10036 var2, float var3, boolean var4) {
      class10044 var5 = this.L.get(var1);
      if (var5 == null) {
         return var3;
      } else {
         class10023 var6 = N(var5, var2);
         var6.N = true;
         var6.y = class10048.y(var1.o(), var2);
         var6.L = var3;
         var6.u = var3;
         var6.i = null;
         var6.R = var4;
         return var3;
      }
   }

   private static boolean N(class09980 var0, class10036 var1) {
      class09962 var2 = class10048.y(var0, var1);
      return var2.u() == class09982.FIT || var2.u() == class09982.GROW;
   }

   float N(class10021 var1, class10036 var2, float var3) {
      if (var1 == null) {
         return var3;
      } else {
         class09980 var4 = var1.o();
         if (!N(var4, var2)) {
            return this.y(var1, var2, var3);
         } else {
            class09743 var5 = y(var4, var2);
            if (!N(var5)) {
               return this.y(var1, var2, var3);
            } else {
               class10023 var6 = N(this.L.computeIfAbsent(var1, var0 -> new class10044()), var2);
               class09962 var7 = class10048.y(var4, var2);
               if (!var6.N) {
                  var6.N = true;
                  var6.y = var7;
                  var6.L = var3;
                  var6.u = var3;
                  return var3;
               } else {
                  class09962 var8 = var6.y;
                  boolean var9 = N(var8, var7);
                  boolean var10 = N(var8, var7, var6.u, var3);
                  boolean var11 = this.y.L(var1);
                  boolean var12 = !var9 && var10 && (var11 || var6.R);
                  var6.R = var11;
                  if (var12) {
                     return this.N(var1, var2, var3, var11);
                  } else {
                     boolean var13 = var6.i != null || var9 || var10;
                     var6.y = var7;
                     if (!var13) {
                        return this.N(var1, var2, var3, var11);
                     } else if (N(var6.u, var3) && var6.i == null) {
                        var6.L = var3;
                        return var3;
                     } else if (var6.i != null) {
                        if (!N(var6.u, var3)) {
                           var6.i = class10039.N(N(var2), var5, var6.L, var3);
                           var6.u = var3;
                        }

                        return var6.L;
                     } else if (N(var6.L, var3)) {
                        var6.u = var3;
                        return var3;
                     } else {
                        var6.i = class10039.N(N(var2), var5, var6.L, var3);
                        var6.u = var3;
                        return var6.L;
                     }
                  }
               }
            }
         }
      }
   }

   private static boolean N(class09962 var0, class09962 var1, float var2, float var3) {
      return var1 != null && Objects.equals(var0, var1) && !N(var2, var3) ? var1.u() == class09982.FIT || var1.u() == class09982.GROW : false;
   }

   public void N(class10021 var1) {
      if (var1 != null) {
         ArrayDeque var2 = new ArrayDeque();
         var2.push(var1);

         while (!var2.isEmpty()) {
            class10021 var3 = (class10021)var2.pop();
            this.L.remove(var3);

            for (int var4 = 0; var4 < var3.u(); var4++) {
               var2.push(var3.N(var4));
            }
         }
      }
   }
}

package Nursultan;

import java.util.List;
import java.util.Objects;

public final class class09851 {
   private final class09828 N;

   public class09851(class09781 var1) {
      this.N = class09828.N(Objects.requireNonNull(var1, "context"));
   }

   private class09854 y(class10021 var1, float var2, float var3, boolean var4) {
      class09841 var5 = var1.K();
      if (var5 != null && var5.i()) {
         List<class10021> var6 = var5.u();

         for (int var7 = var6.size() - 1; var7 >= 0; var7--) {
            class10021 var8 = var6.get(var7);
            if (!N(var8)) {
               class09854 var9 = this.N(var8, var2, var3, null, 0.0F, var4);
               if (var9 != null) {
                  return var9;
               }
            }
         }

         return null;
      } else {
         return null;
      }
   }

   public class10021 y(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, false).L();
   }

   private static class09871 N(class09830 var0, float var1, float var2, float var3) {
      float var4 = var3 - var1;
      if (var2 >= var0.Z() && var2 <= var0.Z() + var0.U() && var4 >= var0.z() && var4 <= var0.z() + var0.E()) {
         return class09871.THUMB;
      } else {
         return var2 >= var0.N() && var2 <= var0.N() + var0.L() && var4 >= var0.y() && var4 <= var0.y() + var0.u() ? class09871.TRACK : class09871.NONE;
      }
   }

   private class09854 N(class10021 var1, class09980 var2, class09858 var3, float var4, float var5, float var6) {
      if (!var2.y()) {
         return null;
      } else {
         class09830 var7 = this.N.u(var1);
         if (var7 == null) {
            return null;
         } else {
            class09871 var8 = N(var7, var4, var5, var6);
            if (var8 == class09871.NONE) {
               return null;
            } else {
               if (var2.d() != class09976.PARENT) {
                  class09858 var9 = class09835.N(class09835.N(var1, var2), var4, var3);
                  if (var9 != null && !var9.N(var5, var6)) {
                     return null;
                  }
               }

               return new class09854(var1, var8, var4);
            }
         }
      }
   }

   private class09854 N(class10021 var1, float var2, float var3, class09858 var4, float var5, boolean var6) {
      if (var1 != null && !var1.T()) {
         class09980 var7 = var1.o();
         if (!var7.g() || var7.f() <= 0.0F || var7.J()) {
            return null;
         } else if (var4 != null && !var4.N(var2, var3)) {
            return null;
         } else if (var1.u() > 0 && class09835.y(var1, var5, var2, var3)) {
            return null;
         } else {
            if (var6) {
               class09854 var8 = this.N(var1, var7, var4, var5, var2, var3);
               if (var8 != null) {
                  return var8;
               }
            }

            class09858 var16 = class09835.N(class09835.N(var1, var7), var5, var4);
            if (var16 == null || var16.N()) {
               List<class10021> var10 = class10047.N(var1);
               float var11 = class09835.N(var1);

               for (int var12 = var10.size() - 1; var12 >= 0; var12--) {
                  class10021 var13 = var10.get(var12);
                  if (!class10019.N(var13)) {
                     float var14 = class09835.N(var5, var13, var11);
                     class09854 var15 = this.N(var13, var2, var3, var16, var14, var6);
                     if (var15 != null) {
                        return var15;
                     }
                  }
               }
            }

            return class09835.N(var1, var5, var2, var3) ? new class09854(var1, class09871.NONE, var5) : null;
         }
      } else {
         return null;
      }
   }

   private static boolean N(class10021 var0) {
      for (class10021 var1 = var0; var1 != null; var1 = var1.X()) {
         if (var1.T()) {
            return true;
         }
      }

      return false;
   }

   public class09854 N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, true);
   }

   private class09854 N(class10021 var1, float var2, float var3, boolean var4) {
      if (var1 == null) {
         return class09854.N;
      } else {
         class09854 var5 = this.y(var1, var2, var3, var4);
         if (var5 != null) {
            return var5;
         } else {
            class09854 var6 = this.N(var1, var2, var3, null, 0.0F, var4);
            return var6 != null ? var6 : class09854.N;
         }
      }
   }
}

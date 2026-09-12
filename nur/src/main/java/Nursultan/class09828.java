package Nursultan;

import java.util.Objects;

public final class class09828 {
   private final class09794 N;
   private final class09846 y;
   private final class09831 L;
   private class10021 u;
   private class09871 i = class09871.NONE;
   private class10021 R;
   private class09871 M = class09871.NONE;
   private class09859 B;

   public class10029 L(class10021 var1) {
      if (var1 == null) {
         return class10029.NORMAL;
      } else if (var1 == this.R && this.M == class09871.THUMB) {
         return class10029.ACTIVE;
      } else {
         return var1 == this.u && this.i == class09871.THUMB ? class10029.HOVER : class10029.NORMAL;
      }
   }

   public boolean L() {
      boolean var1 = this.M != class09871.NONE || this.B != null;
      this.B = null;
      this.L(null, class09871.NONE);
      return var1;
   }

   public boolean L(class10021 var1, float var2) {
      if (this.B == null) {
         return false;
      } else if (!this.y(var1, this.B.N())) {
         this.u();
         return false;
      } else {
         class09830 var3 = this.u(this.B.N());
         if (var3 == null) {
            this.u();
            return true;
         } else {
            float var5 = var2 - this.B.L() - this.B.y() - var3.R();
            this.N(this.B.N(), var3, var5);
            this.y(this.B.N(), class09871.THUMB);
            return true;
         }
      }
   }

   private void L(class10021 var1, class09871 var2) {
      class09871 var3 = var2 == null ? class09871.NONE : var2;
      if (this.R != var1 || this.M != var3) {
         i(this.R);
         this.R = var1;
         this.M = var3;
         i(this.R);
      }
   }

   private class09828(class09794 var1) {
      this.N = Objects.requireNonNull(var1, "uiScalePolicy");
      this.y = new class09846(this.N);
      this.L = new class09831(this.N);
   }

   private static void i(class10021 var0) {
      if (var0 != null) {
         var0.i(1);
      }
   }

   public class09830 u(class10021 var1) {
      return this.y.N(var1);
   }

   private void u(class10021 var1, float var2) {
      if (var1.c().R(var2, this.N.N())) {
         var1.i(8);
      }
   }

   private void u() {
      this.B = null;
      this.L(null, class09871.NONE);
      this.y(null, class09871.NONE);
   }

   private boolean y(class10021 var1, class10021 var2) {
      if (var1 == null || var2 == null) {
         return false;
      } else {
         return !N(var1, var2) ? false : this.u(var2) != null;
      }
   }

   public class10029 y(class10021 var1) {
      if (var1 == null) {
         return class10029.NORMAL;
      } else if (var1 == this.R && this.M == class09871.TRACK) {
         return class10029.ACTIVE;
      } else {
         return var1 == this.u && this.i == class09871.TRACK ? class10029.HOVER : class10029.NORMAL;
      }
   }

   private void y(class10021 var1, class09871 var2) {
      class09871 var3 = var2 == null ? class09871.NONE : var2;
      if (this.u != var1 || this.i != var3) {
         i(this.u);
         this.u = var1;
         this.i = var3;
         i(this.u);
      }
   }

   public boolean y(class10021 var1, float var2) {
      return this.L.N(var1, var2);
   }

   public boolean y() {
      return this.B != null;
   }

   public void N(class10021 var1) {
      if (var1 == null) {
         this.y(null, class09871.NONE);
         this.L(null, class09871.NONE);
         this.B = null;
         this.L.y();
      } else {
         if (this.u != null && !this.y(var1, this.u)) {
            this.y(null, class09871.NONE);
         }

         if (this.R != null && !this.y(var1, this.R)) {
            this.L(null, class09871.NONE);
            this.B = null;
         }

         this.L.y(var1);
      }
   }

   public boolean N(class10021 var1, float var2) {
      return this.N(var1, null, var2);
   }

   static boolean N(class10021 var0, class10021 var1) {
      for (class10021 var2 = var1; var2 != null; var2 = var2.X()) {
         if (var2 == var0) {
            return true;
         }
      }

      return false;
   }

   public static class09828 N(class09781 var0) {
      class09781 var1 = Objects.requireNonNull(var0, "context");
      return var1.N(class09828.class).orElseGet(() -> {
         class09828 var1x = new class09828(var1.u());
         var1.N(class09828.class, var1x);
         return var1x;
      });
   }

   public void N(class10021 var1, class09871 var2) {
      this.y(var1, var2 == null ? class09871.NONE : var2);
   }

   public boolean N(class10021 var1, class09871 var2, float var3, float var4) {
      if (var1 != null && var2 != class09871.NONE) {
         class09830 var5 = this.u(var1);
         if (var5 == null) {
            return false;
         } else {
            float var6 = var3 - var4;
            this.y(var1, var2);
            this.L.N(var1);
            if (var2 == class09871.THUMB) {
               this.B = new class09859(var1, var6 - var5.z(), var4);
               this.L(var1, class09871.THUMB);
               return true;
            } else {
               this.L(var1, class09871.TRACK);
               float var7 = var6 - var5.R() - var5.E() * 0.5F;
               this.N(var1, var5, var7);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public void N(class09833 var1) {
      this.L.N(Objects.requireNonNull(var1, "options"));
   }

   private void N(class10021 var1, class09830 var2, float var3) {
      float var4 = var2.W();
      if (var4 <= 0.0F) {
         this.L.N(var1);
         this.u(var1, 0.0F);
      } else {
         float var5 = class09693.N(var3, 0.0F, var4);
         float var6 = var1.c().P();
         float var7 = var5 / var4;
         this.L.N(var1);
         this.u(var1, var6 * var7);
      }
   }

   public class09833 N() {
      return this.L.N();
   }

   public boolean N(class10021 var1, class10021 var2, float var3) {
      return this.L.N(var1, var2, var3);
   }
}

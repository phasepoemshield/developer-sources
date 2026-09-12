package Nursultan;

import java.util.Objects;

public final class class10066 {
   private static final float N = 0.5F;
   private final float y;
   private class10021 L;
   private boolean u = true;
   private float i;

   private boolean L(class10021 var1) {
      return u(var1) && var1.W() && var1 == this.L;
   }

   private class10066(class09781 var1, float var2) {
      Objects.requireNonNull(var1, "context");
      this.y = Math.max(0.05F, var2);
   }

   private static boolean u(class10021 var0) {
      return var0 != null && var0.y() == class10049.INPUT;
   }

   public boolean y(class10021 var1) {
      if (!u(var1) || !var1.W()) {
         return false;
      } else {
         return this.L == null ? true : this.L == var1 && this.u;
      }
   }

   public static class10066 N(class09781 var0) {
      return var0.N(class10066.class).orElseGet(() -> {
         class10066 var1 = new class10066(var0, 0.5F);
         var0.N(class10066.class, var1);
         return var1;
      });
   }

   public boolean N(float var1) {
      if (!this.N()) {
         return false;
      } else {
         float var2 = Math.max(0.0F, var1);
         if (var2 <= 0.0F) {
            return false;
         } else {
            this.i += var2;
            int var3 = (int)(this.i / this.y);
            if (var3 <= 0) {
               return false;
            } else {
               this.i = this.i - (float)var3 * this.y;
               if ((var3 & 1) == 0) {
                  return false;
               } else {
                  this.u = !this.u;
                  this.L.i(1);
                  return true;
               }
            }
         }
      }
   }

   public void N(class10021 var1, class10021 var2) {
      class10021 var3 = u(var2) ? var2 : null;
      if (this.L == var3) {
         this.N(var3);
      } else {
         class10021 var4 = this.L != null ? this.L : (u(var1) ? var1 : null);
         if (var4 != null) {
            var4.i(1);
         }

         this.L = var3;
         this.u = true;
         this.i = 0.0F;
         if (this.L != null) {
            this.L.i(1);
         }
      }
   }

   private boolean N() {
      if (!this.L(this.L)) {
         if (this.L != null) {
            this.L.i(1);
         }

         this.L = null;
         this.u = true;
         this.i = 0.0F;
         return false;
      } else {
         return true;
      }
   }

   public boolean N(class10021 var1) {
      if (!this.L(var1)) {
         return false;
      } else {
         this.i = 0.0F;
         if (this.u) {
            return false;
         } else {
            this.u = true;
            this.L.i(1);
            return true;
         }
      }
   }
}

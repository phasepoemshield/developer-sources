package Nursultan;

import java.util.Objects;

public final class class09832 {
   private final class09781 N;
   private final class09715 y;
   private final class09872 L;
   private final class10054 u;
   private final class10037 i;
   private final class09920 R;
   private final class09828 M;
   private final class10066 B;
   private final class09855 Z = new class09855(120.0F);
   private class09866 z;
   private float U = Float.NaN;
   private float E = Float.NaN;
   private class10021 W;
   private class09936 m = class09936.N();
   private boolean P;
   private boolean s;
   private boolean T;

   boolean L() {
      return this.s;
   }

   private void L(class10021 var1, class09850 var2) {
      if (!var2.N() && var2.L()) {
         var1.L(8);
      }
   }

   public class09832(class09781 var1) {
      this(var1, class09866.N());
   }

   public class09832(class09781 var1, class09866 var2) {
      this.N = Objects.requireNonNull(var1, "context");
      this.y = class09715.N(var1);
      this.L = class09872.N(var1);
      this.u = class10054.N(var1);
      this.i = class10037.N(var1);
      this.R = class09920.N(var1);
      this.M = class09828.N(var1);
      this.B = class10066.N(var1);
      this.N(var2);
   }

   boolean u() {
      return this.T;
   }

   private boolean y(class10021 var1, class09850 var2) {
      if (var2.N()) {
         return false;
      } else {
         return this.P != this.z.i() ? false : !var1.R(1);
      }
   }

   private void y(class10021 var1) {
      this.W = var1;
      this.Z.y();
      this.U = Float.NaN;
      this.E = Float.NaN;
      this.m = class09936.N();
      this.P = false;
   }

   private class09741 y(float var1) {
      float var2 = this.Z.y(var1);
      if (var2 <= 0.0F) {
         return class09741.N;
      } else {
         class09741 var3 = this.y.y(var2);
         boolean var4 = this.i.N(var2);
         class09847 var5 = this.L.N(var2);
         return class09741.N(var3.N() || var5.N() || var4, var3.y() || var4);
      }
   }

   public class09866 y() {
      return this.z;
   }

   private boolean N(class10021 var1, float var2, float var3, class09850 var4) {
      if (!var4.N()) {
         return false;
      } else {
         boolean var5 = this.u.N(var1, var2, var3, this.z.u());
         this.U = var2;
         this.E = var3;
         return var5;
      }
   }

   private class09850 N(class10021 var1, float var2, float var3, boolean var4) {
      boolean var5 = Float.compare(this.U, var2) != 0 || Float.compare(this.E, var3) != 0;
      boolean var6 = var1.R(2);
      boolean var7 = var5 || var4 || var6;
      boolean var8 = var1.R(4);
      boolean var9 = var1.R(8);
      boolean var10 = var8 && !var6 && !var5 && !var4;
      return new class09850(var7, var10, var9, var5);
   }

   private boolean N(class10021 var1, class09850 var2) {
      return !var2.y() ? false : this.u.N(var1);
   }

   public class09841 N(class09798 var1) {
      return new class09841(this.N, var1);
   }

   public class09781 N() {
      return this.N;
   }

   public void N(class09866 var1) {
      class09866 var2 = var1 == null ? class09866.N() : var1;
      this.z = var2;
      this.Z.N(var2.y());
      this.M.N(var2.L());
   }

   class09936 N(class09841 var1, int var2, int var3, float var4) {
      if (var1 == null) {
         this.s = false;
         this.T = false;
         return class09936.N();
      } else {
         float var5 = this.N.u().N();
         float var6 = Math.max(0.0F, (float)var2) / var5;
         float var7 = Math.max(0.0F, (float)var3) / var5;
         return this.N(var1, var6, var7, var4);
      }
   }

   class09936 N(class09841 var1, float var2, float var3, float var4) {
      if (var1 == null) {
         this.s = false;
         this.T = false;
         return class09936.N();
      } else {
         class10021 var5 = (class10021)var1.y();
         float var6 = this.N(var4);
         this.N(var5);
         class09741 var7 = this.y(var6);
         boolean var8 = var1.B();
         boolean var9 = this.B.N(var6);
         this.M.N(var5);
         boolean var10 = this.M.y(var5, var6);
         class09850 var11 = this.N(var5, var2, var3, var7.y() || var8);
         boolean var12 = this.N(var5, var2, var3, var11);
         boolean var13 = this.N(var5, var11);
         boolean var14 = var12 || var13 || var11.L() || var11.u();
         boolean var15 = var1.N(var2, var3, this.N.u().N(), var14);
         if (var11.u()) {
            var5.u(1);
         }

         this.M.N(var5);
         if (this.y(var5, var11)) {
            this.s = var7.N() || var9 || var10 || var8;
            this.T = var8;
            return this.m;
         } else {
            if (var12 || var13 || var15 || var11.L()) {
               this.N.i().N();
            }

            class09936 var16 = this.R.N(var5, var2, var3, this.z.u(), this.z.i());
            this.L(var5, var11);
            this.m = var16;
            this.P = this.z.i();
            this.s = var7.N() || var9 || var10 || var8;
            this.T = var12 || var13 || var15 || var8;
            return var16;
         }
      }
   }

   private float N(float var1) {
      return Math.max(0.0F, var1);
   }

   private void N(class10021 var1) {
      if (var1 != this.W) {
         this.y(var1);
      }
   }
}

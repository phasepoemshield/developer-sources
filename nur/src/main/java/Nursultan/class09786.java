package Nursultan;

import java.util.Objects;

final class class09786 implements class09869 {
   private static final int N = 0;
   private static final int y = 99;
   private static final int L = 67;
   private static final int u = 118;
   private static final int i = 86;
   private static final int R = 120;
   private static final int M = 88;
   private final class09781 B;
   private final class09961 Z;
   private final class09851 z;
   private final class09828 U;
   private final class10066 E;
   private final class10062 W;
   private final class10017 m;
   private class10021 P;
   private class10021 s;
   private class10021 T;
   private class10021 b;
   private class10021 j;
   private class10021 v;
   private float n;
   private float t;
   private boolean G;

   @Override
   public class09904 L() {
      return this.T;
   }

   @Override
   public boolean L(class09904 var1) {
      if (var1 == null) {
         this.y(null);
         return false;
      } else {
         if (var1 instanceof class10021 var2 && var2.P() && y(this.P, var2)) {
            this.y(var2);
            this.E.N(var2);
            return true;
         }

         return false;
      }
   }

   private void L(class10021 var1) {
      if (this.b != var1) {
         class10021 var2 = this.b;
         this.b = var1;
         if (var2 != null) {
            this.Z.N(var2, var2 == this.s, var2 == this.T, false);
         }

         if (var1 != null) {
            this.Z.N(var1, var1 == this.s, var1 == this.T, true);
         }
      }
   }

   private float L(float var1) {
      return var1 / this.B.u().N();
   }

   private class09854 M() {
      return this.P == null ? class09854.N : this.z.N(this.P, this.n, this.t);
   }

   private static void M(class10021 var0) {
      var0.y(false);
      var0.L(false);
      var0.u(false);

      for (int var1 = 0; var1 < var0.u(); var1++) {
         M(var0.N(var1));
      }
   }

   class09786(class09781 var1) {
      this.B = Objects.requireNonNull(var1, "context");
      this.Z = class09961.N(var1);
      this.z = new class09851(var1);
      this.U = class09828.N(var1);
      this.E = class10066.N(var1);
      this.W = class10062.N(var1);
      this.m = new class10017(var1);
   }

   private static class10021 i(class10021 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (class10021 var1 = var0; var1 != null; var1 = var1.X()) {
            if (var1.N(class09867.CLICK)) {
               return var1;
            }
         }

         return u(var0);
      }
   }

   @Override
   public class09904 i() {
      return this.j;
   }

   @Override
   public class09904 u() {
      return this.b;
   }

   private static class10021 u(class10021 var0) {
      if (var0 == null) {
         return null;
      } else {
         for (class10021 var1 = var0; var1 != null; var1 = var1.X()) {
            if (var1.P()) {
               return var1;
            }
         }

         return var0;
      }
   }

   @Override
   public void y(class09904 var1) {
      if (var1 instanceof class10021 var2) {
         if (y(var2, this.T)) {
            this.E.N(this.T, null);
            this.W.N(this.T, null);
            this.T = null;
         }

         if (y(var2, this.s)) {
            class10021 var3 = var2.X();
            if (var3 != null) {
               this.N(var3);
            } else {
               this.s = null;
            }
         }

         if (y(var2, this.b)) {
            this.b = null;
         }

         if (y(var2, this.j)) {
            this.j = null;
         }

         if (y(var2, this.v)) {
            this.v = null;
         }

         M(var2);
      }
   }

   private static boolean y(class10021 var0, class10021 var1) {
      if (var0 != null && var1 != null) {
         for (class10021 var2 = var1; var2 != null; var2 = var2.X()) {
            if (var2 == var0) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private void y(int var1, class10021 var2) {
      class10021 var3 = u(var2);
      class10021 var4 = this.j != null ? this.j : var3;
      if (var4 != null) {
         class09863.N(new class09864(class09867.POINTER_UP, var4, this.n, this.t, var1, false));
      }

      if (var1 == 0) {
         class10021 var5 = i(var2);
         if (this.v != null && var5 == this.v && var2 != null) {
            class09863.N(new class09864(class09867.CLICK, var2, this.n, this.t, var1, false));
         }

         this.v = null;
         if (this.j != null && this.j.y() == class10049.INPUT) {
            this.W.u(this.j);
         }

         this.j = null;
         this.L(null);
      }
   }

   private void y(class10021 var1) {
      if (this.T != var1) {
         class10021 var2 = this.T;
         this.T = var1;
         if (var2 != null) {
            this.Z.N(var2, var2 == this.s, false, var2 == this.b);
            class09863.N(new class09873(class09867.BLUR, var2, var1));
         }

         if (var1 != null) {
            this.Z.N(var1, var1 == this.s, true, var1 == this.b);
            class09863.N(new class09873(class09867.FOCUS, var1, var2));
         }

         this.E.N(var2, var1);
         this.W.N(var2, var1);
      }
   }

   @Override
   public class09904 y() {
      return this.s;
   }

   private float y(float var1) {
      return var1 / this.B.u().N();
   }

   private void N(int var1, class10021 var2) {
      class10021 var3 = u(var2);
      class10021 var4 = this.j != null ? this.j : var3;
      if (var4 != null) {
         class09863.N(new class09864(class09867.POINTER_DOWN, var4, this.n, this.t, var1, true));
      }

      if (var1 == 0) {
         this.v = i(var2);
         this.j = var3;
         this.y(var3 != null && var3.P() ? var3 : null);
         this.L(var3);
         if (var3 != null && var3.y() == class10049.INPUT) {
            this.W.N(var3, this.n);
         }

         this.E.N(var3);
      }
   }

   @Override
   public void N(class09904 var1) {
      this.E.N(this.T, null);
      this.W.N(this.T, null);
      this.P = (class10021)var1;
      this.s = null;
      this.T = null;
      this.b = null;
      this.j = null;
      this.v = null;
      this.G = false;
      this.U.N(this.P);
   }

   private void N(class09854 var1) {
      if (var1.N()) {
         this.U.N(var1.L(), var1.u());
      } else {
         this.U.N(null, null);
      }
   }

   private static class10021 N(class10021 var0, class10021 var1) {
      int var2 = R(var0);
      int var3 = R(var1);
      class10021 var4 = var0;

      class10021 var5;
      for (var5 = var1; var2 > var3 && var4 != null; var2--) {
         var4 = var4.X();
      }

      while (var3 > var2 && var5 != null) {
         var5 = var5.X();
         var3--;
      }

      while (var4 != var5) {
         if (var4 != null) {
            var4 = var4.X();
         }

         if (var5 != null) {
            var5 = var5.X();
         }
      }

      return var4;
   }

   private boolean N(class10021 var1, int var2) {
      if (this.m.y(var1, var2)) {
         return true;
      } else if (this.T == null) {
         return false;
      } else if (var2 == 99 || var2 == 67) {
         this.B.N().N(this.T.B());
         return true;
      } else if (var2 == 120 || var2 == 88) {
         this.B.N().N(this.T.B());
         return true;
      } else if (var2 != 118 && var2 != 86) {
         return false;
      } else {
         this.B.N().N();
         return true;
      }
   }

   @Override
   public void N(int var1, boolean var2, class09857 var3, boolean var4) {
      class10021 var5 = this.T != null ? this.T : this.P;
      if (var5 != null) {
         class09867 var6 = var2 ? class09867.KEY_DOWN : class09867.KEY_UP;
         class09865 var7 = new class09865(var6, var5, var1, var2, var3, var4);
         class09863.N(var7);
         if (var2 && !var7.P() && !var7.m()) {
            if (!var4 && var3 != null && var3.N() && this.N(var5, var1)) {
               this.E.N(var5);
            } else {
               if (this.m.N(var5, var1, var3, var4)) {
                  this.E.N(var5);
               }
            }
         }
      }
   }

   @Override
   public void N(int var1, boolean var2) {
      class09854 var3 = this.M();
      this.N(var3.L());
      if (var2) {
         if (var3.N() && var1 == 0) {
            this.U.N(var3.L(), var3.u(), this.t, var3.i());
         } else {
            this.N(var1, this.N(var3, var1));
         }
      } else {
         boolean var4 = var1 == 0 && this.U.L();
         this.N(var3);
         if (!var4) {
            this.y(var1, this.N(var3, var1));
         }
      }
   }

   private class10021 N(class09854 var1, int var2) {
      return var1.N() && var2 != 0 ? this.z.y(this.P, this.n, this.t) : var1.L();
   }

   @Override
   public void N(int var1) {
      class10021 var2 = this.T != null ? this.T : this.P;
      if (var2 != null) {
         class09852 var3 = new class09852(var2, var1);
         class09863.N(var3);
         if (!var3.P() && !var3.m() && this.m.N(var2, var1)) {
            this.E.N(var2);
         }
      }
   }

   @Override
   public void N(float var1, float var2) {
      var1 = this.y(var1);
      var2 = this.L(var2);
      if (!this.G || Float.compare(this.n, var1) != 0 || Float.compare(this.t, var2) != 0) {
         this.G = true;
         this.n = var1;
         this.t = var2;
         if (this.j != null && this.j.y() == class10049.INPUT) {
            this.W.y(this.j, this.n);
            this.E.N(this.j);
         }

         if (!this.U.L(this.P, this.t)) {
            class09854 var3 = this.M();
            this.N(var3);
            this.N(var3.L());
            class10021 var4 = this.j != null ? this.j : var3.L();
            if (var4 != null) {
               class09863.N(new class09864(class09867.POINTER_MOVE, var4, var1, var2, -1, false));
            }
         }
      }
   }

   private void N(class10021 var1) {
      if (this.s != var1) {
         class10021 var2 = this.s;
         this.s = var1;
         class10021 var3 = N(var2, var1);

         for (class10021 var4 = var2; var4 != null && var4 != var3; var4 = var4.X()) {
            this.Z.N(var4, false, var4 == this.T, var4 == this.b);
         }

         for (class10021 var5 = var1; var5 != null && var5 != var3; var5 = var5.X()) {
            this.Z.N(var5, true, var5 == this.T, var5 == this.b);
         }

         for (class10021 var6 = var2; var6 != null && var6 != var3; var6 = var6.X()) {
            class09863.N(new class09834(class09867.HOVER_LEAVE, var6, this.n, this.t, var1));
         }

         for (class10021 var7 = var1; var7 != null && var7 != var3; var7 = var7.X()) {
            class09863.N(new class09834(class09867.HOVER_ENTER, var7, this.n, this.t, var2));
         }
      }
   }

   @Override
   public void N() {
      if (this.G && this.P != null) {
         if (this.j == null && !this.U.y()) {
            class09854 var1 = this.M();
            this.N(var1);
            this.N(var1.L());
         }
      }
   }

   @Override
   public void N(float var1) {
      class09854 var2 = this.M();
      this.N(var2.L());
      if (this.P != null) {
         class10021 var3 = this.j != null ? this.j : var2.L();
         if (var3 != null) {
            class09837 var4 = new class09837(var3, this.n, this.t, var1);
            class09863.N(var4);
            if (!var4.P() && !var4.m()) {
               this.U.N(var3, this.P, var1);
            }
         }
      }
   }

   private static int R(class10021 var0) {
      if (var0 == null) {
         return 0;
      } else if (var0.M() >= 0) {
         return var0.M();
      } else {
         int var1 = 0;

         for (class10021 var2 = var0; var2 != null; var2 = var2.X()) {
            var1++;
         }

         return var1;
      }
   }

   @Override
   public void R() {
      this.y(null);
   }
}

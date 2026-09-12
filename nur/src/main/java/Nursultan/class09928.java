package Nursultan;

import java.util.ArrayDeque;
import java.util.Deque;

final class class09928 {
   private static final int N = 32;
   private final class10007 y;
   private final class09917 L;
   private final Deque<class09892> u = new ArrayDeque<>();
   private final float[] i = new float[128];
   private int R;
   private boolean M;

   class09916 L(class10021 var1) {
      class09892 var2 = this.y();

      class09916 var5;
      try {
         class09980 var3 = var1.o();
         if (var1.y() != class10049.INPUT) {
            this.y(var1, var2);
            if (var3.d() != class09976.PARENT) {
               this.N(this.y.N(var1, var3), var2);
            }

            this.L(var1, var2);
            return var2.L();
         }

         class09916 var4 = this.L.N(var1, var3);
         var2.N(var4.y(), var4.L(), var4.u(), var4.i());
         var5 = var2.L();
      } finally {
         this.N(var2);
      }

      return var5;
   }

   private void L(class10021 var1, class09892 var2) {
      float var3 = class09918.N(var1);

      for (class10021 var5 : class10047.N(var1)) {
         if (!class10019.N(var5)) {
            class09892 var6 = this.y();

            try {
               this.N(var5, var6);
               if (class10019.y(var5)) {
                  var6.N(0.0F, -var3);
               }

               var2.N(var6);
            } finally {
               this.N(var6);
            }
         }
      }
   }

   private static void L(class10021 var0, class09980 var1, class09892 var2) {
      if (!var2.y() && var1.d() != class09976.NONE) {
         class09887 var3 = class09918.N(var0, var1);
         if (var3 != null) {
            var2.y(var3.y(), var3.L(), var3.u(), var3.i());
         }
      }
   }

   class09928(class10007 var1, class09917 var2) {
      this.y = var1;
      this.L = var2;
   }

   private static void u(class10021 var0, class09892 var1) {
      var1.N(var0.c().R(), var0.c().M(), var0.c().B(), var0.c().Z());
   }

   class09916 y(class10021 var1) {
      class09892 var2 = this.y();

      class09916 var3;
      try {
         this.N(var1, var2);
         var3 = var2.L();
      } finally {
         this.N(var2);
      }

      return var3;
   }

   private void y(class10021 var1, class09892 var2) {
      if (var1.y() == class10049.CANVAS) {
         if (var1.U() != null) {
            var2.N(var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i());
         }
      } else if (var1.y() == class10049.TEXT && !var1.B().isEmpty()) {
         u(var1, var2);
      } else if (var1.y() == class10049.INPUT) {
         u(var1, var2);
      } else {
         if (var1.y() == class10049.TEXTURE && !var1.z().isEmpty()) {
            u(var1, var2);
         }
      }
   }

   private void y(class10021 var1, class09980 var2, class09892 var3) {
      if (var1.y() != class10049.CANVAS) {
         boolean var4 = class09662.R(var2.o());
         boolean var5 = var2.m() > 0.0F && class09662.R(var2.e());
         boolean var6 = class09897.y(var2);
         if (var4 || var5 || var6) {
            float var7 = Math.max(0.0F, var2.m());
            float var8 = var5 && var2.P() == class09981.OUTSIDE ? var7 : 0.0F;
            float var9 = var6 ? Math.max(0.0F, var2.K()) : 0.0F;
            float var10 = var8 + var9;
            var3.N(var1.c().y() - var10, var1.c().L() - var10, var1.c().u() + var10 * 2.0F, var1.c().i() + var10 * 2.0F);
         }
      }
   }

   private class09892 y() {
      class09892 var1 = this.u.pollFirst();
      if (var1 == null) {
         return new class09892();
      } else {
         var1.N();
         return var1;
      }
   }

   private void N(class10021 var1, class09980 var2, class09892 var3) {
      if (class09897.N(var2)) {
         var3.N(var1.c().y(), var1.c().L(), var1.c().u(), var1.c().i());
      }
   }

   private void N(class09830 var1, class09892 var2) {
      if (var1 != null) {
         var2.N(var1.i(), var1.R(), var1.M(), var1.B());
         var2.N(var1.Z(), var1.z(), var1.U(), var1.E());
      }
   }

   boolean N(class10021 var1) {
      this.M = true;
      this.R = 0;
      this.N(var1, 0.0F, 0.0F, true);
      return this.M && !this.N();
   }

   private void N(class10021 var1, float var2, float var3) {
      float var4 = var1.c().R() + var2;
      float var5 = var1.c().M() + var3;
      float var6 = var1.c().B();
      float var7 = var1.c().Z();
      if (!(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         if (Float.isFinite(var4) && Float.isFinite(var5) && Float.isFinite(var6) && Float.isFinite(var7)) {
            if (this.R >= 32) {
               this.M = false;
            } else {
               int var8 = this.R * 4;
               this.i[var8] = var4;
               this.i[var8 + 1] = var5;
               this.i[var8 + 2] = var4 + var6;
               this.i[var8 + 3] = var5 + var7;
               this.R++;
            }
         }
      }
   }

   private void N(class10021 var1, class09892 var2) {
      class09980 var3 = var1.o();
      if (var3.g() && !(var3.f() <= 0.0F)) {
         class09892 var4 = this.y();

         try {
            class09830 var5 = this.y.N(var1, var3);
            this.N(var1, var3, var5, var4);
            this.L(var1, var4);
            L(var1, var3, var4);
            var2.N(var4);
         } finally {
            this.N(var4);
         }
      }
   }

   private boolean N(class10021 var1, class09980 var2, float var3, float var4) {
      class10049 var5 = var1.y();
      if (var5 == class10049.CANVAS) {
         return var1.U() == null;
      } else if (class09662.R(var2.o())) {
         return false;
      } else if (var2.m() > 0.0F && class09662.R(var2.e())) {
         return false;
      } else if (class09897.y(var2)) {
         return false;
      } else if (this.y.N(var1, var2, this.y.N(var1, var2))) {
         return false;
      } else if (var5 == class10049.INPUT) {
         return false;
      } else {
         if (var5 == class10049.TEXT && !var1.B().isEmpty()) {
            this.N(var1, var3, var4);
         } else if (var5 == class10049.TEXTURE && !var1.z().isEmpty()) {
            this.N(var1, var3, var4);
         }

         return true;
      }
   }

   private static boolean N(class09980 var0) {
      return var0.f() > 0.0F && var0.f() < 1.0F || var0.C() > 0.0F;
   }

   private boolean N() {
      for (int var1 = 0; var1 < this.R; var1++) {
         int var2 = var1 * 4;
         float var3 = this.i[var2];
         float var4 = this.i[var2 + 1];
         float var5 = this.i[var2 + 2];
         float var6 = this.i[var2 + 3];

         for (int var7 = var1 + 1; var7 < this.R; var7++) {
            int var8 = var7 * 4;
            if (var3 < this.i[var8 + 2] && this.i[var8] < var5 && var4 < this.i[var8 + 3] && this.i[var8 + 1] < var6) {
               return true;
            }
         }
      }

      return false;
   }

   private void N(class10021 var1, float var2, float var3, boolean var4) {
      if (this.M) {
         class09980 var5 = var1.o();
         if (var5.g() && !(var5.f() <= 0.0F)) {
            if (!var4 && N(var5)) {
               this.M = false;
            } else if (class09897.N(var5)) {
               this.M = false;
            } else if (!this.N(var1, var5, var2, var3)) {
               this.M = false;
            } else {
               float var6 = class09918.N(var1);

               for (class10021 var8 : class10047.N(var1)) {
                  if (!class10019.N(var8)) {
                     float var10 = var3 + (class10019.y(var8) ? -var6 : 0.0F);
                     this.N(var8, var2, var10, false);
                     if (!this.M) {
                        return;
                     }
                  }
               }
            }
         }
      }
   }

   private void N(class09892 var1) {
      this.u.push(var1);
   }

   private void N(class10021 var1, class09980 var2, class09830 var3, class09892 var4) {
      this.N(var1, var2, var4);
      this.y(var1, var2, var4);
      this.y(var1, var4);
      this.N(var3, var4);
   }
}

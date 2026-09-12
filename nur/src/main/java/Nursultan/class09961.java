package Nursultan;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public final class class09961 {
   private final class09715 N;

   private void L(class10021 var1) {
      this.u(var1);

      for (int var2 = 0; var2 < var1.u(); var2++) {
         class10021 var3 = var1.N(var2);
         this.L(var3);
      }
   }

   private static class10002 M(class10021 var0) {
      class09991 var1 = var0.i();
      return var1 == null ? class10002.N : var1.U();
   }

   private class09961(class09781 var1) {
      this.N = class09715.N(Objects.requireNonNull(var1, "context"));
   }

   private static class10002 B(class10021 var0) {
      class09991 var1 = var0.i();
      return var1 == null ? class10002.N : var1.E();
   }

   private static class10002 Z(class10021 var0) {
      List<class09992> var1 = var0.v();
      if (var1.isEmpty()) {
         return class10002.N;
      } else {
         ArrayList var2 = new ArrayList();

         for (class10021 var3 = var0.X(); var3 != null; var3 = var3.X()) {
            var2.add(var3);
         }

         class10002 var8 = class10002.N;

         for (int var4 = var2.size() - 1; var4 >= 0; var4--) {
            class10021 var5 = (class10021)var2.get(var4);
            class09991 var6 = var5.i();
            if (var6 != null && !var6.z().N()) {
               class10002 var7 = var6.z().N(var1, var5.E(), var5.W(), var5.m());
               var8 = var8.N(var7);
            }
         }

         return var8;
      }
   }

   private void i(class10021 var1) {
      for (int var2 = 0; var2 < var1.u(); var2++) {
         this.L(var1.N(var2));
      }
   }

   private void u(class10021 var1) {
      class09980 var2 = var1.o();
      class09980 var3 = R(var1);
      class09980 var4 = this.N.N(var1, var2, var3, M(var1));
      var1.N(var4);
      var1.N(var4.I());
      boolean var5 = !var3.N(var2);
      boolean var6 = !var3.y(var2);
      boolean var7 = !var3.L(var2);
      if (var5) {
         var1.i(2);
      } else if (var6) {
         var1.i(4);
      } else {
         if (var7) {
            var1.i(1);
         }
      }
   }

   public void y(class10021 var1) {
      if (var1 != null) {
         this.u(var1);
      }
   }

   private static boolean N(class09991 var0, boolean var1, boolean var2, boolean var3) {
      if (var0 != null && !var0.z().N()) {
         class10006 var4 = var0.z();
         return var1 && var4.N(class09979.HOVER) || var2 && var4.N(class09979.FOCUS) || var3 && var4.N(class09979.ACTIVE);
      } else {
         return false;
      }
   }

   public static class09961 N(class09781 var0) {
      return var0.N(class09961.class).orElseGet(() -> {
         class09961 var1 = new class09961(var0);
         var0.N(class09961.class, var1);
         return var1;
      });
   }

   public void N(class10021 var1, boolean var2, boolean var3, boolean var4) {
      if (var1 != null) {
         boolean var5 = var1.E() != var2;
         boolean var6 = var1.W() != var3;
         boolean var7 = var1.m() != var4;
         if (var5 || var6 || var7) {
            var1.y(var2);
            var1.L(var3);
            var1.u(var4);
            this.y(var1);
            if (N(var1.i(), var5, var6, var7)) {
               this.i(var1);
            }
         }
      }
   }

   public void N(class09904 var1) {
      if (var1 instanceof class10021 var2) {
         this.L(var2);
      }
   }

   public void N(class10021 var1) {
      if (var1 != null) {
         this.L(var1);
      }
   }

   private static class09980 R(class10021 var0) {
      class09980 var1 = var0.y() == class10049.INPUT ? class09968.y() : class09968.N();
      class09991 var2 = var0.i();
      class10002 var3 = var2 == null ? class10002.N : var2.N(var0.E(), var0.W(), var0.m());
      var3 = var3.N(Z(var0));
      if (var0.T()) {
         return B(var0).N(var3.N(var1));
      } else if (var3.equals(var0.n())) {
         return var0.t();
      } else {
         class09980 var4 = var3.N(var1);
         var0.N(var3, var4);
         return var4;
      }
   }
}

package Nursultan;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;

public final class class10062 {
   private final class10033 N;
   private final Map<class10021, class10050> y = new IdentityHashMap<>();

   public boolean L(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var2 = this.R(var1);
         this.N(var2, var1.B());
         int var3 = var2.N;
         int var4 = var2.y;
         float var5 = var2.L;
         var2.y = 0;
         var2.N = var1.B().length();
         this.y(var1, var2);
         return this.N(var1, var2, var3, var4, var5);
      }
   }

   private static boolean L(class10021 var0, class10050 var1) {
      return class10067.L(var0.B(), var1.y, var1.N);
   }

   public boolean L(class10021 var1, boolean var2) {
      return !M(var1) ? false : this.N(var1, this.R(var1), 0, var2);
   }

   private static boolean M(class10021 var0) {
      return var0 != null && var0.y() == class10049.INPUT;
   }

   private class10062(class09781 var1) {
      this.N = new class10033(var1);
   }

   public class10041 i(class10021 var1) {
      if (!M(var1)) {
         return class10041.N;
      } else {
         class10050 var2 = this.R(var1);
         this.N(var2, var1.B());
         this.y(var1, var2);
         return this.N(var1, var2);
      }
   }

   private static int i(class10021 var0, class10050 var1) {
      return class10067.y(var0.B(), var1.y, var1.N);
   }

   public boolean u(class10021 var1, boolean var2) {
      return !M(var1) ? false : this.N(var1, this.R(var1), var1.B().length(), var2);
   }

   private static int u(class10021 var0, class10050 var1) {
      return class10067.N(var0.B(), var1.y, var1.N);
   }

   public boolean u(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var2 = this.R(var1);
         if (!var2.u) {
            return false;
         } else {
            var2.u = false;
            return true;
         }
      }
   }

   private void y(class10021 var1, class10050 var2) {
      var2.L = this.N.N(var1, var2.N, var2.L);
   }

   public boolean y(class10021 var1, boolean var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var3 = this.R(var1);
         return this.N(var1, var3, class10067.L(var1.B(), var3.N), var2);
      }
   }

   public boolean y(class10021 var1, float var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var3 = this.R(var1);
         if (!var3.u) {
            return false;
         } else {
            this.N(var3, var1.B());
            int var4 = var3.N;
            int var5 = var3.y;
            float var6 = var3.L;
            var3.N = this.N.N(var1, var2, var3.L);
            this.y(var1, var3);
            return this.N(var1, var3, var4, var5, var6);
         }
      }
   }

   public boolean y(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var2 = this.R(var1);
         String var3 = var1.B();
         this.N(var2, var3);
         if (L(var1, var2)) {
            return this.N(var1, var2, "");
         } else if (var2.N >= var3.length()) {
            return false;
         } else {
            int var4 = class10067.L(var3, var2.N);
            return this.N(var1, var2, var2.N, var4, "");
         }
      }
   }

   private static boolean N(class10050 var0, int var1, int var2, float var3) {
      return var1 != var0.N || var2 != var0.y || Float.compare(var3, var0.L) != 0;
   }

   public boolean N(class10021 var1, boolean var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var3 = this.R(var1);
         return this.N(var1, var3, class10067.y(var1.B(), var3.N), var2);
      }
   }

   private boolean N(class10021 var1, class10050 var2, int var3, int var4, float var5) {
      if (!N(var2, var3, var4, var5)) {
         return false;
      } else {
         var1.i(1);
         return true;
      }
   }

   public static class10062 N(class09781 var0) {
      return var0.N(class10062.class).orElseGet(() -> {
         class10062 var1 = new class10062(Objects.requireNonNull(var0, "context"));
         var0.N(class10062.class, var1);
         return var1;
      });
   }

   public boolean N(class10021 var1, String var2) {
      if (!M(var1)) {
         return false;
      } else {
         String var3 = class10027.N(var2);
         class10050 var4 = this.R(var1);
         this.N(var4, var1.B());
         return var3.isEmpty() && !L(var1, var4) ? false : this.N(var1, var4, var3);
      }
   }

   public boolean N(class10021 var1) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var2 = this.R(var1);
         String var3 = var1.B();
         this.N(var2, var3);
         if (L(var1, var2)) {
            return this.N(var1, var2, "");
         } else if (var2.N <= 0) {
            return false;
         } else {
            int var4 = class10067.y(var3, var2.N);
            return this.N(var1, var2, var4, var2.N, "");
         }
      }
   }

   private boolean N(class10021 var1, class10050 var2, String var3) {
      return this.N(var1, var2, u(var1, var2), i(var1, var2), var3);
   }

   private boolean N(class10021 var1, class10050 var2, int var3, boolean var4) {
      String var5 = var1.B();
      this.N(var2, var5);
      int var6 = var2.N;
      int var7 = var2.y;
      float var8 = var2.L;
      int var9 = class10067.N(var5, var3);
      var2.N = var9;
      if (!var4) {
         var2.y = var9;
      }

      this.y(var1, var2);
      return this.N(var1, var2, var6, var7, var8);
   }

   private boolean N(class10021 var1, class10050 var2, int var3, int var4, String var5) {
      String var6 = var1.B();
      int var7 = var2.N;
      int var8 = var2.y;
      float var9 = var2.L;
      int var10 = class10067.N(var6, var3, var4);
      String var11 = class10027.N(var6, var10, var4, var5);
      int var12 = class10067.N(var11, var10 + var5.length());
      var2.N = var12;
      var2.y = var12;
      if (!var6.equals(var11)) {
         var1.N(var11);
      }

      this.y(var1, var2);
      boolean var13 = N(var2, var7, var8, var9);
      if (var13 && var6.equals(var11)) {
         var1.i(1);
      }

      return !var6.equals(var11) || var13;
   }

   public boolean N(class10021 var1, float var2) {
      if (!M(var1)) {
         return false;
      } else {
         class10050 var3 = this.R(var1);
         this.N(var3, var1.B());
         int var4 = var3.N;
         int var5 = var3.y;
         float var6 = var3.L;
         boolean var7 = var3.u;
         int var8 = this.N.N(var1, var2, var3.L);
         var3.N = var8;
         var3.y = var8;
         var3.u = true;
         this.y(var1, var3);
         boolean var9 = var4 != var3.N || var5 != var3.y || Float.compare(var6, var3.L) != 0 || !var7;
         if (var9) {
            var1.i(1);
         }

         return var9;
      }
   }

   public void N(class10021 var1, class10021 var2) {
      if (M(var1) && var1 != var2) {
         class10050 var3 = this.R(var1);
         boolean var4 = L(var1, var3);
         var3.u = false;
         var3.y = var3.N;
         if (var4) {
            var1.i(1);
         }
      }

      if (M(var2)) {
         this.N(this.R(var2), var2.B());
      }
   }

   private class10041 N(class10021 var1, class10050 var2) {
      String var3 = var1.B();
      boolean var4 = var3.isEmpty() && !var1.Z().isEmpty();
      String var5 = var4 ? var1.Z() : var3;
      return new class10041(var3, var5, var4, var2.N, u(var1, var2), i(var1, var2), var4 ? 0.0F : var2.L);
   }

   private void N(class10050 var1, String var2) {
      var1.N = class10067.N(var2, var1.N);
      var1.y = class10067.N(var2, var1.y);
   }

   private class10050 R(class10021 var1) {
      return this.y.computeIfAbsent(var1, var0 -> new class10050());
   }
}

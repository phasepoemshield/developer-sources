package Nursultan;

import java.util.Map;
import java.util.Objects;
import java.util.logging.Logger;

public final class class10054 {
   private static final Logger N = Logger.getLogger(class10054.class.getName());
   private static final int y = 8192;
   private static final class10043 L = new class10043();
   private final class09781 u;
   private final class10037 i;
   private final Map<class10021, class10060> R = new class10031(this, 256, 0.75F, true);
   private class10030 M = new class10030();
   private int B;

   class10054(class09781 var1) {
      this.u = Objects.requireNonNull(var1, "context");
      this.i = class10037.N(var1);
   }

   class10037 y() {
      return this.i;
   }

   private static String y(class10021 var0) {
      String var1 = var0.N();
      return var1 != null && !var1.isBlank() ? var1 : "<anonymous>";
   }

   private class10060 y(class10021 var1, class09980 var2) {
      class10060 var3 = this.R.computeIfAbsent(var1, var0 -> new class10060());
      int var4 = var1.k();
      int var5 = var1.l();
      int var6 = this.u.u().y();
      if (!var3.i || var3.y != var4 || var3.L != var5 || var3.u != var6) {
         var3.i = true;
         var3.y = var4;
         var3.L = var5;
         var3.u = var6;
         var3.R = null;
         var3.M.clear();
      }

      return var3;
   }

   public boolean N(class10021 var1, float var2, float var3, class09770 var4) {
      if (var1 == null) {
         return false;
      } else {
         class09770 var5 = var4 == null ? class09770.N : var4;
         class10052 var6 = new class10052(this, var1, Math.max(0.0F, var2), Math.max(0.0F, var3), this.u.u().N(), ++this.B);
         var6.B();
         this.M = var6.i();
         class10030 var7 = this.M;
         if (var5.u()) {
            N.info(
               () -> "Layout rebuilt for root='"
                     + y(var1)
                     + "', viewport="
                     + var6.y()
                     + "x"
                     + var6.L()
                     + ", epoch="
                     + var6.u()
                     + ", metadataNodes="
                     + var7.N
                     + ", intrinsicNodes="
                     + var7.y
                     + ", widthSizingNodes="
                     + var7.L
                     + ", heightSizingNodes="
                     + var7.u
                     + ", textWrapNodes="
                     + var7.i
                     + ", heightRecomputeNodes="
                     + var7.R
                     + ", positioningNodes="
                     + var7.M
            );
         }

         return true;
      }
   }

   public boolean N(class10021 var1, float var2, float var3) {
      return this.N(var1, var2, var3, class09770.N);
   }

   public static class10054 N(class09781 var0) {
      class09781 var1 = Objects.requireNonNull(var0, "context");
      return var1.N(class10054.class).orElseGet(() -> {
         class10054 var1x = new class10054(var1);
         var1.N(class10054.class, var1x);
         return var1x;
      });
   }

   class10030 N() {
      return this.M;
   }

   class10056 N(class10021 var1, class09980 var2) {
      class10060 var3 = this.y(var1, var2);
      if (var3.R != null) {
         return var3.R;
      } else {
         var3.R = class10058.N(this.u, var1.B(), var2.c(), var2.X());
         return var3.R;
      }
   }

   class10026 N(class10021 var1, class09980 var2, float var3) {
      class10060 var4 = this.y(var1, var2);
      int var5 = Float.floatToIntBits(var3);
      class10026 var6 = var4.M.get(var5);
      if (var6 != null) {
         return var6;
      } else {
         class10026 var7 = class10058.N(this.u, var1.B(), var3, var2.c(), var2.X(), this.N(var1, var2));
         var4.M.put(var5, var7);
         return var7;
      }
   }

   public boolean N(class10021 var1) {
      if (var1 == null) {
         return false;
      } else {
         class10030 var2 = new class10030();
         new class10022(var2, L, this.u.u().N(), false).N(var1);
         var1.L(4);
         this.M = var2;
         return true;
      }
   }
}

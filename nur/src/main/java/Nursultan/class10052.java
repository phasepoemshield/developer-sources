package Nursultan;

import java.util.Objects;

final class class10052 {
   private final class10054 N;
   private final class10021 y;
   private final float L;
   private final float u;
   private final float i;
   private final int R;
   private final class10030 M = new class10030();
   private int B;
   private final class10055 Z;
   private final class10032 z;
   private final class10045 U;

   float L() {
      return this.u;
   }

   int M() {
      return this.B++;
   }

   class10052(class10054 var1, class10021 var2, float var3, float var4, float var5, int var6) {
      this.N = Objects.requireNonNull(var1, "engine");
      this.y = Objects.requireNonNull(var2, "root");
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.Z = new class10055(this);
      this.z = new class10032(this);
      this.U = new class10045(this);
   }

   void B() {
      this.Z.N();
      this.z.N();
      this.U.N();
      this.y.L(14);
   }

   class10030 i() {
      return this.M;
   }

   int u() {
      return this.R;
   }

   float y() {
      return this.L;
   }

   float N(class10021 var1, class10036 var2, float var3) {
      float var4 = this.N.y().N(var1, var2, var3);
      this.N(var1).N(var2, !class10048.N(var4, var3));
      return var4;
   }

   class10026 N(class10021 var1, class09980 var2, float var3) {
      return this.N.N(var1, var2, var3);
   }

   class10021 N() {
      return this.y;
   }

   class10061 N(class10021 var1) {
      class10061 var2 = N(var1.c());
      if (var2.z != this.R) {
         var2.N();
         var2.z = this.R;
      }

      return var2;
   }

   class10056 N(class10021 var1, class09980 var2) {
      return this.N.N(var1, var2);
   }

   private static class10061 N(class09937 var0) {
      Object var2 = var0.N();
      if (var2 instanceof class10061) {
         return (class10061)var2;
      } else {
         class10061 var1 = new class10061();
         var0.N(var1);
         return var1;
      }
   }

   float R() {
      return this.i;
   }
}

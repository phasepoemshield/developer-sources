package Nursultan;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;

public final class class09723 {
   private static final int N = 16;
   private static final int y = 8;
   static final class09960[] L;
   private final class09940 u;
   private final int i;
   private final int R;
   private final int M;
   private final int B;
   private final int Z;
   private final int z;
   private final byte[] U;
   private final ArrayList<class09946> E = new ArrayList<>();
   private final ArrayList<class09756> W = new ArrayList<>();
   private final class09953 m = new class09953();
   private final class09721 P = new class09721(16);
   private byte[] s;
   private int T;
   private int b;
   private int j;
   private int v;
   private int n;
   private int t;

   public int L() {
      return this.T;
   }

   private class09946 L(class09946 var1) {
      class09946 var2 = Objects.requireNonNull(var1, "texture");
      if (var2.z() != this) {
         throw new IllegalArgumentException("Texture handle does not belong to this atlas");
      } else {
         return var2;
      }
   }

   private boolean L(class09946 var1, byte[] var2, int var3, int var4) {
      int var5 = this.y(var1);
      class09760 var6 = this.b();
      class09722 var7 = this.u(var1);
      this.E.remove(var5);
      this.L(var7.N(), var7.y(), var7.i(), var7.R());
      this.s();
      this.v();
      class09727 var8 = this.N(var3, var4);
      if (var8 != null) {
         this.N(var1, var5, var2, var3, var4, var7, var8, var6.L());
         return true;
      } else {
         this.N(var1, var5, var6);
         return this.N(var1, var2, var3, var4, true);
      }
   }

   private void L(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && var1 >= 0 && var2 >= 0 && var1 + var3 <= this.i) {
         if (var2 < this.R && var2 + var4 <= this.R) {
            if (var3 >= 8 && var4 >= 8) {
               class09756 var5 = new class09756(var1, var2, var3, var4);
               int var6 = 0;

               while (var6 < this.W.size()) {
                  class09756 var7 = this.W.get(var6);
                  if (N(var5, var7)) {
                     this.W.remove(var6);
                  } else {
                     if (N(var7, var5)) {
                        return;
                     }

                     if (y(var5, var7)) {
                        var5 = L(var5, var7);
                        this.W.remove(var6);
                        var6 = 0;
                     } else {
                        var6++;
                     }
                  }
               }

               this.W.add(var5);
            }
         }
      }
   }

   private class09727 L(int var1, int var2) {
      class09711 var3 = this.B(var1, var2);
      int var4 = -1;
      int var5 = Integer.MAX_VALUE;
      int var6 = Integer.MAX_VALUE;
      int var7 = Integer.MAX_VALUE;
      int var8 = Integer.MAX_VALUE;

      for (int var9 = 0; var9 < this.W.size(); var9++) {
         class09756 var10 = this.W.get(var9);
         if (var3.N() <= var10.L && var3.y() <= var10.u) {
            int var11 = var10.L * var10.u - var3.N() * var3.y();
            int var12 = Math.min(var10.L - var3.N(), var10.u - var3.y());
            if (var11 < var5 || var11 == var5 && var12 < var6 || var11 == var5 && var12 == var6 && (var10.y < var7 || var10.y == var7 && var10.N < var8)) {
               var4 = var9;
               var5 = var11;
               var6 = var12;
               var8 = var10.N;
               var7 = var10.y;
            }
         }
      }

      if (var4 < 0) {
         return null;
      } else {
         class09756 var13 = this.W.remove(var4);
         this.L(var13.N + var3.N(), var13.y, var13.L - var3.N(), var13.u);
         this.L(var13.N, var13.y + var3.y(), var3.N(), var13.u - var3.y());
         int var14 = Math.max(this.b, var13.y + var2);
         int var15 = this.y(var14);
         return new class09727(var13.N, var13.y, var3.N(), var3.y(), var15, 0, false);
      }
   }

   private static class09756 L(class09756 var0, class09756 var1) {
      int var2 = Math.min(var0.N, var1.N);
      int var3 = Math.min(var0.y, var1.y);
      int var4 = Math.max(var0.N(), var1.N());
      int var5 = Math.max(var0.y(), var1.y());
      return new class09756(var2, var3, var4 - var2, var5 - var3);
   }

   private int L(int var1) {
      return N((long)var1 + (long)this.M, "padded width is too large");
   }

   public byte[] M() {
      return this.U;
   }

   private int M(int var1, int var2) {
      return var1 >= this.T ? 0 : Math.min(var1 + var2, this.T) - var1;
   }

   private int P() {
      int var1 = 0;

      for (class09946 var3 : this.E) {
         var1 = Math.max(var1, var3.y() + this.u(var3.u()));
      }

      return var1;
   }

   private void T() {
      this.b = 0;
      this.j = 0;
      this.T = this.B;
      this.W.clear();
      this.v();
   }

   public class09723(class09940 var1, int var2, int var3) {
      this(var1, var2, var3, 0, 1);
   }

   public class09723(class09940 var1, int var2, int var3, int var4, int var5) {
      this.u = Objects.requireNonNull(var1, "format");
      if (var2 <= 0) {
         throw new IllegalArgumentException("maxWidth must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("maxHeight must be > 0");
      } else if (var4 < 0) {
         throw new IllegalArgumentException("padding must be >= 0");
      } else if (var5 <= 0) {
         throw new IllegalArgumentException("minHeight must be > 0");
      } else if (var5 > var3) {
         throw new IllegalArgumentException("minHeight must be <= maxHeight");
      } else {
         this.i = var2;
         this.R = var3;
         this.M = var4;
         this.B = var5;
         this.Z = var1.N();
         this.z = N(var2, this.Z, "maxWidth * bytesPerPixel");
         this.U = new byte[N((long)this.z * (long)var3, "atlas pixel buffer is too large")];
         this.T = var5;
      }
   }

   public class09723(class09940 var1, int var2, int var3, int var4) {
      this(var1, var2, var3, var4, 1);
   }

   private class09711 B(int var1, int var2) {
      return new class09711(this.L(var1), this.u(var2));
   }

   public boolean B() {
      return this.P.N();
   }

   public class09960[] Z() {
      return this.P.y();
   }

   private void i(int var1, int var2) {
      if (var2 > var1) {
         this.u(var1, var2 - var1);
      }
   }

   public int i() {
      return this.R;
   }

   private void i(int var1) {
      if (this.s == null || this.s.length < var1) {
         this.s = new byte[var1];
      }
   }

   private class09722 i(int var1, int var2, int var3, int var4) {
      class09711 var5 = this.B(var3, var4);
      return new class09722(var1, var2, var3, var4, var5.N(), var5.y());
   }

   private class09760 b() {
      return new class09760(this.b, this.j, this.T, this.v, this.n, this.t, new ArrayList<>(this.W));
   }

   private void s() {
      this.b = this.m();
      this.j = this.P();
      this.T = this.y(this.b);
   }

   private int m() {
      int var1 = 0;

      for (class09946 var3 : this.E) {
         var1 = Math.max(var1, var3.y() + var3.u());
      }

      return var1;
   }

   private void v() {
      this.v = 0;
      this.n = this.j;
      this.t = 0;
   }

   private void j() {
      this.P.N(0, 0, this.i, this.T);
   }

   public class09960[] U() {
      if (this.W.isEmpty()) {
         return L;
      } else {
         class09960[] var1 = new class09960[this.W.size()];
         int var2 = 0;

         for (int var3 = 0; var3 < this.W.size(); var3++) {
            class09756 var4 = this.W.get(var3);
            int var5 = this.M(var4.y, var4.u);
            if (var5 > 0) {
               var1[var2++] = new class09960(var4.N, var4.y, var4.L, var5);
            }
         }

         if (var2 == 0) {
            return L;
         } else {
            if (var2 != var1.length) {
               var1 = Arrays.copyOf(var1, var2);
            }

            return var1;
         }
      }
   }

   public class09960[] z() {
      return this.P.L();
   }

   private class09722 u(class09946 var1) {
      return this.i(var1.N(), var1.y(), var1.L(), var1.u());
   }

   private void u(int var1, int var2) {
      if (var2 > 0) {
         Arrays.fill(this.U, this.R(var1), this.R(var1 + var2), (byte)0);
      }
   }

   public int u() {
      return this.i;
   }

   private void u(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0 && !this.W.isEmpty()) {
         int var5 = var1 + var3;
         int var6 = var2 + var4;
         ArrayList var7 = new ArrayList<>(this.W);
         this.W.clear();

         for (int var8 = 0; var8 < var7.size(); var8++) {
            class09756 var9 = (class09756)var7.get(var8);
            int var10 = Math.max(var9.N, var1);
            int var11 = Math.max(var9.y, var2);
            int var12 = Math.min(var9.N(), var5);
            int var13 = Math.min(var9.y(), var6);
            if (var10 < var12 && var11 < var13) {
               this.L(var9.N, var9.y, var9.L, var11 - var9.y);
               this.L(var9.N, var13, var9.L, var9.y() - var13);
               this.L(var9.N, var11, var10 - var9.N, var13 - var11);
               this.L(var12, var11, var9.N() - var12, var13 - var11);
            } else {
               this.L(var9.N, var9.y, var9.L, var9.u);
            }
         }
      }
   }

   private int u(int var1) {
      return N((long)var1 + (long)this.M, "padded height is too large");
   }

   public int y() {
      return this.i;
   }

   private int y(int var1) {
      if (var1 <= 0) {
         return this.B;
      } else {
         return var1 <= this.B ? this.B : Math.min(class09941.N(var1), this.R);
      }
   }

   private static boolean y(class09756 var0, class09756 var1) {
      return var0.y == var1.y && var0.u == var1.u && var0.N <= var1.N() && var1.N <= var0.N()
         || var0.N == var1.N && var0.L == var1.L && var0.y <= var1.y() && var1.y <= var0.y();
   }

   private void y(class09946 var1, byte[] var2, int var3, int var4) {
      int var5 = this.T;
      int var6 = var1.N();
      int var7 = var1.y();
      class09722 var8 = this.u(var1);
      class09722 var9 = this.i(var6, var7, var3, var4);
      this.N(var6, var7, var8.i(), var8.R());
      this.N(var2, var6, var7, var3, var4);
      var1.N(var6, var7, var3, var4);
      this.L(var6 + var9.i(), var7, var8.i() - var9.i(), var8.R());
      this.L(var6, var7 + var9.R(), var9.i(), var8.R() - var9.R());
      this.s();
      this.v();
      this.N(var5, var6, var7, var8.i(), var8.R());
   }

   private void y(int var1, int var2, int var3, int var4, int var5) {
      if (this.T != var1) {
         this.j();
      } else {
         this.y(var2, var3, var4, var5);
      }
   }

   private void y(byte[] var1, int var2, int var3) {
      Objects.requireNonNull(var1, "bytes");
      if (var2 <= 0) {
         throw new IllegalArgumentException("width must be > 0");
      } else if (var3 <= 0) {
         throw new IllegalArgumentException("height must be > 0");
      } else if (var2 > this.i) {
         throw new IllegalArgumentException("width exceeds atlas maxWidth");
      } else if (var3 > this.R) {
         throw new IllegalArgumentException("height exceeds atlas maxHeight");
      } else {
         int var4 = N((long)var2 * (long)var3 * (long)this.Z, "texture byte array is too large");
         if (var1.length != var4) {
            throw new IllegalArgumentException("Expected " + var4 + " bytes but got " + var1.length);
         }
      }
   }

   private void y(int var1, int var2, int var3, int var4) {
      int var5 = this.M(var2, var4);
      if (var5 > 0) {
         this.P.N(var1, var2, var3, var5);
      }
   }

   private int y(class09946 var1) {
      int var2 = this.E.indexOf(var1);
      if (var2 < 0) {
         throw new IllegalStateException("Texture handle is not registered in the atlas");
      } else {
         return var2;
      }
   }

   private class09727 y(int var1, int var2) {
      class09711 var3 = this.B(var1, var2);
      int var4 = this.v;
      int var5 = this.n;
      int var6 = this.t;
      if (var4 + var3.N() > this.i) {
         var4 = 0;
         var5 += var6;
         var6 = 0;
      }

      if (var5 + var3.y() > this.R) {
         return null;
      } else if (!this.E.isEmpty() && var5 + var2 > this.T) {
         return null;
      } else {
         int var8 = Math.max(this.b, var5 + var2);
         int var9 = this.y(var8);
         return new class09727(var4, var5, var3.N(), var3.y(), var9, Math.max(var6, var3.y()), true);
      }
   }

   public void E() {
      this.P.u();
   }

   private static int N(int var0, int var1, String var2) {
      return N((long)var0 * (long)var1, var2);
   }

   private static int N(long var0, String var2) {
      if (var0 >= 0L && var0 <= 2147483647L) {
         return (int)var0;
      } else {
         throw new IllegalArgumentException(var2);
      }
   }

   private void N(class09727 var1) {
      if (var1.M()) {
         this.v = var1.N() + var1.L();
         this.n = var1.y();
         this.t = var1.R();
      } else {
         this.v();
      }
   }

   public class09946 N(byte[] var1, int var2, int var3) {
      this.y(var1, var2, var3);
      class09946 var4 = new class09946(this);
      class09727 var5 = this.N(var2, var3);
      if (var5 != null) {
         this.N(var4, var1, var2, var3, var5);
         return var4;
      } else if (!this.N(var4, var1, var2, var3, false)) {
         throw new IllegalStateException("Texture does not fit into the atlas");
      } else {
         return var4;
      }
   }

   public boolean N(class09946 var1) {
      class09946 var2 = this.L(var1);
      if (!var2.i()) {
         return false;
      } else if (!this.E.remove(var2)) {
         return false;
      } else {
         class09722 var3 = this.u(var2);
         int var4 = this.T;
         this.N(var3.N(), var3.y(), var3.i(), var3.R());
         var2.U();
         if (this.E.isEmpty()) {
            this.T();
         } else {
            this.s();
            this.L(var3.N(), var3.y(), var3.i(), var3.R());
            this.v();
         }

         this.N(var4, var3.N(), var3.y(), var3.i(), var3.R());
         return true;
      }
   }

   public class09940 N() {
      return this.u;
   }

   public class09946 N(class09946 var1, byte[] var2, int var3, int var4) {
      class09946 var5 = this.L(var1);
      if (!var5.i()) {
         throw new IllegalStateException("Texture handle is not alive");
      } else {
         this.y(var2, var3, var4);
         if (var5.L() == var3 && var5.u() == var4) {
            this.N(var2, var5.N(), var5.y(), var3, var4);
            this.P.N(var5.N(), var5.y(), var3, var4);
            return var5;
         } else if (var3 <= var5.L() && var4 <= var5.u()) {
            this.y(var5, var2, var3, var4);
            return var5;
         } else if (!this.L(var5, var2, var3, var4)) {
            throw new IllegalStateException("Updated texture does not fit into the atlas");
         } else {
            return var5;
         }
      }
   }

   private void N(class09946 var1, byte[] var2, class09722 var3, class09727 var4) {
      this.N(var3.N(), var3.y(), var3.i(), var3.R());
      this.N(var2, var3.N(), var3.y(), var3.L(), var3.u());
      if (var4.M()) {
         this.u(var3.N(), var3.y(), var3.i(), var3.R());
      }

      var1.N(var3.N(), var3.y(), var3.L(), var3.u());
      this.b = Math.max(this.b, var3.M());
      this.j = Math.max(this.j, var3.B());
      this.T = var4.i();
      this.N(var4);
   }

   private void N(byte[] var1, int var2, int var3, int var4, int var5) {
      int var6 = N(var4, this.Z, "texture row is too large");

      for (int var7 = 0; var7 < var5; var7++) {
         int var8 = var7 * var6;
         int var9 = this.R(var2, var3 + var7);
         System.arraycopy(var1, var8, this.U, var9, var6);
      }
   }

   private void N(byte[] var1, int var2, int var3, int var4, int var5, byte[] var6, int var7, int var8) {
      int var9 = N(var4, this.Z, "texture row is too large");

      for (int var10 = 0; var10 < var5; var10++) {
         int var11 = this.R(var2, var3 + var10);
         int var12 = this.R(var7, var8 + var10);
         System.arraycopy(var1, var11, var6, var12, var9);
      }
   }

   private void N(int var1, int var2, int var3, int var4) {
      int var5 = N(var3, this.Z, "texture row is too large");

      for (int var6 = 0; var6 < var4; var6++) {
         int var7 = this.R(var1, var2 + var6);
         Arrays.fill(this.U, var7, var7 + var5, (byte)0);
      }
   }

   private class09727 N(int var1, int var2) {
      class09727 var3 = this.L(var1, var2);
      return var3 != null ? var3 : this.y(var1, var2);
   }

   private boolean N(class09946 var1, byte[] var2, int var3, int var4, boolean var5) {
      class09744 var6 = this.N(var1, var3, var4, var5);
      if (var6 == null) {
         return false;
      } else {
         this.N(var6, var1, var2, var3, var4, var5);
         return true;
      }
   }

   private class09744 N(class09946 var1, int var2, int var3, boolean var4) {
      int var5 = this.T;

      while (true) {
         class09744 var6 = this.N(var1, var2, var3, var4, var5);
         if (var6 != null) {
            return var6;
         }

         int var7 = this.N(var5);
         if (var7 <= var5) {
            return null;
         }

         var5 = var7;
      }
   }

   private class09744 N(class09946 var1, int var2, int var3, boolean var4, int var5) {
      int var6 = var1 != null && !var4 ? 1 : 0;
      int var7 = this.E.size() + var6;
      if (var7 == 0) {
         return class09744.B;
      } else {
         class09946[] var8 = new class09946[var7];
         int[] var9 = new int[var7];
         int[] var10 = new int[var7];
         int[] var11 = new int[var7];
         int[] var12 = new int[var7];
         int[] var13 = new int[var7];
         boolean[] var14 = new boolean[var7];
         int var15 = 0;

         for (class09946 var17 : this.E) {
            var8[var15] = var17;
            var9[var15] = var15;
            if (var17 == var1 && var4) {
               var10[var15] = this.L(var2);
               var11[var15] = this.u(var3);
            } else {
               var10[var15] = this.L(var17.L());
               var11[var15] = this.u(var17.u());
            }

            var15++;
         }

         if (var1 != null && !var4) {
            var8[var15] = var1;
            var9[var15] = var15;
            var10[var15] = this.L(var2);
            var11[var15] = this.u(var3);
         }

         this.m.N(this.i, var5, this.i);
         this.m.N(1);
         if (!this.m.N(var9, var10, var11, var12, var13, var14, var7)) {
            return null;
         } else {
            int var21 = 0;
            int var22 = 0;

            for (int var18 = 0; var18 < var7; var18++) {
               class09946 var19 = var8[var18];
               int var20 = var19 == var1 ? var3 : var19.u();
               var21 = Math.max(var21, var13[var18] + var20);
               var22 = Math.max(var22, var13[var18] + var11[var18]);
            }

            if (var22 > var5) {
               return null;
            } else {
               int var23 = this.y(var21);
               return new class09744(var8, var12, var13, var7, var21, var22, var23);
            }
         }
      }
   }

   private void N(class09744 var1, class09946 var2, byte[] var3, int var4, int var5, boolean var6) {
      int var7 = this.T;
      int var8 = this.R(var7);
      this.i(var8);
      if (var8 > 0) {
         System.arraycopy(this.U, 0, this.s, 0, var8);
      }

      int var9 = Math.max(var7, var1.M());
      Arrays.fill(this.U, 0, this.R(var9), (byte)0);

      for (int var10 = 0; var10 < var1.u(); var10++) {
         class09946 var11 = var1.N()[var10];
         int var12 = var1.y()[var10];
         int var13 = var1.L()[var10];
         int var14 = var11 == var2 ? var4 : var11.L();
         int var15 = var11 == var2 ? var5 : var11.u();
         if (var11 == var2) {
            this.N(var3, var12, var13, var14, var15);
         } else {
            this.N(this.s, var11.N(), var11.y(), var14, var15, this.U, var12, var13);
         }

         var11.N(var12, var13, var14, var15);
      }

      if (var2 != null && !var6) {
         this.E.add(var2);
      }

      this.b = var1.i();
      this.j = var1.R();
      this.T = var1.M();
      this.W.clear();
      this.v();
      this.j();
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      if (this.T < var1) {
         this.u(this.T, var1 - this.T);
         this.j();
      } else {
         this.y(var2, var3, var4, var5);
      }
   }

   private int N(int var1) {
      return var1 >= this.R ? var1 : Math.min(class09941.N(var1 + 1), this.R);
   }

   private void N(class09946 var1, byte[] var2, int var3, int var4, class09727 var5) {
      int var6 = this.T;
      class09722 var7 = this.i(var5.N(), var5.y(), var3, var4);
      this.i(var6, var5.i());
      this.N(var1, var2, var7, var5);
      this.E.add(var1);
      this.y(var6, var7.N(), var7.y(), var3, var4);
   }

   private static boolean N(class09756 var0, class09756 var1) {
      return var0.N <= var1.N && var0.y <= var1.y && var0.N() >= var1.N() && var0.y() >= var1.y();
   }

   private void N(class09946 var1, int var2, byte[] var3, int var4, int var5, class09722 var6, class09727 var7, int var8) {
      class09722 var9 = this.i(var7.N(), var7.y(), var4, var5);
      int var10 = this.T;
      this.i(var10, var7.i());
      this.N(var6.N(), var6.y(), var6.i(), var6.R());
      this.N(var1, var3, var9, var7);
      this.E.add(Math.min(var2, this.E.size()), var1);
      if (this.T < var8) {
         this.u(this.T, var8 - this.T);
      }

      if (this.T != var8) {
         this.j();
      } else {
         this.y(var6.N(), var6.y(), var6.i(), var6.R());
         this.y(var9.N(), var9.y(), var9.i(), var9.R());
      }
   }

   private void N(class09946 var1, int var2, class09760 var3) {
      this.E.add(Math.min(var2, this.E.size()), var1);
      this.W.clear();
      this.W.addAll(var3.M());
      this.b = var3.N();
      this.j = var3.y();
      this.T = var3.L();
      this.v = var3.u();
      this.n = var3.i();
      this.t = var3.R();
   }

   public void W() {
      if (!this.E.isEmpty()) {
         if (!this.N(null, null, 0, 0, false)) {
            throw new IllegalStateException("Active textures do not fit into the atlas");
         }
      }
   }

   private int R(int var1) {
      return N((long)var1 * (long)this.z, "row byte count is too large");
   }

   public int R() {
      return this.M;
   }

   private int R(int var1, int var2) {
      return var2 * this.z + var1 * this.Z;
   }
}

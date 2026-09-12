package Nursultan;

import java.util.Arrays;

public final class class09731 {
   boolean N;
   int y;
   int L;
   int u;
   int i;
   int R;
   int[] M = new int[64];

   public int L() {
      return this.y;
   }

   public int L(int var1) {
      return this.M[var1 * 4 + 2];
   }

   public int M() {
      return this.R;
   }

   void B() {
      this.N = false;
      this.R = 0;
   }

   void Z() {
      this.R = 0;
   }

   public int i() {
      return this.u;
   }

   public int u(int var1) {
      return this.M[var1 * 4 + 3];
   }

   public int u() {
      return this.L;
   }

   public int y(int var1) {
      return this.M[var1 * 4 + 1];
   }

   public boolean y() {
      return this.N;
   }

   void N(int var1, int var2, int var3, int var4) {
      int var5 = this.R * 4;
      if (var5 + 4 > this.M.length) {
         this.M = Arrays.copyOf(this.M, this.M.length * 2);
      }

      this.M[var5] = var1;
      this.M[var5 + 1] = var2;
      this.M[var5 + 2] = var3;
      this.M[var5 + 3] = var4;
      this.R++;
   }

   public boolean N() {
      return this.N || this.R > 0;
   }

   public int N(int var1) {
      return this.M[var1 * 4];
   }

   public int R() {
      return this.i;
   }
}

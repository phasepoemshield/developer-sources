package Nursultan;

final class class09721 {
   private final int[] N;
   private final int[] y;
   private final int[] L;
   private final int[] u;
   private int i;
   private boolean R;

   class09960[] L() {
      class09960[] var1 = this.y();
      this.u();
      return var1;
   }

   class09721(int var1) {
      this.N = new int[var1];
      this.y = new int[var1];
      this.L = new int[var1];
      this.u = new int[var1];
   }

   void u() {
      this.i = 0;
      this.R = false;
   }

   private void y(int var1, int var2, int var3, int var4) {
      int var5 = var1;
      int var6 = var2;
      int var7 = var1 + var3;
      int var8 = var2 + var4;

      for (int var9 = 0; var9 < this.i; var9++) {
         var5 = Math.min(var5, this.N[var9]);
         var6 = Math.min(var6, this.y[var9]);
         var7 = Math.max(var7, this.N[var9] + this.L[var9]);
         var8 = Math.max(var8, this.y[var9] + this.u[var9]);
      }

      this.N[0] = var5;
      this.y[0] = var6;
      this.L[0] = var7 - var5;
      this.u[0] = var8 - var6;
      this.i = 1;
   }

   class09960[] y() {
      if (this.i == 0) {
         return class09723.L;
      } else {
         class09960[] var1 = new class09960[this.i];

         for (int var2 = 0; var2 < this.i; var2++) {
            var1[var2] = new class09960(this.N[var2], this.y[var2], this.L[var2], this.u[var2]);
         }

         return var1;
      }
   }

   private boolean N(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      return var1 <= var5 + var7 && var5 <= var1 + var3 && var2 <= var6 + var8 && var6 <= var2 + var4;
   }

   private void N(int var1) {
      int var2 = this.i - 1;
      this.N[var1] = this.N[var2];
      this.y[var1] = this.y[var2];
      this.L[var1] = this.L[var2];
      this.u[var1] = this.u[var2];
      this.i = var2;
   }

   boolean N() {
      return this.R;
   }

   void N(int var1, int var2, int var3, int var4) {
      if (var3 > 0 && var4 > 0) {
         this.R = true;
         int var5 = var1;
         int var6 = var2;
         int var7 = var3;
         int var8 = var4;
         int var9 = 0;

         while (var9 < this.i) {
            if (this.N(var5, var6, var7, var8, this.N[var9], this.y[var9], this.L[var9], this.u[var9])) {
               int var10 = Math.min(var5, this.N[var9]);
               int var11 = Math.min(var6, this.y[var9]);
               int var12 = Math.max(var5 + var7, this.N[var9] + this.L[var9]);
               int var13 = Math.max(var6 + var8, this.y[var9] + this.u[var9]);
               var5 = var10;
               var6 = var11;
               var7 = var12 - var10;
               var8 = var13 - var11;
               this.N(var9);
               var9 = 0;
            } else {
               var9++;
            }
         }

         if (this.i < this.N.length) {
            this.N[this.i] = var5;
            this.y[this.i] = var6;
            this.L[this.i] = var7;
            this.u[this.i] = var8;
            this.i++;
         } else {
            this.y(var5, var6, var7, var8);
         }
      }
   }
}

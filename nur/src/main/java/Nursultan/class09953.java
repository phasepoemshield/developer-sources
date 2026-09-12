package Nursultan;

public final class class09953 {
   public static final int N = Integer.MAX_VALUE;
   public static final int y = 0;
   public static final int L = 1;
   private int[] u;
   private int[] i;
   private int[] R;
   private int M;
   private int B;
   private int Z;
   private int z;
   private int U;
   private int E;
   private int W;
   private int[] m;
   private int P;
   private int s;
   private int T;
   private int b;
   private static final int j = -2;
   private static final int v = -1;

   private boolean L(int var1, int var2) {
      this.y(var1, var2);
      if (this.b != -2 && this.T + var2 <= this.B && this.W != -1) {
         int var3 = this.W;
         this.u[var3] = this.s;
         this.i[var3] = this.T + var2;
         this.W = this.R[var3];
         int var4 = this.y(this.b);
         if (this.u[var4] < this.s) {
            int var5 = this.R[var4];
            this.R[var4] = var3;
            var4 = var5;
         } else {
            this.N(this.b, var3);
         }

         int var7 = this.s + var1;

         while (this.R[var4] != -1 && this.u[this.R[var4]] <= var7) {
            int var6 = this.R[var4];
            this.R[var4] = this.W;
            this.W = var4;
            var4 = var6;
         }

         this.R[var3] = var4;
         if (this.u[var4] < var7) {
            this.u[var4] = var7;
         }

         return true;
      } else {
         this.b = -2;
         return false;
      }
   }

   private int y(int var1) {
      return var1 == -1 ? this.E : this.R[var1];
   }

   private int y(int var1, int var2, int var3) {
      int var4 = var1;
      int var5 = var2 + var3;
      int var6 = 0;
      int var7 = 0;
      int var8 = 0;

      while (this.u[var4] < var5) {
         int var9 = this.i[var4];
         int var10 = this.u[var4];
         int var11 = this.u[this.R[var4]];
         if (var9 > var6) {
            var7 += var8 * (var9 - var6);
            var6 = var9;
            var8 += var10 < var2 ? var11 - var2 : var11 - var10;
         } else {
            int var12 = var11 - var10;
            if (var12 + var8 > var3) {
               var12 = var3 - var8;
            }

            var7 += var12 * (var6 - var9);
            var8 += var12;
         }

         var4 = this.R[var4];
      }

      this.P = var7;
      return var6;
   }

   private void y(int var1, int var2) {
      int var3 = 1073741824;
      int var4 = 1073741824;
      int var5 = 0;
      int var6 = -2;
      var1 = var1 + this.Z - 1;
      var1 -= var1 % this.Z;
      if (var1 <= this.M && var2 <= this.B) {
         int var7 = this.E;

         for (int var8 = -1; this.u[var7] + var1 <= this.M; var7 = this.R[var7]) {
            int var9 = this.y(var7, this.u[var7], var1);
            int var10 = this.P;
            if (this.z == 0) {
               if (var9 < var4) {
                  var4 = var9;
                  var6 = var8;
               }
            } else if (var9 + var2 <= this.B && (var9 < var4 || var9 == var4 && var10 < var3)) {
               var4 = var9;
               var3 = var10;
               var6 = var8;
            }

            var8 = var7;
         }

         var5 = var6 == -2 ? 0 : this.u[this.y(var6)];
         if (this.z == 1) {
            int var18 = this.E;
            var7 = this.E;
            int var17 = -1;

            while (this.u[var18] < var1) {
               var18 = this.R[var18];
            }

            for (; var18 != -1; var18 = this.R[var18]) {
               int var19;
               for (var19 = this.u[var18] - var1; this.u[this.R[var7]] <= var19; var7 = this.R[var7]) {
                  var17 = var7;
               }

               int var11 = this.y(var7, var19, var1);
               int var12 = this.P;
               if (var11 + var2 <= this.B && var11 <= var4 && (var11 < var4 || var12 < var3 || var12 == var3 && var19 < var5)) {
                  var5 = var19;
                  var4 = var11;
                  var3 = var12;
                  var6 = var17;
               }
            }
         }

         this.b = var6;
         this.s = var5;
         this.T = var4;
      } else {
         this.b = -2;
         this.s = 0;
         this.T = 0;
      }
   }

   private static int y(int[] var0, class09957[] var1, int var2, int var3) {
      int var4 = var2 + (var3 - var2 >>> 1);
      if (N(var1, var0[var2], var0[var4]) > 0) {
         N(var0, var2, var4);
      }

      if (N(var1, var0[var2], var0[var3]) > 0) {
         N(var0, var2, var3);
      }

      if (N(var1, var0[var4], var0[var3]) > 0) {
         N(var0, var4, var3);
      }

      N(var0, var4, var3);
      int var5 = var0[var3];
      int var6 = var2 - 1;

      for (int var7 = var2; var7 < var3; var7++) {
         if (N(var1, var0[var7], var5) <= 0) {
            N(var0, ++var6, var7);
         }
      }

      N(var0, var6 + 1, var3);
      return var6 + 1;
   }

   private static int y(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      int var5 = var3 + (var4 - var3 >>> 1);
      if (N(var2, var1, var0[var3], var0[var5]) > 0) {
         N(var0, var3, var5);
      }

      if (N(var2, var1, var0[var3], var0[var4]) > 0) {
         N(var0, var3, var4);
      }

      if (N(var2, var1, var0[var5], var0[var4]) > 0) {
         N(var0, var5, var4);
      }

      N(var0, var5, var4);
      int var6 = var0[var4];
      int var7 = var3 - 1;

      for (int var8 = var3; var8 < var4; var8++) {
         if (N(var2, var1, var0[var8], var6) <= 0) {
            N(var0, ++var7, var8);
         }
      }

      N(var0, var7 + 1, var4);
      return var7 + 1;
   }

   public void N(int var1) {
      this.z = var1;
   }

   private static int N(int[] var0, int[] var1, int var2, int var3) {
      int var4 = var0[var3] - var0[var2];
      if (var4 != 0) {
         return var4;
      } else {
         int var5 = var1[var3] - var1[var2];
         return var5 != 0 ? var5 : var2 - var3;
      }
   }

   private static void N(int[] var0, int var1, int var2) {
      int var3 = var0[var1];
      var0[var1] = var0[var2];
      var0[var2] = var3;
   }

   private static void N(int[] var0, class09957[] var1, int var2, int var3) {
      while (var2 < var3) {
         int var4 = y(var0, var1, var2, var3);
         if (var4 - var2 < var3 - var4) {
            N(var0, var1, var2, var4 - 1);
            var2 = var4 + 1;
         } else {
            N(var0, var1, var4 + 1, var3);
            var3 = var4 - 1;
         }
      }
   }

   public void N(int var1, int var2, int var3) {
      this.M = var1;
      this.B = var2;
      this.U = var3;
      this.z = 0;
      int var4 = var3 + 2;
      if (this.u == null || this.u.length < var4) {
         this.u = new int[var4];
         this.i = new int[var4];
         this.R = new int[var4];
      }

      for (int var5 = 0; var5 < var3 - 1; var5++) {
         this.R[var5] = var5 + 1;
      }

      this.R[var3 - 1] = -1;
      this.W = 0;
      int var6 = var3 + 1;
      this.u[var3] = 0;
      this.i[var3] = 0;
      this.R[var3] = var6;
      this.u[var6] = var1;
      this.i[var6] = 1073741824;
      this.R[var6] = -1;
      this.E = var3;
      this.N(false);
   }

   private static int N(class09957[] var0, int var1, int var2) {
      int var3 = var0[var2].L - var0[var1].L;
      if (var3 != 0) {
         return var3;
      } else {
         int var4 = var0[var2].y - var0[var1].y;
         return var4 != 0 ? var4 : var0[var1].N - var0[var2].N;
      }
   }

   private void N(int var1, int var2) {
      if (var1 == -1) {
         this.E = var2;
      } else {
         this.R[var1] = var2;
      }
   }

   public boolean N(class09957[] var1, int var2) {
      if (this.m == null || this.m.length < var2) {
         this.m = new int[var2];
      }

      int var3 = 0;

      while (var3 < var2) {
         this.m[var3] = var3++;
      }

      N(this.m, var1, 0, var2 - 1);
      boolean var7 = true;

      for (int var4 = 0; var4 < var2; var4++) {
         int var5 = this.m[var4];
         class09957 var6 = var1[var5];
         if (var6.y == 0 || var6.L == 0) {
            var6.u = 0;
            var6.i = 0;
            var6.R = true;
         } else if (this.L(var6.y, var6.L)) {
            var6.u = this.s;
            var6.i = this.T;
            var6.R = true;
         } else {
            var6.u = Integer.MAX_VALUE;
            var6.i = Integer.MAX_VALUE;
            var6.R = false;
            var7 = false;
         }
      }

      return var7;
   }

   public boolean N(int[] var1, int[] var2, int[] var3, int[] var4, int[] var5, boolean[] var6, int var7) {
      if (this.m == null || this.m.length < var7) {
         this.m = new int[var7];
      }

      int var8 = 0;

      while (var8 < var7) {
         this.m[var8] = var8++;
      }

      N(this.m, var2, var3, 0, var7 - 1);
      boolean var13 = true;

      for (int var9 = 0; var9 < var7; var9++) {
         int var10 = this.m[var9];
         int var11 = var2[var10];
         int var12 = var3[var10];
         if (var11 == 0 || var12 == 0) {
            var4[var10] = 0;
            var5[var10] = 0;
            var6[var10] = true;
         } else if (this.L(var11, var12)) {
            var4[var10] = this.s;
            var5[var10] = this.T;
            var6[var10] = true;
         } else {
            var4[var10] = Integer.MAX_VALUE;
            var5[var10] = Integer.MAX_VALUE;
            var6[var10] = false;
            var13 = false;
         }
      }

      return var13;
   }

   public void N(boolean var1) {
      this.Z = var1 ? 1 : (this.M + this.U - 1) / this.U;
   }

   private static void N(int[] var0, int[] var1, int[] var2, int var3, int var4) {
      while (var3 < var4) {
         int var5 = y(var0, var1, var2, var3, var4);
         if (var5 - var3 < var4 - var5) {
            N(var0, var1, var2, var3, var5 - 1);
            var3 = var5 + 1;
         } else {
            N(var0, var1, var2, var5 + 1, var4);
            var4 = var5 - 1;
         }
      }
   }
}

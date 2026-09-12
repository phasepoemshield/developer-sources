package Nursultan;

import java.nio.ByteBuffer;
import java.util.Arrays;
import org.lwjgl.system.MemoryUtil;

final class class09726 {
   private final int N;
   private final int y;
   private final int L;
   private final ByteBuffer u;
   private int[] i;
   private int[] R;
   private int[] M;
   private int B;

   int L() {
      return this.L;
   }

   class09726(int var1, int var2, int var3) {
      this.N = var1;
      this.y = var2;
      this.L = var3;
      this.u = MemoryUtil.memCalloc(var1 * var2 * var3);
      this.i = new int[16];
      this.R = new int[16];
      this.M = new int[16];
      this.i[0] = 0;
      this.R[0] = 0;
      this.M[0] = var1;
      this.B = 1;
   }

   void i() {
      MemoryUtil.memFree(this.u);
   }

   ByteBuffer u() {
      return this.u;
   }

   private void y(int var1) {
      if (var1 > this.i.length) {
         int var2 = Math.max(var1, this.i.length * 2);
         this.i = Arrays.copyOf(this.i, var2);
         this.R = Arrays.copyOf(this.R, var2);
         this.M = Arrays.copyOf(this.M, var2);
      }
   }

   int y() {
      return this.y;
   }

   private void N(int var1) {
      int var2 = this.B - var1 - 1;
      if (var2 > 0) {
         System.arraycopy(this.i, var1 + 1, this.i, var1, var2);
         System.arraycopy(this.R, var1 + 1, this.R, var1, var2);
         System.arraycopy(this.M, var1 + 1, this.M, var1, var2);
      }

      this.B--;
   }

   private void N(int var1, int var2, int var3, int var4) {
      this.y(this.B + 1);
      int var5 = this.B - var1;
      if (var5 > 0) {
         System.arraycopy(this.i, var1, this.i, var1 + 1, var5);
         System.arraycopy(this.R, var1, this.R, var1 + 1, var5);
         System.arraycopy(this.M, var1, this.M, var1 + 1, var5);
      }

      this.i[var1] = var2;
      this.R[var1] = var3;
      this.M[var1] = var4;
      this.B++;
   }

   void N(byte[] var1, int var2, int var3, int var4, int var5) {
      int var6 = var2 * this.L;

      for (int var7 = 0; var7 < var3; var7++) {
         int var8 = var7 * var6;
         int var9 = ((var5 + var7) * this.N + var4) * this.L;
         this.u.put(var9, var1, var8, var6);
      }
   }

   void N(class09726 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      long var8 = MemoryUtil.memAddress(var1.u);
      long var10 = MemoryUtil.memAddress(this.u);
      int var12 = var4 * this.L;

      for (int var13 = 0; var13 < var5; var13++) {
         long var14 = var8 + (long)((var3 + var13) * var1.N + var2) * (long)this.L;
         long var16 = var10 + (long)((var7 + var13) * this.N + var6) * (long)this.L;
         MemoryUtil.memCopy(var14, var16, (long)var12);
      }
   }

   void N(int var1, int var2, int var3, int var4, byte[] var5) {
      int var6 = var3 * this.L;

      for (int var7 = 0; var7 < var4; var7++) {
         int var8 = ((var2 + var7) * this.N + var1) * this.L;
         int var9 = var7 * var6;
         this.u.get(var8, var5, var9, var6);
      }
   }

   boolean N(int var1, int var2, int var3, int[] var4) {
      int var5 = var1 + var3;
      int var6 = var2 + var3;
      if (var5 <= this.N && var6 <= this.y) {
         int var7 = Integer.MAX_VALUE;
         int var8 = -1;
         int var9 = -1;

         for (int var10 = 0; var10 < this.B; var10++) {
            int var11 = this.N(var10, var5);
            if (var11 >= 0 && var11 + var6 <= this.y && (var11 < var7 || var11 == var7 && this.i[var10] < var8)) {
               var7 = var11;
               var8 = this.i[var10];
               var9 = var10;
            }
         }

         if (var9 < 0) {
            return false;
         } else {
            this.N(var9, var8, var7, var5, var6);
            var4[0] = var8;
            var4[1] = var7;
            return true;
         }
      } else {
         return false;
      }
   }

   int N() {
      return this.N;
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      this.N(var1, var2, var3 + var5, var4);
      int var6 = var2 + var4;
      int var7 = var1 + 1;

      while (var7 < this.B && this.i[var7] < var6) {
         if (this.i[var7] + this.M[var7] > var6) {
            int var9 = var6 - this.i[var7];
            this.i[var7] = this.i[var7] + var9;
            this.M[var7] = this.M[var7] - var9;
            break;
         }

         this.N(var7);
      }

      this.R();
   }

   private int N(int var1, int var2) {
      if (this.i[var1] + var2 > this.N) {
         return -1;
      } else {
         int var3 = var2;
         int var4 = 0;

         for (int var5 = var1; var3 > 0; var5++) {
            if (var5 >= this.B) {
               return -1;
            }

            if (this.R[var5] > var4) {
               var4 = this.R[var5];
            }

            var3 -= this.M[var5];
         }

         return var4;
      }
   }

   private void R() {
      int var1 = 1;

      while (var1 < this.B) {
         if (this.R[var1] == this.R[var1 - 1]) {
            this.M[var1 - 1] = this.M[var1 - 1] + this.M[var1];
            this.N(var1);
         } else {
            var1++;
         }
      }
   }
}

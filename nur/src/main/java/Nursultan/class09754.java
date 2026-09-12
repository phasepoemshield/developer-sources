package Nursultan;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;

final class class09754 {
   final ByteBuffer N;
   int y = 1000;

   int L(int var1) {
      return this.N.getShort(var1);
   }

   class09714 M(int var1) {
      int var2 = this.y(var1);
      ArrayList var3 = new ArrayList();
      if (var2 == 1) {
         int var4 = this.y(var1 + 2);
         int var5 = this.y(var1 + 4);

         for (int var6 = 0; var6 < var5; var6++) {
            int var7 = this.y(var1 + 6 + var6 * 2);
            if (var7 != 0) {
               var3.add(new int[]{var4 + var6, var4 + var6, var7});
            }
         }
      } else if (var2 == 2) {
         int var8 = this.y(var1 + 2);

         for (int var10 = 0; var10 < var8; var10++) {
            int var12 = var1 + 4 + var10 * 6;
            var3.add(new int[]{this.y(var12), this.y(var12 + 2), this.y(var12 + 4)});
         }
      }

      var3.sort((var0, var1x) -> Integer.compare(var0[0], var1x[0]));
      int[] var9 = new int[var3.size()];
      int[] var11 = new int[var3.size()];
      int[] var13 = new int[var3.size()];

      for (int var14 = 0; var14 < var3.size(); var14++) {
         var9[var14] = ((int[])var3.get(var14))[0];
         var11[var14] = ((int[])var3.get(var14))[1];
         var13[var14] = ((int[])var3.get(var14))[2];
      }

      return new class09714(var9, var11, var13);
   }

   class09754(byte[] var1) {
      this.N = ByteBuffer.wrap(var1);
   }

   static int B(int var0) {
      return Integer.bitCount(var0 & 65535) * 2;
   }

   static int Z(int var0) {
      if ((var0 & 4) == 0) {
         return -1;
      } else {
         byte var1 = 0;
         if ((var0 & 1) != 0) {
            var1 += 2;
         }

         if ((var0 & 2) != 0) {
            var1 += 2;
         }

         return var1;
      }
   }

   String i(int var1) {
      return "" + (char)this.N(var1) + (char)this.N(var1 + 1) + (char)this.N(var1 + 2) + (char)this.N(var1 + 3);
   }

   long u(int var1) {
      return (long)this.N.getInt(var1) & 4294967295L;
   }

   class09729 y(int var1, int var2, int var3, int var4) {
      class09732 var5 = new class09732(this.R(var1 + this.y(var1 + 2)));
      class09714 var6 = this.M(var1 + this.y(var1 + 8));
      class09714 var7 = this.M(var1 + this.y(var1 + 10));
      int var8 = this.y(var1 + 12);
      int var9 = this.y(var1 + 14);
      int var10 = B(var2);
      int var11 = B(var3);
      int var12 = var10 + var11;
      int var13 = var1 + 16;
      int[][] var14 = new int[var8][var9];

      for (int var15 = 0; var15 < var8; var15++) {
         for (int var16 = 0; var16 < var9; var16++) {
            int var17 = var13 + (var15 * var9 + var16) * var12;
            var14[var15][var16] = var4 >= 0 ? this.L(var17 + var4) : 0;
         }
      }

      return new class09725(var5, var6, var7, var14);
   }

   int y(int var1) {
      return this.N.getShort(var1) & 65535;
   }

   class09730 N() {
      int var1 = this.y(4);
      int var2 = -1;
      int var3 = -1;

      for (int var4 = 0; var4 < var1; var4++) {
         int var5 = 12 + var4 * 16;
         String var6 = this.i(var5);
         if (var6.equals("GPOS")) {
            var2 = (int)this.u(var5 + 8);
         } else if (var6.equals("head")) {
            var3 = (int)this.u(var5 + 8);
         }
      }

      if (var3 >= 0) {
         this.y = this.y(var3 + 18);
      }

      if (var2 < 0) {
         return new class09730(this.y, List.of());
      } else {
         int var18 = var2 + this.y(var2 + 6);
         int var19 = var2 + this.y(var2 + 8);
         LinkedHashSet var20 = new LinkedHashSet();
         int var7 = this.y(var18);

         for (int var8 = 0; var8 < var7; var8++) {
            int var9 = var18 + 2 + var8 * 6;
            if (this.i(var9).equals("kern")) {
               int var10 = var18 + this.y(var9 + 4);
               int var11 = this.y(var10 + 2);

               for (int var12 = 0; var12 < var11; var12++) {
                  var20.add(this.y(var10 + 4 + var12 * 2));
               }
            }
         }

         if (var20.isEmpty()) {
            return new class09730(this.y, List.of());
         } else {
            int var21 = this.y(var19);
            ArrayList var22 = new ArrayList();

            for (int var24 : var20) {
               if (var24 < var21) {
                  int var25 = var19 + this.y(var19 + 2 + var24 * 2);
                  int var13 = this.y(var25);
                  int var14 = this.y(var25 + 4);
                  ArrayList var15 = new ArrayList();

                  for (int var16 = 0; var16 < var14; var16++) {
                     int var17 = var25 + this.y(var25 + 6 + var16 * 2);
                     if (var13 == 2) {
                        this.N(var15, var17);
                     } else if (var13 == 9 && this.y(var17) == 1 && this.y(var17 + 2) == 2) {
                        this.N(var15, var17 + (int)this.u(var17 + 4));
                     }
                  }

                  if (!var15.isEmpty()) {
                     var22.add(var15);
                  }
               }
            }

            return new class09730(this.y, var22);
         }
      }
   }

   int N(int var1) {
      return this.N.get(var1) & 0xFF;
   }

   class09729 N(int var1, int var2, int var3, int var4) {
      int[] var5 = this.R(var1 + this.y(var1 + 2));
      int var6 = B(var2);
      int var7 = B(var3);
      int var8 = this.y(var1 + 8);
      HashMap var9 = new HashMap();

      for (int var10 = 0; var10 < var8 && var10 < var5.length; var10++) {
         int var11 = var1 + this.y(var1 + 10 + var10 * 2);
         int var12 = this.y(var11);
         int var13 = var11 + 2;

         for (int var14 = 0; var14 < var12; var14++) {
            int var15 = this.y(var13);
            int var16 = var4 >= 0 ? this.L(var13 + 2 + var4) : 0;
            if (var16 != 0) {
               var9.put((long)var5[var10] << 32 | (long)var15 & 4294967295L, var16);
            }

            var13 += 2 + var6 + var7;
         }
      }

      return new class09748(var9);
   }

   void N(List<class09729> var1, int var2) {
      int var3 = this.y(var2);
      int var4 = this.y(var2 + 4);
      int var5 = this.y(var2 + 6);
      int var6 = Z(var4);
      if (var3 == 1) {
         var1.add(this.N(var2, var4, var5, var6));
      } else if (var3 == 2) {
         var1.add(this.y(var2, var4, var5, var6));
      }
   }

   int[] R(int var1) {
      if (this.y(var1) == 1) {
         int var8 = this.y(var1 + 2);
         int[] var9 = new int[var8];

         for (int var11 = 0; var11 < var8; var11++) {
            var9[var11] = this.y(var1 + 4 + var11 * 2);
         }

         return var9;
      } else {
         int var3 = this.y(var1 + 2);
         ArrayList var4 = new ArrayList();

         for (int var5 = 0; var5 < var3; var5++) {
            int var6 = var1 + 4 + var5 * 6;

            for (int var7 = this.y(var6); var7 <= this.y(var6 + 2); var7++) {
               var4.add(var7);
            }
         }

         int[] var10 = new int[var4.size()];

         for (int var12 = 0; var12 < var10.length; var12++) {
            var10[var12] = (Integer)var4.get(var12);
         }

         Arrays.sort(var10);
         return var10;
      }
   }
}

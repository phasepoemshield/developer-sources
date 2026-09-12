package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07109;

public class class11895 {
   private static double[] Z;
   private static double[] m;
   private static double[] P;
   private static String[] s;
   private static double[] G;
   private static double[] Y;
   public static Object N_0 = class06202.Nq();
   public static Object N_1;

   private static void L() {
   }

   private class11895() {
      throw new UnsupportedOperationException(s[0]);
   }

   static {
      i();
      L();
      N();
      R();
      y();
      u();
   }

   private static void i() {
   }

   private static void u() {
      N_1 = P[5];
   }

   private static void y() {
      s = new String[1];
      s[0] = "This is a utility class and cannot be instantiated";
   }

   public static class06889 N(class07049 var0, boolean var1, double var2) {
      return N(var0, class11505.N(), var1, var2, var0x -> var0x.B(P[4]));
   }

   private static double N(class11499 var0, class06889 var1) {
      class07109 var2 = class11505.N(var0, var1).L();
      return (double)(var2.z * var2.z + var2.U * var2.U);
   }

   private static class06889 N(class06889 var0, class06889 var1, class06889 var2, double var3) {
      class06889 var5 = var1.u(var0);
      double var6 = var5.y(var5);
      if (var6 < m[5]) {
         return var1;
      } else {
         class06889 var8 = var0.u(var2);
         double var9 = Y[0] * var8.y(var5);
         double var11 = var8.y(var8) - var3 * var3;
         double var13 = var9 * var9 - Y[1] * var6 * var11;
         if (var13 < Y[2]) {
            return var1;
         } else {
            double var15 = (-var9 - Math.sqrt(var13)) / (Y[3] * var6);
            return var0.i(var5.L(class04995.N(var15, Y[4], Y[5])));
         }
      }
   }

   private static void N(List<class06889> var0, class07049 var1, class06889 var2, double var3) {
      class06889 var5 = ((class04453)((class06202)N_0).T_4).method_33571();
      class06889 var6 = class11505.N(var2).U().L(var3).i(var5);
      if (!class11892.N(var5, var6, var1)) {
         var0.add(var2);
      }
   }

   private static void N() {
      G = new double[4];
      G[0] = Double.longBitsToDouble(4576918229304087675L);
      G[1] = Double.longBitsToDouble(4587366580439587226L);
      G[2] = Double.longBitsToDouble(4587366580439587226L);
      G[3] = Double.longBitsToDouble(4547007122018943789L);
      m = new double[6];
      m[0] = Double.longBitsToDouble(4517329193108106637L);
      m[1] = Double.longBitsToDouble(0L);
      m[2] = Double.longBitsToDouble(9218868437227405311L);
      m[3] = Double.longBitsToDouble(4587366580439587226L);
      m[4] = Double.longBitsToDouble(0L);
      m[5] = Double.longBitsToDouble(4472406533629990549L);
      Y = new double[8];
      Y[0] = Double.longBitsToDouble(4611686018427387904L);
      Y[1] = Double.longBitsToDouble(4616189618054758400L);
      Y[2] = Double.longBitsToDouble(0L);
      Y[3] = Double.longBitsToDouble(4611686018427387904L);
      Y[4] = Double.longBitsToDouble(0L);
      Y[5] = Double.longBitsToDouble(4607182418800017408L);
      Y[6] = Double.longBitsToDouble(4587366580439587226L);
      Y[7] = Double.longBitsToDouble(4611686018427387904L);
      Z = new double[3];
      Z[0] = Double.longBitsToDouble(4603741974828149072L);
      Z[1] = Double.longBitsToDouble(0L);
      Z[2] = Double.longBitsToDouble(4607182418800017408L);
      P = new double[6];
      P[0] = Double.longBitsToDouble(4602678819172646912L);
      P[1] = Double.longBitsToDouble(4576918229304087675L);
      P[2] = Double.longBitsToDouble(4576918229304087675L);
      P[3] = Double.longBitsToDouble(4576918229304087675L);
      P[4] = Double.longBitsToDouble(4576918229304087675L);
      P[5] = Double.longBitsToDouble(4587366580439587226L);
   }

   private static void N(List<class06889> var0, class06889 var1, class00734 var2, int var3, double var4, double var6) {
      double[] var8;
      double[] var9;
      if (var3 == 0) {
         var8 = N(var2.y, var2.i);
         var9 = N(var2.L, var2.R);
      } else if (var3 == 1) {
         var8 = N(var2.N, var2.u);
         var9 = N(var2.L, var2.R);
      } else {
         var8 = N(var2.N, var2.u);
         var9 = N(var2.y, var2.i);
      }

      byte var10 = 4;

      for (int var11 = 0; var11 < var10; var11++) {
         double var12 = var8[0] + (var8[1] - var8[0]) * (double)var11 / (double)(var10 - 1);

         for (int var14 = 0; var14 < var10; var14++) {
            double var15 = var9[0] + (var9[1] - var9[0]) * (double)var14 / (double)(var10 - 1);
            class06889 var18 = N(N(var3, var4, var12, var15), var1, var3, var4, var8, var9, var6);
            N(var0, var1, var18);
         }
      }
   }

   public static class06889 N(class07049 var0, class11499 var1, boolean var2, double var3, Function<class00734, class00734> var5) {
      ArrayList var6 = new ArrayList();
      class00734 var7 = (class00734)var5.apply(var0.method_5829());
      byte var8 = 10;
      byte var9 = 10;
      byte var10 = 10;
      double var11 = var7.L() / (double)var8;
      double var13 = var7.y() / (double)var9;
      double var15 = var7.u() / (double)var10;
      class06889 var17 = ((class04453)((class06202)N_0).T_4).method_33571();
      double var18 = var17.L();
      double var20 = var17.N();
      double var22 = var17.y();
      boolean var24 = var20 >= var7.N && var20 < var7.u && var18 >= var7.L && var18 < var7.R;
      boolean var25 = var24 || var18 > var7.R;
      boolean var26 = var24 || var18 < var7.L;
      boolean var27 = var24 || var20 > var7.u;
      boolean var28 = var24 || var20 < var7.N;
      boolean var29 = var24 || var22 > var7.i;
      boolean var30 = var24 || var22 < var7.y;

      for (int var31 = 0; var31 <= var8; var31++) {
         double var32 = var7.y + (double)var31 * var11;
         N(var6, var0, new class06889(var0.method_23317(), var32, var0.method_23321()), var3);

         for (int var34 = 0; var34 <= var9; var34++) {
            double var35 = var7.N + (double)var34 * var13;
            if (var25) {
               class06889 var37 = new class06889(var35, var32, var7.R);
               N(var6, var0, var37, var3);
            }

            if (var26) {
               class06889 var43 = new class06889(var35, var32, var7.L);
               N(var6, var0, var43, var3);
            }
         }

         for (int var40 = 0; var40 <= var10; var40++) {
            double var41 = var7.L + (double)var40 * var15;
            if (var27) {
               class06889 var44 = new class06889(var7.u, var32, var41);
               N(var6, var0, var44, var3);
            }

            if (var28) {
               class06889 var45 = new class06889(var7.N, var32, var41);
               N(var6, var0, var45, var3);
            }
         }
      }

      for (int var38 = 0; var38 <= var10; var38++) {
         for (int var39 = 0; var39 <= var9; var39++) {
            double var33 = var7.N + (double)var39 * var13;
            double var42 = var7.L + (double)var38 * var15;
            if (var30) {
               N(var6, var0, new class06889(var33, var7.y, var42), var3);
            }

            if (var29) {
               N(var6, var0, new class06889(var33, var7.i, var42), var3);
            }
         }
      }

      return N(var6, var1, var0.method_33571(), var2);
   }

   public static class06889 N(class07049 var0, double var1) {
      return N(var0, class11505.N(), var1, var0x -> var0x.B(P[2]));
   }

   private static class06889 N(class11499 var0, class06889 var1, class06889 var2) {
      class06889 var3 = var2.u(var1);
      double var4 = Z[0];
      double var6 = Z[1];
      double var8 = Z[2];
      double var10 = var8 - var4 * (var8 - var6);
      double var12 = var6 + var4 * (var8 - var6);
      double var14 = N(var0, var1.i(var3.L(var10)));
      double var16 = N(var0, var1.i(var3.L(var12)));

      for (int var18 = 0; var18 < 8; var18++) {
         if (var14 < var16) {
            var8 = var12;
            var12 = var10;
            var16 = var14;
            var10 = var8 - var4 * (var8 - var6);
            var14 = N(var0, var1.i(var3.L(var10)));
         } else {
            var6 = var10;
            var10 = var12;
            var14 = var16;
            var12 = var6 + var4 * (var8 - var6);
            var16 = N(var0, var1.i(var3.L(var12)));
         }
      }

      class06889 var23 = var1.i(var3.L((var6 + var8) * P[0]));
      double var19 = N(var0, var23);
      double var21 = N(var0, var1);
      if (var21 < var19) {
         var19 = var21;
         var23 = var1;
      }

      if (N(var0, var2) < var19) {
         var23 = var2;
      }

      return var23;
   }

   public static class06889 N(class00734 var0) {
      class06889 var1 = ((class04453)((class06202)N_0).T_4).method_33571();
      return new class06889(class04995.N(var1.M, var0.N, var0.u), class04995.N(var1.B, var0.y, var0.i), class04995.N(var1.Z, var0.L, var0.R));
   }

   private static double[] N(double var0, double var2) {
      double var4 = Math.min(Y[6], (var2 - var0) / Y[7]);
      return new double[]{var0 + var4, var2 - var4};
   }

   public static class06889 N(class07049 var0, class11499 var1, double var2, Function<class00734, class00734> var4) {
      class00734 var5 = (class00734)var4.apply(var0.method_5829());
      class06889 var6 = ((class04453)((class06202)N_0).T_4).method_33571();
      double var7 = var6.N();
      double var9 = var6.y();
      double var11 = var6.L();
      boolean var13 = var7 >= var5.N && var7 < var5.u && var11 >= var5.L && var11 < var5.R;
      boolean var14 = var13 || var7 > var5.u;
      boolean var15 = var13 || var7 < var5.N;
      boolean var16 = var13 || var9 > var5.i;
      boolean var17 = var13 || var9 < var5.y;
      boolean var18 = var13 || var11 > var5.R;
      boolean var19 = var13 || var11 < var5.L;
      ArrayList var20 = new ArrayList();
      if (var14) {
         N(var20, var6, var1, var5, 0, var5.u, var2);
      }

      if (var15) {
         N(var20, var6, var1, var5, 0, var5.N, var2);
      }

      if (var16) {
         N(var20, var6, var1, var5, 1, var5.i, var2);
      }

      if (var17) {
         N(var20, var6, var1, var5, 1, var5.y, var2);
      }

      if (var18) {
         N(var20, var6, var1, var5, 2, var5.R, var2);
      }

      if (var19) {
         N(var20, var6, var1, var5, 2, var5.L, var2);
      }

      if (var20.isEmpty()) {
         if (var14) {
            N(var20, var6, var5, 0, var5.u, var2);
         }

         if (var15) {
            N(var20, var6, var5, 0, var5.N, var2);
         }

         if (var16) {
            N(var20, var6, var5, 1, var5.i, var2);
         }

         if (var17) {
            N(var20, var6, var5, 1, var5.y, var2);
         }

         if (var18) {
            N(var20, var6, var5, 2, var5.R, var2);
         }

         if (var19) {
            N(var20, var6, var5, 2, var5.L, var2);
         }
      }

      double var21 = (var2 - G[1]) * (var2 - G[2]) + G[3];
      return var20.stream()
         .min(Comparator.<class06889>comparingInt(var3 -> var3.M(var6) <= var21 ? 0 : 1).thenComparingDouble(var1x -> N(var1, var1x)))
         .orElseGet(() -> N(var5));
   }

   private static void N(List<class06889> var0, class06889 var1, class11499 var2, class00734 var3, int var4, double var5, double var7) {
      class06889 var9 = N(var1, var2, var3, var4, var5, var7);
      N(var0, var1, var9);
   }

   private static class06889 N(int var0, double var1, double var3, double var5) {
      if (var0 == 0) {
         return new class06889(var1, var3, var5);
      } else {
         return var0 == 1 ? new class06889(var3, var1, var5) : new class06889(var3, var5, var1);
      }
   }

   public static class06889 N(class07049 var0, class11499 var1, boolean var2, double var3) {
      return N(var0, var1, var2, var3, var0x -> var0x.B(P[3]));
   }

   private static class06889 N(class06889 var0, class06889 var1, int var2, double var3, double[] var5, double[] var6, double var7) {
      double var9 = var7 - m[3];
      double var11 = var2 == 0 ? var1.M : (var2 == 1 ? var1.B : var1.Z);
      double var13 = var3 - var11;
      double var15 = var2 == 0 ? var1.B : var1.M;
      double var17 = var2 == 2 ? var1.B : var1.Z;
      class06889 var19 = N(var2, var3, var15, var17);
      class06889 var20 = N(var2, var3, class04995.N(var15, var5[0], var5[1]), class04995.N(var17, var6[0], var6[1]));
      double var21 = var9 * var9 - var13 * var13;
      if (var21 <= m[4]) {
         return var20;
      } else if (var0.M(var19) <= var21) {
         return var0;
      } else {
         return var20.M(var19) > var21 ? var20 : N(var0, var20, var19, Math.sqrt(var21));
      }
   }

   private static class06889 N(class06889 var0, class11499 var1, class00734 var2, int var3, double var4, double var6) {
      double[] var8;
      double[] var9;
      if (var3 == 0) {
         var8 = N(var2.y, var2.i);
         var9 = N(var2.L, var2.R);
      } else if (var3 == 1) {
         var8 = N(var2.N, var2.u);
         var9 = N(var2.L, var2.R);
      } else {
         var8 = N(var2.N, var2.u);
         var9 = N(var2.y, var2.i);
      }

      class06889 var10 = var1.U();
      class06889 var11 = null;
      double var12 = var3 == 0 ? var10.M : (var3 == 1 ? var10.B : var10.Z);
      if (Math.abs(var12) > m[0]) {
         double var14 = var3 == 0 ? var0.M : (var3 == 1 ? var0.B : var0.Z);
         double var16 = (var4 - var14) / var12;
         if (var16 >= m[1]) {
            class06889 var18 = var0.i(var10.L(var16));
            double var19 = var3 == 0 ? var18.B : var18.M;
            double var21 = var3 == 2 ? var18.B : var18.Z;
            if (var19 >= var8[0] && var19 <= var8[1] && var21 >= var9[0] && var21 <= var9[1]) {
               var11 = var18;
            }
         }
      }

      if (var11 == null) {
         class06889 var28 = N(var3, var4, var8[0], var9[0]);
         class06889 var15 = N(var3, var4, var8[1], var9[0]);
         class06889 var29 = N(var3, var4, var8[1], var9[1]);
         class06889 var17 = N(var3, var4, var8[0], var9[1]);
         class06889[][] var30 = new class06889[][]{{var28, var15}, {var15, var29}, {var29, var17}, {var17, var28}};
         var11 = var28;
         double var31 = m[2];

         for (class06889[] var24 : var30) {
            class06889 var25 = N(var1, var24[0], var24[1]);
            double var26 = N(var1, var25);
            if (var26 < var31) {
               var31 = var26;
               var11 = var25;
            }
         }
      }

      return N(var11, var0, var3, var4, var8, var9, var6);
   }

   private static class06889 N(List<class06889> var0, class11499 var1, class06889 var2, boolean var3) {
      return var0.stream()
         .filter(var1x -> !var3 || class11892.N(var1x, class05849.field_17559, class05835.field_1348))
         .min(Comparator.<class06889>comparingDouble(var1x -> {
            double var2x = var1x.M - var2.M;
            double var4 = var1x.Z - var2.Z;
            return var2x * var2x + var4 * var4;
         }).thenComparing(var1x -> {
            class07109 var2x = class11505.N(var1, var1x).L();
            return Math.hypot((double)var2x.z, (double)var2x.U);
         }))
         .orElse(var2);
   }

   public static class06889 N(class07049 var0, class11499 var1, double var2) {
      return N(var0, var1, var2, var0x -> var0x.B(P[1]));
   }

   private static void N(List<class06889> var0, class06889 var1, class06889 var2) {
      if (class11892.N(var1, var2, class05849.field_17559, class05835.field_1348)) {
         var0.add(var2);
      }
   }

   public static class06889 N(class07049 var0) {
      return N(var0.method_5829().B(G[0]));
   }

   private static void R() {
   }
}

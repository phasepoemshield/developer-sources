package Nursultan;

import minecraft.class00734;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11064 {
   private static double[] y;
   private static double[] L;
   public static Object N_0;
   public static Object N_1;

   public static class00734 L(class07049 var0) {
      return var0.method_5829();
   }

   private class11064() {
   }

   static {
      i();
      y();
   }

   private static void i() {
      L = new double[8];
      L[0] = Double.longBitsToDouble(4585925428558828667L);
      L[1] = Double.longBitsToDouble(0L);
      L[2] = Double.longBitsToDouble(4593311331947716280L);
      L[3] = Double.longBitsToDouble(4585925428558828667L);
      L[4] = Double.longBitsToDouble(0L);
      L[5] = Double.longBitsToDouble(4593311331947716280L);
      L[6] = Double.longBitsToDouble(4581421828931458171L);
      L[7] = Double.longBitsToDouble(0L);
      y = new double[6];
      y[0] = Double.longBitsToDouble(4585925428558828667L);
      y[1] = Double.longBitsToDouble(4611686018427387904L);
      y[2] = Double.longBitsToDouble(4611686018427387904L);
      y[3] = Double.longBitsToDouble(4611686018427387904L);
      y[4] = Double.longBitsToDouble(4585925428558828667L);
      y[5] = Double.longBitsToDouble(4581421828931458171L);
   }

   public static class00734 u(class07049 var0) {
      class00734 var1 = L(var0);
      double var2 = Math.min(L[0], Math.max(L[1], (var1.u - var1.N) * L[2]));
      double var4 = Math.min(L[3], Math.max(L[4], (var1.R - var1.L) * L[5]));
      double var6 = Math.min(L[6], Math.max(L[7], (var1.i - var1.y) * y[0]));
      return !(var1.u - var1.N <= var2 * y[1]) && !(var1.i - var1.y <= var6 * y[2]) && !(var1.R - var1.L <= var4 * y[3])
         ? new class00734(var1.N + var2, var1.y + var6, var1.L + var4, var1.u - var2, var1.i - var6, var1.R - var4)
         : var1;
   }

   private static void y() {
      N_0 = y[4];
      N_1 = y[5];
   }

   public static class06889 y(class07049 var0) {
      return L(var0).R();
   }

   public static class06889 y(class07049 var0, class06889 var1) {
      class00734 var2 = L(var0);
      return new class06889(class04995.N(var1.M, var2.N, var2.u), class04995.N(var1.B, var2.y, var2.i), class04995.N(var1.Z, var2.L, var2.R));
   }

   public static class06889 N(class07049 var0, class06889 var1) {
      class00734 var2 = L(var0);
      return new class06889(class04995.N(var1.M, var2.N, var2.u), class04995.N(var1.B, var2.y, var2.i), class04995.N(var1.Z, var2.L, var2.R));
   }

   public static class06889 N(class07049 var0) {
      return N(var0, ((class04453)((class06202)class11087.N_0).T_4).method_33571());
   }
}

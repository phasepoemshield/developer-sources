package Nursultan;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;

public class class09531 implements class01830, class03894 {
   public final class03877 N;
   public final double[] y;

   public class09531(class01837 var1, class03877 var2) {
      this.L = var1;
      this.N = var2;
      this.y = new double[var1.Z * var1.Z * var1.z];
      var1.M.add(this);
   }

   public class03909 i() {
      return class03909.field_36566;
   }

   public class03877 u() {
      return this.N;
   }

   public double N(class03875 var1) {
      if (var1 != this.L) {
         return this.N.N(var1);
      } else if (!this.L.U) {
         throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
      } else {
         int var2 = this.L.m;
         int var3 = this.L.P;
         int var4 = this.L.s;
         return var2 >= 0 && var3 >= 0 && var4 >= 0 && var2 < this.L.Z && var3 < this.L.z && var4 < this.L.Z
            ? this.y[((this.L.z - 1 - var3) * this.L.Z + var2) * this.L.Z + var4]
            : this.N.N(var1);
      }
   }

   public void N(double[] var1, class03912 var2) {
      var2.N(var1, this);
   }
}

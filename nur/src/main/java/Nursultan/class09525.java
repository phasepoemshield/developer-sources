package Nursultan;

import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03912;

public class class09525 implements class03912 {
   public class03875 L(int var1) {
      this.N.W = (var1 + this.N.L) * this.N.z;
      this.N.T++;
      this.N.P = 0;
      this.N.j = var1;
      return this.N;
   }

   public class09525(class01837 var1) {
      this.N = var1;
   }

   public void N(double[] var1, class03877 var2) {
      for (int var3 = 0; var3 < this.N.y + 1; var3++) {
         this.N.W = (var3 + this.N.L) * this.N.z;
         this.N.T++;
         this.N.P = 0;
         this.N.j = var3;
         var1[var3] = var2.N(this.N);
      }
   }
}

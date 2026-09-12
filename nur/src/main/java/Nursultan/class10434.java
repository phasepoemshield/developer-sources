package Nursultan;

import minecraft.class04522;

public class class10434 implements class04522 {
   private final float N;
   private double y = Double.MIN_VALUE;

   public class10434(float var1) {
      this.N = var1;
   }

   public boolean method_34792(double var1) {
      boolean var3;
      if (this.y != Double.MIN_VALUE && !(var1 <= this.y)) {
         var3 = (var1 - this.y) / this.y >= (double)this.N;
      } else {
         var3 = false;
      }

      this.y = var1;
      return var3;
   }
}

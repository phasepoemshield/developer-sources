package Nursultan;

import minecraft.class07209;
import minecraft.class07872;
import minecraft.class07993;

public class class10846 extends class07993 {
   public class10846(class07872 var1, double var2) {
      super(var1, var2);
   }

   public boolean N() {
      if (!this.M()) {
         return false;
      } else {
         class07209 var1 = this.N(this.L.method_73183(), this.L, 7);
         if (var1 != null) {
            this.i = (double)var1.method_10263();
            this.R = (double)var1.method_10264();
            this.M = (double)var1.method_10260();
            return true;
         } else {
            return this.Z();
         }
      }
   }
}

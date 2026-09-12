package Nursultan;

import minecraft.class01818;
import minecraft.class03005;
import minecraft.class04039;
import minecraft.class04995;

public class class10096 extends class10099 {
   public class10096(class03005 var1, class04039 var2, int var3, int var4, class01818 var5) {
      super(var2);
      this.N = var2;
      this.y = var3;
      this.i = var4;
      this.R = var5;
   }

   protected boolean N() {
      int var1 = this.L.s;
      if (var1 <= this.y) {
         return true;
      } else if (var1 >= this.i) {
         return false;
      } else {
         double var2 = class04995.y((double)var1, (double)this.y, (double)this.i, 1.0, 0.0);
         return (double)this.R.N(this.L.z, var1, this.L.U).z() < var2;
      }
   }
}

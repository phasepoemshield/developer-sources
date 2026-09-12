package Nursultan;

import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00869;
import minecraft.class04688;
import minecraft.class07350;

public class class09371 implements class07350<class00500> {
   public int N;
   public int y;
   public int L;

   public class09371(class00554 var1) {
   }

   public void accept(class00500 var1, int var2) {
      class04688 var3 = var1.Y();
      if (!this.N(var1)) {
         this.N += var2;
         if (var1.Q()) {
            this.y += var2;
         }
      }

      if (!var3.W()) {
         this.N += var2;
         if (var3.M()) {
            this.L += var2;
         }
      }
   }

   private boolean N(class00500 var1) {
      return var1.N(class00869.N) || var1.N(class00869.mr) || var1.N(class00869.mh);
   }
}

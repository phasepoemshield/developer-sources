package Nursultan;

import minecraft.class00392;
import minecraft.class05216;
import minecraft.class07689;

public class class10620 {
   public Object N_0;
   public Object N_1;

   public class10620(String var1, class10580[] var2) {
      this.u();
      this.N_0 = var1;
      this.N_1 = var2;
   }

   private void u() {
   }

   public class00392 N(class07689 var1, boolean var2) {
      if (((class10580[])this.N_1).length != 0 && var2) {
         int var3 = ((class10580[])this.N_1)[0].y();
         class05216 var4 = class00392.y(((String)this.N_0).substring(0, ((class10580[])this.N_1)[0].y()));

         for (class10580 var8 : (class10580[])this.N_1) {
            class00392 var9 = var8.N(var1);
            if (var3 < var8.y()) {
               var4.i(((String)this.N_0).substring(var3, var8.y()));
            }

            var4.y(var9);
            var3 = var8.N();
         }

         if (var3 < ((String)this.N_0).length()) {
            var4.i(((String)this.N_0).substring(var3));
         }

         return var4;
      } else {
         return class00392.y((String)this.N_0);
      }
   }
}

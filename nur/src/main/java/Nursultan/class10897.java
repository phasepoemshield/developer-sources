package Nursultan;

import minecraft.class00509;
import minecraft.class00696;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;

public class class10897 extends class10932 {
   public class10897(String var1, boolean var2) {
      super(var1, var2);
   }

   @Override
   public void y(Object var1) {
      if (!this.U() || !(var1 instanceof class10990 var2) || (class03448)((class06202)super.N_0).T_3 == null || (class04453)((class06202)super.N_0).T_4 == null
         )
       {
         return;
      }

      if (var2.u() instanceof class00509 var3 && var3.N() == 31) {
         if (var3.N((class03448)((class06202)super.N_0).T_3) instanceof class00696 var6 && var6.u() == (class04453)((class06202)super.N_0).T_4) {
            var2.N();
         }

         return;
      }
   }
}

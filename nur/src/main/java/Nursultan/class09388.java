package Nursultan;

import minecraft.class00869;
import minecraft.class00885;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class08711;

public class class09388 extends class01989 {
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 var3 = var1.y();
      class07209 var4 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class00885 var5 = (class00885)class00869.iK;
      if (var3.R(var4) && var5.N(var3, var4)) {
         if (!var3.method_8608()) {
            var3.method_8652(var4, var5.W(), 3);
            var3.N(null, class01194.Z, var4);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(class08711.y(var1, var2));
      }

      return var2;
   }
}

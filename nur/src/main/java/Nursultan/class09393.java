package Nursultan;

import minecraft.class00394;
import minecraft.class00399;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class03795;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07000;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07237;
import minecraft.class08711;

public class class09393 extends class01989 {
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 var3 = var1.y();
      class07211 var4 = (class07211)var1.u().L(class06758.y);
      class07209 var5 = var1.L().method_10093(var4);
      if (var3.R(var5) && class00399.y(var3, var5, var2)) {
         var3.method_8652(var5, (class00500)class00869.Bl.W().y(class07000.i, class03795.N(var4)), 3);
         var3.N(null, class01194.Z, var5);
         class00394 var6 = var3.method_8321(var5);
         if (var6 instanceof class07237) {
            class00399.N(var3, var5, (class07237)var6);
         }

         var2.B(1);
         this.N(true);
      } else {
         this.N(class08711.y(var1, var2));
      }

      return var2;
   }
}

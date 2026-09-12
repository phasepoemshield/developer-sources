package Nursultan;

import minecraft.class00500;
import minecraft.class00886;
import minecraft.class00891;
import minecraft.class01194;
import minecraft.class04782;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09390 extends class07206 {
   public class06584 N(class07210 var1, class06584 var2) {
      class04782 var3 = var1.y();
      class07209 var4 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class00500 var5 = var3.method_8320(var4);
      class00891 var6 = var5.i();
      if (var6 instanceof class00886) {
         class06584 var9 = ((class00886)var6).N(null, var3, var4, var5);
         if (var9.R()) {
            return super.N(var1, var2);
         } else {
            var3.N(null, class01194.d, var4);
            class06581 var7 = var9.B();
            return this.N(var1, var2, new class06584(var7));
         }
      } else {
         return super.N(var1, var2);
      }
   }
}

package Nursultan;

import minecraft.class00674;
import minecraft.class01194;
import minecraft.class01989;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;
import minecraft.class07305;

public class class09400 extends class01989 {
   protected class06584 N(class07210 var1, class06584 var2) {
      class04782 var3 = var1.y();
      if (!(Boolean)var3.method_64395().N(class07305.Nu)) {
         this.N(false);
         return var2;
      } else {
         class07209 var4 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
         class00674 var5 = new class00674(var3, (double)var4.method_10263() + 0.5, (double)var4.method_10264(), (double)var4.method_10260() + 0.5, null);
         var3.method_8649(var5);
         var3.method_43128(null, var5.method_23317(), var5.method_23318(), var5.method_23321(), class04909.Qp, class04911.field_15245, 1.0F, 1.0F);
         var3.N(null, class01194.v, var4);
         var2.B(1);
         this.N(true);
         return var2;
      }
   }
}

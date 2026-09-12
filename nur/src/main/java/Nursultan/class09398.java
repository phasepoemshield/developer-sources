package Nursultan;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class01989;
import minecraft.class02859;
import minecraft.class04782;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09398 extends class01989 {
   public class06584 N(class07210 var1, class06584 var2) {
      class07209 var3 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
      class04782 var4 = var1.y();
      Optional<class00500> var6 = class02859.N(var4.method_8320(var3));
      if (var6.isPresent()) {
         var4.method_8501(var3, var6.get());
         var4.N(3003, var3, 0);
         var2.B(1);
         this.N(true);
         return var2;
      } else {
         return super.N(var1, var2);
      }
   }
}

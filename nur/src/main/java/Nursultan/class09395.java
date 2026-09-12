package Nursultan;

import minecraft.class01194;
import minecraft.class06113;
import minecraft.class06530;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07078;
import minecraft.class07206;
import minecraft.class07210;
import minecraft.class07211;

public class class09395 extends class07206 {
   public class06584 N(class07210 var1, class06584 var2) {
      class07211 var3 = (class07211)var1.u().L(class06758.y);
      class07078<?> var4 = ((class06530)var2.B()).u(var2);
      if (var4 == null) {
         return var2;
      } else {
         try {
            var4.N(var1.y(), var2, null, var1.L().method_10093(var3), class06113.field_16470, var3 != class07211.field_11036, false);
         } catch (Exception var6) {
            y.error("Error while dispensing spawn egg from dispenser at {}", var1.L(), var6);
            return class06584.E;
         }

         var2.B(1);
         var1.y().N(null, class01194.v, var1.L());
         return var2;
      }
   }
}

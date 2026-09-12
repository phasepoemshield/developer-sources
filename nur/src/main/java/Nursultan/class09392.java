package Nursultan;

import minecraft.class00869;
import minecraft.class01194;
import minecraft.class01210;
import minecraft.class02484;
import minecraft.class04782;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class06506;
import minecraft.class06517;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06758;
import minecraft.class07107;
import minecraft.class07206;
import minecraft.class07209;
import minecraft.class07210;
import minecraft.class07211;

public class class09392 extends class07206 {
   private final class07206 N = new class07206();

   public class06584 N(class07210 var1, class06584 var2) {
      if (!((class06517)var2.a_(class02484.h, class06517.N)).N(class06506.N)) {
         return this.N.dispense(var1, var2);
      } else {
         class04782 var4 = var1.y();
         class07209 var5 = var1.L();
         class07209 var6 = var1.L().method_10093((class07211)var1.u().L(class06758.y));
         if (!var4.method_8320(var6).N(class01210.Lw)) {
            return this.N.dispense(var1, var2);
         } else {
            if (!var4.method_8608()) {
               for (int var7 = 0; var7 < 5; var7++) {
                  var4.method_65096(
                     class07107.NT,
                     (double)var5.method_10263() + var4.field_9229.U(),
                     (double)(var5.method_10264() + 1),
                     (double)var5.method_10260() + var4.field_9229.U(),
                     1,
                     0.0,
                     0.0,
                     0.0,
                     1.0
                  );
               }
            }

            var4.method_8396(null, var5, class04909.Lc, class04911.field_15245, 1.0F, 1.0F);
            var4.N(null, class01194.w, var5);
            var4.method_8501(var6, class00869.nB.W());
            return this.N(var1, var2, new class06584(class06570.nP));
         }
      }
   }
}

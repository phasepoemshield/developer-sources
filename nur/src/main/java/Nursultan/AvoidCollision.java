package Nursultan;

import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;

@class11080(
   L = "AvoidCollision",
   y = class11072.PLAYER,
   u = class11101.DEVELOPMENT,
   N = class11106.BASE
)
public class AvoidCollision extends class11067 {
   @class11782
   public void N(class11385 var1) {
      float var2 = 0.3F;

      for (short var3 = -180; var3 <= 180; var3 += 90) {
         double var4 = -Math.sin(Math.toRadians((double)var3)) * (double)var2;
         double var6 = Math.cos(Math.toRadians((double)var3)) * (double)var2;
         if (((class03448)((class06202)super.y_0).T_3)
            .method_8600((class04453)((class06202)super.y_0).T_4, ((class04453)((class06202)super.y_0).T_4).method_5829().u(var4, 0.0, var6))
            .iterator()
            .hasNext()) {
            var1.B(true);
            class11902.N(var1, (float)(var3 + 180));
            break;
         }
      }
   }
}

package Nursultan;

import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06664;

@class11080(
   L = "NoSlotChange",
   y = class11072.COMBAT,
   N = class11106.OTHER
)
public class NoSlotChange extends class11067 {
   @class11782
   private void N(class10990 var1) {
      if (var1.u() instanceof class06664 var2) {
         class06664 var10000 = var2;

         try {
            var6 = var10000.N();
         } catch (Throwable var5) {
            throw new MatchException(var5.toString(), var5);
         }

         int var3 = var6;
         var1.N();
         class11938.Z().N(() -> {
            int var2x = ((class04453)((class06202)super.y_0).T_4).method_31548().N();
            class11322.i(var3);
            class11322.i(var2x);
         });
      }
   }
}

package Nursultan;

import java.util.UUID;
import minecraft.class00642;
import minecraft.class06666;
import minecraft.class07367;
import minecraft.class07369;

@class11080(
   L = "SRPSpoofer",
   y = class11072.MISC,
   N = class11106.BASE
)
public class SRPSpoofer extends class11067 {
   @class11782
   public void N(class10990 var1) {
      if (var1.u() instanceof class06666 var2) {
         var1.N();
         UUID var5 = var2.N();
         class00642 var4 = var1.L();
         var4.method_10743(new class07367(var5, class07369.field_13016));
         var4.method_10743(new class07367(var5, class07369.field_13017));
      }
   }
}

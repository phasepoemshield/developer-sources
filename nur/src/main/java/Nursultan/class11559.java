package Nursultan;

import minecraft.class00380;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class08036;

public class class11559 extends class11590 {
   public class11559(UseTracker var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10990 var2) {
         if (var2.u() instanceof class00509 var3 && var3.N() == 35) {
            class07049 var11 = var3.N((class03448)((class06202)super.N_0).T_3);
            if (var11 != (class04453)((class06202)super.N_0).T_4 && var11 instanceof class08036 var5) {
               for (class07050 var9 : class07050.values()) {
                  class06584 var10 = var5.method_5998(var9);
                  if (var10.B() == class06570.la) {
                     class11923.N(() -> this.y(var5, var10));
                     break;
                  }
               }

               return;
            }

            return;
         }
      }
   }

   private void y(class08036 var1, class06584 var2) {
      class00380 var3 = new class00380(var2);
      class05216 var4 = var1.method_5476().L();
      class05216 var5 = var4.i(class06541.field_1080 + (class06541.N(var4.getString()).endsWith(" ") ? "" : " ") + class12020.N("totem-popped") + " ")
         .i(var2.I() ? class06541.field_1060 + "✔" : class06541.field_1061 + "❌")
         .y(class00405.N.N(var3));
      class11303.N(new class11288((UseTracker)super.u_0), (class00392)var5);
   }

   private static void N() {
   }
}

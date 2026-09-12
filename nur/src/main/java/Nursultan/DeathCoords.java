package Nursultan;

import minecraft.class00392;
import minecraft.class02675;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;

@class11080(
   L = "DeathCoords",
   y = class11072.MISC,
   N = class11106.BASE
)
public class DeathCoords extends class11067 {
   public Object L_0;

   public DeathCoords() {
      this.b();
      this.L_0 = class11524.N(this, "save-waypoint", false);
   }

   private void b() {
   }

   @class11782
   public void N(class10990 var1) {
      this.b();
      if (var1.u() instanceof class02675 var2) {
         if (((class03448)((class06202)super.y_0).T_3).method_8469(var2.N()) == (class04453)((class06202)super.y_0).T_4) {
            class06889 var8 = ((class04453)((class06202)super.y_0).T_4).method_73189();
            int var4 = (int)var8.N();
            int var5 = (int)var8.y();
            int var6 = (int)var8.L();
            class05216 var7 = class11921.N("death-message", var4, var5, var6).N(class06541.field_1080);
            class11303.N(new class11288(this), (class00392)var7);
            if (((class11507)this.L_0).i()) {
               class11938.E().N(class12020.N("death-waypoint"), new class06889((double)var4, (double)var5, (double)var6), class11910.L());
            }
         }
      }
   }
}

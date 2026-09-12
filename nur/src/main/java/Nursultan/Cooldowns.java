package Nursultan;

import minecraft.class01054;
import minecraft.class01590;
import minecraft.class01894;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06584;

@class11080(
   L = "Cooldowns",
   y = class11072.VISUAL,
   N = class11106.INTERFACE
)
public class Cooldowns extends class11067 {
   public Object L_0;
   public Object L_1;

   private void P() {
   }

   public Cooldowns() {
      this.P();
      this.L_0 = class11524.N(this, "render-on-items", true);
      this.L_1 = class11524.N(this, "inventory-only", false);
   }

   @Override
   public boolean Z() {
      class11938.i().N();
      return super.Z();
   }

   @Override
   public boolean i() {
      class11938.i().N();
      return super.i();
   }

   public boolean m() {
      this.P();
      return ((class11507)this.L_1).i();
   }

   @class11782
   public void N(class10946 var1) {
      this.P();
      if (((class11507)this.L_0).i()) {
         class04453 var2 = (class04453)((class06202)super.y_0).T_4;
         if (var2 != null) {
            class06584 var3 = var1.u();
            class06556 var4 = var2.method_7357();
            class01894 var5 = var4.y(var3);
            if (var5 != null) {
               class10621 var6 = (class10621)var4.N.get(var5);
               if (var6 != null) {
                  float var7 = ((class06202)super.y_0).NK().N(true);
                  float var8 = (float)var6.y() - ((float)var4.y + var7);
                  if (!(var8 <= 0.0F)) {
                     float var9 = var8 / 20.0F;
                     String var10;
                     if (var9 > 99.0F) {
                        var10 = "99+";
                     } else {
                        var10 = String.valueOf(Math.round(var9));
                     }

                     float var11 = var4.N(var3, var7);
                     int var13 = class04995.M((1.0F - var11) * 100.0F / 100.0F * 0.33333334F, 1.0F, 1.0F) | 0xFF000000;
                     class01054 var14 = var1.N();
                     int var15 = var1.L();
                     int var16 = var1.y() + 8 - 4 - 3;
                     var14.y((class01590)((class06202)super.y_0).i_3, var10, var15, var16, var13);
                  }
               }
            }
         }
      }
   }
}

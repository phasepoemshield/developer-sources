package Nursultan;

import minecraft.class03386;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;

public class class11244 extends class11230 {
   public class11244(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10996) {
         if (((class04453)((class06202)super.N_0).T_4).field_6012 % 4 == 0) {
            class05363 var2 = ((class03386)((class06202)super.N_0).i_5).s();
            float var3 = var2.R();

            for (int var4 = 0; var4 < 20; var4++) {
               float var5 = class11908.N(var3 + class11908.y(-90.0F, 90.0F));
               double var6 = -Math.sin((double)var5);
               double var8 = Math.cos((double)var5);
               double var10 = var6 * (double)class11908.y(3.0F, 30.0F);
               double var12 = (double)(class11908.y(-2.0F, 15.0F) - 2.0F);
               double var14 = var8 * (double)class11908.y(3.0F, 30.0F);
               class06889 var16 = var2.y().y(var10, var12, var14);
               class06889 var17 = new class06889((Math.random() * 0.5 - 0.25) * 0.9, Math.random() * 0.25 * 0.01, (Math.random() * 0.5 - 0.25) * 0.9);
               class11179 var18 = new class11179(class11908.N(40, 70), this.N());
               var18.N(true);
               var18.N(var16);
               var18.y(var17);
               var18.y(0.995);
               var18.N(0.01F);
               this.N(var18);
            }
         }
      }
   }
}

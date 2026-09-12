package Nursultan;

import java.util.Objects;
import minecraft.class00509;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class06069;
import minecraft.class06202;
import minecraft.class07049;

public class class11246 extends class11230 {
   public class11246(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      Objects.requireNonNull(var1);
      switch (var1) {
         case class10990 var21:
            if (((class10990)var1).u() instanceof class00509 var18 && var18.N() == 35) {
               class07049 var20 = var18.N((class03448)((class06202)super.N_0).T_3);
               if (var20 != (class04453)((class06202)super.N_0).T_4 && var20 != null) {
                  ((class11783)var20).dataManager().R().N(40);
               }
            }
            break;
         case class10996 var5:
            label44: {
               class06069 var6 = ((class04453)((class06202)super.N_0).T_4).method_59922();

               for (class07049 var8 : ((class03448)((class06202)super.N_0).T_3).M()) {
                  class11821<Integer> var9 = ((class11783)var8).dataManager().R();
                  if (var9.N() > 0) {
                     for (int var10 = 0; var10 < 16; var10++) {
                        double var11 = (double)(var6.z() * 2.0F - 1.0F);
                        double var13 = (double)(var6.z() * 2.0F - 1.0F);
                        double var15 = (double)(var6.z() * 2.0F - 1.0F);
                        if (!(class04995.E(var11) + class04995.E(var13) + class04995.E(var15) > 1.0)) {
                           class11179 var17 = new class11179(class11908.N(60, 72), this.N(var6));
                           var17.y(class11908.y(0.8F, 1.5F));
                           var17.N(var11, var13 + 0.2, var15);
                           var17.y(var8.method_23316(var11 / 4.0), var8.method_23323(0.5 + var13 / 4.0), var8.method_23324(var15 / 4.0));
                           var17.y(0.6);
                           var17.N(1.0);
                           this.N(var17);
                        }
                     }

                     var9.N(var9.N() - 1);
                  }
               }
               break label44;
            }
      }
   }

   private int N(class06069 var1) {
      return var1.y(4) == 0
         ? class11300.N(0.6F + var1.z() * 0.2F, 0.6F + var1.z() * 0.3F, var1.z() * 0.2F)
         : class11300.N(0.1F + var1.z() * 0.2F, 0.4F + var1.z() * 0.3F, var1.z() * 0.2F);
   }
}

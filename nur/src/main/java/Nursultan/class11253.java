package Nursultan;

import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07268;

public class class11253 extends class11230 {
   public class11253(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10990 && ((class10990)var1).u() instanceof class07268 var3 && var3.y() == 4) {
         class07049 var9 = ((class03448)((class06202)super.N_0).T_3).method_8469(var3.N());
         if (var9 != null) {
            for (int var5 = 0; var5 < 50; var5++) {
               class06889 var6 = new class06889((Math.random() - 0.5) * 0.6, Math.random() * 0.2 + 0.1, (Math.random() - 0.5) * 0.6);
               class06889 var7 = new class06889(
                  var9.method_23316(var6.M / 4.0), var9.method_23318() + (double)var9.method_17682() * Math.random(), var9.method_23324(var6.Z / 4.0)
               );
               class11179 var8 = new class11179(class11908.N(20, 30), this.N());
               var8.N(var7);
               var8.y(var6);
               var8.y(0.998);
               var8.N(0.7);
               this.N(var8);
            }
         }
      }
   }
}

package Nursultan;

import minecraft.class03448;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07488;
import minecraft.class07517;

public class class11251 extends class11230 {
   public class11251(Particles var1, String var2, boolean var3) {
      super(var1, var2, var3);
   }

   @Override
   public void y(Object var1) {
      if (var1 instanceof class10996) {
         for (class07049 var3 : ((class03448)((class06202)super.N_0).T_3).M()) {
            if ((var3 instanceof class07517 || var3 instanceof class07488) && this.N(var3)) {
               for (int var4 = 0; var4 < 5; var4++) {
                  class06889 var5 = new class06889((Math.random() - 0.5) * 0.3, (Math.random() - 0.5) * 0.2, (Math.random() - 0.5) * 0.3);
                  class11179 var6 = new class11179(class11908.N(20, 40), this.N());
                  var6.N(true);
                  var6.N(var3.method_73189());
                  var6.y(var5);
                  var6.y(0.95);
                  var6.N(0.02);
                  this.N(var6);
               }
            }
         }
      }
   }

   private boolean N(class07049 var1) {
      return var1.field_6012 <= 0
         ? false
         : var1.field_6038 != var1.method_23317() || var1.field_5971 != var1.method_23318() || var1.field_5989 != var1.method_23321();
   }
}

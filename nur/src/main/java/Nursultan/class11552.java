package Nursultan;

import minecraft.class03386;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class05363;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06145;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06541;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07089;
import minecraft.class07113;

public class class11552 extends class11142 {
   public Object y_0;
   public boolean y_init;

   public class11552(ClickAction var1) {
      super(var1, "point-key");
      this.N();
   }

   @Override
   public void y(class11389 var1) {
      this.N();
      if (System.currentTimeMillis() - (Long)this.y_0 >= 750L) {
         if (!class11938.z().R()) {
            class11303.y(class11921.N("socket.not-connected").N(class06541.field_1061));
         } else {
            class05363 var2 = ((class03386)((class06202)super.N_0).i_5).s();
            class06889 var3 = ((class04453)((class06202)super.N_0).T_4).method_5631(var2.i(), var2.R()).L(256.0);
            class06889 var4 = var2.y();
            class07089 var5 = class11892.N((class04453)((class06202)super.N_0).T_4, var4, var3, 256.0, true, class11791.B().and(class11791.N()));
            if (var5 != null && var5.N() == class07113.field_1331) {
               class07049 var9 = ((class06145)var5).L();
               class11938.z().N(new class11987(var9.method_23317(), var9.method_23318(), var9.method_23321(), var9.method_5628()));
               this.y_0 = System.currentTimeMillis();
            } else {
               class06889 var6 = var4.i(var3);
               class06183 var7 = ((class03448)((class06202)super.N_0).T_3)
                  .N(new class05862(var4, var6, class05849.field_17559, class05835.field_1348, (class04453)((class06202)super.N_0).T_4));
               if (var7.N() != class07113.field_1333) {
                  class06889 var8 = var7.y();
                  class11938.z().N(new class11987(var8.N(), var8.y(), var8.L(), -1));
                  this.y_0 = System.currentTimeMillis();
               }
            }
         }
      }
   }

   private void N() {
      if (!this.y_init) {
         this.y_init = true;
         this.y_0 = 0L;
      }
   }
}

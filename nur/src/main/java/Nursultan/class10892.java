package Nursultan;

import minecraft.class04453;
import minecraft.class04462;
import minecraft.class04474;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class08687;

public class class10892 extends class11807<Flight> implements class11801<Flight> {
   public Object y_0;

   public class10892(Flight var1, String var2, boolean var3) {
      super(var1, var2, var3);
      this.R();
   }

   static {
      N();
   }

   @Override
   public void y(Object var1) {
      this.R();
      if (var1 instanceof class11370 var2) {
         class08687 var3 = ((class04474)((class04453)((class06202)super.N_0).T_4).L_1).field_54155;
         float var4 = class04462.N(var3.N(), var3.y());
         float var5 = class04462.N(var3.L(), var3.u());
         class06889 var6 = class06889.L;
         if (var4 != 0.0F || var5 != 0.0F) {
            double var7 = Math.toRadians((double)class11902.N(((class04453)((class06202)super.N_0).T_4).method_36454(), var4, var5));
            var6 = var6.y(
               -Math.sin(var7) * (double)((class11504)this.y_0).i().floatValue(), 0.0, Math.cos(var7) * (double)((class11504)this.y_0).i().floatValue()
            );
         }

         float var10 = class04462.N(var3.i(), var3.R());
         var6 = var6.y(0.0, (double)(var10 * ((class11504)this.y_0).i() / 2.0F), 0.0);
         var2.N(var6);
      }
   }

   private static void N() {
   }

   public void N(Flight var1) {
      this.R();
      this.y_0 = (class11504)class11524.N(var1, "speed", 1.0F, 0.1F, 10.0F, 0.1F).N(var1x -> this.U());
   }

   private void R() {
   }
}

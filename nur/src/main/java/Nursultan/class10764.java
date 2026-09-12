package Nursultan;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07435;
import minecraft.class07438;
import minecraft.class07458;
import minecraft.class07541;

public class class10764 extends class07458 {
   private final class07541 N;

   public class10764(class07541 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      class07438 var1 = this.N.T();
      if (this.N.v() && this.N.method_5799()) {
         if (var1 != null && var1.method_23318() > this.N.method_23318() || this.N.y) {
            this.N.method_18799(this.N.method_18798().y(0.0, 0.002, 0.0));
         }

         if (this.E != class07435.field_6378 || this.N.f().U()) {
            this.N.method_6125(0.0F);
            return;
         }

         double var2 = this.R - this.N.method_23317();
         double var4 = this.M - this.N.method_23318();
         double var6 = this.B - this.N.method_23321();
         double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
         var4 /= var8;
         float var10 = (float)(class04995.u(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
         this.N.method_36456(this.y(this.N.method_36454(), var10, 90.0F));
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         float var11 = (float)(this.Z * this.N.method_45325(class05298.l));
         float var12 = class04995.B(0.125F, this.N.method_6029(), var11);
         this.N.method_6125(var12);
         this.N.method_18799(this.N.method_18798().y((double)var12 * var2 * 0.005, (double)var12 * var4 * 0.1, (double)var12 * var6 * 0.005));
      } else {
         if (!this.N.method_24828()) {
            this.N.method_18799(this.N.method_18798().y(0.0, -0.008, 0.0));
         }

         super.N();
      }
   }
}

package Nursultan;

import minecraft.class01231;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class07435;
import minecraft.class07458;
import minecraft.class07629;

public class class10774 extends class07458 {
   private final class07629 N;

   public class10774(class07629 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      if (this.N.method_5777(class01231.N)) {
         this.N.method_18799(this.N.method_18798().y(0.0, 0.005, 0.0));
      }

      if (this.E == class07435.field_6378 && !this.N.f().U()) {
         float var1 = (float)(this.Z * this.N.method_45325(class05298.l));
         this.N.method_6125(class04995.B(0.125F, this.N.method_6029(), var1));
         double var2 = this.R - this.N.method_23317();
         double var4 = this.M - this.N.method_23318();
         double var6 = this.B - this.N.method_23321();
         if (var4 != 0.0) {
            double var8 = Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
            this.N.method_18799(this.N.method_18798().y(0.0, (double)this.N.method_6029() * (var4 / var8) * 0.1, 0.0));
         }

         if (var2 != 0.0 || var6 != 0.0) {
            float var10 = (float)(class04995.u(var6, var2) * 180.0F / (float)Math.PI) - 90.0F;
            this.N.method_36456(this.y(this.N.method_36454(), var10, 90.0F));
            this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         }
      } else {
         this.N.method_6125(0.0F);
      }
   }
}

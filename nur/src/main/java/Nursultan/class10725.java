package Nursultan;

import minecraft.class04995;
import minecraft.class05298;
import minecraft.class06889;
import minecraft.class07435;
import minecraft.class07442;
import minecraft.class07458;
import minecraft.class07549;

public class class10725 extends class07458 {
   private final class07549 N;

   public class10725(class07549 var1) {
      super(var1);
      this.N = var1;
   }

   public void N() {
      if (this.E == class07435.field_6378 && !this.N.f().U()) {
         class06889 var1 = new class06889(this.R - this.N.method_23317(), this.M - this.N.method_23318(), this.B - this.N.method_23321());
         double var2 = var1.M();
         double var4 = var1.M / var2;
         double var6 = var1.B / var2;
         double var8 = var1.Z / var2;
         float var10 = (float)(class04995.u(var1.Z, var1.M) * 180.0F / (float)Math.PI) - 90.0F;
         this.N.method_36456(this.y(this.N.method_36454(), var10, 90.0F));
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         float var11 = (float)(this.Z * this.N.method_45325(class05298.l));
         float var12 = class04995.B(0.125F, this.N.method_6029(), var11);
         this.N.method_6125(var12);
         double var13 = Math.sin((double)(this.N.field_6012 + this.N.method_5628()) * 0.5) * 0.05;
         double var15 = Math.cos((double)(this.N.method_36454() * (float) (Math.PI / 180.0)));
         double var17 = Math.sin((double)(this.N.method_36454() * (float) (Math.PI / 180.0)));
         double var19 = Math.sin((double)(this.N.field_6012 + this.N.method_5628()) * 0.75) * 0.05;
         this.N.method_18799(this.N.method_18798().y(var13 * var15, var19 * (var17 + var15) * 0.25 + (double)var12 * var6 * 0.1, var13 * var17));
         class07442 var21 = this.N.p();
         double var22 = this.N.method_23317() + var4 * 2.0;
         double var24 = this.N.method_23320() + var6 / var2;
         double var26 = this.N.method_23321() + var8 * 2.0;
         double var28 = var21.i();
         double var30 = var21.R();
         double var32 = var21.M();
         if (!var21.u()) {
            var28 = var22;
            var30 = var24;
            var32 = var26;
         }

         this.N.p().N(class04995.u(0.125, var28, var22), class04995.u(0.125, var30, var24), class04995.u(0.125, var32, var26), 10.0F, 40.0F);
         this.N.N(true);
      } else {
         this.N.method_6125(0.0F);
         this.N.N(false);
      }
   }
}

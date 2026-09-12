package Nursultan;

import minecraft.class04995;
import minecraft.class06889;
import minecraft.class07079;
import minecraft.class07155;
import minecraft.class07458;

public class class10722 extends class07458 {
   private float W;

   public class10722(class07155 var1, class07079 var2) {
      super(var2);
      this.N = var1;
      this.W = 0.1F;
   }

   public void N() {
      if (this.N.field_5976) {
         this.N.method_36456(this.N.method_36454() + 180.0F);
         this.W = 0.1F;
      }

      double var1 = this.N.L.M - this.N.method_23317();
      double var3 = this.N.L.B - this.N.method_23318();
      double var5 = this.N.L.Z - this.N.method_23321();
      double var7 = Math.sqrt(var1 * var1 + var5 * var5);
      if (Math.abs(var7) > 1.0E-5F) {
         double var9 = 1.0 - Math.abs(var3 * 0.7F) / var7;
         var1 *= var9;
         var5 *= var9;
         var7 = Math.sqrt(var1 * var1 + var5 * var5);
         double var11 = Math.sqrt(var1 * var1 + var5 * var5 + var3 * var3);
         float var13 = this.N.method_36454();
         float var14 = (float)class04995.u(var5, var1);
         float var15 = class04995.R(this.N.method_36454() + 90.0F);
         float var16 = class04995.R(var14 * (180.0F / (float)Math.PI));
         this.N.method_36456(class04995.i(var15, var16, 4.0F) - 90.0F);
         this.N.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = this.N.method_36454();
         if (class04995.i(var13, this.N.method_36454()) < 3.0F) {
            this.W = class04995.u(this.W, 1.8F, 0.005F * (1.8F / this.W));
         } else {
            this.W = class04995.u(this.W, 0.2F, 0.025F);
         }

         float var17 = (float)(-(class04995.u(-var3, var7) * 180.0F / (float)Math.PI));
         this.N.method_36457(var17);
         float var18 = this.N.method_36454() + 90.0F;
         double var19 = (double)(this.W * class04995.P((double)(var18 * (float) (Math.PI / 180.0)))) * Math.abs(var1 / var11);
         double var21 = (double)(this.W * class04995.m((double)(var18 * (float) (Math.PI / 180.0)))) * Math.abs(var5 / var11);
         double var23 = (double)(this.W * class04995.m((double)(var17 * (float) (Math.PI / 180.0)))) * Math.abs(var3 / var11);
         class06889 var25 = this.N.method_18798();
         this.N.method_18799(var25.i(new class06889(var19, var23, var21).u(var25).L(0.2)));
      }
   }
}

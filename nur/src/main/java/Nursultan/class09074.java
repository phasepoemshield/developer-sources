package Nursultan;

import minecraft.class00405;
import minecraft.class01028;
import minecraft.class05194;

public class class09074 implements class09102 {
   public Object N_0;
   public Object N_1;
   public Object N_2;
   public Object N_3;
   public Object N_4;
   public Object N_5;
   public boolean N_init;

   public class09074() {
      this.B();
      this.N_0 = new class09084();
      this.N_1 = new class09090();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_4 = 0;
         this.N_5 = false;
      }
   }

   public boolean N(class09071 var1, float var2, float var3, String var4, float var5, float var6, int var7, class09061 var8) {
      this.N_2 = var1;
      this.N_3 = var8;
      this.N_4 = var7;
      this.N_5 = true;
      ((class09090)this.N_1).N(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.N_5;
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
      if (!var3) {
         this.N_5 = false;
      } else {
         this.N(var4, var1, N(var2, (Integer)this.N_4));
      }
   }

   public boolean N(class09071 var1, float var2, float var3, class01028 var4, float var5, float var6, int var7, class09061 var8) {
      this.N_2 = var1;
      this.N_3 = var8;
      this.N_4 = var7;
      this.N_5 = true;
      ((class09090)this.N_1).N(var1, var2, var3, var4, var5, var6, this);
      return (Boolean)this.N_5;
   }

   private void N(class09719 var1, int var2, int var3) {
      int var4 = ((class09071)this.N_2).u();
      int var5 = ((class09071)this.N_2).M();
      if (var4 > 0 && var5 > 0) {
         float var6 = ((class09090)this.N_1).y() + (((class09090)this.N_1).R() - ((class09090)this.N_1).N());
         float var7 = ((class09090)this.N_1).u();
         float var8 = var6 + var1.N;
         float var9 = var6 + var1.L;
         float var10 = var7 - var1.u;
         float var11 = var7 - var1.y;
         float var12 = 1.0F / ((class09090)this.N_1).L();
         float var13 = var8 * var12;
         float var14 = var10 * var12;
         float var15 = var9 * var12;
         float var16 = var11 * var12;
         float var17 = var1.i;
         float var18 = var1.B;
         float var19 = var1.M;
         float var20 = var1.R;
         ((class09084)this.N_0)
            .N(
               var13,
               var14,
               var15,
               var16,
               var17,
               var18,
               var19,
               var20,
               ((class09071)this.N_2).y(),
               var4,
               var5,
               var2,
               var3,
               var1.Z * var12,
               ((class09090)this.N_1).R(),
               ((class09090)this.N_1).M(),
               ((class09090)this.N_1).y(),
               ((class09090)this.N_1).u(),
               ((class09071)this.N_2).L()
            );
         ((class09061)this.N_3).accept((class09084)this.N_0);
      }
   }

   private static int N(class00405 var0, int var1) {
      if (var0 == null) {
         return var1;
      } else {
         class05194 var2 = var0.N();
         return var2 == null ? var1 : var1 & 0xFF000000 | var2.N() & 16777215;
      }
   }
}

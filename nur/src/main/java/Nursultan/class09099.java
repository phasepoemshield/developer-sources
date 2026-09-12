package Nursultan;

import minecraft.class00405;

public class class09099 implements class09102 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;

   float L() {
      return (float)Math.round((Float)this.N_1);
   }

   class09099() {
      this.B();
   }

   private void B() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0.0F;
      }
   }

   @Override
   public void y() {
      float var1 = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
      if (var1 > (Float)this.N_1) {
         this.N_1 = var1;
      }
   }

   @Override
   public void N() {
      float var1 = ((class09090)this.N_0).R() - ((class09090)this.N_0).N();
      if (var1 > (Float)this.N_1) {
         this.N_1 = var1;
      }
   }

   void N(class09090 var1) {
      this.N_0 = var1;
      this.N_1 = 0.0F;
   }

   @Override
   public void N(int var1, class00405 var2, boolean var3, class09719 var4, float var5) {
      float var6 = ((class09090)this.N_0).R() - ((class09090)this.N_0).N() + var5;
      if (var6 > (Float)this.N_1) {
         this.N_1 = var6;
      }
   }
}

package Nursultan;

import minecraft.class06889;

public class class11037 {
   public Object N_0;
   public Object N_1;
   public boolean N_init;
   public static Object y_0;
   public static Object y_1;

   void L() {
      this.N_1 = (Integer)this.N_1 + 1;
   }

   private static void M() {
      y_0 = 60;
      y_1 = 30;
   }

   class11037(class06889 var1) {
      this.i();
      this.N_0 = var1;
   }

   static {
      M();
   }

   private void i() {
      if (!this.N_init) {
         this.N_init = true;
         this.N_1 = 0;
      }
   }

   float y(float var1) {
      return 1.0F - this.N(60, var1);
   }

   float N(float var1) {
      return this.N(30, var1);
   }

   boolean N() {
      return (Integer)this.N_1 >= 60;
   }

   private float N(int var1, float var2) {
      float var3 = Math.min(1.0F, ((float)((Integer)this.N_1).intValue() + var2) / (float)var1);
      return (float)((class11887)class11905.u_4).ease((double)var3);
   }
}

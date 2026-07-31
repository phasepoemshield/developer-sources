package ru.metaculture.protection;

public class O0000O00OOO0O {
   long O00000000;
   public float O000000000;
   public float O0000000000;
   public float O00000000000;

   public O0000O00OOO0O(float f, float g, float h) {
      this.O000000000 = f;
      this.O0000000000 = g;
      this.O00000000000 = h;
      this.O00000000 = System.currentTimeMillis();
   }

   public float O00000000() {
      if (Math.abs(this.O000000000 - this.O0000000000) < 1.0E-4) {
         this.O000000000 = this.O0000000000;
      }

      int var1;
      if ((var1 = (int)(Math.min((float)(System.currentTimeMillis() - this.O00000000), 400.0F) / 5.0F)) > 0) {
         this.O00000000 = System.currentTimeMillis();
      }

      for (int var2 = 0; var2 < var1; var2++) {
         this.O000000000 = O0000O00OO0OO0.O000000000000O(this.O000000000, this.O0000000000, this.O00000000000);
      }

      return this.O000000000;
   }

   public float O000000000() {
      if (Math.abs(this.O000000000 - this.O0000000000) > 1.0E-4) {
         int var1 = (int)(Math.min((float)(System.currentTimeMillis() - this.O00000000), 400.0F) / 5.0F);
         if (var1 > 0) {
            this.O00000000 = System.currentTimeMillis();
         }

         for (int var2 = 0; var2 < var1; var2++) {
            this.O000000000 = (float)this.O00000000(this.O000000000, this.O0000000000, this.O00000000000);
         }
      }

      return O0000O00OO0OO0.O00000000(this.O000000000);
   }

   public void O00000000(float f) {
      this.O000000000 = f;
      this.O00000000 = System.currentTimeMillis();
   }

   double O00000000(float f, float g, float h) {
      float var4 = (g - f + 180.0F) % 360.0F - 180.0F;
      return var4 * h + f;
   }
}

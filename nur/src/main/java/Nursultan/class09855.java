package Nursultan;

final class class09855 {
   private static final float N = 1.0E-6F;
   private float y;
   private float L;

   boolean L(float var1) {
      return this.L() ? true : this.y(var1) > 0.0F;
   }

   private boolean L() {
      return this.y <= 1.0E-6F;
   }

   class09855(float var1) {
      this.N(var1);
   }

   private static float u(float var0) {
      return !Float.isNaN(var0) && !Float.isInfinite(var0) && !(var0 <= 1.0E-6F) ? var0 : 0.0F;
   }

   float y(float var1) {
      float var2 = Math.max(0.0F, var1);
      if (this.L()) {
         return var2;
      } else {
         this.L += var2;
         float var3 = 1.0F / this.y;
         int var4 = (int)(this.L / var3);
         if (var4 <= 0) {
            return 0.0F;
         } else {
            float var5 = (float)var4 * var3;
            this.L -= var5;
            return var5;
         }
      }
   }

   void y() {
      this.L = 0.0F;
   }

   public float N() {
      return this.y;
   }

   public void N(float var1) {
      this.y = u(var1);
   }
}

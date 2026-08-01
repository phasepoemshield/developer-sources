package ru.metaculture.protection;

public final class O00000OOO00 {
   private final O0000O000O0O00 O00000000;
   private float O000000000;
   private float O0000000000;

   public O00000OOO00(O0000O000O0O00 o0000O000O0O00) {
      this.O00000000 = o0000O000O0O00;
   }

   public void O00000000(float f) {
      this.O000000000 = f;
      this.O0000000000 = 0.0F;
   }

   public float O00000000(float f, float g) {
      if (Float.isNaN(f) || Float.isInfinite(f)) {
         f = this.O000000000;
      }

      if (!Float.isNaN(g) && !Float.isInfinite(g) && !(g <= 0.0F)) {
         float var3 = Math.max(0.05F, Math.min(4.0F, g * 60.0F));
         this.O0000000000 = this.O0000000000 + (f - this.O000000000) * this.O00000000.O000000000O() * var3;
         this.O0000000000 = this.O0000000000 * (float)Math.pow(this.O00000000.O000000000O0(), var3);
         this.O000000000 = this.O000000000 + this.O0000000000 * var3;
         if (!Float.isNaN(this.O000000000) && !Float.isInfinite(this.O000000000) && !Float.isNaN(this.O0000000000) && !Float.isInfinite(this.O0000000000)) {
            if (Math.abs(f - this.O000000000) <= this.O00000000.O000000000O00() && Math.abs(this.O0000000000) <= this.O00000000.O000000000O000()) {
               this.O000000000 = f;
               this.O0000000000 = 0.0F;
            }

            return this.O000000000;
         } else {
            this.O000000000 = f;
            this.O0000000000 = 0.0F;
            return this.O000000000;
         }
      } else {
         return this.O000000000;
      }
   }

   public float O00000000() {
      return this.O000000000;
   }

   public float O000000000() {
      return this.O0000000000;
   }
}

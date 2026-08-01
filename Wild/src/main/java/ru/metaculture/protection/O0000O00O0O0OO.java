package ru.metaculture.protection;

public final class O0000O00O0O0OO implements O0000O00O0O000.W369 {
   private static final float O00000000 = 1.0E-4F;
   private static final float O000000000 = 0.016666668F;
   private static final float O0000000000 = 0.1F;
   private final O0000O00O0O000 O00000000000;
   private final O0000O00O0O0O0 O000000000000;
   private final float O0000000000000;
   private final float O000000000000O;
   private final float O00000000000O;
   private final float O00000000000O0;
   private float O00000000000OO;
   private float O0000000000O;
   private float O0000000000O0;
   private O0000O00O0O00O O0000000000O00 = O0000O00O0O00O.O00000000();

   public O0000O00O0O0OO(O0000O00O0O000 o0000O00O0O000, O0000O00O0O0O0 o0000O00O0O0O0, float f, float g, float h, float i, float j) {
      if (o0000O00O0O000 == null) {
         throw new IllegalArgumentException("animationSystem must not be null");
      } else if (o0000O00O0O0O0 == null) {
         throw new IllegalArgumentException("config must not be null");
      } else if (g > h) {
         throw new IllegalArgumentException("minValue must be <= maxValue");
      } else if (!(i <= 0.0F) && !(j <= 0.0F)) {
         this.O00000000000 = o0000O00O0O000;
         this.O000000000000 = o0000O00O0O0O0;
         this.O0000000000000 = g;
         this.O000000000000O = h;
         this.O00000000000O = i;
         this.O00000000000O0 = j;
         float var8 = this.O000000000000(f);
         this.O00000000000OO = var8;
         this.O0000000000O = var8;
         this.O0000000000O0 = 0.0F;
      } else {
         throw new IllegalArgumentException("tolerances must be > 0");
      }
   }

   public void O00000000(O0000O00O0O00O o0000O00O0O00O) {
      this.O0000000000O00 = o0000O00O0O00O == null ? O0000O00O0O00O.O00000000() : o0000O00O0O00O;
   }

   public void O000000000(float f) {
      float var2 = this.O000000000000(f);
      this.O00000000000OO = var2;
      this.O0000000000O = var2;
      this.O0000000000O0 = 0.0F;
      this.O00000000000.O000000000(this);
   }

   public void O0000000000(float f) {
      float var2 = this.O000000000000(f);
      if (Math.abs(var2 - this.O0000000000O) <= this.O00000000000O * 0.25F) {
         this.O0000000000O = var2;
         if (this.O00000000000()) {
            this.O000000000(var2);
         }
      } else {
         this.O0000000000O = var2;
         this.O00000000000.O00000000(this);
      }
   }

   public float O00000000() {
      float var1 = 0.0F;
      float var2 = this.O000000000000O - this.O0000000000000;
      if (var2 > 0.0F) {
         var1 = (this.O00000000000OO - this.O0000000000000) / var2;
      }

      float var3 = this.O0000000000O00.ease(O0000000000000(var1));
      return this.O0000000000000 + var3 * var2;
   }

   public float O000000000() {
      return this.O00000000000OO;
   }

   public float O0000000000() {
      return this.O0000000000O;
   }

   public boolean O00000000000() {
      float var1 = Math.abs(this.O0000000000O - this.O00000000000OO);
      return var1 <= this.O00000000000O && Math.abs(this.O0000000000O0) <= this.O00000000000O0;
   }

   @Override
   public boolean O00000000(float f) {
      float var2 = f;
      if (f < 1.0E-4F) {
         var2 = 1.0E-4F;
      } else if (f > 0.1F) {
         var2 = 0.1F;
      }

      boolean var3 = true;

      while (var2 > 0.0F && var3) {
         float var4 = Math.min(var2, 0.016666668F);
         var3 = this.O00000000000(var4);
         var2 -= var4;
      }

      return var3;
   }

   private boolean O00000000000(float f) {
      float var2 = (float)((Math.PI * 2) * this.O000000000000.O00000000());
      float var3 = 2.0F * this.O000000000000.O000000000() * var2;
      float var4 = var2 * var2;
      float var5 = this.O00000000000OO - this.O0000000000O;
      float var6 = -var4 * var5 - var3 * this.O0000000000O0;
      this.O0000000000O0 += var6 * f;
      this.O00000000000OO = this.O00000000000OO + this.O0000000000O0 * f;
      if (Float.isNaN(this.O00000000000OO) || Float.isInfinite(this.O00000000000OO) || Float.isNaN(this.O0000000000O0) || Float.isInfinite(this.O0000000000O0)) {
         this.O00000000000OO = this.O0000000000O;
         this.O0000000000O0 = 0.0F;
         return false;
      } else if (this.O00000000000OO < this.O0000000000000) {
         this.O00000000000OO = this.O0000000000000;
         this.O0000000000O0 = 0.0F;
         return false;
      } else if (this.O00000000000OO > this.O000000000000O) {
         this.O00000000000OO = this.O000000000000O;
         this.O0000000000O0 = 0.0F;
         return false;
      } else {
         float var7 = this.O00000000000OO - this.O0000000000O;
         if ((!(var5 > 0.0F) || !(var7 < 0.0F)) && (!(var5 < 0.0F) || !(var7 > 0.0F))) {
            if (this.O00000000000()) {
               this.O00000000000OO = this.O0000000000O;
               this.O0000000000O0 = 0.0F;
               return false;
            } else {
               return true;
            }
         } else {
            this.O00000000000OO = this.O0000000000O;
            this.O0000000000O0 = 0.0F;
            return false;
         }
      }
   }

   private float O000000000000(float f) {
      if (f <= this.O0000000000000) {
         return this.O0000000000000;
      } else {
         return f >= this.O000000000000O ? this.O000000000000O : f;
      }
   }

   private static float O0000000000000(float f) {
      if (f <= 0.0F) {
         return 0.0F;
      } else {
         return f >= 1.0F ? 1.0F : f;
      }
   }
}

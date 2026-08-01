package ru.metaculture.protection;

import lombok.Generated;

public final class O0000O000O0O00 {
   private final float O00000000;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;

   private static O0000O000O0O00 O00000000(float f, float g, float h, float i) {
      O0000O000O0O var4 = O0000O000O0O.O00000000();
      return new O0000O000O0O00(var4.O00000000(f), var4.O000000000(g), var4.O0000000000(h), var4.O0000000000(i));
   }

   public static O0000O000O0O00 O00000000() {
      return O00000000(0.045F, 0.85F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O000000000() {
      return new O0000O000O0O00(0.03F, 0.87F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000() {
      return new O0000O000O0O00(0.075F, 0.86F, 0.002F, 0.002F);
   }

   public static O0000O000O0O00 O00000000000() {
      return new O0000O000O0O00(0.045F, 0.85F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O000000000000() {
      return O00000000(0.065F, 0.75F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000000() {
      return O00000000(0.12F, 0.9F, 0.02F, 0.02F);
   }

   public static O0000O000O0O00 O000000000000O() {
      return O00000000(0.05F, 0.84F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O00000000000O() {
      return O00000000(0.062F, 0.86F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O00000000000O0() {
      return O00000000(0.08F, 0.55F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O00000000000OO() {
      return O00000000(0.105F, 0.68F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000O() {
      return O00000000(0.038F, 0.86F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000O0() {
      return O00000000(0.052F, 0.72F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000O00() {
      return O00000000(0.018F, 0.88F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000O0O() {
      return O00000000(0.012F, 0.92F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000OO() {
      return O00000000(0.1F, 0.88F, 0.002F, 0.002F);
   }

   public static O0000O000O0O00 O0000000000OO0() {
      return O00000000(0.035F, 0.88F, 0.001F, 0.001F);
   }

   public static O0000O000O0O00 O0000000000OOO() {
      return new O0000O000O0O00(0.06111111F, (float)Math.exp(-0.4F), 0.001F, 0.001F);
   }

   @Generated
   public O0000O000O0O00(float f, float g, float h, float i) {
      this.O00000000 = f;
      this.O000000000 = g;
      this.O0000000000 = h;
      this.O00000000000 = i;
   }

   @Generated
   public float O000000000O() {
      return this.O00000000;
   }

   @Generated
   public float O000000000O0() {
      return this.O000000000;
   }

   @Generated
   public float O000000000O00() {
      return this.O0000000000;
   }

   @Generated
   public float O000000000O000() {
      return this.O00000000000;
   }

   @Generated
   @Override
   public boolean equals(Object object) {
      if (object == this) {
         return true;
      } else if (!(object instanceof O0000O000O0O00 var2)) {
         return false;
      } else if (Float.compare(this.O000000000O(), var2.O000000000O()) != 0) {
         return false;
      } else if (Float.compare(this.O000000000O0(), var2.O000000000O0()) != 0) {
         return false;
      } else {
         return Float.compare(this.O000000000O00(), var2.O000000000O00()) != 0 ? false : Float.compare(this.O000000000O000(), var2.O000000000O000()) == 0;
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000O());
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000O0());
      var2 = var2 * 59 + Float.floatToIntBits(this.O000000000O00());
      return var2 * 59 + Float.floatToIntBits(this.O000000000O000());
   }

   @Generated
   @Override
   public String toString() {
      return "SpringSpec(stiffness="
         + this.O000000000O()
         + ", damping="
         + this.O000000000O0()
         + ", settleDistance="
         + this.O000000000O00()
         + ", settleVelocity="
         + this.O000000000O000()
         + ")";
   }
}

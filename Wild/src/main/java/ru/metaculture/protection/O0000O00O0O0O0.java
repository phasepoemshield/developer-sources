package ru.metaculture.protection;

public final class O0000O00O0O0O0 {
   private final float O00000000;
   private final float O000000000;

   private O0000O00O0O0O0(float f, float g) {
      if (f <= 0.0F) {
         throw new IllegalArgumentException("frequencyHz must be > 0");
      } else if (g <= 0.0F) {
         throw new IllegalArgumentException("dampingRatio must be > 0");
      } else {
         this.O00000000 = f;
         this.O000000000 = g;
      }
   }

   public static O0000O00O0O0O0 O00000000(float f, float g) {
      return new O0000O00O0O0O0(f, g);
   }

   public float O00000000() {
      return this.O00000000;
   }

   public float O000000000() {
      return this.O000000000;
   }
}

package ru.metaculture.protection;

public class O0000O0O00000O extends O0000O00OOO00 {
   private final float O000000000000;

   public O0000O0O00000O(int i, double d, float f) {
      super(i, d);
      this.O000000000000 = f;
   }

   public O0000O0O00000O(int i, double d, float f, O0000O00OOO0OO o0000O00OOO0OO) {
      super(i, d, o0000O00OOO0OO);
      this.O000000000000 = f;
   }

   @Override
   protected boolean O000000000000O() {
      return true;
   }

   @Override
   protected double O000000000(double d) {
      double var3 = d / this.O000000000;
      float var5 = this.O000000000000 + 1.0F;
      return Math.max(0.0, 1.0 + var5 * Math.pow(var3 - 1.0, 3.0) + this.O000000000000 * Math.pow(var3 - 1.0, 2.0));
   }
}

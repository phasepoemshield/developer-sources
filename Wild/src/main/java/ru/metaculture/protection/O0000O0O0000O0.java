package ru.metaculture.protection;

public class O0000O0O0000O0 extends O0000O00OOO00 {
   float O000000000000;
   float O0000000000000;
   boolean O000000000000O;

   public O0000O0O0000O0(int i, double d, float f, float g, boolean bl) {
      super(i, d);
      this.O000000000000 = f;
      this.O0000000000000 = g;
      this.O000000000000O = bl;
   }

   public O0000O0O0000O0(int i, double d, float f, float g, boolean bl, O0000O00OOO0OO o0000O00OOO0OO) {
      super(i, d, o0000O00OOO0OO);
      this.O000000000000 = f;
      this.O0000000000000 = g;
      this.O000000000000O = bl;
   }

   @Override
   protected double O000000000(double d) {
      double var3 = Math.pow(d / this.O000000000, this.O0000000000000);
      double var5 = this.O000000000000 * 0.1F;
      return Math.pow(2.0, -10.0 * (this.O000000000000O ? Math.sqrt(var3) : var3)) * Math.sin((var3 - var5 / 4.0) * ((Math.PI * 2) / var5)) + 1.0;
   }
}

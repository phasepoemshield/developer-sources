package ru.metaculture.protection;

public class O0000O0O0000O extends O0000O00OOO00 {
   public O0000O0O0000O(int i, double d) {
      super(i, d);
   }

   public O0000O0O0000O(int i, double d, O0000O00OOO0OO o0000O00OOO0OO) {
      super(i, d, o0000O00OOO0OO);
   }

   @Override
   protected double O000000000(double d) {
      double var3 = d / this.O000000000;
      return var3 < 0.5 ? 2.0 * Math.pow(var3, 2.0) : 1.0 - Math.pow(-2.0 * var3 + 2.0, 2.0) / 2.0;
   }
}

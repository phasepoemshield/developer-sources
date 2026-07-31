package ru.metaculture.protection;

public class O0000O0O000000 extends O0000O00OOO00 {
   public O0000O0O000000(int i, double d) {
      super(i, d);
   }

   public O0000O0O000000(int i, double d, O0000O00OOO0OO o0000O00OOO0OO) {
      super(i, d, o0000O00OOO0OO);
   }

   @Override
   protected double O000000000(double d) {
      double var3 = d / this.O000000000;
      return 1.0 - (var3 - 1.0) * (var3 - 1.0);
   }
}

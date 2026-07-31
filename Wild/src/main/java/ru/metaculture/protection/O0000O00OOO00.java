package ru.metaculture.protection;

public abstract class O0000O00OOO00 {
   public O0000O00OOO0O0 O00000000 = new O0000O00OOO0O0();
   protected int O000000000;
   protected double O0000000000;
   protected O0000O00OOO0OO O00000000000;

   public O0000O00OOO00(int i, double d) {
      this.O000000000 = i;
      this.O0000000000 = d;
      this.O00000000000 = O0000O00OOO0OO.FORWARDS;
   }

   public O0000O00OOO00(int i, double d, O0000O00OOO0OO o0000O00OOO0OO) {
      this.O000000000 = i;
      this.O0000000000 = d;
      this.O00000000000 = o0000O00OOO0OO;
   }

   public boolean O00000000(O0000O00OOO0OO o0000O00OOO0OO) {
      return this.O00000000000() && this.O00000000000.equals(o0000O00OOO0OO);
   }

   public double O00000000() {
      return 1.0 - (double)this.O00000000.O0000000000() / this.O000000000 * this.O0000000000;
   }

   public double O000000000() {
      return this.O0000000000;
   }

   public void O00000000(double d) {
      this.O0000000000 = d;
   }

   public void O0000000000() {
      this.O00000000.O000000000();
   }

   public boolean O00000000000() {
      return this.O00000000.O00000000((double)this.O000000000);
   }

   public void O000000000000() {
      this.O000000000(this.O00000000000.O00000000());
   }

   public O0000O00OOO0OO O0000000000000() {
      return this.O00000000000;
   }

   public void O000000000(O0000O00OOO0OO o0000O00OOO0OO) {
      if (this.O00000000000 != o0000O00OOO0OO) {
         this.O00000000000 = o0000O00OOO0OO;
         this.O00000000.O00000000(System.currentTimeMillis() - (this.O000000000 - Math.min((long)this.O000000000, this.O00000000.O0000000000())));
      }
   }

   public void O00000000(int i) {
      this.O000000000 = i;
   }

   protected boolean O000000000000O() {
      return false;
   }

   public long O00000000000O() {
      return this.O00000000.O0000000000();
   }

   public float O00000000000O0() {
      if (this.O00000000000 == O0000O00OOO0OO.FORWARDS) {
         return this.O00000000000() ? (float)this.O0000000000 : (float)(this.O000000000(this.O00000000.O0000000000()) * this.O0000000000);
      } else if (this.O00000000000()) {
         return 0.0F;
      } else if (this.O000000000000O()) {
         double var1 = Math.min((long)this.O000000000, Math.max(0L, this.O000000000 - this.O00000000.O0000000000()));
         return (float)(this.O000000000(var1) * this.O0000000000);
      } else {
         return (float)((1.0 - this.O000000000(this.O00000000.O0000000000())) * this.O0000000000);
      }
   }

   protected abstract double O000000000(double d);
}

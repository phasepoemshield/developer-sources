package ru.metaculture.protection;

public class O0000O00OOO0O0 {
   private long O00000000 = -1L;

   public O0000O00OOO0O0() {
      this.O00000000 = System.currentTimeMillis();
   }

   public boolean O00000000(double d) {
      return System.currentTimeMillis() - this.O00000000 >= d;
   }

   public boolean O00000000(boolean bl, double d) {
      return bl || this.O00000000(d);
   }

   public long O00000000() {
      return this.O00000000;
   }

   public void O000000000() {
      this.O00000000 = System.currentTimeMillis();
   }

   public long O0000000000() {
      return System.currentTimeMillis() - this.O00000000;
   }

   public long O00000000000() {
      return System.nanoTime() / 1000000L;
   }

   public void O00000000(long l) {
      this.O00000000 = l;
   }
}

package ru.metaculture.protection;

public class O0000O0O000 {
   private O0000O0O0000 O00000000;
   private long O000000000;
   private long O0000000000;
   private long O00000000000;
   private double O000000000000;
   private double O0000000000000;
   private double O000000000000O;
   private boolean O00000000000O;

   public O0000O0O000(O0000O0O0000 o0000O0O0000, long l) {
      this.O00000000 = o0000O0O0000;
      this.O00000000000 = System.currentTimeMillis();
      this.O000000000 = l;
   }

   public void O00000000(double d) {
      this.O0000000000 = System.currentTimeMillis();
      if (this.O000000000 <= 0L) {
         this.O0000000000000 = d;
         this.O000000000000 = d;
         this.O000000000000O = d;
         this.O00000000000O = true;
      } else {
         if (this.O0000000000000 != d) {
            this.O0000000000000 = d;
            this.O000000000();
         } else {
            this.O00000000000O = this.O0000000000 - this.O00000000000 >= this.O000000000;
            if (this.O00000000000O) {
               this.O000000000000O = d;
               return;
            }
         }

         double var3 = this.O00000000();
         double var5 = this.O00000000.O00000000().apply(var3);
         if (this.O000000000000O > d) {
            this.O000000000000O = this.O000000000000 - (this.O000000000000 - d) * var5;
         } else {
            this.O000000000000O = this.O000000000000 + (d - this.O000000000000) * var5;
         }

         if (var3 >= 1.0) {
            this.O000000000000O = d;
            this.O00000000000O = true;
         }
      }
   }

   public double O00000000() {
      if (this.O000000000 <= 0L) {
         return 1.0;
      } else {
         double var1 = (double)(System.currentTimeMillis() - this.O00000000000) / this.O000000000;
         return Math.max(0.0, Math.min(1.0, var1));
      }
   }

   public void O000000000() {
      this.O00000000000 = System.currentTimeMillis();
      this.O000000000000 = this.O000000000000O;
      this.O00000000000O = false;
   }

   public O0000O0O0000 O0000000000() {
      return this.O00000000;
   }

   public void O00000000(O0000O0O0000 o0000O0O0000) {
      this.O00000000 = o0000O0O0000;
   }

   public long O00000000000() {
      return this.O000000000;
   }

   public void O00000000(long l) {
      this.O000000000 = l;
   }

   public long O000000000000() {
      return this.O0000000000;
   }

   public void O000000000(long l) {
      this.O0000000000 = l;
   }

   public long O0000000000000() {
      return this.O00000000000;
   }

   public void O0000000000(long l) {
      this.O00000000000 = l;
   }

   public double O000000000000O() {
      return this.O000000000000;
   }

   public void O000000000(double d) {
      this.O000000000000 = d;
   }

   public double O00000000000O() {
      return this.O0000000000000;
   }

   public void O0000000000(double d) {
      this.O0000000000000 = d;
   }

   public double O00000000000O0() {
      return this.O000000000000O;
   }

   public void O00000000000(double d) {
      this.O000000000000O = d;
   }

   public boolean O00000000000OO() {
      return this.O00000000000O;
   }

   public void O00000000(boolean bl) {
      this.O00000000000O = bl;
   }
}

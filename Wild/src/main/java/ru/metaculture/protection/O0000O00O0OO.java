package ru.metaculture.protection;

import lombok.Generated;

public class O0000O00O0OO {
   private long O00000000;
   private double O000000000;
   private double O0000000000;
   private double O00000000000;
   private double O000000000000;
   private double O0000000000000;
   private O0000O00O0OO00 O000000000000O = O0000O00O0OO0O.O0000000000000;
   private boolean O00000000000O = false;
   private Runnable O00000000000O0;

   public O0000O00O0OO O00000000(double d, double e) {
      return this.O00000000(d, e, O0000O00O0OO0O.O0000000000000, false);
   }

   public O0000O00O0OO O00000000(double d, double e, O0000O00O0OO00 o0000O00O0OO00) {
      return this.O00000000(d, e, o0000O00O0OO00, false);
   }

   public O0000O00O0OO O00000000(double d, double e, boolean bl) {
      return this.O00000000(d, e, O0000O00O0OO0O.O0000000000000, bl);
   }

   public O0000O00O0OO O00000000(double d, double e, O0000O00O0OO00 o0000O00O0OO00, boolean bl) {
      double var7 = Math.max(0.0, e * 1000.0);
      if (var7 <= 0.0) {
         this.O00000000(o0000O00O0OO00).O00000000(0.0).O00000000(0L).O000000000(d).O0000000000(d).O00000000000(d);
         return this;
      } else if (this.O00000000000OO() != d || this.O000000000000O() == 0L && this.O0000000000O() != d) {
         if (this.O00000000(bl, d)) {
            if (this.O0000000000O0O()) {
               System.out.println("Animate cancelled due to target val equals from val");
            }
         } else {
            this.O00000000(o0000O00O0OO00).O00000000(var7).O00000000(System.currentTimeMillis()).O000000000(this.O0000000000O()).O0000000000(d);
            if (this.O0000000000O0O()) {
               System.out
                  .println(
                     "#animate {\n    to value: "
                        + this.O00000000000OO()
                        + "\n    from value: "
                        + this.O0000000000O()
                        + "\n    duration: "
                        + this.O00000000000O()
                        + "\n}"
                  );
            }
         }

         return this;
      } else {
         this.O00000000(o0000O00O0OO00).O00000000(var7);
         return this;
      }
   }

   public boolean O00000000() {
      this.O000000000000(this.O0000000000O());
      boolean var1 = this.O000000000();
      if (var1) {
         this.O00000000000(this.O00000000(this.O00000000000O0(), this.O00000000000OO(), this.O0000000000O00().ease(this.O00000000000())));
      } else {
         this.O00000000(0L);
         this.O00000000000(this.O00000000000OO());
         if (this.O00000000000O0 != null) {
            this.O00000000000O0.run();
            this.O00000000000O0 = null;
         }
      }

      return var1;
   }

   public boolean O000000000() {
      return !this.O0000000000();
   }

   public boolean O0000000000() {
      return this.O00000000000() >= 1.0;
   }

   public double O00000000000() {
      if (!(this.O00000000000O() <= 0.0) && this.O000000000000O() != 0L) {
         double var1 = (System.currentTimeMillis() - this.O000000000000O()) / this.O00000000000O();
         return Math.max(0.0, Math.min(1.0, var1));
      } else {
         return 1.0;
      }
   }

   public boolean O00000000(boolean bl, double d) {
      return bl && this.O000000000() && (d == this.O00000000000O0() || d == this.O00000000000OO() || d == this.O0000000000O());
   }

   public double O00000000(double d, double e, double f) {
      return d + (e - d) * f;
   }

   public O0000O00O0OO O00000000(long l) {
      this.O00000000 = l;
      return this;
   }

   public O0000O00O0OO O00000000(double d) {
      this.O000000000 = d;
      return this;
   }

   public O0000O00O0OO O000000000(double d) {
      this.O0000000000 = d;
      return this;
   }

   public O0000O00O0OO O0000000000(double d) {
      this.O00000000000 = d;
      return this;
   }

   public O0000O00O0OO O00000000000(double d) {
      this.O000000000000 = d;
      return this;
   }

   public O0000O00O0OO O000000000000(double d) {
      this.O0000000000000 = d;
      return this;
   }

   public O0000O00O0OO O00000000(O0000O00O0OO00 o0000O00O0OO00) {
      this.O000000000000O = o0000O00O0OO00;
      return this;
   }

   public O0000O00O0OO O00000000(boolean bl) {
      this.O00000000000O = bl;
      return this;
   }

   public O0000O00O0OO O00000000(Runnable runnable) {
      this.O00000000000O0 = runnable;
      return this;
   }

   public float O000000000000() {
      return (float)this.O0000000000O();
   }

   public float O0000000000000() {
      return (float)this.O0000000000O0();
   }

   public void O0000000000000(double d) {
      this.O00000000(d, 0.0);
      this.O00000000();
      this.O00000000000(d);
   }

   @Generated
   public long O000000000000O() {
      return this.O00000000;
   }

   @Generated
   public double O00000000000O() {
      return this.O000000000;
   }

   @Generated
   public double O00000000000O0() {
      return this.O0000000000;
   }

   @Generated
   public double O00000000000OO() {
      return this.O00000000000;
   }

   @Generated
   public double O0000000000O() {
      return this.O000000000000;
   }

   @Generated
   public double O0000000000O0() {
      return this.O0000000000000;
   }

   @Generated
   public O0000O00O0OO00 O0000000000O00() {
      return this.O000000000000O;
   }

   @Generated
   public boolean O0000000000O0O() {
      return this.O00000000000O;
   }

   @Generated
   public Runnable O0000000000OO() {
      return this.O00000000000O0;
   }
}

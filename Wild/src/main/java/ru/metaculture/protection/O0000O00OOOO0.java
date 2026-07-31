package ru.metaculture.protection;

public class O0000O00OOOO0 {
   private long O00000000;
   private double O000000000;
   private double O0000000000;
   private double O00000000000;
   private double O000000000000;
   private O0000O0O0 O0000000000000;
   private O0000O00OOOO0O O000000000000O;
   private O0000O00OOOO00 O00000000000O;
   private boolean O00000000000O0;

   public O0000O00OOOO0() {
      this.O0000000000000 = O0000O0O00.O0000000000000;
      this.O000000000000O = new O0000O00OOOOO0();
      this.O00000000000O = O0000O00OOOO00.EASING;
      this.O00000000000O0 = false;
   }

   public O0000O00OOOO0 O00000000(double d, double e) {
      return this.O00000000(d, e, O0000O0O00.O0000000000000, false);
   }

   public O0000O00OOOO0 O00000000(double d, double e, O0000O0O0 o0000O0O0) {
      return this.O00000000(d, e, o0000O0O0, false);
   }

   public O0000O00OOOO0 O00000000(double d, double e, O0000O00OOOO0O o0000O00OOOO0O) {
      return this.O00000000(d, e, o0000O00OOOO0O, false);
   }

   public O0000O00OOOO0 O00000000(double d, double e, boolean bl) {
      return this.O00000000(d, e, O0000O0O00.O0000000000000, bl);
   }

   public O0000O00OOOO0 O00000000(double d, double e, O0000O0O0 o0000O0O0, boolean bl) {
      if (this.O00000000(bl, d)) {
         if (this.O00000000000OO()) {
            System.out.println("Animate cancelled due to target val equals from val");
         }

         return this;
      } else {
         this.O00000000(O0000O00OOOO00.EASING)
            .O00000000(o0000O0O0)
            .O00000000(e * 1000.0)
            .O00000000(System.currentTimeMillis())
            .O000000000(this.O00000000000O0())
            .O0000000000(d);
         if (this.O00000000000OO()) {
            System.out
               .println(
                  "#animate {\n    to value: "
                     + this.O00000000000O()
                     + "\n    from value: "
                     + this.O00000000000O0()
                     + "\n    duration: "
                     + this.O0000000000000()
                     + "\n}"
               );
         }

         return this;
      }
   }

   public O0000O00OOOO0 O00000000(double d, double e, O0000O00OOOO0O o0000O00OOOO0O, boolean bl) {
      if (this.O00000000(bl, d)) {
         if (this.O00000000000OO()) {
            System.out.println("Animate cancelled due to target val equals from val");
         }

         return this;
      } else {
         this.O00000000(O0000O00OOOO00.BEZIER)
            .O00000000(o0000O00OOOO0O)
            .O00000000(e * 1000.0)
            .O00000000(System.currentTimeMillis())
            .O000000000(this.O00000000000O0())
            .O0000000000(d);
         if (this.O00000000000OO()) {
            System.out
               .println(
                  "#animate {\n    to value: "
                     + this.O00000000000O()
                     + "\n    from value: "
                     + this.O00000000000O0()
                     + "\n    duration: "
                     + this.O0000000000000()
                     + "\n    type: "
                     + this.O0000000000O().name()
                     + "\n}"
               );
         }

         return this;
      }
   }

   public boolean O00000000() {
      boolean var1 = this.O000000000();
      if (var1) {
         if (this.O0000000000O().equals(O0000O00OOOO00.BEZIER)) {
            this.O00000000000(this.O00000000(this.O000000000000O(), this.O00000000000O(), this.O0000000000O00().O00000000(this.O00000000000())));
         } else {
            this.O00000000000(this.O00000000(this.O000000000000O(), this.O00000000000O(), this.O0000000000O0().ease(this.O00000000000())));
         }
      } else {
         this.O00000000(0L);
         this.O00000000000(this.O00000000000O());
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
      return (System.currentTimeMillis() - this.O000000000000()) / this.O0000000000000();
   }

   public boolean O00000000(boolean bl, double d) {
      return bl && this.O000000000() && (d == this.O000000000000O() || d == this.O00000000000O() || d == this.O00000000000O0());
   }

   public double O00000000(double d, double e, double f) {
      return d + (e - d) * f;
   }

   public long O000000000000() {
      return this.O00000000;
   }

   public double O0000000000000() {
      return this.O000000000;
   }

   public double O000000000000O() {
      return this.O0000000000;
   }

   public double O00000000000O() {
      return this.O00000000000;
   }

   public double O00000000000O0() {
      return this.O000000000000;
   }

   public boolean O00000000000OO() {
      return this.O00000000000O0;
   }

   public O0000O00OOOO00 O0000000000O() {
      return this.O00000000000O;
   }

   public O0000O0O0 O0000000000O0() {
      return this.O0000000000000;
   }

   public O0000O00OOOO0O O0000000000O00() {
      return this.O000000000000O;
   }

   public O0000O00OOOO0 O00000000(long l) {
      this.O00000000 = l;
      return this;
   }

   public O0000O00OOOO0 O00000000(double d) {
      this.O000000000 = d;
      return this;
   }

   public O0000O00OOOO0 O000000000(double d) {
      this.O0000000000 = d;
      return this;
   }

   public O0000O00OOOO0 O0000000000(double d) {
      this.O00000000000 = d;
      return this;
   }

   public O0000O00OOOO0 O00000000000(double d) {
      this.O000000000000 = d;
      return this;
   }

   public O0000O00OOOO0 O00000000(O0000O0O0 o0000O0O0) {
      this.O0000000000000 = o0000O0O0;
      return this;
   }

   public O0000O00OOOO0 O00000000(boolean bl) {
      this.O00000000000O0 = bl;
      return this;
   }

   public O0000O00OOOO0 O00000000(O0000O00OOOO0O o0000O00OOOO0O) {
      this.O000000000000O = o0000O00OOOO0O;
      return this;
   }

   public O0000O00OOOO0 O00000000(O0000O00OOOO00 o0000O00OOOO00) {
      this.O00000000000O = o0000O00OOOO00;
      return this;
   }
}

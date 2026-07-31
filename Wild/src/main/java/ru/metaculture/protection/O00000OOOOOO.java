package ru.metaculture.protection;

public final class O00000OOOOOO {
   private final int O00000000;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;
   private final float O000000000000;
   private final float O0000000000000;
   private final float O000000000000O;
   private final float O00000000000O;
   private final float O00000000000O0;
   private final O00000OOOOO0OO O00000000000OO;

   O00000OOOOOO(O00000OOOOOO.W325 o00000000) {
      this.O00000000 = o00000000.O00000000;
      this.O000000000 = o00000000.O000000000;
      this.O0000000000 = o00000000.O0000000000;
      this.O00000000000 = o00000000.O00000000000;
      this.O000000000000 = o00000000.O000000000000;
      this.O0000000000000 = o00000000.O0000000000000;
      this.O000000000000O = o00000000.O000000000000O;
      this.O00000000000O = o00000000.O00000000000O;
      this.O00000000000O0 = o00000000.O00000000000O0;
      this.O00000000000OO = o00000000.O00000000000OO;
   }

   public static O00000OOOOOO.W325 O00000000() {
      return new O00000OOOOOO.W325();
   }

   public boolean O00000000(float f, float g, int i) {
      return (this.O00000000 < 0 || this.O00000000 == i)
         && this.O00000000(f, g)
         && f >= this.O000000000
         && g >= this.O0000000000
         && f < this.O000000000 + this.O00000000000
         && g < this.O0000000000 + this.O000000000000;
   }

   public void O00000000(O0000O000O0O0 o0000O000O0O0) {
      if (this.O00000000000OO != null) {
         this.O00000000000OO.execute(o0000O000O0O0);
      }
   }

   private boolean O00000000(float f, float g) {
      return !(this.O00000000000O <= 0.0F) && !(this.O00000000000O0 <= 0.0F)
         ? f >= this.O0000000000000
            && g >= this.O000000000000O
            && f < this.O0000000000000 + this.O00000000000O
            && g < this.O000000000000O + this.O00000000000O0
         : true;
   }

   public static final class W325 {
      int O00000000 = -1;
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      O00000OOOOO0OO O00000000000OO;

      public O00000OOOOOO.W325 O00000000(int i) {
         this.O00000000 = i;
         return this;
      }

      public O00000OOOOOO.W325 O00000000(float f) {
         this.O000000000 = f;
         return this;
      }

      public O00000OOOOOO.W325 O000000000(float f) {
         this.O0000000000 = f;
         return this;
      }

      public O00000OOOOOO.W325 O0000000000(float f) {
         this.O00000000000 = f;
         return this;
      }

      public O00000OOOOOO.W325 O00000000000(float f) {
         this.O000000000000 = f;
         return this;
      }

      public O00000OOOOOO.W325 O000000000000(float f) {
         this.O0000000000000 = f;
         return this;
      }

      public O00000OOOOOO.W325 O0000000000000(float f) {
         this.O000000000000O = f;
         return this;
      }

      public O00000OOOOOO.W325 O000000000000O(float f) {
         this.O00000000000O = f;
         return this;
      }

      public O00000OOOOOO.W325 O00000000000O(float f) {
         this.O00000000000O0 = f;
         return this;
      }

      public O00000OOOOOO.W325 O00000000(O00000OOOOO0OO o00000OOOOO0OO) {
         this.O00000000000OO = o00000OOOOO0OO;
         return this;
      }

      public O00000OOOOOO O00000000() {
         return new O00000OOOOOO(this);
      }
   }
}

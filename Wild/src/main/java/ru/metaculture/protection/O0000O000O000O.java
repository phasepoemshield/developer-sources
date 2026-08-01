package ru.metaculture.protection;

import lombok.Generated;

public final class O0000O000O000O {
   private static final float O00000000 = 0.004166667F;
   private static final float O000000000 = 0.25F;
   private static final int O0000000000 = 60;
   private float O00000000000;
   private float O000000000000;
   private float O0000000000000;
   private long O000000000000O = Long.MIN_VALUE;

   public O0000O000O000O(float f) {
      this.O00000000000 = f;
   }

   public float O00000000(float f, O0000O000O0O00 o0000O000O0O00) {
      O0000O00O0O000 var3 = O0000O00O0O000.O00000000();
      long var4 = var3.O00000000000();
      if (var4 == this.O000000000000O) {
         return this.O00000000000;
      } else {
         this.O000000000000O = var4;
         float var6 = var3.O0000000000();
         if (!Float.isFinite(var6) || var6 <= 0.0F) {
            var6 = 0.004166667F;
         } else if (var6 > 0.25F) {
            var6 = 0.25F;
         }

         this.O0000000000000 += var6;
         int var7 = 0;

         while (this.O0000000000000 >= 0.004166667F && var7 < 60) {
            this.O0000000000(f, o0000O000O0O00);
            this.O0000000000000 -= 0.004166667F;
            var7++;
            if (this.O000000000(f, o0000O000O0O00)) {
               this.O00000000(f);
               break;
            }
         }

         if (var7 == 60) {
            this.O0000000000000 = 0.0F;
         }

         return this.O00000000000;
      }
   }

   private void O0000000000(float f, O0000O000O0O00 o0000O000O0O00) {
      this.O000000000000 = this.O000000000000 + ((f - this.O00000000000) * o0000O000O0O00.O000000000O() - this.O000000000000 * o0000O000O0O00.O000000000O0());
      this.O00000000000 = this.O00000000000 + this.O000000000000;
   }

   public void O00000000(float f) {
      this.O00000000000 = f;
      this.O000000000000 = 0.0F;
      this.O0000000000000 = 0.0F;
   }

   public boolean O000000000(float f, O0000O000O0O00 o0000O000O0O00) {
      return Math.abs(f - this.O00000000000) <= o0000O000O0O00.O000000000O00() && Math.abs(this.O000000000000) <= o0000O000O0O00.O000000000O000();
   }

   @Generated
   public float O00000000() {
      return this.O00000000000;
   }

   @Generated
   public float O000000000() {
      return this.O000000000000;
   }

   @Generated
   public float O0000000000() {
      return this.O0000000000000;
   }

   @Generated
   public long O00000000000() {
      return this.O000000000000O;
   }

   @Generated
   public void O000000000(float f) {
      this.O00000000000 = f;
   }

   @Generated
   public void O0000000000(float f) {
      this.O000000000000 = f;
   }

   @Generated
   public void O00000000000(float f) {
      this.O0000000000000 = f;
   }

   @Generated
   public void O00000000(long l) {
      this.O000000000000O = l;
   }
}

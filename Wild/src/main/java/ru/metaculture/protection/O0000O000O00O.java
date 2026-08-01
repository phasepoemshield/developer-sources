package ru.metaculture.protection;

import lombok.Generated;

public final class O0000O000O00O {
   private static final float O00000000 = 0.004166667F;
   private static final float O000000000 = 1.0E-4F;
   private static final float O0000000000 = 0.016666668F;
   private static final float O00000000000 = 0.25F;
   private static final int O000000000000 = 60;
   private float O0000000000000;
   private float O000000000000O;
   private float O00000000000O;
   private long O00000000000O0 = Long.MIN_VALUE;

   public O0000O000O00O(float f) {
      this.O0000000000000 = f;
   }

   public float O00000000(float f, O0000O000O0O00 o0000O000O0O00) {
      float var3 = this.O0000000000000();
      if (var3 < 0.0F) {
         return this.O0000000000000;
      } else {
         O0000O000O0O00 var4 = o0000O000O0O00 == null ? O0000O000O0O00.O00000000() : o0000O000O0O00;
         this.O00000000000O += var3;
         int var5 = 0;

         while (this.O00000000000O >= 0.004166667F && var5 < 60) {
            this.O0000000000(f, var4);
            this.O00000000000O -= 0.004166667F;
            var5++;
            if (this.O000000000(f, var4)) {
               this.O00000000(f);
               break;
            }
         }

         if (var5 == 60) {
            this.O00000000000O = 0.0F;
         }

         return this.O0000000000000;
      }
   }

   public float O00000000(float f, O0000O000O00O.W345 o00000000) {
      float var3 = this.O0000000000000();
      if (var3 < 0.0F) {
         return this.O0000000000000;
      } else {
         O0000O000O00O.W345 var4 = o00000000 == null ? O0000O000O00O.W345.O00000000() : o00000000;
         float var5 = this.O0000000000000;
         this.O0000000000000 = O00000000(this.O0000000000000, f, var3, var4.O00000000);
         this.O000000000000O = (this.O0000000000000 - var5) / Math.max(var3, 1.0E-4F);
         this.O000000000000O = this.O000000000000O * (float)Math.exp(-var4.O000000000 * var3);
         this.O00000000000O = 0.0F;
         if (Math.abs(f - this.O0000000000000) <= var4.O0000000000 && Math.abs(this.O000000000000O) <= var4.O00000000000) {
            this.O00000000(f);
         }

         return this.O0000000000000;
      }
   }

   public void O00000000(float f) {
      this.O0000000000000 = f;
      this.O000000000000O = 0.0F;
      this.O00000000000O = 0.0F;
   }

   public boolean O000000000(float f, O0000O000O0O00 o0000O000O0O00) {
      O0000O000O0O00 var3 = o0000O000O0O00 == null ? O0000O000O0O00.O00000000() : o0000O000O0O00;
      return Math.abs(f - this.O0000000000000) <= var3.O000000000O00() && Math.abs(this.O000000000000O) <= var3.O000000000O000();
   }

   public static float O00000000() {
      O0000O00O0O000 var0 = O0000O00O0O000.O00000000();
      float var1 = var0.O0000000000();
      if (!Float.isFinite(var1) || var1 <= 0.0F) {
         return 0.016666668F;
      } else {
         return var1 < 1.0E-4F ? 1.0E-4F : Math.min(0.25F, var1);
      }
   }

   public static float O00000000(float f, float g, float h, float i) {
      float var4 = O0000000000000(h);
      float var5 = 1.0F - (float)Math.exp(-Math.max(0.001F, i) * var4);
      return f + (g - f) * var5;
   }

   public static float O000000000(float f, float g, float h, float i) {
      float var4 = 1.0F - (float)Math.exp(-Math.max(0.0F, h) / Math.max(1.0F, i));
      return f + (g - f) * var4;
   }

   public static float O00000000(float f, float g, float h) {
      return f * (float)Math.exp(-Math.max(0.001F, h) * O0000000000000(g));
   }

   public static float O000000000(float f, float g, float h) {
      return Math.abs(f) <= 1.0E-6F ? 0.0F : f * (float)Math.exp(-Math.max(0.0F, g) / Math.max(1.0F, h));
   }

   public static float O000000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }

   public static float O0000000000(float f, float g, float h) {
      float var3 = O000000000(h);
      return f + (g - f) * var3;
   }

   private void O0000000000(float f, O0000O000O0O00 o0000O000O0O00) {
      this.O000000000000O = this.O000000000000O
         + ((f - this.O0000000000000) * o0000O000O0O00.O000000000O() - this.O000000000000O * o0000O000O0O00.O000000000O0());
      this.O0000000000000 = this.O0000000000000 + this.O000000000000O;
   }

   private float O0000000000000() {
      O0000O00O0O000 var1 = O0000O00O0O000.O00000000();
      long var2 = var1.O00000000000();
      if (var2 == this.O00000000000O0) {
         return -1.0F;
      } else {
         this.O00000000000O0 = var2;
         return O00000000();
      }
   }

   private static float O0000000000000(float f) {
      if (!Float.isFinite(f) || f <= 0.0F) {
         return 0.016666668F;
      } else {
         return f < 1.0E-4F ? 1.0E-4F : Math.min(0.25F, f);
      }
   }

   @Generated
   public float O000000000() {
      return this.O0000000000000;
   }

   @Generated
   public float O0000000000() {
      return this.O000000000000O;
   }

   @Generated
   public float O00000000000() {
      return this.O00000000000O;
   }

   @Generated
   public long O000000000000() {
      return this.O00000000000O0;
   }

   @Generated
   public void O0000000000(float f) {
      this.O0000000000000 = f;
   }

   @Generated
   public void O00000000000(float f) {
      this.O000000000000O = f;
   }

   @Generated
   public void O000000000000(float f) {
      this.O00000000000O = f;
   }

   @Generated
   public void O00000000(long l) {
      this.O00000000000O0 = l;
   }

   public static final class W345 {
      final float O00000000;
      final float O000000000;
      final float O0000000000;
      final float O00000000000;

      public W345(float f, float g, float h, float i) {
         this.O00000000 = f;
         this.O000000000 = g;
         this.O0000000000 = h;
         this.O00000000000 = i;
      }

      public static O0000O000O00O.W345 O00000000() {
         return new O0000O000O00O.W345(18.5F, 1.8F, 0.35F, 18.0F);
      }

      public static O0000O000O00O.W345 O000000000() {
         return new O0000O000O00O.W345(15.5F, 2.2F, 0.12F, 8.0F);
      }

      public static O0000O000O00O.W345 O0000000000() {
         return new O0000O000O00O.W345(9.5F, 1.4F, 0.001F, 0.001F);
      }

      @Generated
      public float O00000000000() {
         return this.O00000000;
      }

      @Generated
      public float O000000000000() {
         return this.O000000000;
      }

      @Generated
      public float O0000000000000() {
         return this.O0000000000;
      }

      @Generated
      public float O000000000000O() {
         return this.O00000000000;
      }
   }
}

package ru.metaculture.protection;

import java.awt.Color;
import java.util.Objects;

public final class O00000OO0O0OO0 {
   private final float O00000000;
   private final float O000000000;
   private final float O0000000000;
   private final float O00000000000;

   private O00000OO0O0OO0(float f, float g, float h, float i) {
      this.O00000000 = O000000000000(f);
      this.O000000000 = O0000000000000(g);
      this.O0000000000 = O0000000000000(h);
      this.O00000000000 = O0000000000000(i);
   }

   public static O00000OO0O0OO0 O00000000(float f, float g, float h, float i) {
      return new O00000OO0O0OO0(f, g, h, i);
   }

   public static O00000OO0O0OO0 O00000000(float f, float g, float h) {
      return new O00000OO0O0OO0(f, g, h, 1.0F);
   }

   public static O00000OO0O0OO0 O00000000(int i) {
      int var1 = i >>> 16 & 0xFF;
      int var2 = i >>> 8 & 0xFF;
      int var3 = i & 0xFF;
      int var4 = i >>> 24 & 0xFF;
      float[] var5 = Color.RGBtoHSB(var1, var2, var3, null);
      return new O00000OO0O0OO0(var5[0] * 360.0F, var5[1], var5[2], var4 / 255.0F);
   }

   public float O00000000() {
      return this.O00000000;
   }

   public float O000000000() {
      return this.O000000000;
   }

   public float O0000000000() {
      return this.O0000000000;
   }

   public float O00000000000() {
      return this.O00000000000;
   }

   public O00000OO0O0OO0 O00000000(float f) {
      return new O00000OO0O0OO0(f, this.O000000000, this.O0000000000, this.O00000000000);
   }

   public O00000OO0O0OO0 O000000000(float f) {
      return new O00000OO0O0OO0(this.O00000000, f, this.O0000000000, this.O00000000000);
   }

   public O00000OO0O0OO0 O0000000000(float f) {
      return new O00000OO0O0OO0(this.O00000000, this.O000000000, f, this.O00000000000);
   }

   public O00000OO0O0OO0 O00000000000(float f) {
      return new O00000OO0O0OO0(this.O00000000, this.O000000000, this.O0000000000, f);
   }

   public O00000OO0O0OO0 O000000000000() {
      return this;
   }

   public int O0000000000000() {
      float var1 = this.O00000000 / 360.0F;
      Color var2 = Color.getHSBColor(var1, this.O000000000, this.O0000000000);
      int var3 = var2.getRed();
      int var4 = var2.getGreen();
      int var5 = var2.getBlue();
      int var6 = Math.round(this.O00000000000 * 255.0F);
      return var6 << 24 | var3 << 16 | var4 << 8 | var5;
   }

   @Override
   public boolean equals(Object object) {
      if (this == object) {
         return true;
      } else if (object != null && this.getClass() == object.getClass()) {
         O00000OO0O0OO0 var2 = (O00000OO0O0OO0)object;
         return Float.compare(var2.O00000000, this.O00000000) == 0
            && Float.compare(var2.O000000000, this.O000000000) == 0
            && Float.compare(var2.O0000000000, this.O0000000000) == 0
            && Float.compare(var2.O00000000000, this.O00000000000) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.O00000000, this.O000000000, this.O0000000000, this.O00000000000);
   }

   private static float O000000000000(float f) {
      if (!Float.isFinite(f)) {
         return 0.0F;
      } else {
         float var1 = f % 360.0F;
         if (var1 < 0.0F) {
            var1 += 360.0F;
         }

         return var1;
      }
   }

   private static float O0000000000000(float f) {
      return !(f <= 0.0F) && !Float.isNaN(f) ? Math.min(f, 1.0F) : 0.0F;
   }
}

package ru.metaculture.protection;

import java.awt.Color;
import java.util.Objects;

public final class NUvuNUvvUvvN {
   private final float UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;

   private NUvuNUvvUvvN(float var1, float var2, float var3, float var4) {
      this.UuUVuuUu = uNNnnnuuuN(var1);
      this.C00OOC00oO = nuUnNvnuUu(var2);
      this.uUnuvNvvNU = nuUnNvnuUu(var3);
      this.vVvUvVVuuNvV = nuUnNvnuUu(var4);
   }

   public static NUvuNUvvUvvN UuUVuuUu(float var0, float var1, float var2, float var3) {
      return new NUvuNUvvUvvN(var0, var1, var2, var3);
   }

   public static NUvuNUvvUvvN UuUVuuUu(float var0, float var1, float var2) {
      return new NUvuNUvvUvvN(var0, var1, var2, 1.0F);
   }

   public static NUvuNUvvUvvN UuUVuuUu(int var0) {
      int var1 = var0 >>> 16 & 0xFF;
      int var2 = var0 >>> 8 & 0xFF;
      int var3 = var0 & 0xFF;
      int var4 = var0 >>> 24 & 0xFF;
      float[] var5 = Color.RGBtoHSB(var1, var2, var3, null);
      return new NUvuNUvvUvvN(var5[0] * 360.0F, var5[1], var5[2], var4 / 255.0F);
   }

   public float UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public float C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public float uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public NUvuNUvvUvvN UuUVuuUu(float var1) {
      return new NUvuNUvvUvvN(var1, this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
   }

   public NUvuNUvvUvvN C00OOC00oO(float var1) {
      return new NUvuNUvvUvvN(this.UuUVuuUu, var1, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
   }

   public NUvuNUvvUvvN uUnuvNvvNU(float var1) {
      return new NUvuNUvvUvvN(this.UuUVuuUu, this.C00OOC00oO, var1, this.vVvUvVVuuNvV);
   }

   public NUvuNUvvUvvN vVvUvVVuuNvV(float var1) {
      return new NUvuNUvvUvvN(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU, var1);
   }

   public NUvuNUvvUvvN uNNnnnuuuN() {
      return this;
   }

   public int nuUnNvnuUu() {
      float var1 = this.UuUVuuUu / 360.0F;
      Color var2 = Color.getHSBColor(var1, this.C00OOC00oO, this.uUnuvNvvNU);
      int var3 = var2.getRed();
      int var4 = var2.getGreen();
      int var5 = var2.getBlue();
      int var6 = Math.round(this.vVvUvVVuuNvV * 255.0F);
      return var6 << 24 | var3 << 16 | var4 << 8 | var5;
   }

   @Override
   public boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && this.getClass() == var1.getClass()) {
         NUvuNUvvUvvN var2 = (NUvuNUvvUvvN)var1;
         return Float.compare(var2.UuUVuuUu, this.UuUVuuUu) == 0
            && Float.compare(var2.C00OOC00oO, this.C00OOC00oO) == 0
            && Float.compare(var2.uUnuvNvvNU, this.uUnuvNvvNU) == 0
            && Float.compare(var2.vVvUvVVuuNvV, this.vVvUvVVuuNvV) == 0;
      } else {
         return false;
      }
   }

   @Override
   public int hashCode() {
      return Objects.hash(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
   }

   private static float uNNnnnuuuN(float var0) {
      if (!Float.isFinite(var0)) {
         return 0.0F;
      } else {
         float var1 = var0 % 360.0F;
         if (var1 < 0.0F) {
            var1 += 360.0F;
         }

         return var1;
      }
   }

   private static float nuUnNvnuUu(float var0) {
      return !(var0 <= 0.0F) && !Float.isNaN(var0) ? Math.min(var0, 1.0F) : 0.0F;
   }
}

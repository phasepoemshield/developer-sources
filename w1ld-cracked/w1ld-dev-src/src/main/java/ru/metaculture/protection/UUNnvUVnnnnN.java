package ru.metaculture.protection;

import lombok.Generated;

public final class UUNnvUVnnnnN {
   private static final float UuUVuuUu = 0.004166667F;
   private static final float C00OOC00oO = 1.0E-4F;
   private static final float uUnuvNvvNU = 0.016666668F;
   private static final float vVvUvVVuuNvV = 0.25F;
   private static final int uNNnnnuuuN = 60;
   private float nuUnNvnuUu;
   private float VVuuUN;
   private float vNUvnnVnUvu;
   private long uVUuuVnNVU = Long.MIN_VALUE;

   public UUNnvUVnnnnN(float var1) {
      this.nuUnNvnuUu = var1;
   }

   public float UuUVuuUu(float var1, Cc0cOoOcC0o var2) {
      float var3 = this.nuUnNvnuUu();
      if (var3 < 0.0F) {
         return this.nuUnNvnuUu;
      } else {
         Cc0cOoOcC0o var4 = var2 == null ? Cc0cOoOcC0o.UuUVuuUu() : var2;
         this.vNUvnnVnUvu += var3;
         int var5 = 0;

         while (this.vNUvnnVnUvu >= 0.004166667F && var5 < 60) {
            this.uUnuvNvvNU(var1, var4);
            this.vNUvnnVnUvu -= 0.004166667F;
            var5++;
            if (this.C00OOC00oO(var1, var4)) {
               this.UuUVuuUu(var1);
               break;
            }
         }

         if (var5 == 60) {
            this.vNUvnnVnUvu = 0.0F;
         }

         return this.nuUnNvnuUu;
      }
   }

   public float UuUVuuUu(float var1, UUNnvUVnnnnN.NVnVnNnN var2) {
      float var3 = this.nuUnNvnuUu();
      if (var3 < 0.0F) {
         return this.nuUnNvnuUu;
      } else {
         UUNnvUVnnnnN.NVnVnNnN var4 = var2 == null ? UUNnvUVnnnnN.NVnVnNnN.UuUVuuUu() : var2;
         float var5 = this.nuUnNvnuUu;
         this.nuUnNvnuUu = UuUVuuUu(this.nuUnNvnuUu, var1, var3, var4.UuUVuuUu);
         this.VVuuUN = (this.nuUnNvnuUu - var5) / Math.max(var3, 1.0E-4F);
         this.VVuuUN = this.VVuuUN * (float)Math.exp(-var4.C00OOC00oO * var3);
         this.vNUvnnVnUvu = 0.0F;
         if (Math.abs(var1 - this.nuUnNvnuUu) <= var4.uUnuvNvvNU && Math.abs(this.VVuuUN) <= var4.vVvUvVVuuNvV) {
            this.UuUVuuUu(var1);
         }

         return this.nuUnNvnuUu;
      }
   }

   public void UuUVuuUu(float var1) {
      this.nuUnNvnuUu = var1;
      this.VVuuUN = 0.0F;
      this.vNUvnnVnUvu = 0.0F;
   }

   public boolean C00OOC00oO(float var1, Cc0cOoOcC0o var2) {
      Cc0cOoOcC0o var3 = var2 == null ? Cc0cOoOcC0o.UuUVuuUu() : var2;
      return Math.abs(var1 - this.nuUnNvnuUu) <= var3.UNnVVNvvnVvU() && Math.abs(this.VVuuUN) <= var3.uNnUnnuNUnNu();
   }

   public static float UuUVuuUu() {
      vvUnNVVnV var0 = vvUnNVVnV.UuUVuuUu();
      float var1 = var0.uUnuvNvvNU();
      if (!Float.isFinite(var1) || var1 <= 0.0F) {
         return 0.016666668F;
      } else {
         return var1 < 1.0E-4F ? 1.0E-4F : Math.min(0.25F, var1);
      }
   }

   public static float UuUVuuUu(float var0, float var1, float var2, float var3) {
      float var4 = nuUnNvnuUu(var2);
      float var5 = 1.0F - (float)Math.exp(-Math.max(0.001F, var3) * var4);
      return var0 + (var1 - var0) * var5;
   }

   public static float C00OOC00oO(float var0, float var1, float var2, float var3) {
      float var4 = 1.0F - (float)Math.exp(-Math.max(0.0F, var2) / Math.max(1.0F, var3));
      return var0 + (var1 - var0) * var4;
   }

   public static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 * (float)Math.exp(-Math.max(0.001F, var2) * nuUnNvnuUu(var1));
   }

   public static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.abs(var0) <= 1.0E-6F ? 0.0F : var0 * (float)Math.exp(-Math.max(0.0F, var1) / Math.max(1.0F, var2));
   }

   public static float C00OOC00oO(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   public static float uUnuvNvvNU(float var0, float var1, float var2) {
      float var3 = C00OOC00oO(var2);
      return var0 + (var1 - var0) * var3;
   }

   private void uUnuvNvvNU(float var1, Cc0cOoOcC0o var2) {
      this.VVuuUN = this.VVuuUN + ((var1 - this.nuUnNvnuUu) * var2.NVNnnvnuunNv() - this.VVuuUN * var2.uVunuUNVVUUV());
      this.nuUnNvnuUu = this.nuUnNvnuUu + this.VVuuUN;
   }

   private float nuUnNvnuUu() {
      vvUnNVVnV var1 = vvUnNVVnV.UuUVuuUu();
      long var2 = var1.vVvUvVVuuNvV();
      if (var2 == this.uVUuuVnNVU) {
         return -1.0F;
      } else {
         this.uVUuuVnNVU = var2;
         return UuUVuuUu();
      }
   }

   private static float nuUnNvnuUu(float var0) {
      if (!Float.isFinite(var0) || var0 <= 0.0F) {
         return 0.016666668F;
      } else {
         return var0 < 1.0E-4F ? 1.0E-4F : Math.min(0.25F, var0);
      }
   }

   @Generated
   public float C00OOC00oO() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public float uUnuvNvvNU() {
      return this.VVuuUN;
   }

   @Generated
   public float vVvUvVVuuNvV() {
      return this.vNUvnnVnUvu;
   }

   @Generated
   public long uNNnnnuuuN() {
      return this.uVUuuVnNVU;
   }

   @Generated
   public void uUnuvNvvNU(float var1) {
      this.nuUnNvnuUu = var1;
   }

   @Generated
   public void vVvUvVVuuNvV(float var1) {
      this.VVuuUN = var1;
   }

   @Generated
   public void uNNnnnuuuN(float var1) {
      this.vNUvnnVnUvu = var1;
   }

   @Generated
   public void UuUVuuUu(long var1) {
      this.uVUuuVnNVU = var1;
   }

   public static final class NVnVnNnN {
      final float UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;

      public NVnVnNnN(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }

      public static UUNnvUVnnnnN.NVnVnNnN UuUVuuUu() {
         return new UUNnvUVnnnnN.NVnVnNnN(18.5F, 1.8F, 0.35F, 18.0F);
      }

      public static UUNnvUVnnnnN.NVnVnNnN C00OOC00oO() {
         return new UUNnvUVnnnnN.NVnVnNnN(15.5F, 2.2F, 0.12F, 8.0F);
      }

      public static UUNnvUVnnnnN.NVnVnNnN uUnuvNvvNU() {
         return new UUNnvUVnnnnN.NVnVnNnN(9.5F, 1.4F, 0.001F, 0.001F);
      }

      @Generated
      public float vVvUvVVuuNvV() {
         return this.UuUVuuUu;
      }

      @Generated
      public float uNNnnnuuuN() {
         return this.C00OOC00oO;
      }

      @Generated
      public float nuUnNvnuUu() {
         return this.uUnuvNvvNU;
      }

      @Generated
      public float VVuuUN() {
         return this.vVvUvVVuuNvV;
      }
   }
}

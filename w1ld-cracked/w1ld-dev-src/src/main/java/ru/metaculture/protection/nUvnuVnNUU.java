package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_310;

public final class nUvnuVnNUU {
   private final float UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private final float VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final float vuuuNvNuv;
   private final float nvUVNnuu;
   private final float UuuNnUvUuv;
   private final float nUUVuvU;
   private final float UnUNVVVNuv;
   private final float vNVuvnUUnuUn;
   private final float UvnvNVnnnnNU;
   private final float uVUVnuvnuVuv;
   private final float NVNnnvnuunNv;
   private final float uVunuUNVVUUV;

   public static nUvnuVnNUU UuUVuuUu(class_310 var0, VvuVNnN var1) {
      return var0 != null && var0.method_22683() != null && var0.method_22683().method_4489() > 0 && var0.method_22683().method_4506() > 0
         ? UuUVuuUu(var0.method_22683().method_4489(), var0.method_22683().method_4506(), UuUVuuUu(var0), var1)
         : UuUVuuUu(var1.uNnUnnuNUnNu(), var1);
   }

   public static nUvnuVnNUU UuUVuuUu(float var0, float var1, VvuVNnN var2) {
      return UuUVuuUu(var0, var1, 1.0F, var2);
   }

   public static nUvnuVnNUU UuUVuuUu(float var0, float var1, float var2, VvuVNnN var3) {
      if (!(var0 <= 0.0F) && !(var1 <= 0.0F)) {
         float var4 = 16.0F;
         float var5 = (var0 - var4 * 2.0F) / var3.uUnuvNvvNU();
         float var6 = (var1 - var4 * 2.0F) / var3.vVvUvVVuuNvV();
         float var7 = Math.min(var5, var6);
         float var8 = Math.max(1.0F, var2);
         float var9 = 0.68F + Math.min(var8, 2.0F) * 0.28F;
         float var10 = Math.max(var3.UNnVVNvvnVvU(), Math.min(var3.uNnUnnuNUnNu(), var9 * uNnUnnuNUnNu()));
         float var11 = Math.min(var10, var7);
         var11 = Math.max(var3.UNnVVNvvnVvU(), Math.min(var3.uNnUnnuNUnNu(), var11));
         float var12 = Math.max(var3.UNnVVNvvnVvU(), Math.min(var3.uNnUnnuNUnNu(), var9 * NnUuNNU()));
         float var13 = Math.max(var3.UNnVVNvvnVvU(), Math.min(var3.uNnUnnuNUnNu(), var12));
         return C00OOC00oO(var11, var13, var3);
      } else {
         return UuUVuuUu(var3.uNnUnnuNUnNu(), var3);
      }
   }

   public static nUvnuVnNUU UuUVuuUu(float var0, VvuVNnN var1) {
      return C00OOC00oO(var0, var0, var1);
   }

   public static nUvnuVnNUU C00OOC00oO(float var0, float var1, VvuVNnN var2) {
      return UuUVuuUu()
         .UuUVuuUu(var0)
         .C00OOC00oO(var1)
         .uUnuvNvvNU(Math.round(var2.uUnuvNvvNU() * var0))
         .vVvUvVVuuNvV(Math.round(var2.vVvUvVVuuNvV() * var0))
         .uNNnnnuuuN(var2.uNNnnnuuuN() * var0)
         .nuUnNvnuUu(var2.nuUnNvnuUu() * var0)
         .VVuuUN(var2.VVuuUN() * var0)
         .vNUvnnVnUvu(var2.vNUvnnVnUvu() * var0)
         .uVUuuVnNVU(var2.uVUuuVnNVU() * var0)
         .vuuuNvNuv(var2.vuuuNvNuv() * var0)
         .nvUVNnuu(var2.nvUVNnuu() * var0)
         .UuuNnUvUuv(var2.UuuNnUvUuv() * var0)
         .nUUVuvU(var2.nUUVuvU() * var0)
         .UnUNVVVNuv(var2.UnUNVVVNuv() * var0)
         .vNVuvnUUnuUn(var2.vNVuvnUUnuUn() * var0)
         .UvnvNVnnnnNU(var2.UvnvNVnnnnNU() * var0)
         .uVUVnuvnuVuv(var2.uVUVnuvnuVuv() * var0)
         .NVNnnvnuunNv(Math.round(var2.NVNnnvnuunNv() * var1))
         .uVunuUNVVUUV(Math.round(var2.uVunuUNVVUUV() * var1))
         .UuUVuuUu();
   }

   public float UuUVuuUu(float var1) {
      return var1 * this.UuUVuuUu;
   }

   public float C00OOC00oO(float var1) {
      return var1 * this.C00OOC00oO;
   }

   public nUvnuVnNUU uUnuvNvvNU(float var1) {
      return UuUVuuUu()
         .UuUVuuUu(var1)
         .C00OOC00oO(this.C00OOC00oO)
         .uUnuvNvvNU(this.uUnuvNvvNU)
         .vVvUvVVuuNvV(this.vVvUvVVuuNvV)
         .uNNnnnuuuN(this.uNNnnnuuuN)
         .nuUnNvnuUu(this.nuUnNvnuUu)
         .VVuuUN(this.VVuuUN)
         .vNUvnnVnUvu(this.vNUvnnVnUvu)
         .uVUuuVnNVU(this.uVUuuVnNVU)
         .vuuuNvNuv(this.vuuuNvNuv)
         .nvUVNnuu(this.nvUVNnuu)
         .UuuNnUvUuv(this.UuuNnUvUuv)
         .nUUVuvU(this.nUUVuvU)
         .UnUNVVVNuv(this.UnUNVVVNuv)
         .vNVuvnUUnuUn(this.vNVuvnUUnuUn)
         .UvnvNVnnnnNU(this.UvnvNVnnnnNU)
         .uVUVnuvnuVuv(this.uVUVnuvnuVuv)
         .NVNnnvnuunNv(this.NVNnnvnuunNv)
         .uVunuUNVVUUV(this.uVunuUNVVUUV)
         .UuUVuuUu();
   }

   private static float UuUVuuUu(class_310 var0) {
      if (var0 != null && var0.method_22683() != null) {
         try {
            return Math.max(1.0F, (float)var0.method_22683().method_4495());
         } catch (Exception var3) {
            int var2 = Math.max(1, var0.method_22683().method_4486());
            return Math.max(1.0F, (float)var0.method_22683().method_4489() / var2);
         }
      } else {
         return 1.0F;
      }
   }

   private static float uNnUnnuNUnNu() {
      try {
         return Menu.c0oOOCcCoC0 == null ? 0.86F : Math.max(0.72F, Math.min(1.7F, Menu.c0oOOCcCoC0.uUnuvNvvNU()));
      } catch (Throwable var1) {
         return 0.86F;
      }
   }

   private static float NnUuNNU() {
      try {
         return Menu.VVnVNnunVvu == null ? 0.86F : Math.max(0.72F, Math.min(1.7F, Menu.VVnVNnunVvu.uUnuvNvvNU()));
      } catch (Throwable var1) {
         return 0.86F;
      }
   }

   @Generated
   nUvnuVnNUU(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17,
      float var18,
      float var19
   ) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
      this.nuUnNvnuUu = var6;
      this.VVuuUN = var7;
      this.vNUvnnVnUvu = var8;
      this.uVUuuVnNVU = var9;
      this.vuuuNvNuv = var10;
      this.nvUVNnuu = var11;
      this.UuuNnUvUuv = var12;
      this.nUUVuvU = var13;
      this.UnUNVVVNuv = var14;
      this.vNVuvnUUnuUn = var15;
      this.UvnvNVnnnnNU = var16;
      this.uVUVnuvnuVuv = var17;
      this.NVNnnvnuunNv = var18;
      this.uVunuUNVVUUV = var19;
   }

   @Generated
   public static nUvnuVnNUU.NVnVnNnN UuUVuuUu() {
      return new nUvnuVnNUU.NVnVnNnN();
   }

   @Generated
   public float C00OOC00oO() {
      return this.UuUVuuUu;
   }

   @Generated
   public float uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   @Generated
   public float vVvUvVVuuNvV() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public float uNNnnnuuuN() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   public float nuUnNvnuUu() {
      return this.uNNnnnuuuN;
   }

   @Generated
   public float VVuuUN() {
      return this.nuUnNvnuUu;
   }

   @Generated
   public float vNUvnnVnUvu() {
      return this.VVuuUN;
   }

   @Generated
   public float uVUuuVnNVU() {
      return this.vNUvnnVnUvu;
   }

   @Generated
   public float vuuuNvNuv() {
      return this.uVUuuVnNVU;
   }

   @Generated
   public float nvUVNnuu() {
      return this.vuuuNvNuv;
   }

   @Generated
   public float UuuNnUvUuv() {
      return this.nvUVNnuu;
   }

   @Generated
   public float nUUVuvU() {
      return this.UuuNnUvUuv;
   }

   @Generated
   public float UnUNVVVNuv() {
      return this.nUUVuvU;
   }

   @Generated
   public float vNVuvnUUnuUn() {
      return this.UnUNVVVNuv;
   }

   @Generated
   public float UvnvNVnnnnNU() {
      return this.vNVuvnUUnuUn;
   }

   @Generated
   public float uVUVnuvnuVuv() {
      return this.UvnvNVnnnnNU;
   }

   @Generated
   public float NVNnnvnuunNv() {
      return this.uVUVnuvnuVuv;
   }

   @Generated
   public float uVunuUNVVUUV() {
      return this.NVNnnvnuunNv;
   }

   @Generated
   public float UNnVVNvvnVvU() {
      return this.uVunuUNVVUUV;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof nUvnuVnNUU var2)) {
         return false;
      } else if (Float.compare(this.C00OOC00oO(), var2.C00OOC00oO()) != 0) {
         return false;
      } else if (Float.compare(this.uUnuvNvvNU(), var2.uUnuvNvvNU()) != 0) {
         return false;
      } else if (Float.compare(this.vVvUvVVuuNvV(), var2.vVvUvVVuuNvV()) != 0) {
         return false;
      } else if (Float.compare(this.uNNnnnuuuN(), var2.uNNnnnuuuN()) != 0) {
         return false;
      } else if (Float.compare(this.nuUnNvnuUu(), var2.nuUnNvnuUu()) != 0) {
         return false;
      } else if (Float.compare(this.VVuuUN(), var2.VVuuUN()) != 0) {
         return false;
      } else if (Float.compare(this.vNUvnnVnUvu(), var2.vNUvnnVnUvu()) != 0) {
         return false;
      } else if (Float.compare(this.uVUuuVnNVU(), var2.uVUuuVnNVU()) != 0) {
         return false;
      } else if (Float.compare(this.vuuuNvNuv(), var2.vuuuNvNuv()) != 0) {
         return false;
      } else if (Float.compare(this.nvUVNnuu(), var2.nvUVNnuu()) != 0) {
         return false;
      } else if (Float.compare(this.UuuNnUvUuv(), var2.UuuNnUvUuv()) != 0) {
         return false;
      } else if (Float.compare(this.nUUVuvU(), var2.nUUVuvU()) != 0) {
         return false;
      } else if (Float.compare(this.UnUNVVVNuv(), var2.UnUNVVVNuv()) != 0) {
         return false;
      } else if (Float.compare(this.vNVuvnUUnuUn(), var2.vNVuvnUUnuUn()) != 0) {
         return false;
      } else if (Float.compare(this.UvnvNVnnnnNU(), var2.UvnvNVnnnnNU()) != 0) {
         return false;
      } else if (Float.compare(this.uVUVnuvnuVuv(), var2.uVUVnuvnuVuv()) != 0) {
         return false;
      } else if (Float.compare(this.NVNnnvnuunNv(), var2.NVNnnvnuunNv()) != 0) {
         return false;
      } else {
         return Float.compare(this.uVunuUNVVUUV(), var2.uVunuUNVVUUV()) != 0 ? false : Float.compare(this.UNnVVNvvnVvU(), var2.UNnVVNvvnVvU()) == 0;
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      var2 = var2 * 59 + Float.floatToIntBits(this.C00OOC00oO());
      var2 = var2 * 59 + Float.floatToIntBits(this.uUnuvNvvNU());
      var2 = var2 * 59 + Float.floatToIntBits(this.vVvUvVVuuNvV());
      var2 = var2 * 59 + Float.floatToIntBits(this.uNNnnnuuuN());
      var2 = var2 * 59 + Float.floatToIntBits(this.nuUnNvnuUu());
      var2 = var2 * 59 + Float.floatToIntBits(this.VVuuUN());
      var2 = var2 * 59 + Float.floatToIntBits(this.vNUvnnVnUvu());
      var2 = var2 * 59 + Float.floatToIntBits(this.uVUuuVnNVU());
      var2 = var2 * 59 + Float.floatToIntBits(this.vuuuNvNuv());
      var2 = var2 * 59 + Float.floatToIntBits(this.nvUVNnuu());
      var2 = var2 * 59 + Float.floatToIntBits(this.UuuNnUvUuv());
      var2 = var2 * 59 + Float.floatToIntBits(this.nUUVuvU());
      var2 = var2 * 59 + Float.floatToIntBits(this.UnUNVVVNuv());
      var2 = var2 * 59 + Float.floatToIntBits(this.vNVuvnUUnuUn());
      var2 = var2 * 59 + Float.floatToIntBits(this.UvnvNVnnnnNU());
      var2 = var2 * 59 + Float.floatToIntBits(this.uVUVnuvnuVuv());
      var2 = var2 * 59 + Float.floatToIntBits(this.NVNnnvnuunNv());
      var2 = var2 * 59 + Float.floatToIntBits(this.uVunuUNVVUUV());
      return var2 * 59 + Float.floatToIntBits(this.UNnVVNvvnVvU());
   }

   @Generated
   @Override
   public String toString() {
      return "Metrics(scale="
         + this.C00OOC00oO()
         + ", themeScale="
         + this.uUnuvNvvNU()
         + ", guiW="
         + this.vVvUvVVuuNvV()
         + ", guiH="
         + this.uNNnnnuuuN()
         + ", padding="
         + this.nuUnNvnuUu()
         + ", gap="
         + this.VVuuUN()
         + ", sidebarW="
         + this.vNUvnnVnUvu()
         + ", bodyW="
         + this.uVUuuVnNVU()
         + ", bodyH="
         + this.vuuuNvNuv()
         + ", headerH="
         + this.nvUVNnuu()
         + ", searchW="
         + this.UuuNnUvUuv()
         + ", contentH="
         + this.nUUVuvU()
         + ", contentPadding="
         + this.UnUNVVVNuv()
         + ", columnW="
         + this.vNVuvnUUnuUn()
         + ", moduleHeaderH="
         + this.UvnvNVnnnnNU()
         + ", moduleGap="
         + this.uVUVnuvnuVuv()
         + ", scrollbarW="
         + this.NVNnnvnuunNv()
         + ", themeW="
         + this.uVunuUNVVUUV()
         + ", themeH="
         + this.UNnVVNvvnVvU()
         + ")";
   }

   @Generated
   public static class NVnVnNnN {
      @Generated
      private float UuUVuuUu;
      @Generated
      private float C00OOC00oO;
      @Generated
      private float uUnuvNvvNU;
      @Generated
      private float vVvUvVVuuNvV;
      @Generated
      private float uNNnnnuuuN;
      @Generated
      private float nuUnNvnuUu;
      @Generated
      private float VVuuUN;
      @Generated
      private float vNUvnnVnUvu;
      @Generated
      private float uVUuuVnNVU;
      @Generated
      private float vuuuNvNuv;
      @Generated
      private float nvUVNnuu;
      @Generated
      private float UuuNnUvUuv;
      @Generated
      private float nUUVuvU;
      @Generated
      private float UnUNVVVNuv;
      @Generated
      private float vNVuvnUUnuUn;
      @Generated
      private float UvnvNVnnnnNU;
      @Generated
      private float uVUVnuvnuVuv;
      @Generated
      private float NVNnnvnuunNv;
      @Generated
      private float uVunuUNVVUUV;

      @Generated
      NVnVnNnN() {
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN UuUVuuUu(float var1) {
         this.UuUVuuUu = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN C00OOC00oO(float var1) {
         this.C00OOC00oO = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN uUnuvNvvNU(float var1) {
         this.uUnuvNvvNU = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN vVvUvVVuuNvV(float var1) {
         this.vVvUvVVuuNvV = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN uNNnnnuuuN(float var1) {
         this.uNNnnnuuuN = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN nuUnNvnuUu(float var1) {
         this.nuUnNvnuUu = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN VVuuUN(float var1) {
         this.VVuuUN = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN vNUvnnVnUvu(float var1) {
         this.vNUvnnVnUvu = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN uVUuuVnNVU(float var1) {
         this.uVUuuVnNVU = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN vuuuNvNuv(float var1) {
         this.vuuuNvNuv = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN nvUVNnuu(float var1) {
         this.nvUVNnuu = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN UuuNnUvUuv(float var1) {
         this.UuuNnUvUuv = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN nUUVuvU(float var1) {
         this.nUUVuvU = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN UnUNVVVNuv(float var1) {
         this.UnUNVVVNuv = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN vNVuvnUUnuUn(float var1) {
         this.vNVuvnUUnuUn = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN UvnvNVnnnnNU(float var1) {
         this.UvnvNVnnnnNU = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN uVUVnuvnuVuv(float var1) {
         this.uVUVnuvnuVuv = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN NVNnnvnuunNv(float var1) {
         this.NVNnnvnuunNv = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU.NVnVnNnN uVunuUNVVUUV(float var1) {
         this.uVunuUNVVUUV = var1;
         return this;
      }

      @Generated
      public nUvnuVnNUU UuUVuuUu() {
         return new nUvnuVnNUU(
            this.UuUVuuUu,
            this.C00OOC00oO,
            this.uUnuvNvvNU,
            this.vVvUvVVuuNvV,
            this.uNNnnnuuuN,
            this.nuUnNvnuUu,
            this.VVuuUN,
            this.vNUvnnVnUvu,
            this.uVUuuVnNVU,
            this.vuuuNvNuv,
            this.nvUVNnuu,
            this.UuuNnUvUuv,
            this.nUUVuvU,
            this.UnUNVVVNuv,
            this.vNVuvnUUnuUn,
            this.UvnvNVnnnnNU,
            this.uVUVnuvnuVuv,
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV
         );
      }

      @Generated
      @Override
      public String toString() {
         return "Metrics.MetricsBuilder(scale="
            + this.UuUVuuUu
            + ", themeScale="
            + this.C00OOC00oO
            + ", guiW="
            + this.uUnuvNvvNU
            + ", guiH="
            + this.vVvUvVVuuNvV
            + ", padding="
            + this.uNNnnnuuuN
            + ", gap="
            + this.nuUnNvnuUu
            + ", sidebarW="
            + this.VVuuUN
            + ", bodyW="
            + this.vNUvnnVnUvu
            + ", bodyH="
            + this.uVUuuVnNVU
            + ", headerH="
            + this.vuuuNvNuv
            + ", searchW="
            + this.nvUVNnuu
            + ", contentH="
            + this.UuuNnUvUuv
            + ", contentPadding="
            + this.nUUVuvU
            + ", columnW="
            + this.UnUNVVVNuv
            + ", moduleHeaderH="
            + this.vNVuvnUUnuUn
            + ", moduleGap="
            + this.UvnvNVnnnnNU
            + ", scrollbarW="
            + this.uVUVnuvnuVuv
            + ", themeW="
            + this.NVNnnvnuunNv
            + ", themeH="
            + this.uVunuUNVVUUV
            + ")";
      }
   }
}

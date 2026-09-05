package ru.metaculture.protection;

public final class NVUVNNunvvNN {
   private final int UuUVuuUu;
   private final float C00OOC00oO;
   private final float uUnuvNvvNU;
   private final float vVvUvVVuuNvV;
   private final float uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private final float VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private final boolean vuuuNvNuv;
   private final float nvUVNnuu;
   private final float UuuNnUvUuv;
   private final float nUUVuvU;
   private final float UnUNVVVNuv;
   private final boolean vNVuvnUUnuUn;
   private final float UvnvNVnnnnNU;
   private final float uVUVnuvnuVuv;
   private final float NVNnnvnuunNv;
   private final float uVunuUNVVUUV;
   private final float UNnVVNvvnVvU;
   private final UnnVVvuuvnUv uNnUnnuNUnNu;

   NVUVNNunvvNN(NVUVNNunvvNN.NVnVnNnN var1) {
      this.UuUVuuUu = var1.UuUVuuUu;
      this.C00OOC00oO = var1.C00OOC00oO;
      this.uUnuvNvvNU = var1.uUnuvNvvNU;
      this.vVvUvVVuuNvV = var1.vVvUvVVuuNvV;
      this.uNNnnnuuuN = var1.uNNnnnuuuN;
      this.nuUnNvnuUu = var1.nuUnNvnuUu;
      this.VVuuUN = var1.VVuuUN;
      this.vNUvnnVnUvu = var1.vNUvnnVnUvu;
      this.uVUuuVnNVU = var1.uVUuuVnNVU;
      this.vuuuNvNuv = var1.vNUvnnVnUvu > 0.0F && var1.uVUuuVnNVU > 0.0F;
      this.nvUVNnuu = 0.0F;
      this.UuuNnUvUuv = 0.0F;
      this.nUUVuvU = 0.0F;
      this.UnUNVVVNuv = 0.0F;
      this.vNVuvnUUnuUn = false;
      this.UvnvNVnnnnNU = 1.0F;
      this.uVUVnuvnuVuv = 0.0F;
      this.NVNnnvnuunNv = 0.0F;
      this.uVunuUNVVUUV = 0.0F;
      this.UNnVVNvvnVvU = 0.0F;
      this.uNnUnnuNUnNu = var1.vuuuNvNuv;
   }

   private NVUVNNunvvNN(
      NVUVNNunvvNN var1,
      float var2,
      float var3,
      float var4,
      float var5,
      boolean var6,
      float var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.UuUVuuUu = var1.UuUVuuUu;
      this.C00OOC00oO = var1.C00OOC00oO;
      this.uUnuvNvvNU = var1.uUnuvNvvNU;
      this.vVvUvVVuuNvV = var1.vVvUvVVuuNvV;
      this.uNNnnnuuuN = var1.uNNnnnuuuN;
      this.nuUnNvnuUu = var2;
      this.VVuuUN = var3;
      this.vNUvnnVnUvu = var4;
      this.uVUuuVnNVU = var5;
      this.vuuuNvNuv = var6;
      this.nvUVNnuu = var7;
      this.UuuNnUvUuv = var8;
      this.nUUVuvU = var9;
      this.UnUNVVVNuv = var10;
      this.vNVuvnUUnuUn = var11;
      this.UvnvNVnnnnNU = Math.max(0.001F, var12);
      this.uVUVnuvnuVuv = var13;
      this.NVNnnvnuunNv = var14;
      this.uVunuUNVVUUV = var15;
      this.UNnVVNvvnVvU = var16;
      this.uNnUnnuNUnNu = var1.uNnUnnuNUnNu;
   }

   public static NVUVNNunvvNN.NVnVnNnN UuUVuuUu() {
      return new NVUVNNunvvNN.NVnVnNnN();
   }

   public boolean UuUVuuUu(float var1, float var2, int var3) {
      if ((this.UuUVuuUu < 0 || this.UuUVuuUu == var3) && this.UuUVuuUu(var1, var2)) {
         float var4 = this.UuUVuuUu(var1);
         float var5 = this.C00OOC00oO(var2);
         return this.C00OOC00oO(var4, var5)
            && var4 >= this.C00OOC00oO
            && var5 >= this.uUnuvNvvNU
            && var4 < this.C00OOC00oO + this.vVvUvVVuuNvV
            && var5 < this.uUnuvNvvNU + this.uNNnnnuuuN;
      } else {
         return false;
      }
   }

   public float UuUVuuUu(float var1) {
      return this.uVUVnuvnuVuv + (var1 - this.uVunuUNVVUUV - this.uVUVnuvnuVuv) / this.UvnvNVnnnnNU;
   }

   public float C00OOC00oO(float var1) {
      return this.NVNnnvnuunNv + (var1 - this.UNnVVNvvnVvU - this.NVNnnvnuunNv) / this.UvnvNVnnnnNU;
   }

   public NVUVNNunvvNN UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
      return new NVUVNNunvvNN(
         this,
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
         var1,
         var2,
         var3,
         var4,
         var5
      );
   }

   public NVUVNNunvvNN UuUVuuUu(float var1, float var2, float var3, float var4) {
      return new NVUVNNunvvNN(
         this,
         this.nuUnNvnuUu,
         this.VVuuUN,
         this.vNUvnnVnUvu,
         this.uVUuuVnNVU,
         this.vuuuNvNuv,
         var1,
         var2,
         var3,
         var4,
         var3 > 0.0F && var4 > 0.0F,
         this.UvnvNVnnnnNU,
         this.uVUVnuvnuVuv,
         this.NVNnnvnuunNv,
         this.uVunuUNVVUUV,
         this.UNnVVNvvnVvU
      );
   }

   public NVUVNNunvvNN C00OOC00oO(float var1, float var2, float var3, float var4) {
      if (var3 <= 0.0F || var4 <= 0.0F) {
         return this;
      } else if (!this.vuuuNvNuv) {
         return new NVUVNNunvvNN(
            this,
            var1,
            var2,
            var3,
            var4,
            true,
            this.nvUVNnuu,
            this.UuuNnUvUuv,
            this.nUUVuvU,
            this.UnUNVVVNuv,
            this.vNVuvnUUnuUn,
            this.UvnvNVnnnnNU,
            this.uVUVnuvnuVuv,
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU
         );
      } else {
         float var5 = Math.max(this.nuUnNvnuUu, var1);
         float var6 = Math.max(this.VVuuUN, var2);
         float var7 = Math.min(this.nuUnNvnuUu + this.vNUvnnVnUvu, var1 + var3);
         float var8 = Math.min(this.VVuuUN + this.uVUuuVnNVU, var2 + var4);
         return new NVUVNNunvvNN(
            this,
            var5,
            var6,
            Math.max(0.0F, var7 - var5),
            Math.max(0.0F, var8 - var6),
            true,
            this.nvUVNnuu,
            this.UuuNnUvUuv,
            this.nUUVuvU,
            this.UnUNVVVNuv,
            this.vNVuvnUUnuUn,
            this.UvnvNVnnnnNU,
            this.uVUVnuvnuVuv,
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU
         );
      }
   }

   public void UuUVuuUu(vNvvVnNuUVvv var1) {
      if (this.uNnUnnuNUnNu != null) {
         this.uNnUnnuNUnNu.execute(var1);
      }
   }

   private boolean UuUVuuUu(float var1, float var2) {
      return !this.vuuuNvNuv
         ? true
         : var1 >= this.nuUnNvnuUu && var2 >= this.VVuuUN && var1 < this.nuUnNvnuUu + this.vNUvnnVnUvu && var2 < this.VVuuUN + this.uVUuuVnNVU;
   }

   private boolean C00OOC00oO(float var1, float var2) {
      return !this.vNVuvnUUnuUn
         ? true
         : var1 >= this.nvUVNnuu && var2 >= this.UuuNnUvUuv && var1 < this.nvUVNnuu + this.nUUVuvU && var2 < this.UuuNnUvUuv + this.UnUNVVVNuv;
   }

   public static final class NVnVnNnN {
      int UuUVuuUu = -1;
      float C00OOC00oO;
      float uUnuvNvvNU;
      float vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      UnnVVvuuvnUv vuuuNvNuv;

      public NVUVNNunvvNN.NVnVnNnN UuUVuuUu(int var1) {
         this.UuUVuuUu = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN UuUVuuUu(float var1) {
         this.C00OOC00oO = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN C00OOC00oO(float var1) {
         this.uUnuvNvvNU = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN uUnuvNvvNU(float var1) {
         this.vVvUvVVuuNvV = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN vVvUvVVuuNvV(float var1) {
         this.uNNnnnuuuN = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN uNNnnnuuuN(float var1) {
         this.nuUnNvnuUu = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN nuUnNvnuUu(float var1) {
         this.VVuuUN = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN VVuuUN(float var1) {
         this.vNUvnnVnUvu = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN vNUvnnVnUvu(float var1) {
         this.uVUuuVnNVU = var1;
         return this;
      }

      public NVUVNNunvvNN.NVnVnNnN UuUVuuUu(UnnVVvuuvnUv var1) {
         this.vuuuNvNuv = var1;
         return this;
      }

      public NVUVNNunvvNN UuUVuuUu() {
         return new NVUVNNunvvNN(this);
      }
   }
}

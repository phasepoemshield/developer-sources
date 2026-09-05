package ru.metaculture.protection;

public final class uNuuunuNvuN implements vvUnNVVnV.NVnVnNnN {
   private static final float UuUVuuUu = 1.0E-4F;
   private static final float C00OOC00oO = 0.016666668F;
   private static final float uUnuvNvvNU = 0.1F;
   private final vvUnNVVnV vVvUvVVuuNvV;
   private final uNNnVuNunvU uNNnnnuuuN;
   private final float nuUnNvnuUu;
   private final float VVuuUN;
   private final float vNUvnnVnUvu;
   private final float uVUuuVnNVU;
   private float vuuuNvNuv;
   private float nvUVNnuu;
   private float UuuNnUvUuv;
   private l1IllI1lill nUUVuvU = l1IllI1lill.UuUVuuUu();

   public uNuuunuNvuN(vvUnNVVnV var1, uNNnVuNunvU var2, float var3, float var4, float var5, float var6, float var7) {
      if (var1 == null) {
         throw new IllegalArgumentException("animationSystem must not be null");
      } else if (var2 == null) {
         throw new IllegalArgumentException("config must not be null");
      } else if (var4 > var5) {
         throw new IllegalArgumentException("minValue must be <= maxValue");
      } else if (!(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         this.vVvUvVVuuNvV = var1;
         this.uNNnnnuuuN = var2;
         this.nuUnNvnuUu = var4;
         this.VVuuUN = var5;
         this.vNUvnnVnUvu = var6;
         this.uVUuuVnNVU = var7;
         float var8 = this.uNNnnnuuuN(var3);
         this.vuuuNvNuv = var8;
         this.nvUVNnuu = var8;
         this.UuuNnUvUuv = 0.0F;
      } else {
         throw new IllegalArgumentException("tolerances must be > 0");
      }
   }

   public void UuUVuuUu(l1IllI1lill var1) {
      this.nUUVuvU = var1 == null ? l1IllI1lill.UuUVuuUu() : var1;
   }

   public void C00OOC00oO(float var1) {
      float var2 = this.uNNnnnuuuN(var1);
      this.vuuuNvNuv = var2;
      this.nvUVNnuu = var2;
      this.UuuNnUvUuv = 0.0F;
      this.vVvUvVVuuNvV.C00OOC00oO(this);
   }

   public void uUnuvNvvNU(float var1) {
      float var2 = this.uNNnnnuuuN(var1);
      if (Math.abs(var2 - this.nvUVNnuu) <= this.vNUvnnVnUvu * 0.25F) {
         this.nvUVNnuu = var2;
         if (this.vVvUvVVuuNvV()) {
            this.C00OOC00oO(var2);
         }
      } else {
         this.nvUVNnuu = var2;
         this.vVvUvVVuuNvV.UuUVuuUu(this);
      }
   }

   public float UuUVuuUu() {
      float var1 = 0.0F;
      float var2 = this.VVuuUN - this.nuUnNvnuUu;
      if (var2 > 0.0F) {
         var1 = (this.vuuuNvNuv - this.nuUnNvnuUu) / var2;
      }

      float var3 = this.nUUVuvU.ease(nuUnNvnuUu(var1));
      return this.nuUnNvnuUu + var3 * var2;
   }

   public float C00OOC00oO() {
      return this.vuuuNvNuv;
   }

   public float uUnuvNvvNU() {
      return this.nvUVNnuu;
   }

   public boolean vVvUvVVuuNvV() {
      float var1 = Math.abs(this.nvUVNnuu - this.vuuuNvNuv);
      return var1 <= this.vNUvnnVnUvu && Math.abs(this.UuuNnUvUuv) <= this.uVUuuVnNVU;
   }

   @Override
   public boolean UuUVuuUu(float var1) {
      float var2 = var1;
      if (var1 < 1.0E-4F) {
         var2 = 1.0E-4F;
      } else if (var1 > 0.1F) {
         var2 = 0.1F;
      }

      boolean var3 = true;

      while (var2 > 0.0F && var3) {
         float var4 = Math.min(var2, 0.016666668F);
         var3 = this.vVvUvVVuuNvV(var4);
         var2 -= var4;
      }

      return var3;
   }

   private boolean vVvUvVVuuNvV(float var1) {
      float var2 = (float)((Math.PI * 2) * this.uNNnnnuuuN.UuUVuuUu());
      float var3 = 2.0F * this.uNNnnnuuuN.C00OOC00oO() * var2;
      float var4 = var2 * var2;
      float var5 = this.vuuuNvNuv - this.nvUVNnuu;
      float var6 = -var4 * var5 - var3 * this.UuuNnUvUuv;
      this.UuuNnUvUuv += var6 * var1;
      this.vuuuNvNuv = this.vuuuNvNuv + this.UuuNnUvUuv * var1;
      if (Float.isNaN(this.vuuuNvNuv) || Float.isInfinite(this.vuuuNvNuv) || Float.isNaN(this.UuuNnUvUuv) || Float.isInfinite(this.UuuNnUvUuv)) {
         this.vuuuNvNuv = this.nvUVNnuu;
         this.UuuNnUvUuv = 0.0F;
         return false;
      } else if (this.vuuuNvNuv < this.nuUnNvnuUu) {
         this.vuuuNvNuv = this.nuUnNvnuUu;
         this.UuuNnUvUuv = 0.0F;
         return false;
      } else if (this.vuuuNvNuv > this.VVuuUN) {
         this.vuuuNvNuv = this.VVuuUN;
         this.UuuNnUvUuv = 0.0F;
         return false;
      } else {
         float var7 = this.vuuuNvNuv - this.nvUVNnuu;
         if ((!(var5 > 0.0F) || !(var7 < 0.0F)) && (!(var5 < 0.0F) || !(var7 > 0.0F))) {
            if (this.vVvUvVVuuNvV()) {
               this.vuuuNvNuv = this.nvUVNnuu;
               this.UuuNnUvUuv = 0.0F;
               return false;
            } else {
               return true;
            }
         } else {
            this.vuuuNvNuv = this.nvUVNnuu;
            this.UuuNnUvUuv = 0.0F;
            return false;
         }
      }
   }

   private float uNNnnnuuuN(float var1) {
      if (var1 <= this.nuUnNvnuUu) {
         return this.nuUnNvnuUu;
      } else {
         return var1 >= this.VVuuUN ? this.VVuuUN : var1;
      }
   }

   private static float nuUnNvnuUu(float var0) {
      if (var0 <= 0.0F) {
         return 0.0F;
      } else {
         return var0 >= 1.0F ? 1.0F : var0;
      }
   }
}

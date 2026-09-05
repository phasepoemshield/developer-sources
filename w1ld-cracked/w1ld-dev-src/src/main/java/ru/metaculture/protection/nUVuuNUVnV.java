package ru.metaculture.protection;

import lombok.Generated;

public final class nUVuuNUVnV {
   private final NvVNvUvunNNu UuUVuuUu;
   private final nUvnuVnNUU C00OOC00oO;
   private final NUunUunuNV uUnuvNvvNU;
   private final OO0OCoOC vVvUvVVuuNvV;

   public boolean UuUVuuUu() {
      if (this.uUnuvNvvNU != null) {
         return this.uUnuvNvvNU.uNnUnnuNUnNu();
      } else {
         return this.vVvUvVVuuNvV == null ? false : this.vVvUvVVuuNvV.uUnuvNvvNU(this.UuUVuuUu);
      }
   }

   public boolean C00OOC00oO() {
      return this.UuUVuuUu();
   }

   @Generated
   nUVuuNUVnV(NvVNvUvunNNu var1, nUvnuVnNUU var2, NUunUunuNV var3, OO0OCoOC var4) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
   }

   @Generated
   public static nUVuuNUVnV.NVnVnNnN uUnuvNvvNU() {
      return new nUVuuNUVnV.NVnVnNnN();
   }

   @Generated
   public NvVNvUvunNNu vVvUvVVuuNvV() {
      return this.UuUVuuUu;
   }

   @Generated
   public nUvnuVnNUU uNNnnnuuuN() {
      return this.C00OOC00oO;
   }

   @Generated
   public NUunUunuNV nuUnNvnuUu() {
      return this.uUnuvNvvNU;
   }

   @Generated
   public OO0OCoOC VVuuUN() {
      return this.vVvUvVVuuNvV;
   }

   @Generated
   @Override
   public boolean equals(Object var1) {
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof nUVuuNUVnV var2)) {
         return false;
      } else {
         NvVNvUvunNNu var3 = this.vVvUvVVuuNvV();
         NvVNvUvunNNu var4 = var2.vVvUvVVuuNvV();
         if (var3 == null ? var4 == null : var3.equals(var4)) {
            nUvnuVnNUU var5 = this.uNNnnnuuuN();
            nUvnuVnNUU var6 = var2.uNNnnnuuuN();
            if (var5 == null ? var6 == null : var5.equals(var6)) {
               NUunUunuNV var7 = this.nuUnNvnuUu();
               NUunUunuNV var8 = var2.nuUnNvnuUu();
               if (var7 == null ? var8 == null : var7.equals(var8)) {
                  OO0OCoOC var9 = this.VVuuUN();
                  OO0OCoOC var10 = var2.VVuuUN();
                  return var9 == null ? var10 == null : var9.equals(var10);
               } else {
                  return false;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      }
   }

   @Generated
   @Override
   public int hashCode() {
      byte var1 = 59;
      int var2 = 1;
      NvVNvUvunNNu var3 = this.vVvUvVVuuNvV();
      var2 = var2 * 59 + (var3 == null ? 43 : var3.hashCode());
      nUvnuVnNUU var4 = this.uNNnnnuuuN();
      var2 = var2 * 59 + (var4 == null ? 43 : var4.hashCode());
      NUunUunuNV var5 = this.nuUnNvnuUu();
      var2 = var2 * 59 + (var5 == null ? 43 : var5.hashCode());
      OO0OCoOC var6 = this.VVuuUN();
      return var2 * 59 + (var6 == null ? 43 : var6.hashCode());
   }

   @Generated
   @Override
   public String toString() {
      return "ThemeContext(theme="
         + this.vVvUvVVuuNvV()
         + ", metrics="
         + this.uNNnnnuuuN()
         + ", colors="
         + this.nuUnNvnuUu()
         + ", palette="
         + this.VVuuUN()
         + ")";
   }

   @Generated
   public static class NVnVnNnN {
      @Generated
      private NvVNvUvunNNu UuUVuuUu;
      @Generated
      private nUvnuVnNUU C00OOC00oO;
      @Generated
      private NUunUunuNV uUnuvNvvNU;
      @Generated
      private OO0OCoOC vVvUvVVuuNvV;

      @Generated
      NVnVnNnN() {
      }

      @Generated
      public nUVuuNUVnV.NVnVnNnN UuUVuuUu(NvVNvUvunNNu var1) {
         this.UuUVuuUu = var1;
         return this;
      }

      @Generated
      public nUVuuNUVnV.NVnVnNnN UuUVuuUu(nUvnuVnNUU var1) {
         this.C00OOC00oO = var1;
         return this;
      }

      @Generated
      public nUVuuNUVnV.NVnVnNnN UuUVuuUu(NUunUunuNV var1) {
         this.uUnuvNvvNU = var1;
         return this;
      }

      @Generated
      public nUVuuNUVnV.NVnVnNnN UuUVuuUu(OO0OCoOC var1) {
         this.vVvUvVVuuNvV = var1;
         return this;
      }

      @Generated
      public nUVuuNUVnV UuUVuuUu() {
         return new nUVuuNUVnV(this.UuUVuuUu, this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV);
      }

      @Generated
      @Override
      public String toString() {
         return "ThemeContext.ThemeContextBuilder(theme="
            + this.UuUVuuUu
            + ", metrics="
            + this.C00OOC00oO
            + ", colors="
            + this.uUnuvNvvNU
            + ", palette="
            + this.vVvUvVVuuNvV
            + ")";
      }
   }
}

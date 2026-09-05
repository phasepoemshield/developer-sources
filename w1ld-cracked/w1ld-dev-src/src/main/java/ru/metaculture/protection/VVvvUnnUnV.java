package ru.metaculture.protection;

public final class VVvvUnnUnV implements AutoCloseable {
   private final oo0OOO00o0O UuUVuuUu;
   private VnuVUNUv C00OOC00oO = VnuVUNUv.PREVIEW_ONLY;
   private String uUnuvNvvNU = "";
   private String vVvUvVVuuNvV = "";

   public VVvvUnnUnV(oo0OOO00o0O var1) {
      this.UuUVuuUu = var1;
      uNNnUu.UuUVuuUu().UuUVuuUu(var1);
   }

   public VnuVUNUv UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public void UuUVuuUu(VnuVUNUv var1) {
      if (var1 != null) {
         this.C00OOC00oO = var1;
      }
   }

   public void UuUVuuUu(nuVVnvn var1) {
      if (var1 != null && this.UuUVuuUu != null) {
         NNnUUVVnuUV var2 = this.UuUVuuUu.UuUVuuUu(var1);
         this.uUnuvNvvNU = var2.hash();
         this.vVvUvVVuuNvV = var2.error() == null ? "" : var2.error();
         uNNnUu.UuUVuuUu().UuUVuuUu(this.C00OOC00oO, var1, var2);
         uVvVnUU.UuUVuuUu().UuUVuuUu(this.C00OOC00oO, var2);
      }
   }

   public NNnUUVVnuUV C00OOC00oO(nuVVnvn var1) {
      if (var1 != null && this.UuUVuuUu != null) {
         NNnUUVVnuUV var2 = this.UuUVuuUu.UuUVuuUu(var1);
         this.uUnuvNvvNU = var2.hash();
         this.vVvUvVVuuNvV = var2.error() == null ? "" : var2.error();
         return var2;
      } else {
         return null;
      }
   }

   public boolean UuUVuuUu(String var1, nuVVnvn var2) {
      if (var2 != null && this.UuUVuuUu != null) {
         String var3 = uNNnUu.vuuuNvNuv(var1);
         if (var3.isBlank()) {
            this.vVvUvVVuuNvV = "Shader name is empty";
            return false;
         } else {
            NNnUUVVnuUV var4 = this.UuUVuuUu.UuUVuuUu(var2);
            this.uUnuvNvvNU = var4.hash();
            this.vVvUvVVuuNvV = var4.error() == null ? "" : var4.error();
            if (!this.vVvUvVVuuNvV.isBlank()) {
               return false;
            } else {
               uNNnUu.UuUVuuUu().UuUVuuUu(var3, var2, var4);
               uVvVnUU.UuUVuuUu().UuUVuuUu(var3, var4);
               return true;
            }
         }
      } else {
         return false;
      }
   }

   public void UuUVuuUu(nuVVnvn var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9, NUunUunuNV var10, float var11) {
      if (var1 != null && var10 != null) {
         this.UuUVuuUu(var1);
         uVNnuvnVvvu.UuUVuuUu(this.C00OOC00oO, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11);
      }
   }

   public String C00OOC00oO() {
      return !this.vVvUvVVuuNvV.isBlank() ? this.vVvUvVVuuNvV : uVvVnUU.UuUVuuUu().UuUVuuUu(this.C00OOC00oO);
   }

   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU == null ? "" : this.uUnuvNvvNU;
   }

   @Override
   public void close() {
      this.uUnuvNvvNU = "";
      this.vVvUvVVuuNvV = "";
   }
}

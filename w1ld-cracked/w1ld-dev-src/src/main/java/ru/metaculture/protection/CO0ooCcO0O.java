package ru.metaculture.protection;

import java.util.List;
import java.util.UUID;

public final class CO0ooCcO0O implements unUNvvnuUNn {
   @Override
   public void UuUVuuUu(List<c0O00CcoCc0c.NVnVnNnN> var1) {
   }

   @Override
   public UNnNuvuvnU UuUVuuUu(UUID var1) {
      return null;
   }

   @Override
   public nVnnVNuNNVUU C00OOC00oO(UUID var1) {
      return null;
   }

   @Override
   public void UuUVuuUu(VUVnuvunnvuV var1, nnunnunvvuv var2, c0O00CcoCc0c.NVnVnNnN var3, long var4, int var6) {
      nvNUnuU var7 = new nvNUnuU(var1, var1.C00OOC00oO().method_23760(), var1.UuUVuuUu(OOcCooOcCcO.vVvUvVVuuNvV()));
      this.UuUVuuUu(var7, var2, -var2.vVvUvVVuuNvV(), var2.vVvUvVVuuNvV(), -var2.uNNnnnuuuN(), var2.uNNnnnuuuN(), 0.0, -15987696);
      float var8 = 0.25F + 0.35F * (float)Math.abs(Math.sin(System.currentTimeMillis() / 600.0));
      double var9 = var2.vVvUvVVuuNvV() * 0.06;
      double var11 = Math.min(var9 * 0.22, var2.uNNnnnuuuN() * 0.03);
      this.UuUVuuUu(var7, var2, -var9, var9, -var11, var11, 0.002, UuUVuuUu(var6, var8));
   }

   @Override
   public void UuUVuuUu() {
   }

   static int UuUVuuUu(int var0, float var1) {
      int var2 = Math.round(Math.max(0.0F, Math.min(1.0F, var1)) * (var0 >>> 24 & 0xFF));
      return var2 << 24 | var0 & 16777215;
   }

   private void UuUVuuUu(nvNUnuU var1, nnunnunvvuv var2, double var3, double var5, double var7, double var9, double var11, int var13) {
      var1.UuUVuuUu(
         var2.UuUVuuUu(var3, var11),
         var2.UuUVuuUu(var7),
         var2.C00OOC00oO(var3, var11),
         var2.UuUVuuUu(var5, var11),
         var2.UuUVuuUu(var7),
         var2.C00OOC00oO(var5, var11),
         var2.UuUVuuUu(var5, var11),
         var2.UuUVuuUu(var9),
         var2.C00OOC00oO(var5, var11),
         var2.UuUVuuUu(var3, var11),
         var2.UuUVuuUu(var9),
         var2.C00OOC00oO(var3, var11),
         var13
      );
   }
}

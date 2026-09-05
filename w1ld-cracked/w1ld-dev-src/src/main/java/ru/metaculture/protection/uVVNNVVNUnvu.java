package ru.metaculture.protection;

import java.util.ArrayList;

public final class uVVNNVVNUnvu {
   private static final float UuUVuuUu = 170.0F;
   private String C00OOC00oO = "";
   private final ArrayList<Long> uUnuvNvvNU = new ArrayList<>();
   private final ArrayList<uVVNNVVNUnvu.NVnVnNnN> vVvUvVVuuNvV = new ArrayList<>();

   public boolean UuUVuuUu() {
      return !this.vVvUvVVuuNvV.isEmpty();
   }

   public void UuUVuuUu(
      UnVNvNnU var1,
      nUvnuVnNUU var2,
      nUVnuvUu var3,
      String var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      boolean var10,
      int var11,
      long var12
   ) {
      this.UuUVuuUu(var4, var3, var5, var8, var12);
      float var14 = var5;

      for (int var15 = 0; var15 < var4.length(); var15++) {
         String var16 = String.valueOf(var4.charAt(var15));
         float var17 = nunvNNUnvU.UuUVuuUu(var3, var16, var8);
         long var18 = var15 < this.uUnuvNvvNU.size() ? this.uUnuvNvvNU.get(var15) : 0L;
         float var20 = (float)(var12 - var18) / 170.0F;
         float var21 = 0.0F;
         int var22 = var9;
         if (var20 < 1.0F) {
            float var23 = 1.0F - (1.0F - var20) * (1.0F - var20);
            var21 = (1.0F - var23) * var2.UuUVuuUu(7.0F);
            var22 = NUunUunuNV.UuUVuuUu(var9, Math.round(255.0F * var23));
         }

         nunvNNUnvU.UuUVuuUu(var1, var2, var3, var14, var6 + var21, var7, var8, var16, var22);
         var14 += var17;
      }

      if (var10) {
         nunvNNUnvU.UuUVuuUu(var1, var2, var3, var14, var6, var7, var8, "|", var11);
      }

      for (int var24 = this.vVvUvVVuuNvV.size() - 1; var24 >= 0; var24--) {
         uVVNNVVNUnvu.NVnVnNnN var25 = this.vVvUvVVuuNvV.get(var24);
         float var26 = (float)(var12 - var25.born()) / 170.0F;
         if (var26 >= 1.0F) {
            this.vVvUvVVuuNvV.remove(var24);
         } else {
            float var27 = 1.0F - (1.0F - var26) * (1.0F - var26);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               var3,
               var25.x(),
               var6 + var27 * var2.UuUVuuUu(8.0F),
               var7,
               var8,
               var25.ch(),
               NUunUunuNV.UuUVuuUu(var9, Math.round(255.0F * (1.0F - var27)))
            );
         }
      }
   }

   private void UuUVuuUu(String var1, nUVnuvUu var2, float var3, float var4, long var5) {
      if (!var1.equals(this.C00OOC00oO)) {
         int var7 = 0;
         int var8 = Math.min(this.C00OOC00oO.length(), var1.length());

         while (var7 < var8 && this.C00OOC00oO.charAt(var7) == var1.charAt(var7)) {
            var7++;
         }

         float var9 = var3 + nunvNNUnvU.UuUVuuUu(var2, this.C00OOC00oO.substring(0, var7), var4);

         for (int var10 = var7; var10 < this.C00OOC00oO.length(); var10++) {
            String var11 = String.valueOf(this.C00OOC00oO.charAt(var10));
            this.vVvUvVVuuNvV.add(new uVVNNVVNUnvu.NVnVnNnN(var11, var9, var5));
            var9 += nunvNNUnvU.UuUVuuUu(var2, var11, var4);
         }

         while (this.uUnuvNvvNU.size() > var7) {
            this.uUnuvNvvNU.remove(this.uUnuvNvvNU.size() - 1);
         }

         while (this.uUnuvNvvNU.size() < var1.length()) {
            this.uUnuvNvvNU.add(var5);
         }

         this.C00OOC00oO = var1;
      }
   }

   record NVnVnNnN(String ch, float x, long born) {
   }
}

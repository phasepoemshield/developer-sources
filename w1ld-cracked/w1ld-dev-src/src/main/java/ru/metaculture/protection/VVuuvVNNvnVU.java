package ru.metaculture.protection;

import java.util.List;
import java.util.UUID;
import net.minecraft.class_1921;
import net.minecraft.class_2960;

public final class VVuuvVNNvnVU {
   private final nnunnunvvuv UuUVuuUu = new nnunnunvvuv();
   private final unUNvvnuUNn C00OOC00oO;

   public VVuuvVNNvnVU(unUNvvnuUNn var1) {
      this.C00OOC00oO = var1;
   }

   public unUNvvnuUNn UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public void UuUVuuUu(VUVnuvunnvuV var1, List<c0O00CcoCc0c.NVnVnNnN> var2, c0O00CcoCc0c var3, Coo00OCoOo var4, UUID var5, boolean var6, long var7, int var9) {
      this.UuUVuuUu(var1, var2, var4);
      this.UuUVuuUu(var1, var2, var3, var4, var9, var7);
      this.UuUVuuUu(var1, var2, var4, var5, var6, var9);
      this.C00OOC00oO(var1, var2, var4, var5, var6, var9);
   }

   private void UuUVuuUu(VUVnuvunnvuV var1, List<c0O00CcoCc0c.NVnVnNnN> var2, Coo00OCoOo var3) {
      nvNUnuU var4 = UuUVuuUu(var1, OOcCooOcCcO.UuUVuuUu());

      for (int var5 = 0; var5 < var2.size(); var5++) {
         this.UuUVuuUu((c0O00CcoCc0c.NVnVnNnN)var2.get(var5), var3);
         double var6 = this.UuUVuuUu.nvUVNnuu();
         this.UuUVuuUu(
            var4,
            -this.UuUVuuUu.vVvUvVVuuNvV() - var6,
            this.UuUVuuUu.vVvUvVVuuNvV() + var6,
            -this.UuUVuuUu.uNNnnnuuuN() - var6,
            this.UuUVuuUu.uNNnnnuuuN() + var6,
            -0.014,
            -15592938
         );
      }
   }

   private void UuUVuuUu(VUVnuvunnvuV var1, List<c0O00CcoCc0c.NVnVnNnN> var2, c0O00CcoCc0c var3, Coo00OCoOo var4, int var5, long var6) {
      for (int var8 = 0; var8 < var2.size(); var8++) {
         c0O00CcoCc0c.NVnVnNnN var9 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var8);
         this.UuUVuuUu(var9, var4);
         this.C00OOC00oO.UuUVuuUu(var1, this.UuUVuuUu, var9, var3.UuUVuuUu(var9, var6), var5);
      }
   }

   private void UuUVuuUu(VUVnuvunnvuV var1, List<c0O00CcoCc0c.NVnVnNnN> var2, Coo00OCoOo var3, UUID var4, boolean var5, int var6) {
      for (int var7 = 0; var7 < var2.size(); var7++) {
         c0O00CcoCc0c.NVnVnNnN var8 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var7);
         nVnnVNuNNVUU var9 = this.C00OOC00oO.C00OOC00oO(var8.id());
         if (var9 != null && Coo00OCoOo.UuUVuuUu(var8, var4, var5) && var8.id().equals(var3.C00OOC00oO())) {
            this.UuUVuuUu(var8, var3);
            nvNUnuU var10 = UuUVuuUu(var1, OOcCooOcCcO.vVvUvVVuuNvV());

            for (int var11 = 0; var11 <= var9.UuUVuuUu(); var11++) {
               boolean var12 = var11 == var9.UuUVuuUu();
               this.UuUVuuUu(var10, var11, !var12 && var11 == var9.C00OOC00oO() ? var6 : -870704608);
            }

            for (int var13 = 0; var13 < var9.UuUVuuUu(); var13++) {
               class_2960 var14 = var9.C00OOC00oO(var13);
               if (var14 != null) {
                  this.UuUVuuUu(var1, var13, var14);
               }
            }

            this.UuUVuuUu(var10, var9.UuUVuuUu());
         }
      }
   }

   private void C00OOC00oO(VUVnuvunnvuV var1, List<c0O00CcoCc0c.NVnVnNnN> var2, Coo00OCoOo var3, UUID var4, boolean var5, int var6) {
      nvNUnuU var7 = UuUVuuUu(var1, OOcCooOcCcO.vVvUvVVuuNvV());

      for (int var8 = 0; var8 < var2.size(); var8++) {
         c0O00CcoCc0c.NVnVnNnN var9 = (c0O00CcoCc0c.NVnVnNnN)var2.get(var8);
         this.UuUVuuUu(var9, var3);
         if (Coo00OCoOo.UuUVuuUu(var9, var4, var5) && UuUVuuUu(var3, var9.id())) {
            boolean var10 = UuUVuuUu(var3, var9.id(), VvUUVVVNNUN.MOVE);
            this.UuUVuuUu(
               var7,
               -this.UuUVuuUu.uVunuUNVVUUV(),
               this.UuUVuuUu.uVunuUNVVUUV(),
               this.UuUVuuUu.uNnUnnuNUnNu(),
               this.UuUVuuUu.UNnVVNvvnVvU(),
               0.012,
               CO0ooCcO0O.UuUVuuUu(var10 ? var6 : -1, var10 ? 0.95F : 0.5F)
            );
         }
      }
   }

   private void UuUVuuUu(nvNUnuU var1, int var2, int var3) {
      this.UuUVuuUu(
         var1,
         this.UuUVuuUu.UuUVuuUu(var2),
         this.UuUVuuUu.UuUVuuUu(var2) + this.UuUVuuUu.nUUVuvU(),
         this.UuUVuuUu.vNVuvnUUnuUn(),
         this.UuUVuuUu.UvnvNVnnnnNU(),
         0.008,
         var3
      );
   }

   private void UuUVuuUu(VUVnuvunnvuV var1, int var2, class_2960 var3) {
      double var4 = this.UuUVuuUu.UuuNnUvUuv() * 0.09;
      double var6 = this.UuUVuuUu.UuUVuuUu(var2) + var4;
      double var8 = this.UuUVuuUu.UuUVuuUu(var2) + this.UuUVuuUu.nUUVuvU() - var4;
      double var10 = this.UuUVuuUu.vNVuvnUUnuUn() + var4;
      double var12 = this.UuUVuuUu.UvnvNVnnnnNU() - var4;
      UuUVuuUu(var1, OOcCooOcCcO.C00OOC00oO(var3))
         .UuUVuuUu(
            this.UuUVuuUu.UuUVuuUu(var6, 0.011),
            this.UuUVuuUu.UuUVuuUu(var10),
            this.UuUVuuUu.C00OOC00oO(var6, 0.011),
            this.UuUVuuUu.UuUVuuUu(var8, 0.011),
            this.UuUVuuUu.UuUVuuUu(var10),
            this.UuUVuuUu.C00OOC00oO(var8, 0.011),
            this.UuUVuuUu.UuUVuuUu(var8, 0.011),
            this.UuUVuuUu.UuUVuuUu(var12),
            this.UuUVuuUu.C00OOC00oO(var8, 0.011),
            this.UuUVuuUu.UuUVuuUu(var6, 0.011),
            this.UuUVuuUu.UuUVuuUu(var12),
            this.UuUVuuUu.C00OOC00oO(var6, 0.011),
            0.0F,
            1.0F,
            1.0F,
            1.0F,
            1.0F,
            0.0F,
            0.0F,
            0.0F,
            -1
         );
   }

   private void UuUVuuUu(nvNUnuU var1, int var2) {
      double var3 = this.UuUVuuUu.UuUVuuUu(var2) + this.UuUVuuUu.nUUVuvU() * 0.5;
      double var5 = this.UuUVuuUu.vNVuvnUUnuUn() + this.UuUVuuUu.UuuNnUvUuv() * 0.5;
      double var7 = this.UuUVuuUu.UuuNnUvUuv() * 0.22;
      double var9 = this.UuUVuuUu.UuuNnUvUuv() * 0.055;
      this.UuUVuuUu(var1, var3 - var7, var3 + var7, var5 - var9, var5 + var9, 0.013, -855638017);
      this.UuUVuuUu(var1, var3 - var9, var3 + var9, var5 - var7, var5 + var7, 0.013, -855638017);
   }

   private static nvNUnuU UuUVuuUu(VUVnuvunnvuV var0, class_1921 var1) {
      return new nvNUnuU(var0, var0.C00OOC00oO().method_23760(), var0.UuUVuuUu(var1));
   }

   private void UuUVuuUu(c0O00CcoCc0c.NVnVnNnN var1, Coo00OCoOo var2) {
      if (var2.UuUVuuUu(var1.id())) {
         this.UuUVuuUu.UuUVuuUu(var2.nuUnNvnuUu(), var2.VVuuUN(), var2.vNUvnnVnUvu(), var2.uVUuuVnNVU(), var2.vuuuNvNuv(), var2.nvUVNnuu());
      } else {
         this.UuUVuuUu.UuUVuuUu(var1);
      }
   }

   private void UuUVuuUu(nvNUnuU var1, double var2, double var4, double var6, double var8, double var10, int var12) {
      var1.UuUVuuUu(
         this.UuUVuuUu.UuUVuuUu(var2, var10),
         this.UuUVuuUu.UuUVuuUu(var6),
         this.UuUVuuUu.C00OOC00oO(var2, var10),
         this.UuUVuuUu.UuUVuuUu(var4, var10),
         this.UuUVuuUu.UuUVuuUu(var6),
         this.UuUVuuUu.C00OOC00oO(var4, var10),
         this.UuUVuuUu.UuUVuuUu(var4, var10),
         this.UuUVuuUu.UuUVuuUu(var8),
         this.UuUVuuUu.C00OOC00oO(var4, var10),
         this.UuUVuuUu.UuUVuuUu(var2, var10),
         this.UuUVuuUu.UuUVuuUu(var8),
         this.UuUVuuUu.C00OOC00oO(var2, var10),
         var12
      );
   }

   private static boolean UuUVuuUu(Coo00OCoOo var0, UUID var1) {
      return var0.vVvUvVVuuNvV() ? var0.UuUVuuUu(var1) : var1.equals(var0.C00OOC00oO());
   }

   private static boolean UuUVuuUu(Coo00OCoOo var0, UUID var1, VvUUVVVNNUN var2) {
      return var0.vVvUvVVuuNvV() ? var0.UuUVuuUu(var1) : var2 == var0.uUnuvNvvNU() && var1.equals(var0.UuUVuuUu());
   }
}

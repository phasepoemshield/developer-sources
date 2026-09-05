package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.class_1792;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_2960;
import net.minecraft.class_332;
import net.minecraft.class_7923;
import org.wild.module.api.Module;

public final class nvnUNvNUNv implements UvUuUvUVUU {
   private static final int UuUVuuUu = 6;
   private static final int C00OOC00oO = 3;
   private static List<nvnUNvNUNv.NVnVnNnN> uUnuvNvvNU;
   private final UNVVvNuuNNN vVvUvVVuuNvV = new UNVVvNuuNNN();
   private final UUnunVVvvNN uNNnnnuuuN = new UUnunVVvvNN();
   private final NVuVVUNUvV nuUnNvnuUu = new NVuVVUNUvV("AutoCraft Search", "");
   private final UUNnvUVnnnnN VVuuUN = new UUNnvUVnnnnN(0.0F);
   private final long[] vNUvnnVnUvu = new long[9];
   private final Map<String, Long> uVUuuVnNVU = new HashMap<>();
   private String vuuuNvNuv = "minecraft:oak_log";
   private String nvUVNnuu = "";
   private boolean UuuNnUvUuv;
   private long nUUVuvU;
   private long UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private AutoCraft UvnvNVnnnnNU;
   private nvnUNvNUNv.nvnNNunvv uVUVnuvnuVuv;
   private nUvnuVnNUU NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu = 1.0F;

   @Override
   public boolean UuUVuuUu(Module var1) {
      return var1 instanceof AutoCraft;
   }

   @Override
   public boolean UuUVuuUu(Module var1, vNvvVnNuUVvv var2) {
      return false;
   }

   @Override
   public void UuUVuuUu(vNvvVnNuUVvv var1) {
      this.uUnuvNvvNU(var1);
      this.vNVuvnUUnuUn = 0.0F;
      this.VVuuUN.UuUVuuUu(0.0F);
   }

   @Override
   public void C00OOC00oO(vNvvVnNuUVvv var1) {
      this.uUnuvNvvNU(var1);
   }

   @Override
   public void uUnuvNvvNU(vNvvVnNuUVvv var1) {
      this.nvUVNnuu = "";
      this.UuuNnUvUuv = false;
   }

   @Override
   public float UuUVuuUu(Module var1, nUvnuVnNUU var2, vNvvVnNuUVvv var3) {
      return var2.UuUVuuUu(238.0F);
   }

   @Override
   public void UuUVuuUu(Module var1, vNvvVnNuUVvv var2, Cc0cOoOcC0o var3, Cc0cOoOcC0o var4) {
      var2.C00OOC00oO("autocraft:panel", var2.vNnNuuvVn().contains(var1) ? 1.0F : 0.0F, var3);
   }

   @Override
   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, VvvVunn var4, nUVuuNUVnV var5) {
      if (var4.UuUVuuUu() instanceof AutoCraft var6) {
         nUvnuVnNUU var15 = var5.uNNnnnuuuN();
         NUunUunuNV var8 = var5.nuUnNvnuUu();
         nvnUNvNUNv.nvnNNunvv var9 = this.UuUVuuUu(var4, var15);
         this.UvnvNVnnnnNU = var6;
         this.uVUVnuvnuVuv = var9;
         this.NVNnnvnuunNv = var15;
         this.uVunuUNVVUUV = this.C00OOC00oO(var15);
         this.UNnVVNvvnVvU = var15.UuUVuuUu(3.0F);
         float var10 = Math.max(0.05F, var3.UuUVuuUu("autocraft:panel"));
         this.uNnUnnuNUnNu = !var3.NvUVUvVVnUu() && var3.vNnNuuvVn().contains(var6) ? var10 : 0.0F;
         float var11 = this.VVuuUN.UuUVuuUu(this.vNVuvnUUnuUn, UUNnvUVnnnnN.NVnVnNnN.UuUVuuUu());
         var1.uNNnnnuuuN(var10);

         try {
            this.UuUVuuUu(var1, var9, var15, var8);
            this.UuUVuuUu(var1, var3, var6, var9, var15, var8);
            this.UuUVuuUu(var1, var3, var6, var9, var15, var8, var11);
            this.UuUVuuUu(var1, var3, var6, var9, var15, var5);
            this.UuUVuuUu(var1, var3, var9, var15);
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   @Override
   public void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, VvvVunn var3, nUvnuVnNUU var4) {
      if (var3.UuUVuuUu() instanceof AutoCraft var5) {
         nvnUNvNUNv.nvnNNunvv var21 = this.UuUVuuUu(var3, var4);
         this.UvnvNVnnnnNU = var5;
         this.uVUVnuvnuVuv = var21;
         this.NVNnnvnuunNv = var4;
         this.uVunuUNVVUUV = this.C00OOC00oO(var4);
         this.UNnVVNvvnVvU = var4.UuUVuuUu(3.0F);
         float var7 = this.C00OOC00oO(var4);
         float var8 = var4.UuUVuuUu(3.0F);

         for (int var9 = 0; var9 < 9; var9++) {
            int var10 = var9;
            int var11 = var9 / 3;
            int var12 = var9 % 3;
            float var13 = var21.gridX() + var12 * (var7 + var8);
            float var14 = var21.gridY() + var11 * (var7 + var8);
            var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var13).C00OOC00oO(var14).uUnuvNvvNU(var7).vVvUvVVuuNvV(var7).UuUVuuUu(var3x -> {
               if (!this.vuuuNvNuv.isBlank()) {
                  var5.NVNnnvnuunNv.UuUVuuUu(var10, this.vuuuNvNuv);
                  this.UuUVuuUu(var10);
                  var3x.uUVvnUuNvvN();
               }
            }).UuUVuuUu());
            var1.add(NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(1).UuUVuuUu(var13).C00OOC00oO(var14).uUnuvNvvNU(var7).vVvUvVVuuNvV(var7).UuUVuuUu(var3x -> {
               var5.NVNnnvnuunNv.C00OOC00oO(var10);
               this.UuUVuuUu(var10);
               var3x.uUVvnUuNvvN();
            }).UuUVuuUu());
         }

         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var21.clearX())
               .C00OOC00oO(var21.clearY())
               .uUnuvNvvNU(var21.clearW())
               .vVvUvVVuuNvV(var4.UuUVuuUu(14.0F))
               .UuUVuuUu(var2x -> {
                  var5.NVNnnvnuunNv.uUnuvNvvNU();
                  this.nUUVuvU = System.currentTimeMillis();

                  for (int var3x = 0; var3x < this.vNUvnnVnUvu.length; var3x++) {
                     this.UuUVuuUu(var3x);
                  }

                  var2x.uUVvnUuNvvN();
               })
               .UuUVuuUu()
         );
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var21.searchX())
               .C00OOC00oO(var21.searchY())
               .uUnuvNvvNU(var21.searchW())
               .vVvUvVVuuNvV(var21.searchH())
               .UuUVuuUu(var1x -> {
                  var1x.uVUuuVnNVU(false);
                  var1x.UuUVuuUu(this.nuUnNvnuUu);
               })
               .UuUVuuUu()
         );
         float var22 = this.VVuuUN.C00OOC00oO();
         List var23 = UuUVuuUu(this.nuUnNvnuUu.uNNnnnuuuN);
         int var24 = this.UuUVuuUu(var21, var4);
         float var25 = this.UuUVuuUu(var4);
         float var26 = var4.UuUVuuUu(3.0F);
         float var27 = var21.catalogY() + var22;

         for (int var15 = 0; var15 < var23.size(); var15++) {
            nvnUNvNUNv.NVnVnNnN var16 = (nvnUNvNUNv.NVnVnNnN)var23.get(var15);
            int var17 = var15 / var24;
            int var18 = var15 % var24;
            float var19 = var21.catalogX() + var18 * (var25 + var26);
            float var20 = var27 + var17 * (var25 + var26);
            if (!(var20 + var25 < var21.catalogY()) && !(var20 > var21.catalogY() + var21.catalogH())) {
               var1.add(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var19)
                     .C00OOC00oO(var20)
                     .uUnuvNvvNU(var25)
                     .vVvUvVVuuNvV(var25)
                     .uNNnnnuuuN(var21.catalogX())
                     .nuUnNvnuUu(var21.catalogY())
                     .VVuuUN(var21.catalogW())
                     .vNUvnnVnUvu(var21.catalogH())
                     .UuUVuuUu(var2x -> {
                        this.vuuuNvNuv = var16.id();
                        this.nvUVNnuu = var16.id();
                        this.uUnuvNvvNU(var16.id());
                        var2x.uVUuuVnNVU(false);
                        var2x.UuUVuuUu(null);
                     })
                     .UuUVuuUu()
               );
            }
         }

         float var28 = this.C00OOC00oO(var21, var4);
         float var29 = this.uUnuvNvvNU(var21, var4);
         float var30 = this.vVvUvVVuuNvV(var21, var4);
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var28)
               .C00OOC00oO(var29 - var4.UuUVuuUu(2.0F))
               .uUnuvNvvNU(var30)
               .vVvUvVVuuNvV(var4.UuUVuuUu(18.0F))
               .UuUVuuUu(var1x -> {
                  var1x.uVUuuVnNVU(false);
                  var1x.UuUVuuUu(var5.uVunuUNVVUUV);
               })
               .UuUVuuUu()
         );
         float var31 = var29 + var4.UuUVuuUu(24.0F);
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var28)
               .C00OOC00oO(var31 + var4.UuUVuuUu(3.0F))
               .uUnuvNvvNU(var30)
               .vVvUvVVuuNvV(var4.UuUVuuUu(26.0F))
               .UuUVuuUu(var4x -> this.uNNnnnuuuN.UuUVuuUu(var4x, var5.UNnVVNvvnVvU, var4x.unnUnUNVnN(), var28, var30))
               .UuUVuuUu()
         );
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(this.uNNnnnuuuN(var21, var4) - var4.UuUVuuUu(3.0F))
               .C00OOC00oO(var21.catalogY())
               .uUnuvNvvNU(var4.UuUVuuUu(9.0F))
               .vVvUvVVuuNvV(var21.catalogH())
               .UuUVuuUu(var4x -> {
                  this.UuuNnUvUuv = true;
                  this.UuUVuuUu(var5, var21, var4, var4x.NnuUnUNnu());
               })
               .UuUVuuUu()
         );
      }
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, CCCo0o0cCCo var2, nUvnuVnNUU var3, float var4, float var5, double var6) {
      for (VvvVunn var9 : var2.C00OOC00oO()) {
         if (var9.UuUVuuUu() instanceof AutoCraft var10) {
            nvnUNvNUNv.nvnNNunvv var13 = this.UuUVuuUu(var9, var3);
            if (nunvNNUnvU.UuUVuuUu(var4, var5, var13.catalogX(), var13.catalogY(), var13.catalogW() + var3.UuUVuuUu(8.0F), var13.catalogH())) {
               float var12 = this.UuUVuuUu(var10, var13, var3);
               this.vNVuvnUUnuUn = this.UuUVuuUu(this.vNVuvnUUnuUn + (float)var6 * var3.UuUVuuUu(28.0F), -var12, 0.0F);
               return true;
            }
         }
      }

      return false;
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3) {
      if (this.UuuNnUvUuv) {
         this.UuUVuuUu(this.UvnvNVnnnnNU, this.uVUVnuvnuVuv, this.NVNnnvnuunNv, var3);
         return true;
      } else if (this.UvnvNVnnnnNU != null && this.uVUVnuvnuVuv != null) {
         String var4 = !this.nvUVNnuu.isBlank() ? this.nvUVNnuu : this.vuuuNvNuv;
         if (var4.isBlank()) {
            return false;
         } else {
            int var5 = this.UuUVuuUu(var2, var3);
            if (var5 == -1) {
               return !this.nvUVNnuu.isBlank();
            } else {
               if (!var4.equals(this.UvnvNVnnnnNU.NVNnnvnuunNv.UuUVuuUu(var5))) {
                  this.UvnvNVnnnnNU.NVNnnvnuunNv.UuUVuuUu(var5, var4);
                  this.UuUVuuUu(var5);
                  var1.uUVvnUuNvvN();
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean vVvUvVVuuNvV(vNvvVnNuUVvv var1) {
      boolean var2 = this.UuuNnUvUuv;
      boolean var3 = !this.nvUVNnuu.isBlank();
      this.UuuNnUvUuv = false;
      if (var3 && this.UvnvNVnnnnNU != null && this.uVUVnuvnuVuv != null) {
         int var4 = this.UuUVuuUu(var1.unnUnUNVnN(), var1.NnuUnUNnu());
         if (var4 != -1 && !this.nvUVNnuu.equals(this.UvnvNVnnnnNU.NVNnnvnuunNv.UuUVuuUu(var4))) {
            this.UvnvNVnnnnNU.NVNnnvnuunNv.UuUVuuUu(var4, this.nvUVNnuu);
            this.UuUVuuUu(var4);
            var1.uUVvnUuNvvN();
         }
      }

      this.nvUVNnuu = "";
      return var2 || var3;
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      NVuVVUNUvV var3 = var1.NuUuUvUUvU();
      if (var3 == this.nuUnNvnuUu || this.UvnvNVnnnnNU != null && var3 == this.UvnvNVnnnnNU.uVunuUNVVUUV) {
         if (var2 == 256 || var2 == 257) {
            var1.UuUVuuUu(null);
            return true;
         } else if (var2 == 259 && !var3.uNNnnnuuuN.isEmpty()) {
            var3.uNNnnnuuuN = var3.uNNnnnuuuN.substring(0, var3.uNNnnnuuuN.length() - 1);
            if (var3 == this.nuUnNvnuUu) {
               this.C00OOC00oO();
               this.uUnuvNvvNU();
            } else {
               var1.uUVvnUuNvvN();
            }

            return true;
         } else if (var3 == this.nuUnNvnuUu && var2 == 261 && !this.nuUnNvnuUu.uNNnnnuuuN.isEmpty()) {
            this.nuUnNvnuUu.uNNnnnuuuN = "";
            this.C00OOC00oO();
            this.uUnuvNvvNU();
            return true;
         } else {
            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      NVuVVUNUvV var3 = var1.NuUuUvUUvU();
      if (var3 == this.nuUnNvnuUu || this.UvnvNVnnnnNU != null && var3 == this.UvnvNVnnnnNU.uVunuUNVVUUV) {
         if (!Character.isISOControl(var2)) {
            if (var3 == this.nuUnNvnuUu && this.nuUnNvnuUu.uNNnnnuuuN.length() < 64) {
               this.nuUnNvnuUu.uNNnnnuuuN = this.nuUnNvnuUu.uNNnnnuuuN + var2;
               this.C00OOC00oO();
               this.uUnuvNvvNU();
            } else if (Character.isDigit(var2) && var3.uNNnnnuuuN.length() < var3.VVuuUN) {
               var3.uNNnnnuuuN = var3.uNNnnnuuuN + var2;
               var1.uUVvnUuNvvN();
            }
         }

         return true;
      } else {
         return false;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nvnUNvNUNv.nvnNNunvv var2, nUvnuVnNUU var3, NUunUunuNV var4) {
      int var5 = NUunUunuNV.UuUVuuUu(var4.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var4.UNnVVNvvnVvU(), 34), 0.16F);
      int var6 = NUunUunuNV.UuUVuuUu(var4.vNVuvnUUnuUn(), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 150), 0.24F);
      var1.UuUVuuUu(
         var2.leftX(),
         var2.panelY(),
         var2.leftW(),
         var2.panelH(),
         var3.UuUVuuUu(6.0F),
         var3.UuUVuuUu(7.0F),
         var3.UuUVuuUu(1.0F),
         NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 13)
      );
      var1.UuUVuuUu(var2.leftX(), var2.panelY(), var2.leftW(), var2.panelH(), var3.UuUVuuUu(6.0F), var5);
      var1.UuUVuuUu(var2.leftX(), var2.panelY(), var2.leftW(), var2.panelH(), var3.UuUVuuUu(6.0F), var6, 0.7F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var2.leftX() + var3.UuUVuuUu(12.0F),
         var2.panelY() + var3.UuUVuuUu(8.0F),
         var3.UuUVuuUu(12.0F),
         10.0F,
         "Рецепт крафта",
         nunvNNUnvU.UuUVuuUu(var4)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoCraft var3, nvnUNvNUNv.nvnNNunvv var4, nUvnuVnNUU var5, NUunUunuNV var6) {
      float var7 = this.C00OOC00oO(var5);
      float var8 = var5.UuUVuuUu(3.0F);

      for (int var9 = 0; var9 < 9; var9++) {
         int var10 = var9 / 3;
         int var11 = var9 % 3;
         float var12 = var4.gridX() + var11 * (var7 + var8);
         float var13 = var4.gridY() + var10 * (var7 + var8);
         boolean var14 = var3.NVNnnvnuunNv.UuUVuuUu(var9).equals(this.vuuuNvNuv);
         float var15 = var2.UuUVuuUu("autocraft:slot:hover:" + var9, nunvNNUnvU.UuUVuuUu(var2, var12, var13, var7, var7) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
         float var16 = this.UuUVuuUu(this.vNUvnnVnUvu[var9], 430L);
         float var17 = 1.0F + var15 * 0.035F + var16 * 0.08F;
         var1.UuUVuuUu(var17, var12 + var7 * 0.5F, var13 + var7 * 0.5F);

         try {
            if (var16 > 0.01F) {
               var1.UuUVuuUu(
                  var12,
                  var13,
                  var7,
                  var7,
                  var5.UuUVuuUu(3.0F),
                  var5.UuUVuuUu(8.0F) * var16,
                  var5.UuUVuuUu(1.0F),
                  NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), Math.round(80.0F * var16))
               );
            }

            int var18 = var14
               ? NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), Math.round(46.0F + 24.0F * var15 + 38.0F * var16))
               : NUunUunuNV.UuUVuuUu(var6.vuuuNvNuv(), var6.UuuNnUvUuv(), var15);
            int var19 = !var14 && !(var16 > 0.01F) ? var6.UnUNVVVNuv() : NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), var6.uVunuUNVVUUV(), Math.max(var15, var16));
            var1.UuUVuuUu(var12, var13, var7, var7, var5.UuUVuuUu(3.0F), var18);
            var1.UuUVuuUu(var12, var13, var7, var7, var5.UuUVuuUu(3.0F), var19, !var14 && !(var16 > 0.01F) ? 0.55F : 0.95F);
            class_1799 var20 = this.C00OOC00oO(var3.NVNnnvnuunNv.UuUVuuUu(var9));
            if (!var20.method_7960()) {
               this.UuUVuuUu(var1, var20, var12 + var7 * 0.23F, var13 + var7 * 0.18F, var7 * 0.54F, var4.leftX(), var4.panelY(), var4.leftW(), var4.panelH());
            }
         } finally {
            var1.uVUuuVnNVU();
         }
      }

      float var24 = var2.UuUVuuUu(
         "autocraft:clear:hover",
         nunvNNUnvU.UuUVuuUu(var2, var4.clearX(), var4.clearY(), var4.clearW(), var5.UuUVuuUu(14.0F)) ? 1.0F : 0.0F,
         Cc0cOoOcC0o.vuuuNvNuv()
      );
      float var25 = this.UuUVuuUu(this.nUUVuvU, 450L);
      var1.UuUVuuUu(
         var4.clearX(),
         var4.clearY(),
         var4.clearW(),
         var5.UuUVuuUu(14.0F),
         var5.UuUVuuUu(3.0F),
         NUunUunuNV.UuUVuuUu(var6.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 64), Math.max(var24, var25))
      );
      var1.UuUVuuUu(
         var4.clearX(),
         var4.clearY(),
         var4.clearW(),
         var5.UuUVuuUu(14.0F),
         var5.UuUVuuUu(3.0F),
         NUunUunuNV.UuUVuuUu(var6.nUUVuvU(), var6.uVunuUNVVUUV(), Math.max(var24, var25)),
         0.5F + var25 * 0.4F
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var5,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var4.clearX() + var4.clearW() * 0.5F,
         var4.clearY(),
         var5.UuUVuuUu(14.0F),
         7.0F,
         "Очистить",
         nunvNNUnvU.UuUVuuUu(var6),
         "c"
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoCraft var3, nvnUNvNUNv.nvnNNunvv var4, nUvnuVnNUU var5, NUunUunuNV var6, float var7) {
      List var8 = UuUVuuUu(this.nuUnNvnuUu.uNNnnnuuuN);
      float var9 = var2.UuUVuuUu("autocraft:search:focus", var2.NuUuUvUUvU() == this.nuUnNvnuUu ? 1.0F : 0.0F, Cc0cOoOcC0o.vNUvnnVnUvu());
      float var10 = var2.UuUVuuUu("autocraft:search:query", this.nuUnNvnuUu.uNNnnnuuuN.isBlank() ? 0.0F : 1.0F, Cc0cOoOcC0o.vNUvnnVnUvu());
      float var11 = this.UuUVuuUu(this.UnUNVVVNuv, 360L);
      int var12 = NUunUunuNV.UuUVuuUu(var6.UuuNnUvUuv(), NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 58), Math.max(var10 * 0.45F, var9 * 0.7F));
      int var13 = NUunUunuNV.UuUVuuUu(var6.vNVuvnUUnuUn(), var6.uVunuUNVVUUV(), Math.max(var9, var11));
      var1.UuUVuuUu(var4.searchX(), var4.searchY(), var4.searchW(), var4.searchH(), var5.UuUVuuUu(4.0F), var12);
      var1.UuUVuuUu(var4.searchX(), var4.searchY(), var4.searchW(), var4.searchH(), var5.UuUVuuUu(4.0F), var13, 0.55F + var9 * 0.25F + var11 * 0.35F);
      if (var9 > 0.01F || var11 > 0.01F) {
         var1.UuUVuuUu(
            var4.searchX(),
            var4.searchY(),
            var4.searchW(),
            var4.searchH(),
            var5.UuUVuuUu(4.0F),
            var5.UuUVuuUu(8.0F) * Math.max(var9, var11),
            var5.UuUVuuUu(1.0F),
            NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), Math.round(32.0F * Math.max(var9, var11)))
         );
      }

      String var14 = this.nuUnNvnuUu.uNNnnnuuuN.isBlank() ? "Поиск" : this.nuUnNvnuUu.uNNnnnuuuN + (var2.NuUuUvUUvU() == this.nuUnNvnuUu ? "|" : "");
      int var15 = this.nuUnNvnuUu.uNNnnnuuuN.isBlank() ? nunvNNUnvU.uUnuvNvvNU(var6) : nunvNNUnvU.UuUVuuUu(var6);
      String var16 = this.nuUnNvnuUu.uNNnnnuuuN.isBlank() ? "" : Integer.toString(var8.size());
      float var17 = var16.isBlank() ? 0.0F : nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.vVvUvVVuuNvV, var16, 8.0F) + var5.UuUVuuUu(12.0F);
      String var18 = nunvNNUnvU.UuUVuuUu(var5, vNvnnVvvVUu.UuUVuuUu, var14, 8.0F, var4.searchW() - var5.UuUVuuUu(12.0F) - var17);
      nunvNNUnvU.UuUVuuUu(var1, var5, vNvnnVvvVUu.UuUVuuUu, var4.searchX() + var5.UuUVuuUu(6.0F), var4.searchY(), var4.searchH(), 8.0F, var18, var15);
      if (!var16.isBlank()) {
         var1.UuUVuuUu(
            var4.searchX() + var4.searchW() - var17 - var5.UuUVuuUu(4.0F),
            var4.searchY() + var5.UuUVuuUu(4.0F),
            var17,
            var4.searchH() - var5.UuUVuuUu(8.0F),
            var5.UuUVuuUu(4.0F),
            NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 55)
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var5,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var4.searchX() + var4.searchW() - var17 * 0.5F - var5.UuUVuuUu(4.0F),
            var4.searchY(),
            var4.searchH(),
            8.0F,
            var16,
            var6.uVunuUNVVUUV(),
            "c"
         );
      }

      var1.uUnuvNvvNU();
      var1.UuUVuuUu(Math.round(var4.catalogX()), Math.round(var4.catalogY()), Math.round(var4.catalogW()), Math.round(var4.catalogH()));

      try {
         if (var8.isEmpty()) {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var5,
               vNvnnVvvVUu.UuUVuuUu,
               var4.catalogX() + var4.catalogW() * 0.5F,
               var4.catalogY() + var4.catalogH() * 0.5F - var5.UuUVuuUu(5.0F),
               var5.UuUVuuUu(10.0F),
               8.0F,
               "Нет совпадений",
               nunvNNUnvU.uUnuvNvvNU(var6),
               "c"
            );
            return;
         }

         int var19 = this.UuUVuuUu(var4, var5);
         float var20 = this.UuUVuuUu(var5);
         float var21 = var5.UuUVuuUu(3.0F);
         float var22 = var4.catalogY() + var7;

         for (int var23 = 0; var23 < var8.size(); var23++) {
            nvnUNvNUNv.NVnVnNnN var24 = (nvnUNvNUNv.NVnVnNnN)var8.get(var23);
            int var25 = var23 / var19;
            int var26 = var23 % var19;
            float var27 = var4.catalogX() + var26 * (var20 + var21);
            float var28 = var22 + var25 * (var20 + var21);
            if (!(var28 + var20 < var4.catalogY()) && !(var28 > var4.catalogY() + var4.catalogH())) {
               boolean var29 = var24.id().equals(this.vuuuNvNuv);
               float var30 = var2.UuUVuuUu(
                  "autocraft:catalog:hover:" + var24.id(), nunvNNUnvU.UuUVuuUu(var2, var27, var28, var20, var20) ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv()
               );
               float var31 = var2.UuUVuuUu("autocraft:catalog:selected:" + var24.id(), var29 ? 1.0F : 0.0F, Cc0cOoOcC0o.vNUvnnVnUvu());
               float var32 = this.UuUVuuUu(this.uVUuuVnNVU.getOrDefault(var24.id(), 0L), 430L);
               float var33 = 1.0F + var30 * 0.04F + var32 * 0.1F;
               var1.UuUVuuUu(var33, var27 + var20 * 0.5F, var28 + var20 * 0.5F);

               try {
                  if (var32 > 0.01F) {
                     var1.UuUVuuUu(
                        var27,
                        var28,
                        var20,
                        var20,
                        var5.UuUVuuUu(3.0F),
                        var5.UuUVuuUu(7.0F) * var32,
                        var5.UuUVuuUu(1.0F),
                        NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), Math.round(72.0F * var32))
                     );
                  }

                  var1.UuUVuuUu(
                     var27,
                     var28,
                     var20,
                     var20,
                     var5.UuUVuuUu(3.0F),
                     NUunUunuNV.UuUVuuUu(var6.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var6.UNnVVNvvnVvU(), 72), Math.max(var31, var30 * 0.45F))
                  );
                  var1.UuUVuuUu(
                     var27,
                     var28,
                     var20,
                     var20,
                     var5.UuUVuuUu(3.0F),
                     NUunUunuNV.UuUVuuUu(var6.nUUVuvU(), var6.uVunuUNVVUUV(), Math.max(var31, var32)),
                     !(var31 > 0.01F) && !(var32 > 0.01F) ? 0.45F : 0.9F
                  );
                  this.UuUVuuUu(
                     var1,
                     var24.stack(),
                     var27 + var20 * 0.16F,
                     var28 + var20 * 0.16F,
                     var20 * 0.68F,
                     var4.catalogX(),
                     var4.catalogY(),
                     var4.catalogW(),
                     var4.catalogH()
                  );
               } finally {
                  var1.uVUuuVnNVU();
               }
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      this.UuUVuuUu(var1, var3, var4, var5, var6, var7);
   }

   private void UuUVuuUu(UnVNvNnU var1, AutoCraft var2, nvnUNvNUNv.nvnNNunvv var3, nUvnuVnNUU var4, NUunUunuNV var5, float var6) {
      float var7 = this.UuUVuuUu(var2, var3, var4);
      float var8 = var4.UuUVuuUu(3.0F);
      float var9 = this.uNNnnnuuuN(var3, var4);
      float var10 = var3.catalogY();
      float var11 = var3.catalogH();
      var1.UuUVuuUu(var9, var10, var8, var11, var8 * 0.5F, var5.nvUVNnuu());
      float var12 = var7 <= 0.0F ? var11 : Math.max(var4.UuUVuuUu(16.0F), var11 * (var11 / (var11 + var7)));
      float var13 = var7 <= 0.0F ? 0.0F : this.UuUVuuUu(-var6 / var7, 0.0F, 1.0F);
      float var14 = var10 + (var11 - var12) * var13;
      var1.UuUVuuUu(var9, var14, var8, var12, var8 * 0.5F, NUunUunuNV.UuUVuuUu(var5.UvnvNVnnnnNU(), var5.uVunuUNVVUUV(), 0.45F));
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, AutoCraft var3, nvnUNvNUNv.nvnNNunvv var4, nUvnuVnNUU var5, nUVuuNUVnV var6) {
      float var7 = this.C00OOC00oO(var4, var5);
      float var8 = this.uUnuvNvvNU(var4, var5);
      float var9 = this.vVvUvVVuuNvV(var4, var5);
      this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3.uVunuUNVVUUV, var7, var8, var9, var6);
      this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3.UNnVVNvvnVvU, var7, var8 + var5.UuUVuuUu(24.0F), var9, var6);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nvnUNvNUNv.nvnNNunvv var3, nUvnuVnNUU var4) {
      if (!this.nvUVNnuu.isBlank()) {
         class_1799 var5 = this.C00OOC00oO(this.nvUVNnuu);
         if (!var5.method_7960()) {
            float var6 = var4.UuUVuuUu(18.0F);
            this.UuUVuuUu(
               var1,
               var5,
               var2.unnUnUNVnN() - var6 * 0.5F,
               var2.NnuUnUNnu() - var6 * 0.5F,
               var6,
               var3.x() - var4.UuUVuuUu(20.0F),
               var3.y() - var4.UuUVuuUu(20.0F),
               var3.width() + var4.UuUVuuUu(40.0F),
               var3.height() + var4.UuUVuuUu(80.0F)
            );
         }
      }
   }

   private nvnUNvNUNv.nvnNNunvv UuUVuuUu(VvvVunn var1, nUvnuVnNUU var2) {
      float var3 = var2.UvnvNVnnnnNU();
      float var4 = var1.C00OOC00oO() + var2.UuUVuuUu(14.0F);
      float var5 = var1.uUnuvNvvNU() + var3 + var2.UuUVuuUu(8.0F);
      float var6 = var1.vVvUvVVuuNvV() - var2.UuUVuuUu(28.0F);
      float var7 = var2.UuUVuuUu(12.0F);
      float var8 = var2.UuUVuuUu(14.0F);
      float var9 = this.UuUVuuUu(var2);
      float var10 = var2.UuUVuuUu(3.0F);
      float var11 = var9 * 6.0F + var10 * 5.0F;
      float var12 = var9 * 3.0F + var10 * 2.0F;
      float var13 = this.C00OOC00oO(var2);
      float var14 = var2.UuUVuuUu(3.0F);
      float var15 = var13 * 3.0F + var14 * 2.0F;
      float var16 = var15 + var8 + var11 + var2.UuUVuuUu(8.0F);
      float var18 = var2.UuUVuuUu(162.0F);
      float var20 = var4 + var7;
      float var21 = var20 + var15 + var8;
      float var25 = var5 + var7 + var2.UuUVuuUu(14.0F);
      float var26 = var6 - var7 * 2.0F;
      float var27 = var2.UuUVuuUu(18.0F);
      float var28 = var25 + var27 + var2.UuUVuuUu(8.0F);
      float var31 = var28 + var15 + var2.UuUVuuUu(6.0F);
      return new nvnUNvNUNv.nvnNNunvv(
         var4,
         var5,
         var6,
         var18,
         var4,
         var21,
         var6,
         var11,
         var5,
         var18,
         var20,
         var28,
         var20,
         var31,
         var15,
         var20,
         var25,
         var26,
         var27,
         var21,
         var28,
         var11,
         var12
      );
   }

   private static List<nvnUNvNUNv.NVnVnNnN> UuUVuuUu(String var0) {
      String var1 = var0 == null ? "" : var0.trim().toLowerCase(Locale.ROOT);
      if (var1.isEmpty()) {
         return UuUVuuUu();
      } else {
         ArrayList var2 = new ArrayList();

         for (nvnUNvNUNv.NVnVnNnN var4 : UuUVuuUu()) {
            if (var4.id().toLowerCase(Locale.ROOT).contains(var1) || var4.label().toLowerCase(Locale.ROOT).contains(var1)) {
               var2.add(var4);
            }
         }

         return var2;
      }
   }

   private static List<nvnUNvNUNv.NVnVnNnN> UuUVuuUu() {
      if (uUnuvNvvNU != null) {
         return uUnuvNvvNU;
      } else {
         ArrayList var0 = new ArrayList();

         for (class_1792 var2 : class_7923.field_41178) {
            if (var2 != class_1802.field_8162) {
               class_2960 var3 = class_7923.field_41178.method_10221(var2);
               if (var3 != null && "minecraft".equals(var3.method_12836())) {
                  class_1799 var4 = var2.method_7854();
                  var0.add(new nvnUNvNUNv.NVnVnNnN(var3.toString(), var4.method_7964().getString(), var4));
               }
            }
         }

         var0.sort(Comparator.comparing(nvnUNvNUNv.NVnVnNnN::label, String.CASE_INSENSITIVE_ORDER));
         uUnuvNvvNU = List.copyOf(var0);
         return uUnuvNvvNU;
      }
   }

   private class_1799 C00OOC00oO(String var1) {
      class_2960 var2 = class_2960.method_12829(var1 == null ? "" : var1);
      if (var2 == null) {
         return class_1799.field_8037;
      } else {
         class_1792 var3 = (class_1792)class_7923.field_41178.method_63535(var2);
         return var3 == class_1802.field_8162 ? class_1799.field_8037 : var3.method_7854();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, class_1799 var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (!(this.uNnUnnuNUnNu < 0.15F)) {
         if (var2 != null && !var2.method_7960() && !(var5 <= 0.0F) && !(var8 <= 0.0F) && !(var9 <= 0.0F)) {
            if (!(var3 + var5 <= var6) && !(var4 + var5 <= var7) && !(var3 >= var6 + var8) && !(var4 >= var7 + var9)) {
               var1.UuUVuuUu(var6, var7, var8, var9, 0.0F, 0.0F, 0.0F, 0.0F);

               try {
                  NuNvVUuUUnun.UuUVuuUu(var1, var2, var3, var4, var5 / 16.0F, 0, false, 0);
               } finally {
                  var1.nuUnNvnuUu();
               }
            }
         }
      }
   }

   private float UuUVuuUu(AutoCraft var1, nvnUNvNUNv.nvnNNunvv var2, nUvnuVnNUU var3) {
      int var4 = this.UuUVuuUu(var2, var3);
      int var5 = Math.max(1, (UuUVuuUu(this.nuUnNvnuUu.uNNnnnuuuN).size() + var4 - 1) / var4);
      float var6 = var5 * this.UuUVuuUu(var3) + Math.max(0, var5 - 1) * var3.UuUVuuUu(3.0F);
      return Math.max(0.0F, var6 - var2.catalogH());
   }

   private int UuUVuuUu(nvnUNvNUNv.nvnNNunvv var1, nUvnuVnNUU var2) {
      return 6;
   }

   private float UuUVuuUu(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(28.0F);
   }

   private float C00OOC00oO(nUvnuVnNUU var1) {
      return var1.UuUVuuUu(24.0F);
   }

   private float C00OOC00oO(nvnUNvNUNv.nvnNNunvv var1, nUvnuVnNUU var2) {
      return var1.x() + var2.UuUVuuUu(12.0F);
   }

   private float uUnuvNvvNU(nvnUNvNUNv.nvnNNunvv var1, nUvnuVnNUU var2) {
      return var1.panelY() + var1.panelH() + var2.UuUVuuUu(10.0F);
   }

   private float vVvUvVVuuNvV(nvnUNvNUNv.nvnNNunvv var1, nUvnuVnNUU var2) {
      return var1.width() - var2.UuUVuuUu(24.0F);
   }

   private float uNNnnnuuuN(nvnUNvNUNv.nvnNNunvv var1, nUvnuVnNUU var2) {
      return var1.catalogX() + var1.catalogW() + var2.UuUVuuUu(3.0F);
   }

   private void UuUVuuUu(AutoCraft var1, nvnUNvNUNv.nvnNNunvv var2, nUvnuVnNUU var3, float var4) {
      if (var1 != null && var2 != null && var3 != null) {
         float var5 = this.UuUVuuUu(var1, var2, var3);
         if (var5 <= 0.0F) {
            this.vNVuvnUUnuUn = 0.0F;
            this.VVuuUN.UuUVuuUu(0.0F);
         } else {
            float var6 = this.UuUVuuUu((var4 - var2.catalogY()) / Math.max(1.0F, var2.catalogH()), 0.0F, 1.0F);
            this.vNVuvnUUnuUn = -var5 * var6;
            this.VVuuUN.UuUVuuUu(this.vNVuvnUUnuUn);
         }
      }
   }

   private void C00OOC00oO() {
      this.vNVuvnUUnuUn = 0.0F;
      this.VVuuUN.UuUVuuUu(0.0F);
   }

   private void UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < this.vNUvnnVnUvu.length) {
         this.vNUvnnVnUvu[var1] = System.currentTimeMillis();
      }
   }

   private void uUnuvNvvNU(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.uVUuuVnNVU.put(var1, System.currentTimeMillis());
      }
   }

   private void uUnuvNvvNU() {
      this.UnUNVVVNuv = System.currentTimeMillis();
   }

   private float UuUVuuUu(long var1, long var3) {
      if (var1 > 0L && var3 > 0L) {
         float var5 = (float)(System.currentTimeMillis() - var1);
         if (var5 >= (float)var3) {
            return 0.0F;
         } else {
            float var6 = 1.0F - var5 / (float)var3;
            return var6 * var6;
         }
      } else {
         return 0.0F;
      }
   }

   private int UuUVuuUu(float var1, float var2) {
      for (int var3 = 0; var3 < 9; var3++) {
         int var4 = var3 / 3;
         int var5 = var3 % 3;
         float var6 = this.uVUVnuvnuVuv.gridX() + var5 * (this.uVunuUNVVUUV + this.UNnVVNvvnVvU);
         float var7 = this.uVUVnuvnuVuv.gridY() + var4 * (this.uVunuUNVVUUV + this.UNnVVNvvnVvU);
         if (var1 >= var6 && var2 >= var7 && var1 < var6 + this.uVunuUNVVUUV && var2 < var7 + this.uVunuUNVVUUV) {
            return var3;
         }
      }

      return -1;
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   record NVnVnNnN(String id, String label, class_1799 stack) {
   }

   record nvnNNunvv(
      float x,
      float y,
      float width,
      float height,
      float leftX,
      float rightX,
      float leftW,
      float rightW,
      float panelY,
      float panelH,
      float gridX,
      float gridY,
      float clearX,
      float clearY,
      float clearW,
      float searchX,
      float searchY,
      float searchW,
      float searchH,
      float catalogX,
      float catalogY,
      float catalogW,
      float catalogH
   ) {
   }
}

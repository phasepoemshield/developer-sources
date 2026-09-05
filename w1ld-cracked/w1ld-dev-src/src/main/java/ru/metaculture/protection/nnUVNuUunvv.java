package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import net.minecraft.class_310;
import org.wild.module.api.Module;

public final class nnUVNuUunvv {
   private static final float UuUVuuUu = 120.0F;
   private static final float C00OOC00oO = 8.0F;
   private static final float uUnuvNvvNU = 17.0F;
   private static final float vVvUvVVuuNvV = 8.0F;
   private static final float uNNnnnuuuN = 156.0F;
   private static final float nuUnNvnuUu = 22.0F;
   private static final EnumMap<oOOOo0, nNnnnNvVnvV> VVuuUN = new EnumMap<>(oOOOo0.class);
   private static final Map<Module, uVVuNvUUV> vNUvnnVnUvu = new HashMap<>();
   private static final Set<Module> uVUuuVnNVU = new HashSet<>();
   private static boolean vuuuNvNuv = false;
   private static boolean nvUVNnuu = false;
   private static final uVVuNvUUV UuuNnUvUuv = new uVVuNvUUV();

   private nnUVNuUunvv() {
   }

   static uVVuNvUUV UuUVuuUu(Module var0) {
      return vNUvnnVnUvu.computeIfAbsent(var0, var0x -> new uVVuNvUUV());
   }

   static void C00OOC00oO(Module var0) {
      uVVuNvUUV var1 = UuUVuuUu(var0);
      if (uVUuuVnNVU.contains(var0)) {
         uVUuuVnNVU.remove(var0);
         var1.UuUVuuUu(0.0, 0.18F, VnuVvnV.UnUNVVVNuv);
      } else {
         uVUuuVnNVU.add(var0);
         var1.UuUVuuUu(1.0, 0.18F, VnuVvnV.UnUNVVVNuv);
      }
   }

   public static boolean UuUVuuUu(UnVNvNnU var0, double var1, double var3, int var5) {
      float[] var6 = CoCO0oOCO0c.UuUVuuUu((float)var1, (float)var3);
      int var7 = (int)var6[0];
      int var8 = (int)var6[1];
      nnUVNuUunvv.NVnVnNnN var9 = nnUVNuUunvv.NVnVnNnN.UuUVuuUu();
      if (!var9.UuUVuuUu) {
         return false;
      } else {
         UuUVuuUu(var9.vuuuNvNuv);
         if (UUVNUUUnNUv.vNVuvnUUnuUn != null) {
            float var10 = UvNnVvNNVvuN.UuUVuuUu(UUVNUUUnNUv.UvnvNVnnnnNU);
            if (UuvVnuU.UuUVuuUu(var7, var8, var10, UUVNUUUnNUv.uVUVnuvnuVuv, 160.0F, 119.0F)) {
               NNvNUNnUnNuU.UuUVuuUu(var7, var8, var5);
               return true;
            }
         }

         if (UuUVuuUu(var7, var8, var5, var9)) {
            return true;
         } else if (C00OOC00oO(var7, var8, var5, var9)) {
            return true;
         } else if (var5 == 0 && UuUVuuUu(var9, var7, var8)) {
            return false;
         } else {
            for (nNnnnNvVnvV var11 : VVuuUN.values()) {
               if (var11.UuUVuuUu(var0, var7, var8, var5)) {
                  return true;
               }
            }

            if (UUVNUUUnNUv.uNnUnnuNUnNu != null && var5 >= 0 && var5 <= 8) {
               int var14 = -100 - var5;
               UUVNUUUnNUv.uNnUnnuNUnNu.vVvUvVVuuNvV = var14;
               UUVNUUUnNUv.uNnUnnuNUnNu.VVuuUN = false;
               UUVNUUUnNUv.uNnUnnuNUnNu = null;
               return true;
            } else if (UUVNUUUnNUv.UnUNuUU != null && var5 >= 0 && var5 <= 8) {
               int var13 = -100 - var5;
               UUVNUUUnNUv.UnUNuUU.uNNnnnuuuN = var13;
               UUVNUUUnNUv.UnUNuUU.nvUVNnuu = false;
               UUVNUUUnNUv.UnUNuUU = null;
               return true;
            } else {
               if (UUVNUUUnNUv.NnUuNNU != null && var5 == 0) {
                  UUVNUUUnNUv.NnUuNNU.vNUvnnVnUvu = false;
                  UUVNUUUnNUv.NnUuNNU = null;
               }

               if (UUVNUUUnNUv.vNVuvnUUnuUn != null && var5 == 0) {
                  UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
                  UUVNUUUnNUv.vNVuvnUUnuUn = null;
                  UUVNUUUnNUv.UvnvNVnnnnNU = 0.0F;
                  UUVNUUUnNUv.uVUVnuvnuVuv = 0.0F;
               }

               return false;
            }
         }
      }
   }

   public static boolean UuUVuuUu(double var0, double var2, double var4) {
      float[] var6 = CoCO0oOCO0c.UuUVuuUu((float)var0, (float)var2);
      float var7 = var6[0];
      float var8 = var6[1];
      UuUVuuUu(oOOOo0.values());

      for (nNnnnNvVnvV var10 : VVuuUN.values()) {
         if (var10.UuUVuuUu(var7, var8, var4)) {
            return true;
         }
      }

      return false;
   }

   public static void UuUVuuUu(UnVNvNnU var0, int var1, int var2, float var3) {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO != null) {
         int var4 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO.vNUvnnVnUvu();
         Color var5 = new Color(var4);
         float[] var6 = Color.RGBtoHSB(var5.getRed(), var5.getGreen(), var5.getBlue(), null);
         Color var7 = Color.getHSBColor(var6[0], var6[1] * 0.15F, 0.3F);
         Color var8 = Color.getHSBColor(var6[0], var6[1] * 0.3F, 0.17F);
         Color var9 = Color.getHSBColor(var6[0], var6[1] * 0.3F, 1.0F);
         Color var10 = Color.getHSBColor(var6[0], var6[1] * 0.2F, 1.0F);
         NvVNvUvunNNu.CUSTOM.UuUVuuUu(var5, var7, var8, var9, Color.WHITE, var10);
         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() == NvVNvUvunNNu.CUSTOM) {
            UUVNUUUnNUv.NVuunNnvvvVu = NvVNvUvunNNu.CUSTOM;
            UUVNUUUnNUv.NVuNUuVnVUN = NvVNvUvunNNu.CUSTOM;
         }
      }

      nnUVNuUunvv.NVnVnNnN var11 = nnUVNuUunvv.NVnVnNnN.UuUVuuUu();
      if (var11.UuUVuuUu) {
         boolean var12 = UUVNUUUnNUv.unNNVVNnvvV || UUVNUUUnNUv.VVnVNnunVvu != null && !UUVNUUUnNUv.VVnVNnunVvu.isEmpty();
         UUVNUUUnNUv.UnUNVVVNuv.UuUVuuUu();
         if (var12 != vuuuNvNuv) {
            UUVNUUUnNUv.UnUNVVVNuv.UuUVuuUu(var12 ? 1.0 : 0.0, var12 ? 0.32F : 0.16F, var12 ? VnuVvnV.UUVNuUNUvUnV : VnuVvnV.nUUVuvU, false);
            vuuuNvNuv = var12;
         }

         for (int var13 = 0; var13 < var11.vuuuNvNuv.length; var13++) {
            oOOOo0 var15 = var11.vuuuNvNuv[var13];
            nNnnnNvVnvV var17 = VVuuUN.computeIfAbsent(var15, nNnnnNvVnvV::new);
            var17.UuUVuuUu(var11.vNUvnnVnUvu + var13 * (var11.vVvUvVVuuNvV + var11.nuUnNvnuUu), var11.uVUuuVnNVU, var11.vVvUvVVuuNvV, var11.uNNnnnuuuN);
            var17.UuUVuuUu(var0, var1, var2, var3);
         }

         if (UUVNUUUnNUv.vNVuvnUUnuUn instanceof VnnUvVNuNuVv) {
            int var14 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), (int)(100.0F * var3));
            int var16 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(1, 1), (int)(180.0F * var3));
            int var18 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), (int)(200.0F * var3));
            UvNnVvNNVvuN.UuUVuuUu(var0, UUVNUUUnNUv.vNVuvnUUnuUn, var1, var2, var14, var16, var18, var3 * UUVNUUUnNUv.nuUnNvnuUu.uVUuuVnNVU());
         }

         UuUVuuUu(var0, var11, var3, var1, var2);
         UuUVuuUu(var0, var1, var2, var3, var11);
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, int var1, int var2, float var3, nnUVNuUunvv.NVnVnNnN var4) {
      UuuNnUvUuv.UuUVuuUu();
      UuuNnUvUuv.UuUVuuUu(nvUVNnuu ? 1.0 : 0.0, 0.2F, VnuVvnV.UnUNVVVNuv, false);
      float var5 = UuuNnUvUuv.uNNnnnuuuN();
      NvVNvUvunNNu var6 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
      float var7 = 110.0F;
      float var8 = 22.0F;
      float var9 = var4.C00OOC00oO - var7 - 10.0F;
      float var10 = var4.uUnuvNvvNU - var8 - 10.0F;
      int var11 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), (int)(30.0F * var3));
      int var12 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(1, 1), (int)(200.0F * var3));
      int var13 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), (int)(220.0F * var3));
      var0.UuUVuuUu(var9, var10, var7, var8, 6.0F, var11, 1.0F);
      var0.UuUVuuUu(var9, var10, var7, var8, 6.0F, var12);
      var0.UuUVuuUu(var9 + 6.0F, var10 + 7.0F, 8.0F, 8.0F, 4.0F, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var6.UuUVuuUu().getRGB(), (int)(255.0F * var3)));
      var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9 + 20.0F, var10 + 13.0F, 12.0F, var6.UuUVuuUu, var13);
      if (var5 > 0.01F) {
         NvVNvUvunNNu[] var14 = NvVNvUvunNNu.values();
         float var15 = 18.0F;
         float var16 = var14.length * var15 + 8.0F;
         float var17 = var9;
         float var18 = var10 - 6.0F - var16 * var5;
         var0.UuUVuuUu(var9, var10 - 6.0F - var16, var7, var16, 0.0F, 0.0F, 6.0F, 6.0F);
         var0.UuUVuuUu(var9, var18, var7, var16, 6.0F, var11, 1.0F);
         var0.UuUVuuUu(var9, var18, var7, var16, 6.0F, var12);
         float var19 = var18 + 4.0F;

         for (NvVNvUvunNNu var23 : var14) {
            boolean var24 = UuvVnuU.UuUVuuUu(var1, var2, var17, var19, var7, var15);
            int var25 = var24 ? UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(60.0F * var3 * var5)) : 0;
            if (var24 || var23 == var6) {
               var0.UuUVuuUu(
                  var17 + 4.0F,
                  var19,
                  var7 - 8.0F,
                  var15,
                  4.0F,
                  var25 != 0 ? var25 : UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(30.0F * var3 * var5))
               );
            }

            var0.UuUVuuUu(var17 + 8.0F, var19 + 5.0F, 8.0F, 8.0F, 4.0F, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var23.UuUVuuUu().getRGB(), (int)(255.0F * var3 * var5)));
            var0.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu, var17 + 22.0F, var19 + 10.0F, 11.0F, var23.UuUVuuUu, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var13, (int)(255.0F * var3 * var5))
            );
            if (var23 == NvVNvUvunNNu.CUSTOM) {
               var0.UuUVuuUu(
                  vNvnnVvvVUu.UuUVuuUu, var17 + var7 - 30.0F, var19 + 10.0F, 9.0F, "[ПКМ]", UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var13, (int)(120.0F * var3 * var5))
               );
            }

            var19 += var15;
         }

         var0.nuUnNvnuUu();
      }
   }

   private static boolean UuUVuuUu(int var0, int var1, int var2, nnUVNuUunvv.NVnVnNnN var3) {
      float var4 = 110.0F;
      float var5 = 22.0F;
      float var6 = var3.C00OOC00oO - var4 - 10.0F;
      float var7 = var3.uUnuvNvvNU - var5 - 10.0F;
      if (var2 == 0 && UuvVnuU.UuUVuuUu(var0, var1, var6, var7, var4, var5)) {
         nvUVNnuu = !nvUVNnuu;
         return true;
      } else if (UuUVuuUu(var0, var1, var3)) {
         return false;
      } else {
         if (nvUVNnuu) {
            NvVNvUvunNNu[] var8 = NvVNvUvunNNu.values();
            float var9 = var8.length * 18.0F + 8.0F;
            float var10 = var7 - 6.0F - var9;
            if (UuvVnuU.UuUVuuUu(var0, var1, var6, var10, var4, var9)) {
               float var11 = var1 - (var10 + 4.0F);
               int var12 = (int)(var11 / 18.0F);
               if (var12 >= 0 && var12 < var8.length) {
                  NvVNvUvunNNu var13 = var8[var12];
                  NvVNvUvunNNu var14 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
                  if (var2 == 0) {
                     if (var14 != var13) {
                        UUVNUUUnNUv.uNNnnnuuuN.uUnuvNvvNU();
                        NNUuUVvUUU.UuUVuuUu().UuUVuuUu((double)var0, (double)var1, var13.UuUVuuUu().getRGB(), var13.vVvUvVVuuNvV().getRGB());
                        UUVNUUUnNUv.NVuNUuVnVUN = var13;
                        UUVNUUUnNUv.NVuunNnvvvVu = var13;
                        ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.UuUVuuUu(var13);
                     }
                  } else if (var2 == 1 && var13 == NvVNvUvunNNu.CUSTOM) {
                     if (var14 != NvVNvUvunNNu.CUSTOM) {
                        UUVNUUUnNUv.uNNnnnuuuN.uUnuvNvvNU();
                        NNUuUVvUUU.UuUVuuUu()
                           .UuUVuuUu((double)var0, (double)var1, NvVNvUvunNNu.CUSTOM.UuUVuuUu().getRGB(), NvVNvUvunNNu.CUSTOM.vVvUvVVuuNvV().getRGB());
                        UUVNUUUnNUv.NVuNUuVnVUN = NvVNvUvunNNu.CUSTOM;
                        UUVNUUUnNUv.NVuunNnvvvVu = NvVNvUvunNNu.CUSTOM;
                        ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.UuUVuuUu(NvVNvUvunNNu.CUSTOM);
                     }

                     VnnUvVNuNuVv var15 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO;
                     if (UUVNUUUnNUv.vNVuvnUUnuUn == var15) {
                        UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
                        UUVNUUUnNUv.vNVuvnUUnuUn = null;
                     } else {
                        UUVNUUUnNUv.vNVuvnUUnuUn = var15;
                        UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.FORWARDS);
                        UUVNUUUnNUv.UvnvNVnnnnNU = var6 - 160.0F - 6.0F;
                        UUVNUUUnNUv.uVUVnuvnuVuv = var10;
                     }
                  }
               }

               return true;
            }

            if (var2 == 0 || var2 == 1) {
               nvUVNnuu = false;
               if (UUVNUUUnNUv.vNVuvnUUnuUn == ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO) {
                  UUVNUUUnNUv.nuUnNvnuUu.C00OOC00oO(uununU.BACKWARDS);
                  UUVNUUUnNUv.vNVuvnUUnuUn = null;
               }
            }
         }

         return false;
      }
   }

   private static boolean UuUVuuUu(float var0, float var1, nnUVNuUunvv.NVnVnNnN var2) {
      for (int var3 = 0; var3 < var2.vuuuNvNuv.length; var3++) {
         float var4 = var2.vNUvnnVnUvu + var3 * (var2.vVvUvVVuuNvV + var2.nuUnNvnuUu);
         if (UuvVnuU.UuUVuuUu(var0, var1, var4, var2.uVUuuVnNVU, var2.vVvUvVVuuNvV, var2.uNNnnnuuuN)) {
            return true;
         }
      }

      return false;
   }

   private static boolean UuUVuuUu(nnUVNuUunvv.NVnVnNnN var0, int var1, int var2) {
      return false;
   }

   private static void UuUVuuUu(UnVNvNnU var0, nnUVNuUunvv.NVnVnNnN var1, float var2, int var3, int var4) {
      float var5 = UUVNUUUnNUv.UnUNVVVNuv.uNNnnnuuuN();
      if (!(var5 <= 0.01F)) {
         float var6 = UuUVuuUu(var1);
         float var7 = var1.vNUvnnVnUvu + (var1.VVuuUN - var6) * 0.5F;
         float var8 = UuUVuuUu(var1, var5);
         float var9 = 17.0F;
         int var10 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.uNNnnnuuuN(1, 1), (int)(30.0F * var2 * var5));
         int var11 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(1, 1), (int)(205.0F * var2 * var5));
         int var12 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.VVuuUN(1, 1), (int)(220.0F * var2 * var5));
         int var13 = UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(UnVNvNnU.VvunVVUvUNnv.nuUnNvnuUu(1, 1), (int)(120.0F * var2 * var5));
         var0.UuUVuuUu(var7, var8, var6, var9, 6.0F, var10, 0.6F);
         var0.UuUVuuUu(var7, var8, var6, var9, 6.0F, var11);
         String var14 = UUVNUUUnNUv.VVnVNnunVvu == null ? "" : UUVNUUUnNUv.VVnVNnunVvu;
         String var15 = var14.isEmpty() ? "" : UuUVuuUu(var14);
         String var16 = UuUVuuUu(var14, var15);
         float var17 = var7 + 6.0F;
         float var18 = var8 + 5.5F + 6.2F;
         if (!var14.isEmpty()) {
            var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var17, var18, 11.0F, var14, var12);
            if (!var16.isEmpty()) {
               float var19 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14, 11.0F).UuUVuuUu;
               float var20 = var17 + Math.min(var19 + 1.0F, var6 - 14.0F);
               var0.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var20, var18, 11.0F, var16, var13);
            }
         }

         if (UUVNUUUnNUv.unNNVVNnvvV) {
            float var21 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14, 11.0F).UuUVuuUu;
            float var23 = var17 + Math.min(var21 + 1.0F, var6 - 14.0F);
            var0.UuUVuuUu(var23, var8 + 4.0F, 1.0F, var9 - 8.0F, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var12, (int)(200.0F * var5)));
         }

         boolean var22 = UuvVnuU.UuUVuuUu(var3, var4, var7, var8, var6, var9);
         if (var22) {
            var0.UuUVuuUu(var7, var8, var6, var9, 6.0F, UnVNvNnU.VvunVVUvUNnv.nvUVNnuu(var13, (int)(80.0F * var5)), 0.5F);
         }
      }
   }

   private static boolean C00OOC00oO(int var0, int var1, int var2, nnUVNuUunvv.NVnVnNnN var3) {
      float var4 = UuUVuuUu(var3);
      float var5 = var3.vNUvnnVnUvu + (var3.VVuuUN - var4) * 0.5F;
      float var6 = UuUVuuUu(var3, UUVNUUUnNUv.UnUNVVVNuv.uNNnnnuuuN());
      boolean var7 = UuvVnuU.UuUVuuUu(var0, var1, var5, var6, var4, 17.0F);
      if (var2 == 0 && var7) {
         UUVNUUUnNUv.unNNVVNnvvV = true;
         return true;
      } else {
         if (var2 == 0 && UUVNUUUnNUv.unNNVVNnvvV && !var7) {
            UUVNUUUnNUv.unNNVVNnvvV = false;
         }

         return false;
      }
   }

   private static float UuUVuuUu(nnUVNuUunvv.NVnVnNnN var0) {
      return Math.min(156.0F, var0.VVuuUN);
   }

   private static float UuUVuuUu(nnUVNuUunvv.NVnVnNnN var0, float var1) {
      float var2 = var0.uVUuuVnNVU + var0.uNNnnnuuuN + 8.0F;
      return var2 + (1.0F - var1) * 22.0F;
   }

   private static String UuUVuuUu(String var0) {
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         String var1 = var0.trim().toLowerCase();
         if (var1.isEmpty()) {
            return "";
         } else {
            ArrayList var2 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO();
            return var2.stream()
               .filter(var1x -> var1x != null && var1x.vVvUvVVuuNvV != null && var1x.vVvUvVVuuNvV.toLowerCase().contains(var1))
               .min(Comparator.<Module>comparingInt(var1x -> {
                  String var2x = var1x.vVvUvVVuuNvV.toLowerCase();
                  int var3 = var2x.indexOf(var1);
                  return var3 < 0 ? Integer.MAX_VALUE : var3;
               }).thenComparingInt(var0x -> var0x.vVvUvVVuuNvV.length()))
               .map(var0x -> var0x.vVvUvVVuuNvV)
               .orElse("");
         }
      } else {
         return "";
      }
   }

   private static String UuUVuuUu(String var0, String var1) {
      if (var0 == null || var1 == null || var0.isEmpty() || var1.isEmpty()) {
         return "";
      } else {
         return var1.regionMatches(true, 0, var0, 0, var0.length()) ? var1.substring(Math.min(var0.length(), var1.length())) : var1;
      }
   }

   private static void UuUVuuUu(oOOOo0[] var0) {
      for (oOOOo0 var4 : var0) {
         VVuuUN.computeIfAbsent(var4, nNnnnNvVnvV::new);
      }
   }

   static final class NVnVnNnN {
      final boolean UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;
      final float uNNnnnuuuN;
      final float nuUnNvnuUu;
      final float VVuuUN;
      final float vNUvnnVnUvu;
      final float uVUuuVnNVU;
      final oOOOo0[] vuuuNvNuv;

      private NVnVnNnN(boolean var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, oOOOo0[] var10) {
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
      }

      static nnUVNuUunvv.NVnVnNnN UuUVuuUu() {
         class_310 var0 = class_310.method_1551();
         if (var0 != null && var0.method_22683() != null) {
            float var1 = var0.method_22683().method_4486();
            float var2 = var0.method_22683().method_4502();
            oOOOo0[] var3 = new oOOOo0[]{oOOOo0.Combat, oOOOo0.Movement, oOOOo0.Visuals, oOOOo0.Player, oOOOo0.Misc};
            if (var3.length == 0) {
               return new nnUVNuUunvv.NVnVnNnN(false, var1, var2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, var3);
            } else {
               float var4 = 120.0F;
               float var5 = 8.0F;
               float var6 = var3.length * var4 + (var3.length - 1) * var5;
               float var7 = (var1 - var6) / 2.0F;
               float var8 = UuvVnuU.vuuuNvNuv(var2 - 80.0F, 190.0F, 320.0F);
               float var9 = (var2 - var8) / 2.0F;
               return new nnUVNuUunvv.NVnVnNnN(true, var1, var2, var4, var8, var5, var6, var7, var9, var3);
            }
         } else {
            return new nnUVNuUunvv.NVnVnNnN(false, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, oOOOo0.values());
         }
      }
   }
}

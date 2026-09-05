package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;
import java.util.Map.Entry;
import net.minecraft.class_1044;
import net.minecraft.class_1074;
import net.minecraft.class_10868;
import net.minecraft.class_1291;
import net.minecraft.class_1293;
import net.minecraft.class_1304;
import net.minecraft.class_1657;
import net.minecraft.class_1799;
import net.minecraft.class_243;
import net.minecraft.class_266;
import net.minecraft.class_269;
import net.minecraft.class_2960;
import net.minecraft.class_310;
import net.minecraft.class_4081;
import net.minecraft.class_490;
import net.minecraft.class_640;
import net.minecraft.class_8646;
import net.minecraft.class_9013;

final class UuNuuVUnv {
   private static final class_310 UuUVuuUu = class_310.method_1551();
   static final Cc0cOoOcC0o C00OOC00oO = new Cc0cOoOcC0o(0.014F, 0.74F, 0.001F, 0.001F);
   static final Cc0cOoOcC0o uUnuvNvvNU = new Cc0cOoOcC0o(0.012F, 0.8F, 0.001F, 0.001F);
   static final Cc0cOoOcC0o vVvUvVVuuNvV = new Cc0cOoOcC0o(0.082F, 0.56F, 0.001F, 0.001F);
   static final Cc0cOoOcC0o uNNnnnuuuN = new Cc0cOoOcC0o(0.066F, 0.7F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o nuUnNvnuUu = new Cc0cOoOcC0o(0.072F, 0.62F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o VVuuUN = new Cc0cOoOcC0o(0.096F, 0.78F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o vNUvnnVnUvu = new Cc0cOoOcC0o(0.028F, 0.92F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o uVUuuVnNVU = new Cc0cOoOcC0o(0.11F, 0.7F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o vuuuNvNuv = new Cc0cOoOcC0o(0.062F, 0.76F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o nvUVNnuu = new Cc0cOoOcC0o(0.058F, 0.78F, 0.001F, 0.001F);
   private static final float UuuNnUvUuv = 96.0F;
   private static final float nUUVuvU = 0.85F;
   private static final float UnUNVVVNuv = 1.35F;
   private static final float vNVuvnUUnuUn = 11.5F;
   private static final float UvnvNVnnnnNU = 29.0F;
   private static final float uVUVnuvnuVuv = 7.0F;
   private static final float NVNnnvnuunNv = 8.0F;
   private static final float uVunuUNVVUUV = 5.5F;
   private static final float UNnVVNvvnVvU = 11.0F;
   private static final float uNnUnnuNUnNu = 22.0F;
   private static final float NnUuNNU = 8.0F;
   private static final float nNvNUVU = 10.0F;
   private static final float UnUNuUU = 16.0F;
   private static final float uUVuVvuNUvnu = 7.0F;
   private static final float UvUvUNuvNU = 14.8F;
   private static final float c0oOOCcCoC0 = 11.2F;
   private static final float VVnVNnunVvu = 12.8F;
   private static final float unNNVVNnvvV = 9.4F;
   private static final float NuunnvnN = 3.6F;
   private static final float NVUunUNUN = 5.0F;
   private static final float UUVNuUNUvUnV = 16.0F;
   private static final float vuvnUnVnUNnV = 4.0F;
   private static final float nnuUVNUuvvVU = 6.0F;
   private static final float nVVUuvuNnUN = 22.0F;
   private static final float nNnVnUNVV = 7.2F;
   private static final float nuunNvv = 92.0F;
   private static final float uUVVvVVNvvn = 340.0F;
   private static final float vvUVNVvvNUv = 4.0F;
   private static final float UuNnnVnuNNV = 1.35F;
   private static final float uUVvnUuNvvN = 14.0F;
   private static final float UUuUnNVNuuv = 0.085F;
   private static final float NVuNUuVnVUN = 4.0F;
   private static final float NVuunNnvvvVu = 1.32F;
   private static final long vNnNuuvVn = 480L;
   private final Map<UUID, UuNuuVUnv.VUnuUnnuNvVu> VUuuVUnun = new HashMap<>();

   void UuUVuuUu() {
      this.VUuuVUnun.clear();
   }

   void UuUVuuUu(O0C0OC0OCcCO var1, NameTags var2) {
      if (UuUVuuUu.field_1687 != null && UuUVuuUu.field_1724 != null && !(UuUVuuUu.field_1755 instanceof class_490)) {
         UnVNvNnU var3 = var1.vVvUvVVuuNvV();
         UuNuuVUnv.nvUnvV var4 = this.C00OOC00oO();
         long var5 = System.currentTimeMillis();
         float var7 = UuUVuuUu.method_61966().method_60637(true);
         HashSet var8 = new HashSet();

         for (class_1657 var10 : UuUVuuUu.field_1687.method_18456()) {
            if (this.UuUVuuUu(var10, var2)) {
               UuNuuVUnv.VUUnVnVNNU var11 = this.UuUVuuUu(var10, var7, var1.nuUnNvnuUu(), var1.VVuuUN());
               UuNuuVUnv.VUnuUnnuNvVu var12 = this.VUuuVUnun.get(var10.method_5667());
               if (var11 != null) {
                  if (var12 == null) {
                     var12 = this.VUuuVUnun.computeIfAbsent(var10.method_5667(), UuNuuVUnv.VUnuUnnuNvVu::new);
                  }

                  this.UuUVuuUu(var12, var10, var11, var2, var5);
                  var8.add(var10.method_5667());
               } else if (var12 != null) {
                  this.UuUVuuUu(var12, var10, var2, var5);
                  var8.add(var10.method_5667());
               }
            }
         }

         for (Entry var15 : this.VUuuVUnun.entrySet()) {
            if (!var8.contains(var15.getKey())) {
               ((UuNuuVUnv.VUnuUnnuNvVu)var15.getValue()).UuUVuuUu();
            }
         }

         ArrayList var14 = new ArrayList(this.VUuuVUnun.size());

         for (UuNuuVUnv.VUnuUnnuNvVu var18 : this.VUuuVUnun.values()) {
            UuNuuVUnv.nUNvUnnVN var20 = this.UuUVuuUu(var18, var2, var5);
            if (var20 != null) {
               var14.add(var20);
            }
         }

         var3.UuUVuuUu(this.UuUVuuUu(var14.size()));
         var14.sort(Comparator.comparingDouble(UuNuuVUnv.nUNvUnnVN::distance).reversed());
         ArrayList var17 = new ArrayList(var14.size());

         for (UuNuuVUnv.nUNvUnnVN var21 : var14) {
            this.UuUVuuUu(var3, var4, var21, var5);
            if (var21.itemReveal > 0.04F && !var21.state.NVuNUuVnVUN.isEmpty()) {
               this.uUnuvNvvNU(var3, var4, var21);
               var17.add(var21);
            }
         }

         this.UuUVuuUu(var3, var17);
         this.VUuuVUnun.entrySet().removeIf(var2x -> var2x.getValue().UuUVuuUu(var5));
      } else {
         this.UuUVuuUu();
      }
   }

   private void UuUVuuUu(UuNuuVUnv.VUnuUnnuNvVu var1, class_1657 var2, UuNuuVUnv.VUUnVnVNNU var3, NameTags var4, long var5) {
      boolean var7 = var1.UvnvNVnnnnNU;
      boolean var8 = var1.uVUVnuvnuVuv;
      var1.UvnvNVnnnnNU = true;
      var1.uVUVnuvnuVuv = true;
      if (!var7 || !var8 && var5 - var1.UnUNuUU > 480L) {
         var1.nNvNUVU = var5;
      }

      var1.UnUNuUU = var5;
      if (!this.C00OOC00oO(var1, var2, var4, var5)) {
         var1.UvnvNVnnnnNU = false;
         var1.uVUVnuvnuVuv = false;
      } else {
         var1.UnUNVVVNuv = var3;
         var1.NVNnnvnuunNv = this.C00OOC00oO(var2, var4);
         var1.uVunuUNVVUUV = var1.NVNnnvnuunNv;
         var1.UNnVVNvvnVvU = !var1.NVuNUuVnVUN.isEmpty() && (var1.NVNnnvnuunNv || var1.c0oOOCcCoC0 <= var4.NuunnvnN.uUnuvNvvNU());
         var1.NnUuNNU = var5;
         if (!var1.vNVuvnUUnuUn) {
            var1.uUnuvNvvNU.UuUVuuUu(0.0F);
            var1.vVvUvVVuuNvV.UuUVuuUu(0.0F);
            var1.uNNnnnuuuN.UuUVuuUu(0.0F);
            var1.nuUnNvnuUu.UuUVuuUu(0.0F);
            var1.VVuuUN.UuUVuuUu(var1.unNNVVNnvvV);
            var1.vNUvnnVnUvu.UuUVuuUu(var1.NVUunUNUN);
            var1.uVUuuVnNVU.UuUVuuUu(var1.VVnVNnunVvu);
            var1.vuuuNvNuv.UuUVuuUu(var1.VVnVNnunVvu);
            var1.nvUVNnuu.UuUVuuUu(0.0F);
            var1.UuuNnUvUuv.UuUVuuUu(0.0F);
            var1.nUUVuvU.UuUVuuUu(0.0F);
            var1.vNVuvnUUnuUn = true;
         }
      }
   }

   private void UuUVuuUu(UuNuuVUnv.VUnuUnnuNvVu var1, class_1657 var2, NameTags var3, long var4) {
      var1.UvnvNVnnnnNU = true;
      var1.uVUVnuvnuVuv = false;
      if (!this.C00OOC00oO(var1, var2, var3, var4)) {
         var1.UvnvNVnnnnNU = false;
      } else {
         var1.NnUuNNU = var4;
         var1.NVNnnvnuunNv = false;
         var1.uVunuUNVVUUV = var1.uVunuUNVVUUV && var1.uNNnnnuuuN.UuUVuuUu() > 0.08F;
         var1.UNnVVNvvnVvU = var1.UNnVVNvvnVvU && var1.nuUnNvnuUu.UuUVuuUu() > 0.08F;
      }
   }

   private boolean C00OOC00oO(UuNuuVUnv.VUnuUnnuNvVu var1, class_1657 var2, NameTags var3, long var4) {
      String var6 = this.UuUVuuUu(var2.method_7334() != null ? var2.method_7334().getName() : var2.method_5477().getString());
      if (var6.isEmpty()) {
         return false;
      } else {
         var1.nuunNvv = ProtectInfo.uUnuvNvvNU(var6);
         var1.uNnUnnuNUnNu = uNvUVUNvuUVV.UuUVuuUu(var6);
         var1.uUVVvVVNvvn = O0oo00cC00o.UuUVuuUu(var2);
         var1.vvUVNVvvNUv = O0oo00cC00o.UuUVuuUu(var2, 16734824, 255) & 16777215;
         var1.c0oOOCcCoC0 = UuUVuuUu.field_1724 == null ? Float.MAX_VALUE : var2.method_5739(UuUVuuUu.field_1724);
         var1.NVuNUuVnVUN = this.uUnuvNvvNU(var2, var3);
         var1.NVuunNnvvvVu = this.vVvUvVVuuNvV(var2, var3);
         var1.uUVvnUuNvvN = this.UuUVuuUu(var1);
         var1.UUuUnNVNuuv = this.UuUVuuUu(var2, var1);
         float var7 = this.UuUVuuUu(var2);
         var1.UuNnnVnuNNV = this.UuUVuuUu(var7);
         float var8 = Math.max(1.0F, var2.method_6063());
         float var9 = this.C00OOC00oO(var7 / var8);
         if (var1.vNVuvnUUnuUn && var9 + 0.004F < var1.VVnVNnunVvu) {
            var1.uUVuVvuNUvnu = var4;
         }

         var1.VVnVNnunVvu = var9;
         int var10 = this.uUnuvNvvNU(var1);
         if (var10 != var1.UvUvUNuvNU) {
            this.C00OOC00oO(var1);
            var1.UvUvUNuvNU = var10;
         }

         return true;
      }
   }

   private UuNuuVUnv.nUNvUnnVN UuUVuuUu(UuNuuVUnv.VUnuUnnuNvVu var1, NameTags var2, long var3) {
      if (!var1.vNVuvnUUnuUn) {
         return null;
      } else {
         float var5 = var1.uUnuvNvvNU.UuUVuuUu(var1.UvnvNVnnnnNU ? 1.0F : 0.0F, C00OOC00oO);
         float var6 = var1.vVvUvVVuuNvV.UuUVuuUu(var1.UvnvNVnnnnNU ? 1.0F : 0.0F, uUnuvNvvNU);
         float var7 = var1.uVUuuVnNVU.UuUVuuUu(var1.VVnVNnunVvu, VVuuUN);
         float var8 = var1.vuuuNvNuv.UuUVuuUu();
         if (var1.VVnVNnunVvu >= var8) {
            var1.vuuuNvNuv.UuUVuuUu(var1.VVnVNnunVvu);
            var8 = var1.VVnVNnunVvu;
         } else {
            var8 = var1.vuuuNvNuv.UuUVuuUu(var1.VVnVNnunVvu, vNUvnnVnUvu);
         }

         float var9 = var1.UuuNnUvUuv.UuUVuuUu(0.0F, vuuuNvNuv);
         if (var1.uVUVnuvnuVuv && var1.UnUNVVVNuv != null) {
            float var10 = var1.uNNnnnuuuN.UuUVuuUu(var1.uVunuUNVVUUV ? 1.0F : 0.0F, vVvUvVVuuNvV);
            float var11 = var1.nuUnNvnuUu.UuUVuuUu(var1.UNnVVNvvnVvU ? 1.0F : 0.0F, uNNnnnuuuN);
            float var12 = var1.nvUVNnuu.UuUVuuUu(var1.NVNnnvnuunNv ? 1.0F : 0.0F, uVUuuVnNVU);
            float var13 = this.vVvUvVVuuNvV(var1.unNNVVNnvvV, var1.NuunnvnN, var10);
            float var14 = this.vVvUvVVuuNvV(var1.NVUunUNUN, var1.UUVNuUNUvUnV, var10);
            float var15 = var1.VVuuUN.UuUVuuUu(var13, nuUnNvnuUu);
            float var16 = var1.vNUvnnVnUvu.UuUVuuUu(var14, nuUnNvnuUu);
            float var17 = this.UuUVuuUu(var1.UnUNVVVNuv.distance(), var1.UnUNVVVNuv.projectedHeight(), var2.VVnVNnunVvu.uUnuvNvvNU());
            float var18 = var15 * var17;
            float var19 = var16 * var17;
            float var20 = this.UuUVuuUu(var1, var11, var17);
            float var21 = (1.0F - this.uUnuvNvvNU(0.1F, 0.95F, var5)) * 5.0F * var17;
            float var22 = this.uUnuvNvvNU(var1.UnUNVVVNuv.screenX() - var18 * 0.5F);
            float var23 = this.uUnuvNvvNU(var1.UnUNVVVNuv.screenY() - var19 - 8.0F * var17 - var21);
            float var24 = this.uUnuvNvvNU(0.02F, 0.94F, var5);
            float var25 = this.C00OOC00oO(var2.uUVvnUuNvvN.uUnuvNvvNU() * (0.14F + 0.86F * var24));
            if (var25 <= 0.01F) {
               return null;
            } else {
               float var26 = this.UuUVuuUu(var7, var3, var1.C00OOC00oO);
               float var27 = this.UuUVuuUu(var3 - var1.nNvNUVU, 720L);
               float var28 = this.UuUVuuUu(var3 - var1.uUVuVvuNUvnu, 360L);
               float var29 = Math.max(var27, var28);
               var9 = var1.UuuNnUvUuv.UuUVuuUu(var29, vuuuNvNuv);
               boolean var30 = var5 < 0.985F || var9 > 0.04F || var1.nNvNUVU >= var3 - 760L || var12 > 0.04F;
               return new UuNuuVUnv.nUNvUnnVN(
                  var1, var22, var23, var18, var19, var17, var20, var25, var5, var6, var10, var11, var12, var7, var8, var26, var9, var30
               );
            }
         } else {
            return null;
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3, long var4) {
      UvVNVNVuNN.UuUVuuUu(var3.state.UuUVuuUu, var3.y - var3.topExtension);
      float var6 = this.UuUVuuUu(var3);
      if (var3.shader) {
         this.UuUVuuUu(var1, var2, var3);
         UnVNvNnU.uunvUUVnuNn var7 = var1.C00OOC00oO(var3.x, var3.y, var3.width, var3.height);
         if (var7 != null) {
            try {
               this.UuUVuuUu(var1, var2, var3, 0.0F, 0.0F, UuNuuVUnv.NVnVnNnN.GHOST);
            } finally {
               var1.UuUVuuUu(var7);
            }

            boolean var8 = var1.UuUVuuUu(
               var7,
               var3.x,
               var3.y,
               var3.width,
               var3.height,
               11.5F * var3.scale,
               this.UuUVuuUu(var2.shellTop, var3.alpha * 0.8F),
               this.UuUVuuUu(this.UuUVuuUu(var2, var3), var3.alpha * (0.02F + var3.focus * 0.07F)),
               this.UuUVuuUu(this.C00OOC00oO(var2, var3), var3.alpha * (0.38F + var3.focus * 0.2F + var3.threat * 0.16F)),
               this.UuUVuuUu(this.uUnuvNvvNU(var2, var3), var3.alpha * (0.34F + var3.focus * 0.18F + var3.threat * 0.14F)),
               var3.appear,
               var6,
               this.UuUVuuUu(var4),
               var3.focus,
               var3.threat,
               var3.exposure
            );
            if (var8) {
               this.UuUVuuUu(var1, var2, var3, var3.x, var3.y, UuNuuVUnv.NVnVnNnN.OVERLAY);
               return;
            }
         }
      }

      this.C00OOC00oO(var1, var2, var3);
      this.UuUVuuUu(var1, var2, var3, var3.x, var3.y, UuNuuVUnv.NVnVnNnN.DIRECT);
   }

   private void UuUVuuUu(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3) {
      float var4 = 11.5F * var3.scale;
      float var5 = this.UuUVuuUu(var3);
      var1.UuUVuuUu(var3.x, var3.y, var3.width, var3.height, var4, var3.alpha * (0.5F + var3.focus * 0.18F + (1.0F - var5) * 0.12F));
      float var6 = var3.focus * 0.92F + var3.threat * 0.98F + var3.exposure * 0.68F;
      if (var6 > 0.03F) {
         int var7 = this.vVvUvVVuuNvV(var2, var3);
         var1.UuUVuuUu(
            var3.x,
            var3.y + var3.scale,
            var3.width,
            var3.height,
            var4,
            20.0F * var3.scale * var6,
            2.4F * var3.scale,
            this.UuUVuuUu(var7, var3.alpha * var6 * 0.15F)
         );
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3) {
      float var4 = 11.5F * var3.scale;
      int var5 = this.UuUVuuUu(this.UuUVuuUu(var2, var3), var3.alpha * (0.1F + var3.focus * 0.08F));
      int var6 = this.UuUVuuUu(var2.shellTop, var3.alpha * 0.72F);
      int var7 = this.UuUVuuUu(var2.shellBottom, var3.alpha * 0.88F);
      int var8 = this.vVvUvVVuuNvV(var2, var3);
      var1.UuUVuuUu(var3.x, var3.y, var3.width, var3.height, var4, var3.alpha * 0.52F);
      var1.C00OOC00oO(var3.x, var3.y, var3.width, var3.height, var4, var6, var7);
      var1.C00OOC00oO(
         var3.x + 1.0F,
         var3.y + 1.0F,
         Math.max(0.0F, var3.width - 2.0F),
         Math.max(0.0F, var3.height * 0.52F),
         Math.max(0.0F, var4 - 1.0F),
         this.UuUVuuUu(16777215, var3.alpha * 0.016F),
         this.UuUVuuUu(16777215, 0.0F)
      );
      var1.UuUVuuUu(var3.x, var3.y, var3.width, var3.height, var4, var5, Math.max(0.7F, var3.scale * 0.72F));
      float var9 = var3.focus * 0.92F + var3.threat * 0.98F + var3.exposure * 0.68F;
      if (var9 > 0.03F) {
         var1.UuUVuuUu(
            var3.x,
            var3.y + var3.scale,
            var3.width,
            var3.height,
            var4,
            18.0F * var3.scale * var9,
            2.2F * var3.scale,
            this.UuUVuuUu(var8, var3.alpha * var9 * 0.13F)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3, float var4, float var5, UuNuuVUnv.NVnVnNnN var6) {
      UuNuuVUnv.VUnuUnnuNvVu var7 = var3.state;
      float var8 = var3.scale;
      float var9 = 10.0F * var8;
      float var10 = 29.0F * var8;
      float var11 = 16.0F * var8;
      float var12 = 7.0F * var8;
      float var13 = 14.8F * var8;
      float var14 = 11.2F * var8;
      float var15 = 12.8F * var8;
      float var16 = 9.4F * var8;
      float var17 = this.UuUVuuUu(var3);
      float var18 = this.UuUVuuUu(var3, var6);
      float var19 = this.UuUVuuUu(var3, var18);
      float var20 = var6 == UuNuuVUnv.NVnVnNnN.GHOST ? 0.48F : 1.0F;
      float var21 = var6 == UuNuuVUnv.NVnVnNnN.GHOST ? 0.15F : 0.32F;
      float var22 = (1.0F - var17) * (var6 == UuNuuVUnv.NVnVnNnN.OVERLAY ? 1.85F : 5.0F) * var8;
      float var23 = var4 + var9;
      float var24 = var5 + (var10 - var11) * 0.5F + var22 * 0.16F;
      float var25 = this.uUnuvNvvNU(0.18F, 0.74F, var19);
      float var26 = var7.vuvnUnVnUNnV * var8 * var25;
      float var27 = var23 + var11 + var12;
      float var28 = Math.max(0.0F, var4 + var3.width - var9 - var27 - var26 - 42.0F * var8);
      String var29 = var7.uUVVvVVNvvn.isEmpty() ? "" : this.UuUVuuUu(var7.uUVVvVVNvvn, var28, vNvnnVvvVUu.UuUVuuUu, var14);
      float var30 = var29.isEmpty() ? 0.0F : this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var29, var14);
      float var31 = var29.isEmpty() ? 0.0F : 5.0F * var8;
      float var32 = var27 + var30 + var31;
      float var33 = Math.max(10.0F * var8, var4 + var3.width - var9 - var32 - Math.max(0.0F, var26 + 8.0F * var8 * var25));
      String var34 = this.UuUVuuUu(var7.nuunNvv, var33, vNvnnVvvVUu.vVvUvVVuuNvV, var13);
      UuNuuVUnv.nUVVnVNu var35 = this.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var34, var13);
      float var36 = this.UuUVuuUu(var5 + var22 * 0.08F, var10 - 5.0F * var8, var35.height);
      var1.UuUVuuUu(var23, var24, var11, var11, var11 * 0.48F, this.UuUVuuUu(var2.avatarBackdrop, var3.alpha * var20 * (0.14F + 0.2F * var18)));
      this.UuUVuuUu(
         var1,
         var7.UuUVuuUu,
         var7.nuunNvv,
         var23,
         var24,
         var11,
         var3.alpha * (var6 == UuNuuVUnv.NVnVnNnN.GHOST ? 0.18F + 0.42F * var18 : 0.42F + 0.58F * var18)
      );
      int var37 = this.UuUVuuUu(this.uNNnnnuuuN(var2, var3), var3.alpha * var18 * var20);
      if (!var29.isEmpty()) {
         UuNuuVUnv.nUVVnVNu var38 = this.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var29, var14);
         float var39 = this.UuUVuuUu(var5 + var22 * 0.08F, var10 - 5.0F * var8, var38.height);
         this.UuUVuuUu(
            var1, vNvnnVvvVUu.UuUVuuUu, var29, var27, var39, var14, this.UuUVuuUu(var7.vvUVNVvvNUv, var3.alpha * var18 * var20), var3.alpha * var18 * var21
         );
      }

      this.UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var34, var32, var36, var13, var37, var3.alpha * var18 * var21);
      if (var25 > 0.01F) {
         UuNuuVUnv.nUVVnVNu var50 = this.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var7.UuNnnVnuNNV, var15);
         float var52 = this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var7.UuNnnVnuNNV, var15);
         float var40 = var4 + var3.width - var9 - var52;
         float var41 = this.UuUVuuUu(var5 + var22 * 0.08F, var10 - 5.0F * var8, var50.height);
         this.UuUVuuUu(
            var1,
            vNvnnVvvVUu.UuUVuuUu,
            var7.UuNnnVnuNNV,
            var40,
            var41,
            var15,
            this.UuUVuuUu(var2.textPrimary, var3.alpha * var25 * var20),
            var3.alpha * var25 * var20 * 0.28F
         );
      }

      this.UuUVuuUu(var1, var2, var3, var4 + var9, var5 + var10 - 5.0F * var8 + var22 * 0.1F, var3.width - var9 * 2.0F, 3.6F * var8, var18, var20);
      if (!(var19 <= 0.01F)) {
         boolean var51 = this.vVvUvVVuuNvV(var7);
         float var53 = var5 + var10 + 4.0F * var8;
         int var54 = this.UuUVuuUu(var2.divider, var3.alpha * 0.1F * var19);
         var1.UuUVuuUu(var4 + var9, var53 - 1.5F * var8, var3.width - var9 * 2.0F, Math.max(1.0F, var8), 0.5F * var8, var54, this.UuUVuuUu(var2.divider, 0.0F));
         if (var51) {
            float var55 = this.uUnuvNvvNU(0.16F, 0.7F, var19) * var18 * var20;
            float var42 = this.UuUVuuUu(var5, var8);
            float var43 = 10.0F * var8;
            float var44 = var7.nVVUuvuNnUN * var8;
            float var45 = Math.max(0.0F, var3.width - var9 * 2.0F - var44 - (var7.UUuUnNVNuuv.text.isEmpty() ? 0.0F : 8.0F * var8));
            String var46 = this.UuUVuuUu(var7.uUVvnUuNvvN.text, var45, vNvnnVvvVUu.UuUVuuUu, var16);
            float var47 = Math.max(0.0F, this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var46, var16) + 8.0F * var8);
            if (!var46.isEmpty()) {
               var1.UuUVuuUu(
                  var4 + var9 - 3.0F * var8,
                  var42 - var43 * 0.72F,
                  var47,
                  var43,
                  var43 * 0.5F,
                  this.UuUVuuUu(this.UuUVuuUu(var2.avatarBackdrop, 592656, 0.3F), var3.alpha * (0.34F * var55))
               );
               this.UuUVuuUu(
                  var1,
                  vNvnnVvvVUu.UuUVuuUu,
                  var46,
                  var4 + var9,
                  var42,
                  var16,
                  this.UuUVuuUu(var7.uUVvnUuNvvN.color, var3.alpha * var55),
                  var3.alpha * var55 * 0.26F
               );
            }

            if (!var7.UUuUnNVNuuv.text.isEmpty()) {
               float var48 = Math.max(var7.nVVUuvuNnUN * var8, this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var7.UUuUnNVNuuv.text, var16));
               float var49 = var4 + var3.width - var9 - var48;
               var1.UuUVuuUu(
                  var49 - 3.0F * var8,
                  var42 - var43 * 0.72F,
                  var48 + 8.0F * var8,
                  var43,
                  var43 * 0.5F,
                  this.UuUVuuUu(this.UuUVuuUu(var2.avatarBackdrop, 592656, 0.3F), var3.alpha * (0.34F * var55))
               );
               this.UuUVuuUu(
                  var1,
                  vNvnnVvvVUu.UuUVuuUu,
                  var7.UUuUnNVNuuv.text,
                  var49,
                  var42,
                  var16,
                  this.UuUVuuUu(var7.UUuUnNVNuuv.color, var3.alpha * var55),
                  var3.alpha * var55 * 0.26F
               );
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var7 * 0.5F;
      float var11 = var6 * this.C00OOC00oO(var3.damage);
      float var12 = var6 * this.C00OOC00oO(var3.health);
      float var13 = var3.alpha * var9 * (0.24F + 0.76F * var8);
      var1.UuUVuuUu(var4, var5, var6, var7, var10, this.UuUVuuUu(var2.barTrack, var13 * 0.16F));
      var1.C00OOC00oO(var4, var5, var6, Math.max(var7 * 0.64F, 1.0F), var10, this.UuUVuuUu(16777215, var13 * 0.02F), this.UuUVuuUu(16777215, 0.0F));
      float var14 = Math.max(0.0F, var11 - var12);
      if (var14 > 0.4F) {
         var1.UuUVuuUu(var4 + var12, var5, var14, var7, var10, this.UuUVuuUu(15988479, var13 * 0.34F), this.UuUVuuUu(16777215, var13 * 0.18F));
      }

      if (var12 > 0.5F) {
         int var15 = this.UuUVuuUu(this.nuUnNvnuUu(var2, var3), var13);
         int var16 = this.UuUVuuUu(this.VVuuUN(var2, var3), var13);
         var1.UuUVuuUu(var4, var5, var12, var7, var10, var15, var16);
         var1.C00OOC00oO(var4, var5, var12, var7 * 0.58F, var10, this.UuUVuuUu(16777215, var13 * 0.15F), this.UuUVuuUu(16777215, 0.0F));
         float var17 = Math.max(var7 * 1.2F, 2.0F * var3.scale);
         float var18 = var4 + Math.max(0.0F, var12 - var17);
         var1.C00OOC00oO(
            var18,
            var5 - 0.15F * var3.scale,
            var17,
            var7 + 0.3F * var3.scale,
            var10,
            this.UuUVuuUu(16777215, var13 * 0.18F),
            this.UuUVuuUu(this.VVuuUN(var2, var3), var13 * 0.1F)
         );
      }

      if (var3.threat > 0.01F) {
         var1.vVvUvVVuuNvV();

         try {
            var1.UuUVuuUu(
               var4,
               var5,
               Math.max(1.0F, Math.max(var12, var11)),
               var7,
               var10,
               7.2F * var3.scale * var3.threat,
               1.65F * var3.scale,
               this.UuUVuuUu(var2.dangerGlow, var3.alpha * (0.1F + var3.threat * 0.12F))
            );
         } finally {
            var1.uNNnnnuuuN();
         }
      }
   }

   private void uUnuvNvvNU(UnVNvNnU var1, UuNuuVUnv.nvUnvV var2, UuNuuVUnv.nUNvUnnVN var3) {
      UuNuuVUnv.VUnuUnnuNvVu var4 = var3.state;
      if (!var4.NVuNUuVnVUN.isEmpty() && !(var3.itemReveal <= 0.02F)) {
         float var5 = var3.scale;
         float var6 = 16.0F * var5;
         float var7 = 4.0F * var5;
         float var8 = this.UuUVuuUu(var4.NVuNUuVnVUN, var6, var7);
         float var9 = var3.x + (var3.width - var8) * 0.5F;
         float var10 = this.uUnuvNvvNU(var3);
         float var11 = this.uUnuvNvvNU(0.1F, 0.84F, var3.itemReveal);

         for (int var12 = 0; var12 < var4.NVuNUuVnVUN.size(); var12++) {
            float var13 = this.C00OOC00oO(var11, 0.08F + var12 * 0.06F, 0.2F);
            if (!(var13 <= 0.01F)) {
               float var14 = var9 + var12 * (var6 + var7);
               float var15 = var10 + (1.0F - var13) * 6.0F * var5;
               float var16 = var6 * 0.42F;
               int var17 = this.UuUVuuUu(this.UuUVuuUu(var2.slotFill, 16777215, 0.06F), var3.alpha * (0.12F + var13 * 0.05F));
               int var18 = this.UuUVuuUu(this.UuUVuuUu(var2.avatarBackdrop, 132103, 0.18F), var3.alpha * (0.64F + var13 * 0.06F));
               int var19 = this.UuUVuuUu(this.UuUVuuUu(var2.rim, 16777215, 0.05F), var3.alpha * (0.06F + var13 * 0.04F));
               var1.UuUVuuUu(var14, var15 + 0.8F * var5, var6, var6, var16, 4.8F * var5, 1.05F * var5, this.UuUVuuUu(0, var3.alpha * (0.08F + var13 * 0.05F)));
               var1.C00OOC00oO(var14, var15, var6, var6, var16, var17, var18);
               var1.UuUVuuUu(var14, var15, var6, var6, var16, var19, Math.max(0.58F, var5 * 0.7F));
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, List<UuNuuVUnv.nUNvUnnVN> var2) {
      if (!var2.isEmpty() && UuUVuuUu.field_1724 != null) {
         var1.uUnuvNvvNU();

         for (UuNuuVUnv.nUNvUnnVN var4 : var2) {
            UuNuuVUnv.VUnuUnnuNvVu var5 = var4.state;
            float var6 = this.uUnuvNvvNU(0.1F, 0.84F, var4.itemReveal);
            if (!(var6 <= 0.01F) && !var5.NVuNUuVnVUN.isEmpty()) {
               float var7 = var4.scale;
               float var8 = 16.0F * var7;
               float var9 = 4.0F * var7;
               float var10 = this.UuUVuuUu(var5.NVuNUuVnVUN, var8, var9);
               float var11 = var4.x + (var4.width - var10) * 0.5F;
               float var12 = this.uUnuvNvvNU(var4);

               for (int var13 = 0; var13 < var5.NVuNUuVnVUN.size(); var13++) {
                  float var14 = this.C00OOC00oO(var6, 0.08F + var13 * 0.06F, 0.2F);
                  if (!(var14 <= 0.05F)) {
                     float var15 = var11 + var13 * (var8 + var9);
                     float var16 = var12 + (1.0F - var14) * 6.0F * var7;
                     float var17 = var8 * (0.6F + var14 * 0.24F) / 16.0F;
                     float var18 = 16.0F * var17;
                     float var19 = var15 + (var8 - var18) * 0.5F;
                     float var20 = var16 + (var8 - var18) * 0.5F;
                     int var10005 = var5.C00OOC00oO + var13;
                     NuNvVUuUUnun.UuUVuuUu(var1, var5.NVuNUuVnVUN.get(var13).stack, var19, var20, var17, var10005, false, var13);
                  }
               }
            }
         }
      }
   }

   private boolean UuUVuuUu(class_1657 var1, NameTags var2) {
      return var1 != null
         && var1.method_5805()
         && !var1.method_7325()
         && var1 != UuUVuuUu.field_1724
         && (var2.UvUvUNuvNU.uUnuvNvvNU() || !var1.method_5756(UuUVuuUu.field_1724));
   }

   private UuNuuVUnv.VUUnVnVNNU UuUVuuUu(class_1657 var1, float var2, int var3, int var4) {
      class_243 var5 = var1.method_30950(var2);
      double var6 = var1.method_17682() + 0.3 - (var1.method_5715() ? 0.14 : 0.0);
      class_243 var8 = new class_243(var5.field_1352, var5.field_1351 + var6, var5.field_1350);
      class_243 var9 = new class_243(var5.field_1352, var5.field_1351 + 0.02, var5.field_1350);
      class_243 var10 = VnNnNnvuvn.UuUVuuUu(var8);
      class_243 var11 = VnNnNnvuvn.UuUVuuUu(var9);
      if (var10 == null || var11 == null) {
         return null;
      } else if (!(var10.field_1350 <= 0.001) && !(var10.field_1350 > 1.0) && !(var11.field_1350 <= 0.001) && !(var11.field_1350 > 1.0)) {
         double var12 = UuUVuuUu.field_1773.method_19418().method_19326().method_1022(var8);
         if (var12 > 96.0) {
            return null;
         } else {
            float var14 = Math.max(18.0F, Math.abs((float)(var11.field_1351 - var10.field_1351)));
            float var15 = Math.max(18.0F, var14);
            if (!(var10.field_1352 < -var15 * 2.0F)
               && !(var10.field_1352 > var3 + var15 * 2.0F)
               && !(var10.field_1351 < -var4 * 0.6F)
               && !(var10.field_1351 > var4 + var15 * 2.0F)) {
               float var16 = this.uNNnnnuuuN((float)var10.field_1352, -var15 * 0.25F, var3 + var15 * 0.25F);
               float var17 = Math.max((float)var10.field_1351, 18.0F);
               return new UuNuuVUnv.VUUnVnVNNU(var16, var17, var12, var14, (float)var10.field_1350);
            } else {
               return null;
            }
         }
      } else {
         return null;
      }
   }

   private boolean C00OOC00oO(class_1657 var1, NameTags var2) {
      return UuUVuuUu.field_1755 == null && var2.c0oOOCcCoC0.uUnuvNvvNU() && UuUVuuUu.field_1692 == var1;
   }

   private List<UuNuuVUnv.VvunVVUvUNnv> uUnuvNvvNU(class_1657 var1, NameTags var2) {
      ArrayList var3 = new ArrayList(6);
      if (var2.uNnUnnuNUnNu.uUnuvNvvNU()) {
         this.UuUVuuUu(var3, var1.method_6118(class_1304.field_6169), class_1304.field_6169);
         this.UuUVuuUu(var3, var1.method_6118(class_1304.field_6174), class_1304.field_6174);
         this.UuUVuuUu(var3, var1.method_6118(class_1304.field_6172), class_1304.field_6172);
         this.UuUVuuUu(var3, var1.method_6118(class_1304.field_6166), class_1304.field_6166);
      }

      if (var2.NnUuNNU.uUnuvNvvNU()) {
         this.UuUVuuUu(var3, var1.method_6047(), class_1304.field_6173);
      }

      if (var2.nNvNUVU.uUnuvNvvNU()) {
         this.UuUVuuUu(var3, var1.method_6079(), class_1304.field_6171);
      }

      return var3;
   }

   private void UuUVuuUu(List<UuNuuVUnv.VvunVVUvUNnv> var1, class_1799 var2, class_1304 var3) {
      if (var2 != null && !var2.method_7960()) {
         var1.add(new UuNuuVUnv.VvunVVUvUNnv(var2.method_7972(), var3));
      }
   }

   private List<UuNuuVUnv.nvnNNunvv> vVvUvVVuuNvV(class_1657 var1, NameTags var2) {
      if (!var2.UnUNuUU.uUnuvNvvNU()) {
         return List.of();
      } else {
         ArrayList var3 = new ArrayList();

         for (class_1293 var5 : var1.method_6026()) {
            String var6 = this.UuUVuuUu(class_1074.method_4662(((class_1291)var5.method_5579().comp_349()).method_5567(), new Object[0]));
            if (!var6.isEmpty()) {
               String var7 = var6 + " " + this.C00OOC00oO(var5.method_5578() + 1);
               boolean var8 = ((class_1291)var5.method_5579().comp_349()).method_18792() == class_4081.field_18272;
               int var9 = var8 ? 16732754 : 15133941;
               var3.add(new UuNuuVUnv.nvnNNunvv(var7, var9, var8, var5.method_5584()));
            }
         }

         var3.sort(
            Comparator.<UuNuuVUnv.nvnNNunvv, Boolean>comparing(var0 -> !var0.harmful)
               .thenComparingInt(UuNuuVUnv.nvnNNunvv::duration)
               .reversed()
               .thenComparing(UuNuuVUnv.nvnNNunvv::label)
         );
         return var3.size() > 2 ? List.copyOf(var3.subList(0, 2)) : List.copyOf(var3);
      }
   }

   private UuNuuVUnv.uunvUUVnuNn UuUVuuUu(UuNuuVUnv.VUnuUnnuNvVu var1) {
      if (!var1.NVuunNnvvvVu.isEmpty()) {
         return new UuNuuVUnv.uunvUUVnuNn(var1.NVuunNnvvvVu.get(0).label, var1.NVuunNnvvvVu.get(0).color);
      } else {
         return var1.uNnUnnuNUnNu ? new UuNuuVUnv.uunvUUVnuNn("ALLY", 10284799) : new UuNuuVUnv.uunvUUVnuNn("", 15133941);
      }
   }

   private UuNuuVUnv.uunvUUVnuNn UuUVuuUu(class_1657 var1, UuNuuVUnv.VUnuUnnuNvVu var2) {
      if (var2.NVuunNnvvvVu.size() > 1) {
         return new UuNuuVUnv.uunvUUVnuNn(var2.NVuunNnvvvVu.get(1).label, var2.NVuunNnvvvVu.get(1).color);
      } else {
         return var1.method_6096() > 0 ? new UuNuuVUnv.uunvUUVnuNn("ARM " + var1.method_6096(), 12371672) : new UuNuuVUnv.uunvUUVnuNn("", 12371672);
      }
   }

   private void C00OOC00oO(UuNuuVUnv.VUnuUnnuNvVu var1) {
      var1.vuvnUnVnUNnV = this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var1.UuNnnVnuNNV, 12.8F);
      float var2 = this.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var1.nuunNvv, 14.8F);
      float var3 = var1.uUVVvVVNvvn.isEmpty() ? 0.0F : this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var1.uUVVvVVNvvn, 11.2F) + 5.0F;
      var1.nnuUVNUuvvVU = this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var1.uUVvnUuNvvN.text, 9.4F);
      var1.nVVUuvuNnUN = this.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var1.UUuUnNVNuuv.text, 9.4F);
      var1.nNnVnUNVV = this.UuUVuuUu(var1.NVuNUuVnVUN, 16.0F, 4.0F);
      var1.unNNVVNnvvV = this.uNNnnnuuuN(33.0F + var3 + var2 + 10.0F + 10.0F, 92.0F, 340.0F);
      float var4 = 33.0F + var3 + var2 + 12.0F + var1.vuvnUnVnUNnV + 10.0F;
      float var5 = var1.nnuUVNUuvvVU + var1.nVVUuvuNnUN + (!var1.uUVvnUuNvvN.text.isEmpty() && !var1.UUuUnNVNuuv.text.isEmpty() ? 8.0F : 0.0F);
      var1.NuunnvnN = this.uNNnnnuuuN(Math.max(var1.unNNVVNnvvV + 28.0F, Math.max(var4, var5 + 20.0F + 16.0F)), 92.0F, 340.0F);
      var1.NVUunUNUN = 29.0F;
      float var6 = 0.0F;
      if (this.vVvUvVVuuNvV(var1)) {
         var6 += 15.0F;
         var6 += 11.0F;
      }

      var1.UUVNuUNUvUnV = 29.0F + var6;
   }

   private int uUnuvNvvNU(UuNuuVUnv.VUnuUnnuNvVu var1) {
      int var2 = var1.nuunNvv.hashCode();
      var2 = 31 * var2 + var1.uUVVvVVNvvn.hashCode();
      var2 = 31 * var2 + var1.vvUVNVvvNUv;
      var2 = 31 * var2 + var1.UuNnnVnuNNV.hashCode();
      var2 = 31 * var2 + var1.uUVvnUuNvvN.text.hashCode();
      var2 = 31 * var2 + var1.uUVvnUuNvvN.color;
      var2 = 31 * var2 + var1.UUuUnNVNuuv.text.hashCode();
      var2 = 31 * var2 + var1.UUuUnNVNuuv.color;

      for (UuNuuVUnv.VvunVVUvUNnv var4 : var1.NVuNUuVnVUN) {
         var2 = 31 * var2 + class_1799.method_57355(var4.stack);
         var2 = 31 * var2 + var4.slot.ordinal();
      }

      for (UuNuuVUnv.nvnNNunvv var15 : var1.NVuunNnvvvVu) {
         var2 = 31 * var2 + var15.label.hashCode();
         var2 = 31 * var2 + var15.color;
      }

      return var2;
   }

   private float UuUVuuUu(double var1, float var3, float var4) {
      float var5 = this.uNNnnnuuuN(var3 / 96.0F, 0.75F, 1.35F);
      float var6 = this.uNNnnnuuuN((float)(1.35 - Math.log(var1 + 1.0) * 0.16), 0.75F, 1.25F);
      float var7 = this.uNNnnnuuuN(var5 * 0.7F + var6 * 0.3F, 0.85F, 1.35F);
      return this.C00OOC00oO(var7 * var4, 0.01F);
   }

   private float UuUVuuUu(class_1657 var1) {
      float var2 = var1.method_6032() + var1.method_6067();
      if (UuUVuuUu.field_1687 != null) {
         class_269 var3 = UuUVuuUu.field_1687.method_8428();
         class_266 var4 = var3.method_1189(class_8646.field_45158);
         if (var4 != null) {
            class_9013 var5 = var3.method_55430(var1, var4);
            if (var5 != null && var5.method_55397() > 0) {
               var2 = var5.method_55397();
            }
         }
      }

      return Math.max(0.0F, var2);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, UUID var2, String var3, float var4, float var5, float var6, float var7) {
      int var8 = this.UuUVuuUu(var2);
      if (var8 > 0) {
         GlStateManager._bindTexture(var8);
         var1.uNNnnnuuuN(var7);
         boolean var14 = false /* VF: Semaphore variable */;

         try {
            var14 = true;
            float var16 = var6 * 0.48F;
            var1.UuUVuuUu(var8, var4, var5, var6, var6, 0.125F, 0.125F, 0.25F, 0.25F, var16);
            var1.UuUVuuUu(var8, var4, var5, var6, var6, 0.625F, 0.125F, 0.75F, 0.25F, var16);
            var14 = false;
         } finally {
            if (var14) {
               var1.vuuuNvNuv();
            }
         }

         var1.vuuuNvNuv();
      } else {
         var1.UuUVuuUu(var4, var5, var6, var6, var6 * 0.48F, this.UuUVuuUu(1842983, var7 * 0.92F));
         String var9 = var3 != null && !var3.isEmpty() ? var3.substring(0, 1).toUpperCase(Locale.ROOT) : "?";
         float var10 = var6 * 0.62F;
         float var11 = this.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var9, var10);
         float var12 = this.uUnuvNvvNU(vNvnnVvvVUu.vVvUvVVuuNvV, var9, var10);
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var4 + (var6 - var11) * 0.5F, this.UuUVuuUu(var5, var6, var12), var10, var9, this.UuUVuuUu(15922683, var7));
      }
   }

   private int UuUVuuUu(UUID var1) {
      if (UuUVuuUu.method_1562() == null) {
         return 0;
      } else {
         class_640 var2 = UuUVuuUu.method_1562().method_2871(var1);
         if (var2 == null) {
            return 0;
         } else {
            class_2960 var3 = var2.method_52810().comp_1626();
            if (var3 == null) {
               return 0;
            } else {
               class_1044 var4 = UuUVuuUu.method_1531().method_4619(var3);
               return var4 != null && var4.method_68004() instanceof class_10868 var5 && var5.method_68427() > 0 ? var5.method_68427() : 0;
            }
         }
      }
   }

   private UuNuuVUnv.nvUnvV C00OOC00oO() {
      NvVNvUvunNNu var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO()
         : NvVNvUvunNNu.WILD;
      boolean var2 = VVNunVNVuuu.vVvUvVVuuNvV();
      int var3 = var1.UuUVuuUu().getRGB() & 16777215;
      int var4 = this.C00OOC00oO(var3, 1.18F);
      int var5 = this.UuUVuuUu(var3, 16777215, 0.18F);
      int var6 = var2
         ? this.UuUVuuUu(var1.uUnuvNvvNU().getRGB() & 16777215, 16777215, 0.44F)
         : this.UuUVuuUu(var1.uUnuvNvvNU().getRGB() & 16777215, 329224, 0.34F);
      int var7 = var2
         ? this.UuUVuuUu(var1.C00OOC00oO().getRGB() & 16777215, 15265269, 0.5F)
         : this.UuUVuuUu(var1.C00OOC00oO().getRGB() & 16777215, 197638, 0.44F);
      int var8 = var2 ? this.UuUVuuUu(var1.uNNnnnuuuN().getRGB() & 16777215, 1120034, 0.72F) : var1.uNNnnnuuuN().getRGB() & 16777215;
      int var9 = var2
         ? this.UuUVuuUu(var1.nuUnNvnuUu().getRGB() & 16777215, 4147287, 0.62F)
         : this.UuUVuuUu(var1.nuUnNvnuUu().getRGB() & 16777215, 15134199, 0.18F);
      int var10 = var2
         ? this.UuUVuuUu(var1.vVvUvVVuuNvV().getRGB() & 16777215, var4, 0.34F)
         : this.UuUVuuUu(var1.vVvUvVVuuNvV().getRGB() & 16777215, var4, 0.18F);
      return new UuNuuVUnv.nvUnvV(
         var4,
         var5,
         var6,
         var7,
         var10,
         var8,
         var9,
         var2 ? 15594234 : 1514017,
         var2 ? 16251647 : 1843241,
         var2 ? 14213614 : 2501688,
         var2 ? 13029857 : 2962497,
         13775174,
         16729440,
         6094796
      );
   }

   private int UuUVuuUu(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      if (var2.state.uNnUnnuNUnNu) {
         return this.UuUVuuUu(var1.accentTop, 12122111, 0.34F);
      } else if (var2.focus > 0.02F) {
         return this.UuUVuuUu(var1.accentTop, 16777215, 0.24F);
      } else {
         return var2.threat > 0.01F ? this.UuUVuuUu(var1.danger, var1.accentTop, 0.26F) : var1.rim;
      }
   }

   private int C00OOC00oO(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      if (var2.state.uNnUnnuNUnNu) {
         return this.UuUVuuUu(9105407, var1.accentTop, 0.44F);
      } else {
         return var2.threat > 0.08F ? this.UuUVuuUu(var1.dangerGlow, var1.danger, 0.36F) : var1.accentTop;
      }
   }

   private int uUnuvNvvNU(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      if (var2.state.uNnUnnuNUnNu) {
         return this.UuUVuuUu(14089215, var1.accentBottom, 0.4F);
      } else {
         return var2.threat > 0.08F ? this.UuUVuuUu(16756920, var1.dangerGlow, 0.46F) : var1.accentBottom;
      }
   }

   private int vVvUvVVuuNvV(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      if (var2.threat > 0.08F) {
         return var1.dangerGlow;
      } else if (var2.state.uNnUnnuNUnNu) {
         return 9366527;
      } else {
         return var2.focus > 0.1F ? this.UuUVuuUu(var1.accentTop, 16777215, 0.16F) : var1.accentTop;
      }
   }

   private int UuUVuuUu(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2, class_1304 var3) {
      if (var3 == class_1304.field_6173 || var3 == class_1304.field_6171) {
         return this.C00OOC00oO(var1, var2);
      } else {
         return var2.state.uNnUnnuNUnNu ? this.UuUVuuUu(10219519, var1.accentTop, 0.36F) : this.UuUVuuUu(var1.rim, var1.accentBottom, 0.24F);
      }
   }

   private int uNNnnnuuuN(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      if (var2.state.uNnUnnuNUnNu) {
         return this.UuUVuuUu(var1.textPrimary, 9433855, 0.34F);
      } else {
         return var2.focus > 0.08F ? this.UuUVuuUu(var1.textPrimary, var1.accentTop, 0.18F) : var1.textPrimary;
      }
   }

   private int nuUnNvnuUu(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      return var2.state.uNnUnnuNUnNu
         ? this.UuUVuuUu(var1.accentTop, var1.safeGlow, 0.32F)
         : this.UuUVuuUu(var2.health, this.UuUVuuUu(12985918, var1.danger, 0.45F), 15245893, 5427594);
   }

   private int VVuuUN(UuNuuVUnv.nvUnvV var1, UuNuuVUnv.nUNvUnnVN var2) {
      return var2.state.uNnUnnuNUnNu ? this.UuUVuuUu(var1.accentBottom, var1.safeGlow, 0.28F) : this.UuUVuuUu(var2.health, 16743309, 16765559, 10944454);
   }

   private int UuUVuuUu(float var1, int var2, int var3, int var4) {
      float var5 = this.C00OOC00oO(var1);
      return var5 < 0.5F ? this.UuUVuuUu(var2, var3, var5 * 2.0F) : this.UuUVuuUu(var3, var4, (var5 - 0.5F) * 2.0F);
   }

   private String UuUVuuUu(float var1) {
      float var2 = Math.round(var1 * 10.0F) / 10.0F;
      return !(var2 >= 10.0F) && var2 != (int)var2 ? String.format(Locale.US, "%.1f HP", var2) : Math.round(var2) + " HP";
   }

   private String UuUVuuUu(String var1, float var2, nUVnuvUu var3, float var4) {
      String var5 = this.UuUVuuUu(var1);
      if (var5.isEmpty()) {
         return "";
      } else if (this.C00OOC00oO(var3, var5, var4) <= var2) {
         return var5;
      } else {
         for (int var6 = var5.length() - 1; var6 > 0; var6--) {
            String var7 = var5.substring(0, var6).trim() + "...";
            if (this.C00OOC00oO(var3, var7, var4) <= var2) {
               return var7;
            }
         }

         return "...";
      }
   }

   private String UuUVuuUu(String var1) {
      if (var1 != null && !var1.isEmpty()) {
         String var2 = var1.replaceAll("(?i)§[0-9A-FK-OR]", "").replace('\n', ' ').replace('\r', ' ').replaceAll("\\p{Cntrl}", "").trim();

         while (var2.contains("  ")) {
            var2 = var2.replace("  ", " ");
         }

         return var2;
      } else {
         return "";
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUVnuvUu var2, String var3, float var4, float var5, float var6, int var7, float var8) {
      if (var3 != null && !var3.isEmpty()) {
         var1.UuUVuuUu(var2, var4 + 1.0F, var5 + 1.0F, var6, var3, this.UuUVuuUu(0, var8));
         var1.UuUVuuUu(var2, var4, var5, var6, var3, var7);
      }
   }

   private UuNuuVUnv.nUVVnVNu UuUVuuUu(nUVnuvUu var1, String var2, float var3) {
      VuuUvnvnuu.nvnNNunvv var4 = UnVNvNnU.UuUVuuUu(var1, var2, var3);
      return new UuNuuVUnv.nUVVnVNu(var4.UuUVuuUu, var4.C00OOC00oO);
   }

   private float C00OOC00oO(nUVnuvUu var1, String var2, float var3) {
      return UnVNvNnU.UuUVuuUu(var1, var2, var3).UuUVuuUu;
   }

   private float uUnuvNvvNU(nUVnuvUu var1, String var2, float var3) {
      return UnVNvNnU.UuUVuuUu(var1, var2, var3).C00OOC00oO;
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      return var1 + (var2 - var3) * 0.5F + var3 * 0.72F;
   }

   private float UuUVuuUu(float var1, float var2) {
      return var1 + 29.0F * var2 + 7.0F * var2 + 7.2F * var2;
   }

   private float UuUVuuUu(UuNuuVUnv.nUNvUnnVN var1) {
      float var2 = this.uUnuvNvvNU(0.08F, 0.88F, var1.content);
      float var3 = this.uUnuvNvvNU(0.04F, 0.58F, var1.appear);
      return this.C00OOC00oO(Math.max(var2, var3 * 0.74F));
   }

   private float C00OOC00oO(UuNuuVUnv.nUNvUnnVN var1) {
      return this.UuUVuuUu(var1, this.UuUVuuUu(var1));
   }

   private float UuUVuuUu(UuNuuVUnv.nUNvUnnVN var1, float var2) {
      return this.uUnuvNvvNU(0.1F, 0.92F, var1.detail) * (0.56F + 0.44F * var2);
   }

   private float UuUVuuUu(UuNuuVUnv.nUNvUnnVN var1, UuNuuVUnv.NVnVnNnN var2) {
      float var3 = this.UuUVuuUu(var1);

      return switch (var2) {
         case DIRECT -> var3;
         case GHOST -> this.C00OOC00oO(0.18F + var3 * 0.52F);
         case OVERLAY -> this.C00OOC00oO(0.62F + var3 * 0.38F);
      };
   }

   private float UuUVuuUu(UuNuuVUnv.VUnuUnnuNvVu var1, float var2, float var3) {
      return !var1.NVuNUuVnVUN.isEmpty() && !(var2 <= 0.02F) ? 26.0F * var3 * this.uUnuvNvvNU(0.1F, 0.72F, var2) : 0.0F;
   }

   private float uUnuvNvvNU(UuNuuVUnv.nUNvUnnVN var1) {
      return var1.y - var1.topExtension + 2.0F * var1.scale;
   }

   private float UuUVuuUu(int var1) {
      return var1 > 12 ? 10.0F : 13.0F;
   }

   private List<UuNuuVUnv.nUNvUnnVN> UuUVuuUu(List<UuNuuVUnv.nUNvUnnVN> var1, int var2) {
      if (var1.isEmpty()) {
         return var1;
      } else {
         ArrayList var3 = new ArrayList(var1);
         var3.sort(Comparator.comparingDouble(UuNuuVUnv.nUNvUnnVN::y).reversed().thenComparingDouble(UuNuuVUnv.nUNvUnnVN::distance));
         ArrayList var4 = new ArrayList(var3.size());

         for (UuNuuVUnv.nUNvUnnVN var6 : var3) {
            float var7 = 14.0F * var6.scale;
            float var8 = var6.y;

            boolean var9;
            do {
               var9 = false;

               for (UuNuuVUnv.nUNvUnnVN var11 : var4) {
                  if (this.UuUVuuUu(var6, var11)
                     && this.UuUVuuUu(var6.x, var6.width, var11.x, var11.width, var7 * 0.45F)
                     && this.C00OOC00oO(
                        var8 - var6.topExtension,
                        var6.height + var6.topExtension,
                        var11.y - var11.topExtension,
                        var11.height + var11.topExtension,
                        var7 * 0.25F
                     )) {
                     var8 = var11.y - var11.topExtension - var6.height - var7;
                     var9 = true;
                  }
               }
            } while (var9);

            float var14 = 8.0F + var6.topExtension;
            float var15 = Math.max(var14, var2 - var6.height - 8.0F);
            float var12 = this.uNNnnnuuuN(var8, var14, var15);
            float var13 = this.uNNnnnuuuN(var6.y + var6.state.nUUVuvU.UuUVuuUu(var12 - var6.y, nvUVNnuu), var14, var15);
            var4.add(var6.withY(var13));
         }

         return var4;
      }
   }

   private boolean UuUVuuUu(UuNuuVUnv.nUNvUnnVN var1, UuNuuVUnv.nUNvUnnVN var2) {
      float var3 = Math.abs(var1.state.UnUNVVVNuv.depth() - var2.state.UnUNVVVNuv.depth());
      double var4 = Math.min(var1.distance(), var2.distance());
      double var6 = Math.max(var1.distance(), var2.distance());
      double var8 = var6 / Math.max(0.001, var4);
      double var10 = var6 - var4;
      return var3 <= 0.085F || var8 <= 1.32F || var10 <= 4.0;
   }

   private boolean UuUVuuUu(float var1, float var2, float var3, float var4, float var5) {
      return var1 < var3 + var4 + var5 && var1 + var2 + var5 > var3;
   }

   private boolean C00OOC00oO(float var1, float var2, float var3, float var4, float var5) {
      return var1 < var3 + var4 + var5 && var1 + var2 + var5 > var3;
   }

   private boolean vVvUvVVuuNvV(UuNuuVUnv.VUnuUnnuNvVu var1) {
      return !var1.uUVvnUuNvvN.text.isEmpty() || !var1.UUuUnNVNuuv.text.isEmpty();
   }

   private float UuUVuuUu(List<UuNuuVUnv.VvunVVUvUNnv> var1, float var2, float var3) {
      return var1.isEmpty() ? 0.0F : var1.size() * var2 + Math.max(0, var1.size() - 1) * var3;
   }

   private float C00OOC00oO(float var1, float var2, float var3) {
      return this.uUnuvNvvNU(var2, var2 + var3, var1);
   }

   private float uUnuvNvvNU(float var1, float var2, float var3) {
      float var4 = this.C00OOC00oO((var3 - var1) / Math.max(1.0E-5F, var2 - var1));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float UuUVuuUu(float var1, long var2, int var4) {
      float var5 = this.C00OOC00oO((0.2F - var1) / 0.2F);
      if (var5 <= 0.0F) {
         return 0.0F;
      } else {
         float var6 = 0.5F + 0.5F * (float)Math.sin(this.UuUVuuUu(var2) * 9.4F + var4 * 0.173F);
         return var5 * (0.58F + 0.42F * var6);
      }
   }

   private float UuUVuuUu(long var1, long var3) {
      if (var1 >= 0L && var1 < var3) {
         float var5 = 1.0F - (float)var1 / (float)var3;
         return var5 * var5 * (3.0F - 2.0F * var5);
      } else {
         return 0.0F;
      }
   }

   private float UuUVuuUu(long var1) {
      return (float)(var1 % 1000000L) / 1000.0F;
   }

   private String C00OOC00oO(int var1) {
      return switch (Math.max(1, Math.min(10, var1))) {
         case 1 -> "I";
         case 2 -> "II";
         case 3 -> "III";
         case 4 -> "IV";
         case 5 -> "V";
         case 6 -> "VI";
         case 7 -> "VII";
         case 8 -> "VIII";
         case 9 -> "IX";
         default -> "X";
      };
   }

   private int UuUVuuUu(int var1, float var2) {
      int var3 = Math.max(0, Math.min(255, Math.round(this.C00OOC00oO(var2) * 255.0F)));
      return var3 << 24 | var1 & 16777215;
   }

   private int UuUVuuUu(int var1, int var2, float var3) {
      float var4 = this.C00OOC00oO(var3);
      int var5 = Math.round((var1 >> 16 & 0xFF) + ((var2 >> 16 & 0xFF) - (var1 >> 16 & 0xFF)) * var4);
      int var6 = Math.round((var1 >> 8 & 0xFF) + ((var2 >> 8 & 0xFF) - (var1 >> 8 & 0xFF)) * var4);
      int var7 = Math.round((var1 & 0xFF) + ((var2 & 0xFF) - (var1 & 0xFF)) * var4);
      return var5 << 16 | var6 << 8 | var7;
   }

   private int C00OOC00oO(int var1, float var2) {
      Color var3 = new Color(var1);
      int var4 = Math.max(0, Math.min(255, Math.round(var3.getRed() * var2)));
      int var5 = Math.max(0, Math.min(255, Math.round(var3.getGreen() * var2)));
      int var6 = Math.max(0, Math.min(255, Math.round(var3.getBlue() * var2)));
      return var4 << 16 | var5 << 8 | var6;
   }

   private float vVvUvVVuuNvV(float var1, float var2, float var3) {
      return var1 + (var2 - var1) * this.C00OOC00oO(var3);
   }

   private float uNNnnnuuuN(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   private float C00OOC00oO(float var1) {
      return this.uNNnnnuuuN(var1, 0.0F, 1.0F);
   }

   private float uUnuvNvvNU(float var1) {
      return Math.round(var1);
   }

   private float C00OOC00oO(float var1, float var2) {
      return var2 <= 0.0F ? var1 : Math.round(var1 / var2) * var2;
   }

   static enum NVnVnNnN {
      DIRECT,
      GHOST,
      OVERLAY;
   }

   record VUUnVnVNNU(float screenX, float screenY, double distance, float projectedHeight, float depth) {
   }

   static final class VUnuUnnuNvVu {
      final UUID UuUVuuUu;
      final int C00OOC00oO;
      final nnUNUvNvVNn uUnuvNvvNU = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn vVvUvVVuuNvV = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn uNNnnnuuuN = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn nuUnNvnuUu = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn VVuuUN = new nnUNUvNvVNn(92.0F);
      final nnUNUvNvVNn vNUvnnVnUvu = new nnUNUvNvVNn(29.0F);
      final nnUNUvNvVNn uVUuuVnNVU = new nnUNUvNvVNn(1.0F);
      final nnUNUvNvVNn vuuuNvNuv = new nnUNUvNvVNn(1.0F);
      final nnUNUvNvVNn nvUVNnuu = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn UuuNnUvUuv = new nnUNUvNvVNn(0.0F);
      final nnUNUvNvVNn nUUVuvU = new nnUNUvNvVNn(0.0F);
      UuNuuVUnv.VUUnVnVNNU UnUNVVVNuv;
      boolean vNVuvnUUnuUn;
      boolean UvnvNVnnnnNU;
      boolean uVUVnuvnuVuv;
      boolean NVNnnvnuunNv;
      boolean uVunuUNVVUUV;
      boolean UNnVVNvvnVvU;
      boolean uNnUnnuNUnNu;
      long NnUuNNU;
      long nNvNUVU;
      long UnUNuUU;
      long uUVuVvuNUvnu = Long.MIN_VALUE;
      int UvUvUNuvNU;
      float c0oOOCcCoC0 = Float.MAX_VALUE;
      float VVnVNnunVvu = 1.0F;
      float unNNVVNnvvV = 92.0F;
      float NuunnvnN = 92.0F;
      float NVUunUNUN = 29.0F;
      float UUVNuUNUvUnV = 29.0F;
      float vuvnUnVnUNnV;
      float nnuUVNUuvvVU;
      float nVVUuvuNnUN;
      float nNnVnUNVV;
      String nuunNvv = "";
      String uUVVvVVNvvn = "";
      int vvUVNVvvNUv = 16734824;
      String UuNnnVnuNNV = "20 HP";
      UuNuuVUnv.uunvUUVnuNn uUVvnUuNvvN = new UuNuuVUnv.uunvUUVnuNn("", 15133941);
      UuNuuVUnv.uunvUUVnuNn UUuUnNVNuuv = new UuNuuVUnv.uunvUUVnuNn("", 12371672);
      List<UuNuuVUnv.VvunVVUvUNnv> NVuNUuVnVUN = List.of();
      List<UuNuuVUnv.nvnNNunvv> NVuunNnvvvVu = List.of();

      private VUnuUnnuNvVu(UUID var1) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var1.hashCode();
      }

      void UuUVuuUu() {
         this.UvnvNVnnnnNU = false;
         this.uVUVnuvnuVuv = false;
         this.NVNnnvnuunNv = false;
         this.uVunuUNVVUUV = false;
         this.UNnVVNvvnVvU = false;
      }

      boolean UuUVuuUu(long var1) {
         return !this.UvnvNVnnnnNU
            && this.uUnuvNvvNU.C00OOC00oO(0.0F, UuNuuVUnv.C00OOC00oO)
            && this.vVvUvVVuuNvV.C00OOC00oO(0.0F, UuNuuVUnv.uUnuvNvvNU)
            && this.uNNnnnuuuN.C00OOC00oO(0.0F, UuNuuVUnv.vVvUvVVuuNvV)
            && this.nuUnNvnuUu.C00OOC00oO(0.0F, UuNuuVUnv.uNNnnnuuuN)
            && var1 - this.NnUuNNU > 180L;
      }
   }

   record VvunVVUvUNnv(class_1799 stack, class_1304 slot) {
   }

   record nUNvUnnVN(
      UuNuuVUnv.VUnuUnnuNvVu state,
      float x,
      float y,
      float width,
      float height,
      float scale,
      float topExtension,
      float alpha,
      float appear,
      float content,
      float detail,
      float itemReveal,
      float focus,
      float health,
      float damage,
      float threat,
      float exposure,
      boolean shader
   ) {

      public double distance() {
         return this.state.UnUNVVVNuv.distance();
      }

      public UuNuuVUnv.nUNvUnnVN withY(float var1) {
         return new UuNuuVUnv.nUNvUnnVN(
            this.state,
            this.x,
            var1,
            this.width,
            this.height,
            this.scale,
            this.topExtension,
            this.alpha,
            this.appear,
            this.content,
            this.detail,
            this.itemReveal,
            this.focus,
            this.health,
            this.damage,
            this.threat,
            this.exposure,
            this.shader
         );
      }
   }

   record nUVVnVNu(float width, float height) {
   }

   record nvUnvV(
      int accentTop,
      int accentBottom,
      int shellTop,
      int shellBottom,
      int rim,
      int textPrimary,
      int textSecondary,
      int avatarBackdrop,
      int slotFill,
      int barTrack,
      int divider,
      int danger,
      int dangerGlow,
      int safeGlow
   ) {
   }

   record nvnNNunvv(String label, int color, boolean harmful, int duration) {
   }

   record uunvUUVnuNn(String text, int color) {

      uunvUUVnuNn(String text, int color) {
         text = Objects.requireNonNullElse(text, "");
         this.text = text;
         this.color = color;
      }
   }
}

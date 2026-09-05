package ru.metaculture.protection;

import java.util.ArrayList;
import net.minecraft.class_310;
import org.wild.module.api.Module;
import ru.metaculture.profile.Profile;

public final class nUUNvUVNv {
   private static final float UuUVuuUu = 330.0F;
   private static final float C00OOC00oO = 18.0F;
   private static final float uUnuvNvvNU = 108.0F;
   private static final float vVvUvVVuuNvV = 126.0F;
   private static final float uNNnnnuuuN = 32.0F;
   private static final float nuUnNvnuUu = 32.0F;
   private static final float VVuuUN = 10.0F;
   private static final float vNUvnnVnUvu = 34.0F;
   private static final float uVUuuVnNVU = 7.0F;
   private static final float vuuuNvNuv = 56.0F;
   private static final float nvUVNnuu = 8.0F;
   private static final float UuuNnUvUuv = 12.0F;
   private static final float nUUVuvU = 24.0F;
   private static final float UnUNVVVNuv = 8.0F;
   private static final float vNVuvnUUnuUn = 4.0F;
   private static final float UvnvNVnnnnNU = 4.0F;
   private static final float uVUVnuvnuVuv = 9.0F;
   private static final int NVNnnvnuunNv = 4;
   private static final int uVunuUNVVUUV = 5;
   private static final String UNnVVNvvnVvU = "UID";
   private static final String uNnUnnuNUnNu = "SYSTEM";
   private static final String NnUuNNU = "SHADER PIPELINE";
   private static final String nNvNUVU = "Тема";
   private static final String UnUNuUU = "Модули";
   private static final String uUVuVvuNUvnu = "Wild Core";
   private static final String UvUvUNuvNU = "Build";
   private static final String c0oOOCcCoC0 = "Shader Stage";
   private static final String VVnVNnunVvu = "Shader Exception";
   private static final String unNNVVNnvvV = "CFI chain";
   private static final String NuunnvnN = "Frames";
   private static final String NVUunUNUN = "Anomalies";
   private static final String UUVNuUNUvUnV = "Texture Units";
   private static final String vuvnUnVnUNnV = "Matrices";
   private static final String nnuUVNUuvvVU = "Mixin policy";
   private static final String nVVUuvuNnUN = "Диагностика";
   private static final String nNnVnUNVV = "Закрыть";
   private static final String nuunNvv = UuUVuuUu("wild-1.21.8-1787661348375");
   private static final VwVVvwWW uUVVvVVNvvn = new VwVVvwWW();
   private static final Cc0cOoOcC0o vvUVNVvvNUv = Cc0cOoOcC0o.nUUVuvU();
   private static final Cc0cOoOcC0o UuNnnVnuNNV = Cc0cOoOcC0o.nUUVuvU();
   private static final Cc0cOoOcC0o uUVvnUuNvvN = Cc0cOoOcC0o.nUUVuvU();
   private static final Cc0cOoOcC0o UUuUnNVNuuv = Cc0cOoOcC0o.vNVuvnUUnuUn();
   private final UnUnVNnvnV NVuNUuVnVUN = new UnUnVNnvnV();
   private final nnUNUvNvVNn NVuunNnvvvVu = new nnUNUvNvVNn(0.0F);
   private final nnUNUvNvVNn vNnNuuvVn = new nnUNUvNvVNn(0.0F);
   private final nnUNUvNvVNn VUuuVUnun = new nnUNUvNvVNn(0.0F);
   private String vVVuuVVv = "0";
   private String VuunNUUUvu = "0";
   private String NNUUNUuVNNVn = "";
   private String VvVvnNUnvuvV = "CORRUPTED";
   private int ccOO0COcoco0 = Integer.MIN_VALUE;
   private int NUVvUUVuVNVv = Integer.MIN_VALUE;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4, float var5) {
      float var6 = !var2.NvUVUvVVnUu() && var2.vvNvvuUUUVvv() ? 1.0F : 0.0F;
      O0oC0cc0O0Oo var7 = O0oC0cc0O0Oo.resolve(var5, var3, var4.uNNnnnuuuN());
      float var8 = var7.alpha();
      if (!var7.visible()) {
         uUVVvVVNvvn.nuUnNvnuUu();
      } else {
         float var9 = uUnuvNvvNU(this.NVuunNnvvvVu.UuUVuuUu(var6, var6 > 0.0F ? vvUVNVvvNUv : UUuUnNVNuuv));
         float var10 = uUnuvNvvNU(this.vNnNuuvVn.UuUVuuUu(var6, var6 > 0.0F ? UuNnnVnuNNV : UUuUnNVNuuv));
         float var11 = uUnuvNvvNU(this.VUuuVUnun.UuUVuuUu(var6, var6 > 0.0F ? uUVvnUuNvvN : UUuUnNVNuuv));
         vVnvuVuVvnun.UuUVuuUu().UuUVuuUu(this.NVuNUuVnVUN);
         this.UuUVuuUu();
         nUvnuVnNUU var12 = var4.uNNnnnuuuN();
         NUunUunuNV var13 = var4.nuUnNvnuUu();
         float var14 = UuUVuuUu(var3, var12);
         float var15 = C00OOC00oO(var3, var12);
         float var16 = UuUVuuUu(var12);
         float var17 = uUnuvNvvNU(var3, var12);
         float var18 = UuUVuuUu(var12, var17);
         var1.uNNnnnuuuN(var8);
         var1.UuUVuuUu(var7.translateX(), var7.translateY());
         boolean var32 = false /* VF: Semaphore variable */;

         try {
            var32 = true;
            var1.UuUVuuUu(var7.scale(), var7.pivotX(), var7.pivotY());

            try {
               this.UuUVuuUu(var1, var12, var13, var14, var15, var16, var17, var12.UuUVuuUu(14.0F), var8);
               var1.uUnuvNvvNU();
               var1.UuUVuuUu(var14, var15, var16, var17, var12.UuUVuuUu(14.0F), var12.UuUVuuUu(14.0F), var12.UuUVuuUu(14.0F), var12.UuUVuuUu(14.0F));

               try {
                  float var19 = UuUVuuUu(var9, 0.0F, 0.72F);
                  var1.uNNnnnuuuN(var19);
                  var1.UuUVuuUu(var12.UuUVuuUu(-10.0F) * (1.0F - var19), 0.0F);

                  try {
                     this.UuUVuuUu(var1, var2, var12, var13, var14, var15, var16, var18, var8 * var19);
                  } finally {
                     var1.vNUvnnVnUvu();
                     var1.vuuuNvNuv();
                  }

                  float var20 = UuUVuuUu(var10, 0.22F, 0.92F);
                  var1.uNNnnnuuuN(var20);
                  var1.UuUVuuUu(var12.UuUVuuUu(12.0F) * (1.0F - var20), 0.0F);

                  try {
                     this.C00OOC00oO(var1, var2, var12, var13, var14, var15, var16, var17, var18);
                  } finally {
                     var1.vNUvnnVnUvu();
                     var1.vuuuNvNuv();
                  }

                  float var21 = UuUVuuUu(var11, 0.42F, 1.0F);
                  var1.uNNnnnuuuN(var21);
                  var1.UuUVuuUu(0.0F, var12.UuUVuuUu(10.0F) * (1.0F - var21));
                  boolean var51 = false /* VF: Semaphore variable */;

                  try {
                     var51 = true;
                     this.UuUVuuUu(var1, var2, var12, var13, var3);
                     var51 = false;
                  } finally {
                     if (var51) {
                        var1.vNUvnnVnUvu();
                        var1.vuuuNvNuv();
                     }
                  }

                  var1.vNUvnnVnUvu();
                  var1.vuuuNvNuv();
               } finally {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            } finally {
               var1.uVUuuVnNVU();
            }

            var32 = false;
         } finally {
            if (var32) {
               var1.vNUvnnVnUvu();
               var1.vuuuNvNuv();
            }
         }

         var1.vNUvnnVnUvu();
         var1.vuuuNvNuv();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      if (!var3.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(var4, var5, var6, var7, var8, var2.UuUVuuUu(30.0F) * var9, var2.UuUVuuUu(6.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(140.0F * var9)));
      }

      var1.UuUVuuUu(var4, var5, var6, var7, var8, var3.uNnUnnuNUnNu() ? 0.92F : 0.86F);
      int var10 = var3.uNnUnnuNUnNu()
         ? NUunUunuNV.UuUVuuUu(255, 255, 255, 234)
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(6, 8, 15, 246), NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 118), 0.12F);
      var1.UuUVuuUu(var4, var5, var6, var7, var8, var10);
      int var11 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 150) : NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 38);
      var1.UuUVuuUu(var4, var5, var6, var7, var8, var11, Math.max(1.0F, var2.UuUVuuUu(1.0F)));
      var1.UuUVuuUu(
         var4 + var2.UuUVuuUu(1.0F),
         var5 + var2.UuUVuuUu(1.0F),
         Math.max(1.0F, var6 - var2.UuUVuuUu(2.0F)),
         Math.max(1.0F, var7 - var2.UuUVuuUu(2.0F)),
         Math.max(0.0F, var8 - var2.UuUVuuUu(1.0F)),
         var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 70) : var3.nvUVNnuu(),
         0.5F
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var3.UuUVuuUu(18.0F);
      float var11 = vVvUvVVuuNvV(var5 + var10);
      float var12 = vVvUvVVuuNvV(var6 + var10);
      float var13 = vVvUvVVuuNvV(var7 - var10 * 2.0F);
      float var14 = vVvUvVVuuNvV(var8 - var3.UuUVuuUu(8.0F));
      float var15 = var3.UuUVuuUu(12.0F);
      this.UuUVuuUu(var1, var3, var4, var11, var12, var13, var14, var15);
      float var16 = vVvUvVVuuNvV(C00OOC00oO(var13 * 0.26F, var3.UuUVuuUu(64.0F), var3.UuUVuuUu(72.0F)));
      float var17 = vVvUvVVuuNvV(var11 + var3.UuUVuuUu(16.0F));
      float var18 = vVvUvVVuuNvV(var12 + (var14 - var16) * 0.5F);
      this.UuUVuuUu(var1, var3, var4, var17, var18, var16, var9);
      int var19 = this.NVuNUuVnVUN.uUVuVvuNUvnu == 0 ? var4.UuUVuuUu() : var4.C00OOC00oO();
      float var20 = this.UuUVuuUu(var1, var2, var3, var4, var11, var12, var13, var14, var19);
      float var21 = var18 + var16 * 0.5F;
      float var22 = vVvUvVVuuNvV(var17 + var16 + var3.UuUVuuUu(16.0F));
      float var23 = vVvUvVVuuNvV(var22 + var3.UuUVuuUu(9.0F));
      float var24 = Math.max(var3.UuUVuuUu(56.0F), var20 - var3.UuUVuuUu(12.0F) - var23);
      var1.C00OOC00oO(
         var22,
         vVvUvVVuuNvV(var21 - var3.UuUVuuUu(15.0F)),
         var3.UuUVuuUu(1.0F),
         var3.UuUVuuUu(10.0F),
         var3.UuUVuuUu(1.0F),
         NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), 255),
         NUunUunuNV.UuUVuuUu(var4.UNnVVNvvnVvU(), 255)
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var23,
         vVvUvVVuuNvV(var21 - var3.UuUVuuUu(20.0F)),
         var3.UuUVuuUu(20.0F),
         16.0F,
         Profile.getUsername(),
         nunvNNUnvU.UuUVuuUu(var4),
         var24
      );
      this.UuUVuuUu(
         var1,
         var2,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var23,
         vVvUvVVuuNvV(var21 + var3.UuUVuuUu(2.0F)),
         var3.UuUVuuUu(15.0F),
         8.0F,
         "UID " + this.vVVuuVVv,
         nunvNNUnvU.C00OOC00oO(var4),
         var24
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8) {
      if (var3.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(var4, var5 + var2.UuUVuuUu(2.0F), var6, var7, var8, var2.UuUVuuUu(12.0F), var2.UuUVuuUu(1.5F), NUunUunuNV.UuUVuuUu(46, 59, 70, 20));
         int var14 = NUunUunuNV.UuUVuuUu(255, 255, 255, 240);
         int var15 = NUunUunuNV.UuUVuuUu(var14, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 255), 0.14F);
         int var16 = NUunUunuNV.UuUVuuUu(var14, NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 255), 0.09F);
         int var17 = NUunUunuNV.UuUVuuUu(var14, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 255), 0.035F);
         var1.UuUVuuUu(var4, var5, var6, var7, var8, var15, var17, var16, var17);
         var1.C00OOC00oO(var4, var5, var6, var7 * 0.42F, var8, var8, 0.0F, 0.0F, NUunUunuNV.UuUVuuUu(255, 255, 255, 140), NUunUunuNV.UuUVuuUu(255, 255, 255, 0));
         var1.UuUVuuUu(var4, var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 44), Math.max(1.0F, var2.UuUVuuUu(0.9F)));
      } else {
         var1.UuUVuuUu(var4, var5 + var2.UuUVuuUu(3.0F), var6, var7, var8, var2.UuUVuuUu(22.0F), var2.UuUVuuUu(3.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, 128));
         int var9 = NUunUunuNV.UuUVuuUu(9, 12, 21, 240);
         int var10 = NUunUunuNV.UuUVuuUu(var9, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 255), 0.3F);
         int var11 = NUunUunuNV.UuUVuuUu(var9, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 255), 0.09F);
         int var12 = NUunUunuNV.UuUVuuUu(var9, NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 255), 0.24F);
         int var13 = NUunUunuNV.UuUVuuUu(var9, NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 255), 0.06F);
         var1.UuUVuuUu(var4, var5, var6, var7, var8, var10, var11, var12, var13);
         var1.C00OOC00oO(var4, var5, var6, var7 * 0.46F, var8, var8, 0.0F, 0.0F, NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 18), NUunUunuNV.UuUVuuUu(0, 0, 0, 0));
         var1.UuUVuuUu(var4, var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 42), Math.max(1.0F, var2.UuUVuuUu(0.9F)));
         var1.UuUVuuUu(
            var4 + var2.UuUVuuUu(1.0F),
            var5 + var2.UuUVuuUu(1.0F),
            Math.max(1.0F, var6 - var2.UuUVuuUu(2.0F)),
            Math.max(1.0F, var7 - var2.UuUVuuUu(2.0F)),
            Math.max(0.0F, var8 - var2.UuUVuuUu(1.0F)),
            var3.nvUVNnuu(),
            0.5F
         );
      }
   }

   private float UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, int var9) {
      String var10 = C00OOC00oO(this.NVuNUuVnVUN.C00OOC00oO);
      float var11 = Math.min(var7 * 0.3F, nunvNNUnvU.UuUVuuUu(var3, vNvnnVvvVUu.vVvUvVVuuNvV, var10, 8.0F));
      float var12 = var3.UuUVuuUu(22.0F);
      float var13 = vVvUvVVuuNvV(var11 + var3.UuUVuuUu(28.0F));
      float var14 = vVvUvVVuuNvV(var5 + var7 - var3.UuUVuuUu(14.0F) - var13);
      float var15 = vVvUvVVuuNvV(var6 + (var8 - var12) * 0.5F);
      boolean var16 = nunvNNUnvU.UuUVuuUu(var2, var14, var15, var13, var12);
      float var17 = var2.UuUVuuUu("profile:chip:hover", var16 ? 1.0F : 0.0F, Cc0cOoOcC0o.nvUVNnuu());
      int var18 = NUunUunuNV.UuUVuuUu(var9, Math.round((var4.uNnUnnuNUnNu() ? 24.0F : 34.0F) + 18.0F * var17));
      var1.UuUVuuUu(var14, var15, var13, var12, var12 * 0.5F, var18);
      var1.UuUVuuUu(var14, var15, var13, var12, var12 * 0.5F, NUunUunuNV.UuUVuuUu(var9, Math.round(96.0F + 60.0F * var17)), var3.UuUVuuUu(0.6F));
      var1.C00OOC00oO(var14 + var3.UuUVuuUu(10.0F), var15 + var12 * 0.5F, var3.UuUVuuUu(2.2F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var9, 232));
      int var19 = var4.uNnUnnuNUnNu() ? var9 : NUunUunuNV.UuUVuuUu(var9, var4.NVNnnvnuunNv(), 0.22F);
      this.UuUVuuUu(var1, var2, var3, vNvnnVvvVUu.vVvUvVVuuNvV, var14 + var3.UuUVuuUu(17.0F), var15, var12, 8.0F, var10, var19, var13 - var3.UuUVuuUu(24.0F));
      return var14;
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7) {
      float var8 = var6 * 0.5F;
      float var9 = var4 + var8;
      float var10 = var5 + var8;
      var1.UuUVuuUu(
         var4 - var2.UuUVuuUu(2.0F),
         var5 - var2.UuUVuuUu(2.0F),
         var6 + var2.UuUVuuUu(4.0F),
         var6 + var2.UuUVuuUu(4.0F),
         var8 + var2.UuUVuuUu(4.0F),
         var2.UuUVuuUu(20.0F),
         var2.UuUVuuUu(2.5F),
         NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), var3.uNnUnnuNUnNu() ? 44 : 92)
      );
      int var11 = cOO0CoOCCOC0.UuUVuuUu();
      if (var11 > 0) {
         var1.C00OOC00oO(var9, var10, var8, 0.0F, 1.0F, var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(244, 246, 250, 255) : NUunUunuNV.UuUVuuUu(9, 12, 20, 255));
         var1.uUnuvNvvNU();
         vuuuVVvVuNV.UuUVuuUu(var4, var5, var6, var11, var3.uVunuUNVVUUV(), var3.UNnVVNvvnVvU(), var7, var3.uNnUnnuNUnNu());
      } else {
         var1.C00OOC00oO(
            var9,
            var10,
            var8 + var2.UuUVuuUu(2.5F),
            0.0F,
            1.0F,
            var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 250) : NUunUunuNV.UuUVuuUu(6, 9, 16, 255)
         );
         var1.C00OOC00oO(var9, var10, var8 + var2.UuUVuuUu(1.0F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), var3.uNnUnnuNUnNu() ? 150 : 224));
         var1.C00OOC00oO(
            var9,
            var10,
            var8 - var2.UuUVuuUu(0.5F),
            0.0F,
            1.0F,
            var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(250, 251, 254, 255) : NUunUunuNV.UuUVuuUu(13, 18, 30, 255)
         );
         vnuvUNNuvnUU.UuUVuuUu(
            var1,
            var2,
            var9,
            var10 + var2.UuUVuuUu(0.6F),
            var2.UuUVuuUu(1.12F),
            nunvNNUnvU.vVvUvVVuuNvV(var3),
            NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), var3.uNnUnnuNUnNu() ? 28 : 62)
         );
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = UuUVuuUu(var5, var3);
      float var11 = UuUVuuUu(var6, var3, var9);
      float var12 = C00OOC00oO(var7, var3);
      float var13 = UuUVuuUu(var6, var8, var3, var9);
      float var14 = VVuuUN(var3);
      if (var14 <= var13 + var3.UuUVuuUu(1.0F)) {
         uUVVvVVNvvn.nuUnNvnuUu();
      }

      uUVVvVVNvvn.vVvUvVVuuNvV(7.5F);
      uUVVvVVNvvn.UuUVuuUu(true);
      uUVVvVVNvvn.UuUVuuUu(Math.max(var14, var13), var13);
      uUVVvVVNvvn.uUnuvNvvNU();
      float var15 = C00OOC00oO(uUVVvVVNvvn.vNUvnnVnUvu(), Math.min(0.0F, uUVVvVVNvvn.uVUuuVnNVU()), 0.0F);
      float var16 = var3.UuUVuuUu(10.0F);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var10, var11, var12, var13, var16, var16, var16, var16);

      try {
         float var17 = vVvUvVVuuNvV(var11 + var3.UuUVuuUu(4.0F) + var15);
         var17 = this.uUnuvNvvNU(var1, var2, var3, var4, var10, var11, var12, var13, var17);
         var17 = this.UuUVuuUu(var1, var3, var4, var10, var11, var12, var13, var17, "SYSTEM");
         var17 = this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var17, "Тема", var2.NnVnNVN().name(), var4.uVunuUNVVUUV(), 0);
         var17 = this.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var10,
            var11,
            var12,
            var13,
            var17,
            "Wild Core",
            this.NVuNUuVnVUN.uUVuVvuNUvnu == 0 ? C00OOC00oO(this.NVuNUuVnVUN.C00OOC00oO) : C00OOC00oO(this.NVuNUuVnVUN.uNNnnnuuuN),
            this.NVuNUuVnVUN.uUVuVvuNUvnu == 0 ? var4.uVunuUNVVUUV() : var4.C00OOC00oO(),
            1
         );
         var17 = this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var17, "Build", nuunNvv, var4.UNnVVNvvnVvU(), 2);
         var17 = this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var17, "Matrices", this.uNNnnnuuuN(), this.UuUVuuUu(var4), 3);
         var17 = vVvUvVVuuNvV(var17 + var3.UuUVuuUu(8.0F));
         var17 = this.UuUVuuUu(var1, var3, var4, var10, var11, var12, var13, var17, "SHADER PIPELINE");
         var17 = this.UuUVuuUu(
            var1, var2, var3, var4, var10, var11, var12, var13, var17, "Shader Stage", C00OOC00oO(this.NVuNUuVnVUN.vNVuvnUUnuUn), var4.uVunuUNVVUUV(), 4
         );
         var17 = this.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var10,
            var11,
            var12,
            var13,
            var17,
            "Shader Exception",
            C00OOC00oO(this.NVuNUuVnVUN.UvnvNVnnnnNU),
            "0".equals(this.NVuNUuVnVUN.NVNnnvnuunNv) ? var4.UNnVVNvvnVvU() : var4.C00OOC00oO(),
            5
         );
         var17 = this.UuUVuuUu(
            var1, var2, var3, var4, var10, var11, var12, var13, var17, "CFI chain", C00OOC00oO(this.NVuNUuVnVUN.uUnuvNvvNU), var4.uVunuUNVVUUV(), 6
         );
         var17 = this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var17, "Texture Units", this.nuUnNvnuUu(), var4.uVunuUNVVUUV(), 7);
         this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var17, "Mixin policy", C00OOC00oO(this.NVuNUuVnVUN.nUUVuvU), var4.UNnVVNvvnVvU(), 8);
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      this.C00OOC00oO(var1, var3, var4, var10, var11, var12, var13, var14, var15);
      this.UuUVuuUu(var1, var2, var3, var4, var10, var11, var12, var13, var14, var15);
   }

   public static void UuUVuuUu(float var0) {
      float var1 = Math.min(0.0F, uUVVvVVNvvn.uVUuuVnNVU());
      uUVVvVVNvvn.UuUVuuUu(var1 * Math.max(0.0F, Math.min(1.0F, var0)));
   }

   private float uUnuvNvvNU(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var3.UuUVuuUu(56.0F);
      if (var9 + var10 >= var6 - var3.UuUVuuUu(3.0F) && var9 <= var6 + var8 + var3.UuUVuuUu(3.0F)) {
         float var11 = vVvUvVVuuNvV(var5 + var3.UuUVuuUu(4.0F));
         float var12 = Math.max(var3.UuUVuuUu(120.0F), var7 - var3.UuUVuuUu(13.0F));
         float var13 = var3.UuUVuuUu(8.0F);
         float var14 = vVvUvVVuuNvV((var12 - var13 * 2.0F) / 3.0F);
         float var15 = vVvUvVVuuNvV(var11 + (var14 + var13) * 2.0F);
         int var16 = this.NVuNUuVnVUN.uUVuVvuNUvnu == 0 ? var4.UuUVuuUu() : var4.C00OOC00oO();
         this.UuUVuuUu(var1, var2, var3, var4, var11, var9, var14, var10, this.VuunNUUUvu, "Модули", var4.uVunuUNVVUUV(), 0);
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            vVvUvVVuuNvV(var11 + var14 + var13),
            var9,
            var14,
            var10,
            C00OOC00oO(this.NVuNUuVnVUN.NnUuNNU),
            "Frames",
            var4.UNnVVNvvnVvU(),
            1
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            var4,
            var15,
            var9,
            Math.max(var3.UuUVuuUu(40.0F), var11 + var12 - var15),
            var10,
            C00OOC00oO(this.NVuNUuVnVUN.uNnUnnuNUnNu),
            "Anomalies",
            var16,
            2
         );
      }

      return vVvUvVVuuNvV(var9 + var10 + var3.UuUVuuUu(12.0F));
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      float var5,
      float var6,
      float var7,
      float var8,
      String var9,
      String var10,
      int var11,
      int var12
   ) {
      float var13 = vVvUvVVuuNvV(var5);
      float var14 = vVvUvVVuuNvV(var6);
      float var15 = UuUVuuUu(var13, var7);
      float var16 = UuUVuuUu(var14, var8);
      boolean var17 = nunvNNUnvU.UuUVuuUu(var2, var13, var14, var15, var16);
      float var18 = var2.UuUVuuUu("profile:tile:hover:" + var12, var17 ? 1.0F : 0.0F, Cc0cOoOcC0o.nvUVNnuu());
      float var19 = C00OOC00oO(var18);
      var1.UuUVuuUu(0.0F, -var3.UuUVuuUu(0.9F) * var19);
      var1.UuUVuuUu(1.0F + var19 * 0.009F, var13 + var15 * 0.5F, var14 + var16 * 0.5F);

      try {
         float var20 = var3.UuUVuuUu(10.0F);
         int var21 = var4.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4, 0.16F), NUunUunuNV.UuUVuuUu(var11, 30), 0.1F + var19 * 0.26F)
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(8, 12, 23, 186), NUunUunuNV.UuUVuuUu(var11, 58), 0.16F + var19 * 0.16F);
         if (var19 > 0.01F) {
            var1.UuUVuuUu(
               var13, var14, var15, var16, var20, var3.UuUVuuUu(8.0F) * var19, var3.UuUVuuUu(1.4F), NUunUunuNV.UuUVuuUu(var11, Math.round(30.0F * var19))
            );
         }

         var1.UuUVuuUu(var13, var14, var15, var16, var20, var21);
         var1.UuUVuuUu(
            var13,
            var14,
            var15,
            var16,
            var20,
            NUunUunuNV.UuUVuuUu(var4.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 70) : var4.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var11, 150), var19),
            var3.UuUVuuUu(0.55F + var19 * 0.3F)
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            vVvUvVVuuNvV(var13 + var3.UuUVuuUu(12.0F)),
            vVvUvVVuuNvV(var14 + var3.UuUVuuUu(7.0F)),
            var3.UuUVuuUu(24.0F),
            15.0F,
            C00OOC00oO(var9),
            nunvNNUnvU.UuUVuuUu(var4),
            var15 - var3.UuUVuuUu(22.0F)
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            vNvnnVvvVUu.UuUVuuUu,
            vVvUvVVuuNvV(var13 + var3.UuUVuuUu(12.0F)),
            vVvUvVVuuNvV(var14 + var16 - var3.UuUVuuUu(24.0F)),
            var3.UuUVuuUu(16.0F),
            7.0F,
            var10,
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), nunvNNUnvU.UuUVuuUu(var4), var19 * 0.24F),
            var15 - var3.UuUVuuUu(22.0F)
         );
      } finally {
         var1.uVUuuVnNVU();
         var1.vNUvnnVnUvu();
      }
   }

   private float UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, String var9) {
      float var10 = var2.UuUVuuUu(24.0F);
      if (var8 + var10 >= var5 - var2.UuUVuuUu(3.0F) && var8 <= var5 + var7 + var2.UuUVuuUu(3.0F)) {
         float var11 = vVvUvVVuuNvV(var4 + var2.UuUVuuUu(6.0F));
         float var12 = vVvUvVVuuNvV(var4 + var6 - var2.UuUVuuUu(9.0F));
         float var13 = var2.UuUVuuUu(16.0F);
         float var14 = vVvUvVVuuNvV(var8 + var10 - var13 - var2.UuUVuuUu(2.0F));
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var11, var14, var13, 7.5F, var9, nunvNNUnvU.C00OOC00oO(var3));
         float var15 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var9, 7.5F);
         float var16 = vVvUvVVuuNvV(var11 + var15 + var2.UuUVuuUu(10.0F));
         float var17 = var12 - var16;
         if (var17 > var2.UuUVuuUu(8.0F)) {
            var1.UuUVuuUu(
               var16,
               vVvUvVVuuNvV(var14 + var13 * 0.5F),
               var17,
               Math.max(1.0F, var2.UuUVuuUu(1.0F)),
               var2.UuUVuuUu(0.5F),
               var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(0, 0, 0, 26) : var3.UuuNnUvUuv()
            );
         }
      }

      return vVvUvVVuuNvV(var8 + var10);
   }

   private float UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      String var10,
      String var11,
      int var12,
      int var13
   ) {
      float var14 = var3.UuUVuuUu(34.0F);
      if (var9 + var14 >= var6 - var3.UuUVuuUu(3.0F) && var9 <= var6 + var8 + var3.UuUVuuUu(3.0F)) {
         float var15 = var5 + var3.UuUVuuUu(4.0F);
         float var16 = Math.max(var3.UuUVuuUu(80.0F), var7 - var3.UuUVuuUu(13.0F));
         this.C00OOC00oO(var1, var2, var3, var4, var15, var9, var16, var14, var10, var11, var12, var13);
      }

      return vVvUvVVuuNvV(var9 + var14 + var3.UuUVuuUu(7.0F));
   }

   private void C00OOC00oO(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      float var5,
      float var6,
      float var7,
      float var8,
      String var9,
      String var10,
      int var11,
      int var12
   ) {
      float var13 = vVvUvVVuuNvV(var5);
      float var14 = vVvUvVVuuNvV(var6);
      float var15 = UuUVuuUu(var13, var7);
      float var16 = UuUVuuUu(var14, var8);
      boolean var17 = nunvNNUnvU.UuUVuuUu(var2, var13, var14, var15, var16);
      float var18 = var2.UuUVuuUu("profile:row:hover:" + var12, var17 ? 1.0F : 0.0F, Cc0cOoOcC0o.nvUVNnuu());
      float var19 = C00OOC00oO(var18);
      var1.UuUVuuUu(0.0F, -var3.UuUVuuUu(0.9F) * var19);
      var1.UuUVuuUu(1.0F + var19 * 0.009F, var13 + var15 * 0.5F, var14 + var16 * 0.5F);

      try {
         int var20 = var4.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4, 0.14F), NUunUunuNV.UuUVuuUu(var11, 30), 0.08F + var19 * 0.28F)
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(8, 12, 23, 164), NUunUunuNV.UuUVuuUu(var11, 52), 0.14F + var19 * 0.16F);
         if (var19 > 0.01F) {
            var1.UuUVuuUu(
               var13,
               var14,
               var15,
               var16,
               var3.UuUVuuUu(9.0F),
               var3.UuUVuuUu(7.0F) * var19,
               var3.UuUVuuUu(1.2F),
               NUunUunuNV.UuUVuuUu(var11, Math.round(28.0F * var19))
            );
         }

         var1.UuUVuuUu(var13, var14, var15, var16, var3.UuUVuuUu(9.0F), var20);
         var1.UuUVuuUu(
            var13,
            var14,
            var15,
            var16,
            var3.UuUVuuUu(9.0F),
            NUunUunuNV.UuUVuuUu(var4.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 70) : var4.nvUVNnuu(), NUunUunuNV.UuUVuuUu(var11, 154), var19),
            var3.UuUVuuUu(0.55F + var19 * 0.3F)
         );
         if (var19 > 0.01F) {
            var1.UuUVuuUu(
               var13 + var3.UuUVuuUu(1.2F),
               var14 + var16 * 0.27F,
               var3.UuUVuuUu(1.8F),
               var16 * 0.46F,
               var3.UuUVuuUu(0.9F),
               NUunUunuNV.UuUVuuUu(var11, Math.round(196.0F * var19))
            );
         }

         this.UuUVuuUu(var1, var3, var13 + var3.UuUVuuUu(17.0F), var14 + var16 * 0.5F, var12, var11, var4);
         float var21 = vVvUvVVuuNvV(var13 + var3.UuUVuuUu(34.0F));
         float var22 = vVvUvVVuuNvV(var13 + var15 * 0.52F);
         int var23 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), nunvNNUnvU.UuUVuuUu(var4), var19 * 0.28F);
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            vNvnnVvvVUu.UuUVuuUu,
            var21,
            var14,
            var16,
            8.0F,
            var9,
            var23,
            Math.max(var3.UuUVuuUu(34.0F), var22 - var21 - var3.UuUVuuUu(10.0F))
         );
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var22,
            var14,
            var16,
            8.5F,
            C00OOC00oO(var10),
            nunvNNUnvU.UuUVuuUu(var4),
            Math.max(var3.UuUVuuUu(42.0F), var13 + var15 - var22 - var3.UuUVuuUu(12.0F))
         );
      } finally {
         var1.uVUuuVnNVU();
         var1.vNUvnnVnUvu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, uVUvuUUNVUv var5) {
      float var6 = this.uNNnnnuuuN(var5, var3);
      float var7 = this.vVvUvVVuuNvV(var5, var3);
      float var8 = this.uUnuvNvvNU(var3);
      this.UuUVuuUu(var1, var2, var3, var4, var7, var6, var8, "Диагностика", var4.uVunuUNVVUUV(), 0);
      this.UuUVuuUu(
         var1, var2, var3, var4, this.nuUnNvnuUu(var5, var3), this.VVuuUN(var5, var3), this.uNNnnnuuuN(var3), "Закрыть", nunvNNUnvU.UuUVuuUu(var4), 2
      );
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, String var8, int var9, int var10
   ) {
      float var11 = vVvUvVVuuNvV(var5);
      float var12 = vVvUvVVuuNvV(var6);
      float var13 = UuUVuuUu(var11, var7);
      float var14 = var3.UuUVuuUu(var10 == 2 ? 32.0F : 32.0F);
      boolean var15 = nunvNNUnvU.UuUVuuUu(var2, var11, var12, var13, var14);
      float var16 = var2.UuUVuuUu("profile:action:hover:" + var10, var15 ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var17 = C00OOC00oO(var16);
      var1.UuUVuuUu(0.0F, -var3.UuUVuuUu(1.0F) * var17);
      var1.UuUVuuUu(1.0F + var17 * 0.014F, var11 + var13 * 0.5F, var12 + var14 * 0.5F);

      try {
         int var18 = var4.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4, 0.25F), NUunUunuNV.UuUVuuUu(var9, 42), var17 * 0.34F)
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(8, 12, 23, 188), NUunUunuNV.UuUVuuUu(var9, 68), 0.18F + var17 * 0.22F);
         if (var17 > 0.01F) {
            var1.UuUVuuUu(
               var11,
               var12,
               var13,
               var14,
               var3.UuUVuuUu(9.0F),
               var3.UuUVuuUu(8.0F) * var17,
               var3.UuUVuuUu(1.5F),
               NUunUunuNV.UuUVuuUu(var9, Math.round(34.0F * var17))
            );
         }

         var1.UuUVuuUu(var11, var12, var13, var14, var3.UuUVuuUu(9.0F), var18);
         var1.UuUVuuUu(
            var11,
            var12,
            var13,
            var14,
            var3.UuUVuuUu(9.0F),
            NUunUunuNV.UuUVuuUu(var9, Math.round((var4.uNnUnnuNUnNu() ? 58.0F : 84.0F) + 92.0F * var17)),
            var3.UuUVuuUu(0.6F + 0.25F * var17)
         );
         this.C00OOC00oO(var1, var3, var11 + var3.UuUVuuUu(17.0F), var12 + var14 * 0.5F, var10, var9, var4);
         this.UuUVuuUu(
            var1,
            var2,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var11 + var3.UuUVuuUu(34.0F + var17 * 1.5F),
            var12,
            var14,
            8.5F,
            var8,
            nunvNNUnvU.UuUVuuUu(var4),
            var13 - var3.UuUVuuUu(44.0F)
         );
      } finally {
         var1.uVUuuVnNVU();
         var1.vNUvnnVnUvu();
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var2.UuUVuuUu(12.0F);
      int var11 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 142) : NUunUunuNV.UuUVuuUu(5, 7, 13, 166);
      int var12 = var3.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 0) : NUunUunuNV.UuUVuuUu(5, 7, 13, 0);
      if (var9 < -var2.UuUVuuUu(0.5F)) {
         var1.C00OOC00oO(var4, var5, var6, var10, var11, var12);
      }

      if (var8 + var9 > var7 + var2.UuUVuuUu(0.5F)) {
         var1.C00OOC00oO(var4, var5 + var7 - var10, var6, var10, var12, var11);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, float var5, float var6, float var7, float var8, float var9, float var10
   ) {
      float var11 = Math.max(0.0F, var9 - var8);
      if (!(var11 <= var3.UuUVuuUu(1.0F))) {
         float var12 = Math.max(var3.UuUVuuUu(4.0F), var3.UuUVuuUu(5.0F));
         float var13 = vVvUvVVuuNvV(var5 + var7 - var12);
         float var14 = Math.max(var3.UuUVuuUu(24.0F), var8 * var8 / Math.max(var8, var9));
         float var15 = vVvUvVVuuNvV(var6 + (var8 - var14) * (Math.abs(var10) / Math.max(1.0F, var11)));
         nunvNNUnvU.UuUVuuUu(
            var1, var3, var4, var13, var6, var12, var8, var15, var14, 0.0F, 0.48F, 3L, var2.unnUnUNVnN(), var2.NnuUnUNnu(), nUUNvUVNv::UuUVuuUu
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, nUVnuvUu var4, float var5, float var6, float var7, float var8, String var9, int var10, float var11
   ) {
      String var12 = C00OOC00oO(var9);
      float var13 = vVvUvVVuuNvV(var5);
      float var14 = vVvUvVVuuNvV(var6);
      float var15 = Math.max(var3.UuUVuuUu(8.0F), vVvUvVVuuNvV(var11));
      float var16 = vVvUvVVuuNvV(var7);
      float var17 = nunvNNUnvU.UuUVuuUu(var3, var4, var12, var8);
      float var18 = Math.max(0.0F, var17 - var15 + var3.UuUVuuUu(8.0F));
      float var19 = 0.0F;
      if (var18 > var3.UuUVuuUu(1.0F) && nunvNNUnvU.UuUVuuUu(var2.unnUnUNVnN(), var2.NnuUnUNnu(), var13, var14, var15, var16)) {
         float var20 = (float)(System.currentTimeMillis() % 2600L) / 2600.0F;
         float var21 = var20 < 0.5F ? var20 * 2.0F : 2.0F - var20 * 2.0F;
         var19 = vVvUvVVuuNvV(var18 * var21);
      }

      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var13, var14, var15, var16, 0.0F, 0.0F, 0.0F, 0.0F);
      boolean var24 = false /* VF: Semaphore variable */;

      try {
         var24 = true;
         UUNUvvnnnVVn.UuUVuuUu();
         nunvNNUnvU.UuUVuuUu(var1, var3, var4, var13 - var19, var14, var16, var8, var12, var10);
         var24 = false;
      } finally {
         if (var24) {
            UUNUvvnnnVVn.C00OOC00oO();
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }

      UUNUvvnnnVVn.C00OOC00oO();
      var1.uUnuvNvvNU();
      var1.nuUnNvnuUu();
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, int var5, int var6, NUunUunuNV var7) {
      float var8 = var2.UuUVuuUu(1.0F);
      int var9 = NUunUunuNV.UuUVuuUu(var6, 216);
      var1.UuUVuuUu(
         var3 - 5.8F * var8, var4 - 5.8F * var8, 11.6F * var8, 11.6F * var8, 3.5F * var8, NUunUunuNV.UuUVuuUu(var9, 132), Math.max(0.65F, var2.UuUVuuUu(0.65F))
      );
      if (var5 % 3 == 0) {
         var1.UuUVuuUu(var3 - 3.8F * var8, var4 + 2.0F * var8, 7.6F * var8, 1.5F * var8, 0.75F * var8, var9);
         var1.UuUVuuUu(var3 - 1.0F * var8, var4 - 4.2F * var8, 2.0F * var8, 8.0F * var8, 1.0F * var8, NUunUunuNV.UuUVuuUu(var9, 196));
      } else if (var5 % 3 == 1) {
         var1.UuUVuuUu(var3 - 4.0F * var8, var4 - 2.7F * var8, 8.0F * var8, 1.5F * var8, 0.75F * var8, var9);
         var1.UuUVuuUu(var3 - 4.0F * var8, var4 + 1.4F * var8, 8.0F * var8, 1.5F * var8, 0.75F * var8, NUunUunuNV.UuUVuuUu(var9, 186));
      } else {
         var1.C00OOC00oO(var3 - 3.2F * var8, var4, 1.7F * var8, 0.0F, 1.0F, var9);
         var1.C00OOC00oO(var3 + 3.2F * var8, var4, 1.7F * var8, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var9, 188));
         var1.UuUVuuUu(var3 - 1.6F * var8, var4 - 0.7F * var8, 3.2F * var8, 1.4F * var8, 0.7F * var8, NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var7), 156));
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, float var3, float var4, int var5, int var6, NUunUunuNV var7) {
      float var8 = var2.UuUVuuUu(1.0F);
      int var9 = NUunUunuNV.UuUVuuUu(var5 == 2 ? nunvNNUnvU.UuUVuuUu(var7) : var6, 234);
      if (var5 == 0) {
         var1.UuUVuuUu(
            var3 - 6.0F * var8,
            var4 - 5.5F * var8,
            12.0F * var8,
            11.0F * var8,
            3.0F * var8,
            NUunUunuNV.UuUVuuUu(var9, 118),
            Math.max(0.6F, var2.UuUVuuUu(0.6F))
         );
         var1.UuUVuuUu(var3 - 3.6F * var8, var4 + 1.6F * var8, 1.4F * var8, 3.0F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 - 0.7F * var8, var4 - 1.6F * var8, 1.4F * var8, 6.2F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 + 2.2F * var8, var4 - 4.0F * var8, 1.4F * var8, 8.6F * var8, 0.7F * var8, var9);
      } else if (var5 == 1) {
         var1.UuUVuuUu(var3 - 5.2F * var8, var4 - 4.0F * var8, 10.4F * var8, 1.4F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 - 5.2F * var8, var4 - 0.5F * var8, 10.4F * var8, 1.4F * var8, 0.7F * var8, var9);
         var1.UuUVuuUu(var3 - 5.2F * var8, var4 + 3.0F * var8, 7.4F * var8, 1.4F * var8, 0.7F * var8, NUunUunuNV.UuUVuuUu(var9, 188));
      } else {
         var1.UuUVuuUu(var3, var4);
         var1.C00OOC00oO(45.0F);

         try {
            var1.UuUVuuUu(-4.9F * var8, -0.8F * var8, 9.8F * var8, 1.6F * var8, 0.8F * var8, var9);
            var1.UuUVuuUu(-0.8F * var8, -4.9F * var8, 1.6F * var8, 9.8F * var8, 0.8F * var8, var9);
         } finally {
            var1.VVuuUN();
            var1.vNUvnnVnUvu();
         }
      }
   }

   public static boolean UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3, double var4) {
      if (!UuUVuuUu(var0, var1, var2, var3)) {
         return false;
      } else {
         uUVVvVVNvvn.UuUVuuUu(var4);
         return true;
      }
   }

   public static boolean UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1, float var2, float var3) {
      float var4 = UuUVuuUu(var0, var1);
      float var5 = C00OOC00oO(var0, var1);
      float var6 = uUnuvNvvNU(var0, var1);
      float var7 = UuUVuuUu(var1, var6);
      return nunvNNUnvU.UuUVuuUu(
         var2, var3, UuUVuuUu(var4, var1), UuUVuuUu(var5, var1, var7), C00OOC00oO(UuUVuuUu(var1), var1), UuUVuuUu(var5, var6, var1, var7)
      );
   }

   public static float UuUVuuUu(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var0.vNVuvnUUnuUn() + var1.UuUVuuUu(18.0F));
   }

   public static float C00OOC00oO(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var0.UvnvNVnnnnNU() + var1.UuUVuuUu(18.0F));
   }

   static float UuUVuuUu(nUvnuVnNUU var0) {
      return vVvUvVVuuNvV(C00OOC00oO(var0.UuUVuuUu(330.0F), var0.UuUVuuUu(292.0F), Math.max(var0.UuUVuuUu(306.0F), var0.uVUuuVnNVU() * 0.48F)));
   }

   public static float uUnuvNvvNU(uVUvuUUNVUv var0, nUvnuVnNUU var1) {
      float var2 = C00OOC00oO(var0, var1);
      return Math.max(var1.UuUVuuUu(352.0F), vVvUvVVuuNvV(var0.UvnvNVnnnnNU() + var0.NVNnnvnuunNv()) - var2);
   }

   public float C00OOC00oO(nUvnuVnNUU var1) {
      return UuUVuuUu(var1);
   }

   public float vVvUvVVuuNvV(uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      return vVvUvVVuuNvV(UuUVuuUu(var1, var2) + var2.UuUVuuUu(18.0F));
   }

   public float uNNnnnuuuN(uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      return vVvUvVVuuNvV(this.VVuuUN(var1, var2) - var2.UuUVuuUu(10.0F) - this.vVvUvVVuuNvV(var2));
   }

   public float uUnuvNvvNU(nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(UuUVuuUu(var1) - var1.UuUVuuUu(36.0F));
   }

   public float vVvUvVVuuNvV(nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var1.UuUVuuUu(32.0F));
   }

   public float nuUnNvnuUu(uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      return vVvUvVVuuNvV(UuUVuuUu(var1, var2) + var2.UuUVuuUu(18.0F));
   }

   public float VVuuUN(uVUvuUUNVUv var1, nUvnuVnNUU var2) {
      return vVvUvVVuuNvV(C00OOC00oO(var1, var2) + uUnuvNvvNU(var1, var2) - var2.UuUVuuUu(18.0F) - this.nuUnNvnuUu(var2));
   }

   public float uNNnnnuuuN(nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(UuUVuuUu(var1) - var1.UuUVuuUu(36.0F));
   }

   public float nuUnNvnuUu(nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var1.UuUVuuUu(32.0F));
   }

   private static float UuUVuuUu(nUvnuVnNUU var0, float var1) {
      float var2 = var0.UuUVuuUu(74.0F);
      float var3 = var1 - var0.UuUVuuUu(36.0F) - var2 - var0.UuUVuuUu(150.0F);
      return vVvUvVVuuNvV(C00OOC00oO(var1 * 0.27F, var0.UuUVuuUu(108.0F), Math.max(var0.UuUVuuUu(108.0F), Math.min(var0.UuUVuuUu(126.0F), var3))));
   }

   private static float UuUVuuUu(float var0, nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var0 + var1.UuUVuuUu(18.0F));
   }

   private static float UuUVuuUu(float var0, nUvnuVnNUU var1, float var2) {
      return vVvUvVVuuNvV(var0 + var1.UuUVuuUu(18.0F) + var2 + var1.UuUVuuUu(8.0F));
   }

   private static float C00OOC00oO(float var0, nUvnuVnNUU var1) {
      return vVvUvVVuuNvV(var0 - var1.UuUVuuUu(36.0F));
   }

   private static float UuUVuuUu(float var0, float var1, nUvnuVnNUU var2, float var3) {
      float var4 = UuUVuuUu(var0, var2, var3);
      float var5 = vVvUvVVuuNvV(var0 + var1 - var2.UuUVuuUu(18.0F) - var2.UuUVuuUu(74.0F) - var2.UuUVuuUu(12.0F));
      return Math.max(var2.UuUVuuUu(80.0F), var5 - var4);
   }

   private static float VVuuUN(nUvnuVnNUU var0) {
      byte var1 = 9;
      float var2 = var0.UuUVuuUu(var1 * 34.0F + (var1 - 1) * 7.0F);
      return vVvUvVVuuNvV(var0.UuUVuuUu(132.0F) + var2);
   }

   private void UuUVuuUu() {
      int var1 = C00OOC00oO();
      if (var1 != this.ccOO0COcoco0) {
         this.ccOO0COcoco0 = var1;
         this.vVVuuVVv = Integer.toString(var1);
      }

      int var2 = this.uUnuvNvvNU();
      if (var2 != this.NUVvUUVuVNVv) {
         this.NUVvUUVuVNVv = var2;
         this.VuunNUUUvu = Integer.toString(var2);
      }

      String var3 = C00OOC00oO(this.NVuNUuVnVUN.VVuuUN);
      if (!var3.equals(this.NNUUNUuVNNVn)) {
         this.NNUUNUuVNNVn = var3;
         this.VvVvnNUnvuvV = UuUVuuUu(var3, "finite") ? "OK" : "CORRUPTED";
      }
   }

   private static int C00OOC00oO() {
      try {
         return Profile.getUid();
      } catch (Throwable var1) {
         return 0;
      }
   }

   private int uUnuvNvvNU() {
      try {
         if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
            ArrayList var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO();
            int var2 = 0;

            for (int var3 = 0; var3 < var1.size(); var3++) {
               if (((Module)var1.get(var3)).nuUnNvnuUu) {
                  var2++;
               }
            }

            return var2;
         } else {
            return 0;
         }
      } catch (Throwable var4) {
         return 0;
      }
   }

   private String vVvUvVVuuNvV() {
      try {
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.method_1548() != null) {
            return var1.method_1548().method_1676();
         }
      } catch (Throwable var2) {
      }

      return "Player";
   }

   private String uNNnnnuuuN() {
      return this.VvVvnNUnvuvV;
   }

   private String nuUnNvnuUu() {
      return this.NVuNUuVnVUN.uUVuVvuNUvnu == 0 ? "Изолированы [TextureUnitGuard]" : C00OOC00oO(this.NVuNUuVnVUN.nuUnNvnuUu);
   }

   private int UuUVuuUu(NUunUunuNV var1) {
      return "OK".equals(this.VvVvnNUnvuvV) ? var1.uVunuUNVVUUV() : var1.C00OOC00oO();
   }

   private static boolean UuUVuuUu(String var0, String var1) {
      int var2 = var0.length() - var1.length();

      for (int var3 = 0; var3 <= var2; var3++) {
         if (var0.regionMatches(true, var3, var1, 0, var1.length())) {
            return true;
         }
      }

      return false;
   }

   private static String UuUVuuUu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         return var0.length() <= 26 ? var0 : var0.substring(0, 23) + "...";
      } else {
         return "unknown";
      }
   }

   private static String C00OOC00oO(String var0) {
      return var0 != null && !var0.isBlank() ? var0 : "none";
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return uUnuvNvvNU((var0 - var1) / Math.max(0.001F, var2 - var1));
   }

   private static float C00OOC00oO(float var0) {
      float var1 = uUnuvNvvNU(var0);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private static float uUnuvNvvNU(float var0) {
      return var0 < 0.0F ? 0.0F : Math.min(var0, 1.0F);
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float vVvUvVVuuNvV(float var0) {
      return Math.round(var0);
   }

   private static float UuUVuuUu(float var0, float var1) {
      return Math.max(0.0F, vVvUvVVuuNvV(var0 + var1) - vVvUvVVuuNvV(var0));
   }
}

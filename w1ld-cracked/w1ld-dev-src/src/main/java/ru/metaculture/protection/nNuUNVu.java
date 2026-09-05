package ru.metaculture.protection;

import java.lang.runtime.SwitchBootstraps;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import lombok.Generated;
import net.minecraft.class_310;
import net.minecraft.class_408;
import org.lwjgl.glfw.GLFW;

public final class nNuUNVu {
   private static final float C00OOC00oO = 0.65F;
   private static final float uUnuvNvvNU = 1.0F;
   static final uNNnVuNunvU vVvUvVVuuNvV = uNNnVuNunvU.UuUVuuUu(4.0F, 0.85F);
   static final uNNnVuNunvU uNNnnnuuuN = uNNnVuNunvU.UuUVuuUu(2.5F, 0.9F);
   static final uNNnVuNunvU nuUnNvnuUu = uNNnVuNunvU.UuUVuuUu(6.0F, 0.8F);
   static final uNNnVuNunvU VVuuUN = uNNnVuNunvU.UuUVuuUu(5.0F, 0.85F);
   private static final uNNnVuNunvU vNUvnnVnUvu = uNNnVuNunvU.UuUVuuUu(2.2F, 1.0F);
   private static final float uVUuuVnNVU = 12.0F;
   private static final float vuuuNvNuv = 5.0F;
   private static final float nvUVNnuu = 6.0F;
   private static final int UuuNnUvUuv = 32;
   private static final nNuUNVu.NVnVnNnN nUUVuvU = new nNuUNVu.NVnVnNnN(0.82F, 1.18F, 0.72F, 0.22F, 6.0F);
   private static final nNuUNVu.NVnVnNnN UnUNVVVNuv = new nNuUNVu.NVnVnNnN(0.78F, 1.16F, 0.46F, 0.1F, 6.0F);
   private static final nNuUNVu.NVnVnNnN vNVuvnUUnuUn = new nNuUNVu.NVnVnNnN(0.72F, 1.48F, 0.42F, 0.34F, 6.0F);
   private static final nNuUNVu.NVnVnNnN UvnvNVnnnnNU = new nNuUNVu.NVnVnNnN(0.78F, 1.34F, 0.36F, 0.26F, 6.0F);
   private static final nNuUNVu.NVnVnNnN uVUVnuvnuVuv = new nNuUNVu.NVnVnNnN(0.72F, 1.36F, 0.38F, 0.42F, 6.0F);
   private static final nNuUNVu.NVnVnNnN NVNnnvnuunNv = new nNuUNVu.NVnVnNnN(0.72F, 1.32F, 0.32F, 0.56F, 6.0F);
   private static final nNuUNVu.NVnVnNnN uVunuUNVVUUV = new nNuUNVu.NVnVnNnN(0.72F, 1.18F, 0.34F, 0.52F, 6.0F);
   private static final nNuUNVu.NVnVnNnN UNnVVNvvnVvU = new nNuUNVu.NVnVnNnN(0.7F, 1.42F, 0.45F, 0.72F, 6.0F);
   private static final nNuUNVu.NVnVnNnN uNnUnnuNUnNu = new nNuUNVu.NVnVnNnN(0.78F, 1.12F, 0.38F, 0.34F, 6.0F);
   private static final nNuUNVu.NVnVnNnN NnUuNNU = new nNuUNVu.NVnVnNnN(0.72F, 1.32F, 0.38F, 0.56F, 6.0F);
   private static final nNuUNVu.NVnVnNnN nNvNUVU = new nNuUNVu.NVnVnNnN(0.76F, 1.32F, 0.24F, 0.3F, 6.0F);
   private static final nNuUNVu.NVnVnNnN UnUNuUU = new nNuUNVu.NVnVnNnN(0.72F, 1.35F, 0.4F, 0.58F, 6.0F);
   private static final nNuUNVu.NVnVnNnN uUVuVvuNUvnu = new nNuUNVu.NVnVnNnN(0.72F, 1.42F, 0.42F, 0.55F, 6.0F);
   private static final nNuUNVu UvUvUNuvNU = new nNuUNVu();
   private final Map<String, nNuUNVu.VvunVVUvUNnv> c0oOOCcCoC0 = new HashMap<>();
   private final Map<String, nNuUNVu.VUnuUnnuNvVu> VVnVNnunVvu = new ConcurrentHashMap<>();
   private final Map<String, Float> unNNVVNnvvV = new ConcurrentHashMap<>();
   private final nNuUNVu.nvUnvV[] NuunnvnN = new nNuUNVu.nvUnvV[32];
   private final nNuUNVu.nvUnvV[] NVUunUNUN = new nNuUNVu.nvUnvV[32];
   private final double[] UUVNuUNUvUnV = new double[1];
   private final double[] vuvnUnVnUNnV = new double[1];
   private final nNuUNVu.VUUnVnVNNU nnuUVNUuvvVU = new nNuUNVu.VUUnVnVNNU();
   private UnVNvNnU nVVUuvuNnUN;
   private class_310 nNnVnUNVV;
   private boolean nuunNvv;
   private float uUVVvVVNvvn;
   private float vvUVNVvvNUv;
   private boolean UuNnnVnuNNV;
   private boolean uUVvnUuNvvN;
   private boolean UUuUnNVNuuv;
   private boolean NVuNUuVnVUN;
   private boolean NVuunNnvvvVu;
   private boolean vNnNuuvVn;
   private boolean VUuuVUnun;
   private boolean vVVuuVVv;
   private boolean VuunNUUUvu;
   private int NNUUNUuVNNVn;
   private int VvVvnNUnvuvV;
   private String ccOO0COcoco0 = null;
   private float NUVvUUVuVNVv = Float.NaN;
   private float nNuVunNUVu = Float.NaN;
   private float UNvvunVVn = 0.0F;
   private float UnvuVuVnNuvu = Float.NaN;
   private float UvNNVUVNVuvV = Float.MAX_VALUE;
   private boolean NnunUUnU;
   private boolean nvuVvuNnNUnv;
   private boolean NnVnNVN;
   private float vnvvNvUnVv;
   private float OCOocoOoOO;
   private final uNuuunuNvuN o0Ooc0COOoc = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), VVuuUN, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   private final uNuuunuNvuN nvvnUnUn = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), vNUvnnVnUvu, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   private float UnUUVuVunvVu = 1.0F;
   private float nnvuvUNuUnN = 1.0F;
   private String UVnuVUUVnnU = "Тёмный";
   private float VunnVNvNV = 5.5F;
   private float NvUVUvVVnUu = 18.0F;
   private float unnUnUNVnN = 0.72F;
   private String NnuUnUNnu = "Выпуклая";
   private boolean UnnnvvU = true;
   private boolean VUUnuVvVu = true;
   private boolean VvVuvUvvNNVv = true;
   private boolean UnnNNvuvvUU = true;
   private boolean VNNnnVUuvv = true;
   private boolean vUvUvUNNuNvn = true;
   private int uuVuUuuVVNvN;
   private int VvuUUUNNNv;
   private NvVNvUvunNNu uuuVnuvnnNnU;
   private boolean nNunUnVN;
   private NUunUunuNV VnVuuvVvnNv;
   public final nNuUNVu.uunvUUVnuNn UuUVuuUu = new nNuUNVu.uunvUUVnuNn();

   private nNuUNVu() {
      for (int var1 = 0; var1 < 32; var1++) {
         this.NuunnvnN[var1] = new nNuUNVu.nvUnvV();
         this.NVUunUNUN[var1] = new nNuUNVu.nvUnvV();
      }
   }

   public static nNuUNVu UuUVuuUu() {
      return UvUvUNuvNU;
   }

   public void C00OOC00oO() {
      this.uUVvnUuNvvN = false;
      this.ccOO0COcoco0 = null;
   }

   public void UuUVuuUu(class_310 var1, UnVNvNnU var2, int var3, int var4) {
      this.nNnVnUNVV = var1;
      this.nVVUuvuNnUN = Objects.requireNonNull(var2, "renderer");
      this.NNUUNUuVNNVn = Math.max(0, var3);
      this.VvVvnNUnvuvV = Math.max(0, var4);
      this.nuunNvv = true;
      this.UuNnnVnuNNV = false;
      this.NnunUUnU = false;
      this.NUVvUUVuVNVv = Float.NaN;
      this.nNuVunNUVu = Float.NaN;
      if (var1 != null && var1.method_22683() != null) {
         this.VuunNUUUvu = var1.field_1755 instanceof class_408;
         long var5 = var1.method_22683().method_4490();
         if (var5 != 0L) {
            GLFW.glfwGetCursorPos(var5, this.UUVNuUNUvUnV, this.vuvnUnVnUNnV);
            if (Double.isFinite(this.UUVNuUNUvUnV[0]) && Double.isFinite(this.vuvnUnVnUNnV[0])) {
               this.uUVVvVVNvvn = (float)this.UUVNuUNUvUnV[0];
               this.vvUVNVvvNUv = (float)this.vuvnUnVnUNnV[0];
               this.UuNnnVnuNNV = true;
            }

            if (this.UuNnnVnuNNV && this.VuunNUUUvu) {
               boolean var7 = GLFW.glfwGetMouseButton(var5, 0) == 1;
               this.UUuUnNVNuuv = var7 && !this.NVuNUuVnVUN;
               this.uUVvnUuNvvN = var7;
               this.NVuNUuVnVUN = var7;
               boolean var8 = GLFW.glfwGetMouseButton(var5, 2) == 1;
               this.vNnNuuvVn = var8 && !this.NVuunNnvvvVu;
               this.NVuunNnvvvVu = var8;
               boolean var9 = GLFW.glfwGetMouseButton(var5, 1) == 1;
               this.VUuuVUnun = var9 && !this.vVVuuVVv;
               this.vVVuuVVv = var9;
            } else {
               this.uUVvnUuNvvN = this.UUuUnNVNuuv = this.vNnNuuvVn = this.VUuuVUnun = false;
               this.NVuNUuVnVUN = this.NVuunNnvvvVu = this.vVVuuVVv = false;
            }
         }

         if (!this.uUVvnUuNvvN) {
            this.ccOO0COcoco0 = null;
         }

         if (!this.uUVvnUuNvvN && this.nvuVvuNnNUnv) {
            this.nvuVvuNnNUnv = false;
            if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
               ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
            }
         }
      } else {
         this.uUVvnUuNvvN = this.UUuUnNVNuuv = this.vNnNuuvVn = this.VUuuVUnun = false;
         this.NVuNUuVnVUN = this.NVuunNnvvvVu = this.vVVuuVVv = false;
         this.VuunNUUUvu = false;
      }
   }

   public void uUnuvNvvNU() {
      this.UuuNnUvUuv();
      boolean var1 = this.VuunNUUUvu && this.uUVvnUuNvvN && this.ccOO0COcoco0 != null;
      this.nvvnUnUn.uUnuvNvvNU(var1 ? 1.0F : 0.0F);
      float var2 = this.nvvnUnUn.UuUVuuUu();
      if ((this.VuunNUUUvu || !(var2 <= 0.01F)) && this.NNUUNUuVNNVn > 0 && this.VvVvnNUnvuvV > 0) {
         NUunUunuNV var3 = this.nUUVuvU();
         int var4 = var3 == null ? -7473153 : var3.uVunuUNVVUUV();
         int var5 = var3 == null ? -41059 : var3.UNnVVNvvnVvU();
         NuUNvUNNUNVU.UuUVuuUu()
            .UuUVuuUu(
               this.NNUUNUuVNNVn, this.VvVvnNUnvuvV, this.NuunnvnN, this.uuVuUuuVVNvN, this.ccOO0COcoco0, this.uUVVvVVNvvn, this.vvUVNVvvNUv, var2, var4, var5
            );
      }
   }

   public void UuUVuuUu(int var1, int var2, nNuUNVu.nvUnvV[] var3, int var4, String var5, float var6, float var7, float var8) {
      NUunUunuNV var9 = this.nUUVuvU();
      int var10 = var9 == null ? -7473153 : var9.uVunuUNVVUUV();
      int var11 = var9 == null ? -41059 : var9.UNnVVNvvnVvU();
      NuUNvUNNUNVU.UuUVuuUu().UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var10, var11);
   }

   public void vVvUvVVuuNvV() {
      if (this.VuunNUUUvu && this.UuNnnVnuNNV) {
         float var1 = 170.0F;
         float var2 = 24.0F;

         for (nvUuvVvuuN var4 : this.UuUVuuUu.UuUVuuUu()) {
            if (var4 instanceof vvNnnUNnVvn) {
               var2 += 28.0F;
            } else if (var4 instanceof nNUuNvVn) {
               var2 += 40.0F;
            } else if (var4 instanceof UvNnUnuNUUU) {
               var2 += 28.0F;
            } else if (var4 instanceof VUVnvvnNN var5) {
               var2 += 28.0F + var5.vVvUvVVuuNvV.size() * 28.0F * var5.VVuuUN.uNNnnnuuuN();
            }
         }

         UuUuVnVvnvn.NVnVnNnN var33 = this.nVVUuvuNnUN != null
            ? UuUuVnVvnvn.UuUVuuUu(this.nVVUuvuNnUN, this.UuUVuuUu, this.vnvvNvUnVv, this.OCOocoOoOO, 0.0F, 0.0F)
            : new UuUuVnVvnvn.NVnVnNnN(this.vnvvNvUnVv, this.OCOocoOoOO, var1, var2);
         boolean var35 = this.NnVnNVN && var33.contains(this.uUVVvVVNvvn, this.vvUVNVvvNUv, 10.0F);
         if (this.VUuuVUnun) {
            if (this.NnunUUnU) {
               this.NnVnNVN = false;
            } else if (!var35) {
               this.NnVnNVN = !this.NnVnNVN;
               if (this.NnVnNVN) {
                  this.vnvvNvUnVv = this.uUVVvVVNvvn;
                  this.OCOocoOoOO = this.vvUVNVvvNUv;
               }
            }

            this.VUuuVUnun = false;
         }

         if (this.UUuUnNVNuuv && (this.NnunUUnU || !var35 && this.NnVnNVN)) {
            this.NnVnNVN = false;
         }
      }

      if (!this.VuunNUUUvu) {
         this.NnVnNVN = false;
      }

      this.o0Ooc0COOoc.uUnuvNvvNU(this.NnVnNVN ? 1.0F : 0.0F);
      float var31 = this.o0Ooc0COOoc.UuUVuuUu();
      if (var31 > 0.01F && this.nVVUuvuNnUN != null) {
         this.nVVUuvuNnUN.UuUVuuUu(this.NNUUNUuVNNVn, this.VvVvnNUnvuvV);
         UuUuVnVvnvn.UuUVuuUu(
            this.nVVUuvuNnUN,
            this.UuUVuuUu,
            this.vnvvNvUnVv,
            this.OCOocoOoOO,
            0.0F,
            0.0F,
            this.NNUUNUuVNNVn,
            this.VvVvnNUnvuvV,
            var31,
            this.uUVVvVVNvvn,
            this.vvUVNVvvNUv,
            this.UUuUnNVNuuv,
            this.uUVvnUuNvvN
         );
         this.nVVUuvuNnUN.C00OOC00oO();
         float var32 = this.UuUVuuUu.UuUVuuUu.uUnuvNvvNU();
         float var34 = this.UuUVuuUu.C00OOC00oO.uUnuvNvvNU();
         String var36 = this.UuUVuuUu.uUnuvNvvNU.uUnuvNvvNU();
         float var37 = this.UuUVuuUu.vVvUvVVuuNvV.uUnuvNvvNU();
         float var6 = this.UuUVuuUu.uNNnnnuuuN.uUnuvNvvNU();
         float var7 = this.UuUVuuUu.nuUnNvnuUu.uUnuvNvvNU();
         String var8 = this.UuUVuuUu.VVuuUN.uUnuvNvvNU();
         boolean var9 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Тень");
         boolean var10 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Обводка");
         boolean var11 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Темные зоны");
         boolean var12 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Верхняя накладка");
         boolean var13 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Нижняя накладка");
         boolean var14 = this.UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Тёмный рект поверх");
         if (var32 != this.UnUUVuVunvVu
            || var34 != this.nnvuvUNuUnN
            || !var36.equals(this.UVnuVUUVnnU)
            || var37 != this.VunnVNvNV
            || var6 != this.NvUVUvVVnUu
            || var7 != this.unnUnUNVnN
            || !var8.equals(this.NnuUnUNnu)
            || var9 != this.UnnnvvU
            || var10 != this.VUUnuVvVu
            || var11 != this.VvVuvUvvNNVv
            || var12 != this.UnnNNvuvvUU
            || var13 != this.VNNnnVUuvv
            || var14 != this.vUvUvUNNuNvn) {
            this.UnUUVuVunvVu = var32;
            this.nnvuvUNuUnN = var34;
            this.UVnuVUUVnnU = var36;
            this.VunnVNvNV = var37;
            this.NvUVUvVVnUu = var6;
            this.unnUnUNVnN = var7;
            this.NnuUnUNnu = var8;
            this.UnnnvvU = var9;
            this.VUUnuVvVu = var10;
            this.VvVuvUvvNNVv = var11;
            this.UnnNNvuvvUU = var12;
            this.VNNnnVUuvv = var13;
            this.vUvUvUNNuNvn = var14;

            for (vVvnUVnUvv var16 : uNvNvUNUnuu.C00OOC00oO()) {
               if (var16 != this.UuUVuuUu) {
                  label184:
                  for (nvUuvVvuuN var18 : var16.UuUVuuUu()) {
                     Objects.requireNonNull(var18);
                     nvUuvVvuuN var19 = var18;
                     byte var20 = 0;

                     while (true) {
                        switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{nNUuNvVn.class, nNUuNvVn.class, nNUuNvVn.class, nNUuNvVn.class, nNUuNvVn.class, UvNnUnuNUUU.class, UvNnUnuNUUU.class, VUVnvvnNN.class}, (Object)var19, var20)
                        ) {
                           case 0:
                              nNUuNvVn var21 = (nNUuNvVn)var19;
                              if (var18.UuUVuuUu.equals("Прозрачность")) {
                                 var21.UuUVuuUu(var32);
                                 continue label184;
                              }

                              var20 = 1;
                              break;
                           case 1:
                              nNUuNvVn var22 = (nNUuNvVn)var19;
                              if (var18.UuUVuuUu.equals("Прозрачность тёмных элементов")) {
                                 var22.UuUVuuUu(var34);
                                 continue label184;
                              }

                              var20 = 2;
                              break;
                           case 2:
                              nNUuNvVn var23 = (nNUuNvVn)var19;
                              if (var18.UuUVuuUu.equals("Нео дистанция")) {
                                 var23.UuUVuuUu(var37);
                                 continue label184;
                              }

                              var20 = 3;
                              break;
                           case 3:
                              nNUuNvVn var24 = (nNUuNvVn)var19;
                              if (var18.UuUVuuUu.equals("Нео размытие")) {
                                 var24.UuUVuuUu(var6);
                                 continue label184;
                              }

                              var20 = 4;
                              break;
                           case 4:
                              nNUuNvVn var25 = (nNUuNvVn)var19;
                              if (var18.UuUVuuUu.equals("Нео интенсивность")) {
                                 var25.UuUVuuUu(var7);
                                 continue label184;
                              }

                              var20 = 5;
                              break;
                           case 5:
                              UvNnUnuNUUU var26 = (UvNnUnuNUUU)var19;
                              if (var18.UuUVuuUu.equals("Стилистика")) {
                                 int var38 = var26.vVvUvVVuuNvV.indexOf(var36);
                                 if (var38 != -1) {
                                    var26.vNUvnnVnUvu = var38;
                                    var26.uNNnnnuuuN = var36;
                                 }
                                 continue label184;
                              }

                              var20 = 6;
                              break;
                           case 6:
                              UvNnUnuNUUU var27 = (UvNnUnuNUUU)var19;
                              if (var18.UuUVuuUu.equals("Нео форма")) {
                                 int var39 = var27.vVvUvVVuuNvV.indexOf(var8);
                                 if (var39 != -1) {
                                    var27.vNUvnnVnUvu = var39;
                                    var27.uNNnnnuuuN = var8;
                                 }
                                 continue label184;
                              }

                              var20 = 7;
                              break;
                           case 7:
                              VUVnvvnNN var28 = (VUVnvvnNN)var19;
                              if (!var18.UuUVuuUu.equals("Визуал")) {
                                 var20 = 8;
                                 break;
                              } else {
                                 for (vvNnnUNnVvn var30 : var28.vVvUvVVuuNvV) {
                                    if (var30.UuUVuuUu.equals("Тень")) {
                                       var30.C00OOC00oO(var9);
                                    }

                                    if (var30.UuUVuuUu.equals("Обводка")) {
                                       var30.C00OOC00oO(var10);
                                    }

                                    if (var30.UuUVuuUu.equals("Темные зоны")) {
                                       var30.C00OOC00oO(var11);
                                    }

                                    if (var30.UuUVuuUu.equals("Верхняя накладка")) {
                                       var30.C00OOC00oO(var12);
                                    }

                                    if (var30.UuUVuuUu.equals("Нижняя накладка")) {
                                       var30.C00OOC00oO(var13);
                                    }

                                    if (var30.UuUVuuUu.equals("Тёмный рект поверх")) {
                                       var30.C00OOC00oO(var14);
                                    }
                                 }
                              }
                           default:
                              continue label184;
                        }
                     }
                  }
               }
            }

            uNvNvUNUnuu.vVvUvVVuuNvV();
         }
      }

      this.nuunNvv = false;
      this.nVVUuvuNnUN = null;
   }

   public nNuUNVu.nvnNNunvv UuUVuuUu(String var1, float var2, float var3, float var4, float var5) {
      if (!this.nuunNvv) {
         throw new IllegalStateException("beginFrame must be called first");
      } else {
         String var6 = var1.trim();
         nNuUNVu.VUnuUnnuNvVu var7 = this.VVnVNnunVvu.get(var6);
         nNuUNVu.VvunVVUvUNnv var8 = this.c0oOOCcCoC0.computeIfAbsent(var1, var0 -> new nNuUNVu.VvunVVUvUNnv());
         var8.uVUuuVnNVU = UuUVuuUu(var4);
         var8.vuuuNvNuv = UuUVuuUu(var5);
         nNuUNVu.NVnVnNnN var9 = this.uUnuvNvvNU(var6);
         boolean var10 = this.UuNnnVnuNNV && this.VuunNUUUvu;
         Float var11 = var7 == null ? this.unNNVVNnvvV.remove(var6) : null;
         boolean var12 = var11 != null;
         boolean var13 = var7 != null && var7.userResized() || var12;
         float var14 = var12 ? var11 : this.UuUVuuUu(var7, var13);
         nNuUNVu.VUUnVnVNNU var15 = this.uUnuvNvvNU(var6, var4, var5, var14);
         var14 = var15.uUnuvNvvNU();
         if (!var8.uUnuvNvvNU) {
            var8.VVuuUN = var15.UuUVuuUu();
            var8.vNUvnnVnUvu = var15.C00OOC00oO();
         }

         float var16 = this.UuUVuuUu(var7, var2, var8.VVuuUN, var9);
         float var17 = this.C00OOC00oO(var7, var3, var8.vNUvnnVnUvu, var9);
         if (var12) {
            this.UuUVuuUu(var6, var16, var17, var14, var14, true);
            var7 = this.VVnVNnunVvu.get(var6);
         }

         float var18 = var8.UuUVuuUu ? var8.nUUVuvU.UuUVuuUu() : var16;
         float var19 = var8.UuUVuuUu ? var8.UnUNVVVNuv.UuUVuuUu() : var17;
         boolean var20 = UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var18, var19, var8.VVuuUN, var8.vNUvnnVnUvu);
         boolean var21 = UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var18 + var8.VVuuUN - 12.0F, var19 + var8.vNUvnnVnUvu - 12.0F, 12.0F, 12.0F);
         if (var10 && (var20 || var21)) {
            this.NnunUUnU = true;
         }

         var8.vNVuvnUUnuUn.uUnuvNvvNU(!var10 || !var20 && !var21 ? 0.0F : 1.0F);
         if (var10 && this.VUuuVUnun && var20) {
            var8.vVvUvVVuuNvV = !var8.vVvUvVVuuNvV;
            this.NnVnNVN = false;
            this.VUuuVUnun = false;
         }

         if (!this.VuunNUUUvu) {
            var8.vVvUvVVuuNvV = false;
         }

         var8.UvnvNVnnnnNU.uUnuvNvvNU(var8.vVvUvVVuuNvV ? 1.0F : 0.0F);
         if (var10 && this.vNnNuuvVn && (var20 || var21)) {
            this.UuUVuuUu(var6, var8.nUUVuvU.uUnuvNvvNU(), var8.UnUNVVVNuv.uUnuvNvvNU(), 1.0F, 1.0F, false);
            var7 = this.VVnVNnunVvu.get(var6);
            var13 = false;
            var14 = 1.0F;
            var15 = this.uUnuvNvvNU(var6, var4, var5, var14);
            var8.VVuuUN = var15.UuUVuuUu();
            var8.vNUvnnVnUvu = var15.C00OOC00oO();
            var16 = this.UuUVuuUu(var7, var2, var8.VVuuUN, var9);
            var17 = this.C00OOC00oO(var7, var3, var8.vNUvnnVnUvu, var9);
            if (var1.equals(this.ccOO0COcoco0)) {
               this.ccOO0COcoco0 = null;
            }

            var8.uUnuvNvvNU = false;
            this.vNnNuuvVn = false;
         }

         if (!var8.UuUVuuUu) {
            var8.nUUVuvU.C00OOC00oO(var16);
            var8.UnUNVVVNuv.C00OOC00oO(var17);
            var8.UuUVuuUu = true;
         }

         if (!this.uUVvnUuNvvN || !var10) {
            var8.C00OOC00oO = false;
            var8.uUnuvNvvNU = false;
         } else if (!var8.C00OOC00oO && !var8.uUnuvNvvNU && (this.ccOO0COcoco0 == null || this.ccOO0COcoco0.equals(var1))) {
            if (var21) {
               var8.uUnuvNvvNU = true;
               this.ccOO0COcoco0 = var1;
               var8.uNNnnnuuuN = var8.VVuuUN - this.uUVVvVVNvvn;
               var8.nuUnNvnuUu = var8.vNUvnnVnUvu - this.vvUVNVvvNUv;
            } else if (var20) {
               var8.C00OOC00oO = true;
               this.ccOO0COcoco0 = var1;
               var8.uNNnnnuuuN = this.uUVVvVVNvvn - var18;
               var8.nuUnNvnuUu = this.vvUVNVvvNUv - var19;
            }
         }

         boolean var22 = var8.C00OOC00oO && var1.equals(this.ccOO0COcoco0);
         boolean var23 = var8.uUnuvNvvNU && var1.equals(this.ccOO0COcoco0);
         if (var22 || var23) {
            this.NnVnNVN = false;
         }

         boolean var10000;
         label187: {
            label186: {
               if (this.nNnVnUNVV != null && this.nNnVnUNVV.method_22683() != null) {
                  if (GLFW.glfwGetKey(this.nNnVnUNVV.method_22683().method_4490(), 341) == 1) {
                     break label186;
                  }

                  if (GLFW.glfwGetKey(this.nNnVnUNVV.method_22683().method_4490(), 345) == 1) {
                     break label186;
                  }
               }

               var10000 = false;
               break label187;
            }

            var10000 = true;
         }

         boolean var24 = var10000;
         if (var22) {
            var16 = this.UuUVuuUu(this.uUVVvVVNvvn - var8.uNNnnnuuuN, var8.VVuuUN, var9);
            var17 = this.C00OOC00oO(this.vvUVNVvvNUv - var8.nuUnNvnuUu, var8.vNUvnnVnUvu, var9);
            if (var24) {
               var16 = Math.round(var16 / 10.0F) * 10.0F;
               var17 = Math.round(var17 / 10.0F) * 10.0F;
            }

            float var35 = this.C00OOC00oO(var6, var16, var8.VVuuUN);
            float var38 = this.uUnuvNvvNU(var6, var17, var8.vNUvnnVnUvu);
            var16 = this.UuUVuuUu(var35, var8.VVuuUN, var9);
            var17 = this.C00OOC00oO(var38, var8.vNUvnnVnUvu, var9);
            this.UuUVuuUu(var6, var16, var17, var14, var14, var13);
         } else if (var23) {
            float var25 = Math.max(1.0F, this.uUVVvVVNvvn + var8.uNNnnnuuuN);
            float var26 = Math.max(1.0F, this.vvUVNVvvNUv + var8.nuUnNvnuUu);
            float var27 = var25 / Math.max(1.0F, var4);
            float var28 = var26 / Math.max(1.0F, var5);
            float var29 = (var27 + var28) * 0.5F;
            if (var24) {
               var29 = Math.round(var29 * 20.0F) / 20.0F;
            }

            nNuUNVu.VUUnVnVNNU var30 = this.uUnuvNvvNU(var6, var4, var5, var29);
            var8.VVuuUN = var30.UuUVuuUu();
            var8.vNUvnnVnUvu = var30.C00OOC00oO();
            var14 = var30.uUnuvNvvNU();
            var16 = this.UuUVuuUu(var16, var8.VVuuUN, var9);
            var17 = this.C00OOC00oO(var17, var8.vNUvnnVnUvu, var9);
            this.UuUVuuUu(var6, var16, var17, var14, var14, true);
         } else if (var13 && var7 != null && (Math.abs(var7.scaleX() - var14) > 0.001F || Math.abs(var7.scaleY() - var14) > 0.001F)) {
            this.UuUVuuUu(var6, var16, var17, var14, var14, Math.abs(var14 - 1.0F) > 0.01F);
         }

         var16 = this.UuUVuuUu(var16, var8.VVuuUN, var9);
         var17 = this.C00OOC00oO(var17, var8.vNUvnnVnUvu, var9);
         var8.nUUVuvU.uUnuvNvvNU(var16);
         var8.UnUNVVVNuv.uUnuvNvvNU(var17);
         float var40 = var8.nUUVuvU.UuUVuuUu();
         float var41 = var8.UnUNVVVNuv.UuUVuuUu();
         float var42 = !var22 && !var23 ? 1.0F : 0.65F;
         var8.UuuNnUvUuv.uUnuvNvvNU(var42);
         float var43 = var8.UuuNnUvUuv.UuUVuuUu();
         boolean var44 = false;
         if (var43 < 0.99F) {
            this.nVVUuvuNnUN.uNNnnnuuuN(var43);
            var44 = true;
         }

         boolean var45 = var10 && UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var40 + var8.VVuuUN - 12.0F, var41 + var8.vNUvnnVnUvu - 12.0F, 12.0F, 12.0F);
         return var8.nvUVNnuu
            .UuUVuuUu(
               var1,
               var40,
               var41,
               var8.VVuuUN,
               var8.vNUvnnVnUvu,
               var22 || var23,
               var45,
               var44,
               var8.vVvUvVVuuNvV,
               var8.vNVuvnUUnuUn.UuUVuuUu(),
               var8.UvnvNVnnnnNU.UuUVuuUu()
            );
      }
   }

   public nNuUNVu.nvnNNunvv C00OOC00oO(String var1, float var2, float var3, float var4, float var5) {
      if (!this.nuunNvv) {
         throw new IllegalStateException("beginFrame must be called first");
      } else {
         String var6 = var1.trim();
         nNuUNVu.VUnuUnnuNvVu var7 = this.VVnVNnunVvu.get(var6);
         nNuUNVu.VvunVVUvUNnv var8 = this.c0oOOCcCoC0.computeIfAbsent(var1, var0 -> new nNuUNVu.VvunVVUvUNnv());
         var8.uVUuuVnNVU = UuUVuuUu(var4);
         var8.vuuuNvNuv = UuUVuuUu(var5);
         nNuUNVu.NVnVnNnN var9 = this.uUnuvNvvNU(var6);
         boolean var10 = this.UuNnnVnuNNV && this.VuunNUUUvu;
         Float var11 = var7 == null ? this.unNNVVNnvvV.remove(var6) : null;
         boolean var12 = var11 != null;
         boolean var13 = var7 != null && var7.userResized() || var12;
         float var14 = var12 ? var11 : this.UuUVuuUu(var7, var13);
         nNuUNVu.VUUnVnVNNU var15 = this.uUnuvNvvNU(var6, var4, var5, var14);
         var14 = var15.uUnuvNvvNU();
         if (!var8.uUnuvNvvNU) {
            var8.VVuuUN = var15.UuUVuuUu();
            var8.vNUvnnVnUvu = var15.C00OOC00oO();
         }

         float var16 = this.UuUVuuUu(var7, var2, var8.VVuuUN, var9);
         float var17 = this.C00OOC00oO(var7, var3, var8.vNUvnnVnUvu, var9);
         if (var12) {
            this.UuUVuuUu(var6, var16, var17, var14, var14, true);
            var7 = this.VVnVNnunVvu.get(var6);
         }

         float var18 = C00OOC00oO(var2, var16);
         float var19 = C00OOC00oO(var3, var17);
         boolean var20 = UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var18, var19, var8.VVuuUN, var8.vNUvnnVnUvu);
         boolean var21 = UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var18 + var8.VVuuUN - 12.0F, var19 + var8.vNUvnnVnUvu - 12.0F, 12.0F, 12.0F);
         if (var10 && (var20 || var21)) {
            this.NnunUUnU = true;
         }

         var8.vNVuvnUUnuUn.uUnuvNvvNU(!var10 || !var20 && !var21 ? 0.0F : 1.0F);
         if (var10 && this.VUuuVUnun && var20) {
            var8.vVvUvVVuuNvV = !var8.vVvUvVVuuNvV;
            this.NnVnNVN = false;
            this.VUuuVUnun = false;
         }

         if (!this.VuunNUUUvu) {
            var8.vVvUvVVuuNvV = false;
         }

         var8.UvnvNVnnnnNU.uUnuvNvvNU(var8.vVvUvVVuuNvV ? 1.0F : 0.0F);
         var8.C00OOC00oO = false;
         if (var10 && this.vNnNuuvVn && (var20 || var21)) {
            this.UuUVuuUu(var6, var16, var17, 1.0F, 1.0F, false);
            var7 = this.VVnVNnunVvu.get(var6);
            var13 = false;
            var14 = 1.0F;
            var15 = this.uUnuvNvvNU(var6, var4, var5, var14);
            var8.VVuuUN = var15.UuUVuuUu();
            var8.vNUvnnVnUvu = var15.C00OOC00oO();
            if (var1.equals(this.ccOO0COcoco0)) {
               this.ccOO0COcoco0 = null;
            }

            var8.uUnuvNvvNU = false;
            this.vNnNuuvVn = false;
         }

         if (!this.uUVvnUuNvvN || !var10) {
            var8.uUnuvNvvNU = false;
         } else if (!var8.uUnuvNvvNU && (this.ccOO0COcoco0 == null || this.ccOO0COcoco0.equals(var1)) && var21) {
            var8.uUnuvNvvNU = true;
            this.ccOO0COcoco0 = var1;
            var8.uNNnnnuuuN = var8.VVuuUN - this.uUVVvVVNvvn;
            var8.nuUnNvnuUu = var8.vNUvnnVnUvu - this.vvUVNVvvNUv;
         }

         boolean var22 = var8.uUnuvNvvNU && var1.equals(this.ccOO0COcoco0);
         if (var22) {
            this.NnVnNVN = false;
            float var23 = Math.max(1.0F, this.uUVVvVVNvvn + var8.uNNnnnuuuN);
            float var24 = Math.max(1.0F, this.vvUVNVvvNUv + var8.nuUnNvnuUu);
            float var25 = var23 / Math.max(1.0F, var4);
            float var26 = var24 / Math.max(1.0F, var5);
            float var27 = (var25 + var26) * 0.5F;
            if (this.nNnVnUNVV != null
               && this.nNnVnUNVV.method_22683() != null
               && (
                  GLFW.glfwGetKey(this.nNnVnUNVV.method_22683().method_4490(), 341) == 1
                     || GLFW.glfwGetKey(this.nNnVnUNVV.method_22683().method_4490(), 345) == 1
               )) {
               var27 = Math.round(var27 * 20.0F) / 20.0F;
            }

            nNuUNVu.VUUnVnVNNU var28 = this.uUnuvNvvNU(var6, var4, var5, var27);
            var8.VVuuUN = var28.UuUVuuUu();
            var8.vNUvnnVnUvu = var28.C00OOC00oO();
            var14 = var28.uUnuvNvvNU();
            this.UuUVuuUu(var6, var16, var17, var14, var14, true);
         } else if (var13 && var7 != null && (Math.abs(var7.scaleX() - var14) > 0.001F || Math.abs(var7.scaleY() - var14) > 0.001F)) {
            this.UuUVuuUu(var6, var16, var17, var14, var14, Math.abs(var14 - 1.0F) > 0.01F);
         }

         float var32 = var22 ? 0.65F : 1.0F;
         var8.UuuNnUvUuv.uUnuvNvvNU(var32);
         float var33 = var8.UuuNnUvUuv.UuUVuuUu();
         boolean var34 = false;
         if (var33 < 0.99F) {
            this.nVVUuvuNnUN.uNNnnnuuuN(var33);
            var34 = true;
         }

         boolean var35 = var10 && UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var18 + var8.VVuuUN - 12.0F, var19 + var8.vNUvnnVnUvu - 12.0F, 12.0F, 12.0F);
         return var8.nvUVNnuu
            .UuUVuuUu(
               var1,
               var18,
               var19,
               var8.VVuuUN,
               var8.vNUvnnVnUvu,
               var22,
               var35,
               var34,
               var8.vVvUvVVuuNvV,
               var8.vNVuvnUUnuUn.UuUVuuUu(),
               var8.UvnvNVnnnnNU.UuUVuuUu()
            );
      }
   }

   public nNuUNVu.nvnNNunvv UuUVuuUu(nNuUNVu.nvnNNunvv var1, float var2, float var3, float var4, float var5) {
      if (var1 != null && var1.UuUVuuUu != null && !(var2 <= 0.0F) && !(var3 <= 0.0F) && Float.isFinite(var2) && Float.isFinite(var3)) {
         nNuUNVu.VvunVVUvUNnv var6 = this.c0oOOCcCoC0.get(var1.UuUVuuUu);
         if (var6 == null) {
            return var1;
         } else {
            nNuUNVu.NVnVnNnN var7 = this.uUnuvNvvNU(var1.UuUVuuUu.trim());
            float var8 = (float)Math.sqrt(Math.max(1.0E-4F, var2 / Math.max(1.0F, var4) * (var3 / Math.max(1.0F, var5))));
            nNuUNVu.VUUnVnVNNU var9 = this.uUnuvNvvNU(var1.UuUVuuUu, var4, var5, var8);
            float var10 = var9.UuUVuuUu();
            float var11 = var9.C00OOC00oO();
            float var12 = this.UuUVuuUu(var1.C00OOC00oO, var10, var7);
            float var13 = this.C00OOC00oO(var1.uUnuvNvvNU, var11, var7);
            var6.VVuuUN = var10;
            var6.vNUvnnVnUvu = var11;
            String var14 = var1.UuUVuuUu.trim();
            float var15 = this.UuUVuuUu(Float.isFinite(var6.nUUVuvU.uUnuvNvvNU()) ? var6.nUUVuvU.uUnuvNvvNU() : var12, var10, var7);
            float var16 = this.C00OOC00oO(Float.isFinite(var6.UnUNVVVNuv.uUnuvNvvNU()) ? var6.UnUNVVVNuv.uUnuvNvvNU() : var13, var11, var7);
            var6.nUUVuvU.uUnuvNvvNU(var15);
            var6.UnUNVVVNuv.uUnuvNvvNU(var16);
            boolean var17 = Math.abs(var9.uUnuvNvvNU() - 1.0F) > 0.01F;
            this.UuUVuuUu(var14, var15, var16, var9.uUnuvNvvNU(), var9.uUnuvNvvNU(), var17);
            boolean var18 = this.VuunNUUUvu
               && this.UuNnnVnuNNV
               && UuUVuuUu(this.uUVVvVVNvvn, this.vvUVNVvvNUv, var12 + var10 - 12.0F, var13 + var11 - 12.0F, 12.0F, 12.0F);
            return var1.UuUVuuUu(
               var1.UuUVuuUu, var12, var13, var10, var11, var1.vNUvnnVnUvu, var18, var1.vuuuNvNuv, var1.nvUVNnuu, var1.nuUnNvnuUu, var1.VVuuUN
            );
         }
      } else {
         return var1;
      }
   }

   public void UuUVuuUu(nNuUNVu.nvnNNunvv var1) {
      this.C00OOC00oO(
         var1,
         var1 == null ? 0.0F : var1.C00OOC00oO,
         var1 == null ? 0.0F : var1.uUnuvNvvNU,
         var1 == null ? 0.0F : var1.vVvUvVVuuNvV,
         var1 == null ? 0.0F : var1.uNNnnnuuuN
      );
   }

   public void C00OOC00oO(nNuUNVu.nvnNNunvv var1, float var2, float var3, float var4, float var5) {
      if (var1 != null && this.nVVUuvuNnUN != null) {
         this.uUnuvNvvNU(var1, var2, var3, var4, var5);
         if (this.VuunNUUUvu && var1.UuUVuuUu != null) {
            float var10 = Math.max(var1.nuUnNvnuUu, var1.vNUvnnVnUvu ? 1.0F : 0.0F);
            if (var10 > 0.01F) {
               float var11 = Math.max(5.0F, Math.min(12.0F, Math.min(var4, var5) * 0.16F));
               int var12 = VnVnuUn.uUnuvNvvNU(255, 255, 255, (int)((var1.vNUvnnVnUvu ? 62 : 34) * var10));
               int var13 = VnVnuUn.uUnuvNvvNU(125, 210, 255, (int)((var1.vNUvnnVnUvu ? 28 : 14) * var10));
               this.nVVUuvuNnUN.UuUVuuUu(var2, var3, var4, var5, var11, var1.vNUvnnVnUvu ? 7.0F : 4.0F, 0.8F, var13);
               this.nVVUuvuNnUN.UuUVuuUu(var2, var3, var4, var5, var11, var12, var1.vNUvnnVnUvu ? 1.25F : 1.0F);
            }

            int var14 = !var1.uVUuuVnNVU && !var1.vNUvnnVnUvu ? 721420287 : -2130706433;
            float var15 = var2 + var4 - 6.0F;
            float var16 = var3 + var5 - 6.0F;
            this.nVVUuvuNnUN.UuUVuuUu(var15, var16, 2.5F, 2.5F, 1.0F, var14);
            this.nVVUuvuNnUN.UuUVuuUu(var15 - 4.5F, var16, 2.5F, 2.5F, 1.0F, var14);
            this.nVVUuvuNnUN.UuUVuuUu(var15, var16 - 4.5F, 2.5F, 2.5F, 1.0F, var14);
            if (var1.nuUnNvnuUu > 0.01F && !var1.vNUvnnVnUvu) {
               this.UuUVuuUu(this.nVVUuvuNnUN, var2, var3, var4, var1.nuUnNvnuUu);
            }

            if (var1.vNUvnnVnUvu) {
               this.UuUVuuUu(this.nVVUuvuNnUN);
            }
         }

         if (var1.vuuuNvNuv) {
            this.nVVUuvuNnUN.vuuuNvNuv();
         }
      }
   }

   private void C00OOC00oO(nNuUNVu.nvnNNunvv var1) {
      this.uUnuvNvvNU(
         var1,
         var1 == null ? 0.0F : var1.C00OOC00oO,
         var1 == null ? 0.0F : var1.uUnuvNvvNU,
         var1 == null ? 0.0F : var1.vVvUvVVuuNvV,
         var1 == null ? 0.0F : var1.uNNnnnuuuN
      );
   }

   private void uUnuvNvvNU(nNuUNVu.nvnNNunvv var1, float var2, float var3, float var4, float var5) {
      if (var1 != null && var1.UuUVuuUu != null && Float.isFinite(var2) && Float.isFinite(var3) && !(var4 <= 0.0F) && !(var5 <= 0.0F)) {
         int var6 = this.VvuUUUNNNv;
         if (var6 >= 32) {
            if (!var1.vNUvnnVnUvu) {
               return;
            }

            var6 = 31;
         } else {
            this.VvuUUUNNNv++;
         }

         float var7 = var2 + var4 * 0.5F;
         float var8 = var3 + var5 * 0.5F;
         float var9 = (float)Math.sqrt(var4 * var4 + var5 * var5) * 0.5F;
         float var10 = var1.vNUvnnVnUvu ? 1.0F : 0.34F + Math.min(0.24F, var1.nuUnNvnuUu * 0.24F);
         this.NVUunUNUN[var6].UuUVuuUu(var1.UuUVuuUu, var7, var8, Math.max(34.0F, var9), var10, var4, var5);
      }
   }

   private void UuuNnUvUuv() {
      this.uuVuUuuVVNvN = this.VvuUUUNNNv;

      for (int var1 = 0; var1 < this.uuVuUuuVVNvN; var1++) {
         this.NuunnvnN[var1].UuUVuuUu(this.NVUunUNUN[var1]);
      }

      this.VvuUUUNNNv = 0;
   }

   private NUunUunuNV nUUVuvU() {
      NvVNvUvunNNu var1 = NvVNvUvunNNu.WILD;
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu != null) {
         var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO();
      }

      boolean var2 = var1 == NvVNvUvunNNu.VERNAL_SOLSTICE
         || var1 == NvVNvUvunNNu.SAKURA_BREEZE
         || var1 == NvVNvUvunNNu.PORCELAIN_DAWN
         || var1 == NvVNvUvunNNu.FRUTIGER_AERO;
      if (this.VnVuuvVvnNv == null || this.uuuVnuvnnNnU != var1 || this.nNunUnVN != var2 || var1 == NvVNvUvunNNu.CUSTOM) {
         this.VnVuuvVvnNv = NUunUunuNV.UuUVuuUu(var1, var2);
         this.uuuVnuvnnNnU = var1;
         this.nNunUnVN = var2;
      }

      return this.VnVuuvVvnNv;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      String var6 = "ЛКМ - Для перемещения";
      String var7 = "ПКМ - Для настроек";
      float var8 = 25.0F;
      float var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var6, var8).UuUVuuUu;
      float var10 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var7, var8).UuUVuuUu;
      float var11 = var8 * 2.0F + 4.0F;
      float var12 = var2 + var4 / 2.0F;
      float var13 = var3 - var11 - 8.0F;
      int var14 = (int)(255.0F * var5);
      if (var14 > 5) {
         int var15 = UnVNvNnU.VvunVVUvUNnv.uUnuvNvvNU(255, 255, 255, var14);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12 - var9 / 2.0F, var13 + 6.0F, var8, var6, var15);
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var12 - var10 / 2.0F, var13 + 6.0F + var8 + 2.0F, var8, var7, var15);
      }
   }

   private float UuUVuuUu(nNuUNVu.VUnuUnnuNvVu var1, float var2, float var3, nNuUNVu.NVnVnNnN var4) {
      return var1 != null && this.NNUUNUuVNNVn > 0 ? this.UuUVuuUu(var1.nx() * this.NNUUNUuVNNVn, var3, var4) : this.UuUVuuUu(var2, var3, var4);
   }

   private float C00OOC00oO(nNuUNVu.VUnuUnnuNvVu var1, float var2, float var3, nNuUNVu.NVnVnNnN var4) {
      return var1 != null && this.VvVvnNUnvuvV > 0 ? this.C00OOC00oO(var1.ny() * this.VvVvnNUnvuvV, var3, var4) : this.C00OOC00oO(var2, var3, var4);
   }

   private void UuUVuuUu(String var1, float var2, float var3, float var4, float var5, boolean var6) {
      if (this.NNUUNUuVNNVn > 0 && this.VvVvnNUnvuvV > 0 && var1 != null) {
         float var7 = var2 / this.NNUUNUuVNNVn;
         float var8 = var3 / this.VvVvnNUnvuvV;
         nNuUNVu.VUnuUnnuNvVu var9 = this.VVnVNnunVvu.get(var1);
         if (!this.UuUVuuUu(var9, var7, var8, var4, var5, var6)) {
            this.VVnVNnunVvu.put(var1, new nNuUNVu.VUnuUnnuNvVu(var7, var8, var4, var5, var6));
            this.nvuVvuNnNUnv = true;
         }
      }
   }

   private boolean UuUVuuUu(nNuUNVu.VUnuUnnuNvVu var1, float var2, float var3, float var4, float var5, boolean var6) {
      return var1 == null
         ? false
         : Math.abs(var1.nx() - var2) < 1.0E-5F
            && Math.abs(var1.ny() - var3) < 1.0E-5F
            && Math.abs(var1.scaleX() - var4) < 1.0E-4F
            && Math.abs(var1.scaleY() - var5) < 1.0E-4F
            && var1.userResized() == var6;
   }

   private float C00OOC00oO(String var1, float var2, float var3) {
      this.NUVvUUVuVNVv = Float.NaN;
      this.UnUNVVVNuv();
      this.UuUVuuUu(var2, 0.0F, 0.0F);
      this.UuUVuuUu(var2, this.NNUUNUuVNNVn - var3, this.NNUUNUuVNNVn);
      this.UuUVuuUu(var2, this.NNUUNUuVNNVn * 0.5F - var3 * 0.5F, this.NNUUNUuVNNVn * 0.5F);

      for (Entry var5 : this.c0oOOCcCoC0.entrySet()) {
         if (!((String)var5.getKey()).equals(var1)) {
            nNuUNVu.VvunVVUvUNnv var6 = (nNuUNVu.VvunVVUvUNnv)var5.getValue();
            if (var6.UuUVuuUu && !(var6.VVuuUN <= 0.0F) && !(var6.vNUvnnVnUvu <= 0.0F)) {
               float var7 = var6.nUUVuvU.uUnuvNvvNU();
               float var8 = var6.VVuuUN;
               this.UuUVuuUu(var2, var7, var7);
               this.UuUVuuUu(var2, var7 + var8, var7 + var8);
               this.UuUVuuUu(var2, var7 - var3, var7);
               this.UuUVuuUu(var2, var7 + var8 - var3, var7 + var8);
               this.UuUVuuUu(var2, var7 + var8 * 0.5F - var3 * 0.5F, var7 + var8 * 0.5F);
            }
         }
      }

      if (Float.isFinite(this.UnvuVuVnNuvu)) {
         this.NUVvUUVuVNVv = this.UnvuVuVnNuvu;
         return this.UNvvunVVn;
      } else {
         return var2;
      }
   }

   private float uUnuvNvvNU(String var1, float var2, float var3) {
      this.nNuVunNUVu = Float.NaN;
      this.UnUNVVVNuv();
      this.UuUVuuUu(var2, 0.0F, 0.0F);
      this.UuUVuuUu(var2, this.VvVvnNUnvuvV - var3, this.VvVvnNUnvuvV);
      this.UuUVuuUu(var2, this.VvVvnNUnvuvV * 0.5F - var3 * 0.5F, this.VvVvnNUnvuvV * 0.5F);

      for (Entry var5 : this.c0oOOCcCoC0.entrySet()) {
         if (!((String)var5.getKey()).equals(var1)) {
            nNuUNVu.VvunVVUvUNnv var6 = (nNuUNVu.VvunVVUvUNnv)var5.getValue();
            if (var6.UuUVuuUu && !(var6.VVuuUN <= 0.0F) && !(var6.vNUvnnVnUvu <= 0.0F)) {
               float var7 = var6.UnUNVVVNuv.uUnuvNvvNU();
               float var8 = var6.vNUvnnVnUvu;
               this.UuUVuuUu(var2, var7, var7);
               this.UuUVuuUu(var2, var7 + var8, var7 + var8);
               this.UuUVuuUu(var2, var7 - var3, var7);
               this.UuUVuuUu(var2, var7 + var8 - var3, var7 + var8);
               this.UuUVuuUu(var2, var7 + var8 * 0.5F - var3 * 0.5F, var7 + var8 * 0.5F);
            }
         }
      }

      if (Float.isFinite(this.UnvuVuVnNuvu)) {
         this.nNuVunNUVu = this.UnvuVuVnNuvu;
         return this.UNvvunVVn;
      } else {
         return var2;
      }
   }

   private void UnUNVVVNuv() {
      this.UNvvunVVn = 0.0F;
      this.UnvuVuVnNuvu = Float.NaN;
      this.UvNNVUVNVuvV = Float.MAX_VALUE;
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      float var4 = Math.abs(var1 - var2);
      if (!(var4 > 5.0F) && !(var4 >= this.UvNNVUVNVuvV)) {
         this.UNvvunVVn = var2;
         this.UnvuVuVnNuvu = var3;
         this.UvNNVUVNVuvV = var4;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1) {
      int var2 = VnVnuUn.uUnuvNvvNU(125, 210, 255, 118);
      int var3 = VnVnuUn.uUnuvNvvNU(125, 210, 255, 32);
      if (Float.isFinite(this.NUVvUUVuVNVv)) {
         var1.UuUVuuUu(this.NUVvUUVuVNVv - 0.75F, 0.0F, 1.5F, (float)this.VvVvnNUnvuvV, 1.0F, 9.0F, 2.0F, var3);
         var1.UuUVuuUu(this.NUVvUUVuVNVv - 0.5F, 0.0F, 1.0F, (float)this.VvVvnNUnvuvV, 0.5F, var2);
      }

      if (Float.isFinite(this.nNuVunNUVu)) {
         var1.UuUVuuUu(0.0F, this.nNuVunNUVu - 0.75F, (float)this.NNUUNUuVNNVn, 1.5F, 1.0F, 9.0F, 2.0F, var3);
         var1.UuUVuuUu(0.0F, this.nNuVunNUVu - 0.5F, (float)this.NNUUNUuVNNVn, 1.0F, 0.5F, var2);
      }
   }

   private nNuUNVu.NVnVnNnN uUnuvNvvNU(String var1) {
      if (UuUVuuUu(var1, "hotbar")) {
         return nUUVuvU;
      } else if (UuUVuuUu(var1, "watermark")) {
         return UnUNVVVNuv;
      } else if (UuUVuuUu(var1, "targethud")) {
         return vNVuvnUUnuUn;
      } else if (UuUVuuUu(var1, "info")) {
         return UvnvNVnnnnNU;
      } else if (UuUVuuUu(var1, "inventory")) {
         return uVUVnuvnuVuv;
      } else if (UuUVuuUu(var1, "autobuy")) {
         return NVNnnvnuunNv;
      } else if (UuUVuuUu(var1, "music")) {
         return uVunuUNVVUUV;
      } else if (UuUVuuUu(var1, "arraylist")) {
         return UNnVVNvvnVvU;
      } else if (UuUVuuUu(var1, "notifications")) {
         return uNnUnnuNUnNu;
      } else if (UuUVuuUu(var1, "potions") || UuUVuuUu(var1, "cooldowns")) {
         return NnUuNNU;
      } else if (UuUVuuUu(var1, "armor") || UuUVuuUu(var1, "aistatus")) {
         return nNvNUVU;
      } else {
         return !UuUVuuUu(var1, "staff") && !UuUVuuUu(var1, "party") && !UuUVuuUu(var1, "serverhelper") && !UuUVuuUu(var1, "hotkeys") ? uUVuVvuNUvnu : UnUNuUU;
      }
   }

   private static boolean UuUVuuUu(String var0, String var1) {
      if (var0 != null && var1 != null && var1.length() <= var0.length()) {
         int var2 = var0.length() - var1.length();

         for (int var3 = 0; var3 <= var2; var3++) {
            if (var0.regionMatches(true, var3, var1, 0, var1.length())) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public float UuUVuuUu(String var1, float var2) {
      return this.UuUVuuUu(var1, var2, Float.NaN, Float.NaN);
   }

   public float UuUVuuUu(String var1, float var2, float var3, float var4) {
      String var5 = var1 == null ? "" : var1.trim();
      nNuUNVu.VvunVVUvUNnv var6 = this.c0oOOCcCoC0.get(var5);
      if (var6 == null && var1 != null) {
         var6 = this.c0oOOCcCoC0.get(var1);
      }

      if (var6 != null && var6.uVUuuVnNVU > 0.0F && var6.vuuuNvNuv > 0.0F) {
         return this.C00OOC00oO(var5, var6.uVUuuVnNVU, var6.vuuuNvNuv, var2);
      } else if (Float.isFinite(var3) && var3 > 0.0F && Float.isFinite(var4) && var4 > 0.0F) {
         return this.C00OOC00oO(var5, var3, var4, var2);
      } else {
         nNuUNVu.NVnVnNnN var7 = this.uUnuvNvvNU(var1);
         return C00OOC00oO(C00OOC00oO(var2, 1.0F), var7.minScale(), var7.maxScale());
      }
   }

   public float UuUVuuUu(String var1) {
      return this.UuUVuuUu(var1, Float.NaN, Float.NaN);
   }

   public float UuUVuuUu(String var1, float var2, float var3) {
      if (var1 != null && !var1.isBlank()) {
         nNuUNVu.VUnuUnnuNvVu var4 = this.VVnVNnunVvu.get(var1);
         Float var5 = var4 == null ? this.unNNVVNnvvV.get(var1) : null;
         float var6 = var5 == null ? this.UuUVuuUu(var4, var4 != null && var4.userResized()) : var5;
         return this.UuUVuuUu(var1, var6, var2, var3);
      } else {
         return 1.0F;
      }
   }

   public nNuUNVu.VUnuUnnuNvVu UuUVuuUu(String var1, float var2, float var3, float var4, float var5, float var6) {
      if (var1 != null && !var1.isBlank() && this.NNUUNUuVNNVn > 0 && this.VvVvnNUnvuvV > 0) {
         String var7 = var1.trim();
         nNuUNVu.VvunVVUvUNnv var8 = this.c0oOOCcCoC0.get(var7);
         if (var8 == null) {
            var8 = this.c0oOOCcCoC0.get(var1);
         }

         float var9;
         label70: {
            var9 = this.UuUVuuUu(var7, var2, var5, var6);
            nNuUNVu.VUnuUnnuNvVu var10 = this.VVnVNnunVvu.get(var7);
            if (var10 == null) {
               if (var8 == null) {
                  break label70;
               }

               if (!var8.UuUVuuUu) {
                  break label70;
               }
            }

            this.unNNVVNnvvV.remove(var7);
            float var11;
            float var12;
            if (var10 != null) {
               var11 = var10.nx() * this.NNUUNUuVNNVn;
               var12 = var10.ny() * this.VvVvnNUnvuvV;
            } else if (var8 != null && var8.UuUVuuUu) {
               var11 = var8.nUUVuvU.uUnuvNvvNU();
               var12 = var8.UnUNVVVNuv.uUnuvNvvNU();
            } else {
               var11 = C00OOC00oO(C00OOC00oO(var3, 0.5F), 0.0F, 1.0F) * this.NNUUNUuVNNVn;
               var12 = C00OOC00oO(C00OOC00oO(var4, 0.5F), 0.0F, 1.0F) * this.VvVvnNUnvuvV;
            }

            float var13 = var8 != null && !(var8.uVUuuVnNVU <= 0.0F) ? var8.uVUuuVnNVU : UuUVuuUu(var5);
            float var14 = var8 != null && !(var8.vuuuNvNuv <= 0.0F) ? var8.vuuuNvNuv : UuUVuuUu(var6);
            nNuUNVu.VUUnVnVNNU var15 = this.uUnuvNvvNU(var7, var13, var14, var9);
            nNuUNVu.NVnVnNnN var16 = this.uUnuvNvvNU(var7);
            var11 = this.UuUVuuUu(var11, var15.UuUVuuUu(), var16);
            var12 = this.C00OOC00oO(var12, var15.C00OOC00oO(), var16);
            this.UuUVuuUu(var7, var11, var12, var15.uUnuvNvvNU(), var15.uUnuvNvvNU(), true);
            if (var8 != null) {
               var8.VVuuUN = var15.UuUVuuUu();
               var8.vNUvnnVnUvu = var15.C00OOC00oO();
               var8.nUUVuvU.uUnuvNvvNU(var11);
               var8.UnUNVVVNuv.uUnuvNvvNU(var12);
            }

            return this.VVnVNnunVvu.get(var7);
         }

         this.unNNVVNnvvV.put(var7, var9);
         return new nNuUNVu.VUnuUnnuNvVu(C00OOC00oO(C00OOC00oO(var3, 0.5F), 0.0F, 1.0F), C00OOC00oO(C00OOC00oO(var4, 0.5F), 0.0F, 1.0F), var9, var9, true);
      } else {
         return null;
      }
   }

   public nNuUNVu.VUnuUnnuNvVu uUnuvNvvNU(String var1, float var2, float var3, float var4, float var5) {
      if (var1 != null && !var1.isBlank() && this.NNUUNUuVNNVn > 0 && this.VvVvnNUnvuvV > 0) {
         String var6 = var1.trim();
         nNuUNVu.VvunVVUvUNnv var7 = this.c0oOOCcCoC0.get(var6);
         if (var7 == null) {
            var7 = this.c0oOOCcCoC0.get(var1);
         }

         nNuUNVu.VUnuUnnuNvVu var8 = this.VVnVNnunVvu.get(var6);
         boolean var9 = var8 != null && var8.userResized() || this.unNNVVNnvvV.containsKey(var6);
         float var10 = this.UuUVuuUu(var6, var4, var5);
         this.unNNVVNnvvV.remove(var6);
         float var11 = var7 != null && !(var7.uVUuuVnNVU <= 0.0F) ? var7.uVUuuVnNVU : UuUVuuUu(var4);
         float var12 = var7 != null && !(var7.vuuuNvNuv <= 0.0F) ? var7.vuuuNvNuv : UuUVuuUu(var5);
         nNuUNVu.VUUnVnVNNU var13 = this.uUnuvNvvNU(var6, var11, var12, var10);
         nNuUNVu.NVnVnNnN var14 = this.uUnuvNvvNU(var6);
         float var15 = var14.padding();
         float var16 = var14.padding();
         float var17 = Math.max(var15, this.NNUUNUuVNNVn - var13.UuUVuuUu() - var14.padding());
         float var18 = Math.max(var16, this.VvVvnNUnvuvV - var13.C00OOC00oO() - var14.padding());
         float var19 = var15 + (var17 - var15) * C00OOC00oO(C00OOC00oO(var2, 0.5F), 0.0F, 1.0F);
         float var20 = var16 + (var18 - var16) * C00OOC00oO(C00OOC00oO(var3, 0.5F), 0.0F, 1.0F);
         this.UuUVuuUu(var6, var19, var20, var13.uUnuvNvvNU(), var13.uUnuvNvvNU(), var9 || Math.abs(var13.uUnuvNvvNU() - 1.0F) > 0.01F);
         if (var7 != null) {
            var7.VVuuUN = var13.UuUVuuUu();
            var7.vNUvnnVnUvu = var13.C00OOC00oO();
            var7.nUUVuvU.uUnuvNvvNU(var19);
            var7.UnUNVVVNuv.uUnuvNvvNU(var20);
         }

         return this.VVnVNnunVvu.get(var6);
      } else {
         return null;
      }
   }

   private float C00OOC00oO(String var1, float var2, float var3, float var4) {
      nNuUNVu.NVnVnNnN var5 = this.uUnuvNvvNU(var1);
      float var6 = UuUVuuUu(var2);
      float var7 = UuUVuuUu(var3);
      float var8 = this.NNUUNUuVNNVn > 1 ? Math.max(1.0F, this.NNUUNUuVNNVn * var5.maxWidthRatio() - var5.padding() * 2.0F) : var6 * var5.maxScale();
      float var9 = this.VvVvnNUnvuvV > 1 ? Math.max(1.0F, this.VvVvnNUnvuvV * var5.maxHeightRatio() - var5.padding() * 2.0F) : var7 * var5.maxScale();
      float var10 = Math.min(var5.maxScale(), Math.min(var8 / var6, var9 / var7));
      var10 = Math.max(0.08F, var10);
      float var11 = Math.min(var5.minScale(), var10);
      return C00OOC00oO(C00OOC00oO(var4, 1.0F), var11, var10);
   }

   private nNuUNVu.VUUnVnVNNU uUnuvNvvNU(String var1, float var2, float var3, float var4) {
      float var5 = UuUVuuUu(var2);
      float var6 = UuUVuuUu(var3);
      float var7 = this.C00OOC00oO(var1, var5, var6, var4);
      return this.nnuUVNUuvvVU.UuUVuuUu(var5 * var7, var6 * var7, var7);
   }

   private float UuUVuuUu(nNuUNVu.VUnuUnnuNvVu var1, boolean var2) {
      if (var2 && var1 != null) {
         float var3 = C00OOC00oO(var1.scaleX(), 1.0F);
         float var4 = C00OOC00oO(var1.scaleY(), 1.0F);
         return !(var3 <= 0.0F) && !(var4 <= 0.0F) && !(var3 > 12.0F) && !(var4 > 12.0F) ? (float)Math.sqrt(Math.max(1.0E-4F, var3 * var4)) : 1.0F;
      } else {
         return 1.0F;
      }
   }

   private float UuUVuuUu(float var1, float var2, nNuUNVu.NVnVnNnN var3) {
      if (this.NNUUNUuVNNVn <= 0) {
         return C00OOC00oO(var1, 0.0F);
      } else {
         float var4 = Math.max(0.0F, var3 == null ? 6.0F : var3.padding());
         float var5 = Math.min(var4, Math.max(0.0F, this.NNUUNUuVNNVn - 1.0F));
         float var6 = Math.max(var5, this.NNUUNUuVNNVn - Math.max(1.0F, var2) - var4);
         return C00OOC00oO(C00OOC00oO(var1, var5), var5, var6);
      }
   }

   private float C00OOC00oO(float var1, float var2, nNuUNVu.NVnVnNnN var3) {
      if (this.VvVvnNUnvuvV <= 0) {
         return C00OOC00oO(var1, 0.0F);
      } else {
         float var4 = Math.max(0.0F, var3 == null ? 6.0F : var3.padding());
         float var5 = Math.min(var4, Math.max(0.0F, this.VvVvnNUnvuvV - 1.0F));
         float var6 = Math.max(var5, this.VvVvnNUnvuvV - Math.max(1.0F, var2) - var4);
         return C00OOC00oO(C00OOC00oO(var1, var5), var5, var6);
      }
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return Float.isFinite(var0)
         && Float.isFinite(var1)
         && Float.isFinite(var2)
         && Float.isFinite(var3)
         && Float.isFinite(var4)
         && Float.isFinite(var5)
         && var4 > 0.0F
         && var5 > 0.0F
         && var0 >= var2
         && var0 <= var2 + var4
         && var1 >= var3
         && var1 <= var3 + var5;
   }

   private static float UuUVuuUu(float var0, float var1) {
      return Math.max(0.0F, Math.min(var0, var1));
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return var2 < var1 ? var1 : Math.max(var1, Math.min(var0, var2));
   }

   private static float UuUVuuUu(float var0) {
      return Float.isFinite(var0) && var0 > 1.0F ? var0 : 1.0F;
   }

   private static float C00OOC00oO(float var0, float var1) {
      return Float.isFinite(var0) ? var0 : var1;
   }

   public Map<String, nNuUNVu.VUnuUnnuNvVu> uNNnnnuuuN() {
      return this.VVnVNnunVvu;
   }

   public Map<String, Float> nuUnNvnuUu() {
      return this.unNNVVNnvvV;
   }

   public void UuUVuuUu(Map<String, nNuUNVu.VUnuUnnuNvVu> var1) {
      this.VVnVNnunVvu.clear();
      this.unNNVVNnvvV.clear();
      if (var1 != null) {
         this.VVnVNnunVvu.putAll(var1);
      }

      this.c0oOOCcCoC0.clear();
      this.ccOO0COcoco0 = null;
      this.nvuVvuNnNUnv = false;
   }

   public void C00OOC00oO(Map<String, Float> var1) {
      this.unNNVVNnvvV.clear();
      if (var1 != null) {
         for (Entry var3 : var1.entrySet()) {
            String var4 = (String)var3.getKey();
            Float var5 = (Float)var3.getValue();
            if (var4 != null && !var4.isBlank() && var5 != null && Float.isFinite(var5) && !(var5 <= 0.0F) && !this.VVnVNnunVvu.containsKey(var4)) {
               this.unNNVVNnvvV.put(var4.trim(), this.UuUVuuUu(var4, var5));
            }
         }
      }
   }

   public void C00OOC00oO(String var1) {
      if (var1 != null && !var1.isBlank()) {
         String var2 = var1.trim();
         this.VVnVNnunVvu.remove(var2);
         this.unNNVVNnvvV.remove(var2);
         nNuUNVu.VvunVVUvUNnv var3 = this.c0oOOCcCoC0.remove(var2);
         if (var3 == null) {
            var3 = this.c0oOOCcCoC0.remove(var1);
         }

         if (var2.equals(this.ccOO0COcoco0) || var1.equals(this.ccOO0COcoco0)) {
            this.ccOO0COcoco0 = null;
         }
      }
   }

   @Generated
   public float VVuuUN() {
      return this.uUVVvVVNvvn;
   }

   @Generated
   public float vNUvnnVnUvu() {
      return this.vvUVNVvvNUv;
   }

   @Generated
   public boolean uVUuuVnNVU() {
      return this.uUVvnUuNvvN;
   }

   @Generated
   public boolean vuuuNvNuv() {
      return this.UUuUnNVNuuv;
   }

   @Generated
   public String nvUVNnuu() {
      return this.ccOO0COcoco0;
   }

   record NVnVnNnN(float minScale, float maxScale, float maxWidthRatio, float maxHeightRatio, float padding) {
   }

   static final class VUUnVnVNNU {
      private float UuUVuuUu;
      private float C00OOC00oO;
      private float uUnuvNvvNU;

      nNuUNVu.VUUnVnVNNU UuUVuuUu(float var1, float var2, float var3) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         return this;
      }

      float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }
   }

   public record VUnuUnnuNvVu(float nx, float ny, float scaleX, float scaleY, boolean userResized) {
   }

   static final class VvunVVUvUNnv {
      boolean UuUVuuUu;
      boolean C00OOC00oO;
      boolean uUnuvNvvNU;
      boolean vVvUvVVuuNvV;
      float uNNnnnuuuN;
      float nuUnNvnuUu;
      float VVuuUN;
      float vNUvnnVnUvu;
      float uVUuuVnNVU;
      float vuuuNvNuv;
      final nNuUNVu.nvnNNunvv nvUVNnuu = new nNuUNVu.nvnNNunvv();
      final uNuuunuNvuN UuuNnUvUuv = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), nNuUNVu.uNNnnnuuuN, 1.0F, 0.0F, 1.0F, 0.001F, 0.001F);
      final uNuuunuNvuN nUUVuvU = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), nNuUNVu.vVvUvVVuuNvV, 0.0F, -9999.0F, 9999.0F, 0.1F, 0.1F);
      final uNuuunuNvuN UnUNVVVNuv = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), nNuUNVu.vVvUvVVuuNvV, 0.0F, -9999.0F, 9999.0F, 0.1F, 0.1F);
      final uNuuunuNvuN vNVuvnUUnuUn = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), nNuUNVu.nuUnNvnuUu, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
      final uNuuunuNvuN UvnvNVnnnnNU = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), nNuUNVu.VVuuUN, 0.0F, 0.0F, 1.0F, 0.01F, 0.01F);
   }

   public static final class nvUnvV {
      public String UuUVuuUu = "";
      public float C00OOC00oO;
      public float uUnuvNvvNU;
      public float vVvUvVVuuNvV;
      public float uNNnnnuuuN;
      public float nuUnNvnuUu;
      public float VVuuUN;

      public void UuUVuuUu(String var1, float var2, float var3, float var4, float var5, float var6, float var7) {
         this.UuUVuuUu = var1 == null ? "" : var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
      }

      void UuUVuuUu(nNuUNVu.nvUnvV var1) {
         if (var1 == null) {
            this.UuUVuuUu("", 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
         } else {
            this.UuUVuuUu(var1.UuUVuuUu, var1.C00OOC00oO, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV, var1.uNNnnnuuuN, var1.nuUnNvnuUu, var1.VVuuUN);
         }
      }
   }

   public static final class nvnNNunvv {
      public String UuUVuuUu;
      public float C00OOC00oO;
      public float uUnuvNvvNU;
      public float vVvUvVVuuNvV;
      public float uNNnnnuuuN;
      public float nuUnNvnuUu;
      public float VVuuUN;
      public boolean vNUvnnVnUvu;
      public boolean uVUuuVnNVU;
      public boolean vuuuNvNuv;
      public boolean nvUVNnuu;

      nvnNNunvv() {
      }

      nNuUNVu.nvnNNunvv UuUVuuUu(
         String var1, float var2, float var3, float var4, float var5, boolean var6, boolean var7, boolean var8, boolean var9, float var10, float var11
      ) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.vNUvnnVnUvu = var6;
         this.uVUuuVnNVU = var7;
         this.vuuuNvNuv = var8;
         this.nvUVNnuu = var9;
         this.nuUnNvnuUu = var10;
         this.VVuuUN = var11;
         return this;
      }
   }

   @vuUuvvvNnVV(
      UuUVuuUu = "GlobalHUD",
      C00OOC00oO = "w"
   )
   public static class uunvUUVnuNn extends vVvnUVnUvv {
      public final nNUuNvVn UuUVuuUu = new nNUuNvVn("Прозрачность", 1.0F, 0.1F, 1.0F, 0.05F, true);
      public final nNUuNvVn C00OOC00oO = new nNUuNvVn("Прозрачность тёмных элементов", 1.0F, 0.0F, 1.0F, 0.05F, true);
      public final UvNnUnuNUUU uUnuvNvvNU = new UvNnUnuNUUU("Стилистика", "Тёмный", "Тёмный", "Светлый", "Блюр", "Неоморфизм", "Феррофлюид", "Призма");
      public final nNUuNvVn vVvUvVVuuNvV = new nNUuNvVn("Нео дистанция", 5.5F, 2.0F, 18.0F, 0.5F, false)
         .UuUVuuUu(() -> !nnvNuuNvvuu.UuUVuuUu(this.uUnuvNvvNU.uUnuvNvvNU()));
      public final nNUuNvVn uNNnnnuuuN = new nNUuNvVn("Нео размытие", 18.0F, 6.0F, 48.0F, 1.0F, false)
         .UuUVuuUu(() -> !nnvNuuNvvuu.UuUVuuUu(this.uUnuvNvvNU.uUnuvNvvNU()));
      public final nNUuNvVn nuUnNvnuUu = new nNUuNvVn("Нео интенсивность", 0.72F, 0.1F, 1.0F, 0.05F, true)
         .UuUVuuUu(() -> !nnvNuuNvvuu.UuUVuuUu(this.uUnuvNvvNU.uUnuvNvvNU()));
      public final UvNnUnuNUUU VVuuUN = new UvNnUnuNUUU("Нео форма", "Выпуклая", "Плоская", "Выпуклая", "Вогнутая")
         .UuUVuuUu(() -> !nnvNuuNvvuu.UuUVuuUu(this.uUnuvNvvNU.uUnuvNvvNU()));
      public final VUVnvvnNN vNUvnnVnUvu = new VUVnvvnNN(
         "Визуал",
         new vvNnnUNnVvn("Тень", true),
         new vvNnnUNnVvn("Обводка", true),
         new vvNnnUNnVvn("Темные зоны", true),
         new vvNnnUNnVvn("Верхняя накладка", true),
         new vvNnnUNnVvn("Нижняя накладка", true),
         new vvNnnUNnVvn("Тёмный рект поверх", true)
      );

      public uunvUUVnuNn() {
         this.UuUVuuUu(this.UuUVuuUu);
         this.UuUVuuUu(this.C00OOC00oO);
         this.UuUVuuUu(this.uUnuvNvvNU);
         this.UuUVuuUu(this.vVvUvVVuuNvV);
         this.UuUVuuUu(this.uNNnnnuuuN);
         this.UuUVuuUu(this.nuUnNvnuUu);
         this.UuUVuuUu(this.VVuuUN);
         this.UuUVuuUu(this.vNUvnnVnUvu);
         uNvNvUNUnuu.UuUVuuUu(this);
      }
   }
}

package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_10868;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class OoCO0O0oc0c implements AutoCloseable {
   public static final int UuUVuuUu = 14;
   private static final String C00OOC00oO = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String[] uUnuvNvvNU = vVvUvVVuuNvV();
   private static final float vVvUvVVuuNvV = 12.0F;
   private static final float uNNnnnuuuN = 30.0F;
   private static final float nuUnNvnuUu = 0.22F;
   private static final float VVuuUN = 0.17F;
   private static final float vNUvnnVnUvu = 0.62F;
   private static final float uVUuuVnNVU = 3.0F;
   private static final float vuuuNvNuv = 0.005F;
   private static final float nvUVNnuu = -0.62F;
   private static final float UuuNnUvUuv = (float) (Math.PI * 2);
   private static final float nUUVuvU = 0.85F;
   private static final float UnUNVVVNuv = 0.3F;
   private static final float vNVuvnUUnuUn = 0.52F;
   private static final float UvnvNVnnnnNU = 0.004F;
   private static final float uVUVnuvnuVuv = 0.7139F;
   private static final float NVNnnvnuunNv = 24.0F;
   private static final float uVunuUNVVUUV = 0.6F;
   private static final float UNnVVNvvnVvU = 0.6F;
   private static final float uNnUnnuNUnNu = 1.0F;
   private static final float NnUuNNU = 0.42F;
   private static final float nNvNUVU = 7.0F;
   private static final float UnUNuUU = 2.4F;
   private static final float uUVuVvuNUvnu = 2.2F;
   private static final float UvUvUNuvNU = 0.8F;
   private static final float c0oOOCcCoC0 = 0.33F;
   private static final float VVnVNnunVvu = 38.0F;
   private static final float unNNVVNnvvV = 16.0F;
   private static final float NuunnvnN = 9.0F;
   private static final float NVUunUNUN = 3.0F;
   private static final float UUVNuUNUvUnV = 0.48F;
   private static final float vuvnUnVnUNnV = 3.4F;
   private static final float nnuUVNUuvvVU = 6.0F;
   private final uUvVUVnVNV nVVUuvuNnUN = new uUvVUVnVNV();
   private final VvuuVNVUn.NVnVnNnN nNnVnUNVV = new VvuuVNVUn.NVnVnNnN();
   private final VvuuVNVUn.NVnVnNnN nuunNvv = new VvuuVNVUn.NVnVnNnN();
   private final VvNNUnNNVn uUVVvVVNvvn = new VvNNUnNNVn();
   private final VvNNUnNNVn vvUVNVvvNUv = new VvNNUnNNVn();
   private final VvNNUnNNVn UuNnnVnuNNV = new VvNNUnNNVn();
   private final VvNNUnNNVn uUVvnUuNvvN = new VvNNUnNNVn();
   private final VvNNUnNNVn UUuUnNVNuuv = new VvNNUnNNVn();
   private final VvNNUnNNVn NVuNUuVnVUN = new VvNNUnNNVn();
   private final VvNNUnNNVn NVuunNnvvvVu = new VvNNUnNNVn();
   private final VvNNUnNNVn vNnNuuvVn = new VvNNUnNNVn();
   private final VvNNUnNNVn VUuuVUnun = new VvNNUnNNVn();
   private final VvNNUnNNVn vVVuuVVv = new VvNNUnNNVn();
   private final VvNNUnNNVn VuunNUUUvu = new VvNNUnNNVn();
   private final VvNNUnNNVn NNUUNUuVNNVn = new VvNNUnNNVn();
   private final VvNNUnNNVn VvVvnNUnvuvV = new VvNNUnNNVn();
   private final VvNNUnNNVn ccOO0COcoco0 = new VvNNUnNNVn();
   private uUvVUVnVNV.NVnVnNnN NUVvUUVuVNVv;
   private uUvVUVnVNV.NVnVnNnN nNuVunNUVu;
   private float[] UNvvunVVn = new float[8];
   private int UnvuVuVnNuvu;
   private int UvNNVUVNVuvV;
   private int NnunUUnU;
   private int nvuVvuNnNUnv;
   private float NnVnNVN;
   private float vnvvNvUnVv;
   private float OCOocoOoOO;
   private float o0Ooc0COOoc;
   private boolean nvvnUnUn;
   private uUvVUVnVNV.NVnVnNnN UnUUVuVunvVu;
   private uUvVUVnVNV.NVnVnNnN nnvuvUNuUnN;
   private uUvVUVnVNV.NVnVnNnN UVnuVUUVnnU;
   private uUvVUVnVNV.NVnVnNnN VunnVNvNV;
   private uUvVUVnVNV.NVnVnNnN NvUVUvVVnUu;
   private uUvVUVnVNV.NVnVnNnN unnUnUNVnN;
   private uUvVUVnVNV.NVnVnNnN NnuUnUNnu;
   private uUvVUVnVNV.NVnVnNnN UnnnvvU;
   private uUvVUVnVNV.NVnVnNnN VUUnuVvVu;
   private uUvVUVnVNV.NVnVnNnN VvVuvUvvNNVv;
   private float UnnNNvuvvUU;
   private float VNNnnVUuvv;
   private float vUvUvUNNuNvn = 1.0F;
   private float uuVuUuuVVNvN;
   private boolean VvuUUUNNNv;
   private uUvVUVnVNV.NVnVnNnN uuuVnuvnnNnU;
   private uUvVUVnVNV.NVnVnNnN nNunUnVN;
   private uUvVUVnVNV.NVnVnNnN VnVuuvVvnNv;
   private uUvVUVnVNV.NVnVnNnN vuvvuVuVv;
   private uUvVUVnVNV.NVnVnNnN uunNUuunVU;
   private uUvVUVnVNV.NVnVnNnN NvnuuuvnVV;
   private uUvVUVnVNV.NVnVnNnN NnUVNnuvUv;
   private uUvVUVnVNV.NVnVnNnN UuuuNNunN;
   private nnUnNnuvvN NNVNuUvVn;
   private int vuNnuUnu;
   private int uuvvuNvuUNVV;
   private int uVvunVUNuUvu;
   private int NVNnnvVnvV;
   private int vUNuuvvnVnv;
   private int unnnNUNnVu;
   private int NvnnUUuVvNU;
   private int vVvuUVnV;
   private float nvuUVvuuN;
   private float CC0COO;
   private float uNnNUNvuVnu;
   private float VnnnvUunNvuu;
   private float VuuUVVu;
   private float nUNnuUNnV;
   private float VuNVnvNNuNnn;
   private float uvVuuuvvVU;
   private int NNnvvunuVNUn;
   private int nVuuUnnUUVU;
   private float nUununvNvvn = -1.0F;
   private float NuvunVvnnN;
   private float vuvnnvuNVvu;
   private float NVvnvnn = 12.0F;
   private float vUvVUNnN;
   private float NUuVnnuUnvu;
   private float vnuNNVvVVuN;
   private float Oco0Oococc;
   private float uNUnUuUnvnnU;
   private float OoccOc0CO;
   private boolean UvuVvvVuUuuu;
   private boolean NUUVUvvuNNVU;
   private boolean VUNvNUuNVnn;
   private boolean UNNunNuUNVuU;
   private int NuUuUvUUvU = -1;
   private int VUVvNvvVUN = -1;

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.VUNvNUuNVnn) {
         return false;
      } else if (var1 != null && var1.vuuuNvNuv() > 0 && var1.nvUVNnuu() > 0) {
         long var2 = UuUVuuUu(class_310.method_1551(), var1.vuuuNvNuv(), var1.nvUVNnuu());
         if (var2 >= 0L && UuUVuuUu(var2) == var1.vuuuNvNuv() && C00OOC00oO(var2) == var1.nvUVNnuu()) {
            VvuuVNVUn.C00OOC00oO(this.nNnVnUNVV);
            boolean var4 = false;
            boolean var12 = false /* VF: Semaphore variable */;

            int var15;
            label142: {
               boolean var17;
               label141: {
                  label140: {
                     boolean var9;
                     label139: {
                        try {
                           var12 = true;
                           this.uUnuvNvvNU();
                           this.UuUVuuUu();
                           if (this.VUNvNUuNVnn) {
                              var15 = 0;
                              var12 = false;
                              break label142;
                           }

                           var15 = var1.vuuuNvNuv();
                           int var6 = var1.nvUVNnuu();
                           GL11.glDisable(3089);
                           GL11.glDisable(36281);
                           GL11.glColorMask(true, true, true, true);
                           this.uUVVvVVNvvn.C00OOC00oO(var15, var6);
                           if (!this.uUVVvVVNvvn.nuUnNvnuUu()) {
                              var17 = false;
                              var12 = false;
                              break label141;
                           }

                           this.uUnuvNvvNU(var1);
                           this.vVvUvVVuuNvV(var1);
                           if (this.UNNunNuUNVuU) {
                              var17 = false;
                              var12 = false;
                              break label140;
                           }

                           this.UvuVvvVuUuuu = this.C00OOC00oO(var15, var6);
                           GL11.glDisable(2929);
                           GL11.glDisable(2884);
                           if (this.UvuVvvVuUuuu) {
                              this.UuUVuuUu(this.vvUVNVvvNUv, this.vuNnuUnu, this.uuvvuNvuUNVV);
                              this.UuUVuuUu(var1, this.vuNnuUnu, this.uuvvuNvuUNVV);
                              this.UuUVuuUu(var1, this.vuNnuUnu, this.uuvvuNvuUNVV, var1.nNnVnUNVV());
                              this.C00OOC00oO();
                           }

                           var17 = this.vNUvnnVnUvu(var1) && this.uVUuuVnNVU(var1);
                           if (var17 && this.nvvnUnUn) {
                              this.UuUVuuUu(this.VnVuuvVvnNv, this.vNnNuuvVn, 1.0F, 1.0F, this.VUuuVUnun, this.NnunUUnU, this.nvuVvuNnNUnv);
                           }

                           GL30.glBindFramebuffer(36160, var1.UuuNnUvUuv());
                           int var8 = GL30.glCheckFramebufferStatus(36009);
                           if (var8 != 36053) {
                              VNNUVUuN.UuUVuuUu("MainMenuRenderer", null, "draw framebuffer incomplete status=0x" + Integer.toHexString(var8), null);
                              var9 = false;
                              var12 = false;
                              break label139;
                           }

                           GL11.glViewport(0, 0, var15, var6);
                           if (this.UvuVvvVuUuuu) {
                              this.UvnvNVnnnnNU(var1);
                           } else {
                              this.UuUVuuUu(var1, var15, var6);
                              this.UuUVuuUu(var1, var15, var6, 1.0F);
                           }

                           if (var17) {
                              this.vuuuNvNuv(var1);
                           }

                           this.nuUnNvnuUu(var1);
                           this.UnUNVVVNuv(var1);
                           this.vNVuvnUUnuUn(var1);
                           this.VVuuUN(var1);
                           this.nvUVNnuu(var1);
                           this.UuuNnUvUuv(var1);
                           var4 = true;
                           var12 = false;
                        } finally {
                           if (var12) {
                              this.uUnuvNvvNU(2, 0);
                              this.uUnuvNvvNU(1, 0);
                              this.UuUVuuUu(0);
                              GL20.glUseProgram(0);
                              VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
                           }
                        }

                        this.uUnuvNvvNU(2, 0);
                        this.uUnuvNvvNU(1, 0);
                        this.UuUVuuUu(0);
                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
                        return var4;
                     }

                     this.uUnuvNvvNU(2, 0);
                     this.uUnuvNvvNU(1, 0);
                     this.UuUVuuUu(0);
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
                     return var9;
                  }

                  this.uUnuvNvvNU(2, 0);
                  this.uUnuvNvvNU(1, 0);
                  this.UuUVuuUu(0);
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
                  return var17;
               }

               this.uUnuvNvvNU(2, 0);
               this.uUnuvNvvNU(1, 0);
               this.UuUVuuUu(0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
               return var17;
            }

            this.uUnuvNvvNU(2, 0);
            this.uUnuvNvvNU(1, 0);
            this.UuUVuuUu(0);
            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(this.nNnVnUNVV);
            return (boolean)var15;
         } else {
            VNNUVUuN.UuUVuuUu("MainMenuRenderer", null, "frame metrics mismatch requested=" + var1.vuuuNvNuv() + "x" + var1.nvUVNnuu(), null);
            return false;
         }
      } else {
         VNNUVUuN.UuUVuuUu("MainMenuRenderer", null, "invalid state dimensions", null);
         return false;
      }
   }

   private void uUnuvNvvNU(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      int var2 = var1.vuuuNvNuv();
      int var3 = var1.nvUVNnuu();
      float var4 = Math.max(0.35F, Math.min(1.0F, var1.nNnVnUNVV()));
      this.vuNnuUnu = Math.max(2, Math.min(var2, Math.round(var2 * var4)));
      this.uuvvuNvuUNVV = Math.max(2, Math.min(var3, Math.round(var3 * var4)));
      int var5 = Math.max(2, var2 / 2);
      int var6 = Math.max(2, var3 / 2);
      int var7 = Math.max(2, var2 / 4);
      int var8 = Math.max(2, var3 / 4);
      this.vUNuuvvnVnv = Math.max(2, Math.min(var5, Math.round(this.vuNnuUnu * 0.5F)));
      this.unnnNUNnVu = Math.max(2, Math.min(var6, Math.round(this.uuvvuNvuUNVV * 0.5F)));
      this.NvnnUUuVvNU = Math.max(2, Math.min(var7, Math.round(this.vuNnuUnu * 0.25F)));
      this.vVvuUVnV = Math.max(2, Math.min(var8, Math.round(this.uuvvuNvuUNVV * 0.25F)));
      this.nvuUVvuuN = (float)this.vuNnuUnu / var2;
      this.CC0COO = (float)this.uuvvuNvuUNVV / var3;
      boolean var9 = var1.NVuunNnvvvVu() || var1.UUuUnNVNuuv() || var1.NVuNUuVnVUN();
      float var10 = Math.max(0.42F, Math.min(1.0F, var4 * (var9 ? 1.0F : 0.6F)));
      this.uVvunVUNuUvu = Math.max(2, Math.min(var2, Math.round(var2 * var10)));
      this.NVNnnvVnvV = Math.max(2, Math.min(var3, Math.round(var3 * var10)));
      this.uNnNUNvuVnu = (float)this.uVvunVUNuUvu / var2;
      this.VnnnvUunNvuu = (float)this.NVNnnvVnvV / var3;
      this.VuuUVVu = (float)this.vUNuuvvnVnv / var5;
      this.nUNnuUNnV = (float)this.unnnNUNnVu / var6;
      this.VuNVnvNNuNnn = (float)this.NvnnUUuVvNU / var7;
      this.uvVuuuvvVU = (float)this.vVvuUVnV / var8;
   }

   private void UuUVuuUu(VvNNUnNNVn var1, int var2, int var3) {
      var1.UuUVuuUu();
      GL11.glViewport(0, 0, var2, var3);
   }

   private void vVvUvVVuuNvV(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      uUvVUVnVNV.NVnVnNnN var2 = this.uVUVnuvnuVuv(var1);
      if (var2 == null) {
         this.UNNunNuUNVuU = true;
      } else {
         this.UNNunNuUNVuU = false;
         this.UuUVuuUu(this.uUVVvVVNvvn, this.uVvunVUNuUvu, this.NVNnnvVnvV);
         GL11.glDisable(3042);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         if (var1.UUuUnNVNuuv() || var1.NVuNUuVnVUN() || var1.NVuunNnvvvVu()) {
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
         }

         var2.UuUVuuUu();
         this.UuUVuuUu(var2, this.uVvunVUNuUvu, this.NVNnnvVnvV, 0.0F, 0.0F, this.uVvunVUNuUvu, this.NVNnnvVnvV);
         var2.UuUVuuUu("uTime", var1.UnUNVVVNuv());
         var2.UuUVuuUu("uResolution", this.uVvunVUNuUvu, this.NVNnnvVnvV);
         var2.UuUVuuUu("uMouse", var1.uVUVnuvnuVuv(), var1.NVNnnvnuunNv());
         var2.UuUVuuUu("uMouseVelocity", var1.uVunuUNVVUUV(), var1.UNnVVNvvnVvU());
         var2.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
         var2.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
         var2.UuUVuuUu("uActivity", var1.nVVUuvuNnUN());
         var2.UuUVuuUu("uDetail", var1.nuunNvv());
         var2.UuUVuuUu("uAlpha", 1.0F);
         var2.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.UuUVuuUu(var2, var1);
         this.NNVNuUvVn.UuUVuuUu();
         GL11.glDisable(3042);
      }
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, int var2, int var3) {
      if (this.NvUVUvVVnUu != null) {
         GL11.glDisable(3042);
         this.NvUVUvVVnUu.UuUVuuUu();
         this.UuUVuuUu(this.NvUVUvVVnUu, var2, var3, 0.0F, 0.0F, var2, var3);
         this.NvUVUvVVnUu.UuUVuuUu("uTexture", 0);
         this.NvUVUvVVnUu.UuUVuuUu("uTextureSize", this.uUVVvVVNvvn.vVvUvVVuuNvV(), this.uUVVvVVNvvn.uNNnnnuuuN());
         this.NvUVUvVVnUu.UuUVuuUu("uSourceScale", this.uNnNUNvuVnu, this.VnnnvUunNvuu);
         this.NvUVUvVVnUu.UuUVuuUu("uParallax", var1.unNNVVNnvvV(), var1.NuunnvnN());
         this.NvUVUvVVnUu.UuUVuuUu("uTime", var1.UnUNVVVNuv());
         this.NvUVUvVVnUu.UuUVuuUu("uEntry", var1.vvUVNVvvNUv());
         this.NvUVUvVVnUu.UuUVuuUu("uClickFlash", var1.UuNnnVnuNNV());
         this.NvUVUvVVnUu.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.NvUVUvVVnUu.UuUVuuUu("uSakura", var1.UUuUnNVNuuv() ? 1.0F : 0.0F);
         this.NvUVUvVVnUu.UuUVuuUu("uVernal", var1.NVuNUuVnVUN() ? 1.0F : 0.0F);
         this.NvUVUvVVnUu.UuUVuuUu("uHour", var1.VVuuUN());
         this.UuUVuuUu(this.uUVVvVVNvvn.uUnuvNvvNU());
         this.NNVNuUvVn.UuUVuuUu();
      }
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, int var2, int var3, float var4) {
      float var5 = var1.uUVVvVVNvvn();
      if (this.unnUnUNVnN != null && !(var5 <= 0.002F)) {
         GL11.glEnable(3042);
         if (var1.vNnNuuvVn()) {
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
         } else {
            GL14.glBlendFuncSeparate(770, 1, 1, 1);
         }

         this.unnUnUNVnN.UuUVuuUu();
         this.UuUVuuUu(this.unnUnUNVnN, var2, var3, 0.0F, 0.0F, var2, var3);
         this.unnUnUNVnN.UuUVuuUu("uTime", var1.UnUNVVVNuv());
         this.unnUnUNVnN.UuUVuuUu("uResolution", var2, var3);
         this.unnUnUNVnN.UuUVuuUu("uMouse", var1.uVUVnuvnuVuv(), var1.NVNnnvnuunNv());
         this.unnUnUNVnN.UuUVuuUu("uParallax", var1.NVUunUNUN() * var4, var1.UUVNuUNUvUnV() * var4);
         this.unnUnUNVnN.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
         this.unnUnUNVnN.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
         this.unnUnUNVnN.UuUVuuUu("uEntry", var1.vvUVNVvvNUv() * var5);
         this.unnUnUNVnN.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.UuUVuuUu(this.unnUnUNVnN, var1);
         this.NNVNuUvVn.UuUVuuUu();
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      }
   }

   private boolean uNNnnnuuuN(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.NvnuuuvnVV != null && this.NnUVNnuvUv != null) {
         float var2 = VvVVnnNNNuV.UuUVuuUu(var1.nvUVNnuu());
         if (this.nUununvNvvn == var2 && this.NVuNUuVnVUN.nuUnNvnuUu()) {
            return true;
         } else {
            VuuUvnvnuu var3 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV);
            VuuUvnvnuu var4 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu);
            VuuUvnvnuu var5 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu);
            if (var3 != null && var4 != null) {
               float var6 = Math.min(30.0F, Math.max(12.0F, var2 * 0.22F));
               float var7 = var6 + 4.0F;
               int var8 = Math.round(var6 + var2 * 0.62F) + 12;
               float var9 = VvVVnnNNNuV.UuUVuuUu(var2) * 0.5F;
               float var10 = VvVVnnNNNuV.uUnuvNvvNU(var2) * 0.5F;
               float var11 = VvVVnnNNNuV.UuUVuuUu(var2) * 0.83F * 0.5F;
               float var12 = VvVVnnNNNuV.C00OOC00oO(var2);
               float var13 = VvVVnnNNNuV.UuUVuuUu(var3, var9);
               float var14 = var4.UuUVuuUu("Made with soul by Aleksei Ezhov & fr1zy1337", var10);
               float var15 = var5 == null ? 0.0F : var5.UuUVuuUu("w", var11);
               float var16 = var15 > 0.0F ? var2 * 0.3F : 0.0F;
               float var17 = var15 + var16 + var13;
               float var18 = var2 * 1.1F;
               float var19 = var2 * 0.98F;
               float var20 = var19 + var10 * 0.9F;
               int var21 = (int)Math.ceil(Math.max(var17, var14));
               int var22 = var21 + var8 * 2;
               int var23 = (int)Math.ceil(var18 + var20) + var8 * 2;
               if (var22 > 2 && var23 > 2) {
                  float var24 = var8 + var21 * 0.5F;
                  float var25 = var8 + var18;
                  float var26 = var24 - var17 * 0.5F;
                  float var27 = var26 + var15 + var16;
                  float var28 = var24 - var14 * 0.5F;
                  this.NVuNUuVnVUN.UuUVuuUu(var22, var23);
                  if (!this.NVuNUuVnVUN.nuUnNvnuUu()) {
                     return false;
                  } else {
                     this.NVuNUuVnVUN.UuUVuuUu();
                     GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
                     GL11.glClear(16384);
                     GL11.glEnable(3042);
                     GL14.glBlendFuncSeparate(1, 1, 1, 1);
                     GL20.glBlendEquation(32776);
                     this.NvnuuuvnVV.UuUVuuUu();
                     this.NvnuuuvnVV.UuUVuuUu("uAtlas", 0);
                     this.NvnuuuvnVV.UuUVuuUu("uMaskRange", var6);
                     GL11.glColorMask(true, false, false, false);
                     if (var5 != null) {
                        float var29 = (var5.C00OOC00oO("w", var11) + var5.uUnuvNvvNU("w", var11)) * 0.5F;
                        float var30 = var25 - var12 * 0.5F + var29 + var2 * 0.0188F;
                        this.UuUVuuUu(var5, "w", var11, var26, var30, var22, var23, var7);
                     }

                     this.UuUVuuUu(var3, "WILD", var9, 0.08F * var9, var27, var25, var22, var23, var7);
                     GL11.glColorMask(false, true, false, false);
                     this.UuUVuuUu(var4, "Made with soul by Aleksei Ezhov & fr1zy1337", var10, var28, var25 + var19, var22, var23, var7);
                     GL11.glColorMask(true, true, true, true);
                     GL20.glBlendEquation(32774);
                     GL11.glDisable(3042);
                     this.NNnvvunuVNUn = var22;
                     this.nVuuUnnUUVU = var23;
                     this.vnuNNVvVVuN = var28;
                     this.Oco0Oococc = var25 + var19 - var10 * 0.78F;
                     this.uNUnUuUnvnnU = var14;
                     this.OoccOc0CO = var10 * 1.02F;
                     if (!this.UuUVuuUu(var22, var23, var6, var2)) {
                        return false;
                     } else {
                        this.nUununvNvvn = var2;
                        this.NuvunVvnnN = var12;
                        this.NVvnvnn = var6;
                        this.vuvnnvuNVvu = var25;
                        this.vUvVUNnN = -var24;
                        this.NUuVnnuUnvu = -var25;
                        return true;
                     }
                  }
               } else {
                  return false;
               }
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(VuuUvnvnuu var1, String var2, float var3, float var4, float var5, float var6, int var7, int var8, float var9) {
      for (int var10 = 0; var10 < var2.length(); var10++) {
         String var11 = var2.substring(var10, var10 + 1);
         float var12 = var1.UuUVuuUu(var2.substring(0, var10), var3) + var4 * var10;
         this.UuUVuuUu(var1, var11, var3, var5 + var12, var6, var7, var8, var9);
      }
   }

   private boolean UuUVuuUu(int var1, int var2, float var3, float var4) {
      if (this.UuuuNNunN == null) {
         return false;
      } else {
         this.NVuunNnvvvVu.UuUVuuUu(var1, var2);
         if (!this.NVuunNnvvvVu.nuUnNvnuUu()) {
            return false;
         } else {
            this.NVuunNnvvvVu.UuUVuuUu();
            GL11.glViewport(0, 0, var1, var2);
            GL11.glDisable(3042);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 1.0F);
            GL11.glClear(16384);
            this.UuuuNNunN.UuUVuuUu();
            this.UuUVuuUu(this.UuuuNNunN, var1, var2, 0.0F, 0.0F, var1, var2);
            this.UuuuNNunN.UuUVuuUu("uMask", 0);
            this.UuuuNNunN.UuUVuuUu("uMaskSize", var1, var2);
            this.UuuuNNunN.UuUVuuUu("uMaskRange", var3);
            this.UuuuNNunN.UuUVuuUu("uTightRadius", Math.max(3.0F, var4 * 0.17F));
            this.UuuuNNunN.UuUVuuUu("uWideRadius", Math.max(8.0F, var4 * 0.62F));
            this.UuUVuuUu(this.NVuNUuVnVUN.uUnuvNvvNU());
            this.NNVNuUvVn.UuUVuuUu();
            return true;
         }
      }
   }

   private void UuUVuuUu(VuuUvnvnuu var1, String var2, float var3, float var4, float var5, int var6, int var7, float var8) {
      int var9 = var1.UuUVuuUu();

      for (VuuUvnvnuu.NVnVnNnN var11 : var1.UuUVuuUu(var2, var3, var4, var5)) {
         float var12 = var11.uUnuvNvvNU - var11.UuUVuuUu + var8 * 2.0F;
         float var13 = var11.vVvUvVVuuNvV - var11.C00OOC00oO + var8 * 2.0F;
         this.UuUVuuUu(this.NvnuuuvnVV, var6, var7, var11.UuUVuuUu - var8, var11.C00OOC00oO - var8, var12, var13);
         this.NvnuuuvnVV.UuUVuuUu("uGlyphUv", var11.uNNnnnuuuN, var11.nuUnNvnuUu, var11.VVuuUN, var11.vNUvnnVnUvu);
         this.NvnuuuvnVV.UuUVuuUu("uQuadSize", var12, var13);
         this.NvnuuuvnVV.UuUVuuUu("uPadPx", var8);
         this.NvnuuuvnVV.UuUVuuUu("uRangePx", var11.uVUuuVnNVU);
         this.UuUVuuUu(var9);
         this.NNVNuUvVn.UuUVuuUu();
      }
   }

   private void nuUnNvnuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      VvVVnnNNNuV.VUnuUnnuNvVu var2 = var1.vNUvnnVnUvu();
      if (!(var2.uUnuvNvvNU() <= 0.0F) && !(var2.vVvUvVVuuNvV() <= 0.0F)) {
         if (this.uNNnnnuuuN(var1) && this.NVuNUuVnVUN.nuUnNvnuUu() && this.NVuunNnvvvVu.nuUnNvnuUu()) {
            float var3 = this.nUununvNvvn;
            float var4 = var2.UuUVuuUu() + var2.uUnuvNvvNU() * 0.5F;
            float var5 = var2.C00OOC00oO() + var2.vVvUvVVuuNvV() * 0.5F;
            float var6 = var5 + this.NuvunVvnnN * 0.5F;
            float var7 = var4 + this.vUvVUNnN;
            float var8 = var6 + this.NUuVnnuUnvu;
            float var9 = 1.0F + 0.005F * (0.5F - 0.5F * (float)Math.cos(var1.nUUVuvU() * (float) (Math.PI * 2.0 / 3.0)));
            float var10 = var4 + var1.vuvnUnVnUNnV() * -0.62F;
            float var11 = var5 + var1.nnuUVNUuvvVU() * -0.62F;
            float var12 = var10 + (var7 - var4) * var9;
            float var13 = var11 + (var8 - var5) * var9;
            float var14 = this.NNnvvunuVNUn * var9;
            float var15 = this.nVuuUnnUUVU * var9;
            GL30.glBindFramebuffer(36160, var1.UuuNnUvUuv());
            GL11.glViewport(0, 0, var1.vuuuNvNuv(), var1.nvUVNnuu());
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            VvNNUnNNVn var16 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
            VvNNUnNNVn var17 = this.UvuVvvVuUuuu && this.vvUVNVvvNUv.nuUnNvnuUu() ? this.vvUVNVvvNUv : this.uUVVvVVNvvn;
            this.NnUVNnuvUv.UuUVuuUu();
            this.UuUVuuUu(this.NnUVNnuvUv, var1.vuuuNvNuv(), var1.nvUVNnuu(), var12, var13, var14, var15);
            this.NnUVNnuvUv.UuUVuuUu("uMask", 0);
            this.NnUVNnuvUv.UuUVuuUu("uBlur", 1);
            this.NnUVNnuvUv.UuUVuuUu("uSharp", 2);
            this.NnUVNnuvUv.UuUVuuUu("uShadow", 3);
            this.NnUVNnuvUv.UuUVuuUu("uMaskSize", this.NNnvvunuVNUn, this.nVuuUnnUUVU);
            this.NnUVNnuvUv.UuUVuuUu("uBlurSize", var16.vVvUvVVuuNvV(), var16.uNNnnnuuuN());
            this.NnUVNnuvUv.UuUVuuUu("uSharpSize", var17.vVvUvVVuuNvV(), var17.uNNnnnuuuN());
            this.NnUVNnuvUv
               .UuUVuuUu(
                  "uSourceScale", var16 == this.UUuUnNVNuuv ? this.VuuUVVu : this.uNnNUNvuVnu, var16 == this.UUuUnNVNuuv ? this.nUNnuUNnV : this.VnnnvUunNvuu
               );
            this.NnUVNnuvUv
               .UuUVuuUu(
                  "uSharpScale", var17 == this.vvUVNVvvNUv ? this.nvuUVvuuN : this.uNnNUNvuVnu, var17 == this.vvUVNVvvNUv ? this.CC0COO : this.VnnnvUunNvuu
               );
            this.NnUVNnuvUv.UuUVuuUu("uMaskRange", this.NVvnvnn);
            this.NnUVNnuvUv.UuUVuuUu("uPointer", (var1.vNVuvnUUnuUn() - var12) / var9, (var1.UvnvNVnnnnNU() - var13) / var9);
            this.NnUVNnuvUv.UuUVuuUu("uLockupMetrics", var3, this.vuvnnvuNVvu);
            this.NnUVNnuvUv.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
            this.NnUVNnuvUv.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
            this.NnUVNnuvUv.UuUVuuUu("uTime", var1.nUUVuvU());
            this.NnUVNnuvUv.UuUVuuUu("uEntry", var1.vvUVNVvvNUv());
            this.NnUVNnuvUv.UuUVuuUu("uPointerActive", var1.NnUuNNU());
            this.NnUVNnuvUv.UuUVuuUu("uSignature", var1.uUVvnUuNvvN());
            this.NnUVNnuvUv.UuUVuuUu("uSignatureLead", var1.nuUnNvnuUu());
            this.NnUVNnuvUv.UuUVuuUu("uInkRect", this.vnuNNVvVVuN, this.Oco0Oococc, this.uNUnUuUnvnnU, this.OoccOc0CO);
            this.NnUVNnuvUv.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
            this.uUnuvNvvNU(3, this.NVuunNnvvvVu.uUnuvNvvNU());
            this.uUnuvNvvNU(1, var16.uUnuvNvvNU());
            this.uUnuvNvvNU(2, var17.uUnuvNvvNU());
            this.UuUVuuUu(this.NVuNUuVnVUN.uUnuvNvvNU());
            this.NNVNuUvVn.UuUVuuUu();
            this.uUnuvNvvNU(3, 0);
            this.uUnuvNvvNU(2, 0);
         }
      }
   }

   private void VVuuUN(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.NnuUnUNnu != null) {
         boolean var2 = this.UvuVvvVuUuuu && this.vvUVNVvvNUv.nuUnNvnuUu();
         VvNNUnNNVn var3 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
         VvNNUnNNVn var4 = var2 ? this.vvUVNVvvNUv : this.uUVVvVVNvvn;
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.NnuUnUNnu.UuUVuuUu();
         this.NnuUnUNnu.UuUVuuUu("uBackground", 0);
         this.NnuUnUNnu.UuUVuuUu("uSharp", 1);
         this.NnuUnUNnu.UuUVuuUu("uBackdrop", var2 ? 1.0F : 0.0F);
         this.NnuUnUNnu.UuUVuuUu("uTextureSize", var3.vVvUvVVuuNvV(), var3.uNNnnnuuuN());
         this.NnuUnUNnu.UuUVuuUu("uSharpSize", var4.vVvUvVVuuNvV(), var4.uNNnnnuuuN());
         this.NnuUnUNnu
            .UuUVuuUu("uSourceScale", var3 == this.UUuUnNVNuuv ? this.VuuUVVu : this.uNnNUNvuVnu, var3 == this.UUuUnNVNuuv ? this.nUNnuUNnV : this.VnnnvUunNvuu);
         this.NnuUnUNnu
            .UuUVuuUu("uSharpScale", var4 == this.vvUVNVvvNUv ? this.nvuUVvuuN : this.uNnNUNvuVnu, var4 == this.vvUVNVvvNUv ? this.CC0COO : this.VnnnvUunNvuu);
         this.NnuUnUNnu.UuUVuuUu("uTime", var1.nUUVuvU());
         this.NnuUnUNnu.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
         this.NnuUnUNnu.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
         this.NnuUnUNnu.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.uUnuvNvvNU(1, var4.uUnuvNvvNU());
         this.UuUVuuUu(var3.uUnuvNvvNU());

         for (int var5 = 0; var5 < var1.UuUVuuUu(); var5++) {
            VvVVnnNNNuV.nvnNNunvv var6 = var1.UuUVuuUu(var5);
            float var7 = var6.uVUVnuvnuVuv();
            float var8 = var6.VVuuUN() - var7;
            float var9 = var6.vNUvnnVnUvu() - var7;
            float var10 = var6.uVUuuVnNVU() + var7 * 2.0F;
            float var11 = var6.vuuuNvNuv() + var7 * 2.0F;
            this.UuUVuuUu(this.NnuUnUNnu, var1.vuuuNvNuv(), var1.nvUVNnuu(), var8, var9, var10, var11);
            this.NnuUnUNnu.UuUVuuUu("uButton", var7, var7, var6.uVUuuVnNVU(), var6.vuuuNvNuv());
            float var12 = Math.max(var6.NVNnnvnuunNv(), 0.001F);
            this.NnuUnUNnu.UuUVuuUu("uLocalMouse", var6.uVunuUNVVUUV(), var6.UNnVVNvvnVvU());
            this.NnuUnUNnu.UuUVuuUu("uPointerLocal", var6.vVvUvVVuuNvV() * var6.uVUuuVnNVU() / var12, var6.uNNnnnuuuN() * var6.vuuuNvNuv() / var12);
            this.NnuUnUNnu.UuUVuuUu("uPointerValid", var6.uUnuvNvvNU() ? 1.0F : 0.0F);
            this.NnuUnUNnu.UuUVuuUu("uRadius", var6.nvUVNnuu());
            this.NnuUnUNnu.UuUVuuUu("uHover", var6.UuuNnUvUuv());
            this.NnuUnUNnu.UuUVuuUu("uMagnet", var6.nUUVuvU());
            this.NnuUnUNnu.UuUVuuUu("uPress", var6.UnUNVVVNuv());
            this.NnuUnUNnu.UuUVuuUu("uEntry", var6.vNVuvnUUnuUn());
            this.NnuUnUNnu.UuUVuuUu("uFlash", var6.UvnvNVnnnnNU());
            this.NnuUnUNnu.UuUVuuUu("uWave", var6.C00OOC00oO());
            this.NnuUnUNnu.UuUVuuUu("uScale", var6.NVNnnvnuunNv());
            this.NnuUnUNnu.UuUVuuUu("uSeed", var5 * 0.7139F);
            this.NNVNuUvVn.UuUVuuUu();
         }
      }
   }

   private boolean vNUvnnVnUvu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.NUVvUUVuVNVv != null && this.nNuVunNUVu != null && this.NNVNuUvVn != null) {
         int var2 = var1.vuuuNvNuv();
         int var3 = var1.nvUVNnuu();
         this.vNnNuuvVn.C00OOC00oO(Math.max(2, var2 / 2), Math.max(2, var3 / 2));
         if (!this.vNnNuuvVn.nuUnNvnuUu()) {
            this.nvvnUnUn = false;
            return false;
         } else {
            this.UnvuVuVnNuvu = this.vNnNuuvVn.vVvUvVVuuNvV();
            this.UvNNVUVNVuvV = this.vNnNuuvVn.uNNnnnuuuN();
            if (this.VnVuuvVvnNv != null && var1.nNnVnUNVV() >= 0.6F) {
               this.VUuuVUnun.C00OOC00oO(Math.max(2, var2 / 4), Math.max(2, var3 / 4));
               this.NnunUUnU = this.VUuuVUnun.vVvUvVVuuNvV();
               this.nvuVvuNnNUnv = this.VUuuVUnun.uNNnnnuuuN();
               this.nvvnUnUn = this.VUuuVUnun.nuUnNvnuUu();
            } else {
               this.nvvnUnUn = false;
            }

            return true;
         }
      } else {
         this.nvvnUnUn = false;
         return false;
      }
   }

   private boolean uVUuuVnNVU(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      int var2 = var1.UuUVuuUu();
      if (var2 <= 0) {
         return false;
      } else {
         if (this.UNvvunVVn.length < var2) {
            this.UNvvunVVn = new float[Math.max(var2, this.UNvvunVVn.length * 2)];
         }

         int var3 = 0;
         float var4 = Float.MAX_VALUE;
         float var5 = Float.MAX_VALUE;
         float var6 = -Float.MAX_VALUE;
         float var7 = -Float.MAX_VALUE;

         for (int var8 = 0; var8 < var2; var8++) {
            VvVVnnNNNuV.nvnNNunvv var9 = var1.UuUVuuUu(var8);
            float var10 = Math.max(C00OOC00oO(var9.UuuNnUvUuv(), 0.0F, 1.0F), C00OOC00oO(var9.nUUVuvU(), 0.0F, 1.0F) * 0.85F);
            float var11 = C00OOC00oO(var9.vNVuvnUUnuUn(), 0.0F, 1.0F);
            float var12 = UuUVuuUu(0.3F, 1.0F, var10) * var11;
            var12 = Math.max(var12, C00OOC00oO(var9.UuUVuuUu(), 0.0F, 1.0F) * 0.52F * var11);
            var12 = Math.max(var12, C00OOC00oO(var9.UvnvNVnnnnNU(), 0.0F, 1.0F));
            if (var12 <= 0.004F) {
               this.UNvvunVVn[var8] = 0.0F;
            } else {
               this.UNvvunVVn[var8] = var12;
               var3++;
               float var13 = var9.uVUVnuvnuVuv();
               var4 = Math.min(var4, var9.VVuuUN() - var13);
               var5 = Math.min(var5, var9.vNUvnnVnUvu() - var13);
               var6 = Math.max(var6, var9.VVuuUN() + var9.uVUuuVnNVU() + var13);
               var7 = Math.max(var7, var9.vNUvnnVnUvu() + var9.vuuuNvNuv() + var13);
            }
         }

         if (var3 == 0) {
            return false;
         } else {
            float var16 = var1.vuuuNvNuv();
            float var17 = var1.nvUVNnuu();
            this.NnVnNVN = Math.max(0.0F, var4 - 24.0F);
            this.vnvvNvUnVv = Math.max(0.0F, var5 - 24.0F);
            this.OCOocoOoOO = Math.min(var16, var6 + 24.0F) - this.NnVnNVN;
            this.o0Ooc0COOoc = Math.min(var17, var7 + 24.0F) - this.vnvvNvUnVv;
            if (!(this.OCOocoOoOO <= 1.0F) && !(this.o0Ooc0COOoc <= 1.0F)) {
               float var18 = this.UnvuVuVnNuvu / Math.max(1.0F, var16);
               float var19 = this.UvNNVUVNVuvV / Math.max(1.0F, var17);
               this.UuUVuuUu(this.vNnNuuvVn, this.UnvuVuVnNuvu, this.UvNNVUVNVuvV);
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               GL11.glClear(16384);
               GL11.glEnable(3042);
               GL20.glBlendEquationSeparate(32774, 32776);
               GL14.glBlendFuncSeparate(1, 1, 1, 1);
               this.NUVvUUVuVNVv.UuUVuuUu();
               this.NUVvUUVuVNVv.UuUVuuUu("uTime", var1.nUUVuvU());
               this.NUVvUUVuVNVv.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
               this.NUVvUUVuVNVv.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
               this.NUVvUUVuVNVv.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);

               for (int var22 = 0; var22 < var2; var22++) {
                  float var23 = this.UNvvunVVn[var22];
                  if (!(var23 <= 0.0F)) {
                     VvVVnnNNNuV.nvnNNunvv var14 = var1.UuUVuuUu(var22);
                     float var15 = var14.uVUVnuvnuVuv();
                     this.UuUVuuUu(
                        this.NUVvUUVuVNVv,
                        this.UnvuVuVnNuvu,
                        this.UvNNVUVNVuvV,
                        (var14.VVuuUN() - var15) * var18,
                        (var14.vNUvnnVnUvu() - var15) * var19,
                        (var14.uVUuuVnNVU() + var15 * 2.0F) * var18,
                        (var14.vuuuNvNuv() + var15 * 2.0F) * var19
                     );
                     this.NUVvUUVuVNVv.UuUVuuUu("uButton", var15 * var18, var15 * var19, var14.uVUuuVnNVU() * var18, var14.vuuuNvNuv() * var19);
                     this.NUVvUUVuVNVv.UuUVuuUu("uRadius", var14.nvUVNnuu() * var18);
                     this.NUVvUUVuVNVv.UuUVuuUu("uScale", var14.NVNnnvnuunNv());
                     this.NUVvUUVuVNVv.UuUVuuUu("uDrive", var23);
                     this.NUVvUUVuVNVv.UuUVuuUu("uPress", var14.UnUNVVVNuv());
                     this.NUVvUUVuVNVv.UuUVuuUu("uFlash", var14.UvnvNVnnnnNU());
                     this.NUVvUUVuVNVv
                        .UuUVuuUu(
                           "uPointerLocal",
                           var14.vVvUvVVuuNvV() * var14.uVUuuVnNVU() * var18 / Math.max(var14.NVNnnvnuunNv(), 0.001F),
                           var14.uNNnnnuuuN() * var14.vuuuNvNuv() * var19 / Math.max(var14.NVNnnvnuunNv(), 0.001F)
                        );
                     this.NUVvUUVuVNVv.UuUVuuUu("uPointerValid", var14.uUnuvNvvNU() ? 1.0F : 0.0F);
                     this.NUVvUUVuVNVv.UuUVuuUu("uLocalMouse", var14.uVunuUNVVUUV(), var14.UNnVVNvvnVvU());
                     this.NUVvUUVuVNVv.UuUVuuUu("uSteady", C00OOC00oO(var14.UuUVuuUu(), 0.0F, 1.0F) * (1.0F - C00OOC00oO(var14.UuuNnUvUuv(), 0.0F, 1.0F)));
                     this.NUVvUUVuVNVv.UuUVuuUu("uSeed", var22 * 0.7139F);
                     this.NNVNuUvVn.UuUVuuUu();
                  }
               }

               GL20.glBlendEquationSeparate(32774, 32774);
               GL11.glDisable(3042);
               return true;
            } else {
               return false;
            }
         }
      }
   }

   private void vuuuNvNuv(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      GL11.glEnable(3042);
      GL14.glBlendFuncSeparate(1, 771, 0, 1);
      VvNNUnNNVn var2 = this.nvvnUnUn ? this.VUuuVUnun : this.vNnNuuvVn;
      this.nNuVunNUVu.UuUVuuUu();
      this.UuUVuuUu(this.nNuVunNUVu, var1.vuuuNvNuv(), var1.nvUVNnuu(), this.NnVnNVN, this.vnvvNvUnVv, this.OCOocoOoOO, this.o0Ooc0COOoc);
      this.nNuVunNUVu.UuUVuuUu("uGlow", 0);
      this.nNuVunNUVu.UuUVuuUu("uBloom", 1);
      this.nNuVunNUVu.UuUVuuUu("uGlowTexel", 1.0F / Math.max(1, this.vNnNuuvVn.vVvUvVVuuNvV()), 1.0F / Math.max(1, this.vNnNuuvVn.uNNnnnuuuN()));
      this.nNuVunNUVu.UuUVuuUu("uBloomTexel", 1.0F / Math.max(1, var2.vVvUvVVuuNvV()), 1.0F / Math.max(1, var2.uNNnnnuuuN()));
      this.nNuVunNUVu.UuUVuuUu("uSourceScale", 1.0F, 1.0F);
      this.nNuVunNUVu.UuUVuuUu("uBloomAmount", this.nvvnUnUn ? 1.0F : 0.0F);
      this.nNuVunNUVu.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
      this.uUnuvNvvNU(1, var2.uUnuvNvvNU());
      this.UuUVuuUu(this.vNnNuuvVn.uUnuvNvvNU());
      this.NNVNuUvVn.UuUVuuUu();
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      float var3 = C00OOC00oO((var2 - var0) / Math.max(var1 - var0, 1.0E-5F), 0.0F, 1.0F);
      return var3 * var3 * (3.0F - 2.0F * var3);
   }

   private void nvUVNnuu(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.UnnnvvU != null) {
         VvVVnnNNNuV.VvunVVUvUNnv var2 = var1.uVUuuVnNVU();
         if (!(var2.vVvUvVVuuNvV() <= 1.0F) && !(var2.uNNnnnuuuN() <= 1.0F) && !(var2.uVUuuVnNVU() <= 0.001F)) {
            VvNNUnNNVn var3 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            this.UnnnvvU.UuUVuuUu();
            this.UnnnvvU.UuUVuuUu("uBackground", 0);
            this.UnnnvvU.UuUVuuUu("uTextureSize", var3.vVvUvVVuuNvV(), var3.uNNnnnuuuN());
            this.UnnnvvU
               .UuUVuuUu(
                  "uSourceScale", var3 == this.UUuUnNVNuuv ? this.VuuUVVu : this.uNnNUNvuVnu, var3 == this.UUuUnNVNuuv ? this.nUNnuUNnV : this.VnnnvUunNvuu
               );
            this.UnnnvvU.UuUVuuUu("uTime", var1.nUUVuvU());
            this.UnnnvvU.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
            this.UnnnvvU.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
            this.UnnnvvU.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
            this.UuUVuuUu(var3.uUnuvNvvNU());
            this.UnnnvvU.UuUVuuUu("uLocalMouse", var2.vuuuNvNuv(), var2.nvUVNnuu());
            float var4 = var2.NVNnnvnuunNv() > 0.0F ? var2.NVNnnvnuunNv() : 40.0F;
            this.UuUVuuUu(
               var1,
               var2.C00OOC00oO(),
               var2.uUnuvNvvNU(),
               var2.vVvUvVVuuNvV(),
               var2.uNNnnnuuuN(),
               var2.nuUnNvnuUu(),
               var4,
               var2.VVuuUN(),
               var2.uVUuuVnNVU(),
               var2.vNUvnnVnUvu(),
               var2.UuuNnUvUuv(),
               var2.nUUVuvU(),
               var2.UnUNVVVNuv(),
               var2.vNVuvnUUnuUn(),
               var2.UvnvNVnnnnNU(),
               var2.uVUVnuvnuVuv()
            );
         }
      }
   }

   private void UuuNnUvUuv(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.VUUnuVvVu != null && var1.C00OOC00oO() > 0) {
         VvNNUnNNVn var2 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
         boolean var3 = var2 == this.UUuUnNVNuuv;
         this.UuUVuuUu(var1, var2, var3 ? this.VuuUVVu : this.uNnNUNvuVnu, var3 ? this.nUNnuUNnV : this.VnnnvUunNvuu, false);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean C00OOC00oO(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (this.VUNvNUuNVnn || !this.NUUVUvvuNNVU || this.VUUnuVvVu == null || this.NNVNuUvVn == null) {
         return false;
      } else if (var1 != null && var1.uUnuvNvvNU() > 0) {
         int var2 = var1.vuuuNvNuv();
         int var3 = var1.nvUVNnuu();
         if (var2 > 0 && var3 > 0) {
            VvuuVNVUn.C00OOC00oO(this.nuunNvv);
            boolean var12 = false /* VF: Semaphore variable */;

            boolean var16;
            label117: {
               boolean var17;
               label116: {
                  try {
                     var12 = true;
                     this.uUnuvNvvNU();
                     GL11.glDisable(3089);
                     GL11.glDisable(36281);
                     GL11.glDisable(2929);
                     GL11.glDisable(2884);
                     GL11.glColorMask(true, true, true, true);
                     boolean var4 = this.C00OOC00oO(var1, var2, var3);
                     GL30.glBindFramebuffer(36160, var1.UuuNnUvUuv());
                     if (GL30.glCheckFramebufferStatus(36009) != 36053) {
                        var16 = false;
                        var12 = false;
                        break label117;
                     }

                     GL11.glViewport(0, 0, var2, var3);
                     float var6;
                     float var7;
                     VvNNUnNNVn var15;
                     if (var4) {
                        var15 = this.ccOO0COcoco0;
                        var6 = 1.0F;
                        var7 = 1.0F;
                     } else {
                        var15 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
                        var17 = var15 == this.UUuUnNVNuuv;
                        var6 = var17 ? this.VuuUVVu : this.uNnNUNvuVnu;
                        var7 = var17 ? this.nUNnuUNnV : this.VnnnvUunNvuu;
                     }

                     this.UuUVuuUu(var1, var15, var6, var7, true);
                     var17 = true;
                     var12 = false;
                     break label116;
                  } catch (Throwable var13) {
                     VNNUVUuN.UuUVuuUu("MainMenuRenderer", null, "overlay pass failed", var13);
                     var16 = false;
                     var12 = false;
                  } finally {
                     if (var12) {
                        this.uUnuvNvvNU(2, 0);
                        this.uUnuvNvvNU(1, 0);
                        this.UuUVuuUu(0);
                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(this.nuunNvv);
                     }
                  }

                  this.uUnuvNvvNU(2, 0);
                  this.uUnuvNvvNU(1, 0);
                  this.UuUVuuUu(0);
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(this.nuunNvv);
                  return var16;
               }

               this.uUnuvNvvNU(2, 0);
               this.uUnuvNvvNU(1, 0);
               this.UuUVuuUu(0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(this.nuunNvv);
               return var17;
            }

            this.uUnuvNvvNU(2, 0);
            this.uUnuvNvvNU(1, 0);
            this.UuUVuuUu(0);
            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(this.nuunNvv);
            return var16;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO(VvVVnnNNNuV.VUuUUNnnuvuv var1, int var2, int var3) {
      if (this.VnVuuvVvnNv != null && this.vuvvuVuVv != null) {
         int var4 = Math.max(2, var2 / 2);
         int var5 = Math.max(2, var3 / 2);
         int var6 = Math.max(2, var2 / 4);
         int var7 = Math.max(2, var3 / 4);
         int var8 = Math.max(2, var2 / 8);
         int var9 = Math.max(2, var3 / 8);
         int var10 = Math.max(2, var2 / 16);
         int var11 = Math.max(2, var3 / 16);
         this.vVVuuVVv.UuUVuuUu(var4, var5);
         this.VuunNUUUvu.UuUVuuUu(var6, var7);
         this.NNUUNUuVNNVn.UuUVuuUu(var8, var9);
         this.VvVvnNUnvuvV.UuUVuuUu(var10, var11);
         this.ccOO0COcoco0.UuUVuuUu(var4, var5);
         if (this.vVVuuVVv.nuUnNvnuUu()
            && this.VuunNUUUvu.nuUnNvnuUu()
            && this.NNUUNUuVNNVn.nuUnNvnuUu()
            && this.VvVvnNUnvuvV.nuUnNvnuUu()
            && this.ccOO0COcoco0.nuUnNvnuUu()) {
            GL30.glBindFramebuffer(36008, var1.UuuNnUvUuv());
            GL30.glBindFramebuffer(36009, this.vVVuuVVv.C00OOC00oO());
            if (GL30.glCheckFramebufferStatus(36008) == 36053 && GL30.glCheckFramebufferStatus(36009) == 36053) {
               GL30.glBlitFramebuffer(0, 0, var2, var3, 0, 0, var4, var5, 16384, 9729);
               this.UuUVuuUu(this.VnVuuvVvnNv, this.vVVuuVVv, 1.0F, 1.0F, this.VuunNUUUvu, var6, var7);
               this.UuUVuuUu(this.VnVuuvVvnNv, this.VuunNUUUvu, 1.0F, 1.0F, this.NNUUNUuVNNVn, var8, var9);
               this.UuUVuuUu(this.VnVuuvVvnNv, this.NNUUNUuVNNVn, 1.0F, 1.0F, this.VvVvnNUnvuvV, var10, var11);
               this.UuUVuuUu(this.vuvvuVuVv, this.VvVvnNUnvuvV, 1.0F, 1.0F, this.NNUUNUuVNNVn, var8, var9);
               this.UuUVuuUu(this.vuvvuVuVv, this.NNUUNUuVNNVn, 1.0F, 1.0F, this.VuunNUUUvu, var6, var7);
               this.UuUVuuUu(this.vuvvuVuVv, this.VuunNUUUvu, 1.0F, 1.0F, this.ccOO0COcoco0, var4, var5);
               return true;
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

   private void nUUVuvU(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      int var2 = var1.vuuuNvNuv();
      int var3 = var1.nvUVNnuu();
      float var4 = Math.max(Math.min(var2, var3), 1) / 1080.0F;
      this.UnnNNvuvvUU = Math.max(7.0F * var4, 1.5F);
      this.VNNnnVUuvv = Math.max(38.0F * var4, 4.0F);
      this.vUvUvUNNuNvn = var4;
      this.uuVuUuuVVNvN = Math.max(this.VNNnnVUuvv * 3.4F + 16.0F * var4, this.UnnNNvuvvUU * 3.4F + 2.4F * var4) + 6.0F * var4;
      this.VvuUUUNNNv = false;
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, VvVVnnNNNuV.nUNvUnnVN var2) {
      if (this.VvVuvUvvNNVv != null) {
         float var3 = var2.UuUVuuUu();
         if (!(var2.uUnuvNvvNU() > 0.004F) && !(var3 <= 0.004F)) {
            this.VvVuvUvvNNVv.UuUVuuUu();
            if (!this.VvuUUUNNNv) {
               this.VvVuvUvvNNVv.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
               this.VvVuvUvvNNVv.UuUVuuUu("uContact", this.UnnNNvuvvUU, 2.4F * this.vUvUvUNNuNvn, 2.2F * this.vUvUvUNNuNvn, 0.8F * this.vUvUvUNNuNvn);
               this.VvVuvUvvNNVv.UuUVuuUu("uAmbient", this.VNNnnVUuvv, 16.0F * this.vUvUvUNNuNvn, 9.0F * this.vUvUvUNNuNvn, 3.0F * this.vUvUvUNNuNvn);
               this.VvVuvUvvNNVv.UuUVuuUu("uGains", 0.33F, 0.48F);
               this.VvuUUUNNNv = true;
            }

            float var4 = this.uuVuUuuVVNvN;
            this.UuUVuuUu(
               this.VvVuvUvvNNVv,
               var1.vuuuNvNuv(),
               var1.nvUVNnuu(),
               var2.vuuuNvNuv() - var4,
               var2.nvUVNnuu() - var4,
               var2.UuuNnUvUuv() + var4 * 2.0F,
               var2.nUUVuvU() + var4 * 2.0F
            );
            this.VvVuvUvvNNVv.UuUVuuUu("uContent", var4, var4, var2.UuuNnUvUuv(), var2.nUUVuvU());
            this.VvVuvUvvNNVv.UuUVuuUu("uRadius", var2.UnUNVVVNuv());
            this.VvVuvUvvNNVv.UuUVuuUu("uEntry", var2.UvnvNVnnnnNU());
            this.VvVuvUvvNNVv.UuUVuuUu("uReveal", var2.uVunuUNVVUUV());
            this.VvVuvUvvNNVv.UuUVuuUu("uRevealDir", var2.UNnVVNvvnVvU());
            this.VvVuvUvvNNVv.UuUVuuUu("uOpacity", Math.min(var3, 1.0F));
            this.NNVNuUvVn.UuUVuuUu();
         }
      }
   }

   private void UuUVuuUu(VvVVnnNNNuV.VUuUUNnnuvuv var1, VvNNUnNNVn var2, float var3, float var4, boolean var5) {
      int var6 = var5 ? var1.uUnuvNvvNU() : var1.C00OOC00oO();
      if (var6 > 0 && var2 != null && var2.nuUnNvnuUu()) {
         this.nUUVuvU(var1);
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.VUUnuVvVu.UuUVuuUu();
         this.VUUnuVvVu.UuUVuuUu("uBackground", 0);
         this.VUUnuVvVu.UuUVuuUu("uTextureSize", var2.vVvUvVVuuNvV(), var2.uNNnnnuuuN());
         this.VUUnuVvVu.UuUVuuUu("uSourceScale", var3, var4);
         this.VUUnuVvVu.UuUVuuUu("uTime", var1.nUUVuvU());
         this.VUUnuVvVu.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
         this.VUUnuVvVu.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
         this.VUUnuVvVu.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.UuUVuuUu(var2.uUnuvNvvNU());

         for (int var7 = 0; var7 < var6; var7++) {
            VvVVnnNNNuV.nUNvUnnVN var8 = var5 ? var1.nuUnNvnuUu(var7) : var1.uUnuvNvvNU(var7);
            if (!(var8.UuuNnUvUuv() <= 1.0F) && !(var8.nUUVuvU() <= 1.0F) && !(var8.UvnvNVnnnnNU() <= 0.002F)) {
               this.UuUVuuUu(var1, var8);
               this.VUUnuVvVu.UuUVuuUu();
               float var9 = var8.vNVuvnUUnuUn() > 0.0F ? var8.vNVuvnUUnuUn() : 32.0F;
               this.UuUVuuUu(
                  this.VUUnuVvVu,
                  var1.vuuuNvNuv(),
                  var1.nvUVNnuu(),
                  var8.vuuuNvNuv() - var9,
                  var8.nvUVNnuu() - var9,
                  var8.UuuNnUvUuv() + var9 * 2.0F,
                  var8.nUUVuvU() + var9 * 2.0F
               );
               this.VUUnuVvVu.UuUVuuUu("uContent", var9, var9, var8.UuuNnUvUuv(), var8.nUUVuvU());
               this.VUUnuVvVu.UuUVuuUu("uRadius", var8.UnUNVVVNuv());
               this.VUUnuVvVu.UuUVuuUu("uEntry", var8.UvnvNVnnnnNU());
               this.VUUnuVvVu.UuUVuuUu("uHover", var8.uVUVnuvnuVuv());
               this.VUUnuVvVu.UuUVuuUu("uGlow", var8.NVNnnvnuunNv());
               this.VUUnuVvVu.UuUVuuUu("uReveal", var8.uVunuUNVVUUV());
               this.VUUnuVvVu.UuUVuuUu("uRevealDir", var8.UNnVVNvvnVvU());
               this.VUUnuVvVu.UuUVuuUu("uPointerLocal", var8.uNnUnnuNUnNu(), var8.NnUuNNU());
               this.VUUnuVvVu.UuUVuuUu("uRow", var8.nNvNUVU(), var8.UnUNuUU(), var8.uUVuVvuNUvnu(), var8.UvUvUNuvNU());
               this.VUUnuVvVu.UuUVuuUu("uRowRadius", var8.c0oOOCcCoC0());
               this.VUUnuVvVu.UuUVuuUu("uRowGlow", var8.VVnVNnunVvu());
               this.VUUnuVvVu.UuUVuuUu("uChevron", var8.vVvUvVVuuNvV(), var8.uNNnnnuuuN(), var8.nuUnNvnuUu(), var8.VVuuUN());
               this.VUUnuVvVu.UuUVuuUu("uChevronDir", var8.vNUvnnVnUvu());
               this.VUUnuVvVu.UuUVuuUu("uChevronAlpha", var8.uVUuuVnNVU());
               this.VUUnuVvVu.UuUVuuUu("uScrim", var8.uUnuvNvvNU());
               this.VUUnuVvVu.UuUVuuUu("uDensity", var8.C00OOC00oO());
               this.NNVNuUvVn.UuUVuuUu();
            }
         }
      }
   }

   private void UnUNVVVNuv(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      VvVVnnNNNuV.uunvUUVnuNn var2 = var1.vVvUvVVuuNvV();
      if (this.uuuVnuvnnNnU != null && !(var2.vVvUvVVuuNvV() <= 0.5F) && !(var2.VVuuUN() <= 0.004F) && !(var2.vNUvnnVnUvu() <= 0.004F)) {
         float var3 = Math.max(var2.uNNnnnuuuN(), var2.vVvUvVVuuNvV() * 1.6F);
         float var4 = var2.C00OOC00oO() - var3;
         float var5 = var2.uUnuvNvvNU() - var3;
         float var6 = var3 * 2.0F;
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.uuuVnuvnnNnU.UuUVuuUu();
         this.UuUVuuUu(this.uuuVnuvnnNnU, var1.vuuuNvNuv(), var1.nvUVNnuu(), var4, var5, var6, var6);
         this.uuuVnuvnnNnU.UuUVuuUu("uBody", var3, var3, var2.vVvUvVVuuNvV(), var3);
         this.uuuVnuvnnNnU.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
         this.uuuVnuvnnNnU.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
         this.uuuVnuvnnNnU.UuUVuuUu("uPhase", var2.nuUnNvnuUu());
         this.uuuVnuvnnNnU.UuUVuuUu("uTime", var1.nUUVuvU());
         this.uuuVnuvnnNnU.UuUVuuUu("uEntry", var2.vNUvnnVnUvu());
         this.uuuVnuvnnNnU.UuUVuuUu("uAlpha", var2.VVuuUN());
         this.uuuVnuvnnNnU.UuUVuuUu("uSeed", var2.uVUuuVnNVU());
         this.uuuVnuvnnNnU.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
         this.uuuVnuvnnNnU.UuUVuuUu("uPointer", var1.vNVuvnUUnuUn() - var4, var1.UvnvNVnnnnNU() - var5);
         this.NNVNuUvVn.UuUVuuUu();
      }
   }

   private void vNVuvnUUnuUn(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      VvVVnnNNNuV.nvUnvV var2 = var1.uNNnnnuuuN();
      if (this.nNunUnVN != null && !(var2.uUnuvNvvNU() <= 0.5F) && !(var2.nuUnNvnuUu() <= 0.004F) && !(var2.uNNnnnuuuN() <= 0.004F)) {
         VvNNUnNNVn var3 = this.UvuVvvVuUuuu && this.UUuUnNVNuuv.nuUnNvnuUu() ? this.UUuUnNVNuuv : this.uUVVvVVNvvn;
         if (var3.nuUnNvnuUu()) {
            boolean var4 = var3 == this.UUuUnNVNuuv;
            float var5 = Math.max(var2.vVvUvVVuuNvV(), var2.uUnuvNvvNU() * 1.7F);
            float var6 = var2.UuUVuuUu() - var5;
            float var7 = var2.C00OOC00oO() - var5;
            float var8 = var5 * 2.0F;
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
            this.nNunUnVN.UuUVuuUu();
            this.nNunUnVN.UuUVuuUu("uBackground", 0);
            this.nNunUnVN.UuUVuuUu("uTextureSize", var3.vVvUvVVuuNvV(), var3.uNNnnnuuuN());
            this.nNunUnVN.UuUVuuUu("uSourceScale", var4 ? this.VuuUVVu : this.uNnNUNvuVnu, var4 ? this.nUNnuUNnV : this.VnnnvUunNvuu);
            this.UuUVuuUu(this.nNunUnVN, var1.vuuuNvNuv(), var1.nvUVNnuu(), var6, var7, var8, var8);
            this.nNunUnVN.UuUVuuUu("uGem", var5, var5, var2.uUnuvNvvNU(), var5);
            this.nNunUnVN.UuUVuuUu("uAccentTop", var1.nNvNUVU(), var1.UnUNuUU(), var1.uUVuVvuNUvnu());
            this.nNunUnVN.UuUVuuUu("uAccentBottom", var1.UvUvUNuvNU(), var1.c0oOOCcCoC0(), var1.VVnVNnunVvu());
            this.nNunUnVN.UuUVuuUu("uRadius", var2.uUnuvNvvNU());
            this.nNunUnVN.UuUVuuUu("uTime", var1.nUUVuvU());
            this.nNunUnVN.UuUVuuUu("uEntry", var2.uNNnnnuuuN());
            this.nNunUnVN.UuUVuuUu("uAlpha", var2.nuUnNvnuUu());
            this.nNunUnVN.UuUVuuUu("uSeed", var2.VVuuUN());
            this.nNunUnVN.UuUVuuUu("uLightMode", var1.vNnNuuvVn() ? 1.0F : 0.0F);
            this.nNunUnVN.UuUVuuUu("uPointer", var2.vNUvnnVnUvu() - var6, var2.uVUuuVnNVU() - var7);
            this.UuUVuuUu(var3.uUnuvNvvNU());
            this.NNVNuUvVn.UuUVuuUu();
         }
      }
   }

   private void UuUVuuUu(
      VvVVnnNNNuV.VUuUUNnnuvuv var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16
   ) {
      this.UuUVuuUu(this.UnnnvvU, var1.vuuuNvNuv(), var1.nvUVNnuu(), var2 - var7, var3 - var7, var4 + var7 * 2.0F, var5 + var7 * 2.0F);
      this.UnnnvvU.UuUVuuUu("uContent", var7, var7, var4, var5);
      this.UnnnvvU.UuUVuuUu("uRadius", var6);
      this.UnnnvvU.UuUVuuUu("uHover", var8);
      this.UnnnvvU.UuUVuuUu("uEntry", var9);
      this.UnnnvvU.UuUVuuUu("uFlash", var10);
      this.UnnnvvU.UuUVuuUu("uPill", var11, var12, var13, var14);
      this.UnnnvvU.UuUVuuUu("uPillRadius", var1.uVUuuVnNVU().UuUVuuUu());
      this.UnnnvvU.UuUVuuUu("uPillGlow", var15);
      this.UnnnvvU.UuUVuuUu("uPillVelocity", var16);
      this.NNVNuUvVn.UuUVuuUu();
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.UuUVuuUu("uViewport", var2, var3);
      var1.UuUVuuUu("uRect", var4, var5, var6, var7);
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1, VvVVnnNNNuV.VUuUUNnnuvuv var2) {
      for (int var3 = 0; var3 < 14; var3++) {
         VvVVnnNNNuV.vvnuuvnUNvN var4 = var2.vuuuNvNuv(var3);
         var1.UuUVuuUu(uUnuvNvvNU[var3], var4.UuUVuuUu(), var4.C00OOC00oO(), var4.uUnuvNvvNU(), var4.vVvUvVVuuNvV());
      }
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private void UuUVuuUu() {
      if (!this.NUUVUvvuNNVU) {
         if (this.NNVNuUvVn == null) {
            this.NNVNuUvVn = new nnUnNnuvvN();
         }

         this.NvUVUvVVnUu = this.nVVUuvuNnUN
            .C00OOC00oO("composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.unnUnUNVnN = this.nVVUuvuNnUN
            .C00OOC00oO("particles", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_particles.frag");
         this.NnuUnUNnu = this.nVVUuvuNnUN
            .C00OOC00oO("buttons", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_button.frag");
         this.UnnnvvU = this.nVVUuvuNnUN.C00OOC00oO("capsule", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_capsule.frag");
         this.VUUnuVvVu = this.nVVUuvuNnUN.C00OOC00oO("panel", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_panel.frag");
         this.VvVuvUvvNNVv = this.nVVUuvuNnUN
            .C00OOC00oO("panel_shadow", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_panel_shadow.frag");
         this.uuuVnuvnnNnU = this.nVVUuvuNnUN
            .C00OOC00oO("celestial", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_celestial.frag");
         this.nNunUnVN = this.nVVUuvuNnUN.C00OOC00oO("gem", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_gem.frag");
         this.VnVuuvVvnNv = this.nVVUuvuNnUN
            .C00OOC00oO("blur_down", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_blur_down.frag");
         this.vuvvuVuVv = this.nVVUuvuNnUN
            .C00OOC00oO("blur_up", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_blur_up.frag");
         this.uunNUuunVU = this.nVVUuvuNnUN.C00OOC00oO("blit", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_blit.frag");
         this.NUVvUUVuVNVv = this.nVVUuvuNnUN
            .C00OOC00oO("button_glow", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_button_glow.frag");
         this.nNuVunNUVu = this.nVVUuvuNnUN
            .C00OOC00oO("glow_composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_glow_composite.frag");
         this.NvnuuuvnVV = this.nVVUuvuNnUN
            .C00OOC00oO("sdf_bake", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_sdf_bake.frag");
         this.NnUVNnuvUv = this.nVVUuvuNnUN
            .C00OOC00oO("lockup", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_lockup.frag");
         this.UuuuNNunN = this.nVVUuvuNnUN
            .C00OOC00oO("lockup_shadow", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_lockup_shadow.frag");
         this.VUNvNUuNVnn = this.NvUVUvVVnUu == null || this.NnuUnUNnu == null;
         this.NUUVUvvuNNVU = true;
      }
   }

   private boolean C00OOC00oO(int var1, int var2) {
      if (this.VnVuuvVvnNv != null && this.vuvvuVuVv != null && this.uunNUuunVU != null) {
         this.vvUVNVvvNUv.UuUVuuUu(var1, var2);
         this.UuNnnVnuNNV.UuUVuuUu(Math.max(2, var1 / 2), Math.max(2, var2 / 2));
         this.uUVvnUuNvvN.UuUVuuUu(Math.max(2, var1 / 4), Math.max(2, var2 / 4));
         this.UUuUnNVNuuv.UuUVuuUu(Math.max(2, var1 / 2), Math.max(2, var2 / 2));
         return this.vvUVNVvvNUv.nuUnNvnuUu() && this.UuNnnVnuNNV.nuUnNvnuUu() && this.uUVvnUuNvvN.nuUnNvnuUu() && this.UUuUnNVNuuv.nuUnNvnuUu();
      } else {
         return false;
      }
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1, VvNNUnNNVn var2, float var3, float var4, VvNNUnNNVn var5, int var6, int var7) {
      this.UuUVuuUu(var5, var6, var7);
      GL11.glDisable(3042);
      var1.UuUVuuUu();
      this.UuUVuuUu(var1, var6, var7, 0.0F, 0.0F, var6, var7);
      var1.UuUVuuUu("uSource", 0);
      var1.UuUVuuUu("uSourceTexel", 1.0F / Math.max(1, var2.vVvUvVVuuNvV()), 1.0F / Math.max(1, var2.uNNnnnuuuN()));
      var1.UuUVuuUu("uSourceScale", var3, var4);
      this.UuUVuuUu(var2.uUnuvNvvNU());
      this.NNVNuUvVn.UuUVuuUu();
   }

   private void C00OOC00oO() {
      this.UuUVuuUu(this.VnVuuvVvnNv, this.vvUVNVvvNUv, this.nvuUVvuuN, this.CC0COO, this.UuNnnVnuNNV, this.vUNuuvvnVnv, this.unnnNUNnVu);
      this.UuUVuuUu(this.VnVuuvVvnNv, this.UuNnnVnuNNV, this.VuuUVVu, this.nUNnuUNnV, this.uUVvnUuNvvN, this.NvnnUUuVvNU, this.vVvuUVnV);
      this.UuUVuuUu(this.vuvvuVuVv, this.uUVvnUuNvvN, this.VuNVnvNNuNnn, this.uvVuuuvvVU, this.UUuUnNVNuuv, this.vUNuuvvnVnv, this.unnnNUNnVu);
   }

   private void UvnvNVnnnnNU(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      GL11.glDisable(3042);
      this.uunNUuunVU.UuUVuuUu();
      this.UuUVuuUu(this.uunNUuunVU, var1.vuuuNvNuv(), var1.nvUVNnuu(), 0.0F, 0.0F, var1.vuuuNvNuv(), var1.nvUVNnuu());
      this.uunNUuunVU.UuUVuuUu("uSource", 0);
      this.uunNUuunVU.UuUVuuUu("uSourceScale", this.nvuUVvuuN, this.CC0COO);
      this.uunNUuunVU.UuUVuuUu("uSourceTexel", 1.0F / Math.max(1, this.vvUVNVvvNUv.vVvUvVVuuNvV()), 1.0F / Math.max(1, this.vvUVNVvvNUv.uNNnnnuuuN()));
      this.UuUVuuUu(this.vvUVNVvvNUv.uUnuvNvvNU());
      this.NNVNuUvVn.UuUVuuUu();
   }

   private uUvVUVnVNV.NVnVnNnN uVUVnuvnuVuv(VvVVnnNNNuV.VUuUUNnnuvuv var1) {
      if (var1.NVuunNnvvvVu()) {
         if (this.VunnVNvNV == null) {
            this.VunnVNvNV = this.nVVUuvuNnUN
               .C00OOC00oO("midnight_azure", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/midnight_azure.frag");
         }

         return this.VunnVNvNV;
      } else if (var1.NVuNUuVnVUN()) {
         if (this.UVnuVUUVnnU == null) {
            this.UVnuVUUVnnU = this.nVVUuvuNnUN
               .C00OOC00oO("vernal_solstice", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/vernal_solstice.frag");
         }

         return this.UVnuVUUVnnU;
      } else if (var1.UUuUnNVNuuv()) {
         if (this.nnvuvUNuUnN == null) {
            this.nnvuvUNuUnN = this.nVVUuvuNnUN
               .C00OOC00oO("sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         }

         return this.nnvuvUNuUnN;
      } else {
         if (this.UnUUVuVunvVu == null) {
            this.UnUUVuVunvVu = this.nVVUuvuNnUN
               .C00OOC00oO("nebula", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_nebula.frag");
         }

         return this.UnUUVuVunvVu;
      }
   }

   private void uUnuvNvvNU() {
      this.NuUuUvUUvU = -1;
      this.VUVvNvvVUN = -1;
      this.nVVUuvuNnUN.UuUVuuUu();
   }

   private void UuUVuuUu(int var1) {
      if (this.NuUuUvUUvU != 33984) {
         GL13.glActiveTexture(33984);
         this.NuUuUvUUvU = 33984;
         this.VUVvNvvVUN = -1;
      }

      if (this.VUVvNvvVUN != var1) {
         GL11.glBindTexture(3553, var1);
         this.VUVvNvvVUN = var1;
      }
   }

   private void uUnuvNvvNU(int var1, int var2) {
      GL13.glActiveTexture(33984 + var1);
      GL11.glBindTexture(3553, var2);
      this.NuUuUvUUvU = -1;
      this.VUVvNvvVUN = -1;
   }

   public static long UuUVuuUu(class_310 var0, int var1, int var2) {
      if (var0 != null && GLFW.glfwGetCurrentContext() != 0L) {
         class_1041 var3 = var0.method_22683();
         if (var3 != null && !var3.method_65966()) {
            int var4 = var3.method_4489();
            int var5 = var3.method_4506();
            if (var4 > 0 && var5 > 0 && var1 > 0 && var2 > 0) {
               class_276 var6 = var0.method_1522();
               if (var6 != null && var6.field_1482 > 0 && var6.field_1481 > 0) {
                  if (var6.method_30277() instanceof class_10868 var8) {
                     int var9 = var8.method_68427();
                     if (var9 > 0 && GL11.glIsTexture(var9)) {
                        var4 = Math.min(var4, var6.field_1482);
                        var5 = Math.min(var5, var6.field_1481);
                        return var4 > 0 && var5 > 0 ? (long)var4 << 32 | var5 & 4294967295L : -1L;
                     } else {
                        return -1L;
                     }
                  } else {
                     return -1L;
                  }
               } else {
                  return -1L;
               }
            } else {
               return -1L;
            }
         } else {
            return -1L;
         }
      } else {
         return -1L;
      }
   }

   public static int UuUVuuUu(long var0) {
      return (int)(var0 >>> 32);
   }

   public static int C00OOC00oO(long var0) {
      return (int)var0;
   }

   public static OoCO0O0oc0c.NVnVnNnN C00OOC00oO(class_310 var0, int var1, int var2) {
      long var3 = UuUVuuUu(var0, var1, var2);
      if (var3 < 0L) {
         return null;
      } else {
         int var6 = var0.method_1522().method_30277() instanceof class_10868 var7 ? var7.method_68427() : 0;
         return new OoCO0O0oc0c.NVnVnNnN(UuUVuuUu(var3), C00OOC00oO(var3), var6);
      }
   }

   private static String[] vVvUvVVuuNvV() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }

   @Override
   public void close() {
      this.uUVVvVVNvvn.close();
      this.vvUVNVvvNUv.close();
      this.UuNnnVnuNNV.close();
      this.uUVvnUuNvvN.close();
      this.UUuUnNVNuuv.close();
      this.NVuNUuVnVUN.close();
      this.NVuunNnvvvVu.close();
      this.vNnNuuvVn.close();
      this.VUuuVUnun.close();
      this.vVVuuVVv.close();
      this.VuunNUUUvu.close();
      this.NNUUNUuVNNVn.close();
      this.VvVvnNUnvuvV.close();
      this.ccOO0COcoco0.close();
      this.nvvnUnUn = false;
      this.nUununvNvvn = -1.0F;
      this.vuvnnvuNVvu = 0.0F;
      this.UvuVvvVuUuuu = false;
      if (this.NNVNuUvVn != null) {
         this.NNVNuUvVn.close();
         this.NNVNuUvVn = null;
      }

      this.nVVUuvuNnUN.close();
      this.UnUUVuVunvVu = null;
      this.nnvuvUNuUnN = null;
      this.UVnuVUUVnnU = null;
      this.VunnVNvNV = null;
      this.NvUVUvVVnUu = null;
      this.unnUnUNVnN = null;
      this.NnuUnUNnu = null;
      this.UnnnvvU = null;
      this.VUUnuVvVu = null;
      this.VvVuvUvvNNVv = null;
      this.uuuVnuvnnNnU = null;
      this.VnVuuvVvnNv = null;
      this.vuvvuVuVv = null;
      this.uunNUuunVU = null;
      this.NvnuuuvnVV = null;
      this.NnUVNnuvUv = null;
      this.UuuuNNunN = null;
      this.NUVvUUVuVNVv = null;
      this.nNuVunNUVu = null;
      this.NUUVUvvuNNVU = false;
      this.VUNvNUuNVnn = false;
      this.UNNunNuUNVuU = false;
   }

   public void UuUVuuUu(int var1, int var2) {
      try {
         this.uUVVvVVNvvn.close();
         this.vvUVNVvvNUv.close();
         this.UuNnnVnuNNV.close();
         this.uUVvnUuNvvN.close();
         this.UUuUnNVNuuv.close();
         this.NVuNUuVnVUN.close();
         this.NVuunNnvvvVu.close();
         this.vNnNuuvVn.close();
         this.VUuuVUnun.close();
         this.vVVuuVVv.close();
         this.VuunNUUUvu.close();
         this.NNUUNUuVNNVn.close();
         this.VvVvnNUnvuvV.close();
         this.ccOO0COcoco0.close();
         this.nvvnUnUn = false;
         this.nUununvNvvn = -1.0F;
         this.vuvnnvuNVvu = 0.0F;
         this.UvuVvvVuUuuu = false;
      } catch (Throwable var4) {
      }
   }

   public record NVnVnNnN(int width, int height, int colorTexture) {
   }
}

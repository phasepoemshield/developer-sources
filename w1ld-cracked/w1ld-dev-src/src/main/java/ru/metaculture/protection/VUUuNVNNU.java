package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.time.LocalTime;
import net.minecraft.class_1041;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_3953;
import net.minecraft.class_437;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class VUUuNVNNU implements AutoCloseable {
   private static final VUUuNVNNU UuUVuuUu = new VUUuNVNNU();
   private static final String C00OOC00oO = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final OO0OCoOC uUnuvNvvNU = OO0OCoOC.UuUVuuUu();
   private static final String[] vVvUvVVuuNvV = vVvUvVVuuNvV();
   private final uUvVUVnVNV uNNnnnuuuN = new uUvVUVnVNV();
   private final VvNNUnNNVn nuUnNvnuUu = new VvNNUnNNVn();
   private nnUnNnuvvN VVuuUN;
   private uUvVUVnVNV.NVnVnNnN vNUvnnVnUvu;
   private uUvVUVnVNV.NVnVnNnN uVUuuVnNVU;
   private uUvVUVnVNV.NVnVnNnN vuuuNvNuv;
   private uUvVUVnVNV.NVnVnNnN nvUVNnuu;
   private uUvVUVnVNV.NVnVnNnN UuuNnUvUuv;
   private uUvVUVnVNV.NVnVnNnN nUUVuvU;
   private long UnUNVVVNuv;
   private long vNVuvnUUnuUn;
   private long UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private float NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private float NnUuNNU;
   private boolean nNvNUVU;
   private boolean UnUNuUU;
   private int uUVuVvuNUvnu;
   private static final int UvUvUNuvNU = 4;
   private int c0oOOCcCoC0 = -6357021;
   private int VVnVNnunVvu = -11341636;
   private NvVNvUvunNNu unNNVVNnvvV = NvVNvUvunNNu.AURORA;
   private boolean NuunnvnN;
   private float NVUunUNUN;
   private long UUVNuUNUvUnV;

   public static VUUuNVNNU UuUVuuUu() {
      return UuUVuuUu;
   }

   public boolean UuUVuuUu(class_310 var1, int var2, int var3, float var4) {
      return this.UuUVuuUu(var1, var2, var3, var4, null);
   }

   public boolean UuUVuuUu(class_310 var1, int var2, int var3, float var4, class_437 var5) {
      OoCO0O0oc0c.NVnVnNnN var6 = OoCO0O0oc0c.C00OOC00oO(var1, 1, 1);
      if (var6 == null) {
         VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", false, "invalid frame metrics");
         return false;
      } else if (GLFW.glfwGetCurrentContext() == 0L) {
         VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", false, "no gl context");
         return false;
      } else {
         class_1041 var7 = var1.method_22683();
         if (var7 == null) {
            VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", false, "window missing");
            return false;
         } else {
            long var8 = System.nanoTime();
            if (this.UnUNVVVNuv == 0L) {
               this.UnUNVVVNuv = var8;
               this.vNVuvnUUnuUn = var8;
            }

            float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.vNVuvnUUnuUn) / 1.0E9F));
            this.vNVuvnUUnuUn = var8;
            float var11 = (float)(var8 - this.UnUNVVVNuv) / 1.0E9F;
            if (this.UUVNuUNUvUnV == 0L || var8 - this.UUVNuUNUvUnV >= 1000000000L) {
               this.NVUunUNUN = LocalTime.now().toSecondOfDay() / 3600.0F;
               this.UUVNuUNUvUnV = var8;
            }

            this.uUnuvNvvNU();
            this.UuUVuuUu(var7, var2, var3, var10);
            VvuuVNVUn.NVnVnNnN var12 = VvuuVNVUn.UuUVuuUu();

            boolean var22;
            try {
               this.uNNnnnuuuN.UuUVuuUu();
               this.C00OOC00oO();
               int var13 = var6.width();
               int var28 = var6.height();
               int var15 = VvuuVNVUn.UuUVuuUu(GL11.glGetInteger(36006));
               int var16 = Math.max(420, Math.round(var13 * 0.88F));
               int var17 = Math.max(240, Math.round(var28 * 0.88F));
               int var18 = this.nuUnNvnuUu.vVvUvVVuuNvV();
               int var19 = this.nuUnNvnuUu.uNNnnnuuuN();
               this.nuUnNvnuUu.UuUVuuUu(var16, var17);
               if (!this.nuUnNvnuUu.nuUnNvnuUu()) {
                  VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", false, "gas target not ready");
                  return false;
               }

               boolean var20 = var18 != this.nuUnNvnuUu.vVvUvVVuuNvV() || var19 != this.nuUnNvnuUu.uNNnnnuuuN();
               if (var20 || this.UvnvNVnnnnNU == 0L || var8 - this.UvnvNVnnnnNU >= 25000000L) {
                  this.UuUVuuUu(var11);
                  this.UvnvNVnnnnNU = var8;
               }

               VvuuVNVUn.UuUVuuUu(36160, var15);
               int var21 = GL30.glCheckFramebufferStatus(36009);
               if (var21 == 36053) {
                  GL11.glViewport(0, 0, var13, var28);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3089);
                  GL11.glDisable(36281);
                  GL11.glColorMask(true, true, true, true);
                  this.UuUVuuUu(var13, var28, var11, UuUVuuUu(var4, 0.0F, 1.0F));
                  this.C00OOC00oO(var13, var28, var11, UuUVuuUu(var4, 0.0F, 1.0F));
                  this.uUVuVvuNUvnu = 0;
                  if (VNNUVUuN.UuUVuuUu()) {
                     VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", true, "size=" + var13 + "x" + var28);
                  }

                  return true;
               }

               VNNUVUuN.UuUVuuUu(var5, "WildScreenBackdrop", false, "draw framebuffer incomplete status=0x" + Integer.toHexString(var21));
               var22 = false;
            } catch (Throwable var26) {
               this.uUVuVvuNUvnu++;
               VNNUVUuN.UuUVuuUu("WildScreenBackdrop", var5, "renderBackdrop failed (" + this.uUVuVvuNUvnu + "/4)", var26);
               if (this.uUVuVvuNUvnu >= 4) {
                  this.uUVuVvuNUvnu = 0;
                  this.close();
               }

               return false;
            } finally {
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var12);
            }

            return var22;
         }
      }
   }

   public void UuUVuuUu(class_310 var1, class_2561 var2) {
      OoCO0O0oc0c.NVnVnNnN var3 = OoCO0O0oc0c.C00OOC00oO(var1, 1, 1);
      if (var3 != null) {
         this.UuUVuuUu(var3.width(), var3.height(), var2 == null ? "Connecting" : var2.getString(), -1.0F);
      }
   }

   public void UuUVuuUu(class_310 var1, class_3953 var2) {
      OoCO0O0oc0c.NVnVnNnN var3 = OoCO0O0oc0c.C00OOC00oO(var1, 1, 1);
      if (var3 != null && var2 != null) {
         float var4 = UuUVuuUu(var2.method_17679() / 100.0F, 0.0F, 1.0F);
         this.UuUVuuUu(var3.width(), var3.height(), Math.round(var4 * 100.0F) + "%", var4);
      }
   }

   private void UuUVuuUu(int var1, int var2, String var3, float var4) {
      try {
         NVnVnNnN.uVUuuVnNVU();
         UnVNvNnU var5 = NVnVnNnN.UuUVuuUu();
         if (var5 == null) {
            return;
         }

         var5.UuUVuuUu(var1, var2);
         boolean var6 = false;

         try {
            float var7 = UuUVuuUu((float)var1, (float)var2);
            float var8 = UuUVuuUu(var1 * 0.3F, 320.0F * var7, 560.0F * var7);
            float var9 = Math.max(8.0F * var7, 8.0F);
            float var10 = var1 * 0.5F - var8 * 0.5F;
            float var11 = var2 * 0.5F + 42.0F * var7;
            float var12 = var9 * 0.5F;
            float var13 = 0.5F + 0.5F * (float)Math.sin((float)(System.nanoTime() - Math.max(1L, this.UnUNVVVNuv)) / 1.0E9F * 1.2F);
            float var14 = var4 >= 0.0F ? var4 : 0.18F + 0.64F * var13;
            float var15 = Math.max(var9, var8 * UuUVuuUu(var14, 0.0F, 1.0F));
            int var16 = this.NuunnvnN ? UuUVuuUu(0.12F, 0.13F, 0.15F, 0.18F) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.105F);
            int var17 = this.NuunnvnN ? UuUVuuUu(0.07F, 0.08F, 0.09F, 0.88F) : UuUVuuUu(0.94F, 0.97F, 1.0F, 0.9F);
            int var18 = this.NuunnvnN ? UuUVuuUu(0.22F, 0.23F, 0.24F, 0.48F) : UuUVuuUu(0.66F, 0.72F, 0.8F, 0.48F);
            var5.UuUVuuUu(var10, var11, var8, var9, var12, 18.0F * var7, 0.9F, UuUVuuUu(this.VVnVNnunVvu, 78));
            var5.UuUVuuUu(var10, var11, var8, var9, var12, var16);
            var5.UuUVuuUu(var10, var11, var15, var9, var12, uUnuvNvvNU(this.VVnVNnunVvu, this.c0oOOCcCoC0, var13, 0.88F));
            float var19 = 25.0F * var7;
            float var20 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var3, var19).UuUVuuUu;
            float var21 = var11 - 22.0F * var7;
            var5.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var1 * 0.5F - var20 * 0.5F, var21, var19, var3, var17);
            if (var4 >= 0.0F) {
               String var22 = "Loading world";
               float var23 = 14.0F * var7;
               float var24 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var22, var23).UuUVuuUu;
               var5.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var1 * 0.5F - var24 * 0.5F, var11 + 34.0F * var7, var23, var22, var18);
            }

            var5.C00OOC00oO();
            var6 = true;
         } finally {
            if (!var6) {
               var5.UuUVuuUu();
            }
         }
      } catch (Throwable var29) {
      }
   }

   private void UuUVuuUu(float var1) {
      this.nuUnNvnuUu.UuUVuuUu();
      GL11.glDisable(3042);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      uUvVUVnVNV.NVnVnNnN var2 = this.unNNVVNnvvV == NvVNvUvunNNu.MIDNIGHT_AZURE
         ? this.nvUVNnuu
         : (
            this.unNNVVNnvvV == NvVNvUvunNNu.VERNAL_SOLSTICE
               ? this.vuuuNvNuv
               : (this.unNNVVNnvvV == NvVNvUvunNNu.SAKURA_BREEZE ? this.uVUuuVnNVU : this.vNUvnnVnUvu)
         );
      if (this.unNNVVNnvvV == NvVNvUvunNNu.SAKURA_BREEZE || this.unNNVVNnvvV == NvVNvUvunNNu.VERNAL_SOLSTICE || this.unNNVVNnvvV == NvVNvUvunNNu.MIDNIGHT_AZURE
         )
       {
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16384);
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(770, 771, 1, 771);
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      }

      var2.UuUVuuUu();
      this.UuUVuuUu(
         var2, this.nuUnNvnuUu.vVvUvVVuuNvV(), this.nuUnNvnuUu.uNNnnnuuuN(), 0.0F, 0.0F, this.nuUnNvnuUu.vVvUvVVuuNvV(), this.nuUnNvnuUu.uNNnnnuuuN()
      );
      var2.UuUVuuUu("uTime", var1);
      var2.UuUVuuUu("uResolution", this.nuUnNvnuUu.vVvUvVVuuNvV(), this.nuUnNvnuUu.uNNnnnuuuN());
      var2.UuUVuuUu(
         "uMouse",
         this.uVunuUNVVUUV / Math.max(1.0F, (float)this.nuUnNvnuUu.vVvUvVVuuNvV()),
         this.UNnVVNvvnVvU / Math.max(1.0F, (float)this.nuUnNvnuUu.uNNnnnuuuN())
      );
      var2.UuUVuuUu("uMouseVelocity", this.uNnUnnuNUnNu, this.NnUuNNU);
      var2.UuUVuuUu("uAccentTop", UuUVuuUu(this.c0oOOCcCoC0), C00OOC00oO(this.c0oOOCcCoC0), uUnuvNvvNU(this.c0oOOCcCoC0));
      var2.UuUVuuUu("uAccentBottom", UuUVuuUu(this.VVnVNnunVvu), C00OOC00oO(this.VVnVNnunVvu), uUnuvNvvNU(this.VVnVNnunVvu));
      var2.UuUVuuUu("uActivity", 0.54F);
      var2.UuUVuuUu("uAlpha", 1.0F);
      var2.UuUVuuUu("uLightMode", this.NuunnvnN ? 1.0F : 0.0F);

      for (int var3 = 0; var3 < 14; var3++) {
         var2.UuUVuuUu(vVvUvVVuuNvV[var3], 0.0F, 0.0F, 100.0F, 0.0F);
      }

      this.VVuuUN.UuUVuuUu();
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4) {
      GL11.glDisable(3042);
      this.UuuNnUvUuv.UuUVuuUu();
      this.UuUVuuUu(this.UuuNnUvUuv, var1, var2, 0.0F, 0.0F, var1, var2);
      this.UuuNnUvUuv.UuUVuuUu("uTexture", 0);
      this.UuuNnUvUuv.UuUVuuUu("uTextureSize", this.nuUnNvnuUu.vVvUvVVuuNvV(), this.nuUnNvnuUu.uNNnnnuuuN());
      this.UuuNnUvUuv
         .UuUVuuUu(
            "uParallax", (this.uVunuUNVVUUV / Math.max(1.0F, (float)var1) - 0.5F) * 0.01F, (this.UNnVVNvvnVvU / Math.max(1.0F, (float)var2) - 0.5F) * 0.008F
         );
      this.UuuNnUvUuv.UuUVuuUu("uTime", var3);
      this.UuuNnUvUuv.UuUVuuUu("uEntry", var4);
      this.UuuNnUvUuv.UuUVuuUu("uClickFlash", 0.0F);
      this.UuuNnUvUuv.UuUVuuUu("uLightMode", this.NuunnvnN ? 1.0F : 0.0F);
      this.UuuNnUvUuv.UuUVuuUu("uSakura", this.unNNVVNnvvV == NvVNvUvunNNu.SAKURA_BREEZE ? 1.0F : 0.0F);
      this.UuuNnUvUuv.UuUVuuUu("uVernal", this.unNNVVNnvvV == NvVNvUvunNNu.VERNAL_SOLSTICE ? 1.0F : 0.0F);
      this.UuuNnUvUuv.UuUVuuUu("uHour", this.NVUunUNUN);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.nuUnNvnuUu.uUnuvNvvNU());
      this.VVuuUN.UuUVuuUu();
   }

   private void C00OOC00oO(int var1, int var2, float var3, float var4) {
      GL11.glEnable(3042);
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
      this.nUUVuvU.UuUVuuUu();
      this.UuUVuuUu(this.nUUVuvU, var1, var2, 0.0F, 0.0F, var1, var2);
      this.nUUVuvU.UuUVuuUu("uBackground", 0);
      this.nUUVuvU.UuUVuuUu("uTextureSize", this.nuUnNvnuUu.vVvUvVVuuNvV(), this.nuUnNvnuUu.uNNnnnuuuN());
      this.nUUVuvU.UuUVuuUu("uTime", var3);
      this.nUUVuvU.UuUVuuUu("uAlpha", var4);
      this.nUUVuvU.UuUVuuUu("uAccentTop", UuUVuuUu(this.c0oOOCcCoC0), C00OOC00oO(this.c0oOOCcCoC0), uUnuvNvvNU(this.c0oOOCcCoC0));
      this.nUUVuvU.UuUVuuUu("uAccentBottom", UuUVuuUu(this.VVnVNnunVvu), C00OOC00oO(this.VVnVNnunVvu), uUnuvNvvNU(this.VVnVNnunVvu));
      this.nUUVuvU.UuUVuuUu("uLightMode", this.NuunnvnN ? 1.0F : 0.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.nuUnNvnuUu.uUnuvNvvNU());
      this.VVuuUN.UuUVuuUu();
   }

   private void C00OOC00oO() {
      if (!this.UnUNuUU) {
         this.VVuuUN = new nnUnNnuvvN();
         this.vNUvnnVnUvu = this.uNNnnnuuuN
            .UuUVuuUu("screen_liquid_neon_gas", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_aurora.frag");
         this.uVUuuVnNVU = this.uNNnnnuuuN
            .UuUVuuUu("screen_sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         this.vuuuNvNuv = this.uNNnnnuuuN
            .UuUVuuUu("screen_vernal_solstice", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/vernal_solstice.frag");
         this.nvUVNnuu = this.uNNnnnuuuN
            .UuUVuuUu("screen_midnight_azure", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/midnight_azure.frag");
         this.UuuNnUvUuv = this.uNNnnnuuuN
            .UuUVuuUu("screen_composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.nUUVuvU = this.uNNnnnuuuN
            .UuUVuuUu("screen_mica_wash", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_mica_wash.frag");
         this.UnUNuUU = true;
      }
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.UuUVuuUu("uViewport", var2, var3);
      var1.UuUVuuUu("uRect", var4, var5, var6, var7);
   }

   private void uUnuvNvvNU() {
      NvVNvUvunNNu var1 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.AURORA;
      this.unNNVVNnvvV = var1;
      this.NuunnvnN = uUnuvNvvNU.uUnuvNvvNU(var1);
      this.c0oOOCcCoC0 = uUnuvNvvNU.vVvUvVVuuNvV(var1);
      this.VVnVNnunVvu = uUnuvNvvNU.uNNnnnuuuN(var1);
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, float var4) {
      float var5 = (float)(var2 * var1.method_4489() / Math.max(1.0, (double)var1.method_4486()));
      float var6 = (float)(var3 * var1.method_4506() / Math.max(1.0, (double)var1.method_4502()));
      if (!this.nNvNUVU) {
         this.uVUVnuvnuVuv = this.uVunuUNVVUUV = var5;
         this.NVNnnvnuunNv = this.UNnVVNvvnVvU = var6;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = 0.0F;
         this.nNvNUVU = true;
      } else {
         this.uVUVnuvnuVuv = var5;
         this.NVNnnvnuunNv = var6;
         float var7 = this.uVunuUNVVUUV;
         float var8 = this.UNnVVNvvnVvU;
         float var9 = C00OOC00oO(this.uVUVnuvnuVuv - this.uVunuUNVVUUV, this.NVNnnvnuunNv - this.UNnVVNvvnVvU);
         float var10 = (1.0F - (float)Math.pow(3.5E-5F, var4)) * (0.72F + UuUVuuUu(var9 / 520.0F, 0.0F, 0.42F));
         this.uVunuUNVVUUV = this.uVunuUNVVUUV + (this.uVUVnuvnuVuv - this.uVunuUNVVUUV) * UuUVuuUu(var10, 0.05F, 0.26F);
         this.UNnVVNvvnVvU = this.UNnVVNvvnVvU + (this.NVNnnvnuunNv - this.UNnVVNvvnVvU) * UuUVuuUu(var10, 0.05F, 0.26F);
         float var11 = UuUVuuUu((this.uVunuUNVVUUV - var7) / Math.max(1.0F, (float)var1.method_4489()) / var4, -1.8F, 1.8F);
         float var12 = UuUVuuUu((this.UNnVVNvvnVvU - var8) / Math.max(1.0F, (float)var1.method_4506()) / var4, -1.8F, 1.8F);
         float var13 = 1.0F - (float)Math.pow(0.0025F, var4);
         this.uNnUnnuNUnNu = this.uNnUnnuNUnNu + (var11 - this.uNnUnnuNUnNu) * var13;
         this.NnUuNNU = this.NnUuNNU + (var12 - this.NnUuNNU) * var13;
      }
   }

   @Override
   public void close() {
      this.nuUnNvnuUu.close();
      if (this.VVuuUN != null) {
         this.VVuuUN.close();
         this.VVuuUN = null;
      }

      this.uNNnnnuuuN.close();
      this.vNUvnnVnUvu = null;
      this.uVUuuVnNVU = null;
      this.vuuuNvNuv = null;
      this.nvUVNnuu = null;
      this.UuuNnUvUuv = null;
      this.nUUVuvU = null;
      this.UnUNuUU = false;
      this.UvnvNVnnnnNU = 0L;
      this.vNVuvnUUnuUn = 0L;
      this.UnUNVVVNuv = 0L;
      this.nNvNUVU = false;
   }

   private static float UuUVuuUu(float var0, float var1) {
      return UuUVuuUu(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.16F, 0.72F, 1.38F);
   }

   private static float C00OOC00oO(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float UuUVuuUu(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static int UuUVuuUu(float var0, float var1, float var2, float var3) {
      int var4 = Math.round(UuUVuuUu(var0, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(UuUVuuUu(var1, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(UuUVuuUu(var2, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(UuUVuuUu(var3, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int UuUVuuUu(int var0, int var1) {
      int var2 = Math.max(0, Math.min(255, var1));
      return var0 & 16777215 | var2 << 24;
   }

   private static int uUnuvNvvNU(int var0, int var1, float var2, float var3) {
      float var4 = UuUVuuUu(var2, 0.0F, 1.0F);
      int var5 = VnVnuUn.vVvUvVVuuNvV(var0, var1, var4);
      int var6 = Math.round(UuUVuuUu(var3, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   private static String[] vVvUvVVuuNvV() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }
}

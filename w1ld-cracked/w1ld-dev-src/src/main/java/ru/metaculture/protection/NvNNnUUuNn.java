package ru.metaculture.protection;

import net.minecraft.class_1041;
import net.minecraft.class_310;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class NvNNnUUuNn implements AutoCloseable {
   private static final NvNNnUUuNn UuUVuuUu = new NvNNnUUuNn();
   private static final int C00OOC00oO = 14;
   private static final String uUnuvNvvNU = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final OO0OCoOC vVvUvVVuuNvV = OO0OCoOC.UuUVuuUu();
   private static final String[] uNNnnnuuuN = vNUvnnVnUvu();
   private final uUvVUVnVNV nuUnNvnuUu = new uUvVUVnVNV();
   private final VvNNUnNNVn VVuuUN = new VvNNUnNNVn();
   private nnUnNnuvvN vNUvnnVnUvu;
   private uUvVUVnVNV.NVnVnNnN uVUuuVnNVU;
   private uUvVUVnVNV.NVnVnNnN vuuuNvNuv;
   private uUvVUVnVNV.NVnVnNnN nvUVNnuu;
   private uUvVUVnVNV.NVnVnNnN UuuNnUvUuv;
   private long nUUVuvU;
   private long UnUNVVVNuv;
   private long vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private float NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private float uNnUnnuNUnNu;
   private boolean NnUuNNU;
   private int nNvNUVU = -6357021;
   private int UnUNuUU = -11341636;
   private NvVNvUvunNNu uUVuVvuNUvnu = NvVNvUvunNNu.AURORA;
   private boolean UvUvUNuvNU;
   private boolean c0oOOCcCoC0;
   private boolean VVnVNnunVvu;
   private float unNNVVNnvvV;
   private float NuunnvnN = 1.0F;
   private boolean NVUunUNUN;
   private long UUVNuUNUvUnV;

   public static NvNNnUUuNn UuUVuuUu() {
      return UuUVuuUu;
   }

   public void UuUVuuUu(float var1, float var2) {
      this.unNNVVNnvvV = UuUVuuUu(var1, 0.0F, 1.0F);
      this.NuunnvnN = UuUVuuUu(var2, 0.0F, 1.0F);
   }

   public boolean C00OOC00oO() {
      if (this.VVnVNnunVvu && this.uNNnnnuuuN()) {
         this.VVnVNnunVvu = false;
      }

      return this.VVnVNnunVvu;
   }

   public boolean UuUVuuUu(class_310 var1, int var2, int var3) {
      return this.UuUVuuUu(var1, var2, var3, this.unNNVVNnvvV, this.NuunnvnN);
   }

   public void uUnuvNvvNU() {
      this.NVUunUNUN = true;
      this.UUVNuUNUvUnV = System.nanoTime() + 650000000L;
   }

   public void vVvUvVVuuNvV() {
      if (this.NVUunUNUN && System.nanoTime() >= this.UUVNuUNUvUnV) {
         this.close();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(class_310 var1, int var2, int var3, float var4, float var5) {
      if (this.VVnVNnunVvu) {
         if (!this.uNNnnnuuuN()) {
            return false;
         }

         this.VVnVNnunVvu = false;
      }

      if (var1 != null && var1.method_22683() != null) {
         class_1041 var6 = var1.method_22683();
         if (!var6.method_65966() && var6.method_4489() > 0 && var6.method_4506() > 0) {
            try {
               long var7 = System.nanoTime();
               if (this.nUUVuvU == 0L) {
                  this.nUUVuvU = var7;
                  this.UnUNVVVNuv = var7;
               }

               float var9 = Math.max(0.001F, Math.min(0.05F, (float)(var7 - this.UnUNVVVNuv) / 1.0E9F));
               this.UnUNVVVNuv = var7;
               float var10 = (float)(var7 - this.nUUVuvU) / 1.0E9F;
               var4 = UuUVuuUu(var4, 0.0F, 1.0F);
               var5 = UuUVuuUu(var5, 0.0F, 1.0F);
               this.NVUunUNUN = false;
               this.UUVNuUNUvUnV = 0L;
               this.nuUnNvnuUu();
               this.UuUVuuUu(var6, var2, var3, var9);
               VvuuVNVUn.NVnVnNnN var11 = VvuuVNVUn.UuUVuuUu();
               boolean var15 = false /* VF: Semaphore variable */;

               try {
                  var15 = true;
                  this.UuUVuuUu(var6.method_4489(), var6.method_4506(), var10, var4, var5);
                  this.vVvUvVVuuNvV(var6.method_4489(), var6.method_4506(), var10, var4, var5);
                  var15 = false;
               } finally {
                  if (var15) {
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var11);
                  }
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var11);
               return true;
            } catch (Throwable var17) {
               this.VVnVNnunVvu = true;
               this.close();
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean uNNnnnuuuN() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         return false;
      } else {
         class_310 var1 = class_310.method_1551();
         if (var1 != null && var1.method_22683() != null) {
            class_1041 var2 = var1.method_22683();
            return !var2.method_65966() && var2.method_4489() > 0 && var2.method_4506() > 0;
         } else {
            return false;
         }
      }
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4, float var5) {
      this.nuUnNvnuUu.UuUVuuUu();
      this.VVuuUN();
      float var6 = 0.92F;
      int var7 = Math.max(420, Math.round(var1 * var6));
      int var8 = Math.max(240, Math.round(var2 * var6));
      int var9 = this.VVuuUN.vVvUvVVuuNvV();
      int var10 = this.VVuuUN.uNNnnnuuuN();
      int var11 = VvuuVNVUn.UuUVuuUu(GL11.glGetInteger(36006));
      this.VVuuUN.UuUVuuUu(var7, var8);
      boolean var12 = var9 != this.VVuuUN.vVvUvVVuuNvV() || var10 != this.VVuuUN.uNNnnnuuuN();
      long var13 = System.nanoTime();
      if (var12 || this.vNVuvnUUnuUn == 0L || var13 - this.vNVuvnUUnuUn >= 16666667L) {
         this.C00OOC00oO(var1, var2, var3, var4, var5);
         this.vNVuvnUUnuUn = var13;
      }

      VvuuVNVUn.UuUVuuUu(36160, var11);
      GL11.glViewport(0, 0, var1, var2);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL11.glDisable(3089);
      GL11.glDisable(36281);
      GL11.glColorMask(true, true, true, true);
      this.UuUVuuUu(var1, var2, var3, var5);
      this.uUnuvNvvNU(var1, var2, var3, var4, var5);
   }

   private void C00OOC00oO(int var1, int var2, float var3, float var4, float var5) {
      if (this.VVuuUN.nuUnNvnuUu()) {
         this.VVuuUN.UuUVuuUu();
         GL11.glDisable(3042);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         uUvVUVnVNV.NVnVnNnN var6 = this.uUVuVvuNUvnu == NvVNvUvunNNu.SAKURA_BREEZE ? this.vuuuNvNuv : this.uVUuuVnNVU;
         if (this.uUVuVvuNUvnu == NvVNvUvunNNu.SAKURA_BREEZE) {
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
         }

         var6.UuUVuuUu();
         this.UuUVuuUu(
            var6,
            (float)this.VVuuUN.vVvUvVVuuNvV(),
            (float)this.VVuuUN.uNNnnnuuuN(),
            0.0F,
            0.0F,
            (float)this.VVuuUN.vVvUvVVuuNvV(),
            (float)this.VVuuUN.uNNnnnuuuN()
         );
         var6.UuUVuuUu("uTime", var3);
         var6.UuUVuuUu("uResolution", this.VVuuUN.vVvUvVVuuNvV(), this.VVuuUN.uNNnnnuuuN());
         var6.UuUVuuUu("uMouse", this.UuUVuuUu(var1), this.C00OOC00oO(var2));
         var6.UuUVuuUu("uMouseVelocity", this.UNnVVNvvnVvU, this.uNnUnnuNUnNu);
         var6.UuUVuuUu("uAccentTop", uNNnnnuuuN(this.nNvNUVU), nuUnNvnuUu(this.nNvNUVU), VVuuUN(this.nNvNUVU));
         var6.UuUVuuUu("uAccentBottom", uNNnnnuuuN(this.UnUNuUU), nuUnNvnuUu(this.UnUNuUU), VVuuUN(this.UnUNuUU));
         var6.UuUVuuUu("uActivity", UuUVuuUu(0.36F + var4 * 0.42F, 0.0F, 1.0F));
         var6.UuUVuuUu("uAlpha", var5);
         var6.UuUVuuUu("uLightMode", this.UvUvUNuvNU ? 1.0F : 0.0F);
         this.UuUVuuUu(var6);
         this.vNUvnnVnUvu.UuUVuuUu();
      }
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4) {
      if (this.VVuuUN.nuUnNvnuUu()) {
         GL11.glDisable(3042);
         this.nvUVNnuu.UuUVuuUu();
         this.UuUVuuUu(this.nvUVNnuu, (float)var1, (float)var2, 0.0F, 0.0F, (float)var1, (float)var2);
         this.nvUVNnuu.UuUVuuUu("uTexture", 0);
         this.nvUVNnuu.UuUVuuUu("uTextureSize", this.VVuuUN.vVvUvVVuuNvV(), this.VVuuUN.uNNnnnuuuN());
         this.nvUVNnuu.UuUVuuUu("uParallax", this.uUnuvNvvNU(var1) * 0.0012F, this.vVvUvVVuuNvV(var2) * 0.001F);
         this.nvUVNnuu.UuUVuuUu("uTime", var3);
         this.nvUVNnuu.UuUVuuUu("uEntry", var4);
         this.nvUVNnuu.UuUVuuUu("uClickFlash", 0.0F);
         this.nvUVNnuu.UuUVuuUu("uLightMode", this.UvUvUNuvNU ? 1.0F : 0.0F);
         this.nvUVNnuu.UuUVuuUu("uSakura", this.uUVuVvuNUvnu == NvVNvUvunNNu.SAKURA_BREEZE ? 1.0F : 0.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, this.VVuuUN.uUnuvNvvNU());
         this.vNUvnnVnUvu.UuUVuuUu();
      }
   }

   private void uUnuvNvvNU(int var1, int var2, float var3, float var4, float var5) {
      GL11.glEnable(3042);
      if (this.UvUvUNuvNU) {
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      } else {
         GL14.glBlendFuncSeparate(770, 1, 1, 1);
      }

      this.UuuNnUvUuv.UuUVuuUu();
      this.UuUVuuUu(this.UuuNnUvUuv, (float)var1, (float)var2, 0.0F, 0.0F, (float)var1, (float)var2);
      this.UuuNnUvUuv.UuUVuuUu("uTime", var3);
      this.UuuNnUvUuv.UuUVuuUu("uResolution", var1, var2);
      this.UuuNnUvUuv.UuUVuuUu("uMouse", this.UuUVuuUu(var1), this.C00OOC00oO(var2));
      this.UuuNnUvUuv.UuUVuuUu("uParallax", this.uUnuvNvvNU(var1), this.vVvUvVVuuNvV(var2));
      this.UuuNnUvUuv.UuUVuuUu("uAccentTop", uNNnnnuuuN(this.nNvNUVU), nuUnNvnuUu(this.nNvNUVU), VVuuUN(this.nNvNUVU));
      this.UuuNnUvUuv.UuUVuuUu("uAccentBottom", uNNnnnuuuN(this.UnUNuUU), nuUnNvnuUu(this.UnUNuUU), VVuuUN(this.UnUNuUU));
      this.UuuNnUvUuv.UuUVuuUu("uEntry", UuUVuuUu(var5 * (0.55F + var4 * 0.45F), 0.0F, 1.0F));
      this.UuuNnUvUuv.UuUVuuUu("uLightMode", this.UvUvUNuvNU ? 1.0F : 0.0F);
      this.UuUVuuUu(this.UuuNnUvUuv);
      this.vNUvnnVnUvu.UuUVuuUu();
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
   }

   private void vVvUvVVuuNvV(int var1, int var2, float var3, float var4, float var5) {
      if (!(var5 <= 0.01F)) {
         try {
            NVnVnNnN.uVUuuVnNVU();
            UnVNvNnU var6 = NVnVnNnN.UuUVuuUu();
            if (var6 == null) {
               return;
            }

            var6.UuUVuuUu(var1, var2);
            boolean var7 = false;

            try {
               float var8 = C00OOC00oO(var1, var2);
               float var9 = var1 * 0.5F;
               float var10 = var2 * 0.5F - 58.0F * var8;
               float var11 = UuUVuuUu(Math.min(var1, var2) * 0.112F, 82.0F * var8, 132.0F * var8);
               float var12 = 0.5F + 0.5F * (float)Math.sin(var3 * 1.08F);
               this.UuUVuuUu(var6, var9, var10, var11, var12, var5);
               this.UuUVuuUu(var6, var1, var2, var4, var5, var8, var3);
               var6.C00OOC00oO();
               var7 = true;
            } finally {
               if (!var7) {
                  var6.UuUVuuUu();
               }
            }
         } catch (Throwable var17) {
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6) {
      float var7 = var4 * 0.98F;
      float var8 = var7 * (1.08F + var5 * 0.035F);
      float var9 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", var7).UuUVuuUu;
      float var10 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, "w", var8).UuUVuuUu;
      float var11 = var3 + var4 * 0.148F;
      int var12 = this.UvUvUNuvNU
         ? (this.uUVuVvuNUvnu == NvVNvUvunNNu.VERNAL_SOLSTICE ? UuUVuuUu(0.0196F, 0.0667F, 0.0196F, var6) : UuUVuuUu(0.1F, 0.1F, 0.1F, var6))
         : UuUVuuUu(1.0F, 1.0F, 1.0F, var6);
      var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var2 - var10 * 0.5F, var11 + var4 * 0.002F, var8, "w", C00OOC00oO(this.UnUNuUU, this.nNvNUVU, var5, 0.24F * var6));
      var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var2 - var9 * 0.5F, var11, var7, "w", var12);
   }

   private void UuUVuuUu(UnVNvNnU var1, int var2, int var3, float var4, float var5, float var6, float var7) {
      float var8 = UuUVuuUu(var2 * 0.26F, 292.0F * var6, 520.0F * var6);
      float var9 = Math.max(8.0F * var6, 8.0F);
      float var10 = var2 * 0.5F - var8 * 0.5F;
      float var11 = var3 * 0.5F + 92.0F * var6;
      float var12 = var9 * 0.5F;
      float var13 = Math.max(var9, var8 * UuUVuuUu(var4, 0.0F, 1.0F));
      int var14 = this.UvUvUNuvNU ? UuUVuuUu(0.18F, 0.2F, 0.22F, 0.16F * var5) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.105F * var5);
      int var15 = this.UvUvUNuvNU ? UuUVuuUu(0.1F, 0.11F, 0.12F, 0.16F * var5) : UuUVuuUu(1.0F, 1.0F, 1.0F, 0.15F * var5);
      var1.UuUVuuUu(var10, var11, var8, var9, var12, 18.0F * var6, 0.9F, UuUVuuUu(this.UnUNuUU, Math.round(70.0F * var5)));
      var1.UuUVuuUu(var10, var11, var8, var9, var12, var14);
      var1.UuUVuuUu(var10, var11, var13, var9, var12, C00OOC00oO(this.UnUNuUU, this.nNvNUVU, 0.5F + 0.5F * (float)Math.sin(var7 * 1.15F), 0.86F * var5));
      float var16 = Math.max(46.0F * var6, var8 * 0.18F);
      float var17 = var10 + (var8 + var16) * UuUVuuUu(var4, 0.0F, 1.0F) - var16;
      float var18 = Math.max(var10, var17);
      float var19 = Math.min(var10 + var13, var17 + var16) - var18;
      if (var19 > 0.5F) {
         var1.UuUVuuUu(var18, var11 + var9 * 0.16F, var19, var9 * 0.25F, var9 * 0.125F, UuUVuuUu(1.0F, 1.0F, 1.0F, 0.2F * var5));
      }

      var1.UuUVuuUu(var10, var11, var8, 1.0F * var6, var12, var15);
      String var20 = Math.round(UuUVuuUu(var4, 0.0F, 1.0F) * 100.0F) + "%";
      float var21 = 25.0F * var6;
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var2 * 0.5F,
         var11 + 30.0F * var6,
         var21,
         var20,
         this.UvUvUNuvNU ? UuUVuuUu(0.12F, 0.13F, 0.14F, 0.52F * var5) : UuUVuuUu(0.88F, 0.92F, 0.96F, 0.54F * var5),
         "c"
      );
   }

   private void nuUnNvnuUu() {
      NvVNvUvunNNu var1 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.AURORA;
      this.uUVuVvuNUvnu = var1;
      this.UvUvUNuvNU = vVvUvVVuuNvV.uUnuvNvvNU(var1);
      this.nNvNUVU = vVvUvVVuuNvV.vVvUvVVuuNvV(var1);
      this.UnUNuUU = vVvUvVVuuNvV.uNNnnnuuuN(var1);
   }

   private void UuUVuuUu(class_1041 var1, int var2, int var3, float var4) {
      float var5 = (float)(var2 * var1.method_4489() / Math.max(1.0, (double)var1.method_4486()));
      float var6 = (float)(var3 * var1.method_4506() / Math.max(1.0, (double)var1.method_4502()));
      if (!this.NnUuNNU) {
         this.UvnvNVnnnnNU = this.NVNnnvnuunNv = var5;
         this.uVUVnuvnuVuv = this.uVunuUNVVUUV = var6;
         this.UNnVVNvvnVvU = 0.0F;
         this.uNnUnnuNUnNu = 0.0F;
         this.NnUuNNU = true;
      } else {
         this.UvnvNVnnnnNU = var5;
         this.uVUVnuvnuVuv = var6;
         float var7 = this.NVNnnvnuunNv;
         float var8 = this.uVunuUNVVUUV;
         float var9 = uUnuvNvvNU(this.UvnvNVnnnnNU - this.NVNnnvnuunNv, this.uVUVnuvnuVuv - this.uVunuUNVVUUV);
         float var10 = (1.0F - (float)Math.pow(3.5E-5F, var4)) * (0.72F + UuUVuuUu(var9 / 520.0F, 0.0F, 0.42F));
         this.NVNnnvnuunNv = this.NVNnnvnuunNv + (this.UvnvNVnnnnNU - this.NVNnnvnuunNv) * UuUVuuUu(var10, 0.05F, 0.26F);
         this.uVunuUNVVUUV = this.uVunuUNVVUUV + (this.uVUVnuvnuVuv - this.uVunuUNVVUUV) * UuUVuuUu(var10, 0.05F, 0.26F);
         float var11 = UuUVuuUu((this.NVNnnvnuunNv - var7) / Math.max(1.0F, (float)var1.method_4489()) / var4, -1.8F, 1.8F);
         float var12 = UuUVuuUu((this.uVunuUNVVUUV - var8) / Math.max(1.0F, (float)var1.method_4506()) / var4, -1.8F, 1.8F);
         float var13 = 1.0F - (float)Math.pow(0.0025F, var4);
         this.UNnVVNvvnVvU = this.UNnVVNvvnVvU + (var11 - this.UNnVVNvvnVvU) * var13;
         this.uNnUnnuNUnNu = this.uNnUnnuNUnNu + (var12 - this.uNnUnnuNUnNu) * var13;
      }
   }

   private float UuUVuuUu(int var1) {
      return this.NVNnnvnuunNv / Math.max(1.0F, (float)var1);
   }

   private float C00OOC00oO(int var1) {
      return this.uVunuUNVVUUV / Math.max(1.0F, (float)var1);
   }

   private float uUnuvNvvNU(int var1) {
      return (this.UuUVuuUu(var1) - 0.5F) * 10.0F;
   }

   private float vVvUvVVuuNvV(int var1) {
      return (this.C00OOC00oO(var1) - 0.5F) * 8.0F;
   }

   private void VVuuUN() {
      if (!this.c0oOOCcCoC0) {
         this.vNUvnnVnUvu = new nnUnNnuvvN();
         this.uVUuuVnNVU = this.nuUnNvnuUu
            .UuUVuuUu("loading_liquid_neon_gas", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_aurora.frag");
         this.vuuuNvNuv = this.nuUnNvnuUu
            .UuUVuuUu("loading_sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         this.nvUVNnuu = this.nuUnNvnuUu
            .UuUVuuUu("loading_composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.UuuNnUvUuv = this.nuUnNvnuUu
            .UuUVuuUu("loading_particles", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_particles.frag");
         this.c0oOOCcCoC0 = true;
      }
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      var1.UuUVuuUu("uViewport", var2, var3);
      var1.UuUVuuUu("uRect", var4, var5, var6, var7);
   }

   private void UuUVuuUu(uUvVUVnVNV.NVnVnNnN var1) {
      for (int var2 = 0; var2 < 14; var2++) {
         var1.UuUVuuUu(uNNnnnuuuN[var2], 0.0F, 0.0F, 100.0F, 0.0F);
      }
   }

   private static String[] vNUvnnVnUvu() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }

   @Override
   public void close() {
      this.VVuuUN.close();
      if (this.vNUvnnVnUvu != null) {
         this.vNUvnnVnUvu.close();
         this.vNUvnnVnUvu = null;
      }

      this.nuUnNvnuUu.close();
      this.c0oOOCcCoC0 = false;
      this.unNNVVNnvvV = 0.0F;
      this.NuunnvnN = 1.0F;
      this.NVUunUNUN = false;
      this.UUVNuUNUvUnV = 0L;
      this.nUUVuvU = 0L;
      this.UnUNVVVNuv = 0L;
      this.vNVuvnUUnuUn = 0L;
      this.UvnvNVnnnnNU = 0.0F;
      this.uVUVnuvnuVuv = 0.0F;
      this.NVNnnvnuunNv = 0.0F;
      this.uVunuUNVVUUV = 0.0F;
      this.UNnVVNvvnVvU = 0.0F;
      this.uNnUnnuNUnNu = 0.0F;
      this.NnUuNNU = false;
   }

   private static float C00OOC00oO(float var0, float var1) {
      return UuUVuuUu(Math.min(var0 / 1920.0F, var1 / 1080.0F) * 1.16F, 0.72F, 1.38F);
   }

   private static float uUnuvNvvNU(float var0, float var1) {
      return (float)Math.sqrt(var0 * var0 + var1 * var1);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static float uNNnnnuuuN(int var0) {
      return (var0 >> 16 & 0xFF) / 255.0F;
   }

   private static float nuUnNvnuUu(int var0) {
      return (var0 >> 8 & 0xFF) / 255.0F;
   }

   private static float VVuuUN(int var0) {
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

   private static int C00OOC00oO(int var0, int var1, float var2, float var3) {
      float var4 = UuUVuuUu(var2, 0.0F, 1.0F);
      int var5 = VnVnuUn.vVvUvVVuuNvV(var0, var1, var4);
      int var6 = Math.round(UuUVuuUu(var3, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }
}

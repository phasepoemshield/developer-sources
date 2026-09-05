package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

public final class C0cc0cCOo0O implements AutoCloseable {
   private static final Logger vVvUvVVuuNvV = LogManager.getLogger("GlowESP");
   private static final String uNNnnnuuuN = "assets/wild/shaders/glowesp/fullscreen.vert";
   private static final String nuUnNvnuUu = "assets/wild/shaders/glowesp/mask.frag";
   private static final String VVuuUN = "assets/wild/shaders/glowesp/shadow.frag";
   private static final String vNUvnnVnUvu = "assets/wild/shaders/glowesp/gradient.frag";
   private static final String uVUuuVnNVU = "assets/wild/shaders/glowesp/dominant_color.frag";
   private static final String vuuuNvNuv = "assets/wild/shaders/blur/blur_downsample.frag";
   private static final int nvUVNnuu = 63;
   private static final int UuuNnUvUuv = 2;
   private static final float nUUVuvU = 8.0F;
   private final C0cc0cCOo0O.VvunVVUvUNnv UnUNVVVNuv = new C0cc0cCOo0O.VvunVVUvUNnv();
   private final C0cc0cCOo0O.VvunVVUvUNnv vNVuvnUUnuUn = new C0cc0cCOo0O.VvunVVUvUNnv();
   private final C0cc0cCOo0O.VvunVVUvUNnv UvnvNVnnnnNU = new C0cc0cCOo0O.VvunVVUvUNnv();
   private final C0cc0cCOo0O.VvunVVUvUNnv uVUVnuvnuVuv = new C0cc0cCOo0O.VvunVVUvUNnv();
   private final C0cc0cCOo0O.VvunVVUvUNnv NVNnnvnuunNv = new C0cc0cCOo0O.VvunVVUvUNnv();
   private vVvUNNUVVnNn uVunuUNVVUUV;
   private vVvUNNUVVnNn UNnVVNvvnVvU;
   private vVvUNNUVVnNn uNnUnnuNUnNu;
   private vVvUNNUVVnNn NnUuNNU;
   private vVvUNNUVVnNn nNvNUVU;
   private int UnUNuUU;
   private int uUVuVvuNUvnu;
   private boolean UvUvUNuvNU;
   private boolean c0oOOCcCoC0;
   private String VVnVNnunVvu = "not-run";
   private int unNNVVNnvvV;
   private int NuunnvnN;
   private int NVUunUNUN = -1;
   private final float[] UUVNuUNUvUnV = new float[64];
   public static final int UuUVuuUu = 0;
   public static final int C00OOC00oO = 1;
   public static final int uUnuvNvvNU = 2;

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, C0cc0cCOo0O.nvnNNunvv var5) {
      return this.UuUVuuUu(var1, var2, var1, var3, var4, var5, null);
   }

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, C0cc0cCOo0O.nvnNNunvv var5, C0cc0cCOo0O.NVnVnNnN var6) {
      return this.UuUVuuUu(var1, var2, var1, var3, var4, var5, var6);
   }

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, C0cc0cCOo0O.nvnNNunvv var5, C0cc0cCOo0O.NVnVnNnN var6, int var7, int var8, int var9) {
      return this.UuUVuuUu(var1, var2, var1, var3, var4, var5, var6, var7, var8, var9);
   }

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, int var5, C0cc0cCOo0O.nvnNNunvv var6) {
      return this.UuUVuuUu(var1, var2, var3, var4, var5, var6, null);
   }

   public boolean UuUVuuUu(int var1, int var2, int var3, int var4, int var5, C0cc0cCOo0O.nvnNNunvv var6, C0cc0cCOo0O.NVnVnNnN var7) {
      return this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, 0, 0, 0);
   }

   public boolean UuUVuuUu(
      int var1, int var2, int var3, int var4, int var5, C0cc0cCOo0O.nvnNNunvv var6, C0cc0cCOo0O.NVnVnNnN var7, int var8, int var9, int var10
   ) {
      if (this.c0oOOCcCoC0) {
         this.VVnVNnunVvu = "renderer-broken";
         return false;
      } else if (var1 <= 0 || var4 <= 0 || var5 <= 0 || var6 == null) {
         this.VVnVNnunVvu = "invalid-input";
         return false;
      } else if (!vNUvnnVnUvu()) {
         this.VVnVNnunVvu = "no-render-context";
         return false;
      } else {
         try {
            boolean var11 = this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
            this.VVnVNnunVvu = var11 ? "rendered" : this.VVnVNnunVvu;
            return var11;
         } catch (Throwable var12) {
            this.c0oOOCcCoC0 = true;
            this.VVnVNnunVvu = "exception:" + var12.getClass().getSimpleName() + ":" + var12.getMessage();
            vVvUvVVuuNvV.warn("GlowESP renderer disabled", var12);
            return false;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean C00OOC00oO(
      int var1, int var2, int var3, int var4, int var5, C0cc0cCOo0O.nvnNNunvv var6, C0cc0cCOo0O.NVnVnNnN var7, int var8, int var9, int var10
   ) {
      VvuuVNVUn.NVnVnNnN var11 = VvuuVNVUn.UuUVuuUu();
      boolean var19 = false /* VF: Semaphore variable */;

      int var21;
      label89: {
         int var22;
         label88: {
            boolean var23;
            label87: {
               try {
                  var19 = true;
                  this.vVvUvVVuuNvV();
                  C0cc0cCOo0O.NVnVnNnN var12 = UuUVuuUu(var7, var4, var5);
                  if (!this.UuUVuuUu(this.UnUNVVVNuv, var4, var5)) {
                     this.VVnVNnunVvu = "mask-target-incomplete";
                     var21 = 0;
                     var19 = false;
                     break label89;
                  }

                  if (var12 != null) {
                     this.C00OOC00oO(this.UnUNVVVNuv, var12);
                  }

                  var21 = this.UuUVuuUu(var1, var2, var4, var5, var12, var8, var9, var10);
                  int var14 = 0;
                  if (var6.autoColor != 0) {
                     if (!this.UuUVuuUu(this.NVNnnvnuunNv, 1, 1)) {
                        this.VVnVNnunVvu = "dominant-color-target-incomplete";
                        var22 = 0;
                        var19 = false;
                        break label88;
                     }

                     var14 = this.UuUVuuUu(var3 > 0 ? var3 : var1);
                  }

                  var22 = var21;
                  if (var6.glowStrength > 0.001F || var6.debugView == 2) {
                     var22 = this.UuUVuuUu(var21, var4, var5, var6.radius, var12);
                     if (var22 == 0) {
                        this.VVnVNnunVvu = "blur-target-incomplete";
                        var23 = false;
                        var19 = false;
                        break label87;
                     }
                  }

                  var23 = this.UuUVuuUu(var21, var22, var14, var4, var5, var6, var11, var12);
                  var19 = false;
               } finally {
                  if (var19) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL13.glActiveTexture(33987);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33986);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33985);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     VvuuVNVUn.uUnuvNvvNU(var11);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL13.glActiveTexture(33987);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33986);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               VvuuVNVUn.uUnuvNvvNU(var11);
               return var23;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL13.glActiveTexture(33987);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33986);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33985);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            VvuuVNVUn.uUnuvNvvNU(var11);
            return var23;
         }

         GL20.glUseProgram(0);
         GL30.glBindVertexArray(0);
         GL13.glActiveTexture(33987);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33986);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         VvuuVNVUn.uUnuvNvvNU(var11);
         return (boolean)var22;
      }

      GL20.glUseProgram(0);
      GL30.glBindVertexArray(0);
      GL13.glActiveTexture(33987);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33986);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, 0);
      VvuuVNVUn.uUnuvNvvNU(var11);
      return (boolean)var21;
   }

   private int UuUVuuUu(int var1, int var2, int var3, int var4, C0cc0cCOo0O.NVnVnNnN var5, int var6, int var7, int var8) {
      boolean var9 = var8 != 0 && var6 > 0;
      this.nuUnNvnuUu();
      this.uVunuUNVVUUV.UuUVuuUu();
      UuUVuuUu(this.uVunuUNVVUUV, "uSource", 0);
      UuUVuuUu(this.uVunuUNVVUUV, "uDepthSource", 1);
      UuUVuuUu(this.uVunuUNVVUUV, "uTagged", 2);
      UuUVuuUu(this.uVunuUNVVUUV, "uTaggedDepth", 3);
      UuUVuuUu(this.uVunuUNVVUUV, "uHasDepth", var2 > 0 ? 1 : 0);
      UuUVuuUu(this.uVunuUNVVUUV, "uTagMode", var9 ? var8 : 0);
      UuUVuuUu(this.uVunuUNVVUUV, "uThreshold", 0.05F);
      this.UuUVuuUu(this.UnUNVVVNuv, var5);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var1);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, var2 > 0 ? var2 : var1);
      GL13.glActiveTexture(33986);
      GL11.glBindTexture(3553, var9 ? var6 : var1);
      GL13.glActiveTexture(33987);
      GL11.glBindTexture(3553, var9 && var7 > 0 ? var7 : var1);
      this.VVuuUN();
      return this.UnUNVVVNuv.C00OOC00oO;
   }

   private int UuUVuuUu(int var1, int var2, int var3, float var4, C0cc0cCOo0O.NVnVnNnN var5) {
      int var6 = UuUVuuUu(var4, var2, var3);
      int var7 = var6 > 1 ? Math.max(1, var2 / var6) : var2;
      int var8 = var6 > 1 ? Math.max(1, var3 / var6) : var3;
      int var9 = var1;
      C0cc0cCOo0O.NVnVnNnN var10 = UuUVuuUu(var5, var7, var8, var2, var3);
      if (var6 > 1) {
         if (!this.UuUVuuUu(this.vNVuvnUUnuUn, var7, var8)) {
            return 0;
         }

         if (var5 != null) {
            this.C00OOC00oO(this.vNVuvnUUnuUn, var10);
         }

         var9 = this.UuUVuuUu(var1, var2, var3, var10);
      }

      if (this.UuUVuuUu(this.UvnvNVnnnnNU, var7, var8) && this.UuUVuuUu(this.uVUVnuvnuVuv, var7, var8)) {
         if (var5 != null) {
            this.C00OOC00oO(this.UvnvNVnnnnNU, var10);
            this.C00OOC00oO(this.uVUVnuvnuVuv, var10);
         }

         int var11 = Math.max(1, Math.min(63, Math.round(var4 / var6)));
         float[] var12 = this.C00OOC00oO(var11);
         this.nuUnNvnuUu();
         this.UNnVVNvvnVvU.UuUVuuUu();
         UuUVuuUu(this.UNnVVNvvnVvU, "uSource", 0);
         UuUVuuUu(this.UNnVVNvvnVvU, "uTexelSize", 1.0F / var7, 1.0F / var8);
         UuUVuuUu(this.UNnVVNvvnVvU, "uRadius", var11);
         int var13 = this.UNnVVNvvnVvU.UuUVuuUu("uKernel[0]");
         if (var13 >= 0) {
            GL20.glUniform1fv(var13, var12);
         }

         this.UuUVuuUu(this.UvnvNVnnnnNU, var10);
         UuUVuuUu(this.UNnVVNvvnVvU, "uDirection", 1.0F, 0.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var9);
         this.VVuuUN();
         this.UuUVuuUu(this.uVUVnuvnuVuv, var10);
         UuUVuuUu(this.UNnVVNvvnVvU, "uDirection", 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.UvnvNVnnnnNU.C00OOC00oO);
         this.VVuuUN();
         return this.uVUVnuvnuVuv.C00OOC00oO;
      } else {
         return 0;
      }
   }

   private int UuUVuuUu(int var1, int var2, int var3, C0cc0cCOo0O.NVnVnNnN var4) {
      this.nuUnNvnuUu();
      this.nNvNUVU.UuUVuuUu();
      UuUVuuUu(this.nNvNUVU, "uSource", 0);
      UuUVuuUu(this.nNvNUVU, "uTexelSize", 1.0F / var2, 1.0F / var3);
      UuUVuuUu(this.nNvNUVU, "uOffset", 1.0F);
      this.UuUVuuUu(this.vNVuvnUUnuUn, var4);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var1);
      this.VVuuUN();
      return this.vNVuvnUUnuUn.C00OOC00oO;
   }

   private int UuUVuuUu(int var1) {
      this.nuUnNvnuUu();
      this.NnUuNNU.UuUVuuUu();
      UuUVuuUu(this.NnUuNNU, "uSource", 0);
      this.UuUVuuUu(this.NVNnnvnuunNv);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, var1);
      this.VVuuUN();
      return this.NVNnnvnuunNv.C00OOC00oO;
   }

   private boolean UuUVuuUu(int var1, int var2, int var3, int var4, int var5, C0cc0cCOo0O.nvnNNunvv var6, VvuuVNVUn.NVnVnNnN var7, C0cc0cCOo0O.NVnVnNnN var8) {
      GL30.glBindFramebuffer(36009, var7.UuUVuuUu);
      this.unNNVVNnvvV = var7.UuUVuuUu;
      this.NuunnvnN = GL30.glCheckFramebufferStatus(36009);
      if (this.NuunnvnN != 36053) {
         this.VVnVNnunVvu = "output-framebuffer-incomplete";
         return false;
      } else {
         GL11.glDrawBuffer(var7.uUnuvNvvNU);
         GL11.glViewport(var7.uNNnnnuuuN[0], var7.uNNnnnuuuN[1], var7.uNNnnnuuuN[2], var7.uNNnnnuuuN[3]);
         UuUVuuUu(var8, var4, var5, var7);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(36281);
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.uNnUnnuNUnNu.UuUVuuUu();
         UuUVuuUu(this.uNnUnnuNUnNu, "uMask", 0);
         UuUVuuUu(this.uNnUnnuNUnNu, "uBlur", 1);
         UuUVuuUu(this.uNnUnnuNUnNu, "uAutoColor", 2);
         UuUVuuUu(this.uNnUnnuNUnNu, "uAutoColorEnabled", var6.autoColor);
         UuUVuuUu(this.uNnUnnuNUnNu, "uTexelSize", 1.0F / var4, 1.0F / var5);
         UuUVuuUu(this.uNnUnnuNUnNu, "uOutlineWidth", var6.outlineWidth);
         UuUVuuUu(this.uNnUnnuNUnNu, "uGlowStrength", var6.glowStrength);
         UuUVuuUu(this.uNnUnnuNUnNu, "uOutlineStrength", var6.outlineStrength);
         UuUVuuUu(this.uNnUnnuNUnNu, "uOpacity", var6.opacity);
         UuUVuuUu(this.uNnUnnuNUnNu, "uDebugView", var6.debugView);
         UuUVuuUu(this.uNnUnnuNUnNu, "uColorStyle", var6.colorStyle);
         UuUVuuUu(this.uNnUnnuNUnNu, "uTime", (float)(System.nanoTime() % 30000000000L) / 1.0E9F);
         UuUVuuUu(this.uNnUnnuNUnNu, "uColorTop", var6.topR, var6.topG, var6.topB, 1.0F);
         UuUVuuUu(this.uNnUnnuNUnNu, "uColorBottom", var6.bottomR, var6.bottomG, var6.bottomB, 1.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var1);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, var2);
         GL13.glActiveTexture(33986);
         GL11.glBindTexture(3553, var3);
         GL30.glBindVertexArray(this.UnUNuUU);
         this.VVuuUN();
         return true;
      }
   }

   public String UuUVuuUu() {
      return this.VVnVNnunVvu;
   }

   public int C00OOC00oO() {
      return this.unNNVVNnvvV;
   }

   public int uUnuvNvvNU() {
      return this.NuunnvnN;
   }

   private void vVvUvVVuuNvV() {
      if (!this.UvUvUNuvNU) {
         this.uVunuUNVVUUV = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/mask.frag");
         this.UNnVVNvvnVvU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/shadow.frag");
         this.uNnUnnuNUnNu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/gradient.frag");
         this.NnUuNNU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/dominant_color.frag");
         this.nNvNUVU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/blur/blur_downsample.frag");
         this.UnUNuUU = GL30.glGenVertexArrays();
         this.uUVuVvuNUvnu = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.UnUNuUU);
         GL15.glBindBuffer(34962, this.uUVuVvuNUvnu);
         float[] var1 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
         GL15.glBufferData(34962, var1, 35044);
         byte var2 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var2, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var2, 8L);
         this.UvUvUNuvNU = true;
      }
   }

   private boolean UuUVuuUu(C0cc0cCOo0O.VvunVVUvUNnv var1, int var2, int var3) {
      if (var1.C00OOC00oO != 0 && (var1.uUnuvNvvNU != var2 || var1.vVvUvVVuuNvV != var3 || var1.UuUVuuUu == 0)) {
         this.C00OOC00oO(var1);
      }

      if (var1.C00OOC00oO == 0) {
         var1.C00OOC00oO = GL11.glGenTextures();
         GL11.glBindTexture(3553, var1.C00OOC00oO);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         o000OOoCO0OO.UuUVuuUu(32856, var2, var3, 6408, 5121);
         var1.UuUVuuUu = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, var1.C00OOC00oO, 0);
         GL11.glDrawBuffer(36064);
         if (GL30.glCheckFramebufferStatus(36160) != 36053) {
            this.C00OOC00oO(var1);
            return false;
         }

         var1.uNNnnnuuuN = true;
         var1.nuUnNvnuUu = null;
      }

      var1.uUnuvNvvNU = var2;
      var1.vVvUvVVuuNvV = var3;
      return true;
   }

   private void UuUVuuUu(C0cc0cCOo0O.VvunVVUvUNnv var1) {
      GL30.glBindFramebuffer(36160, var1.UuUVuuUu);
      GL11.glDrawBuffer(36064);
      GL11.glViewport(0, 0, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
   }

   private void UuUVuuUu(C0cc0cCOo0O.VvunVVUvUNnv var1, C0cc0cCOo0O.NVnVnNnN var2) {
      this.UuUVuuUu(var1);
      C00OOC00oO(var2, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
      if (var2 == null) {
         var1.uNNnnnuuuN = true;
         var1.nuUnNvnuUu = null;
      }
   }

   private void C00OOC00oO(C0cc0cCOo0O.VvunVVUvUNnv var1, C0cc0cCOo0O.NVnVnNnN var2) {
      this.UuUVuuUu(var1);
      GL11.glColorMask(true, true, true, true);
      if (var2 != null && !var1.uNNnnnuuuN) {
         C0cc0cCOo0O.NVnVnNnN var3 = var1.nuUnNvnuUu;
         if (var3 != null) {
            C00OOC00oO(var3, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
            this.uNNnnnuuuN();
         }

         C00OOC00oO(var2, var1.uUnuvNvvNU, var1.vVvUvVVuuNvV);
         this.uNNnnnuuuN();
         var1.nuUnNvnuUu = var2;
      } else {
         GL11.glDisable(3089);
         this.uNNnnnuuuN();
         var1.uNNnnnuuuN = false;
         var1.nuUnNvnuUu = var2;
      }
   }

   private void uNNnnnuuuN() {
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         FloatBuffer var2 = var1.floats(0.0F, 0.0F, 0.0F, 0.0F);
         GL30.glClearBufferfv(6144, 0, var2);
      } catch (Throwable var5) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var1 != null) {
         var1.close();
      }
   }

   private void nuUnNvnuUu() {
      GL11.glDisable(3089);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL11.glDisable(3042);
      GL11.glDisable(36281);
      GL11.glColorMask(true, true, true, true);
      GL11.glDepthMask(false);
      GL30.glBindVertexArray(this.UnUNuUU);
   }

   private float[] C00OOC00oO(int var1) {
      if (this.NVUunUNUN == var1) {
         return this.UUVNuUNUvUnV;
      } else {
         for (int var2 = 0; var2 < this.UUVNuUNUvUnV.length; var2++) {
            this.UUVNuUNUvUnV[var2] = 0.0F;
         }

         float var7 = Math.max(var1 * 0.5F, 0.5F);
         float var3 = 2.0F * var7 * var7;
         float var4 = 0.0F;

         for (int var5 = 0; var5 <= var1; var5++) {
            float var6 = (float)Math.exp(-(var5 * var5) / var3);
            this.UUVNuUNUvUnV[var5] = var6;
            var4 += var5 == 0 ? var6 : var6 * 2.0F;
         }

         float var8 = var4 > 0.0F ? 1.0F / var4 : 1.0F;

         for (int var9 = 0; var9 <= var1; var9++) {
            this.UUVNuUNUvUnV[var9] = this.UUVNuUNUvUnV[var9] * var8;
         }

         this.NVUunUNUN = var1;
         return this.UUVNuUNUvUnV;
      }
   }

   private static int UuUVuuUu(float var0, int var1, int var2) {
      return !(var0 < 8.0F) && var1 >= 2 && var2 >= 2 ? 2 : 1;
   }

   private static C0cc0cCOo0O.NVnVnNnN UuUVuuUu(C0cc0cCOo0O.NVnVnNnN var0, int var1, int var2) {
      if (var0 != null && var1 > 0 && var2 > 0) {
         int var3 = Math.max(0, var0.x);
         int var4 = Math.max(0, var0.y);
         int var5 = Math.min(var1, var0.x + var0.width);
         int var6 = Math.min(var2, var0.y + var0.height);
         int var7 = var5 - var3;
         int var8 = var6 - var4;
         if (var7 > 0 && var8 > 0) {
            long var9 = (long)var7 * var8;
            long var11 = (long)var1 * var2;
            return var9 >= var11 * 9L / 10L ? null : new C0cc0cCOo0O.NVnVnNnN(var3, var4, var7, var8);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static C0cc0cCOo0O.NVnVnNnN UuUVuuUu(C0cc0cCOo0O.NVnVnNnN var0, int var1, int var2, int var3, int var4) {
      if (var0 != null && var1 > 0 && var2 > 0 && var3 > 0 && var4 > 0) {
         float var5 = (float)var1 / var3;
         float var6 = (float)var2 / var4;
         int var7 = (int)Math.floor(var0.x * var5);
         int var8 = (int)Math.floor(var0.y * var6);
         int var9 = (int)Math.ceil((var0.x + var0.width) * var5);
         int var10 = (int)Math.ceil((var0.y + var0.height) * var6);
         return UuUVuuUu(new C0cc0cCOo0O.NVnVnNnN(var7, var8, var9 - var7, var10 - var8), var1, var2);
      } else {
         return null;
      }
   }

   private static void C00OOC00oO(C0cc0cCOo0O.NVnVnNnN var0, int var1, int var2) {
      if (var0 == null) {
         GL11.glDisable(3089);
      } else {
         GL11.glEnable(3089);
         GL11.glScissor(var0.x, var2 - var0.y - var0.height, var0.width, var0.height);
      }
   }

   private static void UuUVuuUu(C0cc0cCOo0O.NVnVnNnN var0, int var1, int var2, VvuuVNVUn.NVnVnNnN var3) {
      C0cc0cCOo0O.NVnVnNnN var4 = UuUVuuUu(var0, var3.uNNnnnuuuN[2], var3.uNNnnnuuuN[3], var1, var2);
      if (var4 == null) {
         GL11.glDisable(3089);
      } else {
         GL11.glEnable(3089);
         GL11.glScissor(var3.uNNnnnuuuN[0] + var4.x, var3.uNNnnnuuuN[1] + var3.uNNnnnuuuN[3] - var4.y - var4.height, var4.width, var4.height);
      }
   }

   private void VVuuUN() {
      VUVuvNNVvN.UuUVuuUu().UuUVuuUu(2);
      GL11.glDrawArrays(5, 0, 4);
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, int var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, var2);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2) {
      int var3 = var0.UuUVuuUu(var1);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, var2);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3) {
      int var4 = var0.UuUVuuUu(var1);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, var2, var3);
      }
   }

   private static void UuUVuuUu(vVvUNNUVVnNn var0, String var1, float var2, float var3, float var4, float var5) {
      int var6 = var0.UuUVuuUu(var1);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, var2, var3, var4, var5);
      }
   }

   private static boolean vNUvnnVnUvu() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private void C00OOC00oO(C0cc0cCOo0O.VvunVVUvUNnv var1) {
      if (var1.UuUVuuUu != 0) {
         GL30.glDeleteFramebuffers(var1.UuUVuuUu);
      }

      if (var1.C00OOC00oO != 0) {
         GL11.glDeleteTextures(var1.C00OOC00oO);
      }

      var1.UuUVuuUu = 0;
      var1.C00OOC00oO = 0;
      var1.uUnuvNvvNU = 0;
      var1.vVvUvVVuuNvV = 0;
      var1.uNNnnnuuuN = true;
      var1.nuUnNvnuUu = null;
   }

   @Override
   public void close() {
      if (!vNUvnnVnUvu()) {
         this.UvUvUNuvNU = false;
         this.c0oOOCcCoC0 = false;
      } else {
         this.C00OOC00oO(this.UnUNVVVNuv);
         this.C00OOC00oO(this.vNVuvnUUnuUn);
         this.C00OOC00oO(this.UvnvNVnnnnNU);
         this.C00OOC00oO(this.uVUVnuvnuVuv);
         this.C00OOC00oO(this.NVNnnvnuunNv);
         if (this.UnUNuUU != 0) {
            GL30.glDeleteVertexArrays(this.UnUNuUU);
            this.UnUNuUU = 0;
         }

         if (this.uUVuVvuNUvnu != 0) {
            GL15.glDeleteBuffers(this.uUVuVvuNUvnu);
            this.uUVuVvuNUvnu = 0;
         }

         if (this.uVunuUNVVUUV != null) {
            this.uVunuUNVVUUV.C00OOC00oO();
            this.uVunuUNVVUUV = null;
         }

         if (this.UNnVVNvvnVvU != null) {
            this.UNnVVNvvnVvU.C00OOC00oO();
            this.UNnVVNvvnVvU = null;
         }

         if (this.uNnUnnuNUnNu != null) {
            this.uNnUnnuNUnNu.C00OOC00oO();
            this.uNnUnnuNUnNu = null;
         }

         if (this.NnUuNNU != null) {
            this.NnUuNNU.C00OOC00oO();
            this.NnUuNNU = null;
         }

         if (this.nNvNUVU != null) {
            this.nNvNUVU.C00OOC00oO();
            this.nNvNUVU = null;
         }

         this.NVUunUNUN = -1;
         this.UvUvUNuvNU = false;
         this.c0oOOCcCoC0 = false;
      }
   }

   public record NVnVnNnN(int x, int y, int width, int height) {
   }

   static final class VvunVVUvUNnv {
      int UuUVuuUu;
      int C00OOC00oO;
      int uUnuvNvvNU;
      int vVvUvVVuuNvV;
      boolean uNNnnnuuuN = true;
      C0cc0cCOo0O.NVnVnNnN nuUnNvnuUu;
   }

   public record nvnNNunvv(
      float radius,
      float outlineWidth,
      float glowStrength,
      float outlineStrength,
      float opacity,
      int debugView,
      int colorStyle,
      int autoColor,
      float topR,
      float topG,
      float topB,
      float bottomR,
      float bottomG,
      float bottomB
   ) {
   }
}

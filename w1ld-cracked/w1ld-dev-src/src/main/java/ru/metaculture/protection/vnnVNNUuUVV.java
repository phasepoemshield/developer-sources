package ru.metaculture.protection;

import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class vnnVNNUuUVV {
   private static final vnnVNNUuUVV UuUVuuUu = new vnnVNNUuUVV();
   private static final String C00OOC00oO = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/hud/lux_fracture_edge.frag";
   private static final long vVvUvVVuuNvV = 3000000L;
   private static final float uNNnnnuuuN = 1.0F;
   private static final float nuUnNvnuUu = 2.5F;
   private vVvUNNUVVnNn VVuuUN;
   private int vNUvnnVnUvu;
   private int uVUuuVnNVU;
   private int vuuuNvNuv = -1;
   private int nvUVNnuu = -1;
   private int UuuNnUvUuv = -1;
   private int nUUVuvU = -1;
   private int UnUNVVVNuv = -1;
   private int vNVuvnUUnuUn = -1;
   private int UvnvNVnnnnNU = -1;
   private int uVUVnuvnuVuv = -1;
   private int NVNnnvnuunNv = -1;
   private int uVunuUNVVUUV = -1;
   private int UNnVVNvvnVvU = -1;
   private int uNnUnnuNUnNu = -1;
   private int NnUuNNU = -1;
   private int nNvNUVU = -1;
   private int UnUNuUU = -1;
   private int uUVuVvuNUvnu = -1;
   private int UvUvUNuvNU = -1;
   private int c0oOOCcCoC0 = -1;
   private int VVnVNnunVvu = -1;
   private int unNNVVNnvvV = -1;
   private int NuunnvnN = -1;
   private int NVUunUNUN = -1;
   private int UUVNuUNUvUnV = -1;
   private boolean vuvnUnVnUNnV;
   private boolean nnuUVNUuvvVU;
   private int nVVUuvuNnUN;
   private int nNnVnUNVV;
   private int nuunNvv;
   private long uUVVvVVNvvn = Long.MIN_VALUE;
   private float vvUVNVvvNUv;
   private float UuNnnVnuNNV;
   private float uUVvnUuNvvN;
   private long UUuUnNVNuuv = Long.MIN_VALUE;

   private vnnVNNUuUVV() {
   }

   static boolean UuUVuuUu(
      UnVNvNnU var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      boolean var7,
      int var8,
      int var9,
      int var10,
      int var11,
      boolean var12,
      boolean var13,
      float var14
   ) {
      return UuUVuuUu.C00OOC00oO(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   private boolean C00OOC00oO(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      boolean var8,
      int var9,
      int var10,
      int var11,
      int var12,
      boolean var13,
      boolean var14,
      float var15
   ) {
      class_310 var16 = class_310.method_1551();
      if (!this.nnuUVNUuvvVU && var1 != null && var16 != null && var16.method_22683() != null && !(var4 <= 1.0F) && !(var5 <= 1.0F) && !(var7 <= 0.001F)) {
         int var17 = var16.method_22683().method_4489();
         int var18 = var16.method_22683().method_4506();
         if (var17 > 1 && var18 > 1 && this.UuUVuuUu()) {
            var1.uUnuvNvvNU();
            int var19 = this.UuUVuuUu(var17, var18);
            float var20 = Math.max(56.0F, var6 * 5.0F);
            float var21 = nNuUNVu.UuUVuuUu().VVuuUN();
            float var22 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
            float var23 = this.UuUVuuUu(var21, var22);
            VvuuVNVUn.NVnVnNnN var24 = VvuuVNVUn.UuUVuuUu();

            boolean var26;
            try {
               GL11.glViewport(0, 0, var17, var18);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3089);
               GL11.glDepthMask(false);
               GL11.glColorMask(true, true, true, true);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               this.VVuuUN.UuUVuuUu();
               if (this.vuuuNvNuv >= 0) {
                  GL20.glUniform2f(this.vuuuNvNuv, var17, var18);
               }

               if (this.nvUVNnuu >= 0) {
                  GL20.glUniform1f(this.nvUVNnuu, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
               }

               if (this.UuuNnUvUuv >= 0) {
                  GL20.glUniform4f(this.UuuNnUvUuv, var2 - var20, var3 - var20, var4 + var20 * 2.0F, var5 + var20 * 2.0F);
               }

               if (this.nUUVuvU >= 0) {
                  GL20.glUniform4f(this.nUUVuvU, var2, var3, var4, var5);
               }

               if (this.UnUNVVVNuv >= 0) {
                  GL20.glUniform1f(this.UnUNVVVNuv, Math.max(0.0F, var6));
               }

               if (this.vNVuvnUUnuUn >= 0) {
                  GL20.glUniform1f(this.vNVuvnUUnuUn, UuUVuuUu(var7));
               }

               if (this.UvnvNVnnnnNU >= 0) {
                  GL20.glUniform1f(this.UvnvNVnnnnNU, var8 ? 1.0F : 0.0F);
               }

               if (this.uVUVnuvnuVuv >= 0) {
                  uUnuvNvvNU(this.uVUVnuvnuVuv, var9);
               }

               if (this.NVNnnvnuunNv >= 0) {
                  uUnuvNvvNU(this.NVNnnvnuunNv, var10);
               }

               if (this.uVunuUNVVUUV >= 0) {
                  C00OOC00oO(this.uVunuUNVVUUV, var11);
               }

               if (this.UNnVVNvvnVvU >= 0) {
                  C00OOC00oO(this.UNnVVNvvnVvU, var12);
               }

               if (this.uNnUnnuNUnNu >= 0) {
                  GL20.glUniform2f(this.uNnUnnuNUnNu, var21, var22);
               }

               if (this.NuunnvnN >= 0) {
                  GL20.glUniform1f(this.NuunnvnN, var23);
               }

               if (this.NVUunUNUN >= 0) {
                  GL20.glUniform1f(this.NVUunUNUN, 1.0F);
               }

               if (this.UUVNuUNUvUnV >= 0) {
                  GL20.glUniform1f(this.UUVNuUNUvUnV, 2.5F);
               }

               if (this.NnUuNNU >= 0) {
                  GL20.glUniform1f(this.NnUuNNU, var13 ? 1.0F : 0.0F);
               }

               if (this.nNvNUVU >= 0) {
                  GL20.glUniform1f(this.nNvNUVU, var14 ? 1.0F : 0.0F);
               }

               if (this.UnUNuUU >= 0) {
                  GL20.glUniform1f(this.UnUNuUU, UuUVuuUu(var15));
               }

               if (this.uUVuVvuNUvnu >= 0) {
                  GL20.glUniform1f(this.uUVuVvuNUvnu, var20);
               }

               if (this.UvUvUNuvNU >= 0) {
                  GL20.glUniform1f(this.UvUvUNuvNU, 0.6F);
               }

               if (this.c0oOOCcCoC0 >= 0) {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, Math.max(var19, 0));
                  GL20.glUniform1i(this.c0oOOCcCoC0, 0);
               }

               if (this.VVnVNnunVvu >= 0) {
                  GL20.glUniform2f(this.VVnVNnunVvu, this.nNnVnUNVV > 0 ? this.nNnVnUNVV : var17, this.nuunNvv > 0 ? this.nuunNvv : var18);
               }

               if (this.unNNVVNnvvV >= 0) {
                  GL20.glUniform1f(this.unNNVVNnvvV, var19 > 0 ? 1.0F : 0.0F);
               }

               GL30.glBindVertexArray(this.vNUvnnVnUvu);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
               return true;
            } catch (Throwable var30) {
               System.err.println("[LuxFracture] surface draw disabled: " + var30.getMessage());
               var30.printStackTrace();
               this.nnuUVNUuvvVU = true;
               var26 = false;
            } finally {
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var24);
            }

            return var26;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private float UuUVuuUu(float var1, float var2) {
      long var3 = System.nanoTime();
      if (var3 - this.UUuUnNVNuuv > 3000000L) {
         float var5 = var1 - this.vvUVNVvvNUv;
         float var6 = var2 - this.UuNnnVnuNNV;
         float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
         this.uUVvnUuNvvN = this.uUVvnUuNvvN * 0.55F + Math.min(1.0F, var7 / 36.0F) * 0.45F;
         if (this.uUVvnUuNvvN < 8.0E-4F) {
            this.uUVvnUuNvvN = 0.0F;
         }

         this.vvUVNVvvNUv = var1;
         this.UuNnnVnuNNV = var2;
         this.UUuUnNVNuuv = var3;
      }

      return this.uUVvnUuNvvN;
   }

   private int UuUVuuUu(int var1, int var2) {
      long var3 = System.nanoTime();
      if (this.nVVUuvuNnUN > 0 && this.nNnVnUNVV == var1 && this.nuunNvv == var2 && var3 - this.uUVVvVVNvvn < 3000000L) {
         return this.nVVUuvuNnUN;
      } else {
         try {
            vnuUvuuNVNUU var5 = NVnVnNnN.uUnuvNvvNU();
            if (var5 == null) {
               this.nVVUuvuNnUN = 0;
               return 0;
            } else {
               vnuUvuuNVNUU.NVnVnNnN var6 = var5.vVvUvVVuuNvV();
               if (var6 != null && var6.colorTexture() > 0 && var6.width() > 0 && var6.height() > 0) {
                  this.nVVUuvuNnUN = var6.colorTexture();
                  this.nNnVnUNVV = var6.width();
                  this.nuunNvv = var6.height();
                  this.uUVVvVVNvvn = var3;
                  return this.nVVUuvuNnUN;
               } else {
                  this.nVVUuvuNnUN = 0;
                  return 0;
               }
            }
         } catch (Throwable var7) {
            this.nVVUuvuNnUN = 0;
            return 0;
         }
      }
   }

   private boolean UuUVuuUu() {
      if (!this.vuvnUnVnUNnV) {
         this.vuvnUnVnUNnV = true;

         try {
            this.VVuuUN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/lux_fracture_edge.frag");
            this.vuuuNvNuv = this.VVuuUN.UuUVuuUu("uResolution");
            this.nvUVNnuu = this.VVuuUN.UuUVuuUu("uTime");
            this.UuuNnUvUuv = this.VVuuUN.UuUVuuUu("uDrawRect");
            this.nUUVuvU = this.VVuuUN.UuUVuuUu("uElementRect");
            this.UnUNVVVNuv = this.VVuuUN.UuUVuuUu("uRadius");
            this.vNVuvnUUnuUn = this.VVuuUN.UuUVuuUu("uAlpha");
            this.UvnvNVnnnnNU = this.VVuuUN.UuUVuuUu("uInset");
            this.uVUVnuvnuVuv = this.VVuuUN.UuUVuuUu("uSurfaceColor");
            this.NVNnnvnuunNv = this.VVuuUN.UuUVuuUu("uOutlineColor");
            this.uVunuUNVVUUV = this.VVuuUN.UuUVuuUu("uAccentTop");
            this.UNnVVNvvnVvU = this.VVuuUN.UuUVuuUu("uAccentBottom");
            this.uNnUnnuNUnNu = this.VVuuUN.UuUVuuUu("uMouse");
            this.NnUuNNU = this.VVuuUN.UuUVuuUu("uShadow");
            this.nNvNUVU = this.VVuuUN.UuUVuuUu("uOutline");
            this.UnUNuUU = this.VVuuUN.UuUVuuUu("uLightMode");
            this.uUVuVvuNUvnu = this.VVuuUN.UuUVuuUu("uPad");
            this.UvUvUNuvNU = this.VVuuUN.UuUVuuUu("uSweepSpeed");
            this.c0oOOCcCoC0 = this.VVuuUN.UuUVuuUu("uScene");
            this.VVnVNnunVvu = this.VVuuUN.UuUVuuUu("uSceneSize");
            this.unNNVVNnvvV = this.VVuuUN.UuUVuuUu("uHasScene");
            this.NuunnvnN = this.VVuuUN.UuUVuuUu("uMouseVel");
            this.NVUunUNUN = this.VVuuUN.UuUVuuUu("uSpectralBloomStrength");
            this.UUVNuUNUvUnV = this.VVuuUN.UuUVuuUu("uRefractionDensityFade");
            this.vNUvnnVnUvu = GL30.glGenVertexArrays();
            this.uVUuuVnNVU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.vNUvnnVnUvu);
            GL15.glBindBuffer(34962, this.uVUuuVnNVU);
            float[] var1 = new float[]{
               -1.0F,
               -1.0F,
               0.0F,
               0.0F,
               1.0F,
               -1.0F,
               1.0F,
               0.0F,
               1.0F,
               1.0F,
               1.0F,
               1.0F,
               -1.0F,
               -1.0F,
               0.0F,
               0.0F,
               1.0F,
               1.0F,
               1.0F,
               1.0F,
               -1.0F,
               1.0F,
               0.0F,
               1.0F
            };
            GL15.glBufferData(34962, var1, 35044);
            byte var2 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var2, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var2, 8L);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            return true;
         } catch (Throwable var3) {
            System.err.println("[LuxFracture] surface shader failed to load (style will fall back): " + var3.getMessage());
            var3.printStackTrace();
            this.nnuUVNUuvvVU = true;
            this.VVuuUN = null;
            return false;
         }
      } else {
         return this.VVuuUN != null && this.vNUvnnVnUvu != 0;
      }
   }

   private static void C00OOC00oO(int var0, int var1) {
      GL20.glUniform3f(var0, UuUVuuUu(var1), C00OOC00oO(var1), uUnuvNvvNU(var1));
   }

   private static void uUnuvNvvNU(int var0, int var1) {
      GL20.glUniform4f(var0, UuUVuuUu(var1), C00OOC00oO(var1), uUnuvNvvNU(var1), vVvUvVVuuNvV(var1));
   }

   private static float UuUVuuUu(int var0) {
      return (var0 >>> 16 & 0xFF) / 255.0F;
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >>> 8 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 >>> 24 & 0xFF) / 255.0F;
   }

   private static float UuUVuuUu(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}

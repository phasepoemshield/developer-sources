package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class nVvNunNuNuN {
   private static final nVvNunNuNuN UuUVuuUu = new nVvNunNuNuN();
   private static final String C00OOC00oO = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/foundry/grid.frag";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/foundry/grid_composite.frag";
   private static final float uNNnnnuuuN = 1.0F;
   private static final float nuUnNvnuUu = 310.0F;
   private static final float VVuuUN = 34.0F;
   private static final float vNUvnnVnUvu = 92.0F;
   private static final float uVUuuVnNVU = 18.0F;
   private final VvNNUnNNVn vuuuNvNuv = new VvNNUnNNVn();
   private vVvUNNUVVnNn nvUVNnuu;
   private vVvUNNUVVnNn UuuNnUvUuv;
   private int nUUVuvU;
   private int UnUNVVVNuv;
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
   private boolean NuunnvnN;
   private boolean NVUunUNUN;
   private boolean UUVNuUNUvUnV;
   private long vuvnUnVnUNnV;
   private float nnuUVNUuvvVU;
   private float nVVUuvuNnUN;
   private float nNnVnUNVV;
   private float nuunNvv;
   private float uUVVvVVNvvn;
   private float vvUVNVvvNUv;

   private nVvNunNuNuN() {
   }

   public static nVvNunNuNuN UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(
      UnVNvNnU var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, NUunUunuNV var11, boolean var12
   ) {
      if (this.NVUunUNUN || var1 == null || var2 <= 0 || var3 <= 0 || var9 <= 0.001F) {
         return false;
      } else if (!this.C00OOC00oO()) {
         return false;
      } else {
         this.UuUVuuUu(var2, var3, var7, var8);
         var1.uUnuvNvvNU();
         int var13 = var11 == null ? -29969 : var11.uVunuUNVVUUV();
         int var14 = var11 == null ? -8128257 : var11.UNnVVNvvnVvU();
         VvuuVNVUn.NVnVnNnN var15 = VvuuVNVUn.UuUVuuUu();
         boolean var21 = false /* VF: Semaphore variable */;

         boolean var24;
         label85: {
            label84: {
               boolean var17;
               try {
                  var21 = true;
                  this.vuuuNvNuv.UuUVuuUu(var2, var3);
                  if (!this.vuuuNvNuv.nuUnNvnuUu()) {
                     var24 = false;
                     var21 = false;
                     break label85;
                  }

                  this.vuuuNvNuv.UuUVuuUu();
                  GL11.glDrawBuffer(36064);
                  GL11.glViewport(0, 0, var2, var3);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3042);
                  GL11.glDepthMask(false);
                  GL11.glColorMask(true, true, true, true);
                  GL11.glDisable(36281);
                  GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
                  GL11.glClear(16384);
                  this.nvUVNnuu.UuUVuuUu();
                  UuUVuuUu(this.vNVuvnUUnuUn, (float)var2, (float)var3);
                  UuUVuuUu(this.UvnvNVnnnnNU, var4, var5);
                  UuUVuuUu(this.uVUVnuvnuVuv, var6);
                  UuUVuuUu(this.NVNnnvnuunNv, var7, var8);
                  UuUVuuUu(this.uVunuUNVVUUV, this.nnuUVNUuvvVU, this.nVVUuvuNnUN);
                  UuUVuuUu(this.UNnVVNvvnVvU, this.nNnVnUNVV, this.nuunNvv);
                  UuUVuuUu(this.uNnUnnuNUnNu, this.uUVVvVVNvvn);
                  UuUVuuUu(this.NnUuNNU, var10);
                  UuUVuuUu(this.nNvNUVU, var9);
                  UuUVuuUu(this.UnUNuUU, UuUVuuUu(var13), C00OOC00oO(var13), uUnuvNvvNU(var13));
                  UuUVuuUu(this.uUVuVvuNUvnu, UuUVuuUu(var14), C00OOC00oO(var14), uUnuvNvvNU(var14));
                  UuUVuuUu(this.UvUvUNuvNU, var12 ? 1.0F : 0.0F);
                  GL30.glBindVertexArray(this.nUUVuvU);
                  GL11.glDrawArrays(4, 0, 6);
                  GL30.glBindFramebuffer(36160, var15.UuUVuuUu);
                  GL11.glDrawBuffer(var15.uUnuvNvvNU);
                  GL11.glViewport(0, 0, var2, var3);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  this.UuuNnUvUuv.UuUVuuUu();
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, this.vuuuNvNuv.uUnuvNvvNU());
                  UuUVuuUu(this.c0oOOCcCoC0, 0);
                  UuUVuuUu(this.VVnVNnunVvu, (float)var2, (float)var3);
                  UuUVuuUu(this.unNNVVNnvvV, 1.0F);
                  GL11.glDrawArrays(4, 0, 6);
                  GL30.glBindVertexArray(0);
                  var24 = true;
                  var21 = false;
                  break label84;
               } catch (Throwable var22) {
                  this.NVUunUNUN = true;
                  var17 = false;
                  var21 = false;
               } finally {
                  if (var21) {
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     VvuuVNVUn.uUnuvNvvNU(var15);
                  }
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               VvuuVNVUn.uUnuvNvvNU(var15);
               return var17;
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            VvuuVNVUn.uUnuvNvvNU(var15);
            return var24;
         }

         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         GL20.glUseProgram(0);
         GL30.glBindVertexArray(0);
         VvuuVNVUn.uUnuvNvvNU(var15);
         return var24;
      }
   }

   private void UuUVuuUu(int var1, int var2, float var3, float var4) {
      long var5 = System.nanoTime();
      float var7 = this.vuvnUnVnUNnV == 0L ? 0.016666668F : (float)(var5 - this.vuvnUnVnUNnV) / 1.0E9F;
      this.vuvnUnVnUNnV = var5;
      if (!Float.isFinite(var7) || var7 <= 0.0F) {
         var7 = 0.016666668F;
      }

      var7 = Math.max(0.001F, Math.min(0.05F, var7));
      if (!this.UUVNuUNUvUnV) {
         this.nnuUVNUuvvVU = var3;
         this.nVVUuvuNnUN = var4;
         this.nNnVnUNVV = 0.0F;
         this.nuunNvv = 0.0F;
         this.uUVVvVVNvvn = 0.0F;
         this.vvUVNVvvNUv = 0.0F;
         this.UUVNuUNUvUnV = true;
      } else {
         float var8 = ((var3 - this.nnuUVNUuvvVU) * 310.0F - this.nNnVnUNVV * 34.0F) / 1.0F;
         float var9 = ((var4 - this.nVVUuvuNnUN) * 310.0F - this.nuunNvv * 34.0F) / 1.0F;
         this.nNnVnUNVV += var8 * var7;
         this.nuunNvv += var9 * var7;
         this.nnuUVNUuvvVU = this.nnuUVNUuvvVU + this.nNnVnUNVV * var7;
         this.nVVUuvuNnUN = this.nVVUuvuNnUN + this.nuunNvv * var7;
         float var10 = var3 >= 0.0F && var3 <= var1 && var4 >= 0.0F && var4 <= var2 ? 1.0F : 0.0F;
         float var11 = (float)Math.sqrt(this.nNnVnUNVV * this.nNnVnUNVV + this.nuunNvv * this.nuunNvv);
         float var12 = var10 * UuUVuuUu(0.58F + var11 * 0.0018F, 0.0F, 1.0F);
         float var13 = ((var12 - this.uUVVvVVNvvn) * 92.0F - this.vvUVNVvvNUv * 18.0F) / 1.0F;
         this.vvUVNVvvNUv += var13 * var7;
         this.uUVVvVVNvvn = this.uUVVvVVNvvn + this.vvUVNVvvNUv * var7;
         this.uUVVvVVNvvn = UuUVuuUu(this.uUVVvVVNvvn, 0.0F, 1.0F);
      }
   }

   private boolean C00OOC00oO() {
      if (!this.NuunnvnN) {
         this.NuunnvnN = true;

         try {
            this.nvUVNnuu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/foundry/grid.frag");
            this.UuuNnUvUuv = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/foundry/grid_composite.frag");
            this.vNVuvnUUnuUn = this.nvUVNnuu.UuUVuuUu("uResolution");
            this.UvnvNVnnnnNU = this.nvUVNnuu.UuUVuuUu("uPan");
            this.uVUVnuvnuVuv = this.nvUVNnuu.UuUVuuUu("uZoom");
            this.NVNnnvnuunNv = this.nvUVNnuu.UuUVuuUu("uMouse");
            this.uVunuUNVVUUV = this.nvUVNnuu.UuUVuuUu("uSpringMouse");
            this.UNnVVNvvnVvU = this.nvUVNnuu.UuUVuuUu("uMouseVelocity");
            this.uNnUnnuNUnNu = this.nvUVNnuu.UuUVuuUu("uMagnetEnergy");
            this.NnUuNNU = this.nvUVNnuu.UuUVuuUu("uTime");
            this.nNvNUVU = this.nvUVNnuu.UuUVuuUu("uAlpha");
            this.UnUNuUU = this.nvUVNnuu.UuUVuuUu("uAccentTop");
            this.uUVuVvuNUvnu = this.nvUVNnuu.UuUVuuUu("uAccentBottom");
            this.UvUvUNuvNU = this.nvUVNnuu.UuUVuuUu("uLightMode");
            this.c0oOOCcCoC0 = this.UuuNnUvUuv.UuUVuuUu("uTexture");
            this.VVnVNnunVvu = this.UuuNnUvUuv.UuUVuuUu("uResolution");
            this.unNNVVNnvvV = this.UuuNnUvUuv.UuUVuuUu("uAlpha");
            this.nUUVuvU = GL30.glGenVertexArrays();
            this.UnUNVVVNuv = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.nUUVuvU);
            GL15.glBindBuffer(34962, this.UnUNVVVNuv);
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
            this.NVUunUNUN = true;
            this.nvUVNnuu = null;
            this.UuuNnUvUuv = null;
            return false;
         }
      } else {
         return this.nvUVNnuu != null && this.UuuNnUvUuv != null && this.nUUVuvU != 0;
      }
   }

   private static void UuUVuuUu(int var0, int var1) {
      if (var0 >= 0) {
         GL20.glUniform1i(var0, var1);
      }
   }

   private static void UuUVuuUu(int var0, float var1) {
      if (var0 >= 0) {
         GL20.glUniform1f(var0, var1);
      }
   }

   private static void UuUVuuUu(int var0, float var1, float var2) {
      if (var0 >= 0) {
         GL20.glUniform2f(var0, var1, var2);
      }
   }

   private static void UuUVuuUu(int var0, float var1, float var2, float var3) {
      if (var0 >= 0) {
         GL20.glUniform3f(var0, var1, var2, var3);
      }
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

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }
}

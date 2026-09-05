package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class vUUnNuuU {
   private static final vUUnNuuU UuUVuuUu = new vUUnNuuU();
   private static final int C00OOC00oO = 96;
   private static final String uUnuvNvvNU = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/hud/arraylist_ferrofluid.frag";
   private final float[] uNNnnnuuuN = new float[384];
   private vVvUNNUVVnNn nuUnNvnuUu;
   private int VVuuUN;
   private int vNUvnnVnUvu;
   private int uVUuuVnNVU = -1;
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
   private boolean NuunnvnN;
   private boolean NVUunUNUN;
   private final float[] UUVNuUNUvUnV = new float[384];

   private vUUnNuuU() {
   }

   static boolean UuUVuuUu(
      UnVNvNnU var0,
      int var1,
      int var2,
      float[] var3,
      float[] var4,
      int var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      int var11,
      int var12,
      boolean var13,
      boolean var14,
      boolean var15,
      float var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22
   ) {
      return UuUVuuUu.C00OOC00oO(
         var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20, var21, var22
      );
   }

   private boolean C00OOC00oO(
      UnVNvNnU var1,
      int var2,
      int var3,
      float[] var4,
      float[] var5,
      int var6,
      float var7,
      float var8,
      float var9,
      int var10,
      int var11,
      int var12,
      int var13,
      boolean var14,
      boolean var15,
      boolean var16,
      float var17,
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23
   ) {
      if (!this.NVUunUNUN && var1 != null && var2 > 0 && var3 > 0 && var6 > 0 && var6 <= 96 && var4 != null && !(var9 <= 0.001F)) {
         if (!this.UuUVuuUu()) {
            return false;
         } else {
            float var24 = Float.MAX_VALUE;
            float var25 = Float.MAX_VALUE;
            float var26 = -Float.MAX_VALUE;
            float var27 = -Float.MAX_VALUE;

            for (int var28 = 0; var28 < 96; var28++) {
               int var29 = var28 * 4;
               if (var28 < var6) {
                  float var30 = var4[var29];
                  float var31 = var4[var29 + 1];
                  float var32 = Math.max(0.0F, var4[var29 + 2]);
                  float var33 = Math.max(0.0F, var4[var29 + 3]);
                  this.uNNnnnuuuN[var29] = var30;
                  this.uNNnnnuuuN[var29 + 1] = var31;
                  this.uNNnnnuuuN[var29 + 2] = var32;
                  this.uNNnnnuuuN[var29 + 3] = var33;
                  if (var32 > 0.5F && var33 > 0.5F) {
                     var24 = Math.min(var24, var30);
                     var25 = Math.min(var25, var31);
                     var26 = Math.max(var26, var30 + var32);
                     var27 = Math.max(var27, var31 + var33);
                  }

                  if (var5 != null && var5.length >= var29 + 4) {
                     this.UUVNuUNUvUnV[var29] = UuUVuuUu(var5[var29], -220.0F, 220.0F);
                     this.UUVNuUNUvUnV[var29 + 1] = UuUVuuUu(var5[var29 + 1], -220.0F, 220.0F);
                     this.UUVNuUNUvUnV[var29 + 2] = UuUVuuUu(var5[var29 + 2], 0.0F, 2.5F);
                     this.UUVNuUNUvUnV[var29 + 3] = UuUVuuUu(var5[var29 + 3], 0.0F, 1.0F);
                  } else {
                     this.UUVNuUNUvUnV[var29] = 0.0F;
                     this.UUVNuUNUvUnV[var29 + 1] = 0.0F;
                     this.UUVNuUNUvUnV[var29 + 2] = 0.0F;
                     this.UUVNuUNUvUnV[var29 + 3] = 1.0F;
                  }
               } else {
                  this.uNNnnnuuuN[var29] = 0.0F;
                  this.uNNnnnuuuN[var29 + 1] = 0.0F;
                  this.uNNnnnuuuN[var29 + 2] = 0.0F;
                  this.uNNnnnuuuN[var29 + 3] = 0.0F;
                  this.UUVNuUNUvUnV[var29] = 0.0F;
                  this.UUVNuUNUvUnV[var29 + 1] = 0.0F;
                  this.UUVNuUNUvUnV[var29 + 2] = 0.0F;
                  this.UUVNuUNUvUnV[var29 + 3] = 1.0F;
               }
            }

            if (var24 != Float.MAX_VALUE && var25 != Float.MAX_VALUE && !(var26 <= var24) && !(var27 <= var25)) {
               var1.uUnuvNvvNU();
               float var39 = Math.max(24.0F, var7 * 4.2F);
               VvuuVNVUn.NVnVnNnN var40 = VvuuVNVUn.UuUVuuUu();

               boolean var42;
               try {
                  GL11.glViewport(0, 0, var2, var3);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3089);
                  GL11.glDepthMask(false);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.nuUnNvnuUu.UuUVuuUu();
                  if (this.uVUuuVnNVU >= 0) {
                     GL20.glUniform2f(this.uVUuuVnNVU, var2, var3);
                  }

                  if (this.vuuuNvNuv >= 0) {
                     GL20.glUniform1f(this.vuuuNvNuv, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
                  }

                  if (this.nvUVNnuu >= 0) {
                     GL20.glUniform4f(this.nvUVNnuu, var24 - var39, var25 - var39, var26 - var24 + var39 * 2.0F, var27 - var25 + var39 * 2.0F);
                  }

                  if (this.UuuNnUvUuv >= 0) {
                     GL20.glUniform1i(this.UuuNnUvUuv, var6);
                  }

                  if (this.nUUVuvU >= 0) {
                     GL20.glUniform4fv(this.nUUVuvU, this.uNNnnnuuuN);
                  }

                  if (this.UnUNVVVNuv >= 0) {
                     GL20.glUniform1f(this.UnUNVVVNuv, Math.max(1.0F, var7));
                  }

                  if (this.vNVuvnUUnuUn >= 0) {
                     GL20.glUniform1f(this.vNVuvnUUnuUn, Math.max(0.0F, Math.min(1.0F, var8)));
                  }

                  if (this.UvnvNVnnnnNU >= 0) {
                     GL20.glUniform1f(this.UvnvNVnnnnNU, Math.max(0.0F, Math.min(1.0F, var9)));
                  }

                  if (this.uVUVnuvnuVuv >= 0) {
                     GL20.glUniform4fv(this.uVUVnuvnuVuv, this.UUVNuUNUvUnV);
                  }

                  if (this.NVNnnvnuunNv >= 0) {
                     GL20.glUniform4f(this.NVNnnvnuunNv, var18, var19, Math.max(0.0F, Math.min(1.0F, var20)), Math.max(18.0F, var7 * 5.5F));
                  }

                  if (this.uVunuUNVVUUV >= 0) {
                     GL20.glUniform1f(this.uVunuUNVVUUV, Math.max(0.0F, Math.min(2.5F, var21)));
                  }

                  if (this.UNnVVNvvnVvU >= 0) {
                     C00OOC00oO(this.UNnVVNvvnVvU, var10);
                  }

                  if (this.uNnUnnuNUnNu >= 0) {
                     C00OOC00oO(this.uNnUnnuNUnNu, var11);
                  }

                  if (this.NnUuNNU >= 0) {
                     UuUVuuUu(this.NnUuNNU, var12);
                  }

                  if (this.nNvNUVU >= 0) {
                     UuUVuuUu(this.nNvNUVU, var13);
                  }

                  if (this.UnUNuUU >= 0) {
                     GL20.glUniform1f(this.UnUNuUU, var14 ? 1.0F : 0.0F);
                  }

                  if (this.uUVuVvuNUvnu >= 0) {
                     GL20.glUniform1f(this.uUVuVvuNUvnu, var15 ? 1.0F : 0.0F);
                  }

                  if (this.UvUvUNuvNU >= 0) {
                     GL20.glUniform1f(this.UvUvUNuvNU, var16 ? 1.0F : 0.0F);
                  }

                  if (this.c0oOOCcCoC0 >= 0) {
                     GL20.glUniform1f(this.c0oOOCcCoC0, Math.max(0.0F, Math.min(1.0F, var17)));
                  }

                  if (this.VVnVNnunVvu >= 0) {
                     GL20.glUniform1f(this.VVnVNnunVvu, Math.max(1.0F, var22));
                  }

                  if (this.unNNVVNnvvV >= 0) {
                     GL20.glUniform1f(this.unNNVVNnvvV, Math.max(0.0F, Math.min(1.0F, var23)));
                  }

                  GL30.glBindVertexArray(this.VVuuUN);
                  GL11.glDrawArrays(4, 0, 6);
                  GL30.glBindVertexArray(0);
                  return true;
               } catch (Throwable var37) {
                  this.NVUunUNUN = true;
                  var42 = false;
               } finally {
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(var40);
               }

               return var42;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu() {
      if (!this.NuunnvnN) {
         this.NuunnvnN = true;

         try {
            this.nuUnNvnuUu = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/arraylist_ferrofluid.frag");
            this.uVUuuVnNVU = this.nuUnNvnuUu.UuUVuuUu("uResolution");
            this.vuuuNvNuv = this.nuUnNvnuUu.UuUVuuUu("uTime");
            this.nvUVNnuu = this.nuUnNvnuUu.UuUVuuUu("uDrawRect");
            this.UuuNnUvUuv = this.nuUnNvnuUu.UuUVuuUu("uRowCount");
            this.nUUVuvU = this.nuUnNvnuUu.UuUVuuUu("uRows[0]");
            this.UnUNVVVNuv = this.nuUnNvnuUu.UuUVuuUu("uRadius");
            this.vNVuvnUUnuUn = this.nuUnNvnuUu.UuUVuuUu("uDirection");
            this.UvnvNVnnnnNU = this.nuUnNvnuUu.UuUVuuUu("uAlpha");
            this.uVUVnuvnuVuv = this.nuUnNvnuUu.UuUVuuUu("uMotionRows[0]");
            this.NVNnnvnuunNv = this.nuUnNvnuUu.UuUVuuUu("uPointer");
            this.uVunuUNVVUUV = this.nuUnNvnuUu.UuUVuuUu("uExposure");
            this.UNnVVNvvnVvU = this.nuUnNvnuUu.UuUVuuUu("uSurfaceColor");
            this.uNnUnnuNUnNu = this.nuUnNvnuUu.UuUVuuUu("uOutlineColor");
            this.NnUuNNU = this.nuUnNvnuUu.UuUVuuUu("uAccentTop");
            this.nNvNUVU = this.nuUnNvnuUu.UuUVuuUu("uAccentBottom");
            this.UnUNuUU = this.nuUnNvnuUu.UuUVuuUu("uOutline");
            this.uUVuVvuNUvnu = this.nuUnNvnuUu.UuUVuuUu("uGlow");
            this.UvUvUNuvNU = this.nuUnNvnuUu.UuUVuuUu("uEdgeHighlight");
            this.c0oOOCcCoC0 = this.nuUnNvnuUu.UuUVuuUu("uLightMode");
            this.VVnVNnunVvu = this.nuUnNvnuUu.UuUVuuUu("uFluidCohesion");
            this.unNNVVNnvvV = this.nuUnNvnuUu.UuUVuuUu("uSoft");
            this.VVuuUN = GL30.glGenVertexArrays();
            this.vNUvnnVnUvu = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.VVuuUN);
            GL15.glBindBuffer(34962, this.vNUvnnVnUvu);
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
            this.nuUnNvnuUu = null;
            return false;
         }
      } else {
         return this.nuUnNvnuUu != null && this.VVuuUN != 0;
      }
   }

   private static void UuUVuuUu(int var0, int var1) {
      GL20.glUniform3f(var0, UuUVuuUu(var1), C00OOC00oO(var1), uUnuvNvvNU(var1));
   }

   private static void C00OOC00oO(int var0, int var1) {
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

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }
}

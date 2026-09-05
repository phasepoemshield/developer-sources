package ru.metaculture.protection;

import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class uNnUVNuNNU {
   private static final uNnUVNuNNU UuUVuuUu = new uNnUVNuNNU();
   private static final String C00OOC00oO = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/hud/prismatic_edge.frag";
   private static final long vVvUvVVuuNvV = 3000000L;
   private static final float uNNnnnuuuN = 1.45F;
   private static final float nuUnNvnuUu = 1.0F;
   private static final float VVuuUN = 0.62F;
   private static final float vNUvnnVnUvu = 0.55F;
   private static final float uVUuuVnNVU = 1.7F;
   private vVvUNNUVVnNn vuuuNvNuv;
   private int nvUVNnuu;
   private int UuuNnUvUuv;
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
   private int vuvnUnVnUNnV = -1;
   private int nnuUVNUuvvVU = -1;
   private int nVVUuvuNnUN = -1;
   private int nNnVnUNVV = -1;
   private int nuunNvv = -1;
   private int uUVVvVVNvvn = -1;
   private boolean vvUVNVvvNUv;
   private boolean UuNnnVnuNNV;
   private int uUVvnUuNvvN;
   private int UUuUnNVNuuv;
   private int NVuNUuVnVUN;
   private long NVuunNnvvvVu = Long.MIN_VALUE;
   private float vNnNuuvVn;
   private float VUuuVUnun;
   private float vVVuuVVv;
   private long VuunNUUUvu = Long.MIN_VALUE;

   private uNnUVNuNNU() {
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

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
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
      if (!this.UuNnnVnuNNV && var1 != null && var16 != null && var16.method_22683() != null && !(var4 <= 1.0F) && !(var5 <= 1.0F) && !(var7 <= 0.001F)) {
         int var17 = var16.method_22683().method_4489();
         int var18 = var16.method_22683().method_4506();
         if (var17 > 1 && var18 > 1 && this.UuUVuuUu()) {
            var1.uUnuvNvvNU();
            int var19 = this.UuUVuuUu(var17, var18);
            float var20 = var8 ? Math.max(18.0F, var6 * 2.5F) : Math.max(72.0F, var6 * 4.0F);
            float var21 = nNuUNVu.UuUVuuUu().VVuuUN();
            float var22 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
            float var23 = this.UuUVuuUu(var21, var22);
            VvuuVNVUn.NVnVnNnN var24 = VvuuVNVUn.UuUVuuUu();
            boolean var30 = false /* VF: Semaphore variable */;

            boolean var25;
            label315: {
               boolean var26;
               try {
                  var30 = true;
                  GL11.glViewport(0, 0, var17, var18);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3089);
                  GL11.glDepthMask(false);
                  GL11.glColorMask(true, true, true, true);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.vuuuNvNuv.UuUVuuUu();
                  if (this.nUUVuvU >= 0) {
                     GL20.glUniform2f(this.nUUVuvU, var17, var18);
                  }

                  if (this.UnUNVVVNuv >= 0) {
                     GL20.glUniform1f(this.UnUNVVVNuv, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
                  }

                  if (this.vNVuvnUUnuUn >= 0) {
                     GL20.glUniform4f(this.vNVuvnUUnuUn, var2 - var20, var3 - var20, var4 + var20 * 2.0F, var5 + var20 * 2.0F);
                  }

                  if (this.UvnvNVnnnnNU >= 0) {
                     GL20.glUniform4f(this.UvnvNVnnnnNU, var2, var3, var4, var5);
                  }

                  if (this.uVUVnuvnuVuv >= 0) {
                     GL20.glUniform1f(this.uVUVnuvnuVuv, Math.max(0.0F, var6));
                  }

                  if (this.NVNnnvnuunNv >= 0) {
                     GL20.glUniform1f(this.NVNnnvnuunNv, UuUVuuUu(var7));
                  }

                  if (this.uVunuUNVVUUV >= 0) {
                     GL20.glUniform1f(this.uVunuUNVVUUV, var8 ? 1.0F : 0.0F);
                  }

                  if (this.UNnVVNvvnVvU >= 0) {
                     uUnuvNvvNU(this.UNnVVNvvnVvU, var9);
                  }

                  if (this.uNnUnnuNUnNu >= 0) {
                     uUnuvNvvNU(this.uNnUnnuNUnNu, var10);
                  }

                  if (this.NnUuNNU >= 0) {
                     C00OOC00oO(this.NnUuNNU, var11);
                  }

                  if (this.nNvNUVU >= 0) {
                     C00OOC00oO(this.nNvNUVU, var12);
                  }

                  if (this.UnUNuUU >= 0) {
                     GL20.glUniform2f(this.UnUNuUU, var21, var22);
                  }

                  if (this.vuvnUnVnUNnV >= 0) {
                     GL20.glUniform1f(this.vuvnUnVnUNnV, var23);
                  }

                  if (this.nnuUVNUuvvVU >= 0) {
                     GL20.glUniform1f(this.nnuUVNUuvvVU, 1.45F);
                  }

                  if (this.nVVUuvuNnUN >= 0) {
                     GL20.glUniform1f(this.nVVUuvuNnUN, 1.0F);
                  }

                  if (this.nNnVnUNVV >= 0) {
                     GL20.glUniform1f(this.nNnVnUNVV, 0.62F);
                  }

                  if (this.nuunNvv >= 0) {
                     GL20.glUniform1f(this.nuunNvv, 0.55F);
                  }

                  if (this.uUVVvVVNvvn >= 0) {
                     GL20.glUniform1f(this.uUVVvVVNvvn, 1.7F);
                  }

                  if (this.uUVuVvuNUvnu >= 0) {
                     GL20.glUniform1f(this.uUVuVvuNUvnu, var13 ? 1.0F : 0.0F);
                  }

                  if (this.UvUvUNuvNU >= 0) {
                     GL20.glUniform1f(this.UvUvUNuvNU, var14 ? 1.0F : 0.0F);
                  }

                  if (this.c0oOOCcCoC0 >= 0) {
                     GL20.glUniform1f(this.c0oOOCcCoC0, UuUVuuUu(var15));
                  }

                  if (this.VVnVNnunVvu >= 0) {
                     GL20.glUniform1f(this.VVnVNnunVvu, var20);
                  }

                  if (this.unNNVVNnvvV >= 0) {
                     GL20.glUniform1f(this.unNNVVNnvvV, 0.6F);
                  }

                  if (this.NuunnvnN >= 0) {
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, Math.max(var19, 0));
                     GL20.glUniform1i(this.NuunnvnN, 0);
                  }

                  if (this.NVUunUNUN >= 0) {
                     GL20.glUniform2f(this.NVUunUNUN, this.UUuUnNVNuuv > 0 ? this.UUuUnNVNuuv : var17, this.NVuNUuVnVUN > 0 ? this.NVuNUuVnVUN : var18);
                  }

                  if (this.UUVNuUNUvUnV >= 0) {
                     GL20.glUniform1f(this.UUVNuUNUvUnV, var19 > 0 ? 1.0F : 0.0F);
                  }

                  GL30.glBindVertexArray(this.nvUVNnuu);
                  GL11.glDrawArrays(4, 0, 6);
                  GL30.glBindVertexArray(0);
                  var25 = true;
                  var30 = false;
                  break label315;
               } catch (Throwable var31) {
                  System.err.println("[Prismatic] surface draw disabled: " + var31.getMessage());
                  var31.printStackTrace();
                  this.UuNnnVnuNNV = true;
                  var26 = false;
                  var30 = false;
               } finally {
                  if (var30) {
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var24);
                  }
               }

               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var24);
               return var26;
            }

            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(var24);
            return var25;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private float UuUVuuUu(float var1, float var2) {
      long var3 = System.nanoTime();
      if (var3 - this.VuunNUUUvu > 3000000L) {
         float var5 = var1 - this.vNnNuuvVn;
         float var6 = var2 - this.VUuuVUnun;
         float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
         this.vVVuuVVv = this.vVVuuVVv * 0.55F + Math.min(1.0F, var7 / 36.0F) * 0.45F;
         if (this.vVVuuVVv < 8.0E-4F) {
            this.vVVuuVVv = 0.0F;
         }

         this.vNnNuuvVn = var1;
         this.VUuuVUnun = var2;
         this.VuunNUUUvu = var3;
      }

      return this.vVVuuVVv;
   }

   private int UuUVuuUu(int var1, int var2) {
      long var3 = System.nanoTime();
      if (this.uUVvnUuNvvN > 0 && this.UUuUnNVNuuv == var1 && this.NVuNUuVnVUN == var2 && var3 - this.NVuunNnvvvVu < 3000000L) {
         return this.uUVvnUuNvvN;
      } else {
         try {
            vnuUvuuNVNUU var5 = NVnVnNnN.uUnuvNvvNU();
            if (var5 == null) {
               this.uUVvnUuNvvN = 0;
               return 0;
            } else {
               vnuUvuuNVNUU.NVnVnNnN var6 = var5.vVvUvVVuuNvV();
               if (var6 != null && var6.colorTexture() > 0 && var6.width() > 0 && var6.height() > 0) {
                  this.uUVvnUuNvvN = var6.colorTexture();
                  this.UUuUnNVNuuv = var6.width();
                  this.NVuNUuVnVUN = var6.height();
                  this.NVuunNnvvvVu = var3;
                  return this.uUVvnUuNvvN;
               } else {
                  this.uUVvnUuNvvN = 0;
                  return 0;
               }
            }
         } catch (Throwable var7) {
            this.uUVvnUuNvvN = 0;
            return 0;
         }
      }
   }

   private boolean UuUVuuUu() {
      if (!this.vvUVNVvvNUv) {
         this.vvUVNVvvNUv = true;

         try {
            this.vuuuNvNuv = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/prismatic_edge.frag");
            this.nUUVuvU = this.vuuuNvNuv.UuUVuuUu("uResolution");
            this.UnUNVVVNuv = this.vuuuNvNuv.UuUVuuUu("uTime");
            this.vNVuvnUUnuUn = this.vuuuNvNuv.UuUVuuUu("uDrawRect");
            this.UvnvNVnnnnNU = this.vuuuNvNuv.UuUVuuUu("uElementRect");
            this.uVUVnuvnuVuv = this.vuuuNvNuv.UuUVuuUu("uRadius");
            this.NVNnnvnuunNv = this.vuuuNvNuv.UuUVuuUu("uAlpha");
            this.uVunuUNVVUUV = this.vuuuNvNuv.UuUVuuUu("uInset");
            this.UNnVVNvvnVvU = this.vuuuNvNuv.UuUVuuUu("uSurfaceColor");
            this.uNnUnnuNUnNu = this.vuuuNvNuv.UuUVuuUu("uOutlineColor");
            this.NnUuNNU = this.vuuuNvNuv.UuUVuuUu("uAccentTop");
            this.nNvNUVU = this.vuuuNvNuv.UuUVuuUu("uAccentBottom");
            this.UnUNuUU = this.vuuuNvNuv.UuUVuuUu("uMouse");
            this.uUVuVvuNUvnu = this.vuuuNvNuv.UuUVuuUu("uShadow");
            this.UvUvUNuvNU = this.vuuuNvNuv.UuUVuuUu("uOutline");
            this.c0oOOCcCoC0 = this.vuuuNvNuv.UuUVuuUu("uLightMode");
            this.VVnVNnunVvu = this.vuuuNvNuv.UuUVuuUu("uPad");
            this.unNNVVNnvvV = this.vuuuNvNuv.UuUVuuUu("uSweepSpeed");
            this.NuunnvnN = this.vuuuNvNuv.UuUVuuUu("uScene");
            this.NVUunUNUN = this.vuuuNvNuv.UuUVuuUu("uSceneSize");
            this.UUVNuUNUvUnV = this.vuuuNvNuv.UuUVuuUu("uHasScene");
            this.vuvnUnVnUNnV = this.vuuuNvNuv.UuUVuuUu("uMouseVel");
            this.nnuUVNUuvvVU = this.vuuuNvNuv.UuUVuuUu("uIor");
            this.nVVUuvuNnUN = this.vuuuNvNuv.UuUVuuUu("uDispersion");
            this.nNnVnUNVV = this.vuuuNvNuv.UuUVuuUu("uDecay");
            this.nuunNvv = this.vuuuNvNuv.UuUVuuUu("uCausticGain");
            this.uUVVvVVNvvn = this.vuuuNvNuv.UuUVuuUu("uGlintGain");
            this.nvUVNnuu = GL30.glGenVertexArrays();
            this.UuuNnUvUuv = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.nvUVNnuu);
            GL15.glBindBuffer(34962, this.UuuNnUvUuv);
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
            System.err.println("[Prismatic] surface shader failed to load (style will fall back): " + var3.getMessage());
            var3.printStackTrace();
            this.UuNnnVnuNNV = true;
            this.vuuuNvNuv = null;
            return false;
         }
      } else {
         return this.vuuuNvNuv != null && this.nvUVNnuu != 0;
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

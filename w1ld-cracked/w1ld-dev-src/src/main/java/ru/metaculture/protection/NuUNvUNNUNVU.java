package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class NuUNvUNNUNVU {
   private static final NuUNvUNNUNVU UuUVuuUu = new NuUNvUNNUNVU();
   private static final int C00OOC00oO = 32;
   private static final String uUnuvNvvNU = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/hud/gravity_grid.frag";
   private final float[] uNNnnnuuuN = new float[128];
   private final float[] nuUnNvnuUu = new float[32];
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
   private boolean uVunuUNVVUUV;
   private boolean UNnVVNvvnVvU;

   private NuUNvUNNUNVU() {
   }

   static NuUNvUNNUNVU UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   void UuUVuuUu(int var1, int var2, nNuUNVu.nvUnvV[] var3, int var4, String var5, float var6, float var7, float var8, int var9, int var10) {
      if (!this.UNnVVNvvnVvU && var1 > 0 && var2 > 0 && !(var8 <= 0.01F)) {
         if (this.C00OOC00oO()) {
            int var11 = Math.max(0, Math.min(32, Math.min(var4, var3 == null ? 0 : var3.length)));

            for (int var12 = 0; var12 < 32; var12++) {
               int var13 = var12 * 4;
               if (var12 < var11 && var3[var12] != null) {
                  nNuUNVu.nvUnvV var14 = var3[var12];
                  boolean var15 = var5 != null && var5.equals(var14.UuUVuuUu);
                  this.uNNnnnuuuN[var13] = var14.C00OOC00oO;
                  this.uNNnnnuuuN[var13 + 1] = var14.uUnuvNvvNU;
                  this.uNNnnnuuuN[var13 + 2] = Math.max(1.0F, var14.vVvUvVVuuNvV);
                  this.uNNnnnuuuN[var13 + 3] = Math.max(var14.nuUnNvnuUu, var14.VVuuUN);
                  this.nuUnNvnuUu[var12] = Math.max(0.0F, var14.uNNnnnuuuN) * (var15 ? 2.25F : 1.0F);
               } else {
                  this.uNNnnnuuuN[var13] = 0.0F;
                  this.uNNnnnuuuN[var13 + 1] = 0.0F;
                  this.uNNnnnuuuN[var13 + 2] = 1.0F;
                  this.uNNnnnuuuN[var13 + 3] = 1.0F;
                  this.nuUnNvnuUu[var12] = 0.0F;
               }
            }

            VvuuVNVUn.NVnVnNnN var22 = VvuuVNVUn.UuUVuuUu();
            boolean var19 = false /* VF: Semaphore variable */;

            label209: {
               try {
                  var19 = true;
                  GL11.glViewport(0, 0, var1, var2);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.VVuuUN.UuUVuuUu();
                  if (this.vuuuNvNuv >= 0) {
                     GL20.glUniform2f(this.vuuuNvNuv, var1, var2);
                  }

                  if (this.nvUVNnuu >= 0) {
                     GL20.glUniform1f(this.nvUVNnuu, (float)(System.nanoTime() % 240000000000L) / 1.0E9F);
                  }

                  if (this.UuuNnUvUuv >= 0) {
                     GL20.glUniform1f(this.UuuNnUvUuv, Math.max(0.0F, Math.min(1.0F, var8)));
                  }

                  if (this.nUUVuvU >= 0) {
                     GL20.glUniform2f(this.nUUVuvU, var6, var7);
                  }

                  if (this.UnUNVVVNuv >= 0) {
                     GL20.glUniform1i(this.UnUNVVVNuv, var11);
                  }

                  if (this.vNVuvnUUnuUn >= 0) {
                     GL20.glUniform4fv(this.vNVuvnUUnuUn, this.uNNnnnuuuN);
                  }

                  if (this.UvnvNVnnnnNU >= 0) {
                     GL20.glUniform1fv(this.UvnvNVnnnnNU, this.nuUnNvnuUu);
                  }

                  if (this.uVUVnuvnuVuv >= 0) {
                     GL20.glUniform3f(this.uVUVnuvnuVuv, UuUVuuUu(var9), C00OOC00oO(var9), uUnuvNvvNU(var9));
                  }

                  if (this.NVNnnvnuunNv >= 0) {
                     GL20.glUniform3f(this.NVNnnvnuunNv, UuUVuuUu(var10), C00OOC00oO(var10), uUnuvNvvNU(var10));
                  }

                  GL30.glBindVertexArray(this.vNUvnnVnUvu);
                  GL11.glDrawArrays(4, 0, 6);
                  GL30.glBindVertexArray(0);
                  var19 = false;
                  break label209;
               } catch (Throwable var20) {
                  this.UNnVVNvvnVvU = true;
                  var19 = false;
               } finally {
                  if (var19) {
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var22);
                  }
               }

               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var22);
               return;
            }

            GL20.glUseProgram(0);
            VvuuVNVUn.uUnuvNvvNU(var22);
         }
      }
   }

   private boolean C00OOC00oO() {
      if (!this.uVunuUNVVUUV) {
         this.uVunuUNVVUUV = true;

         try {
            this.VVuuUN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/gravity_grid.frag");
            this.vuuuNvNuv = this.VVuuUN.UuUVuuUu("uResolution");
            this.nvUVNnuu = this.VVuuUN.UuUVuuUu("uTime");
            this.UuuNnUvUuv = this.VVuuUN.UuUVuuUu("uAlpha");
            this.nUUVuvU = this.VVuuUN.UuUVuuUu("uCursor");
            this.UnUNVVVNuv = this.VVuuUN.UuUVuuUu("uWellCount");
            this.vNVuvnUUnuUn = this.VVuuUN.UuUVuuUu("uWells[0]");
            this.UvnvNVnnnnNU = this.VVuuUN.UuUVuuUu("uMass[0]");
            this.uVUVnuvnuVuv = this.VVuuUN.UuUVuuUu("uAccentTop");
            this.NVNnnvnuunNv = this.VVuuUN.UuUVuuUu("uAccentBottom");
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
            this.UNnVVNvvnVvU = true;
            this.VVuuUN = null;
            return false;
         }
      } else {
         return this.VVuuUN != null && this.vNUvnnVnUvu != 0;
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
}

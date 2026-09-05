package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class OOcO0O0Oc0Oo {
   private static final OOcO0O0Oc0Oo UuUVuuUu = new OOcO0O0Oc0Oo();
   private static final String C00OOC00oO = "assets/wild/shaders/foundry/pin.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/foundry/pin.frag";
   private static final int vVvUvVVuuNvV = 18;
   private static final int uNNnnnuuuN = 6;
   private static final int nuUnNvnuUu = 96;
   private static final int VVuuUN = 576;
   private static final int vNUvnnVnUvu = 72;
   private vVvUNNUVVnNn uVUuuVnNVU;
   private int vuuuNvNuv;
   private int nvUVNnuu;
   private FloatBuffer UuuNnUvUuv;
   private boolean nUUVuvU;
   private boolean UnUNVVVNuv;
   private boolean vNVuvnUUnuUn;
   private int UvnvNVnnnnNU;
   private int uVUVnuvnuVuv;
   private int NVNnnvnuunNv;
   private int uVunuUNVVUUV = -1;
   private int UNnVVNvvnVvU = -1;

   private OOcO0O0Oc0Oo() {
   }

   public static OOcO0O0Oc0Oo UuUVuuUu() {
      return UuUVuuUu;
   }

   public boolean UuUVuuUu(UnVNvNnU var1, int var2, int var3) {
      if (this.UnUNVVVNuv || var1 == null || var2 <= 0 || var3 <= 0) {
         return false;
      } else if (!this.uUnuvNvvNU()) {
         return false;
      } else {
         var1.uUnuvNvvNU();
         this.UvnvNVnnnnNU = var2;
         this.uVUVnuvnuVuv = var3;
         this.NVNnnvnuunNv = 0;
         this.vNVuvnUUnuUn = true;
         this.UuuNnUvUuv.clear();
         return true;
      }
   }

   public void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, float var9) {
      if (this.vNVuvnUUnuUn && var1 != null && this.NVNnnvnuunNv + 6 <= 576 && !(var4 <= 0.001F) && !(var5 <= 0.001F)) {
         float var10 = Math.max(0.0F, Math.min(1.0F, var1.nUUVuvU()));
         if (!(var10 <= 0.001F)) {
            float[] var11 = var1.nvUVNnuu().uNNnnnuuuN();
            float var12 = UuUVuuUu(var11, var2, var3);
            float var13 = C00OOC00oO(var11, var2, var3);
            float var14 = UuUVuuUu(var11);
            float var15 = Math.max(1.0F, var4 * var14);
            float var16 = Math.max(0.35F, Math.min(var15, var5 * var14));
            float var17 = var15 + 10.0F + var8 * 9.0F;
            float var18 = (var6 >>> 16 & 0xFF) / 255.0F;
            float var19 = (var6 >>> 8 & 0xFF) / 255.0F;
            float var20 = (var6 & 0xFF) / 255.0F;
            float var21 = (var6 >>> 24 & 0xFF) / 255.0F * var10;
            float var22 = (var7 >>> 16 & 0xFF) / 255.0F;
            float var23 = (var7 >>> 8 & 0xFF) / 255.0F;
            float var24 = (var7 & 0xFF) / 255.0F;
            float var25 = (var7 >>> 24 & 0xFF) / 255.0F * var10;
            this.UuUVuuUu(
               var12 - var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, -1.0F, -1.0F
            );
            this.UuUVuuUu(
               var12 + var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, 1.0F, -1.0F
            );
            this.UuUVuuUu(
               var12 + var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, 1.0F, 1.0F
            );
            this.UuUVuuUu(
               var12 - var17, var13 - var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, -1.0F, -1.0F
            );
            this.UuUVuuUu(
               var12 + var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, 1.0F, 1.0F
            );
            this.UuUVuuUu(
               var12 - var17, var13 + var17, var12, var13, var15, var16, var18, var19, var20, var21, var22, var23, var24, var25, var8, var9, -1.0F, 1.0F
            );
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void C00OOC00oO() {
      if (this.vNVuvnUUnuUn) {
         this.vNVuvnUUnuUn = false;
         if (this.NVNnnvnuunNv > 0) {
            this.UuuNnUvUuv.flip();
            VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();
            boolean var6 = false /* VF: Semaphore variable */;

            label74: {
               try {
                  var6 = true;
                  GL11.glViewport(0, 0, this.UvnvNVnnnnNU, this.uVUVnuvnuVuv);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.uVUuuVnNVU.UuUVuuUu();
                  if (this.uVunuUNVVUUV >= 0) {
                     GL20.glUniform2f(this.uVunuUNVVUUV, this.UvnvNVnnnnNU, this.uVUVnuvnuVuv);
                  }

                  if (this.UNnVVNvvnVvU >= 0) {
                     GL20.glUniform1f(this.UNnVVNvvnVvU, uVvVnUU.UuUVuuUu().uUnuvNvvNU());
                  }

                  GL30.glBindVertexArray(this.vuuuNvNuv);
                  GL15.glBindBuffer(34962, this.nvUVNnuu);
                  GL15.glBufferSubData(34962, 0L, this.UuuNnUvUuv);
                  GL11.glDrawArrays(4, 0, this.NVNnnvnuunNv);
                  var6 = false;
                  break label74;
               } catch (Throwable var7) {
                  this.UnUNVVVNuv = true;
                  var6 = false;
               } finally {
                  if (var6) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL15.glBindBuffer(34962, 0);
                     VvuuVNVUn.uUnuvNvvNU(var1);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               VvuuVNVUn.uUnuvNvvNU(var1);
               return;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL15.glBindBuffer(34962, 0);
            VvuuVNVUn.uUnuvNvvNU(var1);
         }
      }
   }

   private boolean uUnuvNvvNU() {
      if (!this.nUUVuvU) {
         this.nUUVuvU = true;

         try {
            this.uVUuuVnNVU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/foundry/pin.vert", "assets/wild/shaders/foundry/pin.frag");
            this.uVunuUNVVUUV = this.uVUuuVnNVU.UuUVuuUu("uViewport");
            this.UNnVVNvvnVvU = this.uVUuuVnNVU.UuUVuuUu("uTime");
            this.vuuuNvNuv = GL30.glGenVertexArrays();
            this.nvUVNnuu = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.vuuuNvNuv);
            GL15.glBindBuffer(34962, this.nvUVNnuu);
            GL15.glBufferData(34962, 41472L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 2, 5126, false, 72, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 4, 5126, false, 72, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, 72, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 72, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.UuuNnUvUuv = BufferUtils.createFloatBuffer(10368);
            return true;
         } catch (Throwable var2) {
            this.UnUNVVVNuv = true;
            this.uVUuuVnNVU = null;
            return false;
         }
      } else {
         return this.uVUuuVnNVU != null && this.vuuuNvNuv != 0;
      }
   }

   private void UuUVuuUu(
      float var1,
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
      float var16,
      float var17,
      float var18
   ) {
      this.UuuNnUvUuv.put(var1).put(var2);
      this.UuuNnUvUuv.put(var3).put(var4);
      this.UuuNnUvUuv.put(var5).put(var6);
      this.UuuNnUvUuv.put(var7).put(var8).put(var9).put(var10);
      this.UuuNnUvUuv.put(var11).put(var12).put(var13).put(var14);
      this.UuuNnUvUuv.put(Math.max(0.0F, Math.min(1.0F, var15))).put(var16).put(var17).put(var18);
      this.NVNnnvnuunNv++;
   }

   private static float UuUVuuUu(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 9 ? var0[0] * var1 + var0[1] * var2 + var0[2] : var1;
   }

   private static float C00OOC00oO(float[] var0, float var1, float var2) {
      return var0 != null && var0.length >= 9 ? var0[3] * var1 + var0[4] * var2 + var0[5] : var2;
   }

   private static float UuUVuuUu(float[] var0) {
      if (var0 != null && var0.length >= 9) {
         float var1 = (float)Math.sqrt(var0[0] * var0[0] + var0[3] * var0[3]);
         float var2 = (float)Math.sqrt(var0[1] * var0[1] + var0[4] * var0[4]);
         return Math.max(0.001F, (var1 + var2) * 0.5F);
      } else {
         return 1.0F;
      }
   }
}

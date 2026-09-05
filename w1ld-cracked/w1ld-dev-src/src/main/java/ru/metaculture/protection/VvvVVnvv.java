package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class VvvVVnvv {
   private static final VvvVVnvv UuUVuuUu = new VvvVVnvv();
   private static final String C00OOC00oO = "assets/wild/shaders/foundry/node_surface.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/foundry/node_surface.frag";
   private static final int vVvUvVVuuNvV = 26;
   private static final int uNNnnnuuuN = 6;
   private static final int nuUnNvnuUu = 104;
   private vVvUNNUVVnNn VVuuUN;
   private int vNUvnnVnUvu;
   private int uVUuuVnNVU;
   private int vuuuNvNuv = -1;
   private int nvUVNnuu = -1;
   private FloatBuffer UuuNnUvUuv;
   private boolean nUUVuvU;
   private boolean UnUNVVVNuv;

   private VvvVVnvv() {
   }

   public static VvvVVnvv UuUVuuUu() {
      return UuUVuuUu;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      NUunUunuNV var10,
      float var11,
      float var12,
      int var13,
      int var14,
      boolean var15
   ) {
      if (!this.UnUNVVVNuv && var1 != null && !(var4 <= 1.0F) && !(var5 <= 1.0F) && var13 > 0 && var14 > 0) {
         float var16 = UuUVuuUu(var1.nUUVuvU(), 0.0F, 1.0F);
         if (!(var16 <= 0.001F) && this.C00OOC00oO()) {
            float[] var17 = var1.nvUVNnuu().uNNnnnuuuN();
            float var18 = UuUVuuUu(var17, var2, var3);
            float var19 = C00OOC00oO(var17, var2, var3);
            float var20 = UuUVuuUu(var17, var2 + var4, var3);
            float var21 = C00OOC00oO(var17, var2 + var4, var3);
            float var22 = UuUVuuUu(var17, var2 + var4, var3 + var5);
            float var23 = C00OOC00oO(var17, var2 + var4, var3 + var5);
            float var24 = UuUVuuUu(var17, var2, var3 + var5);
            float var25 = C00OOC00oO(var17, var2, var3 + var5);
            float var26 = UuUVuuUu(var18, var20, var22, var24);
            float var27 = UuUVuuUu(var19, var21, var23, var25);
            float var28 = Math.max(1.0F, C00OOC00oO(var18, var20, var22, var24) - var26);
            float var29 = Math.max(1.0F, C00OOC00oO(var19, var21, var23, var25) - var27);
            float var30 = UuUVuuUu(var17);
            float var31 = Math.max(1.0F, var6 * var30);
            float var32 = Math.max(9.0F, Math.min(34.0F, (15.0F + var8 * 11.0F + var7 * 5.0F) * var30));
            float var33 = var32 * 2.18F + 4.0F;
            float var34 = var26 - var33;
            float var35 = var27 - var33;
            float var36 = var28 + var33 * 2.0F;
            float var37 = var29 + var33 * 2.0F;
            int var38 = var10 == null ? -36966 : var10.uVunuUNVVUUV();
            int var39 = var10 == null ? -8462337 : var10.UNnVVNvvnVvU();
            int var40 = var15 ? NUunUunuNV.UuUVuuUu(238, 242, 250, 214) : NUunUunuNV.UuUVuuUu(7, 9, 14, 218);
            this.UuuNnUvUuv.clear();
            this.UuUVuuUu(
               var34,
               var35,
               var34 - var26,
               var35 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuUVuuUu(
               var34 + var36,
               var35,
               var34 + var36 - var26,
               var35 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuUVuuUu(
               var34 + var36,
               var35 + var37,
               var34 + var36 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuUVuuUu(
               var34,
               var35,
               var34 - var26,
               var35 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuUVuuUu(
               var34 + var36,
               var35 + var37,
               var34 + var36 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuUVuuUu(
               var34,
               var35 + var37,
               var34 - var26,
               var35 + var37 - var27,
               var28,
               var29,
               var31,
               var32,
               var38,
               var39,
               var40,
               var7,
               var8,
               var9,
               var16,
               var11 - var26,
               var12 - var27
            );
            this.UuuNnUvUuv.flip();
            var1.uUnuvNvvNU();
            VvuuVNVUn.NVnVnNnN var41 = VvuuVNVUn.UuUVuuUu();
            boolean var47 = false /* VF: Semaphore variable */;

            boolean var42;
            label88: {
               boolean var43;
               try {
                  var47 = true;
                  GL11.glViewport(0, 0, var13, var14);
                  GL11.glDisable(3089);
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDepthMask(false);
                  GL11.glEnable(3042);
                  GL14.glBlendFuncSeparate(770, 771, 1, 771);
                  GL11.glDisable(36281);
                  this.VVuuUN.UuUVuuUu();
                  if (this.vuuuNvNuv >= 0) {
                     GL20.glUniform2f(this.vuuuNvNuv, var13, var14);
                  }

                  if (this.nvUVNnuu >= 0) {
                     GL20.glUniform1f(this.nvUVNnuu, uVvVnUU.UuUVuuUu().uUnuvNvvNU());
                  }

                  GL30.glBindVertexArray(this.vNUvnnVnUvu);
                  GL15.glBindBuffer(34962, this.uVUuuVnNVU);
                  GL15.glBufferSubData(34962, 0L, this.UuuNnUvUuv);
                  GL11.glDrawArrays(4, 0, 6);
                  var42 = true;
                  var47 = false;
                  break label88;
               } catch (Throwable var48) {
                  this.UnUNVVVNuv = true;
                  var43 = false;
                  var47 = false;
               } finally {
                  if (var47) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL15.glBindBuffer(34962, 0);
                     VvuuVNVUn.uUnuvNvvNU(var41);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               VvuuVNVUn.uUnuvNvvNU(var41);
               return var43;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL15.glBindBuffer(34962, 0);
            VvuuVNVUn.uUnuvNvvNU(var41);
            return var42;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean C00OOC00oO() {
      if (!this.nUUVuvU) {
         this.nUUVuvU = true;

         try {
            this.VVuuUN = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/foundry/node_surface.vert", "assets/wild/shaders/foundry/node_surface.frag");
            this.vuuuNvNuv = this.VVuuUN.UuUVuuUu("uViewport");
            this.nvUVNnuu = this.VVuuUN.UuUVuuUu("uTime");
            this.vNUvnnVnUvu = GL30.glGenVertexArrays();
            this.uVUuuVnNVU = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.vNUvnnVnUvu);
            GL15.glBindBuffer(34962, this.uVUuuVnNVU);
            GL15.glBufferData(34962, 624L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(6);
            GL20.glVertexAttribPointer(6, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 2, 5126, false, 104, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.UuuNnUvUuv = BufferUtils.createFloatBuffer(156);
            return true;
         } catch (Throwable var2) {
            this.UnUNVVVNuv = true;
            this.VVuuUN = null;
            return false;
         }
      } else {
         return this.VVuuUN != null && this.vNUvnnVnUvu != 0;
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
      int var9,
      int var10,
      int var11,
      float var12,
      float var13,
      float var14,
      float var15,
      float var16,
      float var17
   ) {
      this.UuuNnUvUuv.put(var1).put(var2);
      this.UuuNnUvUuv.put(var3).put(var4);
      this.UuuNnUvUuv.put(var5).put(var6).put(var7).put(var8);
      this.UuUVuuUu(var9);
      this.UuUVuuUu(var10);
      this.UuUVuuUu(var11);
      this.UuuNnUvUuv.put(UuUVuuUu(var12, 0.0F, 1.0F)).put(UuUVuuUu(var13, 0.0F, 1.0F)).put(UuUVuuUu(var14, 0.0F, 1.0F)).put(var15);
      this.UuuNnUvUuv.put(var16).put(var17);
   }

   private void UuUVuuUu(int var1) {
      this.UuuNnUvUuv.put(C00OOC00oO(var1)).put(uUnuvNvvNU(var1)).put(vVvUvVVuuNvV(var1)).put(uNNnnnuuuN(var1));
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

   private static float UuUVuuUu(float var0, float var1, float var2, float var3) {
      return Math.min(Math.min(var0, var1), Math.min(var2, var3));
   }

   private static float C00OOC00oO(float var0, float var1, float var2, float var3) {
      return Math.max(Math.max(var0, var1), Math.max(var2, var3));
   }

   private static float C00OOC00oO(int var0) {
      return (var0 >>> 16 & 0xFF) / 255.0F;
   }

   private static float uUnuvNvvNU(int var0) {
      return (var0 >>> 8 & 0xFF) / 255.0F;
   }

   private static float vVvUvVVuuNvV(int var0) {
      return (var0 & 0xFF) / 255.0F;
   }

   private static float uNNnnnuuuN(int var0) {
      return (var0 >>> 24 & 0xFF) / 255.0F;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }
}

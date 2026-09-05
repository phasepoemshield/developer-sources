package ru.metaculture.protection;

import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class ocoCO0oO {
   private static final ocoCO0oO UuUVuuUu = new ocoCO0oO();
   private static final String C00OOC00oO = "assets/wild/shaders/foundry/wire.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/foundry/wire.frag";
   private static final int vVvUvVVuuNvV = 6;
   private static final int uNNnnnuuuN = 26;
   private static final int nuUnNvnuUu = 104;
   private static final int VVuuUN = 256;
   private static final int vNUvnnVnUvu = 1536;
   private vVvUNNUVVnNn uVUuuVnNVU;
   private int vuuuNvNuv;
   private int nvUVNnuu;
   private FloatBuffer UuuNnUvUuv;
   private boolean nUUVuvU;
   private boolean UnUNVVVNuv;
   private boolean vNVuvnUUnuUn;
   private int UvnvNVnnnnNU;
   private int uVUVnuvnuVuv;
   private float NVNnnvnuunNv;
   private int uVunuUNVVUUV;
   private int UNnVVNvvnVvU;
   private int uNnUnnuNUnNu;
   private int NnUuNNU;
   private float[] nNvNUVU;

   private ocoCO0oO() {
   }

   public static ocoCO0oO UuUVuuUu() {
      return UuUVuuUu;
   }

   public boolean UuUVuuUu(UnVNvNnU var1, int var2, int var3, float var4) {
      if (!this.UnUNVVVNuv && var1 != null && var2 > 0 && var3 > 0) {
         float var5 = UuUVuuUu(var4, 0.0F, 1.0F) * UuUVuuUu(var1.nUUVuvU(), 0.0F, 1.0F);
         if (!(var5 <= 0.001F) && this.uUnuvNvvNU()) {
            var1.uUnuvNvvNU();
            this.UvnvNVnnnnNU = var2;
            this.uVUVnuvnuVuv = var3;
            this.NVNnnvnuunNv = var5;
            this.uVunuUNVVUUV = 0;
            this.vNVuvnUUnuUn = true;
            this.nNvNUVU = var1.nvUVNnuu().uNNnnnuuuN();
            this.UuuNnUvUuv.clear();
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   public void UuUVuuUu(float var1, float var2, float var3, float var4, float var5, int var6, int var7, float var8, boolean var9, float var10, float var11) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, 0.0F, 0.0F, 0.0F, 0.0F);
   }

   public void UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      int var6,
      int var7,
      float var8,
      boolean var9,
      float var10,
      float var11,
      float var12,
      float var13,
      float var14,
      float var15
   ) {
      if (this.vNVuvnUUnuUn && this.uVunuUNVVUUV + 6 <= 1536) {
         float var16 = (var6 >>> 24 & 0xFF) / 255.0F;
         float var17 = (var7 >>> 24 & 0xFF) / 255.0F;
         float var18 = (float)Math.hypot(var3 - var1, var4 - var2);
         if ((!(var16 <= 0.001F) || !(var17 <= 0.001F)) && !(var18 < 0.5F)) {
            float var19 = UuUVuuUu((var4 - var2) * 0.035F, -18.0F, 18.0F) + UuUVuuUu((var13 + var15) * 0.24F, -26.0F, 26.0F);
            float var20 = var1 + var5 + var12 * 0.34F;
            float var21 = var2 + var19 + var13 * 0.18F;
            float var22 = var3 - var5 + var14 * 0.34F;
            float var23 = var4 + var19 + var15 * 0.18F;
            float var24 = UuUVuuUu(this.nNvNUVU, var1, var2);
            float var25 = C00OOC00oO(this.nNvNUVU, var1, var2);
            float var26 = UuUVuuUu(this.nNvNUVU, var20, var21);
            float var27 = C00OOC00oO(this.nNvNUVU, var20, var21);
            float var28 = UuUVuuUu(this.nNvNUVU, var22, var23);
            float var29 = C00OOC00oO(this.nNvNUVU, var22, var23);
            float var30 = UuUVuuUu(this.nNvNUVU, var3, var4);
            float var31 = C00OOC00oO(this.nNvNUVU, var3, var4);
            float var32 = UuUVuuUu(this.nNvNUVU);
            float var33 = Math.min(1.86F, Math.max(0.96F, var8 * 0.88F * var32));
            float var34 = var33 + Math.max(3.1F, 3.7F * var32);
            float var35 = var33 + Math.max(9.0F, 10.6F * var32);
            float var36 = var35 + 4.5F;
            float var37 = UuUVuuUu(var24, var26, var28, var30) - var36;
            float var38 = UuUVuuUu(var25, var27, var29, var31) - var36;
            float var39 = C00OOC00oO(var24, var26, var28, var30) + var36;
            float var40 = C00OOC00oO(var25, var27, var29, var31) + var36;
            float var41 = (var6 >> 16 & 0xFF) / 255.0F;
            float var42 = (var6 >> 8 & 0xFF) / 255.0F;
            float var43 = (var6 & 0xFF) / 255.0F;
            float var44 = (var7 >> 16 & 0xFF) / 255.0F;
            float var45 = (var7 >> 8 & 0xFF) / 255.0F;
            float var46 = (var7 & 0xFF) / 255.0F;
            boolean var47 = var11 >= 0.0F && var10 > 0.001F;
            float var48 = var47 ? Math.min(1.0F, 0.7F + Math.max(0.0F, var10) * 1.15F) : 0.0F;
            float var49 = var47 ? 1.0F : 0.0F;
            float var50 = var11 < 0.0F ? 0.0F : var11;
            this.UuUVuuUu(
               var37,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
            this.UuUVuuUu(
               var39,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
            this.UuUVuuUu(
               var39,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
            this.UuUVuuUu(
               var37,
               var38,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
            this.UuUVuuUu(
               var39,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
            this.UuUVuuUu(
               var37,
               var40,
               var24,
               var25,
               var26,
               var27,
               var28,
               var29,
               var30,
               var31,
               var41,
               var42,
               var43,
               var16,
               var44,
               var45,
               var46,
               var17,
               var33,
               var34,
               var35,
               var18 * var32,
               var10,
               var48,
               var49,
               var50
            );
         }
      }
   }

   public void C00OOC00oO() {
      if (this.vNVuvnUUnuUn) {
         this.vNVuvnUUnuUn = false;
         this.nNvNUVU = null;
         if (this.uVunuUNVVUUV > 0) {
            this.UuuNnUvUuv.flip();
            VvuuVNVUn.NVnVnNnN var1 = VvuuVNVUn.UuUVuuUu();

            try {
               GL11.glViewport(0, 0, this.UvnvNVnnnnNU, this.uVUVnuvnuVuv);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3089);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               this.uVUuuVnNVU.UuUVuuUu();
               GL30.glBindVertexArray(this.vuuuNvNuv);
               GL15.glBindBuffer(34962, this.nvUVNnuu);
               GL15.glBufferSubData(34962, 0L, this.UuuNnUvUuv);
               GL20.glUniform2f(this.UNnVVNvvnVvU, this.UvnvNVnnnnNU, this.uVUVnuvnuVuv);
               GL20.glUniform1f(this.uNnUnnuNUnNu, this.NVNnnvnuunNv);
               GL20.glUniform1f(this.NnUuNNU, uVvVnUU.UuUVuuUu().uUnuvNvvNU());
               GL11.glDrawArrays(4, 0, this.uVunuUNVVUUV);
            } catch (Throwable var6) {
            } finally {
               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL15.glBindBuffer(34962, 0);
               VvuuVNVUn.uUnuvNvvNU(var1);
            }
         }
      }
   }

   public boolean UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      int var8,
      float var9,
      boolean var10,
      float var11,
      float var12,
      int var13,
      int var14
   ) {
      if (!this.UuUVuuUu(var1, var13, var14, var12)) {
         return false;
      } else {
         this.UuUVuuUu(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, -1.0F);
         this.C00OOC00oO();
         return true;
      }
   }

   private boolean uUnuvNvvNU() {
      if (this.nUUVuvU) {
         return this.uVUuuVnNVU != null;
      } else {
         this.nUUVuvU = true;

         try {
            this.uVUuuVnNVU = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/foundry/wire.vert", "assets/wild/shaders/foundry/wire.frag");
            this.UNnVVNvvnVvU = this.uVUuuVnNVU.UuUVuuUu("uViewport");
            this.uNnUnnuNUnNu = this.uVUuuVnNVU.UuUVuuUu("uAlpha");
            this.NnUuNNU = this.uVUuuVnNVU.UuUVuuUu("u_Time");
            this.vuuuNvNuv = GL30.glGenVertexArrays();
            this.nvUVNnuu = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.vuuuNvNuv);
            GL15.glBindBuffer(34962, this.nvUVNnuu);
            GL15.glBufferData(34962, 159744L, 35048);
            int var1 = 0;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(2);
            GL20.glVertexAttribPointer(2, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(3);
            GL20.glVertexAttribPointer(3, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(4);
            GL20.glVertexAttribPointer(4, 2, 5126, false, 104, var1);
            var1 += 8;
            GL20.glEnableVertexAttribArray(5);
            GL20.glVertexAttribPointer(5, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(6);
            GL20.glVertexAttribPointer(6, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(7);
            GL20.glVertexAttribPointer(7, 4, 5126, false, 104, var1);
            var1 += 16;
            GL20.glEnableVertexAttribArray(8);
            GL20.glVertexAttribPointer(8, 4, 5126, false, 104, var1);
            GL15.glBindBuffer(34962, 0);
            GL30.glBindVertexArray(0);
            this.UuuNnUvUuv = BufferUtils.createFloatBuffer(39936);
            return true;
         } catch (Throwable var2) {
            this.UnUNVVVNuv = true;
            this.uVUuuVnNVU = null;
            return false;
         }
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
      float var18,
      float var19,
      float var20,
      float var21,
      float var22,
      float var23,
      float var24,
      float var25,
      float var26
   ) {
      this.UuuNnUvUuv.put(var1).put(var2);
      this.UuuNnUvUuv.put(var3).put(var4);
      this.UuuNnUvUuv.put(var5).put(var6);
      this.UuuNnUvUuv.put(var7).put(var8);
      this.UuuNnUvUuv.put(var9).put(var10);
      this.UuuNnUvUuv.put(var11).put(var12).put(var13).put(var14);
      this.UuuNnUvUuv.put(var15).put(var16).put(var17).put(var18);
      this.UuuNnUvUuv.put(var19).put(var20).put(var21).put(var22);
      this.UuuNnUvUuv.put(var23).put(var24).put(var25).put(var26);
      this.uVunuUNVVUUV++;
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

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }
}

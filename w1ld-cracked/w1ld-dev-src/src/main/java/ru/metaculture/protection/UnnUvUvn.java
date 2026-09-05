package ru.metaculture.protection;

import net.minecraft.class_310;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class UnnUvUvn {
   private static final UnnUvUvn UuUVuuUu = new UnnUvUvn();
   private static final String C00OOC00oO = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String uUnuvNvvNU = "assets/wild/shaders/hud/hud_ferrofluid_surface.frag";
   private vVvUNNUVVnNn vVvUvVVuuNvV;
   private int uNNnnnuuuN;
   private int nuUnNvnuUu;
   private int VVuuUN = -1;
   private int vNUvnnVnUvu = -1;
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
   private boolean NnUuNNU;
   private boolean nNvNUVU;

   private UnnUvUvn() {
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
      if (!this.nNvNUVU && var1 != null && var16 != null && var16.method_22683() != null && !(var4 <= 1.0F) && !(var5 <= 1.0F) && !(var7 <= 0.001F)) {
         int var17 = var16.method_22683().method_4489();
         int var18 = var16.method_22683().method_4506();
         if (var17 > 1 && var18 > 1 && this.UuUVuuUu()) {
            var1.uUnuvNvvNU();
            float var19 = Math.max(18.0F, var6 * 2.8F);
            float var20 = nNuUNVu.UuUVuuUu().VVuuUN();
            float var21 = nNuUNVu.UuUVuuUu().vNUvnnVnUvu();
            VvuuVNVUn.NVnVnNnN var22 = VvuuVNVUn.UuUVuuUu();

            boolean var24;
            try {
               GL11.glViewport(0, 0, var17, var18);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3089);
               GL11.glDepthMask(false);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               this.vVvUvVVuuNvV.UuUVuuUu();
               if (this.VVuuUN >= 0) {
                  GL20.glUniform2f(this.VVuuUN, var17, var18);
               }

               if (this.vNUvnnVnUvu >= 0) {
                  GL20.glUniform1f(this.vNUvnnVnUvu, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
               }

               if (this.uVUuuVnNVU >= 0) {
                  GL20.glUniform4f(this.uVUuuVnNVU, var2 - var19, var3 - var19, var4 + var19 * 2.0F, var5 + var19 * 2.0F);
               }

               if (this.vuuuNvNuv >= 0) {
                  GL20.glUniform4f(this.vuuuNvNuv, var2, var3, var4, var5);
               }

               if (this.nvUVNnuu >= 0) {
                  GL20.glUniform1f(this.nvUVNnuu, Math.max(0.0F, var6));
               }

               if (this.UuuNnUvUuv >= 0) {
                  GL20.glUniform1f(this.UuuNnUvUuv, UuUVuuUu(var7));
               }

               if (this.nUUVuvU >= 0) {
                  GL20.glUniform1f(this.nUUVuvU, var8 ? 1.0F : 0.0F);
               }

               if (this.UnUNVVVNuv >= 0) {
                  C00OOC00oO(this.UnUNVVVNuv, var9);
               }

               if (this.vNVuvnUUnuUn >= 0) {
                  C00OOC00oO(this.vNVuvnUUnuUn, var10);
               }

               if (this.UvnvNVnnnnNU >= 0) {
                  UuUVuuUu(this.UvnvNVnnnnNU, var11);
               }

               if (this.uVUVnuvnuVuv >= 0) {
                  UuUVuuUu(this.uVUVnuvnuVuv, var12);
               }

               if (this.NVNnnvnuunNv >= 0) {
                  GL20.glUniform2f(this.NVNnnvnuunNv, var20, var21);
               }

               if (this.uVunuUNVVUUV >= 0) {
                  GL20.glUniform1f(this.uVunuUNVVUUV, var13 ? 1.0F : 0.0F);
               }

               if (this.UNnVVNvvnVvU >= 0) {
                  GL20.glUniform1f(this.UNnVVNvvnVvU, var14 ? 1.0F : 0.0F);
               }

               if (this.uNnUnnuNUnNu >= 0) {
                  GL20.glUniform1f(this.uNnUnnuNUnNu, UuUVuuUu(var15));
               }

               GL30.glBindVertexArray(this.uNNnnnuuuN);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
               return true;
            } catch (Throwable var28) {
               this.nNvNUVU = true;
               var24 = false;
            } finally {
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var22);
            }

            return var24;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu() {
      if (!this.NnUuNNU) {
         this.NnUuNNU = true;

         try {
            this.vVvUvVVuuNvV = vVvUNNUVVnNn.UuUVuuUu("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/hud_ferrofluid_surface.frag");
            this.VVuuUN = this.vVvUvVVuuNvV.UuUVuuUu("uResolution");
            this.vNUvnnVnUvu = this.vVvUvVVuuNvV.UuUVuuUu("uTime");
            this.uVUuuVnNVU = this.vVvUvVVuuNvV.UuUVuuUu("uDrawRect");
            this.vuuuNvNuv = this.vVvUvVVuuNvV.UuUVuuUu("uElementRect");
            this.nvUVNnuu = this.vVvUvVVuuNvV.UuUVuuUu("uRadius");
            this.UuuNnUvUuv = this.vVvUvVVuuNvV.UuUVuuUu("uAlpha");
            this.nUUVuvU = this.vVvUvVVuuNvV.UuUVuuUu("uInset");
            this.UnUNVVVNuv = this.vVvUvVVuuNvV.UuUVuuUu("uSurfaceColor");
            this.vNVuvnUUnuUn = this.vVvUvVVuuNvV.UuUVuuUu("uOutlineColor");
            this.UvnvNVnnnnNU = this.vVvUvVVuuNvV.UuUVuuUu("uAccentTop");
            this.uVUVnuvnuVuv = this.vVvUvVVuuNvV.UuUVuuUu("uAccentBottom");
            this.NVNnnvnuunNv = this.vVvUvVVuuNvV.UuUVuuUu("uMouse");
            this.uVunuUNVVUUV = this.vVvUvVVuuNvV.UuUVuuUu("uShadow");
            this.UNnVVNvvnVvU = this.vVvUvVVuuNvV.UuUVuuUu("uOutline");
            this.uNnUnnuNUnNu = this.vVvUvVVuuNvV.UuUVuuUu("uLightMode");
            this.uNNnnnuuuN = GL30.glGenVertexArrays();
            this.nuUnNvnuUu = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.uNNnnnuuuN);
            GL15.glBindBuffer(34962, this.nuUnNvnuUu);
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
            this.nNvNUVU = true;
            this.vVvUvVVuuNvV = null;
            return false;
         }
      } else {
         return this.vVvUvVVuuNvV != null && this.uNNnnnuuuN != 0;
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

   private static float UuUVuuUu(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}

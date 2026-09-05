package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class OoCO0OO0OcO implements AutoCloseable {
   private static final String UuUVuuUu = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String C00OOC00oO = "assets/wild/shaders/clickgui/holo_blur.frag";
   private static volatile OoCO0OO0OcO uUnuvNvvNU;
   private final uUvVUVnVNV vVvUvVVuuNvV = new uUvVUVnVNV();
   private nnUnNnuvvN uNNnnnuuuN;
   private uUvVUVnVNV.NVnVnNnN nuUnNvnuUu;
   private int VVuuUN;
   private int vNUvnnVnUvu;
   private int uVUuuVnNVU;
   private long vuuuNvNuv;
   private float nvUVNnuu;
   private long UuuNnUvUuv;
   private boolean nUUVuvU;
   private boolean UnUNVVVNuv;
   private boolean vNVuvnUUnuUn;
   private float UvnvNVnnnnNU = 0.5F;
   private float uVUVnuvnuVuv = 0.5F;
   private long NVNnnvnuunNv;
   private float uVunuUNVVUUV;
   private float UNnVVNvvnVvU;
   private static final float uNnUnnuNUnNu = 0.85F;

   public static OoCO0OO0OcO UuUVuuUu() {
      OoCO0OO0OcO var0 = uUnuvNvvNU;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (OoCO0OO0OcO.class) {
            if (uUnuvNvvNU == null) {
               uUnuvNvvNU = new OoCO0OO0OcO();
            }

            return uUnuvNvvNU;
         }
      }
   }

   private OoCO0OO0OcO() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(
      int var1,
      int var2,
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
      float var15
   ) {
      if (!this.UnUNVVVNuv) {
         if (var1 > 1 && var2 > 1) {
            if (!(var5 <= 0.001F)) {
               VvuuVNVUn.NVnVnNnN var16 = VvuuVNVUn.UuUVuuUu();
               boolean var24 = false /* VF: Semaphore variable */;

               label94: {
                  label112: {
                     label113: {
                        try {
                           var24 = true;
                           this.C00OOC00oO();
                           if (this.UnUNVVVNuv) {
                              var24 = false;
                              break label94;
                           }

                           this.C00OOC00oO(var1, var2);
                           if (this.VVuuUN == 0) {
                              var24 = false;
                              break label112;
                           }

                           GL11.glDisable(2929);
                           GL11.glDisable(2884);
                           GL11.glDisable(3089);
                           GL11.glColorMask(true, true, true, true);
                           GL11.glEnable(3042);
                           GL14.glBlendFuncSeparate(770, 771, 1, 771);
                           GL11.glViewport(0, 0, var1, var2);
                           this.nuUnNvnuUu.UuUVuuUu();
                           this.nuUnNvnuUu.UuUVuuUu("uViewport", var1, var2);
                           this.nuUnNvnuUu.UuUVuuUu("uRect", 0.0F, 0.0F, var1, var2);
                           this.nuUnNvnuUu.UuUVuuUu("uScene", 0);
                           this.nuUnNvnuUu.UuUVuuUu("uResolution", var1, var2);
                           this.nuUnNvnuUu.UuUVuuUu("uTime", this.uUnuvNvvNU());
                           float var17 = C00OOC00oO(var1 <= 0 ? 0.0F : var3 / var1);
                           float var18 = C00OOC00oO(var2 <= 0 ? 0.0F : var4 / var2);
                           this.nuUnNvnuUu.UuUVuuUu("uMouse", var17, var18);
                           this.nuUnNvnuUu.UuUVuuUu("uIntensity", C00OOC00oO(var5));
                           this.nuUnNvnuUu.UuUVuuUu("uBlurMax", Math.max(0.0F, var6));
                           this.nuUnNvnuUu.UuUVuuUu("uTint", C00OOC00oO(var7));
                           this.nuUnNvnuUu.UuUVuuUu("uMouseInfluence", Math.max(0.0F, var8));
                           this.nuUnNvnuUu.UuUVuuUu("uClarityRadius", Math.max(0.05F, var9));
                           this.nuUnNvnuUu.UuUVuuUu("uNoiseScale", Math.max(0.5F, var10));
                           this.nuUnNvnuUu.UuUVuuUu("uFlowSpeed", var11);
                           this.nuUnNvnuUu.UuUVuuUu("uContrast", C00OOC00oO(var12));
                           this.nuUnNvnuUu.UuUVuuUu("uVignette", C00OOC00oO(var13));
                           this.nuUnNvnuUu.UuUVuuUu("uBrightness", C00OOC00oO(var14));
                           this.nuUnNvnuUu.UuUVuuUu("uSaturation", C00OOC00oO(var15));
                           float var19 = C00OOC00oO(var5);
                           float var20 = this.UuUVuuUu(var19, var17, var18);
                           this.nuUnNvnuUu.UuUVuuUu("uEntry", var20);
                           this.nuUnNvnuUu.UuUVuuUu("uEntryCenter", this.UvnvNVnnnnNU, this.uVUVnuvnuVuv);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, this.VVuuUN);
                           this.uNNnnnuuuN.UuUVuuUu();
                           var24 = false;
                           break label113;
                        } catch (Throwable var25) {
                           this.UnUNVVVNuv = true;
                           vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("HoloBlurBackground.render", var25);
                           var24 = false;
                        } finally {
                           if (var24) {
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              VvuuVNVUn.uUnuvNvvNU(var16);
                           }
                        }

                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        VvuuVNVUn.uUnuvNvvNU(var16);
                        return;
                     }

                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     VvuuVNVUn.uUnuvNvvNU(var16);
                     return;
                  }

                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  VvuuVNVUn.uUnuvNvvNU(var16);
                  return;
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               VvuuVNVUn.uUnuvNvvNU(var16);
            }
         }
      }
   }

   private void C00OOC00oO(int var1, int var2) {
      if (this.VVuuUN == 0) {
         this.VVuuUN = GL11.glGenTextures();
         if (this.VVuuUN == 0) {
            return;
         }

         GL11.glBindTexture(3553, this.VVuuUN);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         this.vNUvnnVnUvu = 0;
         this.uVUuuVnNVU = 0;
      } else {
         GL11.glBindTexture(3553, this.VVuuUN);
      }

      if (this.vNUvnnVnUvu == var1 && this.uVUuuVnNVU == var2) {
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, var1, var2);
      } else {
         GL11.glCopyTexImage2D(3553, 0, 32856, 0, 0, var1, var2, 0);
         this.vNUvnnVnUvu = var1;
         this.uVUuuVnNVU = var2;
      }
   }

   private void C00OOC00oO() {
      if (!this.nUUVuvU) {
         try {
            this.uNNnnnuuuN = new nnUnNnuvvN();
            this.nuUnNvnuUu = this.vVvUvVVuuNvV
               .UuUVuuUu("clickgui_holo", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/clickgui/holo_blur.frag");
            this.vuuuNvNuv = System.nanoTime();
            this.UuuNnUvUuv = this.vuuuNvNuv;
            this.nvUVNnuu = 0.0F;
            this.nUUVuvU = true;
         } catch (Throwable var2) {
            this.UnUNVVVNuv = true;
            vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("HoloBlurBackground.ensure", var2);
         }
      }
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      long var4 = System.nanoTime();
      boolean var6 = var1 > this.UNnVVNvvnVvU + 1.0E-4F;
      boolean var7 = var1 < this.UNnVVNvvnVvU - 1.0E-4F;
      this.UNnVVNvvnVvU = var1;
      if (var1 < 0.012F) {
         this.vNVuvnUUnuUn = false;
         this.NVNnnvnuunNv = 0L;
         this.uVunuUNVVUUV = 0.0F;
         return 0.0F;
      } else {
         if (!this.vNVuvnUUnuUn) {
            this.vNVuvnUUnuUn = true;
            this.NVNnnvnuunNv = var4;
            this.UvnvNVnnnnNU = C00OOC00oO(var2);
            this.uVUVnuvnuVuv = C00OOC00oO(var3);
            this.uVunuUNVVUUV = 0.0F;
         }

         float var8;
         if (this.NVNnnvnuunNv == 0L) {
            this.NVNnnvnuunNv = var4;
            var8 = 0.0F;
         } else {
            float var9 = (float)(var4 - this.NVNnnvnuunNv) / 1.0E9F;
            var8 = C00OOC00oO(var9 / 0.85F);
         }

         float var11 = 1.0F - (1.0F - var8) * (1.0F - var8) * (1.0F - var8);
         float var10 = Math.min(var11, UuUVuuUu(var1));
         if (var7) {
            var10 = Math.min(var10, UuUVuuUu(var1));
         }

         if (var6 && var10 > this.uVunuUNVVUUV) {
            this.uVunuUNVVUUV = var10;
         } else {
            this.uVunuUNVVUUV = var10;
         }

         return C00OOC00oO(this.uVunuUNVVUUV);
      }
   }

   private static float UuUVuuUu(float var0) {
      float var1 = C00OOC00oO(var0 / 0.6F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private float uUnuvNvvNU() {
      long var1 = System.nanoTime();
      if (this.UuuNnUvUuv == 0L) {
         this.UuuNnUvUuv = var1;
         return this.nvUVNnuu;
      } else {
         float var3 = (float)(var1 - this.UuuNnUvUuv) / 1.0E9F;
         this.UuuNnUvUuv = var1;
         if (!Float.isFinite(var3) || var3 < 0.0F) {
            var3 = 0.0F;
         }

         this.nvUVNnuu = this.nvUVNnuu + Math.min(var3, 0.1F);
         if (this.nvUVNnuu > 720.0F) {
            this.nvUVNnuu -= 720.0F;
         }

         return this.nvUVNnuu;
      }
   }

   private static float C00OOC00oO(float var0) {
      if (Float.isNaN(var0)) {
         return 0.0F;
      } else if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   @Override
   public void close() {
      try {
         if (this.VVuuUN != 0) {
            GL11.glDeleteTextures(this.VVuuUN);
            this.VVuuUN = 0;
         }

         if (this.uNNnnnuuuN != null) {
            this.uNNnnnuuuN.close();
            this.uNNnnnuuuN = null;
         }

         this.vVvUvVVuuNvV.close();
      } catch (Throwable var2) {
      }

      this.nUUVuvU = false;
      this.vuuuNvNuv = 0L;
      this.UuuNnUvUuv = 0L;
      this.nvUVNnuu = 0.0F;
      this.vNVuvnUUnuUn = false;
      this.UvnvNVnnnnNU = 0.5F;
      this.uVUVnuvnuVuv = 0.5F;
      this.NVNnnvnuunNv = 0L;
      this.uVunuUNVVUUV = 0.0F;
      this.UNnVVNvvnVvU = 0.0F;
   }

   public void UuUVuuUu(int var1, int var2) {
      try {
         if (this.VVuuUN != 0) {
            GL11.glDeleteTextures(this.VVuuUN);
            this.VVuuUN = 0;
         }

         this.vNUvnnVnUvu = 0;
         this.uVUuuVnNVU = 0;
         if (this.uNNnnnuuuN != null) {
            try {
               this.uNNnnnuuuN.close();
            } catch (Throwable var5) {
            }

            this.uNNnnnuuuN = null;
         }

         try {
            this.vVvUvVVuuNvV.close();
         } catch (Throwable var4) {
         }

         this.nuUnNvnuUu = null;
         this.nUUVuvU = false;
         this.UnUNVVVNuv = false;
         this.vuuuNvNuv = 0L;
         this.UuuNnUvUuv = 0L;
         this.nvUVNnuu = 0.0F;
         this.vNVuvnUUnuUn = false;
         this.UvnvNVnnnnNU = 0.5F;
         this.uVUVnuvnuVuv = 0.5F;
         this.NVNnnvnuunNv = 0L;
         this.uVunuUNVVUUV = 0.0F;
         this.UNnVVNvvnVvU = 0.0F;
      } catch (Throwable var6) {
      }
   }
}

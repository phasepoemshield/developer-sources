package ru.metaculture.protection;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class VuVNuuUUv implements AutoCloseable {
   private static final String UuUVuuUu = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String C00OOC00oO = "assets/wild/shaders/colorplus/cp_grade.frag";
   private static final String uUnuvNvvNU = "assets/wild/shaders/colorplus/cp_bloom_extract.frag";
   private static final String vVvUvVVuuNvV = "assets/wild/shaders/colorplus/cp_bloom_blur.frag";
   private static final int uNNnnnuuuN = 4;
   private static volatile VuVNuuUUv nuUnNvnuUu;
   private final uUvVUVnVNV VVuuUN = new uUvVUVnVNV();
   private nnUnNnuvvN vNUvnnVnUvu;
   private uUvVUVnVNV.NVnVnNnN uVUuuVnNVU;
   private uUvVUVnVNV.NVnVnNnN vuuuNvNuv;
   private uUvVUVnVNV.NVnVnNnN nvUVNnuu;
   private int UuuNnUvUuv;
   private int nUUVuvU;
   private int UnUNVVVNuv;
   private int vNVuvnUUnuUn;
   private int UvnvNVnnnnNU;
   private int uVUVnuvnuVuv;
   private int NVNnnvnuunNv;
   private int uVunuUNVVUUV;
   private int UNnVVNvvnVvU;
   private int uNnUnnuNUnNu;
   private boolean NnUuNNU;
   private boolean nNvNUVU;
   private boolean UnUNuUU;

   public static VuVNuuUUv UuUVuuUu() {
      VuVNuuUUv var0 = nuUnNvnuUu;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (VuVNuuUUv.class) {
            if (nuUnNvnuUu == null) {
               nuUnNvnuUu = new VuVNuuUUv();
            }

            return nuUnNvnuUu;
         }
      }
   }

   private VuVNuuUUv() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(int var1, int var2, int var3, VuVNuuUUv.NVnVnNnN var4) {
      if (!this.nNvNUVU && var4 != null) {
         if (var1 > 0) {
            if (var2 > 1 && var3 > 1) {
               if (!(var4.UuUVuuUu <= 0.001F)) {
                  int var5 = GL11.glGetInteger(36006);
                  int var6 = GL11.glGetInteger(36010);
                  int var7 = GL11.glGetInteger(36006);
                  VvuuVNVUn.NVnVnNnN var8 = VvuuVNVUn.UuUVuuUu();
                  boolean var9 = false;
                  boolean var14 = false /* VF: Semaphore variable */;

                  label231: {
                     label232: {
                        label247: {
                           label234: {
                              label248: {
                                 try {
                                    var14 = true;
                                    this.uUnuvNvvNU();
                                    if (this.nNvNUVU) {
                                       var14 = false;
                                       break label231;
                                    }

                                    this.C00OOC00oO(var2, var3);
                                    if (this.uNnUnnuNUnNu != 0) {
                                       if (this.uVUVnuvnuVuv != 0) {
                                          if (this.NVNnnvnuunNv != 0) {
                                             GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, var1, 0);
                                             GL11.glDrawBuffer(36064);
                                             GL11.glReadBuffer(36064);
                                             var9 = true;
                                             if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                                var14 = false;
                                                break label232;
                                             }

                                             GL11.glDisable(2929);
                                             GL11.glDisable(2884);
                                             GL11.glDisable(3089);
                                             GL11.glDisable(3042);
                                             GL11.glColorMask(true, true, true, true);
                                             this.UuUVuuUu(var2, var3);
                                             if (this.UuuNnUvUuv == 0) {
                                                var14 = false;
                                                break label247;
                                             }

                                             float var10 = var4.NVNnnvnuunNv;
                                             if (var10 > 0.001F) {
                                                this.UuUVuuUu(var4);
                                             }

                                             GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                                             GL11.glViewport(0, 0, var2, var3);
                                             this.uVUuuVnNVU.UuUVuuUu();
                                             this.uVUuuVnNVU.UuUVuuUu("uViewport", var2, var3);
                                             this.uVUuuVnNVU.UuUVuuUu("uRect", 0.0F, 0.0F, var2, var3);
                                             this.uVUuuVnNVU.UuUVuuUu("uScene", 0);
                                             this.uVUuuVnNVU.UuUVuuUu("uBloomTex", 1);
                                             this.uVUuuVnNVU.UuUVuuUu("uResolution", var2, var3);
                                             this.uVUuuVnNVU.UuUVuuUu("uStrength", UuUVuuUu(var4.UuUVuuUu));
                                             this.uVUuuVnNVU.UuUVuuUu("uExposure", C00OOC00oO(var4.C00OOC00oO));
                                             this.uVUuuVnNVU.UuUVuuUu("uContrast", C00OOC00oO(var4.uUnuvNvvNU));
                                             this.uVUuuVnNVU.UuUVuuUu("uSaturation", C00OOC00oO(var4.vVvUvVVuuNvV));
                                             this.uVUuuVnNVU.UuUVuuUu("uVibrance", C00OOC00oO(var4.uNNnnnuuuN));
                                             this.uVUuuVnNVU.UuUVuuUu("uGamma", C00OOC00oO(var4.nuUnNvnuUu));
                                             this.uVUuuVnNVU.UuUVuuUu("uTemperature", C00OOC00oO(var4.VVuuUN));
                                             this.uVUuuVnNVU.UuUVuuUu("uTint", C00OOC00oO(var4.vNUvnnVnUvu));
                                             this.uVUuuVnNVU.UuUVuuUu("uLift", var4.uVUuuVnNVU, var4.vuuuNvNuv, var4.nvUVNnuu);
                                             this.uVUuuVnNVU.UuUVuuUu("uGammaRgb", var4.UuuNnUvUuv, var4.nUUVuvU, var4.UnUNVVVNuv);
                                             this.uVUuuVnNVU.UuUVuuUu("uGain", var4.vNVuvnUUnuUn, var4.UvnvNVnnnnNU, var4.uVUVnuvnuVuv);
                                             this.uVUuuVnNVU.UuUVuuUu("uBloomIntensity", UuUVuuUu(var10));
                                             this.uVUuuVnNVU.UuUVuuUu("uBloomThreshold", Math.max(0.05F, var4.uVunuUNVVUUV));
                                             this.uVUuuVnNVU.UuUVuuUu("uBloomRadius", Math.max(2.0F, var4.UNnVVNvvnVvU));
                                             this.uVUuuVnNVU.UuUVuuUu("uSharpness", UuUVuuUu(var4.uNnUnnuNUnNu));
                                             this.uVUuuVnNVU.UuUVuuUu("uVignette", UuUVuuUu(var4.NnUuNNU));
                                             this.uVUuuVnNVU.UuUVuuUu("uFlipY", var4.nNvNUVU ? 1.0F : 0.0F);
                                             GL13.glActiveTexture(33985);
                                             GL11.glBindTexture(3553, this.vNVuvnUUnuUn);
                                             GL13.glActiveTexture(33984);
                                             GL11.glBindTexture(3553, this.UuuNnUvUuv);
                                             this.vNUvnnVnUvu.UuUVuuUu();
                                             if (!this.UnUNuUU) {
                                                System.out
                                                   .println("[ColorPlus] First successful render at " + var2 + "x" + var3 + " bloom=" + (var10 > 0.001F));
                                                this.UnUNuUU = true;
                                                var14 = false;
                                             } else {
                                                var14 = false;
                                             }
                                             break label234;
                                          }

                                          var14 = false;
                                       } else {
                                          var14 = false;
                                       }
                                    } else {
                                       var14 = false;
                                    }
                                    break label248;
                                 } catch (Throwable var15) {
                                    this.nNvNUVU = true;
                                    System.err.println("[ColorPlus] BROKEN: " + var15.getMessage());
                                    var15.printStackTrace();
                                    var14 = false;
                                 } finally {
                                    if (var14) {
                                       GL13.glActiveTexture(33985);
                                       GL11.glBindTexture(3553, 0);
                                       GL13.glActiveTexture(33984);
                                       GL11.glBindTexture(3553, 0);
                                       GL20.glUseProgram(0);
                                       if (var9 && this.uNnUnnuNUnNu != 0) {
                                          GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL30.glBindFramebuffer(36009, var5);
                                       GL30.glBindFramebuffer(36008, var6);
                                       GL30.glBindFramebuffer(36160, var7);
                                       VvuuVNVUn.uUnuvNvvNU(var8);
                                    }
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 if (var9 && this.uNnUnnuNUnNu != 0) {
                                    GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL30.glBindFramebuffer(36009, var5);
                                 GL30.glBindFramebuffer(36008, var6);
                                 GL30.glBindFramebuffer(36160, var7);
                                 VvuuVNVUn.uUnuvNvvNU(var8);
                                 return;
                              }

                              GL13.glActiveTexture(33985);
                              GL11.glBindTexture(3553, 0);
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              if (var9 && this.uNnUnnuNUnNu != 0) {
                                 GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL30.glBindFramebuffer(36009, var5);
                              GL30.glBindFramebuffer(36008, var6);
                              GL30.glBindFramebuffer(36160, var7);
                              VvuuVNVUn.uUnuvNvvNU(var8);
                              return;
                           }

                           GL13.glActiveTexture(33985);
                           GL11.glBindTexture(3553, 0);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           if (var9 && this.uNnUnnuNUnNu != 0) {
                              GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL30.glBindFramebuffer(36009, var5);
                           GL30.glBindFramebuffer(36008, var6);
                           GL30.glBindFramebuffer(36160, var7);
                           VvuuVNVUn.uUnuvNvvNU(var8);
                           return;
                        }

                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, 0);
                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        if (var9 && this.uNnUnnuNUnNu != 0) {
                           GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL30.glBindFramebuffer(36009, var5);
                        GL30.glBindFramebuffer(36008, var6);
                        GL30.glBindFramebuffer(36160, var7);
                        VvuuVNVUn.uUnuvNvvNU(var8);
                        return;
                     }

                     GL13.glActiveTexture(33985);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     if (var9 && this.uNnUnnuNUnNu != 0) {
                        GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     GL30.glBindFramebuffer(36009, var5);
                     GL30.glBindFramebuffer(36008, var6);
                     GL30.glBindFramebuffer(36160, var7);
                     VvuuVNVUn.uUnuvNvvNU(var8);
                     return;
                  }

                  GL13.glActiveTexture(33985);
                  GL11.glBindTexture(3553, 0);
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  if (var9 && this.uNnUnnuNUnNu != 0) {
                     GL30.glBindFramebuffer(36160, this.uNnUnnuNUnNu);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  }

                  GL30.glBindFramebuffer(36009, var5);
                  GL30.glBindFramebuffer(36008, var6);
                  GL30.glBindFramebuffer(36160, var7);
                  VvuuVNVUn.uUnuvNvvNU(var8);
               }
            }
         }
      }
   }

   private void UuUVuuUu(VuVNuuUUv.NVnVnNnN var1) {
      GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
      GL11.glViewport(0, 0, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.vuuuNvNuv.UuUVuuUu();
      this.vuuuNvNuv.UuUVuuUu("uViewport", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.vuuuNvNuv.UuUVuuUu("uRect", 0.0F, 0.0F, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.vuuuNvNuv.UuUVuuUu("uScene", 0);
      this.vuuuNvNuv.UuUVuuUu("uResolution", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.vuuuNvNuv.UuUVuuUu("uThreshold", Math.max(0.05F, var1.uVunuUNVVUUV));
      this.vuuuNvNuv.UuUVuuUu("uSoftness", 0.4F);
      this.vuuuNvNuv.UuUVuuUu("uFlipY", var1.nNvNUVU ? 1.0F : 0.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.UuuNnUvUuv);
      this.vNUvnnVnUvu.UuUVuuUu();
      GL30.glBindFramebuffer(36160, this.NVNnnvnuunNv);
      GL11.glViewport(0, 0, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu();
      this.nvUVNnuu.UuUVuuUu("uViewport", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uRect", 0.0F, 0.0F, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uScene", 0);
      this.nvUVNnuu.UuUVuuUu("uResolution", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uDirection", 1.0F, 0.0F);
      float var2 = Math.max(2.0F, var1.UNnVVNvvnVvU / 4.0F);
      this.nvUVNnuu.UuUVuuUu("uRadius", var2);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.vNVuvnUUnuUn);
      this.vNUvnnVnUvu.UuUVuuUu();
      GL30.glBindFramebuffer(36160, this.uVUVnuvnuVuv);
      GL11.glViewport(0, 0, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu();
      this.nvUVNnuu.UuUVuuUu("uViewport", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uRect", 0.0F, 0.0F, this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uScene", 0);
      this.nvUVNnuu.UuUVuuUu("uResolution", this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
      this.nvUVNnuu.UuUVuuUu("uDirection", 0.0F, 1.0F);
      this.nvUVNnuu.UuUVuuUu("uRadius", var2);
      GL11.glBindTexture(3553, this.UvnvNVnnnnNU);
      this.vNUvnnVnUvu.UuUVuuUu();
   }

   private void UuUVuuUu(int var1, int var2) {
      if (this.UuuNnUvUuv == 0) {
         this.UuuNnUvUuv = GL11.glGenTextures();
         if (this.UuuNnUvUuv == 0) {
            return;
         }

         GL11.glBindTexture(3553, this.UuuNnUvUuv);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         this.nUUVuvU = 0;
         this.UnUNVVVNuv = 0;
      } else {
         GL11.glBindTexture(3553, this.UuuNnUvUuv);
      }

      if (this.nUUVuvU == var1 && this.UnUNVVVNuv == var2) {
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, var1, var2);
      } else {
         GL11.glCopyTexImage2D(3553, 0, 32856, 0, 0, var1, var2, 0);
         this.nUUVuvU = var1;
         this.UnUNVVVNuv = var2;
      }
   }

   private void C00OOC00oO(int var1, int var2) {
      int var3 = Math.max(2, var1 / 4);
      int var4 = Math.max(2, var2 / 4);
      if (this.uNnUnnuNUnNu == 0) {
         this.uNnUnnuNUnNu = GL30.glGenFramebuffers();
      }

      if (this.vNVuvnUUnuUn == 0 || this.uVunuUNVVUUV != var3 || this.UNnVVNvvnVvU != var4) {
         this.C00OOC00oO();
         this.uVunuUNVVUUV = var3;
         this.UNnVVNvvnVvU = var4;
         this.vNVuvnUUnuUn = uUnuvNvvNU(this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
         this.UvnvNVnnnnNU = uUnuvNvvNU(this.uVunuUNVVUUV, this.UNnVVNvvnVvU);
         this.uVUVnuvnuVuv = UuUVuuUu(this.vNVuvnUUnuUn);
         this.NVNnnvnuunNv = UuUVuuUu(this.UvnvNVnnnnNU);
      }
   }

   private static int uUnuvNvvNU(int var0, int var1) {
      int var2 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var2);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glTexImage2D(3553, 0, 32856, var0, var1, 0, 6408, 5121, (ByteBuffer)null);
      GL11.glBindTexture(3553, 0);
      return var2;
   }

   private static int UuUVuuUu(int var0) {
      int var1 = GL30.glGenFramebuffers();
      GL30.glBindFramebuffer(36160, var1);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, var0, 0);
      GL11.glDrawBuffer(36064);
      return var1;
   }

   private void C00OOC00oO() {
      if (this.uVUVnuvnuVuv != 0) {
         GL30.glDeleteFramebuffers(this.uVUVnuvnuVuv);
         this.uVUVnuvnuVuv = 0;
      }

      if (this.NVNnnvnuunNv != 0) {
         GL30.glDeleteFramebuffers(this.NVNnnvnuunNv);
         this.NVNnnvnuunNv = 0;
      }

      if (this.vNVuvnUUnuUn != 0) {
         GL11.glDeleteTextures(this.vNVuvnUUnuUn);
         this.vNVuvnUUnuUn = 0;
      }

      if (this.UvnvNVnnnnNU != 0) {
         GL11.glDeleteTextures(this.UvnvNVnnnnNU);
         this.UvnvNVnnnnNU = 0;
      }

      this.uVunuUNVVUUV = 0;
      this.UNnVVNvvnVvU = 0;
   }

   private void uUnuvNvvNU() {
      if (!this.NnUuNNU) {
         try {
            this.vNUvnnVnUvu = new nnUnNnuvvN();
            this.uVUuuVnNVU = this.VVuuUN
               .UuUVuuUu("colorplus_grade", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_grade.frag");
            this.vuuuNvNuv = this.VVuuUN
               .UuUVuuUu("colorplus_bloom_extract", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_bloom_extract.frag");
            this.nvUVNnuu = this.VVuuUN
               .UuUVuuUu("colorplus_bloom_blur", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_bloom_blur.frag");
            this.NnUuNNU = true;
            System.out.println("[ColorPlus] Shaders loaded successfully");
         } catch (Throwable var2) {
            this.nNvNUVU = true;
            System.err.println("[ColorPlus] Shader load FAILED: " + var2.getMessage());
            var2.printStackTrace();
         }
      }
   }

   private static float UuUVuuUu(float var0) {
      if (Float.isNaN(var0)) {
         return 0.0F;
      } else if (var0 < 0.0F) {
         return 0.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   private static float C00OOC00oO(float var0) {
      if (Float.isNaN(var0)) {
         return 0.0F;
      } else if (var0 < -1.0F) {
         return -1.0F;
      } else {
         return var0 > 1.0F ? 1.0F : var0;
      }
   }

   @Override
   public void close() {
      try {
         if (this.UuuNnUvUuv != 0) {
            GL11.glDeleteTextures(this.UuuNnUvUuv);
            this.UuuNnUvUuv = 0;
         }

         this.C00OOC00oO();
         if (this.uNnUnnuNUnNu != 0) {
            GL30.glDeleteFramebuffers(this.uNnUnnuNUnNu);
            this.uNnUnnuNUnNu = 0;
         }

         if (this.vNUvnnVnUvu != null) {
            this.vNUvnnVnUvu.close();
            this.vNUvnnVnUvu = null;
         }

         this.VVuuUN.close();
      } catch (Throwable var2) {
      }

      this.NnUuNNU = false;
      this.nNvNUVU = false;
      this.UnUNuUU = false;
   }

   public static final class NVnVnNnN {
      public float UuUVuuUu = 1.0F;
      public float C00OOC00oO;
      public float uUnuvNvvNU;
      public float vVvUvVVuuNvV;
      public float uNNnnnuuuN;
      public float nuUnNvnuUu;
      public float VVuuUN;
      public float vNUvnnVnUvu;
      public float uVUuuVnNVU;
      public float vuuuNvNuv;
      public float nvUVNnuu;
      public float UuuNnUvUuv;
      public float nUUVuvU;
      public float UnUNVVVNuv;
      public float vNVuvnUUnuUn;
      public float UvnvNVnnnnNU;
      public float uVUVnuvnuVuv;
      public float NVNnnvnuunNv;
      public float uVunuUNVVUUV = 0.9F;
      public float UNnVVNvvnVvU = 64.0F;
      public float uNnUnnuNUnNu;
      public float NnUuNNU;
      public boolean nNvNUVU = true;
   }
}

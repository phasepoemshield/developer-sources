package ru.metaculture.protection;

import java.nio.ByteBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O0000O0O000O implements AutoCloseable {
   private static final String O00000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String O000000000 = "assets/wild/shaders/colorplus/cp_grade.frag";
   private static final String O0000000000 = "assets/wild/shaders/colorplus/cp_bloom_extract.frag";
   private static final String O00000000000 = "assets/wild/shaders/colorplus/cp_bloom_blur.frag";
   private static final int O000000000000 = 4;
   private static volatile O0000O0O000O O0000000000000;
   private final O00000OOO000 O000000000000O = new O00000OOO000();
   private O00000OOO O00000000000O;
   private O00000OOO000.W289 O00000000000O0;
   private O00000OOO000.W289 O00000000000OO;
   private O00000OOO000.W289 O0000000000O;
   private int O0000000000O0;
   private int O0000000000O00;
   private int O0000000000O0O;
   private int O0000000000OO;
   private int O0000000000OO0;
   private int O0000000000OOO;
   private int O000000000O;
   private int O000000000O0;
   private int O000000000O00;
   private int O000000000O000;
   private boolean O000000000O00O;
   private boolean O000000000O0O;
   private boolean O000000000O0O0;

   // $VF: Could not create synchronized statement, marking monitor enters and exits
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public static O0000O0O000O O00000000() {
      O0000O0O000O var0 = O0000000000000;
      if (var0 != null) {
         return var0;
      } else {
         Class<O0000O0O000O> var1 = O0000O0O000O.class;
         synchronized (O0000O0O000O.class){} // $VF: monitorenter 

         try {
            if (O0000000000000 == null) {
               O0000000000000 = new O0000O0O000O();
            }

            // $VF: monitorexit
            return O0000000000000;
         } finally {
            // $VF: monitorexit
         }
      }
   }

   private O0000O0O000O() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(int i, int j, int k, O0000O0O000O.W387 o00000000) {
      if (!this.O000000000O0O && o00000000 != null) {
         if (i > 0) {
            if (j > 1 && k > 1) {
               if (!(o00000000.O00000000 <= 0.001F)) {
                  int var5 = GL11.glGetInteger(36006);
                  int var6 = GL11.glGetInteger(36010);
                  int var7 = GL11.glGetInteger(36006);
                  O0000O00O0OOO0.W373 var8 = O0000O00O0OOO0.O00000000();
                  boolean var9 = false;
                  boolean var14 = false /* VF: Semaphore variable */;

                  label229: {
                     label230: {
                        label245: {
                           label232: {
                              label246: {
                                 try {
                                    var14 = true;
                                    this.O0000000000();
                                    if (this.O000000000O0O) {
                                       var14 = false;
                                       break label229;
                                    }

                                    this.O000000000(j, k);
                                    if (this.O000000000O000 != 0) {
                                       if (this.O0000000000OOO != 0) {
                                          if (this.O000000000O != 0) {
                                             GL30.glBindFramebuffer(36160, this.O000000000O000);
                                             GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
                                             GL11.glDrawBuffer(36064);
                                             GL11.glReadBuffer(36064);
                                             var9 = true;
                                             if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                                                var14 = false;
                                                break label230;
                                             }

                                             GL11.glDisable(2929);
                                             GL11.glDisable(2884);
                                             GL11.glDisable(3089);
                                             GL11.glDisable(3042);
                                             GL11.glColorMask(true, true, true, true);
                                             this.O00000000(j, k);
                                             if (this.O0000000000O0 == 0) {
                                                var14 = false;
                                                break label245;
                                             }

                                             float var10 = o00000000.O000000000O;
                                             if (var10 > 0.001F) {
                                                this.O00000000(o00000000);
                                             }

                                             GL30.glBindFramebuffer(36160, this.O000000000O000);
                                             GL11.glViewport(0, 0, j, k);
                                             this.O00000000000O0.O00000000();
                                             this.O00000000000O0.O00000000("uViewport", j, k);
                                             this.O00000000000O0.O00000000("uRect", 0.0F, 0.0F, j, k);
                                             this.O00000000000O0.O00000000("uScene", 0);
                                             this.O00000000000O0.O00000000("uBloomTex", 1);
                                             this.O00000000000O0.O00000000("uResolution", j, k);
                                             this.O00000000000O0.O00000000("uStrength", O00000000(o00000000.O00000000));
                                             this.O00000000000O0.O00000000("uExposure", O000000000(o00000000.O000000000));
                                             this.O00000000000O0.O00000000("uContrast", O000000000(o00000000.O0000000000));
                                             this.O00000000000O0.O00000000("uSaturation", O000000000(o00000000.O00000000000));
                                             this.O00000000000O0.O00000000("uVibrance", O000000000(o00000000.O000000000000));
                                             this.O00000000000O0.O00000000("uGamma", O000000000(o00000000.O0000000000000));
                                             this.O00000000000O0.O00000000("uTemperature", O000000000(o00000000.O000000000000O));
                                             this.O00000000000O0.O00000000("uTint", O000000000(o00000000.O00000000000O));
                                             this.O00000000000O0.O00000000("uLift", o00000000.O00000000000O0, o00000000.O00000000000OO, o00000000.O0000000000O);
                                             this.O00000000000O0
                                                .O00000000("uGammaRgb", o00000000.O0000000000O0, o00000000.O0000000000O00, o00000000.O0000000000O0O);
                                             this.O00000000000O0
                                                .O00000000("uGain", o00000000.O0000000000OO, o00000000.O0000000000OO0, o00000000.O0000000000OOO);
                                             this.O00000000000O0.O00000000("uBloomIntensity", O00000000(var10));
                                             this.O00000000000O0.O00000000("uBloomThreshold", Math.max(0.05F, o00000000.O000000000O0));
                                             this.O00000000000O0.O00000000("uBloomRadius", Math.max(2.0F, o00000000.O000000000O00));
                                             this.O00000000000O0.O00000000("uSharpness", O00000000(o00000000.O000000000O000));
                                             this.O00000000000O0.O00000000("uVignette", O00000000(o00000000.O000000000O00O));
                                             this.O00000000000O0.O00000000("uFlipY", o00000000.O000000000O0O ? 1.0F : 0.0F);
                                             GL13.glActiveTexture(33985);
                                             GL11.glBindTexture(3553, this.O0000000000OO);
                                             GL13.glActiveTexture(33984);
                                             GL11.glBindTexture(3553, this.O0000000000O0);
                                             this.O00000000000O.O00000000();
                                             if (!this.O000000000O0O0) {
                                                System.out.println("[ColorPlus] First successful render at " + j + "x" + k + " bloom=" + (var10 > 0.001F));
                                                this.O000000000O0O0 = true;
                                                var14 = false;
                                             } else {
                                                var14 = false;
                                             }
                                             break label232;
                                          }

                                          var14 = false;
                                       } else {
                                          var14 = false;
                                       }
                                    } else {
                                       var14 = false;
                                    }
                                    break label246;
                                 } catch (Throwable var15) {
                                    this.O000000000O0O = true;
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
                                       if (var9 && this.O000000000O000 != 0) {
                                          GL30.glBindFramebuffer(36160, this.O000000000O000);
                                          GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                       }

                                       GL30.glBindFramebuffer(36009, var5);
                                       GL30.glBindFramebuffer(36008, var6);
                                       GL30.glBindFramebuffer(36160, var7);
                                       O0000O00O0OOO0.O00000000(var8);
                                    }
                                 }

                                 GL13.glActiveTexture(33985);
                                 GL11.glBindTexture(3553, 0);
                                 GL13.glActiveTexture(33984);
                                 GL11.glBindTexture(3553, 0);
                                 GL20.glUseProgram(0);
                                 if (var9 && this.O000000000O000 != 0) {
                                    GL30.glBindFramebuffer(36160, this.O000000000O000);
                                    GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                                 }

                                 GL30.glBindFramebuffer(36009, var5);
                                 GL30.glBindFramebuffer(36008, var6);
                                 GL30.glBindFramebuffer(36160, var7);
                                 O0000O00O0OOO0.O00000000(var8);
                                 return;
                              }

                              GL13.glActiveTexture(33985);
                              GL11.glBindTexture(3553, 0);
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              if (var9 && this.O000000000O000 != 0) {
                                 GL30.glBindFramebuffer(36160, this.O000000000O000);
                                 GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                              }

                              GL30.glBindFramebuffer(36009, var5);
                              GL30.glBindFramebuffer(36008, var6);
                              GL30.glBindFramebuffer(36160, var7);
                              O0000O00O0OOO0.O00000000(var8);
                              return;
                           }

                           GL13.glActiveTexture(33985);
                           GL11.glBindTexture(3553, 0);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           if (var9 && this.O000000000O000 != 0) {
                              GL30.glBindFramebuffer(36160, this.O000000000O000);
                              GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                           }

                           GL30.glBindFramebuffer(36009, var5);
                           GL30.glBindFramebuffer(36008, var6);
                           GL30.glBindFramebuffer(36160, var7);
                           O0000O00O0OOO0.O00000000(var8);
                           return;
                        }

                        GL13.glActiveTexture(33985);
                        GL11.glBindTexture(3553, 0);
                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        if (var9 && this.O000000000O000 != 0) {
                           GL30.glBindFramebuffer(36160, this.O000000000O000);
                           GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        }

                        GL30.glBindFramebuffer(36009, var5);
                        GL30.glBindFramebuffer(36008, var6);
                        GL30.glBindFramebuffer(36160, var7);
                        O0000O00O0OOO0.O00000000(var8);
                        return;
                     }

                     GL13.glActiveTexture(33985);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     if (var9 && this.O000000000O000 != 0) {
                        GL30.glBindFramebuffer(36160, this.O000000000O000);
                        GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                     }

                     GL30.glBindFramebuffer(36009, var5);
                     GL30.glBindFramebuffer(36008, var6);
                     GL30.glBindFramebuffer(36160, var7);
                     O0000O00O0OOO0.O00000000(var8);
                     return;
                  }

                  GL13.glActiveTexture(33985);
                  GL11.glBindTexture(3553, 0);
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  if (var9 && this.O000000000O000 != 0) {
                     GL30.glBindFramebuffer(36160, this.O000000000O000);
                     GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                  }

                  GL30.glBindFramebuffer(36009, var5);
                  GL30.glBindFramebuffer(36008, var6);
                  GL30.glBindFramebuffer(36160, var7);
                  O0000O00O0OOO0.O00000000(var8);
               }
            }
         }
      }
   }

   private void O00000000(O0000O0O000O.W387 o00000000) {
      GL30.glBindFramebuffer(36160, this.O0000000000OOO);
      GL11.glViewport(0, 0, this.O000000000O0, this.O000000000O00);
      this.O00000000000OO.O00000000();
      this.O00000000000OO.O00000000("uViewport", this.O000000000O0, this.O000000000O00);
      this.O00000000000OO.O00000000("uRect", 0.0F, 0.0F, this.O000000000O0, this.O000000000O00);
      this.O00000000000OO.O00000000("uScene", 0);
      this.O00000000000OO.O00000000("uResolution", this.O000000000O0, this.O000000000O00);
      this.O00000000000OO.O00000000("uThreshold", Math.max(0.05F, o00000000.O000000000O0));
      this.O00000000000OO.O00000000("uSoftness", 0.4F);
      this.O00000000000OO.O00000000("uFlipY", o00000000.O000000000O0O ? 1.0F : 0.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.O0000000000O0);
      this.O00000000000O.O00000000();
      GL30.glBindFramebuffer(36160, this.O000000000O);
      GL11.glViewport(0, 0, this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000();
      this.O0000000000O.O00000000("uViewport", this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uRect", 0.0F, 0.0F, this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uScene", 0);
      this.O0000000000O.O00000000("uResolution", this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uDirection", 1.0F, 0.0F);
      float var2 = Math.max(2.0F, o00000000.O000000000O00 / 4.0F);
      this.O0000000000O.O00000000("uRadius", var2);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.O0000000000OO);
      this.O00000000000O.O00000000();
      GL30.glBindFramebuffer(36160, this.O0000000000OOO);
      GL11.glViewport(0, 0, this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000();
      this.O0000000000O.O00000000("uViewport", this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uRect", 0.0F, 0.0F, this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uScene", 0);
      this.O0000000000O.O00000000("uResolution", this.O000000000O0, this.O000000000O00);
      this.O0000000000O.O00000000("uDirection", 0.0F, 1.0F);
      this.O0000000000O.O00000000("uRadius", var2);
      GL11.glBindTexture(3553, this.O0000000000OO0);
      this.O00000000000O.O00000000();
   }

   private void O00000000(int i, int j) {
      if (this.O0000000000O0 == 0) {
         this.O0000000000O0 = GL11.glGenTextures();
         if (this.O0000000000O0 == 0) {
            return;
         }

         GL11.glBindTexture(3553, this.O0000000000O0);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         this.O0000000000O00 = 0;
         this.O0000000000O0O = 0;
      } else {
         GL11.glBindTexture(3553, this.O0000000000O0);
      }

      if (this.O0000000000O00 == i && this.O0000000000O0O == j) {
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, i, j);
      } else {
         GL11.glCopyTexImage2D(3553, 0, 32856, 0, 0, i, j, 0);
         this.O0000000000O00 = i;
         this.O0000000000O0O = j;
      }
   }

   private void O000000000(int i, int j) {
      int var3 = Math.max(2, i / 4);
      int var4 = Math.max(2, j / 4);
      if (this.O000000000O000 == 0) {
         this.O000000000O000 = GL30.glGenFramebuffers();
      }

      if (this.O0000000000OO == 0 || this.O000000000O0 != var3 || this.O000000000O00 != var4) {
         this.O000000000();
         this.O000000000O0 = var3;
         this.O000000000O00 = var4;
         this.O0000000000OO = O0000000000(this.O000000000O0, this.O000000000O00);
         this.O0000000000OO0 = O0000000000(this.O000000000O0, this.O000000000O00);
         this.O0000000000OOO = O00000000(this.O0000000000OO);
         this.O000000000O = O00000000(this.O0000000000OO0);
      }
   }

   private static int O0000000000(int i, int j) {
      int var2 = GL11.glGenTextures();
      GL11.glBindTexture(3553, var2);
      GL11.glTexParameteri(3553, 10241, 9729);
      GL11.glTexParameteri(3553, 10240, 9729);
      GL11.glTexParameteri(3553, 10242, 33071);
      GL11.glTexParameteri(3553, 10243, 33071);
      GL11.glTexImage2D(3553, 0, 32856, i, j, 0, 6408, 5121, (ByteBuffer)null);
      GL11.glBindTexture(3553, 0);
      return var2;
   }

   private static int O00000000(int i) {
      int var1 = GL30.glGenFramebuffers();
      GL30.glBindFramebuffer(36160, var1);
      GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
      GL11.glDrawBuffer(36064);
      return var1;
   }

   private void O000000000() {
      if (this.O0000000000OOO != 0) {
         GL30.glDeleteFramebuffers(this.O0000000000OOO);
         this.O0000000000OOO = 0;
      }

      if (this.O000000000O != 0) {
         GL30.glDeleteFramebuffers(this.O000000000O);
         this.O000000000O = 0;
      }

      if (this.O0000000000OO != 0) {
         GL11.glDeleteTextures(this.O0000000000OO);
         this.O0000000000OO = 0;
      }

      if (this.O0000000000OO0 != 0) {
         GL11.glDeleteTextures(this.O0000000000OO0);
         this.O0000000000OO0 = 0;
      }

      this.O000000000O0 = 0;
      this.O000000000O00 = 0;
   }

   private void O0000000000() {
      if (!this.O000000000O00O) {
         try {
            this.O00000000000O = new O00000OOO();
            this.O00000000000O0 = this.O000000000000O
               .O00000000("colorplus_grade", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_grade.frag");
            this.O00000000000OO = this.O000000000000O
               .O00000000("colorplus_bloom_extract", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_bloom_extract.frag");
            this.O0000000000O = this.O000000000000O
               .O00000000("colorplus_bloom_blur", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/colorplus/cp_bloom_blur.frag");
            this.O000000000O00O = true;
            System.out.println("[ColorPlus] Shaders loaded successfully");
         } catch (Throwable var2) {
            this.O000000000O0O = true;
            System.err.println("[ColorPlus] Shader load FAILED: " + var2.getMessage());
            var2.printStackTrace();
         }
      }
   }

   private static float O00000000(float f) {
      if (Float.isNaN(f)) {
         return 0.0F;
      } else if (f < 0.0F) {
         return 0.0F;
      } else {
         return f > 1.0F ? 1.0F : f;
      }
   }

   private static float O000000000(float f) {
      if (Float.isNaN(f)) {
         return 0.0F;
      } else if (f < -1.0F) {
         return -1.0F;
      } else {
         return f > 1.0F ? 1.0F : f;
      }
   }

   @Override
   public void close() {
      try {
         if (this.O0000000000O0 != 0) {
            GL11.glDeleteTextures(this.O0000000000O0);
            this.O0000000000O0 = 0;
         }

         this.O000000000();
         if (this.O000000000O000 != 0) {
            GL30.glDeleteFramebuffers(this.O000000000O000);
            this.O000000000O000 = 0;
         }

         if (this.O00000000000O != null) {
            this.O00000000000O.close();
            this.O00000000000O = null;
         }

         this.O000000000000O.close();
      } catch (Throwable var2) {
      }

      this.O000000000O00O = false;
      this.O000000000O0O = false;
      this.O000000000O0O0 = false;
   }

   public static final class W387 {
      public float O00000000 = 1.0F;
      public float O000000000;
      public float O0000000000;
      public float O00000000000;
      public float O000000000000;
      public float O0000000000000;
      public float O000000000000O;
      public float O00000000000O;
      public float O00000000000O0;
      public float O00000000000OO;
      public float O0000000000O;
      public float O0000000000O0;
      public float O0000000000O00;
      public float O0000000000O0O;
      public float O0000000000OO;
      public float O0000000000OO0;
      public float O0000000000OOO;
      public float O000000000O;
      public float O000000000O0 = 0.9F;
      public float O000000000O00 = 64.0F;
      public float O000000000O000;
      public float O000000000O00O;
      public boolean O000000000O0O = true;
   }
}

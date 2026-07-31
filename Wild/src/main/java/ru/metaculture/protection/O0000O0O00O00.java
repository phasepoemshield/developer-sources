package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O0000O0O00O00 {
   private static final O0000O0O00O00 O00000000 = new O0000O0O00O00();
   private static final float O000000000 = 0.3F;
   private static final float O0000000000 = 9.0F;
   private static final float O00000000000 = 0.5F;
   private static final O0000O0O00O00.W400 O000000000000 = new O0000O0O00O00.W400(0.4F, 0.0F, 0.1F, 1.0F);
   private final O0000O0O00O00.W401 O0000000000000 = new O0000O0O00O00.W401();
   private final O0000O0O00O00.W401 O000000000000O = new O0000O0O00O00.W401();
   private O0000O0O000O00 O00000000000O;
   private O0000O00OO0 O00000000000O0;
   private int O00000000000OO = -1;
   private int O0000000000O = -1;
   private int O0000000000O0 = -1;
   private int O0000000000O00 = -1;
   private int O0000000000O0O = -1;
   private int O0000000000OO = -1;
   private int O0000000000OO0 = -1;
   private int O0000000000OOO = -1;
   private int O000000000O = -1;
   private int O000000000O0 = -1;
   private int O000000000O00 = -1;
   private int O000000000O000;
   private int O000000000O00O;
   private int O000000000O0O;
   private int O000000000O0O0;
   private boolean O000000000O0OO;
   private float O000000000OO;
   private float O000000000OO0;
   private float O000000000OO00;

   private O0000O0O00O00() {
   }

   public static O0000O0O00O00 O00000000() {
      return O00000000;
   }

   public void O00000000(Screen screen, Screen screen2) {
      if (screen != screen2) {
         if (screen instanceof O00000OO0OOOO || screen2 instanceof O00000OO0OOOO) {
            this.O0000000000();
         } else if (O0000O00OO00O0.O00000000()) {
            this.O0000000000();
         } else if (!MenuModule.O00000000(MenuModule.O00000000O0)) {
            this.O0000000000();
         } else {
            MinecraftClient var3 = MinecraftClient.getInstance();
            if (var3 != null && var3.world != null && screen2 == null) {
               this.O0000000000();
            } else if (O00000000(var3, screen, screen2) && O000000000(var3)) {
               Window var4 = var3.getWindow();
               int var5 = var4.getFramebufferWidth();
               int var6 = var4.getFramebufferHeight();
               if (var5 > 0 && var6 > 0) {
                  boolean var7 = this.O000000000O0OO
                     && this.O000000000(this.O000000000000O, var5, var6)
                     && this.O00000000(this.O000000000000O.O000000000, var5, var6, this.O0000000000000);
                  if (!var7) {
                     var7 = this.O00000000(var3, this.O0000000000000, var5, var6);
                  }

                  if (!var7) {
                     this.O0000000000000();
                  } else {
                     this.O000000000O0OO = true;
                     this.O000000000OO = 0.0F;
                     this.O000000000OO0 = 0.0F;
                     this.O000000000OO00 = 0.0F;
                  }
               } else {
                  this.O000000000000O();
               }
            } else {
               this.O0000000000000();
            }
         }
      }
   }

   public void O000000000() {
      MinecraftClient var1 = MinecraftClient.getInstance();
      float var2 = var1 != null && var1.getRenderTickCounter() != null ? var1.getRenderTickCounter().getDynamicDeltaTicks() : 0.0F;
      this.O00000000(var2);
   }

   public void O00000000(float f) {
      if (this.O000000000O0OO) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         if (var2 == null || !O000000000(var2)) {
            this.O0000000000000();
         } else if (var2.currentScreen != null && var2.world == null) {
            Window var3 = var2.getWindow();
            int var4 = var3.getFramebufferWidth();
            int var5 = var3.getFramebufferHeight();
            if (var4 > 0 && var5 > 0 && this.O000000000(this.O0000000000000, var4, var5)) {
               this.O000000000(f);
               if (this.O000000000OO >= 1.0F) {
                  this.O0000000000000();
               } else {
                  int var6 = this.O00000000(var2);
                  if (var6 > 0 && this.O00000000(var2, this.O000000000000O, var4, var5) && this.O000000000(this.O000000000000O, var4, var5)) {
                     this.O000000000000();
                     if (this.O00000000000O0 != null && this.O000000000O0O != 0) {
                        float var7 = this.O00000000000();
                        float var8 = O00000000(var7 / 9.0F, 0.0F, 1.0F);
                        int var9 = this.O00000000(var4, var5, var7);
                        if (var9 <= 0) {
                           var9 = this.O000000000000O.O000000000;
                           var8 = 0.0F;
                        }

                        this.O00000000(var6, var4, var5, var9, var8);
                        if (this.O000000000OO >= 1.0F) {
                           this.O0000000000000();
                        }
                     } else {
                        this.O0000000000000();
                     }
                  } else {
                     this.O0000000000000();
                  }
               }
            } else {
               this.O000000000000O();
            }
         } else {
            this.O0000000000();
         }
      }
   }

   public void O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         if ((this.O0000000000000.O0000000000 <= 0 || this.O0000000000000.O0000000000 == i && this.O0000000000000.O00000000000 == j)
            && (this.O000000000000O.O0000000000 <= 0 || this.O000000000000O.O0000000000 == i && this.O000000000000O.O00000000000 == j)) {
            if (this.O00000000000O != null) {
               this.O00000000000O.O00000000000();
            }
         } else {
            this.O000000000000O();
         }
      } else {
         this.O000000000000O();
      }
   }

   public void O00000000(boolean bl) {
      if (!bl) {
         this.O000000000000O();
      }
   }

   private void O000000000(float f) {
      float var2 = O00000000000(f);
      this.O000000000OO00 += var2;
      this.O000000000OO = O00000000(this.O000000000OO + var2 / 0.3F, 0.0F, 1.0F);
      this.O000000000OO0 = O000000000000.solve(this.O000000000OO);
   }

   private float O00000000000() {
      float var1 = O0000000000(this.O000000000OO0 * 1.6F);
      return 9.0F * var1;
   }

   private int O00000000(int i, int j, float f) {
      if (f < 0.5F) {
         return this.O0000000000000.O000000000;
      } else {
         if (this.O00000000000O == null) {
            this.O00000000000O = new O0000O0O000O00(32856, 5121);
         }

         return this.O00000000000O.O00000000(this.O0000000000000.O000000000, i, j, f);
      }
   }

   private static float O0000000000(float f) {
      float var1 = O00000000(f, 0.0F, 1.0F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(int i, int j, int k, int l, float f) {
      O0000O00O0OOO0.W373 var6 = O0000O00O0OOO0.O00000000();
      boolean var20 = false /* VF: Semaphore variable */;

      label202: {
         try {
            var20 = true;

            try (
               O0000O0O00O var7 = O0000O0O00O.O00000000(0, 3553);
               O0000O0O00O var8 = O0000O0O00O.O00000000(1, 3553);
               O0000O0O00O var9 = O0000O0O00O.O00000000(2, 3553);
            ) {
               if (this.O000000000O00O == 0) {
                  this.O000000000O00O = GL30.glGenFramebuffers();
               }

               GL30.glBindFramebuffer(36160, this.O000000000O00O);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, i, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  break label202;
               }

               GL11.glViewport(0, 0, j, k);
               GL11.glDisable(3089);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL11.glColorMask(true, true, true, true);
               GL11.glDepthMask(false);
               this.O00000000000O0.O00000000();
               this.O000000000(j, k, f);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, this.O0000000000000.O000000000);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, this.O000000000000O.O000000000);
               GL13.glActiveTexture(33986);
               GL11.glBindTexture(3553, l);
               GL30.glBindVertexArray(this.O000000000O0O);
               O0000O00OO0O.O00000000().O00000000(2);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
            }
         } finally {
            if (var20) {
               if (this.O000000000O00O != 0) {
                  GL30.glBindFramebuffer(36160, this.O000000000O00O);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               }

               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var6);
            }
         }

         if (this.O000000000O00O != 0) {
            GL30.glBindFramebuffer(36160, this.O000000000O00O);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         }

         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var6);
         return;
      }

      if (this.O000000000O00O != 0) {
         GL30.glBindFramebuffer(36160, this.O000000000O00O);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      }

      GL20.glUseProgram(0);
      O0000O00O0OOO0.O00000000(var6);
   }

   private void O000000000(int i, int j, float f) {
      if (this.O00000000000OO >= 0) {
         GL20.glUniform1i(this.O00000000000OO, 0);
      }

      if (this.O0000000000O >= 0) {
         GL20.glUniform1i(this.O0000000000O, 1);
      }

      if (this.O0000000000O0 >= 0) {
         GL20.glUniform1i(this.O0000000000O0, 2);
      }

      if (this.O0000000000O00 >= 0) {
         GL20.glUniform2f(this.O0000000000O00, i, j);
      }

      if (this.O0000000000O0O >= 0) {
         GL20.glUniform1f(this.O0000000000O0O, this.O000000000OO0);
      }

      if (this.O0000000000OO >= 0) {
         GL20.glUniform1f(this.O0000000000OO, this.O000000000OO);
      }

      if (this.O0000000000OO0 >= 0) {
         GL20.glUniform1f(this.O0000000000OO0, this.O000000000OO0);
      }

      if (this.O0000000000OOO >= 0) {
         GL20.glUniform1f(this.O0000000000OOO, 1.04F - 0.04F * this.O000000000OO0);
      }

      if (this.O000000000O >= 0) {
         GL20.glUniform1f(this.O000000000O, f);
      }

      if (this.O000000000O0 >= 0) {
         GL20.glUniform1f(this.O000000000O0, 0.0F);
      }

      if (this.O000000000O00 >= 0) {
         GL20.glUniform1f(this.O000000000O00, this.O000000000OO00);
      }
   }

   private boolean O00000000(MinecraftClient minecraftClient, O0000O0O00O00.W401 o000000000, int i, int j) {
      int var5 = this.O00000000(minecraftClient);
      return var5 > 0 && this.O00000000(var5, i, j, o000000000);
   }

   private int O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient == null) {
         return 0;
      } else {
         Framebuffer var2 = minecraftClient.getFramebuffer();
         if (var2 == null) {
            return 0;
         } else {
            return var2.getColorAttachment() instanceof GlTexture var4 ? var4.getGlId() : 0;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O00000000(int i, int j, int k, O0000O0O00O00.W401 o000000000) {
      if (i > 0 && j > 0 && k > 0 && this.O00000000(o000000000, j, k)) {
         O0000O00O0OOO0.W373 var5 = O0000O00O0OOO0.O00000000();
         boolean var9 = false /* VF: Semaphore variable */;

         boolean var11;
         label85: {
            try {
               var9 = true;
               if (this.O000000000O000 == 0) {
                  this.O000000000O000 = GL30.glGenFramebuffers();
               }

               GL11.glDisable(3089);
               GL11.glDisable(3042);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(36281);
               GL30.glBindFramebuffer(36008, this.O000000000O000);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, i, 0);
               if (GL30.glCheckFramebufferStatus(36008) != 36053) {
                  var11 = false;
                  var9 = false;
                  break label85;
               }

               GL30.glBindFramebuffer(36009, o000000000.O00000000);
               GL11.glReadBuffer(36064);
               GL11.glDrawBuffer(36064);
               GL30.glBlitFramebuffer(0, 0, j, k, 0, 0, j, k, 16384, 9728);
               var11 = true;
               var9 = false;
            } finally {
               if (var9) {
                  if (this.O000000000O000 != 0) {
                     GL30.glBindFramebuffer(36008, this.O000000000O000);
                     GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
                  }

                  O0000O00O0OOO0.O00000000(var5);
               }
            }

            if (this.O000000000O000 != 0) {
               GL30.glBindFramebuffer(36008, this.O000000000O000);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            }

            O0000O00O0OOO0.O00000000(var5);
            return var11;
         }

         if (this.O000000000O000 != 0) {
            GL30.glBindFramebuffer(36008, this.O000000000O000);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         O0000O00O0OOO0.O00000000(var5);
         return var11;
      } else {
         return false;
      }
   }

   private boolean O00000000(O0000O0O00O00.W401 o000000000, int i, int j) {
      if (o000000000 != null && i > 0 && j > 0) {
         if (o000000000.O000000000 != 0 && (o000000000.O0000000000 != i || o000000000.O00000000000 != j || o000000000.O00000000 == 0)) {
            this.O00000000(o000000000);
         }

         label61:
         if (o000000000.O000000000 == 0) {
            O0000O00O0OOO0.W373 var4 = O0000O00O0OOO0.O00000000();

            boolean var5;
            try {
               o000000000.O000000000 = GL11.glGenTextures();
               GL11.glBindTexture(3553, o000000000.O000000000);
               GL11.glTexParameteri(3553, 10241, 9729);
               GL11.glTexParameteri(3553, 10240, 9729);
               GL11.glTexParameteri(3553, 10242, 33071);
               GL11.glTexParameteri(3553, 10243, 33071);
               O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
               o000000000.O00000000 = GL30.glGenFramebuffers();
               GL30.glBindFramebuffer(36160, o000000000.O00000000);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, o000000000.O000000000, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) == 36053) {
                  break label61;
               }

               this.O00000000(o000000000);
               var5 = false;
            } finally {
               O0000O00O0OOO0.O00000000(var4);
            }

            return var5;
         }

         o000000000.O0000000000 = i;
         o000000000.O00000000000 = j;
         return true;
      } else {
         return false;
      }
   }

   private void O000000000000() {
      if (this.O000000000O0O == 0) {
         O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();

         try {
            this.O000000000O0O = GL30.glGenVertexArrays();
            this.O000000000O0O0 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000O0O);
            GL15.glBindBuffer(34962, this.O000000000O0O0);
            float[] var2 = new float[]{
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
            GL15.glBufferData(34962, var2, 35044);
            byte var3 = 16;
            GL20.glEnableVertexAttribArray(0);
            GL20.glVertexAttribPointer(0, 2, 5126, false, var3, 0L);
            GL20.glEnableVertexAttribArray(1);
            GL20.glVertexAttribPointer(1, 2, 5126, false, var3, 8L);
         } finally {
            O0000O00O0OOO0.O00000000(var1);
         }
      }

      if (this.O00000000000O0 == null) {
         this.O00000000000O0 = O0000O00OO0.O00000000(
            "assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/postfx/cinematic_screen_transition.frag"
         );
         this.O00000000000OO = this.O00000000000O0.O00000000("uOldScreen");
         this.O0000000000O = this.O00000000000O0.O00000000("uNewScreen");
         this.O0000000000O0 = this.O00000000000O0.O00000000("uBlurredScreen");
         this.O0000000000O00 = this.O00000000000O0.O00000000("uResolution");
         this.O0000000000O0O = this.O00000000000O0.O00000000("uProgress");
         this.O0000000000OO = this.O00000000000O0.O00000000("uLinearProgress");
         this.O0000000000OO0 = this.O00000000000O0.O00000000("uAlpha");
         this.O0000000000OOO = this.O00000000000O0.O00000000("uScale");
         this.O000000000O = this.O00000000000O0.O00000000("uBlurMix");
         this.O000000000O0 = this.O00000000000O0.O00000000("uExposure");
         this.O000000000O00 = this.O00000000000O0.O00000000("uTime");
      }
   }

   private boolean O000000000(O0000O0O00O00.W401 o000000000, int i, int j) {
      return o000000000 != null && o000000000.O00000000 != 0 && o000000000.O000000000 != 0 && o000000000.O0000000000 == i && o000000000.O00000000000 == j;
   }

   private void O0000000000000() {
      this.O000000000O0OO = false;
      this.O000000000OO = 0.0F;
      this.O000000000OO0 = 0.0F;
      this.O000000000OO00 = 0.0F;
   }

   public void O0000000000() {
      this.O000000000000O();
   }

   private void O000000000000O() {
      this.O0000000000000();
      this.O00000000(this.O0000000000000);
      this.O00000000(this.O000000000000O);
      if (this.O00000000000O != null) {
         this.O00000000000O.O00000000000();
      }
   }

   private void O00000000(O0000O0O00O00.W401 o000000000) {
      if (o000000000 != null) {
         if (o000000000.O00000000 != 0) {
            GL30.glDeleteFramebuffers(o000000000.O00000000);
            o000000000.O00000000 = 0;
         }

         if (o000000000.O000000000 != 0) {
            GL11.glDeleteTextures(o000000000.O000000000);
            o000000000.O000000000 = 0;
         }

         o000000000.O0000000000 = 0;
         o000000000.O00000000000 = 0;
      }
   }

   private static boolean O000000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var1 = minecraftClient.getWindow();
         return !var1.hasZeroWidthOrHeight() && var1.getFramebufferWidth() > 0 && var1.getFramebufferHeight() > 0;
      } else {
         return false;
      }
   }

   private static boolean O00000000(MinecraftClient minecraftClient, Screen screen, Screen screen2) {
      return !(screen instanceof O00000OO0OOOO) && !(screen2 instanceof O00000OO0OOOO)
         ? minecraftClient != null && minecraftClient.world == null && screen != null && screen2 != null
         : false;
   }

   private static float O00000000000(float f) {
      return Float.isFinite(f) && !(f <= 0.0F) ? O00000000(f, 0.0F, 6.0F) * 0.05F : 0.0F;
   }

   static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   record W400(float x1, float y1, float x2, float y2) {
      float solve(float f) {
         float var2 = O0000O0O00O00.O00000000(f, 0.0F, 1.0F);
         float var3 = var2;

         for (int var4 = 0; var4 < 7; var4++) {
            float var5 = sample(var3, this.x1, this.x2) - var2;
            if (Math.abs(var5) < 1.0E-5F) {
               return O0000O0O00O00.O00000000(sample(var3, this.y1, this.y2), 0.0F, 1.0F);
            }

            float var6 = derivative(var3, this.x1, this.x2);
            if (Math.abs(var6) < 1.0E-5F) {
               break;
            }

            var3 = O0000O0O00O00.O00000000(var3 - var5 / var6, 0.0F, 1.0F);
         }

         float var9 = 0.0F;
         float var10 = 1.0F;
         var3 = var2;

         for (int var11 = 0; var11 < 10; var11++) {
            float var7 = sample(var3, this.x1, this.x2);
            if (Math.abs(var7 - var2) < 1.0E-5F) {
               break;
            }

            if (var7 < var2) {
               var9 = var3;
            } else {
               var10 = var3;
            }

            var3 = (var9 + var10) * 0.5F;
         }

         return O0000O0O00O00.O00000000(sample(var3, this.y1, this.y2), 0.0F, 1.0F);
      }

      private static float sample(float f, float g, float h) {
         float var3 = 1.0F - f;
         return 3.0F * var3 * var3 * f * g + 3.0F * var3 * f * f * h + f * f * f;
      }

      private static float derivative(float f, float g, float h) {
         float var3 = 1.0F - f;
         return 3.0F * var3 * var3 * g + 6.0F * var3 * f * (h - g) + 3.0F * f * f * (1.0F - h);
      }
   }

   static final class W401 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}

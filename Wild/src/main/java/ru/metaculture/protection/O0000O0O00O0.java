package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O0000O0O00O0 {
   private static final O0000O0O00O0 O00000000 = new O0000O0O00O0();
   private static final float O000000000 = 1.08F;
   private static final int O0000000000 = 10;
   private static final int O00000000000 = -4205825;
   private static final int O000000000000 = -8547073;
   private final O0000O0O00O0.W399 O0000000000000 = new O0000O0O00O0.W399();
   private final O0000O0O00O0.W399 O000000000000O = new O0000O0O00O0.W399();
   private final O0000O0O00O0.W399 O00000000000O = new O0000O0O00O0.W399();
   private final List<O0000O0O00O0.W398> O00000000000O0 = new ArrayList<>();
   private O0000O00OO0 O00000000000OO;
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
   private int O000000000O000 = -1;
   private int O000000000O00O = -1;
   private int O000000000O0O;
   private int O000000000O0O0;
   private int O000000000O0OO;
   private int O000000000OO;

   private O0000O0O00O0() {
   }

   public static O0000O0O00O0 O00000000() {
      return O00000000;
   }

   public void O00000000(float f, float g, int i, int j) {
      if (MenuModule.O00000000(MenuModule.O000000000OOO0)) {
         MinecraftClient var5 = MinecraftClient.getInstance();
         if (!O000000000(var5)) {
            this.O000000000();
         } else {
            Window var6 = var5.getWindow();
            int var7 = var6.getFramebufferWidth();
            int var8 = var6.getFramebufferHeight();
            if (var7 > 0 && var8 > 0) {
               if (this.O00000000000O0.isEmpty()) {
                  if (!this.O00000000(var5, this.O0000000000000, var7, var8)) {
                     this.O000000000();
                     return;
                  }
               } else if (!this.O000000000(this.O0000000000000, var7, var8)) {
                  this.O000000000();
                  return;
               }

               if (!this.O00000000(var5, var7, var8)) {
                  this.O000000000();
               } else {
                  O0000O0O00O0.W398 var9 = new O0000O0O00O0.W398();
                  var9.O000000000000 = O00000000(f, 0.0F, Math.max(0.0F, var7 - 1.0F));
                  var9.O0000000000000 = O00000000(g, 0.0F, Math.max(0.0F, var8 - 1.0F));
                  var9.O000000000000O = i;
                  var9.O00000000000O = j;
                  if (!this.O00000000(var9.O00000000, var7, var8)) {
                     this.O00000000(var9.O00000000);
                     if (this.O00000000000O0.isEmpty()) {
                        this.O00000000000();
                     }
                  } else {
                     this.O00000000000O0.add(var9);
                     BlurRenderer.O00000000().O000000000000();
                  }
               }
            } else {
               this.O00000000000();
            }
         }
      }
   }

   public void O00000000(double d, double e, int i, int j) {
      MinecraftClient var7 = MinecraftClient.getInstance();
      if (!O000000000(var7)) {
         this.O000000000();
      } else {
         Window var8 = var7.getWindow();
         int var9 = var8.getFramebufferWidth();
         int var10 = var8.getFramebufferHeight();
         int var11 = var8.getScaledWidth();
         int var12 = var8.getScaledHeight();
         if (var9 > 0 && var10 > 0 && var11 > 0 && var12 > 0) {
            float var13 = (float)(d * var9 / var11);
            float var14 = (float)(e * var10 / var12);
            this.O00000000(var13, var14, i, j);
         } else {
            this.O000000000();
         }
      }
   }

   public void O00000000(float f) {
      if (!this.O00000000000O0.isEmpty()) {
         MinecraftClient var2 = MinecraftClient.getInstance();
         if (var2 != null && O000000000(var2) && var2.currentScreen != null) {
            Window var3 = var2.getWindow();
            int var4 = var3.getFramebufferWidth();
            int var5 = var3.getFramebufferHeight();
            if (var4 <= 0 || var5 <= 0 || !this.O000000000(this.O0000000000000, var4, var5)) {
               this.O00000000000();
            } else if (!this.O000000000(var4, var5)) {
               this.O000000000();
            } else {
               O0000O0O00O0.W398 var6 = this.O00000000000O0.get(this.O00000000000O0.size() - 1);
               int var7 = this.O00000000(var2);
               if (var7 > 0 && this.O00000000(var2, var6.O00000000, var4, var5)) {
                  this.O000000000(f);
                  if (!this.O0000000000(var4, var5)) {
                     this.O000000000();
                  } else if (!this.O00000000000O0.isEmpty()) {
                     this.O0000000000();
                     if (this.O00000000000OO != null && this.O000000000O0OO != 0) {
                        if (this.O00000000000O0.size() <= 1
                           || this.O00000000(this.O000000000000O, var4, var5) && this.O00000000(this.O00000000000O, var4, var5)) {
                           int var8 = this.O0000000000000.O000000000;

                           for (int var9 = 0; var9 < this.O00000000000O0.size(); var9++) {
                              O0000O0O00O0.W398 var10 = this.O00000000000O0.get(var9);
                              boolean var11 = var9 == this.O00000000000O0.size() - 1;
                              int var12 = var11 ? var7 : ((var9 & 1) == 0 ? this.O000000000000O.O000000000 : this.O00000000000O.O000000000);
                              this.O00000000(var8, var10.O00000000.O000000000, var12, var4, var5, var10);
                              var8 = var12;
                           }
                        } else {
                           this.O000000000();
                        }
                     } else {
                        this.O000000000();
                     }
                  }
               } else {
                  this.O000000000();
               }
            }
         } else {
            this.O000000000();
         }
      }
   }

   public void O00000000(int i, int j) {
      if (i > 0 && j > 0) {
         if ((this.O0000000000000.O0000000000 <= 0 || this.O0000000000000.O0000000000 == i && this.O0000000000000.O00000000000 == j)
            && (this.O000000000000O.O0000000000 <= 0 || this.O000000000000O.O0000000000 == i && this.O000000000000O.O00000000000 == j)
            && (this.O00000000000O.O0000000000 <= 0 || this.O00000000000O.O0000000000 == i && this.O00000000000O.O00000000000 == j)) {
            for (O0000O0O00O0.W398 var4 : this.O00000000000O0) {
               if (var4.O00000000.O0000000000 > 0 && (var4.O00000000.O0000000000 != i || var4.O00000000.O00000000000 != j)) {
                  this.O00000000000();
                  return;
               }
            }
         } else {
            this.O00000000000();
         }
      } else {
         this.O00000000000();
      }
   }

   public void O00000000(boolean bl) {
      if (!bl) {
         this.O00000000000();
      }
   }

   public void O000000000() {
      this.O00000000000();
   }

   private boolean O00000000(MinecraftClient minecraftClient, int i, int j) {
      while (this.O00000000000O0.size() >= 10 && !this.O00000000000O0.isEmpty()) {
         O0000O0O00O0.W398 var4 = this.O00000000000O0.remove(0);
         boolean var5 = this.O00000000(var4.O00000000.O000000000, i, j, this.O0000000000000);
         this.O00000000(var4.O00000000);
         if (!var5) {
            return false;
         }
      }

      return true;
   }

   private boolean O000000000(int i, int j) {
      for (O0000O0O00O0.W398 var4 : this.O00000000000O0) {
         if (!this.O00000000(var4.O00000000, i, j)) {
            return false;
         }
      }

      return true;
   }

   private void O000000000(float f) {
      float var2 = O0000000000(f);

      for (O0000O0O00O0.W398 var4 : this.O00000000000O0) {
         var4.O00000000000 += var2;
         var4.O000000000 = O00000000(var4.O000000000 + var2 / 1.08F, 0.0F, 1.0F);
         var4.O0000000000 = O00000000000(var4.O000000000);
      }
   }

   private boolean O0000000000(int i, int j) {
      while (!this.O00000000000O0.isEmpty() && this.O00000000000O0.get(0).O000000000 >= 1.0F) {
         O0000O0O00O0.W398 var3 = this.O00000000000O0.remove(0);
         boolean var4 = this.O00000000(var3.O00000000.O000000000, i, j, this.O0000000000000);
         this.O00000000(var3.O00000000);
         if (!var4) {
            return false;
         }
      }

      return true;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(int i, int j, int k, int l, int m, O0000O0O00O0.W398 o00000000) {
      O0000O00O0OOO0.W373 var7 = O0000O00O0OOO0.O00000000();
      boolean var18 = false /* VF: Semaphore variable */;

      label155: {
         try {
            var18 = true;

            try (
               O0000O0O00O var8 = O0000O0O00O.O00000000(0, 3553);
               O0000O0O00O var9 = O0000O0O00O.O00000000(1, 3553);
            ) {
               if (this.O000000000O0O0 == 0) {
                  this.O000000000O0O0 = GL30.glGenFramebuffers();
               }

               GL30.glBindFramebuffer(36160, this.O000000000O0O0);
               GL30.glFramebufferTexture2D(36160, 36064, 3553, k, 0);
               GL11.glDrawBuffer(36064);
               if (GL30.glCheckFramebufferStatus(36160) != 36053) {
                  break label155;
               }

               GL11.glViewport(0, 0, l, m);
               GL11.glDisable(3089);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(3042);
               GL11.glDisable(36281);
               GL11.glColorMask(true, true, true, true);
               GL11.glDepthMask(false);
               this.O00000000000OO.O00000000();
               this.O00000000(l, m, o00000000);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, i);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, j);
               GL30.glBindVertexArray(this.O000000000O0OO);
               O0000O00OO0O.O00000000().O00000000(2);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
            }
         } finally {
            if (var18) {
               if (this.O000000000O0O0 != 0) {
                  GL30.glBindFramebuffer(36160, this.O000000000O0O0);
                  GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
               }

               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var7);
            }
         }

         if (this.O000000000O0O0 != 0) {
            GL30.glBindFramebuffer(36160, this.O000000000O0O0);
            GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
         }

         GL20.glUseProgram(0);
         O0000O00O0OOO0.O00000000(var7);
         return;
      }

      if (this.O000000000O0O0 != 0) {
         GL30.glBindFramebuffer(36160, this.O000000000O0O0);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
      }

      GL20.glUseProgram(0);
      O0000O00O0OOO0.O00000000(var7);
   }

   private void O00000000(int i, int j, O0000O0O00O0.W398 o00000000) {
      float var4 = i / Math.max(1.0F, (float)j);
      float var5 = this.O00000000(i, j, var4, o00000000.O000000000000, o00000000.O0000000000000);
      float var6 = var5 * (0.004F + o00000000.O0000000000 * 1.145F);
      if (this.O0000000000O >= 0) {
         GL20.glUniform1i(this.O0000000000O, 0);
      }

      if (this.O0000000000O0 >= 0) {
         GL20.glUniform1i(this.O0000000000O0, 1);
      }

      if (this.O0000000000O00 >= 0) {
         GL20.glUniform2f(this.O0000000000O00, i, j);
      }

      if (this.O0000000000O0O >= 0) {
         GL20.glUniform1f(this.O0000000000O0O, o00000000.O0000000000);
      }

      if (this.O0000000000OO >= 0) {
         GL20.glUniform1f(this.O0000000000OO, o00000000.O000000000);
      }

      if (this.O0000000000OO0 >= 0) {
         GL20.glUniform1f(this.O0000000000OO0, o00000000.O00000000000);
      }

      if (this.O0000000000OOO >= 0) {
         GL20.glUniform2f(this.O0000000000OOO, o00000000.O000000000000, o00000000.O0000000000000);
      }

      if (this.O000000000O >= 0) {
         GL20.glUniform1f(this.O000000000O, var4);
      }

      if (this.O000000000O0 >= 0) {
         GL20.glUniform1f(this.O000000000O0, var6);
      }

      if (this.O000000000O00 >= 0) {
         GL20.glUniform1f(this.O000000000O00, var5);
      }

      if (this.O000000000O000 >= 0) {
         GL20.glUniform3f(
            this.O000000000O000,
            (o00000000.O000000000000O >>> 16 & 0xFF) / 255.0F,
            (o00000000.O000000000000O >>> 8 & 0xFF) / 255.0F,
            (o00000000.O000000000000O & 0xFF) / 255.0F
         );
      }

      if (this.O000000000O00O >= 0) {
         GL20.glUniform3f(
            this.O000000000O00O,
            (o00000000.O00000000000O >>> 16 & 0xFF) / 255.0F,
            (o00000000.O00000000000O >>> 8 & 0xFF) / 255.0F,
            (o00000000.O00000000000O & 0xFF) / 255.0F
         );
      }
   }

   private float O00000000(int i, int j, float f, float g, float h) {
      float var6 = O00000000(g / Math.max(1.0F, (float)i), 0.0F, 1.0F);
      float var7 = O00000000(1.0F - h / Math.max(1.0F, (float)j), 0.0F, 1.0F);
      float var8 = O00000000(var6, var7, 0.0F, 0.0F, f);
      float var9 = O00000000(var6, var7, 1.0F, 0.0F, f);
      float var10 = O00000000(var6, var7, 1.0F, 1.0F, f);
      float var11 = O00000000(var6, var7, 0.0F, 1.0F, f);
      return Math.max(Math.max(var8, var9), Math.max(var10, var11));
   }

   private boolean O00000000(MinecraftClient minecraftClient, O0000O0O00O0.W399 o000000000, int i, int j) {
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
   private boolean O00000000(int i, int j, int k, O0000O0O00O0.W399 o000000000) {
      if (i > 0 && j > 0 && k > 0 && this.O00000000(o000000000, j, k)) {
         O0000O00O0OOO0.W373 var5 = O0000O00O0OOO0.O00000000();
         boolean var9 = false /* VF: Semaphore variable */;

         boolean var11;
         label85: {
            try {
               var9 = true;
               if (this.O000000000O0O == 0) {
                  this.O000000000O0O = GL30.glGenFramebuffers();
               }

               GL11.glDisable(3089);
               GL11.glDisable(3042);
               GL11.glDisable(2884);
               GL11.glDisable(2929);
               GL11.glDisable(36281);
               GL30.glBindFramebuffer(36008, this.O000000000O0O);
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
                  if (this.O000000000O0O != 0) {
                     GL30.glBindFramebuffer(36008, this.O000000000O0O);
                     GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
                  }

                  O0000O00O0OOO0.O00000000(var5);
               }
            }

            if (this.O000000000O0O != 0) {
               GL30.glBindFramebuffer(36008, this.O000000000O0O);
               GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
            }

            O0000O00O0OOO0.O00000000(var5);
            return var11;
         }

         if (this.O000000000O0O != 0) {
            GL30.glBindFramebuffer(36008, this.O000000000O0O);
            GL30.glFramebufferTexture2D(36008, 36064, 3553, 0, 0);
         }

         O0000O00O0OOO0.O00000000(var5);
         return var11;
      } else {
         return false;
      }
   }

   private boolean O00000000(O0000O0O00O0.W399 o000000000, int i, int j) {
      if (o000000000 != null && i > 0 && j > 0) {
         if (o000000000.O000000000 != 0 && (o000000000.O0000000000 != i || o000000000.O00000000000 != j || o000000000.O00000000 == 0)) {
            this.O00000000(o000000000);
         }

         label63:
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
                  break label63;
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

   private void O0000000000() {
      if (this.O000000000O0OO == 0) {
         O0000O00O0OOO0.W373 var1 = O0000O00O0OOO0.O00000000();

         try {
            this.O000000000O0OO = GL30.glGenVertexArrays();
            this.O000000000OO = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000O0OO);
            GL15.glBindBuffer(34962, this.O000000000OO);
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

      if (this.O00000000000OO == null) {
         this.O00000000000OO = O0000O00OO0.O00000000(
            "assets/wild/shaders/postfx/theme_shockwave_transition.vert", "assets/wild/shaders/postfx/theme_shockwave_transition.frag"
         );
         this.O0000000000O = this.O00000000000OO.O00000000("u_textureOld");
         this.O0000000000O0 = this.O00000000000OO.O00000000("u_textureNew");
         this.O0000000000O00 = this.O00000000000OO.O00000000("u_resolution");
         this.O0000000000O0O = this.O00000000000OO.O00000000("u_progress");
         this.O0000000000OO = this.O00000000000OO.O00000000("u_linearProgress");
         this.O0000000000OO0 = this.O00000000000OO.O00000000("u_time");
         this.O0000000000OOO = this.O00000000000OO.O00000000("u_center");
         this.O000000000O = this.O00000000000OO.O00000000("u_aspect");
         this.O000000000O0 = this.O00000000000OO.O00000000("u_radius");
         this.O000000000O00 = this.O00000000000OO.O00000000("u_maxRadius");
         this.O000000000O000 = this.O00000000000OO.O00000000("u_accentTop");
         this.O000000000O00O = this.O00000000000OO.O00000000("u_accentBottom");
      }
   }

   private boolean O000000000(O0000O0O00O0.W399 o000000000, int i, int j) {
      return o000000000 != null && o000000000.O00000000 != 0 && o000000000.O000000000 != 0 && o000000000.O0000000000 == i && o000000000.O00000000000 == j;
   }

   private void O00000000000() {
      for (O0000O0O00O0.W398 var2 : this.O00000000000O0) {
         this.O00000000(var2.O00000000);
      }

      this.O00000000000O0.clear();
      this.O00000000(this.O0000000000000);
      this.O00000000(this.O000000000000O);
      this.O00000000(this.O00000000000O);
   }

   private void O00000000(O0000O0O00O0.W399 o000000000) {
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

   private static float O0000000000(float f) {
      return Float.isFinite(f) && !(f <= 0.0F) ? O00000000(f, 0.0F, 6.0F) * 0.05F : 0.0F;
   }

   private static float O00000000000(float f) {
      float var1 = O00000000(f, 0.0F, 1.0F);
      float var2 = var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
      float var3 = 1.0F - (float)Math.exp(-3.15F * var1);
      return O00000000(var2 * 0.58F + var3 * 0.42F, 0.0F, 1.0F);
   }

   private static float O00000000(float f, float g, float h, float i, float j) {
      float var5 = (h - f) * j;
      float var6 = i - g;
      return (float)Math.sqrt(var5 * var5 + var6 * var6);
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   static final class W398 {
      final O0000O0O00O0.W399 O00000000 = new O0000O0O00O0.W399();
      float O000000000;
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      int O000000000000O = -4205825;
      int O00000000000O = -8547073;
   }

   static final class W399 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
   }
}

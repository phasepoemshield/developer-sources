package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O00000O0O000 {
   private static final O00000O0O000 O00000000 = new O00000O0O000();
   private static final String O000000000 = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String O0000000000 = "assets/wild/shaders/hud/prismatic_edge.frag";
   private static final long O00000000000 = 3000000L;
   private static final float O000000000000 = 1.45F;
   private static final float O0000000000000 = 1.0F;
   private static final float O000000000000O = 0.62F;
   private static final float O00000000000O = 0.55F;
   private static final float O00000000000O0 = 1.7F;
   private O0000O00OO0 O00000000000OO;
   private int O0000000000O;
   private int O0000000000O0;
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
   private int O000000000O0O = -1;
   private int O000000000O0O0 = -1;
   private int O000000000O0OO = -1;
   private int O000000000OO = -1;
   private int O000000000OO0 = -1;
   private int O000000000OO00 = -1;
   private int O000000000OO0O = -1;
   private int O000000000OOO = -1;
   private int O000000000OOO0 = -1;
   private int O000000000OOOO = -1;
   private int O00000000O = -1;
   private int O00000000O0 = -1;
   private int O00000000O00 = -1;
   private int O00000000O000 = -1;
   private int O00000000O0000 = -1;
   private int O00000000O000O = -1;
   private boolean O00000000O00O;
   private boolean O00000000O00O0;
   private int O00000000O00OO;
   private int O00000000O0O;
   private int O00000000O0O0;
   private long O00000000O0O00 = Long.MIN_VALUE;
   private float O00000000O0O0O;
   private float O00000000O0OO;
   private float O00000000O0OO0;
   private long O00000000O0OOO = Long.MIN_VALUE;

   private O00000O0O000() {
   }

   static boolean O00000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      boolean bl,
      int l,
      int m,
      int n,
      int o,
      boolean bl2,
      boolean bl3,
      float p
   ) {
      return O00000000.O000000000(o0000O00OO0O0, f, g, h, i, j, k, bl, l, m, n, o, bl2, bl3, p);
   }

   private boolean O000000000(
      RenderManager o0000O00OO0O0,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      boolean bl,
      int l,
      int m,
      int n,
      int o,
      boolean bl2,
      boolean bl3,
      float p
   ) {
      MinecraftClient var16 = MinecraftClient.getInstance();
      if (!this.O00000000O00O0 && o0000O00OO0O0 != null && var16 != null && var16.getWindow() != null && !(h <= 1.0F) && !(i <= 1.0F) && !(k <= 0.001F)) {
         int var17 = var16.getWindow().getFramebufferWidth();
         int var18 = var16.getWindow().getFramebufferHeight();
         if (var17 > 1 && var18 > 1 && this.O00000000()) {
            o0000O00OO0O0.O0000000000();
            int var19 = this.O00000000(var17, var18);
            float var20 = bl ? Math.max(18.0F, j * 2.5F) : Math.max(72.0F, j * 4.0F);
            float var21 = O00000OO000O.O00000000().O000000000000O();
            float var22 = O00000OO000O.O00000000().O00000000000O();
            float var23 = this.O00000000(var21, var22);
            O0000O00O0OOO0.W373 var24 = O0000O00O0OOO0.O00000000();

            boolean var26;
            try {
               GL11.glViewport(0, 0, var17, var18);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3089);
               GL11.glDepthMask(false);
               GL11.glColorMask(true, true, true, true);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               this.O00000000000OO.O00000000();
               if (this.O0000000000O00 >= 0) {
                  GL20.glUniform2f(this.O0000000000O00, var17, var18);
               }

               if (this.O0000000000O0O >= 0) {
                  GL20.glUniform1f(this.O0000000000O0O, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
               }

               if (this.O0000000000OO >= 0) {
                  GL20.glUniform4f(this.O0000000000OO, f - var20, g - var20, h + var20 * 2.0F, i + var20 * 2.0F);
               }

               if (this.O0000000000OO0 >= 0) {
                  GL20.glUniform4f(this.O0000000000OO0, f, g, h, i);
               }

               if (this.O0000000000OOO >= 0) {
                  GL20.glUniform1f(this.O0000000000OOO, Math.max(0.0F, j));
               }

               if (this.O000000000O >= 0) {
                  GL20.glUniform1f(this.O000000000O, O00000000(k));
               }

               if (this.O000000000O0 >= 0) {
                  GL20.glUniform1f(this.O000000000O0, bl ? 1.0F : 0.0F);
               }

               if (this.O000000000O00 >= 0) {
                  O0000000000(this.O000000000O00, l);
               }

               if (this.O000000000O000 >= 0) {
                  O0000000000(this.O000000000O000, m);
               }

               if (this.O000000000O00O >= 0) {
                  O000000000(this.O000000000O00O, n);
               }

               if (this.O000000000O0O >= 0) {
                  O000000000(this.O000000000O0O, o);
               }

               if (this.O000000000O0O0 >= 0) {
                  GL20.glUniform2f(this.O000000000O0O0, var21, var22);
               }

               if (this.O00000000O >= 0) {
                  GL20.glUniform1f(this.O00000000O, var23);
               }

               if (this.O00000000O0 >= 0) {
                  GL20.glUniform1f(this.O00000000O0, 1.45F);
               }

               if (this.O00000000O00 >= 0) {
                  GL20.glUniform1f(this.O00000000O00, 1.0F);
               }

               if (this.O00000000O000 >= 0) {
                  GL20.glUniform1f(this.O00000000O000, 0.62F);
               }

               if (this.O00000000O0000 >= 0) {
                  GL20.glUniform1f(this.O00000000O0000, 0.55F);
               }

               if (this.O00000000O000O >= 0) {
                  GL20.glUniform1f(this.O00000000O000O, 1.7F);
               }

               if (this.O000000000O0OO >= 0) {
                  GL20.glUniform1f(this.O000000000O0OO, bl2 ? 1.0F : 0.0F);
               }

               if (this.O000000000OO >= 0) {
                  GL20.glUniform1f(this.O000000000OO, bl3 ? 1.0F : 0.0F);
               }

               if (this.O000000000OO0 >= 0) {
                  GL20.glUniform1f(this.O000000000OO0, O00000000(p));
               }

               if (this.O000000000OO00 >= 0) {
                  GL20.glUniform1f(this.O000000000OO00, var20);
               }

               if (this.O000000000OO0O >= 0) {
                  GL20.glUniform1f(this.O000000000OO0O, 0.6F);
               }

               if (this.O000000000OOO >= 0) {
                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, Math.max(var19, 0));
                  GL20.glUniform1i(this.O000000000OOO, 0);
               }

               if (this.O000000000OOO0 >= 0) {
                  GL20.glUniform2f(this.O000000000OOO0, this.O00000000O0O > 0 ? this.O00000000O0O : var17, this.O00000000O0O0 > 0 ? this.O00000000O0O0 : var18);
               }

               if (this.O000000000OOOO >= 0) {
                  GL20.glUniform1f(this.O000000000OOOO, var19 > 0 ? 1.0F : 0.0F);
               }

               GL30.glBindVertexArray(this.O0000000000O);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
               return true;
            } catch (Throwable var30) {
               System.err.println("[Prismatic] surface draw disabled: " + var30.getMessage());
               var30.printStackTrace();
               this.O00000000O00O0 = true;
               var26 = false;
            } finally {
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var24);
            }

            return var26;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private float O00000000(float f, float g) {
      long var3 = System.nanoTime();
      if (var3 - this.O00000000O0OOO > 3000000L) {
         float var5 = f - this.O00000000O0O0O;
         float var6 = g - this.O00000000O0OO;
         float var7 = (float)Math.sqrt(var5 * var5 + var6 * var6);
         this.O00000000O0OO0 = this.O00000000O0OO0 * 0.55F + Math.min(1.0F, var7 / 36.0F) * 0.45F;
         if (this.O00000000O0OO0 < 8.0E-4F) {
            this.O00000000O0OO0 = 0.0F;
         }

         this.O00000000O0O0O = f;
         this.O00000000O0OO = g;
         this.O00000000O0OOO = var3;
      }

      return this.O00000000O0OO0;
   }

   private int O00000000(int i, int j) {
      long var3 = System.nanoTime();
      if (this.O00000000O00OO > 0 && this.O00000000O0O == i && this.O00000000O0O0 == j && var3 - this.O00000000O0O00 < 3000000L) {
         return this.O00000000O00OO;
      } else {
         try {
            RenderEngine var5 = WildClient.O0000000000();
            if (var5 == null) {
               this.O00000000O00OO = 0;
               return 0;
            } else {
               RenderEngine.W370 var6 = var5.O00000000000();
               if (var6 != null && var6.colorTexture() > 0 && var6.width() > 0 && var6.height() > 0) {
                  this.O00000000O00OO = var6.colorTexture();
                  this.O00000000O0O = var6.width();
                  this.O00000000O0O0 = var6.height();
                  this.O00000000O0O00 = var3;
                  return this.O00000000O00OO;
               } else {
                  this.O00000000O00OO = 0;
                  return 0;
               }
            }
         } catch (Throwable var7) {
            this.O00000000O00OO = 0;
            return 0;
         }
      }
   }

   private boolean O00000000() {
      if (!this.O00000000O00O) {
         this.O00000000O00O = true;

         try {
            this.O00000000000OO = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/prismatic_edge.frag");
            this.O0000000000O00 = this.O00000000000OO.O00000000("uResolution");
            this.O0000000000O0O = this.O00000000000OO.O00000000("uTime");
            this.O0000000000OO = this.O00000000000OO.O00000000("uDrawRect");
            this.O0000000000OO0 = this.O00000000000OO.O00000000("uElementRect");
            this.O0000000000OOO = this.O00000000000OO.O00000000("uRadius");
            this.O000000000O = this.O00000000000OO.O00000000("uAlpha");
            this.O000000000O0 = this.O00000000000OO.O00000000("uInset");
            this.O000000000O00 = this.O00000000000OO.O00000000("uSurfaceColor");
            this.O000000000O000 = this.O00000000000OO.O00000000("uOutlineColor");
            this.O000000000O00O = this.O00000000000OO.O00000000("uAccentTop");
            this.O000000000O0O = this.O00000000000OO.O00000000("uAccentBottom");
            this.O000000000O0O0 = this.O00000000000OO.O00000000("uMouse");
            this.O000000000O0OO = this.O00000000000OO.O00000000("uShadow");
            this.O000000000OO = this.O00000000000OO.O00000000("uOutline");
            this.O000000000OO0 = this.O00000000000OO.O00000000("uLightMode");
            this.O000000000OO00 = this.O00000000000OO.O00000000("uPad");
            this.O000000000OO0O = this.O00000000000OO.O00000000("uSweepSpeed");
            this.O000000000OOO = this.O00000000000OO.O00000000("uScene");
            this.O000000000OOO0 = this.O00000000000OO.O00000000("uSceneSize");
            this.O000000000OOOO = this.O00000000000OO.O00000000("uHasScene");
            this.O00000000O = this.O00000000000OO.O00000000("uMouseVel");
            this.O00000000O0 = this.O00000000000OO.O00000000("uIor");
            this.O00000000O00 = this.O00000000000OO.O00000000("uDispersion");
            this.O00000000O000 = this.O00000000000OO.O00000000("uDecay");
            this.O00000000O0000 = this.O00000000000OO.O00000000("uCausticGain");
            this.O00000000O000O = this.O00000000000OO.O00000000("uGlintGain");
            this.O0000000000O = GL30.glGenVertexArrays();
            this.O0000000000O0 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O0000000000O);
            GL15.glBindBuffer(34962, this.O0000000000O0);
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
            System.err.println("[Prismatic] surface shader failed to load (style will fall back): " + var3.getMessage());
            var3.printStackTrace();
            this.O00000000O00O0 = true;
            this.O00000000000OO = null;
            return false;
         }
      } else {
         return this.O00000000000OO != null && this.O0000000000O != 0;
      }
   }

   private static void O000000000(int i, int j) {
      GL20.glUniform3f(i, O00000000(j), O000000000(j), O0000000000(j));
   }

   private static void O0000000000(int i, int j) {
      GL20.glUniform4f(i, O00000000(j), O000000000(j), O0000000000(j), O00000000000(j));
   }

   private static float O00000000(int i) {
      return (i >>> 16 & 0xFF) / 255.0F;
   }

   private static float O000000000(int i) {
      return (i >>> 8 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static float O00000000000(int i) {
      return (i >>> 24 & 0xFF) / 255.0F;
   }

   private static float O00000000(float f) {
      return Math.max(0.0F, Math.min(1.0F, f));
   }
}

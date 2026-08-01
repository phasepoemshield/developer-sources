package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O00000O00OO0O0 {
   private static final O00000O00OO0O0 O00000000 = new O00000O00OO0O0();
   private static final String O000000000 = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String O0000000000 = "assets/wild/shaders/hud/hud_ferrofluid_surface.frag";
   private O0000O00OO0 O00000000000;
   private int O000000000000;
   private int O0000000000000;
   private int O000000000000O = -1;
   private int O00000000000O = -1;
   private int O00000000000O0 = -1;
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
   private int O000000000O000 = -1;
   private boolean O000000000O00O;
   private boolean O000000000O0O;

   private O00000O00OO0O0() {
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
      if (!this.O000000000O0O && o0000O00OO0O0 != null && var16 != null && var16.getWindow() != null && !(h <= 1.0F) && !(i <= 1.0F) && !(k <= 0.001F)) {
         int var17 = var16.getWindow().getFramebufferWidth();
         int var18 = var16.getWindow().getFramebufferHeight();
         if (var17 > 1 && var18 > 1 && this.O00000000()) {
            o0000O00OO0O0.O0000000000();
            float var19 = Math.max(18.0F, j * 2.8F);
            float var20 = O00000OO000O.O00000000().O000000000000O();
            float var21 = O00000OO000O.O00000000().O00000000000O();
            O0000O00O0OOO0.W373 var22 = O0000O00O0OOO0.O00000000();

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
               this.O00000000000.O00000000();
               if (this.O000000000000O >= 0) {
                  GL20.glUniform2f(this.O000000000000O, var17, var18);
               }

               if (this.O00000000000O >= 0) {
                  GL20.glUniform1f(this.O00000000000O, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
               }

               if (this.O00000000000O0 >= 0) {
                  GL20.glUniform4f(this.O00000000000O0, f - var19, g - var19, h + var19 * 2.0F, i + var19 * 2.0F);
               }

               if (this.O00000000000OO >= 0) {
                  GL20.glUniform4f(this.O00000000000OO, f, g, h, i);
               }

               if (this.O0000000000O >= 0) {
                  GL20.glUniform1f(this.O0000000000O, Math.max(0.0F, j));
               }

               if (this.O0000000000O0 >= 0) {
                  GL20.glUniform1f(this.O0000000000O0, O00000000(k));
               }

               if (this.O0000000000O00 >= 0) {
                  GL20.glUniform1f(this.O0000000000O00, bl ? 1.0F : 0.0F);
               }

               if (this.O0000000000O0O >= 0) {
                  O000000000(this.O0000000000O0O, l);
               }

               if (this.O0000000000OO >= 0) {
                  O000000000(this.O0000000000OO, m);
               }

               if (this.O0000000000OO0 >= 0) {
                  O00000000(this.O0000000000OO0, n);
               }

               if (this.O0000000000OOO >= 0) {
                  O00000000(this.O0000000000OOO, o);
               }

               if (this.O000000000O >= 0) {
                  GL20.glUniform2f(this.O000000000O, var20, var21);
               }

               if (this.O000000000O0 >= 0) {
                  GL20.glUniform1f(this.O000000000O0, bl2 ? 1.0F : 0.0F);
               }

               if (this.O000000000O00 >= 0) {
                  GL20.glUniform1f(this.O000000000O00, bl3 ? 1.0F : 0.0F);
               }

               if (this.O000000000O000 >= 0) {
                  GL20.glUniform1f(this.O000000000O000, O00000000(p));
               }

               GL30.glBindVertexArray(this.O000000000000);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
               return true;
            } catch (Throwable var28) {
               this.O000000000O0O = true;
               var24 = false;
            } finally {
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var22);
            }

            return var24;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O00000000() {
      if (!this.O000000000O00O) {
         this.O000000000O00O = true;

         try {
            this.O00000000000 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/hud_ferrofluid_surface.frag");
            this.O000000000000O = this.O00000000000.O00000000("uResolution");
            this.O00000000000O = this.O00000000000.O00000000("uTime");
            this.O00000000000O0 = this.O00000000000.O00000000("uDrawRect");
            this.O00000000000OO = this.O00000000000.O00000000("uElementRect");
            this.O0000000000O = this.O00000000000.O00000000("uRadius");
            this.O0000000000O0 = this.O00000000000.O00000000("uAlpha");
            this.O0000000000O00 = this.O00000000000.O00000000("uInset");
            this.O0000000000O0O = this.O00000000000.O00000000("uSurfaceColor");
            this.O0000000000OO = this.O00000000000.O00000000("uOutlineColor");
            this.O0000000000OO0 = this.O00000000000.O00000000("uAccentTop");
            this.O0000000000OOO = this.O00000000000.O00000000("uAccentBottom");
            this.O000000000O = this.O00000000000.O00000000("uMouse");
            this.O000000000O0 = this.O00000000000.O00000000("uShadow");
            this.O000000000O00 = this.O00000000000.O00000000("uOutline");
            this.O000000000O000 = this.O00000000000.O00000000("uLightMode");
            this.O000000000000 = GL30.glGenVertexArrays();
            this.O0000000000000 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000000);
            GL15.glBindBuffer(34962, this.O0000000000000);
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
            this.O000000000O0O = true;
            this.O00000000000 = null;
            return false;
         }
      } else {
         return this.O00000000000 != null && this.O000000000000 != 0;
      }
   }

   private static void O00000000(int i, int j) {
      GL20.glUniform3f(i, O00000000(j), O000000000(j), O0000000000(j));
   }

   private static void O000000000(int i, int j) {
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

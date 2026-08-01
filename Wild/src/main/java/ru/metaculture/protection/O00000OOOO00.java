package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOOO00 {
   private static final O00000OOOO00 O00000000 = new O00000OOOO00();
   private static final String O000000000 = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String O0000000000 = "assets/wild/shaders/foundry/grid.frag";
   private static final String O00000000000 = "assets/wild/shaders/foundry/grid_composite.frag";
   private static final float O000000000000 = 1.0F;
   private static final float O0000000000000 = 310.0F;
   private static final float O000000000000O = 34.0F;
   private static final float O00000000000O = 92.0F;
   private static final float O00000000000O0 = 18.0F;
   private final O00000OOO0 O00000000000OO = new O00000OOO0();
   private O0000O00OO0 O0000000000O;
   private O0000O00OO0 O0000000000O0;
   private int O0000000000O00;
   private int O0000000000O0O;
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
   private boolean O000000000OOO;
   private boolean O000000000OOO0;
   private boolean O000000000OOOO;
   private long O00000000O;
   private float O00000000O0;
   private float O00000000O00;
   private float O00000000O000;
   private float O00000000O0000;
   private float O00000000O000O;
   private float O00000000O00O;

   private O00000OOOO00() {
   }

   public static O00000OOOO00 O00000000() {
      return O00000000;
   }

   public boolean O00000000(
      RenderManager o0000O00OO0O0, int i, int j, float f, float g, float h, float k, float l, float m, float n, ColorScheme o0000O000O0OO, boolean bl
   ) {
      if (this.O000000000OOO0 || o0000O00OO0O0 == null || i <= 0 || j <= 0 || m <= 0.001F) {
         return false;
      } else if (!this.O000000000()) {
         return false;
      } else {
         this.O00000000(i, j, k, l);
         o0000O00OO0O0.O0000000000();
         int var13 = o0000O000O0OO == null ? -29969 : o0000O000O0OO.O000000000O0();
         int var14 = o0000O000O0OO == null ? -8128257 : o0000O000O0OO.O000000000O00();
         O0000O00O0OOO0.W373 var15 = O0000O00O0OOO0.O00000000();

         boolean var16;
         try {
            this.O00000000000OO.O00000000(i, j);
            if (this.O00000000000OO.O000000000000()) {
               this.O00000000000OO.O00000000();
               GL11.glDrawBuffer(36064);
               GL11.glViewport(0, 0, i, j);
               GL11.glDisable(3089);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glDisable(3042);
               GL11.glDepthMask(false);
               GL11.glColorMask(true, true, true, true);
               GL11.glDisable(36281);
               GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
               GL11.glClear(16384);
               this.O0000000000O.O00000000();
               O00000000(this.O0000000000OO, (float)i, (float)j);
               O00000000(this.O0000000000OO0, f, g);
               O00000000(this.O0000000000OOO, h);
               O00000000(this.O000000000O, k, l);
               O00000000(this.O000000000O0, this.O00000000O0, this.O00000000O00);
               O00000000(this.O000000000O00, this.O00000000O000, this.O00000000O0000);
               O00000000(this.O000000000O000, this.O00000000O000O);
               O00000000(this.O000000000O00O, n);
               O00000000(this.O000000000O0O, m);
               O00000000(this.O000000000O0O0, O00000000(var13), O000000000(var13), O0000000000(var13));
               O00000000(this.O000000000O0OO, O00000000(var14), O000000000(var14), O0000000000(var14));
               O00000000(this.O000000000OO, bl ? 1.0F : 0.0F);
               GL30.glBindVertexArray(this.O0000000000O00);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindFramebuffer(36160, var15.O00000000);
               GL11.glDrawBuffer(var15.O0000000000);
               GL11.glViewport(0, 0, i, j);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               this.O0000000000O0.O00000000();
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, this.O00000000000OO.O000000000());
               O00000000(this.O000000000OO0, 0);
               O00000000(this.O000000000OO00, (float)i, (float)j);
               O00000000(this.O000000000OO0O, 1.0F);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
               return true;
            }

            var16 = false;
         } catch (Throwable var21) {
            this.O000000000OOO0 = true;
            return false;
         } finally {
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            O0000O00O0OOO0.O00000000(var15);
         }

         return var16;
      }
   }

   private void O00000000(int i, int j, float f, float g) {
      long var5 = System.nanoTime();
      float var7 = this.O00000000O == 0L ? 0.016666668F : (float)(var5 - this.O00000000O) / 1.0E9F;
      this.O00000000O = var5;
      if (!Float.isFinite(var7) || var7 <= 0.0F) {
         var7 = 0.016666668F;
      }

      var7 = Math.max(0.001F, Math.min(0.05F, var7));
      if (!this.O000000000OOOO) {
         this.O00000000O0 = f;
         this.O00000000O00 = g;
         this.O00000000O000 = 0.0F;
         this.O00000000O0000 = 0.0F;
         this.O00000000O000O = 0.0F;
         this.O00000000O00O = 0.0F;
         this.O000000000OOOO = true;
      } else {
         float var8 = ((f - this.O00000000O0) * 310.0F - this.O00000000O000 * 34.0F) / 1.0F;
         float var9 = ((g - this.O00000000O00) * 310.0F - this.O00000000O0000 * 34.0F) / 1.0F;
         this.O00000000O000 += var8 * var7;
         this.O00000000O0000 += var9 * var7;
         this.O00000000O0 = this.O00000000O0 + this.O00000000O000 * var7;
         this.O00000000O00 = this.O00000000O00 + this.O00000000O0000 * var7;
         float var10 = f >= 0.0F && f <= i && g >= 0.0F && g <= j ? 1.0F : 0.0F;
         float var11 = (float)Math.sqrt(this.O00000000O000 * this.O00000000O000 + this.O00000000O0000 * this.O00000000O0000);
         float var12 = var10 * O00000000(0.58F + var11 * 0.0018F, 0.0F, 1.0F);
         float var13 = ((var12 - this.O00000000O000O) * 92.0F - this.O00000000O00O * 18.0F) / 1.0F;
         this.O00000000O00O += var13 * var7;
         this.O00000000O000O = this.O00000000O000O + this.O00000000O00O * var7;
         this.O00000000O000O = O00000000(this.O00000000O000O, 0.0F, 1.0F);
      }
   }

   private boolean O000000000() {
      if (!this.O000000000OOO) {
         this.O000000000OOO = true;

         try {
            this.O0000000000O = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/foundry/grid.frag");
            this.O0000000000O0 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/foundry/grid_composite.frag");
            this.O0000000000OO = this.O0000000000O.O00000000("uResolution");
            this.O0000000000OO0 = this.O0000000000O.O00000000("uPan");
            this.O0000000000OOO = this.O0000000000O.O00000000("uZoom");
            this.O000000000O = this.O0000000000O.O00000000("uMouse");
            this.O000000000O0 = this.O0000000000O.O00000000("uSpringMouse");
            this.O000000000O00 = this.O0000000000O.O00000000("uMouseVelocity");
            this.O000000000O000 = this.O0000000000O.O00000000("uMagnetEnergy");
            this.O000000000O00O = this.O0000000000O.O00000000("uTime");
            this.O000000000O0O = this.O0000000000O.O00000000("uAlpha");
            this.O000000000O0O0 = this.O0000000000O.O00000000("uAccentTop");
            this.O000000000O0OO = this.O0000000000O.O00000000("uAccentBottom");
            this.O000000000OO = this.O0000000000O.O00000000("uLightMode");
            this.O000000000OO0 = this.O0000000000O0.O00000000("uTexture");
            this.O000000000OO00 = this.O0000000000O0.O00000000("uResolution");
            this.O000000000OO0O = this.O0000000000O0.O00000000("uAlpha");
            this.O0000000000O00 = GL30.glGenVertexArrays();
            this.O0000000000O0O = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O0000000000O00);
            GL15.glBindBuffer(34962, this.O0000000000O0O);
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
            this.O000000000OOO0 = true;
            this.O0000000000O = null;
            this.O0000000000O0 = null;
            return false;
         }
      } else {
         return this.O0000000000O != null && this.O0000000000O0 != null && this.O0000000000O00 != 0;
      }
   }

   private static void O00000000(int i, int j) {
      if (i >= 0) {
         GL20.glUniform1i(i, j);
      }
   }

   private static void O00000000(int i, float f) {
      if (i >= 0) {
         GL20.glUniform1f(i, f);
      }
   }

   private static void O00000000(int i, float f, float g) {
      if (i >= 0) {
         GL20.glUniform2f(i, f, g);
      }
   }

   private static void O00000000(int i, float f, float g, float h) {
      if (i >= 0) {
         GL20.glUniform3f(i, f, g, h);
      }
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

   private static float O00000000(float f, float g, float h) {
      return f < g ? g : Math.min(f, h);
   }
}

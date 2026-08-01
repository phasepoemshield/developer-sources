package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O00000OO000O0 {
   private static final O00000OO000O0 O00000000 = new O00000OO000O0();
   private static final int O000000000 = 32;
   private static final String O0000000000 = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String O00000000000 = "assets/wild/shaders/hud/gravity_grid.frag";
   private final float[] O000000000000 = new float[128];
   private final float[] O0000000000000 = new float[32];
   private O0000O00OO0 O000000000000O;
   private int O00000000000O;
   private int O00000000000O0;
   private int O00000000000OO = -1;
   private int O0000000000O = -1;
   private int O0000000000O0 = -1;
   private int O0000000000O00 = -1;
   private int O0000000000O0O = -1;
   private int O0000000000OO = -1;
   private int O0000000000OO0 = -1;
   private int O0000000000OOO = -1;
   private int O000000000O = -1;
   private boolean O000000000O0;
   private boolean O000000000O00;

   private O00000OO000O0() {
   }

   static O00000OO000O0 O00000000() {
      return O00000000;
   }

   void O00000000(int i, int j, O00000OO000O.W222[] o000000000000s, int k, String string, float f, float g, float h, int l, int m) {
      if (!this.O000000000O00 && i > 0 && j > 0 && !(h <= 0.01F)) {
         if (this.O000000000()) {
            int var11 = Math.max(0, Math.min(32, Math.min(k, o000000000000s == null ? 0 : o000000000000s.length)));

            for (int var12 = 0; var12 < 32; var12++) {
               int var13 = var12 * 4;
               if (var12 < var11 && o000000000000s[var12] != null) {
                  O00000OO000O.W222 var14 = o000000000000s[var12];
                  boolean var15 = string != null && string.equals(var14.O00000000);
                  this.O000000000000[var13] = var14.O000000000;
                  this.O000000000000[var13 + 1] = var14.O0000000000;
                  this.O000000000000[var13 + 2] = Math.max(1.0F, var14.O00000000000);
                  this.O000000000000[var13 + 3] = Math.max(var14.O0000000000000, var14.O000000000000O);
                  this.O0000000000000[var12] = Math.max(0.0F, var14.O000000000000) * (var15 ? 2.25F : 1.0F);
               } else {
                  this.O000000000000[var13] = 0.0F;
                  this.O000000000000[var13 + 1] = 0.0F;
                  this.O000000000000[var13 + 2] = 1.0F;
                  this.O000000000000[var13 + 3] = 1.0F;
                  this.O0000000000000[var12] = 0.0F;
               }
            }

            O0000O00O0OOO0.W373 var21 = O0000O00O0OOO0.O00000000();

            try {
               GL11.glViewport(0, 0, i, j);
               GL11.glDisable(3089);
               GL11.glDisable(2929);
               GL11.glDisable(2884);
               GL11.glEnable(3042);
               GL14.glBlendFuncSeparate(770, 771, 1, 771);
               GL11.glDisable(36281);
               this.O000000000000O.O00000000();
               if (this.O00000000000OO >= 0) {
                  GL20.glUniform2f(this.O00000000000OO, i, j);
               }

               if (this.O0000000000O >= 0) {
                  GL20.glUniform1f(this.O0000000000O, (float)(System.nanoTime() % 240000000000L) / 1.0E9F);
               }

               if (this.O0000000000O0 >= 0) {
                  GL20.glUniform1f(this.O0000000000O0, Math.max(0.0F, Math.min(1.0F, h)));
               }

               if (this.O0000000000O00 >= 0) {
                  GL20.glUniform2f(this.O0000000000O00, f, g);
               }

               if (this.O0000000000O0O >= 0) {
                  GL20.glUniform1i(this.O0000000000O0O, var11);
               }

               if (this.O0000000000OO >= 0) {
                  GL20.glUniform4fv(this.O0000000000OO, this.O000000000000);
               }

               if (this.O0000000000OO0 >= 0) {
                  GL20.glUniform1fv(this.O0000000000OO0, this.O0000000000000);
               }

               if (this.O0000000000OOO >= 0) {
                  GL20.glUniform3f(this.O0000000000OOO, O00000000(l), O000000000(l), O0000000000(l));
               }

               if (this.O000000000O >= 0) {
                  GL20.glUniform3f(this.O000000000O, O00000000(m), O000000000(m), O0000000000(m));
               }

               GL30.glBindVertexArray(this.O00000000000O);
               GL11.glDrawArrays(4, 0, 6);
               GL30.glBindVertexArray(0);
            } catch (Throwable var19) {
               this.O000000000O00 = true;
            } finally {
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var21);
            }
         }
      }
   }

   private boolean O000000000() {
      if (!this.O000000000O0) {
         this.O000000000O0 = true;

         try {
            this.O000000000000O = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/gravity_grid.frag");
            this.O00000000000OO = this.O000000000000O.O00000000("uResolution");
            this.O0000000000O = this.O000000000000O.O00000000("uTime");
            this.O0000000000O0 = this.O000000000000O.O00000000("uAlpha");
            this.O0000000000O00 = this.O000000000000O.O00000000("uCursor");
            this.O0000000000O0O = this.O000000000000O.O00000000("uWellCount");
            this.O0000000000OO = this.O000000000000O.O00000000("uWells[0]");
            this.O0000000000OO0 = this.O000000000000O.O00000000("uMass[0]");
            this.O0000000000OOO = this.O000000000000O.O00000000("uAccentTop");
            this.O000000000O = this.O000000000000O.O00000000("uAccentBottom");
            this.O00000000000O = GL30.glGenVertexArrays();
            this.O00000000000O0 = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O00000000000O);
            GL15.glBindBuffer(34962, this.O00000000000O0);
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
            this.O000000000O00 = true;
            this.O000000000000O = null;
            return false;
         }
      } else {
         return this.O000000000000O != null && this.O00000000000O != 0;
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
}

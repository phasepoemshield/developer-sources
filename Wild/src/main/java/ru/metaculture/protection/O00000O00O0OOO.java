package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

final class O00000O00O0OOO {
   private static final O00000O00O0OOO O00000000 = new O00000O00O0OOO();
   private static final int O000000000 = 96;
   private static final String O0000000000 = "assets/wild/shaders/blur/blur_fullscreen.vert";
   private static final String O00000000000 = "assets/wild/shaders/hud/arraylist_ferrofluid.frag";
   private final float[] O000000000000 = new float[384];
   private O0000O00OO0 O0000000000000;
   private int O000000000000O;
   private int O00000000000O;
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
   private final float[] O000000000OOOO = new float[384];

   private O00000O00O0OOO() {
   }

   static boolean O00000000(
      RenderManager o0000O00OO0O0,
      int i,
      int j,
      float[] fs,
      float[] gs,
      int k,
      float f,
      float g,
      float h,
      int l,
      int m,
      int n,
      int o,
      boolean bl,
      boolean bl2,
      boolean bl3,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v
   ) {
      return O00000000.O000000000(o0000O00OO0O0, i, j, fs, gs, k, f, g, h, l, m, n, o, bl, bl2, bl3, p, q, r, s, t, u, v);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O000000000(
      RenderManager o0000O00OO0O0,
      int i,
      int j,
      float[] fs,
      float[] gs,
      int k,
      float f,
      float g,
      float h,
      int l,
      int m,
      int n,
      int o,
      boolean bl,
      boolean bl2,
      boolean bl3,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v
   ) {
      if (!this.O000000000OOO0 && o0000O00OO0O0 != null && i > 0 && j > 0 && k > 0 && k <= 96 && fs != null && !(h <= 0.001F)) {
         if (!this.O00000000()) {
            return false;
         } else {
            float var24 = Float.MAX_VALUE;
            float var25 = Float.MAX_VALUE;
            float var26 = -Float.MAX_VALUE;
            float var27 = -Float.MAX_VALUE;

            for (int var28 = 0; var28 < 96; var28++) {
               int var29 = var28 * 4;
               if (var28 < k) {
                  float var30 = fs[var29];
                  float var31 = fs[var29 + 1];
                  float var32 = Math.max(0.0F, fs[var29 + 2]);
                  float var33 = Math.max(0.0F, fs[var29 + 3]);
                  this.O000000000000[var29] = var30;
                  this.O000000000000[var29 + 1] = var31;
                  this.O000000000000[var29 + 2] = var32;
                  this.O000000000000[var29 + 3] = var33;
                  if (var32 > 0.5F && var33 > 0.5F) {
                     var24 = Math.min(var24, var30);
                     var25 = Math.min(var25, var31);
                     var26 = Math.max(var26, var30 + var32);
                     var27 = Math.max(var27, var31 + var33);
                  }

                  if (gs != null && gs.length >= var29 + 4) {
                     this.O000000000OOOO[var29] = O00000000(gs[var29], -220.0F, 220.0F);
                     this.O000000000OOOO[var29 + 1] = O00000000(gs[var29 + 1], -220.0F, 220.0F);
                     this.O000000000OOOO[var29 + 2] = O00000000(gs[var29 + 2], 0.0F, 2.5F);
                     this.O000000000OOOO[var29 + 3] = O00000000(gs[var29 + 3], 0.0F, 1.0F);
                  } else {
                     this.O000000000OOOO[var29] = 0.0F;
                     this.O000000000OOOO[var29 + 1] = 0.0F;
                     this.O000000000OOOO[var29 + 2] = 0.0F;
                     this.O000000000OOOO[var29 + 3] = 1.0F;
                  }
               } else {
                  this.O000000000000[var29] = 0.0F;
                  this.O000000000000[var29 + 1] = 0.0F;
                  this.O000000000000[var29 + 2] = 0.0F;
                  this.O000000000000[var29 + 3] = 0.0F;
                  this.O000000000OOOO[var29] = 0.0F;
                  this.O000000000OOOO[var29 + 1] = 0.0F;
                  this.O000000000OOOO[var29 + 2] = 0.0F;
                  this.O000000000OOOO[var29 + 3] = 1.0F;
               }
            }

            if (var24 != Float.MAX_VALUE && var25 != Float.MAX_VALUE && !(var26 <= var24) && !(var27 <= var25)) {
               o0000O00OO0O0.O0000000000();
               float var40 = Math.max(24.0F, f * 4.2F);
               O0000O00O0OOO0.W373 var41 = O0000O00O0OOO0.O00000000();
               boolean var37 = false /* VF: Semaphore variable */;

               boolean var42;
               label290: {
                  boolean var43;
                  try {
                     var37 = true;
                     GL11.glViewport(0, 0, i, j);
                     GL11.glDisable(2929);
                     GL11.glDisable(2884);
                     GL11.glDisable(3089);
                     GL11.glDepthMask(false);
                     GL11.glEnable(3042);
                     GL14.glBlendFuncSeparate(770, 771, 1, 771);
                     GL11.glDisable(36281);
                     this.O0000000000000.O00000000();
                     if (this.O00000000000O0 >= 0) {
                        GL20.glUniform2f(this.O00000000000O0, i, j);
                     }

                     if (this.O00000000000OO >= 0) {
                        GL20.glUniform1f(this.O00000000000OO, (float)(System.nanoTime() % 720000000000L) / 1.0E9F);
                     }

                     if (this.O0000000000O >= 0) {
                        GL20.glUniform4f(this.O0000000000O, var24 - var40, var25 - var40, var26 - var24 + var40 * 2.0F, var27 - var25 + var40 * 2.0F);
                     }

                     if (this.O0000000000O0 >= 0) {
                        GL20.glUniform1i(this.O0000000000O0, k);
                     }

                     if (this.O0000000000O00 >= 0) {
                        GL20.glUniform4fv(this.O0000000000O00, this.O000000000000);
                     }

                     if (this.O0000000000O0O >= 0) {
                        GL20.glUniform1f(this.O0000000000O0O, Math.max(1.0F, f));
                     }

                     if (this.O0000000000OO >= 0) {
                        GL20.glUniform1f(this.O0000000000OO, Math.max(0.0F, Math.min(1.0F, g)));
                     }

                     if (this.O0000000000OO0 >= 0) {
                        GL20.glUniform1f(this.O0000000000OO0, Math.max(0.0F, Math.min(1.0F, h)));
                     }

                     if (this.O0000000000OOO >= 0) {
                        GL20.glUniform4fv(this.O0000000000OOO, this.O000000000OOOO);
                     }

                     if (this.O000000000O >= 0) {
                        GL20.glUniform4f(this.O000000000O, q, r, Math.max(0.0F, Math.min(1.0F, s)), Math.max(18.0F, f * 5.5F));
                     }

                     if (this.O000000000O0 >= 0) {
                        GL20.glUniform1f(this.O000000000O0, Math.max(0.0F, Math.min(2.5F, t)));
                     }

                     if (this.O000000000O00 >= 0) {
                        O000000000(this.O000000000O00, l);
                     }

                     if (this.O000000000O000 >= 0) {
                        O000000000(this.O000000000O000, m);
                     }

                     if (this.O000000000O00O >= 0) {
                        O00000000(this.O000000000O00O, n);
                     }

                     if (this.O000000000O0O >= 0) {
                        O00000000(this.O000000000O0O, o);
                     }

                     if (this.O000000000O0O0 >= 0) {
                        GL20.glUniform1f(this.O000000000O0O0, bl ? 1.0F : 0.0F);
                     }

                     if (this.O000000000O0OO >= 0) {
                        GL20.glUniform1f(this.O000000000O0OO, bl2 ? 1.0F : 0.0F);
                     }

                     if (this.O000000000OO >= 0) {
                        GL20.glUniform1f(this.O000000000OO, bl3 ? 1.0F : 0.0F);
                     }

                     if (this.O000000000OO0 >= 0) {
                        GL20.glUniform1f(this.O000000000OO0, Math.max(0.0F, Math.min(1.0F, p)));
                     }

                     if (this.O000000000OO00 >= 0) {
                        GL20.glUniform1f(this.O000000000OO00, Math.max(1.0F, u));
                     }

                     if (this.O000000000OO0O >= 0) {
                        GL20.glUniform1f(this.O000000000OO0O, Math.max(0.0F, Math.min(1.0F, v)));
                     }

                     GL30.glBindVertexArray(this.O000000000000O);
                     GL11.glDrawArrays(4, 0, 6);
                     GL30.glBindVertexArray(0);
                     var42 = true;
                     var37 = false;
                     break label290;
                  } catch (Throwable var38) {
                     this.O000000000OOO0 = true;
                     var43 = false;
                     var37 = false;
                  } finally {
                     if (var37) {
                        GL20.glUseProgram(0);
                        O0000O00O0OOO0.O00000000(var41);
                     }
                  }

                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var41);
                  return var43;
               }

               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var41);
               return var42;
            } else {
               return false;
            }
         }
      } else {
         return false;
      }
   }

   private boolean O00000000() {
      if (!this.O000000000OOO) {
         this.O000000000OOO = true;

         try {
            this.O0000000000000 = O0000O00OO0.O00000000("assets/wild/shaders/blur/blur_fullscreen.vert", "assets/wild/shaders/hud/arraylist_ferrofluid.frag");
            this.O00000000000O0 = this.O0000000000000.O00000000("uResolution");
            this.O00000000000OO = this.O0000000000000.O00000000("uTime");
            this.O0000000000O = this.O0000000000000.O00000000("uDrawRect");
            this.O0000000000O0 = this.O0000000000000.O00000000("uRowCount");
            this.O0000000000O00 = this.O0000000000000.O00000000("uRows[0]");
            this.O0000000000O0O = this.O0000000000000.O00000000("uRadius");
            this.O0000000000OO = this.O0000000000000.O00000000("uDirection");
            this.O0000000000OO0 = this.O0000000000000.O00000000("uAlpha");
            this.O0000000000OOO = this.O0000000000000.O00000000("uMotionRows[0]");
            this.O000000000O = this.O0000000000000.O00000000("uPointer");
            this.O000000000O0 = this.O0000000000000.O00000000("uExposure");
            this.O000000000O00 = this.O0000000000000.O00000000("uSurfaceColor");
            this.O000000000O000 = this.O0000000000000.O00000000("uOutlineColor");
            this.O000000000O00O = this.O0000000000000.O00000000("uAccentTop");
            this.O000000000O0O = this.O0000000000000.O00000000("uAccentBottom");
            this.O000000000O0O0 = this.O0000000000000.O00000000("uOutline");
            this.O000000000O0OO = this.O0000000000000.O00000000("uGlow");
            this.O000000000OO = this.O0000000000000.O00000000("uEdgeHighlight");
            this.O000000000OO0 = this.O0000000000000.O00000000("uLightMode");
            this.O000000000OO00 = this.O0000000000000.O00000000("uFluidCohesion");
            this.O000000000OO0O = this.O0000000000000.O00000000("uSoft");
            this.O000000000000O = GL30.glGenVertexArrays();
            this.O00000000000O = GL15.glGenBuffers();
            GL30.glBindVertexArray(this.O000000000000O);
            GL15.glBindBuffer(34962, this.O00000000000O);
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
            this.O0000000000000 = null;
            return false;
         }
      } else {
         return this.O0000000000000 != null && this.O000000000000O != 0;
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

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }
}

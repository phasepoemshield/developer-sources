package ru.metaculture.protection;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O0000O00000O implements AutoCloseable {
   private static final String O00000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String O000000000 = "assets/wild/shaders/clickgui/holo_blur.frag";
   private static volatile O0000O00000O O0000000000;
   private final O00000OOO000 O00000000000 = new O00000OOO000();
   private O00000OOO O000000000000;
   private O00000OOO000.W289 O0000000000000;
   private int O000000000000O;
   private int O00000000000O;
   private int O00000000000O0;
   private long O00000000000OO;
   private float O0000000000O;
   private long O0000000000O0;
   private boolean O0000000000O00;
   private boolean O0000000000O0O;
   private boolean O0000000000OO;
   private float O0000000000OO0 = 0.5F;
   private float O0000000000OOO = 0.5F;
   private long O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private static final float O000000000O000 = 0.85F;

   public static O0000O00000O O00000000() {
      O0000O00000O var0 = O0000000000;
      if (var0 != null) {
         return var0;
      } else {
         synchronized (O0000O00000O.class) {
            if (O0000000000 == null) {
               O0000000000 = new O0000O00000O();
            }

            return O0000000000;
         }
      }
   }

   private O0000O00000O() {
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void O00000000(int i, int j, float f, float g, float h, float k, float l, float m, float n, float o, float p, float q, float r, float s, float t) {
      if (!this.O0000000000O0O) {
         if (i > 1 && j > 1) {
            if (!(h <= 0.001F)) {
               O0000O00O0OOO0.W373 var16 = O0000O00O0OOO0.O00000000();
               boolean var24 = false /* VF: Semaphore variable */;

               label94: {
                  label112: {
                     label113: {
                        try {
                           var24 = true;
                           this.O000000000();
                           if (this.O0000000000O0O) {
                              var24 = false;
                              break label94;
                           }

                           this.O000000000(i, j);
                           if (this.O000000000000O == 0) {
                              var24 = false;
                              break label112;
                           }

                           GL11.glDisable(2929);
                           GL11.glDisable(2884);
                           GL11.glDisable(3089);
                           GL11.glColorMask(true, true, true, true);
                           GL11.glEnable(3042);
                           GL14.glBlendFuncSeparate(770, 771, 1, 771);
                           GL11.glViewport(0, 0, i, j);
                           this.O0000000000000.O00000000();
                           this.O0000000000000.O00000000("uViewport", i, j);
                           this.O0000000000000.O00000000("uRect", 0.0F, 0.0F, i, j);
                           this.O0000000000000.O00000000("uScene", 0);
                           this.O0000000000000.O00000000("uResolution", i, j);
                           this.O0000000000000.O00000000("uTime", this.O0000000000());
                           float var17 = O000000000(i <= 0 ? 0.0F : f / i);
                           float var18 = O000000000(j <= 0 ? 0.0F : g / j);
                           this.O0000000000000.O00000000("uMouse", var17, var18);
                           this.O0000000000000.O00000000("uIntensity", O000000000(h));
                           this.O0000000000000.O00000000("uBlurMax", Math.max(0.0F, k));
                           this.O0000000000000.O00000000("uTint", O000000000(l));
                           this.O0000000000000.O00000000("uMouseInfluence", Math.max(0.0F, m));
                           this.O0000000000000.O00000000("uClarityRadius", Math.max(0.05F, n));
                           this.O0000000000000.O00000000("uNoiseScale", Math.max(0.5F, o));
                           this.O0000000000000.O00000000("uFlowSpeed", p);
                           this.O0000000000000.O00000000("uContrast", O000000000(q));
                           this.O0000000000000.O00000000("uVignette", O000000000(r));
                           this.O0000000000000.O00000000("uBrightness", O000000000(s));
                           this.O0000000000000.O00000000("uSaturation", O000000000(t));
                           float var19 = O000000000(h);
                           float var20 = this.O00000000(var19, var17, var18);
                           this.O0000000000000.O00000000("uEntry", var20);
                           this.O0000000000000.O00000000("uEntryCenter", this.O0000000000OO0, this.O0000000000OOO);
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, this.O000000000000O);
                           this.O000000000000.O00000000();
                           var24 = false;
                           break label113;
                        } catch (Throwable var25) {
                           this.O0000000000O0O = true;
                           O00000000OO0OO.O00000000().O000000000("HoloBlurBackground.render", var25);
                           var24 = false;
                        } finally {
                           if (var24) {
                              GL13.glActiveTexture(33984);
                              GL11.glBindTexture(3553, 0);
                              GL20.glUseProgram(0);
                              O0000O00O0OOO0.O00000000(var16);
                           }
                        }

                        GL13.glActiveTexture(33984);
                        GL11.glBindTexture(3553, 0);
                        GL20.glUseProgram(0);
                        O0000O00O0OOO0.O00000000(var16);
                        return;
                     }

                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     O0000O00O0OOO0.O00000000(var16);
                     return;
                  }

                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var16);
                  return;
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var16);
            }
         }
      }
   }

   private void O000000000(int i, int j) {
      if (this.O000000000000O == 0) {
         this.O000000000000O = GL11.glGenTextures();
         if (this.O000000000000O == 0) {
            return;
         }

         GL11.glBindTexture(3553, this.O000000000000O);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         this.O00000000000O = 0;
         this.O00000000000O0 = 0;
      } else {
         GL11.glBindTexture(3553, this.O000000000000O);
      }

      if (this.O00000000000O == i && this.O00000000000O0 == j) {
         GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, i, j);
      } else {
         GL11.glCopyTexImage2D(3553, 0, 32856, 0, 0, i, j, 0);
         this.O00000000000O = i;
         this.O00000000000O0 = j;
      }
   }

   private void O000000000() {
      if (!this.O0000000000O00) {
         try {
            this.O000000000000 = new O00000OOO();
            this.O0000000000000 = this.O00000000000
               .O00000000("clickgui_holo", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/clickgui/holo_blur.frag");
            this.O00000000000OO = System.nanoTime();
            this.O0000000000O0 = this.O00000000000OO;
            this.O0000000000O = 0.0F;
            this.O0000000000O00 = true;
         } catch (Throwable var2) {
            this.O0000000000O0O = true;
            O00000000OO0OO.O00000000().O000000000("HoloBlurBackground.ensure", var2);
         }
      }
   }

   private float O00000000(float f, float g, float h) {
      long var4 = System.nanoTime();
      boolean var6 = f > this.O000000000O00 + 1.0E-4F;
      boolean var7 = f < this.O000000000O00 - 1.0E-4F;
      this.O000000000O00 = f;
      if (f < 0.012F) {
         this.O0000000000OO = false;
         this.O000000000O = 0L;
         this.O000000000O0 = 0.0F;
         return 0.0F;
      } else {
         if (!this.O0000000000OO) {
            this.O0000000000OO = true;
            this.O000000000O = var4;
            this.O0000000000OO0 = O000000000(g);
            this.O0000000000OOO = O000000000(h);
            this.O000000000O0 = 0.0F;
         }

         float var8;
         if (this.O000000000O == 0L) {
            this.O000000000O = var4;
            var8 = 0.0F;
         } else {
            float var9 = (float)(var4 - this.O000000000O) / 1.0E9F;
            var8 = O000000000(var9 / 0.85F);
         }

         float var11 = 1.0F - (1.0F - var8) * (1.0F - var8) * (1.0F - var8);
         float var10 = Math.min(var11, O00000000(f));
         if (var7) {
            var10 = Math.min(var10, O00000000(f));
         }

         if (var6 && var10 > this.O000000000O0) {
            this.O000000000O0 = var10;
         } else {
            this.O000000000O0 = var10;
         }

         return O000000000(this.O000000000O0);
      }
   }

   private static float O00000000(float f) {
      float var1 = O000000000(f / 0.6F);
      return var1 * var1 * (3.0F - 2.0F * var1);
   }

   private float O0000000000() {
      long var1 = System.nanoTime();
      if (this.O0000000000O0 == 0L) {
         this.O0000000000O0 = var1;
         return this.O0000000000O;
      } else {
         float var3 = (float)(var1 - this.O0000000000O0) / 1.0E9F;
         this.O0000000000O0 = var1;
         if (!Float.isFinite(var3) || var3 < 0.0F) {
            var3 = 0.0F;
         }

         this.O0000000000O = this.O0000000000O + Math.min(var3, 0.1F);
         if (this.O0000000000O > 720.0F) {
            this.O0000000000O -= 720.0F;
         }

         return this.O0000000000O;
      }
   }

   private static float O000000000(float f) {
      if (Float.isNaN(f)) {
         return 0.0F;
      } else if (f < 0.0F) {
         return 0.0F;
      } else {
         return f > 1.0F ? 1.0F : f;
      }
   }

   @Override
   public void close() {
      try {
         if (this.O000000000000O != 0) {
            GL11.glDeleteTextures(this.O000000000000O);
            this.O000000000000O = 0;
         }

         if (this.O000000000000 != null) {
            this.O000000000000.close();
            this.O000000000000 = null;
         }

         this.O00000000000.close();
      } catch (Throwable var2) {
      }

      this.O0000000000O00 = false;
      this.O00000000000OO = 0L;
      this.O0000000000O0 = 0L;
      this.O0000000000O = 0.0F;
      this.O0000000000OO = false;
      this.O0000000000OO0 = 0.5F;
      this.O0000000000OOO = 0.5F;
      this.O000000000O = 0L;
      this.O000000000O0 = 0.0F;
      this.O000000000O00 = 0.0F;
   }

   public void O00000000(int i, int j) {
      try {
         if (this.O000000000000O != 0) {
            GL11.glDeleteTextures(this.O000000000000O);
            this.O000000000000O = 0;
         }

         this.O00000000000O = 0;
         this.O00000000000O0 = 0;
         if (this.O000000000000 != null) {
            try {
               this.O000000000000.close();
            } catch (Throwable var5) {
            }

            this.O000000000000 = null;
         }

         try {
            this.O00000000000.close();
         } catch (Throwable var4) {
         }

         this.O0000000000000 = null;
         this.O0000000000O00 = false;
         this.O0000000000O0O = false;
         this.O00000000000OO = 0L;
         this.O0000000000O0 = 0L;
         this.O0000000000O = 0.0F;
         this.O0000000000OO = false;
         this.O0000000000OO0 = 0.5F;
         this.O0000000000OOO = 0.5F;
         this.O000000000O = 0L;
         this.O000000000O0 = 0.0F;
         this.O000000000O00 = 0.0F;
      } catch (Throwable var6) {
      }
   }
}

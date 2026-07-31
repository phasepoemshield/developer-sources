package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.nio.FloatBuffer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL15;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;
import org.lwjgl.system.MemoryStack;

public final class O0000O0O000O0O implements AutoCloseable {
   private static final Logger O00000000000 = LogManager.getLogger("GlowESP");
   private static final String O000000000000 = "assets/wild/shaders/glowesp/fullscreen.vert";
   private static final String O0000000000000 = "assets/wild/shaders/glowesp/mask.frag";
   private static final String O000000000000O = "assets/wild/shaders/glowesp/shadow.frag";
   private static final String O00000000000O = "assets/wild/shaders/glowesp/gradient.frag";
   private static final String O00000000000O0 = "assets/wild/shaders/glowesp/dominant_color.frag";
   private static final String O00000000000OO = "assets/wild/shaders/blur/blur_downsample.frag";
   private static final int O0000000000O = 63;
   private static final int O0000000000O0 = 2;
   private static final float O0000000000O00 = 8.0F;
   private final O0000O0O000O0O.W391 O0000000000O0O = new O0000O0O000O0O.W391();
   private final O0000O0O000O0O.W391 O0000000000OO = new O0000O0O000O0O.W391();
   private final O0000O0O000O0O.W391 O0000000000OO0 = new O0000O0O000O0O.W391();
   private final O0000O0O000O0O.W391 O0000000000OOO = new O0000O0O000O0O.W391();
   private final O0000O0O000O0O.W391 O000000000O = new O0000O0O000O0O.W391();
   private O0000O00OO0 O000000000O0;
   private O0000O00OO0 O000000000O00;
   private O0000O00OO0 O000000000O000;
   private O0000O00OO0 O000000000O00O;
   private O0000O00OO0 O000000000O0O;
   private int O000000000O0O0;
   private int O000000000O0OO;
   private boolean O000000000OO;
   private boolean O000000000OO0;
   private String O000000000OO00 = "not-run";
   private int O000000000OO0O;
   private int O000000000OOO;
   private int O000000000OOO0 = -1;
   private final float[] O000000000OOOO = new float[64];
   public static final int O00000000 = 0;
   public static final int O000000000 = 1;
   public static final int O0000000000 = 2;

   public boolean O00000000(int i, int j, int k, int l, O0000O0O000O0O.W390 o000000000) {
      return this.O00000000(i, j, i, k, l, o000000000, null);
   }

   public boolean O00000000(int i, int j, int k, int l, O0000O0O000O0O.W390 o000000000, O0000O0O000O0O.W389 o00000000) {
      return this.O00000000(i, j, i, k, l, o000000000, o00000000);
   }

   public boolean O00000000(int i, int j, int k, int l, O0000O0O000O0O.W390 o000000000, O0000O0O000O0O.W389 o00000000, int m, int n, int o) {
      return this.O00000000(i, j, i, k, l, o000000000, o00000000, m, n, o);
   }

   public boolean O00000000(int i, int j, int k, int l, int m, O0000O0O000O0O.W390 o000000000) {
      return this.O00000000(i, j, k, l, m, o000000000, null);
   }

   public boolean O00000000(int i, int j, int k, int l, int m, O0000O0O000O0O.W390 o000000000, O0000O0O000O0O.W389 o00000000) {
      return this.O00000000(i, j, k, l, m, o000000000, o00000000, 0, 0, 0);
   }

   public boolean O00000000(int i, int j, int k, int l, int m, O0000O0O000O0O.W390 o000000000, O0000O0O000O0O.W389 o00000000, int n, int o, int p) {
      if (this.O000000000OO0) {
         this.O000000000OO00 = "renderer-broken";
         return false;
      } else if (i <= 0 || l <= 0 || m <= 0 || o000000000 == null) {
         this.O000000000OO00 = "invalid-input";
         return false;
      } else if (!O00000000000O()) {
         this.O000000000OO00 = "no-render-context";
         return false;
      } else {
         try {
            boolean var11 = this.O000000000(i, j, k, l, m, o000000000, o00000000, n, o, p);
            this.O000000000OO00 = var11 ? "rendered" : this.O000000000OO00;
            return var11;
         } catch (Throwable var12) {
            this.O000000000OO0 = true;
            this.O000000000OO00 = "exception:" + var12.getClass().getSimpleName() + ":" + var12.getMessage();
            O00000000000.warn("GlowESP renderer disabled", var12);
            return false;
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean O000000000(int i, int j, int k, int l, int m, O0000O0O000O0O.W390 o000000000, O0000O0O000O0O.W389 o00000000, int n, int o, int p) {
      O0000O00O0OOO0.W373 var11 = O0000O00O0OOO0.O00000000();
      boolean var19 = false /* VF: Semaphore variable */;

      int var21;
      label90: {
         int var22;
         label89: {
            boolean var23;
            label88: {
               try {
                  var19 = true;
                  this.O00000000000();
                  O0000O0O000O0O.W389 var12 = O00000000(o00000000, l, m);
                  if (!this.O00000000(this.O0000000000O0O, l, m)) {
                     this.O000000000OO00 = "mask-target-incomplete";
                     var21 = 0;
                     var19 = false;
                     break label90;
                  }

                  if (var12 != null) {
                     this.O000000000(this.O0000000000O0O, var12);
                  }

                  var21 = this.O00000000(i, j, l, m, var12, n, o, p);
                  int var14 = 0;
                  if (o000000000.autoColor != 0) {
                     if (!this.O00000000(this.O000000000O, 1, 1)) {
                        this.O000000000OO00 = "dominant-color-target-incomplete";
                        var22 = 0;
                        var19 = false;
                        break label89;
                     }

                     var14 = this.O00000000(k > 0 ? k : i);
                  }

                  var22 = var21;
                  if (o000000000.glowStrength > 0.001F || o000000000.debugView == 2) {
                     var22 = this.O00000000(var21, l, m, o000000000.radius, var12);
                     if (var22 == 0) {
                        this.O000000000OO00 = "blur-target-incomplete";
                        var23 = false;
                        var19 = false;
                        break label88;
                     }
                  }

                  var23 = this.O00000000(var21, var22, var14, l, m, o000000000, var11, var12);
                  var19 = false;
               } finally {
                  if (var19) {
                     GL20.glUseProgram(0);
                     GL30.glBindVertexArray(0);
                     GL13.glActiveTexture(33987);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33986);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33985);
                     GL11.glBindTexture(3553, 0);
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     O0000O00O0OOO0.O00000000(var11);
                  }
               }

               GL20.glUseProgram(0);
               GL30.glBindVertexArray(0);
               GL13.glActiveTexture(33987);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33986);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33985);
               GL11.glBindTexture(3553, 0);
               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               O0000O00O0OOO0.O00000000(var11);
               return var23;
            }

            GL20.glUseProgram(0);
            GL30.glBindVertexArray(0);
            GL13.glActiveTexture(33987);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33986);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33985);
            GL11.glBindTexture(3553, 0);
            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            O0000O00O0OOO0.O00000000(var11);
            return var23;
         }

         GL20.glUseProgram(0);
         GL30.glBindVertexArray(0);
         GL13.glActiveTexture(33987);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33986);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, 0);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, 0);
         O0000O00O0OOO0.O00000000(var11);
         return var22 != 0;
      }

      GL20.glUseProgram(0);
      GL30.glBindVertexArray(0);
      GL13.glActiveTexture(33987);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33986);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, 0);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, 0);
      O0000O00O0OOO0.O00000000(var11);
      return var21 != 0;
   }

   private int O00000000(int i, int j, int k, int l, O0000O0O000O0O.W389 o00000000, int m, int n, int o) {
      boolean var9 = o != 0 && m > 0;
      this.O0000000000000();
      this.O000000000O0.O00000000();
      O00000000(this.O000000000O0, "uSource", 0);
      O00000000(this.O000000000O0, "uDepthSource", 1);
      O00000000(this.O000000000O0, "uTagged", 2);
      O00000000(this.O000000000O0, "uTaggedDepth", 3);
      O00000000(this.O000000000O0, "uHasDepth", j > 0 ? 1 : 0);
      O00000000(this.O000000000O0, "uTagMode", var9 ? o : 0);
      O00000000(this.O000000000O0, "uThreshold", 0.05F);
      this.O00000000(this.O0000000000O0O, o00000000);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, i);
      GL13.glActiveTexture(33985);
      GL11.glBindTexture(3553, j > 0 ? j : i);
      GL13.glActiveTexture(33986);
      GL11.glBindTexture(3553, var9 ? m : i);
      GL13.glActiveTexture(33987);
      GL11.glBindTexture(3553, var9 && n > 0 ? n : i);
      this.O000000000000O();
      return this.O0000000000O0O.O000000000;
   }

   private int O00000000(int i, int j, int k, float f, O0000O0O000O0O.W389 o00000000) {
      int var6 = O00000000(f, j, k);
      int var7 = var6 > 1 ? Math.max(1, j / var6) : j;
      int var8 = var6 > 1 ? Math.max(1, k / var6) : k;
      int var9 = i;
      O0000O0O000O0O.W389 var10 = O00000000(o00000000, var7, var8, j, k);
      if (var6 > 1) {
         if (!this.O00000000(this.O0000000000OO, var7, var8)) {
            return 0;
         }

         if (o00000000 != null) {
            this.O000000000(this.O0000000000OO, var10);
         }

         var9 = this.O00000000(i, j, k, var10);
      }

      if (this.O00000000(this.O0000000000OO0, var7, var8) && this.O00000000(this.O0000000000OOO, var7, var8)) {
         if (o00000000 != null) {
            this.O000000000(this.O0000000000OO0, var10);
            this.O000000000(this.O0000000000OOO, var10);
         }

         int var11 = Math.max(1, Math.min(63, Math.round(f / var6)));
         float[] var12 = this.O000000000(var11);
         this.O0000000000000();
         this.O000000000O00.O00000000();
         O00000000(this.O000000000O00, "uSource", 0);
         O00000000(this.O000000000O00, "uTexelSize", 1.0F / var7, 1.0F / var8);
         O00000000(this.O000000000O00, "uRadius", var11);
         int var13 = this.O000000000O00.O00000000("uKernel[0]");
         if (var13 >= 0) {
            GL20.glUniform1fv(var13, var12);
         }

         this.O00000000(this.O0000000000OO0, var10);
         O00000000(this.O000000000O00, "uDirection", 1.0F, 0.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, var9);
         this.O000000000000O();
         this.O00000000(this.O0000000000OOO, var10);
         O00000000(this.O000000000O00, "uDirection", 0.0F, 1.0F);
         GL11.glBindTexture(3553, this.O0000000000OO0.O000000000);
         this.O000000000000O();
         return this.O0000000000OOO.O000000000;
      } else {
         return 0;
      }
   }

   private int O00000000(int i, int j, int k, O0000O0O000O0O.W389 o00000000) {
      this.O0000000000000();
      this.O000000000O0O.O00000000();
      O00000000(this.O000000000O0O, "uSource", 0);
      O00000000(this.O000000000O0O, "uTexelSize", 1.0F / j, 1.0F / k);
      O00000000(this.O000000000O0O, "uOffset", 1.0F);
      this.O00000000(this.O0000000000OO, o00000000);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, i);
      this.O000000000000O();
      return this.O0000000000OO.O000000000;
   }

   private int O00000000(int i) {
      this.O0000000000000();
      this.O000000000O00O.O00000000();
      O00000000(this.O000000000O00O, "uSource", 0);
      this.O00000000(this.O000000000O);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, i);
      this.O000000000000O();
      return this.O000000000O.O000000000;
   }

   private boolean O00000000(int i, int j, int k, int l, int m, O0000O0O000O0O.W390 o000000000, O0000O00O0OOO0.W373 o00000000, O0000O0O000O0O.W389 o000000002) {
      GL30.glBindFramebuffer(36009, o00000000.O00000000);
      this.O000000000OO0O = o00000000.O00000000;
      this.O000000000OOO = GL30.glCheckFramebufferStatus(36009);
      if (this.O000000000OOO != 36053) {
         this.O000000000OO00 = "output-framebuffer-incomplete";
         return false;
      } else {
         GL11.glDrawBuffer(o00000000.O0000000000);
         GL11.glViewport(o00000000.O000000000000[0], o00000000.O000000000000[1], o00000000.O000000000000[2], o00000000.O000000000000[3]);
         O00000000(o000000002, l, m, o00000000);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         GL11.glDisable(36281);
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         GL11.glColorMask(true, true, true, true);
         GL11.glDepthMask(false);
         this.O000000000O000.O00000000();
         O00000000(this.O000000000O000, "uMask", 0);
         O00000000(this.O000000000O000, "uBlur", 1);
         O00000000(this.O000000000O000, "uAutoColor", 2);
         O00000000(this.O000000000O000, "uAutoColorEnabled", o000000000.autoColor);
         O00000000(this.O000000000O000, "uTexelSize", 1.0F / l, 1.0F / m);
         O00000000(this.O000000000O000, "uOutlineWidth", o000000000.outlineWidth);
         O00000000(this.O000000000O000, "uGlowStrength", o000000000.glowStrength);
         O00000000(this.O000000000O000, "uOutlineStrength", o000000000.outlineStrength);
         O00000000(this.O000000000O000, "uOpacity", o000000000.opacity);
         O00000000(this.O000000000O000, "uDebugView", o000000000.debugView);
         O00000000(this.O000000000O000, "uColorStyle", o000000000.colorStyle);
         O00000000(this.O000000000O000, "uTime", (float)(System.nanoTime() % 30000000000L) / 1.0E9F);
         O00000000(this.O000000000O000, "uColorTop", o000000000.topR, o000000000.topG, o000000000.topB, 1.0F);
         O00000000(this.O000000000O000, "uColorBottom", o000000000.bottomR, o000000000.bottomG, o000000000.bottomB, 1.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, i);
         GL13.glActiveTexture(33985);
         GL11.glBindTexture(3553, j);
         GL13.glActiveTexture(33986);
         GL11.glBindTexture(3553, k);
         GL30.glBindVertexArray(this.O000000000O0O0);
         this.O000000000000O();
         return true;
      }
   }

   public String O00000000() {
      return this.O000000000OO00;
   }

   public int O000000000() {
      return this.O000000000OO0O;
   }

   public int O0000000000() {
      return this.O000000000OOO;
   }

   private void O00000000000() {
      if (!this.O000000000OO) {
         this.O000000000O0 = O0000O00OO0.O00000000("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/mask.frag");
         this.O000000000O00 = O0000O00OO0.O00000000("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/shadow.frag");
         this.O000000000O000 = O0000O00OO0.O00000000("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/gradient.frag");
         this.O000000000O00O = O0000O00OO0.O00000000("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/glowesp/dominant_color.frag");
         this.O000000000O0O = O0000O00OO0.O00000000("assets/wild/shaders/glowesp/fullscreen.vert", "assets/wild/shaders/blur/blur_downsample.frag");
         this.O000000000O0O0 = GL30.glGenVertexArrays();
         this.O000000000O0OO = GL15.glGenBuffers();
         GL30.glBindVertexArray(this.O000000000O0O0);
         GL15.glBindBuffer(34962, this.O000000000O0OO);
         float[] var1 = new float[]{-1.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 1.0F, 0.0F, -1.0F, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 1.0F, 1.0F};
         GL15.glBufferData(34962, var1, 35044);
         byte var2 = 16;
         GL20.glEnableVertexAttribArray(0);
         GL20.glVertexAttribPointer(0, 2, 5126, false, var2, 0L);
         GL20.glEnableVertexAttribArray(1);
         GL20.glVertexAttribPointer(1, 2, 5126, false, var2, 8L);
         this.O000000000OO = true;
      }
   }

   private boolean O00000000(O0000O0O000O0O.W391 o0000000000, int i, int j) {
      if (o0000000000.O000000000 != 0 && (o0000000000.O0000000000 != i || o0000000000.O00000000000 != j || o0000000000.O00000000 == 0)) {
         this.O000000000(o0000000000);
      }

      if (o0000000000.O000000000 == 0) {
         o0000000000.O000000000 = GL11.glGenTextures();
         GL11.glBindTexture(3553, o0000000000.O000000000);
         GL11.glTexParameteri(3553, 10241, 9729);
         GL11.glTexParameteri(3553, 10240, 9729);
         GL11.glTexParameteri(3553, 10242, 33071);
         GL11.glTexParameteri(3553, 10243, 33071);
         O0000O00O0OOOO.O00000000(32856, i, j, 6408, 5121);
         o0000000000.O00000000 = GL30.glGenFramebuffers();
         GL30.glBindFramebuffer(36160, o0000000000.O00000000);
         GL30.glFramebufferTexture2D(36160, 36064, 3553, o0000000000.O000000000, 0);
         GL11.glDrawBuffer(36064);
         if (GL30.glCheckFramebufferStatus(36160) != 36053) {
            this.O000000000(o0000000000);
            return false;
         }

         o0000000000.O000000000000 = true;
         o0000000000.O0000000000000 = null;
      }

      o0000000000.O0000000000 = i;
      o0000000000.O00000000000 = j;
      return true;
   }

   private void O00000000(O0000O0O000O0O.W391 o0000000000) {
      GL30.glBindFramebuffer(36160, o0000000000.O00000000);
      GL11.glDrawBuffer(36064);
      GL11.glViewport(0, 0, o0000000000.O0000000000, o0000000000.O00000000000);
   }

   private void O00000000(O0000O0O000O0O.W391 o0000000000, O0000O0O000O0O.W389 o00000000) {
      this.O00000000(o0000000000);
      O000000000(o00000000, o0000000000.O0000000000, o0000000000.O00000000000);
      if (o00000000 == null) {
         o0000000000.O000000000000 = true;
         o0000000000.O0000000000000 = null;
      }
   }

   private void O000000000(O0000O0O000O0O.W391 o0000000000, O0000O0O000O0O.W389 o00000000) {
      this.O00000000(o0000000000);
      GL11.glColorMask(true, true, true, true);
      if (o00000000 != null && !o0000000000.O000000000000) {
         O0000O0O000O0O.W389 var3 = o0000000000.O0000000000000;
         if (var3 != null) {
            O000000000(var3, o0000000000.O0000000000, o0000000000.O00000000000);
            this.O000000000000();
         }

         O000000000(o00000000, o0000000000.O0000000000, o0000000000.O00000000000);
         this.O000000000000();
         o0000000000.O0000000000000 = o00000000;
      } else {
         GL11.glDisable(3089);
         this.O000000000000();
         o0000000000.O000000000000 = false;
         o0000000000.O0000000000000 = o00000000;
      }
   }

   private void O000000000000() {
      MemoryStack var1 = MemoryStack.stackPush();

      try {
         FloatBuffer var2 = var1.floats(0.0F, 0.0F, 0.0F, 0.0F);
         GL30.glClearBufferfv(6144, 0, var2);
      } catch (Throwable var5) {
         if (var1 != null) {
            try {
               var1.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var1 != null) {
         var1.close();
      }
   }

   private void O0000000000000() {
      GL11.glDisable(3089);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL11.glDisable(3042);
      GL11.glDisable(36281);
      GL11.glColorMask(true, true, true, true);
      GL11.glDepthMask(false);
      GL30.glBindVertexArray(this.O000000000O0O0);
   }

   private float[] O000000000(int i) {
      if (this.O000000000OOO0 == i) {
         return this.O000000000OOOO;
      } else {
         for (int var2 = 0; var2 < this.O000000000OOOO.length; var2++) {
            this.O000000000OOOO[var2] = 0.0F;
         }

         float var7 = Math.max(i * 0.5F, 0.5F);
         float var3 = 2.0F * var7 * var7;
         float var4 = 0.0F;

         for (int var5 = 0; var5 <= i; var5++) {
            float var6 = (float)Math.exp(-(var5 * var5) / var3);
            this.O000000000OOOO[var5] = var6;
            var4 += var5 == 0 ? var6 : var6 * 2.0F;
         }

         float var8 = var4 > 0.0F ? 1.0F / var4 : 1.0F;

         for (int var9 = 0; var9 <= i; var9++) {
            this.O000000000OOOO[var9] = this.O000000000OOOO[var9] * var8;
         }

         this.O000000000OOO0 = i;
         return this.O000000000OOOO;
      }
   }

   private static int O00000000(float f, int i, int j) {
      return !(f < 8.0F) && i >= 2 && j >= 2 ? 2 : 1;
   }

   private static O0000O0O000O0O.W389 O00000000(O0000O0O000O0O.W389 o00000000, int i, int j) {
      if (o00000000 != null && i > 0 && j > 0) {
         int var3 = Math.max(0, o00000000.x);
         int var4 = Math.max(0, o00000000.y);
         int var5 = Math.min(i, o00000000.x + o00000000.width);
         int var6 = Math.min(j, o00000000.y + o00000000.height);
         int var7 = var5 - var3;
         int var8 = var6 - var4;
         if (var7 > 0 && var8 > 0) {
            long var9 = (long)var7 * var8;
            long var11 = (long)i * j;
            return var9 >= var11 * 9L / 10L ? null : new O0000O0O000O0O.W389(var3, var4, var7, var8);
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static O0000O0O000O0O.W389 O00000000(O0000O0O000O0O.W389 o00000000, int i, int j, int k, int l) {
      if (o00000000 != null && i > 0 && j > 0 && k > 0 && l > 0) {
         float var5 = (float)i / k;
         float var6 = (float)j / l;
         int var7 = (int)Math.floor(o00000000.x * var5);
         int var8 = (int)Math.floor(o00000000.y * var6);
         int var9 = (int)Math.ceil((o00000000.x + o00000000.width) * var5);
         int var10 = (int)Math.ceil((o00000000.y + o00000000.height) * var6);
         return O00000000(new O0000O0O000O0O.W389(var7, var8, var9 - var7, var10 - var8), i, j);
      } else {
         return null;
      }
   }

   private static void O000000000(O0000O0O000O0O.W389 o00000000, int i, int j) {
      if (o00000000 == null) {
         GL11.glDisable(3089);
      } else {
         GL11.glEnable(3089);
         GL11.glScissor(o00000000.x, j - o00000000.y - o00000000.height, o00000000.width, o00000000.height);
      }
   }

   private static void O00000000(O0000O0O000O0O.W389 o00000000, int i, int j, O0000O00O0OOO0.W373 o000000002) {
      O0000O0O000O0O.W389 var4 = O00000000(o00000000, o000000002.O000000000000[2], o000000002.O000000000000[3], i, j);
      if (var4 == null) {
         GL11.glDisable(3089);
      } else {
         GL11.glEnable(3089);
         GL11.glScissor(
            o000000002.O000000000000[0] + var4.x, o000000002.O000000000000[1] + o000000002.O000000000000[3] - var4.y - var4.height, var4.width, var4.height
         );
      }
   }

   private void O000000000000O() {
      O0000O00OO0O.O00000000().O00000000(2);
      GL11.glDrawArrays(5, 0, 4);
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, int i) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1i(var3, i);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f) {
      int var3 = o0000O00OO0.O00000000(string);
      if (var3 >= 0) {
         GL20.glUniform1f(var3, f);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g) {
      int var4 = o0000O00OO0.O00000000(string);
      if (var4 >= 0) {
         GL20.glUniform2f(var4, f, g);
      }
   }

   private static void O00000000(O0000O00OO0 o0000O00OO0, String string, float f, float g, float h, float i) {
      int var6 = o0000O00OO0.O00000000(string);
      if (var6 >= 0) {
         GL20.glUniform4f(var6, f, g, h, i);
      }
   }

   private static boolean O00000000000O() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   private void O000000000(O0000O0O000O0O.W391 o0000000000) {
      if (o0000000000.O00000000 != 0) {
         GL30.glDeleteFramebuffers(o0000000000.O00000000);
      }

      if (o0000000000.O000000000 != 0) {
         GL11.glDeleteTextures(o0000000000.O000000000);
      }

      o0000000000.O00000000 = 0;
      o0000000000.O000000000 = 0;
      o0000000000.O0000000000 = 0;
      o0000000000.O00000000000 = 0;
      o0000000000.O000000000000 = true;
      o0000000000.O0000000000000 = null;
   }

   @Override
   public void close() {
      if (!O00000000000O()) {
         this.O000000000OO = false;
         this.O000000000OO0 = false;
      } else {
         this.O000000000(this.O0000000000O0O);
         this.O000000000(this.O0000000000OO);
         this.O000000000(this.O0000000000OO0);
         this.O000000000(this.O0000000000OOO);
         this.O000000000(this.O000000000O);
         if (this.O000000000O0O0 != 0) {
            GL30.glDeleteVertexArrays(this.O000000000O0O0);
            this.O000000000O0O0 = 0;
         }

         if (this.O000000000O0OO != 0) {
            GL15.glDeleteBuffers(this.O000000000O0OO);
            this.O000000000O0OO = 0;
         }

         if (this.O000000000O0 != null) {
            this.O000000000O0.O000000000();
            this.O000000000O0 = null;
         }

         if (this.O000000000O00 != null) {
            this.O000000000O00.O000000000();
            this.O000000000O00 = null;
         }

         if (this.O000000000O000 != null) {
            this.O000000000O000.O000000000();
            this.O000000000O000 = null;
         }

         if (this.O000000000O00O != null) {
            this.O000000000O00O.O000000000();
            this.O000000000O00O = null;
         }

         if (this.O000000000O0O != null) {
            this.O000000000O0O.O000000000();
            this.O000000000O0O = null;
         }

         this.O000000000OOO0 = -1;
         this.O000000000OO = false;
         this.O000000000OO0 = false;
      }
   }

   public record W389(int x, int y, int width, int height) {
   }

   public record W390(
      float radius,
      float outlineWidth,
      float glowStrength,
      float outlineStrength,
      float opacity,
      int debugView,
      int colorStyle,
      int autoColor,
      float topR,
      float topG,
      float topB,
      float bottomR,
      float bottomG,
      float bottomB
   ) {
   }

   static final class W391 {
      int O00000000;
      int O000000000;
      int O0000000000;
      int O00000000000;
      boolean O000000000000 = true;
      O0000O0O000O0O.W389 O0000000000000;
   }
}

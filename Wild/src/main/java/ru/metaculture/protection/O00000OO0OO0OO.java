package ru.metaculture.protection;

import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;

public final class O00000OO0OO0OO implements AutoCloseable {
   private static final O00000OO0OO0OO O00000000 = new O00000OO0OO0OO();
   private static final int O000000000 = 14;
   private static final String O0000000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final O0000O000OO O00000000000 = O0000O000OO.O00000000();
   private static final String[] O000000000000 = O00000000000O();
   private final O00000OOO000 O0000000000000 = new O00000OOO000();
   private final O00000OOO0 O000000000000O = new O00000OOO0();
   private O00000OOO O00000000000O;
   private O00000OOO000.W289 O00000000000O0;
   private O00000OOO000.W289 O00000000000OO;
   private O00000OOO000.W289 O0000000000O;
   private O00000OOO000.W289 O0000000000O0;
   private long O0000000000O00;
   private long O0000000000O0O;
   private long O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private float O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private boolean O000000000O00O;
   private int O000000000O0O = -6357021;
   private int O000000000O0O0 = -11341636;
   private Theme O000000000O0OO = Theme.AURORA;
   private boolean O000000000OO;
   private boolean O000000000OO0;
   private boolean O000000000OO00;
   private float O000000000OO0O;
   private float O000000000OOO = 1.0F;
   private boolean O000000000OOO0;
   private long O000000000OOOO;

   public static O00000OO0OO0OO O00000000() {
      return O00000000;
   }

   public void O00000000(float f, float g) {
      this.O000000000OO0O = O00000000(f, 0.0F, 1.0F);
      this.O000000000OOO = O00000000(g, 0.0F, 1.0F);
   }

   public boolean O000000000() {
      if (this.O000000000OO00 && this.O000000000000()) {
         this.O000000000OO00 = false;
      }

      return this.O000000000OO00;
   }

   public boolean O00000000(MinecraftClient minecraftClient, int i, int j) {
      return this.O00000000(minecraftClient, i, j, this.O000000000OO0O, this.O000000000OOO);
   }

   public void O0000000000() {
      this.O000000000OOO0 = true;
      this.O000000000OOOO = System.nanoTime() + 650000000L;
   }

   public void O00000000000() {
      if (this.O000000000OOO0 && System.nanoTime() >= this.O000000000OOOO) {
         this.close();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean O00000000(MinecraftClient minecraftClient, int i, int j, float f, float g) {
      if (this.O000000000OO00) {
         if (!this.O000000000000()) {
            return false;
         }

         this.O000000000OO00 = false;
      }

      if (minecraftClient != null && minecraftClient.getWindow() != null) {
         Window var6 = minecraftClient.getWindow();
         if (!var6.hasZeroWidthOrHeight() && var6.getFramebufferWidth() > 0 && var6.getFramebufferHeight() > 0) {
            try {
               long var7 = System.nanoTime();
               if (this.O0000000000O00 == 0L) {
                  this.O0000000000O00 = var7;
                  this.O0000000000O0O = var7;
               }

               float var9 = Math.max(0.001F, Math.min(0.05F, (float)(var7 - this.O0000000000O0O) / 1.0E9F));
               this.O0000000000O0O = var7;
               float var10 = (float)(var7 - this.O0000000000O00) / 1.0E9F;
               f = O00000000(f, 0.0F, 1.0F);
               g = O00000000(g, 0.0F, 1.0F);
               this.O000000000OOO0 = false;
               this.O000000000OOOO = 0L;
               this.O0000000000000();
               this.O00000000(var6, i, j, var9);
               O0000O00O0OOO0.W373 var11 = O0000O00O0OOO0.O00000000();
               boolean var15 = false /* VF: Semaphore variable */;

               try {
                  var15 = true;
                  this.O00000000(var6.getFramebufferWidth(), var6.getFramebufferHeight(), var10, f, g);
                  this.O00000000000(var6.getFramebufferWidth(), var6.getFramebufferHeight(), var10, f, g);
                  var15 = false;
               } finally {
                  if (var15) {
                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     O0000O00O0OOO0.O00000000(var11);
                  }
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var11);
               return true;
            } catch (Throwable var17) {
               this.O000000000OO00 = true;
               this.close();
               return false;
            }
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private boolean O000000000000() {
      if (GLFW.glfwGetCurrentContext() == 0L) {
         return false;
      } else {
         MinecraftClient var1 = MinecraftClient.getInstance();
         if (var1 != null && var1.getWindow() != null) {
            Window var2 = var1.getWindow();
            return !var2.hasZeroWidthOrHeight() && var2.getFramebufferWidth() > 0 && var2.getFramebufferHeight() > 0;
         } else {
            return false;
         }
      }
   }

   private void O00000000(int i, int j, float f, float g, float h) {
      this.O0000000000000.O00000000();
      this.O000000000000O();
      float var6 = 0.92F;
      int var7 = Math.max(420, Math.round(i * var6));
      int var8 = Math.max(240, Math.round(j * var6));
      int var9 = this.O000000000000O.O0000000000();
      int var10 = this.O000000000000O.O00000000000();
      int var11 = O0000O00O0OOO0.O00000000(GL11.glGetInteger(36006));
      this.O000000000000O.O00000000(var7, var8);
      boolean var12 = var9 != this.O000000000000O.O0000000000() || var10 != this.O000000000000O.O00000000000();
      long var13 = System.nanoTime();
      if (var12 || this.O0000000000OO == 0L || var13 - this.O0000000000OO >= 16666667L) {
         this.O000000000(i, j, f, g, h);
         this.O0000000000OO = var13;
      }

      O0000O00O0OOO0.O00000000(36160, var11);
      GL11.glViewport(0, 0, i, j);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      GL11.glDisable(3089);
      GL11.glDisable(36281);
      GL11.glColorMask(true, true, true, true);
      this.O00000000(i, j, f, h);
      this.O0000000000(i, j, f, g, h);
   }

   private void O000000000(int i, int j, float f, float g, float h) {
      if (this.O000000000000O.O000000000000()) {
         this.O000000000000O.O00000000();
         GL11.glDisable(3042);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         O00000OOO000.W289 var6 = this.O000000000O0OO == Theme.SAKURA_BREEZE ? this.O00000000000OO : this.O00000000000O0;
         if (this.O000000000O0OO == Theme.SAKURA_BREEZE) {
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            GL11.glEnable(3042);
            GL14.glBlendFuncSeparate(770, 771, 1, 771);
         }

         var6.O00000000();
         this.O00000000(
            var6,
            (float)this.O000000000000O.O0000000000(),
            (float)this.O000000000000O.O00000000000(),
            0.0F,
            0.0F,
            (float)this.O000000000000O.O0000000000(),
            (float)this.O000000000000O.O00000000000()
         );
         var6.O00000000("uTime", f);
         var6.O00000000("uResolution", this.O000000000000O.O0000000000(), this.O000000000000O.O00000000000());
         var6.O00000000("uMouse", this.O00000000(i), this.O000000000(j));
         var6.O00000000("uMouseVelocity", this.O000000000O00, this.O000000000O000);
         var6.O00000000("uAccentTop", O000000000000(this.O000000000O0O), O0000000000000(this.O000000000O0O), O000000000000O(this.O000000000O0O));
         var6.O00000000("uAccentBottom", O000000000000(this.O000000000O0O0), O0000000000000(this.O000000000O0O0), O000000000000O(this.O000000000O0O0));
         var6.O00000000("uActivity", O00000000(0.36F + g * 0.42F, 0.0F, 1.0F));
         var6.O00000000("uAlpha", h);
         var6.O00000000("uLightMode", this.O000000000OO ? 1.0F : 0.0F);
         this.O00000000(var6);
         this.O00000000000O.O00000000();
      }
   }

   private void O00000000(int i, int j, float f, float g) {
      if (this.O000000000000O.O000000000000()) {
         GL11.glDisable(3042);
         this.O0000000000O.O00000000();
         this.O00000000(this.O0000000000O, (float)i, (float)j, 0.0F, 0.0F, (float)i, (float)j);
         this.O0000000000O.O00000000("uTexture", 0);
         this.O0000000000O.O00000000("uTextureSize", this.O000000000000O.O0000000000(), this.O000000000000O.O00000000000());
         this.O0000000000O.O00000000("uParallax", this.O0000000000(i) * 0.0012F, this.O00000000000(j) * 0.001F);
         this.O0000000000O.O00000000("uTime", f);
         this.O0000000000O.O00000000("uEntry", g);
         this.O0000000000O.O00000000("uClickFlash", 0.0F);
         this.O0000000000O.O00000000("uLightMode", this.O000000000OO ? 1.0F : 0.0F);
         this.O0000000000O.O00000000("uSakura", this.O000000000O0OO == Theme.SAKURA_BREEZE ? 1.0F : 0.0F);
         GL13.glActiveTexture(33984);
         GL11.glBindTexture(3553, this.O000000000000O.O000000000());
         this.O00000000000O.O00000000();
      }
   }

   private void O0000000000(int i, int j, float f, float g, float h) {
      GL11.glEnable(3042);
      if (this.O000000000OO) {
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      } else {
         GL14.glBlendFuncSeparate(770, 1, 1, 1);
      }

      this.O0000000000O0.O00000000();
      this.O00000000(this.O0000000000O0, (float)i, (float)j, 0.0F, 0.0F, (float)i, (float)j);
      this.O0000000000O0.O00000000("uTime", f);
      this.O0000000000O0.O00000000("uResolution", i, j);
      this.O0000000000O0.O00000000("uMouse", this.O00000000(i), this.O000000000(j));
      this.O0000000000O0.O00000000("uParallax", this.O0000000000(i), this.O00000000000(j));
      this.O0000000000O0.O00000000("uAccentTop", O000000000000(this.O000000000O0O), O0000000000000(this.O000000000O0O), O000000000000O(this.O000000000O0O));
      this.O0000000000O0
         .O00000000("uAccentBottom", O000000000000(this.O000000000O0O0), O0000000000000(this.O000000000O0O0), O000000000000O(this.O000000000O0O0));
      this.O0000000000O0.O00000000("uEntry", O00000000(h * (0.55F + g * 0.45F), 0.0F, 1.0F));
      this.O0000000000O0.O00000000("uLightMode", this.O000000000OO ? 1.0F : 0.0F);
      this.O00000000(this.O0000000000O0);
      this.O00000000000O.O00000000();
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000000(int i, int j, float f, float g, float h) {
      if (!(h <= 0.01F)) {
         try {
            WildClient.O000000000000O();
            RenderManager var6 = WildClient.O00000000();
            if (var6 == null) {
               return;
            }

            var6.O00000000(i, j);
            boolean var7 = false;
            boolean var16 = false /* VF: Semaphore variable */;

            try {
               var16 = true;
               float var8 = O000000000(i, j);
               float var9 = i * 0.5F;
               float var10 = j * 0.5F - 58.0F * var8;
               float var11 = O00000000(Math.min(i, j) * 0.112F, 82.0F * var8, 132.0F * var8);
               float var12 = 0.5F + 0.5F * (float)Math.sin(f * 1.08F);
               this.O00000000(var6, var9, var10, var11, var12, h);
               this.O00000000(var6, i, j, g, h, var8, f);
               var6.O000000000();
               var7 = true;
               var16 = false;
            } finally {
               if (var16) {
                  if (!var7) {
                     var6.O00000000();
                  }
               }
            }

            if (!var7) {
               var6.O00000000();
            }
         } catch (Throwable var18) {
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, float f, float g, float h, float i, float j) {
      float var7 = h * 0.98F;
      float var8 = var7 * (1.08F + i * 0.035F);
      float var9 = RenderManager.O00000000(FontRegistry.O00000000000O, "W", var7).O00000000;
      float var10 = RenderManager.O00000000(FontRegistry.O00000000000O, "W", var8).O00000000;
      float var11 = g + h * 0.148F;
      int var12 = this.O000000000OO
         ? (this.O000000000O0OO == Theme.VERNAL_SOLSTICE ? O00000000(0.0196F, 0.0667F, 0.0196F, j) : O00000000(0.1F, 0.1F, 0.1F, j))
         : O00000000(1.0F, 1.0F, 1.0F, j);
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000O, f - var10 * 0.5F, var11 + h * 0.002F, var8, "W", O000000000(this.O000000000O0O0, this.O000000000O0O, i, 0.24F * j)
      );
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, f - var9 * 0.5F, var11, var7, "W", var12);
   }

   private void O00000000(RenderManager o0000O00OO0O0, int i, int j, float f, float g, float h, float k) {
      float var8 = O00000000(i * 0.26F, 292.0F * h, 520.0F * h);
      float var9 = Math.max(8.0F * h, 8.0F);
      float var10 = i * 0.5F - var8 * 0.5F;
      float var11 = j * 0.5F + 92.0F * h;
      float var12 = var9 * 0.5F;
      float var13 = Math.max(var9, var8 * O00000000(f, 0.0F, 1.0F));
      int var14 = this.O000000000OO ? O00000000(0.18F, 0.2F, 0.22F, 0.16F * g) : O00000000(1.0F, 1.0F, 1.0F, 0.105F * g);
      int var15 = this.O000000000OO ? O00000000(0.1F, 0.11F, 0.12F, 0.16F * g) : O00000000(1.0F, 1.0F, 1.0F, 0.15F * g);
      o0000O00OO0O0.O00000000(var10, var11, var8, var9, var12, 18.0F * h, 0.9F, O00000000(this.O000000000O0O0, Math.round(70.0F * g)));
      o0000O00OO0O0.O00000000(var10, var11, var8, var9, var12, var14);
      o0000O00OO0O0.O00000000(
         var10, var11, var13, var9, var12, O000000000(this.O000000000O0O0, this.O000000000O0O, 0.5F + 0.5F * (float)Math.sin(k * 1.15F), 0.86F * g)
      );
      float var16 = Math.max(46.0F * h, var8 * 0.18F);
      float var17 = var10 + (var8 + var16) * O00000000(f, 0.0F, 1.0F) - var16;
      float var18 = Math.max(var10, var17);
      float var19 = Math.min(var10 + var13, var17 + var16) - var18;
      if (var19 > 0.5F) {
         o0000O00OO0O0.O00000000(var18, var11 + var9 * 0.16F, var19, var9 * 0.25F, var9 * 0.125F, O00000000(1.0F, 1.0F, 1.0F, 0.2F * g));
      }

      o0000O00OO0O0.O00000000(var10, var11, var8, 1.0F * h, var12, var15);
      String var20 = Math.round(O00000000(f, 0.0F, 1.0F) * 100.0F) + "%";
      float var21 = 25.0F * h;
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000,
         i * 0.5F,
         var11 + 30.0F * h,
         var21,
         var20,
         this.O000000000OO ? O00000000(0.12F, 0.13F, 0.14F, 0.52F * g) : O00000000(0.88F, 0.92F, 0.96F, 0.54F * g),
         "c"
      );
   }

   private void O0000000000000() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O000000000O0OO = var1;
      O0000O000OO.W351 var2 = O00000000000.O000000000(var1);
      if (var2 != null) {
         this.O000000000O0O = var2.O0000000000();
         this.O000000000O0O0 = var2.O00000000000();
         this.O000000000OO = false;
      } else {
         this.O000000000OO = false;
         Color var3 = var1.O00000000();
         this.O000000000O0O = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O000000000O0O0 = 0xFF000000
            | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private void O00000000(Window window, int i, int j, float f) {
      float var5 = (float)(i * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
      float var6 = (float)(j * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
      if (!this.O000000000O00O) {
         this.O0000000000OO0 = this.O000000000O = var5;
         this.O0000000000OOO = this.O000000000O0 = var6;
         this.O000000000O00 = 0.0F;
         this.O000000000O000 = 0.0F;
         this.O000000000O00O = true;
      } else {
         this.O0000000000OO0 = var5;
         this.O0000000000OOO = var6;
         float var7 = this.O000000000O;
         float var8 = this.O000000000O0;
         float var9 = O0000000000(this.O0000000000OO0 - this.O000000000O, this.O0000000000OOO - this.O000000000O0);
         float var10 = (1.0F - (float)Math.pow(3.5E-5F, f)) * (0.72F + O00000000(var9 / 520.0F, 0.0F, 0.42F));
         this.O000000000O = this.O000000000O + (this.O0000000000OO0 - this.O000000000O) * O00000000(var10, 0.05F, 0.26F);
         this.O000000000O0 = this.O000000000O0 + (this.O0000000000OOO - this.O000000000O0) * O00000000(var10, 0.05F, 0.26F);
         float var11 = O00000000((this.O000000000O - var7) / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -1.8F, 1.8F);
         float var12 = O00000000((this.O000000000O0 - var8) / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -1.8F, 1.8F);
         float var13 = 1.0F - (float)Math.pow(0.0025F, f);
         this.O000000000O00 = this.O000000000O00 + (var11 - this.O000000000O00) * var13;
         this.O000000000O000 = this.O000000000O000 + (var12 - this.O000000000O000) * var13;
      }
   }

   private float O00000000(int i) {
      return this.O000000000O / Math.max(1.0F, (float)i);
   }

   private float O000000000(int i) {
      return this.O000000000O0 / Math.max(1.0F, (float)i);
   }

   private float O0000000000(int i) {
      return (this.O00000000(i) - 0.5F) * 10.0F;
   }

   private float O00000000000(int i) {
      return (this.O000000000(i) - 0.5F) * 8.0F;
   }

   private void O000000000000O() {
      if (!this.O000000000OO0) {
         this.O00000000000O = new O00000OOO();
         this.O00000000000O0 = this.O0000000000000
            .O00000000("loading_liquid_neon_gas", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_aurora.frag");
         this.O00000000000OO = this.O0000000000000
            .O00000000("loading_sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         this.O0000000000O = this.O0000000000000
            .O00000000("loading_composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.O0000000000O0 = this.O0000000000000
            .O00000000("loading_particles", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_particles.frag");
         this.O000000000OO0 = true;
      }
   }

   private void O00000000(O00000OOO000.W289 o00000000, float f, float g, float h, float i, float j, float k) {
      o00000000.O00000000("uViewport", f, g);
      o00000000.O00000000("uRect", h, i, j, k);
   }

   private void O00000000(O00000OOO000.W289 o00000000) {
      for (int var2 = 0; var2 < 14; var2++) {
         o00000000.O00000000(O000000000000[var2], 0.0F, 0.0F, 100.0F, 0.0F);
      }
   }

   private static String[] O00000000000O() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }

   @Override
   public void close() {
      this.O000000000000O.close();
      if (this.O00000000000O != null) {
         this.O00000000000O.close();
         this.O00000000000O = null;
      }

      this.O0000000000000.close();
      this.O000000000OO0 = false;
      this.O000000000OO0O = 0.0F;
      this.O000000000OOO = 1.0F;
      this.O000000000OOO0 = false;
      this.O000000000OOOO = 0L;
      this.O0000000000O00 = 0L;
      this.O0000000000O0O = 0L;
      this.O0000000000OO = 0L;
      this.O0000000000OO0 = 0.0F;
      this.O0000000000OOO = 0.0F;
      this.O000000000O = 0.0F;
      this.O000000000O0 = 0.0F;
      this.O000000000O00 = 0.0F;
      this.O000000000O000 = 0.0F;
      this.O000000000O00O = false;
   }

   private static float O000000000(float f, float g) {
      return O00000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.16F, 0.72F, 1.38F);
   }

   private static float O0000000000(float f, float g) {
      return (float)Math.sqrt(f * f + g * g);
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static float O000000000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O0000000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O000000000000O(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static int O00000000(float f, float g, float h, float i) {
      int var4 = Math.round(O00000000(f, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(O00000000(g, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(O00000000(h, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(O00000000(i, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int O00000000(int i, int j) {
      int var2 = Math.max(0, Math.min(255, j));
      return i & 16777215 | var2 << 24;
   }

   private static int O000000000(int i, int j, float f, float g) {
      float var4 = O00000000(f, 0.0F, 1.0F);
      int var5 = O0000O000OO000.O00000000000(i, j, var4);
      int var6 = Math.round(O00000000(g, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }
}

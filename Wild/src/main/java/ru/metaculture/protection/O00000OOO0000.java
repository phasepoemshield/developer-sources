package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.awt.Color;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.Window;
import net.minecraft.server.WorldGenerationProgressTracker;
import net.minecraft.text.Text;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OOO0000 implements AutoCloseable {
   private static final O00000OOO0000 O00000000 = new O00000OOO0000();
   private static final String O000000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final O0000O000OO O0000000000 = O0000O000OO.O00000000();
   private static final String[] O00000000000 = O00000000000();
   private final O00000OOO000 O000000000000 = new O00000OOO000();
   private final O00000OOO0 O0000000000000 = new O00000OOO0();
   private O00000OOO O000000000000O;
   private O00000OOO000.W289 O00000000000O;
   private O00000OOO000.W289 O00000000000O0;
   private O00000OOO000.W289 O00000000000OO;
   private O00000OOO000.W289 O0000000000O;
   private O00000OOO000.W289 O0000000000O0;
   private O00000OOO000.W289 O0000000000O00;
   private long O0000000000O0O;
   private long O0000000000OO;
   private long O0000000000OO0;
   private float O0000000000OOO;
   private float O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private boolean O000000000O0O;
   private boolean O000000000O0O0;
   private int O000000000O0OO;
   private static final int O000000000OO = 4;
   private int O000000000OO0 = -6357021;
   private int O000000000OO00 = -11341636;
   private Theme O000000000OO0O = Theme.AURORA;
   private boolean O000000000OOO;

   public static O00000OOO0000 O00000000() {
      return O00000000;
   }

   public boolean O00000000(MinecraftClient minecraftClient, int i, int j, float f) {
      return this.O00000000(minecraftClient, i, j, f, null);
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public boolean O00000000(MinecraftClient minecraftClient, int i, int j, float f, Screen screen) {
      O00000OO0OOOOO.W288 var6 = O00000OO0OOOOO.O00000000(minecraftClient, 1, 1);
      if (var6 == null) {
         O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", false, "invalid frame metrics");
         return false;
      } else if (GLFW.glfwGetCurrentContext() == 0L) {
         O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", false, "no gl context");
         return false;
      } else {
         Window var7 = minecraftClient.getWindow();
         if (var7 == null) {
            O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", false, "window missing");
            return false;
         } else {
            long var8 = System.nanoTime();
            if (this.O0000000000O0O == 0L) {
               this.O0000000000O0O = var8;
               this.O0000000000OO = var8;
            }

            float var10 = Math.max(0.001F, Math.min(0.05F, (float)(var8 - this.O0000000000OO) / 1.0E9F));
            this.O0000000000OO = var8;
            float var11 = (float)(var8 - this.O0000000000O0O) / 1.0E9F;
            this.O0000000000();
            this.O00000000(var7, i, j, var10);
            O0000O00O0OOO0.W373 var12 = O0000O00O0OOO0.O00000000();
            boolean var26 = false /* VF: Semaphore variable */;

            boolean var30;
            label121: {
               boolean var31;
               label120: {
                  label119: {
                     int var14;
                     try {
                        var26 = true;
                        this.O000000000000.O00000000();
                        this.O000000000();
                        int var13 = var6.width();
                        var14 = var6.height();
                        int var15 = O0000O00O0OOO0.O00000000(GL11.glGetInteger(36006));
                        int var16 = Math.max(420, Math.round(var13 * 0.88F));
                        int var17 = Math.max(240, Math.round(var14 * 0.88F));
                        int var18 = this.O0000000000000.O0000000000();
                        int var19 = this.O0000000000000.O00000000000();
                        this.O0000000000000.O00000000(var16, var17);
                        if (!this.O0000000000000.O000000000000()) {
                           O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", false, "gas target not ready");
                           var30 = false;
                           var26 = false;
                           break label121;
                        }

                        var30 = var18 != this.O0000000000000.O0000000000() || var19 != this.O0000000000000.O00000000000();
                        if (var30 || this.O0000000000OO0 == 0L || var8 - this.O0000000000OO0 >= 25000000L) {
                           this.O00000000(var11);
                           this.O0000000000OO0 = var8;
                        }

                        O0000O00O0OOO0.O00000000(36160, var15);
                        int var21 = GL30.glCheckFramebufferStatus(36009);
                        if (var21 != 36053) {
                           O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", false, "draw framebuffer incomplete status=0x" + Integer.toHexString(var21));
                           var31 = false;
                           var26 = false;
                           break label120;
                        }

                        GL11.glViewport(0, 0, var13, var14);
                        GL11.glDisable(2929);
                        GL11.glDisable(2884);
                        GL11.glDisable(3089);
                        GL11.glDisable(36281);
                        GL11.glColorMask(true, true, true, true);
                        this.O00000000(var13, var14, var11, O00000000(f, 0.0F, 1.0F));
                        this.O000000000(var13, var14, var11, O00000000(f, 0.0F, 1.0F));
                        this.O000000000O0OO = 0;
                        O0000O00OO0OO.O00000000(screen, "WildScreenBackdrop", true, "size=" + var13 + "x" + var14);
                        var31 = true;
                        var26 = false;
                        break label119;
                     } catch (Throwable var27) {
                        this.O000000000O0OO++;
                        O0000O00OO0OO.O00000000("WildScreenBackdrop", screen, "renderBackdrop failed (" + this.O000000000O0OO + "/4)", var27);
                        if (this.O000000000O0OO >= 4) {
                           this.O000000000O0OO = 0;
                           this.close();
                        }

                        var14 = 0;
                        var26 = false;
                     } finally {
                        if (var26) {
                           GL13.glActiveTexture(33984);
                           GL11.glBindTexture(3553, 0);
                           GL20.glUseProgram(0);
                           O0000O00O0OOO0.O00000000(var12);
                        }
                     }

                     GL13.glActiveTexture(33984);
                     GL11.glBindTexture(3553, 0);
                     GL20.glUseProgram(0);
                     O0000O00O0OOO0.O00000000(var12);
                     return var14 != 0;
                  }

                  GL13.glActiveTexture(33984);
                  GL11.glBindTexture(3553, 0);
                  GL20.glUseProgram(0);
                  O0000O00O0OOO0.O00000000(var12);
                  return var31;
               }

               GL13.glActiveTexture(33984);
               GL11.glBindTexture(3553, 0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var12);
               return var31;
            }

            GL13.glActiveTexture(33984);
            GL11.glBindTexture(3553, 0);
            GL20.glUseProgram(0);
            O0000O00O0OOO0.O00000000(var12);
            return var30;
         }
      }
   }

   public void O00000000(MinecraftClient minecraftClient, Text text) {
      O00000OO0OOOOO.W288 var3 = O00000OO0OOOOO.O00000000(minecraftClient, 1, 1);
      if (var3 != null) {
         this.O00000000(var3.width(), var3.height(), text == null ? "Connecting" : text.getString(), -1.0F);
      }
   }

   public void O00000000(MinecraftClient minecraftClient, WorldGenerationProgressTracker worldGenerationProgressTracker) {
      O00000OO0OOOOO.W288 var3 = O00000OO0OOOOO.O00000000(minecraftClient, 1, 1);
      if (var3 != null && worldGenerationProgressTracker != null) {
         float var4 = O00000000(worldGenerationProgressTracker.getProgressPercentage() / 100.0F, 0.0F, 1.0F);
         this.O00000000(var3.width(), var3.height(), Math.round(var4 * 100.0F) + "%", var4);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void O00000000(int i, int j, String string, float f) {
      try {
         WildClient.O000000000000O();
         RenderManager var5 = WildClient.O00000000();
         if (var5 == null) {
            return;
         }

         var5.O00000000(i, j);
         boolean var6 = false;
         boolean var28 = false /* VF: Semaphore variable */;

         try {
            var28 = true;
            float var7 = O00000000((float)i, (float)j);
            float var8 = O00000000(i * 0.3F, 320.0F * var7, 560.0F * var7);
            float var9 = Math.max(8.0F * var7, 8.0F);
            float var10 = i * 0.5F - var8 * 0.5F;
            float var11 = j * 0.5F + 42.0F * var7;
            float var12 = var9 * 0.5F;
            float var13 = 0.5F + 0.5F * (float)Math.sin((float)(System.nanoTime() - Math.max(1L, this.O0000000000O0O)) / 1.0E9F * 1.2F);
            float var14 = f >= 0.0F ? f : 0.18F + 0.64F * var13;
            float var15 = Math.max(var9, var8 * O00000000(var14, 0.0F, 1.0F));
            int var16 = this.O000000000OOO ? O00000000(0.12F, 0.13F, 0.15F, 0.18F) : O00000000(1.0F, 1.0F, 1.0F, 0.105F);
            int var17 = this.O000000000OOO ? O00000000(0.07F, 0.08F, 0.09F, 0.88F) : O00000000(0.94F, 0.97F, 1.0F, 0.9F);
            int var18 = this.O000000000OOO ? O00000000(0.22F, 0.23F, 0.24F, 0.48F) : O00000000(0.66F, 0.72F, 0.8F, 0.48F);
            var5.O00000000(var10, var11, var8, var9, var12, 18.0F * var7, 0.9F, O00000000(this.O000000000OO00, 78));
            var5.O00000000(var10, var11, var8, var9, var12, var16);
            var5.O00000000(var10, var11, var15, var9, var12, O0000000000(this.O000000000OO00, this.O000000000OO0, var13, 0.88F));
            float var19 = 25.0F * var7;
            float var20 = RenderManager.O00000000(FontRegistry.O00000000000, string, var19).O00000000;
            float var21 = var11 - 22.0F * var7;
            var5.O00000000(FontRegistry.O00000000000, i * 0.5F - var20 * 0.5F, var21, var19, string, var17);
            if (f >= 0.0F) {
               String var22 = "Loading world";
               float var23 = 14.0F * var7;
               float var24 = RenderManager.O00000000(FontRegistry.O00000000, var22, var23).O00000000;
               var5.O00000000(FontRegistry.O00000000, i * 0.5F - var24 * 0.5F, var11 + 34.0F * var7, var23, var22, var18);
            }

            var5.O000000000();
            var6 = true;
            var28 = false;
         } finally {
            if (var28) {
               if (!var6) {
                  var5.O00000000();
               }
            }
         }

         if (!var6) {
            var5.O00000000();
         }
      } catch (Throwable var30) {
      }
   }

   private void O00000000(float f) {
      this.O0000000000000.O00000000();
      GL11.glDisable(3042);
      GL11.glDisable(2929);
      GL11.glDisable(2884);
      O00000OOO000.W289 var2 = this.O000000000OO0O == Theme.MIDNIGHT_AZURE
         ? this.O0000000000O
         : (
            this.O000000000OO0O == Theme.VERNAL_SOLSTICE
               ? this.O00000000000OO
               : (this.O000000000OO0O == Theme.SAKURA_BREEZE ? this.O00000000000O0 : this.O00000000000O)
         );
      if (this.O000000000OO0O == Theme.SAKURA_BREEZE || this.O000000000OO0O == Theme.VERNAL_SOLSTICE || this.O000000000OO0O == Theme.MIDNIGHT_AZURE) {
         GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
         GL11.glClear(16384);
         GlStateManager._enableBlend();
         GlStateManager._blendFuncSeparate(770, 771, 1, 771);
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      }

      var2.O00000000();
      this.O00000000(
         var2,
         this.O0000000000000.O0000000000(),
         this.O0000000000000.O00000000000(),
         0.0F,
         0.0F,
         this.O0000000000000.O0000000000(),
         this.O0000000000000.O00000000000()
      );
      var2.O00000000("uTime", f);
      var2.O00000000("uResolution", this.O0000000000000.O0000000000(), this.O0000000000000.O00000000000());
      var2.O00000000(
         "uMouse",
         this.O000000000O0 / Math.max(1.0F, (float)this.O0000000000000.O0000000000()),
         this.O000000000O00 / Math.max(1.0F, (float)this.O0000000000000.O00000000000())
      );
      var2.O00000000("uMouseVelocity", this.O000000000O000, this.O000000000O00O);
      var2.O00000000("uAccentTop", O00000000(this.O000000000OO0), O000000000(this.O000000000OO0), O0000000000(this.O000000000OO0));
      var2.O00000000("uAccentBottom", O00000000(this.O000000000OO00), O000000000(this.O000000000OO00), O0000000000(this.O000000000OO00));
      var2.O00000000("uActivity", 0.54F);
      var2.O00000000("uAlpha", 1.0F);
      var2.O00000000("uLightMode", this.O000000000OOO ? 1.0F : 0.0F);

      for (int var3 = 0; var3 < 14; var3++) {
         var2.O00000000(O00000000000[var3], 0.0F, 0.0F, 100.0F, 0.0F);
      }

      this.O000000000000O.O00000000();
   }

   private void O00000000(int i, int j, float f, float g) {
      GL11.glDisable(3042);
      this.O0000000000O0.O00000000();
      this.O00000000(this.O0000000000O0, i, j, 0.0F, 0.0F, i, j);
      this.O0000000000O0.O00000000("uTexture", 0);
      this.O0000000000O0.O00000000("uTextureSize", this.O0000000000000.O0000000000(), this.O0000000000000.O00000000000());
      this.O0000000000O0
         .O00000000("uParallax", (this.O000000000O0 / Math.max(1.0F, (float)i) - 0.5F) * 0.01F, (this.O000000000O00 / Math.max(1.0F, (float)j) - 0.5F) * 0.008F);
      this.O0000000000O0.O00000000("uTime", f);
      this.O0000000000O0.O00000000("uEntry", g);
      this.O0000000000O0.O00000000("uClickFlash", 0.0F);
      this.O0000000000O0.O00000000("uLightMode", this.O000000000OOO ? 1.0F : 0.0F);
      this.O0000000000O0.O00000000("uSakura", this.O000000000OO0O == Theme.SAKURA_BREEZE ? 1.0F : 0.0F);
      this.O0000000000O0.O00000000("uVernal", this.O000000000OO0O == Theme.VERNAL_SOLSTICE ? 1.0F : 0.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.O0000000000000.O000000000());
      this.O000000000000O.O00000000();
   }

   private void O000000000(int i, int j, float f, float g) {
      GL11.glEnable(3042);
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
      this.O0000000000O00.O00000000();
      this.O00000000(this.O0000000000O00, i, j, 0.0F, 0.0F, i, j);
      this.O0000000000O00.O00000000("uBackground", 0);
      this.O0000000000O00.O00000000("uTextureSize", this.O0000000000000.O0000000000(), this.O0000000000000.O00000000000());
      this.O0000000000O00.O00000000("uTime", f);
      this.O0000000000O00.O00000000("uAlpha", g);
      this.O0000000000O00.O00000000("uAccentTop", O00000000(this.O000000000OO0), O000000000(this.O000000000OO0), O0000000000(this.O000000000OO0));
      this.O0000000000O00.O00000000("uAccentBottom", O00000000(this.O000000000OO00), O000000000(this.O000000000OO00), O0000000000(this.O000000000OO00));
      this.O0000000000O00.O00000000("uLightMode", this.O000000000OOO ? 1.0F : 0.0F);
      GL13.glActiveTexture(33984);
      GL11.glBindTexture(3553, this.O0000000000000.O000000000());
      this.O000000000000O.O00000000();
   }

   private void O000000000() {
      if (!this.O000000000O0O0) {
         this.O000000000000O = new O00000OOO();
         this.O00000000000O = this.O000000000000
            .O00000000("screen_liquid_neon_gas", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_aurora.frag");
         this.O00000000000O0 = this.O000000000000
            .O00000000("screen_sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         this.O00000000000OO = this.O000000000000
            .O00000000("screen_vernal_solstice", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/vernal_solstice.frag");
         this.O0000000000O = this.O000000000000
            .O00000000("screen_midnight_azure", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/midnight_azure.frag");
         this.O0000000000O0 = this.O000000000000
            .O00000000("screen_composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.O0000000000O00 = this.O000000000000
            .O00000000("screen_mica_wash", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_mica_wash.frag");
         this.O000000000O0O0 = true;
      }
   }

   private void O00000000(O00000OOO000.W289 o00000000, float f, float g, float h, float i, float j, float k) {
      o00000000.O00000000("uViewport", f, g);
      o00000000.O00000000("uRect", h, i, j, k);
   }

   private void O0000000000() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O000000000OO0O = var1;
      O0000O000OO.W351 var2 = O0000000000.O000000000(var1);
      if (var2 != null) {
         this.O000000000OO0 = var2.O0000000000();
         this.O000000000OO00 = var2.O00000000000();
         this.O000000000OOO = var2.O000000000000();
      } else {
         this.O000000000OOO = false;
         Color var3 = var1.O00000000();
         this.O000000000OO0 = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O000000000OO00 = 0xFF000000
            | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private void O00000000(Window window, int i, int j, float f) {
      float var5 = (float)(i * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
      float var6 = (float)(j * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
      if (!this.O000000000O0O) {
         this.O0000000000OOO = this.O000000000O0 = var5;
         this.O000000000O = this.O000000000O00 = var6;
         this.O000000000O000 = 0.0F;
         this.O000000000O00O = 0.0F;
         this.O000000000O0O = true;
      } else {
         this.O0000000000OOO = var5;
         this.O000000000O = var6;
         float var7 = this.O000000000O0;
         float var8 = this.O000000000O00;
         float var9 = O000000000(this.O0000000000OOO - this.O000000000O0, this.O000000000O - this.O000000000O00);
         float var10 = (1.0F - (float)Math.pow(3.5E-5F, f)) * (0.72F + O00000000(var9 / 520.0F, 0.0F, 0.42F));
         this.O000000000O0 = this.O000000000O0 + (this.O0000000000OOO - this.O000000000O0) * O00000000(var10, 0.05F, 0.26F);
         this.O000000000O00 = this.O000000000O00 + (this.O000000000O - this.O000000000O00) * O00000000(var10, 0.05F, 0.26F);
         float var11 = O00000000((this.O000000000O0 - var7) / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -1.8F, 1.8F);
         float var12 = O00000000((this.O000000000O00 - var8) / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -1.8F, 1.8F);
         float var13 = 1.0F - (float)Math.pow(0.0025F, f);
         this.O000000000O000 = this.O000000000O000 + (var11 - this.O000000000O000) * var13;
         this.O000000000O00O = this.O000000000O00O + (var12 - this.O000000000O00O) * var13;
      }
   }

   @Override
   public void close() {
      this.O0000000000000.close();
      if (this.O000000000000O != null) {
         this.O000000000000O.close();
         this.O000000000000O = null;
      }

      this.O000000000000.close();
      this.O00000000000O = null;
      this.O00000000000O0 = null;
      this.O00000000000OO = null;
      this.O0000000000O = null;
      this.O0000000000O0 = null;
      this.O0000000000O00 = null;
      this.O000000000O0O0 = false;
      this.O0000000000OO0 = 0L;
      this.O0000000000OO = 0L;
      this.O0000000000O0O = 0L;
      this.O000000000O0O = false;
   }

   private static float O00000000(float f, float g) {
      return O00000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.16F, 0.72F, 1.38F);
   }

   private static float O000000000(float f, float g) {
      return (float)Math.sqrt(f * f + g * g);
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static float O00000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
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

   private static int O0000000000(int i, int j, float f, float g) {
      float var4 = O00000000(f, 0.0F, 1.0F);
      int var5 = O0000O000OO000.O00000000000(i, j, var4);
      int var6 = Math.round(O00000000(g, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   private static String[] O00000000000() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }
}

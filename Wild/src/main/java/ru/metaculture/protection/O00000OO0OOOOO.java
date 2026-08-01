package ru.metaculture.protection;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.util.Window;
import org.lwjgl.glfw.GLFW;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL13;
import org.lwjgl.opengl.GL14;
import org.lwjgl.opengl.GL20;
import org.lwjgl.opengl.GL30;

public final class O00000OO0OOOOO implements AutoCloseable {
   public static final int O00000000 = 14;
   private static final String O000000000 = "assets/wild/shaders/mainmenu/menu_quad.vert";
   private static final String[] O0000000000 = O000000000000();
   private final O00000OOO000 O00000000000 = new O00000OOO000();
   private final O00000OOO0 O000000000000 = new O00000OOO0();
   private O00000OOO O0000000000000;
   private O00000OOO000.W289 O000000000000O;
   private O00000OOO000.W289 O00000000000O;
   private O00000OOO000.W289 O00000000000O0;
   private O00000OOO000.W289 O00000000000OO;
   private O00000OOO000.W289 O0000000000O;
   private O00000OOO000.W289 O0000000000O0;
   private O00000OOO000.W289 O0000000000O00;
   private O00000OOO000.W289 O0000000000O0O;
   private O00000OOO000.W289 O0000000000OO;
   private long O0000000000OO0;
   private long O0000000000OOO;
   private float O000000000O;
   private boolean O000000000O0;
   private int O000000000O00 = -1;
   private int O000000000O000 = -1;

   public boolean O00000000(MainMenuScreen.W281 o000000000O) {
      if (o000000000O != null && o000000000O.framebufferWidth() > 0 && o000000000O.framebufferHeight() > 0) {
         O00000OO0OOOOO.W288 var2 = O00000000(MinecraftClient.getInstance(), o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
         if (var2 != null && var2.width() == o000000000O.framebufferWidth() && var2.height() == o000000000O.framebufferHeight()) {
            O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();
            boolean var4 = false;

            boolean var15;
            try {
               this.O00000000000();
               this.O0000000000();
               int var5 = Math.max(420, Math.round(o000000000O.framebufferWidth() * o000000000O.backgroundScale()));
               int var6 = Math.max(240, Math.round(o000000000O.framebufferHeight() * o000000000O.backgroundScale()));
               int var7 = this.O000000000000.O0000000000();
               int var8 = this.O000000000000.O00000000000();
               this.O000000000000.O00000000(var5, var6);
               boolean var9 = var7 != this.O000000000000.O0000000000() || var8 != this.O000000000000.O00000000000();
               boolean var10 = o000000000O.activeMotion() > 0.025F;
               long var11 = System.nanoTime();
               float var13 = var10 ? 0.0125F : 0.041666668F;
               if (var9 || this.O0000000000OO0 == 0L || (float)(var11 - this.O0000000000OO0) >= var13 * 1.0E9F) {
                  this.O000000000(o000000000O);
                  this.O0000000000OO0 = var11;
               }

               GL30.glBindFramebuffer(36160, o000000000O.drawFramebuffer());
               int var14 = GL30.glCheckFramebufferStatus(36009);
               if (var14 == 36053) {
                  GL11.glViewport(0, 0, o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
                  GL11.glDisable(2929);
                  GL11.glDisable(2884);
                  GL11.glDisable(3089);
                  GL11.glDisable(36281);
                  GL11.glColorMask(true, true, true, true);
                  this.O0000000000(o000000000O);
                  this.O00000000000(o000000000O);
                  this.O000000000000(o000000000O);
                  this.O0000000000000(o000000000O);
                  this.O000000000000O(o000000000O);
                  return this.O000000000000.O000000000000();
               }

               O0000O00OO0OO.O00000000("MainMenuRenderer", null, "draw framebuffer incomplete status=0x" + Integer.toHexString(var14), null);
               var15 = false;
            } finally {
               this.O00000000(0);
               GL20.glUseProgram(0);
               O0000O00O0OOO0.O00000000(var3);
            }

            return var15;
         } else {
            O0000O00OO0OO.O00000000(
               "MainMenuRenderer", null, "frame metrics mismatch requested=" + o000000000O.framebufferWidth() + "x" + o000000000O.framebufferHeight(), null
            );
            return false;
         }
      } else {
         O0000O00OO0OO.O00000000("MainMenuRenderer", null, "invalid state dimensions", null);
         return false;
      }
   }

   private void O000000000(MainMenuScreen.W281 o000000000O) {
      if (this.O000000000000.O000000000000()) {
         this.O000000000000.O00000000();
         GL11.glDisable(3042);
         GL11.glDisable(2929);
         GL11.glDisable(2884);
         O00000OOO000.W289 var2 = o000000000O.midnightAzure()
            ? this.O00000000000OO
            : (o000000000O.vernalSolstice() ? this.O00000000000O0 : (o000000000O.sakuraBreeze() ? this.O00000000000O : this.O000000000000O));
         if (o000000000O.sakuraBreeze() || o000000000O.vernalSolstice() || o000000000O.midnightAzure()) {
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
            this.O000000000000.O0000000000(),
            this.O000000000000.O00000000000(),
            0.0F,
            0.0F,
            this.O000000000000.O0000000000(),
            this.O000000000000.O00000000000()
         );
         var2.O00000000("uTime", o000000000O.time() * O000000000());
         var2.O00000000("uResolution", this.O000000000000.O0000000000(), this.O000000000000.O00000000000());
         var2.O00000000("uMouse", o000000000O.mouseNormX(), o000000000O.mouseNormY());
         var2.O00000000("uMouseVelocity", o000000000O.mouseVelocityX(), o000000000O.mouseVelocityY());
         var2.O00000000("uAccentTop", o000000000O.accentTopR(), o000000000O.accentTopG(), o000000000O.accentTopB());
         var2.O00000000("uAccentBottom", o000000000O.accentBottomR(), o000000000O.accentBottomG(), o000000000O.accentBottomB());
         var2.O00000000("uActivity", o000000000O.activeMotion());
         var2.O00000000("uAlpha", 1.0F);
         var2.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
         this.O00000000(var2, o000000000O);
         this.O0000000000000.O00000000();
      }
   }

   private void O0000000000(MainMenuScreen.W281 o000000000O) {
      if (this.O000000000000.O000000000000()) {
         GL11.glDisable(3042);
         this.O0000000000O.O00000000();
         this.O00000000(
            this.O0000000000O,
            o000000000O.framebufferWidth(),
            o000000000O.framebufferHeight(),
            0.0F,
            0.0F,
            o000000000O.framebufferWidth(),
            o000000000O.framebufferHeight()
         );
         this.O0000000000O.O00000000("uTexture", 0);
         this.O0000000000O.O00000000("uTextureSize", this.O000000000000.O0000000000(), this.O000000000000.O00000000000());
         this.O0000000000O.O00000000("uParallax", o000000000O.backgroundParallaxX(), o000000000O.backgroundParallaxY());
         this.O0000000000O.O00000000("uTime", o000000000O.time() * O000000000());
         this.O0000000000O.O00000000("uEntry", o000000000O.sceneEntry());
         this.O0000000000O.O00000000("uClickFlash", o000000000O.clickFlash());
         this.O0000000000O.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
         this.O0000000000O.O00000000("uSakura", o000000000O.sakuraBreeze() ? 1.0F : 0.0F);
         this.O0000000000O.O00000000("uVernal", o000000000O.vernalSolstice() ? 1.0F : 0.0F);
         this.O00000000(this.O000000000000.O000000000());
         this.O0000000000000.O00000000();
      }
   }

   private void O00000000000(MainMenuScreen.W281 o000000000O) {
      GL11.glEnable(3042);
      if (o000000000O.lightMode()) {
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
      } else {
         GL14.glBlendFuncSeparate(770, 1, 1, 1);
      }

      this.O0000000000O0.O00000000();
      this.O00000000(
         this.O0000000000O0,
         o000000000O.framebufferWidth(),
         o000000000O.framebufferHeight(),
         0.0F,
         0.0F,
         o000000000O.framebufferWidth(),
         o000000000O.framebufferHeight()
      );
      this.O0000000000O0.O00000000("uTime", o000000000O.time() * O000000000());
      this.O0000000000O0.O00000000("uResolution", o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
      this.O0000000000O0.O00000000("uMouse", o000000000O.mouseNormX(), o000000000O.mouseNormY());
      this.O0000000000O0.O00000000("uParallax", o000000000O.particleParallaxX(), o000000000O.particleParallaxY());
      this.O0000000000O0.O00000000("uAccentTop", o000000000O.accentTopR(), o000000000O.accentTopG(), o000000000O.accentTopB());
      this.O0000000000O0.O00000000("uAccentBottom", o000000000O.accentBottomR(), o000000000O.accentBottomG(), o000000000O.accentBottomB());
      this.O0000000000O0.O00000000("uEntry", o000000000O.sceneEntry());
      this.O0000000000O0.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
      this.O00000000(this.O0000000000O0, o000000000O);
      this.O0000000000000.O00000000();
      GL14.glBlendFuncSeparate(770, 771, 1, 771);
   }

   private void O000000000000(MainMenuScreen.W281 o000000000O) {
      MainMenuScreen.W271 var2 = o000000000O.logo();
      if (!(var2.width() <= 0.0F) && !(var2.height() <= 0.0F)) {
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.O0000000000O00.O00000000();
         this.O00000000(this.O0000000000O00, o000000000O.framebufferWidth(), o000000000O.framebufferHeight(), var2.x(), var2.y(), var2.width(), var2.height());
         this.O0000000000O00.O00000000("uTime", this.O00000000());
         this.O0000000000O00.O00000000("uEntry", o000000000O.sceneEntry());
         this.O0000000000O00.O00000000("uPulse", var2.pulse());
         this.O0000000000O00.O00000000("uMouse", o000000000O.mouseX(), o000000000O.mouseY());
         this.O0000000000O00
            .O00000000(
               "uLocalMouse",
               (o000000000O.mouseX() - var2.x()) / Math.max(1.0F, var2.width()),
               (o000000000O.mouseY() - var2.y()) / Math.max(1.0F, var2.height())
            );
         this.O0000000000O00.O00000000("uMouseVelocity", o000000000O.mouseVelocityX(), o000000000O.mouseVelocityY());
         this.O0000000000O00.O00000000("uAccentTop", o000000000O.accentTopR(), o000000000O.accentTopG(), o000000000O.accentTopB());
         this.O0000000000O00.O00000000("uAccentBottom", o000000000O.accentBottomR(), o000000000O.accentBottomG(), o000000000O.accentBottomB());
         this.O0000000000O00.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
         this.O0000000000000.O00000000();
      }
   }

   private void O0000000000000(MainMenuScreen.W281 o000000000O) {
      if (this.O000000000000.O000000000000()) {
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.O0000000000O0O.O00000000();
         this.O0000000000O0O.O00000000("uBackground", 0);
         this.O0000000000O0O.O00000000("uTextureSize", this.O000000000000.O0000000000(), this.O000000000000.O00000000000());
         this.O0000000000O0O.O00000000("uTime", o000000000O.time());
         this.O0000000000O0O.O00000000("uMouse", o000000000O.mouseX(), o000000000O.mouseY());
         this.O0000000000O0O.O00000000("uAccentTop", o000000000O.accentTopR(), o000000000O.accentTopG(), o000000000O.accentTopB());
         this.O0000000000O0O.O00000000("uAccentBottom", o000000000O.accentBottomR(), o000000000O.accentBottomG(), o000000000O.accentBottomB());
         this.O0000000000O0O.O00000000("uVelocity", o000000000O.mouseSpeed());
         this.O0000000000O0O.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
         this.O00000000(this.O000000000000.O000000000());

         for (MainMenuScreen.W265 var3 : o000000000O.buttons()) {
            float var4 = var3.bleed();
            float var5 = var3.x() - var4;
            float var6 = var3.y() - var4;
            float var7 = var3.width() + var4 * 2.0F;
            float var8 = var3.height() + var4 * 2.0F;
            this.O00000000(this.O0000000000O0O, o000000000O.framebufferWidth(), o000000000O.framebufferHeight(), var5, var6, var7, var8);
            this.O0000000000O0O.O00000000("uButton", var4, var4, var3.width(), var3.height());
            this.O0000000000O0O.O00000000("uLocalMouse", var3.localMouseX(), var3.localMouseY());
            this.O0000000000O0O.O00000000("uRadius", var3.radius());
            this.O0000000000O0O.O00000000("uHover", var3.hover());
            this.O0000000000O0O.O00000000("uMagnet", var3.magnet());
            this.O0000000000O0O.O00000000("uPress", var3.press());
            this.O0000000000O0O.O00000000("uEntry", var3.entry());
            this.O0000000000O0O.O00000000("uFlash", var3.flash());
            this.O0000000000O0O.O00000000("uScale", var3.scale());
            this.O0000000000O0O.O00000000("uButtonVelocity", var3.velocity());
            this.O0000000000000.O00000000();
         }
      }
   }

   private void O00000000(O00000OOO000.W289 o00000000, float f, float g, float h, float i, float j, float k) {
      o00000000.O00000000("uViewport", f, g);
      o00000000.O00000000("uRect", h, i, j, k);
   }

   private void O00000000(O00000OOO000.W289 o00000000, MainMenuScreen.W281 o000000000O) {
      for (int var3 = 0; var3 < 14; var3++) {
         MainMenuScreen.W283 var4 = o000000000O.trail(var3);
         o00000000.O00000000(O0000000000[var3], var4.x(), var4.y(), var4.age(), var4.strength());
      }
   }

   private void O000000000000O(MainMenuScreen.W281 o000000000O) {
      if (this.O000000000000.O000000000000()) {
         GL11.glEnable(3042);
         GL14.glBlendFuncSeparate(770, 771, 1, 771);
         this.O0000000000OO.O00000000();
         this.O0000000000OO.O00000000("uBackground", 0);
         this.O0000000000OO.O00000000("uTextureSize", this.O000000000000.O0000000000(), this.O000000000000.O00000000000());
         this.O0000000000OO.O00000000("uTime", o000000000O.time() * O000000000());
         this.O0000000000OO.O00000000("uMouse", o000000000O.mouseX(), o000000000O.mouseY());
         this.O0000000000OO.O00000000("uAccentTop", o000000000O.accentTopR(), o000000000O.accentTopG(), o000000000O.accentTopB());
         this.O0000000000OO.O00000000("uAccentBottom", o000000000O.accentBottomR(), o000000000O.accentBottomG(), o000000000O.accentBottomB());
         this.O0000000000OO.O00000000("uVelocity", o000000000O.mouseSpeed());
         this.O0000000000OO.O00000000("uLightMode", o000000000O.lightMode() ? 1.0F : 0.0F);
         this.O0000000000OO.O00000000("uGlassBlur", O00000000(MenuModule.O00000000OO0O0.O0000000000() / 32.0F, 0.25F, 2.0F));
         this.O0000000000OO.O00000000("uGlassTint", O00000000(MenuModule.O00000000OO0OO.O0000000000(), 0.0F, 1.0F));
         this.O0000000000OO.O00000000("uInteriorGlow", MenuModule.O00000000(MenuModule.O00000000O000) ? 1.0F : 0.0F);
         this.O0000000000OO.O00000000("uFilmGrain", MenuModule.O00000000(MenuModule.O00000000O0000) ? 1.0F : 0.0F);
         this.O00000000(this.O000000000000.O000000000());
         MainMenuScreen.W277 var2 = o000000000O.profileTrigger();
         if (var2 != null && var2.width() > 1.0F && var2.height() > 1.0F && var2.entry() > 0.001F) {
            this.O00000000(
               o000000000O,
               var2.x(),
               var2.y(),
               var2.width(),
               var2.height(),
               var2.radius(),
               0,
               var2.hover(),
               var2.press(),
               var2.flash(),
               0.0F,
               var2.entry(),
               var2.scale(),
               var2.localMouseX(),
               var2.localMouseY(),
               var2.panelProgress(),
               var2.hover()
            );
         }

         MainMenuScreen.W275 var3 = o000000000O.profilePanel();
         if (var3 != null && var3.width() > 1.0F && var3.height() > 1.0F && var3.progress() > 0.001F) {
            this.O00000000(
               o000000000O,
               var3.x(),
               var3.y(),
               var3.width(),
               var3.height(),
               var3.radius(),
               1,
               var3.progress(),
               0.0F,
               0.0F,
               0.0F,
               var3.progress(),
               1.0F,
               0.5F,
               0.5F,
               var3.progress(),
               0.0F
            );
         }

         if (o000000000O.profiles() != null) {
            for (MainMenuScreen.W274 var5 : o000000000O.profiles()) {
               if (!(var5.width() <= 1.0F) && !(var5.height() <= 1.0F) && !(var5.entry() <= 0.001F)) {
                  this.O00000000(
                     o000000000O,
                     var5.x(),
                     var5.y(),
                     var5.width(),
                     var5.height(),
                     var5.radius(),
                     2,
                     var5.hover(),
                     var5.press(),
                     var5.flash(),
                     var5.selected(),
                     var5.entry(),
                     var5.scale(),
                     var5.localMouseX(),
                     var5.localMouseY(),
                     var5.entry(),
                     var5.velocity()
                  );
               }
            }

            if (o000000000O.controls() != null) {
               for (MainMenuScreen.W270 var7 : o000000000O.controls()) {
                  if (!(var7.width() <= 1.0F) && !(var7.height() <= 1.0F) && !(var7.entry() <= 0.001F)) {
                     this.O00000000(
                        o000000000O,
                        var7.x(),
                        var7.y(),
                        var7.width(),
                        var7.height(),
                        var7.radius(),
                        3,
                        var7.hover(),
                        var7.press(),
                        var7.flash(),
                        var7.active(),
                        var7.entry(),
                        var7.scale(),
                        var7.localMouseX(),
                        var7.localMouseY(),
                        var7.value(),
                        var7.velocity()
                     );
                  }
               }
            }
         }
      }
   }

   private void O00000000(
      MainMenuScreen.W281 o000000000O,
      float f,
      float g,
      float h,
      float i,
      float j,
      int k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u
   ) {
      float var18 = k == 1 ? 64.0F : (k == 2 ? 36.0F : 34.0F);
      float var19 = f - var18;
      float var20 = g - var18;
      float var21 = h + var18 * 2.0F;
      float var22 = i + var18 * 2.0F;
      this.O00000000(this.O0000000000OO, o000000000O.framebufferWidth(), o000000000O.framebufferHeight(), var19, var20, var21, var22);
      this.O0000000000OO.O00000000("uContent", var18, var18, h, i);
      this.O0000000000OO.O00000000("uRadius", j);
      this.O0000000000OO.O00000000("uMode", k);
      this.O0000000000OO.O00000000("uHover", l);
      this.O0000000000OO.O00000000("uPress", m);
      this.O0000000000OO.O00000000("uFlash", n);
      this.O0000000000OO.O00000000("uSelected", o);
      this.O0000000000OO.O00000000("uEntry", p);
      this.O0000000000OO.O00000000("uScale", q);
      this.O0000000000OO.O00000000("uLocalMouse", r, s);
      this.O0000000000OO.O00000000("uPanelProgress", t);
      this.O0000000000OO.O00000000("uSurfaceVelocity", u);
      this.O0000000000000.O00000000();
   }

   private float O00000000() {
      long var1 = System.nanoTime();
      if (this.O0000000000OOO == 0L) {
         this.O0000000000OOO = var1;
         return this.O000000000O;
      } else {
         float var3 = (float)(var1 - this.O0000000000OOO) / 1.0E9F;
         this.O0000000000OOO = var1;
         if (!Float.isFinite(var3) || var3 < 0.0F) {
            var3 = 0.0F;
         }

         this.O000000000O = this.O000000000O + Math.min(var3, 0.05F);
         if (this.O000000000O > 240.0F) {
            this.O000000000O -= 240.0F;
         }

         return this.O000000000O;
      }
   }

   private static float O000000000() {
      return O00000000(MenuModule.O00000000OOO0O.O0000000000(), 0.0F, 1.5F);
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private void O0000000000() {
      if (!this.O000000000O0) {
         this.O0000000000000 = new O00000OOO();
         this.O000000000000O = this.O00000000000
            .O00000000("liquid_neon_gas", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_aurora.frag");
         this.O00000000000O = this.O00000000000
            .O00000000("sakura_breeze", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/sakura_breeze.frag");
         this.O00000000000O0 = this.O00000000000
            .O00000000("vernal_solstice", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/vernal_solstice.frag");
         this.O00000000000OO = this.O00000000000
            .O00000000("midnight_azure", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/midnight_azure.frag");
         this.O0000000000O = this.O00000000000
            .O00000000("composite", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_composite.frag");
         this.O0000000000O0 = this.O00000000000
            .O00000000("particles", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_particles.frag");
         this.O0000000000O00 = this.O00000000000
            .O00000000("logo", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_logo.frag");
         this.O0000000000O0O = this.O00000000000
            .O00000000("buttons", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_button.frag");
         this.O0000000000OO = this.O00000000000
            .O00000000("profile_panel", "assets/wild/shaders/mainmenu/menu_quad.vert", "assets/wild/shaders/mainmenu/menu_profile_panel.frag");
         this.O000000000O0 = true;
      }
   }

   private void O00000000000() {
      this.O000000000O00 = -1;
      this.O000000000O000 = -1;
      this.O00000000000.O00000000();
   }

   private void O00000000(int i) {
      if (this.O000000000O00 != 33984) {
         GL13.glActiveTexture(33984);
         this.O000000000O00 = 33984;
         this.O000000000O000 = -1;
      }

      if (this.O000000000O000 != i) {
         GL11.glBindTexture(3553, i);
         this.O000000000O000 = i;
      }
   }

   public static O00000OO0OOOOO.W288 O00000000(MinecraftClient minecraftClient, int i, int j) {
      if (minecraftClient != null && GLFW.glfwGetCurrentContext() != 0L) {
         Window var3 = minecraftClient.getWindow();
         if (var3 != null && !var3.hasZeroWidthOrHeight()) {
            int var4 = var3.getFramebufferWidth();
            int var5 = var3.getFramebufferHeight();
            if (var4 > 0 && var5 > 0 && i > 0 && j > 0) {
               Framebuffer var6 = minecraftClient.getFramebuffer();
               if (var6 != null && var6.textureWidth > 0 && var6.textureHeight > 0) {
                  if (!(var6.getColorAttachment() instanceof GlTexture var8)) {
                     return null;
                  } else {
                     int var9 = var8.getGlId();
                     if (var9 > 0 && GL11.glIsTexture(var9)) {
                        if (var4 > var6.textureWidth || var5 > var6.textureHeight) {
                           var4 = Math.min(var4, var6.textureWidth);
                           var5 = Math.min(var5, var6.textureHeight);
                        }

                        return var4 > 0 && var5 > 0 ? new O00000OO0OOOOO.W288(var4, var5, var9) : null;
                     } else {
                        return null;
                     }
                  }
               } else {
                  return null;
               }
            } else {
               return null;
            }
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private static String[] O000000000000() {
      String[] var0 = new String[14];

      for (int var1 = 0; var1 < var0.length; var1++) {
         var0[var1] = "uTrail[" + var1 + "]";
      }

      return var0;
   }

   @Override
   public void close() {
      this.O000000000000.close();
      if (this.O0000000000000 != null) {
         this.O0000000000000.close();
         this.O0000000000000 = null;
      }

      this.O00000000000.close();
      this.O000000000000O = null;
      this.O00000000000O = null;
      this.O00000000000O0 = null;
      this.O00000000000OO = null;
      this.O0000000000O = null;
      this.O0000000000O0 = null;
      this.O0000000000O00 = null;
      this.O0000000000O0O = null;
      this.O0000000000OO = null;
      this.O000000000O0 = false;
      this.O0000000000OO0 = 0L;
      this.O0000000000OOO = 0L;
      this.O000000000O = 0.0F;
   }

   public void O00000000(int i, int j) {
      try {
         this.O000000000000.close();
         if (this.O0000000000000 != null) {
            try {
               this.O0000000000000.close();
            } catch (Throwable var5) {
            }

            this.O0000000000000 = null;
         }

         try {
            this.O00000000000.close();
         } catch (Throwable var4) {
         }

         this.O000000000000O = null;
         this.O00000000000O = null;
         this.O00000000000O0 = null;
         this.O00000000000OO = null;
         this.O0000000000O = null;
         this.O0000000000O0 = null;
         this.O0000000000O00 = null;
         this.O0000000000O0O = null;
         this.O0000000000OO = null;
         this.O000000000O0 = false;
         this.O0000000000OO0 = 0L;
         this.O0000000000OOO = 0L;
         this.O000000000O = 0.0F;
      } catch (Throwable var6) {
      }
   }

   public record W288(int width, int height, int colorTexture) {
   }
}

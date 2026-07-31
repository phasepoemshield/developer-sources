package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.CubeMapRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.RotatingCubeMapRenderer;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.client.texture.CubemapTexture;
import net.minecraft.client.util.Window;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.lwjgl.opengl.GL11;

public final class MainMenuScreen extends Screen implements O00000OO0OOOO {
   private static final O0000O000OO O00000000 = O0000O000OO.O00000000();
   private static final int O000000000 = 14;
   private static final Identifier O0000000000 = Identifier.ofVanilla("textures/gui/title/background/panorama");
   private final O00000OO0OOOOO O00000000000 = new O00000OO0OOOOO();
   private final RotatingCubeMapRenderer O000000000000 = new RotatingCubeMapRenderer(new CubeMapRenderer(O0000000000));
   private boolean O0000000000000;
   private boolean O000000000000O;
   private volatile boolean O00000000000O;
   private final List<MainMenuScreen.W272> O00000000000O0 = List.of(
      new MainMenuScreen.W272("Singleplayer", MainMenuScreen.W264.SINGLEPLAYER),
      new MainMenuScreen.W272("Multiplayer", MainMenuScreen.W264.MULTIPLAYER),
      new MainMenuScreen.W272("Alt Manager", MainMenuScreen.W264.ALT_MANAGER),
      new MainMenuScreen.W272("Options", MainMenuScreen.W264.OPTIONS),
      new MainMenuScreen.W272("Quit", MainMenuScreen.W264.QUIT)
   );
   private final MainMenuScreen.W282[] O00000000000OO = new MainMenuScreen.W282[14];
   private final O00000OOO00 O0000000000O = new O00000OOO00(O0000O000O0O00.O000000000000());
   private final O00000OOO00 O0000000000O0 = new O00000OOO00(O0000O000O0O00.O000000000000());
   private long O0000000000O00;
   private long O0000000000O0O;
   private long O0000000000OO;
   private float O0000000000OO0;
   private float O0000000000OOO;
   private float O000000000O;
   private float O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private float O000000000O0OO;
   private float O000000000OO;
   private boolean O000000000OO0;
   private boolean O000000000OO00;
   private boolean O000000000OO0O;
   private int O000000000OOO = -6357021;
   private int O000000000OOO0 = -11341636;
   private Theme O000000000OOOO = Theme.AURORA;
   private boolean O00000000O;
   private MainMenuScreen.W281 O00000000O0;
   private static final MainMenuScreen.W276[] O00000000O00 = new MainMenuScreen.W276[]{
      new MainMenuScreen.W276("Performance", "Lean shader cadence, reduced secondary bloom", O000000O000O0.LOW),
      new MainMenuScreen.W276("Balanced", "Full motion layer with restrained cinematic cost", O000000O000O0.MEDIUM),
      new MainMenuScreen.W276("Cinematic Dark", "Deep mica glass, bloom trails, focus pull", O000000O000O0.HIGH),
      new MainMenuScreen.W276("Custom", "All premium passes unlocked for manual tuning", O000000O000O0.ULTRA)
   };
   private static final int O00000000O000 = O00000000O00.length;
   private static final MainMenuScreen.W267[] O00000000O0000 = new MainMenuScreen.W267[]{
      MainMenuScreen.W267.O00000000("Mica Blur", "Backdrop glass diffusion", MenuModule.O00000000OO0O0, MainMenuScreen.W268.PIXELS),
      MainMenuScreen.W267.O00000000("Nebula Flow", "Background motion tempo", MenuModule.O00000000OOO0O, MainMenuScreen.W268.MULTIPLIER),
      MainMenuScreen.W267.O00000000("Depth Parallax", "Motion reactive menu depth", MenuModule.O00000000O0O00),
      MainMenuScreen.W267.O00000000("Glass Tint", "Accent wash intensity", MenuModule.O00000000OO0OO, MainMenuScreen.W268.PERCENT),
      MainMenuScreen.W267.O00000000("Interior Glow", "Card inner luminance pass", MenuModule.O00000000O000),
      MainMenuScreen.W267.O00000000("Film Grain", "Fine cinematic texture", MenuModule.O00000000O0000),
      MainMenuScreen.W267.O00000000("UI Scale", "Menu and panel density", MenuModule.O000000000OO0, MainMenuScreen.W268.SCALE),
      MainMenuScreen.W267.O00000000("Cursor Trail", "Magnetic pointer afterglow", MenuModule.O00000000O0O0)
   };
   private static final int O00000000O000O = O00000000O0000.length;
   private static final MainMenuScreen.W278[] O00000000O00O = new MainMenuScreen.W278[]{
      new MainMenuScreen.W278("RENDERING", 0, 3), new MainMenuScreen.W278("EFFECTS", 3, 3), new MainMenuScreen.W278("UI & PERFORMANCE", 6, 2)
   };
   private static final int O00000000O00O0 = O00000000O00O.length;
   private final O00000OOO00 O00000000O00OO = new O00000OOO00(O0000O000O0O00.O0000000000OOO());
   private final O00000OOO00 O00000000O0O = new O00000OOO00(O0000O000O0O00.O000000000000());
   private final MainMenuScreen.W273[] O00000000O0O0 = new MainMenuScreen.W273[O00000000O000];
   private final MainMenuScreen.W269[] O00000000O0O00 = new MainMenuScreen.W269[O00000000O000O];
   private final MainMenuScreen.W279[] O00000000O0O0O = new MainMenuScreen.W279[O00000000O00O0];
   private int O00000000O0OO = -1;
   private boolean O00000000O0OO0;
   private boolean O00000000O0OOO;
   private float O00000000OO;
   private float O00000000OO0;
   private float O00000000OO00;
   private float O00000000OO000;
   private float O00000000OO00O;
   private float O00000000OO0O;
   private float O00000000OO0O0;
   private float O00000000OO0OO;
   private float O00000000OOO = 1.0F;
   private float O00000000OOO0 = 0.5F;
   private float O00000000OOO00 = 0.5F;
   private float O00000000OOO0O;
   private float O00000000OOOO;
   private float O00000000OOOO0;
   private float O00000000OOOOO;
   private float O0000000O;
   private float O0000000O0;
   private int O0000000O00 = -1;
   private int O0000000O000 = -1;
   private int O0000000O0000 = -1;
   private static final boolean O0000000O00000 = false;
   private static final float O0000000O0000O = 30.0F;
   private static final float O0000000O000O = 9.0F;
   private static final float O0000000O000O0 = 138.0F;
   private boolean O0000000O000OO;
   private float O0000000O00O = -1.0F;
   private float O0000000O00O0 = -1.0F;

   public MainMenuScreen() {
      super(Text.literal("Wild"));

      for (int var1 = 0; var1 < this.O00000000000OO.length; var1++) {
         this.O00000000000OO[var1] = new MainMenuScreen.W282();
      }

      for (int var2 = 0; var2 < this.O00000000O0O0.length; var2++) {
         this.O00000000O0O0[var2] = new MainMenuScreen.W273(O00000000O00[var2]);
      }

      for (int var3 = 0; var3 < this.O00000000O0O00.length; var3++) {
         this.O00000000O0O00[var3] = new MainMenuScreen.W269(O00000000O0000[var3]);
      }

      for (int var4 = 0; var4 < this.O00000000O0O0O.length; var4++) {
         this.O00000000O0O0O[var4] = new MainMenuScreen.W279(O00000000O00O[var4]);
      }
   }

   protected void init() {
      super.init();
      this.O0000000000O00 = System.nanoTime();
      this.O0000000000O0O = this.O0000000000O00;
      this.O0000000000OO = this.O0000000000O00;
      this.O0000000000O.O00000000(0.0F);
      this.O0000000000O0.O00000000(0.0F);
      this.O000000000OO0 = false;
      this.O000000000OO00 = false;
      this.O000000000OO0O = false;
      this.O00000000O0OO0 = false;
      this.O00000000O00OO.O00000000(0.0F);
      this.O00000000O0O.O00000000(1.0F);
      this.O00000000OO0O = 0.0F;
      this.O00000000OO0O0 = 0.0F;
      this.O00000000OO0OO = 0.0F;
      this.O00000000OOO = 1.0F;
      this.O00000000OOO0 = 0.5F;
      this.O00000000OOO00 = 0.5F;
      this.O0000000O00 = -1;
      this.O0000000O000 = -1;
      this.O00000000O0OO = -1;
      this.O0000000O0000 = -1;
      this.O0000000O000OO = false;

      for (MainMenuScreen.W272 var2 : this.O00000000000O0) {
         var2.O00000000();
      }

      for (MainMenuScreen.W273 var4 : this.O00000000O0O0) {
         var4.O00000000();
      }

      for (MainMenuScreen.W269 var13 : this.O00000000O0O00) {
         var13.O00000000();
      }

      for (MainMenuScreen.W279 var14 : this.O00000000O0O0O) {
         var14.O00000000();
      }
   }

   public void render(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
      if (!this.O00000000000O) {
         this.O00000000(context);
      }

      this.O00000000(mouseX, mouseY, deltaTicks, false);
   }

   private void O00000000(DrawContext drawContext) {
      if (drawContext != null && this.client != null && this.width > 0 && this.height > 0) {
         if (this.O000000000000O) {
            drawContext.fillGradient(0, 0, this.width, this.height, O000000000(this.O000000000OOO, 255), O000000000(this.O000000000OOO0, 255));
         } else {
            try {
               if (!this.O0000000000000) {
                  this.client.getTextureManager().registerTexture(O0000000000, new CubemapTexture(O0000000000));
                  this.O0000000000000 = true;
               }

               this.O000000000000.render(drawContext, this.width, this.height, true);
               drawContext.fillGradient(0, 0, this.width, this.height, O000000000(this.O000000000OOO, 70), O000000000(this.O000000000OOO0, 110));
            } catch (Throwable var3) {
               this.O000000000000O = true;
               O0000O00OO0OO.O00000000("MainMenuPanorama", this, "panorama fallback failed", var3);
               drawContext.fillGradient(0, 0, this.width, this.height, O000000000(this.O000000000OOO, 255), O000000000(this.O000000000OOO0, 255));
            }
         }
      }
   }

   @Override
   public void O00000000(int i, int j, float f) {
      this.O00000000(i, j, f, true);
   }

   private void O00000000(int i, int j, float f, boolean bl) {
      Window var5 = this.client == null ? null : this.client.getWindow();
      if (var5 != null && !var5.hasZeroWidthOrHeight() && var5.getFramebufferWidth() > 0 && var5.getFramebufferHeight() > 0) {
         int var6 = var5.getFramebufferWidth();
         int var7 = var5.getFramebufferHeight();
         O00000OO0OOOOO.W288 var8 = O00000OO0OOOOO.O00000000(MinecraftClient.getInstance(), var6, var7);
         if (var8 == null) {
            if (bl) {
               this.O00000000000O = false;
            }
         } else {
            var6 = var8.width();
            var7 = var8.height();
            long var9 = System.nanoTime();
            float var11 = Math.max(0.001F, Math.min(0.05F, (float)(var9 - this.O0000000000O0O) / 1.0E9F));
            this.O0000000000O0O = var9;
            this.O0000000000OO0 = (float)(var9 - this.O0000000000O00) / 1.0E9F;
            this.O000000000();
            this.O00000000(var5, i, j, var11, var9);
            this.O000000000(var6, var7, var11);
            this.O0000000000();
            boolean var12 = MenuModule.O00000000(MenuModule.O00000000O0O00);
            float var13 = var12 ? (this.O0000000000OOO / Math.max(1.0F, (float)var6) - 0.5F) * 2.0F : 0.0F;
            float var14 = var12 ? (this.O000000000O / Math.max(1.0F, (float)var7) - 0.5F) * 2.0F : 0.0F;
            float var15 = this.O0000000000O.O00000000(var13, var11);
            float var16 = this.O0000000000O0.O00000000(var14, var11);
            this.O00000000(var6, var7, var15, var16, var11);
            int var17 = GL11.glGetInteger(36006);
            O0000O00OO00O0.O00000000(var17);
            MainMenuScreen.W281 var18 = this.O00000000(var6, var7, var17, var15, var16, var9);
            this.O00000000O0 = var18;
            if (bl) {
               boolean var19 = false;
               O0000O00O0OOO0.W373 var20 = O0000O00O0OOO0.O00000000();

               try {
                  var19 = this.O00000000000.O00000000(var18);
               } finally {
                  O0000O00O0OOO0.O00000000(var20);
               }

               this.O00000000000O = var19;
               this.O00000000(var18);
            }
         }
      } else {
         if (bl) {
            this.O00000000000O = false;
         }
      }
   }

   public void renderBackground(DrawContext context, int mouseX, int mouseY, float deltaTicks) {
   }

   public void renderInGameBackground(DrawContext context) {
   }

   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      if (button == 0 && this.client != null && this.client.getWindow() != null) {
         float var6 = this.O00000000(this.client.getWindow(), mouseX);
         float var7 = this.O000000000(this.client.getWindow(), mouseY);
         if (this.O00000000(var6, var7)) {
            this.O00000000O0OO0 = !this.O00000000O0OO0;
            this.O00000000OO0O0 = 1.0F;
            this.O00000000OO0OO = 1.0F;
            return true;
         } else if (this.O000000000000(var6, var7)) {
            this.O0000000O000OO = true;
            this.O00000000(var6);
            return true;
         } else if (this.O00000000O0OO0 && !this.O000000000(var6, var7)) {
            this.O00000000O0OO0 = false;
            return true;
         } else {
            for (MainMenuScreen.W272 var9 : this.O00000000000O0) {
               if (var9.O00000000(var6, var7)) {
                  var9.O0000000000O00 = 1.0F;
                  var9.O0000000000O0O = 1.0F;
                  this.O00000000(var9.O000000000);
                  return true;
               }
            }

            return true;
         }
      } else {
         return super.mouseClicked(mouseX, mouseY, button);
      }
   }

   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      if (button == 0 && this.O0000000O000OO && this.client != null && this.client.getWindow() != null) {
         this.O00000000(this.O00000000(this.client.getWindow(), mouseX));
         return true;
      } else if (button == 0 && this.O0000000O0000 >= 0 && this.client != null && this.client.getWindow() != null) {
         this.O00000000(this.O0000000O0000, this.O00000000(this.client.getWindow(), mouseX));
         return true;
      } else {
         return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
      }
   }

   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      if (button == 0 && this.O0000000O000OO) {
         this.O0000000O000OO = false;
         O000000000000();
         return true;
      } else if (button == 0 && this.O0000000O0000 >= 0) {
         this.O0000000O0000 = -1;
         O000000000000();
         return true;
      } else {
         return super.mouseReleased(mouseX, mouseY, button);
      }
   }

   public boolean shouldPause() {
      return false;
   }

   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      if (keyCode == 256 && this.O00000000O0OO0) {
         this.O00000000O0OO0 = false;
         return true;
      } else {
         return super.keyPressed(keyCode, scanCode, modifiers);
      }
   }

   public boolean shouldCloseOnEsc() {
      return false;
   }

   public void removed() {
      this.O00000000000.close();
      super.removed();
   }

   public void O00000000(int i, int j) {
      try {
         this.O00000000000.O00000000(i, j);
      } catch (Throwable var4) {
      }
   }

   private void O000000000() {
      Theme var1 = WildClient.O00000000 != null && WildClient.O00000000.O0000000000O != null ? WildClient.O00000000.O0000000000O.O000000000() : Theme.AURORA;
      this.O000000000OOOO = var1;
      O0000O000OO.W351 var2 = O00000000.O000000000(var1);
      if (var2 != null) {
         this.O000000000OOO = var2.O0000000000();
         this.O000000000OOO0 = var2.O00000000000();
         this.O00000000O = var2.O000000000000();
      } else {
         this.O00000000O = false;
         Color var3 = var1.O00000000();
         this.O000000000OOO = 0xFF000000 | var3.getRGB() & 16777215;
         float[] var4 = Color.RGBtoHSB(var3.getRed(), var3.getGreen(), var3.getBlue(), null);
         this.O000000000OOO0 = 0xFF000000
            | Color.HSBtoRGB((var4[0] + 0.075F) % 1.0F, Math.min(1.0F, var4[1] * 1.08F), Math.min(1.0F, var4[2] * 1.18F)) & 16777215;
      }
   }

   private void O00000000(Window window, int i, int j, float f, long l) {
      float var7 = this.O00000000(window, i);
      float var8 = this.O000000000(window, j);
      if (!this.O000000000OO0) {
         this.O0000000000OOO = var7;
         this.O000000000O = var8;
         this.O000000000O0 = 0.0F;
         this.O000000000O00 = 0.0F;
         this.O000000000OO0 = true;
      } else {
         float var9 = var7 - this.O0000000000OOO;
         float var10 = var8 - this.O000000000O;
         float var11 = (float)Math.sqrt(var9 * var9 + var10 * var10);
         if (var11 > 0.2F) {
            this.O000000000O0 = O000000000(var9 / Math.max(1.0F, (float)window.getFramebufferWidth()) / f, -3.0F, 3.0F);
            this.O000000000O00 = O000000000(var10 / Math.max(1.0F, (float)window.getFramebufferHeight()) / f, -3.0F, 3.0F);
         } else {
            float var12 = (float)Math.pow(8.0E-4F, f);
            this.O000000000O0 *= var12;
            this.O000000000O00 *= var12;
         }

         this.O0000000000OOO = var7;
         this.O000000000O = var8;
         if (var11 > 1.5F) {
            this.O0000000000OO = l;
         }
      }
   }

   private void O0000000000() {
      if (O000000O000O0O.O0000000000() && MenuModule.O00000000(MenuModule.O00000000O0O0)) {
         if (!this.O000000000OO0O) {
            this.O000000000O0OO = this.O000000000O000;
            this.O000000000OO = this.O000000000O00O;
            this.O000000000OO0O = true;
            this.O00000000(this.O000000000O000, this.O000000000O00O, 0.36F);
         } else {
            float var1 = O000000000000O(this.O000000000O000 - this.O000000000O0OO, this.O000000000O00O - this.O000000000OO);
            if (var1 > 5.5F) {
               this.O00000000(this.O000000000O000, this.O000000000O00O, O000000000(var1 / 180.0F, 0.12F, 0.54F));
               this.O000000000O0OO = this.O000000000O000;
               this.O000000000OO = this.O000000000O00O;
            }
         }
      }
   }

   private void O000000000(int i, int j, float f) {
      if (!this.O000000000OO00) {
         this.O000000000O000 = this.O0000000000OOO;
         this.O000000000O00O = this.O000000000O;
         this.O000000000O0O = 0.0F;
         this.O000000000O0O0 = 0.0F;
         this.O000000000OO00 = true;
      } else {
         float var4 = this.O000000000O000;
         float var5 = this.O000000000O00O;
         float var6 = O000000000000O(this.O0000000000OOO - this.O000000000O000, this.O000000000O - this.O000000000O00O);
         float var7 = (1.0F - (float)Math.pow(3.5E-5F, f)) * (0.72F + O000000000(var6 / 520.0F, 0.0F, 0.42F));
         this.O000000000O000 = this.O000000000O000 + (this.O0000000000OOO - this.O000000000O000) * O000000000(var7, 0.05F, 0.26F);
         this.O000000000O00O = this.O000000000O00O + (this.O000000000O - this.O000000000O00O) * O000000000(var7, 0.05F, 0.26F);
         float var8 = O000000000((this.O000000000O000 - var4) / Math.max(1.0F, (float)i) / f, -1.8F, 1.8F);
         float var9 = O000000000((this.O000000000O00O - var5) / Math.max(1.0F, (float)j) / f, -1.8F, 1.8F);
         float var10 = 1.0F - (float)Math.pow(0.0025F, f);
         this.O000000000O0O = this.O000000000O0O + (var8 - this.O000000000O0O) * var10;
         this.O000000000O0O0 = this.O000000000O0O0 + (var9 - this.O000000000O0O0) * var10;
      }
   }

   private void O00000000(float f, float g, float h) {
      int var4 = 0;
      float var5 = -1.0F;

      for (int var6 = 0; var6 < this.O00000000000OO.length; var6++) {
         float var7 = this.O0000000000OO0 - this.O00000000000OO[var6].O0000000000;
         if (this.O00000000000OO[var6].O00000000000 <= 0.0F) {
            var4 = var6;
            break;
         }

         if (var7 > var5) {
            var5 = var7;
            var4 = var6;
         }
      }

      this.O00000000000OO[var4].O00000000 = f;
      this.O00000000000OO[var4].O000000000 = g;
      this.O00000000000OO[var4].O0000000000 = this.O0000000000OO0;
      this.O00000000000OO[var4].O00000000000 = h;
   }

   private void O00000000(int i, int j, float f, float g, float h) {
      float var6 = O0000000000000(i, j);
      this.O00000000(i, j, var6, h);
      float var7 = O000000000(i * 0.226F, 266.0F * var6, 420.0F * var6);
      float var8 = 54.0F * var6;
      float var9 = 13.0F * var6;
      float var10 = this.O00000000000O0.size() * var8 + (this.O00000000000O0.size() - 1) * var9;
      float var11 = i * 0.5F + f * 2.1F * var6;
      float var12 = j * 0.52F - var10 * 0.38F + g * 1.25F * var6;
      float var13 = Math.min(var8 * 0.34F, 18.0F * var6);
      float var14 = 20.0F * var6;

      for (int var15 = 0; var15 < this.O00000000000O0.size(); var15++) {
         MainMenuScreen.W272 var16 = this.O00000000000O0.get(var15);
         var16.O00000000000O = var7;
         var16.O00000000000O0 = var8;
         var16.O00000000000 = var11 - var7 * 0.5F;
         var16.O000000000000 = var12 + var15 * (var8 + var9);
         var16.O00000000000OO = var13;
         float var17 = O00000000(
            this.O0000000000OOO, this.O000000000O, var16.O00000000000, var16.O000000000000, var16.O00000000000O, var16.O00000000000O0, var16.O00000000000OO
         );
         boolean var18 = var17 <= 0.0F;
         float var19 = 1.0F - O000000000(O000000000(Math.max(0.0F, var17) / Math.max(1.0F, var14), 0.0F, 1.0F));
         float var20 = var18 ? 1.0F : 0.0F;
         var16.O0000000000O = var16.O0000000000O + (var20 - var16.O0000000000O) * (1.0F - (float)Math.pow(8.0E-5F, h));
         var16.O0000000000O0 = var16.O0000000000O0 + (var19 - var16.O0000000000O0) * (1.0F - (float)Math.pow(1.2E-4F, h));
         var16.O0000000000O00 = var16.O0000000000O00 + (0.0F - var16.O0000000000O00) * (1.0F - (float)Math.pow(2.0E-5F, h));
         var16.O0000000000O0O = var16.O0000000000O0O + (0.0F - var16.O0000000000O0O) * (1.0F - (float)Math.pow(8.0E-6F, h));
         float var21 = O000000000((this.O000000000O000 - var16.O00000000000) / Math.max(1.0F, var16.O00000000000O), 0.0F, 1.0F);
         float var22 = O000000000((this.O000000000O00O - var16.O000000000000) / Math.max(1.0F, var16.O00000000000O0), 0.0F, 1.0F);
         float var23 = 1.0F - (float)Math.pow(1.8E-4F, h);
         var16.O0000000000OO0 = var16.O0000000000OO0 + (var21 - var16.O0000000000OO0) * var23;
         var16.O0000000000OOO = var16.O0000000000OOO + (var22 - var16.O0000000000OOO) * var23;
         float var24 = 1.0F + var16.O0000000000O0 * 0.05F - var16.O0000000000O00 * 0.07F;
         var16.O0000000000OO = var16.O0000000000.O00000000(var24, h);
         float var25 = (var16.O0000000000OO0 - 0.5F) * 8.0F * var6 * var16.O0000000000O0;
         float var26 = (var16.O0000000000OOO - 0.5F) * 4.4F * var6 * var16.O0000000000O0 - var16.O0000000000O * 1.1F * var6;
         var16.O0000000000000 = var16.O00000000000 + var25;
         var16.O000000000000O = var16.O000000000000 + var26;
         var16.O000000000O = O000000000(
            O000000000000O(this.O000000000O0O, this.O000000000O0O0) * 0.7F * var16.O0000000000O0 + Math.abs(var16.O0000000000.O000000000()) * 0.045F,
            0.0F,
            1.0F
         );
      }
   }

   private void O00000000(int i, int j, float f, float g) {
      this.O0000000O0 = this.O00000000O00OO.O00000000(this.O00000000O0OO0 ? 1.0F : 0.0F, g);
      this.O00000000OO00 = O000000000(218.0F * f, 168.0F * f, 282.0F * f);
      this.O00000000OO000 = 46.0F * f;
      this.O00000000OO00O = Math.min(this.O00000000OO000 * 0.34F, 18.0F * f);
      this.O00000000OO = 28.0F * f;
      this.O00000000OO0 = j - this.O00000000OO000 - 28.0F * f;
      float var5 = O00000000(
         this.O0000000000OOO, this.O000000000O, this.O00000000OO, this.O00000000OO0, this.O00000000OO00, this.O00000000OO000, this.O00000000OO00O
      );
      this.O00000000O0OOO = var5 <= 0.0F;
      float var6 = this.O00000000O0OOO ? 1.0F : 0.0F;
      this.O00000000OO0O = this.O00000000OO0O + (var6 - this.O00000000OO0O) * (1.0F - (float)Math.pow(8.0E-5F, g));
      this.O00000000OO0O0 = this.O00000000OO0O0 + (0.0F - this.O00000000OO0O0) * (1.0F - (float)Math.pow(2.0E-5F, g));
      this.O00000000OO0OO = this.O00000000OO0OO + (0.0F - this.O00000000OO0OO) * (1.0F - (float)Math.pow(8.0E-6F, g));
      float var7 = 1.0F - (float)Math.pow(1.8E-4F, g);
      this.O00000000OOO0 = this.O00000000OOO0
         + (O000000000((this.O000000000O000 - this.O00000000OO) / Math.max(1.0F, this.O00000000OO00), 0.0F, 1.0F) - this.O00000000OOO0) * var7;
      this.O00000000OOO00 = this.O00000000OOO00
         + (O000000000((this.O000000000O00O - this.O00000000OO0) / Math.max(1.0F, this.O00000000OO000), 0.0F, 1.0F) - this.O00000000OOO00) * var7;
      this.O00000000OOO = this.O00000000O0O.O00000000(1.0F + this.O00000000OO0O * 0.035F - this.O00000000OO0O0 * 0.055F, g);
      this.O00000000OOOO0 = O000000000(i * 0.35F, 620.0F * f, 760.0F * f);
      float var8 = 24.0F * f;
      float var9 = 14.0F * f;
      float var10 = 13.0F * f;
      float var11 = (this.O00000000OOOO0 - var8 * 2.0F - var9) * 0.5F;
      float var12 = 66.0F * f;
      float var13 = 30.0F * f;
      float var14 = 8.0F * f;
      float var15 = 16.0F * f;
      float var16 = 190.0F * f;
      float var17 = 26.0F * f;
      float var18 = 0.0F;

      for (int var19 = 0; var19 < O00000000O00O0; var19++) {
         MainMenuScreen.W279 var20 = this.O00000000O0O0O[var19];
         float var21 = var20.O000000000.O00000000(var20.O0000000000 ? 0.0F : 1.0F, g);
         var20.O00000000000 = var21;
         int var22 = var20.O00000000.rows();
         float var23 = var22 * var12 + Math.max(0, var22 - 1) * var10;
         var18 += var13 + var14 + var23 * var21 + var15;
      }

      this.O00000000OOOOO = O000000000(var16 + var18 + var17, 360.0F * f, j - 120.0F * f);
      this.O00000000OOOOO = O000000000(196.0F * f, 176.0F * f, j - 120.0F * f);
      this.O0000000O = 26.0F * f;
      float var48 = 28.0F * f;
      float var49 = -this.O00000000OOOO0 - 26.0F * f;
      float var50 = 68.0F * f;
      float var51 = j - this.O00000000OOOOO - 60.0F * f;
      this.O00000000OOO0O = var49 + (var48 - var49) * this.O0000000O0;
      this.O00000000OOOO = O000000000(j * 0.5F - this.O00000000OOOOO * 0.5F, var50, Math.max(var50, var51));
      float var52 = 10.0F * f;
      float var24 = this.O00000000OOO0O + var8;
      float var25 = (this.O00000000OOOO0 - var8 * 2.0F - var52 * (O00000000O000 - 1)) / O00000000O000;
      float var26 = 58.0F * f;
      float var27 = this.O00000000OOOO + 92.0F * f;
      this.O0000000O00 = this.O0000000O0 > 0.18F ? this.O0000000000(this.O0000000000OOO, this.O000000000O) : -1;
      this.O0000000O000 = this.O0000000O0 > 0.18F ? this.O00000000000(this.O0000000000OOO, this.O000000000O) : -1;
      int var28 = this.O000000000000O();

      for (int var29 = 0; var29 < O00000000O000; var29++) {
         MainMenuScreen.W273 var30 = this.O00000000O0O0[var29];
         var30.O0000000000 = var24 + var29 * (var25 + var52);
         var30.O00000000000 = var27;
         var30.O000000000000O = var25;
         var30.O00000000000O = var26;
         var30.O0000000000O = Math.min(var26 * 0.3F, 16.0F * f);
         boolean var31 = var29 == this.O0000000O00;
         boolean var32 = var30.O00000000.preset().ordinal() == var28;
         float var33 = var31 ? 1.0F : 0.0F;
         var30.O0000000000O0 = var30.O0000000000O0 + (var33 - var30.O0000000000O0) * (1.0F - (float)Math.pow(8.0E-5F, g));
         var30.O0000000000O00 = var30.O0000000000O00 + (0.0F - var30.O0000000000O00) * (1.0F - (float)Math.pow(2.0E-5F, g));
         var30.O0000000000O0O = var30.O0000000000O0O + (0.0F - var30.O0000000000O0O) * (1.0F - (float)Math.pow(8.0E-6F, g));
         float var34 = 1.0F - (float)Math.pow(1.8E-4F, g);
         var30.O0000000000OO0 = var30.O0000000000OO0
            + (O000000000((this.O000000000O000 - var30.O0000000000) / Math.max(1.0F, var30.O000000000000O), 0.0F, 1.0F) - var30.O0000000000OO0) * var34;
         var30.O0000000000OOO = var30.O0000000000OOO
            + (O000000000((this.O000000000O00O - var30.O00000000000) / Math.max(1.0F, var30.O00000000000O), 0.0F, 1.0F) - var30.O0000000000OOO) * var34;
         float var35 = 1.0F + var30.O0000000000O0 * 0.035F + (var32 ? 0.01F : 0.0F) - var30.O0000000000O00 * 0.055F;
         var30.O0000000000OO = var30.O000000000.O00000000(var35, g);
         float var36 = var30.O000000000000O * (var30.O0000000000OO - 1.0F) * 0.5F;
         float var37 = var30.O00000000000O * (var30.O0000000000OO - 1.0F) * 0.5F;
         var30.O000000000000 = var30.O0000000000 - var36;
         var30.O0000000000000 = var30.O00000000000 - var37;
         var30.O00000000000O0 = var30.O000000000000O + var36 * 2.0F;
         var30.O00000000000OO = var30.O00000000000O + var37 * 2.0F;
         var30.O000000000O = var32 ? 1.0F : 0.0F;
         var30.O000000000O0 = O000000000(
            O000000000000O(this.O000000000O0O, this.O000000000O0O0) * 0.62F * var30.O0000000000O0 + Math.abs(var30.O000000000.O000000000()) * 0.035F,
            0.0F,
            1.0F
         );
      }

      float var53 = this.O00000000OOOO + var16;
      this.O00000000O0OO = -1;

      for (int var55 = 0; var55 < O00000000O00O0; var55++) {
         MainMenuScreen.W279 var56 = this.O00000000O0O0O[var55];
         var56.O0000000000000 = this.O00000000OOO0O + var8;
         var56.O000000000000O = var53;
         var56.O00000000000O = this.O00000000OOOO0 - var8 * 2.0F;
         var56.O00000000000O0 = var13;
         boolean var57 = this.O0000000O0 > 0.18F
            && O00000000(this.O0000000000OOO, this.O000000000O, var56.O0000000000000, var56.O000000000000O, var56.O00000000000O, var56.O00000000000O0);
         if (var57) {
            this.O00000000O0OO = var55;
         }

         float var58 = var57 ? 1.0F : 0.0F;
         var56.O000000000000 = var56.O000000000000 + (var58 - var56.O000000000000) * (1.0F - (float)Math.pow(8.0E-5F, g));
         var53 += var13 + var14;
         int var59 = var56.O00000000.rows();
         float var60 = var59 * var12 + Math.max(0, var59 - 1) * var10;

         for (int var61 = 0; var61 < var56.O00000000.count(); var61++) {
            int var62 = var56.O00000000.start() + var61;
            MainMenuScreen.W269 var38 = this.O00000000O0O00[var62];
            int var39 = var61 & 1;
            int var40 = var61 >> 1;
            var38.O000000000O000 = var56.O00000000000;
            var38.O0000000000 = this.O00000000OOO0O + var8 + var39 * (var11 + var9);
            var38.O00000000000 = var53 + var40 * (var12 + var10);
            var38.O000000000000O = var11;
            var38.O00000000000O = var12;
            var38.O0000000000O = Math.min(var12 * 0.28F, 18.0F * f);
            boolean var41 = (var62 == this.O0000000O000 || var62 == this.O0000000O0000) && var56.O00000000000 > 0.5F;
            boolean var42 = var38.O00000000.O0000000000 == MainMenuScreen.W266.TOGGLE ? var38.O00000000.O000000000000.O0000000000() : true;
            float var43 = var41 ? 1.0F : 0.0F;
            var38.O0000000000O0 = var38.O0000000000O0 + (var43 - var38.O0000000000O0) * (1.0F - (float)Math.pow(8.0E-5F, g));
            var38.O0000000000O00 = var38.O0000000000O00 + (0.0F - var38.O0000000000O00) * (1.0F - (float)Math.pow(2.0E-5F, g));
            var38.O0000000000O0O = var38.O0000000000O0O + (0.0F - var38.O0000000000O0O) * (1.0F - (float)Math.pow(8.0E-6F, g));
            float var44 = 1.0F - (float)Math.pow(1.8E-4F, g);
            var38.O0000000000OO0 = var38.O0000000000OO0
               + (O000000000((this.O000000000O000 - var38.O0000000000) / Math.max(1.0F, var38.O000000000000O), 0.0F, 1.0F) - var38.O0000000000OO0) * var44;
            var38.O0000000000OOO = var38.O0000000000OOO
               + (O000000000((this.O000000000O00O - var38.O00000000000) / Math.max(1.0F, var38.O00000000000O), 0.0F, 1.0F) - var38.O0000000000OOO) * var44;
            float var45 = 1.0F + var38.O0000000000O0 * 0.022F - var38.O0000000000O00 * 0.038F;
            var38.O0000000000OO = var38.O000000000.O00000000(var45, g);
            float var46 = var38.O000000000000O * (var38.O0000000000OO - 1.0F) * 0.5F;
            float var47 = var38.O00000000000O * (var38.O0000000000OO - 1.0F) * 0.5F;
            var38.O000000000000 = var38.O0000000000 - var46;
            var38.O0000000000000 = var38.O00000000000 - var47;
            var38.O00000000000O0 = var38.O000000000000O + var46 * 2.0F;
            var38.O00000000000OO = var38.O00000000000O + var47 * 2.0F;
            var38.O000000000O = var42 ? 1.0F : 0.0F;
            var38.O000000000O0 = O00000000(var38.O00000000);
            var38.O000000000O00 = O000000000(
               O000000000000O(this.O000000000O0O, this.O000000000O0O0) * 0.48F * var38.O0000000000O0 + Math.abs(var38.O000000000.O000000000()) * 0.032F,
               0.0F,
               1.0F
            );
         }

         var53 += var60 * var56.O00000000000 + var15;
      }
   }

   private boolean O00000000(float f, float g) {
      return this.O00000000OO00 > 0.0F
         && O00000000(f, g, this.O00000000OO, this.O00000000OO0, this.O00000000OO00, this.O00000000OO000, this.O00000000OO00O) <= 0.0F;
   }

   private boolean O000000000(float f, float g) {
      return this.O0000000O0 > 0.05F
         && O00000000(f, g, this.O00000000OOO0O, this.O00000000OOOO, this.O00000000OOOO0, this.O00000000OOOOO, this.O0000000O) <= 0.0F;
   }

   private int O0000000000(float f, float g) {
      if (!this.O00000000O0OO0 && this.O0000000O0 <= 0.18F) {
         return -1;
      } else {
         for (int var3 = 0; var3 < O00000000O000; var3++) {
            MainMenuScreen.W273 var4 = this.O00000000O0O0[var3];
            if (var4.O000000000000O > 0.0F
               && O00000000(f, g, var4.O0000000000, var4.O00000000000, var4.O000000000000O, var4.O00000000000O, var4.O0000000000O) <= 0.0F) {
               return var3;
            }
         }

         return -1;
      }
   }

   private int O00000000000(float f, float g) {
      if (!this.O00000000O0OO0 && this.O0000000O0 <= 0.18F) {
         return -1;
      } else {
         for (int var3 = 0; var3 < O00000000O000O; var3++) {
            if (!(this.O00000000(var3) < 0.5F)) {
               MainMenuScreen.W269 var4 = this.O00000000O0O00[var3];
               if (var4.O000000000000O > 0.0F
                  && O00000000(f, g, var4.O0000000000, var4.O00000000000, var4.O000000000000O, var4.O00000000000O, var4.O0000000000O) <= 0.0F) {
                  return var3;
               }
            }
         }

         return -1;
      }
   }

   private void O00000000(int i, float f) {
      if (i >= 0 && i < O00000000O000O) {
         MainMenuScreen.W269 var3 = this.O00000000O0O00[i];
         if (var3.O00000000.O0000000000 == MainMenuScreen.W266.SLIDER && var3.O00000000.O00000000000 != null) {
            float var4 = O000000000(var3.O00000000000O / 66.0F, 0.72F, 1.38F);
            float var5 = var3.O0000000000 + 16.0F * var4;
            float var6 = Math.max(1.0F, var3.O000000000000O - 32.0F * var4);
            float var7 = O000000000((f - var5) / var6, 0.0F, 1.0F);
            NumberSetting var8 = var3.O00000000.O00000000000;
            float var9 = var8.O000000000000 + (var8.O0000000000000 - var8.O000000000000) * var7;
            if (var8.O000000000000O > 0.0F) {
               var9 = Math.round(var9 / var8.O000000000000O) * var8.O000000000000O;
            }

            var8.O00000000(var9);
            var3.O000000000O0 = O00000000(var3.O00000000);
            O00000000000();
         }
      }
   }

   private static float O00000000(MainMenuScreen.W267 o00000000000) {
      if (o00000000000 == null) {
         return 0.0F;
      } else if (o00000000000.O0000000000 != MainMenuScreen.W266.TOGGLE) {
         return o00000000000.O00000000000 != null && !(o00000000000.O00000000000.O0000000000000 <= o00000000000.O00000000000.O000000000000)
            ? O000000000(
               (o00000000000.O00000000000.O0000000000() - o00000000000.O00000000000.O000000000000)
                  / (o00000000000.O00000000000.O0000000000000 - o00000000000.O00000000000.O000000000000),
               0.0F,
               1.0F
            )
            : 0.0F;
      } else {
         return o00000000000.O000000000000 != null && o00000000000.O000000000000.O0000000000() ? 1.0F : 0.0F;
      }
   }

   private static String O000000000(MainMenuScreen.W267 o00000000000) {
      if (o00000000000.O0000000000 != MainMenuScreen.W266.TOGGLE) {
         float var1 = o00000000000.O00000000000 == null ? 0.0F : o00000000000.O00000000000.O0000000000();

         return switch (o00000000000.O0000000000000) {
            case PIXELS -> Math.round(var1) + " px";
            case MULTIPLIER -> String.format(Locale.ROOT, "%.2fx", var1);
            case PERCENT -> Math.round(var1 * 100.0F) + "%";
            case SCALE -> Math.round(var1 * 100.0F) + "%";
         };
      } else {
         return o00000000000.O000000000000 != null && o00000000000.O000000000000.O0000000000() ? "ON" : "OFF";
      }
   }

   private static void O00000000000() {
      MenuModule.O0000000000O0O();
   }

   private static void O000000000000() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }

   private MainMenuScreen.W281 O00000000(int i, int j, int k, float f, float g, long l) {
      float var8 = Math.max(0.0F, (float)(l - this.O0000000000OO) / 1.0E9F);
      float var9 = O000000000(O000000000000O(this.O000000000O0O, this.O000000000O0O0), 0.0F, 3.0F);
      float var10 = Math.max((float)Math.exp(-var8 * 1.45F), O000000000(var9 * 0.3F, 0.0F, 1.0F));
      float var11 = O000000000(O000000000(this.O0000000000OO0 / 1.25F, 0.0F, 1.0F));
      float var12 = O0000000000000(i, j);
      float var13 = 0.0F;
      ArrayList var14 = new ArrayList(this.O00000000000O0.size());

      for (int var15 = 0; var15 < this.O00000000000O0.size(); var15++) {
         MainMenuScreen.W272 var16 = this.O00000000000O0.get(var15);
         float var17 = (this.O0000000000OO0 - 0.18F - var15 * 0.058F) / 1.08F;
         float var18 = O000000000(O000000000(var17, 0.0F, 1.0F));
         float var19 = (1.0F - var18) * 14.0F * var12;
         var13 = Math.max(var13, var16.O0000000000O0O);
         var14.add(
            new MainMenuScreen.W265(
               var16.O00000000,
               var16.O0000000000000,
               var16.O000000000000O + var19,
               var16.O00000000000O,
               var16.O00000000000O0,
               var16.O00000000000OO,
               var16.O0000000000O,
               var16.O0000000000O0,
               var16.O0000000000O00,
               var18,
               var16.O0000000000O0O,
               46.0F * var12,
               var16.O0000000000OO,
               var16.O0000000000OO0,
               var16.O0000000000OOO,
               var16.O000000000O
            )
         );
      }

      var13 = Math.max(var13, this.O00000000OO0OO);
      MainMenuScreen.W277 var31 = new MainMenuScreen.W277(
         this.O00000000OO,
         this.O00000000OO0,
         this.O00000000OO00,
         this.O00000000OO000,
         this.O00000000OO00O,
         this.O00000000OO0O,
         this.O00000000OO0O0,
         O000000000(O000000000(this.O0000000000OO0 / 1.18F, 0.0F, 1.0F)),
         this.O00000000OO0OO,
         this.O00000000OOO,
         this.O00000000OOO0,
         this.O00000000OOO00,
         this.O0000000O0
      );
      MainMenuScreen.W275 var32 = new MainMenuScreen.W275(
         this.O00000000OOO0O, this.O00000000OOOO, this.O00000000OOOO0, this.O00000000OOOOO, this.O0000000O, this.O0000000O0, this.O00000000O0OO0 ? 1.0F : 0.0F
      );
      ArrayList var33 = new ArrayList(O00000000O000);

      for (int var34 = 0; var34 < O00000000O000; var34++) {
         MainMenuScreen.W273 var36 = this.O00000000O0O0[var34];
         var13 = Math.max(var13, var36.O0000000000O0O);
         var33.add(
            new MainMenuScreen.W274(
               var36.O00000000.label(),
               var36.O00000000.description(),
               var36.O000000000000,
               var36.O0000000000000,
               var36.O00000000000O0,
               var36.O00000000000OO,
               var36.O0000000000O,
               var36.O0000000000O0,
               var36.O0000000000O00,
               var36.O0000000000O0O,
               var36.O0000000000OO,
               var36.O0000000000OO0,
               var36.O0000000000OOO,
               var36.O000000000O,
               var36.O000000000O0,
               this.O0000000O0,
               var34
            )
         );
      }

      ArrayList var35 = new ArrayList(O00000000O000O);

      for (int var37 = 0; var37 < O00000000O000O; var37++) {
         MainMenuScreen.W269 var20 = this.O00000000O0O00[var37];
         var13 = Math.max(var13, var20.O0000000000O0O);
         var35.add(
            new MainMenuScreen.W270(
               var20.O00000000.O00000000,
               var20.O00000000.O000000000,
               O000000000(var20.O00000000),
               var20.O000000000000,
               var20.O0000000000000,
               var20.O00000000000O0,
               var20.O00000000000OO,
               var20.O0000000000O,
               var20.O0000000000O0,
               var20.O0000000000O00,
               var20.O0000000000O0O,
               var20.O0000000000OO,
               var20.O0000000000OO0,
               var20.O0000000000OOO,
               var20.O000000000O,
               var20.O000000000O0,
               var20.O000000000O00,
               this.O0000000O0 * var20.O000000000O000,
               var20.O00000000.O0000000000 == MainMenuScreen.W266.SLIDER,
               var37
            )
         );
      }

      ArrayList var38 = new ArrayList(O00000000O00O0);

      for (int var39 = 0; var39 < O00000000O00O0; var39++) {
         MainMenuScreen.W279 var21 = this.O00000000O0O0O[var39];
         var38.add(
            new MainMenuScreen.W280(
               var21.O00000000.label(),
               var21.O0000000000000,
               var21.O000000000000O,
               var21.O00000000000O,
               var21.O00000000000O0,
               var21.O00000000000,
               var21.O000000000000,
               var39
            )
         );
      }

      var33.clear();
      var35.clear();
      var38.clear();
      MainMenuScreen.W283[] var40 = new MainMenuScreen.W283[14];

      for (int var41 = 0; var41 < 14; var41++) {
         MainMenuScreen.W282 var22 = this.O00000000000OO[var41];
         float var23 = Math.max(0.0F, this.O0000000000OO0 - var22.O0000000000);
         float var24 = var23 > 3.1F ? 0.0F : var22.O00000000000;
         var40[var41] = new MainMenuScreen.W283(var22.O00000000 / Math.max(1.0F, (float)i), var22.O000000000 / Math.max(1.0F, (float)j), var23, var24);
      }

      float var42 = O000000000(Math.min(i, j) * 0.148F, 102.0F * var12, 186.0F * var12);
      float var43 = var42 * 6.25F;
      float var44 = i * 0.5F + f * 1.65F * var12;
      float var45 = Math.max(50.0F * var12, j * 0.132F + g * 0.95F * var12);
      float var25 = var44 - var43 * 0.5F;
      float var26 = var45 + var42 * 0.5F - var43 * 0.5F;
      float var27 = 0.5F + 0.5F * (float)Math.sin(this.O0000000000OO0 * 0.82F);
      MainMenuScreen.W271 var28 = new MainMenuScreen.W271(var25, var26, var43, var43, var27);
      float var29 = var10 > 0.08F ? 1.0F : 0.86F;
      return new MainMenuScreen.W281(
         i,
         j,
         k,
         this.O0000000000OO0,
         this.O000000000O000,
         this.O000000000O00O,
         this.O000000000O000 / Math.max(1.0F, (float)i),
         this.O000000000O00O / Math.max(1.0F, (float)j),
         this.O000000000O0O,
         this.O000000000O0O0,
         var9,
         O000000000(this.O000000000OOO),
         O0000000000(this.O000000000OOO),
         O00000000000(this.O000000000OOO),
         O000000000(this.O000000000OOO0),
         O0000000000(this.O000000000OOO0),
         O00000000000(this.O000000000OOO0),
         -f * 0.0014F,
         -g * 0.0011F,
         f * 1.75F * var12,
         g * 1.35F * var12,
         f * 2.15F * var12,
         g * 1.72F * var12,
         var10,
         var29,
         var11,
         O000000000(var13, 0.0F, 1.0F),
         this.O000000000OOOO == Theme.SAKURA_BREEZE,
         this.O000000000OOOO == Theme.VERNAL_SOLSTICE,
         this.O000000000OOOO == Theme.MIDNIGHT_AZURE,
         this.O00000000O,
         var31,
         var32,
         var33,
         var35,
         var38,
         var28,
         var14,
         var40
      );
   }

   private void O00000000(MainMenuScreen.W281 o000000000O) {
      try {
         WildClient.O000000000000O();
         RenderManager var2 = WildClient.O00000000();
         if (var2 == null) {
            return;
         }

         O0000O00O0OOO0.W373 var3 = O0000O00O0OOO0.O00000000();

         try {
            var2.O00000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            float var4 = O0000000000000(o000000000O.framebufferWidth(), o000000000O.framebufferHeight());
            this.O000000000(var2, o000000000O, var4);

            for (MainMenuScreen.W265 var6 : o000000000O.buttons()) {
               float var7 = O000000000(var6.entry());
               float var8 = 30.0F * var4;
               float var9 = var6.x() + var6.width() * 0.5F;
               float var10 = var6.y() + var6.height() * 0.5F;
               float var11 = var10 + var8 * 0.17F;
               var2.O00000000(
                  FontRegistry.O00000000,
                  var9,
                  var11,
                  var8,
                  var6.label(),
                  o000000000O.lightMode()
                     ? (o000000000O.vernalSolstice() ? O00000000(0.0196F, 0.0667F, 0.0196F, var7) : O00000000(0.1F, 0.1F, 0.1F, var7))
                     : O00000000(1.0F, 1.0F, 1.0F, var7),
                  "c"
               );
            }

            this.O0000000000(var2, o000000000O, var4);
            this.O00000000(var2, o000000000O, var4);
            var2.O000000000();
         } finally {
            O0000O00O0OOO0.O00000000(var3);
         }
      } catch (Throwable var16) {
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, MainMenuScreen.W281 o000000000O, float f) {
      MainMenuScreen.W277 var4 = o000000000O.profileTrigger();
      if (var4 != null) {
         float var5 = O000000000(var4.entry()) * o000000000O.sceneEntry();
         if (var5 > 0.001F) {
            String var6 = "Graphics Console";
            String var7 = O000000O000O0.O00000000(this.O000000000000O()).O00000000();
            float var8 = 22.0F * f;
            float var9 = 22.0F * f;
            float var10 = var4.x() + 20.0F * f;
            float var11 = var4.y() + var4.height() * 0.43F;
            float var12 = var4.y() + var4.height() * 0.74F;
            int var13 = o000000000O.lightMode() ? O00000000(0.18F, 0.18F, 0.18F, 0.58F * var5) : O00000000(0.68F, 0.74F, 0.82F, 0.56F * var5);
            int var14 = o000000000O.lightMode() ? O00000000(0.06F, 0.06F, 0.07F, 0.9F * var5) : O00000000(0.96F, 0.98F, 1.0F, 0.92F * var5);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var10, var11, var8, var6, var13);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var10, var12, var9, var7, var14);
         }
      }

      MainMenuScreen.W275 var15 = o000000000O.profilePanel();
      if (var15 != null && o000000000O.profiles() != null && o000000000O.controls() != null) {
         float var16 = O000000000(var15.progress()) * o000000000O.sceneEntry();
         if (!(var16 <= 0.001F)) {
            float var17 = 30.0F * f;
            float var18 = 22.0F * f;
            float var19 = var15.x() + 24.0F * f;
            float var20 = var15.y() + 38.0F * f;
            float var21 = var15.y() + 62.0F * f;
            int var22 = o000000000O.lightMode() ? O00000000(0.06F, 0.06F, 0.07F, 0.94F * var16) : O00000000(0.97F, 0.98F, 1.0F, 0.94F * var16);
            int var23 = o000000000O.lightMode() ? O00000000(0.18F, 0.18F, 0.18F, 0.58F * var16) : O00000000(0.68F, 0.73F, 0.81F, 0.58F * var16);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000000, var19, var20, var17, "Graphics Console", var22);
            o0000O00OO0O0.O00000000(FontRegistry.O00000000, var19, var21, var18, "Единый ползунок качества — от плавности к кинематографии", var23);
            this.O00000000(o0000O00OO0O0, o000000000O, f, var15, var16, var19, var23);
         }
      }
   }

   private void O00000000(RenderManager o0000O00OO0O0, MainMenuScreen.W281 o000000000O, float f, MainMenuScreen.W275 o0000000000O0, float g, float h, int i) {
      int var8 = O000000O000O0.values().length;
      int var9 = this.O000000000000O();
      float var10 = var9;
      if (!(this.O0000000O00O < 0.0F) && !(this.O0000000O00O0 < 0.0F)) {
         float var11 = O000000000(this.O0000000000OO0 - this.O0000000O00O0, 0.0F, 0.05F);
         this.O0000000O00O0 = this.O0000000000OO0;
         this.O0000000O00O = this.O0000000O00O + (var10 - this.O0000000O00O) * (1.0F - (float)Math.pow(4.0E-5F, var11));
         if (Math.abs(var10 - this.O0000000O00O) < 5.0E-4F) {
            this.O0000000O00O = var10;
         }
      } else {
         this.O0000000O00O = var10;
         this.O0000000O00O0 = this.O0000000000OO0;
      }

      float var35 = 9.0F * f;
      float var12 = o0000000000O0.x() + 30.0F * f + var35;
      float var13 = o0000000000O0.x() + o0000000000O0.width() - 30.0F * f - var35;
      float var14 = var13 - var12;
      if (!(var14 < 1.0F)) {
         float var15 = o0000000000O0.y() + 138.0F * f;
         float var16 = Math.max(4.0F, 5.0F * f);
         int var17 = o000000000O.lightMode() ? O00000000(0.1F, 0.1F, 0.12F, 0.55F * g) : O00000000(0.7F, 0.76F, 0.84F, 0.55F * g);
         o0000O00OO0O0.O00000000(FontRegistry.O00000000000, h, o0000000000O0.y() + 104.0F * f, 12.5F * f, "КАЧЕСТВО ГРАФИКИ", var17);
         String var18 = O000000O000O0.O00000000(var9).O00000000();
         float var19 = 13.0F * f;
         float var20 = RenderManager.O00000000(FontRegistry.O00000000000, var18, var19).O00000000;
         o0000O00OO0O0.O00000000(
            FontRegistry.O00000000000,
            o0000000000O0.x() + o0000000000O0.width() - 24.0F * f - var20,
            o0000000000O0.y() + 104.0F * f,
            var19,
            var18,
            O000000000(this.O000000000OOO0, this.O000000000OOO, 0.6F, 0.95F * g)
         );
         float var21 = O000000000(this.O0000000O00O / (var8 - 1), 0.0F, 1.0F);
         float var22 = var12 + var14 * var21;
         int var23 = o000000000O.lightMode() ? O00000000(0.08F, 0.09F, 0.1F, 0.16F * g) : O00000000(1.0F, 1.0F, 1.0F, 0.1F * g);
         o0000O00OO0O0.O00000000(var12, var15 - var16 * 0.5F, var14, var16, var16 * 0.5F, var23);

         for (int var24 = 0; var24 < var8; var24++) {
            float var25 = var12 + var14 * ((float)var24 / (var8 - 1));
            float var26 = Math.max(1.5F, 2.0F * f);
            int var27 = o000000000O.lightMode() ? O00000000(0.1F, 0.1F, 0.12F, 0.22F * g) : O00000000(1.0F, 1.0F, 1.0F, 0.16F * g);
            o0000O00OO0O0.O00000000(var25 - var26, var15 - var26, var26 * 2.0F, var26 * 2.0F, var26, var27);
         }

         float var36 = Math.max(var16, var22 - var12);
         o0000O00OO0O0.O00000000(var12, var15 - var16 * 0.5F, var36, var16, var16 * 0.5F, O000000000(this.O000000000OOO0, this.O000000000OOO, var21, 0.9F * g));
         o0000O00OO0O0.O00000000(
            var22 - var35,
            var15 - var35,
            var35 * 2.0F,
            var35 * 2.0F,
            var35,
            13.0F * f,
            1.0F,
            O000000000(this.O000000000OOO0, this.O000000000OOO, var21, 0.5F * g)
         );
         o0000O00OO0O0.O00000000(
            var22 - var35,
            var15 - var35,
            var35 * 2.0F,
            var35 * 2.0F,
            var35,
            o000000000O.lightMode() ? O00000000(0.98F, 0.99F, 1.0F, 0.96F * g) : O00000000(0.95F, 0.98F, 1.0F, 0.95F * g)
         );
         float var37 = var35 * 0.5F;
         o0000O00OO0O0.O00000000(
            var22 - var37, var15 - var37, var37 * 2.0F, var37 * 2.0F, var37, O000000000(this.O000000000OOO0, this.O000000000OOO, var21, 0.95F * g)
         );
         float var38 = 13.0F * f;
         float var39 = var15 + 24.0F * f;

         for (int var28 = 0; var28 < var8; var28++) {
            String var29 = O000000O000O0.O00000000(var28).O00000000();
            float var30 = RenderManager.O00000000(FontRegistry.O00000000, var29, var38).O00000000;
            float var31 = var12 + var14 * ((float)var28 / (var8 - 1));
            float var32 = O000000000(var31 - var30 * 0.5F, o0000000000O0.x() + 16.0F * f, o0000000000O0.x() + o0000000000O0.width() - 16.0F * f - var30);
            boolean var33 = var28 == var9;
            int var34 = var33
               ? O000000000(this.O000000000OOO0, this.O000000000OOO, 0.6F, 0.96F * g)
               : (o000000000O.lightMode() ? O00000000(0.24F, 0.25F, 0.26F, 0.52F * g) : O00000000(0.6F, 0.66F, 0.74F, 0.52F * g));
            o0000O00OO0O0.O00000000(var33 ? FontRegistry.O00000000000 : FontRegistry.O00000000, var32, var39, var38, var29, var34);
         }
      }
   }

   private float[] O0000000000000() {
      if (this.client != null && this.client.getWindow() != null) {
         float var1 = O0000000000000(this.client.getWindow().getFramebufferWidth(), this.client.getWindow().getFramebufferHeight());
         float var2 = 9.0F * var1;
         float var3 = this.O00000000OOO0O + 30.0F * var1 + var2;
         float var4 = this.O00000000OOO0O + this.O00000000OOOO0 - 30.0F * var1 - var2;
         float var5 = this.O00000000OOOO + 138.0F * var1;
         return var4 - var3 < 1.0F ? null : new float[]{var3, var4, var5, var2, var1};
      } else {
         return null;
      }
   }

   private boolean O000000000000(float f, float g) {
      if (!this.O00000000O0OO0) {
         return false;
      } else {
         float[] var3 = this.O0000000000000();
         if (var3 == null) {
            return false;
         } else {
            float var4 = 18.0F * var3[4];
            return f >= var3[0] - var3[3] * 1.5F && f <= var3[1] + var3[3] * 1.5F && Math.abs(g - var3[2]) <= var4;
         }
      }
   }

   private void O00000000(float f) {
      float[] var2 = this.O0000000000000();
      if (var2 != null) {
         int var3 = O000000O000O0.values().length;
         float var4 = O000000000((f - var2[0]) / (var2[1] - var2[0]), 0.0F, 1.0F);
         int var5 = Math.max(0, Math.min(var3 - 1, Math.round(var4 * (var3 - 1))));
         if (var5 != this.O000000000000O()) {
            MenuModule.O00000000(var5);
         }
      }
   }

   private int O000000000000O() {
      int var1 = O000000O000O0.values().length - 1;
      return Math.max(0, Math.min(var1, Math.round(MenuModule.O000000000O0O0.O00000000000)));
   }

   private static int O000000000(int i, int j) {
      int var2 = Math.max(0, Math.min(255, j));
      return i & 16777215 | var2 << 24;
   }

   private void O000000000(RenderManager o0000O00OO0O0, MainMenuScreen.W281 o000000000O, float f) {
      MainMenuScreen.W271 var4 = o000000000O.logo();
      float var5 = O000000000(o000000000O.sceneEntry());
      float var6 = 0.5F + 0.5F * (float)Math.sin(this.O0000000000OO0 * 1.08F);
      float var7 = var4.height() / 6.25F;
      float var8 = var7 * 0.98F;
      float var9 = var8 * (1.08F + var6 * 0.035F);
      float var10 = RenderManager.O00000000(FontRegistry.O00000000000O, "W", var8).O00000000;
      float var11 = RenderManager.O00000000(FontRegistry.O00000000000O, "W", var9).O00000000;
      float var12 = var4.x() + var4.width() * 0.5F;
      float var13 = var4.y() + var4.height() * 0.5F;
      float var14 = var12 - var10 * 0.5F;
      float var15 = var12 - var11 * 0.5F;
      float var16 = var13 + var7 * 0.148F;
      float var17 = var13 + var7 * 0.15F;
      o0000O00OO0O0.O00000000(FontRegistry.O00000000000O, var15, var17, var9, "W", O000000000(this.O000000000OOO0, this.O000000000OOO, var6, 0.24F * var5));
      o0000O00OO0O0.O00000000(
         FontRegistry.O00000000000O,
         var14,
         var16,
         var8,
         "W",
         o000000000O.lightMode()
            ? (o000000000O.vernalSolstice() ? O00000000(0.0196F, 0.0667F, 0.0196F, var5) : O00000000(0.1F, 0.1F, 0.1F, var5))
            : O00000000(1.0F, 1.0F, 1.0F, var5)
      );
   }

   private void O0000000000(RenderManager o0000O00OO0O0, MainMenuScreen.W281 o000000000O, float f) {
      String var4 = "слито протером";
      String var5 = "<3";
      float var6 = 18.0F * f;
      float var7 = 24.0F * f;
      float var8 = RenderManager.O00000000(FontRegistry.O00000000, var4, var6).O00000000;
      float var9 = RenderManager.O00000000(FontRegistry.O00000000, var5, var6).O00000000;
      float var10 = o000000000O.framebufferWidth() - var7 - var8 - var9;
      float var11 = o000000000O.framebufferHeight() - var7 - var6 * 0.42F;
      float var12 = O000000000(o000000000O.sceneEntry());
      float var13 = 0.5F + 0.5F * (float)Math.sin(this.O0000000000OO0 * 1.15F);
      int var14 = o000000000O.lightMode() ? O00000000(0.34F, 0.34F, 0.34F, 0.64F * var12) : O00000000(0.86F, 0.9F, 0.94F, 0.58F * var12);
      int var15 = O000000000(this.O000000000OOO0, this.O000000000OOO, var13, (0.42F + 0.34F * var13) * var12);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var10, var11, var6, var4, var14);
      o0000O00OO0O0.O00000000(FontRegistry.O00000000, var10 + var8, var11, var6, var5, var15);
   }

   private void O00000000(MainMenuScreen.W264 o00000000) {
      MinecraftClient var2 = this.client == null ? MinecraftClient.getInstance() : this.client;
      if (var2 != null) {
         switch (o00000000) {
            case SINGLEPLAYER:
               var2.execute(() -> var2.setScreen(new SelectWorldScreen(this)));
               break;
            case MULTIPLAYER:
               var2.execute(() -> var2.setScreen(new WildMultiplayerScreen(this)));
               break;
            case ALT_MANAGER:
               var2.execute(() -> var2.setScreen(new O00000OO0OOO00(this)));
               break;
            case OPTIONS:
               var2.execute(() -> var2.setScreen(new OptionsScreen(this, var2.options)));
               break;
            case QUIT:
               var2.execute(var2::scheduleStop);
         }
      }
   }

   private float O00000000(Window window, double d) {
      return (float)(d * window.getFramebufferWidth() / Math.max(1.0, (double)window.getScaledWidth()));
   }

   private float O000000000(Window window, double d) {
      return (float)(d * window.getFramebufferHeight() / Math.max(1.0, (double)window.getScaledHeight()));
   }

   private static float O0000000000000(float f, float g) {
      float var2 = O000000000(MenuModule.O000000000OO0.O0000000000() / 0.86F, 0.72F, 1.46F);
      return O000000000(Math.min(f / 1920.0F, g / 1080.0F) * 1.16F * var2, 0.66F, 1.56F);
   }

   static float O00000000(float f, float g, float h, float i, float j, float k, float l) {
      float var7 = h + j * 0.5F;
      float var8 = i + k * 0.5F;
      float var9 = j * 0.5F - l;
      float var10 = k * 0.5F - l;
      float var11 = Math.abs(f - var7) - var9;
      float var12 = Math.abs(g - var8) - var10;
      float var13 = Math.max(var11, 0.0F);
      float var14 = Math.max(var12, 0.0F);
      return (float)Math.sqrt(var13 * var13 + var14 * var14) + Math.min(Math.max(var11, var12), 0.0F) - l;
   }

   private static float O000000000000O(float f, float g) {
      return (float)Math.sqrt(f * f + g * g);
   }

   private static boolean O00000000(float f, float g, float h, float i, float j, float k) {
      return f >= h && f <= h + j && g >= i && g <= i + k;
   }

   private int O00000000000O(float f, float g) {
      if (!this.O00000000O0OO0 && this.O0000000O0 <= 0.18F) {
         return -1;
      } else {
         for (int var3 = 0; var3 < O00000000O00O0; var3++) {
            if (this.O00000000O0O0O[var3].O00000000(f, g)) {
               return var3;
            }
         }

         return -1;
      }
   }

   private float O00000000(int i) {
      for (MainMenuScreen.W279 var5 : this.O00000000O0O0O) {
         if (i >= var5.O00000000.start() && i < var5.O00000000.start() + var5.O00000000.count()) {
            return var5.O00000000000;
         }
      }

      return 1.0F;
   }

   private static float O000000000(float f) {
      float var1 = O000000000(f, 0.0F, 1.0F);
      return var1 * var1 * var1 * (var1 * (var1 * 6.0F - 15.0F) + 10.0F);
   }

   private static float O000000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static float O000000000(int i) {
      return (i >> 16 & 0xFF) / 255.0F;
   }

   private static float O0000000000(int i) {
      return (i >> 8 & 0xFF) / 255.0F;
   }

   private static float O00000000000(int i) {
      return (i & 0xFF) / 255.0F;
   }

   private static int O00000000(float f, float g, float h, float i) {
      int var4 = Math.round(O000000000(f, 0.0F, 1.0F) * 255.0F);
      int var5 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      int var6 = Math.round(O000000000(h, 0.0F, 1.0F) * 255.0F);
      int var7 = Math.round(O000000000(i, 0.0F, 1.0F) * 255.0F);
      return var7 << 24 | var4 << 16 | var5 << 8 | var6;
   }

   private static int O000000000(int i, int j, float f, float g) {
      float var4 = O000000000(f, 0.0F, 1.0F);
      int var5 = O0000O000OO000.O00000000000(i, j, var4);
      int var6 = Math.round(O000000000(g, 0.0F, 1.0F) * 255.0F);
      return var6 << 24 | var5;
   }

   static enum W264 {
      SINGLEPLAYER,
      MULTIPLAYER,
      ALT_MANAGER,
      OPTIONS,
      QUIT;
   }

   public record W265(
      String label,
      float x,
      float y,
      float width,
      float height,
      float radius,
      float hover,
      float magnet,
      float press,
      float entry,
      float flash,
      float bleed,
      float scale,
      float localMouseX,
      float localMouseY,
      float velocity
   ) {
   }

   static enum W266 {
      SLIDER,
      TOGGLE;
   }

   static final class W267 {
      final String O00000000;
      final String O000000000;
      final MainMenuScreen.W266 O0000000000;
      final NumberSetting O00000000000;
      final BooleanSetting O000000000000;
      final MainMenuScreen.W268 O0000000000000;

      private W267(
         String string,
         String string2,
         MainMenuScreen.W266 o0000000000,
         NumberSetting o000000O000,
         BooleanSetting o0000000OOO0O0,
         MainMenuScreen.W268 o000000000000
      ) {
         this.O00000000 = string;
         this.O000000000 = string2;
         this.O0000000000 = o0000000000;
         this.O00000000000 = o000000O000;
         this.O000000000000 = o0000000OOO0O0;
         this.O0000000000000 = o000000000000;
      }

      static MainMenuScreen.W267 O00000000(String string, String string2, NumberSetting o000000O000, MainMenuScreen.W268 o000000000000) {
         return new MainMenuScreen.W267(string, string2, MainMenuScreen.W266.SLIDER, o000000O000, null, o000000000000);
      }

      static MainMenuScreen.W267 O00000000(String string, String string2, BooleanSetting o0000000OOO0O0) {
         return new MainMenuScreen.W267(string, string2, MainMenuScreen.W266.TOGGLE, null, o0000000OOO0O0, MainMenuScreen.W268.PERCENT);
      }
   }

   static enum W268 {
      PIXELS,
      MULTIPLIER,
      PERCENT,
      SCALE;
   }

   static final class W269 {
      final MainMenuScreen.W267 O00000000;
      final O00000OOO00 O000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO = 1.0F;
      float O0000000000OO0 = 0.5F;
      float O0000000000OOO = 0.5F;
      float O000000000O;
      float O000000000O0;
      float O000000000O00;
      float O000000000O000 = 1.0F;

      W269(MainMenuScreen.W267 o00000000000) {
         this.O00000000 = o00000000000;
      }

      void O00000000() {
         this.O0000000000O0 = 0.0F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000O0O = 0.0F;
         this.O0000000000OO = 1.0F;
         this.O0000000000OO0 = 0.5F;
         this.O0000000000OOO = 0.5F;
         this.O000000000O = 0.0F;
         this.O000000000O0 = 0.0F;
         this.O000000000O00 = 0.0F;
         this.O000000000O000 = 1.0F;
         this.O000000000000 = this.O0000000000;
         this.O0000000000000 = this.O00000000000;
         this.O00000000000O0 = this.O000000000000O;
         this.O00000000000OO = this.O00000000000O;
         this.O000000000.O00000000(1.0F);
      }
   }

   public record W270(
      String label,
      String description,
      String valueText,
      float x,
      float y,
      float width,
      float height,
      float radius,
      float hover,
      float press,
      float flash,
      float scale,
      float localMouseX,
      float localMouseY,
      float active,
      float value,
      float velocity,
      float entry,
      boolean slider,
      int index
   ) {
   }

   public record W271(float x, float y, float width, float height, float pulse) {
   }

   static final class W272 {
      final String O00000000;
      final MainMenuScreen.W264 O000000000;
      final O00000OOO00 O0000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO = 1.0F;
      float O0000000000OO0 = 0.5F;
      float O0000000000OOO = 0.5F;
      float O000000000O;

      W272(String string, MainMenuScreen.W264 o00000000) {
         this.O00000000 = string;
         this.O000000000 = o00000000;
      }

      void O00000000() {
         this.O0000000000O = 0.0F;
         this.O0000000000O0 = 0.0F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000O0O = 0.0F;
         this.O0000000000OO = 1.0F;
         this.O0000000000OO0 = 0.5F;
         this.O0000000000OOO = 0.5F;
         this.O000000000O = 0.0F;
         this.O0000000000.O00000000(1.0F);
      }

      boolean O00000000(float f, float g) {
         return MainMenuScreen.O00000000(f, g, this.O00000000000, this.O000000000000, this.O00000000000O, this.O00000000000O0, this.O00000000000OO) <= 0.0F;
      }
   }

   static final class W273 {
      final MainMenuScreen.W276 O00000000;
      final O00000OOO00 O000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      float O0000000000;
      float O00000000000;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
      float O00000000000OO;
      float O0000000000O;
      float O0000000000O0;
      float O0000000000O00;
      float O0000000000O0O;
      float O0000000000OO = 1.0F;
      float O0000000000OO0 = 0.5F;
      float O0000000000OOO = 0.5F;
      float O000000000O;
      float O000000000O0;

      W273(MainMenuScreen.W276 o0000000000O00) {
         this.O00000000 = o0000000000O00;
      }

      void O00000000() {
         this.O0000000000O0 = 0.0F;
         this.O0000000000O00 = 0.0F;
         this.O0000000000O0O = 0.0F;
         this.O0000000000OO = 1.0F;
         this.O0000000000OO0 = 0.5F;
         this.O0000000000OOO = 0.5F;
         this.O000000000O = 0.0F;
         this.O000000000O0 = 0.0F;
         this.O000000000000 = this.O0000000000;
         this.O0000000000000 = this.O00000000000;
         this.O00000000000O0 = this.O000000000000O;
         this.O00000000000OO = this.O00000000000O;
         this.O000000000.O00000000(1.0F);
      }
   }

   public record W274(
      String label,
      String description,
      float x,
      float y,
      float width,
      float height,
      float radius,
      float hover,
      float press,
      float flash,
      float scale,
      float localMouseX,
      float localMouseY,
      float selected,
      float velocity,
      float entry,
      int index
   ) {
   }

   public record W275(float x, float y, float width, float height, float radius, float progress, float open) {
   }

   record W276(String label, String description, O000000O000O0 preset) {
   }

   public record W277(
      float x,
      float y,
      float width,
      float height,
      float radius,
      float hover,
      float press,
      float entry,
      float flash,
      float scale,
      float localMouseX,
      float localMouseY,
      float panelProgress
   ) {
   }

   record W278(String label, int start, int count) {
      int rows() {
         return (this.count + 1) / 2;
      }
   }

   static final class W279 {
      final MainMenuScreen.W278 O00000000;
      final O00000OOO00 O000000000 = new O00000OOO00(O0000O000O0O00.O000000000000());
      boolean O0000000000;
      float O00000000000 = 1.0F;
      float O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;

      W279(MainMenuScreen.W278 o0000000000OO) {
         this.O00000000 = o0000000000OO;
         this.O000000000.O00000000(1.0F);
      }

      void O00000000() {
         this.O0000000000 = false;
         this.O00000000000 = 1.0F;
         this.O000000000000 = 0.0F;
         this.O0000000000000 = 0.0F;
         this.O000000000000O = 0.0F;
         this.O00000000000O = 0.0F;
         this.O00000000000O0 = 0.0F;
         this.O000000000.O00000000(1.0F);
      }

      boolean O00000000(float f, float g) {
         return this.O00000000000O > 0.0F
            && f >= this.O0000000000000
            && f <= this.O0000000000000 + this.O00000000000O
            && g >= this.O000000000000O
            && g <= this.O000000000000O + this.O00000000000O0;
      }
   }

   public record W280(String label, float x, float y, float width, float height, float openAmount, float hover, int index) {
   }

   public record W281(
      int framebufferWidth,
      int framebufferHeight,
      int drawFramebuffer,
      float time,
      float mouseX,
      float mouseY,
      float mouseNormX,
      float mouseNormY,
      float mouseVelocityX,
      float mouseVelocityY,
      float mouseSpeed,
      float accentTopR,
      float accentTopG,
      float accentTopB,
      float accentBottomR,
      float accentBottomG,
      float accentBottomB,
      float backgroundParallaxX,
      float backgroundParallaxY,
      float particleParallaxX,
      float particleParallaxY,
      float uiParallaxX,
      float uiParallaxY,
      float activeMotion,
      float backgroundScale,
      float sceneEntry,
      float clickFlash,
      boolean sakuraBreeze,
      boolean vernalSolstice,
      boolean midnightAzure,
      boolean lightMode,
      MainMenuScreen.W277 profileTrigger,
      MainMenuScreen.W275 profilePanel,
      List<MainMenuScreen.W274> profiles,
      List<MainMenuScreen.W270> controls,
      List<MainMenuScreen.W280> sections,
      MainMenuScreen.W271 logo,
      List<MainMenuScreen.W265> buttons,
      MainMenuScreen.W283[] trails
   ) {
      public MainMenuScreen.W283 trail(int i) {
         return this.trails != null && i >= 0 && i < this.trails.length && this.trails[i] != null
            ? this.trails[i]
            : new MainMenuScreen.W283(0.0F, 0.0F, 100.0F, 0.0F);
      }
   }

   static final class W282 {
      float O00000000;
      float O000000000;
      float O0000000000 = -100.0F;
      float O00000000000;
   }

   public record W283(float x, float y, float age, float strength) {
   }
}

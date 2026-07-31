package l;

import java.awt.Color;
import java.net.URI;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.gui.screen.multiplayer.MultiplayerScreen;
import net.minecraft.client.gui.screen.option.OptionsScreen;
import net.minecraft.client.gui.screen.world.SelectWorldScreen;
import net.minecraft.text.Text;
import net.minecraft.util.Util;

public class Widget23 extends Screen implements Helper160 {
   private static final String TELEGRAM_URL = "https://t.me/releonclient";
   private static final String DISCORD_URL = "https://discord.gg/X8XS5bbGFW";
   private static final String YOUTUBE_URL = "https://www.youtube.com/@releonclient";
   public int x;
   public int y;
   public int width;
   public int height;
   private final Helper55 textAnimation = new Helper55();
   private final Helper96 gifRender = new Helper96("minecraft:gif/backgrounds/mainmenutype1", 1);
   private final Animation2 mainFadeAnimation = new Animation2();
   private final Animation2 screenIntroAnimation = new Animation2();
   private long lastQuitClickTime = 0L;
   private static final long QUIT_CONFIRM_DELAY = 1500L;
   private float singleHover = 0.0F;
   private float multiHover = 0.0F;
   private float altHover = 0.0F;
   private float settingsHover = 0.0F;
   private float quitHover = 0.0F;
   private float discordHover = 0.0F;
   private float telegramHover = 0.0F;
   private float youtubeHover = 0.0F;

   public Widget23() {
      super(Text.of("MainMenu"));
      this.mainFadeAnimation.method5003(250).method5004(1.0);
      this.mainFadeAnimation.method4997(Helper450.FORWARDS);
      this.screenIntroAnimation.method5003(320).method5004(1.0);
      this.screenIntroAnimation.method4997(Helper450.FORWARDS);
   }

   @Override
   protected void init() {
      super.init();
      this.screenIntroAnimation.method4997(Helper450.FORWARDS);
      this.screenIntroAnimation.method4993();
   }

   @Override
   public void tick() {
      super.tick();
      this.textAnimation.method642();
   }

   @Override
   public void render(DrawContext context, int mouseX, int mouseY, float delta) {
      this.x = window.getScaledWidth();
      this.y = window.getScaledHeight();
      this.width = window.getScaledWidth();
      this.height = window.getScaledHeight();
      float var5 = 128.0F;
      float var6 = 20.0F;
      float var7 = 22.0F;
      float var8 = this.width / 2.0F - var5 / 2.0F;
      float var9 = this.height / 2.0F - 36.0F;
      float var10 = 96.0F;
      float var11 = 28.0F;
      float var12 = var9 + var7 * 3.0F;
      float var13 = var8 + var5 - var11;
      float var14 = var12 + 26.0F;
      float var15 = 20.0F;
      float var16 = 8.0F;
      float var17 = this.width / 2.0F - (var15 * 3.0F + var16 * 2.0F) / 2.0F;
      this.gifRender.method908(context.getMatrices(), 0.0F, 0.0F, this.width, this.height);
      image.method678("textures/mainmenu/backmenu.png")
         .method677(Helper80.method841(context.getMatrices(), 0.0, 0.0, this.width, this.height).method823(-1).method840());
      rectangle.method677(
         Helper80.method841(context.getMatrices(), -4.0, -4.0, this.width + 8, this.height + 8).method823(new Color(0, 0, 0, 185).getRGB()).method840()
      );
      float var18 = (float)Math.max(0.0, Math.min(1.0, this.screenIntroAnimation.method5000()));
      float var19 = (float)Math.pow(var18, 1.25);
      double var20 = this.mainFadeAnimation.method5000();
      int var22 = (int)(255.0 * var20 * var19);
      int var23 = this.method3757(new Color(196, 196, 204, 148).getRGB(), var22);
      int var24 = this.method3757(new Color(148, 148, 156, 116).getRGB(), var22);
      int var25 = this.method3757(new Color(122, 122, 130, 108).getRGB(), var22);
      int var26 = this.method3757(new Color(104, 104, 112, 88).getRGB(), var22);
      this.singleHover = this.method3756(this.singleHover, this.method3759(mouseX, mouseY, var8, var9, var5, var6));
      this.multiHover = this.method3756(this.multiHover, this.method3759(mouseX, mouseY, var8, var9 + var7, var5, var6));
      this.altHover = this.method3756(this.altHover, this.method3759(mouseX, mouseY, var8, var9 + var7 * 2.0F, var5, var6));
      this.settingsHover = this.method3756(this.settingsHover, this.method3759(mouseX, mouseY, var8, var12, var10, var6));
      this.quitHover = this.method3756(this.quitHover, this.method3759(mouseX, mouseY, var13, var12, var11, var6));
      this.discordHover = this.method3756(this.discordHover, this.method3759(mouseX, mouseY, var17, var14, var15, var15));
      this.telegramHover = this.method3756(this.telegramHover, this.method3759(mouseX, mouseY, var17 + var15 + var16, var14, var15, var15));
      this.youtubeHover = this.method3756(this.youtubeHover, this.method3759(mouseX, mouseY, var17 + (var15 + var16) * 2.0F, var14, var15, var15));
      if (var20 > 0.01F) {
         Helper103.method927(18, Helper101.REGULAR).method1477(context.getMatrices(), "Releon", this.width / 2.0F, var9 - 25.0F, var23);
         Helper103.method927(12, Helper101.REGULAR).method1477(context.getMatrices(), "1.21.4", this.width / 2.0F, var9 - 14.5F, var24);
         this.method3754(context, var8, var9, var5, var6, "d", "SinglePlayer", var22, this.singleHover, false);
         this.method3754(context, var8, var9 + var7, var5, var6, "o", "MultiPlayer", var22, this.multiHover, false);
         this.method3754(context, var8, var9 + var7 * 2.0F, var5, var6, "l", "Accounts", var22, this.altHover, false);
         this.method3754(context, var8, var12, var10, var6, "s", "Settings", var22, this.settingsHover, false);
         this.method3754(context, var13, var12, var11, var6, "i", "", var22, this.quitHover, true);
         this.method3755(context, var17, var14, var15, "d", var22, this.discordHover);
         this.method3755(context, var17 + var15 + var16, var14, var15, "t", var22, this.telegramHover);
         this.method3755(context, var17 + (var15 + var16) * 2.0F, var14, var15, "y", var22, this.youtubeHover);
         Helper103.method927(11, Helper101.REGULAR)
            .method1477(context.getMatrices(), "© Releon Client 2026", this.width / 2.0F, this.height - 21.0F, var25);
         Helper103.method927(10, Helper101.REGULAR).method1477(context.getMatrices(), "All rights reserved", this.width / 2.0F, this.height - 12.0F, var26);
      }

      super.render(context, mouseX, mouseY, delta);
   }

   private void method3754(DrawContext var1, float var2, float var3, float var4, float var5, String var6, String var7, int var8, float var9, boolean var10) {
      int var11 = Math.min(255, Math.max(0, (int)(170.0F * (var8 / 255.0F))));
      int var12 = this.method3757(new Color(96, 96, 96, 28 + (int)(14.0F * var9)).getRGB(), var8);
      int var13 = this.method3757(new Color(36 + (int)(6.0F * var9), 36 + (int)(6.0F * var9), 40 + (int)(10.0F * var9), var11).getRGB(), var8);
      int var14 = this.method3757(new Color(30 + (int)(6.0F * var9), 30 + (int)(6.0F * var9), 35 + (int)(10.0F * var9), var11).getRGB(), var8);
      int var15 = this.method3757(new Color(54 + (int)(24.0F * var9), 54 + (int)(18.0F * var9), 62 + (int)(42.0F * var9), var11).getRGB(), var8);
      int var16 = this.method3757(new Color(42 + (int)(22.0F * var9), 42 + (int)(16.0F * var9), 50 + (int)(38.0F * var9), var11).getRGB(), var8);
      int var17 = this.method3757(new Color(198 + (int)(40.0F * var9), 198 + (int)(40.0F * var9), 204 + (int)(36.0F * var9)).getRGB(), var8);
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), var2, var3, var4, var5)
            .method826(5.0F)
            .method835(1.0F)
            .method839(var12)
            .method825(var15, var13, var16, var14)
            .method840()
      );
      if (var10) {
         Helper103.method927(18, Helper101.ICONSTYPENEW).method1477(var1.getMatrices(), var6, var2 + var4 / 2.0F + 1.0F, var3 + var5 / 2.0F - 2.0F, var17);
      } else {
         Helper103.method927(15, Helper101.ICONSTYPENEW).method1474(var1.getMatrices(), var6, var2 + 7.0F, var3 + var5 / 2.0F - 1.0F, var17);
         Helper103.method927(15, Helper101.DEFAULT).method1477(var1.getMatrices(), var7, var2 + var4 / 2.0F, var3 + var5 / 2.0F - 2.0F, var17);
      }
   }

   private void method3755(DrawContext var1, float var2, float var3, float var4, String var5, int var6, float var7) {
      int var8 = this.method3757(new Color(182, 182, 188, 104 + (int)(66.0F * var7)).getRGB(), var6);
      Helper103.method927(20, Helper101.SOCIALS).method1477(var1.getMatrices(), var5, var2 + var4 / 2.0F + 1.0F, var3 + var4 / 2.0F + 5.0F, var8);
   }

   private float method3756(float var1, boolean var2) {
      float var3 = var2 ? 1.0F : 0.0F;
      return var1 + (var3 - var1) * 0.18F;
   }

   private int method3757(int var1, int var2) {
      Color var3 = new Color(var1, true);
      return new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), Math.min(255, (int)(var3.getAlpha() / 255.0 * var2))).getRGB();
   }

   @Override
   public boolean mouseClicked(double mouseX, double mouseY, int button) {
      float var6 = 128.0F;
      float var7 = 20.0F;
      float var8 = 22.0F;
      float var9 = mc.getWindow().getScaledWidth() / 2.0F - var6 / 2.0F;
      float var10 = mc.getWindow().getScaledHeight() / 2.0F - 36.0F;
      float var11 = 96.0F;
      float var12 = 28.0F;
      float var13 = var10 + var8 * 3.0F;
      float var14 = var9 + var6 - var12;
      float var15 = var13 + 26.0F;
      float var16 = 20.0F;
      float var17 = 8.0F;
      float var18 = mc.getWindow().getScaledWidth() / 2.0F - (var16 * 3.0F + var17 * 2.0F) / 2.0F;
      if (button == 0) {
         if (this.method3759(mouseX, mouseY, var9, var10, var6, var7)) {
            mc.setScreen(new SelectWorldScreen(this));
            return true;
         }

         if (this.method3759(mouseX, mouseY, var9, var10 + var8, var6, var7)) {
            mc.setScreen(new MultiplayerScreen(this));
            return true;
         }

         if (this.method3759(mouseX, mouseY, var9, var10 + var8 * 2.0F, var6, var7)) {
            mc.setScreen(new Widget29(this));
            return true;
         }

         if (this.method3759(mouseX, mouseY, var9, var13, var11, var7)) {
            mc.setScreen(new OptionsScreen(this, mc.options));
            return true;
         }

         if (this.method3759(mouseX, mouseY, var14, var13, var12, var7)) {
            long var19 = System.currentTimeMillis();
            if (var19 - this.lastQuitClickTime < 1500L) {
               mc.stop();
            } else {
               this.lastQuitClickTime = var19;
            }

            return true;
         }

         if (this.method3759(mouseX, mouseY, var18, var15, var16, var16)) {
            this.method3758("https://discord.gg/X8XS5bbGFW");
            return true;
         }

         if (this.method3759(mouseX, mouseY, var18 + var16 + var17, var15, var16, var16)) {
            this.method3758("https://t.me/releonclient");
            return true;
         }

         if (this.method3759(mouseX, mouseY, var18 + (var16 + var17) * 2.0F, var15, var16, var16)) {
            this.method3758("https://www.youtube.com/@releonclient");
            return true;
         }
      }

      return super.mouseClicked(mouseX, mouseY, button);
   }

   private void method3758(String var1) {
      try {
         Util.getOperatingSystem().open(URI.create(var1));
      } catch (Exception var3) {
      }
   }

   private boolean method3759(double var1, double var3, float var5, float var6, float var7, float var8) {
      return var1 >= var5 && var1 <= var5 + var7 && var3 >= var6 && var3 <= var6 + var8;
   }

   @Override
   public boolean mouseScrolled(double mouseX, double mouseY, double horizontalAmount, double verticalAmount) {
      return super.mouseScrolled(mouseX, mouseY, horizontalAmount, verticalAmount);
   }

   @Override
   public boolean mouseDragged(double mouseX, double mouseY, int button, double deltaX, double deltaY) {
      return super.mouseDragged(mouseX, mouseY, button, deltaX, deltaY);
   }

   @Override
   public boolean mouseReleased(double mouseX, double mouseY, int button) {
      return super.mouseReleased(mouseX, mouseY, button);
   }

   @Override
   public boolean charTyped(char chr, int modifiers) {
      return super.charTyped(chr, modifiers);
   }

   @Override
   public boolean keyPressed(int keyCode, int scanCode, int modifiers) {
      return keyCode == 256 ? true : super.keyPressed(keyCode, scanCode, modifiers);
   }

   @Override
   public boolean shouldCloseOnEsc() {
      return false;
   }
}

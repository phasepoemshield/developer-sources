package l;

import com.mojang.authlib.GameProfile;
import com.mojang.blaze3d.systems.RenderSystem;
import fat.releon.Releon;
import java.awt.Color;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.MathHelper;
import org.joml.Matrix4f;
import org.lwjgl.glfw.GLFW;

public class Helper402 implements Helper160 {
   private final Helper377 accountRepository = Releon.method71().method37();
   private String currentAccount = "";
   private boolean typing = false;
   private String typedText = "";
   private int cursorPos = 0;
   private int selStart = -1;
   private int selEnd = -1;
   private long lastClick = 0L;
   private float textXOffset = 0.0F;
   private boolean dragging = false;
   private static final int MIN_LENGTH = 3;
   private static final int MAX_LENGTH = 16;
   private final Random rand = new Random();
   private float scroll = 0.0F;
   private float smoothedScroll = 0.0F;
   private float panelX;
   private float panelY;
   private final float panelWidth = 160.0F;
   private final float panelHeight = 210.0F;
   private float containerX;
   private float containerY;
   private float containerW;
   private float containerH;
   private float accountsX;
   private float accountsY;
   private float accountsW;
   private float accountsH;
   private float controlsX;
   private float controlsY;
   private float controlsW;
   private float controlsH;
   private float inputX;
   private float inputY;
   private float inputW;
   private float inputH;
   private float addBtnX;
   private float addBtnY;
   private float addBtnW;
   private float addBtnH;
   private float randomBtnX;
   private float randomBtnY;
   private float randomBtnW;
   private float randomBtnH;
   private final Map<String, Helper467> accountAnimations = new HashMap<>();
   private final Map<String, Float> accountYPositions = new HashMap<>();
   private final Map<String, Helper467> accountRemoveAnimations = new HashMap<>();
   private Helper467 emptyMessageAnimation = new Animation4().method5004(1.0).method5003(300);
   private boolean wasEmpty = true;
   private long lastActionTime = 0L;
   private static final long ACTION_DELAY = 250L;
   private float introProgress = 0.0F;
   private float typedBtnHover = 0.0F;
   private float randomBtnHover = 0.0F;
   private float titlePulse = 0.0F;

   public Helper402(float var1, float var2) {
      this.panelX = var1;
      this.panelY = var2;
      this.currentAccount = this.accountRepository.currentAccount != null ? this.accountRepository.currentAccount : "";
      this.method4084();
      this.emptyMessageAnimation.method4997(Helper450.FORWARDS);
      this.emptyMessageAnimation.method4993();
      this.wasEmpty = this.accountRepository.accountList.isEmpty();
   }

   private void method4084() {
      for (Helper397 var2 : this.accountRepository.accountList) {
         if (!this.accountAnimations.containsKey(var2.uuid)) {
            Helper467 var3 = new Animation4().method5004(1.0).method5003(300);
            var3.method4997(Helper450.FORWARDS);
            var3.method4993();
            this.accountAnimations.put(var2.uuid, var3);
         }
      }
   }

   public void method4085(float var1, float var2) {
      float var3 = var2 - this.panelY;
      this.panelX = var1;
      this.panelY = var2;

      for (String var5 : this.accountYPositions.keySet()) {
         this.accountYPositions.put(var5, this.accountYPositions.get(var5) + var3);
      }
   }

   public void method4086() {
      this.introProgress = this.introProgress + (1.0F - this.introProgress) * 0.12F;
      this.titlePulse += 0.08F;

      for (Helper397 var2 : this.accountRepository.accountList) {
         float var3 = var2.starred ? 1.0F : 0.0F;
         var2.starAnim = var2.starAnim + (var3 - var2.starAnim) * 0.2F;
         if (!this.accountAnimations.containsKey(var2.uuid)) {
            Helper467 var4 = new Animation4().method5004(1.0).method5003(300);
            var4.method4997(Helper450.FORWARDS);
            var4.method4993();
            this.accountAnimations.put(var2.uuid, var4);
         }
      }

      this.accountAnimations.keySet().removeIf(var1 -> {
         boolean var2x = this.accountRepository.accountList.stream().anyMatch(var1x -> var1x.uuid.equals(var1));
         if (!var2x) {
            this.accountYPositions.remove(var1);
         }

         return !var2x;
      });
      boolean var5 = this.accountRepository.accountList.isEmpty();
      if (var5 != this.wasEmpty) {
         this.wasEmpty = var5;
         if (var5) {
            this.emptyMessageAnimation.method4997(Helper450.FORWARDS);
         } else {
            this.emptyMessageAnimation.method4997(Helper450.BACKWARDS);
         }

         this.emptyMessageAnimation.method4993();
      }
   }

   public void method4087(DrawContext var1, Color var2, Color var3, Color var4, Color var5, Color var6) {
      this.method4092();
      float var7 = Math.max(0.05F, Math.min(1.0F, this.introProgress));
      double var8 = MinecraftClient.getInstance().mouse.getX()
         * MinecraftClient.getInstance().getWindow().getScaledWidth()
         / MinecraftClient.getInstance().getWindow().getWidth();
      double var10 = MinecraftClient.getInstance().mouse.getY()
         * MinecraftClient.getInstance().getWindow().getScaledHeight()
         / MinecraftClient.getInstance().getWindow().getHeight();
      this.typedBtnHover = this.typedBtnHover
         + ((this.method4110(var8, var10, this.addBtnX, this.addBtnY, this.addBtnW, this.addBtnH) ? 1.0F : 0.0F) - this.typedBtnHover) * 0.25F;
      this.randomBtnHover = this.randomBtnHover
         + ((this.method4110(var8, var10, this.randomBtnX, this.randomBtnY, this.randomBtnW, this.randomBtnH) ? 1.0F : 0.0F) - this.randomBtnHover) * 0.25F;
      rectangle.method677(
         Helper80.method841(
               var1.getMatrices(),
               0.0,
               0.0,
               MinecraftClient.getInstance().getWindow().getScaledWidth(),
               MinecraftClient.getInstance().getWindow().getScaledHeight()
            )
            .method823(new Color(0, 0, 0, (int)(130.0F * var7)).getRGB())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.containerX, this.containerY, this.containerW, this.containerH)
            .method835(2.0F)
            .method826(12.0F)
            .method839(var3.getRGB())
            .method825(var2.getRGB(), var2.getRGB(), var4.getRGB(), var4.getRGB())
            .method840()
      );
      int var12 = (int)(16.0 * (0.5 + 0.5 * Math.sin(this.titlePulse)));
      Color var13 = new Color(
         Math.min(255, var5.getRed() + var12), Math.min(255, var5.getGreen() + var12 / 2), Math.min(255, var5.getBlue() + var12), var5.getAlpha()
      );
      Helper103.method927(17, Helper101.SEMI)
         .method1474(var1.getMatrices(), "Alt Manager", this.containerX + 12.0F, this.containerY + 10.0F, var13.getRGB());
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.accountsX, this.accountsY, this.accountsW, this.accountsH)
            .method835(2.0F)
            .method826(10.0F)
            .method839(var3.getRGB())
            .method825(var2.getRGB(), var2.getRGB(), var4.getRGB(), var4.getRGB())
            .method840()
      );
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.controlsX, this.controlsY, this.controlsW, this.controlsH)
            .method835(2.0F)
            .method826(10.0F)
            .method839(var3.getRGB())
            .method825(var2.getRGB(), var2.getRGB(), var4.getRGB(), var4.getRGB())
            .method840()
      );
      Helper103.method927(14, Helper101.SEMI).method1474(var1.getMatrices(), "ACCOUNTS", this.accountsX + 10.0F, this.accountsY + 11.0F, var5.getRGB());
      Helper103.method927(14, Helper101.SEMI).method1474(var1.getMatrices(), "ACCOUNT", this.controlsX + 10.0F, this.controlsY + 11.0F, var5.getRGB());
      this.method4088(var1, var2, var3, var4, var5);
      this.method4089(var1, var2, var3, var4, var5);
      String var14 = this.currentAccount.isEmpty() ? "Not selected" : this.currentAccount;
      String var15 = "Active account: " + var14;
      float var16 = Math.min(this.controlsW - 20.0F, Helper103.method927(14, Helper101.SEMI).method1479(var15) + 16.0F);
      float var17 = this.controlsX + (this.controlsW - var16) / 2.0F;
      float var18 = this.controlsY + this.controlsH - 26.0F;
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), var17, var18, var16, 18.0)
            .method835(2.0F)
            .method826(6.0F)
            .method839(var3.getRGB())
            .method825(var2.getRGB(), var2.getRGB(), var4.getRGB(), var4.getRGB())
            .method840()
      );
      Helper103.method927(14, Helper101.SEMI).method1477(var1.getMatrices(), var15, this.controlsX + this.controlsW / 2.0F, var18 + 6.5F, var5.getRGB());
   }

   private void method4088(DrawContext var1, Color var2, Color var3, Color var4, Color var5) {
      Color var6 = this.typing ? this.method4094(var3, new Color(82, 0, 59, var3.getAlpha()), 0.55F) : var3;
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), this.inputX, this.inputY, this.inputW, this.inputH)
            .method835(2.0F)
            .method826(6.0F)
            .method839(var6.getRGB())
            .method825(var2.getRGB(), var2.getRGB(), var4.getRGB(), var4.getRGB())
            .method840()
      );
      Helper175 var7 = Helper103.method927(16, Helper101.DEFAULT);
      long var8 = System.currentTimeMillis();
      boolean var10 = var8 % 1000L < 500L;
      var1.enableScissor((int)(this.inputX + 4.0F), (int)this.inputY, (int)(this.inputX + this.inputW - 4.0F), (int)(this.inputY + this.inputH) + 5);
      if (this.typing && this.method4111()) {
         int var11 = Math.min(this.selStart, this.selEnd);
         int var12 = Math.max(this.selStart, this.selEnd);
         float var13 = this.inputX + 6.0F - this.textXOffset + var7.method1479(this.typedText.substring(0, var11));
         float var14 = var7.method1479(this.typedText.substring(var11, var12));
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), var13, this.inputY + 8.0F, var14, this.inputH - 10.0F)
               .method823(new Color(70, 102, 170, var5.getAlpha()).getRGB())
               .method840()
         );
      }

      if (this.typedText.isEmpty() && !this.typing) {
         Color var15 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), Math.max(55, var5.getAlpha() / 2));
         var7.method1474(var1.getMatrices(), "Enter nickname", this.inputX + 6.0F, this.inputY + 10.0F, var15.getRGB());
      } else {
         var7.method1474(var1.getMatrices(), this.typedText, this.inputX + 6.0F - this.textXOffset, this.inputY + 10.0F, var5.getRGB());
      }

      if (this.typing && var10 && !this.method4111()) {
         float var16 = this.inputX + 6.0F - this.textXOffset + var7.method1479(this.typedText.substring(0, this.cursorPos));
         rectangle.method677(
            Helper80.method841(var1.getMatrices(), var16, this.inputY + 7.0F, 0.6F, this.inputH - 10.0F).method823(var5.getRGB()).method840()
         );
      }

      var1.disableScissor();
      this.method4091(var1, this.addBtnX, this.addBtnY, this.addBtnW, this.addBtnH, "Typed", var2, var3, var4, var5, this.typedBtnHover);
      this.method4091(var1, this.randomBtnX, this.randomBtnY, this.randomBtnW, this.randomBtnH, "Random", var2, var3, var4, var5, this.randomBtnHover);
      Helper103.method927(12, Helper101.DEFAULT)
         .method1474(
            var1.getMatrices(),
            "",
            this.controlsX + 10.0F,
            this.randomBtnY + this.randomBtnH + 14.0F,
            new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), Math.max(85, var5.getAlpha() - 80)).getRGB()
         );
   }

   private void method4089(DrawContext var1, Color var2, Color var3, Color var4, Color var5) {
      float var6 = 26.0F;
      float var7 = 22.0F;
      float var8 = this.accountsY + 24.0F;
      float var9 = this.accountsH - 30.0F;
      float var10 = this.accountsX + 8.0F;
      float var11 = 8.0F;
      float var12 = (this.accountsW - 16.0F - var11) / 2.0F;
      MatrixStack var13 = var1.getMatrices();
      Matrix4f var14 = var13.peek().getPositionMatrix();
      Helper140 var15 = Releon.method71().method30();
      var15.method1209(var14, this.accountsX, var8, this.accountsW, var9);
      this.smoothedScroll = MathHelper.lerp(0.1F, this.smoothedScroll, this.scroll);
      if (this.accountRepository.accountList.isEmpty()) {
         int var16 = (int)(var5.getAlpha() * this.emptyMessageAnimation.method5000().floatValue());
         Color var17 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), Math.max(0, Math.min(255, var16)));
         Helper103.method927(16, Helper101.SEMI)
            .method1477(
               var1.getMatrices(), "No accounts yet", this.accountsX + this.accountsW / 2.0F, this.accountsY + this.accountsH / 2.0F - 10.0F, var17.getRGB()
            );
         Helper103.method927(13, Helper101.DEFAULT)
            .method1477(
               var1.getMatrices(),
               "Use buttons in right panel",
               this.accountsX + this.accountsW / 2.0F,
               this.accountsY + this.accountsH / 2.0F + 4.0F,
               new Color(var17.getRed(), var17.getGreen(), var17.getBlue(), Math.max(40, var17.getAlpha() - 65)).getRGB()
            );
      } else {
         for (int var40 = 0; var40 < this.accountRepository.accountList.size(); var40++) {
            Helper397 var41 = this.accountRepository.accountList.get(var40);
            int var18 = var40 % 2;
            int var19 = var40 / 2;
            float var20 = var10 + var18 * (var12 + var11);
            float var21 = var8 + 2.0F + var19 * var6 - this.smoothedScroll;
            String var22 = var41.uuid;
            this.accountYPositions.putIfAbsent(var22, var21);
            float var23 = MathHelper.lerp(0.15F, this.accountYPositions.get(var22), var21);
            this.accountYPositions.put(var22, var23);
            Helper467 var24 = this.accountAnimations.get(var41.uuid);
            Helper467 var25 = this.accountRemoveAnimations.get(var41.uuid);
            if (var24 != null) {
               float var26 = var24.method5000().floatValue();
               if (var25 != null) {
                  var26 *= var25.method5000().floatValue();
               }

               float var27 = 0.5F + var26 * 0.5F;
               int var28 = (int)(var5.getAlpha() * var26);
               if (var23 + var7 >= var8 && var23 <= var8 + var9) {
                  var13.push();
                  float var29 = var20 + var12 / 2.0F;
                  float var30 = var23 + var7 / 2.0F;
                  var13.translate(var29, var30, 0.0F);
                  var13.scale(var27, var27, 1.0F);
                  var13.translate(-var29, -var30, 0.0F);
                  int var31 = Math.max(0, Math.min(255, var28));
                  Color var32 = new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), var31);
                  Color var33 = new Color(var4.getRed(), var4.getGreen(), var4.getBlue(), var31);
                  Color var34 = new Color(var3.getRed(), var3.getGreen(), var3.getBlue(), var31);
                  Color var35 = new Color(var5.getRed(), var5.getGreen(), var5.getBlue(), var31);
                  boolean var36 = var41.name.equals(this.currentAccount);
                  Color var37 = var36 ? new Color(102, 90, 194, var31) : var34;
                  rectangle.method677(
                     Helper80.method841(var1.getMatrices(), var20, var23, var12, var7)
                        .method835(var36 ? 2.4F : 2.0F)
                        .method826(6.0F)
                        .method839(var37.getRGB())
                        .method825(var32.getRGB(), var32.getRGB(), var33.getRGB(), var33.getRGB())
                        .method840()
                  );
                  Color var38 = this.method4094(var35, new Color(255, 225, 90, var31), var41.starAnim);
                  float var39 = var20 + var12 - 16.0F;
                  Helper103.method927(16, Helper101.SEMI).method1474(var1.getMatrices(), "*", var39, var23 + 8.0F, var38.getRGB());
                  this.method4093(var1, var41, var20 + 4.0F, var23 + 3.5F, var28);
                  Helper103.method927(15, Helper101.SEMI).method1474(var1.getMatrices(), var41.name, var20 + 24.0F, var23 + 9.0F, var35.getRGB());
                  var13.pop();
               }
            }
         }
      }

      var15.method1210();
      if (this.accountRepository.accountList.size() > 10) {
         this.method4090(var1, var8, var9, var6, var5.getAlpha());
      }
   }

   private void method4090(DrawContext var1, float var2, float var3, float var4, int var5) {
      float var6 = this.accountRepository.accountList.size() * var4;
      float var7 = Math.max(0.0F, var6 - var3);
      this.scroll = MathHelper.clamp(this.scroll, 0.0F, var7);
      float var8 = 2.0F;
      float var9 = this.accountsX + this.accountsW - var8 - 2.5F;
      float var10 = var2 + 1.0F;
      float var11 = var3 - 1.0F;
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), var9, var10, var8, var11)
            .method826(1.0F)
            .method823(new Color(30, 30, 30, (int)(90.0 * (var5 / 255.0))).getRGB())
            .method840()
      );
      float var12 = Math.max(20.0F, var3 * (var3 / (var6 + var3)));
      float var13 = var7 <= 0.0F ? 0.0F : this.smoothedScroll / var7;
      float var14 = var10 + (var11 - var12) * var13;
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), var9, var14, var8, var12)
            .method826(1.0F)
            .method823(new Color(120, 130, 255, (int)(170.0 * (var5 / 255.0))).getRGB())
            .method840()
      );
   }

   private void method4091(
      DrawContext var1, float var2, float var3, float var4, float var5, String var6, Color var7, Color var8, Color var9, Color var10, float var11
   ) {
      Color var12 = this.method4094(var8, new Color(140, 104, 206, var8.getAlpha()), var11);
      Color var13 = this.method4094(var7, new Color(72, 46, 124, var7.getAlpha()), var11 * 0.7F);
      Color var14 = this.method4094(var9, new Color(98, 66, 154, var9.getAlpha()), var11 * 0.7F);
      rectangle.method677(
         Helper80.method841(var1.getMatrices(), var2, var3, var4, var5)
            .method835(2.0F + var11 * 0.4F)
            .method826(6.0F)
            .method839(var12.getRGB())
            .method825(var13.getRGB(), var13.getRGB(), var14.getRGB(), var14.getRGB())
            .method840()
      );
      Helper103.method927(15, Helper101.SEMI).method1477(var1.getMatrices(), var6, var2 + var4 / 2.0F, var3 + var5 / 2.0F - 3.2F, var10.getRGB());
   }

   private void method4092() {
      float var1 = MinecraftClient.getInstance().getWindow().getScaledWidth();
      float var2 = MinecraftClient.getInstance().getWindow().getScaledHeight();
      this.containerW = Math.max(640.0F, var1 * 0.56F);
      this.containerH = Math.max(250.0F, var2 * 0.36F);
      this.containerW = Math.min(this.containerW, var1 - 90.0F);
      this.containerH = Math.min(this.containerH, var2 - 90.0F);
      this.containerX = (var1 - this.containerW) / 2.0F;
      this.containerY = (var2 - this.containerH) / 2.0F;
      this.controlsX = this.containerX + 12.0F;
      this.controlsY = this.containerY + 36.0F;
      this.controlsW = Math.max(180.0F, this.containerW * 0.28F);
      this.controlsH = this.containerH - 48.0F;
      this.accountsX = this.controlsX + this.controlsW + 10.0F;
      this.accountsY = this.controlsY;
      this.accountsW = this.containerX + this.containerW - 12.0F - this.accountsX;
      this.accountsH = this.controlsH;
      this.inputX = this.controlsX + 10.0F;
      this.inputY = this.controlsY + 28.0F;
      this.inputW = this.controlsW - 20.0F;
      this.inputH = 24.0F;
      this.addBtnX = this.inputX;
      this.addBtnY = this.inputY + 30.0F;
      this.addBtnW = this.inputW;
      this.addBtnH = 22.0F;
      this.randomBtnX = this.inputX;
      this.randomBtnY = this.addBtnY + 28.0F;
      this.randomBtnW = this.inputW;
      this.randomBtnH = 22.0F;
   }

   private void method4093(DrawContext var1, Helper397 var2, float var3, float var4, int var5) {
      GameProfile var6 = new GameProfile(UUID.fromString(var2.uuid), var2.name);
      Identifier var7 = MinecraftClient.getInstance().getSkinProvider().getSkinTextures(var6).texture();
      if (var7 == null) {
         var7 = Identifier.of("minecraft", "textures/entity/steve.png");
      }

      MatrixStack var8 = var1.getMatrices();
      var8.push();
      RenderSystem.enableBlend();
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, var5 / 255.0F);
      Helper178.method1508(var1, var7, var3, var4, 15.0F, 7.0F, 8, 8, 64, Helper133.method1157(1.0F), -1);
      RenderSystem.setShaderColor(1.0F, 1.0F, 1.0F, 1.0F);
      RenderSystem.disableBlend();
      var8.pop();
   }

   private Color method4094(Color var1, Color var2, float var3) {
      int var4 = (int)(var1.getRed() + (var2.getRed() - var1.getRed()) * var3);
      int var5 = (int)(var1.getGreen() + (var2.getGreen() - var1.getGreen()) * var3);
      int var6 = (int)(var1.getBlue() + (var2.getBlue() - var1.getBlue()) * var3);
      int var7 = (int)(var1.getAlpha() + (var2.getAlpha() - var1.getAlpha()) * var3);
      return new Color(var4, var5, var6, var7);
   }

   public boolean method4095(double var1, double var3, int var5) {
      this.method4092();
      if (var5 == 0 && this.method4110(var1, var3, this.inputX, this.inputY, this.inputW, this.inputH)) {
         this.method4096(var1);
         return true;
      } else {
         this.typing = false;
         this.method4114();
         if (var5 == 0 && this.method4110(var1, var3, this.addBtnX, this.addBtnY, this.addBtnW, this.addBtnH)) {
            long var8 = System.currentTimeMillis();
            if (var8 - this.lastActionTime >= 250L) {
               this.lastActionTime = var8;
               this.method4098();
            }

            return true;
         } else if (var5 == 0 && this.method4110(var1, var3, this.randomBtnX, this.randomBtnY, this.randomBtnW, this.randomBtnH)) {
            long var6 = System.currentTimeMillis();
            if (var6 - this.lastActionTime >= 250L) {
               this.lastActionTime = var6;
               this.method4097();
            }

            return true;
         } else {
            return this.method4101(var1, var3, var5);
         }
      }
   }

   private void method4096(double var1) {
      long var3 = System.currentTimeMillis();
      if (var3 - this.lastClick < 250L) {
         this.selStart = 0;
         this.selEnd = this.typedText.length();
      } else {
         this.typing = true;
         this.cursorPos = this.method4116(var1);
         this.selStart = this.cursorPos;
         this.selEnd = this.cursorPos;
         this.lastClick = var3;
      }

      this.dragging = true;
   }

   private void method4097() {
      String var1 = this.method4100();
      if (!this.method4099(var1)) {
         String var2 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + var1).getBytes(StandardCharsets.UTF_8)).toString();
         Helper397 var3 = new Helper397(var1, false, false, null, var2, "0");
         this.accountRepository.accountList.add(var3);
         this.accountRepository.accountList.sort((var0, var1x) -> Boolean.compare(var1x.starred, var0.starred));
         Helper467 var4 = new Animation4().method5004(1.0).method5003(300);
         var4.method4997(Helper450.FORWARDS);
         var4.method4993();
         this.accountAnimations.put(var2, var4);
         this.typedText = "";
         this.cursorPos = 0;
         this.method4114();
         this.method4103();
      }
   }

   private void method4098() {
      if (this.typedText.length() >= 3 && this.typedText.length() <= 16) {
         if (this.method4099(this.typedText)) {
            this.typedText = "";
            this.cursorPos = 0;
            this.typing = false;
            this.method4114();
         } else {
            String var1 = UUID.nameUUIDFromBytes(("OfflinePlayer:" + this.typedText).getBytes(StandardCharsets.UTF_8)).toString();
            Helper397 var2 = new Helper397(this.typedText, false, false, null, var1, "0");
            this.accountRepository.accountList.add(var2);
            this.accountRepository.accountList.sort((var0, var1x) -> Boolean.compare(var1x.starred, var0.starred));
            Helper467 var3 = new Animation4().method5004(1.0).method5003(300);
            var3.method4997(Helper450.FORWARDS);
            var3.method4993();
            this.accountAnimations.put(var1, var3);
            this.typedText = "";
            this.cursorPos = 0;
            this.typing = false;
            this.method4114();
            this.method4103();
         }
      }
   }

   private boolean method4099(String var1) {
      return this.accountRepository.accountList.stream().anyMatch(var1x -> var1x.name.equalsIgnoreCase(var1));
   }

   private String method4100() {
      char[] var1 = new char[]{'a', 'e', 'i', 'o', 'u'};
      char[] var2 = new char[]{'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'};
      StringBuilder var3 = new StringBuilder();
      int var4 = 6 + this.rand.nextInt(5);
      boolean var5 = this.rand.nextBoolean();

      for (int var6 = 0; var6 < var4; var6++) {
         if (var6 % 2 == 0) {
            var3.append(var5 ? var1[this.rand.nextInt(var1.length)] : var2[this.rand.nextInt(var2.length)]);
         } else {
            var3.append(var5 ? var2[this.rand.nextInt(var2.length)] : var1[this.rand.nextInt(var1.length)]);
         }
      }

      if (this.rand.nextInt(100) < 30) {
         var3.append(this.rand.nextInt(100));
      }

      String var8 = var3.substring(0, 1).toUpperCase() + var3.substring(1);
      String var9 = var8;
      if (this.accountRepository.accountList.stream().anyMatch(var1x -> var1x.name.equals(var9))) {
         var8 = var8 + System.currentTimeMillis() % 1000L;
      }

      return var8;
   }

   private boolean method4101(double var1, double var3, int var5) {
      float var6 = 26.0F;
      float var7 = 22.0F;
      float var8 = this.accountsY + 24.0F;
      float var9 = this.accountsH - 30.0F;
      float var10 = this.accountsX + 8.0F;
      float var11 = 8.0F;
      float var12 = (this.accountsW - 16.0F - var11) / 2.0F;

      for (int var13 = 0; var13 < this.accountRepository.accountList.size(); var13++) {
         Helper397 var14 = this.accountRepository.accountList.get(var13);
         int var15 = var13 % 2;
         int var16 = var13 / 2;
         float var17 = var10 + var15 * (var12 + var11);
         float var18 = this.accountYPositions.getOrDefault(var14.uuid, var8 + 2.0F + var16 * var6 - this.smoothedScroll);
         if (!(var18 + var7 < var8) && !(var18 > var8 + var9)) {
            if (var5 == 0 && this.method4110(var1, var3, var17 + var12 - 16.0F, var18 + 6.5F, 14.0F, 14.0F)) {
               var14.starred = !var14.starred;
               this.accountRepository.accountList.sort((var0, var1x) -> Boolean.compare(var1x.starred, var0.starred));
               this.method4103();
               return true;
            }

            if (var5 == 0 && this.method4110(var1, var3, var17, var18, var12, var7)) {
               this.currentAccount = var14.name;
               this.accountRepository.currentAccount = var14.name;
               this.method4102(var14);
               this.method4103();
               return true;
            }

            if (var5 == 1 && this.method4110(var1, var3, var17, var18, var12, var7)) {
               long var19 = System.currentTimeMillis();
               if (var19 - this.lastActionTime >= 250L) {
                  this.lastActionTime = var19;
                  Helper397 var21 = this.accountRepository.accountList.get(var13);
                  if (var21.name.equals(this.currentAccount)) {
                     this.accountRepository.currentAccount = "";
                     this.currentAccount = "";
                  }

                  Helper467 var22 = new Animation4().method5004(1.0).method5003(250);
                  var22.method4997(Helper450.BACKWARDS);
                  var22.method4993();
                  this.accountRemoveAnimations.put(var21.uuid, var22);
                  new Thread(() -> {
                     try {
                        Thread.sleep(250L);
                        this.accountRepository.accountList.remove(var21);
                        this.accountYPositions.remove(var21.uuid);
                        this.accountAnimations.remove(var21.uuid);
                        this.accountRemoveAnimations.remove(var21.uuid);
                        this.method4103();
                     } catch (InterruptedException var3x) {
                        var3x.printStackTrace();
                     }
                  }).start();
               }

               return true;
            }
         }
      }

      return false;
   }

   private void method4102(Helper397 var1) {
      if (Releon.method71().method3(var1)) {
         this.accountRepository.currentAccount = var1.name;
         this.currentAccount = var1.name;
      }
   }

   private void method4103() {
      try {
         Releon.method71().method29().method896();
      } catch (Exception var2) {
         var2.printStackTrace();
      }
   }

   public boolean method4104(double var1, double var3, double var5) {
      if (this.accountRepository.accountList.size() > 10) {
         this.method4092();
         float var7 = this.accountsY + 24.0F;
         float var8 = this.accountsH - 30.0F;
         if (this.method4110(var1, var3, this.accountsX, var7, this.accountsW, var8)) {
            int var9 = (this.accountRepository.accountList.size() + 1) / 2;
            float var10 = var9 * 26.0F;
            float var11 = Math.max(0.0F, var10 - var8);
            this.scroll = (float)(this.scroll - var5 * 20.0);
            this.scroll = MathHelper.clamp(this.scroll, 0.0F, var11);
            return true;
         }
      }

      return false;
   }

   public boolean method4105(double var1, double var3, int var5) {
      if (this.dragging && var5 == 0) {
         this.method4092();
         this.cursorPos = this.method4116(var1);
         this.selEnd = this.cursorPos;
         return true;
      } else {
         return false;
      }
   }

   public boolean method4106() {
      this.dragging = false;
      return false;
   }

   public boolean method4107(char var1) {
      if (this.typing && this.typedText.length() < 16) {
         this.method4113();
         this.typedText = this.typedText.substring(0, this.cursorPos) + var1 + this.typedText.substring(this.cursorPos);
         this.cursorPos++;
         this.method4114();
         this.method4117();
         return true;
      } else {
         return false;
      }
   }

   public boolean method4108(int var1) {
      if (!this.typing) {
         return false;
      } else if (var1 == 341 || var1 == 345) {
         return false;
      } else {
         if (MinecraftClient.getInstance().currentScreen != null && Screen.hasControlDown()) {
            switch (var1) {
               case 65:
                  this.selStart = 0;
                  this.selEnd = this.typedText.length();
                  return true;
               case 67:
                  if (this.method4111()) {
                     GLFW.glfwSetClipboardString(MinecraftClient.getInstance().getWindow().getHandle(), this.method4112());
                  }

                  return true;
               case 86:
                  String var4 = GLFW.glfwGetClipboardString(MinecraftClient.getInstance().getWindow().getHandle());
                  if (var4 != null) {
                     this.method4113();
                     this.typedText = this.typedText.substring(0, this.cursorPos) + var4 + this.typedText.substring(this.cursorPos);
                     this.cursorPos = this.cursorPos + var4.length();
                     this.method4114();
                     this.method4117();
                  }

                  return true;
            }
         }

         switch (var1) {
            case 257:
               long var2 = System.currentTimeMillis();
               if (var2 - this.lastActionTime >= 250L) {
                  this.lastActionTime = var2;
                  this.method4098();
               }

               return true;
            case 258:
            case 260:
            case 261:
            default:
               break;
            case 259:
               if (this.method4111()) {
                  this.method4113();
               } else if (this.cursorPos > 0) {
                  this.typedText = this.typedText.substring(0, this.cursorPos - 1) + this.typedText.substring(this.cursorPos);
                  this.cursorPos--;
               }

               this.method4117();
               return true;
            case 262:
               if (this.cursorPos < this.typedText.length()) {
                  this.cursorPos++;
               }

               this.method4115();
               this.method4117();
               return true;
            case 263:
               if (this.cursorPos > 0) {
                  this.cursorPos--;
               }

               this.method4115();
               this.method4117();
               return true;
         }
      }

      return false;
   }

   public void method4109() {
      this.typing = false;
      this.method4114();
      this.introProgress = 0.0F;
      this.typedBtnHover = 0.0F;
      this.randomBtnHover = 0.0F;
   }

   private boolean method4110(double var1, double var3, float var5, float var6, float var7, float var8) {
      return var1 >= var5 && var1 <= var5 + var7 && var3 >= var6 && var3 <= var6 + var8;
   }

   private boolean method4111() {
      return this.selStart != this.selEnd;
   }

   private String method4112() {
      int var1 = Math.min(this.selStart, this.selEnd);
      int var2 = Math.max(this.selStart, this.selEnd);
      return this.typedText.substring(var1, var2);
   }

   private void method4113() {
      if (this.method4111()) {
         int var1 = Math.min(this.selStart, this.selEnd);
         int var2 = Math.max(this.selStart, this.selEnd);
         this.typedText = this.typedText.substring(0, var1) + this.typedText.substring(var2);
         this.cursorPos = var1;
         this.method4114();
      }
   }

   private void method4114() {
      this.selStart = this.cursorPos;
      this.selEnd = this.cursorPos;
   }

   private void method4115() {
      if (MinecraftClient.getInstance().currentScreen != null && Screen.hasShiftDown()) {
         this.selEnd = this.cursorPos;
      } else {
         this.method4114();
      }
   }

   private int method4116(double var1) {
      this.method4092();
      float var3 = this.inputX;
      Helper175 var4 = Helper103.method927(16, Helper101.DEFAULT);
      float var5 = (float)var1 - var3 - 6.0F + this.textXOffset;
      int var6 = 0;

      while (var6 < this.typedText.length() && !(var4.method1479(this.typedText.substring(0, var6 + 1)) > var5)) {
         var6++;
      }

      return var6;
   }

   private void method4117() {
      this.method4092();
      float var1 = this.inputW;
      Helper175 var2 = Helper103.method927(16, Helper101.DEFAULT);
      float var3 = var2.method1479(this.typedText.substring(0, this.cursorPos));
      if (var3 < this.textXOffset) {
         this.textXOffset = var3;
      } else if (var3 > this.textXOffset + var1 - 10.0F) {
         this.textXOffset = var3 - (var1 - 10.0F);
      }
   }
}

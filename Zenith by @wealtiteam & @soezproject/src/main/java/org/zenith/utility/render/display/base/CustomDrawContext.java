package org.zenith.utility.render.display.base;

import org.zenith.core.ItemRegistry;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.ZenithClient;
import org.zenith.util.Item;

import org.zenith.util.ArgbColor;
import org.zenith.base.font.Font;
import org.zenith.base.font.MsdfRenderer;
import org.zenith.render.RectBatch;
import org.zenith.render.RoundedRectBatch;
import org.zenith.render.ShapeRenderer;
import org.zenith.utility.mixin.accessors.DrawContextAccessor;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientProvider;













import net.minecraft.client.MinecraftClient;
import java.util.Objects;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class CustomDrawContext extends DrawContext implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public RoundedRectBatch roundedRectBatch = new RoundedRectBatch();
   public RectBatch rectBatch = new RectBatch();

   public CustomDrawContext(DrawContext var1) {
      super(minecraftClient3, ((DrawContextAccessor)var1).getVertexConsumers());
      this.matrices = var1.matrices;
      this.scissorStack = var1.scissorStack;
      this.vertexConsumers = var1.vertexConsumers;
      this.guiAtlasManager = var1.guiAtlasManager;
   }

   public static CustomDrawContext of(DrawContext var0) {
      return new CustomDrawContext(var0);
   }

   public void drawText(Font var1, String var2, float var3, float var4, ArgbColor var5) {
      MsdfRenderer.renderText(var1.getFont(), var2, var1.getSize(), var5.call001(), this.getMatrices().peek().getPositionMatrix(), var3, var4, 0.0F);
   }

   public void drawText(Font var1, String var2, float var3, float var4, ArgbColor var5, boolean var6, float var7, float var8, float var9) {
      this.drawText(var1, var2, var3, var4, var5.call001(), var6, var7, var8, var9);
   }

   public void drawText(Font var1, String var2, float var3, float var4, int var5, boolean var6, float var7, float var8, float var9) {
      MsdfRenderer.renderText(
         var1.getFont(), var2, var1.getSize(), var5, this.getMatrices().peek().getPositionMatrix(), var3, var4, 0.0F, var6, var7, var8, var9
      );
   }

   public void enableScissor(float var1, float var2, float var3, float var4) {
      this.enableScissor((int)Math.floor((double)var1), (int)Math.floor((double)var2), (int)Math.ceil((double)var3), (int)Math.ceil((double)var4));
   }

   @Override
   public void enableScissor(int x1, int y1, int x2, int y2) {
      super.enableScissor(x1, y1, x2, y2);
   }

   @Override
   public void disableScissor() {
      super.disableScissor();
   }

   public void drawText(Font var1, String var2, float var3, float var4, GradientRadius var5) {
      MsdfRenderer.renderText(var1.getFont(), var2, var1.getSize(), var5, this.getMatrices().peek().getPositionMatrix(), var3, var4, 0.0F);
   }

   public void drawText(Font var1, Text var2, float var3, float var4, int var5) {
      MsdfRenderer.renderText(
         var1.getFont(), var2, var1.getSize(), this.getMatrices().peek().getPositionMatrix(), var3, var4, 0.0F, false, 0.0F, 1.0F, 0.0F, var5
      );
   }

   public void drawText(Font var1, Text var2, float var3, float var4) {
      MsdfRenderer.renderText(var1.getFont(), var2, var1.getSize(), this.getMatrices().peek().getPositionMatrix(), var3, var4, 0.0F);
   }

   public void drawSquircle(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      ShapeRenderer.UiAnimation(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawRoundedRect(float var1, float var2, float var3, float var4, CornerRadius var5, ArgbColor var6) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6);
   }

   public void drawRoundedRect(float var1, float var2, float var3, float var4, CornerRadius var5, GradientRadius var6) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6);
   }

   public void drawRect(float var1, float var2, float var3, float var4, ArgbColor var5) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5);
   }

   public void beginRectBatch() {
      this.rectBatch.map44();
   }

   public void drawRectBatched(float var1, float var2, float var3, float var4, ArgbColor var5) {
      this.rectBatch.Easing(this.getMatrices().peek().getPositionMatrix(), var1, var2, var3, var4, var5);
   }

   public void flushRects() {
      MsdfRenderer.flushBatch();
      this.rectBatch.flush();
   }

   public void beginRoundedRectBatch(CornerRadius var1) {
      this.roundedRectBatch.on23(var1);
   }

   public void drawRoundedRectBatched(float var1, float var2, float var3, float var4, CornerRadius var5, ArgbColor var6) {
      this.roundedRectBatch.on23(var5);
      this.roundedRectBatch.Easing(this.getMatrices().peek().getPositionMatrix(), var1, var2, var3, var4, var6);
   }

   public void flushRoundedRects() {
      MsdfRenderer.flushBatch();
      this.roundedRectBatch.flush();
   }

   public boolean isRoundedRectBatchActive() {
      return this.roundedRectBatch.isStarted();
   }

   public int drawTextWithBackground(
      TextRenderer var1, Text var2, int var3, int var4, int var5, CornerRadius var6, ArgbColor var7, ArgbColor var8
   ) {
      int i = var3 - 3;
      int j = var4 - 2;
      int k = var5 + 6;
      Objects.requireNonNull(var1);
      this.drawRoundedRect((float)i, (float)j, (float)k, 13.0F, var6, var8);
      return this.drawText(var1, var2, var3, var4, var7.call001(), true);
   }

   public void drawSprite(GuiSprite var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6);
   }

   public void drawRoundedCorner(float var1, float var2, float var3, float var4, float var5, float var6, ArgbColor var7, CornerRadius var8) {
      var3 = (float)Math.round(var3);
      var4 = (float)Math.round(var4);
      this.enableScissor((int)Math.ceil((double)(var1 - 10.0F)), (int)(var2 - 10.0F), (int)(var1 + var6), (int)(var2 + var6));
      this.drawRoundedBorder(var1, var2, var3, var4, var5, var8, var7);
      this.disableScissor();
      this.enableScissor((int)(var1 + var3 - var6), (int)(var2 - 10.0F), (int)(var1 + var3 + 10.0F), (int)(var2 + var6));
      this.drawRoundedBorder(var1, var2, var3, var4, var5, var8, var7);
      this.disableScissor();
      this.enableScissor((int)(var1 - 10.0F), (int)(var2 + var4 - var6), (int)(var1 + var6), (int)(var2 + var4 + 10.0F));
      this.drawRoundedBorder(var1, var2, var3, var4, var5, var8, var7);
      this.disableScissor();
      this.enableScissor((int)(var1 + var3 - var6), (int)(var2 + var4 - var6), (int)(var1 + var3 + 10.0F), (int)(var2 + var4 + 10.0F));
      this.drawRoundedBorder(var1, var2, var3, var4, var5, var8, var7);
      this.disableScissor();
   }

   public void drawRoundedBorder(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, GradientRadius var7) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawRoundedBorder(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawTexture(Identifier var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      ShapeRenderer.on23(this.getMatrices(), this.vertexConsumers, var1, var2, var3, var4, var5, var6);
   }

   public void drawBlurHud(float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      ShapeRenderer.ItemRegistry(this.getMatrices(), var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawBlurHudBooleanCheck(
      float var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7, boolean var8, boolean var9
   ) {
      ShapeRenderer.on23(this.getMatrices(), var1, var2, var3, var4, var5, var6, var7, var8, var9);
   }

   public void drawArcBorder(float var1, float var2, float var3, float var4, float var5, float var6, float var7, ArgbColor var8) {
      ShapeRenderer.on23(this.getMatrices(), var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public void drawRoundedTexture(Identifier var1, float var2, float var3, float var4, float var5, CornerRadius var6) {
      ShapeRenderer.on23(this.getMatrices(), var1, var2, var3, var4, var5, var6);
   }

   public void drawRoundedTexture(Identifier var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      ShapeRenderer.on23(this.getMatrices(), var1, var2, var3, var4, var5, var6, var7);
   }

   public void drawPlayerHeadWithRoundedShader(Identifier var1, float var2, float var3, float var4, CornerRadius var5, ArgbColor var6) {
      ShapeRenderer.on23(this.getMatrices(), var1, var2, var3, var4, var5, var6);
   }

      public void drawItemBar(ItemStack var1, int var2, int var3) {
      ((DrawContextAccessor)this).callDrawItemBar(var1, var2, var3);
   }

      public void drawCooldownProgress(ItemStack var1, int var2, int var3) {
      ((DrawContextAccessor)this).callDrawCooldownProgress(var1, var2, var3);
   }

   public void pushMatrix() {
      this.getMatrices().push();
   }

   public void popMatrix() {
      this.getMatrices().pop();
   }
}

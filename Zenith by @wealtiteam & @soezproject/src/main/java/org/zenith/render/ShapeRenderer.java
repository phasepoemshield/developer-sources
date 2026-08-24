package org.zenith.render;

import org.zenith.base.font.Font;
import org.zenith.core.NbtEditor;
import org.zenith.core.ModuleStateStore;
import org.zenith.core.HudArmorPanel;
import org.zenith.event.EventHookWorldRender;
import org.zenith.event.MovementInputEvent;
import org.zenith.module.Module;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.core.ItemRegistry;
import org.zenith.ZenithClient;
import org.zenith.core.ItemSpec;
import org.zenith.core.ColorAnimator;
import org.zenith.core.UiAnimation;
import org.zenith.core.TextScanner;
import org.zenith.core.Easing;
import org.zenith.util.MathUtils;
import org.zenith.core.NpcCloneManager;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.BlockPosEntry;
import org.zenith.core.HudPreviewItem;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientWindowProvider;
import org.zenith.core.ShaderWrapper;
import org.zenith.core.AvatarRenderer;
import org.zenith.core.FillShader;

import org.zenith.module.Interface;

import org.zenith.base.font.MsdfRenderer;
import org.zenith.utility.render.display.base.BlurHudDrawContext;
import org.zenith.utility.render.display.base.GradientRadius;
import org.zenith.utility.render.display.base.GuiSprite;

















import com.mojang.blaze3d.platform.GlStateManager.DstFactor;
import com.mojang.blaze3d.platform.GlStateManager.SrcFactor;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.DefaultSkinHelper;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Vec2f;
import org.joml.Matrix4f;

public final class ShapeRenderer implements ClientWindowProvider {
   public static final float float306 = 0.8F;
   public static ShaderWrapper zClass072 = new ShaderWrapper(
      ZenithClient.on23("rectangle/data"), VertexFormats.POSITION_COLOR
   );
   public static ShaderWrapper zClass0722 = new ShaderWrapper(
      ZenithClient.on23("batch_rectangle/data"), VertexFormats.POSITION_TEXTURE_COLOR
   );
   public static FillShader zClass084 = new FillShader(ZenithClient.on23("drop_shadow/data"));
   public static ShaderWrapper zClass0723 = new ShaderWrapper(
      ZenithClient.on23("squircle/data"), VertexFormats.POSITION_COLOR
   );
   public static ShaderWrapper zClass0724 = new ShaderWrapper(ZenithClient.on23("texture/data"), VertexFormats.POSITION_TEXTURE_COLOR);
   public static ShaderWrapper zClass0725 = new ShaderWrapper(
      ZenithClient.on23("squircle_texture/data"), VertexFormats.POSITION_TEXTURE_COLOR
   );
   public static ShaderWrapper zClass0726 = new ShaderWrapper(ZenithClient.on23("border/data"), VertexFormats.POSITION_COLOR);
   public static ShaderWrapper zClass0727 = new ShaderWrapper(ZenithClient.on23("corner/data"), VertexFormats.POSITION_COLOR);
   public static ShaderWrapper zClass0728 = new ShaderWrapper(ZenithClient.on23("arc_border/data"), VertexFormats.POSITION_COLOR);
   public static ShaderWrapper zClass0729 = new ShaderWrapper(
      ZenithClient.on23("liquidglass/data"), VertexFormats.POSITION_TEXTURE_COLOR
   );
   public static ShaderWrapper zClass07210 = new ShaderWrapper(ZenithClient.on23("loading/data"), VertexFormats.POSITION_COLOR);
   public static ShaderWrapper zClass07211 = new ShaderWrapper(
      ZenithClient.on23("gradient_rectangle/data"), VertexFormats.POSITION_COLOR
   );
   public static boolean boolean184 = true;

   public static void on23(MatrixStack var0, Vec2f var1, Vec2f var2, ArgbColor var3) {
      MsdfRenderer.flushBatch();
      var0.push();

      try {
         Matrix4f matrix4f = var0.peek().getPositionMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.lineWidth(1.0F);
         boolean78();
         BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);
         bufferbuilder.vertex(matrix4f, var1.x, var1.y, 0.0F).color(var3.call001());
         bufferbuilder.vertex(matrix4f, var2.x, var2.y, 0.0F).color(var3.call001());
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         var14342();
      } finally {
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         var0.pop();
      }
   }

   public static void on23(MatrixStack var0, Vec2f var1, Vec2f var2, Vec2f var3, Vec2f var4, ArgbColor var5, int var6) {
      MsdfRenderer.flushBatch();
      var0.push();

      try {
         Matrix4f matrix4f = var0.peek().getPositionMatrix();
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.lineWidth(1.0F);
         boolean78();
         BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.DEBUG_LINE_STRIP, VertexFormats.POSITION_COLOR);

         for (int i = 0; i <= var6; i++) {
            float f = (float)i / (float)var6;
            float f1 = (float)MathUtils.Easing((double)f, (double)var1.x, (double)var2.x, (double)var3.x, (double)var4.x);
            float f2 = (float)MathUtils.Easing((double)f, (double)var1.y, (double)var2.y, (double)var3.y, (double)var4.y);
            bufferbuilder.vertex(matrix4f, f1, f2, 0.0F).color(var5.call001());
         }

         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         var14342();
      } finally {
         RenderSystem.disableBlend();
         RenderSystem.lineWidth(1.0F);
         var0.pop();
      }
   }

   public static void on23(
      Matrix4f var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6,
      float var7,
      float var8,
      ArgbColor var9,
      float var10,
      boolean var11,
      float var12,
      float var13,
      float var14
   ) {
      MsdfRenderer.flushBatch();
      boolean78();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, ZenithClient.on23().ModuleStateStore().getFbo().getColorAttachment());
      zClass0729.float251();
      zClass0729.HudArmorPanel("GlobalAlpha").set(var7);
      zClass0729.HudArmorPanel("Size").set(var3, var4);
      zClass0729.HudArmorPanel("Radius")
         .set(var5.var14311(), var5.string63(), var5.var14312(), var5.itemStack9());
      zClass0729.HudArmorPanel("Smoothness").set(1.0F);
      zClass0729.HudArmorPanel("FresnelPower").set(var8);
      zClass0729.HudArmorPanel("FresnelColor")
         .set(
            (float)var9.float240() / 255.0F,
            (float)var9.var14323() / 255.0F,
            (float)var9.var14324() / 255.0F
         );
      zClass0729.HudArmorPanel("FresnelAlpha").set((float)var9.var14325() / 255.0F);
      zClass0729.HudArmorPanel("BaseAlpha").set(var10);
      zClass0729.HudArmorPanel("FresnelInvert").set(var11 ? 1 : 0);
      zClass0729.HudArmorPanel("FresnelMix").set(var12);
      zClass0729.HudArmorPanel("DistortStrength").set(var13);
      zClass0729.HudArmorPanel("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
      ArgbColor i11ii1llliilllii1i1 = Interface.interfaceField.float32();
      zClass0729.HudArmorPanel("GlareColor")
         .set(
            (float)i11ii1llliilllii1i1.float240() / 255.0F,
            (float)i11ii1llliilllii1i1.var14323() / 255.0F,
            (float)i11ii1llliilllii1i1.var14324() / 255.0F
         );
      zClass0729.HudArmorPanel("GlareAlpha").set((float)i11ii1llliilllii1i1.var14325() / 255.0F);
      zClass0729.HudArmorPanel("GlareSpeed").set(Interface.interfaceField.boolean70());
      zClass0729.HudArmorPanel("CornerSmoothness").set(var14);
      int i = val214.getScaledWidth();
      int j = val214.getScaledHeight();
      float f = var1 / (float)i;
      float f1 = ((float)j - var2 - var4) / (float)j;
      float f2 = var3 / (float)i;
      float f3 = var4 / (float)j;
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(var0, var1, var2, 0.0F).texture(f, f1 + f3).color(var6.call001());
      bufferbuilder.vertex(var0, var1, var2 + var4, 0.0F).texture(f, f1).color(var6.call001());
      bufferbuilder.vertex(var0, var1 + var3, var2 + var4, 0.0F).texture(f + f2, f1).color(var6.call001());
      bufferbuilder.vertex(var0, var1 + var3, var2, 0.0F).texture(f + f2, f1 + f3).color(var6.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      var14342();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass0723.float251();
      zClass0723.HudArmorPanel("Size").set(var3, var4);
      zClass0723.HudArmorPanel("Radius")
         .set(
            var6.var14311() * var5 / 2.0F,
            var6.string63() * var5 / 2.0F,
            var6.var14312() * var5 / 2.0F,
            var6.itemStack9() * var5 / 2.0F
         );
      zClass0723.HudArmorPanel("Smoothness").set(f);
      zClass0723.HudArmorPanel("CornerSmoothness").set(var5);
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var1 - f1 / 2.0F;
      float f4 = var2 - f2 / 2.0F;
      float f5 = var3 + f1;
      float f6 = var4 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void UiAnimation(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass07210.float251();
      zClass07210.HudArmorPanel("Size").set(var3, var4);
      zClass07210.HudArmorPanel("Radius")
         .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
      zClass07210.HudArmorPanel("Smoothness").set(f);
      zClass07210.HudArmorPanel("Progress").set(var5);
      zClass07210.HudArmorPanel("StripeWidth").set(0.0F);
      zClass07210.HudArmorPanel("Fade").set(0.5F);
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var1 - f1 / 2.0F;
      float f4 = var2 - f2 / 2.0F;
      float f5 = var3 + f1;
      float f6 = var4 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass072.float251();
      zClass072.HudArmorPanel("Size").set(var3, var4);
      zClass072.HudArmorPanel("Radius")
         .set(var5.var14311(), var5.string63(), var5.var14312(), var5.itemStack9());
      zClass072.HudArmorPanel("Smoothness").set(f);
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var1 - f1 / 2.0F;
      float f4 = var2 - f2 / 2.0F;
      float f5 = var3 + f1;
      float f6 = var4 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).color(var6.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6,
      ArgbColor var7,
      ArgbColor var8,
      ArgbColor var9
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass07211.float251();
      zClass07211.HudArmorPanel("Size").set(var3, var4);
      zClass07211.HudArmorPanel("Radius")
         .set(var5.var14311(), var5.string63(), var5.var14312(), var5.itemStack9());
      zClass07211.HudArmorPanel("Smoothness").set(f);
      zClass07211.HudArmorPanel("TopLeftColor")
         .set(
            (float)var6.float240() / 255.0F,
            (float)var6.var14323() / 255.0F,
            (float)var6.var14324() / 255.0F,
            (float)var6.var14325() / 255.0F
         );
      zClass07211.HudArmorPanel("BottomLeftColor")
         .set(
            (float)var7.float240() / 255.0F,
            (float)var7.var14323() / 255.0F,
            (float)var7.var14324() / 255.0F,
            (float)var7.var14325() / 255.0F
         );
      zClass07211.HudArmorPanel("BottomRightColor")
         .set(
            (float)var8.float240() / 255.0F,
            (float)var8.var14323() / 255.0F,
            (float)var8.var14324() / 255.0F,
            (float)var8.var14325() / 255.0F
         );
      zClass07211.HudArmorPanel("TopRightColor")
         .set(
            (float)var9.float240() / 255.0F,
            (float)var9.var14323() / 255.0F,
            (float)var9.var14324() / 255.0F,
            (float)var9.var14325() / 255.0F
         );
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var1 - f1 / 2.0F;
      float f4 = var2 - f2 / 2.0F;
      float f5 = var3 + f1;
      float f6 = var4 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).color(var8.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).color(var9.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void string30() {
      zClass072 = new ShaderWrapper(ZenithClient.on23("rectangle/data"), VertexFormats.POSITION_COLOR);
      zClass0722 = new ShaderWrapper(ZenithClient.on23("batch_rectangle/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      zClass084 = new FillShader(ZenithClient.on23("drop_shadow/data"));
      zClass0723 = new ShaderWrapper(ZenithClient.on23("squircle/data"), VertexFormats.POSITION_COLOR);
      zClass0725 = new ShaderWrapper(ZenithClient.on23("squircle_texture/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      zClass0724 = new ShaderWrapper(ZenithClient.on23("texture/data"), VertexFormats.POSITION_TEXTURE_COLOR);
      zClass0726 = new ShaderWrapper(ZenithClient.on23("border/data"), VertexFormats.POSITION_COLOR);
      zClass0727 = new ShaderWrapper(ZenithClient.on23("corner/data"), VertexFormats.POSITION_COLOR);
      zClass0728 = new ShaderWrapper(ZenithClient.on23("arc_border/data"), VertexFormats.POSITION_COLOR);
      zClass07210 = new ShaderWrapper(ZenithClient.on23("loading/data"), VertexFormats.POSITION_COLOR);
      zClass07211 = new ShaderWrapper(ZenithClient.on23("gradient_rectangle/data"), VertexFormats.POSITION_COLOR);
      zClass0729 = new ShaderWrapper(ZenithClient.on23("liquidglass/data"), VertexFormats.POSITION_TEXTURE_COLOR);
   }

   public static void UiAnimation(float var0, float var1, float var2, float var3, boolean var4) {
      BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      byte b0 = -1;
      float f = var4 ? 0.0F : 1.0F;
      float f1 = var4 ? 1.0F : 0.0F;
      bufferbuilder.vertex(var0, var1, 0.0F).texture(0.0F, f1).color(-1);
      bufferbuilder.vertex(var0, var1 + var3, 0.0F).texture(0.0F, f).color(-1);
      bufferbuilder.vertex(var0 + var2, var1 + var3, 0.0F).texture(1.0F, f).color(-1);
      bufferbuilder.vertex(var0 + var2, var1, 0.0F).texture(1.0F, f1).color(-1);
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
   }

   public static float ColorAnimator(float var0, float var1, float var2, float var3, float var4) {
      float f = 1.0F - var0;
      float f1 = var0 * var0;
      float f2 = f * f;
      return f2 * f * var1 + 3.0F * f2 * var0 * var2 + 3.0F * f * f1 * var3 + f1 * var0 * var4;
   }

   public static void on23(MatrixStack var0, float var1, float var2, float var3, float var4, ArgbColor var5) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
      boolean78();
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, var1, var2 + var4, 0.0F).color(var5.call001());
      bufferbuilder.vertex(matrix4f, var1 + var3, var2 + var4, 0.0F).color(var5.call001());
      bufferbuilder.vertex(matrix4f, var1 + var3, var2, 0.0F).color(var5.call001());
      bufferbuilder.vertex(matrix4f, var1, var2, 0.0F).color(var5.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6,
      float var7,
      float var8,
      ArgbColor var9,
      float var10,
      boolean var11,
      float var12,
      float var13,
      float var14
   ) {
      on23(var0.peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      ArgbColor var8
   ) {
      on23(var0.peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void on23(
      Matrix4f var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      ArgbColor var8
   ) {
      var7 = new org.zenith.utility.render.display.base.CornerRadius(
         var7.var14311() * var5 / 2.0F,
         var7.var14312() * var5 / 2.0F,
         var7.itemStack9() * var5 / 2.0F,
         var7.string63() * var5 / 2.0F
      );
      float f = 1.5F;
      on23(
         var0,
         var1 - f,
         var2 - f,
         var3 + f * 2.0F,
         var4 + f * 2.0F,
         var7,
         var8,
         (float)var8.var14325() / 255.0F,
         var4 == 240.0F ? 100.0F : 50.0F,
         var8.EventHookWorldRender(255),
         1.0F,
         true,
         0.0F,
         var6,
         var5
      );
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      boolean var8
   ) {
      var6 = new org.zenith.utility.render.display.base.CornerRadius(
         var6.var14311() * var5 / 2.0F,
         var6.var14312() * var5 / 2.0F,
         var6.itemStack9() * var5 / 2.0F,
         var6.string63() * var5 / 2.0F
      );
      on23(
         var0,
         var1,
         var2,
         var3,
         var4,
         var6,
         var7,
         (float)var7.var14325() / 255.0F,
         var4 == 240.0F ? 100.0F : 50.0F,
         var7.EventHookWorldRender(255),
         1.0F,
         true,
         0.0F,
         0.08F,
         var5
      );
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      org.zenith.utility.render.display.base.GradientRadius var6
   ) {
      on23(
         var0, var1, var2, var3, var4, var5, var6.call010(), var6.call014(), var6.call017(), var6.call052()
      );
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      org.zenith.utility.render.display.base.GradientRadius var7
   ) {
      on23(
         var0, var1, var2, var3, var4, var5, var6, var7.call010(), var7.call014(), var7.call017(), var7.call052()
      );
   }

   public static void Easing(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, var7, var7, var7, var7);
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      ArgbColor var8,
      ArgbColor var9,
      ArgbColor var10
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.4F;
      float f1 = 0.4F;
      if ((double)var5 >= 0.15) {
         f = 0.6F;
         f1 = f;
      }

      zClass0726.float251();
      zClass0726.HudArmorPanel("Size").set(var3, var4);
      zClass0726.HudArmorPanel("Radius")
         .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
      zClass0726.HudArmorPanel("Smoothness").set(f, f1);
      zClass0726.HudArmorPanel("Thickness").set(var5);
      boolean78();
      float f2 = -f1 / 2.0F + f1 * 2.0F;
      float f3 = f1 / 2.0F + f1;
      float f4 = var1 - f2 / 2.0F;
      float f5 = var2 - f3 / 2.0F;
      float f6 = var3 + f2;
      float f7 = var4 + f3;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f4, f5, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f4, f5 + f7, 0.0F).color(var8.call001());
      bufferbuilder.vertex(matrix4f, f4 + f6, f5 + f7, 0.0F).color(var9.call001());
      bufferbuilder.vertex(matrix4f, f4 + f6, f5, 0.0F).color(var10.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      org.zenith.utility.render.display.base.GradientRadius var8
   ) {
      on23(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         var8.call010(),
         var8.call014(),
         var8.call017(),
         var8.call052()
      );
   }

   public static void on23(
      MatrixStack var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, ArgbColor var8
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, var7, var8, var8, var8, var8);
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      ArgbColor var8,
      ArgbColor var9,
      ArgbColor var10,
      ArgbColor var11
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.4F;
      float f1 = 0.4F;
      float f2 = Math.max(0.0F, Math.min(360.0F, var6));
      float f3 = Math.max(0.0F, Math.min(1.0F, var7));
      zClass0728.float251();
      zClass0728.HudArmorPanel("Size").set(var3, var4);
      zClass0728.HudArmorPanel("Smoothness").set(f, f1);
      zClass0728.HudArmorPanel("Thickness").set(var5);
      zClass0728.HudArmorPanel("ArcDegrees").set(f2);
      zClass0728.HudArmorPanel("CapRoundness").set(f3);
      boolean78();
      float f4 = -f1 / 2.0F + f1 * 2.0F;
      float f5 = f1 / 2.0F + f1;
      float f6 = var1 - f4 / 2.0F;
      float f7 = var2 - f5 / 2.0F;
      float f8 = var3 + f4;
      float f9 = var4 + f5;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f6, f7, 0.0F).color(var8.call001());
      bufferbuilder.vertex(matrix4f, f6, f7 + f9, 0.0F).color(var9.call001());
      bufferbuilder.vertex(matrix4f, f6 + f8, f7 + f9, 0.0F).color(var10.call001());
      bufferbuilder.vertex(matrix4f, f6 + f8, f7, 0.0F).color(var11.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      ArgbColor var7,
      org.zenith.utility.render.display.base.CornerRadius var8
   ) {
      var1 -= 0.3F;
      var2 -= 0.3F;
      var3 += 0.6F;
      var4 += 0.6F;
      on23(var0, var1, var2, var6, var6, var5, var8, var7, 0.0F);
      on23(var0, var1 + var3 - var6, var2, var6, var6, var5, var8, var7, 1.0F);
      on23(var0, var1, var2 + var4 - var6, var6, var6, var5, var8, var7, 2.0F);
      on23(var0, var1 + var3 - var6, var2 + var4 - var6, var6, var6, var5, var8, var7, 3.0F);
   }

   public static void UiAnimation(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      ArgbColor var7,
      org.zenith.utility.render.display.base.CornerRadius var8
   ) {
      if (Interface.interfaceField.isFalse()) {
         var1 -= 0.3F;
         var2 -= 0.3F;
         var3 += 0.6F;
         var4 += 0.6F;
         on23(var0, var1, var2, var6, var6, var5, var8, var7, 0.0F);
         on23(var0, var1 + var3 - var6, var2, var6, var6, var5, var8, var7, 1.0F);
         on23(var0, var1, var2 + var4 - var6, var6, var6, var5, var8, var7, 2.0F);
         on23(var0, var1 + var3 - var6, var2 + var4 - var6, var6, var6, var5, var8, var7, 3.0F);
      }
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      float var8
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      float f1 = 1.0F;
      zClass0727.float251();
      zClass0727.HudArmorPanel("Size").set(var3, var4);
      zClass0727.HudArmorPanel("Radius")
         .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
      zClass0727.HudArmorPanel("Smoothness").set(f, f1);
      zClass0727.HudArmorPanel("Thickness").set(var5);
      zClass0727.HudArmorPanel("CornerIndex").set(var8);
      boolean78();
      float f2 = -f1 / 2.0F + f1 * 2.0F;
      float f3 = f1 / 2.0F + f1;
      float f4 = var1 - f2 / 2.0F;
      float f5 = var2 - f3 / 2.0F;
      float f6 = var3 + f2;
      float f7 = var4 + f3;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f4, f5, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f4, f5 + f7, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f4 + f6, f5 + f7, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f4 + f6, f5, 0.0F).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(MatrixStack var0, Identifier var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, var1);
      boolean78();
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(matrix4f, var2, var3, 0.0F).texture(0.0F, 0.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, var2, var3 + var5, 0.0F).texture(0.0F, 1.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, var2 + var4, var3 + var5, 0.0F).texture(1.0F, 1.0F).color(var6.call001());
      bufferbuilder.vertex(matrix4f, var2 + var4, var3, 0.0F).texture(1.0F, 0.0F).color(var6.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      RenderSystem.setShaderTexture(0, 0);
      var0.pop();
   }

   public static void on23(
      MatrixStack var0, Identifier var1, float var2, float var3, float var4, float var5, org.zenith.utility.render.display.base.GradientRadius var6
   ) {
      var0.push();
      on23(var0.peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6);
      var0.pop();
   }

   public static void on23(
      Matrix4f var0, Identifier var1, float var2, float var3, float var4, float var5, org.zenith.utility.render.display.base.GradientRadius var6
   ) {
      MsdfRenderer.flushBatch();
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, var1);
      boolean78();
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(var0, var2, var3, 0.0F).texture(0.0F, 0.0F).color(var6.call010().call001());
      bufferbuilder.vertex(var0, var2, var3 + var5, 0.0F).texture(0.0F, 1.0F).color(var6.call014().call001());
      bufferbuilder.vertex(var0, var2 + var4, var3 + var5, 0.0F).texture(1.0F, 1.0F).color(var6.call017().call001());
      bufferbuilder.vertex(var0, var2 + var4, var3, 0.0F).texture(1.0F, 0.0F).color(var6.call052().call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      RenderSystem.setShaderTexture(0, 0);
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      ArgbColor var10
   ) {
      MsdfRenderer.flushBatch();
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      var0.push();
      int i = var10.call001();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = var2 + var4;
      float f1 = var3 + var5;
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      RenderSystem.setShaderTexture(0, var1);
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(matrix4f, var2, var3, 0.0F).texture(var6, var8).color(i);
      bufferbuilder.vertex(matrix4f, var2, f1, 0.0F).texture(var6, var9).color(i);
      bufferbuilder.vertex(matrix4f, f, f1, 0.0F).texture(var7, var9).color(i);
      bufferbuilder.vertex(matrix4f, f, var3, 0.0F).texture(var7, var8).color(i);
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      RenderSystem.setShaderTexture(0, 0);
      var0.pop();
      RenderSystem.disableBlend();
   }

   public static void on23(
      MatrixStack var0, org.zenith.utility.render.display.base.GuiSprite var1, float var2, float var3, float var4, float var5, ArgbColor var6
   ) {
      on23(var0, var1.booleanSupplier2(), var2, var3, var4, var5, 0.0F, 1.0F, 0.0F, 1.0F, var6);
   }

   public static void on23(
      MatrixStack var0, VertexConsumerProvider var1, float var2, float var3, float var4, float var5, ArgbColor var6
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      VertexConsumer vertexconsumer = var1.getBuffer(RenderLayer.getGui());
      int i = var6.call001();
      vertexconsumer.vertex(matrix4f, var2, var3 + var5, 0.0F).color(i);
      vertexconsumer.vertex(matrix4f, var2 + var4, var3 + var5, 0.0F).color(i);
      vertexconsumer.vertex(matrix4f, var2 + var4, var3, 0.0F).color(i);
      vertexconsumer.vertex(matrix4f, var2, var3, 0.0F).color(i);
   }

   public static void on23(
      MatrixStack var0, VertexConsumerProvider var1, Identifier var2, float var3, float var4, float var5, float var6, ArgbColor var7
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      VertexConsumer vertexconsumer = var1.getBuffer(RenderLayer.getGuiTextured(var2));
      int i = var7.call001();
      vertexconsumer.vertex(matrix4f, var3, var4, 0.0F).texture(0.0F, 0.0F).color(i);
      vertexconsumer.vertex(matrix4f, var3, var4 + var6, 0.0F).texture(0.0F, 1.0F).color(i);
      vertexconsumer.vertex(matrix4f, var3 + var5, var4 + var6, 0.0F).texture(1.0F, 1.0F).color(i);
      vertexconsumer.vertex(matrix4f, var3 + var5, var4, 0.0F).texture(1.0F, 0.0F).color(i);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      Identifier var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.GradientRadius var7
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      VertexConsumer vertexconsumer = var1.getBuffer(RenderLayer.getGuiTextured(var2));
      vertexconsumer.vertex(matrix4f, var3, var4, 0.0F).texture(0.0F, 0.0F).color(var7.call010().call001());
      vertexconsumer.vertex(matrix4f, var3, var4 + var6, 0.0F).texture(0.0F, 1.0F).color(var7.call014().call001());
      vertexconsumer.vertex(matrix4f, var3 + var5, var4 + var6, 0.0F).texture(1.0F, 1.0F).color(var7.call017().call001());
      vertexconsumer.vertex(matrix4f, var3 + var5, var4, 0.0F).texture(1.0F, 0.0F).color(var7.call052().call001());
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      Identifier var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      ArgbColor var11
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = var3 + var5;
      float f1 = var4 + var6;
      int i = var11.call001();
      VertexConsumer vertexconsumer = var1.getBuffer(RenderLayer.getGuiTextured(var2));
      vertexconsumer.vertex(matrix4f, var3, var4, 0.0F).texture(var7, var9).color(i);
      vertexconsumer.vertex(matrix4f, var3, f1, 0.0F).texture(var7, var10).color(i);
      vertexconsumer.vertex(matrix4f, f, f1, 0.0F).texture(var8, var10).color(i);
      vertexconsumer.vertex(matrix4f, f, var4, 0.0F).texture(var8, var9).color(i);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      org.zenith.utility.render.display.base.GuiSprite var2,
      float var3,
      float var4,
      float var5,
      float var6,
      ArgbColor var7
   ) {
      on23(var0, var1, var2.booleanSupplier2(), var3, var4, var5, var6, 0.0F, 1.0F, 0.0F, 1.0F, var7);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      on23(var0, var2, var3, var4, var5, var6, var7);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      org.zenith.utility.render.display.base.GradientRadius var7
   ) {
      on23(var0, var2, var3, var4, var5, var6, var7);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      org.zenith.utility.render.display.base.GradientRadius var8
   ) {
      on23(var0, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void on23(
      MatrixStack var0,
      VertexConsumerProvider var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      ArgbColor var8
   ) {
      Easing(var0, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void UiAnimation(
      MatrixStack var0,
      VertexConsumerProvider var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      ArgbColor var8
   ) {
      on23(var0, var2, var3, var4, var5, var6, var7, var8);
   }

   public static void on23(
      MatrixStack var0, Identifier var1, float var2, float var3, float var4, float var5, org.zenith.utility.render.display.base.CornerRadius var6
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, ArgbColor.var11934);
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      ArgbColor var8,
      ArgbColor var9,
      ArgbColor var10
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass0724.float251();
      RenderSystem.setShaderTexture(0, var1);
      zClass0724.HudArmorPanel("Size").set(var4, var5);
      zClass0724.HudArmorPanel("Radius")
         .set(
            var6.var14311() * 2.0F,
            var6.string63() * 2.0F,
            var6.var14312() * 2.0F,
            var6.itemStack9() * 2.0F
         );
      zClass0724.HudArmorPanel("Smoothness").set(f);
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var2 - f1 / 2.0F;
      float f4 = var3 - f2 / 2.0F;
      float f5 = var4 + f1;
      float f6 = var5 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).texture(0.0F, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).texture(0.0F, 1.0F).color(var8.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).texture(1.0F, 1.0F).color(var9.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).texture(1.0F, 0.0F).color(var10.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      RenderSystem.setShaderTexture(0, 0);
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, var7, var7, var7, var7);
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      org.zenith.utility.render.display.base.GradientRadius var7
   ) {
      on23(
         var0, var1, var2, var3, var4, var5, var6, var7.call010(), var7.call014(), var7.call017(), var7.call052()
      );
   }

   public static void ColorAnimator(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      zClass072.float251();
      zClass072.HudArmorPanel("Size").set(var3, var4);
      zClass072.HudArmorPanel("Radius")
         .set(
            var6.var14311() * 3.0F,
            var6.string63() * 3.0F,
            var6.var14312() * 3.0F,
            var6.itemStack9() * 3.0F
         );
      zClass072.HudArmorPanel("Smoothness").set(var5);
      boolean78();
      float f = -var5 / 2.0F + var5 * 2.0F;
      float f1 = var5 / 2.0F + var5;
      float f2 = var1 - f / 2.0F;
      float f3 = var2 - f1 / 2.0F;
      float f4 = var3 + f;
      float f5 = var4 + f1;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      bufferbuilder.vertex(matrix4f, f2, f3, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f2, f3 + f5, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f2 + f4, f3 + f5, 0.0F).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f2 + f4, f3, 0.0F).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      org.zenith.utility.render.display.base.CornerRadius var9,
      ArgbColor var10
   ) {
      on23(var0.peek().getPositionMatrix(), var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
   }

   public static void on23(
      Matrix4f var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      org.zenith.utility.render.display.base.CornerRadius var9,
      ArgbColor var10
   ) {
      float f = var3;
      float f1 = var4;
      if (!(var3 <= 0.0F) && !(var4 <= 0.0F) && var10.var14325() != 0) {
         MsdfRenderer.flushBatch();

         try {
            float f2 = (float)Math.ceil((double)(Math.max(0.0F, var7) * 1.5F + Math.max(0.0F, var8))) + 1.0F;
            float f3 = var1 + var5;
            float f4 = var2 + var6;
            float f5 = f3 - f2;
            float f6 = f4 - f2;
            float f7 = f + f2 * 2.0F;
            float f8 = f1 + f2 * 2.0F;
            zClass084.float251();
            zClass084.on23(f7, f8, f, f1, f2, Math.max(0.0F, var7), var8, var9);
            boolean78();
            BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
            bufferbuilder.vertex(var0, f5, f6, 0.0F).color(var10.call001());
            bufferbuilder.vertex(var0, f5, f6 + f8, 0.0F).color(var10.call001());
            bufferbuilder.vertex(var0, f5 + f7, f6 + f8, 0.0F).color(var10.call001());
            bufferbuilder.vertex(var0, f5 + f7, f6, 0.0F).color(var10.call001());
            BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         } finally {
            var14342();
         }
      }
   }

   public static void ItemRegistry(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      on23(
         var0,
         var1,
         var2,
         var3,
         var4,
         var5,
         var6,
         var7,
         (Interface.interfaceField.string88() || Interface.interfaceField.float30()) && boolean184,
         Interface.interfaceField.string129()
      );
   }

   public static void on23(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      boolean var8,
      boolean var9
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      if (var9 && Interface.interfaceField.float31()) {
         on23(
            matrix4f,
            var1,
            var2,
            var3,
            var4,
            Interface.interfaceField.boolean69(),
            org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(Interface.float212())
         );
      }

      if (var8) {
         on23(matrix4f, var1, var2, var3, var4, var6, var7, Interface.interfaceField.float30());
      }

      if (var9 && !Interface.interfaceField.float31()) {
         on23(
            matrix4f,
            var1,
            var2,
            var3,
            var4,
            Interface.interfaceField.boolean69(),
            org.zenith.utility.render.display.base.CornerRadius.MovementInputEvent(Interface.float212())
         );
      }
   }

   public static void on23(
      MatrixStack var0, float var1, float var2, float var3, float var4, int var5, org.zenith.utility.render.display.base.CornerRadius var6
   ) {
      AvatarRenderer.on23(
         var0, var1, var2, var3, var4, var5, var6, ZenithClient.on23().TextScanner().getGlowColor()
      );
   }

   public static void on23(
      Matrix4f var0, float var1, float var2, float var3, float var4, int var5, org.zenith.utility.render.display.base.CornerRadius var6
   ) {
      AvatarRenderer.on23(
         var0, var1, var2, var3, var4, var5, var6, ZenithClient.on23().TextScanner().getGlowColor()
      );
   }

   public static void on23(
      Matrix4f var0,
      float var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6,
      boolean var7
   ) {
      if (ZenithClient.on23().NbtEditor().getBlurPower() != 0.0F) {
         MsdfRenderer.flushBatch();
         if (var7) {
            on23(var0, var1, var2, var3, var4, 10.0F, 0.08F, var5, var6);
         } else {
            ZenithClient.on23().ModuleStateStore().on23(var0, var1, var2, var3, var4, var5, var6);
         }
      }
   }

   public static void ItemSpec(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      MsdfRenderer.flushBatch();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      ZenithClient.on23().ModuleStateStore().UiAnimation(matrix4f, var1, var2, var3, var4, var6, var7);
   }

   public static void TextScanner(
      MatrixStack var0,
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7
   ) {
      MsdfRenderer.flushBatch();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      ZenithClient.on23().ModuleStateStore().on23(matrix4f, var1, var2, var3, var4, var6, var7);
   }

   public static void on23(
      MatrixStack var0, BufferBuilder var1, double var2, double var4, double var6, double var8, double var10, ArgbColor var12
   ) {
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      var1.vertex(matrix4f, (float)var2, (float)(var4 + var10), (float)var6).texture(0.0F, 1.0F).color(var12.call001());
      var1.vertex(matrix4f, (float)(var2 + var8), (float)(var4 + var10), (float)var6).texture(1.0F, 1.0F).color(var12.call001());
      var1.vertex(matrix4f, (float)(var2 + var8), (float)var4, (float)var6).texture(1.0F, 0.0F).color(var12.call001());
      var1.vertex(matrix4f, (float)var2, (float)var4, (float)var6).texture(0.0F, 0.0F).color(var12.call001());
   }

   public static void on23(
      MatrixStack var0, Identifier var1, double var2, double var4, double var6, double var8, double var10, ArgbColor var12
   ) {
      MsdfRenderer.flushBatch();
      RenderSystem.setShaderTexture(0, var1);
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      bufferbuilder.vertex(matrix4f, (float)var2, (float)(var4 + var10), (float)var6).texture(0.0F, 1.0F).color(var12.call001());
      bufferbuilder.vertex(matrix4f, (float)(var2 + var8), (float)(var4 + var10), (float)var6).texture(1.0F, 1.0F).color(var12.call001());
      bufferbuilder.vertex(matrix4f, (float)(var2 + var8), (float)var4, (float)var6).texture(1.0F, 0.0F).color(var12.call001());
      bufferbuilder.vertex(matrix4f, (float)var2, (float)var4, (float)var6).texture(0.0F, 0.0F).color(var12.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6
   ) {
      on23(var0, var1, var2, var3, var4, var4, var5, var6, 0.125F, 0.125F, 0.25F, 0.25F);
   }

   public static void UiAnimation(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      org.zenith.utility.render.display.base.CornerRadius var5,
      ArgbColor var6
   ) {
      if (var1 == DefaultSkinHelper.getSteve().texture()) {
         on23(var0, var1, var2, var3, var4, var4, var5, var6, 0.125F, 0.125F, 0.25F, 0.25F);
      } else {
         on23(var0, var1, var2, var3, var4, var4, var5, var6, 0.0F, 0.0F, 1.0F, 1.0F);
      }
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, false);
   }

   public static void UiAnimation(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      on23(var0, var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, true);
   }

   public static void on23(
      MatrixStack var0,
      Identifier var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass0724.float251();
      RenderSystem.setShaderTexture(0, var1);
      zClass0724.HudArmorPanel("Size").set(var4, var5);
      zClass0724.HudArmorPanel("Radius")
         .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
      zClass0724.HudArmorPanel("Smoothness").set(f);
      boolean78();
      if (var12) {
         RenderSystem.blendFuncSeparate(SrcFactor.SRC_ALPHA, DstFactor.ONE, SrcFactor.ZERO, DstFactor.ONE);
      }

      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var2 - f1 / 2.0F;
      float f4 = var3 - f2 / 2.0F;
      float f5 = var4 + f1;
      float f6 = var5 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).texture(var8, var9).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).texture(var8, var11).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).texture(var10, var11).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).texture(var10, var9).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      if (var12) {
         RenderSystem.defaultBlendFunc();
      }

      var14342();
      RenderSystem.setShaderTexture(0, 0);
      var0.pop();
   }

   public static void on23(
      MatrixStack var0,
      int var1,
      float var2,
      float var3,
      float var4,
      float var5,
      org.zenith.utility.render.display.base.CornerRadius var6,
      ArgbColor var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      MsdfRenderer.flushBatch();
      var0.push();
      Matrix4f matrix4f = var0.peek().getPositionMatrix();
      float f = 0.8F;
      zClass0724.float251();
      RenderSystem.setShaderTexture(0, var1);
      zClass0724.HudArmorPanel("Size").set(var4, var5);
      zClass0724.HudArmorPanel("Radius")
         .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
      zClass0724.HudArmorPanel("Smoothness").set(f);
      boolean78();
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var2 - f1 / 2.0F;
      float f4 = var3 - f2 / 2.0F;
      float f5 = var4 + f1;
      float f6 = var5 + f2;
      BufferBuilder bufferbuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      bufferbuilder.vertex(matrix4f, f3, f4, 0.0F).texture(var8, var9).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3, f4 + f6, 0.0F).texture(var8, var11).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4 + f6, 0.0F).texture(var10, var11).color(var7.call001());
      bufferbuilder.vertex(matrix4f, f3 + f5, f4, 0.0F).texture(var10, var9).color(var7.call001());
      BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      var14342();
      RenderSystem.setShaderTexture(0, 0);
      var0.pop();
   }

   public static void boolean78() {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
   }

   public static void var14342() {
      RenderSystem.disableBlend();
   }

   public ShapeRenderer() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}

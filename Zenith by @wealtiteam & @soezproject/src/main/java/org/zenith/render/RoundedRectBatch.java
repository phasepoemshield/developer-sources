package org.zenith.render;

import org.zenith.base.font.Font;
import org.zenith.core.HudArmorPanel;
import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ShaderWrapper;
import org.zenith.core.PlayerStateService;

import org.zenith.base.font.MsdfRenderer;
















import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public class RoundedRectBatch {
   public BufferBuilder bufferBuilder;
   public float float176;
   public float float177;
   public float float178;
   public float float179;
   public float batchSmoothness;
   public boolean PlayerStateService;

   public RoundedRectBatch() {
   }

   public void on23(org.zenith.utility.render.display.base.CornerRadius var1) {
      this.on23(var1, 0.8F);
   }

   public void on23(org.zenith.utility.render.display.base.CornerRadius var1, float var2) {
      MsdfRenderer.flushBatch();
      float f = var1.var14311();
      float f1 = var1.string63();
      float f2 = var1.var14312();
      float f3 = var1.itemStack9();
      if (this.PlayerStateService) {
         if (f == this.float176 && f1 == this.float177 && f2 == this.float178 && f3 == this.float179 && var2 == this.batchSmoothness) {
            return;
         }

         this.flush();
      }

      this.float176 = f;
      this.float177 = f1;
      this.float178 = f2;
      this.float179 = f3;
      this.batchSmoothness = var2;
      ShaderWrapper l1l1ii11lllll = ShapeRenderer.zClass0722;
      l1l1ii11lllll.float251();
      l1l1ii11lllll.HudArmorPanel("Radius").set(f, f1, f2, f3);
      l1l1ii11lllll.HudArmorPanel("Smoothness").set(var2);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      this.bufferBuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      this.PlayerStateService = true;
   }

   public void Easing(Matrix4f var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      float f = this.batchSmoothness;
      float f1 = -f / 2.0F + f * 2.0F;
      float f2 = f / 2.0F + f;
      float f3 = var2 - f1 / 2.0F;
      float f4 = var3 - f2 / 2.0F;
      float f5 = var4 + f1;
      float f6 = var5 + f2;
      int i = var6.call001();
      this.bufferBuilder.vertex(var1, f3, f4, 0.0F).texture(var4, var5).color(i);
      this.bufferBuilder.vertex(var1, f3, f4 + f6, 0.0F).texture(var4, var5).color(i);
      this.bufferBuilder.vertex(var1, f3 + f5, f4 + f6, 0.0F).texture(var4, var5).color(i);
      this.bufferBuilder.vertex(var1, f3 + f5, f4, 0.0F).texture(var4, var5).color(i);
   }

   public void flush() {
      if (this.PlayerStateService) {
         BufferRenderer.drawWithGlobalProgram(this.bufferBuilder.end());
         RenderSystem.disableBlend();
         this.bufferBuilder = null;
         this.PlayerStateService = false;
      }
   }

   public boolean isStarted() {
      return this.PlayerStateService;
   }
}

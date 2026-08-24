package org.zenith.render;

import org.zenith.base.font.Font;

import org.zenith.util.ArgbColor;
import org.zenith.core.Easing;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.PlayerStateService;

import org.zenith.base.font.MsdfRenderer;
















import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public class RectBatch {
   public BufferBuilder bufferBuilder;
   public boolean PlayerStateService;

   public RectBatch() {
   }

   public boolean isStarted() {
      return this.PlayerStateService;
   }

   public void map44() {
      MsdfRenderer.flushBatch();
      if (!this.PlayerStateService) {
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         this.bufferBuilder = RenderSystem.renderThreadTesselator().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         this.PlayerStateService = true;
      }
   }

   public void Easing(Matrix4f var1, float var2, float var3, float var4, float var5, ArgbColor var6) {
      int i = var6.call001();
      this.bufferBuilder.vertex(var1, var2, var3 + var5, 0.0F).color(i);
      this.bufferBuilder.vertex(var1, var2 + var4, var3 + var5, 0.0F).color(i);
      this.bufferBuilder.vertex(var1, var2 + var4, var3, 0.0F).color(i);
      this.bufferBuilder.vertex(var1, var2, var3, 0.0F).color(i);
   }

   public void flush() {
      if (this.PlayerStateService) {
         BufferRenderer.drawWithGlobalProgram(this.bufferBuilder.end());
         RenderSystem.disableBlend();
         this.bufferBuilder = null;
         this.PlayerStateService = false;
      }
   }
}

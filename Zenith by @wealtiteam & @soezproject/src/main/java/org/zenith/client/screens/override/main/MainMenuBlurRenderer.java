package org.zenith.client.screens.override.main;

import org.zenith.base.font.Font;
import org.zenith.core.UiAnimation;

import org.zenith.utility.render.display.base.CornerRadius;

import org.zenith.util.ArgbColor;
import org.zenith.base.font.MsdfRenderer;
import org.zenith.base.font.ResourceProvider;
import org.zenith.utility.render.display.base.HudDrawContext;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientProvider;
import org.zenith.core.AvatarRenderer;















import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.ShaderLoader;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.ShaderLoader.LoadException;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public final class MainMenuBlurRenderer implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final int DOWNSAMPLE_FACTOR = 2;
   public static final float[] KAWASE_OFFSETS = new float[]{0.5F, 1.5F, 2.5F, 3.0F};
   public SimpleFramebuffer backgroundFbo;
   public SimpleFramebuffer tempFbo;
   public ShaderProgramKey kawaseShaderKey;
   public ShaderProgramKey maskShaderKey;

   public MainMenuBlurRenderer() {
   }

   public void capture(HudDrawContext var1, float var2) {
      if (minecraftClient3.getShaderLoader() != null && !(var2 <= 0.0F)) {
         MsdfRenderer.flushBatch();
         Framebuffer framebuffer = minecraftClient3.getFramebuffer();
         this.ensureFramebuffers(framebuffer);
         this.blurCurrentFramebuffer(framebuffer, var1.getMatrices().peek().getPositionMatrix(), var2);
      }
   }

   public void render(Matrix4f var1, float var2, float var3, float var4, float var5, CornerRadius var6, ArgbColor var7) {
      if (this.backgroundFbo != null && minecraftClient3.getShaderLoader() != null) {
         if (this.maskShaderKey == null) {
            this.maskShaderKey = new ShaderProgramKey(ResourceProvider.getShaderIdentifier("wtf/data"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
         }

         if (this.isShaderReady(this.maskShaderKey)) {
            MsdfRenderer.flushBatch();
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();

            try {
               RenderSystem.setShaderTexture(0, this.backgroundFbo.getColorAttachment());
               ShaderProgram shaderprogram = RenderSystem.setShader(this.maskShaderKey);
               if (shaderprogram != null) {
                  shaderprogram.getUniform("Size").set(var4, var5);
                  shaderprogram.getUniform("Radius")
                     .set(var6.var14311(), var6.string63(), var6.var14312(), var6.itemStack9());
                  shaderprogram.getUniform("Smoothness").set(0.01F);
                  BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                  bufferbuilder.vertex(var1, var2, var3, 0.0F).color(var7.call001());
                  bufferbuilder.vertex(var1, var2, var3 + var5, 0.0F).color(var7.call001());
                  bufferbuilder.vertex(var1, var2 + var4, var3 + var5, 0.0F).color(var7.call001());
                  bufferbuilder.vertex(var1, var2 + var4, var3, 0.0F).color(var7.call001());
                  BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
                  return;
               }
            } finally {
               RenderSystem.setShaderTexture(0, 0);
               RenderSystem.enableCull();
               RenderSystem.disableBlend();
            }
         }
      }
   }

   public void blurCurrentFramebuffer(Framebuffer var1, Matrix4f var2, float var3) {
      if (this.kawaseShaderKey == null) {
         this.kawaseShaderKey = new ShaderProgramKey(ResourceProvider.getShaderIdentifier("kawase_blur/data"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
      }

      if (!this.isShaderReady(this.kawaseShaderKey)) {
         var1.beginWrite(true);
      } else {
         float f = 1.0F / (float)this.backgroundFbo.textureWidth;
         float f1 = 1.0F / (float)this.backgroundFbo.textureHeight;
         RenderSystem.disableBlend();
         RenderSystem.disableCull();

         try {
            this.downsample(var1, this.backgroundFbo);
            SimpleFramebuffer simpleframebuffer = this.backgroundFbo;
            SimpleFramebuffer simpleframebuffer1 = this.tempFbo;

            for (float f2 : KAWASE_OFFSETS) {
               float f3 = f2 * var3 / 10.0F;
               if (!this.kawasePass(simpleframebuffer.getColorAttachment(), simpleframebuffer1, var2, f, f1, f3)) {
                  return;
               }

               SimpleFramebuffer simpleframebuffer2 = simpleframebuffer;
               simpleframebuffer = simpleframebuffer1;
               simpleframebuffer1 = simpleframebuffer2;
            }
         } finally {
            RenderSystem.enableCull();
            var1.beginWrite(true);
         }
      }
   }

   public void downsample(Framebuffer var1, Framebuffer var2) {
      var2.beginWrite(true);
      GlStateManager._glBindFramebuffer(36008, var1.fbo);
      GlStateManager._glBindFramebuffer(36009, var2.fbo);
      GlStateManager._glBlitFrameBuffer(0, 0, var1.textureWidth, var1.textureHeight, 0, 0, var2.textureWidth, var2.textureHeight, 16384, 9729);
   }

   public boolean kawasePass(int var1, Framebuffer var2, Matrix4f var3, float var4, float var5, float var6) {
      var2.beginWrite(false);
      RenderSystem.setShaderTexture(0, var1);
      ShaderProgram shaderprogram = RenderSystem.setShader(this.kawaseShaderKey);
      if (shaderprogram == null) {
         RenderSystem.setShaderTexture(0, 0);
         return false;
      } else {
         shaderprogram.getUniform("Resolution").set(var4, var5);
         shaderprogram.getUniform("Offset").set(var6);
         BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
         AvatarRenderer.UiAnimation(var3, bufferbuilder, 0.0F, 0.0F, (float)var2.textureWidth, (float)var2.textureHeight, -1);
         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
         RenderSystem.setShaderTexture(0, 0);
         return true;
      }
   }

   public void ensureFramebuffers(Framebuffer var1) {
      int i = Math.max(1, var1.textureWidth / 2);
      int j = Math.max(1, var1.textureHeight / 2);
      this.backgroundFbo = this.ensureFramebuffer(this.backgroundFbo, i, j);
      this.tempFbo = this.ensureFramebuffer(this.tempFbo, i, j);
   }

   public SimpleFramebuffer ensureFramebuffer(SimpleFramebuffer var1, int var2, int var3) {
      if (var1 == null) {
         var1 = new SimpleFramebuffer(var2, var3, false);
         var1.setTexFilter(9729);
      } else if (var1.textureWidth != var2 || var1.textureHeight != var3) {
         var1.resize(var2, var3);
         var1.setTexFilter(9729);
      }

      return var1;
   }

   public boolean isShaderReady(ShaderProgramKey var1) {
      ShaderLoader shaderloader = minecraftClient3.getShaderLoader();
      if (shaderloader == null) {
         return false;
      } else {
         try {
            return shaderloader.getProgramToLoad(var1) != null;
         } catch (LoadException loadexception) {
            return false;
         }
      }
   }

   public void close() {
      if (this.backgroundFbo != null) {
         this.backgroundFbo.delete();
         this.backgroundFbo = null;
      }

      if (this.tempFbo != null) {
         this.tempFbo.delete();
         this.tempFbo = null;
      }
   }
}

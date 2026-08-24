package org.zenith.render;

import org.zenith.base.font.Font;
import org.zenith.core.NbtEditor;
import org.zenith.module.Module;
import org.zenith.module.WarpFarm;
import org.zenith.utility.render.display.base.CornerRadius;
import org.zenith.utility.render.display.base.HudDrawContext;

import org.zenith.util.ArgbColor;
import org.zenith.ZenithClient;
import org.zenith.core.UiAnimation;
import org.zenith.core.Easing;
import org.zenith.core.ServiceException;
import org.zenith.core.BotFeatureRegistry;
import org.zenith.core.PermissionListCodec;
import org.zenith.core.EmotePlayback;
import org.zenith.core.BooleanValue;
import org.zenith.core.ClickFxController;
import org.zenith.core.CloudResponse;
import org.zenith.core.ClientProvider;
import org.zenith.core.AvatarRenderer;

import org.zenith.module.Interface;
import org.zenith.module.Menu;

import org.zenith.event.EventGetBasicProjectionMatrixHook;
import org.zenith.event.EventRenderScreenHook;

import org.zenith.base.font.MsdfRenderer;
import org.zenith.base.font.ResourceProvider;
















import net.minecraft.client.MinecraftClient;
import com.darkmagician6.eventapi.EventManager;
import com.darkmagician6.eventapi.EventTarget;
import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.List;
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

public class BlurRenderer implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final int int415 = 2;
   public static final float[] val519 = new float[]{0.5F, 1.5F, 2.5F};
   public SimpleFramebuffer fbo;
   public SimpleFramebuffer simpleFramebuffer7;
   public SimpleFramebuffer tempFbo;
   public ShaderProgramKey shaderProgramKey2;
   public ShaderProgramKey shaderProgramKey3;
   public ShaderProgramKey shaderProgramKey4;
   public int int416 = 0;
   public int int417 = 0;
   public boolean boolean186 = true;

   public void executorService4() {
      this.int416 = 3;
      this.int417 = 10;
   }

   public void call266() {
      this.int416++;
      this.int417++;
   }

   public SimpleFramebuffer getFbo() {
      return this.fbo;
   }

   public BlurRenderer() {
      EventManager.register(this);
   }

   @EventTarget(0)
   public void on23(EventRenderScreenHook var1) {
      if (minecraftClient3.getShaderLoader() != null
         && (ZenithClient.on23().NbtEditor().getBlurPower() != 0.0F || Interface.interfaceField.float30())
         )
       {
         Framebuffer framebuffer = minecraftClient3.getFramebuffer();
         this.on23(framebuffer);
         if (this.int416 % 3 == 0) {
            float f = ZenithClient.on23().NbtEditor().getBlurPower();
            if (f == 0.0F) {
               return;
            }

            this.on23(this.fbo, var1.WarpFarm().matrices.peek().getPositionMatrix(), f);
            this.int416 = 0;
         }
      }
   }

   public void UiAnimation(org.zenith.utility.render.display.base.HudDrawContext var1) {
      if (minecraftClient3.world != null
         && minecraftClient3.getShaderLoader() != null
         && ZenithClient.on23().NbtEditor().getBlurPower() != 0.0F
         && this.boolean186) {
         Framebuffer framebuffer = minecraftClient3.getFramebuffer();
         this.UiAnimation(framebuffer);
         if (this.int417 % (this.concurrentHashMap() ? 2 : 10) == 0) {
            this.on23(this.simpleFramebuffer7, var1.matrices.peek().getPositionMatrix(), 10.0F);
            this.int417 = 0;
         }
      }
   }

   public boolean concurrentHashMap() {
      return Menu.menu.int467()
         && (
            ZenithClient.on23().NbtEditor().isClosing()
               || ZenithClient.on23().NbtEditor().isElementSwapBlurActive()
         );
   }

   public void on23(Framebuffer var1, Matrix4f var2, float var3) {
      Framebuffer framebuffer = minecraftClient3.getFramebuffer();
      this.Easing(framebuffer);
      if (this.shaderProgramKey2 == null) {
         this.shaderProgramKey2 = new ShaderProgramKey(ResourceProvider.getShaderIdentifier("kawase_blur/data"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
      }

      if (!this.isShaderReady(this.shaderProgramKey2)) {
         minecraftClient3.getFramebuffer().beginWrite(true);
      } else {
         float f = 1.0F / (float)var1.textureWidth;
         float f1 = 1.0F / (float)var1.textureHeight;
         RenderSystem.disableBlend();
         RenderSystem.disableCull();

          try {
             this.downsample(framebuffer, var1);
             Object object = var1;
             Object object1 = this.tempFbo;

             for (float f2 : val519) {
                float f3 = f2 * var3 / 10.0F;
                if (!this.kawasePass(((Framebuffer) object).getColorAttachment(), (Framebuffer)object1, var2, f, f1, f3)) {
                   return;
                }

                Object object2 = object;
                object = object1;
                object1 = object2;
             }

             if (object != var1) {
                this.downsample((Framebuffer)object, (Framebuffer)var1);
             }
          } finally {
            RenderSystem.enableCull();
            minecraftClient3.getFramebuffer().beginWrite(true);
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
      ShaderProgram shaderprogram = RenderSystem.setShader(this.shaderProgramKey2);
      if (shaderprogram == null) {
         RenderSystem.setShaderTexture(0, 0);
         minecraftClient3.getFramebuffer().beginWrite(true);
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

   public void on23(
      Matrix4f var1, float var2, float var3, float var4, float var5, org.zenith.utility.render.display.base.CornerRadius var6, ArgbColor var7
   ) {
      this.on23(this.fbo, var1, var2, var3, var4, var5, var6, var7);
   }

   public void ServiceException(List<BlurRenderer_Var159> var1) {
      MsdfRenderer.flushBatch();
      this.on23(this.fbo, var1);
   }

   public void UiAnimation(
      Matrix4f var1, float var2, float var3, float var4, float var5, org.zenith.utility.render.display.base.CornerRadius var6, ArgbColor var7
   ) {
      this.boolean186 = true;
      Framebuffer framebuffer = minecraftClient3.getFramebuffer();
      this.UiAnimation(framebuffer);
      this.on23(this.simpleFramebuffer7, var1, var2, var3, var4, var5, var6, var7);
   }

   public void on23(
      Framebuffer var1,
      Matrix4f var2,
      float var3,
      float var4,
      float var5,
      float var6,
      org.zenith.utility.render.display.base.CornerRadius var7,
      ArgbColor var8
   ) {
      if (var1 != null) {
         if (this.shaderProgramKey3 == null) {
            this.shaderProgramKey3 = new ShaderProgramKey(ResourceProvider.getShaderIdentifier("wtf/data"), VertexFormats.POSITION_COLOR, Defines.EMPTY);
         }

         if (this.isShaderReady(this.shaderProgramKey3)) {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();

            try {
               RenderSystem.setShaderTexture(0, var1.getColorAttachment());
               ShaderProgram shaderprogram = RenderSystem.setShader(this.shaderProgramKey3);
               if (shaderprogram != null) {
                  shaderprogram.getUniform("Size").set(var5, var6);
                  shaderprogram.getUniform("Radius")
                     .set(var7.var14311(), var7.string63(), var7.var14312(), var7.itemStack9());
                  shaderprogram.getUniform("Smoothness").set(0.01F);
                  BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
                  bufferbuilder.vertex(var2, var3, var4, 0.0F).color(var8.call001());
                  bufferbuilder.vertex(var2, var3, var4 + var6, 0.0F).color(var8.call001());
                  bufferbuilder.vertex(var2, var3 + var5, var4 + var6, 0.0F).color(var8.call001());
                  bufferbuilder.vertex(var2, var3 + var5, var4, 0.0F).color(var8.call001());
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

   public void on23(Framebuffer var1, List<BlurRenderer_Var159> var2) {
      if (var1 != null && !var2.isEmpty()) {
         if (this.shaderProgramKey4 == null) {
            this.shaderProgramKey4 = new ShaderProgramKey(
               ResourceProvider.getShaderIdentifier("batch_wtf/data"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
            );
         }

         if (!this.isShaderReady(this.shaderProgramKey4)) {
            for (BlurRenderer_Var159 iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil : var2) {
               this.on23(
                  var1,
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.matrix4f(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.float65(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.float66(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.float67(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.float68(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.val012(),
                  iliili1lliii1i1il1iilil1lil1li_ii1il11l111ii11iil.var1192()
               );
            }
         } else {
            RenderSystem.enableBlend();
            RenderSystem.defaultBlendFunc();
            RenderSystem.disableCull();
            RenderSystem.setShaderTexture(0, var1.getColorAttachment());

            try {
               int i = 0;

               while (i < var2.size()) {
                  org.zenith.utility.render.display.base.CornerRadius ii1il11l111ii11iil = ((BlurRenderer_Var159)var2.get(i))
                     .val012();
                  int j = i + 1;

                  while (
                     j < var2.size()
                        && this.on23(
                           ii1il11l111ii11iil, ((BlurRenderer_Var159)var2.get(j)).val012()
                        )
                  ) {
                     j++;
                  }

                  this.on23(var2, i, j, ii1il11l111ii11iil);
                  i = j;
               }
            } finally {
               RenderSystem.setShaderTexture(0, 0);
               RenderSystem.enableCull();
               RenderSystem.disableBlend();
            }
         }
      }
   }

   public void on23(
      List<BlurRenderer_Var159> var1, int var2, int var3, org.zenith.utility.render.display.base.CornerRadius var4
   ) {
      ShaderProgram shaderprogram = RenderSystem.setShader(this.shaderProgramKey4);
      if (shaderprogram != null) {
         shaderprogram.getUniform("Radius")
            .set(var4.var14311(), var4.string63(), var4.var14312(), var4.itemStack9());
         shaderprogram.getUniform("Smoothness").set(0.01F);
         BufferBuilder bufferbuilder = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);

         for (int i = var2; i < var3; i++) {
            this.on23(bufferbuilder, (BlurRenderer_Var159)var1.get(i));
         }

         BufferRenderer.drawWithGlobalProgram(bufferbuilder.end());
      }
   }

   public void on23(BufferBuilder var1, BlurRenderer_Var159 var2) {
      int i = var2.var1192().call001();
      float f = var2.float65() + var2.float67();
      float f1 = var2.float66() + var2.float68();
      var1.vertex(var2.matrix4f(), var2.float65(), var2.float66(), 0.0F).texture(var2.float67(), var2.float68()).color(i);
      var1.vertex(var2.matrix4f(), var2.float65(), f1, 0.0F).texture(var2.float67(), var2.float68()).color(i);
      var1.vertex(var2.matrix4f(), f, f1, 0.0F).texture(var2.float67(), var2.float68()).color(i);
      var1.vertex(var2.matrix4f(), f, var2.float66(), 0.0F).texture(var2.float67(), var2.float68()).color(i);
   }

   public boolean on23(
      org.zenith.utility.render.display.base.CornerRadius var1, org.zenith.utility.render.display.base.CornerRadius var2
   ) {
      return var1.var14311() == var2.var14311()
         && var1.string63() == var2.string63()
         && var1.var14312() == var2.var14312()
         && var1.itemStack9() == var2.itemStack9();
   }

   public boolean isShaderReady(ShaderProgramKey var1) {
      ShaderLoader shaderloader = minecraftClient3.getShaderLoader();
      if (shaderloader != null && var1 != null) {
         try {
            return shaderloader.getProgramToLoad(var1) != null;
         } catch (LoadException loadexception) {
            return false;
         }
      } else {
         return false;
      }
   }

   public void on23(Framebuffer var1) {
      int i = this.EventGetBasicProjectionMatrixHook(var1.textureWidth);
      int j = this.EventGetBasicProjectionMatrixHook(var1.textureHeight);
      if (this.fbo == null) {
         this.fbo = this.BotFeatureRegistry(i, j);
      }

      if (this.fbo.textureWidth != i || this.fbo.textureHeight != j) {
         this.on23(this.fbo, i, j);
      }
   }

   public void UiAnimation(Framebuffer var1) {
      int i = this.EventGetBasicProjectionMatrixHook(var1.textureWidth);
      int j = this.EventGetBasicProjectionMatrixHook(var1.textureHeight);
      if (this.simpleFramebuffer7 == null) {
         this.simpleFramebuffer7 = this.BotFeatureRegistry(i, j);
      }

      if (this.simpleFramebuffer7.textureWidth != i || this.simpleFramebuffer7.textureHeight != j) {
         this.on23(this.simpleFramebuffer7, i, j);
      }
   }

   public void Easing(Framebuffer var1) {
      int i = this.EventGetBasicProjectionMatrixHook(var1.textureWidth);
      int j = this.EventGetBasicProjectionMatrixHook(var1.textureHeight);
      if (this.tempFbo == null) {
         this.tempFbo = this.BotFeatureRegistry(i, j);
      }

      if (this.tempFbo.textureWidth != i || this.tempFbo.textureHeight != j) {
         this.on23(this.tempFbo, i, j);
      }
   }

   public SimpleFramebuffer BotFeatureRegistry(int var1, int var2) {
      SimpleFramebuffer simpleframebuffer = new SimpleFramebuffer(var1, var2, false);
      simpleframebuffer.setTexFilter(9729);
      return simpleframebuffer;
   }

   public void on23(SimpleFramebuffer var1, int var2, int var3) {
      var1.resize(var2, var3);
      var1.setTexFilter(9729);
   }

   public int EventGetBasicProjectionMatrixHook(int var1) {
      return Math.max(1, var1 / 2);
   }
}

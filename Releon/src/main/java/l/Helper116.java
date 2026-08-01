package l;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector2f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Helper116 implements Helper141, Helper160 {
   private final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(Identifier.of("minecraft", "core/blur"), VertexFormats.POSITION, Defines.EMPTY);
   public Framebuffer input;
   public Vector2f resolution = new Vector2f();

   public Helper116() {
   }

   @Override
   public void method677(Helper80 var1) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.disableCull();
      float var2 = (float)mc.getWindow().getScaleFactor();
      float var3 = RenderSystem.getShaderColor()[3];
      Matrix4f var4 = var1.method846().peek().getPositionMatrix();
      Vector3f var5 = var4.transformPosition(var1.method847(), var1.method848(), 0.0F, new Vector3f()).mul(var2);
      Vector3f var6 = var4.getScale(new Vector3f()).mul(var2);
      Vector4f var7 = var1.method856().mul(var6.y);
      float var8 = var1.method855();
      float var9 = var1.method851();
      float var10 = var1.method852();
      float var11 = var1.method849() * var6.x;
      float var12 = var1.method850() * var6.y;
      BufferBuilder var13 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION);
      drawEngine.method1432(var4, var13, var1.method847() - var9 / 2.0F, var1.method848() - var9 / 2.0F, var1.method849() + var9, var1.method850() + var9);
      GlStateManager._activeTexture(33984);
      if (this.input != null) {
         RenderSystem.bindTexture(this.input.getColorAttachment());
      }

      ShaderProgram var14 = RenderSystem.setShader(this.SHADER_KEY);
      var14.getUniformOrDefault("size").set(var11, var12);
      var14.getUniformOrDefault("location").set(var5.x, window.getHeight() - var12 - var5.y);
      var14.getUniformOrDefault("radius").set(var7);
      var14.getUniformOrDefault("softness").set(var9);
      var14.getUniformOrDefault("thickness").set(var10);
      var14.getUniformOrDefault("Quality").set(var8);
      var14.getUniformOrDefault("color1")
         .set(
            Helper133.method1092(var1.method858().x),
            Helper133.method1093(var1.method858().x),
            Helper133.method1094(var1.method858().x),
            Helper133.method1095(Helper133.method1108(var1.method858().x, var3))
         );
      var14.getUniformOrDefault("color2")
         .set(
            Helper133.method1092(var1.method858().y),
            Helper133.method1093(var1.method858().y),
            Helper133.method1094(var1.method858().y),
            Helper133.method1095(Helper133.method1108(var1.method858().y, var3))
         );
      var14.getUniformOrDefault("color3")
         .set(
            Helper133.method1092(var1.method858().z),
            Helper133.method1093(var1.method858().z),
            Helper133.method1094(var1.method858().z),
            Helper133.method1095(Helper133.method1108(var1.method858().z, var3))
         );
      var14.getUniformOrDefault("color4")
         .set(
            Helper133.method1092(var1.method858().w),
            Helper133.method1093(var1.method858().w),
            Helper133.method1094(var1.method858().w),
            Helper133.method1095(Helper133.method1108(var1.method858().w, var3))
         );
      var14.getUniformOrDefault("outlineColor")
         .set(
            Helper133.method1092(var1.method857()),
            Helper133.method1093(var1.method857()),
            Helper133.method1094(var1.method857()),
            Helper133.method1095(Helper133.method1108(var1.method857(), var3))
         );
      var14.getUniformOrDefault("InputResolution").set(this.resolution.x, this.resolution.y);
      BufferRenderer.drawWithGlobalProgram(var13.end());
      RenderSystem.disableBlend();
   }

   public void method955() {
      Framebuffer var1 = mc.getFramebuffer();
      if (this.input == null) {
         this.input = new SimpleFramebuffer(mc.getWindow().getScaledWidth(), mc.getWindow().getScaledHeight(), false);
      }

      this.input.beginWrite(false);
      var1.draw(this.input.textureWidth, this.input.textureHeight);
      var1.beginWrite(false);
      if (this.input != null
         && (this.input.textureWidth != mc.getWindow().getFramebufferWidth() || this.input.textureHeight != mc.getWindow().getFramebufferHeight())) {
         this.input.resize(mc.getWindow().getFramebufferWidth(), mc.getWindow().getFramebufferHeight());
      }

      this.resolution.set(var1.textureWidth, var1.textureHeight);
   }
}

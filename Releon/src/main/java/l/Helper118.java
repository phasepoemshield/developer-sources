package l;

import com.mojang.blaze3d.platform.GlStateManager;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Helper118 implements Helper160 {
   private static final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(Helper134.method1170("liquid_glass"), VertexFormats.POSITION, Defines.EMPTY);

   public Helper118() {
   }

   public void method963(
      MatrixStack var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      float var13,
      float var14
   ) {
      if (!(var4 <= 0.0F) && !(var5 <= 0.0F) && blur.input != null) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.disableCull();
         float var15 = (float)mc.getWindow().getScaleFactor();
         Matrix4f var16 = var1.peek().getPositionMatrix();
         Vector3f var17 = var16.transformPosition(var2, var3, 0.0F, new Vector3f()).mul(var15);
         Vector3f var18 = var16.getScale(new Vector3f()).mul(var15);
         float var19 = var4 * var18.x;
         float var20 = var5 * var18.y;
         Vector4f var21 = new Vector4f(var6).mul(Math.min(var18.x, var18.y));
         GlStateManager._activeTexture(33984);
         RenderSystem.bindTexture(blur.input.getColorAttachment());
         ShaderProgram var22 = RenderSystem.setShader(SHADER_KEY);
         if (var22 == null) {
            RenderSystem.enableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
         } else {
            float var23 = this.method964(Helper133.method1095(var7));
            var22.getUniformOrDefault("InputResolution").set(blur.resolution.x, blur.resolution.y);
            var22.getUniformOrDefault("Size").set(var19, var20);
            var22.getUniformOrDefault("Location").set(var17.x, window.getHeight() - var20 - var17.y);
            var22.getUniformOrDefault("Radius").set(var21);
            var22.getUniformOrDefault("Smoothness").set(1.0F);
            var22.getUniformOrDefault("CornerSmoothness").set(Math.max(0.15F, var8));
            var22.getUniformOrDefault("TintColor").set(Helper133.method1092(var7), Helper133.method1093(var7), Helper133.method1094(var7), var23);
            var22.getUniformOrDefault("GlobalAlpha").set(var23);
            var22.getUniformOrDefault("FresnelPower").set(Math.max(0.01F, var9));
            var22.getUniformOrDefault("FresnelColor").set(1.0F, 1.0F, 1.0F);
            var22.getUniformOrDefault("FresnelAlpha").set(this.method964(var10));
            var22.getUniformOrDefault("BaseAlpha").set(this.method964(var11));
            var22.getUniformOrDefault("FresnelInvert").set(var12 ? 1 : 0);
            var22.getUniformOrDefault("FresnelMix").set(this.method964(var13));
            var22.getUniformOrDefault("DistortStrength").set(Math.max(0.0F, var14));
            var22.getUniformOrDefault("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
            BufferBuilder var24 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION);
            drawEngine.method1432(var16, var24, var2, var3, var4, var5);
            BufferRenderer.drawWithGlobalProgram(var24.end());
            RenderSystem.enableCull();
            RenderSystem.enableDepthTest();
            RenderSystem.disableBlend();
         }
      }
   }

   private float method964(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }
}

package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Helper105 implements Helper141, Helper160 {
   private final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(Identifier.of("minecraft", "core/round"), VertexFormats.POSITION, Defines.EMPTY);

   public Helper105() {
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
      float var8 = var1.method851() * var3;
      float var9 = var1.method852();
      float var10 = var1.method849() * var6.x;
      float var11 = var1.method850() * var6.y;
      ShaderProgram var12 = RenderSystem.setShader(this.SHADER_KEY);
      if (var12 == null) {
         RenderSystem.disableBlend();
      } else {
         BufferBuilder var13 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION);
         drawEngine.method1432(var4, var13, var1.method847() - var8 / 2.0F, var1.method848() - var8 / 2.0F, var1.method849() + var8, var1.method850() + var8);
         var12.getUniformOrDefault("size").set(var10, var11);
         var12.getUniformOrDefault("location").set(var5.x, window.getHeight() - var11 - var5.y);
         var12.getUniformOrDefault("radius").set(var7);
         var12.getUniformOrDefault("softness").set(var8);
         var12.getUniformOrDefault("thickness").set(var9);
         var12.getUniformOrDefault("color1")
            .set(
               Helper133.method1092(var1.method858().x),
               Helper133.method1093(var1.method858().x),
               Helper133.method1094(var1.method858().x),
               Helper133.method1095(Helper133.method1108(var1.method858().x, var3))
            );
         var12.getUniformOrDefault("color2")
            .set(
               Helper133.method1092(var1.method858().y),
               Helper133.method1093(var1.method858().y),
               Helper133.method1094(var1.method858().y),
               Helper133.method1095(Helper133.method1108(var1.method858().y, var3))
            );
         var12.getUniformOrDefault("color3")
            .set(
               Helper133.method1092(var1.method858().z),
               Helper133.method1093(var1.method858().z),
               Helper133.method1094(var1.method858().z),
               Helper133.method1095(Helper133.method1108(var1.method858().z, var3))
            );
         var12.getUniformOrDefault("color4")
            .set(
               Helper133.method1092(var1.method858().w),
               Helper133.method1093(var1.method858().w),
               Helper133.method1094(var1.method858().w),
               Helper133.method1095(Helper133.method1108(var1.method858().w, var3))
            );
         var12.getUniformOrDefault("outlineColor")
            .set(
               Helper133.method1092(var1.method857()),
               Helper133.method1093(var1.method857()),
               Helper133.method1094(var1.method857()),
               Helper133.method1095(Helper133.method1108(var1.method857(), var3))
            );
         BufferRenderer.drawWithGlobalProgram(var13.end());
         RenderSystem.disableBlend();
      }
   }

   public Helper147 method933(MatrixStack var1, float var2, float var3, int var4, int var5) {
      return null;
   }
}

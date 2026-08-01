package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;

public class Helper83 implements Helper141, Helper160 {
   private final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(Identifier.of("minecraft", "core/arc"), VertexFormats.POSITION, Defines.EMPTY);

   public Helper83() {
   }

   @Override
   public void method677(Helper80 var1) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.enableDepthTest();
      RenderSystem.enableCull();
      float var2 = (float)mc.getWindow().getScaleFactor();
      float var3 = RenderSystem.getShaderColor()[3];
      Matrix4f var4 = var1.method846().peek().getPositionMatrix();
      Vector3f var5 = var4.transformPosition(var1.method847(), var1.method848(), 0.0F, new Vector3f()).mul(var2);
      Vector3f var6 = var4.getScale(new Vector3f()).mul(var2);
      Vector4f var7 = var1.method856().mul(var6.y);
      float var8 = var1.method849() * var6.x;
      float var9 = var1.method850() * var6.y;
      BufferBuilder var10 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION);
      drawEngine.method1432(var4, var10, var1.method847(), var1.method848(), var1.method849(), var1.method850());
      ShaderProgram var11 = RenderSystem.setShader(this.SHADER_KEY);
      var11.getUniformOrDefault("size").set(var8, var9);
      var11.getUniformOrDefault("location").set(var5.x, window.getHeight() - var9 - var5.y);
      var11.getUniformOrDefault("radius").set(var7.x);
      var11.getUniformOrDefault("thickness").set(var1.method852());
      var11.getUniformOrDefault("start").set(var1.method853());
      var11.getUniformOrDefault("end").set(var1.method854());
      var11.getUniformOrDefault("color1")
         .set(
            Helper133.method1092(var1.method858().x),
            Helper133.method1093(var1.method858().x),
            Helper133.method1094(var1.method858().x),
            Helper133.method1095(Helper133.method1108(var1.method858().x, var3))
         );
      var11.getUniformOrDefault("color2")
         .set(
            Helper133.method1092(var1.method858().y),
            Helper133.method1093(var1.method858().y),
            Helper133.method1094(var1.method858().y),
            Helper133.method1095(Helper133.method1108(var1.method858().y, var3))
         );
      BufferRenderer.drawWithGlobalProgram(var10.end());
      RenderSystem.disableBlend();
   }
}

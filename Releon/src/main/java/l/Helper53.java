package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public class Helper53 implements Helper171 {
   private final Helper115 size;
   private final Helper127 radius;
   private final Helper172 color;
   private final float smoothness;
   private final float u;
   private final float v;
   private final float texWidth;
   private final float texHeight;
   private final int textureId;
   private static final ShaderProgramKey TEXTURE_SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("texture"), VertexFormats.POSITION_TEXTURE_COLOR, Defines.EMPTY
   );

   public Helper53(Helper115 var1, Helper127 var2, Helper172 var3, float var4, float var5, float var6, float var7, float var8, int var9) {
      this.size = var1;
      this.radius = var2;
      this.color = var3;
      this.smoothness = var4;
      this.u = var5;
      this.v = var6;
      this.texWidth = var7;
      this.texHeight = var8;
      this.textureId = var9;
   }

   @Override
   public void method591(Matrix4f var1, float var2, float var3, float var4) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, this.textureId);
      float var5 = this.size.method953();
      float var6 = this.size.method954();
      ShaderProgram var7 = RenderSystem.setShader(TEXTURE_SHADER_KEY);
      var7.getUniform("Size").set(var5, var6);
      var7.getUniform("Radius").set(this.radius.method1039(), this.radius.method1040(), this.radius.method1041(), this.radius.method1042());
      var7.getUniform("Smoothness").set(this.smoothness);
      BufferBuilder var8 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var8.vertex(var1, var2, var3, var4).texture(this.u, this.v).color(this.color.method1462());
      var8.vertex(var1, var2, var3 + var6, var4).texture(this.u, this.v + this.texHeight).color(this.color.method1463());
      var8.vertex(var1, var2 + var5, var3 + var6, var4).texture(this.u + this.texWidth, this.v + this.texHeight).color(this.color.method1464());
      var8.vertex(var1, var2 + var5, var3, var4).texture(this.u + this.texWidth, this.v).color(this.color.method1465());
      BufferRenderer.drawWithGlobalProgram(var8.end());
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   public Helper115 method628() {
      return this.size;
   }

   public Helper127 method629() {
      return this.radius;
   }

   public Helper172 method630() {
      return this.color;
   }

   public float method631() {
      return this.smoothness;
   }

   public float method632() {
      return this.u;
   }

   public float method633() {
      return this.v;
   }

   public float method634() {
      return this.texWidth;
   }

   public float method635() {
      return this.texHeight;
   }

   public int method636() {
      return this.textureId;
   }
}

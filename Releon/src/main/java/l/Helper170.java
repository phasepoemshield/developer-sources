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

public class Helper170 implements Helper171 {
   private final Helper115 size;
   private final Helper127 radius;
   private final Helper172 color;
   private final float smoothness;
   private static final ShaderProgramKey RECTANGLE_SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("rectangle"), VertexFormats.POSITION_COLOR, Defines.EMPTY
   );

   public Helper170(Helper115 var1, Helper127 var2, Helper172 var3, float var4) {
      this.size = var1;
      this.radius = var2;
      this.color = var3;
      this.smoothness = var4;
   }

   @Override
   public void method591(Matrix4f var1, float var2, float var3, float var4) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      float var5 = this.size.method953();
      float var6 = this.size.method954();
      ShaderProgram var7 = RenderSystem.setShader(RECTANGLE_SHADER_KEY);
      var7.getUniform("Size").set(var5, var6);
      var7.getUniform("Radius").set(this.radius.method1039(), this.radius.method1040(), this.radius.method1041(), this.radius.method1042());
      var7.getUniform("Smoothness").set(this.smoothness);
      BufferBuilder var8 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_COLOR);
      var8.vertex(var1, var2, var3, var4).color(this.color.method1462());
      var8.vertex(var1, var2, var3 + var6, var4).color(this.color.method1463());
      var8.vertex(var1, var2 + var5, var3 + var6, var4).color(this.color.method1464());
      var8.vertex(var1, var2 + var5, var3, var4).color(this.color.method1465());
      BufferRenderer.drawWithGlobalProgram(var8.end());
      RenderSystem.enableCull();
      RenderSystem.disableBlend();
   }

   public Helper115 method1436() {
      return this.size;
   }

   public Helper127 method1437() {
      return this.radius;
   }

   public Helper172 method1438() {
      return this.color;
   }

   public float method1439() {
      return this.smoothness;
   }
}

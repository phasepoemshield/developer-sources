package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.client.util.math.MatrixStack.Entry;
import org.joml.Matrix4f;
import org.joml.Vector4i;

public class Helper176 implements Helper160, Helper169 {
   public Helper176() {
   }

   @Override
   public void method1432(Matrix4f var1, BufferBuilder var2, float var3, float var4, float var5, float var6) {
      var2.vertex(var1, var3, var4, 0.0F);
      var2.vertex(var1, var3, var4 + var6, 0.0F);
      var2.vertex(var1, var3 + var5, var4 + var6, 0.0F);
      var2.vertex(var1, var3 + var5, var4, 0.0F);
   }

   @Override
   public void method1433(Matrix4f var1, BufferBuilder var2, float var3, float var4, float var5, float var6, int var7) {
      var2.vertex(var1, var3, var4, 0.0F).color(var7);
      var2.vertex(var1, var3, var4 + var6, 0.0F).color(var7);
      var2.vertex(var1, var3 + var5, var4 + var6, 0.0F).color(var7);
      var2.vertex(var1, var3 + var5, var4, 0.0F).color(var7);
   }

   @Override
   public void method1435(Matrix4f var1, float var2, float var3, float var4, float var5, int var6) {
      RenderSystem.setShader(ShaderProgramKeys.POSITION_TEX_COLOR);
      BufferBuilder var7 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE_COLOR);
      var7.vertex(var1, var2, var3 + var5, 0.0F).texture(0.0F, 0.0F).color(var6);
      var7.vertex(var1, var2 + var4, var3 + var5, 0.0F).texture(0.0F, 1.0F).color(var6);
      var7.vertex(var1, var2 + var4, var3, 0.0F).texture(1.0F, 1.0F).color(var6);
      var7.vertex(var1, var2, var3, 0.0F).texture(1.0F, 0.0F).color(var6);
      BufferRenderer.drawWithGlobalProgram(var7.end());
   }

   @Override
   public void method1434(Entry var1, BufferBuilder var2, float var3, float var4, float var5, float var6, Vector4i var7) {
      var2.vertex(var1, var3, var4 + var6, 0.0F).texture(0.0F, 0.0F).color(var7.x);
      var2.vertex(var1, var3 + var5, var4 + var6, 0.0F).texture(0.0F, 1.0F).color(var7.y);
      var2.vertex(var1, var3 + var5, var4, 0.0F).texture(1.0F, 1.0F).color(var7.w);
      var2.vertex(var1, var3, var4, 0.0F).texture(1.0F, 0.0F).color(var7.z);
   }
}

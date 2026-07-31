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
import net.minecraft.client.util.math.MatrixStack.Entry;

public final class Helper212 {
   private static final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("block_overlay"), VertexFormats.POSITION_TEXTURE, Defines.EMPTY
   );

   private Helper212() {
   }

   public static boolean method1816(Entry var0, float var1, float var2, float var3, float var4, float var5, float var6, int var7) {
      ShaderProgram var8;
      try {
         var8 = RenderSystem.setShader(SHADER_KEY);
      } catch (RuntimeException var10) {
         return false;
      }

      if (var8 == null) {
         return false;
      } else {
         var8.getUniformOrDefault("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
         var8.getUniformOrDefault("Speed").set(0.8F);
         var8.getUniformOrDefault("Intensity").set(1.0F);
         var8.getUniformOrDefault("Alpha").set(Helper133.method1095(var7));
         var8.getUniformOrDefault("BaseColor").set(Helper133.method1092(var7), Helper133.method1093(var7), Helper133.method1094(var7));
         BufferBuilder var9 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
         method1817(var9, var0, var1, var2, var3, var4, var5, var6);
         BufferRenderer.drawWithGlobalProgram(var9.end());
         return true;
      }
   }

   private static void method1817(BufferBuilder var0, Entry var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      method1818(var0, var1, var2, var3, var4, var5, var3, var4, var5, var3, var7, var2, var3, var7);
      method1818(var0, var1, var2, var6, var4, var2, var6, var7, var5, var6, var7, var5, var6, var4);
      method1818(var0, var1, var2, var3, var4, var2, var6, var4, var5, var6, var4, var5, var3, var4);
      method1818(var0, var1, var2, var3, var7, var5, var3, var7, var5, var6, var7, var2, var6, var7);
      method1818(var0, var1, var2, var3, var4, var2, var3, var7, var2, var6, var7, var2, var6, var4);
      method1818(var0, var1, var5, var3, var4, var5, var6, var4, var5, var6, var7, var5, var3, var7);
   }

   private static void method1818(
      BufferBuilder var0,
      Entry var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13
   ) {
      var0.vertex(var1, var2, var3, var4).texture(0.0F, 1.0F);
      var0.vertex(var1, var5, var6, var7).texture(1.0F, 1.0F);
      var0.vertex(var1, var8, var9, var10).texture(1.0F, 0.0F);
      var0.vertex(var1, var11, var12, var13).texture(0.0F, 0.0F);
   }
}

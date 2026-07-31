package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;
import org.joml.Matrix4f;

public final class Helper136 implements Helper160 {
   private static final ShaderProgramKey GRADIENT_SHADER = new ShaderProgramKey(
      Helper134.method1170("esp_gradient"), VertexFormats.POSITION_TEXTURE, Defines.EMPTY
   );
   private static final ShaderProgramKey SHADOW_SHADER = new ShaderProgramKey(
      Helper134.method1170("esp_shadow"), VertexFormats.POSITION_TEXTURE, Defines.EMPTY
   );

   private Helper136() {
   }

   public static void method1175(Matrix4f var0, int var1, int var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = Math.min(var3, 63.0F);
      float var11 = Math.max(1.0F, var10 / 2.0F);
      float[] var12 = new float[64];

      for (int var13 = 0; var13 <= (int)var10; var13++) {
         var12[var13] = method1179(var13, var11);
      }

      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, var1);
      RenderSystem.setShaderTexture(1, var2);
      ShaderProgram var14 = RenderSystem.setShader(SHADOW_SHADER);
      var14.getUniformOrDefault("texelSize").set(1.0F / mc.getWindow().getFramebufferWidth(), 1.0F / mc.getWindow().getFramebufferHeight());
      var14.getUniformOrDefault("direction").set(var4, var5);
      var14.getUniformOrDefault("radius").set(var10);
      var14.getUniformOrDefault("kernel").set(var12);
      method1180(var0, var6, var7, var8, var9, false);
      RenderSystem.setShaderTexture(1, 0);
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
   }

   public static void method1176(
      Matrix4f var0, int var1, int var2, int var3, float var4, float var5, float var6, float var7, float var8, float var9, boolean var10
   ) {
      float[] var11 = Helper133.method1098(var2);
      float[] var12 = Helper133.method1098(var3);
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, var1);
      ShaderProgram var13 = RenderSystem.setShader(GRADIENT_SHADER);
      var13.getUniformOrDefault("location").set(var4 * method1177(var6, var8), var5 * method1178(var7, var9));
      var13.getUniformOrDefault("rectSize").set(var8, var9);
      var13.getUniformOrDefault("color1").set(var11[0], var11[1], var11[2], var11[3]);
      var13.getUniformOrDefault("color2").set(var12[0], var12[1], var12[2], var12[3]);
      var13.getUniformOrDefault("color3").set(var11[0], var11[1], var11[2], var11[3]);
      var13.getUniformOrDefault("color4").set(var12[0], var12[1], var12[2], var12[3]);
      method1180(var0, var4, var5, var6, var7, var10);
      RenderSystem.setShaderTexture(0, 0);
      RenderSystem.enableCull();
   }

   private static float method1177(float var0, float var1) {
      return var0 <= 0.0F ? 1.0F : var1 / var0;
   }

   private static float method1178(float var0, float var1) {
      return var0 <= 0.0F ? 1.0F : var1 / var0;
   }

   private static float method1179(int var0, float var1) {
      double var2 = var1 * var1;
      return (float)(Math.exp(-(var0 * var0) / (2.0 * var2)) / Math.sqrt((Math.PI * 2) * var2));
   }

   private static void method1180(Matrix4f var0, float var1, float var2, float var3, float var4, boolean var5) {
      BufferBuilder var6 = tessellator.begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
      if (var5) {
         var6.vertex(var0, var1, var2 + var4, 0.0F).texture(0.0F, 0.0F);
         var6.vertex(var0, var1 + var3, var2 + var4, 0.0F).texture(1.0F, 0.0F);
         var6.vertex(var0, var1 + var3, var2, 0.0F).texture(1.0F, 1.0F);
         var6.vertex(var0, var1, var2, 0.0F).texture(0.0F, 1.0F);
      } else {
         var6.vertex(var0, var1, var2 + var4, 0.0F).texture(0.0F, 1.0F);
         var6.vertex(var0, var1 + var3, var2 + var4, 0.0F).texture(1.0F, 1.0F);
         var6.vertex(var0, var1 + var3, var2, 0.0F).texture(1.0F, 0.0F);
         var6.vertex(var0, var1, var2, 0.0F).texture(0.0F, 0.0F);
      }

      BufferRenderer.drawWithGlobalProgram(var6.end());
   }
}

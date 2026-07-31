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

public final class Helper250 {
   private static final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(Helper134.method1170("ambience_sky"), VertexFormats.POSITION, Defines.EMPTY);

   private Helper250() {
   }

   public static boolean method2421(int var0, float var1, float var2) {
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.disableBlend();

      boolean var4;
      try {
         ShaderProgram var3;
         try {
            var3 = RenderSystem.setShader(SHADER_KEY);
         } catch (RuntimeException var9) {
            return false;
         }

         if (var3 != null) {
            var3.getUniformOrDefault("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
            var3.getUniformOrDefault("Speed").set(Math.max(0.01F, var1));
            var3.getUniformOrDefault("Intensity").set(Math.max(0.0F, var2));
            var3.getUniformOrDefault("BaseColor").set(Helper133.method1092(var0), Helper133.method1093(var0), Helper133.method1094(var0));
            BufferBuilder var11 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION);
            method2422(var11, 100.0F);
            BufferRenderer.drawWithGlobalProgram(var11.end());
            return true;
         }

         var4 = false;
      } finally {
         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
      }

      return var4;
   }

   private static void method2422(BufferBuilder var0, float var1) {
      float var2 = -var1;
      method2423(var0, var2, var2, var2, var2, var1, var2, var1, var1, var2, var1, var2, var2);
      method2423(var0, var1, var2, var1, var1, var1, var1, var2, var1, var1, var2, var2, var1);
      method2423(var0, var2, var2, var1, var2, var1, var1, var2, var1, var2, var2, var2, var2);
      method2423(var0, var1, var2, var2, var1, var1, var2, var1, var1, var1, var1, var2, var1);
      method2423(var0, var2, var1, var2, var2, var1, var1, var1, var1, var1, var1, var1, var2);
      method2423(var0, var2, var2, var1, var2, var2, var2, var1, var2, var2, var1, var2, var1);
   }

   private static void method2423(
      BufferBuilder var0,
      float var1,
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
      float var12
   ) {
      var0.vertex(var1, var2, var3);
      var0.vertex(var4, var5, var6);
      var0.vertex(var7, var8, var9);
      var0.vertex(var10, var11, var12);
   }
}

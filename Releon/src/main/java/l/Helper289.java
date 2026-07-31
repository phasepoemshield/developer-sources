package l;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BufferRenderer;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.VertexFormat.DrawMode;

public final class Helper289 {
   private static final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("hand_block_overlay"), VertexFormats.POSITION_TEXTURE, Defines.EMPTY
   );
   private static Framebuffer handBuffer;

   private Helper289() {
   }

   public static void method2856(Runnable var0, int var1, float var2, float var3, float var4) {
      MinecraftClient var5 = MinecraftClient.getInstance();
      Framebuffer var6 = var5.getFramebuffer();
      handBuffer = method2858(handBuffer, var6.textureWidth, var6.textureHeight);
      handBuffer.beginWrite(true);
      handBuffer.clear();
      handBuffer.beginWrite(true);
      RenderSystem.colorMask(true, true, true, true);

      try {
         var0.run();
      } finally {
         var6.beginWrite(true);
         RenderSystem.colorMask(true, true, true, true);
      }

      if (!method2857(var1, var2, var3, var4)) {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         handBuffer.draw(var6.viewportWidth, var6.viewportHeight);
         RenderSystem.disableBlend();
      }
   }

   private static boolean method2857(int var0, float var1, float var2, float var3) {
      RenderSystem.enableBlend();
      RenderSystem.defaultBlendFunc();
      RenderSystem.disableDepthTest();
      RenderSystem.depthMask(false);
      RenderSystem.disableCull();
      RenderSystem.setShaderTexture(0, handBuffer.getColorAttachment());

      boolean var5;
      try {
         ShaderProgram var4;
         try {
            var4 = RenderSystem.setShader(SHADER_KEY);
         } catch (RuntimeException var10) {
            return false;
         }

         if (var4 != null) {
            var4.getUniformOrDefault("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
            var4.getUniformOrDefault("Speed").set(Math.max(0.01F, var1));
            var4.getUniformOrDefault("Intensity").set(Math.max(0.0F, var2));
            var4.getUniformOrDefault("Alpha").set(method2861(var3));
            var4.getUniformOrDefault("BaseColor").set(Helper133.method1092(var0), Helper133.method1093(var0), Helper133.method1094(var0));
            BufferBuilder var12 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);
            var12.vertex(-1.0F, -1.0F, 0.0F).texture(0.0F, 0.0F);
            var12.vertex(1.0F, -1.0F, 0.0F).texture(1.0F, 0.0F);
            var12.vertex(1.0F, 1.0F, 0.0F).texture(1.0F, 1.0F);
            var12.vertex(-1.0F, 1.0F, 0.0F).texture(0.0F, 1.0F);
            BufferRenderer.drawWithGlobalProgram(var12.end());
            return true;
         }

         var5 = false;
      } finally {
         RenderSystem.setShaderTexture(0, 0);
         RenderSystem.depthMask(true);
         RenderSystem.enableDepthTest();
         RenderSystem.enableCull();
         RenderSystem.disableBlend();
      }

      return var5;
   }

   private static Framebuffer method2858(Framebuffer var0, int var1, int var2) {
      int var3 = Math.max(1, var1);
      int var4 = Math.max(1, var2);
      if (var0 == null) {
         return method2859(var3, var4);
      } else if (var0.textureWidth == var3 && var0.textureHeight == var4) {
         return var0;
      } else {
         var0.delete();
         return method2859(var3, var4);
      }
   }

   private static Framebuffer method2859(int var0, int var1) {
      SimpleFramebuffer var2 = new SimpleFramebuffer(var0, var1, true);
      var2.setClearColor(0.0F, 0.0F, 0.0F, 0.0F);
      var2.setTexFilter(9729);
      return var2;
   }

   public static void method2860() {
      if (handBuffer != null) {
         handBuffer.delete();
         handBuffer = null;
      }
   }

   private static float method2861(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }
}

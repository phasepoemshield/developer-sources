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
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.client.util.math.MatrixStack.Entry;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.shape.VoxelShape;

public final class Helper239 {
   private static final ShaderProgramKey SHADER_KEY = new ShaderProgramKey(
      Helper134.method1170("block_overlay"), VertexFormats.POSITION_TEXTURE, Defines.EMPTY
   );
   private static long nextShaderRetryMs;

   private Helper239() {
   }

   public static boolean method2229(MatrixStack var0, Vec3d var1, VoxelShape var2, int var3, float var4, float var5, float var6) {
      long var7 = System.currentTimeMillis();
      if (var7 < nextShaderRetryMs) {
         return false;
      } else {
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         RenderSystem.disableDepthTest();
         RenderSystem.depthMask(false);
         RenderSystem.disableCull();

         boolean var10;
         try {
            ShaderProgram var9;
            try {
               var9 = RenderSystem.setShader(SHADER_KEY);
            } catch (RuntimeException var16) {
               nextShaderRetryMs = var7 + 1000L;
               return false;
            }

            if (var9 != null) {
               var9.getUniformOrDefault("Time").set((float)(System.currentTimeMillis() % 1000000L) / 1000.0F);
               var9.getUniformOrDefault("Speed").set(Math.max(0.01F, var4));
               var9.getUniformOrDefault("Intensity").set(Math.max(0.0F, var5));
               var9.getUniformOrDefault("Alpha").set(Math.max(0.0F, Math.min(1.0F, var6)));
               var9.getUniformOrDefault("BaseColor").set(Helper133.method1092(var3), Helper133.method1093(var3), Helper133.method1094(var3));
               BufferBuilder var18 = Tessellator.getInstance().begin(DrawMode.QUADS, VertexFormats.POSITION_TEXTURE);

               for (Box var12 : var2.getBoundingBoxes()) {
                  method2230(var18, var0.peek(), var12.offset(var1).expand(0.002));
               }

               BufferRenderer.drawWithGlobalProgram(var18.end());
               return true;
            }

            nextShaderRetryMs = var7 + 1000L;
            var10 = false;
         } finally {
            RenderSystem.depthMask(true);
            RenderSystem.enableCull();
            RenderSystem.disableBlend();
         }

         return var10;
      }
   }

   private static void method2230(BufferBuilder var0, Entry var1, Box var2) {
      float var3 = (float)var2.minX;
      float var4 = (float)var2.minY;
      float var5 = (float)var2.minZ;
      float var6 = (float)var2.maxX;
      float var7 = (float)var2.maxY;
      float var8 = (float)var2.maxZ;
      method2231(var0, var1, var3, var4, var5, var6, var4, var5, var6, var7, var5, var3, var7, var5);
      method2231(var0, var1, var6, var4, var8, var3, var4, var8, var3, var7, var8, var6, var7, var8);
      method2231(var0, var1, var3, var4, var8, var3, var4, var5, var3, var7, var5, var3, var7, var8);
      method2231(var0, var1, var6, var4, var5, var6, var4, var8, var6, var7, var8, var6, var7, var5);
      method2231(var0, var1, var3, var7, var5, var6, var7, var5, var6, var7, var8, var3, var7, var8);
      method2231(var0, var1, var3, var4, var8, var6, var4, var8, var6, var4, var5, var3, var4, var5);
   }

   private static void method2231(
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

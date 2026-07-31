package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.DynamicUniformStorage;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.gl.DynamicUniformStorage.Uploadable;
import net.minecraft.client.render.BufferBuilder;
import net.minecraft.client.render.BuiltBuffer;
import net.minecraft.client.render.Camera;
import net.minecraft.client.render.Tessellator;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.util.Window;
import net.minecraft.util.Identifier;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public final class O00000O0OO0O {
   private static final Identifier O00000000 = Identifier.of("minecraft", "core/stardust_sky");
   private static final BlendFunction O000000000 = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final int O0000000000 = new Std140SizeCalculator()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putVec4()
      .putIVec4()
      .get();
   private static final RenderPipeline O00000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/stardust_sky"))
         .withVertexShader(O00000000)
         .withFragmentShader(O00000000)
         .withUniform("StardustSky", UniformType.UNIFORM_BUFFER)
         .withVertexFormat(VertexFormats.POSITION, DrawMode.TRIANGLES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(O000000000)
         .build()
   );
   private static final int O000000000000 = 48;
   private static final int O0000000000000 = 14;
   private static final float O000000000000O = 128.0F;
   private static final Vector4f O00000000000O = new Vector4f();
   private static final Vector3f O00000000000O0 = new Vector3f();
   private static final Matrix4f O00000000000OO = new Matrix4f();
   private static final Matrix4f O0000000000O = new Matrix4f();
   private static final Vector3f O0000000000O0 = new Vector3f();
   private static final Matrix4f O0000000000O00 = new Matrix4f();
   private static final long O0000000000O0O = System.nanoTime();
   private static final long O0000000000OO = 4096000000000L;
   private static DynamicUniformStorage<O00000O0OO0O.W194> O0000000000OO0;
   private static GpuBuffer O0000000000OOO;
   private static int O000000000O;
   private static boolean O000000000O0;

   private O00000O0OO0O() {
   }

   public static void O00000000() {
   }

   public static void O00000000(Matrix4f matrix4f, Matrix4f matrix4f2) {
      try {
         if (matrix4f == null || matrix4f2 == null) {
            O0000000000O.identity();
            return;
         }

         O0000000000O00.set(matrix4f2).mul(matrix4f);
         if (Math.abs(O0000000000O00.determinant()) <= 1.0E-8F) {
            O0000000000O.identity();
            return;
         }

         O0000000000O.set(O0000000000O00).invert();
      } catch (Throwable var3) {
         O0000000000O.identity();
      }
   }

   public static void O00000000(Camera camera, float f, float g) {
      if (!O000000000O0 && !(g <= 0.001F)) {
         try {
            O0000000000();
            if (O0000000000OOO == null || O000000000O <= 0) {
               return;
            }

            MinecraftClient var3 = MinecraftClient.getInstance();
            if (var3 == null || var3.getFramebuffer() == null) {
               return;
            }

            if (camera == null) {
               return;
            }

            GpuTextureView var4 = var3.getFramebuffer().getColorAttachmentView();
            GpuTextureView var5 = var3.getFramebuffer().getDepthAttachmentView();
            int var6 = Stardust.O0000000000OOO();
            int var7 = Stardust.O000000000O();
            O00000000000O.set((var6 >>> 16 & 0xFF) / 255.0F, (var6 >>> 8 & 0xFF) / 255.0F, (var6 & 0xFF) / 255.0F, g);
            O00000000000O0.set((var7 >>> 16 & 0xFF) / 255.0F, (var7 >>> 8 & 0xFF) / 255.0F, (var7 & 0xFF) / 255.0F);
            O00000000000OO.identity();
            GpuBufferSlice var8 = RenderSystem.getDynamicUniforms()
               .write(RenderSystem.getModelViewMatrix(), O00000000000O, O00000000000O0, O00000000000OO, Stardust.O000000000O00());
            GpuBufferSlice var9 = O000000000().write(O00000000(var3, camera, f, g, var6, var7));
            RenderPass var10 = RenderSystem.getDevice()
               .createCommandEncoder()
               .createRenderPass(() -> "Wild Stardust Sky", var4, OptionalInt.empty(), var5, OptionalDouble.empty());

            try {
               var10.setPipeline(O00000000000);
               RenderSystem.bindDefaultUniforms(var10);
               var10.setUniform("DynamicTransforms", var8);
               var10.setUniform("StardustSky", var9);
               var10.setVertexBuffer(0, O0000000000OOO);
               var10.draw(0, O000000000O);
            } catch (Throwable var14) {
               if (var10 != null) {
                  try {
                     var10.close();
                  } catch (Throwable var13) {
                     var14.addSuppressed(var13);
                  }
               }

               throw var14;
            }

            if (var10 != null) {
               var10.close();
            }
         } catch (Throwable var15) {
            O000000000O0 = true;
            System.err.println("[Stardust] sky renderer disabled: " + var15.getMessage());
         }
      }
   }

   private static DynamicUniformStorage<O00000O0OO0O.W194> O000000000() {
      if (O0000000000OO0 == null) {
         O0000000000OO0 = new DynamicUniformStorage("Wild Stardust Sky UBO", O0000000000, 4);
      }

      return O0000000000OO0;
   }

   private static O00000O0OO0O.W194 O00000000(MinecraftClient minecraftClient, Camera camera, float f, float g, int i, int j) {
      Window var6 = minecraftClient.getWindow();
      int var7 = var6 == null ? 1 : Math.max(1, var6.getFramebufferWidth());
      int var8 = var6 == null ? 1 : Math.max(1, var6.getFramebufferHeight());
      O0000000000O0.set(0.0F, 0.0F, -1.0F);
      camera.getRotation().transform(O0000000000O0);
      O0000000000O0.normalize();
      float var9 = minecraftClient.world == null ? 0.0F : minecraftClient.world.getRainGradient(f);
      float var10 = O00000000(minecraftClient);
      float var11 = (float)((System.nanoTime() - O0000000000O0O) % 4096000000000L) / 1.0E9F;
      float var12 = Math.max(0.0F, Math.min(1.0F, Stardust.O000000000O00.O0000000000() / 3600.0F));
      return new O00000O0OO0O.W194(
         new Vector4f((i >>> 16 & 0xFF) / 255.0F, (i >>> 8 & 0xFF) / 255.0F, (i & 0xFF) / 255.0F, g),
         new Vector4f((j >>> 16 & 0xFF) / 255.0F, (j >>> 8 & 0xFF) / 255.0F, (j & 0xFF) / 255.0F, 1.0F),
         new Vector4f(O0000000000O0.x, O0000000000O0.y, O0000000000O0.z, var9),
         new Vector4f(var7, var8, var11, var10),
         new Vector4f(g, var12, f, 0.0F),
         new Matrix4f(O0000000000O),
         Stardust.O000000000O0().O000000000(),
         0,
         0,
         0
      );
   }

   private static float O00000000(MinecraftClient minecraftClient) {
      if (minecraftClient != null && minecraftClient.world != null) {
         long var1 = Stardust.O000000000O000() ? Stardust.O000000000OO : minecraftClient.world.getTimeOfDay();
         long var3 = Math.floorMod(var1, 24000L);
         return (float)var3 / 24000.0F;
      } else {
         return 0.75F;
      }
   }

   private static void O0000000000() {
      if (O0000000000OOO == null && !O000000000O0) {
         try {
            BufferBuilder var0 = Tessellator.getInstance().begin(DrawMode.TRIANGLES, VertexFormats.POSITION);
            float var1 = -0.24F;
            float var2 = 1.0F;

            for (int var3 = 0; var3 < 14; var3++) {
               float var4 = var3 / 14.0F;
               float var5 = (var3 + 1) / 14.0F;
               float var6 = var1 + (var2 - var1) * var4;
               float var7 = var1 + (var2 - var1) * var5;

               for (int var8 = 0; var8 < 48; var8++) {
                  float var9 = var8 / 48.0F;
                  float var10 = (var8 + 1) / 48.0F;
                  O00000000(var0, var9, var6);
                  O00000000(var0, var10, var6);
                  O00000000(var0, var10, var7);
                  O00000000(var0, var10, var7);
                  O00000000(var0, var9, var7);
                  O00000000(var0, var9, var6);
               }
            }

            BuiltBuffer var14 = var0.end();

            try {
               O000000000O = var14.getDrawParameters().vertexCount();
               O0000000000OOO = RenderSystem.getDevice().createBuffer(() -> "Wild Stardust Sky Dome", 32, var14.getBuffer());
            } catch (Throwable var12) {
               if (var14 != null) {
                  try {
                     var14.close();
                  } catch (Throwable var11) {
                     var12.addSuppressed(var11);
                  }
               }

               throw var12;
            }

            if (var14 != null) {
               var14.close();
            }
         } catch (Throwable var13) {
            O000000000O0 = true;
         }
      }
   }

   private static void O00000000(BufferBuilder bufferBuilder, float f, float g) {
      float var3 = f * (float) (Math.PI * 2);
      float var4 = (float)Math.sqrt(Math.max(0.0F, 1.0F - g * g));
      float var5 = (float)Math.cos(var3) * var4 * 128.0F;
      float var6 = g * 128.0F;
      float var7 = (float)Math.sin(var3) * var4 * 128.0F;
      bufferBuilder.vertex(var5, var6, var7);
   }

   record W194(
      Vector4fc primary,
      Vector4fc secondary,
      Vector4fc cameraWeather,
      Vector4fc resolutionTime,
      Vector4fc params,
      Matrix4fc inverseViewProjection,
      int mode,
      int flagA,
      int flagB,
      int flagC
   ) implements Uploadable {
      public void write(ByteBuffer buffer) {
         Std140Builder.intoBuffer(buffer)
            .putVec4(this.primary)
            .putVec4(this.secondary)
            .putVec4(this.cameraWeather)
            .putVec4(this.resolutionTime)
            .putVec4(this.params)
            .putMat4f(this.inverseViewProjection)
            .putIVec4(this.mode, this.flagA, this.flagB, this.flagC);
      }
   }
}

package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import java.nio.ByteBuffer;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_11280;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_11280.class_11281;
import net.minecraft.class_1921.class_4688;
import org.lwjgl.glfw.GLFW;

public final class uNUNuuVVVvnN {
   private static final int UuUVuuUu = 262144;
   private static final int C00OOC00oO = new Std140SizeCalculator().putVec4().get();
   private static final class_2960 uUnuvNvvNU = class_2960.method_60655("wild", "core/jump_circle");
   private static final class_2960 vVvUvVVuuNvV = class_2960.method_60655("wild", "core/jump_circle_irid");
   private static final RenderPipeline uNNnnnuuuN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/jump_circle_lens"))
         .withVertexShader(uUnuvNvvNU)
         .withFragmentShader(uUnuvNvvNU)
         .withUniform("JumpCircle", class_10789.field_60031)
         .withVertexFormat(class_290.field_1577, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline nuUnNvnuUu = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/jump_circle_lens_irid"))
         .withVertexShader(vVvUvVVuuNvV)
         .withFragmentShader(vVvUvVVuuNvV)
         .withUniform("JumpCircle", class_10789.field_60031)
         .withVertexFormat(class_290.field_1577, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final class_1921 VVuuUN = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049("wild/jump_circle_lens", 262144, false, true, uNNnnnuuuN, class_4688.method_23598().method_23617(false)), uNUNuuVVVvnN::UuUVuuUu
   );
   private static final class_1921 vNUvnnVnUvu = OOcCooOcCcO.UuUVuuUu(
      class_1921.method_24049("wild/jump_circle_lens_irid", 262144, false, true, nuUnNvnuUu, class_4688.method_23598().method_23617(false)),
      uNUNuuVVVvnN::UuUVuuUu
   );
   private static final uNUNuuVVVvnN.NVnVnNnN uVUuuVnNVU = new uNUNuuVVVvnN.NVnVnNnN(1.0F, 1.0F, 1.0F);
   private static class_11280<uNUNuuVVVvnN.NVnVnNnN> vuuuNvNuv;
   private static uNUNuuVVVvnN.NVnVnNnN nvUVNnuu = uVUuuVnNVU;
   private static GpuBufferSlice UuuNnUvUuv;

   private uNUNuuVVVvnN() {
   }

   public static void UuUVuuUu() {
      if (VVuuUN == null || vNUvnnVnUvu == null) {
         throw new IllegalStateException("JumpCircle shader registry failed");
      }
   }

   public static class_1921 C00OOC00oO() {
      return VVuuUN;
   }

   public static class_1921 uUnuvNvvNU() {
      return vNUvnnVnUvu;
   }

   public static class_1921 vVvUvVVuuNvV() {
      return VVuuUN;
   }

   public static void UuUVuuUu(float var0, float var1, float var2) {
      nvUVNnuu = new uNUNuuVVVvnN.NVnVnNnN(var0, var1, var2);
      UuuNnUvUuv = VVuuUN() ? nuUnNvnuUu().method_71102(nvUVNnuu) : null;
   }

   public static void uNNnnnuuuN() {
      if (vuuuNvNuv != null && VVuuUN()) {
         vuuuNvNuv.method_71100();
      }

      UuuNnUvUuv = null;
   }

   private static void UuUVuuUu(RenderPass var0) {
      GpuBufferSlice var1 = UuuNnUvUuv;
      if (var1 != null) {
         var0.setUniform("JumpCircle", var1);
      }
   }

   private static class_11280<uNUNuuVVVvnN.NVnVnNnN> nuUnNvnuUu() {
      if (vuuuNvNuv == null) {
         vuuuNvNuv = new class_11280("Wild JumpCircle UBO", C00OOC00oO, 4);
      }

      return vuuuNvNuv;
   }

   private static boolean VVuuUN() {
      return RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L;
   }

   record NVnVnNnN(float iridescentSpeed, float brightness, float opacity) implements class_11281 {
      public void method_71104(ByteBuffer var1) {
         Std140Builder.intoBuffer(var1).putVec4(this.iridescentSpeed, this.brightness, this.opacity, 0.0F);
      }
   }
}

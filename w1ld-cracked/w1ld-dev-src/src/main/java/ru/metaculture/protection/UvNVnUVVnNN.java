package ru.metaculture.protection;

import com.mojang.blaze3d.buffers.Std140SizeCalculator;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Builder;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.minecraft.class_10789;
import net.minecraft.class_10799;
import net.minecraft.class_2960;

public final class UvNVnUVVnNN {
   public static final String UuUVuuUu = "BlockEsp";
   public static final int C00OOC00oO = new Std140SizeCalculator().putMat4f().putVec4().putVec4().putVec4().putVec4().putVec4().putVec4().putVec4().get();
   public static final VertexFormat uUnuvNvvNU = VertexFormat.builder()
      .add("Position", VertexFormatElement.POSITION)
      .add("UV0", VertexFormatElement.UV0)
      .add("Color", VertexFormatElement.COLOR)
      .add("UV2", VertexFormatElement.UV2)
      .add("Normal", VertexFormatElement.NORMAL)
      .padding(1)
      .build();
   private static final BlendFunction vVvUvVVuuNvV = new BlendFunction(
      SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ONE_MINUS_SRC_ALPHA
   );
   private static final class_2960 uNNnnnuuuN = class_2960.method_60655("wild", "core/block_esp");
   private static final RenderPipeline nuUnNvnuUu = class_10799.method_67887(
      UuUVuuUu("pipeline/block_esp_visible").withDepthTestFunction(DepthTestFunction.LESS_DEPTH_TEST).build()
   );
   private static final RenderPipeline VVuuUN = class_10799.method_67887(
      UuUVuuUu("pipeline/block_esp_occluded").withDepthTestFunction(DepthTestFunction.GREATER_DEPTH_TEST).build()
   );

   private static Builder UuUVuuUu(String var0) {
      return RenderPipeline.builder(new Snippet[0])
         .withLocation(class_2960.method_60655("wild", var0))
         .withVertexShader(uNNnnnuuuN)
         .withFragmentShader(uNNnnnuuuN)
         .withUniform("Projection", class_10789.field_60031)
         .withUniform("BlockEsp", class_10789.field_60031)
         .withVertexFormat(uUnuvNvvNU, class_5596.field_27382)
         .withCull(true)
         .withDepthWrite(false)
         .withDepthBias(-1.0F, -10.0F)
         .withBlend(vVvUvVVuuNvV);
   }

   private UvNVnUVVnNN() {
   }

   public static void UuUVuuUu() {
      if (nuUnNvnuUu == null || VVuuUN == null) {
         throw new IllegalStateException("BlockESP shader registry failed");
      }
   }

   public static RenderPipeline C00OOC00oO() {
      return nuUnNvnuUu;
   }

   public static RenderPipeline uUnuvNvvNU() {
      return VVuuUN;
   }
}

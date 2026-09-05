package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat.class_5596;
import net.minecraft.class_10799;
import net.minecraft.class_1921;
import net.minecraft.class_290;
import net.minecraft.class_2960;
import net.minecraft.class_1921.class_4688;

public final class vNvVVuUVVuuN {
   private static final int UuUVuuUu = 1048576;
   private static final class_2960 C00OOC00oO = class_2960.method_60655("minecraft", "core/stardust");
   private static final BlendFunction uUnuvNvvNU = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final RenderPipeline vVvUvVVuuNvV = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/stardust"))
         .withVertexShader(C00OOC00oO)
         .withFragmentShader(C00OOC00oO)
         .withVertexFormat(class_290.field_1577, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(uUnuvNvvNU)
         .build()
   );
   private static final class_1921 uNNnnnuuuN = class_1921.method_24049(
      "wild/stardust", 1048576, false, true, vVvUvVVuuNvV, class_4688.method_23598().method_23617(false)
   );

   private vNvVVuUVVuuN() {
   }

   public static void UuUVuuUu() {
      if (vVvUvVVuuNvV == null || uNNnnnuuuN == null) {
         vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("StardustShaderRegistry.init", new IllegalStateException("Stardust shader registry failed"));
      }
   }

   public static class_1921 C00OOC00oO() {
      return uNNnnnuuuN;
   }
}

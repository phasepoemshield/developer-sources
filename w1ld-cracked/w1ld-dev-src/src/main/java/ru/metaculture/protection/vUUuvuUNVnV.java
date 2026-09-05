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

public final class vUUuvuUNVnV {
   private static final int UuUVuuUu = 2097152;
   private static final class_2960 C00OOC00oO = class_2960.method_60655("wild", "core/trails_glass");
   private static final BlendFunction uUnuvNvvNU = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final RenderPipeline vVvUvVVuuNvV = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/trails_glass"))
         .withVertexShader(C00OOC00oO)
         .withFragmentShader(C00OOC00oO)
         .withVertexFormat(class_290.field_1577, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline uNNnnnuuuN = class_10799.method_67887(
      RenderPipeline.builder(new Snippet[]{class_10799.field_60125, class_10799.field_60126})
         .withLocation(class_2960.method_60655("wild", "pipeline/trails_emissive"))
         .withVertexShader(C00OOC00oO)
         .withFragmentShader(C00OOC00oO)
         .withVertexFormat(class_290.field_1577, class_5596.field_27382)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(uUnuvNvvNU)
         .build()
   );
   private static final class_1921 nuUnNvnuUu = class_1921.method_24049(
      "wild/trails_glass", 2097152, false, true, vVvUvVVuuNvV, class_4688.method_23598().method_23617(false)
   );
   private static final class_1921 VVuuUN = class_1921.method_24049(
      "wild/trails_emissive", 2097152, false, true, uNNnnnuuuN, class_4688.method_23598().method_23617(false)
   );

   private vUUuvuUNVnV() {
   }

   public static void UuUVuuUu() {
      if (nuUnNvnuUu == null || VVuuUN == null) {
         throw new IllegalStateException("Trails shader registry failed");
      }
   }

   public static class_1921 C00OOC00oO() {
      return nuUnNvnuUu;
   }

   public static class_1921 uUnuvNvvNU() {
      return VVuuUN;
   }
}

package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.util.Identifier;

public final class O00000O0OO {
   private static final int O00000000 = 262144;
   private static final Identifier O000000000 = Identifier.of("wild", "core/jump_circle");
   private static final RenderPipeline O0000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/jump_circle_lens"))
         .withVertexShader(O000000000)
         .withFragmentShader(O000000000)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderLayer O00000000000 = RenderLayer.of(
      "wild/jump_circle_lens", 262144, false, true, O0000000000, MultiPhaseParameters.builder().build(false)
   );

   private O00000O0OO() {
   }

   public static void O00000000() {
      if (O00000000000 == null) {
         throw new IllegalStateException("JumpCircle shader registry failed");
      }
   }

   public static RenderLayer O000000000() {
      return O00000000000;
   }

   public static RenderLayer O0000000000() {
      return O00000000000;
   }
}

package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.util.Identifier;

public final class O00000O0OO00O0 {
   private static final int O00000000 = 1048576;
   private static final Identifier O000000000 = Identifier.of("minecraft", "core/stardust");
   private static final BlendFunction O0000000000 = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final RenderPipeline O00000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/stardust"))
         .withVertexShader(O000000000)
         .withFragmentShader(O000000000)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(O0000000000)
         .build()
   );
   private static final RenderLayer O000000000000 = RenderLayer.of(
      "wild/stardust", 1048576, false, true, O00000000000, MultiPhaseParameters.builder().build(false)
   );

   private O00000O0OO00O0() {
   }

   public static void O00000000() {
      if (O00000000000 == null || O000000000000 == null) {
         O00000000OO0OO.O00000000().O000000000("StardustShaderRegistry.init", new IllegalStateException("Stardust shader registry failed"));
      }
   }

   public static RenderLayer O000000000() {
      return O000000000000;
   }
}

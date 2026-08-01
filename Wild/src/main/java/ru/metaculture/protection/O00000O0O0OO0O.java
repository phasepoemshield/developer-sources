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

public final class O00000O0O0OO0O {
   private static final int O00000000 = 2097152;
   private static final Identifier O000000000 = Identifier.of("wild", "core/chinahat");
   private static final BlendFunction O0000000000 = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
   private static final RenderPipeline O00000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/chinahat_glass"))
         .withVertexShader(O000000000)
         .withFragmentShader(O000000000)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.TRIANGLES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O000000000000 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.TRANSFORMS_AND_PROJECTION_SNIPPET, RenderPipelines.GLOBALS_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/chinahat_bloom"))
         .withVertexShader(O000000000)
         .withFragmentShader(O000000000)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR_NORMAL, DrawMode.TRIANGLES)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(O0000000000)
         .build()
   );
   private static final RenderLayer O0000000000000 = RenderLayer.of(
      "wild/chinahat_glass", 2097152, false, true, O00000000000, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000000O = RenderLayer.of(
      "wild/chinahat_bloom", 2097152, false, true, O000000000000, MultiPhaseParameters.builder().build(false)
   );

   private O00000O0O0OO0O() {
   }

   public static void O00000000() {
      if (O0000000000000 == null || O000000000000O == null) {
         O00000000OO0OO.O00000000().O000000000("ChinaHatShaderRegistry.init", new IllegalStateException("ChinaHat shader registry failed"));
      }
   }

   public static RenderLayer O000000000() {
      return O0000000000000;
   }

   public static RenderLayer O0000000000() {
      return O000000000000O;
   }
}

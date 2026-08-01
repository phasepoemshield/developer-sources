package ru.metaculture.protection;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.Map;
import java.util.Objects;
import java.util.OptionalDouble;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Consumer;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhase;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.LineWidth;
import net.minecraft.client.render.RenderPhase.Texture;
import net.minecraft.util.Identifier;

public final class O0000O0O0O {
   private static final int O00000000 = 1024;
   private static final int O000000000 = 256;
   private static final String O0000000000 = "wild";
   private static final double O00000000000 = 0.0625;
   private static final double O000000000000 = 64.0;
   private static final int O0000000000000 = 128;
   private static final RenderPipeline O000000000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/position_color_quads"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .build()
   );
   private static final RenderPipeline O00000000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/position_color_quads_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   private static final RenderPipeline O00000000000O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/position_color_quads_no_depth_blend"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.LIGHTNING)
         .build()
   );
   private static final RenderPipeline O00000000000OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/position_color_quads_translucent"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O0000000000O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/position_color_quads_translucent_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O0000000000O0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/lines"))
         .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, DrawMode.LINES)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(true)
         .build()
   );
   private static final RenderPipeline O0000000000O00 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/lines_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, DrawMode.LINES)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .build()
   );
   private static final RenderPipeline O0000000000O0O = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderPipeline O0000000000OO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads_additive"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.ADDITIVE)
         .build()
   );
   private static final RenderPipeline O0000000000OO0 = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads_no_depth_additive"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.ADDITIVE)
         .build()
   );
   private static final RenderPipeline O0000000000OOO = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_TEX_COLOR_SNIPPET})
         .withLocation(Identifier.of("wild", "pipeline/world/textured_quads_no_depth"))
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .withCull(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withDepthWrite(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .build()
   );
   private static final RenderLayer O000000000O = RenderLayer.of(
      "wild/world/position_color_quads", 1024, false, true, O000000000000O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O0 = RenderLayer.of(
      "wild/world/position_color_quads_no_depth", 1024, false, true, O00000000000O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O00 = RenderLayer.of(
      "wild/world/position_color_quads_no_depth_blend", 1024, false, true, O00000000000O0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O000 = RenderLayer.of(
      "wild/world/position_color_quads_translucent", 1024, false, true, O00000000000OO, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O00O = RenderLayer.of(
      "wild/world/position_color_quads_translucent_no_depth", 1024, false, true, O0000000000O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O0O = RenderLayer.of(
      "wild/world/textured_quads", 1024, false, true, O0000000000O0O, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O0O0 = RenderLayer.of(
      "wild/world/textured_quads_additive", 1024, false, true, O0000000000OO, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000O0OO = RenderLayer.of(
      "wild/world/textured_quads_no_depth_additive", 1024, false, true, O0000000000OO0, MultiPhaseParameters.builder().build(false)
   );
   private static final RenderLayer O000000000OO = RenderLayer.of(
      "wild/world/textured_quads_no_depth", 1024, false, true, O0000000000OOO, MultiPhaseParameters.builder().build(false)
   );
   private static final Map<Double, RenderLayer> O000000000OO0 = new ConcurrentHashMap<>();
   private static final Map<Double, RenderLayer> O000000000OO00 = new ConcurrentHashMap<>();

   private O0000O0O0O() {
   }

   public static RenderLayer O00000000() {
      return O000000000O;
   }

   public static RenderLayer O000000000() {
      return O000000000O0;
   }

   public static RenderLayer O0000000000() {
      return O000000000O00;
   }

   public static RenderLayer O00000000000() {
      return O000000000O000;
   }

   public static RenderLayer O000000000000() {
      return O000000000O00O;
   }

   public static RenderLayer O0000000000000() {
      return O000000000O0O;
   }

   public static RenderLayer O00000000(Identifier identifier) {
      return RenderLayer.of(
         identifier.toString(), 1024, false, true, O0000000000OOO, MultiPhaseParameters.builder().texture(new Texture(identifier, false)).build(false)
      );
   }

   public static RenderLayer O000000000(Identifier identifier) {
      return RenderLayer.of(
         identifier.toString(), 1024, false, true, O0000000000O0O, MultiPhaseParameters.builder().texture(new Texture(identifier, false)).build(false)
      );
   }

   public static RenderLayer O0000000000(Identifier identifier) {
      return RenderLayer.of(
         identifier.toString(), 1024, false, true, O0000000000OO, MultiPhaseParameters.builder().texture(new Texture(identifier, false)).build(false)
      );
   }

   public static RenderLayer O00000000000(Identifier identifier) {
      return RenderLayer.of(
         identifier.toString(), 1024, false, true, O0000000000OO0, MultiPhaseParameters.builder().texture(new Texture(identifier, false)).build(false)
      );
   }

   public static RenderLayer O00000000(double d) {
      O00000000(O000000000OO0);
      double var2 = O0000000000(d);
      return O000000000OO0.computeIfAbsent(var2, double_ -> O00000000(double_, "wild/world/lines", O0000000000O0));
   }

   public static RenderLayer O000000000(double d) {
      O00000000(O000000000OO00);
      double var2 = O0000000000(d);
      return O000000000OO00.computeIfAbsent(var2, double_ -> O00000000(double_, "wild/world/lines_no_depth", O0000000000O00));
   }

   private static RenderLayer O00000000(double d, String string, RenderPipeline renderPipeline) {
      LineWidth var4 = new LineWidth(d == 0.0 ? OptionalDouble.empty() : OptionalDouble.of(d));
      return RenderLayer.of(
         string + "/" + (d == 0.0 ? "default" : Double.toHexString(d)),
         256,
         false,
         true,
         renderPipeline,
         MultiPhaseParameters.builder().lineWidth(var4).build(false)
      );
   }

   public static MultiPhase O00000000(RenderLayer renderLayer, Consumer<RenderPass> consumer) {
      Objects.requireNonNull(renderLayer, "renderLayer");
      if (renderLayer instanceof MultiPhase var2) {
         O0000O0O00OOO0.O00000000(var2).withRenderPassSetup(consumer);
         return var2;
      } else {
         throw new IllegalArgumentException("Render layer must be a MultiPhase instance.");
      }
   }

   private static double O0000000000(double d) {
      if (!Double.isFinite(d)) {
         throw new IllegalArgumentException("Line width must be finite.");
      } else if (d < 0.0) {
         throw new IllegalArgumentException("Line width cannot be negative.");
      } else if (d == 0.0) {
         return 0.0;
      } else {
         double var2 = Math.min(d, 64.0);
         double var4 = Math.round(var2 / 0.0625) * 0.0625;
         if (var4 <= 0.0) {
            var4 = 0.0625;
         }

         return var4;
      }
   }

   private static void O00000000(Map<Double, RenderLayer> map) {
      if (map.size() > 128) {
         map.clear();
      }
   }
}

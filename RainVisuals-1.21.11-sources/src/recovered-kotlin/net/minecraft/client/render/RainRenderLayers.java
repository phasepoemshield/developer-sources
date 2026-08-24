package net.minecraft.client.render;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.pipeline.RenderPipeline.Snippet;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat.DrawMode;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.util.Identifier;

// $VF: Compiled from RainRenderLayers.java
public final class RainRenderLayers {
   private static final Map<Identifier, RenderLayer> MENU_3D_LAYERS = new ConcurrentHashMap<>();
   private static final int BUFFER_SIZE = 262144;
   private static final RenderPipeline JUMP_CIRCLE_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.GUI_SNIPPET})
         .withLocation("pipeline/rain_jump_circle")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withCull(false)
         .withBlend(BlendFunction.LIGHTNING)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final RenderPipeline HIT_PARTICLE_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.GUI_SNIPPET})
         .withLocation("pipeline/rain_hit_particle")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withCull(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final int DEBUG_LINE_BUFFER_SIZE = 1536;
   private static final Map<Double, RenderLayer> DEBUG_LINE_STRIP_LAYERS = new ConcurrentHashMap<>();
   private static final Map<Identifier, RenderLayer> TARGET_ESP_LAYERS = new ConcurrentHashMap<>();
   private static final RenderPipeline HITBOX_DEPTH_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation("pipeline/rain_hitbox_depth")
         .withVertexShader("core/position_color")
         .withFragmentShader("core/position_color")
         .withCull(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final Map<Double, RenderLayer> HITBOX_LINE_LAYERS = new ConcurrentHashMap<>();
   private static final RenderLayer HITBOX_DEPTH_LAYER = RenderLayer.of(
      "rain_hitbox_depth", RenderSetup.builder(HITBOX_DEPTH_PIPELINE).expectedBufferSize(1048576).build()
   );
   private static final RenderPipeline HITBOX_NO_DEPTH_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.POSITION_COLOR_SNIPPET})
         .withLocation("pipeline/rain_hitbox_no_depth")
         .withVertexShader("core/position_color")
         .withFragmentShader("core/position_color")
         .withCull(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final RenderPipeline MENU_3D_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.GUI_SNIPPET})
         .withLocation("pipeline/rain_menu_3d")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withCull(false)
         .withBlend(BlendFunction.TRANSLUCENT)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final RenderPipeline TARGET_ESP_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.GUI_SNIPPET})
         .withLocation("pipeline/rain_target_esp")
         .withVertexShader("core/position_tex_color")
         .withFragmentShader("core/position_tex_color")
         .withSampler("Sampler0")
         .withCull(false)
         .withBlend(BlendFunction.LIGHTNING)
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, DrawMode.QUADS)
         .build()
   );
   private static final Map<Identifier, RenderLayer> JUMP_CIRCLE_LAYERS = new ConcurrentHashMap<>();
   private static final Map<Identifier, RenderLayer> TRAIL_SPRITE_LAYERS = new ConcurrentHashMap<>();
   private static final RenderPipeline DEBUG_LINE_STRIP_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET})
         .withLocation("pipeline/rain_debug_line_strip")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL_LINE_WIDTH, DrawMode.DEBUG_LINE_STRIP)
         .build()
   );
   private static final int WORLD_BOX_BUFFER_SIZE = 1048576;
   private static final RenderPipeline HITBOX_LINE_PIPELINE = RenderPipelines.register(
      RenderPipeline.builder(new Snippet[]{RenderPipelines.RENDERTYPE_LINES_SNIPPET})
         .withLocation("pipeline/rain_hitbox_line")
         .withDepthWrite(false)
         .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
         .build()
   );
   private static final RenderLayer HITBOX_NO_DEPTH_LAYER = RenderLayer.of(
      "rain_hitbox_no_depth", RenderSetup.builder(HITBOX_NO_DEPTH_PIPELINE).expectedBufferSize(1048576).build()
   );
   private static final Map<Identifier, RenderLayer> HIT_PARTICLE_LAYERS = new ConcurrentHashMap<>();

   public static RenderLayer getHitParticle(Identifier texture) {
      return HIT_PARTICLE_LAYERS.computeIfAbsent(
         texture,
         id -> RenderLayer.of("rain_hit_particle", RenderSetup.builder(HIT_PARTICLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build())
      );
   }

   public static RenderLayer getTargetEsp(Identifier texture) {
      return TARGET_ESP_LAYERS.computeIfAbsent(
         texture, id -> RenderLayer.of("rain_target_esp", RenderSetup.builder(TARGET_ESP_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build())
      );
   }

   public static RenderLayer getHitBoxLine(double width) {
      double normalized = Math.max(1.0, Math.min(8.0, Math.round(width * 10.0) / 10.0));
      return HITBOX_LINE_LAYERS.computeIfAbsent(
         normalized,
         lineWidth -> RenderLayer.of(
            "rain_hitbox_line_" + lineWidth,
            RenderSetup.builder(HITBOX_LINE_PIPELINE)
               .layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING)
               .outputTarget(OutputTarget.ITEM_ENTITY_TARGET)
               .expectedBufferSize(1048576)
               .build()
         )
      );
   }

   public static RenderLayer getDebugLineStrip(double width) {
      double normalized = Math.max(1.0, Math.min(8.0, Math.round(width * 10.0) / 10.0));
      return DEBUG_LINE_STRIP_LAYERS.computeIfAbsent(
         normalized,
         lineWidth -> RenderLayer.of("rain_debug_line_strip_" + lineWidth, RenderSetup.builder(DEBUG_LINE_STRIP_PIPELINE).expectedBufferSize(1536).build())
      );
   }

   private RainRenderLayers() {
   }

   public static RenderLayer getHitBoxQuad(boolean depth) {
      return depth ? HITBOX_DEPTH_LAYER : HITBOX_NO_DEPTH_LAYER;
   }

   public static RenderLayer getJumpCircle(Identifier texture) {
      return JUMP_CIRCLE_LAYERS.computeIfAbsent(
         texture,
         id -> RenderLayer.of("rain_jump_circle", RenderSetup.builder(JUMP_CIRCLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build())
      );
   }

   public static RenderLayer getMenu3D(Identifier texture) {
      return MENU_3D_LAYERS.computeIfAbsent(
         texture, id -> RenderLayer.of("rain_menu_3d", RenderSetup.builder(MENU_3D_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build())
      );
   }

   public static RenderLayer getTrailSprite(Identifier texture) {
      return TRAIL_SPRITE_LAYERS.computeIfAbsent(
         texture,
         id -> RenderLayer.of("rain_trail_sprite", RenderSetup.builder(JUMP_CIRCLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build())
      );
   }
}

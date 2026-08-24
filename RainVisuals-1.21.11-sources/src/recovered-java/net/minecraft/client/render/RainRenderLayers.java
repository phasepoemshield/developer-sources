/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.vertex.VertexFormat$DrawMode
 *  net.minecraft.client.gl.RenderPipelines
 *  net.minecraft.client.render.LayeringTransform
 *  net.minecraft.client.render.OutputTarget
 *  net.minecraft.client.render.RenderLayer
 *  net.minecraft.client.render.RenderSetup
 *  net.minecraft.client.render.VertexFormats
 *  net.minecraft.util.Identifier
 */
package net.minecraft.client.render;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.LayeringTransform;
import net.minecraft.client.render.OutputTarget;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderSetup;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public final class RainRenderLayers {
    private static final Map<Identifier, RenderLayer> MENU_3D_LAYERS;
    private static final int BUFFER_SIZE = 262144;
    private static final RenderPipeline JUMP_CIRCLE_PIPELINE;
    private static final RenderPipeline HIT_PARTICLE_PIPELINE;
    private static final int DEBUG_LINE_BUFFER_SIZE = 1536;
    private static final Map<Double, RenderLayer> DEBUG_LINE_STRIP_LAYERS;
    private static final Map<Identifier, RenderLayer> TARGET_ESP_LAYERS;
    private static final RenderPipeline HITBOX_DEPTH_PIPELINE;
    private static final Map<Double, RenderLayer> HITBOX_LINE_LAYERS;
    private static final RenderLayer HITBOX_DEPTH_LAYER;
    private static final RenderPipeline HITBOX_NO_DEPTH_PIPELINE;
    private static final RenderPipeline MENU_3D_PIPELINE;
    private static final RenderPipeline TARGET_ESP_PIPELINE;
    private static final Map<Identifier, RenderLayer> JUMP_CIRCLE_LAYERS;
    private static final Map<Identifier, RenderLayer> TRAIL_SPRITE_LAYERS;
    private static final RenderPipeline DEBUG_LINE_STRIP_PIPELINE;
    private static final int WORLD_BOX_BUFFER_SIZE = 0x100000;
    private static final RenderPipeline HITBOX_LINE_PIPELINE;
    private static final RenderLayer HITBOX_NO_DEPTH_LAYER;
    private static final Map<Identifier, RenderLayer> HIT_PARTICLE_LAYERS;

    public static RenderLayer getHitParticle(Identifier texture) {
        return HIT_PARTICLE_LAYERS.computeIfAbsent(texture, id -> RenderLayer.of((String)"rain_hit_particle", (RenderSetup)RenderSetup.builder((RenderPipeline)HIT_PARTICLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build()));
    }

    public static RenderLayer getTargetEsp(Identifier texture) {
        return TARGET_ESP_LAYERS.computeIfAbsent(texture, id -> RenderLayer.of((String)"rain_target_esp", (RenderSetup)RenderSetup.builder((RenderPipeline)TARGET_ESP_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build()));
    }

    static {
        JUMP_CIRCLE_LAYERS = new ConcurrentHashMap<Identifier, RenderLayer>();
        TRAIL_SPRITE_LAYERS = new ConcurrentHashMap<Identifier, RenderLayer>();
        HIT_PARTICLE_LAYERS = new ConcurrentHashMap<Identifier, RenderLayer>();
        TARGET_ESP_LAYERS = new ConcurrentHashMap<Identifier, RenderLayer>();
        MENU_3D_LAYERS = new ConcurrentHashMap<Identifier, RenderLayer>();
        HITBOX_LINE_LAYERS = new ConcurrentHashMap<Double, RenderLayer>();
        DEBUG_LINE_STRIP_LAYERS = new ConcurrentHashMap<Double, RenderLayer>();
        RenderPipeline.Snippet[] snippetArray = new RenderPipeline.Snippet[1];
        snippetArray[0] = RenderPipelines.GUI_SNIPPET;
        JUMP_CIRCLE_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray).withLocation("pipeline/rain_jump_circle").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withCull(false).withBlend(BlendFunction.LIGHTNING).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray2 = new RenderPipeline.Snippet[1];
        snippetArray2[0] = RenderPipelines.GUI_SNIPPET;
        TARGET_ESP_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray2).withLocation("pipeline/rain_target_esp").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withCull(false).withBlend(BlendFunction.LIGHTNING).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray3 = new RenderPipeline.Snippet[1];
        snippetArray3[0] = RenderPipelines.GUI_SNIPPET;
        HIT_PARTICLE_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray3).withLocation("pipeline/rain_hit_particle").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withCull(false).withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray4 = new RenderPipeline.Snippet[1];
        snippetArray4[0] = RenderPipelines.GUI_SNIPPET;
        MENU_3D_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray4).withLocation("pipeline/rain_menu_3d").withVertexShader("core/position_tex_color").withFragmentShader("core/position_tex_color").withSampler("Sampler0").withCull(false).withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray5 = new RenderPipeline.Snippet[1];
        snippetArray5[0] = RenderPipelines.POSITION_COLOR_SNIPPET;
        HITBOX_DEPTH_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray5).withLocation("pipeline/rain_hitbox_depth").withVertexShader("core/position_color").withFragmentShader("core/position_color").withCull(false).withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray6 = new RenderPipeline.Snippet[1];
        snippetArray6[0] = RenderPipelines.POSITION_COLOR_SNIPPET;
        HITBOX_NO_DEPTH_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray6).withLocation("pipeline/rain_hitbox_no_depth").withVertexShader("core/position_color").withFragmentShader("core/position_color").withCull(false).withBlend(BlendFunction.TRANSLUCENT).withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS).build());
        RenderPipeline.Snippet[] snippetArray7 = new RenderPipeline.Snippet[1];
        snippetArray7[0] = RenderPipelines.RENDERTYPE_LINES_SNIPPET;
        HITBOX_LINE_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray7).withLocation("pipeline/rain_hitbox_line").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).build());
        RenderPipeline.Snippet[] snippetArray8 = new RenderPipeline.Snippet[1];
        snippetArray8[0] = RenderPipelines.RENDERTYPE_LINES_SNIPPET;
        DEBUG_LINE_STRIP_PIPELINE = RenderPipelines.register((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])snippetArray8).withLocation("pipeline/rain_debug_line_strip").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL_LINE_WIDTH, VertexFormat.DrawMode.DEBUG_LINE_STRIP).build());
        HITBOX_DEPTH_LAYER = RenderLayer.of((String)"rain_hitbox_depth", (RenderSetup)RenderSetup.builder((RenderPipeline)HITBOX_DEPTH_PIPELINE).expectedBufferSize(0x100000).build());
        HITBOX_NO_DEPTH_LAYER = RenderLayer.of((String)"rain_hitbox_no_depth", (RenderSetup)RenderSetup.builder((RenderPipeline)HITBOX_NO_DEPTH_PIPELINE).expectedBufferSize(0x100000).build());
    }

    public static RenderLayer getHitBoxLine(double width) {
        double normalized = Math.max(1.0, Math.min(8.0, (double)Math.round(width * 10.0) / 10.0));
        return HITBOX_LINE_LAYERS.computeIfAbsent(normalized, lineWidth -> RenderLayer.of((String)("rain_hitbox_line_" + lineWidth), (RenderSetup)RenderSetup.builder((RenderPipeline)HITBOX_LINE_PIPELINE).layeringTransform(LayeringTransform.VIEW_OFFSET_Z_LAYERING).outputTarget(OutputTarget.ITEM_ENTITY_TARGET).expectedBufferSize(0x100000).build()));
    }

    public static RenderLayer getDebugLineStrip(double width) {
        double normalized = Math.max(1.0, Math.min(8.0, (double)Math.round(width * 10.0) / 10.0));
        return DEBUG_LINE_STRIP_LAYERS.computeIfAbsent(normalized, lineWidth -> RenderLayer.of((String)("rain_debug_line_strip_" + lineWidth), (RenderSetup)RenderSetup.builder((RenderPipeline)DEBUG_LINE_STRIP_PIPELINE).expectedBufferSize(1536).build()));
    }

    private RainRenderLayers() {
    }

    public static RenderLayer getHitBoxQuad(boolean depth) {
        return depth ? HITBOX_DEPTH_LAYER : HITBOX_NO_DEPTH_LAYER;
    }

    public static RenderLayer getJumpCircle(Identifier texture) {
        return JUMP_CIRCLE_LAYERS.computeIfAbsent(texture, id -> RenderLayer.of((String)"rain_jump_circle", (RenderSetup)RenderSetup.builder((RenderPipeline)JUMP_CIRCLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build()));
    }

    public static RenderLayer getMenu3D(Identifier texture) {
        return MENU_3D_LAYERS.computeIfAbsent(texture, id -> RenderLayer.of((String)"rain_menu_3d", (RenderSetup)RenderSetup.builder((RenderPipeline)MENU_3D_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build()));
    }

    public static RenderLayer getTrailSprite(Identifier texture) {
        return TRAIL_SPRITE_LAYERS.computeIfAbsent(texture, id -> RenderLayer.of((String)"rain_trail_sprite", (RenderSetup)RenderSetup.builder((RenderPipeline)JUMP_CIRCLE_PIPELINE).texture("Sampler0", id).expectedBufferSize(262144).build()));
    }
}


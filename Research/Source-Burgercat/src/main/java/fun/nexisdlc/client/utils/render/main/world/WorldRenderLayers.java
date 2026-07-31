package fun.nexisdlc.client.utils.render.main.world;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.vertex.VertexFormat;
import net.minecraft.client.gl.RenderPipelines;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.RenderLayers;
import net.minecraft.client.render.RenderSetup;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Central registry for world render layers used by nexis's post-world overlays.
 *
 * <p>Vertex attribute expectations:
 * <dl>
 *     <dt>{@link #POSITION_COLOR_QUADS()}</dt>
 *     <dd>{@link VertexFormats#POSITION_COLOR}: position (x, y, z) followed by packed ARGB color.</dd>
 *     <dt>{@link #POSITION_COLOR_QUADS_NO_DEPTH()}</dt>
 *     <dd>{@link VertexFormats#POSITION_COLOR}: position (x, y, z) followed by packed ARGB color.</dd>
 *     <dt>{@link #POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH()}</dt>
 *     <dd>{@link VertexFormats#POSITION_COLOR}: position (x, y, z) followed by packed ARGB color.</dd>
 *     <dt>{@link #LINES(double)} and {@link #LINES_NO_DEPTH(double)}</dt>
 *     <dd>{@link VertexFormats#POSITION_COLOR_NORMAL}: position (x, y, z), packed ARGB color, vertex normal (nx, ny, nz).</dd>
 *     <dt>{@link #TEXTURED_QUADS()}</dt>
 *     <dd>{@link VertexFormats#POSITION_TEXTURE_COLOR}: position (x, y, z), texture coordinates (u, v), packed ARGB color.</dd>
 * </dl>
 */
public final class WorldRenderLayers {

    private static final int QUAD_BUFFER_SIZE_BYTES = 1 << 14; // 16 KiB
    private static final int LINE_BUFFER_SIZE_BYTES = 1 << 12; // 4 KiB
    private static final int MAX_TEXTURE_LAYER_CACHE_SIZE = 256;
    private static final String PIPELINE_NAMESPACE = "nexis";
    private static final Identifier WHITE_TEXTURE = Identifier.of("minecraft", "textures/misc/white.png");
    private static final ThreadLocal<LayerIntent> LAYER_INTENT = new ThreadLocal<>();
    private static final Map<RenderLayer, LayerFlags> LAYER_FLAGS = new ConcurrentHashMap<>();

    private static final RenderPipeline POSITION_COLOR_QUADS_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(true)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_TRANSLUCENT_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_translucent"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_ADDITIVE_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_additive"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_additive_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_translucent_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .build()
    );

    private static final RenderPipeline POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/position_color_quads_alpha_src_one_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING) // GL alpha src one: SRC_ALPHA, ONE
                    .build()
    );

    private static final RenderPipeline LINES_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.RENDERTYPE_LINES_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/lines"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, VertexFormat.DrawMode.LINES)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(true)
                    .build()
    );

    private static final RenderPipeline LINES_ADDITIVE_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.RENDERTYPE_LINES_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/lines_additive"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, VertexFormat.DrawMode.LINES)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderPipeline LINES_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.RENDERTYPE_LINES_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/lines_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, VertexFormat.DrawMode.LINES)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .build()
    );

    private static final RenderPipeline LINES_ADDITIVE_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.RENDERTYPE_LINES_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/lines_additive_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_COLOR_NORMAL, VertexFormat.DrawMode.LINES)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderPipeline TEXTURED_QUADS_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_TEX_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/textured_quads"))
                    .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .build()
    );

    private static final RenderPipeline TEXTURED_QUADS_ADDITIVE_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_TEX_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/textured_quads_additive"))
                    .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderPipeline TEXTURED_QUADS_ADDITIVE_NO_DEPTH_PIPELINE = RenderPipelines.register(
            RenderPipeline.builder(RenderPipelines.POSITION_TEX_COLOR_SNIPPET)
                    .withLocation(Identifier.of(PIPELINE_NAMESPACE, "pipeline/world/textured_quads_additive_no_depth"))
                    .withVertexFormat(VertexFormats.POSITION_TEXTURE_COLOR, VertexFormat.DrawMode.QUADS)
                    .withCull(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withDepthWrite(false)
                    .withBlend(BlendFunction.LIGHTNING)
                    .build()
    );

    private static final RenderLayer POSITION_COLOR_QUADS_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads",
            RenderSetup.builder(POSITION_COLOR_QUADS_PIPELINE).build()
    ), false, false, false);

    private static final RenderLayer POSITION_COLOR_QUADS_TRANSLUCENT_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_translucent",
            RenderSetup.builder(POSITION_COLOR_QUADS_TRANSLUCENT_PIPELINE).build()
    ), false, false, false);

    private static final RenderLayer POSITION_COLOR_QUADS_ADDITIVE_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_additive",
            RenderSetup.builder(POSITION_COLOR_QUADS_ADDITIVE_PIPELINE).build()
    ), false, true, false);

    private static final RenderLayer POSITION_COLOR_QUADS_NO_DEPTH_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_no_depth",
            RenderSetup.builder(POSITION_COLOR_QUADS_NO_DEPTH_PIPELINE).build()
    ), true, false, false);

    private static final RenderLayer POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_additive_no_depth",
            RenderSetup.builder(POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH_PIPELINE).build()
    ), true, true, false);

    private static final RenderLayer POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_translucent_no_depth",
            RenderSetup.builder(POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH_PIPELINE).build()
    ), true, false, false);

    private static final RenderLayer POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/position_color_quads_alpha_src_one_no_depth",
            RenderSetup.builder(POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH_PIPELINE).build()
    ), true, true, false);

    private static final RenderLayer TEXTURED_QUADS_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/textured_quads",
            RenderSetup.builder(TEXTURED_QUADS_PIPELINE).build()
    ), false, false, false);

    private static final RenderLayer TEXTURED_QUADS_ADDITIVE_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/textured_quads_additive",
            RenderSetup.builder(TEXTURED_QUADS_ADDITIVE_PIPELINE).build()
    ), false, true, false);

    private static final RenderLayer TEXTURED_QUADS_ADDITIVE_NO_DEPTH_LAYER = registerLayer(RenderLayer.of(
            "nexis/world/textured_quads_additive_no_depth",
            RenderSetup.builder(TEXTURED_QUADS_ADDITIVE_NO_DEPTH_PIPELINE).build()
    ), true, true, false);

    private static final RenderLayer COMPAT_COLOR_LAYER = registerLayer(
            RenderLayers.entityTranslucent(WHITE_TEXTURE, true), false, false, true);
    private static final RenderLayer COMPAT_TEXTURED_WHITE_LAYER = registerLayer(
            RenderLayers.entityTranslucent(WHITE_TEXTURE, true), false, false, true);

    private static final Map<Double, RenderLayer> LINES_CACHE = new ConcurrentHashMap<>();
    private static final Map<Double, RenderLayer> LINES_ADDITIVE_CACHE = new ConcurrentHashMap<>();
    private static final Map<Double, RenderLayer> LINES_NO_DEPTH_CACHE = new ConcurrentHashMap<>();
    private static final Map<Double, RenderLayer> LINES_ADDITIVE_NO_DEPTH_CACHE = new ConcurrentHashMap<>();
    private static final Map<Identifier, RenderLayer> TEXTURED_QUADS_ADDITIVE_TEXTURE_CACHE = new ConcurrentHashMap<>();
    private static final Map<Identifier, RenderLayer> TEXTURED_QUADS_ADDITIVE_NO_DEPTH_TEXTURE_CACHE = new ConcurrentHashMap<>();
    private static final Map<Identifier, RenderLayer> COMPAT_TEXTURED_QUADS_ADDITIVE_TEXTURE_CACHE = new ConcurrentHashMap<>();
    private static final Map<Identifier, RenderLayer> COMPAT_TEXTURED_QUADS_ADDITIVE_NO_DEPTH_TEXTURE_CACHE = new ConcurrentHashMap<>();
    private static final long SHADER_QUERY_INTERVAL_MS = 1000L;
    private static volatile long lastShaderQueryMs = 0L;
    private static volatile boolean shaderPackActive = false;

    private WorldRenderLayers() {
    }

    public static RenderLayer POSITION_COLOR_QUADS() {
        return POSITION_COLOR_QUADS_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_TRANSLUCENT() {
        return POSITION_COLOR_QUADS_TRANSLUCENT_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_ADDITIVE() {
        return POSITION_COLOR_QUADS_ADDITIVE_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_NO_DEPTH() {
        return POSITION_COLOR_QUADS_NO_DEPTH_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH() {
        return POSITION_COLOR_QUADS_ADDITIVE_NO_DEPTH_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH() {
        return POSITION_COLOR_QUADS_TRANSLUCENT_NO_DEPTH_LAYER;
    }

    public static RenderLayer POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH() {
        return POSITION_COLOR_QUADS_ALPHA_SRC_ONE_NO_DEPTH_LAYER;
    }

    public static RenderLayer TEXTURED_QUADS() {
        return TEXTURED_QUADS_LAYER;
    }

    public static RenderLayer TEXTURED_QUADS_ADDITIVE() {
        return TEXTURED_QUADS_ADDITIVE_LAYER;
    }

    public static RenderLayer TEXTURED_QUADS_ADDITIVE_NO_DEPTH() {
        return TEXTURED_QUADS_ADDITIVE_NO_DEPTH_LAYER;
    }

    public static RenderLayer TEXTURED_QUADS_ADDITIVE(Identifier texture) {
        Objects.requireNonNull(texture, "texture");
        trimTextureLayerCache(TEXTURED_QUADS_ADDITIVE_TEXTURE_CACHE);
        return TEXTURED_QUADS_ADDITIVE_TEXTURE_CACHE.computeIfAbsent(texture, id -> registerLayer(RenderLayer.of(
                "nexis/world/textured_quads_additive/" + id,
                RenderSetup.builder(TEXTURED_QUADS_ADDITIVE_PIPELINE)
                        .texture("Sampler0", id)
                        .build()
        ), false, true, false));
    }

    public static RenderLayer TEXTURED_QUADS_ADDITIVE_NO_DEPTH(Identifier texture) {
        Objects.requireNonNull(texture, "texture");
        trimTextureLayerCache(TEXTURED_QUADS_ADDITIVE_NO_DEPTH_TEXTURE_CACHE);
        return TEXTURED_QUADS_ADDITIVE_NO_DEPTH_TEXTURE_CACHE.computeIfAbsent(texture, id -> registerLayer(RenderLayer.of(
                "nexis/world/textured_quads_additive_no_depth/" + id,
                RenderSetup.builder(TEXTURED_QUADS_ADDITIVE_NO_DEPTH_PIPELINE)
                        .texture("Sampler0", id)
                        .build()
        ), true, true, false));
    }

    public static RenderLayer LINES(double width) {
        double normalizedWidth = normalizeWidth(width);
        return LINES_CACHE.computeIfAbsent(normalizedWidth, value -> createLineLayer(
                value,
                "nexis/world/lines",
                LINES_PIPELINE,
                false,
                false
        ));
    }

    public static RenderLayer LINES_ADDITIVE(double width) {
        double normalizedWidth = normalizeWidth(width);
        return LINES_ADDITIVE_CACHE.computeIfAbsent(normalizedWidth, value -> createLineLayer(
                value,
                "nexis/world/lines_additive",
                LINES_ADDITIVE_PIPELINE,
                false,
                true
        ));
    }

    public static RenderLayer LINES_NO_DEPTH(double width) {
        double normalizedWidth = normalizeWidth(width);
        return LINES_NO_DEPTH_CACHE.computeIfAbsent(normalizedWidth, value -> createLineLayer(
                value,
                "nexis/world/lines_no_depth",
                LINES_NO_DEPTH_PIPELINE,
                true,
                false
        ));
    }

    public static RenderLayer LINES_ADDITIVE_NO_DEPTH(double width) {
        double normalizedWidth = normalizeWidth(width);
        return LINES_ADDITIVE_NO_DEPTH_CACHE.computeIfAbsent(normalizedWidth, value -> createLineLayer(
                value,
                "nexis/world/lines_additive_no_depth",
                LINES_ADDITIVE_NO_DEPTH_PIPELINE,
                true,
                true
        ));
    }

    private static RenderLayer createLineLayer(double width, String baseName, RenderPipeline pipeline,
                                               boolean noDepth, boolean additive) {
        return registerLayer(RenderLayer.of(
                baseName + "/" + (width == 0.0D ? "default" : Double.toHexString(width)),
                RenderSetup.builder(pipeline).build()
        ), noDepth, additive, false);
    }

    public static boolean isNoDepthLayer(RenderLayer renderLayer) {
        LayerFlags flags = LAYER_FLAGS.get(renderLayer);
        return flags != null && flags.noDepth();
    }

    private static double normalizeWidth(double width) {
        if (!Double.isFinite(width)) {
            throw new IllegalArgumentException("Line width must be finite.");
        }
        if (width < 0.0D) {
            throw new IllegalArgumentException("Line width cannot be negative.");
        }
        return width == 0.0D ? 0.0D : width;
    }

    private static boolean useVanillaLinesLayer() {
        long now = System.currentTimeMillis();
        if (now - lastShaderQueryMs > SHADER_QUERY_INTERVAL_MS) {
            lastShaderQueryMs = now;
            shaderPackActive = isIrisShaderPackActive();
        }
        return shaderPackActive;
    }

    public static boolean isShaderPackActive() {
        useVanillaLinesLayer();
        return shaderPackActive;
    }

    public static boolean isCompatTexturedLayer(RenderLayer renderLayer) {
        LayerFlags flags = LAYER_FLAGS.get(renderLayer);
        return flags != null && flags.compatTextured();
    }

    public static boolean isAdditiveLayer(RenderLayer renderLayer) {
        LayerFlags flags = LAYER_FLAGS.get(renderLayer);
        return flags != null && flags.additive();
    }

    public static LayerIntent consumeIntent() {
        LayerIntent intent = LAYER_INTENT.get();
        LAYER_INTENT.remove();
        return intent;
    }

    private static final ThreadLocal<PassOverride> PASS_OVERRIDE = new ThreadLocal<>();

    public static void setPassOverride(boolean noDepth, boolean additive) {
        PASS_OVERRIDE.set(new PassOverride(noDepth, additive));
    }

    public static void clearPassOverride() {
        PASS_OVERRIDE.remove();
    }

    public static PassOverride getPassOverride() {
        return PASS_OVERRIDE.get();
    }

    private static void setIntent(boolean additive, boolean noDepth, boolean compatTextured) {
        LAYER_INTENT.set(new LayerIntent(additive, noDepth, compatTextured));
    }

    private static RenderLayer registerLayer(RenderLayer layer, boolean noDepth, boolean additive, boolean compatTextured) {
        LAYER_FLAGS.put(layer, new LayerFlags(noDepth, additive, compatTextured));
        return layer;
    }

    private static void trimTextureLayerCache(Map<Identifier, RenderLayer> cache) {
        if (cache.size() < MAX_TEXTURE_LAYER_CACHE_SIZE) {
            return;
        }
        var iterator = cache.entrySet().iterator();
        if (!iterator.hasNext()) {
            return;
        }
        Map.Entry<Identifier, RenderLayer> eldest = iterator.next();
        iterator.remove();
        LAYER_FLAGS.remove(eldest.getValue());
    }

    public record LayerIntent(boolean additive, boolean noDepth, boolean compatTextured) {
    }

    public record PassOverride(boolean noDepth, boolean additive) {
    }

    private record LayerFlags(boolean noDepth, boolean additive, boolean compatTextured) {
    }

    private static boolean isIrisShaderPackActive() {
        return IrisAccess.isShaderPackActive();
    }

    private static final class IrisAccess {
        private static final Method GET_INSTANCE_METHOD;
        private static final Method IS_SHADER_PACK_IN_USE_METHOD;

        static {
            Method getInstance = null;
            Method isShaderPackInUse = null;
            try {
                Class<?> irisApiClass = Class.forName("net.irisshaders.iris.api.v0.IrisApi");
                getInstance = irisApiClass.getMethod("getInstance");
                isShaderPackInUse = irisApiClass.getMethod("isShaderPackInUse");
            } catch (Throwable ignored) {
            }
            GET_INSTANCE_METHOD = getInstance;
            IS_SHADER_PACK_IN_USE_METHOD = isShaderPackInUse;
        }

        private static boolean isShaderPackActive() {
            if (GET_INSTANCE_METHOD == null || IS_SHADER_PACK_IN_USE_METHOD == null) {
                return false;
            }
            try {
                Object api = GET_INSTANCE_METHOD.invoke(null);
                Object result = IS_SHADER_PACK_IN_USE_METHOD.invoke(api);
                return result instanceof Boolean active && active;
            } catch (Throwable ignored) {
                return false;
            }
        }
    }
}

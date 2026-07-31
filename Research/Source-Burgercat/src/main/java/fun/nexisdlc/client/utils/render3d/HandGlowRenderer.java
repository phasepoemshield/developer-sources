package fun.nexisdlc.client.utils.render3d;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.pipeline.*;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.*;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.client.ClientColors;
import fun.nexisdlc.ui.HudTheme;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.GpuSampler;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;

/**
 * Blaze3D-native glow post-process for held items / hands.
 * <p>
 * Strategy:
 * 1) MixinGameRenderer.renderHand() HEAD  -> markCapture()
 * 2) MixinGameRenderer.renderWorld() BEFORE RenderDispatcher.render() -> preHandCapture()
 * (sets outputColor/DepthTextureOverride to handFBO so hands draw there)
 * 3) GameRenderer renders hands + overlays into handFBO via the override
 * 4) MixinGameRenderer.renderWorld() AFTER RenderDispatcher.render() -> postHandCapture()
 * (resets overrides and copies captured hands back to main framebuffer)
 * 5) GameRenderer.render() before GUI  -> blur handFBO + additive glow back to main framebuffer
 */
public class HandGlowRenderer {

    private static final float GLOW_BUFFER_SCALE = 1.0f;
    private static final float MAX_BLUR_RADIUS = 32.0f;

    private static boolean initialized = false;
    private static int fbW, fbH;
    private static int glowW, glowH;

    // Off-screen framebuffers managed by the new Blaze3D API
    private static SimpleFramebuffer handFbo;
    private static SimpleFramebuffer blurFbo;
    private static SimpleFramebuffer glowFbo;

    // Full-screen triangle vertex buffer
    private static GpuBuffer vertexBuffer;

    // Shared linear/clamp sampler
    private static GpuSampler sampler;

    // Render pipelines (blur + blit + glow)
    private static RenderPipeline blitPipeline;
    private static RenderPipeline hBlurOutlinePipeline;
    private static RenderPipeline vBlurTintOutlinePipeline;
    private static RenderPipeline glowCompositePipeline;

    // Uniform GPU buffers (one per uniform for simplicity and alignment safety)
    private static GpuBuffer resolutionBuffer;
    private static GpuBuffer radiusBuffer;
    private static GpuBuffer colorBuffer;
    private static GpuBuffer intensityBuffer;
    private static GpuBuffer flameBuffer;

    private static boolean needsPost = false;
    private static boolean uniformsDirty = true;
    private static int lastUniformW = -1;
    private static int lastUniformH = -1;
    private static float lastUniformRadius = Float.NaN;
    private static float lastUniformR = Float.NaN;
    private static float lastUniformG = Float.NaN;
    private static float lastUniformB = Float.NaN;
    private static float lastUniformIntensity = Float.NaN;

    /* ---------- Removed Inline shaders ---------- */

    /* ---------- Public API ---------- */

    /**
     * Called from MixinGameRenderer.renderHand() HEAD.
     */
    public static void preHandCapture() {
        needsPost = false;
        if (!initialized) init();
        if (!initialized) return;

        resizeIfNeeded();

        // Redirect the hand render output into our off-screen framebuffer
        RenderSystem.outputColorTextureOverride = handFbo.getColorAttachmentView();
        RenderSystem.outputDepthTextureOverride = handFbo.getDepthAttachmentView();

        // Clear it so we start with a clean black slate
        CommandEncoder encoder = RenderSystem.getDevice().createCommandEncoder();
        encoder.clearColorAndDepthTextures(
                handFbo.getColorAttachment(), 0,
                handFbo.getDepthAttachment(), 1.0
        );
    }

    /**
     * Called from MixinGameRenderer.renderHand() TAIL.
     */
    public static void postHandCapture() {
        if (RenderSystem.outputColorTextureOverride == null
                && RenderSystem.outputDepthTextureOverride == null) {
            return;
        }
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
        copyHandsBack();
        needsPost = true;
    }

    private static void copyHandsBack() {
        if (!initialized) return;
        resizeIfNeeded();

        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();
        try (RenderPass pass = encoder.createRenderPass(
                () -> "handglow_copyback",
                MinecraftClient.getInstance().getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(blitPipeline);
            pass.bindTexture("InSampler", handFbo.getColorAttachmentView(), sampler);
            RenderSystem.bindDefaultUniforms(pass);
            // core/screenquad generates its own fullscreen triangle via gl_VertexID;
            // do NOT set a vertex buffer here (vanilla drawBlit also omits it).
            pass.draw(0, 3);
        }
    }

    public static boolean needsPost() {
        return needsPost;
    }

    /**
     * Safety reset in case a crash left the overrides dangling.
     */
    public static void resetOverrides() {
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
    }

    /**
     * Blur + composite the captured hand buffer back to the screen.
     */
    public static void postHandsRender(float intensity, float radiusLogical) {
        postHandsRender(intensity, radiusLogical, 0.0f, 1.0f, false);
    }

    /**
     * Blur + composite the captured hand buffer back to the screen.
     */
    public static void postHandsRender(float intensity, float radiusLogical, float flamePower, float flameSpeed, boolean rainbowFlame) {
        if (!initialized || !needsPost) return;
        needsPost = false;
        if (intensity <= 0.01f || radiusLogical <= 0.5f) return;

        MinecraftClient mc = MinecraftClient.getInstance();
        int w = mc.getWindow().getFramebufferWidth();
        int h = mc.getWindow().getFramebufferHeight();
        if (w <= 0 || h <= 0) return;
        if (fbW != w || fbH != h) resize(w, h);

        float scaleX = fbW / (float) mc.getWindow().getWidth();
        float radius = radiusLogical * scaleX;
        float glowRadius = Math.min(MAX_BLUR_RADIUS, Math.max(1.0f, radius * GLOW_BUFFER_SCALE));

        float r, g, b;
        if (HudTheme.isRainbowEnabled()) {
            int abgr = HudTheme.getRainbow(1.0f);
            r = (abgr & 0xFF) / 255f;
            g = ((abgr >> 8) & 0xFF) / 255f;
            b = ((abgr >> 16) & 0xFF) / 255f;
        } else {
            r = ClientColors.ICON.getRed() / 255f;
            g = ClientColors.ICON.getGreen() / 255f;
            b = ClientColors.ICON.getBlue() / 255f;
        }

        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();

        writeUniformsIfNeeded(encoder, glowW, glowH, glowRadius, r, g, b, intensity);
        writeFlameUniform(encoder, flamePower, flameSpeed, rainbowFlame);

        // Horizontal blur hand -> blurFbo (pure Gaussian blur)
        try (RenderPass pass = encoder.createRenderPass(
                () -> "handglow_hblur_outline",
                blurFbo.getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(hBlurOutlinePipeline);
            pass.bindTexture("u_texture", handFbo.getColorAttachmentView(), sampler);
            pass.setUniform("u_resolution", resolutionBuffer.slice());
            pass.setUniform("u_radius", radiusBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, 3);
        }

        // Vertical blur + subtract original -> only soft outer glow remains
        try (RenderPass pass = encoder.createRenderPass(
                () -> "handglow_vblur_outline",
                glowFbo.getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(vBlurTintOutlinePipeline);
            pass.bindTexture("u_texture", blurFbo.getColorAttachmentView(), sampler);
            pass.bindTexture("u_original", handFbo.getColorAttachmentView(), sampler);
            pass.setUniform("u_resolution", resolutionBuffer.slice());
            pass.setUniform("u_radius", radiusBuffer.slice());
            pass.setUniform("u_glowColor", colorBuffer.slice());
            pass.setUniform("u_intensity", intensityBuffer.slice());
            pass.setUniform("u_flame", flameBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, 3);
        }

        compositeGlow(encoder, mc);
    }

    private static void compositeGlow(CommandEncoder encoder, MinecraftClient mc) {
        try (RenderPass pass = encoder.createRenderPass(
                () -> "handglow_composite",
                mc.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(glowCompositePipeline);
            pass.bindTexture("InSampler", glowFbo.getColorAttachmentView(), sampler);
            RenderSystem.bindDefaultUniforms(pass);
            pass.draw(0, 3);
        }
    }

    /* ---------- Uniform uploads ---------- */

    private static void writeUniformsIfNeeded(CommandEncoder encoder, int w, int h, float radius, float r, float g, float b, float intensity) {
        if (!uniformsDirty
                && lastUniformW == w
                && lastUniformH == h
                && closeEnough(lastUniformRadius, radius)
                && closeEnough(lastUniformR, r)
                && closeEnough(lastUniformG, g)
                && closeEnough(lastUniformB, b)
                && closeEnough(lastUniformIntensity, intensity)) {
            return;
        }

        writeUniforms(encoder, w, h, radius, r, g, b, intensity);
        lastUniformW = w;
        lastUniformH = h;
        lastUniformRadius = radius;
        lastUniformR = r;
        lastUniformG = g;
        lastUniformB = b;
        lastUniformIntensity = intensity;
        uniformsDirty = false;
    }

    private static boolean closeEnough(float a, float b) {
        return Math.abs(a - b) < 0.0005f;
    }

    private static void writeUniforms(CommandEncoder encoder, int w, int h, float radius, float r, float g, float b, float intensity) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buf = Std140Builder.onStack(stack, 16)
                    .putVec2(w, h)
                    .get();
            encoder.writeToBuffer(resolutionBuffer.slice(), buf);

            buf = Std140Builder.onStack(stack, 16)
                    .putFloat(radius)
                    .get();
            encoder.writeToBuffer(radiusBuffer.slice(), buf);

            buf = Std140Builder.onStack(stack, 16)
                    .putVec3(r, g, b)
                    .get();
            encoder.writeToBuffer(colorBuffer.slice(), buf);

            buf = Std140Builder.onStack(stack, 16)
                    .putFloat(intensity)
                    .get();
            encoder.writeToBuffer(intensityBuffer.slice(), buf);
        }
    }

    private static void writeFlameUniform(CommandEncoder encoder, float flamePower, float flameSpeed, boolean rainbowFlame) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            float time = (System.nanoTime() % 1_000_000_000_000L) / 1_000_000_000.0f;
            ByteBuffer buf = Std140Builder.onStack(stack, 16)
                    .putVec4(time, flamePower, flameSpeed, rainbowFlame ? 1.0f : 0.0f)
                    .get();
            encoder.writeToBuffer(flameBuffer.slice(), buf);
        }
    }

    /* ---------- Internal ---------- */

    private static void init() {
        if (initialized) return;
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            int w = mc.getWindow().getFramebufferWidth();
            int h = mc.getWindow().getFramebufferHeight();

            GpuDevice device = RenderSystem.getDevice();

            // Full-screen triangle vertex format (Position only)
            VertexFormat format = VertexFormat.builder()
                    .add("Position", VertexFormatElement.POSITION)
                    .build();

            // Upload a single full-screen triangle: (-1,-1) (3,-1) (-1,3)
            try (MemoryStack stack = MemoryStack.stackPush()) {
                ByteBuffer buf = stack.malloc(3 * 3 * 4); // 3 verts, 3 floats, 4 bytes
                buf.asFloatBuffer()
                        .put(-1f).put(-1f).put(0f)
                        .put(3f).put(-1f).put(0f)
                        .put(-1f).put(3f).put(0f);
                vertexBuffer = format.uploadImmediateVertexBuffer(buf);
            }

            // Sampler: linear + clamp-to-edge
            sampler = device.createSampler(
                    AddressMode.CLAMP_TO_EDGE,
                    AddressMode.CLAMP_TO_EDGE,
                    FilterMode.LINEAR,
                    FilterMode.LINEAR,
                    1,
                    OptionalDouble.empty()
            );

            // Build pipelines
            blitPipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "handglow_blit"))
                    .withVertexShader("core/screenquad")
                    .withFragmentShader("core/blit_screen")
                    .withSampler("InSampler")
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .withDepthWrite(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withVertexFormat(VertexFormats.EMPTY, VertexFormat.DrawMode.TRIANGLES)
                    .build();

            hBlurOutlinePipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "handglow_hblur_outline"))
                    .withVertexShader(Identifier.of("nexis", "core/handglow_hblur_outline"))
                    .withFragmentShader(Identifier.of("nexis", "core/handglow_hblur_outline"))
                    .withVertexFormat(format, VertexFormat.DrawMode.TRIANGLES)
                    .withSampler("u_texture")
                    .withUniform("u_resolution", UniformType.UNIFORM_BUFFER)
                    .withUniform("u_radius", UniformType.UNIFORM_BUFFER)
                    .withoutBlend()
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .build();

            vBlurTintOutlinePipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "handglow_vblur_outline"))
                    .withVertexShader(Identifier.of("nexis", "core/handglow_vblur_outline"))
                    .withFragmentShader(Identifier.of("nexis", "core/handglow_vblur_outline"))
                    .withVertexFormat(format, VertexFormat.DrawMode.TRIANGLES)
                    .withSampler("u_texture")
                    .withSampler("u_original")
                    .withUniform("u_resolution", UniformType.UNIFORM_BUFFER)
                    .withUniform("u_radius", UniformType.UNIFORM_BUFFER)
                    .withUniform("u_glowColor", UniformType.UNIFORM_BUFFER)
                    .withUniform("u_intensity", UniformType.UNIFORM_BUFFER)
                    .withUniform("u_flame", UniformType.UNIFORM_BUFFER)
                    .withoutBlend()
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .build();

            glowCompositePipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "handglow_composite"))
                    .withVertexShader("core/screenquad")
                    .withFragmentShader("core/blit_screen")
                    .withSampler("InSampler")
                    .withBlend(BlendFunction.ADDITIVE)
                    .withDepthWrite(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withVertexFormat(VertexFormats.EMPTY, VertexFormat.DrawMode.TRIANGLES)
                    .build();

            // Native load via game resource pack
            // device.precompilePipeline(...) removed

            // Uniform GPU buffers (allocate 16 B each to keep alignment happy)
            resolutionBuffer = device.createBuffer(() -> "handglow_resolution", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            radiusBuffer = device.createBuffer(() -> "handglow_radius", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            colorBuffer = device.createBuffer(() -> "handglow_color", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            intensityBuffer = device.createBuffer(() -> "handglow_intensity", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            flameBuffer = device.createBuffer(() -> "handglow_flame", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);

            if (w > 0 && h > 0) {
                resize(w, h);
            }

            initialized = true;
            NexisClient.LOGGER.info("HandGlowRenderer initialized (Blaze3D pipeline + SimpleFramebuffer)");
        } catch (Exception e) {
            NexisClient.LOGGER.error("Failed to init HandGlowRenderer", e);
            shutdown();
        }
    }

    private static void resizeIfNeeded() {
        MinecraftClient mc = MinecraftClient.getInstance();
        int w = mc.getWindow().getFramebufferWidth();
        int h = mc.getWindow().getFramebufferHeight();
        if (w <= 0 || h <= 0) return;
        if (fbW == w && fbH == h) return;
        resize(w, h);
    }

    private static void resize(int w, int h) {
        fbW = w;
        fbH = h;
        glowW = Math.max(1, Math.round(w * GLOW_BUFFER_SCALE));
        glowH = Math.max(1, Math.round(h * GLOW_BUFFER_SCALE));
        if (handFbo != null) safeDeleteFramebuffer(handFbo);
        if (blurFbo != null) safeDeleteFramebuffer(blurFbo);
        if (glowFbo != null) safeDeleteFramebuffer(glowFbo);
        handFbo = new SimpleFramebuffer("hand_glow", w, h, true);
        blurFbo = new SimpleFramebuffer("hand_glow_blur", glowW, glowH, false);
        glowFbo = new SimpleFramebuffer("hand_glow_composite", glowW, glowH, false);
        uniformsDirty = true;
    }

    public static void shutdown() {
        if (!initialized) return;
        if (handFbo != null) safeDeleteFramebuffer(handFbo);
        if (blurFbo != null) safeDeleteFramebuffer(blurFbo);
        if (glowFbo != null) safeDeleteFramebuffer(glowFbo);
        if (vertexBuffer != null) vertexBuffer.close();
        if (sampler != null) sampler.close();
        if (resolutionBuffer != null) resolutionBuffer.close();
        if (radiusBuffer != null) radiusBuffer.close();
        if (colorBuffer != null) colorBuffer.close();
        if (intensityBuffer != null) intensityBuffer.close();
        if (flameBuffer != null) flameBuffer.close();
        initialized = false;
        needsPost = false;
        uniformsDirty = true;
        lastUniformW = -1;
        lastUniformH = -1;
    }

    /**
     * Explicitly close GpuTexture attachments before deleting the FBO to prevent GPU memory leaks.
     */
    private static void safeDeleteFramebuffer(SimpleFramebuffer fb) {
        if (fb == null) return;
        if (fb.getColorAttachment() != null) fb.getColorAttachment().close();
        if (fb.getDepthAttachment() != null) fb.getDepthAttachment().close();
        fb.delete();
    }
}






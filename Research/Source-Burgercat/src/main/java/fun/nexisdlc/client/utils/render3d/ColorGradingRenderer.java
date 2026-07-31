package fun.nexisdlc.client.utils.render3d;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.Std140Builder;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.AddressMode;
import com.mojang.blaze3d.textures.FilterMode;
import net.minecraft.client.gl.GpuSampler;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import fun.nexisdlc.NexisClient;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gl.SimpleFramebuffer;
import net.minecraft.client.gl.UniformType;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;
import org.lwjgl.system.MemoryStack;

import java.nio.ByteBuffer;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class ColorGradingRenderer {

    private static boolean initialized = false;

    private static SimpleFramebuffer offscreenFbo;
    private static GpuBuffer vertexBuffer;
    private static GpuSampler sampler;

    private static RenderPipeline capturePipeline;
    private static RenderPipeline colorgradingPipeline;

    private static GpuBuffer resolutionBuffer;
    private static GpuBuffer saturationBuffer;
    private static GpuBuffer warmthBuffer;

    private static int lastFbW = -1;
    private static int lastFbH = -1;
    private static float lastSaturation = Float.NaN;
    private static float lastWarmth = Float.NaN;

    public static void applyColorGrading(float saturation, float warmth) {
        MinecraftClient mc = MinecraftClient.getInstance();
        int w = mc.getWindow().getFramebufferWidth();
        int h = mc.getWindow().getFramebufferHeight();
        if (w <= 0 || h <= 0) return;

        if (!initialized) init();
        if (!initialized) return;

        if (lastFbW != w || lastFbH != h) resize(w, h);

        GpuDevice device = RenderSystem.getDevice();
        CommandEncoder encoder = device.createCommandEncoder();

        writeUniformsIfNeeded(encoder, w, h, saturation, warmth);

        // Step 1: Capture current main framebuffer to offscreen FBO
        try (RenderPass pass = encoder.createRenderPass(
                () -> "colorgrading_capture",
                offscreenFbo.getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(capturePipeline);
            pass.bindTexture("InSampler", mc.getFramebuffer().getColorAttachmentView(), sampler);
            RenderSystem.bindDefaultUniforms(pass);
            pass.draw(0, 3);
        }

        // Step 2: Apply color grading from offscreen back to main framebuffer
        try (RenderPass pass = encoder.createRenderPass(
                () -> "colorgrading_apply",
                mc.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(colorgradingPipeline);
            pass.bindTexture("u_texture", offscreenFbo.getColorAttachmentView(), sampler);
            pass.setUniform("uResolution", resolutionBuffer.slice());
            pass.setUniform("uSaturation", saturationBuffer.slice());
            pass.setUniform("uWarmth", warmthBuffer.slice());
            pass.setVertexBuffer(0, vertexBuffer);
            pass.draw(0, 3);
        }
    }

    private static void init() {
        if (initialized) return;
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            GpuDevice device = RenderSystem.getDevice();

            VertexFormat format = VertexFormat.builder()
                    .add("Position", VertexFormatElement.POSITION)
                    .build();

            try (MemoryStack stack = MemoryStack.stackPush()) {
                ByteBuffer buf = stack.malloc(3 * 3 * Float.BYTES);
                buf.asFloatBuffer()
                        .put(-1f).put(-1f).put(0f)
                        .put(3f).put(-1f).put(0f)
                        .put(-1f).put(3f).put(0f);
                vertexBuffer = format.uploadImmediateVertexBuffer(buf);
            }

            sampler = device.createSampler(
                    AddressMode.CLAMP_TO_EDGE,
                    AddressMode.CLAMP_TO_EDGE,
                    FilterMode.LINEAR,
                    FilterMode.LINEAR,
                    1,
                    OptionalDouble.empty()
            );

            capturePipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "colorgrading_capture"))
                    .withVertexShader("core/screenquad")
                    .withFragmentShader("core/blit_screen")
                    .withSampler("InSampler")
                    .withoutBlend()
                    .withDepthWrite(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withVertexFormat(VertexFormats.EMPTY, VertexFormat.DrawMode.TRIANGLES)
                    .build();

            colorgradingPipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "colorgrading"))
                    .withVertexShader(Identifier.of("nexis", "core/colorgrading"))
                    .withFragmentShader(Identifier.of("nexis", "core/colorgrading"))
                    .withVertexFormat(format, VertexFormat.DrawMode.TRIANGLES)
                    .withSampler("u_texture")
                    .withUniform("uResolution", UniformType.UNIFORM_BUFFER)
                    .withUniform("uSaturation", UniformType.UNIFORM_BUFFER)
                    .withUniform("uWarmth", UniformType.UNIFORM_BUFFER)
                    .withoutBlend()
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .build();

            resolutionBuffer = device.createBuffer(() -> "colorgrading_resolution", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            saturationBuffer = device.createBuffer(() -> "colorgrading_saturation", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);
            warmthBuffer = device.createBuffer(() -> "colorgrading_warmth", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 16L);

            int w = mc.getWindow().getFramebufferWidth();
            int h = mc.getWindow().getFramebufferHeight();
            if (w > 0 && h > 0) {
                offscreenFbo = new SimpleFramebuffer("colorgrading_offscreen", w, h, false);
                lastFbW = w;
                lastFbH = h;
            }

            initialized = true;
            NexisClient.LOGGER.info("ColorGradingRenderer initialized");
        } catch (Exception e) {
            NexisClient.LOGGER.error("Failed to init ColorGradingRenderer", e);
            shutdown();
        }
    }

    private static void writeUniformsIfNeeded(CommandEncoder encoder, int w, int h, float saturation, float warmth) {
        if (lastFbW == w && lastFbH == h
                && closeEnough(lastSaturation, saturation)
                && closeEnough(lastWarmth, warmth)) {
            return;
        }
        writeUniforms(encoder, w, h, saturation, warmth);
        lastFbW = w;
        lastFbH = h;
        lastSaturation = saturation;
        lastWarmth = warmth;
    }

    private static boolean closeEnough(float a, float b) {
        return Math.abs(a - b) < 0.0005f;
    }

    private static void writeUniforms(CommandEncoder encoder, int w, int h, float saturation, float warmth) {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buf = Std140Builder.onStack(stack, 16)
                    .putVec2(w, h)
                    .get();
            encoder.writeToBuffer(resolutionBuffer.slice(), buf);

            buf = Std140Builder.onStack(stack, 16)
                    .putFloat(saturation)
                    .get();
            encoder.writeToBuffer(saturationBuffer.slice(), buf);

            buf = Std140Builder.onStack(stack, 16)
                    .putFloat(warmth)
                    .get();
            encoder.writeToBuffer(warmthBuffer.slice(), buf);
        }
    }

    private static void resize(int w, int h) {
        if (offscreenFbo != null) {
            if (offscreenFbo.getColorAttachment() != null) offscreenFbo.getColorAttachment().close();
            if (offscreenFbo.getDepthAttachment() != null) offscreenFbo.getDepthAttachment().close();
            offscreenFbo.delete();
        }
        offscreenFbo = new SimpleFramebuffer("colorgrading_offscreen", w, h, false);
    }

    public static void shutdown() {
        if (!initialized) return;
        if (offscreenFbo != null) {
            if (offscreenFbo.getColorAttachment() != null) offscreenFbo.getColorAttachment().close();
            if (offscreenFbo.getDepthAttachment() != null) offscreenFbo.getDepthAttachment().close();
            offscreenFbo.delete();
            offscreenFbo = null;
        }
        if (vertexBuffer != null) {
            vertexBuffer.close();
            vertexBuffer = null;
        }
        if (sampler != null) {
            sampler.close();
            sampler = null;
        }
        if (resolutionBuffer != null) {
            resolutionBuffer.close();
            resolutionBuffer = null;
        }
        if (saturationBuffer != null) {
            saturationBuffer.close();
            saturationBuffer = null;
        }
        if (warmthBuffer != null) {
            warmthBuffer.close();
            warmthBuffer = null;
        }
        initialized = false;
        lastFbW = -1;
        lastFbH = -1;
        lastSaturation = Float.NaN;
        lastWarmth = Float.NaN;
    }
}

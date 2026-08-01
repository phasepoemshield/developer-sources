package fun.nexisdlc.client.utils.render3d;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.pipeline.*;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.GpuDevice;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.*;
import com.mojang.blaze3d.vertex.VertexFormat;
import fun.nexisdlc.NexisClient;
import fun.nexisdlc.modules.impl.render.ShaderHands;
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

public class ShaderHandsRenderer {
    private static boolean initialized = false;
    private static int fbW, fbH;

    private static SimpleFramebuffer handFbo;
    private static GpuSampler sampler;
    private static RenderPipeline blitPipeline;
    private static RenderPipeline compositePipeline;
    private static GpuBuffer dataBuffer;
    private static boolean needsPost = false;

    public static void preHandCapture() {
        needsPost = false;
        if (!initialized) init();
        if (!initialized) return;

        resizeIfNeeded();
        RenderSystem.outputColorTextureOverride = handFbo.getColorAttachmentView();
        RenderSystem.outputDepthTextureOverride = handFbo.getDepthAttachmentView();

        CommandEncoder encoder = RenderSystem.getDevice().createCommandEncoder();
        encoder.clearColorAndDepthTextures(
                handFbo.getColorAttachment(), 0,
                handFbo.getDepthAttachment(), 1.0
        );
    }

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

    public static boolean needsPost() {
        return needsPost;
    }

    public static void resetOverrides() {
        RenderSystem.outputColorTextureOverride = null;
        RenderSystem.outputDepthTextureOverride = null;
    }

    public static void postHandsRender(ShaderHands shaderHands) {
        if (!initialized || !needsPost || shaderHands == null || !shaderHands.isState()) return;
        needsPost = false;

        MinecraftClient mc = MinecraftClient.getInstance();
        int w = mc.getWindow().getFramebufferWidth();
        int h = mc.getWindow().getFramebufferHeight();
        if (w <= 0 || h <= 0) return;
        if (fbW != w || fbH != h) resize(w, h);

        CommandEncoder encoder = RenderSystem.getDevice().createCommandEncoder();
        writeData(encoder, shaderHands, w, h);

        try (RenderPass pass = encoder.createRenderPass(
                () -> "shaderhands_composite",
                mc.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(compositePipeline);
            pass.bindTexture("InSampler", handFbo.getColorAttachmentView(), sampler);
            pass.setUniform("ShaderHandsData", dataBuffer.slice());
            RenderSystem.bindDefaultUniforms(pass);
            pass.draw(0, 3);
        }
    }

    private static void copyHandsBack() {
        if (!initialized) return;
        resizeIfNeeded();

        MinecraftClient mc = MinecraftClient.getInstance();
        CommandEncoder encoder = RenderSystem.getDevice().createCommandEncoder();
        try (RenderPass pass = encoder.createRenderPass(
                () -> "shaderhands_copyback",
                mc.getFramebuffer().getColorAttachmentView(),
                OptionalInt.empty())) {
            pass.setPipeline(blitPipeline);
            pass.bindTexture("InSampler", handFbo.getColorAttachmentView(), sampler);
            RenderSystem.bindDefaultUniforms(pass);
            pass.draw(0, 3);
        }
    }

    private static void writeData(CommandEncoder encoder, ShaderHands shaderHands, int w, int h) {
        int color = shaderHands.isFlatMode() ? shaderHands.getRenderColor() : shaderHands.getBaseColor();
        try (MemoryStack stack = MemoryStack.stackPush()) {
            ByteBuffer buf = stack.malloc(80);
            buf.putFloat(w);
            buf.putFloat(h);
            buf.putFloat(0.0f);
            buf.putFloat(0.0f);
            buf.putFloat(((color >> 16) & 0xFF) / 255.0f);
            buf.putFloat(((color >> 8) & 0xFF) / 255.0f);
            buf.putFloat((color & 0xFF) / 255.0f);
            buf.putFloat(((color >> 24) & 0xFF) / 255.0f);
            buf.putFloat(shaderHands.getModeIndex());
            buf.putFloat(shaderHands.getFlatOutlineAlpha());
            buf.putFloat((System.nanoTime() % 1_000_000_000_000L) / 1_000_000_000.0f);
            buf.putFloat(shaderHands.getShaderSpeed());
            buf.putFloat(shaderHands.getShaderIntensity());
            buf.putFloat(shaderHands.isFill() ? 1.0f : 0.0f);
            buf.putFloat(shaderHands.getDistortion());
            buf.putFloat(shaderHands.getFirePower());
            buf.putFloat(shaderHands.getFireAlpha());
            buf.putFloat(0.0f);
            buf.putFloat(0.0f);
            buf.putFloat(0.0f);
            buf.flip();
            encoder.writeToBuffer(dataBuffer.slice(), buf);
        }
    }

    private static void init() {
        if (initialized) return;
        try {
            MinecraftClient mc = MinecraftClient.getInstance();
            int w = mc.getWindow().getFramebufferWidth();
            int h = mc.getWindow().getFramebufferHeight();
            GpuDevice device = RenderSystem.getDevice();

            sampler = device.createSampler(
                    AddressMode.CLAMP_TO_EDGE,
                    AddressMode.CLAMP_TO_EDGE,
                    FilterMode.LINEAR,
                    FilterMode.LINEAR,
                    1,
                    OptionalDouble.empty()
            );

            blitPipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "shaderhands_blit"))
                    .withVertexShader("core/screenquad")
                    .withFragmentShader("core/blit_screen")
                    .withSampler("InSampler")
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .withDepthWrite(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withVertexFormat(VertexFormats.EMPTY, VertexFormat.DrawMode.TRIANGLES)
                    .build();

            compositePipeline = RenderPipeline.builder()
                    .withLocation(Identifier.of("nexis", "shaderhands_composite"))
                    .withVertexShader(Identifier.of("nexis", "core/shaderhands_composite"))
                    .withFragmentShader(Identifier.of("nexis", "core/shaderhands_composite"))
                    .withSampler("InSampler")
                    .withUniform("ShaderHandsData", UniformType.UNIFORM_BUFFER)
                    .withBlend(BlendFunction.TRANSLUCENT)
                    .withDepthWrite(false)
                    .withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST)
                    .withVertexFormat(VertexFormats.EMPTY, VertexFormat.DrawMode.TRIANGLES)
                    .build();

            dataBuffer = device.createBuffer(() -> "shaderhands_data", GpuBuffer.USAGE_UNIFORM | GpuBuffer.USAGE_COPY_DST, 80L);
            if (w > 0 && h > 0) resize(w, h);
            initialized = true;
            NexisClient.LOGGER.info("ShaderHandsRenderer initialized");
        } catch (Exception e) {
            NexisClient.LOGGER.error("Failed to init ShaderHandsRenderer", e);
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
        if (handFbo != null) safeDeleteFramebuffer(handFbo);
        handFbo = new SimpleFramebuffer("shader_hands", w, h, true);
    }

    public static void shutdown() {
        if (handFbo != null) safeDeleteFramebuffer(handFbo);
        if (sampler != null) sampler.close();
        if (dataBuffer != null) dataBuffer.close();
        initialized = false;
        needsPost = false;
    }

    private static void safeDeleteFramebuffer(SimpleFramebuffer fb) {
        if (fb == null) return;
        if (fb.getColorAttachment() != null) fb.getColorAttachment().close();
        if (fb.getDepthAttachment() != null) fb.getDepthAttachment().close();
        fb.delete();
    }
}

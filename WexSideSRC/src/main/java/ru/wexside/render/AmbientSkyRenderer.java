/*
 * Recovered ambient sky renderer (Shader mode of Ambient module).
 * Pass 1 renders the procedural sky shader into an offscreen target,
 * pass 2 composites it over the scene with premultiplied source-over blending.
 */
package ru.wexside.render;

import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.buffers.GpuBufferSlice;
import com.mojang.blaze3d.buffers.Std140Builder;
import com.mojang.blaze3d.systems.CommandEncoder;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.textures.FilterMode;
import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.textures.TextureFormat;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.OptionalInt;
import java.util.concurrent.atomic.AtomicBoolean;
import net.minecraft.class_276;
import net.minecraft.class_310;
import org.joml.Matrix4f;
import org.lwjgl.system.MemoryStack;
import ru.wexside.WexSideClient;
import ru.wexside.module.render.AmbientModule;

public final class AmbientSkyRenderer {
    private static final int UBO_SIZE = 112;
    private static final int TEXTURE_USAGE = 13;
    private static final AtomicBoolean ERROR_REPORTED = new AtomicBoolean();
    private static AmbientSkyRenderer instance;
    private GpuBuffer uniformBuffer;
    private GpuBufferSlice uniformSlice;
    private GpuBuffer quadBuffer;
    private GpuTexture skyTexture;
    private GpuTextureView skyView;
    private int skyWidth;
    private int skyHeight;
    private float animationTime;
    private long lastFrameNanos;

    private AmbientSkyRenderer() {
    }

    public static void render() {
        if (!AmbientModule.isEnabled()) {
            return;
        }
        class_310 client = class_310.method_1551();
        class_276 framebuffer = client.method_1522();
        if (framebuffer == null || framebuffer.method_71639() == null || framebuffer.method_71640() == null) {
            return;
        }
        int width = framebuffer.field_1482;
        int height = framebuffer.field_1481;
        if (width <= 0 || height <= 0) {
            return;
        }
        AmbientSkyRenderer renderer = instance;
        if (renderer == null) {
            renderer = new AmbientSkyRenderer();
            instance = renderer;
        }
        try {
            renderer.advanceAnimation();
            renderer.ensureBuffers();
            renderer.ensureSkyTarget(width, height);
            renderer.draw(framebuffer, width, height);
        }
        catch (Throwable throwable) {
            if (!ERROR_REPORTED.compareAndSet(false, true)) {
                return;
            }
            Throwable cause = throwable.getCause() != null ? throwable.getCause() : throwable;
            WexSideClient.getInstance().getLogger().warn("Ambient sky render failed: {}", (Object)String.valueOf(cause));
        }
    }

    private void advanceAnimation() {
        long now = System.nanoTime();
        if (this.lastFrameNanos != 0L) {
            float delta = (float)(now - this.lastFrameNanos) / 1.0E9f;
            this.animationTime += delta * AmbientModule.getSkySpeed();
        }
        this.lastFrameNanos = now;
    }

    private void ensureBuffers() {
        if (this.uniformBuffer == null) {
            this.uniformBuffer = RenderSystem.getDevice().createBuffer(() -> "wex/ambient-sky-ubo", 136, (long)UBO_SIZE);
            this.uniformSlice = this.uniformBuffer.slice();
        }
        if (this.quadBuffer == null) {
            ByteBuffer vertices = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder());
            vertices.putFloat(-1.0f).putFloat(-1.0f).putFloat(0.0f);
            vertices.putFloat(1.0f).putFloat(-1.0f).putFloat(0.0f);
            vertices.putFloat(1.0f).putFloat(1.0f).putFloat(0.0f);
            vertices.putFloat(-1.0f).putFloat(1.0f).putFloat(0.0f);
            vertices.flip();
            this.quadBuffer = RenderSystem.getDevice().createBuffer(() -> "wex/ambient-sky-quad", 32, vertices);
        }
    }

    private void ensureSkyTarget(int width, int height) {
        if (this.skyTexture != null && this.skyWidth == width && this.skyHeight == height) {
            return;
        }
        this.releaseSkyTarget();
        this.skyTexture = RenderSystem.getDevice().createTexture(() -> "wex/ambient-sky", 13, TextureFormat.RGBA8, width, height, 1, 1);
        this.skyView = RenderSystem.getDevice().createTextureView(this.skyTexture);
        this.skyWidth = width;
        this.skyHeight = height;
    }

    private void draw(class_276 framebuffer, int width, int height) {
        CommandEncoder commandEncoder = RenderSystem.getDevice().createCommandEncoder();
        this.uploadUniforms(commandEncoder, width, height);
        RenderSystem.class_5590 sequentialBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382);
        GpuBuffer indexBuffer = sequentialBuffer.method_68274(6);
        try (RenderPass skyPass = commandEncoder.createRenderPass(() -> "wex/ambient-sky", this.skyView, OptionalInt.of(0));){
            skyPass.setPipeline(ClientRenderPipelines.AMBIENT_SKY);
            RenderSystem.bindDefaultUniforms((RenderPass)skyPass);
            skyPass.setUniform("AmbientSkyData", this.uniformSlice);
            skyPass.setVertexBuffer(0, this.quadBuffer);
            skyPass.setIndexBuffer(indexBuffer, sequentialBuffer.method_31924());
            skyPass.bindTexture("DepthSampler", framebuffer.method_71640(), RenderSystem.getSamplerCache().method_75294(FilterMode.NEAREST));
            skyPass.drawIndexed(0, 0, 6, 1);
        }
        try (RenderPass compositePass = commandEncoder.createRenderPass(() -> "wex/ambient-sky-composite", framebuffer.method_71639(), OptionalInt.empty());){
            compositePass.setPipeline(ClientRenderPipelines.AMBIENT_SKY_COMPOSITE);
            RenderSystem.bindDefaultUniforms((RenderPass)compositePass);
            compositePass.setVertexBuffer(0, this.quadBuffer);
            compositePass.setIndexBuffer(indexBuffer, sequentialBuffer.method_31924());
            compositePass.bindTexture("SkySampler", this.skyView, RenderSystem.getSamplerCache().method_75294(FilterMode.LINEAR));
            compositePass.drawIndexed(0, 0, 6, 1);
        }
    }

    private void uploadUniforms(CommandEncoder commandEncoder, int width, int height) {
        Matrix4f view = RenderFrameState.viewMatrix;
        Matrix4f projection = RenderFrameState.projectionMatrix;
        float tanHalfFov = Math.abs(projection.m11()) > 1.0E-4f ? 1.0f / projection.m11() : 1.0f;
        int colorCount = AmbientModule.getSkyColorCount();
        try (MemoryStack memoryStack = MemoryStack.stackPush();){
            Std140Builder builder = Std140Builder.onStack((MemoryStack)memoryStack, (int)UBO_SIZE)
                .putVec4((float)width, (float)height, this.animationTime, (float)AmbientModule.getShaderIndex())
                .putVec4(this.colorComponent(AmbientModule.getSkyColor(0), 16), this.colorComponent(AmbientModule.getSkyColor(0), 8), this.colorComponent(AmbientModule.getSkyColor(0), 0), 1.0f)
                .putVec4(this.colorComponent(AmbientModule.getSkyColor(1), 16), this.colorComponent(AmbientModule.getSkyColor(1), 8), this.colorComponent(AmbientModule.getSkyColor(1), 0), 1.0f)
                .putVec4(colorCount > 1 ? 1.0f : 0.0f, AmbientModule.getSkyIntensity(), tanHalfFov, 0.0f)
                .putVec4(view.m00(), view.m10(), view.m20(), 0.0f)
                .putVec4(view.m01(), view.m11(), view.m21(), 0.0f)
                .putVec4(-view.m02(), -view.m12(), -view.m22(), 0.0f);
            commandEncoder.writeToBuffer(this.uniformSlice, builder.get());
        }
    }

    private float colorComponent(int argb, int shift) {
        return (float)(argb >> shift & 0xFF) / 255.0f;
    }

    private void releaseSkyTarget() {
        if (this.skyView != null) {
            this.skyView.close();
            this.skyView = null;
        }
        if (this.skyTexture != null) {
            this.skyTexture.close();
            this.skyTexture = null;
        }
        this.skyWidth = 0;
        this.skyHeight = 0;
    }
}

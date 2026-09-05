/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.buffers.GpuBuffer
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.systems.RenderPass
 *  com.mojang.blaze3d.systems.RenderSystem
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.program.Program
 *  net.irisshaders.iris.gl.program.ProgramBuilder
 *  net.irisshaders.iris.gl.program.ProgramSamplers
 *  net.irisshaders.iris.gl.program.ProgramUniforms
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.texture.DepthCopyStrategy
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.pipeline.CompositeRenderer
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms
 *  net.irisshaders.iris.uniforms.SystemTimeUniforms$Timer
 *  org.apache.commons.io.IOUtils
 *  org.joml.Matrix4f
 */
package net.irisshaders.iris.pathways;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.OptionalInt;
import java.util.function.IntSupplier;
import minecraft.class06202;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.gl.program.ProgramBuilder;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.pathways.CenterDepthSampler$1;
import net.irisshaders.iris.pathways.FullScreenQuadRenderer;
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.uniforms.SystemTimeUniforms;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;

public class CenterDepthSampler {
    private static final double LN2 = Math.log(2.0);
    private static final CustomPass EMPTY_STATE = new CenterDepthSampler$1();
    private final Program program;
    private final GlFramebuffer framebuffer;
    private final int texture = GlStateManager._genTexture();
    private final int altTexture = GlStateManager._genTexture();
    private boolean hasFirstSample;
    private boolean everRetrieved;
    private boolean destroyed;

    public CenterDepthSampler(IntSupplier intSupplier, float f) {
        ProgramBuilder programBuilder;
        this.framebuffer = new GlFramebuffer();
        InternalTextureFormat internalTextureFormat = InternalTextureFormat.R32F;
        this.setupColorTexture(this.texture, internalTextureFormat);
        this.setupColorTexture(this.altTexture, internalTextureFormat);
        GlStateManager._bindTexture((int)0);
        this.framebuffer.addColorAttachment(0, this.texture);
        try {
            String string = new String(IOUtils.toByteArray((InputStream)Objects.requireNonNull(this.getClass().getResourceAsStream("/centerDepth.fsh"))), StandardCharsets.UTF_8);
            String string2 = new String(IOUtils.toByteArray((InputStream)Objects.requireNonNull(this.getClass().getResourceAsStream("/centerDepth.vsh"))), StandardCharsets.UTF_8);
            programBuilder = ProgramBuilder.begin((String)"centerDepthSmooth", (String)string2, null, (String)string, (ImmutableSet)ImmutableSet.of((Object)0, (Object)1, (Object)2));
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        programBuilder.addDynamicSampler(intSupplier, GlSampler.NEAREST, new String[]{"depth"});
        programBuilder.addDynamicSampler(() -> this.altTexture, GlSampler.NEAREST, new String[]{"altDepth"});
        programBuilder.uniform1f(UniformUpdateFrequency.PER_FRAME, "lastFrameTime", () -> ((SystemTimeUniforms.Timer)SystemTimeUniforms.TIMER).getLastFrameTime());
        programBuilder.uniform1f(UniformUpdateFrequency.ONCE, "decay", () -> 1.0 / ((double)f * 0.1 / LN2));
        programBuilder.uniformMatrix(UniformUpdateFrequency.ONCE, "projection", () -> new Matrix4f(2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f));
        this.program = programBuilder.build();
    }

    public void destroy() {
        GlStateManager._deleteTexture((int)this.texture);
        GlStateManager._deleteTexture((int)this.altTexture);
        this.framebuffer.destroy();
        this.program.destroy();
        this.destroyed = true;
    }

    public void setupColorTexture(int n, InternalTextureFormat internalTextureFormat) {
        IrisRenderSystem.texImage2D((int)n, (int)3553, (int)0, (int)internalTextureFormat.getGlFormat(), (int)1, (int)1, (int)0, (int)internalTextureFormat.getPixelFormat().getGlFormat(), (int)PixelType.FLOAT.getGlFormat(), null);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)9729);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10240, (int)9729);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10242, (int)33071);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10243, (int)33071);
    }

    public void sampleCenterDepth() {
        if (this.hasFirstSample && !this.everRetrieved || this.destroyed) {
            return;
        }
        this.hasFirstSample = true;
        GpuBuffer gpuBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(6);
        VertexFormat.class_5595 class_55952 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_31924();
        BlendModeOverride.restore();
        GlStateManager._disableBlend();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "centerDepthSmooth sampler", class06202.Nq().e().u(), OptionalInt.empty());){
            renderPass.setPipeline(CompositeRenderer.COMPOSITE_PIPELINE);
            renderPass.setIndexBuffer(gpuBuffer, class_55952);
            renderPass.setVertexBuffer(0, FullScreenQuadRenderer.INSTANCE.getQuad());
            renderPass.iris$setCustomPass(EMPTY_STATE);
            this.framebuffer.bind();
            this.program.use();
            GlStateManager._viewport((int)0, (int)0, (int)1, (int)1);
            renderPass.drawIndexed(0, 0, 6, 1);
            ProgramUniforms.clearActiveUniforms();
            ProgramSamplers.clearActiveSamplers();
            BlendModeOverride.restore();
        }
        DepthCopyStrategy.fastest((boolean)false).copy(this.framebuffer, this.texture, null, this.altTexture, 1, 1);
    }

    public int getCenterDepthTexture() {
        return this.altTexture;
    }

    public void setUsage(boolean bl) {
        this.everRetrieved |= bl;
    }
}


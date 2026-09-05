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
 *  minecraft.class08893
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.program.Program
 *  net.irisshaders.iris.gl.program.ProgramBuilder
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.helpers.StringPair
 *  net.irisshaders.iris.pipeline.CompositeRenderer
 *  net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor
 *  org.apache.commons.io.IOUtils
 *  org.joml.Matrix4f
 */
package net.irisshaders.iris.pathways.colorspace;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.buffers.GpuBuffer;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.systems.RenderPass;
import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Objects;
import java.util.OptionalInt;
import minecraft.class06202;
import minecraft.class08893;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.gl.program.ProgramBuilder;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.helpers.StringPair;
import net.irisshaders.iris.mixinterface.CustomPass;
import net.irisshaders.iris.pathways.FullScreenQuadRenderer;
import net.irisshaders.iris.pathways.colorspace.ColorSpace;
import net.irisshaders.iris.pathways.colorspace.ColorSpaceConverter;
import net.irisshaders.iris.pathways.colorspace.ColorSpaceFragmentConverter$1;
import net.irisshaders.iris.pipeline.CompositeRenderer;
import net.irisshaders.iris.shaderpack.preprocessor.JcppProcessor;
import org.apache.commons.io.IOUtils;
import org.joml.Matrix4f;

public class ColorSpaceFragmentConverter
implements ColorSpaceConverter {
    private static final CustomPass EMPTY = new ColorSpaceFragmentConverter$1();
    private int width;
    private int height;
    private ColorSpace colorSpace;
    private Program program;
    private GlFramebuffer framebuffer;
    private int swapTexture;
    private class08893 target;

    public ColorSpaceFragmentConverter(int n, int n2, ColorSpace colorSpace) {
        this.rebuildProgram(n, n2, colorSpace);
    }

    @Override
    public void process(class08893 class088932) {
        if (this.colorSpace == ColorSpace.SRGB) {
            return;
        }
        this.target = class088932;
        GpuBuffer gpuBuffer = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_68274(6);
        VertexFormat.class_5595 class_55952 = RenderSystem.getSequentialBuffer((VertexFormat.class_5596)VertexFormat.class_5596.field_27382).method_31924();
        try (RenderPass renderPass = RenderSystem.getDevice().createCommandEncoder().createRenderPass(() -> "Color space", class06202.Nq().e().u(), OptionalInt.empty());){
            renderPass.setPipeline(CompositeRenderer.COMPOSITE_PIPELINE);
            renderPass.iris$setCustomPass(EMPTY);
            this.program.use();
            this.framebuffer.bind();
            renderPass.setIndexBuffer(gpuBuffer, class_55952);
            renderPass.setVertexBuffer(0, FullScreenQuadRenderer.INSTANCE.getQuad());
            renderPass.drawIndexed(0, 0, 6, 1);
        }
        Program.unbind();
        this.framebuffer.bindAsReadBuffer();
        IrisRenderSystem.copyTexSubImage2D((int)class088932.N(), (int)3553, (int)0, (int)0, (int)0, (int)0, (int)0, (int)this.width, (int)this.height);
    }

    @Override
    public void rebuildProgram(int n, int n2, ColorSpace colorSpace) {
        String string;
        String string2;
        if (this.program != null) {
            this.program.destroy();
            this.program = null;
            this.framebuffer.destroy();
            this.framebuffer = null;
            GlStateManager._deleteTexture((int)this.swapTexture);
            this.swapTexture = 0;
        }
        this.width = n;
        this.height = n2;
        this.colorSpace = colorSpace;
        try {
            string2 = new String(IOUtils.toByteArray((InputStream)Objects.requireNonNull(this.getClass().getResourceAsStream("/colorSpace.vsh"))), StandardCharsets.UTF_8);
            string = new String(IOUtils.toByteArray((InputStream)Objects.requireNonNull(this.getClass().getResourceAsStream("/colorSpace.csh"))), StandardCharsets.UTF_8);
        }
        catch (IOException iOException) {
            throw new RuntimeException(iOException);
        }
        ArrayList<StringPair> arrayList = new ArrayList<StringPair>();
        arrayList.add(new StringPair("CURRENT_COLOR_SPACE", String.valueOf(colorSpace.ordinal())));
        for (ColorSpace colorSpace2 : ColorSpace.values()) {
            arrayList.add(new StringPair(colorSpace2.name(), String.valueOf(colorSpace2.ordinal())));
        }
        string = JcppProcessor.glslPreprocessSource((String)string, arrayList);
        ProgramBuilder programBuilder = ProgramBuilder.begin((String)"colorSpaceFragment", (String)string2, null, (String)string, (ImmutableSet)ImmutableSet.of());
        programBuilder.uniformMatrix(UniformUpdateFrequency.ONCE, "projection", () -> new Matrix4f(2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f));
        programBuilder.addDynamicSampler(() -> this.target.N(), GlSampler.NEAREST, new String[]{"readImage"});
        this.swapTexture = GlStateManager._genTexture();
        IrisRenderSystem.texImage2D((int)this.swapTexture, (int)3553, (int)0, (int)32856, (int)n, (int)n2, (int)0, (int)6408, (int)5121, null);
        this.framebuffer = new GlFramebuffer();
        this.framebuffer.addColorAttachment(0, this.swapTexture);
        this.program = programBuilder.build();
    }
}


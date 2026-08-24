/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.textures.GpuTexture
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  net.minecraft.client.gl.Framebuffer
 *  net.minecraft.client.texture.GlTexture
 *  net.minecraft.client.texture.GlTextureView
 *  org.joml.Vector2f
 */
package kotakbaz.rain.client.util.render.display;

import com.mojang.blaze3d.textures.GpuTexture;
import com.mojang.blaze3d.textures.GpuTextureView;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotakbaz.rain.client.render.main.ChromaRenderer;
import kotakbaz.rain.client.render.main.buffer.framebuffer.CustomFramebuffer;
import kotakbaz.rain.client.render.main.program.GlProgram;
import kotakbaz.rain.client.render.main.program.uniform.a;
import kotakbaz.rain.client.render.main.program.uniform.uniforms.sampler.SamplerUniform;
import kotakbaz.rain.client.render.main.vertex.DrawMode;
import kotakbaz.rain.client.render.main.vertex.format.VertexFormat;
import kotakbaz.rain.client.render.main.vertex.mesh.IMesh;
import kotakbaz.rain.client.render.main.vertex.mesh.MeshBuilder;
import kotakbaz.rain.client.util.render.engine.Renderable;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.texture.GlTexture;
import net.minecraft.client.texture.GlTextureView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.joml.Vector2f;
import oxxxde.\u062f\u0637;
import oxxxde.\u0630\u0621;
import oxxxde.\u0634\u0648;
import oxxxde.\u0636\u0643;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\n \t*\u0004\u0018\u00010\b0\bH\u0016\u00a2\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0003J\u000f\u0010\u0011\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\r\u0010\u001b\u001a\u00020\u000f\u00a2\u0006\u0004\b\u001b\u0010\u0003J7\u0010$\u001a\u00020\u000f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00162\u0006\u0010#\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\b&\u0010\u0003J\r\u0010'\u001a\u00020\u001e\u00a2\u0006\u0004\b'\u0010(J\r\u0010*\u001a\u00020)\u00a2\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u0012\u00a2\u0006\u0004\b,\u0010\u0014R\u0018\u0010-\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0018\u0010/\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00101\u001a\u0002008\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b1\u00102R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u0002008\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b9\u00102R\u0016\u0010:\u001a\u0002038\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b:\u00105R\u0016\u0010;\u001a\u0002068\u0002@\u0002X\u0082.\u00a2\u0006\u0006\n\u0004\b;\u00108R$\u0010>\u001a\u0012\u0012\u0004\u0012\u00020 0<j\b\u0012\u0004\u0012\u00020 `=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\u00168\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0018\u0010I\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010JR\u0016\u0010K\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bK\u0010AR\u0016\u0010L\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bL\u0010AR\u0016\u0010M\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bM\u0010N\u00a8\u0006O"}, d2={"Loxxxde/\u0627\u0652;", "Loxxxde/\u0637\u0621;", "<init>", "()V", "", "name", "()Ljava/lang/String;", "shader", "Loxxxde/\u0634\u0645;", "kotlin.jvm.PlatformType", "drawMode", "()Lkotakbaz/rain/client/render/main/vertex/DrawMode;", "Loxxxde/\u0633\u0627;", "vertexFormat", "()Lkotakbaz/rain/client/render/main/vertex/format/VertexFormat;", "", "load", "createPrograms", "", "hasValidWindowSize", "()Z", "checkResize", "", "width", "height", "createFramebuffers", "(II)V", "applyBlur", "Loxxxde/\u062e\u0631;", "program", "Lnet/minecraft/class_276;", "source", "Loxxxde/\u062c\u0651;", "destination", "pass", "maxPass", "applyBlurPass", "(Lkotakbaz/rain/client/render/main/program/GlProgram;Lnet/minecraft/class_276;Lkotakbaz/rain/client/render/main/buffer/framebuffer/CustomFramebuffer;II)V", "drawFullscreenQuad", "framebuffer", "()Lnet/minecraft/class_276;", "Lnet/minecraft/class_11391;", "texture", "()Lnet/minecraft/class_11391;", "hasFramebuffer", "downscaleProgram", "Loxxxde/\u062e\u0631;", "upscaleProgram", "Loxxxde/\u062f\u0637;", "downscaleTexelUniform", "Loxxxde/\u062f\u0637;", "Loxxxde/\u0630\u0621;", "downscaleOffsetUniform", "Loxxxde/\u0630\u0621;", "Loxxxde/\u062e\u0629;", "downscaleTextureUniform", "Loxxxde/\u062e\u0629;", "upscaleTexelUniform", "upscaleOffsetUniform", "upscaleTextureUniform", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fbos", "Ljava/util/ArrayList;", "blurPasses", "I", "", "offset", "F", "Lorg/joml/Vector2f;", "texelSize", "Lorg/joml/Vector2f;", "Loxxxde/\u0637\u0623;", "fullscreenMesh", "Loxxxde/\u0637\u0623;", "fullscreenWidth", "fullscreenHeight", "initialized", "Z", "rain-visuals"})
public final class KawaseRenderer
extends Renderable {
    private int fullscreenHeight = -1;
    @Nullable
    private IMesh fullscreenMesh;
    @NotNull
    private final ArrayList<CustomFramebuffer> fbos = new ArrayList();
    private \u0630\u0621 downscaleOffsetUniform;
    @Nullable
    private GlProgram downscaleProgram;
    private SamplerUniform downscaleTextureUniform;
    private \u0630\u0621 upscaleOffsetUniform;
    @Nullable
    private GlProgram upscaleProgram;
    private int fullscreenWidth = -1;
    private final int blurPasses;
    private \u062f\u0637 upscaleTexelUniform;
    private SamplerUniform upscaleTextureUniform;
    @NotNull
    private final Vector2f texelSize = new Vector2f();
    private \u062f\u0637 downscaleTexelUniform;
    private final float offset;
    private boolean initialized;

    @Override
    public DrawMode drawMode() {
        return DrawMode.QUADS;
    }

    @Override
    @NotNull
    public String name() {
        return "kawase";
    }

    private final void applyBlurPass(GlProgram program, Framebuffer source, CustomFramebuffer destination, int pass, int maxPass) {
        ChromaRenderer.disableBlend();
        destination.clearAllTextures();
        ChromaRenderer.bindFramebuffer(destination);
        this.setGlobalProgram(program);
        this.initMatrix();
        float texelSizeX = 1.0f / (float)source.textureWidth;
        float texelSizeY = 1.0f / (float)source.textureHeight;
        \u062f\u0637 texelUniform = null;
        \u0630\u0621 offsetUniform = null;
        SamplerUniform sampler = null;
        if (program == this.downscaleProgram) {
            \u062f\u0637 \u062f\u06372 = this.downscaleTexelUniform;
            if (\u062f\u06372 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downscaleTexelUniform");
                \u062f\u06372 = null;
            }
            texelUniform = \u062f\u06372;
            \u0630\u0621 \u0630\u06212 = this.downscaleOffsetUniform;
            if (\u0630\u06212 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downscaleOffsetUniform");
                \u0630\u06212 = null;
            }
            offsetUniform = \u0630\u06212;
            SamplerUniform samplerUniform = this.downscaleTextureUniform;
            if (samplerUniform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("downscaleTextureUniform");
                samplerUniform = null;
            }
            sampler = samplerUniform;
        } else {
            \u062f\u0637 \u062f\u06373 = this.upscaleTexelUniform;
            if (\u062f\u06373 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("upscaleTexelUniform");
                \u062f\u06373 = null;
            }
            texelUniform = \u062f\u06373;
            \u0630\u0621 \u0630\u06213 = this.upscaleOffsetUniform;
            if (\u0630\u06213 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("upscaleOffsetUniform");
                \u0630\u06213 = null;
            }
            offsetUniform = \u0630\u06213;
            SamplerUniform samplerUniform = this.upscaleTextureUniform;
            if (samplerUniform == null) {
                Intrinsics.throwUninitializedPropertyAccessException("upscaleTextureUniform");
                samplerUniform = null;
            }
            sampler = samplerUniform;
        }
        texelUniform.set(this.texelSize.set(texelSizeX, texelSizeY));
        offsetUniform.set(this.offset * 0.5f * ((float)pass / (float)maxPass));
        GpuTextureView gpuTextureView = source.getColorAttachmentView();
        if (gpuTextureView == null) {
            return;
        }
        GpuTextureView sourceView = gpuTextureView;
        if (sourceView instanceof GlTextureView) {
            sampler.set((GlTextureView)sourceView);
        } else {
            GpuTexture gpuTexture = sourceView.texture();
            Intrinsics.checkNotNull(gpuTexture, "null cannot be cast to non-null type com.mojang.blaze3d.opengl.GlTexture");
            sampler.set((GlTexture)gpuTexture);
        }
        this.drawFullscreenQuad();
    }

    @Override
    @NotNull
    public String shader() {
        return "kawase/";
    }

    /*
     * WARNING - void declaration
     */
    private final void createFramebuffers(int width, int height) {
        int i = 0;
        int n = this.blurPasses;
        if (i <= n) {
            while (true) {
                void var3_3;
                this.fbos.add(new CustomFramebuffer("kawase_fbo_" + i, width, height, false));
                if (i == n) break;
                ++var3_3;
            }
        }
    }

    @NotNull
    public final Framebuffer framebuffer() {
        return (Framebuffer)CollectionsKt.first((List)this.fbos);
    }

    @NotNull
    public final GlTextureView texture() {
        GpuTextureView gpuTextureView = ((CustomFramebuffer)((Object)CollectionsKt.first((List)this.fbos))).getColorAttachmentView();
        GlTextureView glTextureView = gpuTextureView instanceof GlTextureView ? (GlTextureView)gpuTextureView : null;
        if (glTextureView == null) {
            throw new IllegalStateException("Kawase framebuffer has no GL texture view".toString());
        }
        return glTextureView;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void drawFullscreenQuad() {
        void var3_3;
        block8: {
            void var2_2;
            IMesh iMesh;
            IMesh mesh;
            int height;
            int width;
            block7: {
                width = \u0636\u0643.getMc().getWindow().getScaledWidth();
                height = \u0636\u0643.getMc().getWindow().getScaledHeight();
                mesh = this.fullscreenMesh;
                if (mesh == null || this.fullscreenWidth != width) break block7;
                if (this.fullscreenHeight == height) break block8;
            }
            IMesh iMesh2 = mesh;
            if (iMesh2 != null) {
                iMesh2.close();
            }
            MeshBuilder buffer = ChromaRenderer.borrowMeshBuilder(this.drawMode(), this.vertexFormat());
            try {
                buffer.vertex(0.0f, 0.0f, 0.0f);
                buffer.vertex(0.0f, height, 0.0f);
                buffer.vertex(width, height, 0.0f);
                buffer.vertex(width, 0.0f, 0.0f);
                iMesh = buffer.buildNullable();
            }
            finally {
                ChromaRenderer.recycleMeshBuilder(buffer);
            }
            mesh = iMesh;
            this.fullscreenMesh = mesh;
            this.fullscreenWidth = width;
            this.fullscreenHeight = var2_2;
        }
        if (var3_3 != null) {
            ChromaRenderer.draw((IMesh)var3_3, false);
        }
    }

    @Override
    public void load() {
        if (this.initialized) {
            return;
        }
        this.createPrograms();
        if (this.hasValidWindowSize()) {
            this.createFramebuffers(\u0636\u0643.getMc().getWindow().getFramebufferWidth(), \u0636\u0643.getMc().getWindow().getFramebufferHeight());
        }
        this.initialized = true;
    }

    @Override
    @NotNull
    public VertexFormat vertexFormat() {
        VertexFormat vertexFormat = \u0634\u0648.POSITION;
        Intrinsics.checkNotNullExpressionValue(vertexFormat, "POSITION");
        return vertexFormat;
    }

    public final boolean hasFramebuffer() {
        return !((Collection)this.fbos).isEmpty();
    }

    private final void createPrograms() {
        String ds = "downscale";
        String us = "upscale";
        String kawase = this.shader() + this.name();
        this.downscaleProgram = this.createShaderBuilder(ds, this.shader() + ds, kawase).uniform("uHalfTexelSize", a.VEC2).uniform("uOffset", a.FLOAT).sampler("uTexture").build();
        this.upscaleProgram = this.createShaderBuilder(us, this.shader() + us, kawase).uniform("uHalfTexelSize", a.VEC2).uniform("uOffset", a.FLOAT).sampler("uTexture").build();
        GlProgram glProgram = this.downscaleProgram;
        Intrinsics.checkNotNull(glProgram);
        \u062f\u0637 \u062f\u06372 = glProgram.getUniform("uHalfTexelSize", a.VEC2);
        Intrinsics.checkNotNullExpressionValue(\u062f\u06372, "getUniform(...)");
        this.downscaleTexelUniform = \u062f\u06372;
        GlProgram glProgram2 = this.downscaleProgram;
        Intrinsics.checkNotNull(glProgram2);
        \u0630\u0621 \u0630\u06212 = glProgram2.getUniform("uOffset", a.FLOAT);
        Intrinsics.checkNotNullExpressionValue(\u0630\u06212, "getUniform(...)");
        this.downscaleOffsetUniform = \u0630\u06212;
        GlProgram glProgram3 = this.downscaleProgram;
        Intrinsics.checkNotNull(glProgram3);
        SamplerUniform samplerUniform = glProgram3.getUniform("uTexture", a.SAMPLER);
        Intrinsics.checkNotNullExpressionValue(samplerUniform, "getUniform(...)");
        this.downscaleTextureUniform = samplerUniform;
        GlProgram glProgram4 = this.upscaleProgram;
        Intrinsics.checkNotNull(glProgram4);
        \u062f\u0637 \u062f\u06373 = glProgram4.getUniform("uHalfTexelSize", a.VEC2);
        Intrinsics.checkNotNullExpressionValue(\u062f\u06373, "getUniform(...)");
        this.upscaleTexelUniform = \u062f\u06373;
        GlProgram glProgram5 = this.upscaleProgram;
        Intrinsics.checkNotNull(glProgram5);
        \u0630\u0621 \u0630\u06213 = glProgram5.getUniform("uOffset", a.FLOAT);
        Intrinsics.checkNotNullExpressionValue(\u0630\u06213, "getUniform(...)");
        this.upscaleOffsetUniform = \u0630\u06213;
        GlProgram glProgram6 = this.upscaleProgram;
        Intrinsics.checkNotNull(glProgram6);
        SamplerUniform samplerUniform2 = glProgram6.getUniform("uTexture", a.SAMPLER);
        Intrinsics.checkNotNullExpressionValue(samplerUniform2, "getUniform(...)");
        this.upscaleTextureUniform = samplerUniform2;
        this.setGlProgram(this.downscaleProgram);
    }

    private final boolean hasValidWindowSize() {
        return \u0636\u0643.getMc().getWindow().getFramebufferWidth() > 0 && \u0636\u0643.getMc().getWindow().getFramebufferHeight() > 0;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean checkResize() {
        block6: {
            int height;
            int width;
            block5: {
                if (!this.hasValidWindowSize()) {
                    return false;
                }
                width = \u0636\u0643.getMc().getWindow().getFramebufferWidth();
                height = \u0636\u0643.getMc().getWindow().getFramebufferHeight();
                if (this.fbos.isEmpty() || ((CustomFramebuffer)((Object)CollectionsKt.first((List)this.fbos))).textureWidth != width) break block5;
                if (((CustomFramebuffer)((Object)CollectionsKt.first((List)this.fbos))).textureHeight == height) break block6;
            }
            Iterable $this$forEach$iv = this.fbos;
            boolean $i$f$forEach = false;
            for (Object element$iv : $this$forEach$iv) {
                void var7_7;
                CustomFramebuffer it = (CustomFramebuffer)((Object)element$iv);
                boolean bl = false;
                var7_7.delete();
            }
            this.fbos.clear();
            this.createFramebuffers(width, height);
        }
        return !((Collection)this.fbos).isEmpty();
    }

    public KawaseRenderer() {
        this.blurPasses = 3;
        this.offset = 25.0f;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public final void applyBlur() {
        if (!this.checkResize()) {
            return;
        }
        int actualPasses = Math.max(this.fbos.size() - 1, 1);
        GlProgram glProgram = this.downscaleProgram;
        if (glProgram == null) {
            return;
        }
        GlProgram downscale = glProgram;
        GlProgram glProgram2 = this.upscaleProgram;
        if (glProgram2 == null) {
            return;
        }
        GlProgram upscale = glProgram2;
        ChromaRenderer.beginDrawScope();
        try {
            int i;
            Framebuffer framebuffer = \u0636\u0643.getMc().getFramebuffer();
            Intrinsics.checkNotNullExpressionValue(framebuffer, "getMainRenderTarget(...)");
            this.applyBlurPass(downscale, framebuffer, (CustomFramebuffer)((Object)CollectionsKt.first((List)this.fbos)), 0, actualPasses);
            for (i = 0; i < actualPasses; ++i) {
                CustomFramebuffer customFramebuffer = this.fbos.get(i);
                Intrinsics.checkNotNullExpressionValue((Object)customFramebuffer, "get(...)");
                Framebuffer framebuffer2 = customFramebuffer;
                CustomFramebuffer customFramebuffer2 = this.fbos.get(i + 1);
                Intrinsics.checkNotNullExpressionValue((Object)customFramebuffer2, "get(...)");
                this.applyBlurPass(downscale, framebuffer2, customFramebuffer2, i + 1, actualPasses);
            }
            i = actualPasses;
            while (0 < i) {
                void var4_4;
                CustomFramebuffer customFramebuffer = this.fbos.get(i);
                Intrinsics.checkNotNullExpressionValue((Object)customFramebuffer, "get(...)");
                Framebuffer framebuffer3 = customFramebuffer;
                CustomFramebuffer customFramebuffer3 = this.fbos.get(i - 1);
                Intrinsics.checkNotNullExpressionValue((Object)customFramebuffer3, "get(...)");
                this.applyBlurPass(upscale, framebuffer3, customFramebuffer3, i, actualPasses);
                --var4_4;
            }
        }
        finally {
            ChromaRenderer.endDrawScope();
        }
    }
}


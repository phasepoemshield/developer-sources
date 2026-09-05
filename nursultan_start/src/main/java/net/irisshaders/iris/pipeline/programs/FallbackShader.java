/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$UniformDescription
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class02255
 *  minecraft.class08419
 *  net.irisshaders.iris.compat.SkipList
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.DepthColorStorage
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.mixinterface.ShaderInstanceInterface
 *  net.irisshaders.iris.uniforms.CapturedRenderingState
 *  org.lwjgl.opengl.GL31C
 *  org.lwjgl.opengl.GL46C
 */
package net.irisshaders.iris.pipeline.programs;

import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.io.IOException;
import java.util.ArrayList;
import minecraft.class02255;
import minecraft.class08419;
import net.irisshaders.iris.compat.SkipList;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.DepthColorStorage;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.mixinterface.ShaderInstanceInterface;
import net.irisshaders.iris.pipeline.IrisRenderingPipeline;
import net.irisshaders.iris.pipeline.programs.IrisProgram;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.lwjgl.opengl.GL31C;
import org.lwjgl.opengl.GL46C;

public class FallbackShader
extends class02255
implements IrisProgram {
    private final IrisRenderingPipeline parent;
    private final BlendModeOverride blendModeOverride;
    private final GlFramebuffer writingToBeforeTranslucent;
    private final GlFramebuffer writingToAfterTranslucent;
    private final int FOG_DENSITY;
    private final int FOG_IS_EXP2;
    private final int gtexture;
    private final int overlay;
    private final int lightmap;
    private boolean isSetUp;

    public FallbackShader(int n, RenderPipeline renderPipeline, String string, VertexFormat vertexFormat, GlFramebuffer glFramebuffer, GlFramebuffer glFramebuffer2, BlendModeOverride blendModeOverride, float f, IrisRenderingPipeline irisRenderingPipeline) throws IOException {
        super(n, string);
        ((ShaderInstanceInterface)this).setShouldSkip(SkipList.NONE);
        ArrayList<RenderPipeline.UniformDescription> arrayList = new ArrayList<RenderPipeline.UniformDescription>(renderPipeline.getUniforms());
        arrayList.add(new RenderPipeline.UniformDescription("DynamicTransforms", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("CloudInfo", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Projection", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Fog", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Globals", class08419.field_60031));
        arrayList.add(new RenderPipeline.UniformDescription("Lighting", class08419.field_60031));
        this.method_62900(arrayList, renderPipeline.getSamplers());
        this.parent = irisRenderingPipeline;
        this.blendModeOverride = blendModeOverride;
        this.writingToBeforeTranslucent = glFramebuffer;
        this.writingToAfterTranslucent = glFramebuffer2;
        this.FOG_DENSITY = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"FogDensity");
        this.FOG_IS_EXP2 = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"FogIsExp2");
        this.gtexture = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"gtexture");
        this.overlay = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"overlay");
        this.lightmap = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"lightmap");
        GlStateManager._glUseProgram((int)n);
        int n2 = GlStateManager._glGetUniformLocation((int)n, (CharSequence)"AlphaTestValue");
        if (n2 > -1) {
            GL46C.glUniform1f((int)n2, (float)f);
        }
    }

    @Override
    public int iris$getBlockIndex(int n, CharSequence charSequence) {
        return GL31C.glGetUniformBlockIndex((int)n, (CharSequence)charSequence);
    }

    @Override
    public boolean iris$isSetUp() {
        return this.isSetUp;
    }

    @Override
    public void iris$setupState(GpuTextureView gpuTextureView) {
        this.isSetUp = true;
        DepthColorStorage.unlockDepthColor();
        GlStateManager._glUseProgram((int)this.method_1270());
        if (this.FOG_DENSITY > -1 && this.FOG_IS_EXP2 > -1) {
            float f = CapturedRenderingState.INSTANCE.getFogDensity();
            if ((double)f >= 0.0) {
                GL46C.glUniform1f((int)this.FOG_DENSITY, (float)f);
                GL46C.glUniform1i((int)this.FOG_IS_EXP2, (int)1);
            } else {
                GL46C.glUniform1f((int)this.FOG_DENSITY, (float)0.0f);
                GL46C.glUniform1i((int)this.FOG_IS_EXP2, (int)0);
            }
        }
        GlStateManager._glUniform1i((int)this.gtexture, (int)0);
        GlStateManager._glUniform1i((int)this.overlay, (int)1);
        GlStateManager._glUniform1i((int)this.lightmap, (int)2);
        if (this.blendModeOverride != null) {
            this.blendModeOverride.apply();
        }
        if (this.parent.isBeforeTranslucent) {
            this.writingToBeforeTranslucent.bind();
        } else {
            this.writingToAfterTranslucent.bind();
        }
    }

    @Override
    public void iris$clearState() {
        if (this.blendModeOverride != null) {
            BlendModeOverride.restore();
        }
        this.isSetUp = false;
    }
}


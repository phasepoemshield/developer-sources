/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  net.irisshaders.iris.shaderpack.FilledIndirectPointer
 *  org.joml.Vector2f
 *  org.joml.Vector3i
 */
package net.irisshaders.iris.gl.program;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.shaderpack.FilledIndirectPointer;
import org.joml.Vector2f;
import org.joml.Vector3i;

public final class ComputeProgram
extends GlResource {
    private final ProgramUniforms uniforms;
    private final ProgramSamplers samplers;
    private final ProgramImages images;
    private final int[] localSize = new int[3];
    private Vector3i absoluteWorkGroups;
    private Vector2f relativeWorkGroups;
    private float cachedWidth;
    private float cachedHeight;
    private Vector3i cachedWorkGroups;
    private FilledIndirectPointer indirectPointer;

    ComputeProgram(int n, ProgramUniforms programUniforms, ProgramSamplers programSamplers, ProgramImages programImages) {
        super(n);
        IrisRenderSystem.getProgramiv(n, 33383, this.localSize);
        this.uniforms = programUniforms;
        this.samplers = programSamplers;
        this.images = programImages;
    }

    public void dispatch(float f, float f2) {
        if (!Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::allowConcurrentCompute).orElse(false).booleanValue()) {
            IrisRenderSystem.memoryBarrier(8232);
        }
        if (this.indirectPointer != null) {
            IrisRenderSystem.bindBuffer(37102, this.indirectPointer.buffer());
            IrisRenderSystem.dispatchComputeIndirect(this.indirectPointer.offset());
        } else {
            IrisRenderSystem.dispatchCompute(this.getWorkGroups(f, f2));
        }
    }

    public void use() {
        GlStateManager._glUseProgram((int)this.getGlId());
        this.uniforms.update();
        this.samplers.update();
        this.images.update();
    }

    @Override
    public void destroyInternal() {
        GlStateManager.glDeleteProgram((int)this.getGlId());
    }

    @Deprecated
    public int getProgramId() {
        return this.getGlId();
    }

    public Vector3i getWorkGroups(float f, float f2) {
        if (this.indirectPointer != null) {
            return null;
        }
        if (this.cachedWidth != f || this.cachedHeight != f2 || this.cachedWorkGroups == null) {
            this.cachedWidth = f;
            this.cachedHeight = f2;
            this.cachedWorkGroups = this.absoluteWorkGroups != null ? this.absoluteWorkGroups : (this.relativeWorkGroups != null ? new Vector3i((int)Math.ceil(Math.ceil(f * this.relativeWorkGroups.x) / (double)this.localSize[0]), (int)Math.ceil(Math.ceil(f2 * this.relativeWorkGroups.y) / (double)this.localSize[1]), 1) : new Vector3i((int)Math.ceil(f / (float)this.localSize[0]), (int)Math.ceil(f2 / (float)this.localSize[1]), 1));
        }
        return this.cachedWorkGroups;
    }

    public void setWorkGroupInfo(Vector2f vector2f, Vector3i vector3i, FilledIndirectPointer filledIndirectPointer) {
        this.relativeWorkGroups = vector2f;
        this.absoluteWorkGroups = vector3i;
        this.indirectPointer = filledIndirectPointer;
    }

    public int getActiveImages() {
        return this.images.getActiveImages();
    }

    public static void unbind() {
        ProgramUniforms.clearActiveUniforms();
        GlStateManager._glUseProgram((int)0);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 */
package net.irisshaders.iris.gl.program;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.program.ProgramImages;
import net.irisshaders.iris.gl.program.ProgramSamplers;
import net.irisshaders.iris.gl.program.ProgramUniforms;

public final class Program
extends GlResource {
    private final ProgramUniforms uniforms;
    private final ProgramSamplers samplers;
    private final ProgramImages images;

    Program(int n, ProgramUniforms programUniforms, ProgramSamplers programSamplers, ProgramImages programImages) {
        super(n);
        this.uniforms = programUniforms;
        this.samplers = programSamplers;
        this.images = programImages;
    }

    public void use() {
        IrisRenderSystem.memoryBarrier(8232);
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

    public int getActiveImages() {
        return this.images.getActiveImages();
    }

    public static void unbind() {
        ProgramUniforms.clearActiveUniforms();
        ProgramSamplers.clearActiveSamplers();
        GlStateManager._glUseProgram((int)0);
    }
}


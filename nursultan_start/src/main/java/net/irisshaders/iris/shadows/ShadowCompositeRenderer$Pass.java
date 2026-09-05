/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableSet
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.blending.BlendModeOverride
 *  net.irisshaders.iris.gl.blending.BlendModeStorage
 *  net.irisshaders.iris.gl.framebuffer.GlFramebuffer
 *  net.irisshaders.iris.gl.framebuffer.ViewportData
 *  net.irisshaders.iris.gl.program.ComputeProgram
 *  net.irisshaders.iris.gl.program.Program
 *  net.irisshaders.iris.mixinterface.CustomPass
 */
package net.irisshaders.iris.shadows;

import com.google.common.collect.ImmutableSet;
import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.blending.BlendModeOverride;
import net.irisshaders.iris.gl.blending.BlendModeStorage;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.framebuffer.ViewportData;
import net.irisshaders.iris.gl.program.ComputeProgram;
import net.irisshaders.iris.gl.program.Program;
import net.irisshaders.iris.mixinterface.CustomPass;

class ShadowCompositeRenderer$Pass
implements CustomPass {
    String name;
    Program program;
    BlendModeOverride blendModeOverride;
    GlFramebuffer framebuffer;
    ImmutableSet<Integer> flippedAtLeastOnce;
    ImmutableSet<Integer> stageReadsFromAlt;
    ImmutableSet<Integer> mipmappedBuffers;
    ViewportData viewportScale;
    ComputeProgram[] computes;

    ShadowCompositeRenderer$Pass() {
    }

    protected void destroy() {
        this.program.destroy();
        for (ComputeProgram computeProgram : this.computes) {
            if (computeProgram == null) continue;
            computeProgram.destroy();
        }
    }

    public void setupState() {
        this.framebuffer.bind();
        if (this.blendModeOverride != null) {
            this.blendModeOverride.apply();
        } else {
            BlendModeStorage.restoreBlend();
            GlStateManager._disableBlend();
        }
    }
}


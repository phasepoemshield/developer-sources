/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.texture;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;

public class DepthCopyStrategy$Gl30BlitFbCombinedDepthStencil
implements DepthCopyStrategy {
    DepthCopyStrategy$Gl30BlitFbCombinedDepthStencil() {
    }

    @Override
    public void copy(GlFramebuffer glFramebuffer, int n, GlFramebuffer glFramebuffer2, int n2, int n3, int n4) {
        IrisRenderSystem.blitFramebuffer(glFramebuffer.getId(), glFramebuffer2.getId(), 0, 0, n3, n4, 0, 0, n3, n4, 1280, 9728);
    }

    @Override
    public boolean needsDestFramebuffer() {
        return true;
    }
}


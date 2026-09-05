/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.texture;

import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;

public class DepthCopyStrategy$Gl43CopyImage
implements DepthCopyStrategy {
    DepthCopyStrategy$Gl43CopyImage() {
    }

    @Override
    public void copy(GlFramebuffer glFramebuffer, int n, GlFramebuffer glFramebuffer2, int n2, int n3, int n4) {
        IrisRenderSystem.copyImageSubData(n, 3553, 0, 0, 0, 0, n2, 3553, 0, 0, 0, 0, n3, n4, 1);
    }

    @Override
    public boolean needsDestFramebuffer() {
        return false;
    }
}


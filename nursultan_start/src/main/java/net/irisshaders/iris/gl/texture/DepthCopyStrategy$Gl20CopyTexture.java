/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.mixin.GlStateManagerAccessor
 */
package net.irisshaders.iris.gl.texture;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy;
import net.irisshaders.iris.mixin.GlStateManagerAccessor;

public class DepthCopyStrategy$Gl20CopyTexture
implements DepthCopyStrategy {
    DepthCopyStrategy$Gl20CopyTexture() {
    }

    @Override
    public void copy(GlFramebuffer glFramebuffer, int n, GlFramebuffer glFramebuffer2, int n2, int n3, int n4) {
        glFramebuffer.bindAsReadBuffer();
        int n5 = GlStateManagerAccessor.getTEXTURES()[GlStateManagerAccessor.getActiveTexture()].field_5167;
        IrisRenderSystem.copyTexSubImage2D(n2, 3553, 0, 0, 0, 0, 0, n3, n4);
        GlStateManager._bindTexture((int)n5);
    }

    @Override
    public boolean needsDestFramebuffer() {
        return false;
    }
}


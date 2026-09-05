/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL
 */
package net.irisshaders.iris.gl.texture;

import net.irisshaders.iris.gl.framebuffer.GlFramebuffer;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy$Gl20CopyTexture;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy$Gl30BlitFbCombinedDepthStencil;
import net.irisshaders.iris.gl.texture.DepthCopyStrategy$Gl43CopyImage;
import org.lwjgl.opengl.GL;

public interface DepthCopyStrategy {
    public void copy(GlFramebuffer var1, int var2, GlFramebuffer var3, int var4, int var5, int var6);

    public static DepthCopyStrategy fastest(boolean bl) {
        if (GL.getCapabilities().glCopyImageSubData != 0L) {
            return new DepthCopyStrategy$Gl43CopyImage();
        }
        if (bl) {
            return new DepthCopyStrategy$Gl30BlitFbCombinedDepthStencil();
        }
        return new DepthCopyStrategy$Gl20CopyTexture();
    }

    public boolean needsDestFramebuffer();
}


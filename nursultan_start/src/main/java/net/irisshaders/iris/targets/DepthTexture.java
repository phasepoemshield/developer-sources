/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.GlResource
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.texture.DepthBufferFormat
 */
package net.irisshaders.iris.targets;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.texture.DepthBufferFormat;

public class DepthTexture
extends GlResource {
    public DepthTexture(String string, int n, int n2, DepthBufferFormat depthBufferFormat) {
        super(IrisRenderSystem.createTexture((int)3553));
        int n3 = this.getGlId();
        this.resize(n, n2, depthBufferFormat);
        GLDebug.nameObject((int)5890, (int)n3, (String)string);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10241, (int)9728);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10240, (int)9728);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10242, (int)33071);
        IrisRenderSystem.texParameteri((int)n3, (int)3553, (int)10243, (int)33071);
        GlStateManager._bindTexture((int)0);
    }

    void resize(int n, int n2, DepthBufferFormat depthBufferFormat) {
        IrisRenderSystem.texImage2D((int)this.getTextureId(), (int)3553, (int)0, (int)depthBufferFormat.getGlInternalFormat(), (int)n, (int)n2, (int)0, (int)depthBufferFormat.getGlType(), (int)depthBufferFormat.getGlFormat(), null);
    }

    public int getTextureId() {
        return this.getGlId();
    }

    public void destroyInternal() {
        GlStateManager._deleteTexture((int)this.getGlId());
    }
}


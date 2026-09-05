/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.GLDebug
 *  net.irisshaders.iris.gl.IrisRenderSystem
 *  net.irisshaders.iris.gl.sampler.GlSampler
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 *  org.joml.Vector2i
 */
package net.irisshaders.iris.targets;

import com.mojang.blaze3d.opengl.GlStateManager;
import java.nio.ByteBuffer;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.sampler.GlSampler;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.targets.RenderTarget$Builder;
import org.joml.Vector2i;

public class RenderTarget {
    private static final ByteBuffer NULL_BUFFER = null;
    private final InternalTextureFormat internalFormat;
    private final PixelFormat format;
    private final PixelType type;
    private final int mainTexture;
    private final int altTexture;
    private int width;
    private int height;
    private boolean isValid = true;
    private String name;
    private boolean allowsLinear;
    private boolean mipmapsOnAlt;
    private boolean mipmapsOnMain;

    public RenderTarget(RenderTarget$Builder renderTarget$Builder) {
        this.name = renderTarget$Builder.name;
        this.internalFormat = renderTarget$Builder.internalFormat;
        this.format = renderTarget$Builder.format;
        this.type = renderTarget$Builder.type;
        this.width = renderTarget$Builder.width;
        this.height = renderTarget$Builder.height;
        this.mainTexture = GlStateManager._genTexture();
        this.altTexture = GlStateManager._genTexture();
        boolean bl = renderTarget$Builder.internalFormat.getPixelFormat().isInteger();
        this.allowsLinear = !bl;
        this.setupTexture(this.mainTexture, renderTarget$Builder.width, renderTarget$Builder.height, !bl, false);
        this.setupTexture(this.altTexture, renderTarget$Builder.width, renderTarget$Builder.height, !bl, true);
        GlStateManager._bindTexture((int)0);
    }

    public static RenderTarget$Builder builder() {
        return new RenderTarget$Builder();
    }

    public void destroy() {
        this.requireValid();
        this.isValid = false;
        GlStateManager._deleteTexture((int)this.mainTexture);
        GlStateManager._deleteTexture((int)this.altTexture);
    }

    void resize(int n, int n2) {
        this.requireValid();
        this.width = n;
        this.height = n2;
        this.resizeTexture(this.mainTexture, n, n2, false);
        this.resizeTexture(this.altTexture, n, n2, true);
    }

    void resize(Vector2i vector2i) {
        this.resize(vector2i.x, vector2i.y);
    }

    public int getWidth() {
        return this.width;
    }

    public InternalTextureFormat getInternalFormat() {
        return this.internalFormat;
    }

    public void turnOffMips(boolean bl) {
        if (bl) {
            this.mipmapsOnAlt = false;
        } else {
            this.mipmapsOnMain = false;
        }
    }

    public int getMainTexture() {
        this.requireValid();
        return this.mainTexture;
    }

    public int getAltTexture() {
        this.requireValid();
        return this.altTexture;
    }

    private void setupTexture(int n, int n2, int n3, boolean bl, boolean bl2) {
        this.resizeTexture(n, n2, n3, bl2);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10241, (int)(bl ? 9729 : 9728));
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10240, (int)(bl ? 9729 : 9728));
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10242, (int)33071);
        IrisRenderSystem.texParameteri((int)n, (int)3553, (int)10243, (int)33071);
    }

    private void resizeTexture(int n, int n2, int n3, boolean bl) {
        IrisRenderSystem.texImage2D((int)n, (int)3553, (int)0, (int)this.internalFormat.getGlFormat(), (int)n2, (int)n3, (int)0, (int)this.format.getGlFormat(), (int)this.type.getGlFormat(), (ByteBuffer)NULL_BUFFER);
        if (this.name != null) {
            GLDebug.nameObject((int)5890, (int)n, (String)(this.name + " " + (bl ? "alt" : "main")));
        }
    }

    public void turnOnMips(boolean bl) {
        if (bl) {
            this.mipmapsOnAlt = true;
        } else {
            this.mipmapsOnMain = true;
        }
    }

    public int getHeight() {
        return this.height;
    }

    public GlSampler getAltSampler() {
        if (this.mipmapsOnAlt) {
            return this.allowsLinear ? GlSampler.MIPPED_LINEAR : GlSampler.MIPPED_NEAREST;
        }
        return this.allowsLinear ? GlSampler.LINEAR : GlSampler.NEAREST;
    }

    public GlSampler getMainSampler() {
        if (this.mipmapsOnMain) {
            return this.allowsLinear ? GlSampler.MIPPED_LINEAR : GlSampler.MIPPED_NEAREST;
        }
        return this.allowsLinear ? GlSampler.LINEAR : GlSampler.NEAREST;
    }

    private void requireValid() {
        if (!this.isValid) {
            throw new IllegalStateException("Attempted to use a deleted composite render target");
        }
    }
}


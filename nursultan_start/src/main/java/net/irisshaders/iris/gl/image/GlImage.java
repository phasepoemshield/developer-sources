/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  net.irisshaders.iris.gl.texture.PixelType
 *  net.irisshaders.iris.gl.texture.TextureType
 *  org.lwjgl.opengl.ARBClearTexture
 */
package net.irisshaders.iris.gl.image;

import com.mojang.blaze3d.opengl.GlStateManager;
import net.irisshaders.iris.gl.GLDebug;
import net.irisshaders.iris.gl.GlResource;
import net.irisshaders.iris.gl.IrisRenderSystem;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.texture.TextureType;
import org.lwjgl.opengl.ARBClearTexture;

public class GlImage
extends GlResource {
    protected final String name;
    protected final String samplerName;
    protected final TextureType target;
    protected final PixelFormat format;
    protected final InternalTextureFormat internalTextureFormat;
    protected final PixelType pixelType;
    private final boolean clear;

    public TextureType getTarget() {
        return this.target;
    }

    public PixelFormat getFormat() {
        return this.format;
    }

    public GlImage(String string, String string2, TextureType textureType, PixelFormat pixelFormat, InternalTextureFormat internalTextureFormat, PixelType pixelType, boolean bl, int n, int n2, int n3) {
        super(IrisRenderSystem.createTexture(textureType.getGlType()));
        this.name = string;
        this.samplerName = string2;
        this.target = textureType;
        this.format = pixelFormat;
        this.internalTextureFormat = internalTextureFormat;
        this.pixelType = pixelType;
        this.clear = bl;
        GLDebug.nameObject(5890, this.getGlId(), string);
        IrisRenderSystem.bindTextureForSetup(textureType.getGlType(), this.getGlId());
        textureType.apply(this.getGlId(), n, n2, n3, internalTextureFormat.getGlFormat(), pixelFormat.getGlFormat(), pixelType.getGlFormat(), null);
        int n4 = this.getGlId();
        this.setup(n4, n, n2, n3);
        IrisRenderSystem.bindTextureForSetup(textureType.getGlType(), 0);
    }

    public String toString() {
        return "GlImage name " + this.name + " format " + String.valueOf((Object)this.format) + "internalformat " + String.valueOf((Object)this.internalTextureFormat) + " pixeltype " + String.valueOf(this.pixelType);
    }

    public String getName() {
        return this.name;
    }

    protected void setup(int n, int n2, int n3, int n4) {
        boolean bl = this.internalTextureFormat.getPixelFormat().isInteger();
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 10241, bl ? 9728 : 9729);
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 10240, bl ? 9728 : 9729);
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 10242, 33071);
        if (n3 > 0) {
            IrisRenderSystem.texParameteri(n, this.target.getGlType(), 10243, 33071);
        }
        if (n4 > 0) {
            IrisRenderSystem.texParameteri(n, this.target.getGlType(), 32882, 33071);
        }
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 33085, 0);
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 33082, 0);
        IrisRenderSystem.texParameteri(n, this.target.getGlType(), 33083, 0);
        IrisRenderSystem.texParameterf(n, this.target.getGlType(), 34049, 0.0f);
        ARBClearTexture.glClearTexImage((int)n, (int)0, (int)this.format.getGlFormat(), (int)this.pixelType.getGlFormat(), (int[])null);
    }

    public int getId() {
        return this.getGlId();
    }

    @Override
    public void destroyInternal() {
        GlStateManager._deleteTexture((int)this.getGlId());
    }

    public boolean shouldClear() {
        return this.clear;
    }

    public void updateNewSize(int n, int n2) {
    }

    public PixelType getPixelType() {
        return this.pixelType;
    }

    public String getSamplerName() {
        return this.samplerName;
    }

    public InternalTextureFormat getInternalFormat() {
        return this.internalTextureFormat;
    }
}


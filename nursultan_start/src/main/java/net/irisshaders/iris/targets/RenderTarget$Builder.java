/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 */
package net.irisshaders.iris.targets;

import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.targets.RenderTarget;

public class RenderTarget$Builder {
    InternalTextureFormat internalFormat = InternalTextureFormat.RGBA8;
    int width = 0;
    int height = 0;
    PixelFormat format = PixelFormat.RGBA;
    PixelType type = PixelType.UNSIGNED_BYTE;
    String name = null;

    RenderTarget$Builder() {
    }

    public RenderTarget$Builder setName(String string) {
        this.name = string;
        return this;
    }

    public RenderTarget build() {
        return new RenderTarget(this);
    }

    public RenderTarget$Builder setDimensions(int n, int n2) {
        if (n <= 0) {
            throw new IllegalArgumentException("Width must be greater than zero");
        }
        if (n2 <= 0) {
            throw new IllegalArgumentException("Height must be greater than zero");
        }
        this.width = n;
        this.height = n2;
        return this;
    }

    public RenderTarget$Builder setPixelFormat(PixelFormat pixelFormat) {
        this.format = pixelFormat;
        return this;
    }

    public RenderTarget$Builder setInternalFormat(InternalTextureFormat internalTextureFormat) {
        this.internalFormat = internalTextureFormat;
        return this;
    }

    public RenderTarget$Builder setPixelType(PixelType pixelType) {
        this.type = pixelType;
        return this;
    }
}


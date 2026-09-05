/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 */
package net.irisshaders.iris.shaderpack.texture;

import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;

public abstract class CustomTextureData$RawData
extends CustomTextureData {
    private final byte[] content;
    private final InternalTextureFormat internalFormat;
    private final PixelFormat pixelFormat;
    private final PixelType pixelType;
    private final TextureFilteringData filteringData;

    CustomTextureData$RawData(byte[] byArray, TextureFilteringData textureFilteringData, InternalTextureFormat internalTextureFormat, PixelFormat pixelFormat, PixelType pixelType) {
        this.content = byArray;
        this.filteringData = textureFilteringData;
        this.internalFormat = internalTextureFormat;
        this.pixelFormat = pixelFormat;
        this.pixelType = pixelType;
    }

    public final byte[] getContent() {
        return this.content;
    }

    public final PixelFormat getPixelFormat() {
        return this.pixelFormat;
    }

    public final PixelType getPixelType() {
        return this.pixelType;
    }

    public final InternalTextureFormat getInternalFormat() {
        return this.internalFormat;
    }

    public TextureFilteringData getFilteringData() {
        return this.filteringData;
    }
}


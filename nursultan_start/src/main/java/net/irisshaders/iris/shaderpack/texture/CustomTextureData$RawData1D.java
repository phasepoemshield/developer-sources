/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 *  net.irisshaders.iris.gl.texture.PixelType
 */
package net.irisshaders.iris.shaderpack.texture;

import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;

public final class CustomTextureData$RawData1D
extends CustomTextureData$RawData {
    private final int sizeX;

    public CustomTextureData$RawData1D(byte[] byArray, TextureFilteringData textureFilteringData, InternalTextureFormat internalTextureFormat, PixelFormat pixelFormat, PixelType pixelType, int n) {
        super(byArray, textureFilteringData, internalTextureFormat, pixelFormat, pixelType);
        int n2 = n * pixelFormat.getComponentCount() * pixelType.getByteSize();
        if (byArray.length < n2) {
            throw new IllegalStateException("1D Custom texture was " + byArray.length + " bytes; expected " + n2);
        }
        if (byArray.length > n2) {
            Iris.logger.warn("1D Custom texture was " + byArray.length + " bytes; expected " + n2 + ". This is allowed, but you probably don't want this.");
        }
        this.sizeX = n;
    }

    public int getSizeX() {
        return this.sizeX;
    }
}


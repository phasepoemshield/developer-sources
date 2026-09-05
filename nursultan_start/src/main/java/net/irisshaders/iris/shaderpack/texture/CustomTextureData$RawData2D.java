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

public class CustomTextureData$RawData2D
extends CustomTextureData$RawData {
    final int sizeX;
    final int sizeY;

    public CustomTextureData$RawData2D(byte[] byArray, TextureFilteringData textureFilteringData, InternalTextureFormat internalTextureFormat, PixelFormat pixelFormat, PixelType pixelType, int n, int n2) {
        super(byArray, textureFilteringData, internalTextureFormat, pixelFormat, pixelType);
        int n3 = n * n2 * pixelFormat.getComponentCount() * pixelType.getByteSize();
        if (byArray.length < n3) {
            throw new IllegalStateException("2D Custom texture was " + byArray.length + " bytes; expected " + n3);
        }
        if (byArray.length > n3) {
            Iris.logger.warn("2D Custom texture was " + byArray.length + " bytes; expected " + n3 + ". This is allowed, but you probably don't want this.");
        }
        this.sizeX = n;
        this.sizeY = n2;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public int getSizeX() {
        return this.sizeX;
    }
}


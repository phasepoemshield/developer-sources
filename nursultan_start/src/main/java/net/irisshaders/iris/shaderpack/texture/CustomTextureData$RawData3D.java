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

public final class CustomTextureData$RawData3D
extends CustomTextureData$RawData {
    final int sizeX;
    final int sizeY;
    final int sizeZ;

    public CustomTextureData$RawData3D(byte[] byArray, TextureFilteringData textureFilteringData, InternalTextureFormat internalTextureFormat, PixelFormat pixelFormat, PixelType pixelType, int n, int n2, int n3) {
        super(byArray, textureFilteringData, internalTextureFormat, pixelFormat, pixelType);
        int n4 = n * n2 * n3 * pixelFormat.getComponentCount() * pixelType.getByteSize();
        if (byArray.length < n4) {
            throw new IllegalStateException("3D Custom texture was " + byArray.length + " bytes; expected " + n4);
        }
        if (byArray.length > n4) {
            Iris.logger.warn("3D Custom texture was " + byArray.length + " bytes; expected " + n4 + ". This is allowed, but you probably don't want this.");
        }
        this.sizeX = n;
        this.sizeY = n2;
        this.sizeZ = n3;
    }

    public int getSizeY() {
        return this.sizeY;
    }

    public int getSizeX() {
        return this.sizeX;
    }

    public int getSizeZ() {
        return this.sizeZ;
    }
}


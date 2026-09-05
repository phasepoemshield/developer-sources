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
import net.irisshaders.iris.shaderpack.texture.CustomTextureData$RawData2D;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;

public class CustomTextureData$RawDataRect
extends CustomTextureData$RawData2D {
    public CustomTextureData$RawDataRect(byte[] byArray, TextureFilteringData textureFilteringData, InternalTextureFormat internalTextureFormat, PixelFormat pixelFormat, PixelType pixelType, int n, int n2) {
        super(byArray, textureFilteringData, internalTextureFormat, pixelFormat, pixelType, n, n2);
    }
}


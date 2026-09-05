/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  net.irisshaders.iris.gl.texture.PixelFormat
 */
package net.irisshaders.iris.gl.texture;

import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import net.irisshaders.iris.gl.texture.PixelFormat;
import net.irisshaders.iris.gl.texture.PixelType;
import net.irisshaders.iris.gl.texture.TextureDefinition;
import net.irisshaders.iris.gl.texture.TextureType;

public class TextureDefinition$RawDefinition
extends TextureDefinition {
    private final TextureType target;
    private final int sizeX;
    private final int sizeY;
    private final int sizeZ;
    private final InternalTextureFormat internalFormat;
    private final PixelFormat format;
    private final PixelType pixelType;

    public TextureType getTarget() {
        return this.target;
    }

    public PixelFormat getFormat() {
        return this.format;
    }

    public TextureDefinition$RawDefinition(String string, TextureType textureType, InternalTextureFormat internalTextureFormat, int n, int n2, int n3, PixelFormat pixelFormat, PixelType pixelType) {
        this.name = string;
        this.target = textureType;
        this.sizeX = n;
        this.sizeY = n2;
        this.sizeZ = n3;
        this.internalFormat = internalTextureFormat;
        this.format = pixelFormat;
        this.pixelType = pixelType;
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

    public PixelType getPixelType() {
        return this.pixelType;
    }

    public InternalTextureFormat getInternalFormat() {
        return this.internalFormat;
    }
}


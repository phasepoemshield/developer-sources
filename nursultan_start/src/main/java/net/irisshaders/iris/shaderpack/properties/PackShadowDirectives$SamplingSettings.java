/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shaderpack.properties;

import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import org.joml.Vector4f;

public class PackShadowDirectives$SamplingSettings {
    private boolean mipmap = false;
    private boolean nearest = false;
    private boolean clear = true;
    private Vector4f clearColor = new Vector4f(1.0f);
    private InternalTextureFormat format = InternalTextureFormat.RGBA;

    public InternalTextureFormat getFormat() {
        return this.format;
    }

    protected void setFormat(InternalTextureFormat internalTextureFormat) {
        this.format = internalTextureFormat;
    }

    public String toString() {
        return "SamplingSettings{mipmap=" + this.mipmap + ", nearest=" + this.nearest + ", clear=" + this.clear + ", clearColor=" + String.valueOf(this.clearColor) + ", format=" + this.format.name() + "}";
    }

    protected void setMipmap(boolean bl) {
        this.mipmap = bl;
    }

    public boolean getNearest() {
        return this.nearest || this.format.getPixelFormat().isInteger();
    }

    public boolean getClear() {
        return this.clear;
    }

    public boolean getMipmap() {
        return this.mipmap;
    }

    protected void setClear(boolean bl) {
        this.clear = bl;
    }

    protected void setNearest(boolean bl) {
        this.nearest = bl;
    }

    protected void setClearColor(Vector4f vector4f) {
        this.clearColor = vector4f;
    }

    public Vector4f getClearColor() {
        return this.clearColor;
    }
}


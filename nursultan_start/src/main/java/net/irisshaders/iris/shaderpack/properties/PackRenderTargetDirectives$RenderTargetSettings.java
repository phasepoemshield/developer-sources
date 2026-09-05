/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.gl.texture.InternalTextureFormat
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.shaderpack.properties;

import java.util.Optional;
import net.irisshaders.iris.gl.texture.InternalTextureFormat;
import org.joml.Vector4f;

public final class PackRenderTargetDirectives$RenderTargetSettings {
    InternalTextureFormat requestedFormat = InternalTextureFormat.RGBA;
    boolean clear = true;
    Vector4f clearColor = null;

    public String toString() {
        return "RenderTargetSettings{requestedFormat=" + String.valueOf(this.requestedFormat) + ", clear=" + this.clear + ", clearColor=" + String.valueOf(this.clearColor) + "}";
    }

    public boolean shouldClear() {
        return this.clear;
    }

    public InternalTextureFormat getInternalFormat() {
        return this.requestedFormat;
    }

    public Optional<Vector4f> getClearColor() {
        return Optional.ofNullable(this.clearColor);
    }
}


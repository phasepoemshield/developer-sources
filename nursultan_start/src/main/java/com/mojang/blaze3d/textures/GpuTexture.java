/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.irisshaders.iris.mixinterface.GpuTextureInterface
 */
package com.mojang.blaze3d.textures;

import com.mojang.blaze3d.textures.TextureFormat;
import net.irisshaders.iris.mixinterface.GpuTextureInterface;

public abstract class GpuTexture
implements AutoCloseable,
GpuTextureInterface {
    public static final int USAGE_COPY_DST = 1;
    public static final int USAGE_COPY_SRC = 2;
    public static final int USAGE_TEXTURE_BINDING = 4;
    public static final int USAGE_RENDER_ATTACHMENT = 8;
    public static final int USAGE_CUBEMAP_COMPATIBLE = 16;
    private final TextureFormat format;
    private final int width;
    private final int height;
    private final int depthOrLayers;
    private final int mipLevels;
    private final int usage;
    private final String label;

    public TextureFormat getFormat() {
        return this.format;
    }

    public GpuTexture(int n, String string, TextureFormat textureFormat, int n2, int n3, int n4, int n5) {
        this.usage = n;
        this.label = string;
        this.format = textureFormat;
        this.width = n2;
        this.height = n3;
        this.depthOrLayers = n4;
        this.mipLevels = n5;
    }

    @Override
    public abstract void close();

    public int iris$getGlId() {
        throw new AssertionError((Object)"Why.");
    }

    public int usage() {
        return this.usage;
    }

    public abstract boolean isClosed();

    public int getDepthOrLayers() {
        return this.depthOrLayers;
    }

    public int getMipLevels() {
        return this.mipLevels;
    }

    public int getWidth(int n) {
        return this.width >> n;
    }

    public void iris$markMipmapNonLinear() {
        throw new AssertionError((Object)"Why.");
    }

    public String getLabel() {
        return this.label;
    }

    public int getHeight(int n) {
        return this.height >> n;
    }
}


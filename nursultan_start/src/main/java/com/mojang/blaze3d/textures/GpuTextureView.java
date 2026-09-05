/*
 * Decompiled with CFR 0.152.
 */
package com.mojang.blaze3d.textures;

import com.mojang.blaze3d.textures.GpuTexture;

public abstract class GpuTextureView
implements AutoCloseable {
    private final GpuTexture texture;
    private final int baseMipLevel;
    private final int mipLevels;

    public GpuTextureView(GpuTexture gpuTexture, int n, int n2) {
        this.texture = gpuTexture;
        this.baseMipLevel = n;
        this.mipLevels = n2;
    }

    @Override
    public abstract void close();

    public abstract boolean isClosed();

    public int baseMipLevel() {
        return this.baseMipLevel;
    }

    public int getWidth(int n) {
        return this.texture.getWidth(n + this.baseMipLevel);
    }

    public int mipLevels() {
        return this.mipLevels;
    }

    public GpuTexture texture() {
        return this.texture;
    }

    public int getHeight(int n) {
        return this.texture.getHeight(n + this.baseMipLevel);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.texture;

import net.irisshaders.iris.shaderpack.texture.CustomTextureData;
import net.irisshaders.iris.shaderpack.texture.TextureFilteringData;

public final class CustomTextureData$PngData
extends CustomTextureData {
    private final TextureFilteringData filteringData;
    private final byte[] content;

    public CustomTextureData$PngData(TextureFilteringData textureFilteringData, byte[] byArray) {
        this.filteringData = textureFilteringData;
        this.content = byArray;
    }

    public byte[] getContent() {
        return this.content;
    }

    public TextureFilteringData getFilteringData() {
        return this.filteringData;
    }
}


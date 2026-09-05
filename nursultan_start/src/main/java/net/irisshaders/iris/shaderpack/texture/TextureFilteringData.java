/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.texture;

public final class TextureFilteringData {
    private final boolean blur;
    private final boolean clamp;

    public TextureFilteringData(boolean bl, boolean bl2) {
        this.blur = bl;
        this.clamp = bl2;
    }

    public boolean shouldClamp() {
        return this.clamp;
    }

    public boolean shouldBlur() {
        return this.blur;
    }
}


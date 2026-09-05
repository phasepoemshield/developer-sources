/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.gl.blending;

public class ColorMask {
    private final boolean red;
    private final boolean green;
    private final boolean blue;
    private final boolean alpha;

    public ColorMask(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.red = bl;
        this.green = bl2;
        this.blue = bl3;
        this.alpha = bl4;
    }

    public boolean isBlueMasked() {
        return this.blue;
    }

    public boolean isRedMasked() {
        return this.red;
    }

    public boolean isAlphaMasked() {
        return this.alpha;
    }

    public boolean isGreenMasked() {
        return this.green;
    }
}


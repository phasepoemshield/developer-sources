/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.nio.ByteBuffer;
import oxxxde.\u062c\u0634;
import oxxxde.\u0632\u0622;
import oxxxde.\u0636\u0648;

public class \u0630\u0646 {
    private final \u0632\u0622 filtering;
    private final ByteBuffer pixels;
    private final int height;
    private final \u0636\u0648 colorMode;
    private final boolean usingStb;
    private final int width;
    private final \u062c\u0634 wrapping;

    public boolean isUsingStb() {
        return this.usingStb;
    }

    public \u0636\u0648 getColorMode() {
        return this.colorMode;
    }

    public \u0630\u0646(ByteBuffer pixels, int width, int height, \u0636\u0648 colorMode, \u0632\u0622 filtering, \u062c\u0634 wrapping, boolean usingStb) {
        this.pixels = pixels;
        this.width = width;
        this.height = height;
        this.colorMode = colorMode;
        this.filtering = filtering;
        this.wrapping = wrapping;
        this.usingStb = usingStb;
    }

    public int getWidth() {
        return this.width;
    }

    public \u062c\u0634 getWrapping() {
        return this.wrapping;
    }

    public ByteBuffer getPixels() {
        return this.pixels;
    }

    public int getHeight() {
        return this.height;
    }

    public \u0632\u0622 getFiltering() {
        return this.filtering;
    }
}


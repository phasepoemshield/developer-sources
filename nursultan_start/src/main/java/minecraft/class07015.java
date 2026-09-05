/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class07037;

class class07015 {
    static final class07037[] N = new class07037[256];

    private class07015() {
    }

    static {
        for (int i = 0; i < N.length; ++i) {
            class07015.N[i] = new class07037((byte)(i - 128));
        }
    }
}


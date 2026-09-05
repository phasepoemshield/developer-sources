/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.opus4j;

public enum OpusEncoder$Application {
    VOIP(0),
    AUDIO(1),
    LOW_DELAY(2);

    private final int value;

    private OpusEncoder$Application(int n2) {
        this.value = n2;
    }
}


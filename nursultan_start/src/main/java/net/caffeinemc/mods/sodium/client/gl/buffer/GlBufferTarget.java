/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.buffer;

public enum GlBufferTarget {
    ARRAY_BUFFER(34962, 34964),
    ELEMENT_BUFFER(34963, 34965),
    COPY_READ_BUFFER(36662, 36662),
    COPY_WRITE_BUFFER(36663, 36663);

    public static final GlBufferTarget[] VALUES;
    public static final int COUNT;
    private final int target;
    private final int binding;

    private GlBufferTarget(int n2, int n3) {
        this.target = n2;
        this.binding = n3;
    }

    public int getBindingParameter() {
        return this.binding;
    }

    public int getTargetParameter() {
        return this.target;
    }

    static {
        VALUES = GlBufferTarget.values();
        COUNT = VALUES.length;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

public enum GlIndexType {
    UNSIGNED_BYTE(5121, 1),
    UNSIGNED_SHORT(5123, 2),
    UNSIGNED_INT(5125, 4);

    private final int id;
    private final int stride;

    private GlIndexType(int n2, int n3) {
        this.id = n2;
        this.stride = n3;
    }

    public int getStride() {
        return this.stride;
    }

    public int getFormatId() {
        return this.id;
    }
}


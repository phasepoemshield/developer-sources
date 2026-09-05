/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.gl.tessellation;

public enum GlPrimitiveType {
    POINTS(0),
    LINES(1),
    TRIANGLES(4),
    PATCHES(14);

    private final int id;

    private GlPrimitiveType(int n2) {
        this.id = n2;
    }

    public int getId() {
        return this.id;
    }
}


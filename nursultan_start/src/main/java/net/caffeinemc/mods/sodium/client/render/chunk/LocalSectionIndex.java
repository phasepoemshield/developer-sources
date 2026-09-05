/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

public class LocalSectionIndex {
    private static final int X_BITS = 7;
    private static final int X_OFFSET = 5;
    private static final int X_MASK = 224;
    private static final int Y_BITS = 3;
    private static final int Y_OFFSET = 0;
    private static final int Y_MASK = 3;
    private static final int Z_BITS = 7;
    private static final int Z_OFFSET = 2;
    private static final int Z_MASK = 28;

    public static int pack(int n, int n2, int n3) {
        return (n & 7) << 5 | (n2 & 3) << 0 | (n3 & 7) << 2;
    }

    public static int unpackZ(int n) {
        return n >> 2 & 7;
    }

    public static int unpackX(int n) {
        return n >> 5 & 7;
    }

    public static int unpackY(int n) {
        return n >> 0 & 3;
    }

    public static int incZ(int n) {
        return n & 0xFFFFFFE3 | n + 4 & 0x1C;
    }

    public static int decZ(int n) {
        return n & 0xFFFFFFE3 | n - 4 & 0x1C;
    }

    public static int decX(int n) {
        return n & 0xFFFFFF1F | n - 32 & 0xE0;
    }

    public static int incX(int n) {
        return n & 0xFFFFFF1F | n + 32 & 0xE0;
    }

    public static int incY(int n) {
        return n & 0xFFFFFFFC | n + 1 & 3;
    }

    public static int decY(int n) {
        return n & 0xFFFFFFFC | n - 1 & 3;
    }
}


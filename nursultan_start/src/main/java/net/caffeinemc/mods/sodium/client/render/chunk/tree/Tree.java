/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.tree;

public abstract class Tree {
    public static final int OUT_OF_BOUNDS = -1;
    public static final int NOT_PRESENT = 0;
    public static final int PRESENT = 1;
    protected final long[] tree = new long[4096];
    protected final int offsetX;
    protected final int offsetY;
    protected final int offsetZ;

    public Tree(int n, int n2, int n3) {
        this.offsetX = n;
        this.offsetY = n2;
        this.offsetZ = n3;
    }

    public boolean add(int n, int n2, int n3) {
        if (Tree.isOutOfBounds(n -= this.offsetX, n2 -= this.offsetY, n3 -= this.offsetZ)) {
            return false;
        }
        int n4 = Tree.interleave6x3(n, n2, n3);
        int n5 = n4 >> 6;
        this.tree[n5] = this.tree[n5] | 1L << (n4 & 0x3F);
        return true;
    }

    public static boolean isOutOfBounds(int n, int n2, int n3) {
        return n > 63 || n2 > 63 || n3 > 63 || n < 0 || n2 < 0 || n3 < 0;
    }

    public abstract int getPresence(int var1, int var2, int var3);

    protected static int deinterleave6(int n) {
        n &= 0x9249;
        n = (n | n >> 2) & 0x30C3;
        n = (n | n >> 4 | n >> 8) & 0x3F;
        return n;
    }

    protected static int interleave6x3(int n, int n2, int n3) {
        return Tree.interleave6(n) | Tree.interleave6(n2) << 1 | Tree.interleave6(n3) << 2;
    }

    private static int interleave6(int n) {
        n &= 0x3F;
        n = (n | n << 4 | n << 8) & 0x30C3;
        n = (n | n << 2) & 0x9249;
        return n;
    }
}


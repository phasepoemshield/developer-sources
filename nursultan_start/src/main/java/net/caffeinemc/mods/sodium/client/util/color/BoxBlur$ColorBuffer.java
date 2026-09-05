/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.color;

public class BoxBlur$ColorBuffer {
    public final int[] data;
    protected final int width;
    protected final int height;

    public BoxBlur$ColorBuffer(int n, int n2) {
        this.data = new int[n * n2];
        this.width = n;
        this.height = n2;
    }

    public int get(int n, int n2) {
        return this.data[BoxBlur$ColorBuffer.getIndex(n, n2, this.width)];
    }

    public void set(int n, int n2, int n3) {
        this.data[BoxBlur$ColorBuffer.getIndex((int)n, (int)n2, (int)this.width)] = n3;
    }

    public static int getIndex(int n, int n2, int n3) {
        return n + n2 * n3;
    }
}


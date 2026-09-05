/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.occlusion;

public class GraphDirectionSet {
    public static final int NONE = 0;
    public static final int ALL = 63;

    public static int of(int n) {
        return 1 << n;
    }

    public static boolean contains(int n, int n2) {
        return (n & GraphDirectionSet.of(n2)) != 0;
    }
}


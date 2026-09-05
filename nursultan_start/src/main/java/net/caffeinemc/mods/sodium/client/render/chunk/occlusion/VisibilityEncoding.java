/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03476
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.occlusion;

import minecraft.class03476;
import net.caffeinemc.mods.sodium.client.render.chunk.occlusion.GraphDirection;
import org.jspecify.annotations.NonNull;

public class VisibilityEncoding {
    public static final long NULL = 0L;

    private static long createMask(int n) {
        long l = 34630287489L * Integer.toUnsignedLong(n);
        return (l & 0x10101010101L) * 255L;
    }

    public static long encode(@NonNull class03476 class034762) {
        long l = 0L;
        for (int i = 0; i < 6; ++i) {
            for (int j = 0; j < 6; ++j) {
                if (!class034762.N(GraphDirection.toEnum(i), GraphDirection.toEnum(j))) continue;
                l |= 1L << VisibilityEncoding.bit(i, j);
            }
        }
        return l;
    }

    public static int bit(int n, int n2) {
        return n * 8 + n2;
    }

    public static int getConnections(long l) {
        return VisibilityEncoding.foldOutgoingDirections(l);
    }

    public static int getConnections(long l, int n) {
        return VisibilityEncoding.foldOutgoingDirections(l & VisibilityEncoding.createMask(n));
    }

    private static int foldOutgoingDirections(long l) {
        long l2 = l;
        l2 |= l2 >> 32;
        l2 |= l2 >> 16;
        l2 |= l2 >> 8;
        return (int)(l2 & 0x3FL);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

public class UInt32 {
    public static int uncheckedDowncast(long l) {
        return (int)l;
    }

    public static int downcast(long l) {
        if (l < 0L) {
            throw new IllegalArgumentException("x < 0");
        }
        if (l >= 0x100000000L) {
            throw new IllegalArgumentException("x >= (1 << 32)");
        }
        return (int)l;
    }

    public static long upcast(int n) {
        return Integer.toUnsignedLong(n);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util;

import java.nio.ByteOrder;

public class Int2 {
    public static long pack(int n, int n2) {
        if (ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN) {
            return ((long)n & 0xFFFFFFFFL) << 0 | ((long)n2 & 0xFFFFFFFFL) << 32;
        }
        return ((long)n & 0xFFFFFFFFL) << 32 | ((long)n2 & 0xFFFFFFFFL) << 0;
    }
}


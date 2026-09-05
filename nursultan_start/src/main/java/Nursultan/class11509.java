/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.github.luben.zstd.Zstd
 */
package Nursultan;

import com.github.luben.zstd.Zstd;

public class class11509 {
    public static Object N_0;

    private class11509() {
    }

    static {
        class11509.y();
    }

    private static void y() {
        N_0 = 9;
    }

    public static byte[] y(byte[] byArray) {
        return Zstd.compress((byte[])byArray, (int)9);
    }

    public static byte[] N(byte[] byArray) {
        long l = Zstd.getFrameContentSize((byte[])byArray);
        if (l <= 0L) {
            return Zstd.decompress((byte[])byArray, (int)((int)Math.max((long)byArray.length * 10L, 4096L)));
        }
        return Zstd.decompress((byte[])byArray, (int)((int)l));
    }
}


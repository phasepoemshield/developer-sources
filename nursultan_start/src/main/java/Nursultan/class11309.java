/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class class11309 {
    private static String[] N;

    private class11309() {
        throw new UnsupportedOperationException(N[0]);
    }

    static {
        class11309.y();
    }

    private static void y() {
        N = new String[1];
        class11309.N[0] = "This is a utility class and cannot be instantiated";
    }

    public static UUID N() {
        long l = System.currentTimeMillis() & 0xFFFFFFFFFFFFL;
        long l2 = ThreadLocalRandom.current().nextLong() & 0xFFFL;
        long l3 = l << 16 | 0x7000L | l2;
        long l4 = ThreadLocalRandom.current().nextLong() & 0x3FFFFFFFFFFFFFFFL | Long.MIN_VALUE;
        return new UUID(l3, l4);
    }
}


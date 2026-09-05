/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashFunction
 *  com.google.common.hash.Hashing
 *  com.google.common.primitives.Longs
 */
package minecraft;

import com.google.common.hash.HashFunction;
import com.google.common.hash.Hashing;
import com.google.common.primitives.Longs;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.atomic.AtomicLong;
import minecraft.class04037;

public final class class04043 {
    public static final long N = -7046029254386353131L;
    public static final long y = 7640891576956012809L;
    private static final HashFunction L = Hashing.md5();
    private static final AtomicLong u = new AtomicLong(8682522807148012L);

    public static class04037 L(long l) {
        return class04043.y(l).N();
    }

    public static class04037 y(long l) {
        long l2 = l ^ 0x6A09E667F3BCC909L;
        long l3 = l2 + -7046029254386353131L;
        return new class04037(l2, l3);
    }

    public static class04037 N(String string) {
        byte[] byArray = L.hashString((CharSequence)string, StandardCharsets.UTF_8).asBytes();
        long l = Longs.fromBytes((byte)byArray[0], (byte)byArray[1], (byte)byArray[2], (byte)byArray[3], (byte)byArray[4], (byte)byArray[5], (byte)byArray[6], (byte)byArray[7]);
        long l2 = Longs.fromBytes((byte)byArray[8], (byte)byArray[9], (byte)byArray[10], (byte)byArray[11], (byte)byArray[12], (byte)byArray[13], (byte)byArray[14], (byte)byArray[15]);
        return new class04037(l, l2);
    }

    public static long N() {
        return u.updateAndGet(l -> l * 1181783497276652981L) ^ System.nanoTime();
    }

    public static long N(long l) {
        l = (l ^ l >>> 30) * -4658895280553007687L;
        l = (l ^ l >>> 27) * -7723592293110705685L;
        return l ^ l >>> 31;
    }
}


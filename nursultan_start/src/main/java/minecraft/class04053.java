/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.LongStream;
import minecraft.class04037;
import minecraft.class07536;

public class class04053 {
    private long y;
    private long L;
    public static final Codec<class04053> N = Codec.LONG_STREAM.comapFlatMap(longStream -> class07536.N((LongStream)longStream, (int)2).map(lArray -> new class04053(lArray[0], lArray[1])), class040532 -> LongStream.of(class040532.y, class040532.L));

    public class04053(class04037 class040372) {
        this(class040372.y(), class040372.L());
    }

    public class04053(long l, long l2) {
        this.y = l;
        this.L = l2;
        if ((this.y | this.L) == 0L) {
            this.y = -7046029254386353131L;
            this.L = 7640891576956012809L;
        }
    }

    public long N() {
        long l = this.y;
        long l2 = this.L;
        long l3 = Long.rotateLeft(l + l2, 17) + l;
        this.y = Long.rotateLeft(l, 49) ^ (l2 ^= l) ^ l2 << 21;
        this.L = Long.rotateLeft(l2, 28);
        return l3;
    }
}


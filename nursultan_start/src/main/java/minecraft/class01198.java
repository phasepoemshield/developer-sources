/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09447
 *  minecraft.class04552
 *  minecraft.class07340
 *  minecraft.class07342
 *  net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray
 *  net.caffeinemc.mods.sodium.client.world.BitStorageExtension
 *  org.apache.commons.lang3.Validate
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09447;
import java.util.Objects;
import java.util.function.IntConsumer;
import minecraft.class04552;
import minecraft.class07340;
import minecraft.class07342;
import net.caffeinemc.mods.lithium.common.world.chunk.CompactingPackedIntegerArray;
import net.caffeinemc.mods.sodium.client.world.BitStorageExtension;
import org.apache.commons.lang3.Validate;
import org.jspecify.annotations.Nullable;

public class class01198
implements class04552,
CompactingPackedIntegerArray,
BitStorageExtension {
    private static final int[] N = new int[]{-1, -1, 0, Integer.MIN_VALUE, 0, 0, 0x55555555, 0x55555555, 0, Integer.MIN_VALUE, 0, 1, 0x33333333, 0x33333333, 0, 0x2AAAAAAA, 0x2AAAAAAA, 0, 0x24924924, 0x24924924, 0, Integer.MIN_VALUE, 0, 2, 0x1C71C71C, 0x1C71C71C, 0, 0x19999999, 0x19999999, 0, 390451572, 390451572, 0, 0x15555555, 0x15555555, 0, 0x13B13B13, 0x13B13B13, 0, 306783378, 306783378, 0, 0x11111111, 0x11111111, 0, Integer.MIN_VALUE, 0, 3, 0xF0F0F0F, 0xF0F0F0F, 0, 0xE38E38E, 0xE38E38E, 0, 226050910, 226050910, 0, 0xCCCCCCC, 0xCCCCCCC, 0, 0xC30C30C, 0xC30C30C, 0, 195225786, 195225786, 0, 186737708, 186737708, 0, 0xAAAAAAA, 0xAAAAAAA, 0, 171798691, 171798691, 0, 0x9D89D89, 0x9D89D89, 0, 159072862, 159072862, 0, 0x9249249, 0x9249249, 0, 148102320, 148102320, 0, 0x8888888, 0x8888888, 0, 138547332, 138547332, 0, Integer.MIN_VALUE, 0, 4, 130150524, 130150524, 0, 0x7878787, 0x7878787, 0, 0x7507507, 0x7507507, 0, 0x71C71C7, 0x71C71C7, 0, 116080197, 116080197, 0, 113025455, 113025455, 0, 0x6906906, 0x6906906, 0, 0x6666666, 0x6666666, 0, 104755299, 104755299, 0, 0x6186186, 0x6186186, 0, 99882960, 99882960, 0, 97612893, 97612893, 0, 0x5B05B05, 0x5B05B05, 0, 93368854, 93368854, 0, 91382282, 91382282, 0, 0x5555555, 0x5555555, 0, 87652393, 87652393, 0, 85899345, 85899345, 0, 0x5050505, 0x5050505, 0, 0x4EC4EC4, 0x4EC4EC4, 0, 81037118, 81037118, 0, 79536431, 79536431, 0, 78090314, 78090314, 0, 0x4924924, 0x4924924, 0, 75350303, 75350303, 0, 74051160, 74051160, 0, 72796055, 72796055, 0, 0x4444444, 0x4444444, 0, 70409299, 70409299, 0, 69273666, 69273666, 0, 0x4104104, 0x4104104, 0, Integer.MIN_VALUE, 0, 5};
    private final long[] y;
    private final int L;
    private final long u;
    private final int i;
    private final int R;
    private final int M;
    private final int B;
    private final int Z;

    public int L() {
        return this.L;
    }

    public class01198(int n, int n2, int[] nArray) {
        this(n, n2);
        int n3;
        int n4 = 0;
        for (n3 = 0; n3 <= n2 - this.R; n3 += this.R) {
            long l = 0L;
            for (int i = this.R - 1; i >= 0; --i) {
                l <<= n;
                l |= (long)nArray[n3 + i] & this.u;
            }
            this.y[n4++] = l;
        }
        int n5 = n2 - n3;
        if (n5 > 0) {
            long l = 0L;
            for (int i = n5 - 1; i >= 0; --i) {
                l <<= n;
                l |= (long)nArray[n3 + i] & this.u;
            }
            this.y[n4] = l;
        }
    }

    public class01198(int n, int n2, long @Nullable [] lArray) {
        Validate.inclusiveBetween((long)1L, (long)32L, (long)n);
        this.i = n2;
        this.L = n;
        this.u = (1L << n) - 1L;
        this.R = (char)(64 / n);
        int n3 = 3 * (this.R - 1);
        this.M = N[n3 + 0];
        this.B = N[n3 + 1];
        this.Z = N[n3 + 2];
        int n4 = (n2 + this.R - 1) / this.R;
        if (lArray != null) {
            if (lArray.length != n4) {
                throw new class09447("Invalid length given for storage, got: " + lArray.length + " but expected: " + n4);
            }
            this.y = lArray;
        } else {
            this.y = new long[n4];
        }
    }

    public class01198(int n, int n2) {
        this(n, n2, (long[])null);
    }

    public class04552 u() {
        return new class01198(this.L, this.i, (long[])this.y.clone());
    }

    public int y() {
        return this.i;
    }

    public void y(int n, int n2) {
        long l = n;
        long l2 = this.i - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        l = n2;
        l2 = this.u;
        l3 = 0L;
        this.N(l3, l2, l);
        int n3 = this.y(n);
        long l4 = this.y[n3];
        int n4 = (n - n3 * this.R) * this.L;
        this.y[n3] = l4 & (this.u << n4 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.u) << n4;
    }

    private int y(int n) {
        long l = Integer.toUnsignedLong(this.M);
        long l2 = Integer.toUnsignedLong(this.B);
        return (int)((long)n * l + l2 >> 32 >> this.Z);
    }

    public int N(int n, int n2) {
        long l = n;
        long l2 = this.i - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        l = n2;
        l2 = this.u;
        l3 = 0L;
        this.N(l3, l2, l);
        int n3 = this.y(n);
        long l4 = this.y[n3];
        int n4 = (n - n3 * this.R) * this.L;
        int n5 = (int)(l4 >> n4 & this.u);
        this.y[n3] = l4 & (this.u << n4 ^ 0xFFFFFFFFFFFFFFFFL) | ((long)n2 & this.u) << n4;
        return n5;
    }

    public void N(int[] nArray) {
        int n;
        long l;
        int n2;
        int n3 = this.y.length;
        int n4 = 0;
        for (n2 = 0; n2 < n3 - 1; ++n2) {
            l = this.y[n2];
            for (n = 0; n < this.R; ++n) {
                nArray[n4 + n] = (int)(l & this.u);
                l >>= this.L;
            }
            n4 += this.R;
        }
        n2 = this.i - n4;
        if (n2 > 0) {
            l = this.y[n3 - 1];
            for (n = 0; n < n2; ++n) {
                nArray[n4 + n] = (int)(l & this.u);
                l >>= this.L;
            }
        }
    }

    public void N(long l, long l2, long l3) {
    }

    public long[] N() {
        return this.y;
    }

    public int N(int n) {
        long l = n;
        long l2 = this.i - 1;
        long l3 = 0L;
        this.N(l3, l2, l);
        int n2 = this.y(n);
        long l4 = this.y[n2];
        int n3 = (n - n2 * this.R) * this.L;
        return (int)(l4 >> n3 & this.u);
    }

    public void N(IntConsumer intConsumer) {
        int n = 0;
        for (long l : this.y) {
            for (int i = 0; i < this.R; ++i) {
                intConsumer.accept((int)(l & this.u));
                l >>= this.L;
                if (++n < this.i) continue;
                return;
            }
        }
    }

    public void lithium$compact(class07340 class073402, class07340 class073403, short[] sArray) {
        if (this.i >= Short.MAX_VALUE) {
            throw new IllegalStateException("Array too large");
        }
        if (this.i != sArray.length) {
            throw new IllegalStateException("Array size mismatch");
        }
        class07342 class073422 = class07342.N();
        short[] sArray2 = new short[(int)(this.u + 1L)];
        int n = 0;
        for (long l : this.y) {
            for (int i = 0; i < this.R; ++i) {
                int n2 = (int)(l & this.u);
                int n3 = sArray2[n2];
                if (n3 == 0) {
                    n3 = class073403.method_12291(class073402.method_12288(n2), class073422) + 1;
                    sArray2[n2] = (short)n3;
                }
                sArray[n] = (short)(n3 - 1);
                l >>= this.L;
                if (++n < this.i) continue;
                return;
            }
        }
    }

    public void sodium$unpack(Object[] objectArray, class07340 class073402) {
        int n = 0;
        for (long l : this.y) {
            for (int i = 0; i < this.R; ++i) {
                objectArray[n] = Objects.requireNonNull(class073402.method_12288((int)(l & this.u)), "Palette does not contain entry for value in storage");
                l >>= this.L;
                if (++n < this.i) continue;
                return;
            }
        }
    }
}


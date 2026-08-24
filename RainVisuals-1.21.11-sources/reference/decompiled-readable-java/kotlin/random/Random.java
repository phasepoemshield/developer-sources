/*
 * Decompiled with CFR 0.152.
 */
package kotlin.random;

import java.io.Serializable;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.internal.PlatformImplementationsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.PlatformRandomKt;
import kotlin.random.RandomKt;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0006\b'\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016\u00a2\u0006\u0004\b\r\u0010\u000eJ+\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000f\u001a\u00020\u00042\b\b\u0002\u0010\u0010\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\r\u0010\u0011J\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\r\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0018J\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0014H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001e\u0010\u0007J\u001f\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\b\u001e\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010#J\u0017\u0010\"\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010$J\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u0019\u001a\u00020!2\u0006\u0010\u0017\u001a\u00020!H\u0016\u00a2\u0006\u0004\b\"\u0010%\u00a8\u0006'"}, d2={"Lkotlin/random/Random;", "", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "", "nextBoolean", "()Z", "", "array", "nextBytes", "([B)[B", "fromIndex", "toIndex", "([BII)[B", "size", "(I)[B", "", "nextDouble", "()D", "until", "(D)D", "from", "(DD)D", "", "nextFloat", "()F", "nextInt", "()I", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "Default", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public abstract class Random {
    @NotNull
    public static final Default Default = new Default(null);
    @NotNull
    private static final Random defaultRandom = PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int var1);

    public int nextInt(int until) {
        return this.nextInt(0, until);
    }

    /*
     * WARNING - void declaration
     */
    public long nextLong(long from, long until) {
        void var7_5;
        boolean bl;
        RandomKt.checkRangeBounds(from, until);
        long n = until - from;
        if (n > 0L) {
            long rnd = 0L;
            if ((n & -n) == n) {
                long l;
                int bitCount;
                int nLow = (int)n;
                int nHigh = (int)(n >>> 32);
                if (nLow != 0) {
                    bitCount = RandomKt.fastLog2(nLow);
                    l = (long)this.nextBits(bitCount) & 0xFFFFFFFFL;
                } else if (nHigh == 1) {
                    l = (long)this.nextInt() & 0xFFFFFFFFL;
                } else {
                    bitCount = RandomKt.fastLog2(nHigh);
                    l = ((long)this.nextBits(bitCount) << 32) + ((long)this.nextInt() & 0xFFFFFFFFL);
                }
                rnd = l;
            } else {
                void var9_7;
                long bits;
                long v = 0L;
                do {
                    bits = this.nextLong() >>> 1;
                    v = bits % n;
                } while (bits - v + (n - 1L) < 0L);
                rnd = var9_7;
            }
            return from + rnd;
        }
        do {
            long rnd;
            if (from <= (rnd = this.nextLong())) {
                if (rnd < until) {
                    bl = true;
                    continue;
                }
                bl = false;
                continue;
            }
            bl = false;
        } while (!bl);
        return (long)var7_5;
    }

    public int nextInt() {
        return this.nextBits(32);
    }

    @NotNull
    public byte[] nextBytes(@NotNull byte[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return this.nextBytes(array, 0, array.length);
    }

    /*
     * Unable to fully structure code
     */
    public double nextDouble(double from, double until) {
        RandomKt.checkRangeBounds(from, until);
        size = until - from;
        if (!Double.isInfinite(size)) ** GOTO lbl-1000
        var9_4 = from;
        v0 = !Double.isInfinite(var9_4) && !Double.isNaN(var9_4);
        if (!v0) ** GOTO lbl-1000
        var9_4 = until;
        v1 = !Double.isInfinite(var9_4) && !Double.isNaN(var9_4);
        if (v1) {
            r1 = this.nextDouble() * (until / (double)2 - from / (double)2);
            v2 = from + var9_4 + var9_4;
        } else lbl-1000:
        // 3 sources

        {
            v2 = from + this.nextDouble() * size;
        }
        r = v2;
        return r >= until ? Math.nextAfter(until, -Infinity) : var7_5;
    }

    public long nextLong() {
        return ((long)this.nextInt() << 32) + (long)this.nextInt();
    }

    public long nextLong(long until) {
        return this.nextLong(0L, until);
    }

    public double nextDouble() {
        return PlatformRandomKt.doubleFromParts(this.nextBits(26), this.nextBits(27));
    }

    public static /* synthetic */ byte[] nextBytes$default(Random random, byte[] byArray, int n, int n2, int n3, Object object) {
        if (object != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((n3 & 2) != 0) {
            n = 0;
        }
        if ((n3 & 4) != 0) {
            n2 = byArray.length;
        }
        return random.nextBytes(byArray, n, n2);
    }

    public double nextDouble(double until) {
        return this.nextDouble(0.0, until);
    }

    @NotNull
    public byte[] nextBytes(int size) {
        return this.nextBytes(new byte[size]);
    }

    /*
     * WARNING - void declaration
     */
    public int nextInt(int from, int until) {
        void var4_7;
        boolean bl;
        block10: {
            int n;
            int v;
            int n2;
            block9: {
                RandomKt.checkRangeBounds(from, until);
                n2 = until - from;
                if (n2 > 0) break block9;
                if (n2 != Integer.MIN_VALUE) break block10;
            }
            if ((n2 & -n2) == n2) {
                int bitCount = RandomKt.fastLog2(n2);
                n = this.nextBits(v);
            } else {
                void var5_4;
                int bits;
                v = 0;
                do {
                    bits = this.nextInt() >>> 1;
                } while (bits - (v = bits % n2) + (n2 + -1) < 0);
                n = var5_4;
            }
            int rnd = n;
            return from + rnd;
        }
        do {
            int rnd;
            if (from <= (rnd = this.nextInt())) {
                if (rnd < until) {
                    bl = true;
                    continue;
                }
                bl = false;
                continue;
            }
            bl = false;
        } while (!bl);
        return (int)var4_7;
    }

    /*
     * Unable to fully structure code
     */
    @NotNull
    public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (!new IntRange(0, array.length).contains(fromIndex)) ** GOTO lbl-1000
        if (new IntRange(0, array.length).contains(toIndex)) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        var4_4 = v0;
        if (!var4_4) {
            $i$a$-require-Random$nextBytes$1 = false;
            $i$a$-require-Random$nextBytes$1 = "fromIndex (" + fromIndex + ") or toIndex (" + toIndex + ") are out of range: 0.." + array.length + '.';
            throw new IllegalArgumentException($i$a$-require-Random$nextBytes$1.toString());
        }
        var4_4 = fromIndex <= toIndex;
        if (!var4_4) {
            $i$a$-require-Random$nextBytes$2 = false;
            $i$a$-require-Random$nextBytes$2 = "fromIndex (" + fromIndex + ") must be not greater than toIndex (" + toIndex + ").";
            throw new IllegalArgumentException(position.toString());
        }
        steps = (toIndex - fromIndex) / 4;
        position = 0;
        position = fromIndex;
        var6_10 = 0;
        while (var6_10 < steps) {
            it = var6_10;
            $i$a$-repeat-Random$nextBytes$3 = false;
            v = this.nextInt();
            array[position] = (byte)v;
            array[position + 1] = (byte)(v >>> 8);
            array[position + 2] = (byte)(v >>> 16);
            array[position + 3] = (byte)(var9_13 >>> 24);
            position += 4;
            ++remainder;
        }
        remainder = toIndex - position;
        vr = this.nextBits(remainder * 8);
        i = false;
        while (var8_12 < var6_10) {
            var1_1[var5_9 + var8_12] = (byte)(var7_11 >>> var8_12 * 8);
            ++var8_12;
        }
        return var1_1;
    }

    public float nextFloat() {
        return (float)this.nextBits(24) / 1.6777216E7f;
    }

    public boolean nextBoolean() {
        return this.nextBits(1) != 0;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0006\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001-B\t\b\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0013J\u0017\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u000f\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u001aJ\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0016H\u0016\u00a2\u0006\u0004\b\u0017\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b \u0010!J\u0017\u0010 \u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b \u0010\tJ\u001f\u0010 \u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b \u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\b$\u0010%J\u0017\u0010$\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020#H\u0016\u00a2\u0006\u0004\b$\u0010&J\u001f\u0010$\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020#2\u0006\u0010\u0019\u001a\u00020#H\u0016\u00a2\u0006\u0004\b$\u0010'J\u000f\u0010)\u001a\u00020(H\u0002\u00a2\u0006\u0004\b)\u0010*R\u0014\u0010+\u001a\u00020\u00018\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b+\u0010,\u00a8\u0006."}, d2={"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "bitCount", "nextBits", "(I)I", "", "nextBoolean", "()Z", "", "array", "nextBytes", "([B)[B", "fromIndex", "toIndex", "([BII)[B", "size", "(I)[B", "", "nextDouble", "()D", "until", "(D)D", "from", "(DD)D", "", "nextFloat", "()F", "nextInt", "()I", "(II)I", "", "nextLong", "()J", "(J)J", "(JJ)J", "", "writeReplace", "()Ljava/lang/Object;", "defaultRandom", "Lkotlin/random/Random;", "Serialized", "kotlin-stdlib"})
    public static final class Default
    extends Random
    implements Serializable {
        public /* synthetic */ Default(DefaultConstructorMarker $constructor_marker) {
            this();
        }

        @Override
        public int nextInt(int until) {
            return defaultRandom.nextInt(until);
        }

        @Override
        public float nextFloat() {
            return defaultRandom.nextFloat();
        }

        @Override
        public double nextDouble(double from, double until) {
            return defaultRandom.nextDouble(from, until);
        }

        private final Object writeReplace() {
            return Serialized.INSTANCE;
        }

        @Override
        public double nextDouble() {
            return defaultRandom.nextDouble();
        }

        @Override
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array) {
            Intrinsics.checkNotNullParameter(array, "array");
            return defaultRandom.nextBytes(array);
        }

        @Override
        public long nextLong(long until) {
            return defaultRandom.nextLong(until);
        }

        @Override
        public int nextInt(int from, int until) {
            return defaultRandom.nextInt(from, until);
        }

        private Default() {
        }

        @Override
        public long nextLong(long from, long until) {
            return defaultRandom.nextLong(from, until);
        }

        @Override
        public double nextDouble(double until) {
            return defaultRandom.nextDouble(until);
        }

        @Override
        @NotNull
        public byte[] nextBytes(@NotNull byte[] array, int fromIndex, int toIndex) {
            Intrinsics.checkNotNullParameter(array, "array");
            return defaultRandom.nextBytes(array, fromIndex, toIndex);
        }

        @Override
        public int nextInt() {
            return defaultRandom.nextInt();
        }

        @Override
        @NotNull
        public byte[] nextBytes(int size) {
            return defaultRandom.nextBytes(size);
        }

        @Override
        public int nextBits(int bitCount) {
            return defaultRandom.nextBits(bitCount);
        }

        @Override
        public long nextLong() {
            return defaultRandom.nextLong();
        }

        @Override
        public boolean nextBoolean() {
            return defaultRandom.nextBoolean();
        }

        @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u00c2\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "<init>", "()V", "", "readResolve", "()Ljava/lang/Object;", "", "serialVersionUID", "J", "kotlin-stdlib"})
        private static final class Serialized
        implements Serializable {
            private static final long serialVersionUID = 0L;
            @NotNull
            public static final Serialized INSTANCE = new Serialized();

            private Serialized() {
            }

            private final Object readResolve() {
                return Default;
            }
        }
    }
}


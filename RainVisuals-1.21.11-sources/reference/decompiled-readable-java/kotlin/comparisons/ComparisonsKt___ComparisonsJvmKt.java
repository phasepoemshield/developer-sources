/*
 * Decompiled with CFR 0.152.
 */
package kotlin.comparisons;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.comparisons.ComparisonsKt;
import kotlin.comparisons.ComparisonsKt__ComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000f\n\u0002\u0010\u000f\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\b\u0003\u001a/\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a7\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0007\u001a;\u0010\u0004\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\u00028\u0000H\u0007\u00a2\u0006\u0004\b\u0004\u0010\n\u001a \u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\f\u001a(\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\r\u001a#\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\t\u001a\u00020\u000e\"\u00020\u000bH\u0007\u00a2\u0006\u0004\b\u0004\u0010\u000f\u001a \u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0011\u001a(\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0012\u001a#\u0010\u0004\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\t\u001a\u00020\u0013\"\u00020\u0010H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0014\u001a \u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0016\u001a(\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u0017\u001a#\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u0018\"\u00020\u0015H\u0007\u00a2\u0006\u0004\b\u0004\u0010\u0019\u001a \u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001aH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u001b\u001a(\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001aH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010\u001c\u001a#\u0010\u0004\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\n\u0010\t\u001a\u00020\u001d\"\u00020\u001aH\u0007\u00a2\u0006\u0004\b\u0004\u0010\u001e\u001a \u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001fH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010 \u001a(\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001fH\u0087\b\u00a2\u0006\u0004\b\u0004\u0010!\u001a#\u0010\u0004\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\n\u0010\t\u001a\u00020\"\"\u00020\u001fH\u0007\u00a2\u0006\u0004\b\u0004\u0010#\u001a \u0010\u0004\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010%\u001a(\u0010\u0004\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020$H\u0087\b\u00a2\u0006\u0004\b\u0004\u0010&\u001a#\u0010\u0004\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\n\u0010\t\u001a\u00020'\"\u00020$H\u0007\u00a2\u0006\u0004\b\u0004\u0010(\u001a/\u0010)\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b)\u0010\u0005\u001a7\u0010)\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00028\u0000H\u0007\u00a2\u0006\u0004\b)\u0010\u0007\u001a;\u0010)\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0002\u001a\u00028\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\b\"\u00028\u0000H\u0007\u00a2\u0006\u0004\b)\u0010\n\u001a \u0010)\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b)\u0010\f\u001a(\u0010)\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u00a2\u0006\u0004\b)\u0010\r\u001a#\u0010)\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u000b2\n\u0010\t\u001a\u00020\u000e\"\u00020\u000bH\u0007\u00a2\u0006\u0004\b)\u0010\u000f\u001a \u0010)\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0011\u001a(\u0010)\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0006\u001a\u00020\u0010H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0012\u001a#\u0010)\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00102\n\u0010\t\u001a\u00020\u0013\"\u00020\u0010H\u0007\u00a2\u0006\u0004\b)\u0010\u0014\u001a \u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0016\u001a(\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b)\u0010\u0017\u001a#\u0010)\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u0018\"\u00020\u0015H\u0007\u00a2\u0006\u0004\b)\u0010\u0019\u001a \u0010)\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001aH\u0087\b\u00a2\u0006\u0004\b)\u0010\u001b\u001a(\u0010)\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\u0006\u0010\u0003\u001a\u00020\u001a2\u0006\u0010\u0006\u001a\u00020\u001aH\u0087\b\u00a2\u0006\u0004\b)\u0010\u001c\u001a#\u0010)\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u001a2\n\u0010\t\u001a\u00020\u001d\"\u00020\u001aH\u0007\u00a2\u0006\u0004\b)\u0010\u001e\u001a \u0010)\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001fH\u0087\b\u00a2\u0006\u0004\b)\u0010 \u001a(\u0010)\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0006\u001a\u00020\u001fH\u0087\b\u00a2\u0006\u0004\b)\u0010!\u001a#\u0010)\u001a\u00020\u001f2\u0006\u0010\u0002\u001a\u00020\u001f2\n\u0010\t\u001a\u00020\"\"\u00020\u001fH\u0007\u00a2\u0006\u0004\b)\u0010#\u001a \u0010)\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$H\u0087\b\u00a2\u0006\u0004\b)\u0010%\u001a(\u0010)\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020$2\u0006\u0010\u0006\u001a\u00020$H\u0087\b\u00a2\u0006\u0004\b)\u0010&\u001a#\u0010)\u001a\u00020$2\u0006\u0010\u0002\u001a\u00020$2\n\u0010\t\u001a\u00020'\"\u00020$H\u0007\u00a2\u0006\u0004\b)\u0010(\u00a8\u0006*"}, d2={"", "T", "a", "b", "maxOf", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "other", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "(BB)B", "(BBB)B", "", "(B[B)B", "", "(DD)D", "(DDD)D", "", "(D[D)D", "", "(FF)F", "(FFF)F", "", "(F[F)F", "", "(II)I", "(III)I", "", "(I[I)I", "", "(JJ)J", "(JJJ)J", "", "(J[J)J", "", "(SS)S", "(SSS)S", "", "(S[S)S", "minOf", "kotlin-stdlib"}, xs="kotlin/comparisons/ComparisonsKt")
class ComparisonsKt___ComparisonsJvmKt
extends ComparisonsKt__ComparisonsKt {
    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final int maxOf(int a2, int b2, int c) {
        return Math.max(a2, Math.max(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a2, T ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        T min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            T e = other[i];
            min = ComparisonsKt.minOf(min, e);
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final byte minOf(byte a2, byte ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        byte min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            byte e = other[i];
            min = (byte)Math.min(min, e);
        }
        return (byte)var2_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final byte minOf(byte a2, byte b2) {
        return (byte)Math.min(a2, b2);
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final int minOf(int a2, int b2, int c) {
        return Math.min(a2, Math.min(b2, c));
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final float maxOf(float a2, float b2) {
        return Math.max(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final short maxOf(short a2, short ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        short max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            short e = other[i];
            max = (short)Math.max(max, e);
        }
        return (short)var2_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final long minOf(long a2, long b2) {
        return Math.min(a2, b2);
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final short maxOf(short a2, short b2) {
        return (short)Math.max(a2, b2);
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final short minOf(short a2, short b2) {
        return (short)Math.min(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final short minOf(short a2, short ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        short min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            short e = other[i];
            min = (short)Math.min(min, e);
        }
        return (short)var2_2;
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final double minOf(double a2, double b2) {
        return Math.min(a2, b2);
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final float minOf(float a2, float b2, float c) {
        return Math.min(a2, Math.min(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final long maxOf(long a2, long ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        long max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            long e = other[i];
            max = Math.max(max, e);
        }
        return (long)var3_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final float maxOf(float a2, float b2, float c) {
        return Math.max(a2, Math.max(b2, c));
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final short minOf(short a2, short b2, short c) {
        return (short)Math.min(a2, Math.min(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final double maxOf(double a2, double ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        double max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            double e = other[i];
            max = Math.max(max, e);
        }
        return (double)var3_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final int minOf(int a2, int b2) {
        return Math.min(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final float maxOf(float a2, float ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        float max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            float e = other[i];
            max = Math.max(max, e);
        }
        return (float)var2_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final byte minOf(byte a2, byte b2, byte c) {
        return (byte)Math.min(a2, Math.min(b2, c));
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a2, @NotNull T b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a2.compareTo(b2) <= 0 ? a2 : b2;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final byte maxOf(byte a2, byte ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        byte max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            byte e = other[i];
            max = (byte)Math.max(max, e);
        }
        return (byte)var2_2;
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final long maxOf(long a2, long b2, long c) {
        return Math.max(a2, Math.max(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final int maxOf(int a2, int ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        int max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            int e = other[i];
            max = Math.max(max, e);
        }
        return (int)var2_2;
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final float minOf(float a2, float b2) {
        return Math.min(a2, b2);
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final byte maxOf(byte a2, byte b2, byte c) {
        return (byte)Math.max(a2, Math.max(b2, c));
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final byte maxOf(byte a2, byte b2) {
        return (byte)Math.max(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final int minOf(int a2, int ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        int min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            int e = other[i];
            min = Math.min(min, e);
        }
        return (int)var2_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final int maxOf(int a2, int b2) {
        return Math.max(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final long minOf(long a2, long ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        long min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            long e = other[i];
            min = Math.min(min, e);
        }
        return (long)var3_2;
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final double minOf(double a2, double b2, double c) {
        return Math.min(a2, Math.min(b2, c));
    }

    @NotNull
    @SinceKotlin(version="1.1")
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a2, @NotNull T b2, @NotNull T c) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c, "c");
        return ComparisonsKt.maxOf(a2, ComparisonsKt.maxOf(b2, c));
    }

    @InlineOnly
    @SinceKotlin(version="1.1")
    private static final double maxOf(double a2, double b2, double c) {
        return Math.max(a2, Math.max(b2, c));
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a2, @NotNull T b2) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        return a2.compareTo(b2) >= 0 ? a2 : b2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final double maxOf(double a2, double b2) {
        return Math.max(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final float minOf(float a2, float ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        float min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            float e = other[i];
            min = Math.min(min, e);
        }
        return (float)var2_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final short maxOf(short a2, short b2, short c) {
        return (short)Math.max(a2, Math.max(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    public static final double minOf(double a2, double ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        double min = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            double e = other[i];
            min = Math.min(min, e);
        }
        return (double)var3_2;
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final long minOf(long a2, long b2, long c) {
        return Math.min(a2, Math.min(b2, c));
    }

    @SinceKotlin(version="1.1")
    @NotNull
    public static final <T extends Comparable<? super T>> T minOf(@NotNull T a2, @NotNull T b2, @NotNull T c) {
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(b2, "b");
        Intrinsics.checkNotNullParameter(c, "c");
        return ComparisonsKt.minOf(a2, ComparisonsKt.minOf(b2, c));
    }

    @SinceKotlin(version="1.1")
    @InlineOnly
    private static final long maxOf(long a2, long b2) {
        return Math.max(a2, b2);
    }

    /*
     * WARNING - void declaration
     */
    @NotNull
    @SinceKotlin(version="1.4")
    public static final <T extends Comparable<? super T>> T maxOf(@NotNull T a2, T ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(a2, "a");
        Intrinsics.checkNotNullParameter(other, "other");
        T max = a2;
        int n = other.length;
        for (int i = 0; i < n; ++i) {
            T e = other[i];
            max = ComparisonsKt.maxOf(max, e);
        }
        return var2_2;
    }
}


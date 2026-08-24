/*
 * Decompiled with CFR 0.152.
 */
package kotlin.comparisons;

import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UByteArray;
import kotlin.UIntArray;
import kotlin.ULongArray;
import kotlin.UShortArray;
import kotlin.WasExperimental;
import kotlin.comparisons.UComparisonsKt;
import kotlin.internal.InlineOnly;
import kotlin.jvm.internal.Intrinsics;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=5, xi=49, d1={"\u0000@\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a(\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\n\u001a\u00020\t\"\u00020\u0000H\u0007\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u00a2\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0005\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\n\u0010\n\u001a\u00020\u0012\"\u00020\rH\u0007\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u0005\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\n\u0010\n\u001a\u00020\u001a\"\u00020\u0015H\u0007\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b\u00a2\u0006\u0004\b \u0010!\u001a#\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\n\u0010\n\u001a\u00020\"\"\u00020\u001dH\u0007\u00a2\u0006\u0004\b#\u0010$\u001a\u001f\u0010&\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\b%\u0010\u0004\u001a(\u0010&\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b'\u0010\b\u001a#\u0010&\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\n\u001a\u00020\t\"\u00020\u0000H\u0007\u00a2\u0006\u0004\b(\u0010\f\u001a\u001f\u0010&\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\rH\u0007\u00a2\u0006\u0004\b)\u0010\u000f\u001a(\u0010&\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u00a2\u0006\u0004\b*\u0010\u0011\u001a#\u0010&\u001a\u00020\r2\u0006\u0010\u0001\u001a\u00020\r2\n\u0010\n\u001a\u00020\u0012\"\u00020\rH\u0007\u00a2\u0006\u0004\b+\u0010\u0014\u001a\u001f\u0010&\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\b,\u0010\u0017\u001a(\u0010&\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u00a2\u0006\u0004\b-\u0010\u0019\u001a#\u0010&\u001a\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00152\n\u0010\n\u001a\u00020\u001a\"\u00020\u0015H\u0007\u00a2\u0006\u0004\b.\u0010\u001c\u001a\u001f\u0010&\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001dH\u0007\u00a2\u0006\u0004\b/\u0010\u001f\u001a(\u0010&\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b\u00a2\u0006\u0004\b0\u0010!\u001a#\u0010&\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u001d2\n\u0010\n\u001a\u00020\"\"\u00020\u001dH\u0007\u00a2\u0006\u0004\b1\u0010$\u00a8\u00062"}, d2={"Lkotlin/UByte;", "a", "b", "maxOf-Kr8caGY", "(BB)B", "maxOf", "c", "maxOf-b33U2AM", "(BBB)B", "Lkotlin/UByteArray;", "other", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf-Kr8caGY", "minOf", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, xs="kotlin/comparisons/UComparisonsKt")
class UComparisonsKt___UComparisonsKt {
    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final int minOf-J1ME1BU(int a2, int b2) {
        return Integer.compareUnsigned(a2, b2) <= 0 ? a2 : b2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    @InlineOnly
    private static final int minOf-WZ9TVnA(int a2, int b2, int c) {
        return UComparisonsKt.minOf-J1ME1BU(a2, UComparisonsKt.minOf-J1ME1BU(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    public static final int maxOf-Md2H83M(int a2, int ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        int max = a2;
        int n = UIntArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            int e = UIntArray.get-pVg5ArA(other, i);
            max = UComparisonsKt.maxOf-J1ME1BU(max, e);
        }
        return (int)var2_2;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long maxOf-sambcqE(long a2, long b2, long c) {
        return UComparisonsKt.maxOf-eb3DHEI(a2, UComparisonsKt.maxOf-eb3DHEI(b2, c));
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final short minOf-5PvTz6A(short a2, short b2) {
        return Intrinsics.compare(a2 & 0xFFFF, b2 & 0xFFFF) <= 0 ? a2 : b2;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final byte maxOf-b33U2AM(byte a2, byte b2, byte c) {
        return UComparisonsKt.maxOf-Kr8caGY(a2, UComparisonsKt.maxOf-Kr8caGY(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.4")
    public static final short minOf-t1qELG4(short a2, short ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        short min = a2;
        int n = UShortArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            short e = UShortArray.get-Mh2AYeg(other, i);
            min = UComparisonsKt.minOf-5PvTz6A(min, e);
        }
        return (short)var2_2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final short maxOf-5PvTz6A(short a2, short b2) {
        return Intrinsics.compare(a2 & 0xFFFF, b2 & 0xFFFF) >= 0 ? a2 : b2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final byte minOf-Kr8caGY(byte a2, byte b2) {
        return Intrinsics.compare(a2 & 0xFF, b2 & 0xFF) <= 0 ? a2 : b2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final long maxOf-eb3DHEI(long a2, long b2) {
        return Long.compareUnsigned(a2, b2) >= 0 ? a2 : b2;
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.4")
    public static final short maxOf-t1qELG4(short a2, short ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        short max = a2;
        int n = UShortArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            short e = UShortArray.get-Mh2AYeg(other, i);
            max = UComparisonsKt.maxOf-5PvTz6A(max, e);
        }
        return (short)var2_2;
    }

    @InlineOnly
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    private static final short maxOf-VKSA0NQ(short a2, short b2, short c) {
        return UComparisonsKt.maxOf-5PvTz6A(a2, UComparisonsKt.maxOf-5PvTz6A(b2, c));
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    private static final long minOf-sambcqE(long a2, long b2, long c) {
        return UComparisonsKt.minOf-eb3DHEI(a2, UComparisonsKt.minOf-eb3DHEI(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    public static final int minOf-Md2H83M(int a2, int ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        int min = a2;
        int n = UIntArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            int e = UIntArray.get-pVg5ArA(other, i);
            min = UComparisonsKt.minOf-J1ME1BU(min, e);
        }
        return (int)var2_2;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final int maxOf-J1ME1BU(int a2, int b2) {
        return Integer.compareUnsigned(a2, b2) >= 0 ? a2 : b2;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    public static final long minOf-R03FKyM(long a2, long ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        long min = a2;
        int n = ULongArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            long e = ULongArray.get-s-VKNKU(other, i);
            min = UComparisonsKt.minOf-eb3DHEI(min, e);
        }
        return (long)var3_2;
    }

    @SinceKotlin(version="1.5")
    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    public static final byte maxOf-Kr8caGY(byte a2, byte b2) {
        return Intrinsics.compare(a2 & 0xFF, b2 & 0xFF) >= 0 ? a2 : b2;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    public static final long maxOf-R03FKyM(long a2, long ... other) {
        void var3_2;
        Intrinsics.checkNotNullParameter(other, "other");
        long max = a2;
        int n = ULongArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            long e = ULongArray.get-s-VKNKU(other, i);
            max = UComparisonsKt.maxOf-eb3DHEI(max, e);
        }
        return (long)var3_2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final int maxOf-WZ9TVnA(int a2, int b2, int c) {
        return UComparisonsKt.maxOf-J1ME1BU(a2, UComparisonsKt.maxOf-J1ME1BU(b2, c));
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final short minOf-VKSA0NQ(short a2, short b2, short c) {
        return UComparisonsKt.minOf-5PvTz6A(a2, UComparisonsKt.minOf-5PvTz6A(b2, c));
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @InlineOnly
    @SinceKotlin(version="1.5")
    private static final byte minOf-b33U2AM(byte a2, byte b2, byte c) {
        return UComparisonsKt.minOf-Kr8caGY(a2, UComparisonsKt.minOf-Kr8caGY(b2, c));
    }

    /*
     * WARNING - void declaration
     */
    @ExperimentalUnsignedTypes
    @SinceKotlin(version="1.4")
    public static final byte minOf-Wr6uiD8(byte a2, byte ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        byte min = a2;
        int n = UByteArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            byte e = UByteArray.get-w2LRezQ(other, i);
            min = UComparisonsKt.minOf-Kr8caGY(min, e);
        }
        return (byte)var2_2;
    }

    @WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
    @SinceKotlin(version="1.5")
    public static final long minOf-eb3DHEI(long a2, long b2) {
        return Long.compareUnsigned(a2, b2) <= 0 ? a2 : b2;
    }

    /*
     * WARNING - void declaration
     */
    @SinceKotlin(version="1.4")
    @ExperimentalUnsignedTypes
    public static final byte maxOf-Wr6uiD8(byte a2, byte ... other) {
        void var2_2;
        Intrinsics.checkNotNullParameter(other, "other");
        byte max = a2;
        int n = UByteArray.getSize-impl(other);
        for (int i = 0; i < n; ++i) {
            byte e = UByteArray.get-w2LRezQ(other, i);
            max = UComparisonsKt.maxOf-Kr8caGY(max, e);
        }
        return (byte)var2_2;
    }
}


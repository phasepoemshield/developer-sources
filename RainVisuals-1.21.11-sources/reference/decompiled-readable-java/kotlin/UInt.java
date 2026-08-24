/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UByte;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.UnsignedKt;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087@\u0018\u0000 |2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001|B\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\n\u00a2\u0006\u0004\b\u000e\u0010\bJ\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0005J\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\b\u0017\u0010\fJ\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\bJ\u0018\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b\u001a\u0010\u001bJ\u0018\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\b\u001c\u0010\u0014J\u001a\u0010!\u001a\u00020\u001e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001dH\u00d6\u0003\u00a2\u0006\u0004\b\u001f\u0010 J\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\b\u00a2\u0006\u0004\b\"\u0010\fJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b$\u0010\bJ\u0018\u0010#\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u00a2\u0006\u0004\b%\u0010\u001bJ\u0018\u0010#\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\b\u00a2\u0006\u0004\b&\u0010\u0014J\u0010\u0010(\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\b'\u0010\u0005J\u0013\u0010*\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b)\u0010\u0005J\u0013\u0010,\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b+\u0010\u0005J\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\b-\u0010\fJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b/\u0010\bJ\u0018\u0010.\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b0\u0010\u001bJ\u0018\u0010.\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\b1\u0010\u0014J\u0018\u00104\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\nH\u0087\b\u00a2\u0006\u0004\b2\u00103J\u0018\u00104\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b5\u0010\bJ\u0018\u00104\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u00a2\u0006\u0004\b6\u0010\u001bJ\u0018\u00104\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\b\u00a2\u0006\u0004\b7\u00108J\u0018\u0010:\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\b9\u0010\bJ\u0018\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\b;\u0010\fJ\u0018\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b=\u0010\bJ\u0018\u0010<\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\b>\u0010\u001bJ\u0018\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\b?\u0010\u0014J\u0018\u0010C\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bA\u0010BJ\u0018\u0010E\u001a\u00020@2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bD\u0010BJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\bF\u0010\fJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bH\u0010\bJ\u0018\u0010G\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\bI\u0010\u001bJ\u0018\u0010G\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\bJ\u0010\u0014J\u001b\u0010M\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0002H\u0087\f\u00f8\u0001\u0000\u00a2\u0006\u0004\bL\u0010\bJ\u001b\u0010O\u001a\u00020\u00002\u0006\u0010K\u001a\u00020\u0002H\u0087\f\u00f8\u0001\u0000\u00a2\u0006\u0004\bN\u0010\bJ\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\nH\u0087\n\u00a2\u0006\u0004\bP\u0010\fJ\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bR\u0010\bJ\u0018\u0010Q\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\n\u00a2\u0006\u0004\bS\u0010\u001bJ\u0018\u0010Q\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0012H\u0087\n\u00a2\u0006\u0004\bT\u0010\u0014J\u0010\u0010X\u001a\u00020UH\u0087\b\u00a2\u0006\u0004\bV\u0010WJ\u0010\u0010\\\u001a\u00020YH\u0087\b\u00a2\u0006\u0004\bZ\u0010[J\u0010\u0010`\u001a\u00020]H\u0087\b\u00a2\u0006\u0004\b^\u0010_J\u0010\u0010b\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\ba\u0010\u0005J\u0010\u0010f\u001a\u00020cH\u0087\b\u00a2\u0006\u0004\bd\u0010eJ\u0010\u0010j\u001a\u00020gH\u0087\b\u00a2\u0006\u0004\bh\u0010iJ\u000f\u0010n\u001a\u00020kH\u0016\u00a2\u0006\u0004\bl\u0010mJ\u0013\u0010p\u001a\u00020\nH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bo\u0010WJ\u0013\u0010r\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bq\u0010\u0005J\u0013\u0010t\u001a\u00020\u000fH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bs\u0010eJ\u0013\u0010v\u001a\u00020\u0012H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bu\u0010iJ\u0018\u0010x\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\bw\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010y\u0012\u0004\bz\u0010{\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006}"}, d2={"Lkotlin/UInt;", "", "", "data", "constructor-impl", "(I)I", "other", "and-WZ4Q5Ns", "(II)I", "and", "Lkotlin/UByte;", "compareTo-7apg3OU", "(IB)I", "compareTo", "compareTo-WZ4Q5Ns", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(IJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(IS)I", "dec-pVg5ArA", "dec", "div-7apg3OU", "div", "div-WZ4Q5Ns", "div-VKZWuLQ", "(IJ)J", "div-xj2QHRw", "", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "floorDiv-7apg3OU", "floorDiv", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode-impl", "hashCode", "inc-pVg5ArA", "inc", "inv-pVg5ArA", "inv", "minus-7apg3OU", "minus", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod-7apg3OU", "(IB)B", "mod", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(IS)S", "or-WZ4Q5Ns", "or", "plus-7apg3OU", "plus", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "Lkotlin/ranges/UIntRange;", "rangeTo-WZ4Q5Ns", "(II)Lkotlin/ranges/UIntRange;", "rangeTo", "rangeUntil-WZ4Q5Ns", "rangeUntil", "rem-7apg3OU", "rem", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "bitCount", "shl-pVg5ArA", "shl", "shr-pVg5ArA", "shr", "times-7apg3OU", "times", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "", "toByte-impl", "(I)B", "toByte", "", "toDouble-impl", "(I)D", "toDouble", "", "toFloat-impl", "(I)F", "toFloat", "toInt-impl", "toInt", "", "toLong-impl", "(I)J", "toLong", "", "toShort-impl", "(I)S", "toShort", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "toUByte-w2LRezQ", "toUByte", "toUInt-pVg5ArA", "toUInt", "toULong-s-VKNKU", "toULong", "toUShort-Mh2AYeg", "toUShort", "xor-WZ4Q5Ns", "xor", "I", "getData$annotations", "()V", "Companion", "kotlin-stdlib"})
@JvmInline
@WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
@SinceKotlin(version="1.5")
public final class UInt
implements Comparable<UInt> {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private final int data;
    public static final int MIN_VALUE = 0;
    public static final int SIZE_BYTES = 4;
    public static final int SIZE_BITS = 32;
    public static final int MAX_VALUE = -1;

    @InlineOnly
    private static final UIntRange rangeTo-WZ4Q5Ns(int arg0, int other) {
        return new UIntRange(arg0, other, null);
    }

    @InlineOnly
    private static final long plus-VKZWuLQ(int arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL) + other);
    }

    @InlineOnly
    private static final int div-xj2QHRw(int arg0, short other) {
        return Integer.divideUnsigned(arg0, UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final int toInt-impl(int arg0) {
        return arg0;
    }

    @InlineOnly
    private static final int plus-7apg3OU(int arg0, byte other) {
        return UInt.constructor-impl(arg0 + UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final long times-VKZWuLQ(int arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL) * other);
    }

    public final /* synthetic */ int unbox-impl() {
        return this.data;
    }

    @InlineOnly
    private static final int div-WZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.uintDivide-J1ME1BU(arg0, other);
    }

    @InlineOnly
    private static final int minus-xj2QHRw(int arg0, short other) {
        return UInt.constructor-impl(arg0 - UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final short mod-xj2QHRw(int arg0, short other) {
        return UShort.constructor-impl((short)Integer.remainderUnsigned(arg0, UInt.constructor-impl(other & 0xFFFF)));
    }

    @InlineOnly
    private static final int plus-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 + other);
    }

    @InlineOnly
    private static final int and-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 & other);
    }

    @InlineOnly
    private static final int shl-pVg5ArA(int arg0, int bitCount) {
        return UInt.constructor-impl(arg0 << bitCount);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static int constructor-impl(int data) {
        return data;
    }

    @InlineOnly
    private static final long minus-VKZWuLQ(int arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL) - other);
    }

    public static int hashCode-impl(int arg0) {
        return Integer.hashCode(arg0);
    }

    @InlineOnly
    private static final int times-7apg3OU(int arg0, byte other) {
        return UInt.constructor-impl(arg0 * UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int compareTo-xj2QHRw(int arg0, short other) {
        return Integer.compareUnsigned(arg0, UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final float toFloat-impl(int arg0) {
        return (float)UnsignedKt.uintToDouble(arg0);
    }

    @InlineOnly
    private int compareTo-WZ4Q5Ns(int other) {
        return UnsignedKt.uintCompare(this.unbox-impl(), other);
    }

    @InlineOnly
    private static final byte mod-7apg3OU(int arg0, byte other) {
        return UByte.constructor-impl((byte)Integer.remainderUnsigned(arg0, UInt.constructor-impl(other & 0xFF)));
    }

    @InlineOnly
    private static final int inc-pVg5ArA(int arg0) {
        return UInt.constructor-impl(arg0 + 1);
    }

    @InlineOnly
    private static final int times-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 * other);
    }

    @InlineOnly
    private static final int floorDiv-7apg3OU(int arg0, byte other) {
        return Integer.divideUnsigned(arg0, UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final byte toUByte-w2LRezQ(int arg0) {
        return UByte.constructor-impl((byte)arg0);
    }

    @InlineOnly
    private static final int inv-pVg5ArA(int arg0) {
        return UInt.constructor-impl(~arg0);
    }

    @InlineOnly
    private static final int compareTo-VKZWuLQ(int arg0, long other) {
        return Long.compareUnsigned(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL), other);
    }

    @InlineOnly
    private static final int plus-xj2QHRw(int arg0, short other) {
        return UInt.constructor-impl(arg0 + UInt.constructor-impl(other & 0xFFFF));
    }

    @NotNull
    public String toString() {
        return UInt.toString-impl(this.data);
    }

    @InlineOnly
    private static final int dec-pVg5ArA(int arg0) {
        return UInt.constructor-impl(arg0 + -1);
    }

    @InlineOnly
    private static final long toLong-impl(int arg0) {
        return (long)arg0 & 0xFFFFFFFFL;
    }

    @InlineOnly
    private static final int floorDiv-xj2QHRw(int arg0, short other) {
        return Integer.divideUnsigned(arg0, UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final byte toByte-impl(int arg0) {
        return (byte)arg0;
    }

    @InlineOnly
    private static final long mod-VKZWuLQ(int arg0, long other) {
        return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL), other);
    }

    @InlineOnly
    private static final double toDouble-impl(int arg0) {
        return UnsignedKt.uintToDouble(arg0);
    }

    @InlineOnly
    private static final int compareTo-7apg3OU(int arg0, byte other) {
        return Integer.compareUnsigned(arg0, UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int xor-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 ^ other);
    }

    @InlineOnly
    private static int compareTo-WZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.uintCompare(arg0, other);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.9")
    @InlineOnly
    private static final UIntRange rangeUntil-WZ4Q5Ns(int arg0, int other) {
        return URangesKt.until-J1ME1BU(arg0, other);
    }

    @InlineOnly
    private static final long floorDiv-VKZWuLQ(int arg0, long other) {
        return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL), other);
    }

    @InlineOnly
    private static final short toUShort-Mh2AYeg(int arg0) {
        return UShort.constructor-impl((short)arg0);
    }

    @InlineOnly
    private static final int rem-WZ4Q5Ns(int arg0, int other) {
        return UnsignedKt.uintRemainder-J1ME1BU(arg0, other);
    }

    public boolean equals(Object other) {
        return UInt.equals-impl(this.data, other);
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final int mod-WZ4Q5Ns(int arg0, int other) {
        return Integer.remainderUnsigned(arg0, other);
    }

    @InlineOnly
    private static final int shr-pVg5ArA(int arg0, int bitCount) {
        return UInt.constructor-impl(arg0 >>> bitCount);
    }

    @InlineOnly
    private static final int toUInt-pVg5ArA(int arg0) {
        return arg0;
    }

    @InlineOnly
    private static final int times-xj2QHRw(int arg0, short other) {
        return UInt.constructor-impl(arg0 * UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final long div-VKZWuLQ(int arg0, long other) {
        return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL), other);
    }

    @InlineOnly
    private static final short toShort-impl(int arg0) {
        return (short)arg0;
    }

    @InlineOnly
    private static final long toULong-s-VKNKU(int arg0) {
        return ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL);
    }

    @NotNull
    public static String toString-impl(int arg0) {
        return String.valueOf((long)arg0 & 0xFFFFFFFFL);
    }

    @InlineOnly
    private static final int rem-xj2QHRw(int arg0, short other) {
        return Integer.remainderUnsigned(arg0, UInt.constructor-impl(other & 0xFFFF));
    }

    public int hashCode() {
        return UInt.hashCode-impl(this.data);
    }

    public static final /* synthetic */ UInt box-impl(int v) {
        return new UInt(v);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    private /* synthetic */ UInt(int data) {
        this.data = data;
    }

    @InlineOnly
    private static final int div-7apg3OU(int arg0, byte other) {
        return Integer.divideUnsigned(arg0, UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int minus-7apg3OU(int arg0, byte other) {
        return UInt.constructor-impl(arg0 - UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int floorDiv-WZ4Q5Ns(int arg0, int other) {
        return Integer.divideUnsigned(arg0, other);
    }

    @InlineOnly
    private static final long rem-VKZWuLQ(int arg0, long other) {
        return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 0xFFFFFFFFL), other);
    }

    public static boolean equals-impl(int arg0, Object other) {
        if (!(other instanceof UInt)) {
            return false;
        }
        int n = ((UInt)other).unbox-impl();
        if (arg0 != n) {
            return false;
        }
        return true;
    }

    @InlineOnly
    private static final int or-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 | other);
    }

    @InlineOnly
    private static final int rem-7apg3OU(int arg0, byte other) {
        return Integer.remainderUnsigned(arg0, UInt.constructor-impl(other & 0xFF));
    }

    public static final boolean equals-impl0(int p1, int p2) {
        return p1 == p2;
    }

    @InlineOnly
    private static final int minus-WZ4Q5Ns(int arg0, int other) {
        return UInt.constructor-impl(arg0 - other);
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\n\u0010\u0006\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u000b"}, d2={"Lkotlin/UInt$Companion;", "", "<init>", "()V", "Lkotlin/UInt;", "MAX_VALUE", "I", "MIN_VALUE", "", "SIZE_BITS", "SIZE_BYTES", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}


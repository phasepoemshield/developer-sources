/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.ExperimentalStdlibApi;
import kotlin.ExperimentalUnsignedTypes;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.UShort;
import kotlin.WasExperimental;
import kotlin.internal.InlineOnly;
import kotlin.internal.IntrinsicConstEvaluation;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.UIntRange;
import kotlin.ranges.URangesKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@JvmInline
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u0005\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0087@\u0018\u0000 w2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001wB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0000H\u0097\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\r\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u0018\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0005J\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b\u0019\u0010\fJ\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\b\u001b\u0010\u0010J\u0018\u0010\u001a\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\b\u001e\u0010\u0016J\u001a\u0010#\u001a\u00020 2\b\u0010\u0006\u001a\u0004\u0018\u00010\u001fH\u00d6\u0003\u00a2\u0006\u0004\b!\u0010\"J\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b$\u0010\fJ\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b&\u0010\u0010J\u0018\u0010%\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u00a2\u0006\u0004\b'\u0010\u001dJ\u0018\u0010%\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\b\u00a2\u0006\u0004\b(\u0010\u0016J\u0010\u0010+\u001a\u00020\nH\u00d6\u0001\u00a2\u0006\u0004\b)\u0010*J\u0013\u0010-\u001a\u00020\u0000H\u0087\n\u00f8\u0001\u0000\u00a2\u0006\u0004\b,\u0010\u0005J\u0013\u0010/\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b.\u0010\u0005J\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b0\u0010\fJ\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\b2\u0010\u0010J\u0018\u00101\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\b3\u0010\u001dJ\u0018\u00101\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\b4\u0010\u0016J\u0018\u00106\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\b\u00a2\u0006\u0004\b5\u0010\bJ\u0018\u00106\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\b\u00a2\u0006\u0004\b7\u0010\u0010J\u0018\u00106\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u00a2\u0006\u0004\b8\u0010\u001dJ\u0018\u00106\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\b\u00a2\u0006\u0004\b9\u0010:J\u0018\u0010<\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\b;\u0010\bJ\u0018\u0010>\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\b=\u0010\fJ\u0018\u0010>\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\b?\u0010\u0010J\u0018\u0010>\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\b@\u0010\u001dJ\u0018\u0010>\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\bA\u0010\u0016J\u0018\u0010E\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bC\u0010DJ\u0018\u0010G\u001a\u00020B2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bF\u0010DJ\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bH\u0010\fJ\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\bJ\u0010\u0010J\u0018\u0010I\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\bK\u0010\u001dJ\u0018\u0010I\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\bL\u0010\u0016J\u0018\u0010N\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\n\u00a2\u0006\u0004\bM\u0010\fJ\u0018\u0010N\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u000eH\u0087\n\u00a2\u0006\u0004\bO\u0010\u0010J\u0018\u0010N\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\n\u00a2\u0006\u0004\bP\u0010\u001dJ\u0018\u0010N\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0014H\u0087\n\u00a2\u0006\u0004\bQ\u0010\u0016J\u0010\u0010S\u001a\u00020\u0002H\u0087\b\u00a2\u0006\u0004\bR\u0010\u0005J\u0010\u0010W\u001a\u00020TH\u0087\b\u00a2\u0006\u0004\bU\u0010VJ\u0010\u0010[\u001a\u00020XH\u0087\b\u00a2\u0006\u0004\bY\u0010ZJ\u0010\u0010]\u001a\u00020\nH\u0087\b\u00a2\u0006\u0004\b\\\u0010*J\u0010\u0010a\u001a\u00020^H\u0087\b\u00a2\u0006\u0004\b_\u0010`J\u0010\u0010e\u001a\u00020bH\u0087\b\u00a2\u0006\u0004\bc\u0010dJ\u000f\u0010i\u001a\u00020fH\u0016\u00a2\u0006\u0004\bg\u0010hJ\u0013\u0010k\u001a\u00020\u0000H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bj\u0010\u0005J\u0013\u0010m\u001a\u00020\u000eH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bl\u0010*J\u0013\u0010o\u001a\u00020\u0011H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bn\u0010`J\u0013\u0010q\u001a\u00020\u0014H\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\bp\u0010dJ\u0018\u0010s\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000H\u0087\f\u00a2\u0006\u0004\br\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0081\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010t\u0012\u0004\bu\u0010v\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006x"}, d2={"Lkotlin/UByte;", "", "", "data", "constructor-impl", "(B)B", "other", "and-7apg3OU", "(BB)B", "and", "", "compareTo-7apg3OU", "(BB)I", "compareTo", "Lkotlin/UInt;", "compareTo-WZ4Q5Ns", "(BI)I", "Lkotlin/ULong;", "compareTo-VKZWuLQ", "(BJ)I", "Lkotlin/UShort;", "compareTo-xj2QHRw", "(BS)I", "dec-w2LRezQ", "dec", "div-7apg3OU", "div", "div-WZ4Q5Ns", "div-VKZWuLQ", "(BJ)J", "div-xj2QHRw", "", "", "equals-impl", "(BLjava/lang/Object;)Z", "equals", "floorDiv-7apg3OU", "floorDiv", "floorDiv-WZ4Q5Ns", "floorDiv-VKZWuLQ", "floorDiv-xj2QHRw", "hashCode-impl", "(B)I", "hashCode", "inc-w2LRezQ", "inc", "inv-w2LRezQ", "inv", "minus-7apg3OU", "minus", "minus-WZ4Q5Ns", "minus-VKZWuLQ", "minus-xj2QHRw", "mod-7apg3OU", "mod", "mod-WZ4Q5Ns", "mod-VKZWuLQ", "mod-xj2QHRw", "(BS)S", "or-7apg3OU", "or", "plus-7apg3OU", "plus", "plus-WZ4Q5Ns", "plus-VKZWuLQ", "plus-xj2QHRw", "Lkotlin/ranges/UIntRange;", "rangeTo-7apg3OU", "(BB)Lkotlin/ranges/UIntRange;", "rangeTo", "rangeUntil-7apg3OU", "rangeUntil", "rem-7apg3OU", "rem", "rem-WZ4Q5Ns", "rem-VKZWuLQ", "rem-xj2QHRw", "times-7apg3OU", "times", "times-WZ4Q5Ns", "times-VKZWuLQ", "times-xj2QHRw", "toByte-impl", "toByte", "", "toDouble-impl", "(B)D", "toDouble", "", "toFloat-impl", "(B)F", "toFloat", "toInt-impl", "toInt", "", "toLong-impl", "(B)J", "toLong", "", "toShort-impl", "(B)S", "toShort", "", "toString-impl", "(B)Ljava/lang/String;", "toString", "toUByte-w2LRezQ", "toUByte", "toUInt-pVg5ArA", "toUInt", "toULong-s-VKNKU", "toULong", "toUShort-Mh2AYeg", "toUShort", "xor-7apg3OU", "xor", "B", "getData$annotations", "()V", "Companion", "kotlin-stdlib"})
@WasExperimental(markerClass={ExperimentalUnsignedTypes.class})
@SinceKotlin(version="1.5")
public final class UByte
implements Comparable<UByte> {
    public static final int SIZE_BITS = 8;
    public static final byte MAX_VALUE = -1;
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final byte MIN_VALUE = 0;
    public static final int SIZE_BYTES = 1;
    private final byte data;

    @InlineOnly
    private static final long times-VKZWuLQ(byte arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFL) * other);
    }

    public final /* synthetic */ byte unbox-impl() {
        return this.data;
    }

    @InlineOnly
    private static final byte inv-w2LRezQ(byte arg0) {
        return UByte.constructor-impl(~arg0);
    }

    @InlineOnly
    private static final byte mod-7apg3OU(byte arg0, byte other) {
        return UByte.constructor-impl((byte)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF)));
    }

    @InlineOnly
    private static final long floorDiv-VKZWuLQ(byte arg0, long other) {
        return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 0xFFL), other);
    }

    @InlineOnly
    private static final long toLong-impl(byte arg0) {
        return (long)arg0 & 0xFFL;
    }

    @InlineOnly
    private static final short toShort-impl(byte arg0) {
        return (short)((short)arg0 & 0xFF);
    }

    @InlineOnly
    private static final long minus-VKZWuLQ(byte arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFL) - other);
    }

    @InlineOnly
    private static final int floorDiv-xj2QHRw(byte arg0, short other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final byte toByte-impl(byte arg0) {
        return arg0;
    }

    @InlineOnly
    private static final int rem-WZ4Q5Ns(byte arg0, int other) {
        return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), other);
    }

    @InlineOnly
    private static final int minus-xj2QHRw(byte arg0, short other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) - UInt.constructor-impl(other & 0xFFFF));
    }

    public static final /* synthetic */ UByte box-impl(byte v) {
        return new UByte(v);
    }

    @InlineOnly
    private static final byte toUByte-w2LRezQ(byte arg0) {
        return arg0;
    }

    @InlineOnly
    private static final byte inc-w2LRezQ(byte arg0) {
        return UByte.constructor-impl((byte)(arg0 + 1));
    }

    @InlineOnly
    private static final int toUInt-pVg5ArA(byte arg0) {
        return UInt.constructor-impl(arg0 & 0xFF);
    }

    @InlineOnly
    private static final int div-xj2QHRw(byte arg0, short other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final int plus-xj2QHRw(byte arg0, short other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) + UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final UIntRange rangeTo-7apg3OU(byte arg0, byte other) {
        return new UIntRange(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF), null);
    }

    @InlineOnly
    private static final byte xor-7apg3OU(byte arg0, byte other) {
        return UByte.constructor-impl((byte)(arg0 ^ other));
    }

    @InlineOnly
    private static final int plus-WZ4Q5Ns(byte arg0, int other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) + other);
    }

    @WasExperimental(markerClass={ExperimentalStdlibApi.class})
    @SinceKotlin(version="1.9")
    @InlineOnly
    private static final UIntRange rangeUntil-7apg3OU(byte arg0, byte other) {
        return URangesKt.until-J1ME1BU(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final long div-VKZWuLQ(byte arg0, long other) {
        return Long.divideUnsigned(ULong.constructor-impl((long)arg0 & 0xFFL), other);
    }

    @InlineOnly
    private static final byte or-7apg3OU(byte arg0, byte other) {
        return UByte.constructor-impl((byte)(arg0 | other));
    }

    @InlineOnly
    private static final int floorDiv-7apg3OU(byte arg0, byte other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int div-WZ4Q5Ns(byte arg0, int other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), other);
    }

    @IntrinsicConstEvaluation
    @PublishedApi
    private /* synthetic */ UByte(byte data) {
        this.data = data;
    }

    @InlineOnly
    private static final int rem-xj2QHRw(byte arg0, short other) {
        return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final long toULong-s-VKNKU(byte arg0) {
        return ULong.constructor-impl((long)arg0 & 0xFFL);
    }

    @PublishedApi
    @IntrinsicConstEvaluation
    public static byte constructor-impl(byte data) {
        return data;
    }

    @InlineOnly
    private static final int compareTo-xj2QHRw(byte arg0, short other) {
        return Intrinsics.compare(arg0 & 0xFF, other & 0xFFFF);
    }

    @InlineOnly
    private static final int div-7apg3OU(byte arg0, byte other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int times-xj2QHRw(byte arg0, short other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) * UInt.constructor-impl(other & 0xFFFF));
    }

    @InlineOnly
    private static final int times-7apg3OU(byte arg0, byte other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) * UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int compareTo-WZ4Q5Ns(byte arg0, int other) {
        return Integer.compareUnsigned(UInt.constructor-impl(arg0 & 0xFF), other);
    }

    @InlineOnly
    private static int compareTo-7apg3OU(byte arg0, byte other) {
        return Intrinsics.compare(arg0 & 0xFF, other & 0xFF);
    }

    @InlineOnly
    private static final short toUShort-Mh2AYeg(byte arg0) {
        return UShort.constructor-impl((short)((short)arg0 & 0xFF));
    }

    @InlineOnly
    private static final int plus-7apg3OU(byte arg0, byte other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) + UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final int minus-WZ4Q5Ns(byte arg0, int other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) - other);
    }

    public boolean equals(Object other) {
        return UByte.equals-impl(this.data, other);
    }

    @NotNull
    public String toString() {
        return UByte.toString-impl(this.data);
    }

    public static int hashCode-impl(byte arg0) {
        return Byte.hashCode(arg0);
    }

    @InlineOnly
    private static final byte and-7apg3OU(byte arg0, byte other) {
        return UByte.constructor-impl((byte)(arg0 & other));
    }

    @PublishedApi
    public static /* synthetic */ void getData$annotations() {
    }

    @InlineOnly
    private static final int minus-7apg3OU(byte arg0, byte other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) - UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private static final long mod-VKZWuLQ(byte arg0, long other) {
        return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 0xFFL), other);
    }

    @InlineOnly
    private static final int mod-WZ4Q5Ns(byte arg0, int other) {
        return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), other);
    }

    @InlineOnly
    private static final int floorDiv-WZ4Q5Ns(byte arg0, int other) {
        return Integer.divideUnsigned(UInt.constructor-impl(arg0 & 0xFF), other);
    }

    @InlineOnly
    private static final float toFloat-impl(byte arg0) {
        return arg0 & 0xFF;
    }

    @InlineOnly
    private static final long rem-VKZWuLQ(byte arg0, long other) {
        return Long.remainderUnsigned(ULong.constructor-impl((long)arg0 & 0xFFL), other);
    }

    @InlineOnly
    private static final byte dec-w2LRezQ(byte arg0) {
        return UByte.constructor-impl((byte)(arg0 + -1));
    }

    @InlineOnly
    private static final double toDouble-impl(byte arg0) {
        return arg0 & 0xFF;
    }

    @InlineOnly
    private static final int times-WZ4Q5Ns(byte arg0, int other) {
        return UInt.constructor-impl(UInt.constructor-impl(arg0 & 0xFF) * other);
    }

    @InlineOnly
    private static final int rem-7apg3OU(byte arg0, byte other) {
        return Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFF));
    }

    @InlineOnly
    private int compareTo-7apg3OU(byte other) {
        return Intrinsics.compare(this.unbox-impl() & 0xFF, other & 0xFF);
    }

    public int hashCode() {
        return UByte.hashCode-impl(this.data);
    }

    public static boolean equals-impl(byte arg0, Object other) {
        if (!(other instanceof UByte)) {
            return false;
        }
        byte by = ((UByte)other).unbox-impl();
        if (arg0 != by) {
            return false;
        }
        return true;
    }

    public static final boolean equals-impl0(byte p1, byte p2) {
        return p1 == p2;
    }

    @InlineOnly
    private static final int compareTo-VKZWuLQ(byte arg0, long other) {
        return Long.compareUnsigned(ULong.constructor-impl((long)arg0 & 0xFFL), other);
    }

    @InlineOnly
    private static final long plus-VKZWuLQ(byte arg0, long other) {
        return ULong.constructor-impl(ULong.constructor-impl((long)arg0 & 0xFFL) + other);
    }

    @InlineOnly
    private static final int toInt-impl(byte arg0) {
        return arg0 & 0xFF;
    }

    @NotNull
    public static String toString-impl(byte arg0) {
        return String.valueOf(arg0 & 0xFF);
    }

    @InlineOnly
    private static final short mod-xj2QHRw(byte arg0, short other) {
        return UShort.constructor-impl((short)Integer.remainderUnsigned(UInt.constructor-impl(arg0 & 0xFF), UInt.constructor-impl(other & 0xFFFF)));
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\b8\u0006X\u0086T\u00a2\u0006\u0006\n\u0004\b\u000b\u0010\n\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\f"}, d2={"Lkotlin/UByte$Companion;", "", "<init>", "()V", "Lkotlin/UByte;", "MAX_VALUE", "B", "MIN_VALUE", "", "SIZE_BITS", "I", "SIZE_BYTES", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}


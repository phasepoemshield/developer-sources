/*
 * Decompiled with CFR 0.152.
 */
package kotlin;

import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.UInt;
import kotlin.ULong;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000.\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\b\u0006\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\bH\u0001\u00a2\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\r\u0010\f\u001a\u001f\u0010\u0010\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u000f\u0010\f\u001a\u0017\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\bH\u0001\u00a2\u0006\u0004\b\u0011\u0010\u0012\u001a\u001f\u0010\u0014\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a\u001f\u0010\u0018\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u001a\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\b\u0019\u0010\u0017\u001a\u0017\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0013H\u0001\u00a2\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0013H\u0000\u00a2\u0006\u0004\b\u001e\u0010\u001f\u001a\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\bH\u0000\u00a2\u0006\u0004\b\u001e\u0010!\u00a8\u0006\""}, d2={"", "v", "Lkotlin/UInt;", "doubleToUInt", "(D)I", "Lkotlin/ULong;", "doubleToULong", "(D)J", "", "v1", "v2", "uintCompare", "(II)I", "uintDivide-J1ME1BU", "uintDivide", "uintRemainder-J1ME1BU", "uintRemainder", "uintToDouble", "(I)D", "", "ulongCompare", "(JJ)I", "ulongDivide-eb3DHEI", "(JJ)J", "ulongDivide", "ulongRemainder-eb3DHEI", "ulongRemainder", "ulongToDouble", "(J)D", "", "ulongToString", "(J)Ljava/lang/String;", "base", "(JI)Ljava/lang/String;", "kotlin-stdlib"})
@JvmName(name="UnsignedKt")
public final class UnsignedKt {
    @PublishedApi
    public static final long doubleToULong(double v) {
        return Double.isNaN(v) ? 0L : (v <= UnsignedKt.ulongToDouble(0L) ? 0L : (v >= UnsignedKt.ulongToDouble(-1L) ? -1L : (v < 9.223372036854776E18 ? ULong.constructor-impl((long)v) : ULong.constructor-impl(ULong.constructor-impl((long)(v - 9.223372036854776E18)) + Long.MIN_VALUE))));
    }

    @PublishedApi
    public static final int doubleToUInt(double v) {
        return Double.isNaN(v) ? 0 : (v <= UnsignedKt.uintToDouble(0) ? 0 : (v >= UnsignedKt.uintToDouble(-1) ? -1 : (v <= 2.147483647E9 ? UInt.constructor-impl((int)v) : UInt.constructor-impl(UInt.constructor-impl((int)(v - (double)Integer.MAX_VALUE)) + UInt.constructor-impl(Integer.MAX_VALUE)))));
    }

    @NotNull
    public static final String ulongToString(long v) {
        return UnsignedKt.ulongToString(v, 10);
    }

    @PublishedApi
    public static final double ulongToDouble(long v) {
        return (double)(v >>> 11) * (double)2048 + (double)(v & 0x7FFL);
    }

    @PublishedApi
    public static final long ulongDivide-eb3DHEI(long v1, long v2) {
        long quotient;
        long dividend = v1;
        long divisor = v2;
        if (divisor < 0L) {
            return Long.compareUnsigned(v1, v2) < 0 ? ULong.constructor-impl(0L) : ULong.constructor-impl(1L);
        }
        if (dividend >= 0L) {
            return ULong.constructor-impl(dividend / divisor);
        }
        long rem = dividend - (quotient = (dividend >>> 1) / divisor << 1) * divisor;
        return ULong.constructor-impl(quotient + (long)(Long.compareUnsigned(ULong.constructor-impl(rem), ULong.constructor-impl(divisor)) >= 0 ? 1 : 0));
    }

    @PublishedApi
    public static final int uintRemainder-J1ME1BU(int v1, int v2) {
        return UInt.constructor-impl((int)(((long)v1 & 0xFFFFFFFFL) % ((long)v2 & 0xFFFFFFFFL)));
    }

    @NotNull
    public static final String ulongToString(long v, int base) {
        if (v >= 0L) {
            String string = Long.toString(v, CharsKt.checkRadix(base));
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long quotient = (v >>> 1) / (long)base << 1;
        long rem = v - quotient * (long)base;
        if (rem >= (long)base) {
            rem -= (long)base;
            ++quotient;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String string = Long.toString(quotient, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        StringBuilder stringBuilder2 = stringBuilder.append(string);
        String string2 = Long.toString(rem, CharsKt.checkRadix(base));
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return stringBuilder2.append(string2).toString();
    }

    @PublishedApi
    public static final double uintToDouble(int v) {
        return (double)(v & Integer.MAX_VALUE) + (double)(v >>> 31 << 30) * (double)2;
    }

    @PublishedApi
    public static final int uintDivide-J1ME1BU(int v1, int v2) {
        return UInt.constructor-impl((int)(((long)v1 & 0xFFFFFFFFL) / ((long)v2 & 0xFFFFFFFFL)));
    }

    @PublishedApi
    public static final long ulongRemainder-eb3DHEI(long v1, long v2) {
        long rem;
        long dividend = v1;
        long divisor = v2;
        if (divisor < 0L) {
            return Long.compareUnsigned(v1, v2) < 0 ? v1 : ULong.constructor-impl(v1 - v2);
        }
        if (dividend >= 0L) {
            return ULong.constructor-impl(dividend % divisor);
        }
        long quotient = (dividend >>> 1) / divisor << 1;
        return ULong.constructor-impl(rem - (Long.compareUnsigned(ULong.constructor-impl(rem = dividend - quotient * divisor), ULong.constructor-impl(divisor)) >= 0 ? divisor : 0L));
    }

    @PublishedApi
    public static final int uintCompare(int v1, int v2) {
        return Intrinsics.compare(v1 ^ Integer.MIN_VALUE, v2 ^ Integer.MIN_VALUE);
    }

    @PublishedApi
    public static final int ulongCompare(long v1, long v2) {
        return Intrinsics.compare(v1 ^ Long.MIN_VALUE, v2 ^ Long.MIN_VALUE);
    }
}


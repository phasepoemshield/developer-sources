/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000\u001e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\b\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002\u00a2\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\b\f\u0010\r\u001a'\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u000f\u0010\r\u001a'\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\b\u0013\u0010\u0014\u001a'\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0017\u0010\u0014\u001a'\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0000\u00a2\u0006\u0004\b\u001a\u0010\u0014\u001a\u0014\u0010\u001c\u001a\u00020\u001b*\u00020\u0000H\u0080\b\u00a2\u0006\u0004\b\u001c\u0010\u001d\u00a8\u0006\u001e"}, d2={"", "value", "Lkotlin/time/Duration;", "duration", "durationInUnit", "checkInfiniteSumDefined-PjuGub4", "(JJJ)J", "checkInfiniteSumDefined", "infinityOfSign", "(J)J", "Lkotlin/time/DurationUnit;", "unit", "saturatingAdd-NuflL3o", "(JLkotlin/time/DurationUnit;J)J", "saturatingAdd", "saturatingAddInHalves-NuflL3o", "saturatingAddInHalves", "valueNs", "origin", "saturatingDiff", "(JJLkotlin/time/DurationUnit;)J", "value1", "value2", "saturatingFiniteDiff", "origin1", "origin2", "saturatingOriginsDiff", "", "isSaturated", "(J)Z", "kotlin-stdlib"})
public final class LongSaturatedMathKt {
    private static final long infinityOfSign(long value) {
        return value < 0L ? Duration.Companion.getNEG_INFINITE-UwyO8pc$kotlin_stdlib() : Duration.Companion.getINFINITE-UwyO8pc();
    }

    /*
     * WARNING - void declaration
     */
    public static final long saturatingAdd-NuflL3o(long value, @NotNull DurationUnit unit, long duration) {
        void var7_4;
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long durationInUnit = Duration.toLong-impl(duration, unit);
        long $this$isSaturated$iv = value;
        boolean $i$f$isSaturated = false;
        boolean bl = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl) {
            return LongSaturatedMathKt.checkInfiniteSumDefined-PjuGub4(value, duration, durationInUnit);
        }
        $this$isSaturated$iv = durationInUnit;
        $i$f$isSaturated = false;
        boolean bl2 = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl2) {
            return LongSaturatedMathKt.saturatingAddInHalves-NuflL3o(value, unit, duration);
        }
        long result = value + durationInUnit;
        if (((value ^ result) & (durationInUnit ^ result)) < 0L) {
            return value < 0L ? Long.MIN_VALUE : Long.MAX_VALUE;
        }
        return (long)var7_4;
    }

    /*
     * WARNING - void declaration
     */
    private static final long saturatingAddInHalves-NuflL3o(long value, DurationUnit unit, long duration) {
        void var5_3;
        void var3_2;
        long halfInUnit;
        long half = Duration.div-UwyO8pc(duration, 2);
        long $this$isSaturated$iv = halfInUnit = Duration.toLong-impl(half, unit);
        boolean $i$f$isSaturated = false;
        boolean bl = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl) {
            return halfInUnit;
        }
        return LongSaturatedMathKt.saturatingAdd-NuflL3o(LongSaturatedMathKt.saturatingAdd-NuflL3o(value, unit, half), unit, Duration.minus-LRDsOJo((long)var3_2, (long)var5_3));
    }

    private static final long checkInfiniteSumDefined-PjuGub4(long value, long duration, long durationInUnit) {
        long l;
        if (Duration.isInfinite-impl(duration)) {
            if ((value ^ durationInUnit) < 0L) {
                throw new IllegalArgumentException("Summing infinities of different signs");
            }
        }
        return l;
    }

    /*
     * WARNING - void declaration
     */
    public static final long saturatingOriginsDiff(long origin1, long origin2, @NotNull DurationUnit unit) {
        void var4_1;
        void var2_2;
        long l;
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long $this$isSaturated$iv = origin2;
        boolean $i$f$isSaturated = false;
        boolean bl = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl) {
            if (origin1 == origin2) {
                return Duration.Companion.getZERO-UwyO8pc();
            }
            return Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.infinityOfSign(origin2));
        }
        $this$isSaturated$iv = origin1;
        $i$f$isSaturated = false;
        boolean bl2 = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl2) {
            return LongSaturatedMathKt.infinityOfSign(origin1);
        }
        return LongSaturatedMathKt.saturatingFiniteDiff(l, (long)var2_2, (DurationUnit)var4_1);
    }

    public static final boolean isSaturated(long $this$isSaturated) {
        boolean $i$f$isSaturated = false;
        return ($this$isSaturated - 1L | 1L) == Long.MAX_VALUE;
    }

    private static final long saturatingFiniteDiff(long value1, long value2, DurationUnit unit) {
        long result = value1 - value2;
        if (((result ^ value1) & (result ^ value2 ^ 0xFFFFFFFFFFFFFFFFL)) < 0L) {
            if (unit.compareTo((Enum)DurationUnit.MILLISECONDS) < 0) {
                long unitsInMilli = DurationUnitKt.convertDurationUnit(1L, DurationUnit.MILLISECONDS, unit);
                long resultMs = value1 / unitsInMilli - value2 / unitsInMilli;
                long resultUnit = value1 % unitsInMilli - value2 % unitsInMilli;
                return Duration.plus-LRDsOJo(DurationKt.toDuration(resultMs, DurationUnit.MILLISECONDS), DurationKt.toDuration(resultUnit, unit));
            }
            return Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.infinityOfSign(result));
        }
        return DurationKt.toDuration(result, unit);
    }

    public static final long saturatingDiff(long valueNs, long origin, @NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        long $this$isSaturated$iv = origin;
        boolean $i$f$isSaturated = false;
        boolean bl = ($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE;
        if (bl) {
            return Duration.unaryMinus-UwyO8pc(LongSaturatedMathKt.infinityOfSign(origin));
        }
        return LongSaturatedMathKt.saturatingFiniteDiff(valueNs, origin, unit);
    }
}


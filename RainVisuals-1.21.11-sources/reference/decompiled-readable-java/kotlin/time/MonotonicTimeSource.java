/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.time.DurationUnit;
import kotlin.time.LongSaturatedMathKt;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u00c1\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004\u00a2\u0006\u0004\b\r\u0010\tJ\u0015\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0014\u001a\u00020\u0004H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0013J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u001c"}, d2={"Lkotlin/time/MonotonicTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "<init>", "()V", "Lkotlin/time/TimeSource$Monotonic$ValueTimeMark;", "timeMark", "Lkotlin/time/Duration;", "duration", "adjustReading-6QKq23U", "(JJ)J", "adjustReading", "one", "another", "differenceBetween-fRLX17w", "differenceBetween", "elapsedFrom-6eNON_k", "(J)J", "elapsedFrom", "markNow-z9LOYto", "()J", "markNow", "", "read", "", "toString", "()Ljava/lang/String;", "zero", "J", "kotlin-stdlib"})
@SinceKotlin(version="1.3")
public final class MonotonicTimeSource
implements TimeSource.WithComparableMarks {
    @NotNull
    public static final MonotonicTimeSource INSTANCE = new MonotonicTimeSource();
    private static final long zero = System.nanoTime();

    private MonotonicTimeSource() {
    }

    public long markNow-z9LOYto() {
        return TimeSource.Monotonic.ValueTimeMark.constructor-impl(this.read());
    }

    public final long adjustReading-6QKq23U(long timeMark, long duration) {
        return TimeSource.Monotonic.ValueTimeMark.constructor-impl(LongSaturatedMathKt.saturatingAdd-NuflL3o(timeMark, DurationUnit.NANOSECONDS, duration));
    }

    @NotNull
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }

    private final long read() {
        return System.nanoTime() - zero;
    }

    public final long elapsedFrom-6eNON_k(long timeMark) {
        return LongSaturatedMathKt.saturatingDiff(this.read(), timeMark, DurationUnit.NANOSECONDS);
    }

    public final long differenceBetween-fRLX17w(long one, long another) {
        return LongSaturatedMathKt.saturatingOriginsDiff(one, another, DurationUnit.NANOSECONDS);
    }
}


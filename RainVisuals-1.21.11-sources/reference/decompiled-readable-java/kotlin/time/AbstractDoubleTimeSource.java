/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ComparableTimeMark;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
import kotlin.time.ExperimentalTime;
import kotlin.time.TimeSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0007\b'\u0018\u00002\u00020\u0001:\u0001\u000fB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH$\u00a2\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0004X\u0084\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u0010"}, d2={"Lkotlin/time/AbstractDoubleTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "Lkotlin/time/DurationUnit;", "unit", "<init>", "(Lkotlin/time/DurationUnit;)V", "Lkotlin/time/ComparableTimeMark;", "markNow", "()Lkotlin/time/ComparableTimeMark;", "", "read", "()D", "Lkotlin/time/DurationUnit;", "getUnit", "()Lkotlin/time/DurationUnit;", "DoubleTimeMark", "kotlin-stdlib"})
@Deprecated(message="Using AbstractDoubleTimeSource is no longer recommended, use AbstractLongTimeSource instead.")
@SinceKotlin(version="1.3")
@ExperimentalTime
public abstract class AbstractDoubleTimeSource
implements TimeSource.WithComparableMarks {
    @NotNull
    private final DurationUnit unit;

    @NotNull
    protected final DurationUnit getUnit() {
        return this.unit;
    }

    public AbstractDoubleTimeSource(@NotNull DurationUnit unit) {
        Intrinsics.checkNotNullParameter((Object)unit, "unit");
        this.unit = unit;
    }

    protected abstract double read();

    @Override
    @NotNull
    public ComparableTimeMark markNow() {
        return new DoubleTimeMark(this.read(), this, Duration.Companion.getZERO-UwyO8pc(), null);
    }

    /*
     * Illegal identifiers - consider using --renameillegalidents true
     */
    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\b\u0010\tJ\u0012\u0010\f\u001a\u00020\u0006H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u001b\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0001H\u0096\u0002\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001b\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0006H\u0096\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016\u00a2\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00f8\u0001\u0000\u00a2\u0006\u0006\n\u0004\b\u0007\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010 R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0005\u0010!\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\""}, d2={"Lkotlin/time/AbstractDoubleTimeSource$DoubleTimeMark;", "Lkotlin/time/ComparableTimeMark;", "", "startedAt", "Lkotlin/time/AbstractDoubleTimeSource;", "timeSource", "Lkotlin/time/Duration;", "offset", "<init>", "(DLkotlin/time/AbstractDoubleTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "minus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "plus", "", "toString", "()Ljava/lang/String;", "J", "D", "Lkotlin/time/AbstractDoubleTimeSource;", "kotlin-stdlib"})
    private static final class DoubleTimeMark
    implements ComparableTimeMark {
        private final long offset;
        private final double startedAt;
        @NotNull
        private final AbstractDoubleTimeSource timeSource;

        private DoubleTimeMark(double startedAt, AbstractDoubleTimeSource timeSource, long offset) {
            Intrinsics.checkNotNullParameter(timeSource, "timeSource");
            this.startedAt = startedAt;
            this.timeSource = timeSource;
            this.offset = offset;
        }

        @Override
        public int compareTo(@NotNull ComparableTimeMark other) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, other);
        }

        @Override
        public long minus-UwyO8pc(@NotNull ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if (!(other instanceof DoubleTimeMark) || !Intrinsics.areEqual(this.timeSource, ((DoubleTimeMark)other).timeSource)) {
                throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
            }
            if (Duration.equals-impl0(this.offset, ((DoubleTimeMark)other).offset) && Duration.isInfinite-impl(this.offset)) {
                return Duration.Companion.getZERO-UwyO8pc();
            }
            long offsetDiff = Duration.minus-LRDsOJo(this.offset, ((DoubleTimeMark)other).offset);
            long startedAtDiff = DurationKt.toDuration(this.startedAt - ((DoubleTimeMark)other).startedAt, this.timeSource.getUnit());
            return Duration.equals-impl0(startedAtDiff, Duration.unaryMinus-UwyO8pc(offsetDiff)) ? Duration.Companion.getZERO-UwyO8pc() : Duration.plus-LRDsOJo(startedAtDiff, offsetDiff);
        }

        @Override
        @NotNull
        public ComparableTimeMark minus-LRDsOJo(long duration) {
            return ComparableTimeMark.DefaultImpls.minus-LRDsOJo(this, duration);
        }

        @Override
        public int hashCode() {
            return Duration.hashCode-impl(Duration.plus-LRDsOJo(DurationKt.toDuration(this.startedAt, this.timeSource.getUnit()), this.offset));
        }

        @Override
        public boolean equals(@Nullable Object other) {
            return other instanceof DoubleTimeMark && Intrinsics.areEqual(this.timeSource, ((DoubleTimeMark)other).timeSource) && Duration.equals-impl0(this.minus-UwyO8pc((ComparableTimeMark)other), Duration.Companion.getZERO-UwyO8pc());
        }

        public /* synthetic */ DoubleTimeMark(double startedAt, AbstractDoubleTimeSource timeSource, long offset, DefaultConstructorMarker $constructor_marker) {
            this(startedAt, timeSource, offset);
        }

        @Override
        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        @Override
        public long elapsedNow-UwyO8pc() {
            return Duration.minus-LRDsOJo(DurationKt.toDuration(this.timeSource.read() - this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        @Override
        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        @NotNull
        public String toString() {
            return "DoubleTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + Duration.toString-impl(this.offset) + ", " + this.timeSource + ')';
        }

        @Override
        @NotNull
        public ComparableTimeMark plus-LRDsOJo(long duration) {
            return new DoubleTimeMark(this.startedAt, this.timeSource, Duration.plus-LRDsOJo(this.offset, duration), null);
        }
    }
}


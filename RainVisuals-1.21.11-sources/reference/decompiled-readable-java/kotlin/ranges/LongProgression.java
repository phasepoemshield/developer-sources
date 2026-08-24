/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.collections.LongIterator;
import kotlin.internal.ProgressionUtilKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.ranges.LongProgressionIterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001fB!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0096\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001e\u0010\u001b\u00a8\u0006 "}, d2={"Lkotlin/ranges/LongProgression;", "", "", "start", "endInclusive", "step", "<init>", "(JJJ)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isEmpty", "()Z", "Lkotlin/collections/LongIterator;", "iterator", "()Lkotlin/collections/LongIterator;", "", "toString", "()Ljava/lang/String;", "first", "J", "getFirst", "()J", "last", "getLast", "getStep", "Companion", "kotlin-stdlib"})
public class LongProgression
implements Iterable<Long>,
KMappedMarker {
    private final long step;
    private final long last;
    private final long first;
    @NotNull
    public static final Companion Companion = new Companion(null);

    public int hashCode() {
        return this.isEmpty() ? -1 : (int)((long)31 * ((long)31 * (this.first ^ this.first >>> 32) + (this.last ^ this.last >>> 32)) + (this.step ^ this.step >>> 32));
    }

    public LongProgression(long start, long endInclusive, long step) {
        if (step == 0L) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (step == Long.MIN_VALUE) {
            throw new IllegalArgumentException("Step must be greater than Long.MIN_VALUE to avoid overflow on negation.");
        }
        this.first = start;
        this.last = ProgressionUtilKt.getProgressionLastElement(start, endInclusive, step);
        this.step = step;
    }

    @NotNull
    public String toString() {
        return this.step > 0L ? this.first + ".." + this.last + " step " + this.step : this.first + " downTo " + this.last + " step " + -this.step;
    }

    public boolean isEmpty() {
        return this.step > 0L ? this.first > this.last : this.first < this.last;
    }

    @NotNull
    public LongIterator iterator() {
        return new LongProgressionIterator(this.first, this.last, this.step);
    }

    public final long getStep() {
        return this.step;
    }

    public boolean equals(@Nullable Object other) {
        return other instanceof LongProgression && (this.isEmpty() && ((LongProgression)other).isEmpty() || this.first == ((LongProgression)other).first && this.last == ((LongProgression)other).last && this.step == ((LongProgression)other).step);
    }

    public final long getLast() {
        return this.last;
    }

    public final long getFirst() {
        return this.first;
    }

    @Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2={"Lkotlin/ranges/LongProgression$Companion;", "", "<init>", "()V", "", "rangeStart", "rangeEnd", "step", "Lkotlin/ranges/LongProgression;", "fromClosedRange", "(JJJ)Lkotlin/ranges/LongProgression;", "kotlin-stdlib"})
    public static final class Companion {
        private Companion() {
        }

        @NotNull
        public final LongProgression fromClosedRange(long rangeStart, long rangeEnd, long step) {
            return new LongProgression(rangeStart, rangeEnd, step);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker $constructor_marker) {
            this();
        }
    }
}


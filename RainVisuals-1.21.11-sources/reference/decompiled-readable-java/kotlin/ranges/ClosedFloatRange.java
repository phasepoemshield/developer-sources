/*
 * Decompiled with CFR 0.152.
 */
package kotlin.ranges;

import kotlin.Metadata;
import kotlin.ranges.ClosedFloatingPointRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H\u0096\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\bH\u0016\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016\u00a2\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u0004\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b \u0010\u001f\u00a8\u0006!"}, d2={"Lkotlin/ranges/ClosedFloatRange;", "Lkotlin/ranges/ClosedFloatingPointRange;", "", "start", "endInclusive", "<init>", "(FF)V", "value", "", "contains", "(F)Z", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "isEmpty", "()Z", "a", "b", "lessThanOrEquals", "(FF)Z", "", "toString", "()Ljava/lang/String;", "_endInclusive", "F", "_start", "getEndInclusive", "()Ljava/lang/Float;", "getStart", "kotlin-stdlib"})
final class ClosedFloatRange
implements ClosedFloatingPointRange<Float> {
    private final float _endInclusive;
    private final float _start;

    @Override
    @NotNull
    public Float getEndInclusive() {
        return Float.valueOf(this._endInclusive);
    }

    @Override
    public boolean isEmpty() {
        return !(this._start <= this._endInclusive);
    }

    @NotNull
    public String toString() {
        return this._start + ".." + this._endInclusive;
    }

    public ClosedFloatRange(float start, float endInclusive) {
        this._start = start;
        this._endInclusive = endInclusive;
    }

    @Override
    @NotNull
    public Float getStart() {
        return Float.valueOf(this._start);
    }

    @Override
    public boolean lessThanOrEquals(float a2, float b2) {
        return a2 <= b2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ClosedFloatRange)) return false;
        if (this.isEmpty()) {
            if (((ClosedFloatRange)other).isEmpty()) return true;
        }
        if (this._start != ((ClosedFloatRange)other)._start) return false;
        boolean bl = true;
        if (!bl) return false;
        if (this._endInclusive != ((ClosedFloatRange)other)._endInclusive) return false;
        return true;
    }

    @Override
    public boolean contains(float value) {
        return value >= this._start && value <= this._endInclusive;
    }

    public int hashCode() {
        return this.isEmpty() ? -1 : 31 * Float.hashCode(this._start) + Float.hashCode(this._endInclusive);
    }
}


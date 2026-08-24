/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.TimeMark;
import org.jetbrains.annotations.NotNull;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\t\u001a\u00020\u0003H\u0016\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\r\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0003H\u0096\u0002\u00a2\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u00038\u0006\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b\u0004\u0010\u000e\u001a\u0004\b\u000f\u0010\bR\u0017\u0010\u0002\u001a\u00020\u00018\u0006\u00a2\u0006\f\n\u0004\b\u0002\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u0013"}, d2={"Lkotlin/time/AdjustedTimeMark;", "Lkotlin/time/TimeMark;", "mark", "Lkotlin/time/Duration;", "adjustment", "<init>", "(Lkotlin/time/TimeMark;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "elapsedNow-UwyO8pc", "()J", "elapsedNow", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/TimeMark;", "plus", "J", "getAdjustment-UwyO8pc", "Lkotlin/time/TimeMark;", "getMark", "()Lkotlin/time/TimeMark;", "kotlin-stdlib"})
final class AdjustedTimeMark
implements TimeMark {
    private final long adjustment;
    @NotNull
    private final TimeMark mark;

    private AdjustedTimeMark(TimeMark mark, long adjustment) {
        Intrinsics.checkNotNullParameter(mark, "mark");
        this.mark = mark;
        this.adjustment = adjustment;
    }

    @Override
    public long elapsedNow-UwyO8pc() {
        return Duration.minus-LRDsOJo(this.mark.elapsedNow-UwyO8pc(), this.adjustment);
    }

    @NotNull
    public final TimeMark getMark() {
        return this.mark;
    }

    @Override
    public boolean hasPassedNow() {
        return TimeMark.DefaultImpls.hasPassedNow(this);
    }

    public final long getAdjustment-UwyO8pc() {
        return this.adjustment;
    }

    public /* synthetic */ AdjustedTimeMark(TimeMark mark, long adjustment, DefaultConstructorMarker $constructor_marker) {
        this(mark, adjustment);
    }

    @Override
    public boolean hasNotPassedNow() {
        return TimeMark.DefaultImpls.hasNotPassedNow(this);
    }

    @Override
    @NotNull
    public TimeMark plus-LRDsOJo(long duration) {
        return new AdjustedTimeMark(this.mark, Duration.plus-LRDsOJo(this.adjustment, duration), null);
    }

    @Override
    @NotNull
    public TimeMark minus-LRDsOJo(long duration) {
        return TimeMark.DefaultImpls.minus-LRDsOJo(this, duration);
    }
}


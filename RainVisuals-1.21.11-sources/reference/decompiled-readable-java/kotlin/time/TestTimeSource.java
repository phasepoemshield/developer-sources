/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.time.AbstractLongTimeSource;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.DurationUnitKt;
import kotlin.time.ExperimentalTime;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0086\u0002\u00a2\u0006\u0004\b\n\u0010\bJ\u000f\u0010\r\u001a\u00020\fH\u0014\u00a2\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0011"}, d2={"Lkotlin/time/TestTimeSource;", "Lkotlin/time/AbstractLongTimeSource;", "<init>", "()V", "Lkotlin/time/Duration;", "duration", "", "overflow-LRDsOJo", "(J)V", "overflow", "plusAssign-LRDsOJo", "plusAssign", "", "read", "()J", "reading", "J", "kotlin-stdlib"})
@WasExperimental(markerClass={ExperimentalTime.class})
@SinceKotlin(version="1.9")
public final class TestTimeSource
extends AbstractLongTimeSource {
    private long reading;

    public TestTimeSource() {
        super(DurationUnit.NANOSECONDS);
        this.markNow();
    }

    @Override
    protected long read() {
        return this.reading;
    }

    /*
     * WARNING - void declaration
     */
    public final void plusAssign-LRDsOJo(long duration) {
        long longDelta;
        long $this$isSaturated$iv = longDelta = Duration.toLong-impl(duration, this.getUnit());
        boolean $i$f$isSaturated = false;
        if (!(($this$isSaturated$iv - 1L | 1L) == Long.MAX_VALUE)) {
            long newReading = this.reading + longDelta;
            if ((this.reading ^ longDelta) >= 0L) {
                if ((this.reading ^ newReading) < 0L) {
                    this.overflow-LRDsOJo(duration);
                }
            }
            this.reading = newReading;
        } else {
            long half = Duration.div-UwyO8pc(duration, 2);
            long $this$isSaturated$iv2 = Duration.toLong-impl(half, this.getUnit());
            boolean $i$f$isSaturated2 = false;
            if (!(($this$isSaturated$iv2 - 1L | 1L) == Long.MAX_VALUE)) {
                long readingBefore = this.reading;
                try {
                    this.plusAssign-LRDsOJo(half);
                    this.plusAssign-LRDsOJo(Duration.minus-LRDsOJo(duration, half));
                }
                catch (IllegalStateException illegalStateException) {
                    void var7_5;
                    this.reading = var7_5;
                    throw illegalStateException;
                }
            } else {
                void var1_1;
                this.overflow-LRDsOJo((long)var1_1);
            }
        }
    }

    private final void overflow-LRDsOJo(long duration) {
        throw new IllegalStateException("TestTimeSource will overflow if its reading " + this.reading + DurationUnitKt.shortName(this.getUnit()) + " is advanced by " + Duration.toString-impl(duration) + '.');
    }
}


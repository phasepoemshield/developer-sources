/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00028\u0000H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u0004H\u00c6\u0003\u00f8\u0001\u0000\u00a2\u0006\u0004\b\n\u0010\u000bJ*\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u00c6\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u00d6\u0003\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014H\u00d6\u0001\u00a2\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017H\u00d6\u0001\u00a2\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0006\u00f8\u0001\u0000\u00a2\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0003\u001a\u00028\u00008\u0006\u00a2\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\t\u0082\u0002\u0004\n\u0002\b!\u00a8\u0006\u001e"}, d2={"Lkotlin/time/TimedValue;", "T", "", "value", "Lkotlin/time/Duration;", "duration", "<init>", "(Ljava/lang/Object;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "component1", "()Ljava/lang/Object;", "component2-UwyO8pc", "()J", "component2", "copy-RFiDyg4", "(Ljava/lang/Object;J)Lkotlin/time/TimedValue;", "copy", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "J", "getDuration-UwyO8pc", "Ljava/lang/Object;", "getValue", "kotlin-stdlib"})
@SinceKotlin(version="1.9")
@WasExperimental(markerClass={ExperimentalTime.class})
public final class TimedValue<T> {
    private final T value;
    private final long duration;

    @NotNull
    public final TimedValue<T> copy-RFiDyg4(T value, long duration) {
        return new TimedValue<T>(value, duration, null);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimedValue)) {
            return false;
        }
        TimedValue timedValue = (TimedValue)other;
        if (!Intrinsics.areEqual(this.value, timedValue.value)) {
            return false;
        }
        if (!Duration.equals-impl0(this.duration, timedValue.duration)) {
            return false;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public int hashCode() {
        void var1_1;
        int result = this.value == null ? 0 : this.value.hashCode();
        result = result * 31 + Duration.hashCode-impl(this.duration);
        return (int)var1_1;
    }

    public /* synthetic */ TimedValue(Object value, long duration, DefaultConstructorMarker $constructor_marker) {
        this(value, duration);
    }

    private TimedValue(T value, long duration) {
        this.value = value;
        this.duration = duration;
    }

    public final long getDuration-UwyO8pc() {
        return this.duration;
    }

    public final long component2-UwyO8pc() {
        return this.duration;
    }

    public final T getValue() {
        return this.value;
    }

    public static /* synthetic */ TimedValue copy-RFiDyg4$default(TimedValue timedValue, Object object, long l, int n, Object object2) {
        if ((n & 1) != 0) {
            object = timedValue.value;
        }
        if ((n & 2) != 0) {
            l = timedValue.duration;
        }
        return timedValue.copy-RFiDyg4(object, l);
    }

    public final T component1() {
        return this.value;
    }

    @NotNull
    public String toString() {
        return "TimedValue(value=" + this.value + ", duration=" + Duration.toString-impl(this.duration) + ')';
    }
}


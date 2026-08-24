/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.Unit;
import kotlin.WasExperimental;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.ExperimentalTime;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlin.time.TimedValue;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a.\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0004\u0010\u0005\u001a:\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u00062\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\b\u0010\t\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0004\u0010\u000b\u001a2\u0010\u0004\u001a\u00020\u0003*\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\u0004\u0010\r\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u00020\n2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\b\u0010\u000e\u001a>\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\u0004\b\u0000\u0010\u0006*\u00020\f2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0087\b\u00f8\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0001 \u0001\u00a2\u0006\u0004\b\b\u0010\u000f\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u0010"}, d2={"Lkotlin/Function0;", "", "block", "Lkotlin/time/Duration;", "measureTime", "(Lkotlin/jvm/functions/Function0;)J", "T", "Lkotlin/time/TimedValue;", "measureTimedValue", "(Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "Lkotlin/time/TimeSource;", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)J", "Lkotlin/time/TimeSource$Monotonic;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)J", "(Lkotlin/time/TimeSource;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "(Lkotlin/time/TimeSource$Monotonic;Lkotlin/jvm/functions/Function0;)Lkotlin/time/TimedValue;", "kotlin-stdlib"})
public final class MeasureTimeKt {
    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.9")
    public static final long measureTime(@NotNull TimeSource $this$measureTime, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTime = false;
        TimeMark mark = $this$measureTime.markNow();
        block.invoke();
        return mark.elapsedNow-UwyO8pc();
    }

    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.9")
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource.Monotonic $this$measureTimedValue, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTimedValue = false;
        long mark = $this$measureTimedValue.markNow-z9LOYto();
        T result = block.invoke();
        return new TimedValue(result, TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark), null);
    }

    @SinceKotlin(version="1.9")
    @NotNull
    @WasExperimental(markerClass={ExperimentalTime.class})
    public static final <T> TimedValue<T> measureTimedValue(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTimedValue = false;
        TimeSource.Monotonic $this$measureTimedValue$iv = TimeSource.Monotonic.INSTANCE;
        boolean $i$f$measureTimedValue2 = false;
        long mark$iv = $this$measureTimedValue$iv.markNow-z9LOYto();
        T result$iv = block.invoke();
        return new TimedValue(result$iv, TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark$iv), null);
    }

    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalTime.class})
    public static final long measureTime(@NotNull TimeSource.Monotonic $this$measureTime, @NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter($this$measureTime, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTime = false;
        long mark = $this$measureTime.markNow-z9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark);
    }

    @WasExperimental(markerClass={ExperimentalTime.class})
    @SinceKotlin(version="1.9")
    public static final long measureTime(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTime = false;
        TimeSource.Monotonic $this$measureTime$iv = TimeSource.Monotonic.INSTANCE;
        boolean $i$f$measureTime2 = false;
        long mark$iv = $this$measureTime$iv.markNow-z9LOYto();
        block.invoke();
        return TimeSource.Monotonic.ValueTimeMark.elapsedNow-UwyO8pc(mark$iv);
    }

    @SinceKotlin(version="1.9")
    @WasExperimental(markerClass={ExperimentalTime.class})
    @NotNull
    public static final <T> TimedValue<T> measureTimedValue(@NotNull TimeSource $this$measureTimedValue, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter($this$measureTimedValue, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        boolean $i$f$measureTimedValue = false;
        TimeMark mark = $this$measureTimedValue.markNow();
        T result = block.invoke();
        return new TimedValue(result, mark.elapsedNow-UwyO8pc(), null);
    }
}


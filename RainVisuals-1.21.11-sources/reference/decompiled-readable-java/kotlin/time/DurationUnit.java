/*
 * Decompiled with CFR 0.152.
 */
package kotlin.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.WasExperimental;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.time.ExperimentalTime;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={1, 9, 0}, k=1, xi=48, d1={"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004\u00a2\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f\u00a8\u0006\u0010"}, d2={"Lkotlin/time/DurationUnit;", "", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "<init>", "(Ljava/lang/String;ILjava/util/concurrent/TimeUnit;)V", "Ljava/util/concurrent/TimeUnit;", "getTimeUnit$kotlin_stdlib", "()Ljava/util/concurrent/TimeUnit;", "NANOSECONDS", "MICROSECONDS", "MILLISECONDS", "SECONDS", "MINUTES", "HOURS", "DAYS", "kotlin-stdlib"})
@WasExperimental(markerClass={ExperimentalTime.class})
@SinceKotlin(version="1.6")
public final class DurationUnit
extends Enum<DurationUnit> {
    public static final /* enum */ DurationUnit HOURS;
    public static final /* enum */ DurationUnit MINUTES;
    public static final /* enum */ DurationUnit SECONDS;
    public static final /* enum */ DurationUnit NANOSECONDS;
    public static final /* enum */ DurationUnit DAYS;
    private static final /* synthetic */ EnumEntries $ENTRIES;
    @NotNull
    private final TimeUnit timeUnit;
    public static final /* enum */ DurationUnit MICROSECONDS;
    private static final /* synthetic */ DurationUnit[] $VALUES;
    public static final /* enum */ DurationUnit MILLISECONDS;

    @NotNull
    public static EnumEntries<DurationUnit> getEntries() {
        return $ENTRIES;
    }

    private static final /* synthetic */ DurationUnit[] $values() {
        DurationUnit[] durationUnitArray = new DurationUnit[7];
        durationUnitArray[0] = NANOSECONDS;
        durationUnitArray[1] = MICROSECONDS;
        durationUnitArray[2] = MILLISECONDS;
        durationUnitArray[3] = SECONDS;
        durationUnitArray[4] = MINUTES;
        durationUnitArray[5] = HOURS;
        durationUnitArray[6] = DAYS;
        return durationUnitArray;
    }

    static {
        NANOSECONDS = new DurationUnit(TimeUnit.NANOSECONDS);
        MICROSECONDS = new DurationUnit(TimeUnit.MICROSECONDS);
        MILLISECONDS = new DurationUnit(TimeUnit.MILLISECONDS);
        SECONDS = new DurationUnit(TimeUnit.SECONDS);
        MINUTES = new DurationUnit(TimeUnit.MINUTES);
        HOURS = new DurationUnit(TimeUnit.HOURS);
        DAYS = new DurationUnit(TimeUnit.DAYS);
        $VALUES = DurationUnit.$values();
        $ENTRIES = EnumEntriesKt.enumEntries((Enum[])$VALUES);
    }

    @NotNull
    public final TimeUnit getTimeUnit$kotlin_stdlib() {
        return this.timeUnit;
    }

    private DurationUnit(TimeUnit timeUnit) {
        this.timeUnit = timeUnit;
    }

    public static DurationUnit valueOf(String value) {
        return Enum.valueOf(DurationUnit.class, value);
    }

    public static DurationUnit[] values() {
        return (DurationUnit[])$VALUES.clone();
    }
}


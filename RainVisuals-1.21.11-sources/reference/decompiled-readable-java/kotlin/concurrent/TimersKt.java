/*
 * Decompiled with CFR 0.152.
 */
package kotlin.concurrent;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.Unit;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv={1, 9, 0}, k=2, xi=48, d1={"\u00002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\u001aT\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u000f\u001aV\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u000e\u0010\u0011\u001a!\u0010\u0012\u001a\u00020\r2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013\u001aT\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u000f\u001aV\u0010\u0012\u001a\u00020\r2\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0012\u0010\u0011\u001a.\u0010\u0014\u001a\u00020\t2\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0014\u0010\u0015\u001a:\u0010\u0017\u001a\u00020\t*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0018\u001aB\u0010\u0017\u001a\u00020\t*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u0019\u001a:\u0010\u0017\u001a\u00020\t*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u001b\u001aB\u0010\u0017\u001a\u00020\t*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u0017\u0010\u001c\u001aB\u0010\u001d\u001a\u00020\t*\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u0019\u001aB\u0010\u001d\u001a\u00020\t*\u00020\r2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0019\b\u0004\u0010\f\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u00a2\u0006\u0002\b\u000bH\u0087\b\u00f8\u0001\u0000\u00a2\u0006\u0004\b\u001d\u0010\u001c\u0082\u0002\u0007\n\u0005\b\u009920\u0001\u00a8\u0006\u001e"}, d2={"", "name", "", "daemon", "Ljava/util/Date;", "startAt", "", "period", "Lkotlin/Function1;", "Ljava/util/TimerTask;", "", "Lkotlin/ExtensionFunctionType;", "action", "Ljava/util/Timer;", "fixedRateTimer", "(Ljava/lang/String;ZLjava/util/Date;JLkotlin/jvm/functions/Function1;)Ljava/util/Timer;", "initialDelay", "(Ljava/lang/String;ZJJLkotlin/jvm/functions/Function1;)Ljava/util/Timer;", "timer", "(Ljava/lang/String;Z)Ljava/util/Timer;", "timerTask", "(Lkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "time", "schedule", "(Ljava/util/Timer;Ljava/util/Date;Lkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "(Ljava/util/Timer;Ljava/util/Date;JLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "delay", "(Ljava/util/Timer;JLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "(Ljava/util/Timer;JJLkotlin/jvm/functions/Function1;)Ljava/util/TimerTask;", "scheduleAtFixedRate", "kotlin-stdlib"})
@JvmName(name="TimersKt")
public final class TimersKt {
    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Timer fixedRateTimer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int n, Object object) {
        void var6_6;
        void var3_3;
        if ((n & 1) != 0) {
            name = null;
        }
        if ((n & 2) != 0) {
            daemon = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = TimersKt.timer(name, daemon);
        object = timer;
        TimerTask timerTask2 = new TimerTask(action){
            final /* synthetic */ Function1<TimerTask, Unit> $action;

            public void run() {
                this.$action.invoke(this);
            }
            {
                this.$action = $action;
            }
        };
        ((Timer)object).scheduleAtFixedRate(timerTask2, startAt, (long)var3_3);
        return var6_6;
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action) {
        Timer timer;
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer2 = timer = TimersKt.timer(name, daemon);
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        timer2.scheduleAtFixedRate(timerTask2, initialDelay, period);
        return timer;
    }

    @InlineOnly
    private static final Timer fixedRateTimer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action) {
        Timer timer;
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer2 = timer = TimersKt.timer(name, daemon);
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        timer2.scheduleAtFixedRate(timerTask2, startAt, period);
        return timer;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer $this$schedule, Date time, long period, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter($this$schedule, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$schedule.schedule(task, time, period);
        return task;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Timer timer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int n, Object object) {
        void var7_6;
        if ((n & 1) != 0) {
            name = null;
        }
        if ((n & 2) != 0) {
            daemon = false;
        }
        if ((n & 4) != 0) {
            initialDelay = 0L;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = TimersKt.timer(name, daemon);
        object = timer;
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        ((Timer)object).schedule(timerTask2, initialDelay, period);
        return var7_6;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Timer timer$default(String name, boolean daemon, Date startAt, long period, Function1 action, int n, Object object) {
        void var6_6;
        void var3_3;
        if ((n & 1) != 0) {
            name = null;
        }
        if ((n & 2) != 0) {
            daemon = false;
        }
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = TimersKt.timer(name, daemon);
        object = timer;
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        ((Timer)object).schedule(timerTask2, startAt, (long)var3_3);
        return var6_6;
    }

    @InlineOnly
    private static final Timer timer(String name, boolean daemon, Date startAt, long period, Function1<? super TimerTask, Unit> action) {
        Timer timer;
        Intrinsics.checkNotNullParameter(startAt, "startAt");
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer2 = timer = TimersKt.timer(name, daemon);
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        timer2.schedule(timerTask2, startAt, period);
        return timer;
    }

    /*
     * WARNING - void declaration
     */
    static /* synthetic */ Timer fixedRateTimer$default(String name, boolean daemon, long initialDelay, long period, Function1 action, int n, Object object) {
        void var7_6;
        if ((n & 1) != 0) {
            name = null;
        }
        if ((n & 2) != 0) {
            daemon = false;
        }
        if ((n & 4) != 0) {
            initialDelay = 0L;
        }
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer = TimersKt.timer(name, daemon);
        object = timer;
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        ((Timer)object).scheduleAtFixedRate(timerTask2, initialDelay, period);
        return var7_6;
    }

    @InlineOnly
    private static final TimerTask timerTask(Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter(action, "action");
        return new /* invalid duplicate definition of identical inner class */;
    }

    /*
     * WARNING - void declaration
     */
    @InlineOnly
    private static final TimerTask schedule(Timer $this$schedule, Date time, Function1<? super TimerTask, Unit> action) {
        void var3_3;
        Intrinsics.checkNotNullParameter($this$schedule, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$schedule.schedule(task, time);
        return var3_3;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer $this$schedule, long delay, long period, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter($this$schedule, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$schedule.schedule(task, delay, period);
        return task;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer $this$scheduleAtFixedRate, Date time, long period, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter($this$scheduleAtFixedRate, "<this>");
        Intrinsics.checkNotNullParameter(time, "time");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$scheduleAtFixedRate.scheduleAtFixedRate(task, time, period);
        return task;
    }

    @InlineOnly
    private static final Timer timer(String name, boolean daemon, long initialDelay, long period, Function1<? super TimerTask, Unit> action) {
        Timer timer;
        Intrinsics.checkNotNullParameter(action, "action");
        Timer timer2 = timer = TimersKt.timer(name, daemon);
        TimerTask timerTask2 = new /* invalid duplicate definition of identical inner class */;
        timer2.schedule(timerTask2, initialDelay, period);
        return timer;
    }

    @InlineOnly
    private static final TimerTask scheduleAtFixedRate(Timer $this$scheduleAtFixedRate, long delay, long period, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter($this$scheduleAtFixedRate, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$scheduleAtFixedRate.scheduleAtFixedRate(task, delay, period);
        return task;
    }

    @InlineOnly
    private static final TimerTask schedule(Timer $this$schedule, long delay, Function1<? super TimerTask, Unit> action) {
        Intrinsics.checkNotNullParameter($this$schedule, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        TimerTask task = new /* invalid duplicate definition of identical inner class */;
        $this$schedule.schedule(task, delay);
        return task;
    }

    @PublishedApi
    @NotNull
    public static final Timer timer(@Nullable String name, boolean daemon) {
        return name == null ? new Timer(daemon) : new Timer(name, daemon);
    }
}


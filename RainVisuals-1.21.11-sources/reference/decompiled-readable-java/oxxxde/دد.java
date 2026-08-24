/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.function.LongSupplier;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b\u00a2\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u0003\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0012"}, d2={"Loxxxde/\u062f\u062f;", "", "Ljava/util/function/LongSupplier;", "timeSource", "<init>", "(Ljava/util/function/LongSupplier;)V", "", "fps", "", "shouldExecute", "(I)Z", "", "reset", "()V", "Ljava/util/function/LongSupplier;", "", "lastRunNanos", "J", "rain-visuals"})
public final class \u062f\u062f {
    @NotNull
    private final LongSupplier timeSource;
    private long lastRunNanos;

    public final boolean shouldExecute(int fps) {
        if (fps <= 0) {
            return true;
        }
        long intervalNanos = 1000000000L / (long)fps;
        long now = this.timeSource.getAsLong();
        if (now - this.lastRunNanos >= intervalNanos) {
            this.lastRunNanos = now;
            return true;
        }
        return false;
    }

    public \u062f\u062f(@NotNull LongSupplier timeSource) {
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        this.timeSource = timeSource;
    }

    public /* synthetic */ \u062f\u062f(LongSupplier longSupplier, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            longSupplier = System::nanoTime;
        }
        this(longSupplier);
    }

    public \u062f\u062f() {
        this(null, 1, null);
    }

    public final void reset() {
        this.lastRunNanos = 0L;
    }
}


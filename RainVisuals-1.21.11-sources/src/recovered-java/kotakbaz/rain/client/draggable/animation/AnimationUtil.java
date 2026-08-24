/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.draggable.animation;

import kotakbaz.rain.client.draggable.animation.Easing;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0019\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0013J-\u0010\u0011\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0011\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014\u00a2\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0014\u00a2\u0006\u0004\b\u001a\u0010\u0018J\u000f\u0010\u001b\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\f\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJ'\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b\"\u0010#R\u0016\u0010\u001f\u001a\u00020\r8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u001f\u0010$R$\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\r8\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b%\u0010&R$\u0010'\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u001cR$\u0010*\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048\u0006@BX\u0086\u000e\u00a2\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u001cR\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0005\u0010(R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010,\u00a8\u0006-"}, d2={"Loxxxde/\u0633\u0637;", "", "<init>", "()V", "", "value", "", "snap", "(D)V", "", "get", "()F", "valueTo", "", "duration", "Loxxxde/\u0631\u0636;", "easing", "run", "(FJLkotakbaz/rain/client/draggable/animation/Easing;)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "(DJLkotakbaz/rain/client/draggable/animation/Easing;)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "", "safe", "(DJLkotakbaz/rain/client/draggable/animation/Easing;Z)Lkotakbaz/rain/client/draggable/animation/AnimationUtil;", "update", "()Z", "alive", "finished", "calculatePart", "()D", "check", "(ZD)Z", "start", "end", "delta", "interpolate", "(DDD)D", "J", "getDuration", "()J", "fromValue", "D", "getFromValue", "toValue", "getToValue", "Loxxxde/\u0631\u0636;", "rain-visuals"})
public final class AnimationUtil {
    private long duration;
    private double toValue;
    private double value;
    @NotNull
    private Easing easing = Easing.LINEAR;
    private double fromValue;
    private long start;

    @NotNull
    public final AnimationUtil run(double valueTo, long duration, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter((Object)easing, "easing");
        return this.run(valueTo, duration, easing, false);
    }

    /*
     * WARNING - void declaration
     */
    public final boolean update() {
        void var1_1;
        boolean alive = this.alive();
        if (alive) {
            this.value = this.interpolate(this.fromValue, this.toValue, this.easing.apply(this.calculatePart()));
        } else {
            this.start = 0L;
            this.value = this.toValue;
        }
        return (boolean)var1_1;
    }

    private final double interpolate(double start, double end, double delta) {
        return start + (end - start) * delta;
    }

    public final float get() {
        return (float)this.value;
    }

    public final double getToValue() {
        return this.toValue;
    }

    @NotNull
    public final AnimationUtil run(double valueTo, long duration, @NotNull Easing easing, boolean safe) {
        Intrinsics.checkNotNullParameter((Object)easing, "easing");
        if (!this.check(safe, valueTo)) {
            this.easing = easing;
            this.duration = duration;
            this.start = System.currentTimeMillis();
            this.fromValue = this.value;
            this.toValue = valueTo;
        }
        return this;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private final boolean check(boolean safe, double valueTo) {
        if (!safe) return false;
        if (!this.alive()) return false;
        if (valueTo == this.fromValue) {
            return true;
        }
        boolean bl = false;
        if (bl) return true;
        if (valueTo == this.toValue) {
            return true;
        }
        boolean bl2 = false;
        if (bl2) return true;
        if (valueTo != this.value) return false;
        return true;
    }

    public final double getFromValue() {
        return this.fromValue;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final void snap(double value) {
        this.value = value;
        this.fromValue = value;
        this.toValue = value;
    }

    private final double calculatePart() {
        if (this.duration <= 0L) {
            return 1.0;
        }
        return (double)(System.currentTimeMillis() - this.start) / (double)this.duration;
    }

    public final boolean finished() {
        return this.calculatePart() >= 1.0;
    }

    @NotNull
    public final AnimationUtil run(float valueTo, long duration, @NotNull Easing easing) {
        Intrinsics.checkNotNullParameter((Object)easing, "easing");
        return this.run(valueTo, duration, easing, false);
    }

    public final boolean alive() {
        return !this.finished();
    }
}


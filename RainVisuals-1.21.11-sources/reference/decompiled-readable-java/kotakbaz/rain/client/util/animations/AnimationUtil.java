/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.animations;

import kotakbaz.rain.client.util.animations.FloatEasing;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;
import oxxxde.\u062a\u0634;
import oxxxde.\u0631\u0651;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J'\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\b\u00a2\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0013\u0010\r\u00a8\u0006\u0015"}, d2={"Loxxxde/\u0631\u064a;", "", "", "initialValue", "<init>", "(F)V", "value", "duration", "Loxxxde/\u0634\u0644;", "easing", "animate", "(FFLkotakbaz/rain/client/util/animations/FloatEasing;)F", "currentValue", "F", "startValue", "targetValue", "", "startTimeMs", "J", "durationMs", "Companion", "rain-visuals"})
public final class AnimationUtil {
    @NotNull
    private static final \u0631\u0651 Companion = new \u0631\u0651(null);
    private float startValue;
    private float currentValue;
    private float durationMs;
    private long startTimeMs;
    private float targetValue;
    @NotNull
    private static final FloatEasing LINEAR_EASING;

    public static final /* synthetic */ FloatEasing access$getLINEAR_EASING$cp() {
        return LINEAR_EASING;
    }

    static {
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        LINEAR_EASING = new \u062a\u0634(\u0628\u06412);
    }

    public AnimationUtil() {
        this(0.0f, 1, null);
    }

    public final float animate(float value, float duration, @NotNull FloatEasing easing) {
        long now;
        block5: {
            block4: {
                Intrinsics.checkNotNullParameter(easing, "easing");
                now = System.currentTimeMillis();
                boolean bl = value == this.targetValue;
                if (!bl) break block4;
                if (duration == this.durationMs) break block5;
            }
            this.startValue = this.currentValue;
            this.targetValue = value;
            this.durationMs = duration;
            this.startTimeMs = now;
        }
        if (this.durationMs <= 0.0f) {
            this.currentValue = this.targetValue;
            return this.currentValue;
        }
        float t = RangesKt.coerceIn((float)(now - this.startTimeMs) / this.durationMs, 0.0f, 1.0f);
        float eased = easing.apply(t);
        this.currentValue = this.startValue + (this.targetValue - this.startValue) * eased;
        return this.currentValue;
    }

    public AnimationUtil(float initialValue) {
        this.currentValue = initialValue;
        this.startValue = initialValue;
        this.targetValue = initialValue;
    }

    public /* synthetic */ AnimationUtil(float f, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            f = 0.0f;
        }
        this(f);
    }

    public static /* synthetic */ float animate$default(AnimationUtil animationUtil, float f, float f2, FloatEasing floatEasing, int n, Object object) {
        if ((n & 4) != 0) {
            floatEasing = LINEAR_EASING;
        }
        return animationUtil.animate(f, f2, floatEasing);
    }
}


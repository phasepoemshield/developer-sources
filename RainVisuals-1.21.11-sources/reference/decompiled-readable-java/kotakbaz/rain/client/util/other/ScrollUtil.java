/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.client.util.other;

import kotakbaz.rain.client.util.animations.AnimationUtil;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;
import oxxxde.\u0628\u0641;
import oxxxde.\u062f\u064b;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002\u00a2\u0006\u0004\b\b\u0010\u0005J\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\r\u0010\u000bJ\r\u0010\u000e\u001a\u00020\u0007\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\t\u001a\u00020\u0002\u00a2\u0006\u0004\b\t\u0010\u0010J\r\u0010\u0011\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010\"\u0004\b\u0018\u0010\u0005R\u0016\u0010\u0011\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0011\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\t\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001e\u001a\u00020\u00028F\u00a2\u0006\u0006\u001a\u0004\b\u001d\u0010\u0010\u00a8\u0006\u001f"}, d2={"Loxxxde/\u0632\u0639;", "", "", "speed", "<init>", "(F)V", "delta", "", "scroll", "value", "setMax", "(F)Lkotakbaz/rain/client/util/other/ScrollUtil;", "setValue", "setTargetValue", "update", "()V", "()F", "max", "contentHeight", "viewHeight", "clamp", "(FF)V", "F", "getSpeed", "setSpeed", "targetValue", "Loxxxde/\u0631\u064a;", "animation", "Loxxxde/\u0631\u064a;", "getOffset", "offset", "rain-visuals"})
public final class ScrollUtil {
    @NotNull
    private final AnimationUtil animation;
    private float targetValue;
    private float value;
    private float max;
    private float speed;

    public final void clamp(float contentHeight, float viewHeight) {
        this.setMax(RangesKt.coerceAtLeast(contentHeight - viewHeight, 0.0f));
        this.update();
        if (this.max <= 0.0f) {
            this.targetValue = 0.0f;
            this.value = 0.0f;
            AnimationUtil.animate$default(this.animation, 0.0f, 0.0f, null, 4, null);
            return;
        }
    }

    public final void scroll(float delta) {
        this.targetValue += delta * this.speed;
    }

    @NotNull
    public final ScrollUtil setMax(float value) {
        this.max = RangesKt.coerceAtLeast(value, 0.0f);
        return this;
    }

    @NotNull
    public final ScrollUtil setValue(float value) {
        this.value = value;
        return this;
    }

    public final float getSpeed() {
        return this.speed;
    }

    public ScrollUtil() {
        this(0.0f, 1, null);
    }

    public final float max() {
        return this.max;
    }

    public final float value() {
        return -this.value;
    }

    public final void setSpeed(float f) {
        this.speed = f;
    }

    public /* synthetic */ ScrollUtil(float f, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 1) != 0) {
            f = 8.0f;
        }
        this(f);
    }

    public final float getOffset() {
        return this.value;
    }

    public final void update() {
        this.targetValue = RangesKt.coerceIn(this.targetValue, -this.max, 0.0f);
        float delta = this.targetValue - this.value;
        \u0628\u0641 \u0628\u06412 = \u0628\u0641.INSTANCE;
        this.value = this.animation.animate(this.targetValue, 80.0f, new \u062f\u064b(\u0628\u06412));
        if (Math.abs(delta) < 0.1f) {
            this.value = this.targetValue;
        }
    }

    public ScrollUtil(float speed) {
        this.speed = speed;
        this.animation = new AnimationUtil(0.0f, 1, null);
    }

    @NotNull
    public final ScrollUtil setTargetValue(float value) {
        this.targetValue = value;
        return this;
    }
}


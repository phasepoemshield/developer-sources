/*
 * Decompiled with CFR 0.152.
 */
package kotakbaz.rain.module.setting.settings;

import kotakbaz.rain.module.setting.Setting;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0015\u001a\u00020\u00002\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u0007\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00028\u0006\u00a2\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001a\u0010\u0011\u00a8\u0006\u001b"}, d2={"Loxxxde/\u0637\u064f;", "Loxxxde/\u0631\u0641;", "", "", "name", "initialValue", "min", "max", "step", "configKey", "<init>", "(Ljava/lang/String;FFFFLjava/lang/String;)V", "raw", "", "setClamped", "(F)V", "progress", "()F", "Lkotlin/Function0;", "", "condition", "setVisible", "(Lkotlin/jvm/functions/Function0;)Lkotakbaz/rain/module/setting/settings/SliderSetting;", "F", "getMin", "getMax", "getStep", "rain-visuals"})
public final class SliderSetting
extends Setting<Float> {
    private final float min;
    private final float step;
    private final float max;

    public final void setClamped(float raw) {
        float clamped = RangesKt.coerceIn(raw, this.min, this.max);
        if (this.step > 0.0f) {
            float steps = (float)Math.rint((clamped - this.min) / this.step);
            clamped = RangesKt.coerceIn(this.min + steps * this.step, this.min, this.max);
        }
        this.set(Float.valueOf(clamped));
    }

    public final float progress() {
        float range = this.max - this.min;
        if (range <= 0.0f) {
            return 0.0f;
        }
        return RangesKt.coerceIn((((Number)this.getValue()).floatValue() - this.min) / range, 0.0f, 1.0f);
    }

    public SliderSetting(@NotNull String name, float initialValue, float min, float max, float step, @NotNull String configKey) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        super(name, Float.valueOf(RangesKt.coerceIn(initialValue, min, max)), configKey);
        this.min = min;
        this.max = max;
        this.step = step;
        if (!(this.max >= this.min)) {
            boolean bl = false;
            String string = "max must be >= min";
            throw new IllegalArgumentException(string.toString());
        }
    }

    public final float getStep() {
        return this.step;
    }

    public /* synthetic */ SliderSetting(String string, float f, float f2, float f3, float f4, String string2, int n, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n & 0x10) != 0) {
            f4 = 0.0f;
        }
        if ((n & 0x20) != 0) {
            string2 = string;
        }
        this(string, f, f2, f3, f4, string2);
    }

    @NotNull
    public SliderSetting setVisible(@NotNull Function0<Boolean> condition) {
        Intrinsics.checkNotNullParameter(condition, "condition");
        super.setVisible(condition);
        return this;
    }

    public final float getMin() {
        return this.min;
    }

    public final float getMax() {
        return this.max;
    }
}


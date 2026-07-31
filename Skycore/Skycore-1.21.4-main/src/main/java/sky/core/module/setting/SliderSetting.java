package sky.core.module.setting;

import java.util.function.Supplier;
import net.minecraft.util.math.MathHelper;

public final class SliderSetting extends Setting<Float> {
    private final float min;
    private final float max;
    private final float step;

    public SliderSetting(String name, float defaultValue, float min, float max, float step) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
        this.step = step;
    }

    public SliderSetting(String name, float defaultValue, float min, float max, float step, Supplier<Boolean> visible) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
        this.step = step;
        this.visible(visible);
    }

    public float getMin() {
        return this.min;
    }

    public float getMax() {
        return this.max;
    }

    public float getStep() {
        return this.step;
    }

    public void setClamped(float value) {
        float clamped = MathHelper.clamp(value, this.min, this.max);
        if (this.step > 0.0F) {
            clamped = Math.round(clamped / this.step) * this.step;
        }
        this.set(clamped);
    }
}

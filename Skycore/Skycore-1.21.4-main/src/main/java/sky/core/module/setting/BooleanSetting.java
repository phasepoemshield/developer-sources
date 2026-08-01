package sky.core.module.setting;

import java.util.function.Supplier;

public final class BooleanSetting extends Setting<Boolean> {
    public BooleanSetting(String name, boolean defaultValue) {
        super(name, defaultValue);
    }

    public BooleanSetting(String name, boolean defaultValue, Supplier<Boolean> visible) {
        super(name, defaultValue);
        this.visible(visible);
    }
}

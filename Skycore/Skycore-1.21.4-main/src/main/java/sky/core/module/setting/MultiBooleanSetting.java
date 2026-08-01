package sky.core.module.setting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;

public final class MultiBooleanSetting extends Setting<Boolean> {
    private final List<BooleanSetting> options;

    public MultiBooleanSetting(String name, BooleanSetting... options) {
        super(name, false);
        this.options = Collections.unmodifiableList(Arrays.asList(options));
    }

    public MultiBooleanSetting(String name, Supplier<Boolean> visible, BooleanSetting... options) {
        this(name, options);
        this.visible(visible);
    }

    public List<BooleanSetting> getOptions() {
        return this.options;
    }

    public boolean is(String optionName) {
        for (BooleanSetting option : this.options) {
            if (option.getName().equalsIgnoreCase(optionName)) {
                return option.get();
            }
        }
        return false;
    }

    @Override
    public void reset() {
        for (BooleanSetting option : this.options) {
            option.reset();
        }
    }
}

package sky.core.module.setting;

import java.util.function.Supplier;

public final class ModeSetting extends Setting<String> {
    private final String[] modes;

    public ModeSetting(String name, String defaultValue, String... modes) {
        super(name, defaultValue);
        this.modes = modes;
    }

    public ModeSetting(String name, String defaultValue, Supplier<Boolean> visible, String... modes) {
        super(name, defaultValue);
        this.modes = modes;
        this.visible(visible);
    }

    public String[] getModes() {
        return this.modes;
    }

    public boolean is(String mode) {
        return this.get().equalsIgnoreCase(mode);
    }

    public void cycle() {
        int index = 0;
        for (int i = 0; i < this.modes.length; i++) {
            if (this.modes[i].equalsIgnoreCase(this.get())) {
                index = i;
                break;
            }
        }
        this.set(this.modes[(index + 1) % this.modes.length]);
    }
}

package fun.wonderful.client.modules.settings.implement;

import fun.wonderful.client.modules.settings.Setting;
import java.util.function.Supplier;

public class OpenScreenSetting
extends Setting {
    private final Runnable action;

    public OpenScreenSetting(String name, Runnable action) {
        super(name);
        this.action = action;
    }

    public void open() {
        if (this.action != null) {
            this.action.run();
        }
    }

    public OpenScreenSetting visible(Supplier<Boolean> state) {
        this.visible = state;
        return this;
    }
}
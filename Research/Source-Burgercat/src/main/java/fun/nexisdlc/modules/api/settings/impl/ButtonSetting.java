package fun.nexisdlc.modules.api.settings.impl;

import fun.nexisdlc.modules.api.settings.api.Setting;

import java.util.function.Supplier;

public class ButtonSetting extends Setting<Runnable> {

    public ButtonSetting(String name, Runnable action) {
        super(name, action);
    }

    public void press() {
        Runnable action = get();
        if (action != null) {
            action.run();
        }
    }

    @Override
    public ButtonSetting setVisible(Supplier<Boolean> bool) {
        return (ButtonSetting) super.setVisible(bool);
    }
}

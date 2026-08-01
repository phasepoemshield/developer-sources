package fun.nexisdlc.modules.api.settings.impl;

import fun.nexisdlc.modules.api.settings.api.Setting;
import lombok.Getter;
import lombok.Setter;

import java.util.function.Supplier;

public class BooleanSetting extends Setting<Boolean> {

    /** Бинд для этого булеана. -1 = нет бинда. */
    @Getter @Setter
    private int bind = -1;

    public BooleanSetting(String name, Boolean defaultVal) {
        super(name, defaultVal);
    }

    @Override
    public BooleanSetting setVisible(Supplier<Boolean> bool) {
        return (BooleanSetting) super.setVisible(bool);
    }

    public boolean isBound() {
        return bind > 0;
    }
}

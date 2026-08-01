package fun.nexisdlc.modules.api.settings.impl;

import fun.nexisdlc.modules.api.settings.api.Setting;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ModeListSetting extends Setting<List<BooleanSetting>> {

    public ModeListSetting(String name, BooleanSetting... settings) {
        super(name, new ArrayList<>());
        for (BooleanSetting setting : settings) {
            get().add(setting);
        }
    }

    public BooleanSetting getByName(String name) {
        for (BooleanSetting setting : get()) {
            if (setting.getName().equalsIgnoreCase(name)) {
                return setting;
            }
        }
        return null;
    }

    @Override
    public ModeListSetting setVisible(Supplier<Boolean> bool) {
        return (ModeListSetting) super.setVisible(bool);
    }
}

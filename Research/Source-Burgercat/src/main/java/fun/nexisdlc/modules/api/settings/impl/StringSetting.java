package fun.nexisdlc.modules.api.settings.impl;

import fun.nexisdlc.modules.api.settings.api.Setting;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.experimental.FieldDefaults;

import java.util.function.Supplier;

@Getter
@FieldDefaults(level = AccessLevel.PRIVATE)
public class StringSetting extends Setting<String> {

    boolean onlyNumber;
    public StringSetting(String name, String defaultVal) {
        super(name, defaultVal);
    }

    public StringSetting(String name, String defaultVal, String description, boolean onlyNumber) {
        super(name, defaultVal);
        this.onlyNumber = onlyNumber;
    }

    @Override
    public StringSetting setVisible(Supplier<Boolean> bool) {
        return (StringSetting) super.setVisible(bool);
    }
}

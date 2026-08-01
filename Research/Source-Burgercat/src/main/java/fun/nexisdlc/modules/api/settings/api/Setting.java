package fun.nexisdlc.modules.api.settings.api;

import fun.nexisdlc.modules.api.Function;

import java.util.function.Supplier;

public class Setting<Value> implements ISetting {

    protected Value defaultVal;
    private final Value initialDefault;
    String settingName;
    Function function;
    public Supplier<Boolean> visible = () -> true;

    public Setting(String name, Value defaultVal) {
        this.settingName = name;
        this.defaultVal = defaultVal;
        this.initialDefault = defaultVal;
    }

    public String getName() {
        return settingName;
    }

    public void set(Value value) {
        defaultVal = value;
    }

    @Override
    public Setting<?> setVisible(Supplier<Boolean> bool) {
        visible = bool;
        return this;
    }

    public boolean isVisible() {
        return visible.get();
    }

    public Value get() {
        return defaultVal;
    }

    public Value getDefaultValue() {
        return this.initialDefault;
    }
}

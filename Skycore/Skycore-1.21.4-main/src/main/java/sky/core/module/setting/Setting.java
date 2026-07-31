package sky.core.module.setting;

import java.util.function.Supplier;

public class Setting<T> {
    private final String name;
    private final T defaultValue;
    private T value;
    private Supplier<Boolean> visibleSupplier;

    public Setting(String name, T defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
    }

    public String getName() {
        return this.name;
    }

    public T get() {
        return this.value;
    }

    public T getDefault() {
        return this.defaultValue;
    }

    public void set(T value) {
        this.value = value;
    }

    public void reset() {
        this.value = this.defaultValue;
    }

    public Setting<T> visible(Supplier<Boolean> supplier) {
        this.visibleSupplier = supplier;
        return this;
    }

    public boolean isVisible() {
        return this.visibleSupplier == null || Boolean.TRUE.equals(this.visibleSupplier.get());
    }
}

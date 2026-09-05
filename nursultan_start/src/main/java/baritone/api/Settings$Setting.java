/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.SettingsUtil
 *  baritone.api.utils.TypeUtils
 */
package baritone.api;

import baritone.api.Settings;
import baritone.api.utils.SettingsUtil;
import baritone.api.utils.TypeUtils;
import java.lang.reflect.Type;

public final class Settings$Setting<T> {
    public T value;
    public final T defaultValue;
    String name;
    boolean javaOnly;
    final /* synthetic */ Settings this$0;

    Settings$Setting(Settings settings, T t) {
        this.this$0 = settings;
        if (t == null) {
            throw new IllegalArgumentException("Cannot determine value type class from null");
        }
        this.value = t;
        this.defaultValue = t;
        this.javaOnly = false;
    }

    public void reset() {
        this.value = this.defaultValue;
    }

    @Deprecated
    public final T get() {
        return this.value;
    }

    public String toString() {
        return SettingsUtil.settingToString((Settings$Setting)this);
    }

    public final String getName() {
        return this.name;
    }

    public final Type getType() {
        return this.this$0.settingTypes.get(this);
    }

    public boolean isJavaOnly() {
        return this.javaOnly;
    }

    public Class<T> getValueClass() {
        return TypeUtils.resolveBaseClass((Type)this.getType());
    }
}


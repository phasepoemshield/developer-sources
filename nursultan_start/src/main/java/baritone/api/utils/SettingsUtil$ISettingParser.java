/*
 * Decompiled with CFR 0.152.
 */
package baritone.api.utils;

import java.lang.reflect.Type;

interface SettingsUtil$ISettingParser<T> {
    public String toString(Type var1, T var2);

    public T parse(Type var1, String var2);

    public boolean accepts(Type var1);
}


/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Toml;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Toml$1;

class Toml$Entry
implements Map.Entry<String, Object> {
    private final String key;
    private final Object value;
    final /* synthetic */ Toml this$0;

    /* synthetic */ Toml$Entry(Toml toml, String string, Object object, Toml$1 toml$1) {
        this(toml, string, object);
    }

    private Toml$Entry(Toml toml, String string, Object object) {
        this.this$0 = toml;
        this.key = string;
        this.value = object;
    }

    @Override
    public Object getValue() {
        return this.value;
    }

    @Override
    public String getKey() {
        return this.key;
    }

    @Override
    public Object setValue(Object object) {
        throw new UnsupportedOperationException("TOML entry values cannot be changed.");
    }
}


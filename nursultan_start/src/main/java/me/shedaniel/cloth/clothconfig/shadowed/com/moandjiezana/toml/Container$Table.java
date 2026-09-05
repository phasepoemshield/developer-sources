/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.HashMap;
import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container$TableArray;

class Container$Table
extends Container {
    private final Map<String, Object> values = new HashMap<String, Object>();
    final String name;
    final boolean implicit;

    Map<String, Object> consume() {
        for (Map.Entry<String, Object> entry : this.values.entrySet()) {
            if (entry.getValue() instanceof Container$Table) {
                entry.setValue(((Container$Table)entry.getValue()).consume());
                continue;
            }
            if (!(entry.getValue() instanceof Container$TableArray)) continue;
            entry.setValue(((Container$TableArray)entry.getValue()).getValues());
        }
        return this.values;
    }

    public Container$Table(String string, boolean bl) {
        super(null);
        this.name = string;
        this.implicit = bl;
    }

    public Container$Table(String string) {
        this(string, false);
    }

    Container$Table() {
        this(null, false);
    }

    @Override
    Object get(String string) {
        return this.values.get(string);
    }

    @Override
    void put(String string, Object object) {
        this.values.put(string, object);
    }

    public String toString() {
        return this.values.toString();
    }

    @Override
    boolean isImplicit() {
        return this.implicit;
    }

    @Override
    boolean accepts(String string) {
        return !this.values.containsKey(string) || this.values.get(string) instanceof Container$TableArray;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container;
import me.shedaniel.cloth.clothconfig.shadowed.com.moandjiezana.toml.Container$Table;

class Container$TableArray
extends Container {
    private final List<Container$Table> values = new ArrayList<Container$Table>();

    Container$TableArray() {
        super(null);
        this.values.add(new Container$Table());
    }

    @Override
    Object get(String string) {
        throw new UnsupportedOperationException();
    }

    @Override
    void put(String string, Object object) {
        this.values.add((Container$Table)object);
    }

    public String toString() {
        return this.values.toString();
    }

    @Override
    boolean isImplicit() {
        return false;
    }

    @Override
    boolean accepts(String string) {
        return this.getCurrent().accepts(string);
    }

    List<Map<String, Object>> getValues() {
        ArrayList<Map<String, Object>> arrayList = new ArrayList<Map<String, Object>>();
        for (Container$Table container$Table : this.values) {
            arrayList.add(container$Table.consume());
        }
        return arrayList;
    }

    Container$Table getCurrent() {
        return this.values.get(this.values.size() - 1);
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;

class Yaml$YamlIterable
implements Iterable<Object> {
    private Iterator<Object> iterator;

    public Yaml$YamlIterable(Iterator<Object> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<Object> iterator() {
        return this.iterator;
    }
}


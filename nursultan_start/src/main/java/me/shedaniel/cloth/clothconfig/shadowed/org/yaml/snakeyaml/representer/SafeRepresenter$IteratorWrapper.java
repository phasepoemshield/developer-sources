/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.representer;

import java.util.Iterator;

class SafeRepresenter$IteratorWrapper
implements Iterable<Object> {
    private Iterator<Object> iter;

    public SafeRepresenter$IteratorWrapper(Iterator<Object> iterator) {
        this.iter = iterator;
    }

    @Override
    public Iterator<Object> iterator() {
        return this.iter;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;

class Yaml$EventIterable
implements Iterable<Event> {
    private Iterator<Event> iterator;

    public Yaml$EventIterable(Iterator<Event> iterator) {
        this.iterator = iterator;
    }

    @Override
    public Iterator<Event> iterator() {
        return this.iterator;
    }
}


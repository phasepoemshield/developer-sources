/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.util.Iterator;
import java.util.NoSuchElementException;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.parser.Parser;

class Yaml$3
implements Iterator<Event> {
    final /* synthetic */ Parser val$parser;
    final /* synthetic */ Yaml this$0;

    Yaml$3(Yaml yaml, Parser parser) {
        this.this$0 = yaml;
        this.val$parser = parser;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean hasNext() {
        return this.val$parser.peekEvent() != null;
    }

    @Override
    public Event next() {
        Event event = this.val$parser.getEvent();
        if (event != null) {
            return event;
        }
        throw new NoSuchElementException("No Event is available.");
    }
}


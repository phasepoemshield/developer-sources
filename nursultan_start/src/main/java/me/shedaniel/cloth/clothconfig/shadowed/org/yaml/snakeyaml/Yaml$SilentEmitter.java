/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.Yaml$1;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.emitter.Emitable;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;

class Yaml$SilentEmitter
implements Emitable {
    private List<Event> events = new ArrayList<Event>(100);

    /* synthetic */ Yaml$SilentEmitter(Yaml$1 yaml$1) {
        this();
    }

    private Yaml$SilentEmitter() {
    }

    public List<Event> getEvents() {
        return this.events;
    }

    public void emit(Event event) throws IOException {
        this.events.add(event);
    }
}


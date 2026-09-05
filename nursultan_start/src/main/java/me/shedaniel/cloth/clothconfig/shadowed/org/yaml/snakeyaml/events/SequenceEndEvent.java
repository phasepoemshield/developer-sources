/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.CollectionEndEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;

public final class SequenceEndEvent
extends CollectionEndEvent {
    public SequenceEndEvent(Mark mark, Mark mark2) {
        super(mark, mark2);
    }

    @Override
    public Event$ID getEventId() {
        return Event$ID.SequenceEnd;
    }
}


/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.NodeEvent;

public final class AliasEvent
extends NodeEvent {
    public AliasEvent(String string, Mark mark, Mark mark2) {
        super(string, mark, mark2);
        if (string == null) {
            throw new NullPointerException("anchor is not specified for alias");
        }
    }

    @Override
    public Event$ID getEventId() {
        return Event$ID.Alias;
    }
}


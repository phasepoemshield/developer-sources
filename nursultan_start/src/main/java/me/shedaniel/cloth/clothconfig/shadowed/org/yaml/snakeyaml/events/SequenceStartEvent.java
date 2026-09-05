/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$FlowStyle
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.CollectionStartEvent;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;

public final class SequenceStartEvent
extends CollectionStartEvent {
    public SequenceStartEvent(String string, String string2, boolean bl, Mark mark, Mark mark2, DumperOptions.FlowStyle flowStyle) {
        super(string, string2, bl, mark, mark2, flowStyle);
    }

    @Deprecated
    public SequenceStartEvent(String string, String string2, boolean bl, Mark mark, Mark mark2, Boolean bl2) {
        this(string, string2, bl, mark, mark2, DumperOptions.FlowStyle.fromBoolean((Boolean)bl2));
    }

    @Override
    public Event$ID getEventId() {
        return Event$ID.SequenceStart;
    }
}


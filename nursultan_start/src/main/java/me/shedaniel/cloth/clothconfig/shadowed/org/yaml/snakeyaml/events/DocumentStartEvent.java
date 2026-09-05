/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions$Version
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import java.util.Map;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.DumperOptions;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;

public final class DocumentStartEvent
extends Event {
    private final boolean explicit;
    private final DumperOptions.Version version;
    private final Map<String, String> tags;

    public DocumentStartEvent(Mark mark, Mark mark2, boolean bl, DumperOptions.Version version, Map<String, String> map) {
        super(mark, mark2);
        this.explicit = bl;
        this.version = version;
        this.tags = map;
    }

    public DumperOptions.Version getVersion() {
        return this.version;
    }

    public boolean getExplicit() {
        return this.explicit;
    }

    @Override
    public Event$ID getEventId() {
        return Event$ID.DocumentStart;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }
}


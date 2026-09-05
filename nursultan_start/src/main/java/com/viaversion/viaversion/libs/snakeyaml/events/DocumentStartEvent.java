/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.snakeyaml.DumperOptions$Version
 */
package com.viaversion.viaversion.libs.snakeyaml.events;

import com.viaversion.viaversion.libs.snakeyaml.DumperOptions;
import com.viaversion.viaversion.libs.snakeyaml.error.Mark;
import com.viaversion.viaversion.libs.snakeyaml.events.Event;
import java.util.Map;

public final class DocumentStartEvent
extends Event {
    private final boolean explicit;
    private final DumperOptions.Version version;
    private final Map<String, String> tags;

    public DocumentStartEvent(Mark startMark, Mark endMark, boolean explicit, DumperOptions.Version version, Map<String, String> tags) {
        super(startMark, endMark);
        this.explicit = explicit;
        this.version = version;
        this.tags = tags;
    }

    public DumperOptions.Version getVersion() {
        return this.version;
    }

    public boolean getExplicit() {
        return this.explicit;
    }

    @Override
    public Event.ID getEventId() {
        return Event.ID.DocumentStart;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }
}


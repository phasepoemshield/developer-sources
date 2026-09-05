/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event;

public abstract class NodeEvent
extends Event {
    private final String anchor;

    public NodeEvent(String string, Mark mark, Mark mark2) {
        super(mark, mark2);
        this.anchor = string;
    }

    @Override
    protected String getArguments() {
        return "anchor=" + this.anchor;
    }

    public String getAnchor() {
        return this.anchor;
    }
}


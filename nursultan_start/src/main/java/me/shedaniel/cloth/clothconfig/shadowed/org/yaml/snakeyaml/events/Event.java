/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events;

import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.error.Mark;
import me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.events.Event$ID;

public abstract class Event {
    private final Mark startMark;
    private final Mark endMark;

    public Event(Mark mark, Mark mark2) {
        this.startMark = mark;
        this.endMark = mark2;
    }

    public boolean equals(Object object) {
        if (object instanceof Event) {
            return this.toString().equals(object.toString());
        }
        return false;
    }

    public String toString() {
        return "<" + this.getClass().getName() + "(" + this.getArguments() + ")>";
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean is(Event$ID event$ID) {
        return this.getEventId() == event$ID;
    }

    protected String getArguments() {
        return "";
    }

    public Mark getStartMark() {
        return this.startMark;
    }

    public abstract Event$ID getEventId();

    public Mark getEndMark() {
        return this.endMark;
    }
}


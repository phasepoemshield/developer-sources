/*
 * Decompiled with CFR 0.152.
 */
package com.viaversion.viaversion.libs.snakeyaml.events;

import com.viaversion.viaversion.libs.snakeyaml.error.Mark;

public abstract class Event {
    private final Mark startMark;
    private final Mark endMark;

    public Event(Mark startMark, Mark endMark) {
        this.startMark = startMark;
        this.endMark = endMark;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Event) {
            return this.toString().equals(obj.toString());
        }
        return false;
    }

    public String toString() {
        return "<" + this.getClass().getName() + "(" + this.getArguments() + ")>";
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public boolean is(ID id) {
        return this.getEventId() == id;
    }

    protected String getArguments() {
        return "";
    }

    public Mark getStartMark() {
        return this.startMark;
    }

    public abstract ID getEventId();

    public Mark getEndMark() {
        return this.endMark;
    }

    public static enum ID {
        Alias,
        Comment,
        DocumentEnd,
        DocumentStart,
        MappingEnd,
        MappingStart,
        Scalar,
        SequenceEnd,
        SequenceStart,
        StreamEnd,
        StreamStart;

    }
}


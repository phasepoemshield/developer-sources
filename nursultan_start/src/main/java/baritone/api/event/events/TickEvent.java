/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.TickEvent$Type
 */
package baritone.api.event.events;

import baritone.api.event.events.TickEvent;
import baritone.api.event.events.type.EventState;
import java.util.function.BiFunction;

public final class TickEvent {
    private static int overallTickCount;
    private final EventState state;
    private final Type type;
    private final int count;

    public TickEvent(EventState eventState, Type type, int n) {
        this.state = eventState;
        this.type = type;
        this.count = n;
    }

    public EventState getState() {
        return this.state;
    }

    public int getCount() {
        return this.count;
    }

    public Type getType() {
        return this.type;
    }

    public static synchronized BiFunction<EventState, Type, TickEvent> createNextProvider() {
        int n = overallTickCount++;
        return (eventState, type) -> new TickEvent((EventState)((Object)eventState), (Type)type, n);
    }
}


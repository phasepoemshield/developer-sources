/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package squeek.appleskin.api.handler;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public interface EventHandler<IEvent> {
    public void interact(IEvent var1);

    public static <T> Event<EventHandler<T>> createArrayBacked() {
        return EventFactory.createArrayBacked(EventHandler.class, eventHandlerArray -> object -> {
            for (EventHandler eventHandler : eventHandlerArray) {
                eventHandler.interact(object);
            }
        });
    }
}


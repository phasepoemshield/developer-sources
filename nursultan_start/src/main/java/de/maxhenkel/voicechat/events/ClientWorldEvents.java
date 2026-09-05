/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class ClientWorldEvents {
    public static final Event<Runnable> DISCONNECT = EventFactory.createArrayBacked(Runnable.class, runnableArray -> () -> {
        for (Runnable runnable : runnableArray) {
            runnable.run();
        }
    });
}


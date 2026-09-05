/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import java.util.function.Consumer;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class PublishServerEvents {
    public static final Event<Consumer<Integer>> SERVER_PUBLISHED = EventFactory.createArrayBacked(Consumer.class, consumerArray -> n -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(n);
        }
    });
}


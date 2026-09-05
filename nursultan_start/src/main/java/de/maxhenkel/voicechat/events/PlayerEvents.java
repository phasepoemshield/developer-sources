/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import java.util.function.Consumer;
import minecraft.class04770;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class PlayerEvents {
    public static final Event<Consumer<class04770>> PLAYER_LOGGED_IN = EventFactory.createArrayBacked(Consumer.class, consumerArray -> class047702 -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(class047702);
        }
    });
    public static final Event<Consumer<class04770>> PLAYER_LOGGED_OUT = EventFactory.createArrayBacked(Consumer.class, consumerArray -> class047702 -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(class047702);
        }
    });
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import java.util.UUID;
import java.util.function.Consumer;
import minecraft.class04770;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class ServerVoiceChatEvents {
    public static final Event<Consumer<class04770>> VOICECHAT_CONNECTED = EventFactory.createArrayBacked(Consumer.class, consumerArray -> class047702 -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(class047702);
        }
    });
    public static final Event<Consumer<UUID>> VOICECHAT_DISCONNECTED = EventFactory.createArrayBacked(Consumer.class, consumerArray -> uUID -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(uUID);
        }
    });
    public static final Event<Consumer<class04770>> VOICECHAT_COMPATIBILITY_CHECK_SUCCEEDED = EventFactory.createArrayBacked(Consumer.class, consumerArray -> class047702 -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(class047702);
        }
    });
}


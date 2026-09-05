/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import de.maxhenkel.voicechat.voice.client.ClientVoicechatConnection;
import java.util.function.Consumer;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class ClientVoiceChatEvents {
    public static final Event<Consumer<ClientVoicechatConnection>> VOICECHAT_CONNECTED = EventFactory.createArrayBacked(Consumer.class, consumerArray -> clientVoicechatConnection -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(clientVoicechatConnection);
        }
    });
    public static final Event<Runnable> VOICECHAT_DISCONNECTED = EventFactory.createArrayBacked(Runnable.class, runnableArray -> () -> {
        for (Runnable runnable : runnableArray) {
            runnable.run();
        }
    });
}


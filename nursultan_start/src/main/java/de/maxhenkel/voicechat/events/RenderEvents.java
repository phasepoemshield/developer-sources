/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import de.maxhenkel.voicechat.intercompatibility.ClientCompatibilityManager$RenderNameplateEvent;
import java.util.function.Consumer;
import minecraft.class01054;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class RenderEvents {
    public static final Event<ClientCompatibilityManager$RenderNameplateEvent> RENDER_NAMEPLATE = EventFactory.createArrayBacked(ClientCompatibilityManager$RenderNameplateEvent.class, clientCompatibilityManager$RenderNameplateEventArray -> (class088002, class069592, class014212, class012372) -> {
        for (ClientCompatibilityManager$RenderNameplateEvent clientCompatibilityManager$RenderNameplateEvent : clientCompatibilityManager$RenderNameplateEventArray) {
            clientCompatibilityManager$RenderNameplateEvent.render(class088002, class069592, class014212, class012372);
        }
    });
    public static final Event<Consumer<class01054>> RENDER_HUD = EventFactory.createArrayBacked(Consumer.class, consumerArray -> class010542 -> {
        for (Consumer consumer : consumerArray) {
            consumer.accept(class010542);
        }
    });
}


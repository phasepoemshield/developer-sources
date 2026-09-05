/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04770
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package de.maxhenkel.voicechat.events;

import java.util.function.BiConsumer;
import minecraft.class04770;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public class VanishEvents {
    public static final Event<BiConsumer<class04770, class04770>> ON_VANISH = EventFactory.createArrayBacked(BiConsumer.class, biConsumerArray -> (class047702, class047703) -> {
        for (BiConsumer biConsumer : biConsumerArray) {
            biConsumer.accept(class047702, class047703);
        }
    });
    public static final Event<BiConsumer<class04770, class04770>> ON_UNVANISH = EventFactory.createArrayBacked(BiConsumer.class, biConsumerArray -> (class047702, class047703) -> {
        for (BiConsumer biConsumer : biConsumerArray) {
            biConsumer.accept(class047702, class047703);
        }
    });
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01894
 *  minecraft.class03937
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.message.v1;

import java.util.Objects;
import minecraft.class00392;
import minecraft.class01894;
import minecraft.class03937;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

public final class ServerMessageDecoratorEvent {
    public static final class01894 CONTENT_PHASE = class01894.N((String)"fabric", (String)"content");
    public static final class01894 STYLING_PHASE = class01894.N((String)"fabric", (String)"styling");
    public static final Event<class03937> EVENT = EventFactory.createWithPhases(class03937.class, class03937Array -> (class047702, class003922) -> {
        class00392 class003923 = class003922;
        for (class03937 class039372 : class03937Array) {
            class003923 = ServerMessageDecoratorEvent.handle(class039372.decorate(class047702, class003923), class039372);
        }
        return class003923;
    }, (class01894[])new class01894[]{CONTENT_PHASE, Event.DEFAULT_PHASE, STYLING_PHASE});

    private ServerMessageDecoratorEvent() {
    }

    private static <T extends class00392> T handle(T t, class03937 class039372) {
        String string = class039372.getClass().getName();
        return Objects.requireNonNull(t, "message decorator %s returned null".formatted(new Object[]{string}));
    }
}


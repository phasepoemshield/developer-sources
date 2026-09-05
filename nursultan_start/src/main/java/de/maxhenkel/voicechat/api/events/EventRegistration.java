/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.api.events;

import de.maxhenkel.voicechat.api.events.Event;
import java.util.function.Consumer;

public interface EventRegistration {
    public <T extends Event> void registerEvent(Class<T> var1, Consumer<T> var2, int var3);

    default public <T extends Event> void registerEvent(Class<T> clazz, Consumer<T> consumer) {
        this.registerEvent(clazz, consumer, 0);
    }
}


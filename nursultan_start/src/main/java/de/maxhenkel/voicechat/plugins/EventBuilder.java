/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.api.events.Event
 *  minecraft.class05034
 */
package de.maxhenkel.voicechat.plugins;

import de.maxhenkel.voicechat.api.events.Event;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Collectors;
import minecraft.class05034;

public class EventBuilder {
    private final Map<Class<? extends Event>, List<class05034<Integer, Consumer<? extends Event>>>> events = new HashMap<Class<? extends Event>, List<class05034<Integer, Consumer<? extends Event>>>>();

    public static EventBuilder create() {
        return new EventBuilder();
    }

    private EventBuilder() {
    }

    public Map<Class<? extends Event>, List<Consumer<? extends Event>>> build() {
        HashMap<Class<? extends Event>, List<Consumer<? extends Event>>> hashMap = new HashMap<Class<? extends Event>, List<Consumer<? extends Event>>>();
        for (Map.Entry<Class<? extends Event>, List<class05034<Integer, Consumer<? extends Event>>>> entry : this.events.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().stream().sorted((class050342, class050343) -> Integer.compare((Integer)class050343.N(), (Integer)class050342.N())).map(class05034::y).collect(Collectors.toList()));
        }
        return hashMap;
    }

    public <T extends Event> EventBuilder addEvent(Class<T> clazz, Consumer<T> consumer, int n) {
        List list = this.events.getOrDefault(clazz, new ArrayList());
        list.add(new class05034((Object)n, consumer));
        this.events.put(clazz, list);
        return this;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06839
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 *  net.fabricmc.fabric.api.gamerule.v1.GameRuleEvents$ValueUpdate
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.gamerule;

import java.util.IdentityHashMap;
import java.util.Map;
import minecraft.class06839;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleEvents;
import org.jspecify.annotations.Nullable;

public final class GameRuleEventsImpl {
    private static final Map<class06839<?>, Event<GameRuleEvents.ValueUpdate<?>>> VALUE_UPDATES = new IdentityHashMap();

    private GameRuleEventsImpl() {
    }

    public static <T> Event<GameRuleEvents.ValueUpdate<T>> changeCallback(class06839<T> class068393) {
        return VALUE_UPDATES.computeIfAbsent(class068393, class068392 -> EventFactory.createArrayBacked(GameRuleEvents.ValueUpdate.class, valueUpdateArray -> (object, class027962) -> {
            for (GameRuleEvents.ValueUpdate valueUpdate : valueUpdateArray) {
                valueUpdate.onGameRuleUpdated(object, class027962);
            }
        }));
    }

    public static <T> @Nullable Event<// Could not load outer class - annotation placement on inner may be incorrect
    GameRuleEvents.ValueUpdate<T>> getValueUpdate(class06839<T> class068392) {
        return VALUE_UPDATES.get(class068392);
    }
}


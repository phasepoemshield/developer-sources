/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06839
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.impl.gamerule.GameRuleEventsImpl
 */
package net.fabricmc.fabric.api.gamerule.v1;

import minecraft.class06839;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.gamerule.v1.GameRuleEvents$ValueUpdate;
import net.fabricmc.fabric.impl.gamerule.GameRuleEventsImpl;

public final class GameRuleEvents {
    private GameRuleEvents() {
    }

    public static <T> Event<GameRuleEvents$ValueUpdate<T>> changeCallback(class06839<T> class068392) {
        return GameRuleEventsImpl.changeCallback(class068392);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.event.lifecycle.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$EndTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$EndWorldTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$StartTick;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerTickEvents$StartWorldTick;

public final class ServerTickEvents {
    public static final Event<ServerTickEvents$StartTick> START_SERVER_TICK = EventFactory.createArrayBacked(ServerTickEvents$StartTick.class, serverTickEvents$StartTickArray -> class027962 -> {
        for (ServerTickEvents$StartTick serverTickEvents$StartTick : serverTickEvents$StartTickArray) {
            serverTickEvents$StartTick.onStartTick(class027962);
        }
    });
    public static final Event<ServerTickEvents$EndTick> END_SERVER_TICK = EventFactory.createArrayBacked(ServerTickEvents$EndTick.class, serverTickEvents$EndTickArray -> class027962 -> {
        for (ServerTickEvents$EndTick serverTickEvents$EndTick : serverTickEvents$EndTickArray) {
            serverTickEvents$EndTick.onEndTick(class027962);
        }
    });
    public static final Event<ServerTickEvents$StartWorldTick> START_WORLD_TICK = EventFactory.createArrayBacked(ServerTickEvents$StartWorldTick.class, serverTickEvents$StartWorldTickArray -> class047822 -> {
        for (ServerTickEvents$StartWorldTick serverTickEvents$StartWorldTick : serverTickEvents$StartWorldTickArray) {
            serverTickEvents$StartWorldTick.onStartTick(class047822);
        }
    });
    public static final Event<ServerTickEvents$EndWorldTick> END_WORLD_TICK = EventFactory.createArrayBacked(ServerTickEvents$EndWorldTick.class, serverTickEvents$EndWorldTickArray -> class047822 -> {
        for (ServerTickEvents$EndWorldTick serverTickEvents$EndWorldTick : serverTickEvents$EndWorldTickArray) {
            serverTickEvents$EndWorldTick.onEndTick(class047822);
        }
    });

    private ServerTickEvents() {
    }
}


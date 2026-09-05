/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.event.lifecycle.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndWorldTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartTick;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$StartWorldTick;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientTickEvents {
    public static final Event<ClientTickEvents$StartTick> START_CLIENT_TICK = EventFactory.createArrayBacked(ClientTickEvents$StartTick.class, clientTickEvents$StartTickArray -> class062022 -> {
        for (ClientTickEvents$StartTick clientTickEvents$StartTick : clientTickEvents$StartTickArray) {
            clientTickEvents$StartTick.onStartTick(class062022);
        }
    });
    public static final Event<ClientTickEvents$EndTick> END_CLIENT_TICK = EventFactory.createArrayBacked(ClientTickEvents$EndTick.class, clientTickEvents$EndTickArray -> class062022 -> {
        for (ClientTickEvents$EndTick clientTickEvents$EndTick : clientTickEvents$EndTickArray) {
            clientTickEvents$EndTick.onEndTick(class062022);
        }
    });
    public static final Event<ClientTickEvents$StartWorldTick> START_WORLD_TICK = EventFactory.createArrayBacked(ClientTickEvents$StartWorldTick.class, clientTickEvents$StartWorldTickArray -> class034482 -> {
        for (ClientTickEvents$StartWorldTick clientTickEvents$StartWorldTick : clientTickEvents$StartWorldTickArray) {
            clientTickEvents$StartWorldTick.onStartTick(class034482);
        }
    });
    public static final Event<ClientTickEvents$EndWorldTick> END_WORLD_TICK = EventFactory.createArrayBacked(ClientTickEvents$EndWorldTick.class, clientTickEvents$EndWorldTickArray -> class034482 -> {
        for (ClientTickEvents$EndWorldTick clientTickEvents$EndWorldTick : clientTickEvents$EndWorldTickArray) {
            clientTickEvents$EndWorldTick.onEndTick(class034482);
        }
    });

    private ClientTickEvents() {
    }
}


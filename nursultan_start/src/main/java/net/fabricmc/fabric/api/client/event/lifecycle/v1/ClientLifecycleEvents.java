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
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStarted;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientLifecycleEvents$ClientStopping;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientLifecycleEvents {
    public static final Event<ClientLifecycleEvents$ClientStarted> CLIENT_STARTED = EventFactory.createArrayBacked(ClientLifecycleEvents$ClientStarted.class, clientLifecycleEvents$ClientStartedArray -> class062022 -> {
        for (ClientLifecycleEvents$ClientStarted clientLifecycleEvents$ClientStarted : clientLifecycleEvents$ClientStartedArray) {
            clientLifecycleEvents$ClientStarted.onClientStarted(class062022);
        }
    });
    public static final Event<ClientLifecycleEvents$ClientStopping> CLIENT_STOPPING = EventFactory.createArrayBacked(ClientLifecycleEvents$ClientStopping.class, clientLifecycleEvents$ClientStoppingArray -> class062022 -> {
        for (ClientLifecycleEvents$ClientStopping clientLifecycleEvents$ClientStopping : clientLifecycleEvents$ClientStoppingArray) {
            clientLifecycleEvents$ClientStopping.onClientStopping(class062022);
        }
    });

    private ClientLifecycleEvents() {
    }
}


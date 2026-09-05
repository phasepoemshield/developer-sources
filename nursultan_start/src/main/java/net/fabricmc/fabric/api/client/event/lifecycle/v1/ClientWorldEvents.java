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
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientWorldEvents$AfterClientWorldChange;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class ClientWorldEvents {
    public static final Event<ClientWorldEvents$AfterClientWorldChange> AFTER_CLIENT_WORLD_CHANGE = EventFactory.createArrayBacked(ClientWorldEvents$AfterClientWorldChange.class, clientWorldEvents$AfterClientWorldChangeArray -> (class062022, class034482) -> {
        for (ClientWorldEvents$AfterClientWorldChange clientWorldEvents$AfterClientWorldChange : clientWorldEvents$AfterClientWorldChangeArray) {
            clientWorldEvents$AfterClientWorldChange.afterWorldChange(class062022, class034482);
        }
    });

    private ClientWorldEvents() {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.networking.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Register;
import net.fabricmc.fabric.api.client.networking.v1.C2SConfigurationChannelEvents$Unregister;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class C2SConfigurationChannelEvents {
    public static final Event<C2SConfigurationChannelEvents$Register> REGISTER = EventFactory.createArrayBacked(C2SConfigurationChannelEvents$Register.class, c2SConfigurationChannelEvents$RegisterArray -> (class018742, packetSender, class062022, list) -> {
        for (C2SConfigurationChannelEvents$Register c2SConfigurationChannelEvents$Register : c2SConfigurationChannelEvents$RegisterArray) {
            c2SConfigurationChannelEvents$Register.onChannelRegister(class018742, packetSender, class062022, list);
        }
    });
    public static final Event<C2SConfigurationChannelEvents$Unregister> UNREGISTER = EventFactory.createArrayBacked(C2SConfigurationChannelEvents$Unregister.class, c2SConfigurationChannelEvents$UnregisterArray -> (class018742, packetSender, class062022, list) -> {
        for (C2SConfigurationChannelEvents$Unregister c2SConfigurationChannelEvents$Unregister : c2SConfigurationChannelEvents$UnregisterArray) {
            c2SConfigurationChannelEvents$Unregister.onChannelUnregister(class018742, packetSender, class062022, list);
        }
    });

    private C2SConfigurationChannelEvents() {
    }
}


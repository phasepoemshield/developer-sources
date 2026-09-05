/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.networking.v1;

import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;
import net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents$Register;
import net.fabricmc.fabric.api.networking.v1.S2CConfigurationChannelEvents$Unregister;

public final class S2CConfigurationChannelEvents {
    public static final Event<S2CConfigurationChannelEvents$Register> REGISTER = EventFactory.createArrayBacked(S2CConfigurationChannelEvents$Register.class, s2CConfigurationChannelEvents$RegisterArray -> (class041762, packetSender, class027962, list) -> {
        for (S2CConfigurationChannelEvents$Register s2CConfigurationChannelEvents$Register : s2CConfigurationChannelEvents$RegisterArray) {
            s2CConfigurationChannelEvents$Register.onChannelRegister(class041762, packetSender, class027962, list);
        }
    });
    public static final Event<S2CConfigurationChannelEvents$Unregister> UNREGISTER = EventFactory.createArrayBacked(S2CConfigurationChannelEvents$Unregister.class, s2CConfigurationChannelEvents$UnregisterArray -> (class041762, packetSender, class027962, list) -> {
        for (S2CConfigurationChannelEvents$Unregister s2CConfigurationChannelEvents$Unregister : s2CConfigurationChannelEvents$UnregisterArray) {
            s2CConfigurationChannelEvents$Unregister.onChannelUnregister(class041762, packetSender, class027962, list);
        }
    });

    private S2CConfigurationChannelEvents() {
    }
}


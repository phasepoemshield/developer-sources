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
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents$Register;
import net.fabricmc.fabric.api.networking.v1.S2CPlayChannelEvents$Unregister;

public final class S2CPlayChannelEvents {
    public static final Event<S2CPlayChannelEvents$Register> REGISTER = EventFactory.createArrayBacked(S2CPlayChannelEvents$Register.class, s2CPlayChannelEvents$RegisterArray -> (class016152, packetSender, class027962, list) -> {
        for (S2CPlayChannelEvents$Register s2CPlayChannelEvents$Register : s2CPlayChannelEvents$RegisterArray) {
            s2CPlayChannelEvents$Register.onChannelRegister(class016152, packetSender, class027962, list);
        }
    });
    public static final Event<S2CPlayChannelEvents$Unregister> UNREGISTER = EventFactory.createArrayBacked(S2CPlayChannelEvents$Unregister.class, s2CPlayChannelEvents$UnregisterArray -> (class016152, packetSender, class027962, list) -> {
        for (S2CPlayChannelEvents$Unregister s2CPlayChannelEvents$Unregister : s2CPlayChannelEvents$UnregisterArray) {
            s2CPlayChannelEvents$Unregister.onChannelUnregister(class016152, packetSender, class027962, list);
        }
    });

    private S2CPlayChannelEvents() {
    }
}


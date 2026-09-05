/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Register
 *  net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents$Unregister
 *  net.fabricmc.fabric.api.event.Event
 *  net.fabricmc.fabric.api.event.EventFactory
 */
package net.fabricmc.fabric.api.client.networking.v1;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents;
import net.fabricmc.fabric.api.event.Event;
import net.fabricmc.fabric.api.event.EventFactory;

@Environment(value=EnvType.CLIENT)
public final class C2SPlayChannelEvents {
    public static final Event<Register> REGISTER = EventFactory.createArrayBacked(Register.class, registerArray -> (class016832, packetSender, class062022, list) -> {
        for (Register register : registerArray) {
            register.onChannelRegister(class016832, packetSender, class062022, list);
        }
    });
    public static final Event<Unregister> UNREGISTER = EventFactory.createArrayBacked(Unregister.class, unregisterArray -> (class016832, packetSender, class062022, list) -> {
        for (Unregister unregister : unregisterArray) {
            unregister.onChannelUnregister(class016832, packetSender, class062022, list);
        }
    });

    private C2SPlayChannelEvents() {
    }
}


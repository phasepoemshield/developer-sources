/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.event.events.type.EventState
 *  minecraft.class00381
 *  minecraft.class00642
 */
package baritone.api.event.events;

import baritone.api.event.events.type.EventState;
import minecraft.class00381;
import minecraft.class00642;

public final class PacketEvent {
    private final class00642 networkManager;
    private final EventState state;
    private final class00381<?> packet;

    public PacketEvent(class00642 class006422, EventState eventState, class00381<?> class003812) {
        this.networkManager = class006422;
        this.state = eventState;
        this.packet = class003812;
    }

    public final <T extends class00381<?>> T cast() {
        return (T)this.packet;
    }

    public final EventState getState() {
        return this.state;
    }

    public final class00381<?> getPacket() {
        return this.packet;
    }

    public final class00642 getNetworkManager() {
        return this.networkManager;
    }
}


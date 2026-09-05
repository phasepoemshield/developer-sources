/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.v1_20to1_20_2.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2;

public enum ClientboundConfigurationPackets1_20_2 implements ClientboundPacket1_20_2
{
    CUSTOM_PAYLOAD,
    DISCONNECT,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PING,
    REGISTRY_DATA,
    RESOURCE_PACK,
    UPDATE_ENABLED_FEATURES,
    UPDATE_TAGS;


    public int getId() {
        return this.ordinal();
    }

    public String getName() {
        return this.name();
    }

    public State state() {
        return State.CONFIGURATION;
    }
}


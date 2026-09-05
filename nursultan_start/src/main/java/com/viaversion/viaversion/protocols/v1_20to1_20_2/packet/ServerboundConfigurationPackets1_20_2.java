/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.v1_20to1_20_2.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2;

public enum ServerboundConfigurationPackets1_20_2 implements ServerboundPacket1_20_2,
ServerboundPacket1_20_3
{
    CLIENT_INFORMATION,
    CUSTOM_PAYLOAD,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PONG,
    RESOURCE_PACK;


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


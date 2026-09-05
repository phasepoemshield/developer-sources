/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;

public enum ServerboundConfigurationPackets1_21_9 implements ServerboundPacket1_21_9,
ServerboundPacket26_1
{
    CLIENT_INFORMATION,
    COOKIE_RESPONSE,
    CUSTOM_PAYLOAD,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PONG,
    RESOURCE_PACK,
    SELECT_KNOWN_PACKS,
    CUSTOM_CLICK_ACTION,
    ACCEPT_CODE_OF_CONDUCT;


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


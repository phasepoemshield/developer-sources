/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;

public enum ServerboundConfigurationPackets1_21_6 implements ServerboundPacket1_21_6
{
    CLIENT_INFORMATION,
    COOKIE_RESPONSE,
    CUSTOM_PAYLOAD,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PONG,
    RESOURCE_PACK,
    SELECT_KNOWN_PACKS,
    CUSTOM_CLICK_ACTION;


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


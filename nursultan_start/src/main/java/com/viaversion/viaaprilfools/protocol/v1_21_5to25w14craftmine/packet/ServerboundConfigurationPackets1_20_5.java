/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet;

import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ServerboundPacket25w14craftmine;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ServerboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;

public enum ServerboundConfigurationPackets1_20_5 implements ServerboundPacket1_20_5,
ServerboundPacket1_21_2,
ServerboundPacket1_21_4,
ServerboundPacket1_21_5,
ServerboundPacket25w14craftmine
{
    CLIENT_INFORMATION,
    COOKIE_RESPONSE,
    CUSTOM_PAYLOAD,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PONG,
    RESOURCE_PACK,
    SELECT_KNOWN_PACKS;


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


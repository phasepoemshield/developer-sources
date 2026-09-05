/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 */
package com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet;

import com.viaversion.viaaprilfools.protocol.v1_21_5to25w14craftmine.packet.ClientboundPacket25w14craftmine;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;

public enum ClientboundConfigurationPackets1_21 implements ClientboundPacket1_21,
ClientboundPacket1_21_2,
ClientboundPacket1_21_5,
ClientboundPacket25w14craftmine
{
    COOKIE_REQUEST,
    CUSTOM_PAYLOAD,
    DISCONNECT,
    FINISH_CONFIGURATION,
    KEEP_ALIVE,
    PING,
    RESET_CHAT,
    REGISTRY_DATA,
    RESOURCE_PACK_POP,
    RESOURCE_PACK_PUSH,
    STORE_COOKIE,
    TRANSFER,
    UPDATE_ENABLED_FEATURES,
    UPDATE_TAGS,
    SELECT_KNOWN_PACKS,
    CUSTOM_REPORT_DETAILS,
    SERVER_LINKS;


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


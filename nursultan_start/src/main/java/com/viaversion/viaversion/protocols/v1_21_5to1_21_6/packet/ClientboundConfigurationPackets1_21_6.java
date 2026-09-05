/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;

public enum ClientboundConfigurationPackets1_21_6 implements ClientboundPacket1_21_6
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
    SERVER_LINKS,
    CLEAR_DIALOG,
    SHOW_DIALOG;


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


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.base;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.base.packet.BaseClientboundPacket;

public enum ClientboundLoginPackets implements BaseClientboundPacket
{
    LOGIN_DISCONNECT,
    HELLO,
    LOGIN_FINISHED,
    LOGIN_COMPRESSION,
    CUSTOM_QUERY,
    COOKIE_REQUEST;

    @Deprecated(forRemoval=true)
    public static final ClientboundLoginPackets GAME_PROFILE;

    public final int getId() {
        return this.ordinal();
    }

    public final String getName() {
        return this.name();
    }

    public final State state() {
        return State.LOGIN;
    }

    static {
        GAME_PROFILE = LOGIN_FINISHED;
    }
}


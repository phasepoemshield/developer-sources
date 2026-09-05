/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.protocols.base;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.protocols.base.packet.BaseClientboundPacket;

public enum ClientboundStatusPackets implements BaseClientboundPacket
{
    STATUS_RESPONSE,
    PONG_RESPONSE;


    public final int getId() {
        return this.ordinal();
    }

    public final String getName() {
        return this.name();
    }

    public final State state() {
        return State.STATUS;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 */
package com.viaversion.viabackwards.protocol.v1_16_1to1_16;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;

public class Protocol1_16_1To1_16
extends BackwardsProtocol<ClientboundPackets1_16, ClientboundPackets1_16, ServerboundPackets1_16, ServerboundPackets1_16> {
    public Protocol1_16_1To1_16() {
        super(ClientboundPackets1_16.class, ClientboundPackets1_16.class, ServerboundPackets1_16.class, ServerboundPackets1_16.class);
    }
}


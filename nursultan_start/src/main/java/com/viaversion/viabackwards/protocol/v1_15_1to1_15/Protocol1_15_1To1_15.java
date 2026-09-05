/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 */
package com.viaversion.viabackwards.protocol.v1_15_1to1_15;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;

public class Protocol1_15_1To1_15
extends BackwardsProtocol<ClientboundPackets1_15, ClientboundPackets1_15, ServerboundPackets1_14, ServerboundPackets1_14> {
    public Protocol1_15_1To1_15() {
        super(ClientboundPackets1_15.class, ClientboundPackets1_15.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }
}


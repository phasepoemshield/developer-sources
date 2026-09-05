/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_14_3to1_14_4;

import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;

public class Protocol1_14_3To1_14_4
extends AbstractProtocol<ClientboundPackets1_14, ClientboundPackets1_14_4, ServerboundPackets1_14, ServerboundPackets1_14> {
    public Protocol1_14_3To1_14_4() {
        super(ClientboundPackets1_14.class, ClientboundPackets1_14_4.class, null, null);
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPackets1_14.MERCHANT_OFFERS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.ITEM1_13_2);
                wrapper.passthrough(Types.ITEM1_13_2);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.ITEM1_13_2);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.INT);
                wrapper.passthrough((Type)Types.FLOAT);
                wrapper.write((Type)Types.INT, (Object)0);
            }
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4
 */
package com.viaversion.viabackwards.protocol.v1_14_4to1_14_3;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;

public class Protocol1_14_4To1_14_3
extends BackwardsProtocol<ClientboundPackets1_14_4, ClientboundPackets1_14, ServerboundPackets1_14, ServerboundPackets1_14> {
    public Protocol1_14_4To1_14_3() {
        super(ClientboundPackets1_14_4.class, ClientboundPackets1_14.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14_4.BLOCK_BREAK_ACK, (ClientboundPacketType)ClientboundPackets1_14.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int status = (Integer)wrapper.read((Type)Types.VAR_INT);
                    boolean allGood = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    if (allGood && status == 0) {
                        wrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14_4.MERCHANT_OFFERS, wrapper -> {
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
                wrapper.read((Type)Types.INT);
            }
        });
    }
}


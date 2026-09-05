/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_16_3to1_16_4;

import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;

public class Protocol1_16_3To1_16_4
extends AbstractProtocol<ClientboundPackets1_16_2, ClientboundPackets1_16_2, ServerboundPackets1_16_2, ServerboundPackets1_16_2> {
    public Protocol1_16_3To1_16_4() {
        super(ClientboundPackets1_16_2.class, ClientboundPackets1_16_2.class, ServerboundPackets1_16_2.class, ServerboundPackets1_16_2.class);
    }

    protected void registerPackets() {
        this.registerServerbound(ServerboundPackets1_16_2.EDIT_BOOK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.ITEM1_13_2);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)(slot == 40 ? 1 : 0));
                });
            }
        });
    }
}


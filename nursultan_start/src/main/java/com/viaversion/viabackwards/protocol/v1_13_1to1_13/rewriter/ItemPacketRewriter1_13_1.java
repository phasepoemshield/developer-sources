/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 */
package com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter;

import com.viaversion.viabackwards.protocol.v1_13_1to1_13.Protocol1_13_1To1_13;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.rewriter.ItemRewriter;

public class ItemPacketRewriter1_13_1
extends ItemRewriter<ClientboundPackets1_13, ServerboundPackets1_13, Protocol1_13_1To1_13> {
    public ItemPacketRewriter1_13_1(Protocol1_13_1To1_13 protocol) {
        super((Protocol)protocol, Types.ITEM1_13, Types.ITEM1_13_SHORT_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_13_1To1_13)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.CUSTOM_PAYLOAD, wrapper -> {
            String channel = (String)wrapper.passthrough(Types.STRING);
            if (channel.equals("minecraft:trader_list")) {
                wrapper.passthrough((Type)Types.INT);
                int size = ((Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE)).shortValue();
                for (int i = 0; i < size; ++i) {
                    this.passthroughClientboundItem(wrapper);
                    this.passthroughClientboundItem(wrapper);
                    boolean secondItem = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
                    if (secondItem) {
                        this.passthroughClientboundItem(wrapper);
                    }
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.INT);
                    wrapper.passthrough((Type)Types.INT);
                }
            }
        });
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_11to1_11_1.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11to1_11_1.Protocol1_11To1_11_1;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.ItemRewriter;

public class ItemPacketRewriter1_11_1
extends ItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_9_3, Protocol1_11To1_11_1> {
    public ItemPacketRewriter1_11_1(Protocol1_11To1_11_1 protocol) {
        super((Protocol)protocol, Types.ITEM1_8, Types.ITEM1_8_SHORT_ARRAY);
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        boolean newItem;
        if (item == null) {
            return null;
        }
        boolean bl = newItem = item.identifier() == 452;
        if (newItem) {
            item.setIdentifier(1);
            item.setData((short)0);
        }
        return item;
    }

    public void registerPackets() {
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
    }
}


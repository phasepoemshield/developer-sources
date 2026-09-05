/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter
 *  com.viaversion.viabackwards.api.rewriters.LegacyEnchantmentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_11_1to1_11.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter;
import com.viaversion.viabackwards.api.rewriters.LegacyEnchantmentRewriter;
import com.viaversion.viabackwards.protocol.v1_11_1to1_11.Protocol1_11_1To1_11;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;

public class ItemPacketRewriter1_11_1
extends LegacyBlockItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_9_3, Protocol1_11_1To1_11> {
    private LegacyEnchantmentRewriter enchantmentRewriter;

    public ItemPacketRewriter1_11_1(Protocol1_11_1To1_11 protocol) {
        super((BackwardsProtocol)protocol, "1.11.1");
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        super.handleItemToClient(connection, item);
        this.enchantmentRewriter.handleToClient(item);
        return item;
    }

    protected void registerRewrites() {
        this.enchantmentRewriter = new LegacyEnchantmentRewriter(this.nbtTagName());
        this.enchantmentRewriter.registerEnchantment(22, "\u00a77Sweeping Edge");
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        item = super.handleItemToServer(connection, item);
        this.enchantmentRewriter.handleToServer(item);
        return item;
    }

    protected void registerPackets() {
        this.registerSetSlot((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_SLOT);
        this.registerSetContent((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_CONTENT);
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_9_3.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_PAYLOAD);
        this.registerContainerClick((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLICK);
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
        ((Protocol1_11_1To1_11)this.protocol).getEntityRewriter().filter().handler((event, data) -> {
            if (data.dataType().type().equals(Types.ITEM1_8)) {
                data.setValue((Object)this.handleItemToClient(event.user(), (Item)data.getValue()));
            }
        });
    }
}


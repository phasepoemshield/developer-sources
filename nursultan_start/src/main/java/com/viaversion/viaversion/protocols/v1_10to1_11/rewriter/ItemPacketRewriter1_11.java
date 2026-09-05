/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_10to1_11.rewriter;

import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.ItemRewriter;

public class ItemPacketRewriter1_11
extends ItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_9_3, Protocol1_10To1_11> {
    public ItemPacketRewriter1_11(Protocol1_10To1_11 protocol) {
        super((Protocol)protocol, Types.ITEM1_8, Types.ITEM1_8_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        CompoundTag tag;
        if (item != null && item.amount() <= 0) {
            tag = item.tag();
            if (tag == null) {
                tag = new CompoundTag();
                item.setTag(tag);
            }
            tag.putByte(this.nbtTagName(), (byte)item.amount());
            item.setAmount(1);
        }
        EntityMappings1_11.toClientItem((Item)item);
        if (item == null || item.tag() == null) {
            return item;
        }
        tag = item.tag();
        ListTag enchTag = tag.getListTag("ench");
        if (enchTag != null && enchTag.isEmpty()) {
            tag.putBoolean(this.nbtTagName("clearEnch"), true);
            enchTag.add((Tag)new CompoundTag());
        }
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (tag != null) {
            if (tag.contains(this.nbtTagName())) {
                item.setAmount((int)((ByteTag)tag.removeUnchecked(this.nbtTagName())).asByte());
                if (tag.isEmpty()) {
                    item.setTag(null);
                }
            }
            if (tag.remove(this.nbtTagName("clearEnch")) != null) {
                tag.put("ench", (Tag)new ListTag());
            }
        }
        EntityMappings1_11.toServerItem((Item)item);
        boolean newItem = item.identifier() >= 218 && item.identifier() <= 234;
        if (newItem |= item.identifier() == 449 || item.identifier() == 450) {
            item.setIdentifier(1);
            item.setData((short)0);
        }
        return item;
    }

    public void registerPackets() {
        this.registerSetSlot((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_SLOT);
        this.registerSetContent((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_CONTENT);
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_9_3.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_PAYLOAD);
        this.registerContainerClick((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLICK);
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.protocol.v1_17_1to1_17.storage.InventoryStateIds
 *  com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 */
package com.viaversion.viabackwards.protocol.v1_17_1to1_17;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_17_1to1_17.storage.InventoryStateIds;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;

public final class Protocol1_17_1To1_17
extends BackwardsProtocol<ClientboundPackets1_17_1, ClientboundPackets1_17, ServerboundPackets1_17, ServerboundPackets1_17> {
    private static final int MAX_PAGE_LENGTH = 8192;
    private static final int MAX_TITLE_LENGTH = 128;
    private static final int MAX_PAGES = 200;

    public Protocol1_17_1To1_17() {
        super(ClientboundPackets1_17_1.class, ClientboundPackets1_17.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    public void init(UserConnection connection) {
        connection.put((StorableObject)new InventoryStateIds());
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17_1.REMOVE_ENTITIES, null, wrapper -> {
            int[] entityIds = (int[])wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
            wrapper.cancel();
            for (int entityId : entityIds) {
                PacketWrapper newPacket = wrapper.create((PacketType)ClientboundPackets1_17.REMOVE_ENTITY);
                newPacket.write((Type)Types.VAR_INT, (Object)entityId);
                newPacket.send(Protocol1_17_1To1_17.class);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_CLOSE, wrapper -> {
            short containerId = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            ((InventoryStateIds)wrapper.user().get(InventoryStateIds.class)).removeStateId((int)containerId);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_SET_SLOT, wrapper -> {
            byte containerId = (Byte)wrapper.passthrough((Type)Types.BYTE);
            int stateId = (Integer)wrapper.read((Type)Types.VAR_INT);
            ((InventoryStateIds)wrapper.user().get(InventoryStateIds.class)).setStateId((int)containerId, stateId);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17_1.CONTAINER_SET_CONTENT, wrapper -> {
            short containerId = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            int stateId = (Integer)wrapper.read((Type)Types.VAR_INT);
            ((InventoryStateIds)wrapper.user().get(InventoryStateIds.class)).setStateId((int)containerId, stateId);
            wrapper.write(Types.ITEM1_13_2_SHORT_ARRAY, (Object)((Item[])wrapper.read(Types.ITEM1_13_2_ARRAY)));
            Item carried = (Item)wrapper.read(Types.ITEM1_13_2);
            PlayerLastCursorItem lastCursorItem = (PlayerLastCursorItem)wrapper.user().get(PlayerLastCursorItem.class);
            if (lastCursorItem != null) {
                lastCursorItem.setLastCursorItem(carried);
                PacketWrapper cursorPacket = wrapper.create((PacketType)ClientboundPackets1_17.CONTAINER_SET_SLOT);
                cursorPacket.write((Type)Types.BYTE, (Object)-1);
                cursorPacket.write((Type)Types.SHORT, (Object)-1);
                cursorPacket.write(Types.ITEM1_13_2, (Object)carried);
                cursorPacket.send(Protocol1_17_1To1_17.class);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLOSE, wrapper -> {
            byte containerId = (Byte)wrapper.passthrough((Type)Types.BYTE);
            ((InventoryStateIds)wrapper.user().get(InventoryStateIds.class)).removeStateId((int)containerId);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CONTAINER_CLICK, wrapper -> {
            byte containerId = (Byte)wrapper.passthrough((Type)Types.BYTE);
            int stateId = ((InventoryStateIds)wrapper.user().get(InventoryStateIds.class)).removeStateId((int)containerId);
            wrapper.write((Type)Types.VAR_INT, (Object)(stateId == Integer.MAX_VALUE ? 0 : stateId));
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.EDIT_BOOK, wrapper -> {
            ListTag pagesTag;
            Item item = (Item)wrapper.read(Types.ITEM1_13_2);
            boolean signing = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.VAR_INT);
            if (item == null) {
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                return;
            }
            CompoundTag tag = item.tag();
            StringTag titleTag = null;
            if (tag == null || (pagesTag = tag.getListTag("pages", StringTag.class)) == null || signing && (titleTag = tag.getStringTag("title")) == null) {
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                return;
            }
            if (pagesTag.size() > 200) {
                pagesTag = new ListTag(pagesTag.getValue().subList(0, 200));
            }
            wrapper.write((Type)Types.VAR_INT, (Object)pagesTag.size());
            for (StringTag pageTag : pagesTag) {
                String page = pageTag.getValue();
                if (page.length() > 8192) {
                    page = page.substring(0, 8192);
                }
                wrapper.write(Types.STRING, (Object)page);
            }
            wrapper.write((Type)Types.BOOLEAN, (Object)signing);
            if (signing) {
                String title = titleTag.getValue();
                if (title.length() > 128) {
                    title = title.substring(0, 128);
                }
                wrapper.write(Types.STRING, (Object)title);
            }
        });
    }
}


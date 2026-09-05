/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.UUIDUtil
 */
package com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.Protocol1_15_2To1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.data.AttributeMappings1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.UUIDUtil;
import java.util.UUID;

public class ItemPacketRewriter1_16
extends ItemRewriter<ClientboundPackets1_15, ServerboundPackets1_16, Protocol1_15_2To1_16> {
    public ItemPacketRewriter1_16(Protocol1_15_2To1_16 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        ListTag pages;
        if (item == null) {
            return null;
        }
        CompoundTag tag = item.tag();
        if (item.identifier() == 771 && tag != null) {
            StringTag idTag;
            CompoundTag ownerTag = tag.getCompoundTag("SkullOwner");
            if (ownerTag != null && (idTag = ownerTag.getStringTag("Id")) != null) {
                UUID id = UUID.fromString(idTag.getValue());
                ownerTag.put("Id", (Tag)new IntArrayTag(UUIDUtil.toIntArray((UUID)id)));
            }
        } else if (item.identifier() == 759 && tag != null && (pages = tag.getListTag("pages", StringTag.class)) != null) {
            for (StringTag pageTag : pages) {
                pageTag.setValue(((Protocol1_15_2To1_16)this.protocol).getComponentRewriter().processText(connection, pageTag.getValue()).toString());
            }
        }
        ItemPacketRewriter1_16.oldToNewAttributes(item);
        item.setIdentifier(Protocol1_15_2To1_16.MAPPINGS.getNewItemId(item.identifier()));
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        IntArrayTag idTag;
        CompoundTag tag;
        CompoundTag ownerTag;
        if (item == null) {
            return null;
        }
        item.setIdentifier(Protocol1_15_2To1_16.MAPPINGS.getOldItemId(item.identifier()));
        if (item.identifier() == 771 && item.tag() != null && (ownerTag = (tag = item.tag()).getCompoundTag("SkullOwner")) != null && (idTag = ownerTag.getIntArrayTag("Id")) != null) {
            UUID id = UUIDUtil.fromIntArray((int[])idTag.getValue());
            ownerTag.putString("Id", id.toString());
        }
        ItemPacketRewriter1_16.newToOldAttributes(item);
        return item;
    }

    public void registerPackets() {
        final PacketHandler cursorRemapper = wrapper -> {
            PacketWrapper clearPacket = wrapper.create((PacketType)ClientboundPackets1_16.CONTAINER_SET_SLOT);
            clearPacket.write((Type)Types.BYTE, (Object)-1);
            clearPacket.write((Type)Types.SHORT, (Object)-1);
            clearPacket.write(Types.ITEM1_13_2, null);
            clearPacket.send(Protocol1_15_2To1_16.class);
        };
        ((Protocol1_15_2To1_16)this.protocol).replaceClientbound(ClientboundPackets1_15.OPEN_SCREEN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map(Types.COMPONENT);
                this.handler(cursorRemapper);
                this.handler(wrapper -> {
                    InventoryTracker1_16 inventoryTracker = (InventoryTracker1_16)wrapper.user().get(InventoryTracker1_16.class);
                    int windowType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    if (windowType >= 20) {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)(++windowType));
                    }
                    inventoryTracker.setInventoryOpen(true);
                });
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.CONTAINER_CLOSE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(cursorRemapper);
                this.handler(wrapper -> {
                    InventoryTracker1_16 inventoryTracker = (InventoryTracker1_16)wrapper.user().get(InventoryTracker1_16.class);
                    inventoryTracker.setInventoryOpen(false);
                });
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.CONTAINER_SET_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    short enchantmentId;
                    short property = (Short)wrapper.get((Type)Types.SHORT, 0);
                    if (property >= 4 && property <= 6 && (enchantmentId = ((Short)wrapper.get((Type)Types.SHORT, 1)).shortValue()) >= 11) {
                        enchantmentId = (short)(enchantmentId + 1);
                        wrapper.set((Type)Types.SHORT, 1, (Object)enchantmentId);
                    }
                });
            }
        });
        ((Protocol1_15_2To1_16)this.protocol).registerClientbound(ClientboundPackets1_15.SET_EQUIPPED_ITEM, ClientboundPackets1_16.SET_EQUIPMENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.BYTE, (Object)((byte)slot));
                    ItemPacketRewriter1_16.this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                });
            }
        });
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_15.UPDATE_RECIPES);
        ((Protocol1_15_2To1_16)this.protocol).registerServerbound(ServerboundPackets1_16.CONTAINER_CLOSE, wrapper -> {
            InventoryTracker1_16 inventoryTracker = (InventoryTracker1_16)wrapper.user().get(InventoryTracker1_16.class);
            inventoryTracker.setInventoryOpen(false);
        });
        ((Protocol1_15_2To1_16)this.protocol).registerServerbound(ServerboundPackets1_16.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
    }

    public static void rewriteAttributeName(CompoundTag compoundTag, String entryName, boolean inverse) {
        String mappedAttribute;
        StringTag attributeNameTag = compoundTag.getStringTag(entryName);
        if (attributeNameTag == null) {
            return;
        }
        String attributeName = attributeNameTag.getValue();
        if (inverse) {
            attributeName = Key.namespaced((String)attributeName);
        }
        if ((mappedAttribute = (String)(inverse ? AttributeMappings1_16.attributeIdentifierMappings().inverse() : AttributeMappings1_16.attributeIdentifierMappings()).get((Object)attributeName)) == null) {
            return;
        }
        attributeNameTag.setValue(mappedAttribute);
    }

    public static void oldToNewAttributes(Item item) {
        if (item.tag() == null) {
            return;
        }
        ListTag attributes = item.tag().getListTag("AttributeModifiers", CompoundTag.class);
        if (attributes == null) {
            return;
        }
        for (CompoundTag attribute : attributes) {
            ItemPacketRewriter1_16.rewriteAttributeName(attribute, "AttributeName", false);
            ItemPacketRewriter1_16.rewriteAttributeName(attribute, "Name", false);
            NumberTag leastTag = attribute.getNumberTag("UUIDLeast");
            NumberTag mostTag = attribute.getNumberTag("UUIDMost");
            if (leastTag == null || mostTag == null) continue;
            int[] uuidIntArray = UUIDUtil.toIntArray((long)mostTag.asLong(), (long)leastTag.asLong());
            attribute.put("UUID", (Tag)new IntArrayTag(uuidIntArray));
            attribute.remove("UUIDLeast");
            attribute.remove("UUIDMost");
        }
    }

    public static void newToOldAttributes(Item item) {
        if (item.tag() == null) {
            return;
        }
        ListTag attributes = item.tag().getListTag("AttributeModifiers", CompoundTag.class);
        if (attributes == null) {
            return;
        }
        for (CompoundTag attribute : attributes) {
            ItemPacketRewriter1_16.rewriteAttributeName(attribute, "AttributeName", true);
            ItemPacketRewriter1_16.rewriteAttributeName(attribute, "Name", true);
            IntArrayTag uuidTag = attribute.getIntArrayTag("UUID");
            if (uuidTag == null || uuidTag.getValue().length != 4) continue;
            UUID uuid = UUIDUtil.fromIntArray((int[])uuidTag.getValue());
            attribute.putLong("UUIDLeast", uuid.getLeastSignificantBits());
            attribute.putLong("UUIDMost", uuid.getMostSignificantBits());
            attribute.remove("UUID");
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.ByteArrayTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter.BlockItemPacketRewriter1_21_4
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 */
package com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.rewriter;

import com.viaversion.nbt.tag.ByteArrayTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_4to1_21_2.Protocol1_21_4To1_21_2;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;

public final class BlockItemPacketRewriter1_21_4
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_2, ServerboundPacket1_21_2, Protocol1_21_4To1_21_2> {
    public BlockItemPacketRewriter1_21_4(Protocol1_21_4To1_21_2 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public Item handleItemToClient(UserConnection connection, Item item) {
        StructuredDataContainer dataContainer = (item = super.handleItemToClient(connection, item)).dataContainer();
        CustomModelData1_21_4 modelData = (CustomModelData1_21_4)dataContainer.get(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4);
        if (modelData != null) {
            this.saveTag(this.createCustomTag(item), (Tag)this.customModelDataToTag(modelData), "custom_model_data");
            if (ViaBackwards.getConfig().mapCustomModelData() && modelData.floats().length > 0) {
                int data = (int)modelData.floats()[0];
                dataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, (Object)data);
            }
        }
        com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter.BlockItemPacketRewriter1_21_4.downgradeItemData((Item)item);
        return item;
    }

    public Item handleItemToServer(UserConnection connection, Item item) {
        Tag tag;
        StructuredDataContainer dataContainer = (item = super.handleItemToServer(connection, item)).dataContainer();
        CompoundTag customData = (CompoundTag)dataContainer.get(StructuredDataKey.CUSTOM_DATA);
        if (customData != null && (tag = customData.remove(this.nbtTagName("custom_model_data"))) instanceof CompoundTag) {
            CompoundTag customModelData = (CompoundTag)tag;
            dataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, (Object)this.customModelDataFromTag(customModelData));
            this.removeCustomTag(dataContainer, customData);
        }
        com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter.BlockItemPacketRewriter1_21_4.updateItemData((Item)item);
        return item;
    }

    public void registerPackets() {
        ((Protocol1_21_4To1_21_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_HELD_SLOT, wrapper -> {
            int slot = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BYTE, (Object)((byte)slot));
        });
        ((Protocol1_21_4To1_21_2)this.protocol).cancelServerbound((ServerboundPacketType)ServerboundPackets1_21_2.PICK_ITEM);
    }

    private CustomModelData1_21_4 customModelDataFromTag(CompoundTag tag) {
        IntArrayTag floatsTag = tag.getIntArrayTag("floats");
        float[] floats = new float[floatsTag.getValue().length];
        for (int i = 0; i < floats.length; ++i) {
            floats[i] = Float.intBitsToFloat(floatsTag.get(i));
        }
        ByteArrayTag booleansTag = tag.getByteArrayTag("booleans");
        boolean[] booleans = new boolean[booleansTag.getValue().length];
        for (int i = 0; i < booleans.length; ++i) {
            booleans[i] = booleansTag.get(i) != 0;
        }
        ListTag stringsTag = tag.getListTag("strings", StringTag.class);
        String[] strings = new String[stringsTag.size()];
        for (int i = 0; i < strings.length; ++i) {
            strings[i] = ((StringTag)stringsTag.get(i)).getValue();
        }
        IntArrayTag colorsTag = tag.getIntArrayTag("colors");
        return new CustomModelData1_21_4(floats, booleans, strings, colorsTag.getValue());
    }

    private CompoundTag customModelDataToTag(CustomModelData1_21_4 customModelData) {
        CompoundTag tag = new CompoundTag();
        int[] floats = new int[customModelData.floats().length];
        for (int i = 0; i < floats.length; ++i) {
            floats[i] = Float.floatToIntBits(customModelData.floats()[i]);
        }
        tag.put("floats", (Tag)new IntArrayTag(floats));
        byte[] booleans = new byte[customModelData.booleans().length];
        for (int i = 0; i < booleans.length; ++i) {
            booleans[i] = (byte)(customModelData.booleans()[i] ? 1 : 0);
        }
        tag.put("booleans", (Tag)new ByteArrayTag(booleans));
        ListTag strings = new ListTag(StringTag.class);
        for (String string : customModelData.strings()) {
            strings.add((Tag)new StringTag(string));
        }
        tag.put("strings", (Tag)strings);
        tag.put("colors", (Tag)new IntArrayTag(customModelData.colors()));
        return tag;
    }
}


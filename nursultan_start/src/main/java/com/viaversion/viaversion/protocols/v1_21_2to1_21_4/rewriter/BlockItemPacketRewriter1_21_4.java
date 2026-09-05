/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2
 *  com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2$ConsumeEffect
 *  com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 */
package com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.Consumable1_21_2;
import com.viaversion.viaversion.api.minecraft.item.data.CustomModelData1_21_4;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPacket1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.provider.PickItemProvider;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;

public final class BlockItemPacketRewriter1_21_4
extends StructuredItemRewriter<ClientboundPacket1_21_2, ServerboundPacket1_21_4, Protocol1_21_2To1_21_4> {
    public BlockItemPacketRewriter1_21_4(Protocol1_21_2To1_21_4 protocol1_21_2To1_21_4) {
        super((Protocol)protocol1_21_2To1_21_4);
    }

    public Item handleItemToClient(UserConnection userConnection, Item item) {
        super.handleItemToClient(userConnection, item);
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        Integer n = (Integer)structuredDataContainer.get(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5);
        if (n != null) {
            structuredDataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4, (Object)new CustomModelData1_21_4(new float[]{n.floatValue()}, new boolean[0], new String[0], new int[0]));
            this.saveTag(this.createCustomTag(item), (Tag)new IntTag(n.intValue()), "custom_model_data");
        }
        BlockItemPacketRewriter1_21_4.updateItemData(item);
        this.appendItemDataFixComponents(userConnection, item);
        return item;
    }

    public Item handleItemToServer(UserConnection userConnection, Item item) {
        Tag tag;
        super.handleItemToServer(userConnection, item);
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        CompoundTag compoundTag = (CompoundTag)structuredDataContainer.get(StructuredDataKey.CUSTOM_DATA);
        if (compoundTag != null && (tag = compoundTag.remove(this.nbtTagName("custom_model_data"))) instanceof IntTag) {
            IntTag intTag = (IntTag)tag;
            structuredDataContainer.set(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5, (Object)intTag.asInt());
            this.removeCustomTag(structuredDataContainer, compoundTag);
        }
        BlockItemPacketRewriter1_21_4.downgradeItemData(item);
        return item;
    }

    public void registerPackets() {
        ((Protocol1_21_2To1_21_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_2.SET_HELD_SLOT, packetWrapper -> {
            byte by = (Byte)packetWrapper.read((Type)Types.BYTE);
            packetWrapper.write((Type)Types.VAR_INT, (Object)by);
        });
        ((Protocol1_21_2To1_21_4)this.protocol).registerServerbound(ServerboundPackets1_21_4.PICK_ITEM_FROM_BLOCK, null, packetWrapper -> {
            BlockPosition blockPosition = (BlockPosition)packetWrapper.read(Types.BLOCK_POSITION1_14);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            ((PickItemProvider)Via.getManager().getProviders().get(PickItemProvider.class)).pickItemFromBlock(packetWrapper.user(), blockPosition, bl);
            packetWrapper.cancel();
        });
        ((Protocol1_21_2To1_21_4)this.protocol).registerServerbound(ServerboundPackets1_21_4.PICK_ITEM_FROM_ENTITY, null, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            ((PickItemProvider)Via.getManager().getProviders().get(PickItemProvider.class)).pickItemFromEntity(packetWrapper.user(), n, bl);
            packetWrapper.cancel();
        });
    }

    public static void updateItemData(Item item) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        structuredDataContainer.replaceKey(StructuredDataKey.TRIM1_21_2, StructuredDataKey.TRIM1_21_4);
        structuredDataContainer.remove(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5);
    }

    public static void downgradeItemData(Item item) {
        StructuredDataContainer structuredDataContainer = item.dataContainer();
        structuredDataContainer.replaceKey(StructuredDataKey.TRIM1_21_4, StructuredDataKey.TRIM1_21_2);
        structuredDataContainer.remove(StructuredDataKey.CUSTOM_MODEL_DATA1_21_4);
    }

    private boolean redirect$dle000$viafabricplus$changeSwordFixVersionRange(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
        if (protocolVersion2 == ProtocolVersion.v1_8) {
            return protocolVersion.betweenInclusive(LegacyProtocolVersion.b1_8tob1_8_1, ProtocolVersion.v1_8);
        }
        return protocolVersion.olderThanOrEqualTo(protocolVersion2);
    }

    private void appendItemDataFixComponents(UserConnection userConnection, Item item) {
        block2: {
            block3: {
                ProtocolVersion protocolVersion;
                ProtocolVersion protocolVersion2 = userConnection.getProtocolInfo().serverProtocolVersion();
                ProtocolVersion protocolVersion3 = protocolVersion2;
                if (!this.redirect$dle000$viafabricplus$changeSwordFixVersionRange(protocolVersion3, protocolVersion = ProtocolVersion.v1_8)) break block2;
                if (item.identifier() == 849) break block3;
                if (item.identifier() == 854) break block3;
                if (item.identifier() == 859) break block3;
                if (item.identifier() == 864) break block3;
                if (item.identifier() != 869) break block2;
            }
            item.dataContainer().set(StructuredDataKey.CONSUMABLE1_21_2, (Object)new Consumable1_21_2(3600.0f, 3, Holder.of((Object)new SoundEvent("minecraft:intentionally_empty", null)), false, new Consumable1_21_2.ConsumeEffect[0]));
        }
    }
}


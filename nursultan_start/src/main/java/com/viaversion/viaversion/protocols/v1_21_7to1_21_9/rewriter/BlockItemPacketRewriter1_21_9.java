/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ResolvableProfile
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.data.Bee
 *  com.viaversion.viaversion.api.minecraft.item.data.BlockEntityData
 *  com.viaversion.viaversion.api.minecraft.item.data.EntityData
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.storage.DimensionScaleStorage
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ResolvableProfile;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_9;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.data.Bee;
import com.viaversion.viaversion.api.minecraft.item.data.BlockEntityData;
import com.viaversion.viaversion.api.minecraft.item.data.EntityData;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPackets1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.Protocol1_21_7To1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.storage.DimensionScaleStorage;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;

public final class BlockItemPacketRewriter1_21_9
extends StructuredItemRewriter<ClientboundPacket1_21_6, ServerboundPacket1_21_9, Protocol1_21_7To1_21_9> {
    public BlockItemPacketRewriter1_21_9(Protocol1_21_7To1_21_9 protocol) {
        super((Protocol)protocol);
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter1_21_9.downgradeData(item, container);
        super.handleItemDataComponentsToServer(connection, item, container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        BlockItemPacketRewriter1_21_9.upgradeData(item, container);
        super.handleItemDataComponentsToClient(connection, item, container);
    }

    public void registerPackets() {
        ((Protocol1_21_7To1_21_9)this.protocol).registerClientbound(ClientboundPackets1_21_6.INITIALIZE_BORDER, this::updateBorderCenter);
        ((Protocol1_21_7To1_21_9)this.protocol).registerClientbound(ClientboundPackets1_21_6.SET_BORDER_CENTER, this::updateBorderCenter);
    }

    public static void upgradeData(Item item, StructuredDataContainer container) {
        container.replace(StructuredDataKey.BEES1_20_5, StructuredDataKey.BEES1_21_9, bees -> {
            for (int i = 0; i < ((Bee[])bees).length; ++i) {
                Bee bee = bees[i];
                bees[i] = new Bee(new EntityData(EntityTypes1_21_9.BEE.getId(), bee.entityData().tag()), bee.ticksInHive(), bee.minTicksInHive());
            }
            return bees;
        });
        container.replace(StructuredDataKey.ENTITY_DATA1_20_5, StructuredDataKey.ENTITY_DATA1_21_9, tag -> {
            int id = Protocol1_21_7To1_21_9.MAPPINGS.getEntityMappings().mappedId(tag.getString("id", "pig"));
            return new EntityData(id == -1 ? 0 : id, tag);
        });
        container.replace(StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, StructuredDataKey.BLOCK_ENTITY_DATA1_21_9, tag -> {
            int id = Protocol1_21_7To1_21_9.MAPPINGS.getBlockEntityMappings().mappedId(tag.getString("id", "furnace"));
            return new BlockEntityData(id == -1 ? 0 : id, tag);
        });
        container.replace(StructuredDataKey.PROFILE1_20_5, StructuredDataKey.PROFILE1_21_9, ResolvableProfile::new);
    }

    public static void downgradeData(Item item, StructuredDataContainer container) {
        container.replaceKey(StructuredDataKey.BEES1_21_9, StructuredDataKey.BEES1_20_5);
        container.replace(StructuredDataKey.ENTITY_DATA1_21_9, StructuredDataKey.ENTITY_DATA1_20_5, entityData -> {
            String id = Protocol1_21_7To1_21_9.MAPPINGS.getEntityMappings().identifier(entityData.type());
            entityData.tag().putString("id", id);
            return entityData.tag();
        });
        container.replace(StructuredDataKey.BLOCK_ENTITY_DATA1_21_9, StructuredDataKey.BLOCK_ENTITY_DATA1_20_5, blockEntityData -> {
            String id = Protocol1_21_7To1_21_9.MAPPINGS.getBlockEntityMappings().identifier(blockEntityData.type());
            blockEntityData.tag().putString("id", id);
            return blockEntityData.tag();
        });
        container.replace(StructuredDataKey.PROFILE1_21_9, StructuredDataKey.PROFILE1_20_5, ResolvableProfile::profile);
    }

    private void updateBorderCenter(PacketWrapper wrapper) {
        double centerX = (Double)wrapper.read((Type)Types.DOUBLE);
        double centerZ = (Double)wrapper.read((Type)Types.DOUBLE);
        EntityTracker tracker = ((Protocol1_21_7To1_21_9)this.protocol).getEntityRewriter().tracker(wrapper.user());
        if (tracker.currentDimensionId() != -1) {
            double scale = ((DimensionScaleStorage)wrapper.user().get(DimensionScaleStorage.class)).getScale(tracker.currentDimensionId());
            centerX /= scale;
            centerZ /= scale;
        }
        wrapper.write((Type)Types.DOUBLE, (Object)centerX);
        wrapper.write((Type)Types.DOUBLE, (Object)centerZ);
    }
}


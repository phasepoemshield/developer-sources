/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ResolvableProfile
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.BlockItemPacketRewriter1_21_9
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.Protocol1_21_9To1_21_7;
import com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.storage.DimensionScaleStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ResolvableProfile;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;

public final class BlockItemPacketRewriter1_21_9
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_9, ServerboundPacket1_21_6, Protocol1_21_9To1_21_7> {
    public BlockItemPacketRewriter1_21_9(Protocol1_21_9To1_21_7 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        ResolvableProfile profile = (ResolvableProfile)dataContainer.get(StructuredDataKey.PROFILE1_21_9);
        if (profile != null) {
            CompoundTag profileTag = new CompoundTag();
            if (profile.bodyTexture() != null) {
                profileTag.putString("body_texture", profile.bodyTexture());
            }
            if (profile.capeTexture() != null) {
                profileTag.putString("cape_texture", profile.capeTexture());
            }
            if (profile.elytraTexture() != null) {
                profileTag.putString("elytra_texture", profile.elytraTexture());
            }
            if (profile.modelType() != null) {
                profileTag.putBoolean("model", profile.modelType() == 0);
            }
            if (!profileTag.isEmpty()) {
                backupTag.put("profile", (Tag)profileTag);
            }
        }
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.BlockItemPacketRewriter1_21_9.upgradeData((Item)item, (StructuredDataContainer)container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToClient(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter.BlockItemPacketRewriter1_21_9.downgradeData((Item)item, (StructuredDataContainer)container);
    }

    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        super.restoreBackupData(item, container, customData);
        Tag tag = customData.remove(this.nbtTagName("backup"));
        if (!(tag instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        CompoundTag profileTag = backupTag.getCompoundTag("profile");
        if (profileTag != null) {
            container.replace(StructuredDataKey.PROFILE1_20_5, StructuredDataKey.PROFILE1_21_9, profile -> new ResolvableProfile(profile, profileTag.getString("body_texture"), profileTag.getString("cape_texture"), profileTag.getString("elytra_texture"), profileTag.contains("model") ? Integer.valueOf(profileTag.getBoolean("model") ? 0 : 1) : null));
        }
    }

    public void registerPackets() {
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.INITIALIZE_BORDER, this::updateBorderCenter);
        ((Protocol1_21_9To1_21_7)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_21_9.SET_BORDER_CENTER, this::updateBorderCenter);
    }

    private void updateBorderCenter(PacketWrapper wrapper) {
        double centerX = (Double)wrapper.read((Type)Types.DOUBLE);
        double centerZ = (Double)wrapper.read((Type)Types.DOUBLE);
        EntityTracker tracker = ((Protocol1_21_9To1_21_7)this.protocol).getEntityRewriter().tracker(wrapper.user());
        if (tracker.currentDimensionId() != -1) {
            double scale = ((DimensionScaleStorage)wrapper.user().get(DimensionScaleStorage.class)).getScale(tracker.currentDimensionId());
            centerX *= scale;
            centerZ *= scale;
        }
        wrapper.write((Type)Types.DOUBLE, (Object)centerX);
        wrapper.write((Type)Types.DOUBLE, (Object)centerZ);
    }
}


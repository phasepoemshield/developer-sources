/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.BlockItemPacketRewriter26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9
 */
package com.viaversion.viabackwards.protocol.v26_1to1_21_11.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v26_1to1_21_11.Protocol26_1To1_21_11;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_21_11;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPacket26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ServerboundPacket1_21_9;

public final class BlockItemPacketRewriter26_1
extends BackwardsStructuredItemRewriter<ClientboundPacket26_1, ServerboundPacket1_21_9, Protocol26_1To1_21_11> {
    public BlockItemPacketRewriter26_1(Protocol26_1To1_21_11 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void backupInconvertibleData(UserConnection connection, Item item, StructuredDataContainer dataContainer, CompoundTag backupTag) {
        super.backupInconvertibleData(connection, item, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.ADDITIONAL_TRADE_COST, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.DYE, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.CAT_SOUND_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.CHICKEN_SOUND_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.COW_SOUND_VARIANT, dataContainer, backupTag);
        this.saveIntData(StructuredDataKey.PIG_SOUND_VARIANT, dataContainer, backupTag);
    }

    protected void handleItemDataComponentsToServer(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToServer(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.BlockItemPacketRewriter26_1.upgradeData((Protocol)this.protocol, (StructuredDataKeys1_21_11)((StructuredDataKeys1_21_11)((Protocol26_1To1_21_11)this.protocol).types().structuredDataKeys()), (StructuredDataContainer)container);
    }

    protected void handleItemDataComponentsToClient(UserConnection connection, Item item, StructuredDataContainer container) {
        super.handleItemDataComponentsToClient(connection, item, container);
        com.viaversion.viaversion.protocols.v1_21_11to26_1.rewriter.BlockItemPacketRewriter26_1.downgradeData((StructuredDataKeys1_21_11)((StructuredDataKeys1_21_11)((Protocol26_1To1_21_11)this.protocol).mappedTypes().structuredDataKeys()), (StructuredDataContainer)container);
    }

    protected void restoreBackupData(Item item, StructuredDataContainer container, CompoundTag customData) {
        super.restoreBackupData(item, container, customData);
        Tag tag = customData.remove(this.nbtTagName("backup"));
        if (!(tag instanceof CompoundTag)) {
            return;
        }
        CompoundTag backupTag = (CompoundTag)tag;
        this.restoreIntData(StructuredDataKey.ADDITIONAL_TRADE_COST, container, backupTag);
        this.restoreIntData(StructuredDataKey.DYE, container, backupTag);
        this.restoreIntData(StructuredDataKey.CAT_SOUND_VARIANT, container, backupTag);
        this.restoreIntData(StructuredDataKey.CHICKEN_SOUND_VARIANT, container, backupTag);
        this.restoreIntData(StructuredDataKey.COW_SOUND_VARIANT, container, backupTag);
        this.restoreIntData(StructuredDataKey.PIG_SOUND_VARIANT, container, backupTag);
    }
}


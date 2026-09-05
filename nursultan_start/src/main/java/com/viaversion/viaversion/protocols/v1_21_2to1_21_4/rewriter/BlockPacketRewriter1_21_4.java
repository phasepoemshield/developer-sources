/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.TagUtil;

public final class BlockPacketRewriter1_21_4
extends BlockRewriter<ClientboundPacket1_21_2> {
    public BlockPacketRewriter1_21_4(Protocol1_21_2To1_21_4 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.TRUSTED_COMPOUND_TAG, ChunkType1_20_2::new, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        if (blockEntity.tag() == null) {
            return;
        }
        CompoundTag item = blockEntity.tag().getCompoundTag("item");
        if (item == null) {
            return;
        }
        CompoundTag components = item.getCompoundTag("components");
        if (components == null) {
            return;
        }
        NumberTag customModelData = TagUtil.getNamespacedNumberTag((CompoundTag)components, (String)"custom_model_data");
        if (customModelData != null) {
            ListTag floats = new ListTag(FloatTag.class);
            floats.add((Tag)new FloatTag(customModelData.asFloat()));
            CompoundTag updatedCustomModelData = new CompoundTag();
            updatedCustomModelData.put("floats", (Tag)floats);
            TagUtil.removeNamespaced((CompoundTag)components, (String)"custom_model_data");
            components.put("custom_model_data", (Tag)updatedCustomModelData);
        }
    }
}


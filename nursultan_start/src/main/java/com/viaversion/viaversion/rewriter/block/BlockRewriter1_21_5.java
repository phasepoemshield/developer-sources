/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.BlockRewriter$ChunkTypeSupplier
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter.block;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BlockRewriter1_21_5<C extends ClientboundPacketType>
extends BlockRewriter<C> {
    public BlockRewriter1_21_5(Protocol<C, ?, ?, ?> protocol, BlockRewriter.ChunkTypeSupplier chunkTypeSupplier, // Could not load outer class - annotation placement on inner may be incorrect
    @Nullable BlockRewriter.ChunkTypeSupplier mappedChunkTypeSupplier) {
        super(protocol, Types.BLOCK_POSITION1_14, Types.TRUSTED_COMPOUND_TAG, chunkTypeSupplier, mappedChunkTypeSupplier);
    }

    public BlockRewriter1_21_5(Protocol<C, ?, ?, ?> protocol, BlockRewriter.ChunkTypeSupplier chunkTypeSupplier) {
        this(protocol, chunkTypeSupplier, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        CompoundTag tag = blockEntity.tag();
        if (tag == null) {
            return;
        }
        FullMappings blockEntityMappings = this.protocol.getMappingData().getBlockEntityMappings();
        if (blockEntityMappings != null && this.protocol.getComponentRewriter() != null && (blockEntity.typeId() == blockEntityMappings.mappedId("sign") || blockEntity.typeId() == blockEntityMappings.mappedId("hanging_sign"))) {
            this.updateSignMessages(connection, tag.getCompoundTag("front_text"));
            this.updateSignMessages(connection, tag.getCompoundTag("back_text"));
        }
    }

    public void updateSignMessages(UserConnection connection, CompoundTag tag) {
        if (tag == null) {
            return;
        }
        ListTag messages = tag.getListTag("messages");
        this.protocol.getComponentRewriter().processTag(connection, (Tag)messages);
        ListTag filteredMessages = tag.getListTag("filtered_messages");
        if (filteredMessages != null) {
            this.protocol.getComponentRewriter().processTag(connection, (Tag)filteredMessages);
        }
    }
}


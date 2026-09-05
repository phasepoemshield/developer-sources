/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 */
package com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.protocol.v1_21_5to1_21_4.Protocol1_21_5To1_21_4;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.packet.ClientboundPacket1_21_5;
import com.viaversion.viaversion.rewriter.BlockRewriter;

public final class BlockPacketRewriter1_21_5
extends BlockRewriter<ClientboundPacket1_21_5> {
    private static final int SIGN_BOCK_ENTITY_ID = 7;
    private static final int HANGING_SIGN_BOCK_ENTITY_ID = 8;
    private final Protocol1_21_5To1_21_4 protocol;

    public BlockPacketRewriter1_21_5(Protocol1_21_5To1_21_4 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.COMPOUND_TAG, ChunkType1_21_5::new, ChunkType1_20_2::new);
        this.protocol = protocol;
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        Tag customName;
        CompoundTag tag = blockEntity.tag();
        if (tag == null) {
            return;
        }
        if (blockEntity.typeId() == 7 || blockEntity.typeId() == 8) {
            this.updateSignMessages(connection, tag.getCompoundTag("front_text"));
            this.updateSignMessages(connection, tag.getCompoundTag("back_text"));
        }
        if ((customName = tag.get("CustomName")) != null) {
            tag.putString("CustomName", this.protocol.getComponentRewriter().toUglyJson(connection, customName));
        }
    }

    private void updateSignMessages(UserConnection connection, CompoundTag tag) {
        if (tag == null) {
            return;
        }
        ListTag messages = tag.getListTag("messages");
        tag.put("messages", this.protocol.getComponentRewriter().updateComponentList(connection, messages));
        ListTag filteredMessages = tag.getListTag("filtered_messages");
        if (filteredMessages != null) {
            tag.put("filtered_messages", this.protocol.getComponentRewriter().updateComponentList(connection, filteredMessages));
        }
    }
}


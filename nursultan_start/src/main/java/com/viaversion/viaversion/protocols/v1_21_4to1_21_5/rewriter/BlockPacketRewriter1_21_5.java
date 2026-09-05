/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_4to1_21_5.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;
import com.viaversion.viaversion.protocols.v1_21_4to1_21_5.Protocol1_21_4To1_21_5;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;

public final class BlockPacketRewriter1_21_5
extends BlockRewriter<ClientboundPacket1_21_2> {
    private static final int SIGN_BOCK_ENTITY_ID = 7;
    private static final int HANGING_SIGN_BOCK_ENTITY_ID = 8;
    private final Protocol1_21_4To1_21_5 protocol;

    public BlockPacketRewriter1_21_5(Protocol1_21_4To1_21_5 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.TRUSTED_COMPOUND_TAG, ChunkType1_20_2::new, ChunkType1_21_5::new);
        this.protocol = protocol;
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        String customName;
        CompoundTag tag = blockEntity.tag();
        if (tag == null) {
            return;
        }
        if (blockEntity.typeId() == 7 || blockEntity.typeId() == 8) {
            this.updateSignMessages(connection, tag.getCompoundTag("front_text"));
            this.updateSignMessages(connection, tag.getCompoundTag("back_text"));
        }
        if ((customName = tag.getString("CustomName")) != null) {
            tag.put("CustomName", this.protocol.getComponentRewriter().uglyJsonToTag(connection, customName));
        }
    }

    private void updateSignMessages(UserConnection connection, CompoundTag tag) {
        if (tag == null) {
            return;
        }
        ListTag messages = tag.getListTag("messages", StringTag.class);
        tag.put("messages", this.protocol.getComponentRewriter().updateComponentList(connection, (ListTag<StringTag>)messages, true));
        ListTag filteredMessages = tag.getListTag("filtered_messages", StringTag.class);
        if (filteredMessages != null) {
            tag.put("filtered_messages", this.protocol.getComponentRewriter().updateComponentList(connection, (ListTag<StringTag>)filteredMessages, true));
        }
    }
}


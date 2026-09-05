/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 */
package com.viaversion.viabackwards.protocol.v1_20to1_19_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.protocol.v1_20to1_19_4.Protocol1_20To1_19_4;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.rewriter.BlockRewriter;

public final class BlockPacketRewriter1_20
extends BlockRewriter<ClientboundPackets1_19_4> {
    public BlockPacketRewriter1_20(Protocol1_20To1_19_4 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.NAMED_COMPOUND_TAG, ChunkType1_18::new, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        CompoundTag tag = blockEntity.tag();
        if (tag == null || blockEntity.typeId() != 7 && blockEntity.typeId() != 8) {
            return;
        }
        Tag frontText = tag.remove("front_text");
        tag.remove("back_text");
        if (frontText instanceof CompoundTag) {
            Tag glowing;
            CompoundTag frontTextTag = (CompoundTag)frontText;
            this.writeMessages(frontTextTag, tag, false);
            this.writeMessages(frontTextTag, tag, true);
            Tag color = frontTextTag.remove("color");
            if (color != null) {
                tag.put("Color", color);
            }
            if ((glowing = frontTextTag.remove("has_glowing_text")) != null) {
                tag.put("GlowingText", glowing);
            }
        }
    }

    private void writeMessages(CompoundTag frontText, CompoundTag tag, boolean filtered) {
        ListTag messages = frontText.getListTag(filtered ? "filtered_messages" : "messages", StringTag.class);
        if (messages == null) {
            return;
        }
        int i = 0;
        for (StringTag message : messages) {
            tag.put((filtered ? "FilteredText" : "Text") + ++i, (Tag)message);
        }
    }
}


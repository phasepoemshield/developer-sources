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
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.Protocol1_19_4To1_20;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.ComponentUtil;

public final class BlockPacketRewriter1_20
extends BlockRewriter<ClientboundPackets1_19_4> {
    public BlockPacketRewriter1_20(Protocol1_19_4To1_20 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.NAMED_COMPOUND_TAG, ChunkType1_18::new, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        Tag glowing;
        Tag color;
        CompoundTag tag = blockEntity.tag();
        if (blockEntity.tag() == null || blockEntity.typeId() != 7 && blockEntity.typeId() != 8) {
            return;
        }
        CompoundTag frontText = new CompoundTag();
        tag.put("front_text", (Tag)frontText);
        ListTag messages = new ListTag(StringTag.class);
        for (int i = 1; i < 5; ++i) {
            Tag text = tag.remove("Text" + i);
            messages.add((Tag)(text instanceof StringTag ? (StringTag)text : new StringTag(ComponentUtil.emptyJsonComponentString())));
        }
        frontText.put("messages", (Tag)messages);
        ListTag filteredMessages = new ListTag(StringTag.class);
        for (int i = 1; i < 5; ++i) {
            Tag text = tag.remove("FilteredText" + i);
            filteredMessages.add((Tag)(text instanceof StringTag ? (StringTag)text : (StringTag)messages.get(i - 1)));
        }
        if (!filteredMessages.equals((Object)messages)) {
            frontText.put("filtered_messages", (Tag)filteredMessages);
        }
        if ((color = tag.remove("Color")) != null) {
            frontText.put("color", color);
        }
        if ((glowing = tag.remove("GlowingText")) != null) {
            frontText.put("has_glowing_text", glowing);
        }
    }
}


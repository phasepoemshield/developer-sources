/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 */
package com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;

public final class BlockRewriter1_20_2
extends BlockRewriter<ClientboundPackets1_19_4> {
    public BlockRewriter1_20_2(Protocol<ClientboundPackets1_19_4, ?, ?, ?> protocol) {
        super(protocol, Types.BLOCK_POSITION1_14, Types.NAMED_COMPOUND_TAG, ChunkType1_18::new, ChunkType1_20_2::new);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        Tag secondaryEffect;
        CompoundTag tag = blockEntity.tag();
        if (tag == null) {
            return;
        }
        Tag primaryEffect = tag.remove("Primary");
        if (primaryEffect instanceof NumberTag && ((NumberTag)primaryEffect).asInt() != 0) {
            tag.put("primary_effect", (Tag)new StringTag(PotionEffects1_20_2.idToKeyOrLuck((int)(((NumberTag)primaryEffect).asInt() - 1))));
        }
        if ((secondaryEffect = tag.remove("Secondary")) instanceof NumberTag && ((NumberTag)secondaryEffect).asInt() != 0) {
            tag.put("secondary_effect", (Tag)new StringTag(PotionEffects1_20_2.idToKeyOrLuck((int)(((NumberTag)secondaryEffect).asInt() - 1))));
        }
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.Key;

public final class BlockRewriter1_20_2
extends BlockRewriter<ClientboundPackets1_20_2> {
    public BlockRewriter1_20_2(Protocol<ClientboundPackets1_20_2, ?, ?, ?> protocol) {
        super(protocol, Types.BLOCK_POSITION1_14, Types.NAMED_COMPOUND_TAG, ChunkType1_20_2::new, ChunkType1_18::new);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        CompoundTag skullOwnerTag;
        Tag secondaryEffect;
        CompoundTag tag = blockEntity.tag();
        Tag primaryEffect = tag.remove("primary_effect");
        if (primaryEffect instanceof StringTag) {
            String effectKey = Key.stripMinecraftNamespace((String)((StringTag)primaryEffect).getValue());
            tag.putInt("Primary", PotionEffects1_20_2.keyToId((String)effectKey) + 1);
        }
        if ((secondaryEffect = tag.remove("secondary_effect")) instanceof StringTag) {
            String effectKey = Key.stripMinecraftNamespace((String)((StringTag)secondaryEffect).getValue());
            tag.putInt("Secondary", PotionEffects1_20_2.keyToId((String)effectKey) + 1);
        }
        if ((skullOwnerTag = tag.getCompoundTag("SkullOwner")) != null && !skullOwnerTag.contains("Id") && skullOwnerTag.contains("Properties")) {
            skullOwnerTag.put("Id", (Tag)new IntArrayTag(new int[]{0, 0, 0, 0}));
        }
    }
}


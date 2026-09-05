/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.protocol.v1_20_5to1_20_3.Protocol1_20_5To1_20_3;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.BannerPatterns1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.util.Key;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockPacketRewriter1_20_5
extends BlockRewriter<ClientboundPacket1_20_5> {
    public BlockPacketRewriter1_20_5(Protocol1_20_5To1_20_3 protocol) {
        super((Protocol)protocol, Types.BLOCK_POSITION1_14, Types.COMPOUND_TAG, ChunkType1_20_2::new, null);
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
        this.updateBlockEntityTag(blockEntity.tag());
    }

    public void updateBlockEntityTag(@Nullable CompoundTag tag) {
        if (tag == null) {
            return;
        }
        Tag profileTag = tag.remove("profile");
        if (profileTag instanceof StringTag) {
            tag.put("SkullOwner", profileTag);
        } else if (profileTag instanceof CompoundTag) {
            this.updateProfileTag(tag, (CompoundTag)profileTag);
        }
        ListTag patternsTag = tag.getListTag("patterns", CompoundTag.class);
        if (patternsTag != null) {
            for (CompoundTag patternTag : patternsTag) {
                String pattern = patternTag.getString("pattern", "");
                String color = patternTag.getString("color");
                String compactIdentifier = BannerPatterns1_20_5.fullIdToCompact((String)Key.stripMinecraftNamespace((String)pattern));
                if (compactIdentifier == null || color == null) continue;
                patternTag.remove("pattern");
                patternTag.remove("color");
                patternTag.putString("Pattern", compactIdentifier);
                patternTag.putInt("Color", BlockPacketRewriter1_20_5.colorId(color));
            }
            tag.remove("patterns");
            tag.put("Patterns", (Tag)patternsTag);
        }
    }

    private void updateProfileTag(CompoundTag tag, CompoundTag profileTag) {
        ListTag propertiesListTag;
        IntArrayTag idTag;
        CompoundTag skullOwnerTag = new CompoundTag();
        tag.put("SkullOwner", (Tag)skullOwnerTag);
        String name = profileTag.getString("name");
        if (name != null) {
            skullOwnerTag.putString("Name", name);
        }
        if ((idTag = profileTag.getIntArrayTag("id")) != null) {
            skullOwnerTag.put("Id", (Tag)idTag);
        }
        if ((propertiesListTag = profileTag.getListTag("properties", CompoundTag.class)) == null) {
            return;
        }
        CompoundTag propertiesTag = new CompoundTag();
        for (CompoundTag propertyTag : propertiesListTag) {
            String property = propertyTag.getString("name", "");
            String value = propertyTag.getString("value", "");
            String signature = propertyTag.getString("signature");
            ListTag list = propertiesTag.getListTag(property, CompoundTag.class);
            if (list == null) {
                list = new ListTag(CompoundTag.class);
            }
            CompoundTag updatedPropertyTag = new CompoundTag();
            updatedPropertyTag.putString("Value", value);
            if (signature != null) {
                updatedPropertyTag.putString("Signature", signature);
            }
            list.add((Tag)updatedPropertyTag);
            propertiesTag.put(property, (Tag)list);
        }
        skullOwnerTag.put("Properties", (Tag)propertiesTag);
    }

    private static int colorId(String color) {
        return switch (color) {
            case "orange" -> 1;
            case "magenta" -> 2;
            case "light_blue" -> 3;
            case "yellow" -> 4;
            case "lime" -> 5;
            case "pink" -> 6;
            case "gray" -> 7;
            case "light_gray" -> 8;
            case "cyan" -> 9;
            case "purple" -> 10;
            case "blue" -> 11;
            case "brown" -> 12;
            case "green" -> 13;
            case "red" -> 14;
            case "black" -> 15;
            default -> 0;
        };
    }
}


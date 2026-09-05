/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.Protocol1_16_2To1_16_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_8;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BlockItemPacketRewriter1_16_2
extends BackwardsItemRewriter<ClientboundPackets1_16_2, ServerboundPackets1_16, Protocol1_16_2To1_16_1> {
    public BlockItemPacketRewriter1_16_2(Protocol1_16_2To1_16_1 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item != null && item.tag() != null) {
            this.addValueHashAsId(item.tag());
        }
        return super.handleItemToClient(connection, item);
    }

    private void handleBlockEntity(CompoundTag tag) {
        String id = tag.getString("id");
        if (id != null && Key.stripMinecraftNamespace((String)id).equals("skull")) {
            this.addValueHashAsId(tag);
        }
    }

    protected void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_16_2.UPDATE_RECIPES);
        ((Protocol1_16_2To1_16_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.RECIPE, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read((Type)Types.BOOLEAN);
        });
        ((Protocol1_16_2To1_16_1)this.protocol).getBlockRewriter().registerLevelChunk((ClientboundPacketType)ClientboundPackets1_16_2.LEVEL_CHUNK, ChunkType1_16_2.TYPE, ChunkType1_16.TYPE, (connection, chunk) -> {
            chunk.setIgnoreOldLightData(true);
            for (CompoundTag blockEntity : chunk.getBlockEntities()) {
                if (blockEntity == null) continue;
                this.handleBlockEntity(blockEntity);
            }
        });
        ((Protocol1_16_2To1_16_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> BlockItemPacketRewriter1_16_2.this.handleBlockEntity((CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG)));
            }
        });
        ((Protocol1_16_2To1_16_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.SECTION_BLOCKS_UPDATE, (ClientboundPacketType)ClientboundPackets1_16.CHUNK_BLOCKS_UPDATE, wrapper -> {
            long chunkPosition = (Long)wrapper.read((Type)Types.LONG);
            wrapper.read((Type)Types.BOOLEAN);
            int chunkX = (int)(chunkPosition >> 42);
            int chunkY = (int)(chunkPosition << 44 >> 44);
            int chunkZ = (int)(chunkPosition << 22 >> 42);
            wrapper.write((Type)Types.INT, (Object)chunkX);
            wrapper.write((Type)Types.INT, (Object)chunkZ);
            BlockChangeRecord[] blockChangeRecord = (BlockChangeRecord[])wrapper.read(Types.VAR_LONG_BLOCK_CHANGE_ARRAY);
            wrapper.write(Types.BLOCK_CHANGE_ARRAY, (Object)blockChangeRecord);
            for (int i = 0; i < blockChangeRecord.length; ++i) {
                BlockChangeRecord record = blockChangeRecord[i];
                int blockId = ((Protocol1_16_2To1_16_1)this.protocol).getMappingData().getNewBlockStateId(record.getBlockId());
                blockChangeRecord[i] = new BlockChangeRecord1_8(record.getSectionX(), record.getY(chunkY), record.getSectionZ(), blockId);
            }
        });
        ((Protocol1_16_2To1_16_1)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_16.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
    }

    private void addValueHashAsId(CompoundTag tag) {
        CompoundTag first;
        CompoundTag skullOwnerTag = tag.getCompoundTag("SkullOwner");
        if (skullOwnerTag == null) {
            return;
        }
        if (!skullOwnerTag.contains("Id")) {
            return;
        }
        CompoundTag properties = skullOwnerTag.getCompoundTag("Properties");
        if (properties == null) {
            return;
        }
        ListTag textures = properties.getListTag("textures", CompoundTag.class);
        if (textures == null) {
            return;
        }
        CompoundTag compoundTag = first = !textures.isEmpty() ? (CompoundTag)textures.get(0) : null;
        if (first == null) {
            return;
        }
        int hashCode = first.get("Value").getValue().hashCode();
        int[] uuidIntArray = new int[]{hashCode, 0, 0, 0};
        skullOwnerTag.put("Id", (Tag)new IntArrayTag(uuidIntArray));
    }
}


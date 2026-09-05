/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntArrayTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.BlockItemPacketRewriter1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.RecipeRewriter1_20_2
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntArrayTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.Protocol1_20_2To1_20;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.provider.AdvancementCriteriaProvider;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.RecipeRewriter1_20_2;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_20_2
extends BackwardsItemRewriter<ClientboundPackets1_20_2, ServerboundPackets1_19_4, Protocol1_20_2To1_20> {
    public BlockItemPacketRewriter1_20_2(Protocol1_20_2To1_20 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_20_2, Types.ITEM1_20_2_ARRAY, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (item.tag() != null) {
            com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.BlockItemPacketRewriter1_20_2.to1_20_1Effects((Item)item);
            CompoundTag skullOwnerTag = item.tag().getCompoundTag("SkullOwner");
            if (skullOwnerTag != null && !skullOwnerTag.contains("Id") && skullOwnerTag.contains("Properties")) {
                skullOwnerTag.put("Id", (Tag)new IntArrayTag(new int[]{0, 0, 0, 0}));
            }
        }
        return super.handleItemToClient(connection, item);
    }

    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (item.tag() != null) {
            com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter.BlockItemPacketRewriter1_20_2.to1_20_2Effects((Item)item);
        }
        return super.handleItemToServer(connection, item);
    }

    public void registerPackets() {
        ((Protocol1_20_2To1_20)this.protocol).cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_2.CHUNK_BATCH_START);
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.CHUNK_BATCH_FINISHED, null, wrapper -> {
            wrapper.cancel();
            PacketWrapper receivedPacket = wrapper.create((PacketType)ServerboundPackets1_20_2.CHUNK_BATCH_RECEIVED);
            receivedPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(500.0f));
            receivedPacket.sendToServer(Protocol1_20_2To1_20.class);
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.FORGET_LEVEL_CHUNK, wrapper -> {
            ChunkPosition chunkPosition = (ChunkPosition)wrapper.read(Types.CHUNK_POSITION);
            wrapper.write((Type)Types.INT, (Object)chunkPosition.chunkX());
            wrapper.write((Type)Types.INT, (Object)chunkPosition.chunkZ());
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.MAP_ITEM_DATA, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BOOLEAN);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                int icons = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int i = 0; i < icons; ++i) {
                    int markerType = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.VAR_INT, (Object)(markerType < 27 ? markerType : 2));
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough(Types.OPTIONAL_COMPONENT);
                }
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.TAG_QUERY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)((CompoundTag)wrapper.read(Types.COMPOUND_TAG)));
        });
        ((Protocol1_20_2To1_20)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.BLOCK_ENTITY_DATA, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            int typeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            CompoundTag tag = (CompoundTag)wrapper.read(Types.TRUSTED_COMPOUND_TAG);
            BlockEntityImpl blockEntity = new BlockEntityImpl(BlockEntity.pack((int)position.x(), (int)position.z()), (short)position.y(), typeId, tag);
            ((Protocol1_20_2To1_20)this.protocol).getBlockRewriter().handleBlockEntity(wrapper.user(), (BlockEntity)blockEntity);
            wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)blockEntity.tag());
        });
        ((Protocol1_20_2To1_20)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_19_4.SET_BEACON, wrapper -> {
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) - 1));
            }
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) - 1));
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                String advancement = (String)wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.COMPONENT);
                    wrapper.passthrough(Types.COMPONENT);
                    this.passthroughClientboundItem(wrapper);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                AdvancementCriteriaProvider criteriaProvider = (AdvancementCriteriaProvider)Via.getManager().getProviders().get(AdvancementCriteriaProvider.class);
                wrapper.write(Types.STRING_ARRAY, (Object)criteriaProvider.getCriteria(advancement));
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_EQUIPMENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    byte slot;
                    do {
                        slot = (Byte)wrapper.passthrough((Type)Types.BYTE);
                        wrapper.write(Types.ITEM1_13_2, (Object)BlockItemPacketRewriter1_20_2.this.handleItemToClient(wrapper.user(), (Item)wrapper.read(Types.ITEM1_20_2)));
                    } while ((slot & 0xFFFFFF80) != 0);
                });
            }
        });
        new RecipeRewriter1_20_2<ClientboundPackets1_20_2>(this.protocol){

            protected Type<Item[]> mappedItemArrayType() {
                return BlockItemPacketRewriter1_20_2.this.mappedItemArrayType();
            }

            protected Type<Item> mappedItemType() {
                return BlockItemPacketRewriter1_20_2.this.mappedItemType();
            }
        }.register((ClientboundPacketType)ClientboundPackets1_20_2.UPDATE_RECIPES);
    }
}


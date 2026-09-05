/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.Protocol1_20To1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.data.PotionEffects1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_20_2
extends ItemRewriter<ClientboundPackets1_19_4, ServerboundPackets1_20_2, Protocol1_20To1_20_2> {
    private static void renameTag(CompoundTag tag, String entryName, String toEntryName) {
        Tag entry = tag.remove(entryName);
        if (entry != null) {
            tag.put(toEntryName, entry);
        }
    }

    public BlockItemPacketRewriter1_20_2(Protocol1_20To1_20_2 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY, Types.ITEM1_20_2, Types.ITEM1_20_2_ARRAY);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (item.tag() != null) {
            BlockItemPacketRewriter1_20_2.to1_20_2Effects(item);
        }
        return super.handleItemToClient(connection, item);
    }

    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        if (item == null) {
            return null;
        }
        if (item.tag() != null) {
            BlockItemPacketRewriter1_20_2.to1_20_1Effects(item);
        }
        return super.handleItemToServer(connection, item);
    }

    public void registerPackets() {
        ((Protocol1_20To1_20_2)this.protocol).registerServerbound(ServerboundPackets1_20_2.SET_BEACON, wrapper -> {
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) + 1));
            }
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) + 1));
            }
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.FORGET_LEVEL_CHUNK, wrapper -> {
            int x = (Integer)wrapper.read((Type)Types.INT);
            int z = (Integer)wrapper.read((Type)Types.INT);
            wrapper.write(Types.CHUNK_POSITION, (Object)new ChunkPosition(x, z));
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.TAG_QUERY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(Types.COMPOUND_TAG, (Object)((CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG)));
        });
        ((Protocol1_20To1_20_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.BLOCK_ENTITY_DATA, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            int typeId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            CompoundTag tag = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
            BlockEntityImpl blockEntity = new BlockEntityImpl(BlockEntity.pack((int)position.x(), (int)position.z()), (short)position.y(), typeId, tag);
            ((Protocol1_20To1_20_2)this.protocol).getBlockRewriter().handleBlockEntity(wrapper.user(), (BlockEntity)blockEntity);
            wrapper.write(Types.TRUSTED_COMPOUND_TAG, (Object)blockEntity.tag());
        });
        ((Protocol1_20To1_20_2)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.COMPONENT);
                    wrapper.passthrough(Types.COMPONENT);
                    wrapper.write(Types.ITEM1_20_2, (Object)this.handleItemToClient(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2)));
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.read(Types.STRING_ARRAY);
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        new RecipeRewriter1_19_4<ClientboundPackets1_19_4>(this.protocol){

            protected Type<Item[]> mappedItemArrayType() {
                return BlockItemPacketRewriter1_20_2.this.mappedItemArrayType();
            }

            protected Type<Item> mappedItemType() {
                return BlockItemPacketRewriter1_20_2.this.mappedItemType();
            }
        }.register((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_RECIPES);
    }

    public static void to1_20_2Effects(Item item) {
        Tag customPotionEffectsTag = item.tag().remove("CustomPotionEffects");
        if (customPotionEffectsTag instanceof ListTag) {
            ListTag effectsTag = (ListTag)customPotionEffectsTag;
            item.tag().put("custom_potion_effects", customPotionEffectsTag);
            for (Tag tag : effectsTag) {
                String key;
                if (!(tag instanceof CompoundTag)) continue;
                CompoundTag effectTag = (CompoundTag)tag;
                Tag idTag = effectTag.remove("Id");
                if (idTag instanceof NumberTag && (key = PotionEffects1_20_2.idToKey((int)(((NumberTag)idTag).asInt() - 1))) != null) {
                    effectTag.put("id", (Tag)new StringTag(key));
                }
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "Amplifier", "amplifier");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "Duration", "duration");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "Ambient", "ambient");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "ShowParticles", "show_particles");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "ShowIcon", "show_icon");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "HiddenEffect", "hidden_effect");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "FactorCalculationData", "factor_calculation_data");
            }
        }
    }

    public static void to1_20_1Effects(Item item) {
        Tag customPotionEffectsTag = item.tag().remove("custom_potion_effects");
        if (customPotionEffectsTag instanceof ListTag) {
            ListTag effectsTag = (ListTag)customPotionEffectsTag;
            item.tag().put("CustomPotionEffects", (Tag)effectsTag);
            for (Tag tag : effectsTag) {
                if (!(tag instanceof CompoundTag)) continue;
                CompoundTag effectTag = (CompoundTag)tag;
                Tag tag2 = effectTag.remove("id");
                if (tag2 instanceof StringTag) {
                    StringTag idTag = (StringTag)tag2;
                    int id = PotionEffects1_20_2.keyToId((String)idTag.getValue());
                    effectTag.putInt("Id", id + 1);
                }
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "amplifier", "Amplifier");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "duration", "Duration");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "ambient", "Ambient");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "show_particles", "ShowParticles");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "show_icon", "ShowIcon");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "hidden_effect", "HiddenEffect");
                BlockItemPacketRewriter1_20_2.renameTag(effectTag, "factor_calculation_data", "FactorCalculationData");
            }
        }
    }
}


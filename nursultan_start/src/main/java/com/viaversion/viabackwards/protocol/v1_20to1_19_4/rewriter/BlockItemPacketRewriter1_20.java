/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_20to1_19_4.storage.BackSignEditStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4
 *  com.viaversion.viaversion.util.Key
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_20to1_19_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_20to1_19_4.Protocol1_20To1_19_4;
import com.viaversion.viabackwards.protocol.v1_20to1_19_4.storage.BackSignEditStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4;
import com.viaversion.viaversion.util.Key;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class BlockItemPacketRewriter1_20
extends BackwardsItemRewriter<ClientboundPackets1_19_4, ServerboundPackets1_19_4, Protocol1_20To1_19_4> {
    private static final Set<String> NEW_TRIM_PATTERNS = new HashSet<String>(Arrays.asList("host", "raiser", "shaper", "silence", "wayfinder"));

    public BlockItemPacketRewriter1_20(Protocol1_20To1_19_4 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_20To1_19_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.LEVEL_CHUNK_WITH_LIGHT, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    Chunk chunk = ((Protocol1_20To1_19_4)BlockItemPacketRewriter1_20.this.protocol).getBlockRewriter().handleChunk1_18(wrapper);
                    ((Protocol1_20To1_19_4)BlockItemPacketRewriter1_20.this.protocol).getBlockRewriter().handleBlockEntities(chunk, wrapper.user());
                });
                this.create((Type)Types.BOOLEAN, true);
            }
        });
        ((Protocol1_20To1_19_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.LIGHT_UPDATE, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        ((Protocol1_20To1_19_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.SECTION_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.LONG);
                this.create((Type)Types.BOOLEAN, false);
                this.handler(wrapper -> {
                    for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                        record.setBlockId(((Protocol1_20To1_19_4)BlockItemPacketRewriter1_20.this.protocol).getMappingData().getNewBlockStateId(record.getBlockId()));
                    }
                });
            }
        });
        ((Protocol1_20To1_19_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
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
                wrapper.passthrough(Types.STRING_ARRAY);
                int arrayLength = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < arrayLength; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.read((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_20To1_19_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.OPEN_SIGN_EDITOR, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            boolean frontSide = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (frontSide) {
                wrapper.user().remove(BackSignEditStorage.class);
            } else {
                wrapper.user().put((StorableObject)new BackSignEditStorage(position));
            }
        });
        ((Protocol1_20To1_19_4)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_19_4.SIGN_UPDATE, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            BackSignEditStorage backSignEditStorage = (BackSignEditStorage)wrapper.user().remove(BackSignEditStorage.class);
            boolean frontSide = backSignEditStorage == null || !backSignEditStorage.position().equals((Object)position);
            wrapper.write((Type)Types.BOOLEAN, (Object)frontSide);
        });
        new RecipeRewriter1_19_4(this.protocol).register((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_RECIPES);
    }

    public @Nullable Item handleItemToClient(UserConnection connection, @Nullable Item item) {
        String pattern;
        StringTag patternTag;
        CompoundTag trimTag;
        if (item == null) {
            return null;
        }
        CompoundTag tag = (item = super.handleItemToClient(connection, item)).tag();
        if (tag != null && (trimTag = tag.getCompoundTag("Trim")) != null && (patternTag = trimTag.getStringTag("pattern")) != null && NEW_TRIM_PATTERNS.contains(pattern = Key.stripMinecraftNamespace((String)patternTag.getValue()))) {
            tag.remove("Trim");
            tag.put(this.nbtTagName("Trim"), (Tag)trimTag);
        }
        return item;
    }

    public @Nullable Item handleItemToServer(UserConnection connection, @Nullable Item item) {
        Tag trimTag;
        if (item == null) {
            return null;
        }
        CompoundTag tag = (item = super.handleItemToServer(connection, item)).tag();
        if (tag != null && (trimTag = tag.remove(this.nbtTagName("Trim"))) != null) {
            tag.put("Trim", trimTag);
        }
        return item;
    }
}


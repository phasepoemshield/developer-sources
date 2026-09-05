/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter;

import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.Protocol1_19_4To1_20;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.util.Key;

public final class ItemPacketRewriter1_20
extends ItemRewriter<ClientboundPackets1_19_4, ServerboundPackets1_19_4, Protocol1_19_4To1_20> {
    public ItemPacketRewriter1_20(Protocol1_19_4To1_20 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_19_4To1_20)this.protocol).replaceClientbound(ClientboundPackets1_19_4.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.COMPONENT);
                    wrapper.passthrough(Types.COMPONENT);
                    this.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.passthrough(Types.STRING_ARRAY);
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
            }
        });
        ((Protocol1_19_4To1_20)this.protocol).registerClientbound(ClientboundPackets1_19_4.OPEN_SIGN_EDITOR, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        ((Protocol1_19_4To1_20)this.protocol).registerServerbound(ServerboundPackets1_19_4.SIGN_UPDATE, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            boolean frontText = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            if (!frontText) {
                wrapper.cancel();
            }
        });
        ((Protocol1_19_4To1_20)this.protocol).replaceClientbound(ClientboundPackets1_19_4.LEVEL_CHUNK_WITH_LIGHT, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    Chunk chunk = ((Protocol1_19_4To1_20)ItemPacketRewriter1_20.this.protocol).getBlockRewriter().handleChunk1_18(wrapper);
                    ((Protocol1_19_4To1_20)ItemPacketRewriter1_20.this.protocol).getBlockRewriter().handleBlockEntities(chunk, wrapper.user());
                });
                this.read((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_19_4To1_20)this.protocol).registerClientbound(ClientboundPackets1_19_4.LIGHT_UPDATE, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.read((Type)Types.BOOLEAN);
        });
        ((Protocol1_19_4To1_20)this.protocol).replaceClientbound(ClientboundPackets1_19_4.SECTION_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.LONG);
                this.read((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                        record.setBlockId(((Protocol1_19_4To1_20)ItemPacketRewriter1_20.this.protocol).getMappingData().getNewBlockStateId(record.getBlockId()));
                    }
                });
            }
        });
        RecipeRewriter1_19_4 recipeRewriter = new RecipeRewriter1_19_4(this.protocol);
        ((Protocol1_19_4To1_20)this.protocol).registerClientbound(ClientboundPackets1_19_4.UPDATE_RECIPES, wrapper -> {
            int size;
            int newSize = size = ((Integer)wrapper.passthrough((Type)Types.VAR_INT)).intValue();
            for (int i = 0; i < size; ++i) {
                String type = (String)wrapper.read(Types.STRING);
                String cutType = Key.stripMinecraftNamespace((String)type);
                if (cutType.equals("smithing")) {
                    --newSize;
                    wrapper.read(Types.STRING);
                    wrapper.read(Types.ITEM1_13_2_ARRAY);
                    wrapper.read(Types.ITEM1_13_2_ARRAY);
                    wrapper.read(Types.ITEM1_13_2);
                    continue;
                }
                wrapper.write(Types.STRING, (Object)type);
                wrapper.passthrough(Types.STRING);
                recipeRewriter.handleRecipeType(wrapper, cutType);
            }
            wrapper.set((Type)Types.VAR_INT, 0, (Object)newSize);
        });
    }
}


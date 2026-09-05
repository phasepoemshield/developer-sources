/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_10to1_9_3.rewriter;

import com.viaversion.viabackwards.api.rewriters.LegacyBlockItemRewriter;
import com.viaversion.viabackwards.protocol.v1_10to1_9_3.Protocol1_10To1_9_3;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;

public class BlockItemPacketRewriter1_10
extends LegacyBlockItemRewriter<ClientboundPackets1_9_3, ServerboundPackets1_9_3, Protocol1_10To1_9_3> {
    public BlockItemPacketRewriter1_10(Protocol1_10To1_9_3 protocol) {
        super(protocol, "1.10");
    }

    protected void registerPackets() {
        this.registerBlockChange(ClientboundPackets1_9_3.BLOCK_UPDATE);
        this.registerMultiBlockChange(ClientboundPackets1_9_3.CHUNK_BLOCKS_UPDATE);
        this.registerSetSlot((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_SLOT);
        this.registerSetContent((ClientboundPacketType)ClientboundPackets1_9_3.CONTAINER_SET_CONTENT);
        this.registerSetEquippedItem((ClientboundPacketType)ClientboundPackets1_9_3.SET_EQUIPPED_ITEM);
        this.registerCustomPayloadTradeList((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_PAYLOAD);
        this.registerContainerClick((ServerboundPacketType)ServerboundPackets1_9_3.CONTAINER_CLICK);
        this.registerSetCreativeModeSlot((ServerboundPacketType)ServerboundPackets1_9_3.SET_CREATIVE_MODE_SLOT);
        ((Protocol1_10To1_9_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_10To1_9_3.class);
            ChunkType1_9_3 type = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.passthrough((Type)type);
            this.handleChunk(chunk);
        });
        ((Protocol1_10To1_9_3)this.protocol).getEntityRewriter().filter().handler((event, data) -> {
            if (data.dataType().type().equals(Types.ITEM1_8)) {
                data.setValue((Object)this.handleItemToClient(event.user(), (Item)data.getValue()));
            }
        });
        ((Protocol1_10To1_9_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 46) {
                        wrapper.set((Type)Types.INT, 0, (Object)38);
                    }
                });
            }
        });
    }
}


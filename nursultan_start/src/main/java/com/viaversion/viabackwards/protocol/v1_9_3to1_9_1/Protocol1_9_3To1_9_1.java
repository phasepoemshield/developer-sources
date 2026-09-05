/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_9_3to1_9_1.data.BlockEntity1_9_1
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_9_3to1_9_1;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_9_3to1_9_1.data.BlockEntity1_9_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import java.util.List;

public class Protocol1_9_3To1_9_1
extends BackwardsProtocol<ClientboundPackets1_9_3, ClientboundPackets1_9, ServerboundPackets1_9_3, ServerboundPackets1_9> {
    public Protocol1_9_3To1_9_1() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_9.class, ServerboundPackets1_9_3.class, ServerboundPackets1_9.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    if ((Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0) == 9) {
                        BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                        CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                        wrapper.clearPacket();
                        wrapper.setPacketType((PacketType)ClientboundPackets1_9.UPDATE_SIGN);
                        wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
                        for (int i = 0; i < 4; ++i) {
                            StringTag textTag = tag.getStringTag("Text" + (i + 1));
                            String line = textTag != null ? textTag.getValue() : "";
                            wrapper.write(Types.STRING, (Object)line);
                        }
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_9_1.class);
            ChunkType1_9_3 newType = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            ChunkType1_9_1 oldType = ChunkType1_9_1.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)wrapper.read((Type)newType);
            wrapper.write((Type)oldType, (Object)chunk);
            BlockEntity1_9_1.handle((List)chunk.getBlockEntities(), (UserConnection)wrapper.user());
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_9_1.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_9_1.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 0);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        JsonNBTComponentRewriter componentRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
        componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_9_3.CHAT);
    }
}


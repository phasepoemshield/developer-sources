/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.data.FakeTileEntities1_9_1
 */
package com.viaversion.viaversion.protocols.v1_9_1to1_9_3;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.data.FakeTileEntities1_9_1;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import java.util.List;

public class Protocol1_9_1To1_9_3
extends AbstractProtocol<ClientboundPackets1_9, ClientboundPackets1_9_3, ServerboundPackets1_9, ServerboundPackets1_9_3> {
    public static final ValueTransformer<Short, Short> ADJUST_PITCH = new ValueTransformer<Short, Short>((Type)Types.UNSIGNED_BYTE, (Type)Types.UNSIGNED_BYTE){

        public Short transform(PacketWrapper wrapper, Short inputValue) {
            return (short)Math.round((float)inputValue.shortValue() / 63.5f * 63.0f);
        }
    };

    public Protocol1_9_1To1_9_3() {
        super(ClientboundPackets1_9.class, ClientboundPackets1_9_3.class, ServerboundPackets1_9.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection user) {
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPackets1_9.UPDATE_SIGN, null, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_8);
            JsonElement[] lines = new JsonElement[4];
            for (int i = 0; i < 4; ++i) {
                lines[i] = (JsonElement)wrapper.read(Types.COMPONENT);
            }
            wrapper.clearInputBuffer();
            wrapper.setPacketType((PacketType)ClientboundPackets1_9_3.BLOCK_ENTITY_DATA);
            wrapper.write(Types.BLOCK_POSITION1_8, (Object)position);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)9);
            CompoundTag tag = new CompoundTag();
            tag.put("id", (Tag)new StringTag("Sign"));
            tag.put("x", (Tag)new IntTag(position.x()));
            tag.put("y", (Tag)new IntTag(position.y()));
            tag.put("z", (Tag)new IntTag(position.z()));
            for (int i = 0; i < lines.length; ++i) {
                tag.put("Text" + (i + 1), (Tag)new StringTag(lines[i].toString()));
            }
            wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)tag);
        });
        this.registerClientbound(ClientboundPackets1_9.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_1To1_9_3.class);
            Chunk chunk = (Chunk)wrapper.read((Type)ChunkType1_9_1.forEnvironment((Environment)clientWorld.getEnvironment()));
            wrapper.write((Type)ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment()), (Object)chunk);
            List tags = chunk.getBlockEntities();
            for (int s = 0; s < chunk.getSections().length; ++s) {
                ChunkSection section = chunk.getSections()[s];
                if (section == null) continue;
                DataPalette blocks = section.palette(PaletteType.BLOCKS);
                for (int idx = 0; idx < 4096; ++idx) {
                    int id = blocks.idAt(idx) >> 4;
                    if (!FakeTileEntities1_9_1.isTileEntity((int)id)) continue;
                    tags.add(FakeTileEntities1_9_1.createTileEntity((int)(ChunkSection.xFromIndex((int)idx) + (chunk.getX() << 4)), (int)(ChunkSection.yFromIndex((int)idx) + (s << 4)), (int)(ChunkSection.zFromIndex((int)idx) + (chunk.getZ() << 4)), (int)id));
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_9.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_1To1_9_3.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_9.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_1To1_9_3.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 0);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_9.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map(ADJUST_PITCH);
            }
        });
    }
}


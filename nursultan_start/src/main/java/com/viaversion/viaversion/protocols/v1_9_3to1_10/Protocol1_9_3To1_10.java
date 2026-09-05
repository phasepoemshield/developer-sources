/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_9_3to1_10.storage.ResourcePackTracker
 */
package com.viaversion.viaversion.protocols.v1_9_3to1_10;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_3to1_10.rewriter.EntityPacketRewriter1_10;
import com.viaversion.viaversion.protocols.v1_9_3to1_10.rewriter.ItemPacketRewriter1_10;
import com.viaversion.viaversion.protocols.v1_9_3to1_10.storage.ResourcePackTracker;

public class Protocol1_9_3To1_10
extends AbstractProtocol<ClientboundPackets1_9_3, ClientboundPackets1_9_3, ServerboundPackets1_9_3, ServerboundPackets1_9_3> {
    public static final ValueTransformer<Short, Float> TO_NEW_PITCH = new ValueTransformer<Short, Float>((Type)Types.FLOAT){

        public Float transform(PacketWrapper wrapper, Short inputValue) {
            return Float.valueOf((float)inputValue.shortValue() / 63.0f);
        }
    };
    private final EntityPacketRewriter1_10 entityRewriter = new EntityPacketRewriter1_10(this);
    private final ItemPacketRewriter1_10 itemRewriter = new ItemPacketRewriter1_10(this);

    public Protocol1_9_3To1_10() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_9_3.class, ServerboundPackets1_9_3.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection userConnection) {
        this.addEntityTracker(userConnection, (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_9.EntityType.PLAYER));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        userConnection.put((StorableObject)new ResourcePackTracker());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_9_3.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE, TO_NEW_PITCH);
            }
        });
        this.registerClientbound(ClientboundPackets1_9_3.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.UNSIGNED_BYTE, TO_NEW_PITCH);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)Protocol1_9_3To1_10.this.getNewSoundId(id));
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_9_3.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_10.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_9_3.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_10.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 0);
                    clientWorld.setEnvironment(dimensionId);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_9_3To1_10.class);
            Chunk chunk = (Chunk)wrapper.passthrough((Type)ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment()));
            if (Via.getConfig().isReplacePistons()) {
                int replacementId = Via.getConfig().getPistonReplacementId();
                for (ChunkSection section : chunk.getSections()) {
                    if (section == null) continue;
                    section.palette(PaletteType.BLOCKS).replaceId(36, replacementId);
                }
            }
        });
        this.registerClientbound(ClientboundPackets1_9_3.RESOURCE_PACK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ResourcePackTracker tracker = (ResourcePackTracker)wrapper.user().get(ResourcePackTracker.class);
                    tracker.setLastHash((String)wrapper.get(Types.STRING, 1));
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_9_3.RESOURCE_PACK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    ResourcePackTracker tracker = (ResourcePackTracker)wrapper.user().get(ResourcePackTracker.class);
                    wrapper.write(Types.STRING, (Object)tracker.getLastHash());
                    wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT)));
                });
            }
        });
    }

    public ItemPacketRewriter1_10 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_10 getEntityRewriter() {
        return this.entityRewriter;
    }

    public int getNewSoundId(int id) {
        int newId = id;
        if (id >= 24) {
            ++newId;
        }
        if (id >= 248) {
            newId += 4;
        }
        if (id >= 296) {
            newId += 6;
        }
        if (id >= 354) {
            newId += 4;
        }
        if (id >= 372) {
            newId += 4;
        }
        return newId;
    }
}


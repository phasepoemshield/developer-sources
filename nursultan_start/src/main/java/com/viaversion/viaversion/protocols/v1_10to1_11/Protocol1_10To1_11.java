/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.remapper.ValueTransformer
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.BlockEntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.PotionColorMappings1_11
 *  com.viaversion.viaversion.protocols.v1_10to1_11.data.PotionColorMappings1_11$PotionData
 *  com.viaversion.viaversion.protocols.v1_10to1_11.storage.EntityTracker1_11
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 */
package com.viaversion.viaversion.protocols.v1_10to1_11;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.remapper.ValueTransformer;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.protocols.v1_10to1_11.Protocol1_10To1_11$6;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.BlockEntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.EntityMappings1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.data.PotionColorMappings1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.rewriter.EntityPacketRewriter1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.rewriter.ItemPacketRewriter1_11;
import com.viaversion.viaversion.protocols.v1_10to1_11.storage.EntityTracker1_11;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;

public class Protocol1_10To1_11
extends AbstractProtocol<ClientboundPackets1_9_3, ClientboundPackets1_9_3, ServerboundPackets1_9_3, ServerboundPackets1_9_3> {
    private static final ValueTransformer<Float, Short> toOldByte = new ValueTransformer<Float, Short>((Type)Types.UNSIGNED_BYTE){

        public Short transform(PacketWrapper wrapper, Float inputValue) {
            return (short)(inputValue.floatValue() * 16.0f);
        }
    };
    private final EntityPacketRewriter1_11 entityRewriter = new EntityPacketRewriter1_11(this);
    private final ItemPacketRewriter1_11 itemRewriter = new ItemPacketRewriter1_11(this);

    public Protocol1_10To1_11() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_9_3.class, ServerboundPackets1_9_3.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTracker1_11(userConnection));
        userConnection.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SOUND, wrapper -> {
            int soundId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int mappedId = this.getNewSoundId(soundId);
            if (mappedId == -1) {
                wrapper.cancel();
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.SET_TITLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    int action = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (action >= 2) {
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)(action + 1));
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(actionWrapper -> {
                    int id;
                    if (Via.getConfig().isPistonAnimationPatch() && ((id = ((Integer)actionWrapper.get((Type)Types.VAR_INT, 0)).intValue()) == 33 || id == 29)) {
                        actionWrapper.cancel();
                    }
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_10To1_11.class);
            Chunk chunk = (Chunk)wrapper.passthrough((Type)ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment()));
            if (chunk.getBlockEntities() == null) {
                return;
            }
            for (CompoundTag tag : chunk.getBlockEntities()) {
                StringTag idTag = tag.getStringTag("id");
                if (idTag == null) continue;
                String identifier = idTag.getValue();
                if (identifier.equals("MobSpawner")) {
                    EntityMappings1_11.toClientSpawner((CompoundTag)tag);
                }
                idTag.setValue(BlockEntityMappings1_11.toNewIdentifier((String)identifier));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(packetWrapper -> {
                    int effectID = (Integer)packetWrapper.get((Type)Types.INT, 0);
                    if (effectID == 2002) {
                        int data = (Integer)packetWrapper.get((Type)Types.INT, 1);
                        boolean isInstant = false;
                        PotionColorMappings1_11.PotionData newData = PotionColorMappings1_11.getNewData((int)data);
                        if (newData == null) {
                            Protocol1_10To1_11.this.getLogger().warning("Received unknown potion data: " + data);
                            data = 0;
                        } else {
                            data = newData.data();
                            isInstant = newData.instant();
                        }
                        if (isInstant) {
                            packetWrapper.set((Type)Types.INT, 0, (Object)2007);
                        }
                        packetWrapper.set((Type)Types.INT, 1, (Object)data);
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.FLOAT, toOldByte);
                this.map((Type)Types.FLOAT, toOldByte);
                this.map((Type)Types.FLOAT, toOldByte);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_9_3.CHAT, (PacketHandler)new Protocol1_10To1_11$6(this));
    }

    public ItemPacketRewriter1_11 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_11 getEntityRewriter() {
        return this.entityRewriter;
    }

    private int getNewSoundId(int id) {
        if (id == 196) {
            return -1;
        }
        if (id >= 85) {
            id += 2;
        }
        if (id >= 176) {
            ++id;
        }
        if (id >= 197) {
            id += 8;
        }
        if (id >= 207) {
            --id;
        }
        if (id >= 279) {
            id += 9;
        }
        if (id >= 296) {
            ++id;
        }
        if (id >= 390) {
            id += 4;
        }
        if (id >= 400) {
            id += 3;
        }
        if (id >= 450) {
            ++id;
        }
        if (id >= 455) {
            ++id;
        }
        if (id >= 470) {
            ++id;
        }
        return id;
    }
}


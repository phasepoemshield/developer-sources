/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.BaseChunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.BulkChunkType1_8
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_8
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1
 *  com.viaversion.viaversion.libs.gson.JsonPrimitive
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.EffectIdMappings1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.PotionIdMappings1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.data.SoundEffectMappings1_9
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.BaseChunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.BulkChunkType1_8;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_8;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_1;
import com.viaversion.viaversion.libs.gson.JsonPrimitive;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.EffectIdMappings1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.PotionIdMappings1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.data.SoundEffectMappings1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ClientboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.CommandBlockProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.provider.HandItemProvider;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.ClientWorld1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.EntityTracker1_9;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.Optional;

public class WorldPacketRewriter1_9 {
    public static void register(Protocol1_8To1_9 protocol) {
        protocol.registerClientbound(ClientboundPackets1_8.UPDATE_SIGN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.handler(wrapper -> {
                    for (int i = 0; i < 4; ++i) {
                        String line = (String)wrapper.read(Types.STRING);
                        Protocol1_8To1_9.STRING_TO_JSON.write(wrapper, (Object)line);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    id = EffectIdMappings1_9.getNewId((int)id);
                    wrapper.set((Type)Types.INT, 0, (Object)id);
                });
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 2002) {
                        int data = (Integer)wrapper.get((Type)Types.INT, 1);
                        int newData = PotionIdMappings1_9.getNewPotionID((int)data);
                        wrapper.set((Type)Types.INT, 1, (Object)newData);
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String name = Key.stripMinecraftNamespace((String)((String)wrapper.get(Types.STRING, 0)));
                    SoundEffectMappings1_9 effect = SoundEffectMappings1_9.getByName((String)name);
                    int catid = 0;
                    String newname = name;
                    if (effect != null) {
                        catid = effect.getCategory().getId();
                        newname = effect.getNewName();
                    }
                    wrapper.set(Types.STRING, 0, (Object)newname);
                    wrapper.write((Type)Types.VAR_INT, (Object)catid);
                    if (!Via.getConfig().cancelBlockSounds()) {
                        return;
                    }
                    if (effect != null && effect.isBreakSound()) {
                        EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                        int x = (Integer)wrapper.passthrough((Type)Types.INT);
                        int y = (Integer)wrapper.passthrough((Type)Types.INT);
                        int z = (Integer)wrapper.passthrough((Type)Types.INT);
                        if (tracker.interactedBlockRecently((int)Math.floor((double)x / 8.0), (int)Math.floor((double)y / 8.0), (int)Math.floor((double)z / 8.0))) {
                            wrapper.cancel();
                        }
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.LEVEL_CHUNK, wrapper -> {
            block6: {
                long chunkHash;
                Chunk chunk;
                ClientWorld1_9 clientWorld;
                block5: {
                    clientWorld = (ClientWorld1_9)wrapper.user().getClientWorld(Protocol1_8To1_9.class);
                    chunk = (Chunk)wrapper.read((Type)ChunkType1_8.forEnvironment((Environment)clientWorld.getEnvironment()));
                    chunkHash = ChunkPosition.chunkKey((int)chunk.getX(), (int)chunk.getZ());
                    if (!chunk.isFullChunk() || chunk.getBitmask() != 0) break block5;
                    wrapper.setPacketType((PacketType)ClientboundPackets1_9.FORGET_LEVEL_CHUNK);
                    wrapper.write((Type)Types.INT, (Object)chunk.getX());
                    wrapper.write((Type)Types.INT, (Object)chunk.getZ());
                    CommandBlockProvider provider = (CommandBlockProvider)Via.getManager().getProviders().get(CommandBlockProvider.class);
                    provider.unloadChunk(wrapper.user(), chunk.getX(), chunk.getZ());
                    clientWorld.getLoadedChunks().remove(chunkHash);
                    if (!Via.getConfig().isChunkBorderFix()) break block6;
                    for (int modX = -1; modX <= 1; ++modX) {
                        for (int modZ = -1; modZ <= 1; ++modZ) {
                            if (modX == 0 && modZ == 0) continue;
                            int chunkX = chunk.getX() + modX;
                            int chunkZ = chunk.getZ() + modZ;
                            if (clientWorld.getLoadedChunks().contains(ChunkPosition.chunkKey((int)chunkX, (int)chunkZ))) continue;
                            PacketWrapper unloadChunk = wrapper.create((PacketType)ClientboundPackets1_9.FORGET_LEVEL_CHUNK);
                            unloadChunk.write((Type)Types.INT, (Object)chunkX);
                            unloadChunk.write((Type)Types.INT, (Object)chunkZ);
                            unloadChunk.send(Protocol1_8To1_9.class);
                        }
                    }
                    break block6;
                }
                ChunkType1_9_1 chunkType = ChunkType1_9_1.forEnvironment((Environment)clientWorld.getEnvironment());
                wrapper.write((Type)chunkType, (Object)chunk);
                clientWorld.getLoadedChunks().add(chunkHash);
                if (Via.getConfig().isChunkBorderFix()) {
                    for (int modX = -1; modX <= 1; ++modX) {
                        for (int modZ = -1; modZ <= 1; ++modZ) {
                            if (modX == 0 && modZ == 0) continue;
                            int chunkX = chunk.getX() + modX;
                            int chunkZ = chunk.getZ() + modZ;
                            if (clientWorld.getLoadedChunks().contains(ChunkPosition.chunkKey((int)chunkX, (int)chunkZ))) continue;
                            PacketWrapper emptyChunk = wrapper.create((PacketType)ClientboundPackets1_9.LEVEL_CHUNK);
                            BaseChunk c = new BaseChunk(chunkX, chunkZ, true, false, 0, new ChunkSection[16], new int[256], new ArrayList());
                            emptyChunk.write((Type)chunkType, (Object)c);
                            emptyChunk.send(Protocol1_8To1_9.class);
                        }
                    }
                }
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.MAP_BULK_CHUNK, null, wrapper -> {
            wrapper.cancel();
            ClientWorld1_9 clientWorld = (ClientWorld1_9)wrapper.user().getClientWorld(Protocol1_8To1_9.class);
            Chunk[] chunks = (Chunk[])wrapper.read(BulkChunkType1_8.TYPE);
            ChunkType1_9_1 chunkType = ChunkType1_9_1.forEnvironment((Environment)clientWorld.getEnvironment());
            for (Chunk chunk : chunks) {
                PacketWrapper chunkData = wrapper.create((PacketType)ClientboundPackets1_9.LEVEL_CHUNK);
                chunkData.write((Type)chunkType, (Object)chunk);
                chunkData.send(Protocol1_8To1_9.class);
                clientWorld.getLoadedChunks().add(ChunkPosition.chunkKey((int)chunk.getX(), (int)chunk.getZ()));
            }
            if (!Via.getConfig().isChunkBorderFix()) {
                return;
            }
            for (Chunk chunk : chunks) {
                for (int modX = -1; modX <= 1; ++modX) {
                    for (int modZ = -1; modZ <= 1; ++modZ) {
                        if (modX == 0 && modZ == 0) continue;
                        int chunkX = chunk.getX() + modX;
                        int chunkZ = chunk.getZ() + modZ;
                        if (clientWorld.getLoadedChunks().contains(ChunkPosition.chunkKey((int)chunkX, (int)chunkZ))) continue;
                        PacketWrapper emptyChunk = wrapper.create((PacketType)ClientboundPackets1_9.LEVEL_CHUNK);
                        BaseChunk c = new BaseChunk(chunkX, chunkZ, true, false, 0, new ChunkSection[16], new int[256], new ArrayList());
                        emptyChunk.write((Type)chunkType, (Object)c);
                        emptyChunk.send(Protocol1_8To1_9.class);
                    }
                }
            }
        });
        protocol.registerClientbound(ClientboundPackets1_8.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    CompoundTag tag;
                    short action = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (action == 1 && (tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0)) != null) {
                        StringTag entityId = tag.getStringTag("EntityId");
                        if (entityId != null) {
                            String entity = entityId.getValue();
                            CompoundTag spawn = new CompoundTag();
                            spawn.putString("id", entity);
                            tag.put("SpawnData", (Tag)spawn);
                        } else {
                            CompoundTag spawn = new CompoundTag();
                            spawn.putString("id", "AreaEffectCloud");
                            tag.put("SpawnData", (Tag)spawn);
                        }
                    }
                    if (action == 2) {
                        CommandBlockProvider provider = (CommandBlockProvider)Via.getManager().getProviders().get(CommandBlockProvider.class);
                        provider.addOrUpdateBlock(wrapper.user(), (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0), (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0));
                        wrapper.cancel();
                    }
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.SIGN_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.handler(wrapper -> {
                    for (int i = 0; i < 4; ++i) {
                        String line = (String)wrapper.read(Types.STRING);
                        wrapper.write(Types.COMPONENT, (Object)new JsonPrimitive(line));
                    }
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.PLAYER_ACTION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.handler(wrapper -> {
                    int status = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (status == 6) {
                        wrapper.cancel();
                    }
                });
                this.handler(wrapper -> {
                    EntityTracker1_9 entityTracker;
                    int status = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if ((status == 5 || status == 4 || status == 3) && (entityTracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class)).isBlocking()) {
                        entityTracker.setBlocking(false);
                        if (!Via.getConfig().isShowShieldWhenSwordInHand()) {
                            entityTracker.setSecondHand(null);
                        }
                    }
                });
            }
        });
        protocol.registerServerbound(ServerboundPackets1_9.USE_ITEM, null, wrapper -> {
            int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.clearInputBuffer();
            wrapper.setPacketType((PacketType)ServerboundPackets1_8.USE_ITEM_ON);
            wrapper.write(Types.BLOCK_POSITION1_8, (Object)new BlockPosition(-1, -1, -1));
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)255);
            Item item = ((HandItemProvider)Via.getManager().getProviders().get(HandItemProvider.class)).getHandItem(wrapper.user());
            if (Via.getConfig().isShieldBlocking() && wrapper.user().getProtocolInfo().protocolVersion().olderThan(ProtocolVersion.v1_21_4)) {
                boolean isSword;
                EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                boolean showShieldWhenSwordInHand = Via.getConfig().isShowShieldWhenSwordInHand();
                boolean bl = showShieldWhenSwordInHand ? tracker.hasSwordInHand() : (isSword = item != null && Protocol1_8To1_9.isSword(item.identifier()));
                if (isSword) {
                    boolean blockUsingMainHand;
                    if (hand == 0 && !tracker.isBlocking()) {
                        tracker.setBlocking(true);
                        if (!showShieldWhenSwordInHand && tracker.getItemInSecondHand() == null) {
                            DataItem shield = new DataItem(442, 1, 0, null);
                            tracker.setSecondHand((Item)shield);
                        }
                    }
                    boolean bl2 = blockUsingMainHand = Via.getConfig().isNoDelayShieldBlocking() && !showShieldWhenSwordInHand;
                    if (blockUsingMainHand && hand == 1 || !blockUsingMainHand && hand == 0) {
                        wrapper.cancel();
                    }
                } else {
                    if (!showShieldWhenSwordInHand) {
                        tracker.setSecondHand(null);
                    }
                    tracker.setBlocking(false);
                }
            }
            wrapper.write(Types.ITEM1_8, (Object)item);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)0);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)0);
            wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)0);
        });
        protocol.registerServerbound(ServerboundPackets1_9.USE_ITEM_ON, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT, (Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    int hand = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (hand != 0) {
                        wrapper.cancel();
                    }
                });
                this.handler(wrapper -> {
                    Item item = ((HandItemProvider)Via.getManager().getProviders().get(HandItemProvider.class)).getHandItem(wrapper.user());
                    wrapper.write(Types.ITEM1_8, (Object)item);
                });
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> {
                    CommandBlockProvider provider = (CommandBlockProvider)Via.getManager().getProviders().get(CommandBlockProvider.class);
                    BlockPosition pos = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    Optional<CompoundTag> tag = provider.get(wrapper.user(), pos);
                    if (tag.isPresent()) {
                        PacketWrapper updateBlockEntity = PacketWrapper.create((PacketType)ClientboundPackets1_9.BLOCK_ENTITY_DATA, null, (UserConnection)wrapper.user());
                        updateBlockEntity.write(Types.BLOCK_POSITION1_8, (Object)pos);
                        updateBlockEntity.write((Type)Types.UNSIGNED_BYTE, (Object)2);
                        updateBlockEntity.write(Types.NAMED_COMPOUND_TAG, (Object)tag.get());
                        updateBlockEntity.scheduleSend(Protocol1_8To1_9.class);
                    }
                });
                if (!Via.getConfig().cancelBlockSounds()) {
                    return;
                }
                this.handler(wrapper -> {
                    short face = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    if (face == 255) {
                        return;
                    }
                    BlockPosition p = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    int x = p.x();
                    int y = p.y();
                    int z = p.z();
                    switch (face) {
                        case 0: {
                            --y;
                            break;
                        }
                        case 1: {
                            ++y;
                            break;
                        }
                        case 2: {
                            --z;
                            break;
                        }
                        case 3: {
                            ++z;
                            break;
                        }
                        case 4: {
                            --x;
                            break;
                        }
                        case 5: {
                            ++x;
                        }
                    }
                    EntityTracker1_9 tracker = (EntityTracker1_9)wrapper.user().getEntityTracker(Protocol1_8To1_9.class);
                    tracker.addBlockInteraction(new BlockPosition(x, y, z));
                });
            }
        });
    }
}


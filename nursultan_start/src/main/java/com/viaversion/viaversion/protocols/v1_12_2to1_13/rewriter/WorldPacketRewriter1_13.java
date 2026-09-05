/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData$NeighbourUpdater
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.data.NamedSoundMappings1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage$ReplacementData
 *  com.viaversion.viaversion.util.IdAndData
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_9_3;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionHandler;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.NamedSoundMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ParticleIdMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.BlockEntityProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.provider.PaintingProvider;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.util.IdAndData;
import com.viaversion.viaversion.util.Key;
import java.util.Iterator;
import java.util.Optional;

public class WorldPacketRewriter1_13 {
    private static final IntSet VALID_BIOMES;

    public static int toNewId(int n) {
        int n2;
        if (n < 0) {
            n = 0;
        }
        if ((n2 = Protocol1_12_2To1_13.MAPPINGS.getBlockMappings().getNewId(n)) != -1) {
            return n2;
        }
        n2 = Protocol1_12_2To1_13.MAPPINGS.getBlockMappings().getNewId(IdAndData.removeData((int)n));
        if (n2 != -1) {
            if (Via.getConfig().logOtherConversionWarnings()) {
                Protocol1_12_2To1_13.LOGGER.warning("Missing block " + n);
            }
            return n2;
        }
        if (Via.getConfig().logOtherConversionWarnings()) {
            Protocol1_12_2To1_13.LOGGER.warning("Missing block completely " + n);
        }
        return 0;
    }

    public static void register(Protocol1_12_2To1_13 protocol1_12_2To1_13) {
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.handler(wrapper -> {
                    String motive;
                    PaintingProvider provider = (PaintingProvider)Via.getManager().getProviders().get(PaintingProvider.class);
                    Optional<Integer> id = provider.getIntByIdentifier(motive = (String)wrapper.read(Types.STRING));
                    if (id.isEmpty() && Via.getConfig().logOtherConversionWarnings()) {
                        Protocol1_12_2To1_13.LOGGER.warning("Could not find painting motive: " + motive + " falling back to default (0)");
                    }
                    wrapper.write((Type)Types.VAR_INT, (Object)id.orElse(0));
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    BlockStorage storage;
                    BlockStorage.ReplacementData replacementData;
                    BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    short action = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    CompoundTag tag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    BlockEntityProvider provider = (BlockEntityProvider)Via.getManager().getProviders().get(BlockEntityProvider.class);
                    int newId = provider.transform(wrapper.user(), position, tag, true);
                    if (newId != -1 && (replacementData = (storage = (BlockStorage)wrapper.user().get(BlockStorage.class)).get(position)) != null) {
                        replacementData.setReplacement(newId);
                    }
                    if (action == 5) {
                        wrapper.cancel();
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.BLOCK_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    BlockPosition pos = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    short action = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 0);
                    short param = (Short)wrapper.get((Type)Types.UNSIGNED_BYTE, 1);
                    int blockId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    if (blockId == 25) {
                        blockId = 73;
                    } else if (blockId == 33) {
                        blockId = 99;
                    } else if (blockId == 29) {
                        blockId = 92;
                    } else if (blockId == 54) {
                        blockId = 142;
                    } else if (blockId == 146) {
                        blockId = 305;
                    } else if (blockId == 130) {
                        blockId = 249;
                    } else if (blockId == 138) {
                        blockId = 257;
                    } else if (blockId == 52) {
                        blockId = 140;
                    } else if (blockId == 209) {
                        blockId = 472;
                    } else if (blockId >= 219 && blockId <= 234) {
                        blockId = blockId - 219 + 483;
                    }
                    if (blockId == 73) {
                        PacketWrapper blockChange = wrapper.create((PacketType)ClientboundPackets1_13.BLOCK_UPDATE);
                        blockChange.write(Types.BLOCK_POSITION1_8, (Object)pos);
                        blockChange.write((Type)Types.VAR_INT, (Object)(249 + action * 24 * 2 + param * 2));
                        blockChange.send(Protocol1_12_2To1_13.class);
                    }
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)blockId);
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> {
                    BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                    int newId = WorldPacketRewriter1_13.toNewId((Integer)wrapper.get((Type)Types.VAR_INT, 0));
                    UserConnection userConnection = wrapper.user();
                    if (Via.getConfig().isServersideBlockConnections()) {
                        newId = ConnectionData.connect(userConnection, position, newId);
                        ConnectionData.updateBlockStorage(userConnection, position.x(), position.y(), position.z(), newId);
                    }
                    wrapper.set((Type)Types.VAR_INT, 0, (Object)WorldPacketRewriter1_13.checkStorage(wrapper.user(), position, newId));
                    if (Via.getConfig().isServersideBlockConnections()) {
                        wrapper.send(Protocol1_12_2To1_13.class);
                        wrapper.cancel();
                        ConnectionData.update(userConnection, position);
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_CHANGE_ARRAY);
                this.handler(wrapper -> {
                    BlockPosition position;
                    BlockChangeRecord[] records;
                    int chunkX = (Integer)wrapper.get((Type)Types.INT, 0);
                    int chunkZ = (Integer)wrapper.get((Type)Types.INT, 1);
                    UserConnection userConnection = wrapper.user();
                    for (BlockChangeRecord record : records = (BlockChangeRecord[])wrapper.get(Types.BLOCK_CHANGE_ARRAY, 0)) {
                        int newBlock = WorldPacketRewriter1_13.toNewId(record.getBlockId());
                        position = new BlockPosition(record.getSectionX() + (chunkX << 4), (int)record.getY(), record.getSectionZ() + (chunkZ << 4));
                        record.setBlockId(WorldPacketRewriter1_13.checkStorage(wrapper.user(), position, newBlock));
                        if (!Via.getConfig().isServersideBlockConnections()) continue;
                        ConnectionData.updateBlockStorage(userConnection, position.x(), position.y(), position.z(), newBlock);
                    }
                    if (Via.getConfig().isServersideBlockConnections()) {
                        for (BlockChangeRecord record : records) {
                            int blockState = record.getBlockId();
                            position = new BlockPosition(record.getSectionX() + chunkX * 16, (int)record.getY(), record.getSectionZ() + chunkZ * 16);
                            ConnectionHandler handler = ConnectionData.getConnectionHandler(blockState);
                            if (handler == null) continue;
                            blockState = handler.connect(userConnection, position, blockState);
                            record.setBlockId(blockState);
                            ConnectionData.updateBlockStorage(userConnection, position.x(), position.y(), position.z(), blockState);
                        }
                        wrapper.send(Protocol1_12_2To1_13.class);
                        wrapper.cancel();
                        for (BlockChangeRecord record : records) {
                            BlockPosition position2 = new BlockPosition(record.getSectionX() + chunkX * 16, (int)record.getY(), record.getSectionZ() + chunkZ * 16);
                            ConnectionData.update(userConnection, position2);
                        }
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                if (!Via.getConfig().isServersideBlockConnections()) {
                    return;
                }
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int i;
                    UserConnection userConnection = wrapper.user();
                    int x = (int)Math.floor(((Float)wrapper.get((Type)Types.FLOAT, 0)).floatValue());
                    int y = (int)Math.floor(((Float)wrapper.get((Type)Types.FLOAT, 1)).floatValue());
                    int z = (int)Math.floor(((Float)wrapper.get((Type)Types.FLOAT, 2)).floatValue());
                    int recordCount = (Integer)wrapper.get((Type)Types.INT, 0);
                    BlockPosition[] records = new BlockPosition[recordCount];
                    for (i = 0; i < recordCount; ++i) {
                        BlockPosition position;
                        records[i] = position = new BlockPosition(x + (Byte)wrapper.passthrough((Type)Types.BYTE), (int)((short)(y + (Byte)wrapper.passthrough((Type)Types.BYTE))), z + (Byte)wrapper.passthrough((Type)Types.BYTE));
                        ConnectionData.updateBlockStorage(userConnection, position.x(), position.y(), position.z(), 0);
                    }
                    wrapper.send(Protocol1_12_2To1_13.class);
                    wrapper.cancel();
                    for (i = 0; i < recordCount; ++i) {
                        ConnectionData.update(userConnection, records[i]);
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.FORGET_LEVEL_CHUNK, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    int x = (Integer)wrapper.passthrough((Type)Types.INT);
                    int z = (Integer)wrapper.passthrough((Type)Types.INT);
                    ((BlockStorage)wrapper.user().get(BlockStorage.class)).removeChunk(x, z);
                    if (Via.getConfig().isServersideBlockConnections()) {
                        ConnectionData.blockConnectionProvider.unloadChunk(wrapper.user(), x, z);
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String sound = Key.stripMinecraftNamespace((String)((String)wrapper.get(Types.STRING, 0)));
                    String newSoundId = NamedSoundMappings1_13.getNewId((String)sound);
                    wrapper.set(Types.STRING, 0, (Object)newSoundId);
                });
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.LEVEL_CHUNK, packetWrapper -> {
            int n;
            int n2;
            int n3;
            ClientWorld clientWorld = packetWrapper.user().getClientWorld(Protocol1_12_2To1_13.class);
            BlockStorage blockStorage = (BlockStorage)packetWrapper.user().get(BlockStorage.class);
            ChunkType1_9_3 chunkType1_9_3 = ChunkType1_9_3.forEnvironment((Environment)clientWorld.getEnvironment());
            ChunkType1_13 chunkType1_13 = ChunkType1_13.forEnvironment((Environment)clientWorld.getEnvironment());
            Chunk chunk = (Chunk)packetWrapper.read((Type)chunkType1_9_3);
            packetWrapper.write((Type)chunkType1_13, (Object)chunk);
            for (n3 = 0; n3 < chunk.getSections().length; ++n3) {
                int n4;
                DataPalette dataPalette;
                block21: {
                    block20: {
                        ChunkSection chunkSection = chunk.getSections()[n3];
                        if (chunkSection == null) continue;
                        dataPalette = chunkSection.palette(PaletteType.BLOCKS);
                        for (n2 = 0; n2 < dataPalette.size(); ++n2) {
                            n4 = dataPalette.idByIndex(n2);
                            int n5 = WorldPacketRewriter1_13.toNewId(n4);
                            dataPalette.setIdByIndex(n2, n5);
                        }
                        if (!chunk.isFullChunk()) break block20;
                        n2 = 0;
                        for (n4 = 0; n4 < dataPalette.size(); ++n4) {
                            if (!blockStorage.isWelcome(dataPalette.idByIndex(n4))) continue;
                            n2 = 1;
                            break;
                        }
                        if (n2 == 0) break block21;
                    }
                    for (n2 = 0; n2 < 4096; ++n2) {
                        n4 = dataPalette.idAt(n2);
                        BlockPosition blockPosition = new BlockPosition(ChunkSection.xFromIndex((int)n2) + (chunk.getX() << 4), ChunkSection.yFromIndex((int)n2) + (n3 << 4), ChunkSection.zFromIndex((int)n2) + (chunk.getZ() << 4));
                        if (blockStorage.isWelcome(n4)) {
                            blockStorage.store(blockPosition, n4);
                            continue;
                        }
                        if (chunk.isFullChunk()) continue;
                        blockStorage.remove(blockPosition);
                    }
                }
                if (!Via.getConfig().isServersideBlockConnections() || !ConnectionData.needStoreBlocks()) continue;
                if (!chunk.isFullChunk()) {
                    ConnectionData.blockConnectionProvider.unloadChunkSection(packetWrapper.user(), chunk.getX(), n3, chunk.getZ());
                }
                n2 = 0;
                for (n4 = 0; n4 < dataPalette.size(); ++n4) {
                    if (!ConnectionData.isWelcome(dataPalette.idByIndex(n4))) continue;
                    n2 = 1;
                    break;
                }
                if (n2 == 0) continue;
                for (n4 = 0; n4 < 4096; ++n4) {
                    int n6 = dataPalette.idAt(n4);
                    if (!ConnectionData.isWelcome(n6)) continue;
                    n = ChunkSection.xFromIndex((int)n4) + (chunk.getX() << 4);
                    int n7 = ChunkSection.yFromIndex((int)n4) + (n3 << 4);
                    int n8 = ChunkSection.zFromIndex((int)n4) + (chunk.getZ() << 4);
                    ConnectionData.blockConnectionProvider.storeBlock(packetWrapper.user(), n, n7, n8, n6);
                }
            }
            if (chunk.isBiomeData()) {
                n3 = Integer.MIN_VALUE;
                for (int i = 0; i < 256; ++i) {
                    int n9 = chunk.getBiomeData()[i];
                    if (VALID_BIOMES.contains(n9)) continue;
                    if (n9 != 255 && n3 != n9) {
                        if (Via.getConfig().logOtherConversionWarnings()) {
                            Protocol1_12_2To1_13.LOGGER.warning("Received invalid biome id: " + n9);
                        }
                        n3 = n9;
                    }
                    chunk.getBiomeData()[i] = 1;
                }
            }
            BlockEntityProvider blockEntityProvider = (BlockEntityProvider)Via.getManager().getProviders().get(BlockEntityProvider.class);
            Iterator iterator = chunk.getBlockEntities().iterator();
            while (iterator.hasNext()) {
                String string;
                StringTag stringTag;
                CompoundTag compoundTag = (CompoundTag)iterator.next();
                n2 = blockEntityProvider.transform(packetWrapper.user(), null, compoundTag, false);
                if (n2 != -1) {
                    short s;
                    int n10 = compoundTag.getNumberTag("x").asInt();
                    BlockPosition blockPosition = new BlockPosition(n10, (int)(s = compoundTag.getNumberTag("y").asShort()), n = compoundTag.getNumberTag("z").asInt());
                    BlockStorage.ReplacementData replacementData = blockStorage.get(blockPosition);
                    if (replacementData != null) {
                        replacementData.setReplacement(n2);
                    }
                    chunk.getSections()[s >> 4].palette(PaletteType.BLOCKS).setIdAt(n10 & 0xF, s & 0xF, n & 0xF, n2);
                }
                if ((stringTag = compoundTag.getStringTag("id")) == null || !(string = Key.namespaced((String)stringTag.getValue())).equals("minecraft:noteblock") && !string.equals("minecraft:flower_pot")) continue;
                iterator.remove();
            }
            if (Via.getConfig().isServersideBlockConnections()) {
                ConnectionData.connectBlocks(packetWrapper.user(), chunk);
                packetWrapper.send(Protocol1_12_2To1_13.class);
                packetWrapper.cancel();
                ConnectionData.NeighbourUpdater neighbourUpdater = new ConnectionData.NeighbourUpdater(packetWrapper.user());
                for (n2 = 0; n2 < chunk.getSections().length; ++n2) {
                    ChunkSection chunkSection = chunk.getSections()[n2];
                    if (chunkSection == null) continue;
                    neighbourUpdater.updateChunkSectionNeighbours(chunk.getX(), chunk.getZ(), n2);
                }
            }
        });
        protocol1_12_2To1_13.registerClientbound(ClientboundPackets1_12_1.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

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
                    int particleId = (Integer)wrapper.get((Type)Types.INT, 0);
                    int dataCount = 0;
                    if (particleId == 37 || particleId == 38 || particleId == 46) {
                        dataCount = 1;
                    } else if (particleId == 36) {
                        dataCount = 2;
                    }
                    Integer[] data = new Integer[dataCount];
                    for (int i = 0; i < data.length; ++i) {
                        data[i] = (Integer)wrapper.read((Type)Types.VAR_INT);
                    }
                    Particle particle = ParticleIdMappings1_13.rewriteParticle(particleId, data);
                    if (particle == null || particle.id() == -1) {
                        wrapper.cancel();
                        return;
                    }
                    if (particle.id() == 11) {
                        int count = (Integer)wrapper.get((Type)Types.INT, 1);
                        float speed = ((Float)wrapper.get((Type)Types.FLOAT, 6)).floatValue();
                        if (count == 0) {
                            wrapper.set((Type)Types.INT, 1, (Object)1);
                            wrapper.set((Type)Types.FLOAT, 6, (Object)Float.valueOf(0.0f));
                            for (int i = 0; i < 3; ++i) {
                                float colorValue = ((Float)wrapper.get((Type)Types.FLOAT, i + 3)).floatValue() * speed;
                                if (colorValue == 0.0f && i == 0) {
                                    colorValue = 1.0f;
                                }
                                particle.getArgument(i).setValue((Object)Float.valueOf(colorValue));
                                wrapper.set((Type)Types.FLOAT, i + 3, (Object)Float.valueOf(0.0f));
                            }
                        }
                    }
                    wrapper.set((Type)Types.INT, 0, (Object)particle.id());
                    for (Particle.ParticleData particleData : particle.getArguments()) {
                        particleData.write(wrapper);
                    }
                });
            }
        });
        protocol1_12_2To1_13.registerServerbound(ServerboundPackets1_13.USE_ITEM_ON, packetWrapper -> {
            BlockPosition blockPosition = (BlockPosition)packetWrapper.passthrough(Types.BLOCK_POSITION1_8);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.VAR_INT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            packetWrapper.passthrough((Type)Types.FLOAT);
            if (Via.getConfig().isServersideBlockConnections() && ConnectionData.needStoreBlocks()) {
                ConnectionData.markModified(packetWrapper.user(), blockPosition);
            }
        });
        protocol1_12_2To1_13.registerServerbound(ServerboundPackets1_13.PLAYER_ACTION, packetWrapper -> {
            int n = (Integer)packetWrapper.passthrough((Type)Types.VAR_INT);
            BlockPosition blockPosition = (BlockPosition)packetWrapper.passthrough(Types.BLOCK_POSITION1_8);
            packetWrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            if (n == 0 && Via.getConfig().isServersideBlockConnections() && ConnectionData.needStoreBlocks()) {
                ConnectionData.markModified(packetWrapper.user(), blockPosition);
            }
        });
    }

    private static int checkStorage(UserConnection userConnection, BlockPosition blockPosition, int n) {
        BlockStorage blockStorage = (BlockStorage)userConnection.get(BlockStorage.class);
        if (blockStorage.contains(blockPosition)) {
            BlockStorage.ReplacementData replacementData = blockStorage.get(blockPosition);
            if (replacementData.getOriginal() == n) {
                if (replacementData.getReplacement() != -1) {
                    return replacementData.getReplacement();
                }
            } else {
                blockStorage.remove(blockPosition);
                if (blockStorage.isWelcome(n)) {
                    blockStorage.store(blockPosition, n);
                }
            }
        } else if (blockStorage.isWelcome(n)) {
            blockStorage.store(blockPosition, n);
        }
        return n;
    }

    static {
        int i;
        VALID_BIOMES = new IntOpenHashSet(70);
        for (i = 0; i < 50; ++i) {
            VALID_BIOMES.add(i);
        }
        VALID_BIOMES.add(127);
        for (i = 129; i <= 134; ++i) {
            VALID_BIOMES.add(i);
        }
        VALID_BIOMES.add(140);
        VALID_BIOMES.add(149);
        VALID_BIOMES.add(151);
        for (i = 155; i <= 158; ++i) {
            VALID_BIOMES.add(i);
        }
        for (i = 160; i <= 167; ++i) {
            VALID_BIOMES.add(i);
        }
    }
}


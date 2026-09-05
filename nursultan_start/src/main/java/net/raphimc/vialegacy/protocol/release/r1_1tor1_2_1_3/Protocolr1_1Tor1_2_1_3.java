/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.seedfinding.mcbiome.source.BiomeSource
 *  com.seedfinding.mccore.state.Dimension
 *  com.seedfinding.mccore.version.MCVersion
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.NibbleArray
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.IdAndData
 *  net.raphimc.vialegacy.ViaLegacy
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.api.protocol.StatelessProtocol
 *  net.raphimc.vialegacy.api.splitter.PreNettySplitter
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.biome.BetaOverworldBiomeSource
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.biome.PlainsBiomeSource
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.model.LegacyNibbleArray
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.model.NonFullChunk
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.PendingBlocksTracker
 *  net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.SeedStorage
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker
 *  net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6
 */
package net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3;

import com.seedfinding.mcbiome.source.BiomeSource;
import com.seedfinding.mccore.state.Dimension;
import com.seedfinding.mccore.version.MCVersion;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.NibbleArray;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.IdAndData;
import net.raphimc.vialegacy.ViaLegacy;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.api.protocol.StatelessProtocol;
import net.raphimc.vialegacy.api.splitter.PreNettySplitter;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.biome.BetaOverworldBiomeSource;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.biome.PlainsBiomeSource;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.model.LegacyNibbleArray;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.model.NonFullChunk;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.packet.ClientboundPackets1_1;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.packet.ServerboundPackets1_1;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.rewriter.ItemRewriter;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.PendingBlocksTracker;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.storage.SeedStorage;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.task.BlockReceiveInvalidatorTask;
import net.raphimc.vialegacy.protocol.release.r1_1tor1_2_1_3.types.Types1_1;
import net.raphimc.vialegacy.protocol.release.r1_2_1_3tor1_2_4_5.packet.ClientboundPackets1_2_1;
import net.raphimc.vialegacy.protocol.release.r1_2_1_3tor1_2_4_5.packet.ServerboundPackets1_2_1;
import net.raphimc.vialegacy.protocol.release.r1_2_4_5tor1_3_1_2.types.Types1_2_4;
import net.raphimc.vialegacy.protocol.release.r1_3_1_2tor1_4_2.types.Types1_3_1;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.storage.ChunkTracker;
import net.raphimc.vialegacy.protocol.release.r1_6_4tor1_7_2_5.types.Types1_6_4;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.Types1_7_6;

public class Protocolr1_1Tor1_2_1_3
extends StatelessProtocol<ClientboundPackets1_1, ClientboundPackets1_2_1, ServerboundPackets1_1, ServerboundPackets1_2_1> {
    private final ItemRewriter itemRewriter = new ItemRewriter(this);

    public Protocolr1_1Tor1_2_1_3() {
        super(ClientboundPackets1_1.class, ClientboundPackets1_2_1.class, ServerboundPackets1_1.class, ServerboundPackets1_2_1.class);
    }

    public void register(ViaProviders providers) {
        Via.getPlatform().runRepeatingSync((Runnable)new BlockReceiveInvalidatorTask(), 1L);
    }

    public void init(UserConnection userConnection) {
        userConnection.put((StorableObject)new PreNettySplitter(Protocolr1_1Tor1_2_1_3.class, ClientboundPackets1_1::getPacket));
        userConnection.addClientWorld(Protocolr1_1Tor1_2_1_3.class, new ClientWorld());
        userConnection.put((StorableObject)new SeedStorage());
        userConnection.put((StorableObject)new PendingBlocksTracker(userConnection));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(ClientboundPackets1_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.handler(wrapper -> {
                    ((SeedStorage)wrapper.user().get(SeedStorage.class)).seed = (Long)wrapper.read((Type)Types.LONG);
                });
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> Protocolr1_1Tor1_2_1_3.this.handleRespawn((Integer)wrapper.get((Type)Types.INT, 2), wrapper.user()));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE, (Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.handler(wrapper -> {
                    ((SeedStorage)wrapper.user().get(SeedStorage.class)).seed = (Long)wrapper.read((Type)Types.LONG);
                });
                this.map(Types1_6_4.STRING);
                this.handler(wrapper -> Protocolr1_1Tor1_2_1_3.this.handleRespawn((Integer)wrapper.get((Type)Types.INT, 0), wrapper.user()));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> wrapper.write((Type)Types.BYTE, (Object)((Byte)wrapper.get((Type)Types.BYTE, 0))));
                this.map(Types1_3_1.ENTITY_DATA_LIST);
            }
        });
        this.registerClientbound(ClientboundPackets1_1.MOVE_ENTITY_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> Protocolr1_1Tor1_2_1_3.this.sendEntityHeadLook((Integer)wrapper.get((Type)Types.INT, 0), (Byte)wrapper.get((Type)Types.BYTE, 0), wrapper));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.MOVE_ENTITY_POS_ROT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> Protocolr1_1Tor1_2_1_3.this.sendEntityHeadLook((Integer)wrapper.get((Type)Types.INT, 0), (Byte)wrapper.get((Type)Types.BYTE, 3), wrapper));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.TELEPORT_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> Protocolr1_1Tor1_2_1_3.this.sendEntityHeadLook((Integer)wrapper.get((Type)Types.INT, 0), (Byte)wrapper.get((Type)Types.BYTE, 0), wrapper));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.LEVEL_CHUNK, wrapper -> {
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            SeedStorage seedStorage = (SeedStorage)wrapper.user().get(SeedStorage.class);
            PendingBlocksTracker pendingBlocksTracker = (PendingBlocksTracker)wrapper.user().get(PendingBlocksTracker.class);
            Chunk chunk = (Chunk)wrapper.read(Types1_1.CHUNK);
            if (chunk instanceof NonFullChunk) {
                NonFullChunk nonFullChunk = (NonFullChunk)chunk;
                if (!chunkTracker.isChunkLoaded(chunk.getX(), chunk.getZ())) {
                    wrapper.cancel();
                    return;
                }
                wrapper.setPacketType((PacketType)ClientboundPackets1_2_1.CHUNK_BLOCKS_UPDATE);
                wrapper.write((Type)Types.INT, (Object)nonFullChunk.getX());
                wrapper.write((Type)Types.INT, (Object)nonFullChunk.getZ());
                wrapper.write(Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY, (Object)nonFullChunk.asBlockChangeRecords().toArray(new BlockChangeRecord[0]));
                pendingBlocksTracker.markReceived(new BlockPosition((nonFullChunk.getX() << 4) + nonFullChunk.getStartPos().x(), nonFullChunk.getStartPos().y(), (nonFullChunk.getZ() << 4) + nonFullChunk.getStartPos().z()), new BlockPosition((nonFullChunk.getX() << 4) + nonFullChunk.getEndPos().x() - 1, nonFullChunk.getEndPos().y() - 1, (nonFullChunk.getZ() << 4) + nonFullChunk.getEndPos().z() - 1));
                return;
            }
            pendingBlocksTracker.markReceived(new BlockPosition(chunk.getX() << 4, 0, chunk.getZ() << 4), new BlockPosition((chunk.getX() << 4) + 15, chunk.getSections().length * 16, (chunk.getZ() << 4) + 15));
            for (ChunkSection section : chunk.getSections()) {
                if (section == null) continue;
                LegacyNibbleArray oldBlockLight = new LegacyNibbleArray(section.getLight().getBlockLight(), 4);
                NibbleArray newBlockLight = new NibbleArray(oldBlockLight.size());
                LegacyNibbleArray oldSkyLight = new LegacyNibbleArray(section.getLight().getSkyLight(), 4);
                NibbleArray newSkyLight = new NibbleArray(oldSkyLight.size());
                for (int x = 0; x < 16; ++x) {
                    for (int y = 0; y < 16; ++y) {
                        for (int z = 0; z < 16; ++z) {
                            newBlockLight.set(x, y, z, (int)oldBlockLight.get(x, y, z));
                            newSkyLight.set(x, y, z, (int)oldSkyLight.get(x, y, z));
                        }
                    }
                }
                section.getLight().setBlockLight(newBlockLight.getHandle());
                section.getLight().setSkyLight(newSkyLight.getHandle());
            }
            if (chunk.getSections().length < 16) {
                ChunkSection[] newArray = new ChunkSection[16];
                System.arraycopy(chunk.getSections(), 0, newArray, 0, chunk.getSections().length);
                chunk.setSections(newArray);
            }
            int baseX = chunk.getX() << 4;
            int baseZ = chunk.getZ() << 4;
            int[] biomeData = new int[256];
            for (int z = 0; z < 16; ++z) {
                for (int x = 0; x < 16; ++x) {
                    biomeData[z << 4 | x] = seedStorage.biomeSource.getBiome(baseX + x, 0, baseZ + z).getId();
                }
            }
            chunk.setBiomeData(biomeData);
            wrapper.write(Types1_2_4.CHUNK, (Object)chunk);
        });
        this.registerClientbound(ClientboundPackets1_1.CHUNK_BLOCKS_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map(Types1_1.BLOCK_CHANGE_RECORD_ARRAY, Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY);
                this.handler(wrapper -> {
                    BlockChangeRecord[] blockChangeRecords;
                    PendingBlocksTracker pendingBlocksTracker = (PendingBlocksTracker)wrapper.user().get(PendingBlocksTracker.class);
                    int chunkX = (Integer)wrapper.get((Type)Types.INT, 0);
                    int chunkZ = (Integer)wrapper.get((Type)Types.INT, 1);
                    for (BlockChangeRecord record : blockChangeRecords = (BlockChangeRecord[])wrapper.get(Types1_7_6.BLOCK_CHANGE_RECORD_ARRAY, 0)) {
                        int targetX = record.getSectionX() + (chunkX << 4);
                        short targetY = record.getY(-1);
                        int targetZ = record.getSectionZ() + (chunkZ << 4);
                        pendingBlocksTracker.markReceived(new BlockPosition(targetX, (int)targetY, targetZ));
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_1.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.handler(wrapper -> ((PendingBlocksTracker)wrapper.user().get(PendingBlocksTracker.class)).markReceived((BlockPosition)wrapper.get(Types1_7_6.BLOCK_POSITION_UBYTE, 0)));
            }
        });
        this.registerClientbound(ClientboundPackets1_1.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    PendingBlocksTracker pendingBlocksTracker = (PendingBlocksTracker)wrapper.user().get(PendingBlocksTracker.class);
                    ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                    int x = ((Double)wrapper.get((Type)Types.DOUBLE, 0)).intValue();
                    int y = ((Double)wrapper.get((Type)Types.DOUBLE, 1)).intValue();
                    int z = ((Double)wrapper.get((Type)Types.DOUBLE, 2)).intValue();
                    int recordCount = (Integer)wrapper.get((Type)Types.INT, 0);
                    for (int i = 0; i < recordCount; ++i) {
                        BlockPosition pos = new BlockPosition(x + (Byte)wrapper.passthrough((Type)Types.BYTE), y + (Byte)wrapper.passthrough((Type)Types.BYTE), z + (Byte)wrapper.passthrough((Type)Types.BYTE));
                        IdAndData block = chunkTracker.getBlockNotNull(pos);
                        if (block.getId() == 0) continue;
                        pendingBlocksTracker.addPending(pos, block);
                    }
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_1.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_7_6.BLOCK_POSITION_UBYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int sfxId = (Integer)wrapper.get((Type)Types.INT, 0);
                    int sfxData = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (sfxId == 2001) {
                        int blockID = sfxData & 0xFF;
                        int blockData = sfxData >> 8 & 0xFF;
                        wrapper.set((Type)Types.INT, 1, (Object)(blockID + (blockData << 12)));
                    } else if (sfxId == 1009) {
                        wrapper.set((Type)Types.INT, 0, (Object)1008);
                    }
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_2_1.HANDSHAKE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types1_6_4.STRING, Types1_6_4.STRING, s -> s.split(";")[0]);
            }
        });
        this.registerServerbound(ServerboundPackets1_2_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types1_6_4.STRING);
                this.create((Type)Types.LONG, 0L);
                this.map(Types1_6_4.STRING);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
            }
        });
        this.registerServerbound(ServerboundPackets1_2_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT, (Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.create((Type)Types.LONG, 0L);
                this.map(Types1_6_4.STRING);
            }
        });
    }

    public ItemRewriter getItemRewriter() {
        return this.itemRewriter;
    }

    private void sendEntityHeadLook(int entityId, byte headYaw, PacketWrapper wrapper) {
        PacketWrapper entityHeadLook = PacketWrapper.create((PacketType)ClientboundPackets1_2_1.ROTATE_HEAD, (UserConnection)wrapper.user());
        entityHeadLook.write((Type)Types.INT, (Object)entityId);
        entityHeadLook.write((Type)Types.BYTE, (Object)headYaw);
        wrapper.send(Protocolr1_1Tor1_2_1_3.class);
        entityHeadLook.send(Protocolr1_1Tor1_2_1_3.class);
        wrapper.cancel();
    }

    private void handleRespawn(int dimensionId, UserConnection user) {
        if (user.getClientWorld(Protocolr1_1Tor1_2_1_3.class).setEnvironment(dimensionId)) {
            ((PendingBlocksTracker)user.get(PendingBlocksTracker.class)).clear();
        }
        SeedStorage seedStorage = (SeedStorage)user.get(SeedStorage.class);
        if (ViaLegacy.getConfig().isOldBiomes()) {
            if (dimensionId == 0) {
                if (user.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(LegacyProtocolVersion.b1_8tob1_8_1)) {
                    MCVersion generatorVersion = user.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_1) ? MCVersion.v1_1 : (user.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(LegacyProtocolVersion.r1_0_0tor1_0_1) ? MCVersion.v1_0 : MCVersion.vb1_8_1);
                    seedStorage.biomeSource = BiomeSource.of((Dimension)Dimension.OVERWORLD, (MCVersion)generatorVersion, (long)seedStorage.seed);
                } else {
                    seedStorage.biomeSource = user.getProtocolInfo().serverProtocolVersion().newerThanOrEqualTo(LegacyProtocolVersion.a1_0_15) ? new BetaOverworldBiomeSource(seedStorage.seed) : new PlainsBiomeSource();
                }
            } else {
                seedStorage.biomeSource = dimensionId == -1 ? BiomeSource.of((Dimension)Dimension.NETHER, (MCVersion)MCVersion.v1_1, (long)seedStorage.seed) : (dimensionId == 1 ? BiomeSource.of((Dimension)Dimension.END, (MCVersion)MCVersion.v1_1, (long)seedStorage.seed) : new PlainsBiomeSource());
            }
        } else {
            seedStorage.biomeSource = new PlainsBiomeSource();
        }
    }
}


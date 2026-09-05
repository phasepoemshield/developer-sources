/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IChunkTracker
 *  com.viaversion.viaversion.api.connection.StoredObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk1_21_5
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPaletteImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.Heightmap
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1
 *  com.viaversion.viaversion.libs.fastutil.ints.IntObjectImmutablePair
 *  com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectMap
 *  com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.longs.LongIterator
 *  com.viaversion.viaversion.libs.fastutil.longs.LongOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.longs.LongSet
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.util.CompactArrayUtil
 *  com.viaversion.viaversion.util.MathUtil
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.chunk.BedrockBlockEntity
 *  net.raphimc.viabedrock.api.chunk.BedrockChunk
 *  net.raphimc.viabedrock.api.chunk.BlockEntityWithBlockState
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockBlockArray
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl
 *  net.raphimc.viabedrock.api.model.BedrockBlockState
 *  net.raphimc.viabedrock.protocol.BedrockProtocol
 *  net.raphimc.viabedrock.protocol.ServerboundBedrockPackets
 *  net.raphimc.viabedrock.protocol.data.enums.Dimension
 *  net.raphimc.viabedrock.protocol.data.enums.java.generated.HeightmapType
 *  net.raphimc.viabedrock.protocol.model.Position3f
 *  net.raphimc.viabedrock.protocol.rewriter.BlockEntityRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker$BiomeAggregator
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker$SubChunkPosition
 *  net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 */
package net.raphimc.viabedrock.protocol.storage;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IChunkTracker;
import com.viaversion.viaversion.api.connection.StoredObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_21_5;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.DataPaletteImpl;
import com.viaversion.viaversion.api.minecraft.chunks.Heightmap;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType26_1;
import com.viaversion.viaversion.libs.fastutil.ints.IntObjectImmutablePair;
import com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectMap;
import com.viaversion.viaversion.libs.fastutil.longs.Long2ObjectOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.longs.LongIterator;
import com.viaversion.viaversion.libs.fastutil.longs.LongOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.longs.LongSet;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.util.CompactArrayUtil;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.logging.Level;
import java.util.stream.Collectors;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.chunk.BedrockBlockEntity;
import net.raphimc.viabedrock.api.chunk.BedrockChunk;
import net.raphimc.viabedrock.api.chunk.BlockEntityWithBlockState;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockBlockArray;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl;
import net.raphimc.viabedrock.api.model.BedrockBlockState;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.Dimension;
import net.raphimc.viabedrock.protocol.data.enums.java.generated.HeightmapType;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.rewriter.BlockEntityRewriter;
import net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ChunkTracker
extends StoredObject
implements IChunkTracker {
    private static final byte[] FULL_LIGHT = new byte[2048];
    private final Dimension dimension;
    private final int minY;
    private final int worldHeight;
    private final Type<Chunk> chunkType;
    private final Long2ObjectMap<BedrockChunk> chunks = new Long2ObjectOpenHashMap();
    private final LongSet dirtyChunks = new LongOpenHashSet();
    private final Set<SubChunkPosition> subChunkRequests = new HashSet<SubChunkPosition>();
    private final Set<SubChunkPosition> pendingSubChunks = new HashSet<SubChunkPosition>();
    private int centerX = 0;
    private int centerZ = 0;
    private int radius;

    public void setCenter(int n, int n2) {
        this.centerX = n;
        this.centerZ = n2;
        this.removeOutOfLoadDistanceChunks();
    }

    public void tick() {
        LongIterator longIterator = this.dirtyChunks.iterator();
        while (longIterator.hasNext()) {
            long l = (Long)longIterator.next();
            ChunkPosition chunkPosition = new ChunkPosition(l);
            this.sendChunk(chunkPosition.chunkX(), chunkPosition.chunkZ());
        }
        this.dirtyChunks.clear();
        if (this.user().get(EntityTracker.class) == null || !((EntityTracker)this.user().get(EntityTracker.class)).getClientPlayer().isInitiallySpawned()) {
            return;
        }
        this.subChunkRequests.removeIf(subChunkPosition -> !this.isInLoadDistance(subChunkPosition.chunkX, subChunkPosition.chunkZ));
        longIterator = new BlockPosition(this.centerX, 0, this.centerZ);
        while (!this.subChunkRequests.isEmpty()) {
            Set set = this.subChunkRequests.stream().limit(256L).collect(Collectors.toSet());
            this.subChunkRequests.removeAll(set);
            this.pendingSubChunks.addAll(set);
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ServerboundBedrockPackets.SUB_CHUNK_REQUEST, (UserConnection)this.user());
            packetWrapper.write((Type)BedrockTypes.VAR_INT, (Object)this.dimension.ordinal());
            packetWrapper.write(BedrockTypes.BLOCK_POSITION, (Object)longIterator);
            packetWrapper.write((Type)BedrockTypes.INT_LE, (Object)set.size());
            for (SubChunkPosition subChunkPosition2 : set) {
                BlockPosition blockPosition = new BlockPosition(subChunkPosition2.chunkX - longIterator.x(), subChunkPosition2.subChunkY, subChunkPosition2.chunkZ - longIterator.z());
                packetWrapper.write(BedrockTypes.SUB_CHUNK_OFFSET, (Object)blockPosition);
            }
            packetWrapper.sendToServer(BedrockProtocol.class);
        }
    }

    public ChunkTracker(UserConnection userConnection, Dimension dimension) {
        super(userConnection);
        this.dimension = dimension;
        GameSessionStorage gameSessionStorage = (GameSessionStorage)userConnection.get(GameSessionStorage.class);
        CompoundTag compoundTag = gameSessionStorage.getJavaRegistries();
        String string = this.dimension.getKey();
        CompoundTag compoundTag2 = compoundTag.getCompoundTag("minecraft:dimension_type");
        CompoundTag compoundTag3 = compoundTag.getCompoundTag("minecraft:worldgen/biome");
        CompoundTag compoundTag4 = compoundTag2.getCompoundTag(string);
        this.minY = compoundTag4.getNumberTag("min_y").asInt();
        this.worldHeight = compoundTag4.getNumberTag("height").asInt();
        this.chunkType = new ChunkType26_1(this.worldHeight >> 4, MathUtil.ceilLog2((int)BedrockProtocol.MAPPINGS.getJavaBlockStates().size()), MathUtil.ceilLog2((int)compoundTag3.size()));
        ChunkTracker chunkTracker = (ChunkTracker)userConnection.get(ChunkTracker.class);
        this.radius = chunkTracker != null ? chunkTracker.radius : ((ClientSettingsStorage)userConnection.get(ClientSettingsStorage.class)).viewDistance();
    }

    static {
        Arrays.fill(FULL_LIGHT, (byte)-1);
    }

    public boolean isEmpty() {
        boolean bl = true;
        bl &= this.chunks.isEmpty();
        return bl &= this.subChunkRequests.isEmpty() && this.pendingSubChunks.isEmpty();
    }

    public BedrockChunk getChunk(int n, int n2) {
        if (!this.isInLoadDistance(n, n2)) {
            return null;
        }
        return (BedrockChunk)this.chunks.get(ChunkPosition.chunkKey((int)n, (int)n2));
    }

    public void setRadius(int n) {
        this.radius = n;
        this.removeOutOfLoadDistanceChunks();
    }

    public BedrockChunk createChunk(int n, int n2, int n3) {
        int n4;
        BedrockChunk bedrockChunk;
        if (!this.isInLoadDistance(n, n2)) {
            return null;
        }
        if (!this.isInRenderDistance(n, n2)) {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received chunk outside of render distance, but within load distance: " + n + ", " + n2);
            bedrockChunk = (EntityTracker)this.user().get(EntityTracker.class);
            PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets26_1.SET_CHUNK_CACHE_CENTER, (UserConnection)this.user());
            packetWrapper.write((Type)Types.VAR_INT, (Object)((int)Math.floor(bedrockChunk.getClientPlayer().position().x()) >> 4));
            packetWrapper.write((Type)Types.VAR_INT, (Object)((int)Math.floor(bedrockChunk.getClientPlayer().position().z()) >> 4));
            packetWrapper.send(BedrockProtocol.class);
        }
        bedrockChunk = new BedrockChunk(n, n2, new BedrockChunkSection[this.worldHeight >> 4]);
        for (n4 = 0; n4 < n3 && n4 < bedrockChunk.getSections().length; ++n4) {
            bedrockChunk.getSections()[n4] = new BedrockChunkSectionImpl();
        }
        for (n4 = 0; n4 < bedrockChunk.getSections().length; ++n4) {
            if (bedrockChunk.getSections()[n4] != null) continue;
            bedrockChunk.getSections()[n4] = new BedrockChunkSectionImpl(true);
        }
        this.chunks.put(ChunkPosition.chunkKey((int)bedrockChunk.getX(), (int)bedrockChunk.getZ()), (Object)bedrockChunk);
        return bedrockChunk;
    }

    public void sendChunkInNextTick(int n, int n2) {
        this.dirtyChunks.add(ChunkPosition.chunkKey((int)n, (int)n2));
    }

    public void sendChunk(int n, int n2) {
        BedrockChunk bedrockChunk = this.getChunk(n, n2);
        if (bedrockChunk == null) {
            return;
        }
        Chunk chunk = this.remapChunk(bedrockChunk);
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets26_1.LEVEL_CHUNK_WITH_LIGHT, (UserConnection)this.user());
        BitSet bitSet = new BitSet();
        bitSet.set(0, chunk.getSections().length + 2);
        packetWrapper.write(this.chunkType, (Object)chunk);
        packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)bitSet.toLongArray());
        packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[0]);
        packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[0]);
        packetWrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)bitSet.toLongArray());
        packetWrapper.write((Type)Types.VAR_INT, (Object)(chunk.getSections().length + 2));
        for (int i = 0; i < chunk.getSections().length + 2; ++i) {
            packetWrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)((byte[])FULL_LIGHT.clone()));
        }
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.send(BedrockProtocol.class);
    }

    public void removeOutOfLoadDistanceChunks() {
        HashSet<ChunkPosition> hashSet = new HashSet<ChunkPosition>();
        LongIterator longIterator = this.chunks.keySet().iterator();
        while (longIterator.hasNext()) {
            long l = (Long)longIterator.next();
            ChunkPosition chunkPosition = new ChunkPosition(l);
            if (this.isInLoadDistance(chunkPosition.chunkX(), chunkPosition.chunkZ())) continue;
            hashSet.add(chunkPosition);
        }
        for (ChunkPosition chunkPosition : hashSet) {
            this.unloadChunk(chunkPosition);
        }
    }

    public int viaFabricPlus$getChunks() {
        return this.chunks.size();
    }

    public boolean isChunkLoaded(ChunkPosition chunkPosition) {
        if (!this.isInLoadDistance(chunkPosition.chunkX(), chunkPosition.chunkZ())) {
            return false;
        }
        return this.chunks.containsKey(chunkPosition.chunkKey());
    }

    private Chunk remapChunk(BedrockChunk bedrockChunk) {
        int n2;
        int n3;
        int n4;
        Object object;
        Object object2;
        BlockStateRewriter blockStateRewriter = (BlockStateRewriter)this.user().get(BlockStateRewriter.class);
        int n5 = this.bedrockAirId();
        Chunk1_21_5 chunk1_21_5 = new Chunk1_21_5(bedrockChunk.getX(), bedrockChunk.getZ(), new ChunkSection[bedrockChunk.getSections().length], new Heightmap[2], new ArrayList());
        BedrockChunkSection[] bedrockChunkSectionArray = bedrockChunk.getSections();
        ChunkSection[] chunkSectionArray = chunk1_21_5.getSections();
        for (int i = 0; i < bedrockChunkSectionArray.length; ++i) {
            int n6;
            int n7;
            String[] stringArray;
            DataPalette dataPalette;
            object2 = bedrockChunkSectionArray[i];
            object = object2.palettes(PaletteType.BLOCKS);
            chunkSectionArray[i] = new ChunkSectionImpl(false);
            ChunkSectionImpl chunkSectionImpl = chunkSectionArray[i];
            DataPalette dataPalette2 = chunkSectionImpl.palette(PaletteType.BLOCKS);
            if (!object.isEmpty()) {
                DataPalette dataPalette3;
                dataPalette = (DataPalette)object.get(0);
                if (dataPalette.size() == 1) {
                    dataPalette2.addId(dataPalette.idByIndex(0));
                } else {
                    this.transferPaletteData(dataPalette, dataPalette2);
                }
                stringArray = new String[dataPalette2.size()];
                for (n7 = 0; n7 < dataPalette2.size(); ++n7) {
                    stringArray[n7] = blockStateRewriter.tag(dataPalette2.idByIndex(n7));
                }
                dataPalette2.replaceIds(n -> {
                    int n2 = blockStateRewriter.javaId(n);
                    if (n2 != -1) {
                        return n2;
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + n);
                    return 0;
                });
                for (n7 = 0; n7 < 16; ++n7) {
                    for (n4 = 0; n4 < 16; ++n4) {
                        for (n3 = 0; n3 < 16; ++n3) {
                            String string = stringArray[dataPalette2.paletteIndexAt(dataPalette2.index(n3, n7, n4))];
                            if (string == null) continue;
                            if (BlockEntityRewriter.isBlockEntity((String)string)) {
                                BlockEntityWithBlockState blockEntityWithBlockState;
                                n6 = this.minY + (i << 4) + n7;
                                BlockPosition blockPosition = new BlockPosition((bedrockChunk.getX() << 4) + n3, n6, (bedrockChunk.getZ() << 4) + n4);
                                BedrockBlockEntity bedrockBlockEntity = bedrockChunk.getBlockEntityAt(blockPosition);
                                if (bedrockBlockEntity != null) {
                                    BlockEntity blockEntity = BlockEntityRewriter.toJava((UserConnection)this.user(), (int)dataPalette.idAt(n3, n7, n4), (BedrockBlockEntity)bedrockBlockEntity);
                                    if (blockEntity instanceof BlockEntityWithBlockState) {
                                        blockEntityWithBlockState = (BlockEntityWithBlockState)blockEntity;
                                        dataPalette2.setIdAt(n3, n7, n4, blockEntityWithBlockState.blockState());
                                    }
                                    if (blockEntity == null || blockEntity.tag() == null) continue;
                                    chunk1_21_5.blockEntities().add(blockEntity);
                                    continue;
                                }
                                if (!BedrockProtocol.MAPPINGS.getJavaBlockEntities().containsKey((Object)string)) continue;
                                int n8 = (Integer)BedrockProtocol.MAPPINGS.getJavaBlockEntities().get((Object)string);
                                blockEntityWithBlockState = new BlockEntityImpl(BlockEntity.pack((int)n3, (int)n4), (short)n6, n8, new CompoundTag());
                                chunk1_21_5.blockEntities().add(blockEntityWithBlockState);
                                continue;
                            }
                            if (!string.equals("item_frame")) continue;
                            BlockPosition blockPosition = new BlockPosition((bedrockChunk.getX() << 4) + n3, this.minY + (i << 4) + n7, (bedrockChunk.getZ() << 4) + n4);
                            ((EntityTracker)this.user().get(EntityTracker.class)).spawnItemFrame(blockPosition, blockStateRewriter.blockState(dataPalette.idAt(n3, n7, n4)));
                        }
                    }
                }
                if (object.size() > 1 && ((dataPalette3 = (DataPalette)object.get(1)).size() != 1 || dataPalette3.idByIndex(0) != n5)) {
                    for (n4 = 0; n4 < 16; ++n4) {
                        for (n3 = 0; n3 < 16; ++n3) {
                            for (int j = 0; j < 16; ++j) {
                                int n9;
                                n6 = dataPalette3.idAt(n4, j, n3);
                                if (n6 == n5 || (n9 = dataPalette.idAt(n4, j, n3)) == n5) continue;
                                if ("water".equals(blockStateRewriter.tag(n6))) {
                                    int n10 = blockStateRewriter.waterlog(dataPalette2.idAt(n4, j, n3));
                                    if (n10 != -1) {
                                        dataPalette2.setIdAt(n4, j, n3, n10);
                                        continue;
                                    }
                                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing waterlogged block state: " + n9);
                                    continue;
                                }
                                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Invalid layer 2 block state. L1: " + n9 + ", L2: " + n6);
                            }
                        }
                    }
                }
                n7 = 0;
                n4 = 0;
                for (n3 = 0; n3 < 4096; ++n3) {
                    int n11 = dataPalette2.idAt(n3);
                    if (n11 != 0) {
                        ++n7;
                    }
                    if (!BedrockProtocol.MAPPINGS.getJavaFluidBlockStates().contains(n11)) continue;
                    ++n4;
                }
                chunkSectionImpl.setNonAirBlocksCount(n7);
                chunkSectionImpl.setFluidCount(n4);
            } else {
                dataPalette2.addId(0);
            }
            dataPalette = object2.palette(PaletteType.BIOMES);
            stringArray = new DataPaletteImpl(64);
            chunkSectionImpl.addPalette(PaletteType.BIOMES, (DataPalette)stringArray);
            if (dataPalette != null) {
                if (dataPalette.size() == 1) {
                    stringArray.addId(dataPalette.idByIndex(0));
                } else {
                    for (n7 = 0; n7 < 4; ++n7) {
                        for (n4 = 0; n4 < 4; ++n4) {
                            for (n3 = 0; n3 < 4; ++n3) {
                                BiomeAggregator biomeAggregator = new BiomeAggregator(4);
                                for (n6 = 0; n6 < 4; ++n6) {
                                    for (int j = 0; j < 4; ++j) {
                                        for (int k = 0; k < 4; ++k) {
                                            biomeAggregator.record(dataPalette.idAt((n7 << 2) + n6, (n3 << 2) + k, (n4 << 2) + j));
                                        }
                                    }
                                }
                                stringArray.setIdAt(n7, n3, n4, biomeAggregator.getMaxBiome());
                            }
                        }
                    }
                }
                stringArray.replaceIds(n -> {
                    String string = (String)BedrockProtocol.MAPPINGS.getBedrockBiomes().inverse().get((Object)n);
                    if (string != null) {
                        return (Integer)BedrockProtocol.MAPPINGS.getJavaBiomes().get((Object)string);
                    }
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing biome: " + n);
                    return (Integer)BedrockProtocol.MAPPINGS.getJavaBiomes().get((Object)"the_void");
                });
                continue;
            }
            stringArray.addId(((Integer)BedrockProtocol.MAPPINGS.getJavaBiomes().get((Object)"the_void")).intValue());
        }
        IntSet intSet = (IntSet)BedrockProtocol.MAPPINGS.getJavaHeightMapBlockStates().get("motion_blocking");
        object2 = new int[256];
        object = new int[256];
        Arrays.fill((int[])object2, Integer.MIN_VALUE);
        Arrays.fill((int[])object, Integer.MIN_VALUE);
        for (n2 = 0; n2 < 16; ++n2) {
            for (int i = 0; i < 16; ++i) {
                int n12 = (i << 4) + n2;
                block17: for (int j = chunkSectionArray.length - 1; j >= 0; --j) {
                    DataPalette dataPalette = chunkSectionArray[j].palette(PaletteType.BLOCKS);
                    if (dataPalette.size() == 1 && dataPalette.idByIndex(0) == 0) continue;
                    for (n4 = 15; n4 >= 0; --n4) {
                        n3 = dataPalette.idAt(n2, n4, i);
                        if (n3 == 0) continue;
                        int n13 = (j << 4) + n4 + 1;
                        if (object2[n12] == Integer.MIN_VALUE) {
                            object2[n12] = (BedrockChunkSection)n13;
                        }
                        if (object[n12] != Integer.MIN_VALUE || !intSet.contains(n3)) continue;
                        object[n12] = n13;
                        break block17;
                    }
                }
                if (object2[n12] == Integer.MIN_VALUE) {
                    object2[n12] = (BedrockChunkSection)this.minY;
                }
                if (object[n12] != Integer.MIN_VALUE) continue;
                object[n12] = this.minY;
            }
        }
        n2 = MathUtil.ceilLog2((int)(this.worldHeight + 1));
        chunk1_21_5.heightmaps()[0] = new Heightmap(HeightmapType.WORLD_SURFACE.ordinal(), CompactArrayUtil.createCompactArrayWithPadding((int)n2, (int)((BedrockChunkSection)object2).length, arg_0 -> ChunkTracker.lambda$remapChunk$4((int[])object2, arg_0)));
        chunk1_21_5.heightmaps()[1] = new Heightmap(HeightmapType.MOTION_BLOCKING.ordinal(), CompactArrayUtil.createCompactArrayWithPadding((int)n2, (int)((Object)object).length, arg_0 -> ChunkTracker.lambda$remapChunk$5((int[])object, arg_0)));
        return chunk1_21_5;
    }

    private static /* synthetic */ int lambda$remapChunk$4(int[] nArray, int n) {
        return nArray[n];
    }

    private void transferPaletteData(DataPalette dataPalette, DataPalette dataPalette2) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    dataPalette2.setIdAt(i, j, k, dataPalette.idAt(i, j, k));
                }
            }
        }
    }

    private static /* synthetic */ int lambda$remapChunk$5(int[] nArray, int n) {
        return nArray[n];
    }

    private void replaceLegacyBlocks(BedrockChunkSection bedrockChunkSection) {
        BlockStateRewriter blockStateRewriter = (BlockStateRewriter)this.user().get(BlockStateRewriter.class);
        List list = bedrockChunkSection.palettes(PaletteType.BLOCKS);
        for (DataPalette dataPalette : list) {
            if (!(dataPalette instanceof BedrockBlockArray)) continue;
            BedrockDataPalette bedrockDataPalette = new BedrockDataPalette();
            this.transferPaletteData(dataPalette, (DataPalette)bedrockDataPalette);
            bedrockDataPalette.replaceIds(n -> {
                int n2 = blockStateRewriter.bedrockId(n);
                if (n2 != -1) {
                    return n2;
                }
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing legacy block state: " + n);
                return this.bedrockAirId();
            });
            list.set(list.indexOf(dataPalette), bedrockDataPalette);
        }
    }

    public boolean isInUnloadedChunkSection(Position3f position3f) {
        BlockPosition blockPosition = new BlockPosition((int)Math.floor(position3f.x()) >> 4, (int)Math.floor(position3f.y() - 1.62f) >> 4, (int)Math.floor(position3f.z()) >> 4);
        ChunkPosition chunkPosition = new ChunkPosition(blockPosition.x(), blockPosition.z());
        if (!this.isChunkLoaded(chunkPosition)) {
            return true;
        }
        BedrockChunkSection bedrockChunkSection = this.getChunkSection(blockPosition.x(), blockPosition.y(), blockPosition.z());
        if (bedrockChunkSection == null) {
            return false;
        }
        if (bedrockChunkSection.hasPendingBlockUpdates()) {
            return true;
        }
        return this.dirtyChunks.contains(chunkPosition.chunkKey());
    }

    public int viaFabricPlus$getSubChunkRequests() {
        return this.subChunkRequests.size();
    }

    public int viaFabricPlus$getPendingSubChunks() {
        return this.pendingSubChunks.size();
    }

    public int getMaxY() {
        return this.worldHeight - Math.abs(this.minY);
    }

    public int getBlockState(int n, BlockPosition blockPosition) {
        BedrockChunkSection bedrockChunkSection = this.getChunkSection(blockPosition);
        if (bedrockChunkSection == null) {
            return this.bedrockAirId();
        }
        if (bedrockChunkSection.palettesCount(PaletteType.BLOCKS) <= n) {
            return this.bedrockAirId();
        }
        return ((DataPalette)bedrockChunkSection.palettes(PaletteType.BLOCKS).get(n)).idAt(blockPosition.x() & 0xF, blockPosition.y() & 0xF, blockPosition.z() & 0xF);
    }

    public int getBlockState(BlockPosition blockPosition) {
        return this.getBlockState(0, blockPosition);
    }

    public void unloadChunk(ChunkPosition chunkPosition) {
        this.chunks.remove(chunkPosition.chunkKey());
        ((EntityTracker)this.user().get(EntityTracker.class)).removeItemFrame(chunkPosition);
        PacketWrapper packetWrapper = PacketWrapper.create((PacketType)ClientboundPackets26_1.FORGET_LEVEL_CHUNK, (UserConnection)this.user());
        packetWrapper.write(Types.CHUNK_POSITION, (Object)chunkPosition);
        packetWrapper.send(BedrockProtocol.class);
    }

    private void resolvePersistentIds(BedrockChunkSection bedrockChunkSection) {
        BlockStateRewriter blockStateRewriter = (BlockStateRewriter)this.user().get(BlockStateRewriter.class);
        List list = bedrockChunkSection.palettes(PaletteType.BLOCKS);
        for (DataPalette dataPalette : list) {
            BedrockDataPalette bedrockDataPalette;
            if (!(dataPalette instanceof BedrockDataPalette) || !(bedrockDataPalette = (BedrockDataPalette)dataPalette).usesPersistentIds()) continue;
            bedrockDataPalette.resolvePersistentIds(object -> {
                int n = blockStateRewriter.bedrockId((CompoundTag)object);
                if (n != -1) {
                    return n;
                }
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + String.valueOf(object));
                return blockStateRewriter.bedrockId(BedrockBlockState.INFO_UPDATE);
            });
        }
    }

    public boolean isInRenderDistance(int n, int n2) {
        return Math.abs(n - this.centerX) <= this.radius && Math.abs(n2 - this.centerZ) <= this.radius;
    }

    public boolean isInLoadDistance(int n, int n2) {
        if (!this.isInRenderDistance(n, n2)) {
            EntityTracker entityTracker = (EntityTracker)this.user().get(EntityTracker.class);
            if (entityTracker == null) {
                return false;
            }
            int n3 = (int)Math.floor(entityTracker.getClientPlayer().position().x()) >> 4;
            int n4 = (int)Math.floor(entityTracker.getClientPlayer().position().z()) >> 4;
            return Math.abs(n - n3) <= this.radius && Math.abs(n2 - n4) <= this.radius;
        }
        return true;
    }

    public int getWorldHeight() {
        return this.worldHeight;
    }

    public BedrockChunkSection getChunkSection(BlockPosition blockPosition) {
        return this.getChunkSection(blockPosition.x() >> 4, blockPosition.y() >> 4, blockPosition.z() >> 4);
    }

    public BedrockChunkSection getChunkSection(int n, int n2, int n3) {
        BedrockChunk bedrockChunk = this.getChunk(n, n3);
        if (bedrockChunk == null) {
            return null;
        }
        int n4 = n2 + Math.abs(this.minY >> 4);
        if (n4 < 0 || n4 >= bedrockChunk.getSections().length) {
            return null;
        }
        return bedrockChunk.getSections()[n4];
    }

    public int getMinY() {
        return this.minY;
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public IntObjectPair<BlockEntity> handleBlockChange(BlockPosition blockPosition, int n, int n2) {
        BedrockDataPalette bedrockDataPalette;
        BedrockChunkSection bedrockChunkSection = this.getChunkSection(blockPosition);
        if (bedrockChunkSection == null) {
            return null;
        }
        BlockStateRewriter blockStateRewriter = (BlockStateRewriter)this.user().get(BlockStateRewriter.class);
        EntityTracker entityTracker = (EntityTracker)this.user().get(EntityTracker.class);
        int n3 = blockPosition.x() & 0xF;
        int n4 = blockPosition.y() & 0xF;
        int n5 = blockPosition.z() & 0xF;
        if (bedrockChunkSection.hasPendingBlockUpdates()) {
            bedrockChunkSection.addPendingBlockUpdate(n3, n4, n5, n, n2);
            return null;
        }
        while (bedrockChunkSection.palettesCount(PaletteType.BLOCKS) <= n) {
            bedrockDataPalette = new BedrockDataPalette();
            bedrockDataPalette.addId(this.bedrockAirId());
            bedrockChunkSection.addPalette(PaletteType.BLOCKS, (DataPalette)bedrockDataPalette);
        }
        bedrockDataPalette = (DataPalette)bedrockChunkSection.palettes(PaletteType.BLOCKS).get(n);
        int n6 = bedrockDataPalette.idAt(n3, n4, n5);
        String string = blockStateRewriter.tag(n6);
        bedrockDataPalette.setIdAt(n3, n4, n5, n2);
        String string2 = blockStateRewriter.tag(n2);
        int n7 = this.getJavaBlockState(bedrockChunkSection, n3, n4, n5);
        if (!Objects.equals(string, string2)) {
            this.getChunk(blockPosition.x() >> 4, blockPosition.z() >> 4).removeBlockEntityAt(blockPosition);
            entityTracker.removeItemFrame(blockPosition);
        }
        if (n6 != n2) {
            if (BlockEntityRewriter.isBlockEntity((String)string2)) {
                BedrockBlockEntity bedrockBlockEntity = this.getBlockEntity(blockPosition);
                BlockEntity blockEntity = null;
                if (bedrockBlockEntity != null) {
                    blockEntity = BlockEntityRewriter.toJava((UserConnection)this.user(), (int)n2, (BedrockBlockEntity)bedrockBlockEntity);
                    if (blockEntity instanceof BlockEntityWithBlockState) {
                        BlockEntityWithBlockState blockEntityWithBlockState = (BlockEntityWithBlockState)blockEntity;
                        n7 = blockEntityWithBlockState.blockState();
                    }
                } else if (BedrockProtocol.MAPPINGS.getJavaBlockEntities().containsKey((Object)string2)) {
                    int n8 = (Integer)BedrockProtocol.MAPPINGS.getJavaBlockEntities().get((Object)string2);
                    blockEntity = new BlockEntityImpl(BlockEntity.pack((int)n3, (int)n5), (short)blockPosition.y(), n8, new CompoundTag());
                }
                if (blockEntity != null && blockEntity.tag() != null) {
                    return new IntObjectImmutablePair(n7, (Object)blockEntity);
                }
            } else if ("item_frame".equals(string2)) {
                entityTracker.spawnItemFrame(blockPosition, blockStateRewriter.blockState(n2));
            }
        }
        return new IntObjectImmutablePair(n7, null);
    }

    public int getJavaBlockState(BlockPosition blockPosition) {
        BedrockChunkSection bedrockChunkSection = this.getChunkSection(blockPosition);
        if (bedrockChunkSection == null) {
            return 0;
        }
        int n = blockPosition.x() & 0xF;
        int n2 = blockPosition.y() & 0xF;
        int n3 = blockPosition.z() & 0xF;
        return this.getJavaBlockState(bedrockChunkSection, n, n2, n3);
    }

    public int getJavaBlockState(BedrockChunkSection bedrockChunkSection, int n, int n2, int n3) {
        int n4;
        List list;
        int n5;
        BlockStateRewriter blockStateRewriter = (BlockStateRewriter)this.user().get(BlockStateRewriter.class);
        int n6 = blockStateRewriter.javaId(n5 = ((DataPalette)(list = bedrockChunkSection.palettes(PaletteType.BLOCKS)).get(0)).idAt(n, n2, n3));
        if (n6 == -1) {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing block state: " + n5);
            n6 = 0;
        }
        if (n5 != this.bedrockAirId() && list.size() > 1 && (n4 = ((DataPalette)list.get(1)).idAt(n, n2, n3)) != this.bedrockAirId()) {
            if ("water".equals(blockStateRewriter.tag(n4))) {
                int n7 = blockStateRewriter.waterlog(n6);
                if (n7 != -1) {
                    n6 = n7;
                } else {
                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Missing waterlogged block state: " + n5);
                }
            } else {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Invalid layer 2 block state. L1: " + n5 + ", L2: " + n4);
            }
        }
        return n6;
    }

    public int bedrockAirId() {
        return ((BlockStateRewriter)this.user().get(BlockStateRewriter.class)).bedrockId(BedrockBlockState.AIR);
    }

    public BedrockChunkSection handleBlockPalette(BedrockChunkSection bedrockChunkSection) {
        this.replaceLegacyBlocks(bedrockChunkSection);
        this.resolvePersistentIds(bedrockChunkSection);
        return bedrockChunkSection;
    }

    public void requestSubChunk(int n, int n2, int n3) {
        if (!this.isInLoadDistance(n, n3)) {
            return;
        }
        this.subChunkRequests.add(new SubChunkPosition(n, n2, n3));
    }

    public void addBlockEntity(BedrockBlockEntity bedrockBlockEntity) {
        BedrockChunk bedrockChunk = this.getChunk(bedrockBlockEntity.position().x() >> 4, bedrockBlockEntity.position().z() >> 4);
        if (bedrockChunk == null) {
            return;
        }
        bedrockChunk.removeBlockEntityAt(bedrockBlockEntity.position());
        bedrockChunk.blockEntities().add(bedrockBlockEntity);
    }

    public BedrockBlockEntity getBlockEntity(BlockPosition blockPosition) {
        BedrockChunk bedrockChunk = this.getChunk(blockPosition.x() >> 4, blockPosition.z() >> 4);
        if (bedrockChunk == null) {
            return null;
        }
        return bedrockChunk.getBlockEntityAt(blockPosition);
    }

    public boolean mergeSubChunk(int n, int n2, int n3, BedrockChunkSection bedrockChunkSection, List<BedrockBlockEntity> list) {
        if (!this.isInLoadDistance(n, n3)) {
            return false;
        }
        SubChunkPosition subChunkPosition = new SubChunkPosition(n, n2, n3);
        if (!this.pendingSubChunks.contains(subChunkPosition)) {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received sub chunk that was not requested: " + String.valueOf(subChunkPosition));
            return false;
        }
        this.pendingSubChunks.remove(subChunkPosition);
        BedrockChunk bedrockChunk = this.getChunk(n, n3);
        if (bedrockChunk == null) {
            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received sub chunk for unloaded chunk: " + String.valueOf(subChunkPosition));
            return false;
        }
        BedrockChunkSection bedrockChunkSection2 = bedrockChunk.getSections()[n2 + Math.abs(this.minY >> 4)];
        bedrockChunkSection2.mergeWith(this.handleBlockPalette(bedrockChunkSection));
        bedrockChunkSection2.applyPendingBlockUpdates(this.bedrockAirId());
        list.forEach(bedrockBlockEntity -> bedrockChunk.removeBlockEntityAt(bedrockBlockEntity.position()));
        bedrockChunk.blockEntities().addAll(list);
        return true;
    }

    public void requestSubChunks(int n, int n2, int n3, int n4) {
        for (int i = n3; i < n4; ++i) {
            this.requestSubChunk(n, i, n2);
        }
    }
}


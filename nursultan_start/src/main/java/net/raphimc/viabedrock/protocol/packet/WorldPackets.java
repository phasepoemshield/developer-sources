/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ChunkPosition
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.util.MathUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.chunk.BedrockBlockEntity
 *  net.raphimc.viabedrock.api.chunk.BedrockChunk
 *  net.raphimc.viabedrock.api.chunk.BlockEntityWithBlockState
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockBiomeArray
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl
 *  net.raphimc.viabedrock.api.model.container.Container
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity
 *  net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity$DimensionChangeInfo
 *  net.raphimc.viabedrock.api.model.entity.Entity
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.protocol.data.enums.Dimension
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SpawnPositionType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SubChunkPacket_HeightMapDataType
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SubChunkPacket_SubChunkRequestResult
 *  net.raphimc.viabedrock.protocol.data.enums.java.Relative
 *  net.raphimc.viabedrock.protocol.data.enums.java.RespawnKeepFlag
 *  net.raphimc.viabedrock.protocol.packet.WorldPackets$5
 *  net.raphimc.viabedrock.protocol.rewriter.BlockEntityRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter
 *  net.raphimc.viabedrock.protocol.rewriter.blockentity.SignBlockEntityRewriter
 *  net.raphimc.viabedrock.protocol.storage.BlobCache
 *  net.raphimc.viabedrock.protocol.storage.ChunkTracker
 *  net.raphimc.viabedrock.protocol.storage.EntityTracker
 *  net.raphimc.viabedrock.protocol.storage.GameRulesStorage
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 *  net.raphimc.viabedrock.protocol.types.BedrockTypes
 *  net.raphimc.viabedrock.protocol.types.array.ByteArrayType
 */
package net.raphimc.viabedrock.protocol.packet;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ChunkPosition;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.IntObjectPair;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.util.MathUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.chunk.BedrockBlockEntity;
import net.raphimc.viabedrock.api.chunk.BedrockChunk;
import net.raphimc.viabedrock.api.chunk.BlockEntityWithBlockState;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockBiomeArray;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl;
import net.raphimc.viabedrock.api.model.container.Container;
import net.raphimc.viabedrock.api.model.entity.ClientPlayerEntity;
import net.raphimc.viabedrock.api.model.entity.Entity;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.enums.Dimension;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.ServerboundLoadingScreenPacketType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SpawnPositionType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SubChunkPacket_HeightMapDataType;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.SubChunkPacket_SubChunkRequestResult;
import net.raphimc.viabedrock.protocol.data.enums.java.Relative;
import net.raphimc.viabedrock.protocol.data.enums.java.RespawnKeepFlag;
import net.raphimc.viabedrock.protocol.model.BlockChangeEntry;
import net.raphimc.viabedrock.protocol.model.Position3f;
import net.raphimc.viabedrock.protocol.packet.WorldPackets;
import net.raphimc.viabedrock.protocol.rewriter.BlockEntityRewriter;
import net.raphimc.viabedrock.protocol.rewriter.BlockStateRewriter;
import net.raphimc.viabedrock.protocol.rewriter.blockentity.SignBlockEntityRewriter;
import net.raphimc.viabedrock.protocol.storage.BlobCache;
import net.raphimc.viabedrock.protocol.storage.ChunkTracker;
import net.raphimc.viabedrock.protocol.storage.EntityTracker;
import net.raphimc.viabedrock.protocol.storage.GameRulesStorage;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;
import net.raphimc.viabedrock.protocol.types.array.ByteArrayType;

public class WorldPackets {
    private static final PacketHandler UPDATE_BLOCK_HANDLER = wrapper -> {
        ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
        BlockPosition position = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_14, 0);
        int blockState = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
        wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
        int layer = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
        if (layer < 0 || layer > 1) {
            wrapper.cancel();
            return;
        }
        IntObjectPair remappedBlock = chunkTracker.handleBlockChange(position, layer, blockState);
        if (remappedBlock == null) {
            wrapper.cancel();
            return;
        }
        wrapper.write((Type)Types.VAR_INT, (Object)remappedBlock.keyInt());
        if (remappedBlock.value() != null) {
            wrapper.send(BedrockProtocol.class);
            wrapper.cancel();
            PacketFactory.sendJavaBlockEntityData((UserConnection)wrapper.user(), (BlockPosition)position, (BlockEntity)((BlockEntity)remappedBlock.value()));
        }
    };

    public static void register(BedrockProtocol protocol) {
        protocol.registerClientbound(ClientboundBedrockPackets.SET_SPAWN_POSITION, (ClientboundPacketType)ClientboundPackets26_1.SET_DEFAULT_SPAWN_POSITION, wrapper -> {
            int rawType = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            SpawnPositionType type = SpawnPositionType.getByValue((int)rawType);
            if (type == null) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Unknown SpawnPositionType: " + rawType);
                wrapper.cancel();
                return;
            }
            BlockPosition compassPosition = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            Dimension dimension = Dimension.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)));
            if (dimension == null) {
                wrapper.cancel();
                return;
            }
            wrapper.read(BedrockTypes.BLOCK_POSITION);
            switch (5.$SwitchMap$net$raphimc$viabedrock$protocol$data$enums$bedrock$generated$SpawnPositionType[type.ordinal()]) {
                case 1: {
                    wrapper.write(Types.GLOBAL_POSITION, (Object)new GlobalBlockPosition(dimension.getKey(), compassPosition.x(), compassPosition.y(), compassPosition.z()));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                    wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                    break;
                }
                case 2: {
                    wrapper.cancel();
                    break;
                }
                default: {
                    throw new IllegalStateException("Unhandled SpawnPositionType: " + String.valueOf(type));
                }
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CHANGE_DIMENSION, (ClientboundPacketType)ClientboundPackets26_1.RESPAWN, wrapper -> {
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            InventoryTracker inventoryTracker = (InventoryTracker)wrapper.user().get(InventoryTracker.class);
            Dimension dimension = Dimension.values()[(Integer)wrapper.read((Type)BedrockTypes.VAR_INT)];
            Position3f position = (Position3f)((Object)((Object)wrapper.read(BedrockTypes.POSITION_3F)));
            wrapper.read((Type)Types.BOOLEAN);
            Long loadingScreenId = (Boolean)wrapper.read((Type)Types.BOOLEAN) != false ? (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE) : null;
            if (dimension == ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).getDimension()) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received CHANGE_DIMENSION packet for the same dimension");
            }
            wrapper.user().put((StorableObject)new ChunkTracker(wrapper.user(), dimension));
            EntityTracker oldEntityTracker = (EntityTracker)wrapper.user().get(EntityTracker.class);
            ClientPlayerEntity clientPlayer = oldEntityTracker.getClientPlayer();
            oldEntityTracker.prepareForRespawn();
            EntityTracker newEntityTracker = new EntityTracker(wrapper.user());
            newEntityTracker.addEntity((Entity)clientPlayer);
            wrapper.user().put((StorableObject)newEntityTracker);
            PacketFactory.sendBedrockLoadingScreen((UserConnection)wrapper.user(), (ServerboundLoadingScreenPacketType)ServerboundLoadingScreenPacketType.StartLoadingScreen, (Long)loadingScreenId);
            clientPlayer.setPosition(new Position3f(position.x(), position.y() + clientPlayer.eyeOffset(), position.z()));
            clientPlayer.setDimensionChangeInfo(new ClientPlayerEntity.DimensionChangeInfo(loadingScreenId));
            if (inventoryTracker.isContainerOpen()) {
                inventoryTracker.setCurrentContainerClosed(true);
            }
            if (inventoryTracker.getCurrentForm() != null) {
                inventoryTracker.closeCurrentForm();
            }
            wrapper.write((Type)Types.VAR_INT, (Object)dimension.ordinal());
            wrapper.write(Types.STRING, (Object)dimension.getKey());
            wrapper.write((Type)Types.LONG, (Object)0L);
            wrapper.write((Type)Types.BYTE, (Object)((byte)clientPlayer.javaGameMode().ordinal()));
            wrapper.write((Type)Types.BYTE, (Object)-1);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.write((Type)Types.BOOLEAN, (Object)gameSession.isFlatGenerator());
            wrapper.write(Types.OPTIONAL_GLOBAL_POSITION, null);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.VAR_INT, (Object)64);
            wrapper.write((Type)Types.BYTE, (Object)((byte)(RespawnKeepFlag.ATTRIBUTE_MODIFIERS.getBit() | RespawnKeepFlag.ENTITY_DATA.getBit())));
            wrapper.send(BedrockProtocol.class);
            wrapper.cancel();
            clientPlayer.sendPlayerPositionPacketToClient(Relative.NONE);
            clientPlayer.sendAttribute("minecraft:health");
            clientPlayer.sendEffects();
            clientPlayer.setAbilities(clientPlayer.abilities());
            PacketWrapper initializeBorder = PacketWrapper.create((PacketType)ClientboundPackets26_1.INITIALIZE_BORDER, (UserConnection)wrapper.user());
            initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
            initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
            initializeBorder.write((Type)Types.DOUBLE, (Object)0.0);
            initializeBorder.write((Type)Types.DOUBLE, (Object)6.0E7);
            initializeBorder.write((Type)Types.VAR_LONG, (Object)0L);
            initializeBorder.write((Type)Types.VAR_INT, (Object)60000000);
            initializeBorder.write((Type)Types.VAR_INT, (Object)0);
            initializeBorder.write((Type)Types.VAR_INT, (Object)0);
            initializeBorder.send(BedrockProtocol.class);
            PacketFactory.sendJavaContainerSetContent((UserConnection)wrapper.user(), (Container)inventoryTracker.getInventoryContainer());
            inventoryTracker.getInventoryContainer().sendSelectedHotbarSlotToClient();
        });
        protocol.registerClientbound(ClientboundBedrockPackets.LEVEL_CHUNK, null, wrapper -> {
            BedrockChunk chunk;
            wrapper.cancel();
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            GameSessionStorage gameSession = (GameSessionStorage)wrapper.user().get(GameSessionStorage.class);
            int chunkX = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            int chunkZ = (Integer)wrapper.read((Type)BedrockTypes.VAR_INT);
            Dimension dimension = Dimension.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)));
            if (dimension != chunkTracker.getDimension()) {
                return;
            }
            int sectionCount = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT);
            if (sectionCount < -2) {
                return;
            }
            int startY = chunkTracker.getMinY() >> 4;
            int endY = chunkTracker.getMaxY() >> 4;
            int requestSectionCount = 0;
            if (sectionCount == -2) {
                requestSectionCount = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_SHORT_LE) + 1;
            } else if (sectionCount == -1) {
                requestSectionCount = endY - startY;
            }
            BedrockChunk previousChunk = chunkTracker.getChunk(chunkX, chunkZ);
            if (previousChunk != null) {
                chunkTracker.unloadChunk(new ChunkPosition(chunkX, chunkZ));
                if (previousChunk.isRequestSubChunks()) {
                    requestSectionCount = endY - startY;
                }
            }
            if ((chunk = chunkTracker.createChunk(chunkX, chunkZ, sectionCount < 0 ? requestSectionCount : sectionCount)) == null) {
                return;
            }
            chunk.setRequestSubChunks(sectionCount < 0);
            int fRequestSectionCount = requestSectionCount;
            Consumer<byte[]> dataConsumer = combinedData -> {
                try {
                    if (fRequestSectionCount > 0) {
                        chunkTracker.requestSubChunks(chunkX, chunkZ, startY, MathUtil.clamp((int)(startY + fRequestSectionCount), (int)(startY + 1), (int)endY));
                    }
                    ByteBuf dataBuf = Unpooled.wrappedBuffer((byte[])combinedData);
                    BedrockChunkSection[] sections = chunk.getSections();
                    List blockEntities = chunk.blockEntities();
                    try {
                        int i;
                        for (i = 0; i < sectionCount; ++i) {
                            sections[i].mergeWith(chunkTracker.handleBlockPalette((BedrockChunkSection)BedrockTypes.CHUNK_SECTION.read(dataBuf)));
                            sections[i].applyPendingBlockUpdates(chunkTracker.bedrockAirId());
                        }
                        if (gameSession.getBedrockVanillaVersion().isLowerThan("1.18.0")) {
                            byte[] biomeData = new byte[256];
                            dataBuf.readBytes(biomeData);
                            for (BedrockChunkSection section : sections) {
                                section.addPalette(PaletteType.BIOMES, (DataPalette)new BedrockBiomeArray(biomeData));
                            }
                        } else {
                            for (i = 0; i < sections.length; ++i) {
                                Object biomePalette = (BedrockDataPalette)BedrockTypes.RUNTIME_DATA_PALETTE.read(dataBuf);
                                if (biomePalette == null) {
                                    if (i == 0) {
                                        throw new RuntimeException("First biome palette can not point to previous biome palette");
                                    }
                                    biomePalette = ((BedrockDataPalette)sections[i - 1].palette(PaletteType.BIOMES)).clone();
                                }
                                sections[i].addPalette(PaletteType.BIOMES, (DataPalette)biomePalette);
                            }
                        }
                        dataBuf.skipBytes(1);
                        while (dataBuf.isReadable()) {
                            Tag tag = (Tag)BedrockTypes.NETWORK_TAG.read(dataBuf);
                            if (!(tag instanceof CompoundTag)) continue;
                            blockEntities.add(new BedrockBlockEntity((CompoundTag)tag));
                        }
                    }
                    catch (IndexOutOfBoundsException tag) {
                    }
                    catch (Throwable e) {
                        ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Error reading chunk data", e);
                    }
                    if (!chunk.isRequestSubChunks()) {
                        chunkTracker.sendChunk(chunkX, chunkZ);
                    }
                }
                catch (Throwable e) {
                    throw new RuntimeException("Error handling chunk data", e);
                }
            };
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                int expectedLength;
                Long[] blobs = (Long[])wrapper.read(BedrockTypes.LONG_ARRAY);
                int n = expectedLength = sectionCount < 0 ? 1 : sectionCount + 1;
                if (blobs.length != expectedLength) {
                    throw new IllegalStateException("Invalid blob count: " + blobs.length + " (expected " + expectedLength + ")");
                }
                byte[] data = (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY);
                ((BlobCache)wrapper.user().get(BlobCache.class)).getBlob(blobs).thenAccept(blob -> {
                    byte[] combinedData = new byte[data.length + ((byte[])blob).length];
                    System.arraycopy(blob, 0, combinedData, 0, ((byte[])blob).length);
                    System.arraycopy(data, 0, combinedData, ((byte[])blob).length, data.length);
                    dataConsumer.accept(combinedData);
                });
            } else {
                dataConsumer.accept((byte[])wrapper.read(BedrockTypes.BYTE_ARRAY));
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SUB_CHUNK, null, wrapper -> {
            wrapper.cancel();
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            boolean cachingEnabled = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            Dimension dimension = Dimension.getByValue((int)((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)));
            if (dimension != chunkTracker.getDimension()) {
                return;
            }
            BlockPosition center = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            long count = (Long)wrapper.read((Type)BedrockTypes.UNSIGNED_INT_LE);
            for (long i = 0L; i < count; ++i) {
                SubChunkPacket_HeightMapDataType renderHeightmapResult;
                BlockPosition offset = (BlockPosition)wrapper.read(BedrockTypes.SUB_CHUNK_OFFSET);
                SubChunkPacket_SubChunkRequestResult result = SubChunkPacket_SubChunkRequestResult.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (SubChunkPacket_SubChunkRequestResult)SubChunkPacket_SubChunkRequestResult.Undefined);
                byte[] data = result != SubChunkPacket_SubChunkRequestResult.SuccessAllAir || !cachingEnabled ? (byte[])wrapper.read(BedrockTypes.BYTE_ARRAY) : new byte[]{};
                SubChunkPacket_HeightMapDataType heightmapResult = SubChunkPacket_HeightMapDataType.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (SubChunkPacket_HeightMapDataType)SubChunkPacket_HeightMapDataType.NoData);
                if (heightmapResult == SubChunkPacket_HeightMapDataType.HasData) {
                    wrapper.read((Type)new ByteArrayType(256));
                }
                if ((renderHeightmapResult = SubChunkPacket_HeightMapDataType.getByValue((int)((Byte)wrapper.read((Type)Types.BYTE)).byteValue(), (SubChunkPacket_HeightMapDataType)SubChunkPacket_HeightMapDataType.NoData)) == SubChunkPacket_HeightMapDataType.HasData) {
                    wrapper.read((Type)new ByteArrayType(256));
                }
                BlockPosition absolute = new BlockPosition(center.x() + offset.x(), center.y() + offset.y(), center.z() + offset.z());
                Consumer<byte[]> dataConsumer = combinedData -> {
                    block10: {
                        try {
                            if (result == SubChunkPacket_SubChunkRequestResult.SuccessAllAir) {
                                if (chunkTracker.mergeSubChunk(absolute.x(), absolute.y(), absolute.z(), (BedrockChunkSection)new BedrockChunkSectionImpl(), new ArrayList())) {
                                    chunkTracker.sendChunkInNextTick(absolute.x(), absolute.z());
                                }
                                break block10;
                            }
                            if (result == SubChunkPacket_SubChunkRequestResult.Success) {
                                ByteBuf dataBuf = Unpooled.wrappedBuffer((byte[])combinedData);
                                Object section = new BedrockChunkSectionImpl();
                                ArrayList<BedrockBlockEntity> blockEntities = new ArrayList<BedrockBlockEntity>();
                                try {
                                    section = (BedrockChunkSection)BedrockTypes.CHUNK_SECTION.read(dataBuf);
                                    while (dataBuf.isReadable()) {
                                        Tag tag = (Tag)BedrockTypes.NETWORK_TAG.read(dataBuf);
                                        if (!(tag instanceof CompoundTag)) continue;
                                        blockEntities.add(new BedrockBlockEntity((CompoundTag)tag));
                                    }
                                }
                                catch (IndexOutOfBoundsException tag) {
                                }
                                catch (Throwable e) {
                                    ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Error reading sub chunk data", e);
                                }
                                if (chunkTracker.mergeSubChunk(absolute.x(), absolute.y(), absolute.z(), (BedrockChunkSection)section, blockEntities)) {
                                    chunkTracker.sendChunkInNextTick(absolute.x(), absolute.z());
                                }
                                break block10;
                            }
                            ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received sub chunk with result " + String.valueOf(result));
                            chunkTracker.requestSubChunk(absolute.x(), absolute.y(), absolute.z());
                        }
                        catch (Throwable e) {
                            throw new RuntimeException("Error handling sub chunk data", e);
                        }
                    }
                };
                if (cachingEnabled) {
                    long hash = (Long)wrapper.read((Type)BedrockTypes.LONG_LE);
                    ((BlobCache)wrapper.user().get(BlobCache.class)).getBlob(new long[]{hash}).thenAccept(blob -> {
                        if (data.length == 0) {
                            dataConsumer.accept((byte[])blob);
                        } else if (((byte[])blob).length == 0) {
                            dataConsumer.accept(data);
                        } else {
                            byte[] combinedData = new byte[data.length + ((byte[])blob).length];
                            System.arraycopy(blob, 0, combinedData, 0, ((byte[])blob).length);
                            System.arraycopy(data, 0, combinedData, ((byte[])blob).length, data.length);
                            dataConsumer.accept(combinedData);
                        }
                    });
                    continue;
                }
                dataConsumer.accept(data);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_BLOCK, (ClientboundPacketType)ClientboundPackets26_1.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.BLOCK_POSITION, Types.BLOCK_POSITION1_14);
                this.handler(UPDATE_BLOCK_HANDLER);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_BLOCK_SYNCED, (ClientboundPacketType)ClientboundPackets26_1.BLOCK_UPDATE, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.BLOCK_POSITION, Types.BLOCK_POSITION1_14);
                this.handler(UPDATE_BLOCK_HANDLER);
                this.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
                this.read((Type)BedrockTypes.UNSIGNED_VAR_LONG);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.UPDATE_SUB_CHUNK_BLOCKS, null, wrapper -> {
            wrapper.cancel();
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            wrapper.read(BedrockTypes.BLOCK_POSITION);
            BlockChangeEntry[][] blockUpdatesArray = new BlockChangeEntry[][]{(BlockChangeEntry[])wrapper.read(BedrockTypes.BLOCK_CHANGE_ENTRY_ARRAY), (BlockChangeEntry[])wrapper.read(BedrockTypes.BLOCK_CHANGE_ENTRY_ARRAY)};
            HashMap<BlockPosition, List> blockChanges = new HashMap<BlockPosition, List>();
            HashMap<BlockPosition, BlockEntity> blockEntities = new HashMap<BlockPosition, BlockEntity>();
            for (int layer = 0; layer < blockUpdatesArray.length; ++layer) {
                for (BlockChangeEntry entry : blockUpdatesArray[layer]) {
                    IntObjectPair remappedBlock = chunkTracker.handleBlockChange(entry.position(), layer, entry.blockState());
                    if (remappedBlock == null) continue;
                    if (remappedBlock.value() != null) {
                        blockEntities.put(entry.position(), (BlockEntity)remappedBlock.value());
                    }
                    BlockPosition chunkPosition = new BlockPosition(entry.position().x() >> 4, entry.position().y() >> 4, entry.position().z() >> 4);
                    BlockPosition relative = new BlockPosition(entry.position().x() & 0xF, entry.position().y() & 0xF, entry.position().z() & 0xF);
                    blockChanges.computeIfAbsent(chunkPosition, k -> new ArrayList()).add(new BlockChangeRecord1_16_2(relative.x(), relative.y(), relative.z(), remappedBlock.keyInt()));
                }
            }
            for (Map.Entry entry : blockChanges.entrySet()) {
                BlockPosition chunkPosition = (BlockPosition)entry.getKey();
                List changes = (List)entry.getValue();
                long chunkKey = ((long)chunkPosition.x() & 0x3FFFFFL) << 42 | ((long)chunkPosition.z() & 0x3FFFFFL) << 20 | (long)chunkPosition.y() & 0xFFFL;
                PacketWrapper multiBlockChange = wrapper.create((PacketType)ClientboundPackets26_1.SECTION_BLOCKS_UPDATE);
                multiBlockChange.write((Type)Types.LONG, (Object)chunkKey);
                multiBlockChange.write(Types.VAR_LONG_BLOCK_CHANGE_ARRAY, (Object)changes.toArray(new BlockChangeRecord[0]));
                multiBlockChange.send(BedrockProtocol.class);
            }
            for (Map.Entry entry : blockEntities.entrySet()) {
                PacketFactory.sendJavaBlockEntityData((UserConnection)wrapper.user(), (BlockPosition)((BlockPosition)entry.getKey()), (BlockEntity)((BlockEntity)entry.getValue()));
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.BLOCK_ENTITY_DATA, (ClientboundPacketType)ClientboundPackets26_1.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(BedrockTypes.BLOCK_POSITION, Types.BLOCK_POSITION1_14);
                this.handler(wrapper -> {
                    Tag tag = (Tag)wrapper.read(BedrockTypes.NETWORK_TAG);
                    if (!(tag instanceof CompoundTag)) {
                        wrapper.cancel();
                        return;
                    }
                    ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
                    BedrockBlockEntity bedrockBlockEntity = new BedrockBlockEntity((BlockPosition)wrapper.get(Types.BLOCK_POSITION1_14, 0), (CompoundTag)tag);
                    chunkTracker.addBlockEntity(bedrockBlockEntity);
                    BlockEntity javaBlockEntity = BlockEntityRewriter.toJava((UserConnection)wrapper.user(), (int)chunkTracker.getBlockState(bedrockBlockEntity.position()), (BedrockBlockEntity)bedrockBlockEntity);
                    if (javaBlockEntity instanceof BlockEntityWithBlockState) {
                        BlockEntityWithBlockState blockEntityWithBlockState = (BlockEntityWithBlockState)javaBlockEntity;
                        PacketFactory.sendJavaBlockUpdate((UserConnection)wrapper.user(), (BlockPosition)bedrockBlockEntity.position(), (int)blockEntityWithBlockState.blockState());
                    }
                    if (javaBlockEntity != null && javaBlockEntity.tag() != null) {
                        wrapper.write((Type)Types.VAR_INT, (Object)javaBlockEntity.typeId());
                        wrapper.write(Types.COMPOUND_TAG, (Object)javaBlockEntity.tag());
                    } else {
                        wrapper.cancel();
                    }
                });
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.NETWORK_CHUNK_PUBLISHER_UPDATE, (ClientboundPacketType)ClientboundPackets26_1.SET_CHUNK_CACHE_RADIUS, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.read(BedrockTypes.BLOCK_POSITION);
            int radius = (Integer)wrapper.read((Type)BedrockTypes.UNSIGNED_VAR_INT) >> 4;
            wrapper.write((Type)Types.VAR_INT, (Object)radius);
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            chunkTracker.setRadius(radius);
            chunkTracker.setCenter(position.x() >> 4, position.z() >> 4);
            PacketWrapper updateViewPosition = wrapper.create((PacketType)ClientboundPackets26_1.SET_CHUNK_CACHE_CENTER);
            updateViewPosition.write((Type)Types.VAR_INT, (Object)(position.x() >> 4));
            updateViewPosition.write((Type)Types.VAR_INT, (Object)(position.z() >> 4));
            updateViewPosition.send(BedrockProtocol.class);
            int count = (Integer)wrapper.read((Type)BedrockTypes.INT_LE);
            for (int i = 0; i < count; ++i) {
                wrapper.read((Type)BedrockTypes.VAR_INT);
                wrapper.read((Type)BedrockTypes.VAR_INT);
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.CHUNK_RADIUS_UPDATED, (ClientboundPacketType)ClientboundPackets26_1.SET_CHUNK_CACHE_RADIUS, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)BedrockTypes.VAR_INT, (Type)Types.VAR_INT);
                this.handler(wrapper -> ((ChunkTracker)wrapper.user().get(ChunkTracker.class)).setRadius(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue()));
            }
        });
        protocol.registerClientbound(ClientboundBedrockPackets.SET_TIME, (ClientboundPacketType)ClientboundPackets26_1.SET_TIME, wrapper -> {
            long bedrockTime = ((Integer)wrapper.read((Type)BedrockTypes.VAR_INT)).intValue();
            wrapper.write((Type)Types.LONG, (Object)((GameSessionStorage)wrapper.user().get(GameSessionStorage.class)).getLevelTime());
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.VAR_LONG, (Object)(bedrockTime >= 0L ? bedrockTime % 24000L : 24000L + bedrockTime % 24000L));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf((Boolean)((GameRulesStorage)wrapper.user().get(GameRulesStorage.class)).getGameRule("doDayLightCycle") != false ? 1.0f : 0.0f));
        });
        protocol.registerServerbound((ServerboundPacketType)ServerboundPackets26_1.SIGN_UPDATE, ServerboundBedrockPackets.BLOCK_ENTITY_DATA, wrapper -> {
            ChunkTracker chunkTracker = (ChunkTracker)wrapper.user().get(ChunkTracker.class);
            BlockStateRewriter blockStateRewriter = (BlockStateRewriter)wrapper.user().get(BlockStateRewriter.class);
            BlockPosition position = (BlockPosition)wrapper.read(Types.BLOCK_POSITION1_14);
            boolean front = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            ArrayList<String> lines = new ArrayList<String>(4);
            for (int i = 0; i < 4; ++i) {
                lines.add((String)wrapper.read(Types.STRING));
            }
            String tag = blockStateRewriter.tag(chunkTracker.getBlockState(position));
            BedrockBlockEntity signBlockEntity = "hanging_sign".equals(tag) || "sign".equals(tag) ? chunkTracker.getBlockEntity(position) : null;
            CompoundTag signTag = signBlockEntity != null ? signBlockEntity.tag() : new CompoundTag();
            SignBlockEntityRewriter.upgradeData((CompoundTag)signTag);
            SignBlockEntityRewriter.sanitizeData((CompoundTag)signTag);
            if ("sign".equals(tag)) {
                signTag.putString("id", "Sign");
            } else if ("hanging_sign".equals(tag)) {
                signTag.putString("id", "HangingSign");
            }
            signTag.putInt("x", position.x());
            signTag.putInt("y", position.y());
            signTag.putInt("z", position.z());
            while (!lines.isEmpty() && ((String)lines.get(lines.size() - 1)).isEmpty()) {
                lines.remove(lines.size() - 1);
            }
            String text = lines.stream().reduce((a, b) -> a + "\n" + b).orElse("");
            signTag.getCompoundTag(front ? "FrontText" : "BackText").putString("Text", text);
            wrapper.write(BedrockTypes.BLOCK_POSITION, (Object)position);
            wrapper.write(BedrockTypes.NETWORK_TAG, (Object)signTag.copy());
        });
    }
}


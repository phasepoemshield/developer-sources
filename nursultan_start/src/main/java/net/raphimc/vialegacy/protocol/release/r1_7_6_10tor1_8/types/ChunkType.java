/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.BaseChunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.IdAndData
 *  com.viaversion.viaversion.util.Pair
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.ExtendedBlockStorage
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types;

import com.viaversion.viaversion.api.minecraft.chunks.BaseChunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.IdAndData;
import com.viaversion.viaversion.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.model.ExtendedBlockStorage;

public class ChunkType
extends Type<Chunk> {
    private final boolean hasSkyLight;

    public static Chunk deserialize(int chunkX, int chunkZ, boolean fullChunk, boolean skyLight, int primaryBitMask, int additionalBitMask, byte[] chunkData) {
        int i;
        ExtendedBlockStorage[] storageArrays = new ExtendedBlockStorage[16];
        int dataPosition = 0;
        for (i = 0; i < storageArrays.length; ++i) {
            if ((primaryBitMask & 1 << i) == 0) continue;
            if (storageArrays[i] == null) {
                storageArrays[i] = new ExtendedBlockStorage(skyLight);
            }
            byte[] blockLSBArray = storageArrays[i].getBlockLSBArray();
            System.arraycopy(chunkData, dataPosition, blockLSBArray, 0, blockLSBArray.length);
            dataPosition += blockLSBArray.length;
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((primaryBitMask & 1 << i) == 0 || storageArrays[i] == null) continue;
            byte[] blockMetadataArray = storageArrays[i].getBlockMetadataArray().getHandle();
            System.arraycopy(chunkData, dataPosition, blockMetadataArray, 0, blockMetadataArray.length);
            dataPosition += blockMetadataArray.length;
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((primaryBitMask & 1 << i) == 0 || storageArrays[i] == null) continue;
            byte[] blockLightArray = storageArrays[i].getBlockLightArray().getHandle();
            System.arraycopy(chunkData, dataPosition, blockLightArray, 0, blockLightArray.length);
            dataPosition += blockLightArray.length;
        }
        if (skyLight) {
            for (i = 0; i < storageArrays.length; ++i) {
                if ((primaryBitMask & 1 << i) == 0 || storageArrays[i] == null) continue;
                byte[] skyLightArray = storageArrays[i].getSkyLightArray().getHandle();
                System.arraycopy(chunkData, dataPosition, skyLightArray, 0, skyLightArray.length);
                dataPosition += skyLightArray.length;
            }
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((additionalBitMask & 1 << i) == 0) continue;
            if (storageArrays[i] != null) {
                byte[] blockMSBArray = storageArrays[i].getOrCreateBlockMSBArray().getHandle();
                System.arraycopy(chunkData, dataPosition, blockMSBArray, 0, blockMSBArray.length);
                dataPosition += blockMSBArray.length;
                continue;
            }
            dataPosition += 2048;
        }
        int[] biomeData = null;
        if (fullChunk) {
            biomeData = new int[256];
            for (int i2 = 0; i2 < biomeData.length; ++i2) {
                biomeData[i2] = chunkData[dataPosition + i2] & 0xFF;
            }
            dataPosition += biomeData.length;
        }
        ChunkSection[] sections = new ChunkSection[16];
        for (int i3 = 0; i3 < storageArrays.length; ++i3) {
            ExtendedBlockStorage storage = storageArrays[i3];
            if (storage == null) continue;
            sections[i3] = new ChunkSectionImpl(true);
            ChunkSectionImpl section = sections[i3];
            section.palette(PaletteType.BLOCKS).addId(0);
            for (int x = 0; x < 16; ++x) {
                for (int z = 0; z < 16; ++z) {
                    for (int y = 0; y < 16; ++y) {
                        section.palette(PaletteType.BLOCKS).setIdAt(x, y, z, IdAndData.toRawData((int)storage.getBlockId(x, y, z), (int)storage.getBlockMetadata(x, y, z)));
                    }
                }
            }
            section.getLight().setBlockLight(storage.getBlockLightArray().getHandle());
            if (!skyLight) continue;
            section.getLight().setSkyLight(storage.getSkyLightArray().getHandle());
        }
        return new BaseChunk(chunkX, chunkZ, fullChunk, false, primaryBitMask, sections, biomeData, new ArrayList());
    }

    public static int getSize(short primaryBitMask, short additionalBitMask, boolean fullChunk, boolean skyLight) {
        int primarySectionCount = Integer.bitCount(primaryBitMask & 0xFFFF);
        int additionalSectionCount = Integer.bitCount(additionalBitMask & 0xFFFF);
        int size = 8192 * primarySectionCount + 2048 * additionalSectionCount;
        if (skyLight) {
            size += 2048 * primarySectionCount;
        }
        if (fullChunk) {
            size += 256;
        }
        return size;
    }

    public static int getSize(ExtendedBlockStorage[] storageArrays, short bitmask, boolean biomes) {
        int size = 0;
        for (int i = 0; i < storageArrays.length; ++i) {
            if ((bitmask & 1 << i) == 0) continue;
            size += 4096;
            size += 2048;
            size += 2048;
            if (storageArrays[i].getSkyLightArray() != null) {
                size += 2048;
            }
            if (!storageArrays[i].hasBlockMSBArray()) continue;
            size += 2048;
        }
        if (biomes) {
            size += 256;
        }
        return size;
    }

    public ChunkType(boolean hasSkyLight) {
        super(Chunk.class);
        this.hasSkyLight = hasSkyLight;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ByteBuf byteBuf, Chunk chunk) {
        int compressedSize;
        byte[] compressedData;
        Pair<byte[], Short> chunkData = ChunkType.serialize(chunk);
        byte[] data = (byte[])chunkData.key();
        short additionalBitMask = (Short)chunkData.value();
        Deflater deflater = new Deflater();
        try {
            deflater.setInput(data, 0, data.length);
            deflater.finish();
            compressedData = new byte[data.length];
            compressedSize = deflater.deflate(compressedData);
        }
        finally {
            deflater.end();
        }
        byteBuf.writeInt(chunk.getX());
        byteBuf.writeInt(chunk.getZ());
        byteBuf.writeBoolean(chunk.isFullChunk());
        byteBuf.writeShort(chunk.getBitmask());
        byteBuf.writeShort((int)additionalBitMask);
        byteBuf.writeInt(compressedSize);
        this.writeUnusedInt(byteBuf, chunk);
        byteBuf.writeBytes(compressedData, 0, compressedSize);
    }

    public Chunk read(ByteBuf byteBuf) {
        int chunkX = byteBuf.readInt();
        int chunkZ = byteBuf.readInt();
        boolean fullChunk = byteBuf.readBoolean();
        short primaryBitMask = byteBuf.readShort();
        short additionalBitMask = byteBuf.readShort();
        int compressedSize = byteBuf.readInt();
        this.readUnusedInt(byteBuf);
        byte[] data = new byte[compressedSize];
        byteBuf.readBytes(data);
        byte[] uncompressedData = new byte[ChunkType.getSize(primaryBitMask, additionalBitMask, fullChunk, this.hasSkyLight)];
        Inflater inflater = new Inflater();
        try {
            inflater.setInput(data, 0, compressedSize);
            inflater.inflate(uncompressedData);
        }
        catch (DataFormatException ex) {
            throw new RuntimeException("Bad compressed data format");
        }
        finally {
            inflater.end();
        }
        if (fullChunk && primaryBitMask == 0) {
            return new BaseChunk(chunkX, chunkZ, true, false, 0, new ChunkSection[16], null, new ArrayList());
        }
        return ChunkType.deserialize(chunkX, chunkZ, fullChunk, this.hasSkyLight, primaryBitMask, additionalBitMask, uncompressedData);
    }

    public static Pair<byte[], Short> serialize(Chunk chunk) {
        int i;
        ExtendedBlockStorage[] storageArrays = new ExtendedBlockStorage[16];
        for (int i2 = 0; i2 < storageArrays.length; ++i2) {
            ChunkSection section = chunk.getSections()[i2];
            if (section == null) continue;
            ExtendedBlockStorage storage = storageArrays[i2] = new ExtendedBlockStorage(section.getLight().hasSkyLight());
            for (int x = 0; x < 16; ++x) {
                for (int z = 0; z < 16; ++z) {
                    for (int y = 0; y < 16; ++y) {
                        int flatBlock = section.palette(PaletteType.BLOCKS).idAt(x, y, z);
                        storage.setBlockId(x, y, z, flatBlock >> 4);
                        storage.setBlockMetadata(x, y, z, flatBlock & 0xF);
                    }
                }
            }
            storage.getBlockLightArray().setHandle(section.getLight().getBlockLight());
            if (!section.getLight().hasSkyLight()) continue;
            storage.getSkyLightArray().setHandle(section.getLight().getSkyLight());
        }
        boolean biomes = chunk.isFullChunk() && chunk.getBiomeData() != null;
        int totalSize = ChunkType.getSize(storageArrays, (short)chunk.getBitmask(), biomes);
        byte[] chunkData = new byte[totalSize];
        int dataPosition = 0;
        for (i = 0; i < storageArrays.length; ++i) {
            if ((chunk.getBitmask() & 1 << i) == 0) continue;
            byte[] blockLSBArray = storageArrays[i].getBlockLSBArray();
            System.arraycopy(blockLSBArray, 0, chunkData, dataPosition, blockLSBArray.length);
            dataPosition += blockLSBArray.length;
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((chunk.getBitmask() & 1 << i) == 0) continue;
            byte[] blockMetadataArray = storageArrays[i].getBlockMetadataArray().getHandle();
            System.arraycopy(blockMetadataArray, 0, chunkData, dataPosition, blockMetadataArray.length);
            dataPosition += blockMetadataArray.length;
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((chunk.getBitmask() & 1 << i) == 0) continue;
            byte[] blockLightArray = storageArrays[i].getBlockLightArray().getHandle();
            System.arraycopy(blockLightArray, 0, chunkData, dataPosition, blockLightArray.length);
            dataPosition += blockLightArray.length;
        }
        for (i = 0; i < storageArrays.length; ++i) {
            if ((chunk.getBitmask() & 1 << i) == 0 || storageArrays[i].getSkyLightArray() == null) continue;
            byte[] skyLightArray = storageArrays[i].getSkyLightArray().getHandle();
            System.arraycopy(skyLightArray, 0, chunkData, dataPosition, skyLightArray.length);
            dataPosition += skyLightArray.length;
        }
        short additionalBitMask = 0;
        for (int i3 = 0; i3 < storageArrays.length; ++i3) {
            if ((chunk.getBitmask() & 1 << i3) == 0 || !storageArrays[i3].hasBlockMSBArray()) continue;
            additionalBitMask = (short)(additionalBitMask | (short)(1 << i3));
            byte[] blockMSBArray = storageArrays[i3].getOrCreateBlockMSBArray().getHandle();
            System.arraycopy(blockMSBArray, 0, chunkData, dataPosition, blockMSBArray.length);
            dataPosition += blockMSBArray.length;
        }
        if (biomes) {
            for (int biome : chunk.getBiomeData()) {
                chunkData[dataPosition++] = (byte)biome;
            }
        }
        return new Pair((Object)chunkData, (Object)additionalBitMask);
    }

    protected void readUnusedInt(ByteBuf byteBuf) {
    }

    protected void writeUnusedInt(ByteBuf byteBuf, Chunk chunk) {
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.util.Pair
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types;

import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.util.Pair;
import io.netty.buffer.ByteBuf;
import java.util.zip.DataFormatException;
import java.util.zip.Deflater;
import java.util.zip.Inflater;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types.ChunkType;

public class BulkChunkType
extends Type<Chunk[]> {
    public BulkChunkType() {
        super(Chunk[].class);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ByteBuf byteBuf, Chunk[] chunks) {
        int compressedSize;
        byte[] compressedData;
        int chunkCount = chunks.length;
        int[] chunkX = new int[chunkCount];
        int[] chunkZ = new int[chunkCount];
        short[] primaryBitMask = new short[chunkCount];
        short[] additionalBitMask = new short[chunkCount];
        byte[][] dataArrays = new byte[chunkCount][];
        int dataSize = 0;
        for (int i = 0; i < chunkCount; ++i) {
            Chunk chunk = chunks[i];
            Pair<byte[], Short> pair = ChunkType.serialize(chunk);
            chunkX[i] = chunk.getX();
            chunkZ[i] = chunk.getZ();
            primaryBitMask[i] = (short)chunk.getBitmask();
            additionalBitMask[i] = (Short)pair.value();
            dataArrays[i] = (byte[])pair.key();
            dataSize += ((byte[])pair.key()).length;
        }
        byte[] data = new byte[dataSize];
        int destPos = 0;
        for (byte[] array : dataArrays) {
            System.arraycopy(array, 0, data, destPos, array.length);
            destPos += array.length;
        }
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
        boolean skyLight = false;
        block5: for (Chunk chunk : chunks) {
            for (ChunkSection section : chunk.getSections()) {
                if (section == null || !section.getLight().hasSkyLight()) continue;
                skyLight = true;
                break block5;
            }
        }
        byteBuf.writeShort(chunkCount);
        byteBuf.writeInt(compressedSize);
        this.writeHasSkyLight(byteBuf, skyLight);
        byteBuf.writeBytes(compressedData, 0, compressedSize);
        for (int i = 0; i < chunkCount; ++i) {
            byteBuf.writeInt(chunkX[i]);
            byteBuf.writeInt(chunkZ[i]);
            byteBuf.writeShort((int)primaryBitMask[i]);
            byteBuf.writeShort((int)additionalBitMask[i]);
        }
    }

    public Chunk[] read(ByteBuf byteBuf) {
        int chunkCount = byteBuf.readShort();
        int compressedSize = byteBuf.readInt();
        boolean hasSkyLight = this.readHasSkyLight(byteBuf);
        byte[] data = new byte[compressedSize];
        byteBuf.readBytes(data);
        int[] chunkX = new int[chunkCount];
        int[] chunkZ = new int[chunkCount];
        short[] primaryBitMask = new short[chunkCount];
        short[] additionalBitMask = new short[chunkCount];
        for (int i = 0; i < chunkCount; ++i) {
            chunkX[i] = byteBuf.readInt();
            chunkZ[i] = byteBuf.readInt();
            primaryBitMask[i] = byteBuf.readShort();
            additionalBitMask[i] = byteBuf.readShort();
        }
        byte[] uncompressedData = new byte[ChunkType.getSize((short)-1, (short)-1, true, hasSkyLight) * chunkCount];
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
        Chunk[] chunks = new Chunk[chunkCount];
        int dataPosition = 0;
        for (int i = 0; i < chunkCount; ++i) {
            byte[] chunkData = new byte[ChunkType.getSize(primaryBitMask[i], additionalBitMask[i], true, hasSkyLight)];
            System.arraycopy(uncompressedData, dataPosition, chunkData, 0, chunkData.length);
            chunks[i] = ChunkType.deserialize(chunkX[i], chunkZ[i], true, hasSkyLight, primaryBitMask[i], additionalBitMask[i], chunkData);
            dataPosition += chunkData.length;
        }
        return chunks;
    }

    protected boolean readHasSkyLight(ByteBuf byteBuf) {
        return byteBuf.readBoolean();
    }

    protected void writeHasSkyLight(ByteBuf byteBuf, boolean hasSkyLight) {
        byteBuf.writeBoolean(hasSkyLight);
    }
}


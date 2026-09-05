/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntList
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.chunk.bitarray.BitArray
 *  net.raphimc.viabedrock.api.chunk.bitarray.BitArrayVersion
 *  net.raphimc.viabedrock.api.chunk.bitarray.SingletonBitArray
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette
 */
package net.raphimc.viabedrock.protocol.types.chunk;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import net.raphimc.viabedrock.api.chunk.bitarray.BitArray;
import net.raphimc.viabedrock.api.chunk.bitarray.BitArrayVersion;
import net.raphimc.viabedrock.api.chunk.bitarray.SingletonBitArray;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class DataPaletteType
extends Type<BedrockDataPalette> {
    private final boolean allowPersistentIds;

    public DataPaletteType(boolean allowPersistentIds) {
        super(BedrockDataPalette.class);
        this.allowPersistentIds = allowPersistentIds;
    }

    public void write(ByteBuf buffer, BedrockDataPalette value) {
        int i;
        if (value == null) {
            buffer.writeByte(254);
            return;
        }
        BitArray bitArray = value.getBitArray();
        BitArrayVersion version = bitArray.getVersion();
        boolean isRuntime = !value.usesPersistentIds() || !this.allowPersistentIds;
        buffer.writeByte(version.getBits() << 1 | (isRuntime ? 1 : 0));
        if (!(bitArray instanceof SingletonBitArray)) {
            for (i = 0; i < bitArray.getWords().length; ++i) {
                buffer.writeIntLE(bitArray.getWords()[i]);
            }
        }
        if (!(bitArray instanceof SingletonBitArray)) {
            BedrockTypes.VAR_INT.writePrimitive(buffer, value.size());
        } else if (value.size() != 1) {
            throw new IllegalStateException("Singleton bit array only supports one palette entry!");
        }
        if (isRuntime) {
            for (i = 0; i < value.size(); ++i) {
                BedrockTypes.VAR_INT.write(buffer, value.idByIndex(i));
            }
        } else {
            for (i = 0; i < value.size(); ++i) {
                BedrockTypes.NETWORK_TAG.write(buffer, (Object)((Tag)value.getPersistentPalette().get(i)));
            }
        }
    }

    public BedrockDataPalette read(ByteBuf buffer) {
        int size;
        boolean isRuntime;
        short header = buffer.readUnsignedByte();
        int bitArrayVersion = header >> 1;
        boolean bl = isRuntime = (header & 1) != 0 || !this.allowPersistentIds;
        if (bitArrayVersion == 127) {
            return null;
        }
        BitArray bitArray = BitArrayVersion.get((int)bitArrayVersion, (boolean)true).createArray(4096);
        if (!(bitArray instanceof SingletonBitArray)) {
            for (int i = 0; i < bitArray.getWords().length; ++i) {
                bitArray.getWords()[i] = buffer.readIntLE();
            }
        }
        int n = size = bitArray instanceof SingletonBitArray ? 1 : BedrockTypes.VAR_INT.readPrimitive(buffer);
        if (isRuntime) {
            IntArrayList palette = new IntArrayList(size);
            for (int i = 0; i < size; ++i) {
                palette.add(BedrockTypes.VAR_INT.read(buffer).intValue());
            }
            return new BedrockDataPalette((IntList)palette, bitArray);
        }
        ArrayList<Tag> palette = new ArrayList<Tag>(size);
        for (int i = 0; i < size; ++i) {
            palette.add((Tag)BedrockTypes.NETWORK_TAG.read(buffer));
        }
        return new BedrockDataPalette(palette, bitArray);
    }
}


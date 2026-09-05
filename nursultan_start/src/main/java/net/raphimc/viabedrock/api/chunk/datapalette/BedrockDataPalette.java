/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.fastutil.ints.IntList
 *  com.viaversion.viaversion.libs.fastutil.objects.Object2IntFunction
 *  net.raphimc.viabedrock.api.chunk.bitarray.BitArray
 *  net.raphimc.viabedrock.api.chunk.bitarray.BitArrayVersion
 */
package net.raphimc.viabedrock.api.chunk.datapalette;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.fastutil.ints.IntList;
import com.viaversion.viaversion.libs.fastutil.objects.Object2IntFunction;
import java.util.List;
import net.raphimc.viabedrock.api.chunk.bitarray.BitArray;
import net.raphimc.viabedrock.api.chunk.bitarray.BitArrayVersion;

public class BedrockDataPalette
implements DataPalette,
Cloneable {
    private final IntList palette;
    private BitArray bitArray;
    private List<Tag> persistentPalette;

    public void setIdAt(int sectionCoordinate, int id) {
        this.checkPersistentIds();
        int index = this.palette.indexOf(id);
        if (index == -1) {
            index = this.palette.size();
            this.addId(id);
        }
        this.bitArray.set(sectionCoordinate, index);
    }

    public int idByIndex(int index) {
        this.checkPersistentIds();
        return this.palette.getInt(index);
    }

    public int idAt(int sectionCoordinate) {
        this.checkPersistentIds();
        return this.palette.getInt(this.bitArray.get(sectionCoordinate));
    }

    public int index(int x, int y, int z) {
        return (x << 8) + (z << 4) + y;
    }

    public BedrockDataPalette() {
        this(BitArrayVersion.V2);
    }

    public BedrockDataPalette(BitArrayVersion version) {
        this.palette = new IntArrayList((int)version.getEntriesPerWord());
        this.bitArray = version.createArray(4096);
    }

    public BedrockDataPalette(IntList palette, BitArray bitArray) {
        this.palette = palette;
        this.bitArray = bitArray;
    }

    public BedrockDataPalette(List<Tag> persistentPalette, BitArray bitArray) {
        this.palette = new IntArrayList(persistentPalette.size());
        this.bitArray = bitArray;
        this.persistentPalette = persistentPalette;
    }

    public int size() {
        if (!this.usesPersistentIds()) {
            return this.palette.size();
        }
        return this.persistentPalette.size();
    }

    public BedrockDataPalette clone() {
        return new BedrockDataPalette((IntList)new IntArrayList(this.palette), this.bitArray.clone());
    }

    public void clear() {
        throw new UnsupportedOperationException();
    }

    public void addId(int id) {
        BitArrayVersion nextVersion;
        this.checkPersistentIds();
        this.palette.add(id);
        BitArrayVersion currentVersion = this.bitArray.getVersion();
        if (this.palette.size() >= currentVersion.getMaxEntryValue() && (nextVersion = currentVersion.getNext()) != null) {
            BitArray newBitArray = nextVersion.createArray(this.bitArray.size());
            for (int i = 0; i < this.bitArray.size(); ++i) {
                newBitArray.set(i, this.bitArray.get(i));
            }
            this.bitArray = newBitArray;
        }
    }

    public boolean usesPersistentIds() {
        return this.persistentPalette != null;
    }

    public BitArray getBitArray() {
        return this.bitArray;
    }

    private void checkPersistentIds() {
        if (this.usesPersistentIds()) {
            throw new IllegalStateException("Persistent IDs need to be resolved before performing this operation");
        }
    }

    public int paletteIndexAt(int packedCoordinate) {
        return this.bitArray.get(packedCoordinate);
    }

    public void setPaletteIndexAt(int sectionCoordinate, int index) {
        this.bitArray.set(sectionCoordinate, index);
    }

    public void setIdByIndex(int index, int id) {
        this.checkPersistentIds();
        this.palette.set(index, id);
    }

    public List<Tag> getPersistentPalette() {
        return this.persistentPalette;
    }

    public void resolvePersistentIds(Object2IntFunction<Tag> persistentToRuntimeId) {
        if (this.usesPersistentIds()) {
            this.palette.clear();
            for (Tag tag : this.persistentPalette) {
                this.palette.add(persistentToRuntimeId.getInt((Object)tag));
            }
            this.persistentPalette = null;
        }
    }
}


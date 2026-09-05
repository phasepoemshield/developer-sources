/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.cache.ChunkPacker
 *  baritone.utils.pathing.PathingBlockType
 *  com.google.common.collect.ImmutableSet
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07376
 */
package baritone.cache;

import baritone.api.utils.BlockUtils;
import baritone.cache.ChunkPacker;
import baritone.utils.pathing.PathingBlockType;
import com.google.common.collect.ImmutableSet;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07376;

public final class CachedChunk {
    public static final ImmutableSet<class00891> BLOCKS_TO_KEEP_TRACK_OF = ImmutableSet.of((Object)class00869.Mt, (Object)class00869.uN, (Object)class00869.LA, (Object)class00869.BH, (Object)class00869.MW, (Object)class00869.Mm, (Object[])new class00891[]{class00869.La, class00869.ZX, class00869.EV, class00869.EH, class00869.Ec, class00869.EX, class00869.Ea, class00869.Ep, class00869.EF, class00869.EA, class00869.Ef, class00869.EC, class00869.ES, class00869.Ex, class00869.ED, class00869.Eh, class00869.Er, class00869.WN, class00869.Wy, class00869.iq, class00869.Bf, class00869.MO, class00869.MB, class00869.BO, class00869.Bg, class00869.BI, class00869.BJ, class00869.BY, class00869.BQ, class00869.Bw, class00869.Bk, class00869.Bt, class00869.BG, class00869.Bl, class00869.Bd, class00869.MM, class00869.BK, class00869.yM, class00869.yB, class00869.yZ, class00869.yz, class00869.yU, class00869.yE, class00869.yW, class00869.ym, class00869.yP, class00869.ys, class00869.yT, class00869.yb, class00869.yj, class00869.yv, class00869.yn, class00869.yt, class00869.Ms, class00869.iG, class00869.EY, class00869.yw, class00869.MR, class00869.uW, class00869.Rc});
    public final int height;
    public final int size;
    public final int sizeInBytes;
    public final int x;
    public final int z;
    private final BitSet data;
    private final Int2ObjectOpenHashMap<String> special;
    private final class00500[] overview;
    private final int[] heightMap;
    private final Map<String, List<class07209>> specialBlockLocations;
    public final long cacheTimestamp;

    CachedChunk(int n, int n2, int n3, BitSet bitSet, class00500[] class00500Array, Map<String, List<class07209>> map, long l) {
        this.size = CachedChunk.size(n3);
        this.sizeInBytes = CachedChunk.sizeInBytes(this.size);
        this.validateSize(bitSet);
        this.x = n;
        this.z = n2;
        this.height = n3;
        this.data = bitSet;
        this.overview = class00500Array;
        this.heightMap = new int[256];
        this.specialBlockLocations = map;
        this.cacheTimestamp = l;
        if (map.isEmpty()) {
            this.special = null;
        } else {
            this.special = new Int2ObjectOpenHashMap();
            this.setSpecial();
        }
        this.calculateHeightMap();
    }

    public static int size(int n) {
        return 512 * n;
    }

    private PathingBlockType getType(int n) {
        return PathingBlockType.fromBits((boolean)this.data.get(n), (boolean)this.data.get(n + 1));
    }

    public static int sizeInBytes(int n) {
        return n / 8;
    }

    public final byte[] toByteArray() {
        return this.data.toByteArray();
    }

    public final class00500 getBlock(int n, int n2, int n3, class07376 class073762, class05946<class07299> class059462) {
        String string;
        int n4 = CachedChunk.getPositionIndex(n, n2, n3);
        PathingBlockType pathingBlockType = this.getType(n4);
        int n5 = n3 << 4 | n;
        if (this.heightMap[n5] == n2 && pathingBlockType != PathingBlockType.AVOID) {
            return this.overview[n5];
        }
        if (this.special != null && (string = (String)this.special.get(n4)) != null) {
            return BlockUtils.stringToBlockRequired(string).W();
        }
        if (pathingBlockType == PathingBlockType.SOLID) {
            if (n2 == class073762.z() - 1 && class073762.R()) {
                return class00869.q.W();
            }
            if ((class059462 == class07299.field_25179 || class059462 == class07299.field_25180) && n2 < class073762.B() + 5) {
                return class00869.LV.W();
            }
        }
        return ChunkPacker.pathingTypeToBlock((PathingBlockType)pathingBlockType, (class07376)class073762, class059462);
    }

    private final void setSpecial() {
        for (Map.Entry<String, List<class07209>> entry : this.specialBlockLocations.entrySet()) {
            for (class07209 class072092 : entry.getValue()) {
                this.special.put(CachedChunk.getPositionIndex(class072092.method_10263(), class072092.method_10264(), class072092.method_10260()), (Object)entry.getKey());
            }
        }
    }

    public final Map<String, List<class07209>> getRelativeBlocks() {
        return this.specialBlockLocations;
    }

    private void calculateHeightMap() {
        for (int i = 0; i < 16; ++i) {
            block1: for (int j = 0; j < 16; ++j) {
                int n = i << 4 | j;
                this.heightMap[n] = 0;
                for (int k = this.height; k >= 0; --k) {
                    int n2 = CachedChunk.getPositionIndex(j, k, i);
                    if (!this.data.get(n2) && !this.data.get(n2 + 1)) continue;
                    this.heightMap[n] = k;
                    continue block1;
                }
            }
        }
    }

    public final ArrayList<class07209> getAbsoluteBlocks(String string) {
        if (this.specialBlockLocations.get(string) == null) {
            return null;
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        for (class07209 class072092 : this.specialBlockLocations.get(string)) {
            arrayList.add(new class07209(class072092.method_10263() + this.x * 16, class072092.method_10264(), class072092.method_10260() + this.z * 16));
        }
        return arrayList;
    }

    private void validateSize(BitSet bitSet) {
        if (bitSet.size() > this.size) {
            throw new IllegalArgumentException("BitSet of invalid length provided");
        }
    }

    public final class00500[] getOverview() {
        return this.overview;
    }

    public static int getPositionIndex(int n, int n2, int n3) {
        return n << 1 | n3 << 5 | n2 << 9;
    }
}


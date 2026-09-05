/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.utils.BlockUtils
 *  baritone.cache.CachedChunk
 *  baritone.utils.BlockStateInterface
 *  baritone.utils.pathing.PathingBlockType
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00635
 *  minecraft.class00729
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class05946
 *  minecraft.class06761
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class07299
 *  minecraft.class07348
 *  minecraft.class07376
 *  minecraft.class07662
 */
package baritone.cache;

import baritone.api.utils.BlockUtils;
import baritone.cache.CachedChunk;
import baritone.pathing.movement.MovementHelper;
import baritone.utils.BlockStateInterface;
import baritone.utils.pathing.PathingBlockType;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.List;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00635;
import minecraft.class00729;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class05946;
import minecraft.class06761;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class07299;
import minecraft.class07348;
import minecraft.class07376;
import minecraft.class07662;

public final class ChunkPacker {
    public static CachedChunk pack(class00570 class005702) {
        int n;
        int n2;
        class00554[] class00554Array;
        HashMap<String, List> hashMap = new HashMap<String, List>();
        int n3 = class005702.J().method_8597().Z();
        BitSet bitSet = new BitSet(CachedChunk.size((int)n3));
        try {
            class00554Array = class005702.u();
            for (n2 = 0; n2 < n3 / 16; ++n2) {
                class00554 class005542 = class00554Array[n2];
                if (class005542 == null) continue;
                class07348 class073482 = class005542.B();
                n = n2 << 4;
                for (int i = 0; i < 16; ++i) {
                    int n4 = i | n;
                    for (int j = 0; j < 16; ++j) {
                        for (int k = 0; k < 16; ++k) {
                            int n5 = CachedChunk.getPositionIndex((int)k, (int)n4, (int)j);
                            class00500 class005002 = (class00500)class073482.N(k, i, j);
                            boolean[] blArray = ChunkPacker.getPathingBlockType(class005002, class005702, k, n4 + class005702.method_31607(), j).getBits();
                            bitSet.set(n5, blArray[0]);
                            bitSet.set(n5 + 1, blArray[1]);
                            class00891 class008912 = class005002.i();
                            if (!CachedChunk.BLOCKS_TO_KEEP_TRACK_OF.contains((Object)class008912)) continue;
                            String string2 = BlockUtils.blockToString((class00891)class008912);
                            hashMap.computeIfAbsent(string2, string -> new ArrayList()).add(new class07209(k, n4 + class005702.method_31607(), j));
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        class00554Array = new class00500[256];
        for (n2 = 0; n2 < 16; ++n2) {
            block7: for (int i = 0; i < 16; ++i) {
                for (int j = n3 - 1; j >= 0; --j) {
                    n = CachedChunk.getPositionIndex((int)i, (int)j, (int)n2);
                    if (!bitSet.get(n) && !bitSet.get(n + 1)) continue;
                    class00554Array[n2 << 4 | i] = BlockStateInterface.getFromChunk((class00570)class005702, (int)i, (int)j, (int)n2);
                    continue block7;
                }
                class00554Array[n2 << 4 | i] = class00869.N.W();
            }
        }
        return new CachedChunk(class005702.R().B, class005702.R().Z, n3, bitSet, (class00500[])class00554Array, hashMap, System.currentTimeMillis());
    }

    private ChunkPacker() {
    }

    public static class00500 pathingTypeToBlock(PathingBlockType pathingBlockType, class07376 class073762, class05946<class07299> class059462) {
        switch (pathingBlockType) {
            case AIR: {
                return class00869.N.W();
            }
            case WATER: {
                return class00869.K.W();
            }
            case AVOID: {
                return class00869.V.W();
            }
            case SOLID: {
                if (class059462 == class07299.field_25180) {
                    return class00869.id.W();
                }
                if (class059462 == class07299.field_25181) {
                    return class00869.MP.W();
                }
                return class00869.y.W();
            }
        }
        return null;
    }

    private static PathingBlockType getPathingBlockType(class00500 class005002, class00570 class005702, int n, int n2, int n3) {
        class00891 class008912 = class005002.i();
        if (MovementHelper.isWater(class005002)) {
            if (MovementHelper.possiblyFlowing(class005002)) {
                return PathingBlockType.AVOID;
            }
            int n4 = n2 - class005702.J().method_8597().B();
            if (n != 15 && MovementHelper.possiblyFlowing(BlockStateInterface.getFromChunk((class00570)class005702, (int)(n + 1), (int)n4, (int)n3)) || n != 0 && MovementHelper.possiblyFlowing(BlockStateInterface.getFromChunk((class00570)class005702, (int)(n - 1), (int)n4, (int)n3)) || n3 != 15 && MovementHelper.possiblyFlowing(BlockStateInterface.getFromChunk((class00570)class005702, (int)n, (int)n4, (int)(n3 + 1))) || n3 != 0 && MovementHelper.possiblyFlowing(BlockStateInterface.getFromChunk((class00570)class005702, (int)n, (int)n4, (int)(n3 - 1)))) {
                return PathingBlockType.AVOID;
            }
            if (n == 0 || n == 15 || n3 == 0 || n3 == 15) {
                class06889 class068892 = class005002.Y().L((class07290)class005702.J(), new class07209(n + (class005702.R().B << 4), n2, n3 + (class005702.R().Z << 4)));
                if (class068892.M != 0.0 || class068892.Z != 0.0) {
                    return PathingBlockType.WATER;
                }
                return PathingBlockType.AVOID;
            }
            return PathingBlockType.WATER;
        }
        if (MovementHelper.avoidWalkingInto(class005002) || MovementHelper.isBottomSlab(class005002)) {
            return PathingBlockType.AVOID;
        }
        if (class008912 instanceof class07662 || class008912 instanceof class00635 || class008912 instanceof class06761 || class008912 instanceof class00729) {
            return PathingBlockType.AIR;
        }
        return PathingBlockType.SOLID;
    }
}


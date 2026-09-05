/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.cache.ICachedWorld
 *  baritone.api.cache.IWorldScanner
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.api.utils.IPlayerContext
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class01688
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07348
 */
package baritone.cache;

import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IWorldScanner;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.IPlayerContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.IntStream;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class01688;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07348;

public enum WorldScanner implements IWorldScanner
{
    INSTANCE;


    public int repack(IPlayerContext iPlayerContext, int n) {
        class00558 class005582 = iPlayerContext.world().method_8398();
        ICachedWorld iCachedWorld = iPlayerContext.worldData().getCachedWorld();
        BetterBlockPos betterBlockPos = iPlayerContext.playerFeet();
        int n2 = betterBlockPos.method_10263() >> 4;
        int n3 = betterBlockPos.method_10260() >> 4;
        int n4 = n2 - n;
        int n5 = n3 - n;
        int n6 = n2 + n;
        int n7 = n3 + n;
        int n8 = 0;
        for (int i = n4; i <= n6; ++i) {
            for (int j = n5; j <= n7; ++j) {
                class00570 class005702 = class005582.N(i, j, false);
                if (class005702 == null || class005702.O()) continue;
                ++n8;
                iCachedWorld.queueForPacking(class005702);
            }
        }
        return n8;
    }

    public int repack(IPlayerContext iPlayerContext) {
        return this.repack(iPlayerContext, 40);
    }

    public List<class07209> scanChunk(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, class07321 class073212, int n, int n2) {
        if (blockOptionalMetaLookup.blocks().isEmpty()) {
            return Collections.emptyList();
        }
        class01688 class016882 = (class01688)iPlayerContext.world().method_8398();
        class00570 class005702 = class016882.N(class073212.B, class073212.Z, null, false);
        int n3 = iPlayerContext.playerFeet().method_10264();
        if (class005702 == null || class005702.O()) {
            return Collections.emptyList();
        }
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        this.scanChunkInto(class073212.B << 4, class073212.Z << 4, iPlayerContext.world().method_8597().B(), class005702, blockOptionalMetaLookup, arrayList, n, n2, n3, IntStream.range(0, iPlayerContext.world().method_8597().Z() / 16).toArray());
        return arrayList;
    }

    public List<class07209> scanChunkRadius(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, int n3, int n4, int n5) {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        if (blockOptionalMetaLookup.blocks().isEmpty()) {
            return arrayList;
        }
        class01688 class016882 = (class01688)iPlayerContext.world().method_8398();
        int n6 = n5 * n5;
        int n7 = iPlayerContext.playerFeet().method_10263() >> 4;
        int n8 = iPlayerContext.playerFeet().method_10260() >> 4;
        int n9 = iPlayerContext.playerFeet().method_10264() - iPlayerContext.world().method_8597().B();
        int n10 = n9 >> 4;
        int[] nArray = IntStream.range(0, iPlayerContext.world().method_8597().Z() / 16).boxed().sorted(Comparator.comparingInt(n2 -> Math.abs(n2 - n10))).mapToInt(n -> n).toArray();
        int n11 = 0;
        boolean bl = false;
        while (true) {
            boolean bl2 = true;
            boolean bl3 = false;
            for (int i = -n11; i <= n11; ++i) {
                for (int j = -n11; j <= n11; ++j) {
                    int n12 = i * i + j * j;
                    if (n12 != n11) continue;
                    bl3 = true;
                    int n13 = i + n7;
                    int n14 = j + n8;
                    class00570 class005702 = class016882.N(n13, n14, null, false);
                    if (class005702 == null) continue;
                    bl2 = false;
                    if (!this.scanChunkInto(n13 << 4, n14 << 4, iPlayerContext.world().method_8597().B(), class005702, blockOptionalMetaLookup, arrayList, n3, n4, n9, nArray)) continue;
                    bl = true;
                }
            }
            if (bl2 && bl3 || arrayList.size() >= n3 && (n11 > n6 || n11 > 1 && bl)) {
                return arrayList;
            }
            ++n11;
        }
    }

    private boolean scanChunkInto(int n, int n2, int n3, class00570 class005702, BlockOptionalMetaLookup blockOptionalMetaLookup, Collection<class07209> collection, int n4, int n5, int n6, int[] nArray) {
        class00554[] class00554Array = class005702.u();
        boolean bl = false;
        for (int n7 : nArray) {
            class00554 class005542 = class00554Array[n7];
            if (class005542 == null || class005542.L()) continue;
            int n8 = n7 << 4;
            class07348 class073482 = class005542.B();
            for (int i = 0; i < 16; ++i) {
                for (int j = 0; j < 16; ++j) {
                    for (int k = 0; k < 16; ++k) {
                        class00500 class005002 = (class00500)class073482.N(k, i, j);
                        if (!blockOptionalMetaLookup.has(class005002)) continue;
                        int n9 = n8 | i;
                        if (collection.size() >= n4) {
                            if (Math.abs(n9 - n6) < n5) {
                                bl = true;
                            } else if (bl) {
                                return true;
                            }
                        }
                        collection.add(new class07209(n | k, n9 + n3, n2 | j));
                    }
                }
            }
        }
        return bl;
    }
}


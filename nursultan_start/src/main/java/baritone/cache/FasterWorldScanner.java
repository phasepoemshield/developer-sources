/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.cache.ICachedWorld
 *  baritone.api.cache.IWorldScanner
 *  baritone.api.utils.BetterBlockPos
 *  baritone.api.utils.BlockOptionalMeta
 *  baritone.api.utils.BlockOptionalMetaLookup
 *  baritone.api.utils.IPlayerContext
 *  baritone.utils.accessor.IPalettedContainer
 *  io.netty.buffer.Unpooled
 *  minecraft.class00500
 *  minecraft.class00551
 *  minecraft.class00554
 *  minecraft.class00558
 *  minecraft.class00570
 *  minecraft.class00667
 *  minecraft.class00750
 *  minecraft.class00891
 *  minecraft.class01822
 *  minecraft.class04552
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07340
 *  minecraft.class07348
 */
package baritone.cache;

import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IWorldScanner;
import baritone.api.utils.BetterBlockPos;
import baritone.api.utils.BlockOptionalMeta;
import baritone.api.utils.BlockOptionalMetaLookup;
import baritone.api.utils.IPlayerContext;
import baritone.utils.accessor.IPalettedContainer;
import io.netty.buffer.Unpooled;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00500;
import minecraft.class00551;
import minecraft.class00554;
import minecraft.class00558;
import minecraft.class00570;
import minecraft.class00667;
import minecraft.class00750;
import minecraft.class00891;
import minecraft.class01822;
import minecraft.class04552;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07340;
import minecraft.class07348;

public final class FasterWorldScanner
extends Enum<FasterWorldScanner>
implements IWorldScanner {
    public static final /* enum */ FasterWorldScanner INSTANCE = new FasterWorldScanner();
    private static final class00500[] PALETTE_REGISTRY_SENTINEL;
    private static final /* synthetic */ FasterWorldScanner[] $VALUES;

    static {
        $VALUES = FasterWorldScanner.$values();
        PALETTE_REGISTRY_SENTINEL = new class00500[0];
    }

    public static FasterWorldScanner[] values() {
        return (FasterWorldScanner[])$VALUES.clone();
    }

    public static FasterWorldScanner valueOf(String string) {
        return Enum.valueOf(FasterWorldScanner.class, string);
    }

    private static /* synthetic */ FasterWorldScanner[] $values() {
        return new FasterWorldScanner[]{INSTANCE};
    }

    private static class00500[] getPalette(class07340<class00500> class073402) {
        if (class073402 instanceof class00551) {
            return PALETTE_REGISTRY_SENTINEL;
        }
        class00667 class006672 = new class00667(Unpooled.buffer());
        class073402.method_12287(class006672, (class00750)class00891.U);
        int n = class006672.E();
        class00500[] class00500Array = new class00500[n];
        for (int i = 0; i < n; ++i) {
            class00500 class005002 = (class00500)class00891.U.N(class006672.E());
            assert (class005002 != null);
            class00500Array[i] = class005002;
        }
        return class00500Array;
    }

    private boolean[] getIncludedFilterIndicesFromRegistry(BlockOptionalMetaLookup blockOptionalMetaLookup) {
        boolean[] blArray = new boolean[class00891.U.L()];
        for (BlockOptionalMeta blockOptionalMeta : blockOptionalMetaLookup.blocks()) {
            for (class00500 class005002 : blockOptionalMeta.getAllBlockStates()) {
                blArray[class00891.U.N((Object)class005002)] = true;
            }
        }
        return blArray;
    }

    public int repack(IPlayerContext iPlayerContext) {
        return this.repack(iPlayerContext, 40);
    }

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

    public List<class07209> scanChunk(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, class07321 class073212, int n, int n2) {
        Stream<class07209> stream = this.scanChunkInternal(iPlayerContext, blockOptionalMetaLookup, class073212);
        if (n >= 0) {
            stream = stream.limit(n);
        }
        return stream.collect(Collectors.toList());
    }

    public List<class07209> scanChunkRadius(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, int n, int n2, int n3) {
        assert (iPlayerContext.world() != null);
        if (n3 < 0) {
            throw new IllegalArgumentException("chunkRange must be >= 0");
        }
        return this.scanChunksInternal(iPlayerContext, blockOptionalMetaLookup, FasterWorldScanner.getChunkRange(iPlayerContext.playerFeet().x >> 4, iPlayerContext.playerFeet().z >> 4, n3), n);
    }

    private List<class07209> scanChunksInternal(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, List<class07321> list, int n) {
        assert (iPlayerContext.world() != null);
        try {
            Stream stream = list.parallelStream().flatMap(class073212 -> this.scanChunkInternal(iPlayerContext, blockOptionalMetaLookup, (class07321)class073212));
            if (n >= 0) {
                stream = stream.limit(n);
            }
            return stream.collect(Collectors.toList());
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw exception;
        }
    }

    private void visitSection(BlockOptionalMetaLookup blockOptionalMetaLookup, class00554 class005542, List<class07209> list, long l, int n, long l2) {
        if (class005542 == null || class005542.L()) {
            return;
        }
        class07348 class073482 = class005542.B();
        if (((IPalettedContainer)class073482).getStorage() == null) {
            return;
        }
        class07340 class073402 = ((IPalettedContainer)class073482).getPalette();
        if (class073402 instanceof class01822) {
            if (blockOptionalMetaLookup.has((class00500)class073402.method_12288(0))) {
                for (int i = 0; i < 16; ++i) {
                    for (int j = 0; j < 16; ++j) {
                        for (int k = 0; k < 16; ++k) {
                            list.add(new class07209((int)l + i, n + j, (int)l2 + k));
                        }
                    }
                }
            }
            return;
        }
        boolean[] blArray = this.getIncludedFilterIndices(blockOptionalMetaLookup, (class07340<class00500>)class073402);
        if (blArray.length == 0) {
            return;
        }
        class04552 class045522 = ((IPalettedContainer)class005542.B()).getStorage();
        long[] lArray = class045522.N();
        int n2 = class045522.y();
        int n3 = class045522.L();
        long l3 = (1L << n3) - 1L;
        int n4 = 0;
        for (int i = 0; i < lArray.length && n4 < n2; ++i) {
            long l4 = lArray[i];
            for (int j = 0; j <= 64 - n3 && n4 < n2; j += n3, ++n4) {
                int n5 = (int)(l4 >> j & l3);
                if (!blArray[n5]) continue;
                list.add(new class07209((int)l + (n4 & 0xFF & 0xF), n + (n4 >> 8), (int)l2 + ((n4 & 0xFF) >> 4)));
            }
        }
    }

    public static List<class07321> getChunkRange(int n, int n2, int n3) {
        ArrayList<class07321> arrayList = new ArrayList<class07321>();
        arrayList.add(new class07321(n, n2));
        for (int i = 1; i < n3; ++i) {
            for (int j = 0; j <= i; ++j) {
                arrayList.add(new class07321(n - j, n2 - i));
                if (j != 0) {
                    arrayList.add(new class07321(n + j, n2 - i));
                    arrayList.add(new class07321(n - j, n2 + i));
                }
                arrayList.add(new class07321(n + j, n2 + i));
                if (j == i) continue;
                arrayList.add(new class07321(n - i, n2 - j));
                arrayList.add(new class07321(n + i, n2 - j));
                if (j == 0) continue;
                arrayList.add(new class07321(n - i, n2 + j));
                arrayList.add(new class07321(n + i, n2 + j));
            }
        }
        return arrayList;
    }

    private Stream<class07209> scanChunkInternal(IPlayerContext iPlayerContext, BlockOptionalMetaLookup blockOptionalMetaLookup, class07321 class073212) {
        class00558 class005582 = iPlayerContext.world().method_8398();
        if (!class005582.L(class073212.B, class073212.Z)) {
            return Stream.empty();
        }
        long l = (long)class073212.B << 4;
        long l2 = (long)class073212.Z << 4;
        int n = iPlayerContext.playerFeet().y - iPlayerContext.world().method_31607() >> 4;
        return this.collectChunkSections(blockOptionalMetaLookup, class005582.N(class073212.B, class073212.Z, false), l, l2, n).stream();
    }

    private List<class07209> collectChunkSections(BlockOptionalMetaLookup blockOptionalMetaLookup, class00570 class005702, long l, long l2, int n) {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        int n2 = class005702.method_31607();
        class00554[] class00554Array = class005702.u();
        int n3 = class00554Array.length;
        int n4 = n - 1;
        for (int i = n; n4 >= 0 || i < n3; ++i, --n4) {
            if (i < n3) {
                this.visitSection(blockOptionalMetaLookup, class00554Array[i], arrayList, l, n2 + i * 16, l2);
            }
            if (n4 < 0) continue;
            this.visitSection(blockOptionalMetaLookup, class00554Array[n4], arrayList, l, n2 + n4 * 16, l2);
        }
        return arrayList;
    }

    private boolean[] getIncludedFilterIndices(BlockOptionalMetaLookup blockOptionalMetaLookup, class07340<class00500> class073402) {
        boolean bl = false;
        class00500[] class00500Array = FasterWorldScanner.getPalette(class073402);
        if (class00500Array == PALETTE_REGISTRY_SENTINEL) {
            return this.getIncludedFilterIndicesFromRegistry(blockOptionalMetaLookup);
        }
        int n = class00500Array.length;
        boolean[] blArray = new boolean[n];
        for (int i = 0; i < n; ++i) {
            class00500 class005002 = class00500Array[i];
            if (blockOptionalMetaLookup.has(class005002)) {
                blArray[i] = true;
                bl = true;
                continue;
            }
            blArray[i] = false;
        }
        if (!bl) {
            return new boolean[0];
        }
        return blArray;
    }
}


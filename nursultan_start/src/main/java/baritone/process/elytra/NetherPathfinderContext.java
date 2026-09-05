/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.event.events.BlockChangeEvent
 *  dev.babbaj.pathfinder.NetherPathfinder
 *  dev.babbaj.pathfinder.Octree
 *  dev.babbaj.pathfinder.PathSegment
 *  minecraft.class00500
 *  minecraft.class00554
 *  minecraft.class00570
 *  minecraft.class00869
 *  minecraft.class04552
 *  minecraft.class06889
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07342
 *  minecraft.class07348
 */
package baritone.process.elytra;

import baritone.Baritone;
import baritone.api.event.events.BlockChangeEvent;
import baritone.process.elytra.BlockStateOctreeInterface;
import baritone.process.elytra.PathCalculationException;
import baritone.utils.accessor.IPalettedContainer;
import dev.babbaj.pathfinder.NetherPathfinder;
import dev.babbaj.pathfinder.Octree;
import dev.babbaj.pathfinder.PathSegment;
import java.lang.ref.SoftReference;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import minecraft.class00500;
import minecraft.class00554;
import minecraft.class00570;
import minecraft.class00869;
import minecraft.class04552;
import minecraft.class06889;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07342;
import minecraft.class07348;

public final class NetherPathfinderContext {
    private static final class00500 AIR_BLOCK_STATE = class00869.N.W();
    public final Object cullingLock = new Object();
    final long context;
    private final long seed;
    private final ExecutorService executor;

    public NetherPathfinderContext(long l) {
        this.context = NetherPathfinder.newContext((long)l);
        this.seed = l;
        this.executor = Executors.newSingleThreadExecutor();
    }

    public static boolean isSupported() {
        return NetherPathfinder.isThisSystemSupported();
    }

    public void destroy() {
        this.cancel();
        this.executor.shutdownNow();
        try {
            while (!this.executor.awaitTermination(Long.MAX_VALUE, TimeUnit.NANOSECONDS)) {
            }
        }
        catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
        NetherPathfinder.freeContext((long)this.context);
    }

    public void cancel() {
        NetherPathfinder.cancel((long)this.context);
    }

    public long getSeed() {
        return this.seed;
    }

    public boolean hasChunk(class07321 class073212) {
        return NetherPathfinder.hasChunkFromJava((long)this.context, (int)class073212.B, (int)class073212.Z);
    }

    public boolean raytrace(double d, double d2, double d3, double d4, double d5, double d6) {
        return NetherPathfinder.isVisible((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (double)d, (double)d2, (double)d3, (double)d4, (double)d5, (double)d6);
    }

    public void raytrace(int n, double[] dArray, double[] dArray2, boolean[] blArray, double[] dArray3) {
        NetherPathfinder.raytrace((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (int)n, (double[])dArray, (double[])dArray2, (boolean[])blArray, (double[])dArray3);
    }

    public boolean raytrace(class06889 class068892, class06889 class068893) {
        return NetherPathfinder.isVisible((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (double)class068892.M, (double)class068892.B, (double)class068892.Z, (double)class068893.M, (double)class068893.B, (double)class068893.Z);
    }

    public boolean raytrace(int n, double[] dArray, double[] dArray2, int n2) {
        switch (n2) {
            case 0: {
                return NetherPathfinder.isVisibleMulti((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (int)n, (double[])dArray, (double[])dArray2, (boolean)false) == -1;
            }
            case 1: {
                return NetherPathfinder.isVisibleMulti((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (int)n, (double[])dArray, (double[])dArray2, (boolean)true) == -1;
            }
            case 2: {
                return NetherPathfinder.isVisibleMulti((long)this.context, (int)NetherPathfinder.CACHE_MISS_SOLID, (int)n, (double[])dArray, (double[])dArray2, (boolean)true) != -1;
            }
        }
        throw new IllegalArgumentException("lol");
    }

    public void queueForPacking(class00570 class005702) {
        SoftReference<class00570> softReference = new SoftReference<class00570>(class005702);
        this.executor.execute(() -> {
            class00570 class005702 = (class00570)softReference.get();
            if (class005702 != null) {
                long l = NetherPathfinder.getOrCreateChunk((long)this.context, (int)class005702.R().B, (int)class005702.R().Z);
                NetherPathfinderContext.writeChunkData(class005702, l);
            }
        });
    }

    public CompletableFuture<PathSegment> pathFindAsync(class07209 class072092, class07209 class072093) {
        return CompletableFuture.supplyAsync(() -> {
            PathSegment pathSegment = NetherPathfinder.pathFind((long)this.context, (int)class072092.method_10263(), (int)class072092.method_10264(), (int)class072092.method_10260(), (int)class072093.method_10263(), (int)class072093.method_10264(), (int)class072093.method_10260(), (boolean)true, (boolean)false, (int)10000, ((Boolean)Baritone.settings().elytraPredictTerrain.value == false ? 1 : 0) != 0);
            if (pathSegment == null) {
                throw new PathCalculationException("Path calculation failed");
            }
            return pathSegment;
        }, this.executor);
    }

    private static void writeChunkData(class00570 class005702, long l) {
        try {
            class00554[] class00554Array = class005702.u();
            for (int i = 0; i < 8; ++i) {
                class04552 class045522;
                class00554 class005542 = class00554Array[i];
                if (class005542 == null) continue;
                class07348 class073482 = class005542.B();
                IPalettedContainer iPalettedContainer = (IPalettedContainer)class073482;
                int n = -1;
                if (iPalettedContainer.getPalette().method_19525(class005002 -> class005002.equals((Object)AIR_BLOCK_STATE))) {
                    n = iPalettedContainer.getPalette().method_12291((Object)AIR_BLOCK_STATE, class07342.N());
                }
                if ((class045522 = iPalettedContainer.getStorage()) == null) continue;
                long[] lArray = class045522.N();
                int n2 = class045522.y();
                int n3 = class045522.L();
                long l2 = (1L << n3) - 1L;
                int n4 = i << 4;
                int n5 = 0;
                for (int j = 0; j < lArray.length && n5 < n2; ++j) {
                    long l3 = lArray[j];
                    for (int k = 0; k <= 64 - n3 && n5 < n2; k += n3, ++n5) {
                        int n6 = (int)(l3 >> k & l2);
                        int n7 = n5 & 0xF;
                        int n8 = n4 + (n5 >> 8);
                        int n9 = n5 >> 4 & 0xF;
                        Octree.setBlock((long)l, (int)n7, (int)n8, (int)n9, (n6 != n ? 1 : 0) != 0);
                    }
                }
            }
            Octree.setIsFromJava((long)l);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            throw new RuntimeException(exception);
        }
    }

    public void queueCacheCulling(int n, int n2, int n3, BlockStateOctreeInterface blockStateOctreeInterface) {
        this.executor.execute(() -> {
            Object object = this.cullingLock;
            synchronized (object) {
                blockStateOctreeInterface.chunkPtr = 0L;
                NetherPathfinder.cullFarChunks((long)this.context, (int)n, (int)n2, (int)n3);
            }
        });
    }

    public void queueBlockUpdate(BlockChangeEvent blockChangeEvent) {
        this.executor.execute(() -> {
            class07321 class073212 = blockChangeEvent.getChunkPos();
            long l = NetherPathfinder.getChunkPointer((long)this.context, (int)class073212.B, (int)class073212.Z);
            if (l == 0L) {
                return;
            }
            blockChangeEvent.getBlocks().forEach(pair -> {
                class07209 class072092 = (class07209)pair.first();
                if (class072092.method_10264() >= 128) {
                    return;
                }
                boolean bl = pair.second() != AIR_BLOCK_STATE;
                Octree.setBlock((long)l, (int)(class072092.method_10263() & 0xF), (int)class072092.method_10264(), (int)(class072092.method_10260() & 0xF), (boolean)bl);
            });
        });
    }
}


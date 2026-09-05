/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.cache.ICachedRegion
 *  baritone.api.cache.ICachedWorld
 *  baritone.api.cache.IWorldData
 *  com.google.common.cache.CacheBuilder
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  minecraft.class00570
 *  minecraft.class05946
 *  minecraft.class07209
 *  minecraft.class07299
 *  minecraft.class07321
 *  minecraft.class07376
 */
package baritone.cache;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.cache.ICachedRegion;
import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IWorldData;
import baritone.api.utils.Helper;
import baritone.cache.CachedChunk;
import baritone.cache.CachedRegion;
import baritone.cache.CachedWorld$PackerThread;
import com.google.common.cache.CacheBuilder;
import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import minecraft.class00570;
import minecraft.class05946;
import minecraft.class07209;
import minecraft.class07299;
import minecraft.class07321;
import minecraft.class07376;

public final class CachedWorld
implements ICachedWorld,
Helper {
    private static final int REGION_MAX = 58594;
    private Long2ObjectMap<CachedRegion> cachedRegions = new Long2ObjectOpenHashMap();
    private final String directory;
    final LinkedBlockingQueue<class07321> toPackQueue = new LinkedBlockingQueue();
    final Map<class07321, class00570> toPackMap = CacheBuilder.newBuilder().softValues().build().asMap();
    private final class07376 dimension;
    private final class05946<class07299> dimensionId;

    CachedWorld(Path path, class07376 class073762, class05946<class07299> class059462) {
        if (!Files.exists(path, new LinkOption[0])) {
            try {
                Files.createDirectories(path, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        this.directory = path.toString();
        this.dimension = class073762;
        this.dimensionId = class059462;
        System.out.println("Cached world directory: " + String.valueOf(path));
        Baritone.getExecutor().execute(new CachedWorld$PackerThread(this));
        Baritone.getExecutor().execute(() -> {
            try {
                Thread.sleep(30000L);
                while (true) {
                    this.save();
                    Thread.sleep(600000L);
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                return;
            }
        });
    }

    public final void save() {
        if (!((Boolean)Baritone.settings().chunkCaching.value).booleanValue()) {
            System.out.println("Not saving to disk; chunk caching is disabled.");
            this.allRegions().forEach(cachedRegion -> {
                if (cachedRegion != null) {
                    cachedRegion.removeExpired();
                }
            });
            this.prune();
            return;
        }
        long l = System.nanoTime() / 1000000L;
        this.allRegions().parallelStream().forEach(cachedRegion -> {
            if (cachedRegion != null) {
                cachedRegion.save(this.directory);
            }
        });
        long l2 = System.nanoTime() / 1000000L;
        System.out.println("World save took " + (l2 - l) + "ms");
        this.prune();
    }

    public final synchronized CachedRegion getRegion(int n, int n2) {
        return (CachedRegion)this.cachedRegions.get(this.getRegionID(n, n2));
    }

    public final boolean isCached(int n, int n2) {
        ICachedRegion iCachedRegion = this.getRegion(n >> 9, n2 >> 9);
        if (iCachedRegion == null) {
            return false;
        }
        return iCachedRegion.isCached(n & 0x1FF, n2 & 0x1FF);
    }

    private synchronized List<CachedRegion> allRegions() {
        return new ArrayList<CachedRegion>((Collection<CachedRegion>)this.cachedRegions.values());
    }

    public final void reloadAllFromDisk() {
        long l = System.nanoTime() / 1000000L;
        this.allRegions().forEach(cachedRegion -> {
            if (cachedRegion != null) {
                cachedRegion.load(this.directory);
            }
        });
        long l2 = System.nanoTime() / 1000000L;
        System.out.println("World load took " + (l2 - l) + "ms");
    }

    public final ArrayList<class07209> getLocationsOf(String string, int n, int n2, int n3, int n4) {
        ArrayList<class07209> arrayList = new ArrayList<class07209>();
        int n5 = n2 >> 9;
        int n6 = n3 >> 9;
        for (int i = 0; i <= n4; ++i) {
            for (int j = -i; j <= i; ++j) {
                for (int k = -i; k <= i; ++k) {
                    int n7;
                    int n8;
                    CachedRegion cachedRegion;
                    int n9 = j * j + k * k;
                    if (n9 != i || (cachedRegion = this.getOrCreateRegion(n8 = j + n5, n7 = k + n6)) == null) continue;
                    arrayList.addAll(cachedRegion.getLocationsOf(string));
                }
            }
            if (arrayList.size() < n) continue;
            return arrayList;
        }
        return arrayList;
    }

    public final void queueForPacking(class00570 class005702) {
        if (this.toPackMap.put(class005702.R(), class005702) == null) {
            this.toPackQueue.add(class005702.R());
        }
    }

    void updateCachedChunk(CachedChunk cachedChunk) {
        CachedRegion cachedRegion = this.getOrCreateRegion(cachedChunk.x >> 5, cachedChunk.z >> 5);
        cachedRegion.updateCachedChunk(cachedChunk.x & 0x1F, cachedChunk.z & 0x1F, cachedChunk);
    }

    private synchronized CachedRegion getOrCreateRegion(int n, int n2) {
        return (CachedRegion)this.cachedRegions.computeIfAbsent(this.getRegionID(n, n2), l -> {
            CachedRegion cachedRegion = new CachedRegion(n, n2, this.dimension, this.dimensionId);
            cachedRegion.load(this.directory);
            return cachedRegion;
        });
    }

    private long getRegionID(int n, int n2) {
        if (!this.isRegionInWorld(n, n2)) {
            return 0L;
        }
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    private boolean isRegionInWorld(int n, int n2) {
        return n <= 58594 && n >= -58594 && n2 <= 58594 && n2 >= -58594;
    }

    public void tryLoadFromDisk(int n, int n2) {
        this.getOrCreateRegion(n, n2);
    }

    public final boolean regionLoaded(int n, int n2) {
        return this.getRegion(n >> 9, n2 >> 9) != null;
    }

    private class07209 guessPosition() {
        for (Object object : BaritoneAPI.getProvider().getAllBaritones()) {
            IWorldData object2 = object.getWorldProvider().getCurrentWorld();
            if (object2 == null || object2.getCachedWorld() != this || object.getPlayerContext().player() == null) continue;
            return object.getPlayerContext().playerFeet();
        }
        Object object = null;
        for (CachedRegion cachedRegion : this.allRegions()) {
            CachedChunk cachedChunk;
            if (cachedRegion == null || (cachedChunk = cachedRegion.mostRecentlyModified()) == null || object != null && ((CachedChunk)object).cacheTimestamp >= cachedChunk.cacheTimestamp) continue;
            object = cachedChunk;
        }
        if (object == null) {
            return new class07209(0, 0, 0);
        }
        return new class07209((((CachedChunk)object).x << 4) + 8, 0, (((CachedChunk)object).z << 4) + 8);
    }

    private synchronized void prune() {
        if (!((Boolean)Baritone.settings().pruneRegionsFromRAM.value).booleanValue()) {
            return;
        }
        class07209 class072092 = this.guessPosition();
        for (CachedRegion cachedRegion : this.allRegions()) {
            if (cachedRegion == null) continue;
            int n = (cachedRegion.getX() << 9) + 256 - class072092.method_10263();
            int n2 = (cachedRegion.getZ() << 9) + 256 - class072092.method_10260();
            double d = Math.sqrt(n * n + n2 * n2);
            if (!(d > 1024.0)) continue;
            this.logDebug("Deleting cached region from ram");
            this.cachedRegions.remove(this.getRegionID(cachedRegion.getX(), cachedRegion.getZ()));
        }
    }
}


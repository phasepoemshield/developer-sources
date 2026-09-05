/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.ICachedWorld
 *  baritone.api.cache.IWaypointCollection
 *  baritone.api.cache.IWorldData
 *  baritone.cache.CachedWorld
 *  minecraft.class05946
 *  minecraft.class07299
 *  minecraft.class07376
 */
package baritone.cache;

import baritone.Baritone;
import baritone.api.cache.ICachedWorld;
import baritone.api.cache.IWaypointCollection;
import baritone.api.cache.IWorldData;
import baritone.cache.CachedWorld;
import baritone.cache.WaypointCollection;
import java.nio.file.Path;
import minecraft.class05946;
import minecraft.class07299;
import minecraft.class07376;

public class WorldData
implements IWorldData {
    public final CachedWorld cache;
    private final WaypointCollection waypoints;
    public final Path directory;
    public final class07376 dimension;

    WorldData(Path path, class07376 class073762, class05946<class07299> class059462) {
        this.directory = path;
        this.cache = new CachedWorld(path.resolve("cache"), class073762, class059462);
        this.waypoints = new WaypointCollection(path.resolve("waypoints"));
        this.dimension = class073762;
    }

    public void onClose() {
        Baritone.getExecutor().execute(() -> {
            System.out.println("Started saving the world in a new thread");
            this.cache.save();
        });
    }

    public ICachedWorld getCachedWorld() {
        return this.cache;
    }

    public IWaypointCollection getWaypoints() {
        return this.waypoints;
    }
}


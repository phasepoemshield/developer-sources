/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.cache.IWorldProvider
 *  baritone.api.utils.IPlayerContext
 *  minecraft.class01894
 *  minecraft.class04568
 *  minecraft.class05034
 *  minecraft.class05071
 *  minecraft.class05946
 *  minecraft.class07299
 *  org.apache.commons.lang3.SystemUtils
 */
package baritone.cache;

import baritone.Baritone;
import baritone.api.cache.IWorldProvider;
import baritone.api.utils.IPlayerContext;
import baritone.cache.WorldData;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import minecraft.class01894;
import minecraft.class04568;
import minecraft.class05034;
import minecraft.class05071;
import minecraft.class05946;
import minecraft.class07299;
import org.apache.commons.lang3.SystemUtils;

public class WorldProvider
implements IWorldProvider {
    private static final Map<Path, WorldData> worldCache = new HashMap<Path, WorldData>();
    private final Baritone baritone;
    private final IPlayerContext ctx;
    private WorldData currentWorld;
    private class07299 mcWorld;

    public WorldProvider(Baritone baritone) {
        this.baritone = baritone;
        this.ctx = baritone.getPlayerContext();
    }

    public final void initWorld(class07299 class072992) {
        this.getSaveDirectories(class072992).ifPresent(class050342 -> {
            Path path2 = (Path)class050342.N();
            Path path3 = (Path)class050342.y();
            try {
                Files.createDirectories(path3, new FileAttribute[0]);
                Files.write(path3.resolve("readme.txt"), "https://github.com/cabaletta/baritone\n".getBytes(StandardCharsets.US_ASCII), new OpenOption[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
            Path path4 = this.getWorldDataDirectory(path2, class072992);
            try {
                Files.createDirectories(path4, new FileAttribute[0]);
            }
            catch (IOException iOException) {
                // empty catch block
            }
            System.out.println("Baritone world data dir: " + String.valueOf(path4));
            Map<Path, WorldData> map = worldCache;
            synchronized (map) {
                this.currentWorld = worldCache.computeIfAbsent(path4, path -> new WorldData((Path)path, class072992.method_8597(), (class05946<class07299>)class072992.method_27983()));
            }
            this.mcWorld = this.ctx.world();
        });
    }

    public final void closeWorld() {
        WorldData worldData = this.currentWorld;
        this.currentWorld = null;
        this.mcWorld = null;
        if (worldData == null) {
            return;
        }
        worldData.onClose();
    }

    private void detectAndHandleBrokenLoading() {
        if (this.mcWorld != this.ctx.world()) {
            if (this.currentWorld != null) {
                System.out.println("mc.world unloaded unnoticed! Unloading Baritone cache now.");
                this.closeWorld();
            }
            if (this.ctx.world() != null) {
                System.out.println("mc.world loaded unnoticed! Loading Baritone cache now.");
                this.initWorld(this.ctx.world());
            }
        } else if (this.currentWorld == null && this.ctx.world() != null && (this.ctx.minecraft().v() || this.ctx.minecraft().yN() != null)) {
            System.out.println("Retrying to load Baritone cache");
            this.initWorld(this.ctx.world());
        }
    }

    public final WorldData getCurrentWorld() {
        this.detectAndHandleBrokenLoading();
        return this.currentWorld;
    }

    private Optional<class05034<Path, Path>> getSaveDirectories(class07299 class072992) {
        Path path;
        Path path2;
        if (this.ctx.minecraft().v()) {
            path2 = this.ctx.minecraft().Na().N(class05071.E);
            if (path2.relativize(((File)this.ctx.minecraft().l_1).toPath()).getNameCount() != 2) {
                path2 = path2.getParent();
            }
            path = path2 = path2.resolve("baritone");
        } else {
            class04568 class045682 = this.ctx.minecraft().yN();
            if (class045682 == null) {
                System.out.println("World seems to be a replay. Not loading Baritone cache.");
                this.currentWorld = null;
                this.mcWorld = this.ctx.world();
                return Optional.empty();
            }
            String string = class045682.i() ? "realms" : class045682.y;
            if (SystemUtils.IS_OS_WINDOWS) {
                string = string.replace(":", "_");
            }
            path2 = this.baritone.getDirectory().resolve(string);
            path = this.baritone.getDirectory();
        }
        return Optional.of(new class05034((Object)path2, (Object)path));
    }

    private Path getWorldDataDirectory(Path path, class07299 class072992) {
        class01894 class018942 = class072992.method_27983().N();
        int n = class072992.method_8597().z();
        return path.resolve(class018942.y()).resolve(class018942.N() + "_" + n);
    }
}


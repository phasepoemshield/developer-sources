/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  com.google.common.hash.HashFunction
 *  com.mojang.datafixers.util.Either
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  minecraft.class03812
 *  minecraft.class03814
 *  minecraft.class03828
 *  minecraft.class03844
 *  minecraft.class03848
 *  minecraft.class04220
 *  minecraft.class05007
 *  minecraft.class05021
 *  minecraft.class06290
 *  minecraft.class07536
 *  minecraft.class08214
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.hash.HashCode;
import com.google.common.hash.HashFunction;
import com.mojang.datafixers.util.Either;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import java.io.IOException;
import java.net.Proxy;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.Instant;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01797;
import minecraft.class03812;
import minecraft.class03814;
import minecraft.class03828;
import minecraft.class03844;
import minecraft.class03848;
import minecraft.class04220;
import minecraft.class05007;
import minecraft.class05021;
import minecraft.class06290;
import minecraft.class07536;
import minecraft.class08214;
import org.slf4j.Logger;

public class class01789
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 20;
    private final Path L;
    private final class04220<class03844> u;
    private final class08214 i = new class08214((Executor)class07536.z(), "download-queue");

    public class01789(Path path) throws IOException {
        this.L = path;
        class06290.L((Path)path);
        this.u = class04220.N((Codec)class03844.N, (Path)path.resolve("log.json"));
        class03828.N((Path)path, (int)20);
    }

    @Override
    public void close() throws IOException {
        this.i.close();
        this.u.close();
    }

    private class03814 y(class01797 class017972, Map<UUID, class03848> map) {
        class03814 class038142 = new class03814();
        map.forEach((uUID, class038482) -> {
            Path path = this.L.resolve(uUID.toString());
            Path path2 = null;
            try {
                path2 = class05021.N((Path)path, (URL)class038482.N(), class017972.L(), (HashFunction)class017972.N(), (HashCode)class038482.y(), (int)class017972.y(), (Proxy)class017972.u(), (class05007)class017972.i());
                class038142.N().put(uUID, path2);
            }
            catch (Exception exception) {
                N.error("Failed to download {}", (Object)class038482.N(), (Object)exception);
                class038142.y().add(uUID);
            }
            try {
                this.u.N((Object)new class03844(uUID, class038482.N().toString(), Instant.now(), Optional.ofNullable(class038482.y()).map(HashCode::toString), path2 != null ? this.N(path2) : Either.left((Object)"download_failed")));
            }
            catch (Exception exception) {
                N.error("Failed to log download of {}", (Object)class038482.N(), (Object)exception);
            }
        });
        return class038142;
    }

    private Either<String, class03812> N(Path path) {
        try {
            long l = Files.size(path);
            Path path2 = this.L.relativize(path);
            return Either.right((Object)new class03812(path2.toString(), l));
        }
        catch (IOException iOException) {
            N.error("Failed to get file size of {}", (Object)path, (Object)iOException);
            return Either.left((Object)"no_access");
        }
    }

    public CompletableFuture<class03814> N(class01797 class017972, Map<UUID, class03848> map) {
        return CompletableFuture.supplyAsync(() -> this.y(class017972, map), arg_0 -> ((class08214)this.i).N(arg_0));
    }
}


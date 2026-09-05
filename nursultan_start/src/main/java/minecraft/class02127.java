/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.logging.LogUtils
 *  minecraft.class04209
 *  minecraft.class04226
 *  minecraft.class04236
 *  minecraft.class04242
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.time.Clock;
import java.time.LocalDate;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class04209;
import minecraft.class04226;
import minecraft.class04236;
import minecraft.class04242;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class02127
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private static final String y = ".json";
    private static final int L = 7;
    private final class04242 u;
    private @Nullable CompletableFuture<Optional<class04226>> i;

    private class02127(class04242 class042422) {
        this.u = class042422;
    }

    @Override
    public void close() {
        if (this.i != null) {
            this.i.thenAccept(optional -> optional.ifPresent(class04226::close));
        }
    }

    public CompletableFuture<Optional<class04236>> N() {
        if (this.i == null) {
            this.i = CompletableFuture.supplyAsync(() -> {
                try {
                    class04209 class042092 = this.u.N(LocalDate.now(Clock.systemDefaultZone()));
                    FileChannel fileChannel = class042092.i();
                    return Optional.of(new class04226(fileChannel, (Executor)class07536.B()));
                }
                catch (IOException iOException) {
                    N.error("Failed to open channel for telemetry event log", (Throwable)iOException);
                    return Optional.empty();
                }
            }, (Executor)class07536.B());
        }
        return this.i.thenApply(optional -> optional.map(class04226::N));
    }

    public static CompletableFuture<Optional<class02127>> N(Path path) {
        return CompletableFuture.supplyAsync(() -> {
            try {
                class04242 class042422 = class04242.N((Path)path, (String)y);
                class042422.N().N(LocalDate.now(Clock.systemDefaultZone()), 7).N();
                return Optional.of(new class02127(class042422));
            }
            catch (Exception exception) {
                N.error("Failed to create telemetry log manager", (Throwable)exception);
                return Optional.empty();
            }
        }, (Executor)class07536.B());
    }
}


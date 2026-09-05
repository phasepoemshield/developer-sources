/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.authlib.minecraft.TelemetrySession
 *  com.mojang.authlib.minecraft.UserApiService
 *  minecraft.class02090
 *  minecraft.class02097
 *  minecraft.class02104
 *  minecraft.class02108
 *  minecraft.class02117
 *  minecraft.class02127
 *  minecraft.class02129
 *  minecraft.class04199
 *  minecraft.class04236
 *  minecraft.class04771
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.authlib.minecraft.TelemetrySession;
import com.mojang.authlib.minecraft.UserApiService;
import java.io.File;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Consumer;
import java.util.function.Supplier;
import minecraft.class02090;
import minecraft.class02097;
import minecraft.class02104;
import minecraft.class02108;
import minecraft.class02117;
import minecraft.class02127;
import minecraft.class02129;
import minecraft.class04199;
import minecraft.class04236;
import minecraft.class04771;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class03323
implements AutoCloseable {
    private static final AtomicInteger N = new AtomicInteger(1);
    private static final Executor y = Executors.newSingleThreadExecutor(runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("Telemetry-Sender-#" + N.getAndIncrement());
        return thread;
    });
    private final class06202 L;
    private final UserApiService u;
    private final class02108 i;
    private final Path R;
    private final CompletableFuture<Optional<class02127>> M;
    private final Supplier<class02097> B = Suppliers.memoize(this::L);

    private class02097 L() {
        if (!this.L.NC()) {
            return class02097.N;
        }
        TelemetrySession telemetrySession = this.u.newTelemetrySession(y);
        if (!telemetrySession.isEnabled()) {
            return class02097.N;
        }
        CompletionStage completionStage = this.M.thenCompose(optional -> optional.map(class02127::N).orElseGet(() -> CompletableFuture.completedFuture(Optional.empty())));
        return (arg_0, arg_1) -> this.N((CompletableFuture)completionStage, telemetrySession, arg_0, arg_1);
    }

    public class03323(class06202 class062022, UserApiService userApiService, class04771 class047712) {
        this.L = class062022;
        this.u = userApiService;
        class02104 class021042 = class02108.N();
        class047712.R().ifPresent(string -> class021042.N(class02117.N, string));
        class047712.i().ifPresent(string -> class021042.N(class02117.y, string));
        class021042.N(class02117.L, (Object)UUID.randomUUID());
        class021042.N(class02117.u, (Object)class07529.y().comp_4024());
        class021042.N(class02117.i, (Object)class07536.m().N());
        class021042.N(class02117.R, (Object)System.getProperty("os.name"));
        class021042.N(class02117.M, (Object)class06202.Z().N());
        class021042.y(class02117.B, (Object)class06202.p());
        this.i = class021042.N();
        this.R = ((File)class062022.l_1).toPath().resolve("logs/telemetry");
        this.M = class02127.N((Path)this.R);
    }

    @Override
    public void close() {
        this.M.thenAccept(optional -> optional.ifPresent(class02127::close));
    }

    public Path y() {
        return this.R;
    }

    private /* synthetic */ void N(CompletableFuture completableFuture, TelemetrySession telemetrySession, class02129 class021292, Consumer consumer) {
        if (class021292.u() && !class06202.Nq().yz()) {
            return;
        }
        class02104 class021042 = class02108.N();
        class021042.N(this.i);
        class021042.N(class02117.W, (Object)Instant.now());
        class021042.N(class02117.E, (Object)class021292.u());
        consumer.accept(class021042);
        class04199 class041992 = new class04199(class021292, class021042.N());
        completableFuture.thenAccept(optional -> {
            if (optional.isEmpty()) {
                return;
            }
            ((class04236)optional.get()).log(class041992);
            if (!class07529.ND || !class07529.NF) {
                class041992.N(telemetrySession).send();
            }
        });
    }

    public class02090 N(boolean bl, @Nullable Duration duration, @Nullable String string) {
        return new class02090(this.L(), bl, duration, string);
    }

    public class02097 N() {
        return this.B.get();
    }
}


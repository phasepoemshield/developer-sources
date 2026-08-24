/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.loader.api.FabricLoader
 *  net.fabricmc.loader.api.ModContainer
 *  net.minecraft.client.MinecraftClient
 */
package oxxxde;

import java.net.http.HttpClient;
import java.time.Duration;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import net.fabricmc.loader.api.FabricLoader;
import net.fabricmc.loader.api.ModContainer;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0634\u0646;
import oxxxde.\u0635\u0626;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ)\u0010\u000f\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000bH\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b \u0010!R\u001c\u0010#\u001a\n \u001f*\u0004\u0018\u00010\"0\"8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b#\u0010$R\u001c\u0010&\u001a\n \u001f*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b)\u0010*R#\u0010/\u001a\n \u001f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R#\u00102\u001a\n \u001f*\u0004\u0018\u00010\u000b0\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b0\u0010,\u001a\u0004\b1\u0010.R\u0016\u00104\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00105R\u0016\u00106\u001a\u0002038\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b6\u00105R\u0016\u00107\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010\u0019R\u0016\u00108\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u0010\u0019R\u0018\u00109\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:R\u0018\u0010;\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b;\u0010:R\u0018\u0010<\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b<\u0010:\u00a8\u0006="}, d2={"Loxxxde/\u0639\u0632;", "", "<init>", "()V", "", "initialize", "shutdown", "Lnet/minecraft/class_310;", "client", "heartbeatIfNeeded", "(Lnet/minecraft/class_310;)V", "", "uuid", "username", "serverAddress", "sendHeartbeat", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "sendOffline", "(Ljava/lang/String;)V", "", "error", "logFailure", "(Ljava/lang/Throwable;)V", "", "HEARTBEAT_INTERVAL_MS", "J", "FAILURE_LOG_INTERVAL_MS", "Lkotlin/text/Regex;", "validClientVersion", "Lkotlin/text/Regex;", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/net/http/HttpClient;", "httpClient", "Ljava/net/http/HttpClient;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requestInFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "clientVersion$delegate", "Lkotlin/Lazy;", "getClientVersion", "()Ljava/lang/String;", "clientVersion", "minecraftVersion$delegate", "getMinecraftVersion", "minecraftVersion", "", "initialized", "Z", "closed", "lastRequestAt", "lastFailureLogAt", "lastHeartbeatUuid", "Ljava/lang/String;", "lastRequestedUuid", "lastRequestedServerAddress", "rain-visuals"})
public final class \u0639\u0632 {
    private static final Logger logger;
    private static final long FAILURE_LOG_INTERVAL_MS = 60000L;
    private static volatile long lastRequestAt;
    @NotNull
    private static final Lazy clientVersion$delegate;
    @NotNull
    public static final \u0639\u0632 INSTANCE;
    private static volatile boolean closed;
    private static volatile boolean initialized;
    @NotNull
    private static final AtomicBoolean requestInFlight;
    @NotNull
    private static final Regex validClientVersion;
    private static final long HEARTBEAT_INTERVAL_MS = 20000L;
    @Nullable
    private static volatile String lastHeartbeatUuid;
    private static volatile long lastFailureLogAt;
    @Nullable
    private static volatile String lastRequestedUuid;
    @Nullable
    private static volatile String lastRequestedServerAddress;
    private static final HttpClient httpClient;
    @NotNull
    private static final Lazy minecraftVersion$delegate;
    private static final ExecutorService executor;

    private static final String minecraftVersion_delegate$lambda$0$0(ModContainer it) {
        return it.getMetadata().getVersion().getFriendlyString();
    }

    private \u0639\u0632() {
    }

    static {
        INSTANCE = new \u0639\u0632();
        validClientVersion = new Regex("[A-Za-z0-9._+\\-]{1,32}");
        logger = LoggerFactory.getLogger("Rain Presence");
        executor = Executors.newSingleThreadExecutor(\u0639\u0632::executor$lambda$0);
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        requestInFlight = new AtomicBoolean();
        clientVersion$delegate = LazyKt.lazy(\u0639\u0632::clientVersion_delegate$lambda$0);
        minecraftVersion$delegate = LazyKt.lazy(\u0639\u0632::minecraftVersion_delegate$lambda$0);
    }

    private final void sendOffline(String string) {
    }

    private final String getClientVersion() {
        Lazy lazy = clientVersion$delegate;
        return (String)lazy.getValue();
    }

    private static final String clientVersion_delegate$lambda$0$0(ModContainer it) {
        return it.getMetadata().getVersion().getFriendlyString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void heartbeatIfNeeded$lambda$2$0(String $uuid, \u0639\u0632 $this_runCatching, String $username, String $serverAddress) {
        try {
            String previousUuid = lastHeartbeatUuid;
            if (previousUuid != null && !Intrinsics.areEqual(previousUuid, $uuid)) {
                \u0639\u0632 \u0639\u06322 = $this_runCatching;
                try {
                    \u0639\u0632 $this$heartbeatIfNeeded_u24lambda_u242_u240_u240 = \u0639\u06322;
                    boolean bl = false;
                    $this$heartbeatIfNeeded_u24lambda_u242_u240_u240.sendOffline(previousUuid);
                    Object object = Result.constructor-impl(Unit.INSTANCE);
                }
                catch (Throwable throwable) {
                    Object object = Result.constructor-impl(ResultKt.createFailure(throwable));
                }
            }
            $this_runCatching.sendHeartbeat($uuid, $username, $serverAddress);
            lastHeartbeatUuid = $uuid;
        }
        catch (Throwable error) {
            $this_runCatching.logFailure(error);
        }
        finally {
            requestInFlight.set(false);
        }
    }

    private final void heartbeatIfNeeded(MinecraftClient minecraftClient) {
    }

    private final void sendHeartbeat(String string, String string2, String string3) {
    }

    private static final String clientVersion_delegate$lambda$0$1(Function1 $tmp0, Object p0) {
        return (String)$tmp0.invoke(p0);
    }

    private static final String minecraftVersion_delegate$lambda$0() {
        return (String)FabricLoader.getInstance().getModContainer("minecraft").map(arg_0 -> \u0639\u0632.minecraftVersion_delegate$lambda$0$1(\u0639\u0632::minecraftVersion_delegate$lambda$0$0, arg_0)).filter(arg_0 -> \u0639\u0632.minecraftVersion_delegate$lambda$0$2(new \u0634\u0646(validClientVersion), arg_0)).orElse("unknown");
    }

    private static final String clientVersion_delegate$lambda$0() {
        return (String)FabricLoader.getInstance().getModContainer("rain-visuals").map(arg_0 -> \u0639\u0632.clientVersion_delegate$lambda$0$1(\u0639\u0632::clientVersion_delegate$lambda$0$0, arg_0)).filter(arg_0 -> \u0639\u0632.clientVersion_delegate$lambda$0$2(new \u0635\u0626(validClientVersion), arg_0)).orElse("unknown");
    }

    public final void shutdown() {
    }

    private static final boolean minecraftVersion_delegate$lambda$0$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    private final void logFailure(Throwable error) {
        long now = System.currentTimeMillis();
        if (now - lastFailureLogAt < 60000L) {
            return;
        }
        lastFailureLogAt = now;
        logger.warn("Failed to update client presence: {}", (Object)error.getMessage());
    }

    private static final boolean clientVersion_delegate$lambda$0$2(Function1 $tmp0, Object p0) {
        return (Boolean)$tmp0.invoke(p0);
    }

    private static final Thread executor$lambda$0(Runnable runnable) {
        Thread thread2;
        Thread $this$executor_u24lambda_u240_u240 = thread2 = new Thread(runnable, "Rain-Client-Presence");
        boolean bl = false;
        $this$executor_u24lambda_u240_u240.setDaemon(true);
        return thread2;
    }

    public final void initialize() {
    }

    private final String getMinecraftVersion() {
        Lazy lazy = minecraftVersion$delegate;
        return (String)lazy.getValue();
    }

    private static final String minecraftVersion_delegate$lambda$0$1(Function1 $tmp0, Object p0) {
        return (String)$tmp0.invoke(p0);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents$EndTick
 *  net.minecraft.client.MinecraftClient
 *  net.minecraft.client.network.ServerInfo
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import java.net.http.HttpClient;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ServerInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\fH\u0003\u00a2\u0006\u0004\b\u000e\u0010\u000fJ#\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010H\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0014J\u001d\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001aH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020\u001e8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b$\u0010 R\u001c\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b'\u0010(R\u001c\u0010*\u001a\n &*\u0004\u0018\u00010)0)8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b*\u0010+R\u001c\u0010-\u001a\n &*\u0004\u0018\u00010,0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0016\u00104\u001a\u00020\t8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b4\u00103R\u001c\u00105\u001a\b\u0012\u0004\u0012\u00020\u00070\u00128\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b7\u0010 R\u0016\u00108\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b8\u0010 R\u0018\u00109\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b9\u0010:\u00a8\u0006;"}, d2={"Loxxxde/\u062a\u064e;", "", "<init>", "()V", "", "initialize", "shutdown", "Ljava/util/UUID;", "uuid", "", "isRainUser", "(Ljava/util/UUID;)Z", "Lnet/minecraft/class_310;", "client", "checkIfNeeded", "(Lnet/minecraft/class_310;)V", "", "uuids", "", "check", "(Ljava/util/List;)Ljava/util/Set;", "checkBatch", "", "json", "parseOnlineUsers", "(Ljava/lang/String;)Ljava/util/Set;", "", "error", "logFailure", "(Ljava/lang/Throwable;)V", "", "CHECK_INTERVAL_MS", "J", "", "MAX_UUIDS_PER_CHECK", "I", "FAILURE_LOG_INTERVAL_MS", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/net/http/HttpClient;", "httpClient", "Ljava/net/http/HttpClient;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requestInFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "initialized", "Z", "closed", "onlineUsers", "Ljava/util/Set;", "lastRequestAt", "lastFailureLogAt", "lastServerAddress", "Ljava/lang/String;", "rain-visuals"})
public final class \u062a\u064e {
    private static volatile long lastFailureLogAt;
    @NotNull
    public static final \u062a\u064e INSTANCE;
    private static volatile long lastRequestAt;
    private static volatile boolean initialized;
    private static volatile boolean closed;
    private static final Logger logger;
    private static final int MAX_UUIDS_PER_CHECK = 100;
    @NotNull
    private static volatile Set<UUID> onlineUsers;
    private static final ExecutorService executor;
    private static final long CHECK_INTERVAL_MS = 10000L;
    @NotNull
    private static final AtomicBoolean requestInFlight;
    private static final HttpClient httpClient;
    private static final long FAILURE_LOG_INTERVAL_MS = 60000L;
    @Nullable
    private static volatile String lastServerAddress;

    private final Set<UUID> check(List<UUID> list) {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    @Compile
    public final boolean isRainUser(@NotNull UUID uUID) {
        Intrinsics.checkNotNullParameter(uUID, "uuid");
        return onlineUsers.contains(uUID);
    }

    @Compile
    private final void checkIfNeeded(MinecraftClient minecraftClient) {
    }

    private final void logFailure(Throwable error) {
        long now = System.currentTimeMillis();
        if (now - lastFailureLogAt < 60000L) {
            return;
        }
        lastFailureLogAt = now;
        logger.warn("Failed to update Rain users: {}", (Object)error.getMessage());
    }

    /*
     * Unable to fully structure code
     */
    private final Set<UUID> parseOnlineUsers(String json) {
        root = JsonParser.parseString(json);
        if (!root.isJsonObject()) {
            $i$a$-require-SocialPresenceService$parseOnlineUsers$1 = false;
            $i$a$-require-SocialPresenceService$parseOnlineUsers$1 = "Social API response is not an object";
            throw new IllegalArgumentException($i$a$-require-SocialPresenceService$parseOnlineUsers$1.toString());
        }
        online = root.getAsJsonObject().get("online");
        if (online == null) ** GOTO lbl-1000
        if (online.isJsonArray()) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        if (!v0) {
            $i$a$-require-SocialPresenceService$parseOnlineUsers$2 = false;
            $i$a$-require-SocialPresenceService$parseOnlineUsers$2 = "Social API response does not contain online users";
            throw new IllegalArgumentException($i$a$-require-SocialPresenceService$parseOnlineUsers$2.toString());
        }
        v1 = online.getAsJsonArray();
        Intrinsics.checkNotNullExpressionValue(v1, "getAsJsonArray(...)");
        $this$mapNotNull$iv = v1;
        $i$f$mapNotNull = false;
        var6_10 = $this$mapNotNull$iv;
        destination$iv$iv = new ArrayList<E>();
        $i$f$mapNotNullTo = false;
        $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
        $i$f$forEach = false;
        var11_15 = $this$forEach$iv$iv$iv.iterator();
        while (var11_15.hasNext()) {
            element$iv$iv = element$iv$iv$iv = var11_15.next();
            $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = false;
            element = (JsonElement)element$iv$iv;
            $i$a$-mapNotNull-SocialPresenceService$parseOnlineUsers$3 = false;
            var17_21 = \u062a\u064e.INSTANCE;
            try {
                var18_22 = var17_21;
                var19_23 = false;
                var18_22 = Result.constructor-impl(UUID.fromString(element.getAsString()));
            }
            catch (Throwable var19_24) {
                var18_22 = Result.constructor-impl(ResultKt.createFailure(var19_24));
            }
            var17_21 = var18_22;
            if ((UUID)(Result.isFailure-impl(var17_21) ? null : var17_21) == null) continue;
            var21_26 = false;
            destination$iv$iv.add(var20_25);
        }
        return CollectionsKt.toSet((List)var7_11);
    }

    @Compile
    public final void initialize() {
    }

    @Compile
    private final Set<UUID> checkBatch(List<UUID> list) {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    public final void shutdown() {
        closed = true;
        onlineUsers = SetsKt.emptySet();
        executor.shutdownNow();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static final void checkIfNeeded$lambda$1$0(\u062a\u064e $this_runCatching, List $playerUuids, MinecraftClient $client, String $serverAddress) {
        try {
            Set<UUID> result = $this_runCatching.check($playerUuids);
            $client.execute(() -> \u062a\u064e.checkIfNeeded$lambda$1$0$0($client, $serverAddress, $this_runCatching, result));
        }
        catch (Throwable error) {
            $this_runCatching.logFailure(error);
        }
        finally {
            requestInFlight.set(false);
        }
    }

    private static final Thread executor$lambda$0(Runnable runnable) {
        Thread thread2;
        Thread $this$executor_u24lambda_u240_u240 = thread2 = new Thread(runnable, "Rain-Socials");
        boolean bl = false;
        $this$executor_u24lambda_u240_u240.setDaemon(true);
        return thread2;
    }

    static {
        INSTANCE = new \u062a\u064e();
        logger = LoggerFactory.getLogger("Rain Socials");
        executor = Executors.newSingleThreadExecutor(\u062a\u064e::executor$lambda$0);
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        requestInFlight = new AtomicBoolean();
        onlineUsers = SetsKt.emptySet();
    }

    private \u062a\u064e() {
    }

    private static final void checkIfNeeded$lambda$1$0$0(MinecraftClient $client, String $serverAddress, \u062a\u064e $this_runCatching, Set $result) {
        ServerInfo serverInfo = $client.getCurrentServerEntry();
        String string = serverInfo != null ? serverInfo.address : null;
        if (Intrinsics.areEqual(string, $serverAddress)) {
            onlineUsers = $result;
        }
    }

    static /* synthetic */ Runnable lamda$checkIfNeeded$1_f5b4ca6(\u062a\u064e \u062a\u064e2, List list, MinecraftClient minecraftClient, String string) {
        return () -> \u062a\u064e.checkIfNeeded$lambda$1$0(\u062a\u064e2, list, minecraftClient, string);
    }

    static /* synthetic */ ClientTickEvents.EndTick lamda$initialize$1_7dd847a2(\u062a\u064e \u062a\u064e2) {
        return \u062a\u064e2::checkIfNeeded;
    }

    static /* synthetic */ String lamda$checkBatch$1_1028a747(int n) {
        return "Social API returned HTTP " + n;
    }
}


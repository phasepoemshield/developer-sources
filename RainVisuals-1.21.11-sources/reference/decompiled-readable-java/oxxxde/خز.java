/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.minecraft.client.MinecraftClient
 */
package oxxxde;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.net.URI;
import java.net.http.HttpClient;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import kotakbaz.rain.client.notification.RemoteNotificationService;
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArrayDeque;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;
import net.minecraft.client.MinecraftClient;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u062d\u0624;
import oxxxde.\u062f\u0632;
import oxxxde.\u0631\u0638;

/*
 * Illegal identifiers - consider using --renameillegalidents true
 */
@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0003\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0003JKLB\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0003J\r\u0010\u0006\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0006\u0010\u0003J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u00142\u0006\u0010\f\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0014H\u0002\u00a2\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002\u00a2\u0006\u0004\b\u001b\u0010\nJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00042\u0006\u0010\"\u001a\u00020!H\u0002\u00a2\u0006\u0004\b#\u0010$J\u001b\u0010&\u001a\u00020\u0010*\u00020\u00142\u0006\u0010%\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b&\u0010'J\u001b\u0010(\u001a\u00020\u000b*\u00020\u00142\u0006\u0010%\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b(\u0010)J\u001b\u0010+\u001a\u00020**\u00020\u00142\u0006\u0010%\u001a\u00020\u0010H\u0002\u00a2\u0006\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010/\u001a\u00020\u000b8\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b/\u0010.R\u001c\u00102\u001a\n 1*\u0004\u0018\u000100008\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\n 1*\u0004\u0018\u000107078\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010;\u001a\n 1*\u0004\u0018\u00010:0:8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b>\u0010?R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00150@8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bE\u0010DR\u0016\u0010F\u001a\u00020*8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bF\u0010DR\u0016\u0010G\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bG\u0010.R\u0016\u0010H\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bH\u0010.R\u0016\u0010I\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\bI\u0010.\u00a8\u0006M"}, d2={"Loxxxde/\u062e\u0632;", "", "<init>", "()V", "", "initialize", "shutdown", "Lnet/minecraft/class_310;", "client", "requestIfNeeded", "(Lnet/minecraft/class_310;)V", "", "after", "Loxxxde/\u0627\u0639;", "request", "(J)Lkotakbaz/rain/client/notification/RemoteNotificationService$NotificationResponse;", "", "json", "parseResponse", "(Ljava/lang/String;J)Lkotakbaz/rain/client/notification/RemoteNotificationService$NotificationResponse;", "Lcom/google/gson/JsonObject;", "Loxxxde/\u062b\u0646;", "toNotification", "(Lcom/google/gson/JsonObject;J)Lkotakbaz/rain/client/notification/RemoteNotificationService$RemoteNotification;", "Loxxxde/\u0635\u0638;", "notificationAction", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/notification/RemoteNotificationService$RemoteAction;", "flushPending", "readCursor", "()J", "value", "persistCursor", "(J)V", "", "error", "logFailure", "(Ljava/lang/Throwable;)V", "name", "string", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Ljava/lang/String;", "long", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)J", "", "boolean", "(Lcom/google/gson/JsonObject;Ljava/lang/String;)Z", "POLL_INTERVAL_MS", "J", "FAILURE_LOG_INTERVAL_MS", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Ljava/nio/file/Path;", "cursorFile", "Ljava/nio/file/Path;", "Ljava/util/concurrent/ExecutorService;", "executor", "Ljava/util/concurrent/ExecutorService;", "Ljava/net/http/HttpClient;", "httpClient", "Ljava/net/http/HttpClient;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "requestInFlight", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Lkotlin/collections/ArrayDeque;", "pending", "Lkotlin/collections/ArrayDeque;", "initialized", "Z", "closed", "sessionSynchronized", "cursor", "lastRequestAt", "lastFailureLogAt", "NotificationResponse", "RemoteNotification", "RemoteAction", "rain-visuals"})
public final class \u062e\u0632 {
    private static final ExecutorService executor;
    private static volatile long cursor;
    private static final long POLL_INTERVAL_MS = 10000L;
    @NotNull
    public static final \u062e\u0632 INSTANCE;
    @NotNull
    private static final AtomicBoolean requestInFlight;
    @NotNull
    private static final ArrayDeque<RemoteNotificationService.RemoteNotification> pending;
    private static volatile boolean initialized;
    private static volatile boolean closed;
    private static volatile boolean sessionSynchronized;
    private static final HttpClient httpClient;
    private static volatile long lastFailureLogAt;
    private static volatile long lastRequestAt;
    private static final Logger logger;
    @NotNull
    private static final Path cursorFile;
    private static final long FAILURE_LOG_INTERVAL_MS = 60000L;

    /*
     * WARNING - void declaration
     */
    private final RemoteNotificationService.RemoteAction notificationAction(JsonObject $this$notificationAction) {
        Object object;
        JsonElement jsonElement = $this$notificationAction.get("action");
        if (jsonElement == null) {
            return null;
        }
        JsonElement value = jsonElement;
        if (!value.isJsonObject()) {
            return null;
        }
        Object object2 = $this$notificationAction;
        try {
            void var7_8;
            void var10_13;
            JsonObject $this$notificationAction_u24lambda_u240 = object2;
            boolean bl = false;
            JsonObject action = value.getAsJsonObject();
            Intrinsics.checkNotNull(action);
            String label = INSTANCE.string(action, "label");
            String url = INSTANCE.string(action, "url");
            if (!(!StringsKt.isBlank(label) && label.length() <= 32)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            if (!(url.length() <= 2048)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            URI uri = URI.create(url);
            if (!StringsKt.equals(uri.getScheme(), "https", true)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            CharSequence charSequence = uri.getHost();
            boolean bl2 = charSequence == null || StringsKt.isBlank(charSequence);
            if (!(!bl2)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            if (!(uri.getUserInfo() == null)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            String string = var10_13.toASCIIString();
            Intrinsics.checkNotNullExpressionValue(string, "toASCIIString(...)");
            object = Result.constructor-impl(new RemoteNotificationService.RemoteAction((String)var7_8, string));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (RemoteNotificationService.RemoteAction)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private final void persistCursor(long value) {
        block8: {
            void var5_6;
            Object object;
            Object object2 = this;
            try {
                Object object3;
                \u062e\u0632 $this$persistCursor_u24lambda_u240 = object2;
                boolean bl = false;
                Files.createDirectories(cursorFile.getParent(), new FileAttribute[0]);
                Path temporary = Files.createTempFile(cursorFile.getParent(), "notification-cursor.", ".tmp", new FileAttribute[0]);
                try {
                    object3 = new OpenOption[2];
                    object3[0] = StandardOpenOption.TRUNCATE_EXISTING;
                    object3[1] = StandardOpenOption.WRITE;
                    Files.writeString(temporary, (CharSequence)String.valueOf(value), (OpenOption[])object3);
                    try {
                        object3 = new CopyOption[2];
                        object3[0] = StandardCopyOption.ATOMIC_MOVE;
                        object3[1] = StandardCopyOption.REPLACE_EXISTING;
                        object3 = Files.move(temporary, cursorFile, (CopyOption[])object3);
                    }
                    catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                        CopyOption[] copyOptionArray = new CopyOption[1];
                        copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                        object3 = Files.move(temporary, cursorFile, copyOptionArray);
                    }
                }
                finally {
                    Files.deleteIfExists(temporary);
                }
                object = Result.constructor-impl(object3);
            }
            catch (Throwable bl) {
                object = Result.constructor-impl(ResultKt.createFailure(bl));
            }
            object2 = object;
            Throwable throwable = Result.exceptionOrNull-impl(object2);
            if (throwable == null) break block8;
            Object it = object = throwable;
            boolean bl = false;
            INSTANCE.logFailure((Throwable)var5_6);
        }
    }

    private final RemoteNotificationService.RemoteNotification toNotification(JsonObject $this$toNotification, long after) {
        Object object;
        Object object2 = $this$toNotification;
        try {
            JsonObject $this$toNotification_u24lambda_u240 = object2;
            boolean bl = false;
            long id = INSTANCE.long($this$toNotification_u24lambda_u240, "id");
            if (!(id > after)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            long expiresAt = INSTANCE.long($this$toNotification_u24lambda_u240, "expiresAt");
            if (!(expiresAt > System.currentTimeMillis())) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            object = Result.constructor-impl(new RemoteNotificationService.RemoteNotification(id, INSTANCE.string($this$toNotification_u24lambda_u240, "title"), INSTANCE.string($this$toNotification_u24lambda_u240, "message"), INSTANCE.string($this$toNotification_u24lambda_u240, "level"), INSTANCE.notificationAction($this$toNotification_u24lambda_u240)));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        return (RemoteNotificationService.RemoteNotification)(Result.isFailure-impl(object2) ? null : object2);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static final void requestIfNeeded$lambda$0$0(\u062e\u0632 $this_runCatching, long $requestedCursor, MinecraftClient $client) {
        try {
            long nextCursor;
            RemoteNotificationService.NotificationResponse response = $this_runCatching.request($requestedCursor);
            if (!sessionSynchronized) {
                long latestCursor;
                cursor = latestCursor = Math.max(cursor, response.getLatestId());
                $this_runCatching.persistCursor(latestCursor);
                sessionSynchronized = true;
                return;
            }
            cursor = nextCursor = Math.max(cursor, response.getNextCursor());
            $this_runCatching.persistCursor(nextCursor);
            if (response.getHasMore()) {
                lastRequestAt = 0L;
            }
            $client.execute(() -> \u062e\u0632.requestIfNeeded$lambda$0$0$0(response, $this_runCatching, $client));
        }
        catch (Throwable error) {
            void var4_4;
            $this_runCatching.logFailure((Throwable)var4_4);
        }
        finally {
            requestInFlight.set(false);
        }
    }

    static {
        INSTANCE = new \u062e\u0632();
        logger = LoggerFactory.getLogger("Rain Notifications");
        String[] stringArray = new String[3];
        stringArray[0] = "Rain";
        stringArray[1] = "other";
        stringArray[2] = "notification-cursor.txt";
        Path path = Paths.get(System.getProperty("user.dir"), stringArray);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        cursorFile = path;
        executor = Executors.newSingleThreadExecutor(\u062e\u0632::executor$lambda$0);
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(5L)).build();
        requestInFlight = new AtomicBoolean();
        pending = new ArrayDeque();
    }

    private \u062e\u0632() {
    }

    private final void requestIfNeeded(MinecraftClient minecraftClient) {
    }

    private static final void initialize$lambda$0(MinecraftClient client) {
        Intrinsics.checkNotNullParameter(client, "client");
        INSTANCE.flushPending(client);
        INSTANCE.requestIfNeeded(client);
    }

    /*
     * Unable to fully structure code
     */
    private final boolean boolean(JsonObject $this$boolean, String name) {
        value = $this$boolean.get(name);
        if (value == null) ** GOTO lbl-1000
        if (!value.isJsonPrimitive()) ** GOTO lbl-1000
        if (value.getAsJsonPrimitive().isBoolean()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        if (!v0) {
            var4_4 = "Failed requirement.";
            throw new IllegalArgumentException(var4_4.toString());
        }
        return var3_3.getAsBoolean();
    }

    private final void logFailure(Throwable error) {
        long now = System.currentTimeMillis();
        if (now - lastFailureLogAt < 60000L) {
            return;
        }
        lastFailureLogAt = now;
        logger.warn("Failed to update remote notifications: {}", (Object)error.getMessage());
    }

    private final void flushPending(MinecraftClient client) {
        if (client.player == null) {
            return;
        }
        while (true) {
            boolean bl = !((Collection)pending).isEmpty();
            if (!bl) break;
            RemoteNotificationService.RemoteNotification notification = pending.removeFirst();
            RemoteNotificationService.RemoteAction remoteAction = notification.getAction();
            RemoteNotificationService.RemoteAction remoteAction2 = notification.getAction();
            RainMainMenuScreen$Link.INSTANCE.showRemoteNotification(notification.getId(), notification.getTitle(), notification.getMessage(), notification.getLevel(), remoteAction != null ? remoteAction.getLabel() : null, remoteAction2 != null ? remoteAction2.getUrl() : null);
        }
    }

    private final long readCursor() {
        Object object;
        Object object2 = this;
        try {
            \u062e\u0632 $this$readCursor_u24lambda_u240 = object2;
            boolean bl = false;
            String string = Files.readString(cursorFile);
            Intrinsics.checkNotNullExpressionValue(string, "readString(...)");
            object = Result.constructor-impl(Long.parseLong(((Object)StringsKt.trim((CharSequence)string)).toString()));
        }
        catch (Throwable throwable) {
            object = Result.constructor-impl(ResultKt.createFailure(throwable));
        }
        object2 = object;
        object = 0L;
        return RangesKt.coerceAtLeast(((Number)(Result.isFailure-impl(object2) ? object : object2)).longValue(), 0L);
    }

    private final RemoteNotificationService.NotificationResponse request(long l) {
        throw new UnsupportedOperationException("Rain network disabled");
    }

    /*
     * Unable to fully structure code
     */
    private final String string(JsonObject $this$string, String name) {
        value = $this$string.get(name);
        if (value == null) ** GOTO lbl-1000
        if (!value.isJsonPrimitive()) ** GOTO lbl-1000
        if (value.getAsJsonPrimitive().isString()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        if (!v0) {
            var4_4 = "Failed requirement.";
            throw new IllegalArgumentException(var4_4.toString());
        }
        v1 = value.getAsString();
        Intrinsics.checkNotNullExpressionValue(v1, "getAsString(...)");
        return v1;
    }

    /*
     * WARNING - void declaration
     */
    private static final void requestIfNeeded$lambda$0$0$0(RemoteNotificationService.NotificationResponse $response, \u062e\u0632 $this_runCatching, MinecraftClient $client) {
        void $this$forEach$iv;
        Iterable iterable = $response.getNotifications();
        ArrayDeque<RemoteNotificationService.RemoteNotification> arrayDeque = pending;
        boolean $i$f$forEach = false;
        for (Object element$iv : $this$forEach$iv) {
            RemoteNotificationService.RemoteNotification p0 = (RemoteNotificationService.RemoteNotification)element$iv;
            boolean bl = false;
            arrayDeque.addLast(p0);
        }
        $this_runCatching.flushPending($client);
    }

    public final void initialize() {
    }

    private static final Thread executor$lambda$0(Runnable runnable) {
        Thread thread2;
        Thread $this$executor_u24lambda_u240_u240 = thread2 = new Thread(runnable, "Rain-Remote-Notifications");
        boolean bl = false;
        $this$executor_u24lambda_u240_u240.setDaemon(true);
        return thread2;
    }

    public final void shutdown() {
        closed = true;
        \u0631\u0638.INSTANCE.unregister(\u062d\u0624.INSTANCE);
        executor.shutdownNow();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private final RemoteNotificationService.NotificationResponse parseResponse(String json, long after) {
        void var5_7;
        void var8_10;
        void var6_6;
        void var10_36;
        void var11_13;
        List list;
        block7: {
            void var17_20;
            Iterator iterator2;
            Collection destination$iv$iv;
            block6: {
                block5: {
                    void $this$mapNotNullTo$iv$iv;
                    JsonElement jsonElement;
                    JsonElement root = JsonParser.parseString(json);
                    if (!root.isJsonObject()) {
                        boolean $i$a$-require-RemoteNotificationService$parseResponse$42 = false;
                        String $i$a$-require-RemoteNotificationService$parseResponse$42 = "Notification API response is not an object";
                        throw new IllegalArgumentException($i$a$-require-RemoteNotificationService$parseResponse$42.toString());
                    }
                    JsonObject response = root.getAsJsonObject();
                    Intrinsics.checkNotNull(response);
                    long nextCursor = this.long(response, "nextCursor");
                    if (!(nextCursor >= after)) {
                        boolean bl = false;
                        String string = "Notification API returned an invalid cursor";
                        throw new IllegalArgumentException(string.toString());
                    }
                    long latestId = this.long(response, "latestId");
                    if (!(latestId >= nextCursor)) {
                        boolean $i$a$-require-RemoteNotificationService$parseResponse$52 = false;
                        String $i$a$-require-RemoteNotificationService$parseResponse$52 = "Notification API returned an invalid latest ID";
                        throw new IllegalArgumentException($i$a$-require-RemoteNotificationService$parseResponse$52.toString());
                    }
                    JsonElement $i$a$-require-RemoteNotificationService$parseResponse$52 = response.get("notifications");
                    if ($i$a$-require-RemoteNotificationService$parseResponse$52 == null) break block5;
                    JsonElement it = jsonElement = $i$a$-require-RemoteNotificationService$parseResponse$52;
                    boolean bl = false;
                    JsonElement jsonElement2 = it.isJsonArray() ? jsonElement : null;
                    if (jsonElement2 == null || (jsonElement = jsonElement2.getAsJsonArray()) == null) break block5;
                    Iterable $this$mapNotNull$iv = (Iterable)((Object)jsonElement);
                    boolean $i$f$mapNotNull = false;
                    Iterable iterable = $this$mapNotNull$iv;
                    destination$iv$iv = new ArrayList();
                    boolean $i$f$mapNotNullTo = false;
                    void $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
                    boolean $i$f$forEach = false;
                    iterator2 = $this$forEach$iv$iv$iv.iterator();
                    break block6;
                }
                list = null;
                break block7;
            }
            while (iterator2.hasNext()) {
                RemoteNotificationService.RemoteNotification remoteNotification;
                JsonElement jsonElement;
                Object element$iv$iv$iv;
                Object element$iv$iv = element$iv$iv$iv = iterator2.next();
                boolean bl = false;
                JsonElement element = (JsonElement)element$iv$iv;
                boolean bl2 = false;
                JsonElement jsonElement3 = jsonElement = element;
                boolean bl3 = false;
                JsonElement jsonElement4 = jsonElement3.isJsonObject() ? jsonElement : null;
                if ((jsonElement4 != null && (jsonElement = jsonElement4.getAsJsonObject()) != null ? INSTANCE.toNotification((JsonObject)jsonElement, after) : null) == null) continue;
                remoteNotification = remoteNotification;
                boolean bl4 = false;
                destination$iv$iv.add(remoteNotification);
            }
            list = (List)var17_20;
        }
        List list2 = list;
        if (list == null) {
            list2 = CollectionsKt.emptyList();
        }
        Iterable $this$sortedBy$iv = list2;
        boolean bl = false;
        List notifications = CollectionsKt.sortedWith(var11_13, new \u062f\u0632());
        return new RemoteNotificationService.NotificationResponse((List<RemoteNotificationService.RemoteNotification>)var10_36, (long)var6_6, (long)var8_10, this.boolean((JsonObject)var5_7, "hasMore"));
    }

    /*
     * Unable to fully structure code
     */
    private final long long(JsonObject $this$long, String name) {
        value = $this$long.get(name);
        if (value == null) ** GOTO lbl-1000
        if (!value.isJsonPrimitive()) ** GOTO lbl-1000
        if (value.getAsJsonPrimitive().isNumber()) {
            v0 = true;
        } else lbl-1000:
        // 3 sources

        {
            v0 = false;
        }
        if (!v0) {
            var4_4 = "Failed requirement.";
            throw new IllegalArgumentException(var4_4.toString());
        }
        v1 = value.getAsString();
        Intrinsics.checkNotNullExpressionValue(v1, "getAsString(...)");
        return Long.parseLong(v1);
    }
}


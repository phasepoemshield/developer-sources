/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.Closeable;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpHeaders;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.OptionalLong;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicLong;
import kotakbaz.rain.client.social.CloudConfigKey;
import kotakbaz.rain.client.social.CloudConfigLibrary;
import kotakbaz.rain.client.social.CloudConfigRecord;
import kotakbaz.rain.client.social.RedeemedCloudConfig;
import kotakbaz.rain.config.ConfigManager;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u0631\u0642;
import oxxxde.\u0634\u0626;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0003\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00110\b\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\b\u00a2\u0006\u0004\b\u0015\u0010\u0013J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\b2\u0006\u0010\u0016\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0018\u0010\rJ\u001b\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u0019\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001b\u0010\rJ\u001b\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001c\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001d\u0010\rJ\u001b\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001a0\b2\u0006\u0010\u001c\u001a\u00020\u0004\u00a2\u0006\u0004\b\u001e\u0010\rJ-\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010\u001f\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u00042\u0006\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b#\u0010$J%\u0010'\u001a\b\u0012\u0004\u0012\u00020\"0\b2\u0006\u0010&\u001a\u00020%2\u0006\u0010!\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b'\u0010(J/\u0010,\u001a\u00020\"2\u0006\u0010&\u001a\u00020%2\u0006\u0010)\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010 \u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\t2\u0006\u0010.\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b/\u00100J\u0017\u00101\u001a\u00020\u00172\u0006\u0010.\u001a\u00020\"H\u0002\u00a2\u0006\u0004\b1\u00102J\u001f\u00106\u001a\u00020\u00042\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\b6\u00107J#\u0010;\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u001082\u0006\u0010:\u001a\u000209H\u0002\u00a2\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u0002092\u0006\u0010:\u001a\u000209H\u0002\u00a2\u0006\u0004\b=\u0010>R\u0014\u0010?\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010A\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bA\u0010@R\u0014\u0010B\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bB\u0010@R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bC\u0010@R\u0014\u0010D\u001a\u00020\u00068\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\bD\u0010@R\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bH\u0010GR\u0014\u0010I\u001a\u00020E8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bI\u0010GR\u001c\u0010L\u001a\n K*\u0004\u0018\u00010J0J8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bO\u0010PR\u001c\u0010R\u001a\n K*\u0004\u0018\u00010Q0Q8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\bR\u0010S\u00a8\u0006T"}, d2={"Loxxxde/\u062e\u0647;", "", "<init>", "()V", "", "configName", "", "maxActivations", "Ljava/util/concurrent/CompletableFuture;", "Loxxxde/\u0636\u063a;", "createShare", "(Ljava/lang/String;Ljava/lang/Integer;)Ljava/util/concurrent/CompletableFuture;", "saveOwned", "(Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "keyCount", "saveOrShare", "(Ljava/lang/String;ILjava/lang/Integer;)Ljava/util/concurrent/CompletableFuture;", "", "listOwned", "()Ljava/util/concurrent/CompletableFuture;", "Loxxxde/\u062a\u0647;", "listLibrary", "key", "Loxxxde/\u0636\u064c;", "redeem", "keyId", "", "revokeKey", "configId", "revokeConfig", "removeReceived", "path", "body", "maximumResponseBytes", "Lcom/google/gson/JsonObject;", "post", "(Ljava/lang/String;Ljava/lang/String;I)Ljava/util/concurrent/CompletableFuture;", "Ljava/net/http/HttpRequest;", "request", "send", "(Ljava/net/http/HttpRequest;I)Ljava/util/concurrent/CompletableFuture;", "statusCode", "Ljava/net/http/HttpHeaders;", "headers", "parseResponse", "(Ljava/net/http/HttpRequest;ILjava/net/http/HttpHeaders;Ljava/lang/String;)Lcom/google/gson/JsonObject;", "root", "parseCloudConfig", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/social/CloudConfigRecord;", "parseRedeemedCloudConfig", "(Lcom/google/gson/JsonObject;)Lkotakbaz/rain/client/social/RedeemedCloudConfig;", "Ljava/io/InputStream;", "input", "maximumBytes", "readBoundedUtf8", "(Ljava/io/InputStream;I)Ljava/lang/String;", "T", "", "error", "failedFuture", "(Ljava/lang/Throwable;)Ljava/util/concurrent/CompletableFuture;", "unwrapCompletionError", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "MAX_SHARE_REQUEST_BYTES", "I", "MAX_SINGLE_RESPONSE_BYTES", "MAX_LIBRARY_RESPONSE_BYTES", "MAX_OWNED_CONFIGS", "MAX_RECEIVED_CONFIGS", "Lkotlin/text/Regex;", "cloudIdRegex", "Lkotlin/text/Regex;", "cloudKeyRegex", "usernameRegex", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Ljava/util/concurrent/atomic/AtomicLong;", "operationSequence", "Ljava/util/concurrent/atomic/AtomicLong;", "Ljava/net/http/HttpClient;", "httpClient", "Ljava/net/http/HttpClient;", "rain-visuals"})
public final class \u062e\u0647 {
    private static final int MAX_RECEIVED_CONFIGS = 100;
    @NotNull
    private static final Regex cloudKeyRegex;
    @NotNull
    private static final Regex cloudIdRegex;
    private static final int MAX_OWNED_CONFIGS = 10;
    private static final Logger logger;
    private static final int MAX_SHARE_REQUEST_BYTES = 262144;
    private static final int MAX_SINGLE_RESPONSE_BYTES = 524288;
    @NotNull
    private static final Regex usernameRegex;
    private static final int MAX_LIBRARY_RESPONSE_BYTES = 0x1C00000;
    private static final HttpClient httpClient;
    @NotNull
    public static final \u062e\u0647 INSTANCE;
    @NotNull
    private static final AtomicLong operationSequence;

    private final Throwable unwrapCompletionError(Throwable error) {
        Throwable throwable;
        Throwable cause = error;
        while (true) {
            if (!(cause instanceof CompletionException)) {
                if (!(cause instanceof ExecutionException)) break;
            }
            if (cause.getCause() == null) break;
            Intrinsics.checkNotNull(cause.getCause());
        }
        return throwable;
    }

    private static final Unit revokeKey$lambda$2(Function1 $tmp0, Object p0) {
        return (Unit)$tmp0.invoke(p0);
    }

    /*
     * WARNING - void declaration
     */
    private static final CloudConfigLibrary listLibrary$lambda$0(JsonObject root) {
        List list;
        Collection collection;
        JsonElement element;
        Iterable $this$mapTo$iv$iv;
        JsonArray receivedElements;
        JsonArray ownedElements;
        block10: {
            block9: {
                JsonArray jsonArray = root.getAsJsonArray("configs");
                if (jsonArray == null) {
                    throw new \u0634\u0626("invalid_server_response", null, null, null, 14, null);
                }
                ownedElements = jsonArray;
                receivedElements = root.getAsJsonArray("receivedConfigs");
                if (ownedElements.size() > 10) break block9;
                JsonArray jsonArray2 = receivedElements;
                if ((jsonArray2 != null ? jsonArray2.size() : 0) <= 100) break block10;
            }
            throw new \u0634\u0626("invalid_server_response", null, null, null, 14, null);
        }
        Iterable $this$map$iv = ownedElements;
        boolean $i$f$map = false;
        Iterable iterable = $this$map$iv;
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        boolean $i$f$mapTo = false;
        for (Object item$iv$iv : $this$mapTo$iv$iv) {
            element = (JsonElement)item$iv$iv;
            collection = destination$iv$iv;
            boolean bl = false;
            JsonObject jsonObject = element.getAsJsonObject();
            Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
            collection.add(INSTANCE.parseCloudConfig(jsonObject));
        }
        Collection collection2 = (List)destination$iv$iv;
        boolean bl = root.has("receivedConfigs");
        if (receivedElements != null) {
            void var6_6;
            Collection<RedeemedCloudConfig> collection3;
            $this$map$iv = receivedElements;
            boolean bl2 = bl;
            collection = collection2;
            $i$f$map = false;
            $this$mapTo$iv$iv = $this$map$iv;
            destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (Object item$iv$iv : $this$mapTo$iv$iv) {
                void var10_10;
                element = (JsonElement)item$iv$iv;
                collection3 = destination$iv$iv;
                boolean bl3 = false;
                JsonObject jsonObject = var10_10.getAsJsonObject();
                Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
                collection3.add(INSTANCE.parseRedeemedCloudConfig(jsonObject));
            }
            collection3 = (List)var6_6;
            collection2 = collection;
            bl = bl2;
            list = collection3;
        } else {
            list = null;
        }
        List list2 = list;
        if (list == null) {
            list2 = CollectionsKt.emptyList();
        }
        List list3 = list2;
        boolean bl4 = bl;
        List list4 = collection2;
        return new CloudConfigLibrary(list4, bl4, list3);
    }

    private final CompletableFuture<CloudConfigRecord> saveOrShare(String string, int n, Integer n2) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    /*
     * WARNING - void declaration
     */
    private final RedeemedCloudConfig parseRedeemedCloudConfig(JsonObject root) {
        Object $this$parseRedeemedCloudConfig_u24lambda_u240;
        Object object = this;
        try {
            $this$parseRedeemedCloudConfig_u24lambda_u240 = object;
            boolean bl = false;
            String configId = root.get("configId").getAsString();
            String name = root.get("name").getAsString();
            String author = root.get("author").getAsString();
            String ownerName = root.get("ownerName").getAsString();
            String contentHash = root.get("contentHash").getAsString();
            JsonObject payload = root.getAsJsonObject("payload");
            Intrinsics.checkNotNull(configId);
            if (!cloudIdRegex.matches(configId)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            Intrinsics.checkNotNull(name);
            if (!(!StringsKt.isBlank(name) && name.length() <= 64)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            Intrinsics.checkNotNull(author);
            if (!(!StringsKt.isBlank(author) && author.length() <= 64)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            Intrinsics.checkNotNull(ownerName);
            if (!usernameRegex.matches(ownerName)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            Intrinsics.checkNotNull(payload);
            Intrinsics.checkNotNull(contentHash);
            if (!ConfigManager.INSTANCE.verifyCloudPayloadHash(payload, contentHash)) {
                String string = "Failed requirement.";
                throw new IllegalArgumentException(string.toString());
            }
            $this$parseRedeemedCloudConfig_u24lambda_u240 = Result.constructor-impl(new RedeemedCloudConfig(configId, name, author, ownerName, contentHash, payload, root.get("alreadyActivated").getAsBoolean()));
        }
        catch (Throwable bl) {
            $this$parseRedeemedCloudConfig_u24lambda_u240 = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object = $this$parseRedeemedCloudConfig_u24lambda_u240;
        Throwable throwable = Result.exceptionOrNull-impl(object);
        if (throwable != null) {
            void var3_3;
            Throwable error = throwable;
            boolean bl = false;
            throw new \u0634\u0626("invalid_server_response", (Throwable)var3_3, null, null, 12, null);
        }
        return (RedeemedCloudConfig)object;
    }

    @NotNull
    public final CompletableFuture<Unit> revokeKey(@NotNull String string) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    static {
        INSTANCE = new \u062e\u0647();
        cloudIdRegex = new Regex("^[0-9a-f]{8}-[0-9a-f]{4}-[1-5][0-9a-f]{3}-[89ab][0-9a-f]{3}-[0-9a-f]{12}$", RegexOption.IGNORE_CASE);
        cloudKeyRegex = new Regex("^RAIN-CONFIG-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}-[A-HJ-NP-Z2-9]{4}$");
        usernameRegex = new Regex("^[A-Za-z0-9_]{3,16}$");
        logger = LoggerFactory.getLogger("Rain Cloud Config API");
        operationSequence = new AtomicLong();
        httpClient = HttpClient.newBuilder().connectTimeout(Duration.ofSeconds(6L)).build();
    }

    private static final Unit removeReceived$lambda$1(JsonObject it) {
        return Unit.INSTANCE;
    }

    private static final RedeemedCloudConfig redeem$lambda$2(Function1 $tmp0, Object p0) {
        return (RedeemedCloudConfig)$tmp0.invoke(p0);
    }

    @NotNull
    public final CompletableFuture<List<CloudConfigRecord>> listOwned() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    private static final JsonObject send$lambda$1(Function1 $tmp0, Object p0) {
        return (JsonObject)$tmp0.invoke(p0);
    }

    private static final void saveOrShare$lambda$5(Function2 $tmp0, Object p0, Object p1) {
        $tmp0.invoke(p0, p1);
    }

    private static final Unit revokeConfig$lambda$2(Function1 $tmp0, Object p0) {
        return (Unit)$tmp0.invoke(p0);
    }

    private static final RedeemedCloudConfig redeem$lambda$1(JsonObject root) {
        JsonObject jsonObject = root.getAsJsonObject("config");
        Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
        return INSTANCE.parseRedeemedCloudConfig(jsonObject);
    }

    private static final List listOwned$lambda$0(Function1 $tmp0, Object p0) {
        return (List)$tmp0.invoke(p0);
    }

    private static final CloudConfigRecord saveOrShare$lambda$2(JsonObject response) {
        JsonObject jsonObject = response.getAsJsonObject("config");
        Intrinsics.checkNotNullExpressionValue(jsonObject, "getAsJsonObject(...)");
        return INSTANCE.parseCloudConfig(jsonObject);
    }

    private final CompletableFuture<JsonObject> send(HttpRequest httpRequest, int n) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    @NotNull
    public final CompletableFuture<CloudConfigRecord> createShare(@NotNull String string, @Nullable Integer n) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static final JsonObject send$lambda$0(int $maximumResponseBytes, HttpRequest $request, HttpResponse response) {
        void var4_10;
        String string;
        OptionalLong contentLength = response.headers().firstValueAsLong("Content-Length");
        if (contentLength.isPresent()) {
            if (contentLength.getAsLong() > (long)$maximumResponseBytes) {
                ((InputStream)response.body()).close();
                throw new \u0634\u0626("server_response_too_large", null, response.statusCode(), null, 10, null);
            }
        }
        Closeable closeable = (Closeable)response.body();
        Throwable throwable = null;
        try {
            InputStream input = (InputStream)closeable;
            boolean bl = false;
            Intrinsics.checkNotNull(string);
            string = INSTANCE.readBoundedUtf8((InputStream)((Object)string), $maximumResponseBytes);
        }
        catch (Throwable throwable2) {
            throwable = throwable2;
            throw throwable2;
        }
        finally {
            CloseableKt.closeFinally(closeable, throwable);
        }
        String body = string;
        int n = response.statusCode();
        HttpHeaders httpHeaders = response.headers();
        Intrinsics.checkNotNullExpressionValue(httpHeaders, "headers(...)");
        return INSTANCE.parseResponse($request, n, httpHeaders, (String)var4_10);
    }

    @NotNull
    public final CompletableFuture<CloudConfigRecord> saveOwned(@NotNull String string) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    private static final Unit revokeConfig$lambda$1(JsonObject it) {
        return Unit.INSTANCE;
    }

    private static final Unit removeReceived$lambda$2(Function1 $tmp0, Object p0) {
        return (Unit)$tmp0.invoke(p0);
    }

    @NotNull
    public final CompletableFuture<RedeemedCloudConfig> redeem(@NotNull String string) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    /*
     * Unable to fully structure code
     */
    private final JsonObject parseResponse(HttpRequest request, int statusCode, HttpHeaders headers, String body) {
        block13: {
            var5_5 = this;
            try {
                $this$parseResponse_u24lambda_u240 = var5_5;
                $i$a$-runCatching-CloudConfigService$parseResponse$1 = false;
                \u0631\u0642.INSTANCE.requireValidResponse(request, statusCode, headers, body);
                $this$parseResponse_u24lambda_u240 = Result.constructor-impl(Unit.INSTANCE);
            }
            catch (Throwable $i$a$-runCatching-CloudConfigService$parseResponse$1) {
                $this$parseResponse_u24lambda_u240 = Result.constructor-impl(ResultKt.createFailure($i$a$-runCatching-CloudConfigService$parseResponse$1));
            }
            var5_5 = $this$parseResponse_u24lambda_u240;
            v0 = Result.exceptionOrNull-impl(var5_5);
            if (v0 != null) {
                error = $this$parseResponse_u24lambda_u240 = v0;
                $i$a$-onFailure-CloudConfigService$parseResponse$2 = false;
                var9_16 = new Object[6];
                var9_16[0] = request.method();
                var9_16[1] = request.uri().getPath();
                var9_16[2] = statusCode;
                var9_16[3] = error.getClass().getName();
                v1 = error.getMessage();
                if (v1 == null) {
                    v1 = "no message";
                }
                var9_16[4] = v1;
                var9_16[5] = error;
                \u062e\u0647.logger.error("Cloud API response signature validation failed: method={}, path={}, status={}, exception={}: {}", (Object[])var9_16);
            }
            ResultKt.throwOnFailure(var5_5);
            $this$parseResponse_u24lambda_u240 = this;
            try {
                $this$parseResponse_u24lambda_u242 = (\u062e\u0647)$this$parseResponse_u24lambda_u240;
                $i$a$-runCatching-CloudConfigService$parseResponse$parsed$1 = false;
                $this$parseResponse_u24lambda_u242 = Result.constructor-impl(JsonParser.parseString(body).getAsJsonObject());
            }
            catch (Throwable $i$a$-runCatching-CloudConfigService$parseResponse$parsed$1) {
                $this$parseResponse_u24lambda_u242 = Result.constructor-impl(ResultKt.createFailure($i$a$-runCatching-CloudConfigService$parseResponse$parsed$1));
            }
            parsed = $this$parseResponse_u24lambda_u242;
            if (200 <= statusCode ? statusCode < 300 : false) break block13;
            root = (JsonObject)(Result.isFailure-impl(parsed) ? null : parsed);
            if (root == null || ($i$a$-runCatching-CloudConfigService$parseResponse$parsed$1 = root.get("error")) == null) ** GOTO lbl-1000
            var10_18 = $i$a$-runCatching-CloudConfigService$parseResponse$parsed$1;
            var11_20 = var10_18;
            $i$a$-takeIf-CloudConfigService$parseResponse$code$1 = false;
            var9_16 = var11_20.isJsonPrimitive() ? var10_18 : null;
            if (var9_16 != null && (var10_18 = var9_16.getAsString()) != null) {
                v2 = var10_18;
            } else lbl-1000:
            // 2 sources

            {
                v2 = code = "http_" + statusCode;
            }
            if (root == null || (var9_16 = root.get("details")) == null) ** GOTO lbl-1000
            var12_22 = var11_20 = var9_16;
            $i$a$-takeIf-CloudConfigService$parseResponse$details$1 = false;
            var10_18 = var12_22.isJsonArray() ? var11_20 : null;
            if (var10_18 == null || (var11_20 = var10_18.getAsJsonArray()) == null) ** GOTO lbl-1000
            $this$mapNotNull$iv = (Iterable)var11_20;
            $i$f$mapNotNull = false;
            $this$mapNotNullTo$iv$iv = $this$mapNotNull$iv;
            destination$iv$iv = new ArrayList<E>();
            $i$f$mapNotNullTo = false;
            $this$forEach$iv$iv$iv = $this$mapNotNullTo$iv$iv;
            $i$f$forEach = false;
            var20_34 = $this$forEach$iv$iv$iv.iterator();
            while (var20_34.hasNext()) {
                element$iv$iv = element$iv$iv$iv = var20_34.next();
                $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = false;
                element = (JsonElement)element$iv$iv;
                $i$a$-mapNotNull-CloudConfigService$parseResponse$details$2 = false;
                var27_41 = var26_40 = element;
                var28_42 = false;
                v3 = var27_41.isJsonPrimitive() ? var26_40 : null;
                if ((v3 != null ? v3.getAsString() : null) == null) continue;
                var29_43 = var29_43;
                var30_44 = false;
                destination$iv$iv.add(var29_43);
            }
            var13_25 = CollectionsKt.joinToString$default((List)destination$iv$iv, ",", null, null, 0, null, null, 62, null);
            if (var13_25 != null) {
                var15_28 = var14_27 = var13_25;
                var16_30 = false;
                v4 = !StringsKt.isBlank(var15_28) ? var14_27 : null;
            } else lbl-1000:
            // 3 sources

            {
                v4 = null;
            }
            details = v4;
            var10_18 = body;
            var11_20 = new Regex("\\s+");
            var12_23 = " ";
            responsePreview = StringsKt.take(var11_20.replace((CharSequence)var10_18, var12_23), 300);
            var10_18 = new Object[5];
            var10_18[0] = request.method();
            var10_18[1] = request.uri().getPath();
            var10_18[2] = statusCode;
            var10_18[3] = var7_10;
            var10_18[4] = responsePreview;
            \u062e\u0647.logger.error("Cloud API rejected request: method={}, path={}, status={}, reason={}, response='{}'", var10_18);
            throw new \u0634\u0626((String)var7_10, null, statusCode, (String)error, 2, null);
        }
        var7_10 = parsed;
        v5 = Result.exceptionOrNull-impl(var7_10);
        if (v5 != null) {
            error = v5;
            $i$a$-getOrElse-CloudConfigService$parseResponse$3 = false;
            var10_19 = new Object[7];
            var10_19[0] = request.method();
            var10_19[1] = request.uri().getPath();
            var10_19[2] = statusCode;
            var10_19[3] = body.length();
            var10_19[4] = var8_15.getClass().getName();
            v6 = var8_15.getMessage();
            if (v6 == null) {
                v6 = "no message";
            }
            var10_19[5] = v6;
            var10_19[6] = var8_15;
            \u062e\u0647.logger.error("Cloud API returned invalid JSON: method={}, path={}, status={}, bodyLength={}, exception={}: {}", var10_19);
            throw new \u0634\u0626("invalid_server_response", (Throwable)var8_15, (int)var2_2, null, 8, null);
        }
        v7 = var7_10;
        Intrinsics.checkNotNullExpressionValue(v7, "getOrElse(...)");
        return (JsonObject)v7;
    }

    /*
     * Unable to fully structure code
     */
    private final CloudConfigRecord parseCloudConfig(JsonObject root) {
        var2_2 = this;
        try {
            $this$parseCloudConfig_u24lambda_u240 = var2_2;
            $i$a$-runCatching-CloudConfigService$parseCloudConfig$1 = false;
            id = root.get("id").getAsString();
            ownerName = root.get("ownerName").getAsString();
            name = root.get("name").getAsString();
            author = root.get("author").getAsString();
            contentHash = root.get("contentHash").getAsString();
            payload = root.getAsJsonObject("payload");
            revision = root.get("revision").getAsInt();
            revoked = root.get("revoked").getAsBoolean();
            keyElements = root.getAsJsonArray("keys");
            Intrinsics.checkNotNull(id);
            if (!\u062e\u0647.cloudIdRegex.matches(id)) {
                var14_15 = "Failed requirement.";
                throw new IllegalArgumentException(var14_15.toString());
            }
            Intrinsics.checkNotNull(ownerName);
            if (!\u062e\u0647.usernameRegex.matches(ownerName)) {
                var14_16 = "Failed requirement.";
                throw new IllegalArgumentException(var14_16.toString());
            }
            Intrinsics.checkNotNull(name);
            if (!(!StringsKt.isBlank(name) && name.length() <= 64)) {
                var14_17 = "Failed requirement.";
                throw new IllegalArgumentException(var14_17.toString());
            }
            Intrinsics.checkNotNull(author);
            if (!(!StringsKt.isBlank(author) && author.length() <= 64)) {
                var14_18 = "Failed requirement.";
                throw new IllegalArgumentException(var14_18.toString());
            }
            if (!(revision >= 1)) {
                var14_19 = "Failed requirement.";
                throw new IllegalArgumentException(var14_19.toString());
            }
            if (!(keyElements.size() <= 100)) {
                var14_20 = "Failed requirement.";
                throw new IllegalArgumentException(var14_20.toString());
            }
            Intrinsics.checkNotNull(payload);
            Intrinsics.checkNotNull(contentHash);
            if (!ConfigManager.INSTANCE.verifyCloudPayloadHash(payload, contentHash)) {
                var14_21 = "Failed requirement.";
                throw new IllegalArgumentException(var14_21.toString());
            }
            Intrinsics.checkNotNull(keyElements);
            var15_23 = keyElements;
            var16_24 = revoked;
            var17_25 = revision;
            var18_26 = payload;
            var19_27 = contentHash;
            var20_28 = author;
            var21_29 = name;
            var22_30 = ownerName;
            var23_31 = id;
            $i$f$map = false;
            var24_32 = $this$map$iv;
            destination$iv$iv = new ArrayList<E>(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            $i$f$mapTo = false;
            for (T item$iv$iv : $this$mapTo$iv$iv) {
                element = (JsonElement)item$iv$iv;
                var30_38 = destination$iv$iv;
                $i$a$-map-CloudConfigService$parseCloudConfig$1$1 = false;
                key = element.getAsJsonObject();
                keyId = key.get("id").getAsString();
                secret = key.get("key").getAsString();
                var35_44 = key.get("maxActivations");
                if (var35_44 == null) ** GOTO lbl-1000
                var36_45 = var35_44;
                var37_47 = var36_45;
                var38_48 = false;
                var39_50 = !var37_47.isJsonNull() ? var36_45 : null;
                if (var39_50 != null) {
                    v0 = var39_50.getAsInt();
                } else lbl-1000:
                // 2 sources

                {
                    v0 = null;
                }
                maxActivations = v0;
                usedActivations = key.get("usedActivations").getAsInt();
                var36_45 = key.get("remainingActivations");
                if (var36_45 == null) ** GOTO lbl-1000
                var41_52 = var38_49 = var36_45;
                var42_53 = false;
                var37_47 = !var41_52.isJsonNull() ? var38_49 : null;
                if (var37_47 != null) {
                    v1 = var37_47.getAsInt();
                } else lbl-1000:
                // 2 sources

                {
                    v1 = null;
                }
                remainingActivations = v1;
                Intrinsics.checkNotNull(keyId);
                if (!\u062e\u0647.cloudIdRegex.matches(keyId)) {
                    var37_47 = "Failed requirement.";
                    throw new IllegalArgumentException(var37_47.toString());
                }
                Intrinsics.checkNotNull(secret);
                if (!\u062e\u0647.cloudKeyRegex.matches(secret)) {
                    var37_47 = "Failed requirement.";
                    throw new IllegalArgumentException(var37_47.toString());
                }
                if (maxActivations == null) ** GOTO lbl-1000
                var36_46 = maxActivations;
                v2 = 1 <= var36_46 ? var36_46 < 1001 : false;
                if (v2) lbl-1000:
                // 2 sources

                {
                    v3 = true;
                } else {
                    v3 = false;
                }
                if (!v3) {
                    var37_47 = "Failed requirement.";
                    throw new IllegalArgumentException(var37_47.toString());
                }
                if (!(usedActivations >= 0)) {
                    var37_47 = "Failed requirement.";
                    throw new IllegalArgumentException(var37_47.toString());
                }
                if (!(remainingActivations == null || remainingActivations >= 0)) {
                    var37_47 = "Failed requirement.";
                    throw new IllegalArgumentException(var37_47.toString());
                }
                var30_38.add(new CloudConfigKey((String)var33_41, (String)var34_42, (Integer)var40_51, (int)var35_43, (Integer)var39_50, var32_40.get("revoked").getAsBoolean()));
            }
            var43_54 = var30_38 = (List)var25_33;
            var44_55 = var16_24;
            var45_56 = var17_25;
            var46_57 = var18_26;
            var47_58 = var19_27;
            var48_59 = var20_28;
            var49_60 = var21_29;
            var50_61 = var22_30;
            var51_62 = var23_31;
            error = Result.constructor-impl(new CloudConfigRecord(var51_62, var50_61, var49_60, var48_59, var47_58, var46_57, var45_56, var44_55, (List<CloudConfigKey>)var43_54));
        }
        catch (Throwable $i$a$-getOrElse-CloudConfigService$parseCloudConfig$2) {
            error = Result.constructor-impl(ResultKt.createFailure($i$a$-getOrElse-CloudConfigService$parseCloudConfig$2));
        }
        var2_2 = var3_3;
        v4 = Result.exceptionOrNull-impl(var2_2);
        if (v4 != null) {
            var3_3 = v4;
            var4_4 = false;
            throw new \u0634\u0626("invalid_server_response", var3_3, null, null, 12, null);
        }
        return (CloudConfigRecord)var2_2;
    }

    private static final CloudConfigLibrary listLibrary$lambda$1(Function1 $tmp0, Object p0) {
        return (CloudConfigLibrary)$tmp0.invoke(p0);
    }

    private final <T> CompletableFuture<T> failedFuture(Throwable error) {
        CompletableFuture completableFuture = new CompletableFuture();
        CompletableFuture it = completableFuture;
        boolean bl = false;
        it.completeExceptionally(error);
        return completableFuture;
    }

    /*
     * WARNING - void declaration
     */
    private static final Unit saveOrShare$lambda$4(long $operationId, String $action, String $configName, CloudConfigRecord record, Throwable error) {
        if (error == null) {
            Object[] objectArray = new Object[5];
            objectArray[0] = $operationId;
            objectArray[1] = $action;
            objectArray[2] = $configName;
            objectArray[3] = record.getId();
            objectArray[4] = record.getRevision();
            logger.info("Cloud config operation #{} completed: action={}, config='{}', cloudConfigId={}, revision={}", objectArray);
        } else {
            void var6_6;
            Throwable cause = INSTANCE.unwrapCompletionError(error);
            \u0634\u0626 apiError = cause instanceof \u0634\u0626 ? (\u0634\u0626)cause : null;
            Object[] objectArray = new Object[9];
            objectArray[0] = $operationId;
            objectArray[1] = $action;
            objectArray[2] = $configName;
            Object object = apiError;
            if (object == null || (object = ((\u0634\u0626)object).getCode()) == null) {
                object = "transport_or_client_error";
            }
            objectArray[3] = object;
            Object object2 = apiError;
            if (object2 == null || (object2 = ((\u0634\u0626)object2).getDetails()) == null) {
                object2 = "none";
            }
            objectArray[4] = object2;
            Object object3 = apiError;
            if (object3 == null || (object3 = ((\u0634\u0626)object3).getHttpStatus()) == null || (object3 = String.valueOf((Integer)object3)) == null) {
                object3 = "none";
            }
            objectArray[5] = object3;
            objectArray[6] = cause.getClass().getName();
            String string = cause.getMessage();
            if (string == null) {
                string = "no message";
            }
            objectArray[7] = string;
            objectArray[8] = var6_6;
            logger.error("Cloud config operation #{} failed: action={}, config='{}', reason={}, details={}, httpStatus={}, exception={}: {}", objectArray);
        }
        return Unit.INSTANCE;
    }

    private static final Unit revokeKey$lambda$1(JsonObject it) {
        return Unit.INSTANCE;
    }

    private static final CloudConfigRecord saveOrShare$lambda$3(Function1 $tmp0, Object p0) {
        return (CloudConfigRecord)$tmp0.invoke(p0);
    }

    private final CompletableFuture<JsonObject> post(String string, String string2, int n) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    @NotNull
    public final CompletableFuture<Unit> revokeConfig(@NotNull String string) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    @NotNull
    public final CompletableFuture<CloudConfigLibrary> listLibrary() {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    @NotNull
    public final CompletableFuture<Unit> removeReceived(@NotNull String string) {
        return CompletableFuture.failedFuture(new UnsupportedOperationException("Rain network disabled"));
    }

    private \u062e\u0647() {
    }

    private final String readBoundedUtf8(InputStream input, int maximumBytes) {
        byte[] bytes = input.readNBytes(maximumBytes + 1);
        if (bytes.length > maximumBytes) {
            throw new \u0634\u0626("server_response_too_large", null, null, null, 14, null);
        }
        Intrinsics.checkNotNull(bytes);
        byte[] byArray = bytes;
        Charset charset = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(charset, "UTF_8");
        Charset charset2 = charset;
        return new String(byArray, charset2);
    }
}


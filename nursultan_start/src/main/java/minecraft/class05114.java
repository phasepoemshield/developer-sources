/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10490
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  minecraft.class04712
 *  minecraft.class04771
 *  minecraft.class04987
 *  minecraft.class07536
 *  minecraft.class08314
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10490;
import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import minecraft.class04712;
import minecraft.class04771;
import minecraft.class04987;
import minecraft.class05113;
import minecraft.class07536;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class05114
implements AutoCloseable {
    private static final Logger N = LogUtils.getLogger();
    private static final int y = 5;
    private static final String L = "/upload";
    private final File u;
    private final long i;
    private final int R;
    private final class04987 M;
    private final String B;
    private final String Z;
    private final String z;
    private final String U;
    private final class05113 E;
    private final HttpClient W;

    public class05114(File file, long l, int n, class04987 class049872, class04771 class047712, String string, String string2, class05113 class051132) {
        this.u = file;
        this.i = l;
        this.R = n;
        this.M = class049872;
        this.B = class047712.N();
        this.Z = class047712.L();
        this.z = string;
        this.U = string2;
        this.E = class051132;
        this.W = HttpClient.newBuilder().executor((Executor)class07536.z()).connectTimeout(Duration.ofSeconds(15L)).build();
    }

    @Override
    public void close() {
        this.W.close();
    }

    private long y(HttpResponse<?> httpResponse) {
        return httpResponse.headers().firstValueAsLong("Retry-After").orElse(0L);
    }

    private String y() {
        return "sid=" + this.B + ";token=" + this.M.y() + ";user=" + this.Z + ";version=" + this.z + ";worldVersion=" + this.U;
    }

    private class04712 N(HttpResponse<String> httpResponse) {
        int n = httpResponse.statusCode();
        if (n == 401) {
            N.debug("Realms server returned 401: {}", httpResponse.headers().firstValue("WWW-Authenticate"));
        }
        String string = null;
        String string2 = httpResponse.body();
        if (string2 != null && !string2.isBlank()) {
            try {
                JsonElement jsonElement = class08314.N((String)string2).getAsJsonObject().get("errorMsg");
                if (jsonElement != null) {
                    string = jsonElement.getAsString();
                }
            }
            catch (Exception exception) {
                N.warn("Failed to parse response {}", (Object)string2, (Object)exception);
            }
        }
        return new class04712(n, string);
    }

    private CompletableFuture<class04712> N(int n, long l) {
        HttpRequest.BodyPublisher bodyPublisher = class05114.N(() -> {
            try {
                return new class10490((InputStream)new FileInputStream(this.u), this.E);
            }
            catch (IOException iOException) {
                N.warn("Failed to open file {}", (Object)this.u, (Object)iOException);
                return null;
            }
        }, l);
        HttpRequest httpRequest = HttpRequest.newBuilder(this.M.L().resolve("/upload/" + this.i + "/" + this.R)).timeout(Duration.ofMinutes(10L)).setHeader("Cookie", this.y()).setHeader("Content-Type", "application/octet-stream").POST(bodyPublisher).build();
        return this.W.sendAsync(httpRequest, HttpResponse.BodyHandlers.ofString(StandardCharsets.UTF_8)).thenCompose(httpResponse -> {
            long l2 = this.y((HttpResponse<?>)httpResponse);
            if (this.N(l2, n)) {
                this.E.N();
                try {
                    Thread.sleep((Duration)Duration.ofSeconds(l2));
                }
                catch (InterruptedException interruptedException) {
                    // empty catch block
                }
                return this.N(n + 1, l);
            }
            return CompletableFuture.completedFuture(this.N((HttpResponse<String>)httpResponse));
        });
    }

    private static HttpRequest.BodyPublisher N(Supplier<@Nullable InputStream> supplier, long l) {
        return HttpRequest.BodyPublishers.fromPublisher(HttpRequest.BodyPublishers.ofInputStream(supplier), l);
    }

    public CompletableFuture<class04712> N() {
        long l = this.u.length();
        this.E.N(l);
        return this.N(0, l);
    }

    private boolean N(long l, int n) {
        return l > 0L && n + 1 < 5;
    }
}


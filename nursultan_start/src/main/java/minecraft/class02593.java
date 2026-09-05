/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09765
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.internal.Streams
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.authlib.GameProfile
 *  com.mojang.logging.LogUtils
 *  minecraft.class03055
 *  minecraft.class05001
 *  minecraft.class05018
 *  minecraft.class05270
 *  minecraft.class05461
 *  minecraft.class05477
 *  minecraft.class06068
 *  minecraft.class07529
 *  minecraft.class08314
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09765;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonWriter;
import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class02571;
import minecraft.class02573;
import minecraft.class02588;
import minecraft.class02591;
import minecraft.class03055;
import minecraft.class05001;
import minecraft.class05018;
import minecraft.class05270;
import minecraft.class05461;
import minecraft.class05477;
import minecraft.class06068;
import minecraft.class07529;
import minecraft.class08314;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public abstract class class02593
implements AutoCloseable {
    protected static final Logger i = LogUtils.getLogger();
    private static final AtomicInteger N = new AtomicInteger(1);
    private static final ThreadFactory y = runnable -> {
        Thread thread = new Thread(runnable);
        thread.setName("Chat-Filter-Worker-" + N.getAndIncrement());
        return thread;
    };
    private final URL L;
    private final class02571 u;
    final class02588 R;
    final ExecutorService M;

    protected class02593(URL uRL, class02571 class025712, class02588 class025882, ExecutorService executorService) {
        this.R = class025882;
        this.M = executorService;
        this.L = uRL;
        this.u = class025712;
    }

    @Override
    public void close() {
        this.M.shutdownNow();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private JsonObject y(JsonObject jsonObject, URL uRL) throws IOException {
        HttpURLConnection httpURLConnection = this.N(jsonObject, uRL);
        try (InputStream inputStream = httpURLConnection.getInputStream();){
            JsonObject jsonObject2;
            if (httpURLConnection.getResponseCode() == 204) {
                JsonObject jsonObject3 = new JsonObject();
                return jsonObject3;
            }
            try {
                jsonObject2 = class08314.N((Reader)new InputStreamReader(inputStream, StandardCharsets.UTF_8)).getAsJsonObject();
            }
            catch (Throwable throwable) {
                this.N(inputStream);
                throw throwable;
            }
            this.N(inputStream);
            return jsonObject2;
        }
    }

    protected abstract void N(HttpURLConnection var1);

    protected HttpURLConnection N(JsonObject jsonObject, URL uRL) throws IOException {
        HttpURLConnection httpURLConnection = this.N(uRL);
        this.N(httpURLConnection);
        try (OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), StandardCharsets.UTF_8);
             JsonWriter jsonWriter = new JsonWriter((Writer)outputStreamWriter);){
            Streams.write((JsonElement)jsonObject, (JsonWriter)jsonWriter);
        }
        int n = httpURLConnection.getResponseCode();
        if (n < 200 || n >= 300) {
            throw new class09765(n + " " + httpURLConnection.getResponseMessage());
        }
        return httpURLConnection;
    }

    protected int N() {
        return 2000;
    }

    protected static ExecutorService N(int n) {
        return Executors.newFixedThreadPool(n, y);
    }

    public class05477 N(GameProfile gameProfile) {
        return new class02591(this, gameProfile);
    }

    protected HttpURLConnection N(URL uRL) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection)uRL.openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(this.N());
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setRequestProperty("User-Agent", "Minecraft server" + class07529.y().comp_4025());
        return httpURLConnection;
    }

    protected CompletableFuture<class06068> N(GameProfile gameProfile, String string, class02588 class025882, Executor executor) {
        if (string.isEmpty()) {
            return CompletableFuture.completedFuture(class06068.N);
        }
        return CompletableFuture.supplyAsync(() -> {
            JsonObject jsonObject = this.u.encode(gameProfile, string);
            try {
                JsonObject jsonObject2 = this.y(jsonObject, this.L);
                return this.N(string, class025882, jsonObject2);
            }
            catch (Exception exception) {
                i.warn("Failed to validate message '{}'", (Object)string, (Object)exception);
                return class06068.y((String)string);
            }
        }, executor);
    }

    public static @Nullable class02593 N(class05270 class052702) {
        String string = class052702.NN;
        if (class05018.B((String)string)) {
            return null;
        }
        return switch (class052702.Ny) {
            case 0 -> class05461.N((String)string);
            case 1 -> class02573.N(string);
            default -> {
                i.warn("Could not create text filter - unsupported text filtering version used");
                yield null;
            }
        };
    }

    protected static String N(@Nullable JsonObject jsonObject, String string, String string2) {
        return jsonObject != null ? class05001.N((JsonObject)jsonObject, (String)string, (String)string2) : string2;
    }

    protected static URL N(URI uRI, @Nullable JsonObject jsonObject, String string, String string2) throws MalformedURLException {
        String string3 = class02593.N(jsonObject, string, string2);
        return uRI.resolve("/" + string3).toURL();
    }

    protected abstract class06068 N(String var1, class02588 var2, JsonObject var3);

    protected class03055 N(String string, JsonArray jsonArray, class02588 class025882) {
        if (jsonArray.isEmpty()) {
            return class03055.L;
        }
        if (class025882.shouldIgnore(string, jsonArray.size())) {
            return class03055.y;
        }
        class03055 class030552 = new class03055(string.length());
        for (int i = 0; i < jsonArray.size(); ++i) {
            class030552.N(jsonArray.get(i).getAsInt());
        }
        return class030552;
    }

    protected void N(InputStream inputStream) throws IOException {
        byte[] byArray = new byte[1024];
        while (inputStream.read(byArray) != -1) {
        }
    }
}


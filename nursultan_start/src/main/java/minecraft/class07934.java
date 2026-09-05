/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09364
 *  Nursultan.class09366
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonNull
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonParseException
 *  com.mojang.logging.LogUtils
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.timeout.ReadTimeoutException
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMaps
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class01894
 *  minecraft.class03529
 *  minecraft.class04206
 *  minecraft.class05001
 *  minecraft.class07393
 *  minecraft.class07400
 *  minecraft.class07403
 *  minecraft.class07404
 *  minecraft.class07412
 *  minecraft.class07536
 *  minecraft.class07945
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class09364;
import Nursultan.class09366;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.mojang.logging.LogUtils;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.timeout.ReadTimeoutException;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectMaps;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import minecraft.class01894;
import minecraft.class03529;
import minecraft.class04206;
import minecraft.class05001;
import minecraft.class07393;
import minecraft.class07400;
import minecraft.class07403;
import minecraft.class07404;
import minecraft.class07412;
import minecraft.class07536;
import minecraft.class07903;
import minecraft.class07911;
import minecraft.class07916;
import minecraft.class07918;
import minecraft.class07932;
import minecraft.class07940;
import minecraft.class07945;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class07934
extends SimpleChannelInboundHandler<JsonElement> {
    private static final Logger N = LogUtils.getLogger();
    private static final AtomicInteger y = new AtomicInteger(0);
    private final class07932 L;
    private final class07403 u;
    private final class07911 i;
    private final Channel R;
    private final class07393 M;
    private final AtomicInteger B = new AtomicInteger();
    private final Int2ObjectMap<class07903<?>> Z = Int2ObjectMaps.synchronize((Int2ObjectMap)new Int2ObjectOpenHashMap());

    public class07934(Channel channel, class07911 class079112, class07393 class073932, class07932 class079322) {
        this.u = class07403.N((Integer)y.incrementAndGet());
        this.i = class079112;
        this.M = class073932;
        this.R = channel;
        this.L = class079322;
    }

    public <Result> CompletableFuture<Result> y(class03529<? extends class07940<Void, Result>> class035292) {
        return this.N(class035292, null, true);
    }

    private static boolean y(JsonElement jsonElement) {
        return class05001.y((JsonElement)jsonElement);
    }

    public <Params, Result> CompletableFuture<Result> y(class03529<? extends class07940<Params, Result>> class035292, Params Params) {
        return this.N(class035292, Params, true);
    }

    public @Nullable JsonElement N(String string, @Nullable JsonElement jsonElement) {
        class01894 class018942 = class01894.L((String)string);
        if (class018942 == null) {
            throw new class09366("Failed to parse method value: " + string);
        }
        Optional var4 = class04206.NQ.y(class018942);
        if (var4.isEmpty()) {
            throw new class09364("Method not found: " + string);
        }
        if (((class07945)var4.get()).y().N()) {
            try {
                return (JsonElement)this.M.N(() -> ((class07945)var4.get()).N(this.M, jsonElement, this.u)).join();
            }
            catch (CompletionException completionException) {
                Throwable throwable = completionException.getCause();
                if (throwable instanceof RuntimeException) {
                    throw (RuntimeException)throwable;
                }
                throw completionException;
            }
        }
        return ((class07945)var4.get()).N(this.M, jsonElement, this.u);
    }

    @Nullable JsonObject N(JsonObject jsonObject) {
        try {
            JsonElement jsonElement = class07916.N(jsonObject);
            String string = class07916.y(jsonObject);
            JsonElement jsonElement2 = class07916.u(jsonObject);
            JsonElement jsonElement3 = class07916.L(jsonObject);
            JsonObject jsonObject2 = class07916.i(jsonObject);
            if (string != null && jsonElement2 == null && jsonObject2 == null) {
                if (jsonElement != null && !class07934.N(jsonElement)) {
                    return class07918.field_62301.N("Invalid request id - only String, Number and NULL supported");
                }
                return this.N(jsonElement, string, jsonElement3);
            }
            if (string == null && jsonElement2 != null && jsonObject2 == null && jsonElement != null) {
                if (class07934.y(jsonElement)) {
                    this.N(jsonElement.getAsInt(), jsonElement2);
                } else {
                    N.warn("Received respose {} with id {} we did not request", (Object)jsonElement2, (Object)jsonElement);
                }
                return null;
            }
            if (string == null && jsonElement2 == null && jsonObject2 != null) {
                return this.N(jsonElement, jsonObject2);
            }
            return class07918.field_62301.N((JsonElement)Objects.requireNonNullElse(jsonElement, JsonNull.INSTANCE));
        }
        catch (Exception exception) {
            N.error("Error while handling rpc request", (Throwable)exception);
            return class07918.field_62304.N("Unknown error handling request - check server logs for stack trace");
        }
    }

    private @Nullable JsonObject N(@Nullable JsonElement jsonElement, String string, @Nullable JsonElement jsonElement2) {
        boolean bl = jsonElement != null;
        try {
            JsonElement jsonElement3 = this.N(string, jsonElement2);
            if (jsonElement3 == null || !bl) {
                return null;
            }
            return class07916.N(jsonElement, jsonElement3);
        }
        catch (class07400 class074002) {
            N.debug("Invalid parameter invocation {}: {}, {}", new Object[]{string, jsonElement2, class074002.getMessage()});
            return bl ? class07918.field_62303.N(jsonElement, class074002.getMessage()) : null;
        }
        catch (class07412 class074122) {
            N.error("Failed to encode json rpc response {}: {}", (Object)string, (Object)class074122.getMessage());
            return bl ? class07918.field_62304.N(jsonElement, class074122.getMessage()) : null;
        }
        catch (class09366 class093662) {
            return bl ? class07918.field_62301.N(jsonElement, class093662.getMessage()) : null;
        }
        catch (class09364 class093642) {
            return bl ? class07918.field_62302.N(jsonElement, class093642.getMessage()) : null;
        }
        catch (Exception exception) {
            N.error("Error while dispatching rpc method {}", (Object)string, (Object)exception);
            return bl ? class07918.field_62304.N(jsonElement) : null;
        }
    }

    public void N() {
        long l = class07536.L();
        this.Z.int2ObjectEntrySet().removeIf(entry -> {
            boolean bl = ((class07903)((Object)((Object)entry.getValue()))).N(l);
            if (bl) {
                ((class07903)((Object)((Object)entry.getValue()))).y().completeExceptionally((Throwable)new ReadTimeoutException("RPC method " + String.valueOf(((class07903)((Object)((Object)entry.getValue()))).N().B().N()) + " timed out waiting for response"));
            }
            return bl;
        });
    }

    private @Nullable JsonObject N(@Nullable JsonElement jsonElement, JsonObject jsonObject) {
        class07903 var3;
        if (jsonElement != null && class07934.y(jsonElement) && (var3 = (class07903)((Object)this.Z.remove(jsonElement.getAsInt()))) != null) {
            var3.y().completeExceptionally((Throwable)new class07404(jsonElement, jsonObject));
        }
        N.error("Received error (id: {}): {}", (Object)jsonElement, (Object)jsonObject);
        return null;
    }

    private void N(int n, JsonElement jsonElement) {
        class07903 var3 = (class07903)((Object)this.Z.remove(n));
        if (var3 == null) {
            N.warn("Received unknown response (id: {}): {}", (Object)n, (Object)jsonElement);
        } else {
            var3.N(jsonElement);
        }
    }

    private static boolean N(JsonElement jsonElement) {
        return jsonElement.isJsonNull() || class05001.y((JsonElement)jsonElement) || class05001.N((JsonElement)jsonElement);
    }

    protected void channelRead0(ChannelHandlerContext channelHandlerContext, JsonElement jsonElement) {
        if (jsonElement.isJsonObject()) {
            JsonObject jsonObject = this.N(jsonElement.getAsJsonObject());
            if (jsonObject != null) {
                this.R.writeAndFlush((Object)jsonObject);
            }
        } else if (jsonElement.isJsonArray()) {
            this.R.writeAndFlush((Object)this.N(jsonElement.getAsJsonArray().asList()));
        } else {
            this.R.writeAndFlush((Object)class07918.field_62301.N((String)null));
        }
    }

    public void N(class03529<? extends class07940<Void, ?>> class035292) {
        this.N(class035292, null, false);
    }

    public <Params> void N(class03529<? extends class07940<Params, ?>> class035292, Params Params) {
        this.N(class035292, Params, false);
    }

    private <Params, Result> @Nullable CompletableFuture<Result> N(class03529<? extends class07940<Params, ? extends Result>> class035292, @Nullable Params Params, boolean bl) {
        List<JsonElement> list;
        List<JsonElement> list2 = list = Params != null ? List.of(Objects.requireNonNull(((class07940)class035292.N()).N(Params))) : List.of();
        if (bl) {
            CompletableFuture completableFuture = new CompletableFuture();
            int n = this.B.incrementAndGet();
            long l = class07536.u.get(TimeUnit.MILLISECONDS);
            this.Z.put(n, new class07903(class035292, completableFuture, l + 5000L));
            this.R.writeAndFlush((Object)class07916.N(n, class035292.B().N(), list));
            return completableFuture;
        }
        this.R.writeAndFlush((Object)class07916.N(null, class035292.B().N(), list));
        return null;
    }

    private JsonArray N(List<JsonElement> list) {
        JsonArray jsonArray = new JsonArray();
        list.stream().map(jsonElement -> this.N(jsonElement.getAsJsonObject())).filter(Objects::nonNull).forEach(arg_0 -> ((JsonArray)jsonArray).add(arg_0));
        return jsonArray;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) throws Exception {
        if (throwable.getCause() instanceof JsonParseException) {
            this.R.writeAndFlush((Object)class07918.field_62300.N(throwable.getMessage()));
            return;
        }
        super.exceptionCaught(channelHandlerContext, throwable);
        this.R.close().awaitUninterruptibly();
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.L.N(this.u, "Management connection opened for {}", this.R.remoteAddress());
        super.channelActive(channelHandlerContext);
        this.i.N(this);
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) throws Exception {
        this.L.N(this.u, "Management connection closed for {}", this.R.remoteAddress());
        super.channelInactive(channelHandlerContext);
        this.i.y(this);
    }
}


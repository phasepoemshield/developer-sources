/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.google.common.hash.HashingOutputStream
 *  com.google.gson.JsonElement
 *  com.google.gson.stream.JsonWriter
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap
 *  minecraft.class01894
 *  minecraft.class01929
 *  minecraft.class01997
 *  minecraft.class03519
 *  minecraft.class04476
 *  minecraft.class05001
 *  minecraft.class07536
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package minecraft;

import com.google.common.hash.Hashing;
import com.google.common.hash.HashingOutputStream;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonWriter;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import it.unimi.dsi.fastutil.objects.Object2IntOpenHashMap;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Comparator;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01997;
import minecraft.class03519;
import minecraft.class04476;
import minecraft.class05001;
import minecraft.class07536;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public interface class07135 {
    public static final ToIntFunction<String> y = (ToIntFunction)class07536.N((Object)new Object2IntOpenHashMap(), (T object2IntOpenHashMap) -> {
        class07135.y(object2IntOpenHashMap, null);
        object2IntOpenHashMap.put((Object)"type", 0);
        object2IntOpenHashMap.put((Object)"parent", 1);
        object2IntOpenHashMap.defaultReturnValue(2);
        class07135.N(object2IntOpenHashMap, null);
    });
    public static final Comparator<String> L = Comparator.comparingInt(y).thenComparing(string -> string);
    public static final Logger u = LogUtils.getLogger();

    private static void y(Object2IntOpenHashMap object2IntOpenHashMap, CallbackInfo callbackInfo) {
        object2IntOpenHashMap.put((Object)"fabric:load_conditions", -100);
    }

    private static void N(Object2IntOpenHashMap object2IntOpenHashMap, CallbackInfo callbackInfo) {
        object2IntOpenHashMap.put((Object)"fabric:load_conditions", -100);
        object2IntOpenHashMap.put((Object)"fabric:type", 0);
    }

    public static <T> CompletableFuture<?> N(class04476 class044762, class01929 class019292, Codec<T> codec, T t, Path path) {
        class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
        return class07135.N(class044762, (DynamicOps<JsonElement>)class035192, codec, t, path);
    }

    public static <T, E> CompletableFuture<?> N(class04476 class044762, Function<E, JsonElement> function, Function<T, Path> function2, Map<T, E> map) {
        return CompletableFuture.allOf((CompletableFuture[])map.entrySet().stream().map(entry -> {
            Path path = (Path)function2.apply(entry.getKey());
            JsonElement jsonElement = (JsonElement)function.apply(entry.getValue());
            return class07135.N(class044762, jsonElement, path);
        }).toArray(CompletableFuture[]::new));
    }

    public static <T, E> CompletableFuture<?> N(class04476 class044762, Codec<E> codec, Function<T, Path> function, Map<T, E> map) {
        return class07135.N(class044762, (E object) -> (JsonElement)codec.encodeStart((DynamicOps)JsonOps.INSTANCE, object).getOrThrow(), function, map);
    }

    public static <T> CompletableFuture<?> N(class04476 class044762, Codec<T> codec, class01997 class019972, Map<class01894, T> map) {
        return class07135.N(class044762, codec, arg_0 -> ((class01997)class019972).N(arg_0), map);
    }

    public static CompletableFuture<?> N(class04476 class044762, JsonElement jsonElement, Path path) {
        return CompletableFuture.runAsync(() -> {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                HashingOutputStream hashingOutputStream = new HashingOutputStream(Hashing.sha1(), (OutputStream)byteArrayOutputStream);
                try (JsonWriter jsonWriter = new JsonWriter((Writer)new OutputStreamWriter((OutputStream)hashingOutputStream, StandardCharsets.UTF_8));){
                    jsonWriter.setSerializeNulls(false);
                    jsonWriter.setIndent("  ");
                    class05001.N((JsonWriter)jsonWriter, (JsonElement)jsonElement, L);
                }
                class044762.method_43346(path, byteArrayOutputStream.toByteArray(), hashingOutputStream.hash());
            }
            catch (IOException iOException) {
                u.error("Failed to save file to {}", (Object)path, (Object)iOException);
            }
        }, class07536.B().N("saveStable"));
    }

    private static <T> CompletableFuture<?> N(class04476 class044762, DynamicOps<JsonElement> dynamicOps, Codec<T> codec, T t, Path path) {
        JsonElement jsonElement = (JsonElement)codec.encodeStart(dynamicOps, t).getOrThrow();
        return class07135.N(class044762, jsonElement, path);
    }

    public static <T> CompletableFuture<?> N(class04476 class044762, Codec<T> codec, T t, Path path) {
        return class07135.N(class044762, (DynamicOps<JsonElement>)JsonOps.INSTANCE, codec, t, path);
    }

    public String method_10321();

    public CompletableFuture<?> method_10319(class04476 var1);
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class01997
 *  minecraft.class02965
 *  minecraft.class03078
 *  minecraft.class03519
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Stream;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class01997;
import minecraft.class02965;
import minecraft.class03078;
import minecraft.class03519;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;

public class class01035
implements class07135 {
    private final class01996 N;
    private final CompletableFuture<class01929> i;

    public class01035(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.i = completableFuture;
        this.N = class019962;
    }

    private /* synthetic */ Stream y(class04476 class044762, class01929 class019292, DynamicOps dynamicOps, class02965 class029652) {
        return this.N(class044762, class019292, (DynamicOps<JsonElement>)dynamicOps, class029652).stream();
    }

    private static <E> CompletableFuture<?> N(Path path, class04476 class044762, DynamicOps<JsonElement> dynamicOps, Encoder<E> encoder, E e) {
        return (CompletableFuture)encoder.encodeStart(dynamicOps, e).mapOrElse(jsonElement -> class07135.N((class04476)class044762, (JsonElement)jsonElement, (Path)path), error -> CompletableFuture.failedFuture(new IllegalStateException("Couldn't generate file '" + String.valueOf(path) + "': " + error.message())));
    }

    private <T> Optional<CompletableFuture<?>> N(class04476 class044762, class01929 class019292, DynamicOps<JsonElement> dynamicOps, class02965<T> class029652) {
        class05946 class059462 = class029652.N();
        return class019292.method_46759(class059462).map(class019212 -> {
            class01997 class019972 = this.N.method_60917(class059462);
            return CompletableFuture.allOf((CompletableFuture[])class019212.z().map(class035292 -> class01035.N(class019972.N(class035292.B().N()), class044762, dynamicOps, class029652.y(), class035292.N())).toArray(CompletableFuture[]::new));
        });
    }

    public String method_10321() {
        return "Registries";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.i.thenCompose(class019292 -> {
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            return CompletableFuture.allOf((CompletableFuture[])class03078.N.stream().flatMap(arg_0 -> this.y(class044762, class019292, (DynamicOps)class035192, arg_0)).toArray(CompletableFuture[]::new));
        });
    }
}


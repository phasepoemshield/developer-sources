/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01929
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class02695
 *  minecraft.class03519
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class06581
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class02695;
import minecraft.class03519;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class06581;
import minecraft.class07135;

public class class02496
implements class07135 {
    private final class01996 N;
    private final CompletableFuture<class01929> i;

    public class02496(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.N = class019962;
        this.i = completableFuture;
    }

    public String method_10321() {
        return "Item List";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        Path path = this.N.method_45972(class02024.field_39369).resolve("items.json");
        return this.i.thenCompose(class019292 -> {
            JsonObject jsonObject = new JsonObject();
            class03519 class035192 = class019292.N((DynamicOps)JsonOps.INSTANCE);
            class019292.y(class04227.F).z().forEach(class035292 -> {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.add("components", (JsonElement)class02695.y.encodeStart((DynamicOps)class035192, (Object)((class06581)class035292.N()).R()).getOrThrow(string -> new IllegalStateException("Failed to encode components: " + string)));
                jsonObject.add(class035292.M(), (JsonElement)jsonObject2);
            });
            return class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)path);
        });
    }
}


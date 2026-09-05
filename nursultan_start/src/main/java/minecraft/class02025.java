/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00392
 *  minecraft.class01603
 *  minecraft.class01612
 *  minecraft.class02968
 *  minecraft.class02974
 *  minecraft.class03767
 *  minecraft.class04476
 *  minecraft.class05257
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class00392;
import minecraft.class01603;
import minecraft.class01612;
import minecraft.class01996;
import minecraft.class02968;
import minecraft.class02974;
import minecraft.class03767;
import minecraft.class04476;
import minecraft.class05257;
import minecraft.class07135;

public class class02025
implements class07135 {
    private final class01996 N;
    private final Map<String, Supplier<JsonElement>> i = new HashMap<String, Supplier<JsonElement>>();

    public class02025(class01996 class019962) {
        this.N = class019962;
    }

    public static class02025 N(class01996 class019962, class00392 class003922) {
        return new class02025(class019962).N(class01612.y, new class01612(class003922, class05257.N.method_70592(class01603.field_14190).N()));
    }

    public <T> class02025 N(class02968<T> class029682, T t) {
        this.i.put(class029682.N(), () -> ((JsonElement)class029682.y().encodeStart((DynamicOps)JsonOps.INSTANCE, t).getOrThrow(IllegalArgumentException::new)).getAsJsonObject());
        return this;
    }

    public static class02025 N(class01996 class019962, class00392 class003922, class03767 class037672) {
        return class02025.N(class019962, class003922).N(class02974.N, new class02974(class037672));
    }

    public String method_10321() {
        return "Pack Metadata";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        JsonObject jsonObject = new JsonObject();
        this.i.forEach((string, supplier) -> jsonObject.add(string, (JsonElement)supplier.get()));
        return class07135.N((class04476)class044762, (JsonElement)jsonObject, (Path)this.N.method_45971().resolve("pack.mcmeta"));
    }
}


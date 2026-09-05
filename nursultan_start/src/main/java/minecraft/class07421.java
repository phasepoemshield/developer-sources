/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class04476
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class04476;
import minecraft.class07135;
import minecraft.class07389;
import minecraft.class07410;
import minecraft.class07420;

public class class07421
implements class07135 {
    private final Path N;

    public class07421(class01996 class019962) {
        this.N = class019962.method_45972(class02024.field_39369).resolve("json-rpc-api-schema.json");
    }

    public String method_10321() {
        return "Json RPC API schema";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        class07420 class074202 = class07410.N(class07389.L());
        return class07135.N((class04476)class044762, (JsonElement)((JsonElement)class07420.N.codec().encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class074202).getOrThrow()), (Path)this.N);
    }
}


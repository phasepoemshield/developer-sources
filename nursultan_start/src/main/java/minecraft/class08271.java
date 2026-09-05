/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class03078
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class03078;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import minecraft.class08249;
import minecraft.class08264;
import minecraft.class08267;
import minecraft.class08269;

public class class08271
implements class07135 {
    private final class01996 i;
    private static final class08269 R = new class08269(true, false, true);
    private static final class08269 M = new class08269(true, true, true);
    private static final class08269 B = new class08269(true, true, false);
    private static final class08269 Z = new class08269(false, true, true);
    private static final Map<class05946<? extends class00751<?>>, class08269> z = Map.of(class04227.yV, R, class04227.yK, R, class04227.yJ, M, class04227.yo, M, class04227.yq, M);
    private static final Map<String, class08249> U = Map.of("structure", new class08249(class08264.field_53708, new class08269(true, false, true)), "function", new class08249(class08264.field_53709, new class08269(true, true, true)));
    static final Codec<class05946<? extends class00751<?>>> N = class01894.N.xmap(class05946::N, class05946::N);

    public class08271(class01996 class019962) {
        this.i = class019962;
    }

    private void N(Map<class05946<? extends class00751<?>>, class08269> map, class05946<? extends class00751<?>> class059462, class08269 class082692) {
        if (map.putIfAbsent(class059462, class082692) != null) {
            throw new IllegalStateException("Duplicate entry for key " + String.valueOf(class059462.N()));
        }
    }

    private Map<class05946<? extends class00751<?>>, class08269> N() {
        HashMap hashMap = new HashMap();
        class04206.NF.forEach(class007512 -> this.N(hashMap, class007512.i(), Z));
        class03078.N.forEach(class029652 -> this.N(hashMap, class029652.N(), B));
        class03078.y.forEach(class029652 -> this.N(hashMap, class029652.N(), B));
        z.forEach((class059462, class082692) -> this.N(hashMap, (class05946<? extends class00751<?>>)class059462, (class08269)((Object)class082692)));
        return hashMap;
    }

    public String method_10321() {
        return "Datapack Structure";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        class08267 class082672 = new class08267(this.N(), U);
        Path path = this.i.method_45972(class02024.field_39369).resolve("datapack.json");
        return class07135.N((class04476)class044762, (JsonElement)((JsonElement)class08267.N.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class082672).getOrThrow()), (Path)path);
    }
}


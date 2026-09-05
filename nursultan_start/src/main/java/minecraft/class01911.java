/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.JsonOps
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00780
 *  minecraft.class01996
 *  minecraft.class02024
 *  minecraft.class03221
 *  minecraft.class03519
 *  minecraft.class03573
 *  minecraft.class04227
 *  minecraft.class04476
 *  minecraft.class05946
 *  minecraft.class07135
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.gson.JsonElement;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.JsonOps;
import com.mojang.serialization.MapCodec;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class00780;
import minecraft.class01894;
import minecraft.class01929;
import minecraft.class01996;
import minecraft.class02024;
import minecraft.class03221;
import minecraft.class03519;
import minecraft.class03573;
import minecraft.class04227;
import minecraft.class04476;
import minecraft.class05946;
import minecraft.class07135;
import org.slf4j.Logger;

public class class01911
implements class07135 {
    private static final Logger N = LogUtils.getLogger();
    private final Path i;
    private final CompletableFuture<class01929> R;
    private static final MapCodec<class05946<class00780>> M = class05946.N((class05946)class04227.NA).fieldOf("biome");
    private static final Codec<class03221<class05946<class00780>>> B = class03221.N(M).fieldOf("biomes").codec();

    public class01911(class01996 class019962, CompletableFuture<class01929> completableFuture) {
        this.i = class019962.method_45972(class02024.field_39369).resolve("biome_parameters");
        this.R = completableFuture;
    }

    private static <E> CompletableFuture<?> N(Path path, class04476 class044762, DynamicOps<JsonElement> dynamicOps, Encoder<E> encoder, E e) {
        Optional optional = encoder.encodeStart(dynamicOps, e).resultOrPartial(string -> N.error("Couldn't serialize element {}: {}", (Object)path, string));
        if (optional.isPresent()) {
            return class07135.N((class04476)class044762, (JsonElement)((JsonElement)optional.get()), (Path)path);
        }
        return CompletableFuture.completedFuture(null);
    }

    private Path N(class01894 class018942) {
        return this.i.resolve(class018942.y()).resolve(class018942.N() + ".json");
    }

    public String method_10321() {
        return "Biome Parameters";
    }

    public CompletableFuture<?> method_10319(class04476 class044762) {
        return this.R.thenCompose(class019292 -> {
            class03519 class035192 = class019292.N(JsonOps.INSTANCE);
            ArrayList arrayList = new ArrayList();
            class03573.y().forEach((class035622, class032212) -> arrayList.add(class01911.N(this.N(class035622.y()), class044762, (DynamicOps<JsonElement>)class035192, B, class032212)));
            return CompletableFuture.allOf((CompletableFuture[])arrayList.toArray(CompletableFuture[]::new));
        });
    }
}


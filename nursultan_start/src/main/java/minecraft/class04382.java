/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class01255
 *  minecraft.class01281
 *  minecraft.class03556
 *  minecraft.class03764
 *  minecraft.class04227
 *  minecraft.class05946
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.Map;
import java.util.Optional;
import minecraft.class01255;
import minecraft.class01281;
import minecraft.class03556;
import minecraft.class03764;
import minecraft.class04227;
import minecraft.class05946;

public class class04382 {
    public static final Codec<class04382> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.unboundedMap((Codec)class05946.N((class05946)class04227.yI), (Codec)class01255.N).fieldOf("dimensions").forGetter(class043822 -> class043822.L)).apply(instance, class04382::new)).validate(class04382::N);
    public static final Codec<class03556<class04382>> y = class01281.N((class05946)class04227.yO, N);
    private final Map<class05946<class01255>, class01255> L;

    private ImmutableMap<class05946<class01255>, class01255> L() {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        class03764.N(this.L.keySet().stream()).forEach(class059462 -> {
            class01255 class012552 = this.L.get(class059462);
            if (class012552 != null) {
                builder.put(class059462, (Object)class012552);
            }
        });
        return builder.build();
    }

    public class04382(Map<class05946<class01255>, class01255> map) {
        this.L = map;
    }

    public Optional<class01255> y() {
        return Optional.ofNullable(this.L.get(class01255.y));
    }

    private static DataResult<class04382> N(class04382 class043822) {
        if (class043822.y().isEmpty()) {
            return DataResult.error(() -> "Missing overworld dimension");
        }
        return DataResult.success((Object)class043822, (Lifecycle)Lifecycle.stable());
    }

    public class03764 N() {
        return new class03764(this.L());
    }
}


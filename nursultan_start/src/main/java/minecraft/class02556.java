/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02531
 *  minecraft.class02536
 *  minecraft.class02539
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.util.List;
import java.util.function.Function;
import minecraft.class02531;
import minecraft.class02536;
import minecraft.class02539;
import minecraft.class02547;
import minecraft.class02548;
import minecraft.class02560;

public interface class02556 {
    public static class02547 N(class02536 ... class02536Array) {
        return new class02547(List.of(class02536Array));
    }

    public static class02539 N(class02548 ... class02548Array) {
        return new class02539(List.of(class02548Array));
    }

    public static class02531 N(class02560 ... class02560Array) {
        return new class02531(List.of(class02560Array));
    }

    public static <T, A extends T> MapCodec<A> N(Codec<T> codec, Function<List<T>, A> function, Function<A, List<T>> function2) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)codec.listOf().fieldOf("effects").forGetter(function2)).apply((Applicative)instance, function));
    }
}


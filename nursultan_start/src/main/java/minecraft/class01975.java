/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.Keyable
 *  java.lang.runtime.SwitchBootstraps
 *  minecraft.class00507
 *  minecraft.class00522
 *  minecraft.class01942
 *  minecraft.class05033
 *  minecraft.class08509
 *  minecraft.class08525
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Keyable;
import java.lang.runtime.SwitchBootstraps;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Predicate;
import minecraft.class00507;
import minecraft.class00522;
import minecraft.class01942;
import minecraft.class05033;
import minecraft.class08509;
import minecraft.class08525;

@FunctionalInterface
public interface class01975 {
    public static final Codec<class01975> N = Codec.recursive((String)"condition", codec -> Codec.either((Codec)Codec.simpleMap((Codec)class08509.field_56941, (Codec)codec.listOf(), (Keyable)class05033.y((class05033[])class08509.values())).codec().comapFlatMap(map -> {
        if (map.size() != 1) {
            return DataResult.error(() -> "Invalid map size for combiner condition, expected exactly one element");
        }
        Map.Entry entry = map.entrySet().iterator().next();
        return DataResult.success((Object)new class08525((class08509)entry.getKey(), (List)entry.getValue()));
    }, class085252 -> Map.of(class085252.N(), class085252.y())), (Codec)class01942.L).flatComapMap(either -> (class01975)either.map(class085252 -> class085252, class019422 -> class019422), class019752 -> {
        class01975 class019753 = class019752;
        Objects.requireNonNull(class019753);
        class01975 class019754 = class019753;
        int n = 0;
        return switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{class08525.class, class01942.class}, (Object)class019754, (int)n)) {
            case 0 -> DataResult.success((Object)Either.left((Object)((class08525)class019754)));
            case 1 -> DataResult.success((Object)Either.right((Object)((class01942)class019754)));
            default -> DataResult.error(() -> "Unrecognized condition");
        };
    }));

    public <O, S extends class00522<O, S>> Predicate<S> N(class00507<O, S> var1);
}


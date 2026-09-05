/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class06338
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import java.util.function.Function;
import java.util.function.ToIntFunction;
import minecraft.class05033;
import minecraft.class06338;
import org.jspecify.annotations.Nullable;

public class class04997<S extends class05033>
implements Codec<S> {
    private final Codec<S> N;

    public class04997(S[] SArray, Function<String, @Nullable S> function, ToIntFunction<S> toIntFunction) {
        this.N = class06338.N((Codec)Codec.stringResolver(class05033::method_15434, function), (Codec)class06338.N(toIntFunction, n -> n >= 0 && n < SArray.length ? SArray[n] : null, (int)-1));
    }

    public <T> DataResult<Pair<S, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return this.N.decode(dynamicOps, t);
    }

    public <T> DataResult<T> encode(S s, DynamicOps<T> dynamicOps, T t) {
        return this.N.encode(s, dynamicOps, t);
    }
}


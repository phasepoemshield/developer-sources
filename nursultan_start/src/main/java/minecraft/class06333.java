/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.mojang.serialization.Codec;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;
import minecraft.class06338;

public class class06333<I, V> {
    private final BiMap<I, V> N = HashBiMap.create();

    public Set<V> N() {
        return Collections.unmodifiableSet(this.N.values());
    }

    public class06333<I, V> N(I i, V v) {
        Objects.requireNonNull(v, () -> "Value for " + String.valueOf(i) + " is null");
        this.N.put(i, v);
        return this;
    }

    public Codec<V> N(Codec<I> codec) {
        BiMap biMap = this.N.inverse();
        return class06338.N(codec, arg_0 -> this.N.get(arg_0), arg_0 -> biMap.get(arg_0));
    }
}


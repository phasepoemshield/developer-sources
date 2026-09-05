/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import minecraft.class02908;
import minecraft.class02922;
import minecraft.class02931;

public class class02911 {
    final LoadingCache<class02908<?, ?>, DataResult<?>> N;

    public class02911(int n) {
        this.N = CacheBuilder.newBuilder().maximumSize((long)n).concurrencyLevel(1).softValues().build((CacheLoader)new class02922(this));
    }

    public <A> Codec<A> N(Codec<A> codec) {
        return new class02931(this, codec);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00647
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Map;
import java.util.Optional;
import minecraft.class00647;
import minecraft.class04206;
import minecraft.class08737;

public interface class08752 {
    public static final Codec<class08752> y = class04206.Nq.T().dispatch(class08752::N, mapCodec -> mapCodec);

    public MapCodec<? extends class08752> N();

    public Optional<class00647> N(Map<String, class08737> var1);
}


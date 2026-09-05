/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04206
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class04206;
import minecraft.class06338;

public interface class09034 {
    public static final Codec<class09034> N = class04206.NV.T().dispatch(class09034::N, mapCodec -> mapCodec);
    public static final Codec<List<class09034>> y = class06338.N(N);

    public MapCodec<? extends class09034> N();
}


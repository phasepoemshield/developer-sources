/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class04206;
import minecraft.class08579;
import minecraft.class08584;

public interface class08568
extends class08584<class08579> {
    public static final Codec<class08568> y = class04206.NJ.T().dispatch(class08568::N, mapCodec -> mapCodec);

    public MapCodec<? extends class08568> N();
}


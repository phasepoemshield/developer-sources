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
import minecraft.class08152;

public interface class08164 {
    public static final Codec<class08164> N = class04206.NH.T().dispatch(class08164::N, mapCodec -> mapCodec);

    public boolean N(class08152 var1);

    public MapCodec<? extends class08164> N();
}


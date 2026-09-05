/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class04206;

public interface class09015 {
    public static final MapCodec<class09015> y = class04206.NK.T().dispatchMap(class09015::N, mapCodec -> mapCodec);

    public MapCodec<? extends class09015> N();
}


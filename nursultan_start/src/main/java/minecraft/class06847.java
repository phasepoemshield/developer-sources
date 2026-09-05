/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;
import minecraft.class06822;
import minecraft.class06834;

public class class06847
extends class06822 {
    public static final MapCodec<class06847> y = class06847.N(class06847::new);
    public static final Codec<class06847> L = class06847.y(class06847::new);

    private class06847(List<class06834> list) {
        super(list);
    }

    public MapCodec<class06847> N() {
        return y;
    }
}


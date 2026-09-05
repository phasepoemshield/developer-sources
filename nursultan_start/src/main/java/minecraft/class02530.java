/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class02715
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class06584
 *  minecraft.class07052
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class02715;
import minecraft.class04206;
import minecraft.class06069;
import minecraft.class06584;
import minecraft.class07052;

public interface class02530 {
    public static final Codec<class02530> N = class04206.NG.T().dispatch(class02530::N, Function.identity());

    public MapCodec<? extends class02530> N();

    public void N(class06584 var1, class02715 var2, class06069 var3, class07052 var4);
}


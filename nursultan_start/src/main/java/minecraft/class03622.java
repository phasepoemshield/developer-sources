/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class04206
 *  minecraft.class04782
 *  minecraft.class06889
 *  minecraft.class07049
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import minecraft.class04206;
import minecraft.class04782;
import minecraft.class06889;
import minecraft.class07049;
import org.jspecify.annotations.Nullable;

public interface class03622 {
    public static final Codec<class03622> L = class04206.NP.T().dispatch(class03622::N, Function.identity());

    public boolean N(class07049 var1, class04782 var2, @Nullable class06889 var3);

    public MapCodec<? extends class03622> N();
}


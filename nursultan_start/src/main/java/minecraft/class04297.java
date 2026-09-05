/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class01034
 *  minecraft.class04206
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.stream.Stream;
import minecraft.class01034;
import minecraft.class04206;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class07209;

public abstract class class04297 {
    public static final Codec<class04297> y = class04206.A.T().dispatch(class04297::N, class04323::codec);

    public abstract Stream<class07209> N(class01034 var1, class06069 var2, class07209 var3);

    public abstract class04323<?> N();
}


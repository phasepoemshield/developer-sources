/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04206
 *  minecraft.class05894
 *  minecraft.class05930
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04206;
import minecraft.class05894;
import minecraft.class05930;

public abstract class class01474 {
    public static final Codec<class01474> y = class04206.D.T().dispatch(class01474::N, class05930::N);

    protected abstract class05930<?> N();

    public abstract void N(class05894 var1);
}


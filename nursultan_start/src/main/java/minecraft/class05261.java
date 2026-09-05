/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00500
 *  minecraft.class04206
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00500;
import minecraft.class04206;
import minecraft.class05240;
import minecraft.class06069;

public abstract class class05261 {
    public static final Codec<class05261> L = class04206.m.T().dispatch("predicate_type", class05261::N, class05240::codec);

    public abstract boolean N(class00500 var1, class06069 var2);

    protected abstract class05240<?> N();
}


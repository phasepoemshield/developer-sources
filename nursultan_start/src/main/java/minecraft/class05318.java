/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class04206
 *  minecraft.class05301
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class04206;
import minecraft.class05301;
import minecraft.class06069;
import minecraft.class07209;

public abstract class class05318 {
    public static final Codec<class05318> L = class04206.s.T().dispatch("predicate_type", class05318::N, class05301::codec);

    public abstract boolean N(class07209 var1, class07209 var2, class07209 var3, class06069 var4);

    protected abstract class05301<?> N();
}


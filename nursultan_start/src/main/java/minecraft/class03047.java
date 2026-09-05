/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class03075;
import minecraft.class05033;

public interface class03047 {
    public static final Codec<class03047> y = class05033.N(class03075::values).dispatch(class03047::i, class03075::N);

    public class03075 i();
}


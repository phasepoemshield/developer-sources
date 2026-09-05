/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class00500
 *  minecraft.class00753
 *  minecraft.class04028
 *  minecraft.class04054
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class00500;
import minecraft.class00753;
import minecraft.class04028;
import minecraft.class04054;

@Deprecated
public class class04311
extends class04028 {
    public static final MapCodec<class04311> N = RecordCodecBuilder.mapCodec(instance -> class04311.N(instance).apply(instance, class04311::new));

    public class04311(class00753 class007532) {
        super(class007532);
    }

    protected boolean N(class00500 class005002) {
        return class005002.B();
    }

    public class04054<?> N() {
        return class04054.i;
    }
}


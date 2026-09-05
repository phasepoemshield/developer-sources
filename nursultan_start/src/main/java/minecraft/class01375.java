/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class04978
 *  minecraft.class04983
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class04978;
import minecraft.class04983;
import minecraft.class07211;

public class class01375
extends class04978 {
    public static final MapCodec<class01375> N = class01375.y(class01375::new);
    private static final class00494 i = class00891.y((double)8.0, (double)0.0, (double)16.0);

    protected class04983 L() {
        return (class04983)class00869.sw;
    }

    public class01375(class01362 class013622) {
        super(class013622, class07211.field_11036, i, false);
    }

    public MapCodec<class01375> N() {
        return N;
    }
}


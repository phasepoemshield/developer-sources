/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00653
 *  minecraft.class01362
 *  minecraft.class07030
 *  minecraft.class07032
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00653;
import minecraft.class01362;
import minecraft.class07030;
import minecraft.class07032;

public class class06906
extends class00653 {
    public static final MapCodec<class06906> y = class06906.y(class06906::new);

    public class06906(class01362 class013622) {
        super((class07030)class07032.field_11510, class013622);
    }

    public MapCodec<class06906> N() {
        return y;
    }
}


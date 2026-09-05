/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01362
 *  minecraft.class07000
 *  minecraft.class07030
 *  minecraft.class07032
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01362;
import minecraft.class07000;
import minecraft.class07030;
import minecraft.class07032;

public class class06861
extends class07000 {
    public static final MapCodec<class06861> y = class06861.y(class06861::new);

    public class06861(class01362 class013622) {
        super((class07030)class07032.field_11510, class013622);
    }

    public MapCodec<class06861> N() {
        return y;
    }
}


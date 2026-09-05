/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01362
 *  minecraft.class03137
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class01362;
import minecraft.class03137;

public class class01107
extends class03137 {
    public static final MapCodec<class01107> N = class01107.y(class01107::new);

    public class01107(class01362 class013622) {
        super(class013622);
    }

    protected boolean y(class00500 class005002) {
        return false;
    }

    public MapCodec<class01107> N() {
        return N;
    }

    protected int b_(class00500 class005002) {
        return 15;
    }
}


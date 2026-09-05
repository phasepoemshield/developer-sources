/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01362
 *  minecraft.class01378
 *  minecraft.class04983
 *  minecraft.class06069
 *  minecraft.class07211
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01362;
import minecraft.class01378;
import minecraft.class04983;
import minecraft.class06069;
import minecraft.class07211;

public class class05988
extends class04983 {
    public static final MapCodec<class05988> N = class05988.y(class05988::new);
    private static final class00494 M = class00891.y((double)8.0, (double)0.0, (double)15.0);

    public class05988(class01362 class013622) {
        super(class013622, class07211.field_11036, M, false, 0.1);
    }

    protected class00891 u() {
        return class00869.sk;
    }

    protected boolean E(class00500 class005002) {
        return class01378.N((class00500)class005002);
    }

    protected int N(class06069 class060692) {
        return class01378.N((class06069)class060692);
    }

    public MapCodec<class05988> N() {
        return N;
    }
}


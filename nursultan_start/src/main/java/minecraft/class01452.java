/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00500
 *  minecraft.class01471
 *  minecraft.class01473
 *  minecraft.class06069
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00500;
import minecraft.class01471;
import minecraft.class01473;
import minecraft.class06069;
import minecraft.class07209;

public class class01452
extends class01471 {
    public static final MapCodec<class01452> y = class00500.N.fieldOf("state").xmap(class01452::new, class014522 -> class014522.L);
    private final class00500 L;

    public class01452(class00500 class005002) {
        this.L = class005002;
    }

    protected class01473<?> N() {
        return class01473.N;
    }

    public class00500 N(class06069 class060692, class07209 class072092) {
        return this.L;
    }
}


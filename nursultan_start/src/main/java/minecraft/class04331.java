/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class01034
 *  minecraft.class04050
 *  minecraft.class06069
 *  minecraft.class06338
 *  minecraft.class07209
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class01034;
import minecraft.class04050;
import minecraft.class04323;
import minecraft.class06069;
import minecraft.class06338;
import minecraft.class07209;

public class class04331
extends class04050 {
    public static final MapCodec<class04331> N = class06338.b.fieldOf("chance").xmap(class04331::new, class043312 -> class043312.L);
    private final int L;

    private class04331(int n) {
        this.L = n;
    }

    protected boolean y(class01034 class010342, class06069 class060692, class07209 class072092) {
        return class060692.z() < 1.0f / (float)this.L;
    }

    public class04323<?> N() {
        return class04323.y;
    }

    public static class04331 N(int n) {
        return new class04331(n);
    }
}


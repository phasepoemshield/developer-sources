/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class06055
 *  minecraft.class06057
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class03855;
import minecraft.class03862;
import minecraft.class06055;
import minecraft.class06057;
import minecraft.class06069;

public class class03850
extends class03855 {
    public static final class03850 N = new class03850(class06055.N((int)0));
    public static final MapCodec<class03850> y = class06055.N.fieldOf("value").xmap(class03850::new, class03850::y);
    private final class06055 u;

    private class03850(class06055 class060552) {
        this.u = class060552;
    }

    public String toString() {
        return this.u.toString();
    }

    public class06055 y() {
        return this.u;
    }

    public static class03850 N(class06055 class060552) {
        return new class03850(class060552);
    }

    @Override
    public class03862<?> N() {
        return class03862.N;
    }

    @Override
    public int N(class06069 class060692, class06057 class060572) {
        return this.u.N(class060572);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class02139;
import minecraft.class02142;
import minecraft.class06069;

public class class02151
extends class02142 {
    public static final class02151 N = new class02151(0);
    public static final MapCodec<class02151> y = Codec.INT.fieldOf("value").xmap(class02151::N, class02151::d);
    private final int R;

    @Override
    public int L() {
        return this.R;
    }

    private class02151(int n) {
        this.R = n;
    }

    public String toString() {
        return Integer.toString(this.R);
    }

    @Override
    public class02139<?> u() {
        return class02139.N;
    }

    @Override
    public int y() {
        return this.R;
    }

    public static class02151 N(int n) {
        if (n == 0) {
            return N;
        }
        return new class02151(n);
    }

    public int N() {
        return this.R;
    }

    @Override
    public int N(class06069 class060692) {
        return this.R;
    }

    public int d() {
        return this.R;
    }
}


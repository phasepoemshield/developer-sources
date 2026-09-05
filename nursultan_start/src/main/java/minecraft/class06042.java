/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import minecraft.class06052;
import minecraft.class06061;
import minecraft.class06069;

public class class06042
extends class06052 {
    public static final class06042 N = new class06042(0.0f);
    public static final MapCodec<class06042> y = Codec.FLOAT.fieldOf("value").xmap(class06042::N, class06042::d);
    private final float u;

    @Override
    public class06061<?> L() {
        return class06061.N;
    }

    private class06042(float f) {
        this.u = f;
    }

    public String toString() {
        return Float.toString(this.u);
    }

    public float u() {
        return this.u;
    }

    @Override
    public float y() {
        return this.u;
    }

    public static class06042 N(float f) {
        if (f == 0.0f) {
            return N;
        }
        return new class06042(f);
    }

    @Override
    public float N() {
        return this.u;
    }

    public float N(class06069 class060692) {
        return this.u;
    }

    public float d() {
        return this.u;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class02144;

public class class02134<T> {
    final T N;
    final int y;
    private double L;

    public double L() {
        return this.L;
    }

    class02134(T t, int n) {
        this.y = n;
        this.N = t;
    }

    public String toString() {
        return this.y + ":" + String.valueOf(this.N);
    }

    public int y() {
        return this.y;
    }

    public static <E> Codec<class02134<E>> N(Codec<E> codec) {
        return new class02144(codec);
    }

    public T N() {
        return this.N;
    }

    void N(float f) {
        this.L = -Math.pow(f, 1.0f / (float)this.y);
    }
}


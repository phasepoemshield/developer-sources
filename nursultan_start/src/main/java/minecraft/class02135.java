/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class04995
 *  minecraft.class06069
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class02139;
import minecraft.class02142;
import minecraft.class04995;
import minecraft.class06069;

public class class02135
extends class02142 {
    public static final MapCodec<class02135> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.INT.fieldOf("min_inclusive").forGetter(class021352 -> class021352.y), (App)Codec.INT.fieldOf("max_inclusive").forGetter(class021352 -> class021352.R)).apply(instance, class02135::new)).validate(class021352 -> {
        if (class021352.R < class021352.y) {
            return DataResult.error(() -> "Max must be at least min, min_inclusive: " + class021352.y + ", max_inclusive: " + class021352.R);
        }
        return DataResult.success((Object)class021352);
    });
    private final int y;
    private final int R;

    @Override
    public int L() {
        return this.R;
    }

    private class02135(int n, int n2) {
        this.y = n;
        this.R = n2;
    }

    public String toString() {
        return "[" + this.y + "-" + this.R + "]";
    }

    @Override
    public class02139<?> u() {
        return class02139.y;
    }

    public static class02135 y(int n, int n2) {
        return new class02135(n, n2);
    }

    @Override
    public int y() {
        return this.y;
    }

    @Override
    public int N(class06069 class060692) {
        return class04995.y((class06069)class060692, (int)this.y, (int)this.R);
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  minecraft.class02139
 *  minecraft.class02142
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

public class class03007
extends class02142 {
    public static final MapCodec<class03007> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("mean").forGetter(class030072 -> Float.valueOf(class030072.y)), (App)Codec.FLOAT.fieldOf("deviation").forGetter(class030072 -> Float.valueOf(class030072.R)), (App)Codec.INT.fieldOf("min_inclusive").forGetter(class030072 -> class030072.M), (App)Codec.INT.fieldOf("max_inclusive").forGetter(class030072 -> class030072.B)).apply(instance, class03007::new)).validate(class030072 -> {
        if (class030072.B < class030072.M) {
            return DataResult.error(() -> "Max must be larger than min: [" + class030072.M + ", " + class030072.B + "]");
        }
        return DataResult.success((Object)class030072);
    });
    private final float y;
    private final float R;
    private final int M;
    private final int B;

    public int L() {
        return this.B;
    }

    private class03007(float f, float f2, int n, int n2) {
        this.y = f;
        this.R = f2;
        this.M = n;
        this.B = n2;
    }

    public String toString() {
        return "normal(" + this.y + ", " + this.R + ") in [" + this.M + "-" + this.B + "]";
    }

    public class02139<?> u() {
        return class02139.R;
    }

    public int y() {
        return this.M;
    }

    public static class03007 N(float f, float f2, int n, int n2) {
        return new class03007(f, f2, n, n2);
    }

    public int N(class06069 class060692) {
        return class03007.N(class060692, this.y, this.R, this.M, this.B);
    }

    public static int N(class06069 class060692, float f, float f2, float f3, float f4) {
        return (int)class04995.N((float)class04995.L((class06069)class060692, (float)f, (float)f2), (float)f3, (float)f4);
    }
}


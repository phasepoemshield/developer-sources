/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class06052;
import minecraft.class06061;
import minecraft.class06069;

public class class06039
extends class06052 {
    public static final MapCodec<class06039> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("min").forGetter(class060392 -> Float.valueOf(class060392.y)), (App)Codec.FLOAT.fieldOf("max").forGetter(class060392 -> Float.valueOf(class060392.u)), (App)Codec.FLOAT.fieldOf("plateau").forGetter(class060392 -> Float.valueOf(class060392.i))).apply(instance, class06039::new)).validate(class060392 -> {
        if (class060392.u < class060392.y) {
            return DataResult.error(() -> "Max must be larger than min: [" + class060392.y + ", " + class060392.u + "]");
        }
        if (class060392.i > class060392.u - class060392.y) {
            return DataResult.error(() -> "Plateau can at most be the full span: [" + class060392.y + ", " + class060392.u + "]");
        }
        return DataResult.success((Object)class060392);
    });
    private final float y;
    private final float u;
    private final float i;

    @Override
    public class06061<?> L() {
        return class06061.u;
    }

    private class06039(float f, float f2, float f3) {
        this.y = f;
        this.u = f2;
        this.i = f3;
    }

    public String toString() {
        return "trapezoid(" + this.i + ") in [" + this.y + "-" + this.u + "]";
    }

    @Override
    public float y() {
        return this.u;
    }

    public static class06039 N(float f, float f2, float f3) {
        return new class06039(f, f2, f3);
    }

    public float N(class06069 class060692) {
        float f = this.u - this.y;
        float f2 = (f - this.i) / 2.0f;
        float f3 = f - f2;
        return this.y + class060692.z() * f3 + class060692.z() * f2;
    }

    @Override
    public float N() {
        return this.y;
    }
}


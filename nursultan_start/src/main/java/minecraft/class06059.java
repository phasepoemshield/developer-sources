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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import minecraft.class04995;
import minecraft.class06052;
import minecraft.class06061;
import minecraft.class06069;

public class class06059
extends class06052 {
    public static final MapCodec<class06059> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("min_inclusive").forGetter(class060592 -> Float.valueOf(class060592.y)), (App)Codec.FLOAT.fieldOf("max_exclusive").forGetter(class060592 -> Float.valueOf(class060592.u))).apply(instance, class06059::new)).validate(class060592 -> {
        if (class060592.u <= class060592.y) {
            return DataResult.error(() -> "Max must be larger than min, min_inclusive: " + class060592.y + ", max_exclusive: " + class060592.u);
        }
        return DataResult.success((Object)class060592);
    });
    private final float y;
    private final float u;

    @Override
    public class06061<?> L() {
        return class06061.y;
    }

    private class06059(float f, float f2) {
        this.y = f;
        this.u = f2;
    }

    public String toString() {
        return "[" + this.y + "-" + this.u + "]";
    }

    @Override
    public float y() {
        return this.u;
    }

    public static class06059 y(float f, float f2) {
        if (f2 <= f) {
            throw new IllegalArgumentException("Max must exceed min");
        }
        return new class06059(f, f2);
    }

    @Override
    public float N() {
        return this.y;
    }

    public float N(class06069 class060692) {
        return class04995.y((class06069)class060692, (float)this.y, (float)this.u);
    }
}


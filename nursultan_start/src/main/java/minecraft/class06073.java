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

public class class06073
extends class06052 {
    public static final MapCodec<class06073> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("mean").forGetter(class060732 -> Float.valueOf(class060732.y)), (App)Codec.FLOAT.fieldOf("deviation").forGetter(class060732 -> Float.valueOf(class060732.u)), (App)Codec.FLOAT.fieldOf("min").forGetter(class060732 -> Float.valueOf(class060732.i)), (App)Codec.FLOAT.fieldOf("max").forGetter(class060732 -> Float.valueOf(class060732.R))).apply(instance, class06073::new)).validate(class060732 -> {
        if (class060732.R < class060732.i) {
            return DataResult.error(() -> "Max must be larger than min: [" + class060732.i + ", " + class060732.R + "]");
        }
        return DataResult.success((Object)class060732);
    });
    private final float y;
    private final float u;
    private final float i;
    private final float R;

    @Override
    public class06061<?> L() {
        return class06061.L;
    }

    private class06073(float f, float f2, float f3, float f4) {
        this.y = f;
        this.u = f2;
        this.i = f3;
        this.R = f4;
    }

    public String toString() {
        return "normal(" + this.y + ", " + this.u + ") in [" + this.i + "-" + this.R + "]";
    }

    @Override
    public float y() {
        return this.R;
    }

    public static class06073 N(float f, float f2, float f3, float f4) {
        return new class06073(f, f2, f3, f4);
    }

    public float N(class06069 class060692) {
        return class06073.N(class060692, this.y, this.u, this.i, this.R);
    }

    public static float N(class06069 class060692, float f, float f2, float f3, float f4) {
        return class04995.N((float)class04995.L((class06069)class060692, (float)f, (float)f2), (float)f3, (float)f4);
    }

    @Override
    public float N() {
        return this.i;
    }
}


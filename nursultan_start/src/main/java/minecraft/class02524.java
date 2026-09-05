/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02546
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02546;
import minecraft.class04995;

public final class class02524
extends Record
implements class02546 {
    private final class02546 value;
    private final float min;
    private final float max;
    public static final MapCodec<class02524> L = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("value").forGetter(class02524::y), (App)Codec.FLOAT.fieldOf("min").forGetter(class02524::L), (App)Codec.FLOAT.fieldOf("max").forGetter(class02524::u)).apply(instance, class02524::new)).validate(class025242 -> {
        if (class025242.max <= class025242.min) {
            return DataResult.error(() -> "Max must be larger than min, min: " + class025242.min + ", max: " + class025242.max);
        }
        return DataResult.success((Object)class025242);
    });

    public float L() {
        return this.min;
    }

    public class02524(class02546 class025462, float f, float f2) {
        this.value = class025462;
        this.min = f;
        this.max = f2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02524.class, "value;min;max", "value", "min", "max"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02524.class, "value;min;max", "value", "min", "max"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02524.class, "value;min;max", "value", "min", "max"}, this);
    }

    public float u() {
        return this.max;
    }

    public class02546 y() {
        return this.value;
    }

    public float N(int n) {
        return class04995.N((float)this.value.N(n), (float)this.min, (float)this.max);
    }

    public MapCodec<class02524> N() {
        return L;
    }
}


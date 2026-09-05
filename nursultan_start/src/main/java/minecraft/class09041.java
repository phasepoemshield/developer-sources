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
 *  minecraft.class04995
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class04995;
import minecraft.class06338;

public final class class09041
extends Record {
    private final float start;
    private final float end;
    private final Optional<Float> initial;
    private final Optional<Float> step;
    public static final MapCodec<class09041> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)Codec.FLOAT.fieldOf("start").forGetter(class09041::y), (App)Codec.FLOAT.fieldOf("end").forGetter(class09041::L), (App)Codec.FLOAT.optionalFieldOf("initial").forGetter(class09041::u), (App)class06338.t.optionalFieldOf("step").forGetter(class09041::i)).apply(instance, class09041::new)).validate(class090412 -> {
        if (class090412.initial.isPresent()) {
            double d = class090412.initial.get().floatValue();
            double d2 = Math.min(class090412.start, class090412.end);
            double d3 = Math.max(class090412.start, class090412.end);
            if (d < d2 || d > d3) {
                return DataResult.error(() -> "Initial value " + d + " is outside of range [" + d2 + ", " + d3 + "]");
            }
        }
        return DataResult.success((Object)class090412);
    });

    private float L(float f) {
        if (this.start == this.end) {
            return 0.5f;
        }
        return class04995.R((float)f, (float)this.start, (float)this.end);
    }

    public float L() {
        return this.end;
    }

    public class09041(float f, float f2, Optional<Float> optional, Optional<Float> optional2) {
        this.start = f;
        this.end = f2;
        this.initial = optional;
        this.step = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09041.class, "start;end;initial;step", "start", "end", "initial", "step"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09041.class, "start;end;initial;step", "start", "end", "initial", "step"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09041.class, "start;end;initial;step", "start", "end", "initial", "step"}, this);
    }

    public Optional<Float> i() {
        return this.step;
    }

    public Optional<Float> u() {
        return this.initial;
    }

    public float y() {
        return this.start;
    }

    private boolean y(float f) {
        float f2 = this.L(f);
        return (double)f2 < 0.0 || (double)f2 > 1.0;
    }

    public float N() {
        float f = this.R();
        return this.L(f);
    }

    public float N(float f) {
        int n;
        float f2 = class04995.B((float)f, (float)this.start, (float)this.end);
        if (this.step.isEmpty()) {
            return f2;
        }
        float f3 = this.step.get().floatValue();
        float f4 = this.R();
        float f5 = f4 + (float)(n = Math.round((f2 - f4) / f3)) * f3;
        if (!this.y(f5)) {
            return f5;
        }
        int n2 = n - class04995.U((double)n);
        return f4 + (float)n2 * f3;
    }

    private float R() {
        if (this.initial.isPresent()) {
            return this.initial.get().floatValue();
        }
        return (this.start + this.end) / 2.0f;
    }
}


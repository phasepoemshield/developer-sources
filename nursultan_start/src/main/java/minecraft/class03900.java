/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04995
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03899;
import minecraft.class03979;
import minecraft.class04995;

public final class class03900
extends Record
implements class03899 {
    private final class03877 input;
    private final double minValue;
    private final double maxValue;
    private static final MapCodec<class03900> B = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.u.fieldOf("input").forGetter(class03900::az_), (App)class03865.y.fieldOf("min").forGetter(class03900::N), (App)class03865.y.fieldOf("max").forGetter(class03900::y)).apply(instance, class03900::new));
    public static final class03979<class03900> N = class03865.N(B);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    protected class03900(class03877 class038772, double d, double d2) {
        this.input = class038772;
        this.minValue = d;
        this.maxValue = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03900.class, "input;minValue;maxValue", "input", "minValue", "maxValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03900.class, "input;minValue;maxValue", "input", "minValue", "maxValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03900.class, "input;minValue;maxValue", "input", "minValue", "maxValue"}, this);
    }

    @Override
    public double y() {
        return this.maxValue;
    }

    @Override
    public double N() {
        return this.minValue;
    }

    @Override
    public class03877 N(class03881 class038812) {
        return new class03900(this.input.N(class038812), this.minValue, this.maxValue);
    }

    @Override
    public double N(double d) {
        return class04995.N((double)d, (double)this.minValue, (double)this.maxValue);
    }

    @Override
    public class03877 az_() {
        return this.input;
    }
}


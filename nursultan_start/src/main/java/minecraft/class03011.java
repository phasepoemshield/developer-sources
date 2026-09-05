/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10101
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03979
 *  minecraft.class04017
 *  minecraft.class04018
 *  minecraft.class04039
 *  minecraft.class04227
 *  minecraft.class05041
 *  minecraft.class05056
 *  minecraft.class05946
 */
package minecraft;

import Nursultan.class10101;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03979;
import minecraft.class04017;
import minecraft.class04018;
import minecraft.class04039;
import minecraft.class04227;
import minecraft.class05041;
import minecraft.class05056;
import minecraft.class05946;

public final class class03011
extends Record
implements class04017 {
    private final class05946<class05056> noise;
    public final double minThreshold;
    public final double maxThreshold;
    static final class03979<class03011> u = class03979.N((MapCodec)RecordCodecBuilder.mapCodec(instance -> instance.group((App)class05946.N((class05946)class04227.yW).fieldOf("noise").forGetter(class03011::y), (App)Codec.DOUBLE.fieldOf("min_threshold").forGetter(class03011::L), (App)Codec.DOUBLE.fieldOf("max_threshold").forGetter(class03011::u)).apply(instance, class03011::new)));

    public double L() {
        return this.minThreshold;
    }

    class03011(class05946<class05056> class059462, double d, double d2) {
        this.noise = class059462;
        this.minThreshold = d;
        this.maxThreshold = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03011.class, "noise;minThreshold;maxThreshold", "noise", "minThreshold", "maxThreshold"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03011.class, "noise;minThreshold;maxThreshold", "noise", "minThreshold", "maxThreshold"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03011.class, "noise;minThreshold;maxThreshold", "noise", "minThreshold", "maxThreshold"}, this);
    }

    public double u() {
        return this.maxThreshold;
    }

    public class05946<class05056> y() {
        return this.noise;
    }

    public class03979<? extends class04017> N() {
        return u;
    }

    public class04018 apply(class04039 class040392) {
        class05041 class050412 = class040392.R.N(this.noise);
        return new class10101(this, class040392, class050412);
    }
}


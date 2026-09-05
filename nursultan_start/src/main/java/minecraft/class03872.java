/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03865;
import minecraft.class03873;
import minecraft.class03875;
import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03881;
import minecraft.class03895;
import minecraft.class03979;

public final class class03872
extends Record
implements class03895 {
    private final class03877 input;
    private final class03876 noise;
    private final class03873 rarityValueMapper;
    private static final MapCodec<class03872> B = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03877.R.fieldOf("input").forGetter(class03872::u), (App)class03876.N.fieldOf("noise").forGetter(class03872::i), (App)class03873.field_37068.fieldOf("rarity_value_mapper").forGetter(class03872::W)).apply(instance, class03872::new));
    public static final class03979<class03872> N = class03865.N(B);

    @Override
    public class03979<? extends class03877> L() {
        return N;
    }

    public class03872(class03877 class038772, class03876 class038762, class03873 class038732) {
        this.input = class038772;
        this.noise = class038762;
        this.rarityValueMapper = class038732;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03872.class, "input;noise;rarityValueMapper", "input", "noise", "rarityValueMapper"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03872.class, "input;noise;rarityValueMapper", "input", "noise", "rarityValueMapper"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03872.class, "input;noise;rarityValueMapper", "input", "noise", "rarityValueMapper"}, this);
    }

    public class03876 i() {
        return this.noise;
    }

    @Override
    public class03877 u() {
        return this.input;
    }

    @Override
    public double y() {
        return this.rarityValueMapper.field_37072 * this.noise.N();
    }

    @Override
    public double N() {
        return 0.0;
    }

    @Override
    public class03877 N(class03881 class038812) {
        return class038812.apply(new class03872(this.input.N(class038812), class038812.N(this.noise), this.rarityValueMapper));
    }

    @Override
    public double N(class03875 class038752, double d) {
        double d2 = this.rarityValueMapper.field_37071.get(d);
        return d2 * Math.abs(this.noise.N((double)class038752.y() / d2, (double)class038752.L() / d2, (double)class038752.u() / d2));
    }

    public class03873 W() {
        return this.rarityValueMapper;
    }
}


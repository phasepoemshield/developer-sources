/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class03748
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;
import minecraft.class03748;
import minecraft.class09015;

public final class class09020
extends Record
implements class09015 {
    private final class00392 label;
    private final boolean initial;
    private final String onTrue;
    private final String onFalse;
    public static final MapCodec<class09020> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class03748.N.fieldOf("label").forGetter(class09020::y), (App)Codec.BOOL.optionalFieldOf("initial", (Object)false).forGetter(class09020::L), (App)Codec.STRING.optionalFieldOf("on_true", (Object)"true").forGetter(class09020::u), (App)Codec.STRING.optionalFieldOf("on_false", (Object)"false").forGetter(class09020::i)).apply(instance, class09020::new));

    public boolean L() {
        return this.initial;
    }

    public class09020(class00392 class003922, boolean bl, String string, String string2) {
        this.label = class003922;
        this.initial = bl;
        this.onTrue = string;
        this.onFalse = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09020.class, "label;initial;onTrue;onFalse", "label", "initial", "onTrue", "onFalse"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09020.class, "label;initial;onTrue;onFalse", "label", "initial", "onTrue", "onFalse"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09020.class, "label;initial;onTrue;onFalse", "label", "initial", "onTrue", "onFalse"}, this);
    }

    public String i() {
        return this.onFalse;
    }

    public String u() {
        return this.onTrue;
    }

    public class00392 y() {
        return this.label;
    }

    public MapCodec<class09020> N() {
        return N;
    }
}


/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02546
 *  minecraft.class05908
 *  minecraft.class06339
 *  minecraft.class06341
 *  minecraft.class06378
 *  minecraft.class06551
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02546;
import minecraft.class05908;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06378;
import minecraft.class06551;

public final class class02226
extends Record
implements class06378 {
    private final class02546 amount;
    public static final MapCodec<class02226> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class02546.y.fieldOf("amount").forGetter(class02226::L)).apply(instance, class02226::new));

    public class02546 L() {
        return this.amount;
    }

    public class02226(class02546 class025462) {
        this.amount = class025462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02226.class, "amount", "amount"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02226.class, "amount", "amount"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02226.class, "amount", "amount"}, this);
    }

    public float y(class05908 class059082) {
        int n = (Integer)class059082.y(class06551.W);
        return this.amount.N(n);
    }

    public static class02226 N(class02546 class025462) {
        return new class02226(class025462);
    }

    public class06341 N() {
        return class06339.M;
    }
}


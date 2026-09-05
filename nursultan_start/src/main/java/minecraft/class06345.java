/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04711
 *  minecraft.class04995
 *  minecraft.class05908
 *  minecraft.class06069
 *  minecraft.class07491
 */
package minecraft;

import com.google.common.collect.Sets;
import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Set;
import minecraft.class04711;
import minecraft.class04995;
import minecraft.class05908;
import minecraft.class06069;
import minecraft.class06339;
import minecraft.class06341;
import minecraft.class06378;
import minecraft.class07491;

public final class class06345
extends Record
implements class06378 {
    private final class06378 min;
    private final class06378 max;
    public static final MapCodec<class06345> N = RecordCodecBuilder.mapCodec(instance -> instance.group((App)class06339.N.fieldOf("min").forGetter(class06345::L), (App)class06339.N.fieldOf("max").forGetter(class06345::u)).apply(instance, class06345::new));

    public class06378 L() {
        return this.min;
    }

    public class06345(class06378 class063782, class06378 class063783) {
        this.min = class063782;
        this.max = class063783;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06345.class, "min;max", "min", "max"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06345.class, "min;max", "min", "max"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06345.class, "min;max", "min", "max"}, this);
    }

    public class06378 u() {
        return this.max;
    }

    public Set<class07491<?>> y() {
        return Sets.union((Set)this.min.y(), (Set)this.max.y());
    }

    @Override
    public float y(class05908 class059082) {
        return class04995.N((class06069)class059082.y(), (float)this.min.y(class059082), (float)this.max.y(class059082));
    }

    @Override
    public int N(class05908 class059082) {
        return class04995.N((class06069)class059082.y(), (int)this.min.N(class059082), (int)this.max.N(class059082));
    }

    @Override
    public class06341 N() {
        return class06339.L;
    }

    public static class06345 N(float f, float f2) {
        return new class06345((class06378)class04711.N((float)f), (class06378)class04711.N((float)f2));
    }
}

